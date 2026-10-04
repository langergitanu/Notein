package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.appcheck.debug.internal.DebugAppCheckProvider;
import com.google.firebase.appcheck.internal.AppCheckTokenResponse;
import o000oooO.InterfaceC24756OooO0O0;

/* JADX INFO: renamed from: com.aspose.slides.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C22208OooOo0 implements SuccessContinuation {
    public static int OooO00o(double d, double d2, int i) {
        return C7019kk.m27462to(Double.valueOf(d / d2), i);
    }

    public static void OooO0O0(InterfaceC24756OooO0O0 interfaceC24756OooO0O0, String str, String str2, String str3, String str4) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC24756OooO0O0, str);
        interfaceC24756OooO0O0.oo0o0Oo(str2);
        interfaceC24756OooO0O0.oo0o0Oo(str3);
        interfaceC24756OooO0O0.oo0o0Oo(str4);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return DebugAppCheckProvider.lambda$getToken$3((AppCheckTokenResponse) obj);
    }
}
