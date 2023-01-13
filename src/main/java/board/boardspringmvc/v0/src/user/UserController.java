package board.boardspringmvc.v0.src.user;


import board.boardspringmvc.v0.config.BaseException;
import board.boardspringmvc.v0.config.BaseResponse;
import board.boardspringmvc.v0.src.user.model.GetUserRes;
import board.boardspringmvc.v0.src.user.model.ModifyUserReq;
import board.boardspringmvc.v0.src.user.model.ModifyUserRes;
import board.boardspringmvc.v0.src.user.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }


    @ResponseBody
    @PatchMapping("/modifyUser")
    public BaseResponse<ModifyUserRes> modifyUserInfo(@RequestBody ModifyUserReq modifyUserReq){
        try{
            ModifyUserRes modifyUserRes = userService.modifyUserInfo(modifyUserReq);
            return new BaseResponse<>(modifyUserRes);
        } catch (BaseException exception){
            return new BaseResponse<>((exception.getStatus()));
        }
    }

    @GetMapping("/user")
    public BaseResponse<GetUserRes> getUserInfo(){
        GetUserRes getUserRes = userService.getUserInfo();
        return new BaseResponse<>(getUserRes);
    }







}
