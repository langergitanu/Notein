package com.google.firebase.inappmessaging.internal;

import androidx.graphics.surface.SurfaceControlCompat;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooOOOO implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f68494OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f68495OooOo0o;

    public /* synthetic */ OooOOOO(Object obj, int i) {
        this.f68495OooOo0o = i;
        this.f68494OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f68495OooOo0o) {
            case 0:
                ((ForegroundNotifier) this.f68494OooOo).lambda$onActivityPaused$0();
                break;
            default:
                SurfaceControlCompat.TransactionCommittedListener listener = (SurfaceControlCompat.TransactionCommittedListener) this.f68494OooOo;
                kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "$listener");
                listener.onTransactionCommitted();
                break;
        }
    }
}
