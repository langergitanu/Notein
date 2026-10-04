package o0Oooo;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.EditorSummaryFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import o0OoOO0o.ViewOnClickListenerC29034OooO00o;
import o0o000oo.C29809OooOO0;
import o0o000oo.C29817OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class OooOo00 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f104981OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104982OooOo0o;

    public /* synthetic */ OooOo00(Fragment fragment, int i) {
        this.f104982OooOo0o = i;
        this.f104981OooOo = fragment;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f104982OooOo0o) {
            case 0:
                Fragment fragmentRequireParentFragment = ((EditorSummaryFragment) this.f104981OooOo).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            default:
                BaseToolbarChildFragment baseToolbarChildFragment = (BaseToolbarChildFragment) this.f104981OooOo;
                baseToolbarChildFragment.getClass();
                C29817OooOOo0 c29817OooOOo0 = new C29817OooOOo0(baseToolbarChildFragment);
                C29809OooOO0 c29809OooOO0 = new C29809OooOO0(baseToolbarChildFragment);
                Context contextRequireContext = baseToolbarChildFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                o0OoO.OooO0o oooO0o = new o0OoO.OooO0o(contextRequireContext, c29817OooOOo0, c29809OooOO0);
                oooO0o.f101042OooOOO = new ViewOnClickListenerC29034OooO00o(baseToolbarChildFragment, 2);
                return oooO0o;
        }
    }
}
