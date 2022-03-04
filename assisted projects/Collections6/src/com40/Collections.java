package com40;
import java.util.ArrayList;
	public class Collections {


		void test(ArrayList<Integer> data) {
			data.add(99);

		}

		public static void main(String[] args) {

			int[] a = new int[3];
			a[0] = 5;
			a[1] = 6;
			a[2] = 7;


			ArrayList<Integer> list = new ArrayList<>();
			list.add(7);
			list.add(6);
			list.add(5);


			/*Iterator<Integer> listItr = list.iterator();
			
			while(listItr.hasNext()) {
				System.out.println(listItr.next());
			}*/

			for(Integer val : list) {
				System.out.println(val);
			}

			new Collections().test(list);


		}

	}
	