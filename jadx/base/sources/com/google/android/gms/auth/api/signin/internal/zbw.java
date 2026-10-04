package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import o000o00O.AbstractC24558OooO00o;
import o000o00o.C24561OooO0O0;

/* JADX INFO: loaded from: classes7.dex */
final class zbw implements AbstractC24558OooO00o.InterfaceC19631OooO00o {
    final /* synthetic */ SignInHubActivity zba;

    public /* synthetic */ zbw(SignInHubActivity signInHubActivity, zbv zbvVar) {
        this.zba = signInHubActivity;
    }

    @Override // o000o00O.AbstractC24558OooO00o.InterfaceC19631OooO00o
    public final C24561OooO0O0 onCreateLoader(int i, Bundle bundle) {
        return new zbc(this.zba, GoogleApiClient.getAllClients());
    }

    @Override // o000o00O.AbstractC24558OooO00o.InterfaceC19631OooO00o
    public final /* bridge */ /* synthetic */ void onLoadFinished(C24561OooO0O0 c24561OooO0O0, Object obj) {
        SignInHubActivity signInHubActivity = this.zba;
        signInHubActivity.setResult(signInHubActivity.zbe, signInHubActivity.zbf);
        this.zba.finish();
    }

    @Override // o000o00O.AbstractC24558OooO00o.InterfaceC19631OooO00o
    public final void onLoaderReset(C24561OooO0O0 c24561OooO0O0) {
    }
}
