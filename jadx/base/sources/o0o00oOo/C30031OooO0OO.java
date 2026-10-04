package o0o00oOo;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0o00oOo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30031OooO0OO extends RecyclerView.OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f106754OooO00o;

    public C30031OooO0OO(int i) {
        this.f106754OooO00o = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C22075OooOoOO state) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(outRect, "outRect");
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        kotlin.jvm.internal.OooOOO0.OooO0oO(parent, "parent");
        kotlin.jvm.internal.OooOOO0.OooO0oO(state, "state");
        if (parent.getChildAdapterPosition(view) == state.OooO0O0() - 1) {
            outRect.bottom = this.f106754OooO00o;
        } else {
            outRect.bottom = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
    public final void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.C22075OooOoOO state) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(c, "c");
        kotlin.jvm.internal.OooOOO0.OooO0oO(parent, "parent");
        kotlin.jvm.internal.OooOOO0.OooO0oO(state, "state");
        View childAt = parent.getChildAt(parent.getChildCount() - 1);
        if (childAt == null) {
            return;
        }
        int bottom = childAt.getBottom();
        int i = this.f106754OooO00o + bottom;
        int color = parent.getContext().getResources().getColor(R.color.layout_bg_color);
        Paint paint = new Paint();
        paint.setColor(color);
        paint.setTextSize(48.0f);
        c.drawRect(0.0f, bottom, parent.getWidth(), i, paint);
        c.drawText("Loading more...", 50.0f, bottom + 50, paint);
    }
}
