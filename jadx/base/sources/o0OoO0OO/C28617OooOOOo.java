package o0OoO0OO;

import androidx.fragment.app.C21901OooOoO0;
import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.login.thirdparty.LoginByThirdPartyChildFragment;
import com.orion.notein.p607ui.login.thirdparty.LoginFragment;

/* JADX INFO: renamed from: o0OoO0OO.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28617OooOOOo extends C21901OooOoO0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final LoginFragment f101442OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LoginFragment f101443OooO0OO;

    public C28617OooOOOo(LoginFragment loginFragment, LoginFragment loginFragment2) {
        this.f101442OooO0O0 = loginFragment;
        this.f101443OooO0OO = loginFragment2;
    }

    @Override // androidx.fragment.app.C21901OooOoO0
    public final Fragment OooO00o(ClassLoader classLoader, String className) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(classLoader, "classLoader");
        kotlin.jvm.internal.OooOOO0.OooO0oO(className, "className");
        if (className.equals(LoginByThirdPartyChildFragment.class.getName())) {
            return new LoginByThirdPartyChildFragment(this.f101442OooO0O0, this.f101443OooO0OO);
        }
        Fragment fragmentOooO00o = super.OooO00o(classLoader, className);
        kotlin.jvm.internal.OooOOO0.OooO0o(fragmentOooO00o, "instantiate(...)");
        return fragmentOooO00o;
    }
}
