package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22051OooOoO extends AbstractC22055OooOoo0 {
    @Override // androidx.recyclerview.widget.AbstractC22055OooOoo0
    public final int OooO() {
        return this.f66027OooO00o.getWidthMode();
    }

    @Override // androidx.recyclerview.widget.AbstractC22055OooOoo0
    public final int OooO0O0(View view) {
        return this.f66027OooO00o.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C22066OooOOOo) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.AbstractC22055OooOoo0
    public final int OooO0OO(View view) {
        RecyclerView.C22066OooOOOo c22066OooOOOo = (RecyclerView.C22066OooOOOo) view.getLayoutParams();
        return this.f66027OooO00o.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) c22066OooOOOo).leftMargin + ((ViewGroup.MarginLayoutParams) c22066OooOOOo).rightMargin;
    }

    @Override // androidx.recyclerview.widget.AbstractC22055OooOoo0
    public final int OooO0Oo(View view) {
        RecyclerView.C22066OooOOOo c22066OooOOOo = (RecyclerView.C22066OooOOOo) view.getLayoutParams();
        return this.f66027OooO00o.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) c22066OooOOOo).topMargin + ((ViewGroup.MarginLayoutParams) c22066OooOOOo).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.AbstractC22055OooOoo0
    public final int OooO0o() {
        return this.f66027OooO00o.getWidth();
    }

    @Override // androidx.recyclerview.widget.AbstractC22055OooOoo0
    public final int OooO0o0(View view) {
        return this.f66027OooO00o.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C22066OooOOOo) view.getLayoutParams())).leftMargin;
    }

    @Override // androidx.recyclerview.widget.AbstractC22055OooOoo0
    public final int OooO0oO() {
        RecyclerView.OooOOOO oooOOOO = this.f66027OooO00o;
        return oooOOOO.getWidth() - oooOOOO.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.AbstractC22055OooOoo0
    public final int OooO0oo() {
        return this.f66027OooO00o.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.AbstractC22055OooOoo0
    public final int OooOO0() {
        return this.f66027OooO00o.getHeightMode();
    }

    @Override // androidx.recyclerview.widget.AbstractC22055OooOoo0
    public final int OooOO0O() {
        return this.f66027OooO00o.getPaddingLeft();
    }

    @Override // androidx.recyclerview.widget.AbstractC22055OooOoo0
    public final int OooOO0o() {
        RecyclerView.OooOOOO oooOOOO = this.f66027OooO00o;
        return (oooOOOO.getWidth() - oooOOOO.getPaddingLeft()) - oooOOOO.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.AbstractC22055OooOoo0
    public final int OooOOO(View view) {
        RecyclerView.OooOOOO oooOOOO = this.f66027OooO00o;
        Rect rect = this.f66029OooO0OO;
        oooOOOO.getTransformedBoundingBox(view, true, rect);
        return rect.right;
    }

    @Override // androidx.recyclerview.widget.AbstractC22055OooOoo0
    public final int OooOOOO(View view) {
        RecyclerView.OooOOOO oooOOOO = this.f66027OooO00o;
        Rect rect = this.f66029OooO0OO;
        oooOOOO.getTransformedBoundingBox(view, true, rect);
        return rect.left;
    }

    @Override // androidx.recyclerview.widget.AbstractC22055OooOoo0
    public final void OooOOOo(int i) {
        this.f66027OooO00o.offsetChildrenHorizontal(i);
    }
}
