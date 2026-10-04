package com.huawei.agconnect.abtest.p568a;

import android.content.Context;
import android.os.Bundle;
import com.huawei.agconnect.common.api.HaBridge;
import com.huawei.agconnect.common.api.Logger;

/* JADX INFO: renamed from: com.huawei.agconnect.abtest.a.b */
/* JADX INFO: loaded from: classes8.dex */
public class C17566b {
    /* JADX INFO: renamed from: a */
    public void m75313a(Context context) {
    }

    /* JADX INFO: renamed from: a */
    public void m75314a(String str, Bundle bundle, Bundle bundle2) {
        boolean z = false;
        for (String str2 : C17568d.m75325c()) {
            for (C17565a c17565a : C17568d.m75320a(str2)) {
                if (c17565a.m75310c() != null && !c17565a.m75311d() && c17565a.m75310c().equals(str)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("$ABTaskId", c17565a.m75307a());
                    bundle3.putString("$ABVarId", c17565a.m75309b());
                    bundle3.putString("$ABChannel", str2);
                    Logger.m75326d("ABTest", "report trigger ab test event");
                    new HaBridge(HaBridge.HA_SERVICE_TAG_ABTEST).onEvent("$JoinABTask", bundle3);
                    z = true;
                    c17565a.m75308a(true);
                }
            }
        }
        if (z) {
            C17568d.m75324b();
        }
    }
}
