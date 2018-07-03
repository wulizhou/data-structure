package www.wulizhou.com.sort;

public class Sort {

	/**
	 * ����
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
	 * ð������
	 */
	public static void bubbleSort(int[] data) {

		for (int i = 0; i < data.length - 1; i++) {
			// ���ڵ�������ǰ����ʱ��ֹ����
			boolean isSorted = false;
			for (int j = 0; j < data.length - i - 1; j++) {
				// ��ֵ��С����ǰ��
				if (data[j] > data[j + 1]) {
					swap(data, j, j + 1);
					isSorted = true;
				}
			}

			// ���������򣬽������
			if (!isSorted) {
				break;
			}

		}
	}

}
