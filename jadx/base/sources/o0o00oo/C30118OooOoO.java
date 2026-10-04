package o0o00oo;

import Oooo0oO.C21023OooO0Oo;
import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.notelist.NoteListFragment;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import o0o0O00.C30214OooOoOO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o00oo.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30118OooOoO implements C30214OooOoOO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ NoteListContainerFragment f107234OooO00o;

    public C30118OooOoO(NoteListContainerFragment noteListContainerFragment) {
        this.f107234OooO00o = noteListContainerFragment;
    }

    @Override // o0o0O00.C30214OooOoOO.OooO00o
    public final Fragment OooO00o() {
        return new NoteListFragment();
    }

    @Override // o0o0O00.C30214OooOoOO.OooO00o
    public final void onPageSelected(int i) {
        NoteListContainerFragment noteListContainerFragment = this.f107234OooO00o;
        noteListContainerFragment.OooOoo().OooOoOO(i);
        C30214OooOoOO c30214OooOoOO = noteListContainerFragment.f77359OoooOoo;
        Integer numValueOf = c30214OooOoOO != null ? Integer.valueOf(c30214OooOoOO.f107606OooO0OO.getCurrentItem()) : null;
        if (numValueOf != null && numValueOf.intValue() == i) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0o0(C21023OooO0Oo.OooO0OO(", ignore it", i, com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o, "Favorite", "onPageSelected() called with: position = ", i, ", but current item is ")), new Object[0]);
        } else if (((Number) noteListContainerFragment.OooOoo().f77147OooOooo.getValue()).intValue() == 1) {
            noteListContainerFragment.OooOoo().Oooo0O0();
        }
    }
}
