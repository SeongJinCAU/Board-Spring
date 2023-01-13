package board.boardspringmvc.v0.config;

import lombok.Getter;

@Getter
public enum BaseResponseStatus {

    /**
     * 1000: 요청 성공 코드
     */
    SUCCESS(true, 1000, "요청에 성공했습니다"),

    /**
     * 2000 : Request 오류
     */


    /**
     * 4000 : Database, Server 오류
     */
    MEMORY_ERROR(false, 4999, "서버 메모리 문제");








    private final boolean isSuccess;
    private final int code;
    private final String message;

    private BaseResponseStatus(boolean isSuccess, int code, String message) {
        this.isSuccess = isSuccess;
        this.code = code;
        this.message = message;
    }
}
