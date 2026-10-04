package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C16408s;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bl */
/* JADX INFO: loaded from: classes7.dex */
final class BinderC16320bl extends BinderC16317bi {

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C16322bn f51481c;

    /* JADX INFO: renamed from: d */
    private final C16408s f51482d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC16320bl(C16322bn c16322bn, TaskCompletionSource taskCompletionSource) {
        super(c16322bn, taskCompletionSource);
        this.f51481c = c16322bn;
        this.f51482d = new C16408s("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.BinderC16317bi, com.google.android.play.integrity.internal.InterfaceC16400k
    /* JADX INFO: renamed from: e */
    public final void mo74962e(Bundle bundle) throws RemoteException {
        super.mo74962e(bundle);
        this.f51482d.m75061d("onWarmUpExpressIntegrityToken", new Object[0]);
        ApiException apiExceptionMo74978a = this.f51481c.f51489f.mo74978a(bundle);
        if (apiExceptionMo74978a != null) {
            this.f51475a.trySetException(apiExceptionMo74978a);
        } else {
            this.f51475a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
