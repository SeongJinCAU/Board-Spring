package board.boardspringmvc.v0.src.user;


import board.boardspringmvc.v0.src.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final User user = new User("성진", "안녕하세요", "01012345678", "abc123@gmail.com");
    public UserController(UserService userService){
        this.userService = userService;
    }







}
