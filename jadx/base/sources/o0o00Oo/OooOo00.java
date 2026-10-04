package o0o00Oo;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOo00 extends RecyclerView.OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f106113OooO00o;

    public OooOo00(int i) {
        this.f106113OooO00o = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C22075OooOoOO state) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(outRect, "outRect");
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        kotlin.jvm.internal.OooOOO0.OooO0oO(parent, "parent");
        kotlin.jvm.internal.OooOOO0.OooO0oO(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        RecyclerView.AbstractC22062OooO0oO adapter = parent.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (itemCount == 0) {
            outRect.left = 0;
            outRect.right = 0;
            return;
        }
        int i = this.f106113OooO00o / 2;
        if (childAdapterPosition == 0) {
            outRect.left = 0;
            outRect.right = i;
            return;
        }
        int i2 = itemCount - 1;
        if (childAdapterPosition < i2) {
            outRect.left = i;
            outRect.right = i;
        } else if (childAdapterPosition == i2) {
            outRect.left = i;
            outRect.right = 0;
        }
    }
}
