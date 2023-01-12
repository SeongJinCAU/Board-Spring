package board.boardspringmvc.v0.src.user.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {

    private String userName;
    private String introduce;
    private String phone;
    private String email;
}
