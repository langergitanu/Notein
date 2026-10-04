package o0O0oooO;

import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0O0oooO.o000000o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26312o000000o implements InterfaceC32507OooOO0o {
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("UserViewModel");
        FirebaseUser user = ((AuthResult) obj).getUser();
        c20358OooO00o.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("signInAnonymously:success. ", user != null ? user.getUid() : null), new Object[0]);
        return C32460OooOooO.f116667OooO00o;
    }
}
