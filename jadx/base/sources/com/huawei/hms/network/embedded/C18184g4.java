package com.huawei.hms.network.embedded;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.g4 */
/* JADX INFO: loaded from: classes9.dex */
public class C18184g4 extends ContextWrapper {

    /* JADX INFO: renamed from: a */
    public PackageManager f54909a;

    public C18184g4(Context context) {
        super(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public PackageManager getPackageManager() {
        PackageManager packageManager = this.f54909a;
        if (packageManager != null) {
            return packageManager;
        }
        C18198h4 c18198h4 = new C18198h4(getBaseContext());
        this.f54909a = c18198h4;
        return c18198h4;
    }
}
