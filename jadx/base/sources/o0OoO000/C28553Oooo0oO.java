package o0OoO000;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GetTokenResult;
import o0OoO000.C28560OoooOOO.OooO00o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO000.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28553Oooo0oO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ FirebaseUser f101202OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C28560OoooOOO f101203OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f101204OooOoO0;

    public /* synthetic */ C28553Oooo0oO(C28560OoooOOO c28560OoooOOO, FirebaseUser firebaseUser, String str) {
        this.f101203OooOo0o = c28560OoooOOO;
        this.f101202OooOo = firebaseUser;
        this.f101204OooOoO0 = str;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        String token = ((GetTokenResult) obj).getToken();
        FirebaseUser firebaseUser = this.f101202OooOo;
        C28560OoooOOO c28560OoooOOO = this.f101203OooOo0o;
        if (token != null) {
            String uid = firebaseUser.getUid();
            kotlin.jvm.internal.OooOOO0.OooO0o(uid, "getUid(...)");
            String displayName = firebaseUser.getDisplayName();
            c28560OoooOOO.getClass();
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c28560OoooOOO);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28561OoooOOo(c28560OoooOOO, token, uid, displayName, this.f101204OooOoO0, null), 2);
        } else {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("FirebaseLoginViewModel");
            c20358OooO00o.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("signUp: idToken is null. user=", firebaseUser.getUid()), new Object[0]);
            C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(c28560OoooOOO), null, null, c28560OoooOOO.new OooO00o(null), 3);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
