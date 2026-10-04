package o0OO0o0;

import com.microsoft.identity.client.ISingleAccountPublicClientApplication;
import com.microsoft.identity.client.exception.MsalException;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33614OooOOO0;

/* JADX INFO: renamed from: o0OO0o0.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26849OoooOo0 implements ISingleAccountPublicClientApplication.SignOutCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C33614OooOOO0 f92947OooO00o;

    public C26849OoooOo0(C33614OooOOO0 c33614OooOOO0) {
        this.f92947OooO00o = c33614OooOOO0;
    }

    @Override // com.microsoft.identity.client.ISingleAccountPublicClientApplication.SignOutCallback
    public final void onError(MsalException exception) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(exception, "exception");
        this.f92947OooO00o.resumeWith(C32446OooOOOo.OooO00o(exception));
    }

    @Override // com.microsoft.identity.client.ISingleAccountPublicClientApplication.SignOutCallback
    public final void onSignOut() {
        this.f92947OooO00o.resumeWith(C32460OooOooO.f116667OooO00o);
    }
}
