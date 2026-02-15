package silver.P11659;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    /**
     * - 문제
     * 수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.
     *
     * - 입력
     * 첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다. 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.
     *
     * - 출력
     * 총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.
     *
     * - 메모
     * 합 배열을 응용하면 됨
     * 합 배열 : A[0] ~ A[i] 까지의 합을 각 저장해놓은 배열
     * A            = [15, 13, 10, 7, 3, 12];
     * S(합 배열)    = [15, 28, 38, 45, 48, 60];
     * 이를 응용하여 n번 인덱스 부터 m번 인덱스 까지 구간의 합을 더 쉽게 구할 수 있음
     * => S[m] - S[n-1]
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        /*
         * [입력 방식 변경]
         * 기존: Scanner
         *  - 사용하기는 편하지만 내부적으로 정규식 처리 + 동기화가 들어가서 느림
         *  - 입력 데이터가 많은 코딩 테스트 환경에서는 시간 초과 위험 있음
         *
         * 변경: BufferedReader + StringTokenizer
         *  - BufferedReader : 입력을 한 줄 단위로 빠르게 읽음
         *  - StringTokenizer : 공백 기준으로 문자열을 잘라서 토큰 단위로 사용
         *
         * [기본 사용 흐름]
         * 1. br.readLine()으로 한 줄 입력 받기
         * 2. StringTokenizer로 공백 분리
         * 3. nextToken()으로 값 꺼내서 파싱
         *
         * → 코딩 테스트에서는 Scanner 대신 이 방식이 표준
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = Integer.parseInt(st.nextToken());
        int terms = Integer.parseInt(st.nextToken());
        long[] sumArr = new long[cnt];

        st = new StringTokenizer(br.readLine()); // 줄넘김 넘기기
        for(int i = 0; i < cnt; i++) {
            long pre = i > 0 ? sumArr[i - 1] : 0;
            int num = Integer.parseInt(st.nextToken());

            sumArr[i] = pre + num;
        }

        for(int i = 0; i < terms; i++) {
            st = new StringTokenizer(br.readLine()); // 줄넘김 넘기기
            int start = Integer.parseInt(st.nextToken()) -1;
            int end = Integer.parseInt(st.nextToken()) - 1;
            long a = sumArr[end];
            long b = start > 0 ? sumArr[start - 1] : 0;
            System.out.println(a - b);
        }
    }
}
