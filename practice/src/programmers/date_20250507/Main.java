package programmers.date_20250507;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*프로그래머스-완전범죄*/
public class Main {
    public static void main(String[] args) {




    }


    public int solution(int[][] info, int n, int m) {

        //여기 반복문으로 감싸질것 같은 이 부분 알고리즘을 못품 (모두 탐색)
        int[] flag ={0,0,0}; //index.length만큼

        List<Integer> aSumList = new ArrayList<>();
        for (int i=1; i<=info.length; i++){
            int tempA = 0, tempB = 0;
            if(flag[i] == 0){
                tempA += info[i][0];
            } else {
                tempB += info[i][1];
            }


            if (tempA < n && tempB <m){
                aSumList.add(tempA);
            }
        }

        return aSumList.size() == 0 ? -1 : Collections.min(aSumList);
    }

}
