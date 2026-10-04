package com.alipay.share.sdk.plugin;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.alipay.share.sdk.Constant;

/* JADX INFO: loaded from: base.apk:libs/libapshare.jar:com/alipay/share/sdk/plugin/APVersionCheck.class */
public class APVersionCheck {
    private Context context;

    public APVersionCheck(Context context) {
        this.context = context;
    }

    public int getZFBAppVersionCode() {
        try {
            PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(Constant.ZFB_PACKAGE_NAME, 64);
            int versionCode = packageInfo.versionCode;
            return versionCode;
        } catch (Exception e) {
            return 0;
        }
    }
}
