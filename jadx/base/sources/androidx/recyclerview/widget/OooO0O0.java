package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RecyclerView.AbstractC22062OooO0oO f65801OooO00o;

    public OooO0O0(RecyclerView.AbstractC22062OooO0oO abstractC22062OooO0oO) {
        this.f65801OooO00o = abstractC22062OooO0oO;
    }

    @Override // androidx.recyclerview.widget.OooOo
    public final void OooO00o(int i, int i2, Object obj) {
        this.f65801OooO00o.notifyItemRangeChanged(i, i2, obj);
    }

    @Override // androidx.recyclerview.widget.OooOo
    public final void OooO0O0(int i, int i2) {
        this.f65801OooO00o.notifyItemRangeInserted(i, i2);
    }

    @Override // androidx.recyclerview.widget.OooOo
    public final void OooO0OO(int i, int i2) {
        this.f65801OooO00o.notifyItemRangeRemoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.OooOo
    public final void OooO0Oo(int i, int i2) {
        this.f65801OooO00o.notifyItemMoved(i, i2);
    }
}
