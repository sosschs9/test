// 2021111849 송혜경
public class VarRange {
	public static void main(String[] args) 
	{
		short short_totalCount = Short.MAX_VALUE;
		int int_totalCount = Integer.MAX_VALUE;
		long long_totalCount = Long.MAX_VALUE;
		
		// 3600초 = 1시간 
		// 3600 * 24 * 365 = 1년
		
		long year, day, hour;
		
		System.out.println("short max:" + Short.MAX_VALUE);
		year = short_totalCount / (3600 * 24 * 365);
		day = (short_totalCount % (3600 * 24 * 365)) / (3600 * 24);
		hour = ((short_totalCount % (3600 * 24 * 365)) % (3600 * 24)) / 3600;
		System.out.printf("short 변수 사용: %d년 %d일 %d시간\n\n", year, day, hour);
		
		System.out.println("int max:" + Integer.MAX_VALUE);
		year = int_totalCount / (3600 * 24 * 365);
		day = (int_totalCount % (3600 * 24 * 365)) / (3600 * 24);
		hour = ((int_totalCount % (3600 * 24 * 365)) % (3600 * 24)) / 3600;
		System.out.printf("int 변수 사용: %d년 %d일 %d시간\n\n", year, day, hour);
		
		System.out.println("long max:" + Long.MAX_VALUE);
		year = (long_totalCount / (3600 * 24 * 365));
		day = (long_totalCount % (3600 * 24 * 365)) / (3600 * 24);
		hour = ((long_totalCount % (3600 * 24 * 365)) % (3600 * 24)) / 3600;
		System.out.printf("long 변수 사용: %d년 %d일 %d시간\n\n", year, day, hour);	}
}
