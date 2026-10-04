package com.alipay.share.sdk.openapi.channel;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.alipay.share.sdk.Constant;
import com.aspose.words.WarningType;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: base.apk:libs/libapshare.jar:com/alipay/share/sdk/openapi/channel/APMessageAct.class */
public class APMessageAct {
    private static final String TAG = "APSDK.APMessageAct";

    public static boolean send(Context context, String scheme, String content, Bundle bundle) {
        if (context != null && !TextUtils.isEmpty(scheme)) {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(scheme));
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            String packageName = context.getPackageName();
            intent.putExtra(Constant.EXTRA_MESSAGE_SDK_VERSION, Constant.SDK_VERSION);
            intent.putExtra(Constant.EXTRA_MESSAGE_APP_PACKAGE_NAME, packageName);
            intent.putExtra(Constant.EXTRA_MESSAGE_CONTENT, content);
            intent.putExtra("actionType", "outShare");
            intent.putExtra(Constant.EXTRA_MESSAGE_CHECK_SUM, MMessageUtil.checkSum(content, packageName));
            intent.addFlags(WarningType.HINT);
            try {
                context.startActivity(intent);
                Log.d(TAG, "send alipay message, intent=" + intent);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e(TAG, "send fail, target ActivityNotFound");
                return false;
            } catch (Exception exception) {
                Log.e(TAG, "send fail " + exception.getMessage());
                return false;
            }
        }
        Log.e(TAG, "send fail, invalid arguments");
        return false;
    }

    public static boolean sendToZFB(Context context, String content, Bundle bundle) {
        return send(context, "alipays://platformapi/startapp?appId=20000167&actionType=outShare", content, bundle);
    }
}
