public class QiangZhiZhuanHuan{
    public static void main(String[] args){
        int i1 = 123;
        byte b = (byte)i1;//强制类型转换为byte
        System.out.println("int（123）强制类型转换为byte后的值等于"+b);
	System.out.println();

	//制造一次数据溢出
	int i2 = 128;
	byte b2 = (byte)i2;//byte类型最大值是127，这次强转会导致溢出
	System.out.println("int（128）强制转换为byte后的值等于" + b2 + "(溢出错误值)");
    }
}
