public class Qiu {

    public static void main(String[] args) {
        double sum1 = 0, sum2 = 0, hight = 100.0;

        for (int i = 0; i < 10; i++)
        {
            sum1 = sum1 + hight;
            // ��ʾ��һ�¸߶ȵı仯
            // System.out.print(hight);
            hight = hight / 2;
            // System.out.print(" "+hight);
            //System.out.println();
            if (i < 9)

            {
                sum2 = sum2 + hight;
            }
        }
        System.out.println("��10�����ʱ��������" + (sum1 + sum2) + "��");
        System.out.println("��ʮ�η����߶�Ϊ" + hight + "��");
        
    }

}