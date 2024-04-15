package finalex;

/*
 * 여러 파일에서 공유하는 상수 만들기
 * 1. 접근 범위에 제한이 없어야함. (퍼블릭으로 만들기)
 * 2. 인스턴스 X (static)
 * 3. 값을 변경할 수 없도록 final을 붙힘
 * */
public class Define {
	public static final int MIN = 1; // 최솟값
	
	public static final int MAX = 999; // 최대값
	
	public static final int ENG = 1001; // 영어 과목 코드
	
	public static final int MATH = 2001; // 수학 과목 코드
}
