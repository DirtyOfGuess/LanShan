import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //定义失物数据
        Lost lost1 = new Lost(100,10,"Key");
        Lost lost2 = new BookLost(200,20);
        Lost lost3 = new CardLost(300,30);
        Lost lost4 = new Lost(250,40,"Phone");

        //将失物数据导入lostArray
        ArrayList<Lost> lostArray = new ArrayList<>();
        lostArray.add(lost1);
        lostArray.add(lost2);
        lostArray.add(lost3);
        lostArray.add(lost4);

        while(true) {
            //We重邮界面
            System.out.println("———————————We重邮失物招领模块———————");
            System.out.println("1.展示失物");
            System.out.println("2.按关键字搜索");
            System.out.println("3.退出");
            System.out.print("请选择: ");
            int choose = scan.nextInt();

            //1.展示失物
            if(choose == 1) {
                //失物数组lostArray排序
                ArrayList<Lost> sortLostArray = Solution.sortLost(lostArray);

                //展示排序后的失物数组sortLostArray
                System.out.println("——————————We重邮展示失物————————————");
                for (int i = 0; i < lostArray.size(); i++) {
                    System.out.println("失物" + sortLostArray.get(i).getType() + "的丢失时间为: " +
                            sortLostArray.get(i).getLostTime() + " 分钟");
                }
            }
            //2.按关键字搜索
            else if(choose == 2){
                //录入匹配项（按失物种类）到selectLostArray
                System.out.println("——————————We重邮按关键字搜索————————————");
                System.out.print("(按失物种类搜索)请输入关键字: ");
                String keyword = scan.next();
                ArrayList<Lost> selectLostArray = Solution.selectByKeyword(lostArray,keyword);

                //展示selectLostArray
                for(int i = 0;i<selectLostArray.size();i++){
                    System.out.println("失物 "+selectLostArray.get(i).getNumber()+" 的种类为 "+
                            selectLostArray.get(i).getType() +" ,它的丢失时间为 "+selectLostArray.get(i).getLostTime());
                }
            }
            //3.程序退出
            else{
                System.out.println("——————————程序退出——————————————");
                System.exit(0);
            }
        }
    }
}
