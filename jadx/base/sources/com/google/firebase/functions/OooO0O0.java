package com.google.firebase.functions;

import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.interop.AppCheckTokenListener;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO0O0 implements AppCheckTokenListener {
    @Override // com.google.firebase.appcheck.interop.AppCheckTokenListener
    public final void onAppCheckTokenChanged(AppCheckTokenResult appCheckTokenResult) {
        OooOOO0.OooO0oO(appCheckTokenResult, "it");
    }
}
