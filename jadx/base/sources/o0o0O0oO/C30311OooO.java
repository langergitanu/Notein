package o0o0O0oO;

import Oooo0oO.C21023OooO0Oo;
import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinContainerFragment;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinListFragment;
import o0o0O00.C30214OooOoOO;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0O0oO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30311OooO implements C30214OooOoOO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TrashBinContainerFragment f108081OooO00o;

    public C30311OooO(TrashBinContainerFragment trashBinContainerFragment) {
        this.f108081OooO00o = trashBinContainerFragment;
    }

    @Override // o0o0O00.C30214OooOoOO.OooO00o
    public final Fragment OooO00o() {
        return new TrashBinListFragment();
    }

    @Override // o0o0O00.C30214OooOoOO.OooO00o
    public final void onPageSelected(int i) {
        TrashBinContainerFragment trashBinContainerFragment = this.f108081OooO00o;
        C30351Oooo0oO c30351Oooo0oOOooOoOO = trashBinContainerFragment.OooOoOO();
        Integer numValueOf = Integer.valueOf(i);
        C33781o00o0O c33781o00o0O = c30351Oooo0oOOooOoOO.f108231OooOO0;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, numValueOf);
        C30214OooOoOO c30214OooOoOO = trashBinContainerFragment.f78084OoooO00;
        Integer numValueOf2 = c30214OooOoOO != null ? Integer.valueOf(c30214OooOoOO.f107606OooO0OO.getCurrentItem()) : null;
        if (numValueOf2 != null && numValueOf2.intValue() == i) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0o0(C21023OooO0Oo.OooO0OO(", ignore it", i, com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o, "TrashBin", "onPageSelected() called with: position = ", i, ", but current item is ")), new Object[0]);
        } else if (((Number) trashBinContainerFragment.OooOoOO().f108238OooOOo.getValue()).intValue() == 1) {
            trashBinContainerFragment.OooOoOO().OooOOo();
        }
    }
}
