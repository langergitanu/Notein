package o0OoO000;

import androidx.lifecycle.C21989OooOooO;
import com.google.firebase.auth.AuthResult;
import com.orion.notein.p607ui.login.firebase.FirebaseUserLoginFragment;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0OoO000.o0ooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28600o0ooOoO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ FirebaseUserLoginFragment f101367OooOo0o;

    public /* synthetic */ C28600o0ooOoO(FirebaseUserLoginFragment firebaseUserLoginFragment) {
        this.f101367OooOo0o = firebaseUserLoginFragment;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        AuthResult authResult = (AuthResult) obj;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(authResult);
        FirebaseUserLoginFragment firebaseUserLoginFragment = this.f101367OooOo0o;
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(firebaseUserLoginFragment), null, null, new o00000(authResult, firebaseUserLoginFragment, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
