package o0Oo0Ooo;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.settings.page.PageSettingsFragment;
import com.orion.notein.p607ui.user.VipRestrictedFeatureDialogFragment;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0Oo0ooO.ViewOnClickListenerC28413OooO0oO;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.C30017OoooO0;
import o0o0O00.C30185OooO00o;
import o0o0OO0o.C30455OooO0Oo;

/* JADX INFO: renamed from: o0Oo0Ooo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28142OooO0oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f99753OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99754OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28142OooO0oo(Object obj, int i) {
        this.f99754OooOo0o = i;
        this.f99753OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f99754OooOo0o) {
            case 0:
                com.orion.notein.p607ui.creative_library.purchase.OooO00o oooO00o = (com.orion.notein.p607ui.creative_library.purchase.OooO00o) this.f99753OooOo;
                if (oooO00o.f71357OooOoo0 != 1) {
                    oooO00o.f71357OooOoo0 = 1;
                    oooO00o.f71351OooOo00.setSelected(false);
                    oooO00o.f71350OooOo0.setSelected(true);
                    if (oooO00o.f71356OooOoOO == 0) {
                        oooO00o.OooO0OO();
                    }
                    break;
                }
                break;
            case 1:
                ((com.orion.notein.p607ui.label.OooO0o) this.f99753OooOo).f71993OooO0O0.OooO0O0();
                break;
            case 2:
                boolean zIsActivated = view.isActivated();
                C30017OoooO0 c30017OoooO0 = (C30017OoooO0) this.f99753OooOo;
                if (!zIsActivated) {
                    C29936OooO0oO c29936OooO0oO = c30017OoooO0.f106696Oooo00O;
                    if (c29936OooO0oO != null) {
                        c29936OooO0oO.OooO0OO(c30017OoooO0.f106694Oooo0);
                    }
                } else {
                    C29936OooO0oO c29936OooO0oO2 = c30017OoooO0.f106696Oooo00O;
                    if (c29936OooO0oO2 != null) {
                        c29936OooO0oO2.OooO0oo(c30017OoooO0.f106694Oooo0);
                    }
                }
                break;
            case 3:
                ((C30185OooO00o) this.f99753OooOo).f107468OooO0O0.OooO00o();
                break;
            case 4:
                ViewOnClickListenerC28413OooO0oO viewOnClickListenerC28413OooO0oO = ((C30455OooO0Oo) this.f99753OooOo).f108752OooO0OO;
                if (viewOnClickListenerC28413OooO0oO != null) {
                    viewOnClickListenerC28413OooO0oO.onClick(view);
                }
                break;
            case 5:
                VipRestrictedFeatureDialogFragment vipRestrictedFeatureDialogFragment = (VipRestrictedFeatureDialogFragment) this.f99753OooOo;
                vipRestrictedFeatureDialogFragment.getClass();
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(vipRestrictedFeatureDialogFragment), new C24564OooO00o(R.id.f57985xf86c3e8f));
                break;
            default:
                C21030OooOO0o.OooO0OO((PageSettingsFragment) this.f99753OooOo).OooOOOO(new C24564OooO00o(R.id.action_pageSettingsFragment_to_pageNumberPositionFragment));
                break;
        }
    }
}
