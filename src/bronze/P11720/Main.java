package bronze.P11720;

import java.util.Scanner;

public class Main {
    /**
     * 11720 : 숫자의 합 구하기
     * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
     *  - input
     * 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
     *  - output
     *  입력으로 주어진 숫자 N개의 합을 출력한다.
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String numbers = sc.next();

        int answer = 0;
        String[] numberArr = numbers.split("");
        for(int i = 0; i < numberArr.length; i++) {
            int num = Integer.parseInt(numberArr[i]);
            answer += num;
        }

        System.out.println(answer);
    }
}
