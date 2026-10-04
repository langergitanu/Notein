package o00OOOO0;

import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.api.entity.auth.AuthCode;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 {
    public static int OooO00o(int i) {
        if (i == 4001) {
            return 6;
        }
        if (i == 5000) {
            return 7;
        }
        if (i == 8000) {
            return 8;
        }
        if (i == 9000) {
            return 1;
        }
        if (i != 6001) {
            return i != 6002 ? 2 : 4;
        }
        return 3;
    }

    public static /* synthetic */ int OooO0O0(int i) {
        switch (i) {
            case 1:
                return ConnectionResult.NETWORK_ERROR;
            case 2:
                return 4000;
            case 3:
                return AuthCode.StatusCode.WAITING_CONNECT;
            case 4:
                return AuthCode.StatusCode.AUTH_INFO_NOT_EXIST;
            case 5:
                return 6007;
            case 6:
                return 4001;
            case 7:
                return 5000;
            case 8:
                return 8000;
            default:
                throw null;
        }
    }

    public static /* synthetic */ String OooO0OO(int i) {
        switch (i) {
            case 1:
                return "处理成功";
            case 2:
                return "系统繁忙，请稍后再试";
            case 3:
                return "用户取消";
            case 4:
                return "网络连接异常";
            case 5:
                return "支付未完成";
            case 6:
                return "参数错误";
            case 7:
                return "重复请求";
            case 8:
                return "支付结果确认中";
            default:
                throw null;
        }
    }
}
