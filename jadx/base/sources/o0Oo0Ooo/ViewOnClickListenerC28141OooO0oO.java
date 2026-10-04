package o0Oo0Ooo;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import androidx.core.os.BundleKt;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.purchase.OooO0o;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.settings.debug.DebugFragment;
import com.orion.notein.p607ui.settings.page.PageSettingsFragment;
import com.orion.notein.p607ui.user.VipRestrictedFeatureDialogFragment;
import o0000oOO.AbstractC24338OooO0o0;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0Oo0ooO.ViewOnClickListenerC28413OooO0oO;
import o0Oo0ooO.ViewOnClickListenerC28427OooOo00;
import o0OoO0Oo.C28628OooO00o;
import o0OoOO00.ViewOnClickListenerC29007OooOo0;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.C30012Oooo0o;
import o0o0O00.C30185OooO00o;
import o0o0O00.C30189OooO0o;
import o0o0OO0o.C30455OooO0Oo;
import o0o0OoOO.ViewOnClickListenerC30687OooO0o0;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: o0Oo0Ooo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28141OooO0oO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f99751OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99752OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28141OooO0oO(Object obj, int i) {
        this.f99752OooOo0o = i;
        this.f99751OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PenBox.InterfaceC23606OooO0o0 interfaceC23606OooO0o0;
        Object obj = this.f99751OooOo;
        switch (this.f99752OooOo0o) {
            case 0:
                com.orion.notein.p607ui.creative_library.purchase.OooO00o oooO00o = (com.orion.notein.p607ui.creative_library.purchase.OooO00o) obj;
                if (!oooO00o.f71332OooO0O0.OooO0OO()) {
                    oooO00o.f71332OooO0O0.OooO0O0();
                    break;
                } else if (!kotlin.jvm.internal.OooOOO0.OooO0O0(((OooO0o.OooO0OO) oooO00o.f71333OooO0OO.f71373OooO0o.f121747OooOo0o.getValue()).f71394OooO0Oo, OooO0o.OooO00o.C23069OooO0Oo.f71381OooO00o)) {
                    oooO00o.f71356OooOoOO = 0;
                    oooO00o.OooO0Oo(0);
                    oooO00o.OooO0OO();
                    break;
                }
                break;
            case 1:
                ViewOnClickListenerC28427OooOo00 viewOnClickListenerC28427OooOo00 = ((C28628OooO00o) obj).f101475OooO0O0;
                if (viewOnClickListenerC28427OooOo00 != null) {
                    viewOnClickListenerC28427OooOo00.onClick(view);
                }
                break;
            case 2:
                C29936OooO0oO c29936OooO0oO = ((C30012Oooo0o) obj).f106668Oooo0OO;
                if (c29936OooO0oO != null && (interfaceC23606OooO0o0 = c29936OooO0oO.f106288OooO0oO) != null) {
                    interfaceC23606OooO0o0.OooO0O0();
                    break;
                }
                break;
            case 3:
                C30189OooO0o c30189OooO0o = ((C30185OooO00o) obj).f107468OooO0O0;
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OO = c30189OooO0o.f107496OooO0O0;
                C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(c30189OooO0o.f107495OooO00o), R.id.searchListFragment, BundleKt.bundleOf(new C32443OooOOO("topFolder", (String) oooO0OO.f77151Oooo00O.getValue()), new C32443OooOOO("currentFolder", (NoteVO) ((C32443OooOOO) oooO0OO.f77161OoooO00.getValue()).f116638OooOo0o)));
                break;
            case 4:
                ViewOnClickListenerC28413OooO0oO viewOnClickListenerC28413OooO0oO = ((C30455OooO0Oo) obj).f108752OooO0OO;
                if (viewOnClickListenerC28413OooO0oO != null) {
                    viewOnClickListenerC28413OooO0oO.onClick(view);
                }
                break;
            case 5:
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o2 = DebugFragment.f79020Oooo0OO;
                DebugFragment debugFragment = (DebugFragment) obj;
                String string = debugFragment.getString(R.string.debug_hint);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                String string2 = debugFragment.getString(R.string.debug_backup_before_cleanup);
                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                DebugFragment.OooOoOO(debugFragment, string, string2, new ViewOnClickListenerC30687OooO0o0(), new ViewOnClickListenerC29007OooOo0(debugFragment, 3), null, 48);
                break;
            case 6:
                ((VipRestrictedFeatureDialogFragment) obj).dismiss();
                break;
            default:
                C21030OooOO0o.OooO0OO((PageSettingsFragment) obj).OooOOOO(new C24564OooO00o(R.id.action_pageSettingsFragment_to_pageFlipModeFragment));
                break;
        }
    }
}
