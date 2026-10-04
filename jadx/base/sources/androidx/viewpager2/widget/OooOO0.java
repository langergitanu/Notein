package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 implements RecyclerView.InterfaceC22068OooOOo0 {
    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC22068OooOOo0
    public final void OooO0O0(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC22068OooOOo0
    public final void OooO0Oo(View view) {
        RecyclerView.C22066OooOOOo c22066OooOOOo = (RecyclerView.C22066OooOOOo) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) c22066OooOOOo).width != -1 || ((ViewGroup.MarginLayoutParams) c22066OooOOOo).height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
