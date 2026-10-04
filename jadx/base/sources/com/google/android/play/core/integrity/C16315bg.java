package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import com.google.android.play.integrity.internal.InterfaceC16398i;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bg */
/* JADX INFO: loaded from: classes7.dex */
final class C16315bg extends AbstractC16321bm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ StandardIntegrityManager.StandardIntegrityTokenRequest f51465a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long f51466b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ long f51467c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ TaskCompletionSource f51468d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C16322bn f51469e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16315bg(C16322bn c16322bn, TaskCompletionSource taskCompletionSource, int i, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j2, TaskCompletionSource taskCompletionSource2) {
        super(c16322bn, taskCompletionSource);
        this.f51465a = standardIntegrityTokenRequest;
        this.f51466b = j;
        this.f51467c = j2;
        this.f51468d = taskCompletionSource2;
        this.f51469e = c16322bn;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC16409t
    /* JADX INFO: renamed from: b */
    public final void mo74937b() {
        if (C16322bn.m74972l(this.f51469e)) {
            mo74936a(new StandardIntegrityException(-2, null));
            return;
        }
        if (C16322bn.m74971k(this.f51469e, 0)) {
            mo74936a(new StandardIntegrityException(-14, null));
            return;
        }
        try {
            C16322bn c16322bn = this.f51469e;
            ((InterfaceC16398i) c16322bn.f51484a.m75011e()).mo75051d(C16322bn.m74964a(c16322bn, this.f51465a, this.f51466b, this.f51467c, 0), new BinderC16319bk(this.f51469e, this.f51468d, this.f51466b));
        } catch (RemoteException e) {
            this.f51469e.f51485b.m75060c(e, "requestExpressIntegrityToken(%s, %s, %s)", this.f51465a.requestHash(), this.f51465a.verdictOptOut(), Long.valueOf(this.f51466b));
            this.f51468d.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
