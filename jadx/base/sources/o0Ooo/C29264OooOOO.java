package o0Ooo;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.EditorSummaryFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import o0OoOOoO.C29192OooO0o0;
import o0o000oo.C29810OooOO0O;

/* JADX INFO: renamed from: o0Ooo.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29264OooOOO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f103771OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103772OooOo0o;

    public /* synthetic */ C29264OooOOO(Fragment fragment, int i) {
        this.f103772OooOo0o = i;
        this.f103771OooOo = fragment;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Fragment fragment = this.f103771OooOo;
        switch (this.f103772OooOo0o) {
            case 0:
                int i = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = (PenBoxChildFragment) fragment;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                InterfaceC21987OooOoo interfaceC21987OooOoo = penBoxChildFragment.f75364Oooo000;
                if (interfaceC21987OooOoo != null) {
                    return new o0o00o0O.OooOO0(oooO0O0Oooo0o, interfaceC21987OooOoo, new PenBoxChildFragment.C23491OooOO0o(2, penBoxChildFragment, PenBoxChildFragment.class, "showNonVipFeatureLimitedDialog", "showNonVipFeatureLimitedDialog(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                throw null;
            case 1:
                Fragment fragmentRequireParentFragment = ((EditorSummaryFragment) fragment).requireParentFragment().requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            default:
                BaseToolbarChildFragment baseToolbarChildFragment = (BaseToolbarChildFragment) fragment;
                baseToolbarChildFragment.getClass();
                o0O000o.OooO0O0 oooO0O0 = new o0O000o.OooO0O0(baseToolbarChildFragment);
                C29810OooOO0O c29810OooOO0O = new C29810OooOO0O(baseToolbarChildFragment);
                Context contextRequireContext = baseToolbarChildFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                return new C29192OooO0o0(contextRequireContext, oooO0O0, c29810OooOO0O);
        }
    }
}
