package o0O00;

import android.text.TextUtils;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.hihonor.honorid.core.data.DeviceInfo;
import com.huawei.hms.network.embedded.C18115b5;
import com.huawei.hms.network.embedded.C18358t1;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.microsoft.identity.common.internal.providers.oauth2.ResponseType;
import com.microsoft.identity.common.java.commands.DeviceCodeFlowAuthResultCommand;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ArrayList f88109OooO00o = new ArrayList();

    static {
        String[] strArr = {"userid", "password", "siteid", "plmn", "mobilephone", "deviceinfo", DeviceInfo.TAG_UUID, "deviceid2", "secretdigest", "salt", "emmcid", "secretdigesttype", "clientip", DeviceCodeFlowAuthResultCommand.DEVICE_ID_CLAIM, C18115b5.DEVICE_ID, "securityphone", "securityemail", "cookie", "devicetype", "useremail", "email", "servicetoken", "oldpassword", "newpassword", "thirdtoken", "smsauthcode", "phone", "access_token", "sc", "sso_st", ResponseType.TOKEN, "ac", "pw", "dvid", TranslateLanguage.POLISH, "dvid2", "sc", "emid", "sct", "c", "st", "app", CommonConstant.KEY_UID, "imsi", "thirdopenid", "thirdaccesstoken", "accountName", "useraccount", "fulluseraccount", "nickName", "uniquelynickname", "loginusername", "thirdnickname", "fingerST"};
        for (int i = 0; i < 54; i++) {
            String str = strArr[i];
            if (!TextUtils.isEmpty(str)) {
                f88109OooO00o.add(str.toLowerCase(Locale.ENGLISH));
            }
        }
    }

    public static String OooO00o(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.length() == 1) {
            return C18358t1.g.f56183c;
        }
        int iCeil = (int) Math.ceil(((double) (str.length() * 50)) / 100.0d);
        StringBuilder sb = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer(iCeil);
        for (int i = 0; i < iCeil; i++) {
            stringBuffer.append('*');
        }
        sb.append(stringBuffer.toString());
        sb.append(str.substring(iCeil));
        return sb.toString();
    }
}
