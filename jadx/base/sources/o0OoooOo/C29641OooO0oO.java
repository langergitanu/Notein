package o0OoooOo;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.p607ui.login.verificationcode.PhoneCodeLoginFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.EditorCommentFragment;
import o0ooOOO0.C31626OooO0o0;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0OoooOo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29641OooO0oO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f105101OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f105102OooOo0o;

    public /* synthetic */ C29641OooO0oO(Fragment fragment, int i) {
        this.f105102OooOo0o = i;
        this.f105101OooOo = fragment;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f105102OooOo0o) {
            case 0:
                Fragment fragmentRequireParentFragment = ((EditorCommentFragment) this.f105101OooOo).requireParentFragment().requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            default:
                com.orion.notein.p607ui.login.verificationcode.OooO0OO oooO0OOOooOoO = ((PhoneCodeLoginFragment) this.f105101OooOo).OooOoO();
                C31626OooO0o0 c31626OooO0o0 = (C31626OooO0o0) oooO0OOOooOoO.f72635OooO0oo.getValue();
                if (!c31626OooO0o0.f113066OooO0oo && !c31626OooO0o0.f113062OooO0Oo) {
                    C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0OOOooOoO), null, null, new com.orion.notein.p607ui.login.verificationcode.OooO0O0(oooO0OOOooOoO, c31626OooO0o0, null), 3);
                }
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
