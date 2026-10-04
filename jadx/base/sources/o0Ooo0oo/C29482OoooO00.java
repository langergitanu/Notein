package o0Ooo0oo;

import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;

/* JADX INFO: renamed from: o0Ooo0oo.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29482OoooO00 extends RecyclerView.OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PenBarChildFragment f104575OooO00o;

    public C29482OoooO00(PenBarChildFragment penBarChildFragment) {
        this.f104575OooO00o = penBarChildFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo00
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        PenBarChildFragment penBarChildFragment = this.f104575OooO00o;
        RecyclerView recyclerView2 = penBarChildFragment.f75249Oooo;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rvPenList");
            throw null;
        }
        RecyclerView.OooOOOO layoutManager = recyclerView2.getLayoutManager();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        boolean z = linearLayoutManager.findLastVisibleItemPosition() == linearLayoutManager.getItemCount() - 1 && i > 0;
        ImageView imageView = penBarChildFragment.f75262OoooO00;
        if (imageView != null) {
            imageView.setEnabled(!z);
        }
    }
}
