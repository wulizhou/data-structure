package www.wulizhou.com.sort;

public class Sort {

	/**
	 * 交换
	 * 
	 * @param data
	 * @param i
	 * @param j
	 */
	public static void swap(int[] data, int i, int j) {
		if (i == j) {
			return;
		}
		data[i] = data[i] + data[j];
		data[j] = data[i] - data[j];
		data[i] = data[i] - data[j];
	}

	/**
	 * 冒泡排序
	 */
	public static void bubbleSort(int[] data) {

		for (int i = 0; i < data.length - 1; i++) {
			// 用于当数组提前有序时终止排序
			boolean isSorted = false;
			for (int j = 0; j < data.length - i - 1; j++) {
				// 数值较小的向前浮
				if (data[j] > data[j + 1]) {
					swap(data, j, j + 1);
					isSorted = true;
				}
			}

			// 数据已有序，结果排序
			if (!isSorted) {
				break;
			}

		}
	}

}
