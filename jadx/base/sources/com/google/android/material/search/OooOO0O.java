package com.google.android.material.search;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.membership.plan.MembershipPlanDialogFragment;
import com.orion.notein.p607ui.noteeditor.addpage.AddPageFragment;
import com.orion.notein.p607ui.p609vo.ThemeVO;
import com.orion.notein.p607ui.settings.page.PageSettingsFragment;
import com.orion.notein.p607ui.user.VipRestrictedFeatureDialogFragment;
import java.util.List;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0o0O00.C30185OooO00o;
import o0oo000O.C31183OooO00o;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class OooOO0O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f67721OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f67722OooOo0o;

    public /* synthetic */ OooOO0O(Object obj, int i) {
        this.f67722OooOo0o = i;
        this.f67721OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f67722OooOo0o) {
            case 0:
                ((SearchView) this.f67721OooOo).lambda$setUpBackButton$1(view);
                break;
            case 1:
                com.orion.notein.p607ui.creative_library.purchase.OooO00o oooO00o = (com.orion.notein.p607ui.creative_library.purchase.OooO00o) this.f67721OooOo;
                if (oooO00o.f71357OooOoo0 != 0) {
                    oooO00o.f71357OooOoo0 = 0;
                    oooO00o.f71351OooOo00.setSelected(true);
                    oooO00o.f71350OooOo0.setSelected(false);
                    if (oooO00o.f71356OooOoOO == 0) {
                        oooO00o.OooO0OO();
                    }
                    break;
                }
                break;
            case 2:
                ((MembershipPlanDialogFragment) this.f67721OooOo).dismiss();
                break;
            case 3:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.ThemeVO");
                com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OOOooOoO = ((AddPageFragment) this.f67721OooOo).OooOoO();
                Integer numValueOf = Integer.valueOf(((List) oooO0OOOooOoO.f73869OooOo0O.f121747OooOo0o.getValue()).indexOf((ThemeVO) tag));
                C33781o00o0O c33781o00o0O = oooO0OOOooOoO.f73865OooOOo0;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, numValueOf);
                break;
            case 4:
                ((C30185OooO00o) this.f67721OooOo).f107468OooO0O0.getClass();
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("FavoriteContainerFragment");
                c20358OooO00o.OooOO0O("onSettingsClick() not supported in FavoriteContainerFragment", new Object[0]);
                break;
            case 5:
                VipRestrictedFeatureDialogFragment vipRestrictedFeatureDialogFragment = (VipRestrictedFeatureDialogFragment) this.f67721OooOo;
                C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(vipRestrictedFeatureDialogFragment), C31183OooO00o.f111223OooO0OO, null);
                vipRestrictedFeatureDialogFragment.dismiss();
                break;
            default:
                C21030OooOO0o.OooO0OO((PageSettingsFragment) this.f67721OooOo).OooOOOO(new C24564OooO00o(R.id.action_pageSettingsFragment_to_pageAddPageModeFragment));
                break;
        }
    }
}
