package com.google.firebase.storage;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCanceledListener;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooOo00 implements OnCanceledListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CancellationTokenSource f68730OooO00o;

    public /* synthetic */ OooOo00(CancellationTokenSource cancellationTokenSource) {
        this.f68730OooO00o = cancellationTokenSource;
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.f68730OooO00o.cancel();
    }
}
