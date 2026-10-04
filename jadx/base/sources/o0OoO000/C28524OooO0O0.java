package o0OoO000;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.login.firebase.FirebaseCreateUserPasswordFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.EditorOutlineFragment;
import o0oOoOoO.C31097OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: renamed from: o0OoO000.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28524OooO0O0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f101125OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101126OooOo0o;

    public /* synthetic */ C28524OooO0O0(Fragment fragment, int i) {
        this.f101126OooOo0o = i;
        this.f101125OooOo = fragment;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f101126OooOo0o) {
            case 0:
                Context contextRequireContext = ((FirebaseCreateUserPasswordFragment) this.f101125OooOo).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31097OooO0Oo(contextRequireContext, null), 3);
                return C32460OooOooO.f116667OooO00o;
            default:
                Fragment fragmentRequireParentFragment = ((EditorOutlineFragment) this.f101125OooOo).requireParentFragment().requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
        }
    }
}
