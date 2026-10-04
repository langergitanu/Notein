package com.alipay.share.sdk.openapi.channel;

import com.alipay.share.sdk.Constant;
import com.alipay.share.sdk.openapi.algorithm.MD5;

/* JADX INFO: loaded from: base.apk:libs/libapshare.jar:com/alipay/share/sdk/openapi/channel/MMessageUtil.class */
public class MMessageUtil {
    static byte[] checkSum(String content, String packageName) {
        StringBuffer stringBuffer = new StringBuffer();
        if (content != null) {
            stringBuffer.append(content);
        }
        stringBuffer.append(Constant.SDK_VERSION);
        stringBuffer.append(packageName);
        stringBuffer.append("alipay");
        return MD5.getMessageDigest(stringBuffer.toString().substring(1, 9).getBytes()).getBytes();
    }
}
