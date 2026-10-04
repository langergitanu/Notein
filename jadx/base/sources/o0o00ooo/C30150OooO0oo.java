package o0o00ooo;

import Oooo0oO.C21023OooO0Oo;
import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.notelist.favorite.FavoriteContainerFragment;
import com.orion.notein.p607ui.notelist.favorite.FavoriteListFragment;
import o0o0O00.C30214OooOoOO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o00ooo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30150OooO0oo implements C30214OooOoOO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ FavoriteContainerFragment f107317OooO00o;

    public C30150OooO0oo(FavoriteContainerFragment favoriteContainerFragment) {
        this.f107317OooO00o = favoriteContainerFragment;
    }

    @Override // o0o0O00.C30214OooOoOO.OooO00o
    public final Fragment OooO00o() {
        return new FavoriteListFragment();
    }

    @Override // o0o0O00.C30214OooOoOO.OooO00o
    public final void onPageSelected(int i) {
        FavoriteContainerFragment favoriteContainerFragment = this.f107317OooO00o;
        favoriteContainerFragment.OooOoo0().OooOoOO(i);
        C30214OooOoOO c30214OooOoOO = favoriteContainerFragment.f77475Oooo00O;
        Integer numValueOf = c30214OooOoOO != null ? Integer.valueOf(c30214OooOoOO.f107606OooO0OO.getCurrentItem()) : null;
        if (numValueOf != null && numValueOf.intValue() == i) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0o0(C21023OooO0Oo.OooO0OO(", ignore it", i, com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o, "Favorite", "onPageSelected() called with: position = ", i, ", but current item is ")), new Object[0]);
        } else if (((Number) favoriteContainerFragment.OooOoo0().f77147OooOooo.getValue()).intValue() == 1) {
            favoriteContainerFragment.OooOoo0().Oooo0O0();
        }
    }
}
