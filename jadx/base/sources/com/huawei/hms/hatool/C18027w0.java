package com.huawei.hms.hatool;

import android.content.Context;
import android.os.UserManager;

/* JADX INFO: renamed from: com.huawei.hms.hatool.w0 */
/* JADX INFO: loaded from: classes8.dex */
public class C18027w0 {

    /* JADX INFO: renamed from: c */
    public static C18027w0 f53928c = new C18027w0();

    /* JADX INFO: renamed from: a */
    public boolean f53929a = false;

    /* JADX INFO: renamed from: b */
    public Context f53930b = AbstractC17970b.m77230i();

    /* JADX INFO: renamed from: b */
    public static C18027w0 m77566b() {
        return f53928c;
    }

    /* JADX INFO: renamed from: a */
    public boolean m77567a() {
        if (!this.f53929a) {
            Context context = this.f53930b;
            if (context == null) {
                return false;
            }
            UserManager userManager = (UserManager) context.getSystemService("user");
            if (userManager != null) {
                this.f53929a = userManager.isUserUnlocked();
            } else {
                this.f53929a = false;
            }
        }
        return this.f53929a;
    }
}
