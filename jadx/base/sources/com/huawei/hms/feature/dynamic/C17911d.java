package com.huawei.hms.feature.dynamic;

import android.os.Bundle;
import com.huawei.hms.common.util.Logger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.huawei.hms.feature.dynamic.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C17911d {

    /* JADX INFO: renamed from: b */
    public static final String f53606b = "d";

    /* JADX INFO: renamed from: c */
    public static final C17911d f53607c = new C17911d();

    /* JADX INFO: renamed from: a */
    public Set<String> f53608a;

    /* JADX INFO: renamed from: a */
    public static C17911d m76949a() {
        return f53607c;
    }

    /* JADX INFO: renamed from: a */
    public void m76950a(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("installed_module_name");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            Logger.m75884w(f53606b, "Get installed module name failed.");
            this.f53608a = new HashSet();
            return;
        }
        Logger.m75880i(f53606b, "Installed module name:" + stringArrayList);
        this.f53608a = new HashSet(stringArrayList);
    }
}
