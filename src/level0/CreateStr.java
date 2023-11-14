package level0;

public class CreateStr {

	
	public String solution(String my_string, int[] index_list) {
		String answer = "";
		for(int i = 0; i < index_list.length; i++) {
			answer +=(my_string.charAt(index_list[i]));
		}
        return answer;
    }
	
	public static void main(String[] args) {
		CreateStr cs = new CreateStr();
		String a = "cvsgiorszzzmrpaqpe";
		int[] index = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
		System.out.println(cs.solution(a, index));
	}
}
