package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C16408s;
import com.microsoft.identity.common.internal.providers.oauth2.ResponseType;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bk */
/* JADX INFO: loaded from: classes7.dex */
final class BinderC16319bk extends BinderC16317bi {

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C16322bn f51478c;

    /* JADX INFO: renamed from: d */
    private final C16408s f51479d;

    /* JADX INFO: renamed from: e */
    private final long f51480e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC16319bk(C16322bn c16322bn, TaskCompletionSource taskCompletionSource, long j) {
        super(c16322bn, taskCompletionSource);
        this.f51478c = c16322bn;
        this.f51479d = new C16408s("OnRequestIntegrityTokenCallback");
        this.f51480e = j;
    }

    @Override // com.google.android.play.core.integrity.BinderC16317bi, com.google.android.play.integrity.internal.InterfaceC16400k
    /* JADX INFO: renamed from: c */
    public final void mo74960c(Bundle bundle) throws RemoteException {
        super.mo74960c(bundle);
        this.f51479d.m75061d("onRequestExpressIntegrityToken", new Object[0]);
        ApiException apiExceptionMo74978a = this.f51478c.f51489f.mo74978a(bundle);
        if (apiExceptionMo74978a != null) {
            this.f51475a.trySetException(apiExceptionMo74978a);
            return;
        }
        C16318bj c16318bj = new C16318bj(this, this.f51478c.f51486c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f51475a;
        C16308b c16308b = new C16308b();
        c16308b.mo74956b(bundle.getString(ResponseType.TOKEN));
        c16308b.mo74955a(c16318bj);
        taskCompletionSource.trySetResult(c16308b.mo74957c());
    }
}
