package board.boardspringmvc.user;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Table
@Data
@Entity
@Getter
@Setter
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "userId")
    private String userId;

    @Column(name = "password")
    private String password;

    @Column(name = "userName")
    private String userName;

    @Column(name = "isValid")
    private boolean isValid;

    /*
    회원 가입 시간 저장 필요.
     */

}
