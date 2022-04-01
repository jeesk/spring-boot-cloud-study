排序算法的原理：

1. 冒泡排序

假如数组有m个元素,依次将第索引为n的元素和索引n后面的元素做比较， 如果满足较大或者较小就交换， 比较的次数是 m* (m-1) 次

2. 插入排序 

插入排序是冒泡的升级版本， 改进的地方是，比较后只记录较大或者较小的元素和元素索引, 当第n个元素，和n后面所有的元素比较完成后，获取到最小或者最大的数据后，直接交换数据。

3. 选择排序

假如数组有m个元素,将数组分成只有一个元素的有序数组和（m-1)个元素的无序数组，最后依次取无序数组的元素和有序数组的元素做比较，
这个依次取无序数组的元素我们称为选择元素，这个索引叫选择索引， 然后循环和这个索引前面所有的数据做对比， 如果较大或者较小就将数据移动一次，
直接不满足条件，最后将选择元素赋值给给最后一个后移元素的索引

4. 希尔排序， 希尔排序是插入排序的改良版本。
