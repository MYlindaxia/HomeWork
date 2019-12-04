public class Qiu {

    public static void main(String[] args) {
        double sum1 = 0, sum2 = 0, hight = 100.0;

        for (int i = 0; i < 10; i++)
        {
            sum1 = sum1 + hight;
            // 显示了一下高度的变化
            // System.out.print(hight);
            hight = hight / 2;
            // System.out.print(" "+hight);
            //System.out.println();
            if (i < 9)

            {
                sum2 = sum2 + hight;
            }
        }
        System.out.println("第10次落地时，共经过" + (sum1 + sum2) + "米");
        System.out.println("第十次反弹高度为" + hight + "米");
        
    }

}