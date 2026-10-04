package com.google.android.play.core.integrity;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractRunnableC16409t;
import com.google.android.play.integrity.internal.C16366af;
import com.google.android.play.integrity.internal.InterfaceC16403n;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.af */
/* JADX INFO: loaded from: classes7.dex */
final class C16287af extends AbstractRunnableC16409t {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ byte[] f51407a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Long f51408b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Parcelable f51409c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ TaskCompletionSource f51410d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ IntegrityTokenRequest f51411e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ C16291aj f51412f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16287af(C16291aj c16291aj, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f51407a = bArr;
        this.f51408b = l;
        this.f51409c = parcelable;
        this.f51410d = taskCompletionSource2;
        this.f51411e = integrityTokenRequest;
        this.f51412f = c16291aj;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC16409t
    /* JADX INFO: renamed from: a */
    public final void mo74936a(Exception exc) {
        if (exc instanceof C16366af) {
            super.mo74936a(new IntegrityServiceException(-9, exc));
        } else {
            super.mo74936a(exc);
        }
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC16409t
    /* JADX INFO: renamed from: b */
    public final void mo74937b() {
        try {
            ((InterfaceC16403n) this.f51412f.f51422a.m75011e()).mo75055d(C16291aj.m74940a(this.f51412f, this.f51407a, this.f51408b, this.f51409c), new BinderC16290ai(this.f51412f, this.f51410d));
        } catch (RemoteException e) {
            this.f51412f.f51423b.m75060c(e, "requestIntegrityToken(%s)", this.f51411e);
            this.f51410d.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
