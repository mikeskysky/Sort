package com.mike.sort.leecode;

public class FindTheDifference {
	
	public static void main(String[] args) 
	{
		FindTheDifference fd=new FindTheDifference();
//		System.out.println(fd.findNthDigit2(1000000000));
		System.out.println(fd.findNthDigit(1000000000));
		
	}
	public int findNthDigit(int n) {
		int base=9;
		int baseNum=10;
		if(n<=9)return n;
		else
		{
			n=n-base;
			int start=1;
			int preResult=0;
			while(n>=0)
			{
				start++;
				preResult=n;
				long tempNum=(long) (Math.pow(baseNum, start-1)*start);
				long resultNum=tempNum*base;
				n=(int) (n-resultNum);
			}	
			long carry=(preResult)/start;
			int modi=(preResult)%start;
			if(modi==0)
			{
				long realResult=(long) (Math.pow(baseNum, start-1)+carry-1);
				return Integer.parseInt((realResult+"").substring((realResult+"").length()-1));
			}
			else
			{
				long realResult=(long)Math.pow(baseNum, start-1) +carry;
				return Integer.parseInt((realResult+"").substring(modi-1,modi));
			}
			
		}
	}
	
	public int findNthDigit2(int n) {
        long base = 9,digits = 1;
        // 1 计算这个数是几位数
        while(n - base * digits > 0){
            n -= base * digits;
            base *= 10;
            digits++;
        }
        //2 计算这个数是多少
        long index = n % digits;
        if(index == 0)
            index = digits;
        long num = 1;
        for(int i = 1; i < digits; i++){
            num *= 10;
        }
        num += (index == digits) ? n / digits -1 : n / digits;
        //3 找到这个数的第几位是我们想要的
        for(long i= index; i < digits; i++)
            num /= 10;
        return (int) (num % 10);
    }
}
