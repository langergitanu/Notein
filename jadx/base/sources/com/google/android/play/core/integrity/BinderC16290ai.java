package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractBinderC16404o;
import com.google.android.play.integrity.internal.C16408s;
import com.microsoft.identity.common.internal.providers.oauth2.ResponseType;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.ai */
/* JADX INFO: loaded from: classes7.dex */
final class BinderC16290ai extends AbstractBinderC16404o {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C16291aj f51419a;

    /* JADX INFO: renamed from: b */
    private final C16408s f51420b = new C16408s("OnRequestIntegrityTokenCallback");

    /* JADX INFO: renamed from: c */
    private final TaskCompletionSource f51421c;

    public BinderC16290ai(C16291aj c16291aj, TaskCompletionSource taskCompletionSource) {
        this.f51419a = c16291aj;
        this.f51421c = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC16405p
    /* JADX INFO: renamed from: b */
    public final void mo74939b(Bundle bundle) {
        this.f51419a.f51422a.m75014v(this.f51421c);
        this.f51420b.m75061d("onRequestIntegrityToken", new Object[0]);
        ApiException apiExceptionMo74978a = this.f51419a.f51427f.mo74978a(bundle);
        if (apiExceptionMo74978a != null) {
            this.f51421c.trySetException(apiExceptionMo74978a);
            return;
        }
        String string = bundle.getString(ResponseType.TOKEN);
        if (string == null) {
            this.f51421c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        C16289ah c16289ah = new C16289ah(this, this.f51419a.f51424c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f51421c;
        C16281a c16281a = new C16281a();
        c16281a.mo74931b(string);
        c16281a.mo74930a(c16289ah);
        taskCompletionSource.trySetResult(c16281a.mo74932c());
    }
}
