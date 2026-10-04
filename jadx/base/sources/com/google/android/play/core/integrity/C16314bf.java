package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.InterfaceC16398i;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bf */
/* JADX INFO: loaded from: classes7.dex */
final class C16314bf extends AbstractC16321bm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ long f51462a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ TaskCompletionSource f51463b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C16322bn f51464c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16314bf(C16322bn c16322bn, TaskCompletionSource taskCompletionSource, int i, long j, TaskCompletionSource taskCompletionSource2) {
        super(c16322bn, taskCompletionSource);
        this.f51462a = j;
        this.f51463b = taskCompletionSource2;
        this.f51464c = c16322bn;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC16409t
    /* JADX INFO: renamed from: b */
    public final void mo74937b() {
        if (C16322bn.m74972l(this.f51464c)) {
            mo74936a(new StandardIntegrityException(-2, null));
            return;
        }
        if (C16322bn.m74971k(this.f51464c, 0)) {
            mo74936a(new StandardIntegrityException(-14, null));
            return;
        }
        try {
            C16322bn c16322bn = this.f51464c;
            ((InterfaceC16398i) c16322bn.f51484a.m75011e()).mo75052e(C16322bn.m74965b(c16322bn, this.f51462a, 0), new BinderC16320bl(this.f51464c, this.f51463b));
        } catch (RemoteException e) {
            this.f51464c.f51485b.m75060c(e, "warmUpIntegrityToken(%s)", Long.valueOf(this.f51462a));
            this.f51463b.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
