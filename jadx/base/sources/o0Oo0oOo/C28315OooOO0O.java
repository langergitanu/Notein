package o0Oo0oOo;

import OooO0o.C20424OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import com.orion.notein.p607ui.creative_library.C23028OooO0Oo;
import com.orion.notein.p607ui.creative_library.CreativeLibraryDetailFragment;
import oO00ooO.C32460OooOooO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0oOo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28315OooOO0O implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ CreativeLibraryDetailFragment f100433OooOo0o;

    public /* synthetic */ C28315OooOO0O(CreativeLibraryDetailFragment creativeLibraryDetailFragment) {
        this.f100433OooOo0o = creativeLibraryDetailFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        CreativeLibraryDetailFragment creativeLibraryDetailFragment = this.f100433OooOo0o;
        C23028OooO0Oo.C19176OooO0Oo c19176OooO0Oo = (C23028OooO0Oo.C19176OooO0Oo) creativeLibraryDetailFragment.OooOoOO().f71011OooOO0O.f121747OooOo0o.getValue();
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("CreativeLibraryDetailFragment");
        c20358OooO00o.OooO00o(androidx.concurrent.futures.OooO00o.OooO0OO(C20424OooO0Oo.OooO0o0("navigateToCreator: creatorId='", c19176OooO0Oo.f71037OooOO0o, "', creatorName='"), c19176OooO0Oo.f71039OooOOO0, "'"), new Object[0]);
        String str = c19176OooO0Oo.f71037OooOO0o;
        if (str.length() > 0) {
            C21030OooOO0o.OooO0OO(creativeLibraryDetailFragment).OooOOOO(new C28323OooOOoo(str));
        } else {
            c20358OooO00o.OooOOO0("CreativeLibraryDetailFragment");
            c20358OooO00o.OooOO0O("navigateToCreator: creatorId is empty, cannot navigate", new Object[0]);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
