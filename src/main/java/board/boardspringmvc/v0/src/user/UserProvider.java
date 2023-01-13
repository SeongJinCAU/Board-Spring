package board.boardspringmvc.v0.src.user;

import board.boardspringmvc.v0.src.user.model.GetUserRes;
import board.boardspringmvc.v0.src.user.model.ModifyUserReq;
import board.boardspringmvc.v0.src.user.model.ModifyUserRes;
import board.boardspringmvc.v0.src.user.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserProvider {
    private User user = new User("성진", "안녕하세요", "01012345678", "abc123@gmail.com");

    public ModifyUserRes modifyUserInfo(ModifyUserReq modifyInfo){
        user.setUserName(modifyInfo.getUserName());
        user.setIntroduce(modifyInfo.getIntroduce());
        user.setEmail(modifyInfo.getEmail());
        user.setPhone(modifyInfo.getPhone());

        ModifyUserRes modifyUserRes = new ModifyUserRes(user);

        return modifyUserRes;
    }

    public GetUserRes getUserInfo() {
        return new GetUserRes(user);
    }
}
