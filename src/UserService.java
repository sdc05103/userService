public class UserService {
        UserDAO userDAO = new UserDAO();

        public boolean join(User user) {
                return userDAO.save(user);
        }

        public void login(User user) {
                String id = user.getUser_id();
                if (userDAO.find(user)) {
                        System.out.println(id + "로그인 성공");
                        return;
                }
                System.out.println("로그인 실패");
        }


}