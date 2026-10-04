package com.huawei.hms.update.note;

import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes9.dex */
public class DoNothingResolution implements IBridgeActivityDelegate {
    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        HMSLog.m80174i("DoNothingResolution", "<DoNothingResolution getRequestCode>");
        return 0;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        HMSLog.m80174i("DoNothingResolution", "<DoNothingResolution onBridgeActivityCreate>");
        if (activity == null || activity.isFinishing()) {
            HMSLog.m80172e("DoNothingResolution", "<Resolution onBridgeActivityCreate> activity is null or finishing");
        } else {
            activity.setResult(30);
            activity.finish();
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.m80174i("DoNothingResolution", "<DoNothingResolution onBridgeActivityDestroy>");
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        HMSLog.m80174i("DoNothingResolution", "<DoNothingResolution onBridgeActivityResult>");
        return false;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.m80174i("DoNothingResolution", "<DoNothingResolution onBridgeConfigurationChanged>");
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        HMSLog.m80174i("DoNothingResolution", "<DoNothingResolution onKeyUp>");
    }
}
