package com.huawei.agconnect.abtest;

import android.content.Context;
import android.os.Bundle;
import com.huawei.agconnect.abtest.p568a.C17566b;
import com.huawei.agconnect.common.api.Logger;

/* JADX INFO: loaded from: classes8.dex */
public class ABTestHAEventCallback {
    private C17566b impl = new C17566b();

    public void initialize(Context context) {
        this.impl.m75313a(context);
    }

    public void onEvent(String str, Bundle bundle, Bundle bundle2) {
        Logger.m75326d("ABTest", "abtest ha event :" + str);
        this.impl.m75314a(str, bundle, bundle2);
    }
}
