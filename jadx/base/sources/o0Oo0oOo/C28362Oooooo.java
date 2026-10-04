package o0Oo0oOo;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.p607ui.creative_library.C23047OooOoOO;
import com.orion.notein.p607ui.creative_library.C23052OooOooo;
import com.orion.notein.p607ui.creative_library.CreatorProfileFragment;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0Oo0oOo.Oooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28362Oooooo extends RecyclerView.OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CreatorProfileFragment f100543OooO00o;

    public C28362Oooooo(CreatorProfileFragment creatorProfileFragment) {
        this.f100543OooO00o = creatorProfileFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo00
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        CreatorProfileFragment creatorProfileFragment = this.f100543OooO00o;
        GridLayoutManager gridLayoutManager = creatorProfileFragment.f70902Oooo000;
        if (gridLayoutManager == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("gridLayoutManager");
            throw null;
        }
        int iFindLastVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
        if (creatorProfileFragment.f70901OooOooo == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("adapter");
            throw null;
        }
        if (iFindLastVisibleItemPosition < r1.getItemCount() - 3 || i2 <= 0) {
            return;
        }
        C23047OooOoOO c23047OooOoOOOooOoOO = creatorProfileFragment.OooOoOO();
        C23047OooOoOO.OooO0OO oooO0OO = (C23047OooOoOO.OooO0OO) c23047OooOoOOOooOoOO.f71199OooOO0o.getValue();
        if (oooO0OO.f71225OooO0oo || oooO0OO.f71217OooO || oooO0OO.f71224OooO0oO) {
            return;
        }
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c23047OooOoOOOooOoOO);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C23052OooOooo(c23047OooOoOOOooOoOO, null), 2);
    }
}
