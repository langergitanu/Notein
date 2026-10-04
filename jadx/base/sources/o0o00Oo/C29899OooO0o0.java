package o0o00Oo;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o0o00Oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29899OooO0o0 extends RecyclerView.OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f106073OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f106074OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f106075OooO0OO;

    public /* synthetic */ C29899OooO0o0(int i, int i2) {
        this(i, 1, false);
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
        RecyclerView.OooOOOO layoutManager = parent.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        boolean reverseLayout = linearLayoutManager != null ? linearLayoutManager.getReverseLayout() : false;
        int i = this.f106074OooO0O0;
        boolean z = this.f106075OooO0OO;
        int i2 = this.f106073OooO00o;
        if (i == 1) {
            if (z) {
                if (childAdapterPosition == 0) {
                    outRect.top = i2;
                }
                outRect.bottom = i2;
                return;
            } else {
                if (childAdapterPosition != 0) {
                    outRect.top = i2;
                    return;
                }
                return;
            }
        }
        if (reverseLayout) {
            if (z) {
                if (childAdapterPosition == itemCount - 1) {
                    outRect.left = i2;
                }
                outRect.right = i2;
                return;
            } else {
                if (childAdapterPosition != itemCount - 1) {
                    outRect.left = i2;
                    return;
                }
                return;
            }
        }
        if (z) {
            if (childAdapterPosition == 0) {
                outRect.left = i2;
            }
            outRect.right = i2;
        } else if (childAdapterPosition != 0) {
            outRect.left = i2;
        }
    }

    public C29899OooO0o0(int i, int i2, boolean z) {
        this.f106073OooO00o = i;
        this.f106074OooO0O0 = i2;
        this.f106075OooO0OO = z;
    }
}
