package fc.java.part2;

public class BreakContinueTest {
    public static void main(String[] args) {
        //Q. char[] c={'s','h','u','t','d','o','w','n'}; 위 배열의 값을 출력 중
        // 'o'라는 문자를 만나면 반복 중단
        char[] c={'s','h','u','t','d','o','w','n'};
        for(int i=0 ; i<c.length ; i++){
            if(c[i]=='o') break;
            System.out.print(c[i]);
        }
        //Q. 1~10까지의 수 중 3의 배수의 개수를 구하여 출력
        int count=0;
        for (int i = 1; i < 10 ; i++) {
            if(i%3!=0) continue;
                count++;
        }
        System.out.println(count);
    }
}
