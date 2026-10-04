package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractRunnableC16409t;
import com.google.android.play.integrity.internal.InterfaceC16403n;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.ag */
/* JADX INFO: loaded from: classes7.dex */
final class C16288ag extends AbstractRunnableC16409t {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Bundle f51413a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Activity f51414b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ TaskCompletionSource f51415c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ int f51416d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C16291aj f51417e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16288ag(C16291aj c16291aj, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i) {
        super(taskCompletionSource);
        this.f51413a = bundle;
        this.f51414b = activity;
        this.f51415c = taskCompletionSource2;
        this.f51416d = i;
        this.f51417e = c16291aj;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC16409t
    /* JADX INFO: renamed from: b */
    public final void mo74937b() {
        try {
            InterfaceC16403n interfaceC16403n = (InterfaceC16403n) this.f51417e.f51422a.m75011e();
            Bundle bundle = this.f51413a;
            C16291aj c16291aj = this.f51417e;
            interfaceC16403n.mo75054c(bundle, c16291aj.f51426e.m74949a(this.f51414b, this.f51415c, c16291aj.f51422a));
        } catch (RemoteException e) {
            this.f51417e.f51423b.m75060c(e, "requestAndShowDialog(%s)", Integer.valueOf(this.f51416d));
            this.f51415c.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
