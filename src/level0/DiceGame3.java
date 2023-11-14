package level0;

public class DiceGame3 {
	
	public int solution(int a, int b, int c, int d) {
        int answer = 0;
        if(a == b  && a == c && a == d) {
        	answer = a*1111;
        }else if(a == b && a == c && a != d) {
        	answer = 10*a+d;
        	answer = answer*answer;
        }else if(a == c && a== d && a !=b) {
        	answer = 10*a+b;
        	answer = answer*answer;
        }else if(a == b && a== d&& a !=c) {
        	answer = 10*a+c;
        	answer = answer*answer;
        }else if(b == c && b == d && a !=b) {
        	answer = 10*b+a;
        	answer = answer*answer;
        }else if(a == b && c == d && a != c) {
        	answer = (a+c)*(Math.abs(a-c));
        }else if(a == c && b == d && a != b) {
        	answer = (a+b)*(Math.abs(a-b));
        }else if(a == d && b ==c && a != b) {
        	answer = (a+b)*(Math.abs(a-b));
        }else if(a == b && a != c && a != d) {
        	answer = c*d;
        }else if(a == c && a != b && a != d) {
        	answer = b*d;
        }else if(a == d && a != b && a != c) {
        	answer = b*c;
        }else if(b==c && a != b && b != d) {
        	answer = a*d;
        }else if(b==d && a !=b && b !=c) {
        	answer = a*c;
        }else if(c==d && a != c && b != c) {
        	answer = a*b;
        }else if(a !=b && b != c && c != d){
        	if(a < b && a<c && a<d) {
        		answer = a;
        	}else if(b< a && b<c && b < d) {
        		answer = b;
        	}else if(c < a && c <b && c < d) {
        		answer = c;
        	}else if(d< a && d < b && d < c) {
        		answer = d;
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		DiceGame3 dg = new DiceGame3();
		System.out.println(dg.solution(2, 2, 4, 4));
	}
}
