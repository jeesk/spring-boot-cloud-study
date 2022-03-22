/*
 * Copyright (c) 2018 Baidu, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.shanjiancaofu.study.threadpool;

import io.netty.util.concurrent.FastThreadLocalThread;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;


public class CustomThreadFactory implements ThreadFactory {

	private AtomicInteger threadNumber = new AtomicInteger(1);
	private String namePrefix;
	private ThreadGroup group;

	public CustomThreadFactory(String namePrefix) {
		SecurityManager s = System.getSecurityManager();
		this.group = (s != null) ? s.getThreadGroup() :
			Thread.currentThread().getThreadGroup();
		this.namePrefix = namePrefix + "-";
	}

	@Override
	public Thread newThread(Runnable r) {
		String name = namePrefix + threadNumber.getAndIncrement();
		Thread t = new FastThreadLocalThread(group, r, name, 0);
		t.setDaemon(false);
		t.setPriority(Thread.NORM_PRIORITY);
		return t;
	}

}
