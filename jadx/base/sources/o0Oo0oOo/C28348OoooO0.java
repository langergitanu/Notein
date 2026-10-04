package o0Oo0oOo;

import androidx.appcompat.widget.SearchView;
import com.orion.notein.p607ui.creative_library.C23040OooOOoo;
import com.orion.notein.p607ui.creative_library.CreativeLibrarySearchFragment;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0Oo0oOo.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28348OoooO0 implements SearchView.OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CreativeLibrarySearchFragment f100504OooO00o;

    public C28348OoooO0(CreativeLibrarySearchFragment creativeLibrarySearchFragment) {
        this.f100504OooO00o = creativeLibrarySearchFragment;
    }

    @Override // androidx.appcompat.widget.SearchView.OooOOO0
    public final boolean OooO00o(String str) {
        C23040OooOOoo c23040OooOOooOooOoOO = this.f100504OooO00o.OooOoOO();
        if (str == null) {
            str = "";
        }
        C33781o00o0O c33781o00o0O = c23040OooOOooOooOoOO.f71151OooOOO;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, str);
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.OooOOO0
    public final boolean OooO0O0() {
        return true;
    }
}
