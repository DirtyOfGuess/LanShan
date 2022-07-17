import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Solution {
    /**
     * 失物排序方法
     * @param lostArray 待排序的失物数组
     */
    public static ArrayList<Lost> sortLost(ArrayList<Lost> lostArray) {
        for (int i = 0; i < lostArray.size()-1; i++) {
            for (int j = 0; j < lostArray.size()-i-1; j++)
                if (lostArray.get(j).getLostTime() < lostArray.get(j + 1).getLostTime()) {
                    int temp = lostArray.get(j + 1).getLostTime();
                    lostArray.get(j + 1).setLostTime(lostArray.get(j).getLostTime());
                    lostArray.get(j).setLostTime(temp);
                }
        }
        return lostArray;
    }

    /**
     * 按关键字搜索失物的方法，这里假设按照失物的领取地点进行搜索
     * @param lostArray 失物数组
     * @param keyword 用户输入的关键字
     * @return 返回查找到的失物
     */
    public static ArrayList<Lost> selectByKeyword(ArrayList<Lost> lostArray,String keyword){
        ArrayList<Lost> selectLostArray = new ArrayList<>();
        for(int i = 0;i<lostArray.size();i++){
            if(lostArray.get(i).getType().contains(keyword)){
                selectLostArray.add(lostArray.get(i));
            }
            else{
                System.out.println("暂无此类失物");
            }
        }
        return selectLostArray;
    }
}
