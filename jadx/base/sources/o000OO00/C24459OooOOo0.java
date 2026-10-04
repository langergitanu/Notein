package o000OO00;

import androidx.fragment.app.Fragment;
import androidx.ink.brush.BrushFamilyNative;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.notelist.search.SearchListFragment;
import com.orion.notein.p607ui.user.settings.password.UserSetPasswordFragment;
import o000o0O0.C24568OooO0oO;
import o0oO0O00.C30780OooOO0O;
import o0oO0O00.C30781OooOO0o;
import o0oOoO0o.C31002OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o000OO00.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24459OooOOo0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f82682OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f82683OooOo0o;

    public /* synthetic */ C24459OooOOo0(Object obj, int i) {
        this.f82683OooOo0o = i;
        this.f82682OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Object obj = this.f82682OooOo;
        switch (this.f82683OooOo0o) {
            case 0:
                return Boolean.valueOf(BrushFamilyNative.f65347OooO00o.hasFallbacks(((C24457OooOOo) obj).OooO0O0()));
            case 1:
                int i = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = (PenBarChildFragment) obj;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                InterfaceC21987OooOoo interfaceC21987OooOoo = penBarChildFragment.f75247OooOooO;
                if (interfaceC21987OooOoo != null) {
                    return new o0o00o.OooOO0(oooO0O0Oooo0oO, interfaceC21987OooOoo);
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                throw null;
            case 2:
                Fragment fragmentRequireParentFragment = ((SearchListFragment) obj).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            default:
                UserSetPasswordFragment userSetPasswordFragment = (UserSetPasswordFragment) obj;
                C30781OooOO0o c30781OooOO0oOooOoO = userSetPasswordFragment.OooOoO();
                C24568OooO0oO c24568OooO0oO = userSetPasswordFragment.f79943OooOoo0;
                C31002OooO0O0 c31002OooO0O0 = (C31002OooO0O0) c24568OooO0oO.getValue();
                C31002OooO0O0 c31002OooO0O02 = (C31002OooO0O0) c24568OooO0oO.getValue();
                String originalPassword = c31002OooO0O0.f110719OooO0O0;
                kotlin.jvm.internal.OooOOO0.OooO0oO(originalPassword, "originalPassword");
                String code = c31002OooO0O02.f110718OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(code, "code");
                C30780OooOO0O c30780OooOO0O = (C30780OooOO0O) c30781OooOO0oOooOoO.f110060OooO0o0.getValue();
                if (!c30780OooOO0O.f110053OooO0OO && c30781OooOO0oOooOoO.OooO0o0()) {
                    C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c30781OooOO0oOooOoO), null, null, new com.orion.notein.p607ui.login.password.reset.OooO0OO(c30781OooOO0oOooOoO, c30780OooOO0O.f110051OooO00o, originalPassword, code, null), 3);
                }
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
