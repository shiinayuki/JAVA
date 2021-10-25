package ProgramStudy.src.TestDemo0527;
/*
 *Created by ShiinaYuki on 2021/5/27 20:15 20 15
 */

import java.util.*;
    class Test {
        public static int[][] dyadicArraySort(int a[][]) {
            int n = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    n++;
                }
            }//已经统计出二维数组中数据的个数
            int b[] = new int[n];
            int k = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    b[k] = a[i][j];
                    k++;
                }
            }//已经把二维数组的各元素搬到了一维数组b中

            Arrays.sort(b);//对一维数组b进行升序排列

            k = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = b[k];
                    k++;
                }
            }//已经一维数组b中个元素放回二维数组中

            return a;


        }

        public static void main(String[] args) {
            int n[][] = {{8, 7, 10},
                    {9, 1},
                    {15, 0, -3, 16}};
            output(n);
            dyadicArraySort(n);
            output(n);

        }

        public static void output(int a[][]) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("-----------------");
        }
    }

