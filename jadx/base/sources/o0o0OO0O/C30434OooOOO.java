package o0o0OO0O;

import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.p607ui.pageeditor.TiledPageListContainerFragment;

/* JADX INFO: renamed from: o0o0OO0O.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30434OooOOO extends RecyclerView.OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TiledPageListContainerFragment f108694OooO00o;

    public C30434OooOOO(TiledPageListContainerFragment tiledPageListContainerFragment) {
        this.f108694OooO00o = tiledPageListContainerFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo00
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        TiledPageListContainerFragment tiledPageListContainerFragment = this.f108694OooO00o;
        RecyclerView recyclerView2 = tiledPageListContainerFragment.f78532Oooo0oo;
        RecyclerView.OooOOOO layoutManager = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        boolean z = linearLayoutManager.findLastVisibleItemPosition() == linearLayoutManager.getItemCount() - 1 && i > 0;
        ImageView imageView = tiledPageListContainerFragment.f78535OoooO00;
        if (imageView != null) {
            imageView.setEnabled(!z);
        }
    }
}
