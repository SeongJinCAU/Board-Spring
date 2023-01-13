package board.boardspringmvc.v0.src.user.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ModifyUserRes {

    private String userName;
    private String introduce;
    private String phone;
    private String email;

    public ModifyUserRes(User user){
        this.userName = user.getUserName();
        this.introduce = user.getIntroduce();
        this.phone = user.getPhone();
        this.email = user.getEmail();
    }
}
