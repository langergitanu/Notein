package o0Ooo000;

import androidx.appcompat.widget.SearchView;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.NoteTreeSelectionFragment;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0Ooo000.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29341OooOOO0 implements SearchView.OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ NoteTreeSelectionFragment f104066OooO00o;

    public C29341OooOOO0(NoteTreeSelectionFragment noteTreeSelectionFragment) {
        this.f104066OooO00o = noteTreeSelectionFragment;
    }

    @Override // androidx.appcompat.widget.SearchView.OooOOO0
    public final boolean OooO00o(String str) {
        String strValueOf = String.valueOf(str);
        C29343OooOOOo.OooO00o("SearchBox.onQueryTextChange, txt: " + strValueOf + ".");
        C29355OooOoo c29355OooOoo = (C29355OooOoo) this.f104066OooO00o.f74652OooOooO.getValue();
        C33781o00o0O c33781o00o0O = c29355OooOoo.f104113OooO0oo;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, strValueOf);
        C33781o00o0O c33781o00o0O2 = c29355OooOoo.f104112OooO0oO;
        c33781o00o0O2.getClass();
        c33781o00o0O2.OooOO0(null, "");
        return false;
    }

    @Override // androidx.appcompat.widget.SearchView.OooOOO0
    public final boolean OooO0O0() {
        return false;
    }
}
