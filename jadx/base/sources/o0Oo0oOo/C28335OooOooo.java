package o0Oo0oOo;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.domain.models.material.MaterialCategory;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import com.orion.notein.p607ui.creative_library.CreativeLibraryListFragment;
import java.util.LinkedHashMap;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0Oo0oOo.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28335OooOooo extends RecyclerView.OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CreativeLibraryListFragment f100472OooO00o;

    public C28335OooOooo(CreativeLibraryListFragment creativeLibraryListFragment) {
        this.f100472OooO00o = creativeLibraryListFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo00
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        CreativeLibraryListFragment creativeLibraryListFragment = this.f100472OooO00o;
        GridLayoutManager gridLayoutManager = creativeLibraryListFragment.f70861Oooo000;
        if (gridLayoutManager == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("gridLayoutManager");
            throw null;
        }
        int iFindLastVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
        com.orion.notein.p607ui.creative_library.OooO00o oooO00o = creativeLibraryListFragment.f70859OooOooO;
        if (oooO00o == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("adapter");
            throw null;
        }
        if (iFindLastVisibleItemPosition >= oooO00o.getItemCount() - 2) {
            C23033OooOO0o c23033OooOO0oOooOoo = creativeLibraryListFragment.OooOoo();
            C23033OooOO0o.OooO0OO oooO0OO = (C23033OooOO0o.OooO0OO) c23033OooOO0oOooOoo.f71086OooOOO0.getValue();
            if (oooO0OO.f71109OooO0o0 || oooO0OO.f71108OooO0o) {
                return;
            }
            LinkedHashMap linkedHashMap = c23033OooOO0oOooOoo.f71083OooOO0O;
            MaterialCategory materialCategory = oooO0OO.f71105OooO0O0;
            Integer num = (Integer) linkedHashMap.get(materialCategory);
            int iIntValue = num != null ? num.intValue() : 1;
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c23033OooOO0oOooOoo);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new com.orion.notein.p607ui.creative_library.OooOOOO(c23033OooOO0oOooOoo, materialCategory, iIntValue + 1, null), 2);
        }
    }
}
