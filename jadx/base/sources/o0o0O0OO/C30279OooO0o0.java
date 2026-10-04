package o0o0O0OO;

import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.notelist.search.SearchListContainerFragment;
import com.orion.notein.p607ui.notelist.search.SearchListFragment;
import o0o0O00.C30214OooOoOO;
import o0o0O0o0.C30296OooO00o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0o0O0OO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30279OooO0o0 implements C30214OooOoOO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ SearchListContainerFragment f107919OooO00o;

    public C30279OooO0o0(SearchListContainerFragment searchListContainerFragment) {
        this.f107919OooO00o = searchListContainerFragment;
    }

    @Override // o0o0O00.C30214OooOoOO.OooO00o
    public final Fragment OooO00o() {
        return new SearchListFragment();
    }

    @Override // o0o0O00.C30214OooOoOO.OooO00o
    public final void onPageSelected(int i) {
        C30296OooO00o c30296OooO00oOooOoOO = this.f107919OooO00o.OooOoOO();
        Integer numValueOf = Integer.valueOf(i);
        C33781o00o0O c33781o00o0O = c30296OooO00oOooOoOO.f108005OooOo00;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, numValueOf);
    }
}
