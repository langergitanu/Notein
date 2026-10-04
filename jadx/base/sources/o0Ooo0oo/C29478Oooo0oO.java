package o0Ooo0oo;

import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;

/* JADX INFO: renamed from: o0Ooo0oo.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29478Oooo0oO extends RecyclerView.OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PenBarChildFragment f104566OooO00o;

    public C29478Oooo0oO(PenBarChildFragment penBarChildFragment) {
        this.f104566OooO00o = penBarChildFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo00
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        PenBarChildFragment penBarChildFragment = this.f104566OooO00o;
        RecyclerView recyclerView2 = penBarChildFragment.f75275Oooooo;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rvVectorList");
            throw null;
        }
        RecyclerView.OooOOOO layoutManager = recyclerView2.getLayoutManager();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        boolean z = linearLayoutManager.findLastVisibleItemPosition() == linearLayoutManager.getItemCount() - 1 && i > 0;
        ImageView imageView = penBarChildFragment.f75277OoooooO;
        if (imageView != null) {
            imageView.setEnabled(!z);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("ivMoreVector");
            throw null;
        }
    }
}
