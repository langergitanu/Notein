package com.alipay.sdk.app;

/* JADX INFO: loaded from: classes.dex */
public class H5AuthActivity extends H5PayActivity {
    @Override // com.alipay.sdk.app.H5PayActivity
    public final void OooO00o() {
        Object obj = AuthTask.f170c;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Exception unused) {
            }
        }
    }
}
