package board.boardspringmvc.v0.src.user.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ModifyUserReq {

    private String userName;
    private String introduce;
    private String phone;
    private String email;
}
