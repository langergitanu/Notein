package o0OOOO0o;

import com.hihonor.cloudservice.support.account.result.SignInAccountInfo;
import com.orion.notein.domain.models.login.AuthorizeInfo;
import o0OOOo0.C27174OooO0O0;
import oO0o0OOo.InterfaceC33712OooOo0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33712OooOo0O f94418OooO00o;

    public final void OooO00o(Object obj) {
        SignInAccountInfo signInAccountInfo = (SignInAccountInfo) obj;
        C34406OooO00o.f123390OooO00o.OooO00o("authorize, silentSignIn success. accountInfo: " + signInAccountInfo + ", authCode: " + signInAccountInfo.f68831OooOoO, new Object[0]);
        this.f94418OooO00o.OooO0o0(new C27174OooO0O0(true, new AuthorizeInfo(null, signInAccountInfo.f68831OooOoO, null, 5, null), null, null, 12));
    }
}
