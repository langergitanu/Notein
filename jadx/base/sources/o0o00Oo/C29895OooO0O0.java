package o0o00Oo;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o0o00Oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29895OooO0O0 extends RecyclerView.OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f106063OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f106064OooO0O0;

    public C29895OooO0O0(int i, int i2) {
        this.f106063OooO00o = i;
        this.f106064OooO0O0 = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C22075OooOoOO state) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(outRect, "outRect");
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        kotlin.jvm.internal.OooOOO0.OooO0oO(parent, "parent");
        kotlin.jvm.internal.OooOOO0.OooO0oO(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int i = this.f106063OooO00o;
        int i2 = childAdapterPosition % i;
        int i3 = this.f106064OooO0O0;
        outRect.left = (i2 * i3) / i;
        outRect.right = i3 - (((i2 + 1) * i3) / i);
        if (childAdapterPosition >= i) {
            outRect.top = i3;
        }
    }
}
