package o0OO0o0;

import com.microsoft.identity.client.AuthenticationCallback;
import com.microsoft.identity.client.IAuthenticationResult;
import com.microsoft.identity.client.exception.MsalException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CancellationException;
import oO00ooO.C32446OooOOOo;
import oO0o0OO.C33614OooOOO0;

/* JADX INFO: renamed from: o0OO0o0.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26847OoooOOO implements AuthenticationCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C26837Oooo0OO f92941OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C33614OooOOO0 f92942OooO0O0;

    public C26847OoooOOO(C26837Oooo0OO c26837Oooo0OO, C33614OooOOO0 c33614OooOOO0) {
        this.f92941OooO00o = c26837Oooo0OO;
        this.f92942OooO0O0 = c33614OooOOO0;
    }

    @Override // com.microsoft.identity.client.AuthenticationCallback
    public final void onCancel() {
        this.f92942OooO0O0.resumeWith(C32446OooOOOo.OooO00o(new CancellationException("User cancelled OneDrive sign-in")));
    }

    @Override // com.microsoft.identity.client.SilentAuthenticationCallback
    public final void onError(MsalException exception) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(exception, "exception");
        this.f92942OooO0O0.resumeWith(C32446OooOOOo.OooO00o(exception));
    }

    @Override // com.microsoft.identity.client.SilentAuthenticationCallback
    public final void onSuccess(IAuthenticationResult authenticationResult) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(authenticationResult, "authenticationResult");
        this.f92941OooO00o.getClass();
        C26837Oooo0OO.OooO0oO(authenticationResult, "interactive");
        this.f92942OooO0O0.resumeWith(authenticationResult);
    }
}
