package o0o0O00O;

import Oooo0oO.C21023OooO0Oo;
import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.notelist.label.LabelContainerFragment;
import com.orion.notein.p607ui.notelist.label.LabelListFragment;
import o0o0O00.C30214OooOoOO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0O00O.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30238OooO0oO implements C30214OooOoOO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ LabelContainerFragment f107747OooO00o;

    public C30238OooO0oO(LabelContainerFragment labelContainerFragment) {
        this.f107747OooO00o = labelContainerFragment;
    }

    @Override // o0o0O00.C30214OooOoOO.OooO00o
    public final Fragment OooO00o() {
        return new LabelListFragment();
    }

    @Override // o0o0O00.C30214OooOoOO.OooO00o
    public final void onPageSelected(int i) {
        LabelContainerFragment labelContainerFragment = this.f107747OooO00o;
        labelContainerFragment.OooOoo().OooOoOO(i);
        C30214OooOoOO c30214OooOoOO = labelContainerFragment.f77711Oooo00o;
        Integer numValueOf = c30214OooOoOO != null ? Integer.valueOf(c30214OooOoOO.f107606OooO0OO.getCurrentItem()) : null;
        if (numValueOf != null && numValueOf.intValue() == i) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0o0(C21023OooO0Oo.OooO0OO(", ignore it", i, com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o, "LabelContainerFragment", "onPageSelected() called with: position = ", i, ", but current item is ")), new Object[0]);
        } else if (((Number) labelContainerFragment.OooOoo().f77147OooOooo.getValue()).intValue() == 1) {
            labelContainerFragment.OooOoo().Oooo0O0();
        }
    }
}
