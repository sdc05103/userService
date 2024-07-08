import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("1: 회원가입 2: 로그인 3: 회원정보 수정 4: 탈퇴 0: 종료");
            int iValue = in.nextInt();
            if(iValue == 1){
                System.out.println("가입하실 아이디와 이름, 비밀번호를 (띄어쓰기를 구분하여) 입력하세요.");
                String id = in.next();
                String name = in.next();
                String pwd = in.next();
                User user = new User(id,pwd, name);
                userService.join(user);
            }
            else if(iValue == 2){
                System.out.println("아이디와 비밀번호를 (띄어쓰기를 구분하여) 입력하세요.");
                String id = in.next();
                String pwd = in.next();
                User user = new User(id, pwd);
                userService.login(user);
            }
            else if(iValue == 3 ){


            }
            else if(iValue == 4) {
            }
            else {

            }


        }
        
        
        

//        int iValue = in.nextInt();




    }
}