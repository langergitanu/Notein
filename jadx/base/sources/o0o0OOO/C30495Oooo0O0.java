package o0o0OOO;

import androidx.viewpager2.widget.ViewPager2;
import com.orion.notein.p607ui.paperconfig.PaperConfigDialogFragment;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0o0OOO.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30495Oooo0O0 extends ViewPager2.AbstractC22132OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PaperConfigDialogFragment f108901OooO00o;

    public C30495Oooo0O0(PaperConfigDialogFragment paperConfigDialogFragment) {
        this.f108901OooO00o = paperConfigDialogFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC22132OooO0o0
    public final void onPageSelected(int i) {
        PaperConfigDialogFragment paperConfigDialogFragment = this.f108901OooO00o;
        if (((Number) paperConfigDialogFragment.OooOoo().f109043OoooOOo.f121747OooOo0o.getValue()).intValue() != i) {
            C30520o000000o c30520o000000oOooOoo = paperConfigDialogFragment.OooOoo();
            Integer numValueOf = Integer.valueOf(i);
            C33781o00o0O c33781o00o0O = c30520o000000oOooOoo.f109041OoooOO0;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, numValueOf);
        }
    }
}
