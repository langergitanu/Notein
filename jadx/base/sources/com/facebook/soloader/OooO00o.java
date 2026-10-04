package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO00o extends AbstractC22320OooOoO0 implements InterfaceC22313OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f67477OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO0o f67478OooO0O0;

    public OooO00o(Context context, int i) {
        this.f67477OooO00o = i;
        this.f67478OooO0O0 = new OooO0o(new File(context.getApplicationInfo().nativeLibraryDir), i);
    }

    @Override // com.facebook.soloader.InterfaceC22313OooOOo
    public final AbstractC22320OooOoO0 OooO0O0(Context context) {
        this.f67478OooO0O0 = new OooO0o(new File(context.getApplicationInfo().nativeLibraryDir), this.f67477OooO00o | 1);
        return this;
    }

    @Override // com.facebook.soloader.AbstractC22320OooOoO0
    public final String OooO0OO() {
        return "ApplicationSoSource";
    }

    @Override // com.facebook.soloader.AbstractC22320OooOoO0
    public final int OooO0Oo(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        return this.f67478OooO0O0.OooO0Oo(str, i, threadPolicy);
    }

    @Override // com.facebook.soloader.AbstractC22320OooOoO0
    public final void OooO0o0(int i) throws IOException {
        this.f67478OooO0O0.getClass();
    }

    @Override // com.facebook.soloader.AbstractC22320OooOoO0
    public final String toString() {
        return "ApplicationSoSource[" + this.f67478OooO0O0.toString() + "]";
    }
}
