package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C16365ae;
import com.google.android.play.integrity.internal.InterfaceC16398i;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bh */
/* JADX INFO: loaded from: classes7.dex */
final class C16316bh extends AbstractC16321bm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Bundle f51470a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Activity f51471b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ TaskCompletionSource f51472c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ int f51473d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C16322bn f51474e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16316bh(C16322bn c16322bn, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i) {
        super(c16322bn, taskCompletionSource);
        this.f51470a = bundle;
        this.f51471b = activity;
        this.f51472c = taskCompletionSource2;
        this.f51473d = i;
        this.f51474e = c16322bn;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC16409t
    /* JADX INFO: renamed from: b */
    public final void mo74937b() {
        if (C16322bn.m74972l(this.f51474e)) {
            mo74936a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            C16322bn c16322bn = this.f51474e;
            C16365ae c16365ae = c16322bn.f51484a;
            ((InterfaceC16398i) c16365ae.m75011e()).mo75050c(this.f51470a, c16322bn.f51488e.m74949a(this.f51471b, this.f51472c, c16365ae));
        } catch (RemoteException e) {
            this.f51474e.f51485b.m75060c(e, "requestAndShowDialog(%s)", Integer.valueOf(this.f51473d));
            this.f51472c.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
