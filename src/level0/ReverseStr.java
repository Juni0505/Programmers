package level0;

public class ReverseStr {
	public String solution(String str, int[][] queries) {
		String answer = "";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < queries.length; i++) {
			int index1 = queries[i][0];
			int index2 = queries[i][1];
			sb.append(str.substring(index1,index2+1));
			System.out.println(sb);
			sb.reverse();
			System.out.println(str.substring(0,index1));
			System.out.println(sb.toString());
			System.out.println(str.substring(index2+1,str.length()));
			str = str.substring(0,index1)+ sb.toString()+str.substring(index2+1,str.length());
			sb.delete(0, sb.length());
			System.out.println(str);
		}
		answer = str;
		return answer;
	}

	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		String str = "rermgorpsam";
		int[][] queries = { { 2, 3 }, { 0, 7 }, { 5, 9 }, { 6, 10 } };
		System.out.println(rs.solution(str, queries));
	}
}
