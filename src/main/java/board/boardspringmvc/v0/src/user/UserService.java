package board.boardspringmvc.v0.src.user;


import board.boardspringmvc.v0.config.BaseException;
import board.boardspringmvc.v0.config.BaseResponseStatus;
import board.boardspringmvc.v0.src.user.model.GetUserRes;
import board.boardspringmvc.v0.src.user.model.ModifyUserReq;
import board.boardspringmvc.v0.src.user.model.ModifyUserRes;
import org.springframework.stereotype.Service;

import static board.boardspringmvc.v0.config.BaseResponseStatus.*;

@Service
public class UserService {

    private final UserProvider userProvider;
    public UserService(UserProvider userProvider) {
        this.userProvider = userProvider;
    }

    public ModifyUserRes modifyUserInfo(ModifyUserReq modifyUserReq) throws BaseException {
        try{
            ModifyUserRes modifyUserRes = userProvider.modifyUserInfo(modifyUserReq);
            return modifyUserRes;
        } catch(Exception e){
            throw new BaseException(MEMORY_ERROR);
        }
    }

    public GetUserRes getUserInfo() {
        return userProvider.getUserInfo();
    }
}
