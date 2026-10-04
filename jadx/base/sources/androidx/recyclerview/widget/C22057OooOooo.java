package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22057OooOooo {
    public static int OooO00o(RecyclerView.C22075OooOoOO c22075OooOoOO, AbstractC22055OooOoo0 abstractC22055OooOoo0, View view, View view2, RecyclerView.OooOOOO oooOOOO, boolean z) {
        if (oooOOOO.getChildCount() == 0 || c22075OooOoOO.OooO0O0() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oooOOOO.getPosition(view) - oooOOOO.getPosition(view2)) + 1;
        }
        return Math.min(abstractC22055OooOoo0.OooOO0o(), abstractC22055OooOoo0.OooO0O0(view2) - abstractC22055OooOoo0.OooO0o0(view));
    }

    public static int OooO0O0(RecyclerView.C22075OooOoOO c22075OooOoOO, AbstractC22055OooOoo0 abstractC22055OooOoo0, View view, View view2, RecyclerView.OooOOOO oooOOOO, boolean z, boolean z2) {
        if (oooOOOO.getChildCount() == 0 || c22075OooOoOO.OooO0O0() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (c22075OooOoOO.OooO0O0() - Math.max(oooOOOO.getPosition(view), oooOOOO.getPosition(view2))) - 1) : Math.max(0, Math.min(oooOOOO.getPosition(view), oooOOOO.getPosition(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(abstractC22055OooOoo0.OooO0O0(view2) - abstractC22055OooOoo0.OooO0o0(view)) / (Math.abs(oooOOOO.getPosition(view) - oooOOOO.getPosition(view2)) + 1))) + (abstractC22055OooOoo0.OooOO0O() - abstractC22055OooOoo0.OooO0o0(view)));
        }
        return iMax;
    }

    public static int OooO0OO(RecyclerView.C22075OooOoOO c22075OooOoOO, AbstractC22055OooOoo0 abstractC22055OooOoo0, View view, View view2, RecyclerView.OooOOOO oooOOOO, boolean z) {
        if (oooOOOO.getChildCount() == 0 || c22075OooOoOO.OooO0O0() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c22075OooOoOO.OooO0O0();
        }
        return (int) (((abstractC22055OooOoo0.OooO0O0(view2) - abstractC22055OooOoo0.OooO0o0(view)) / (Math.abs(oooOOOO.getPosition(view) - oooOOOO.getPosition(view2)) + 1)) * c22075OooOoOO.OooO0O0());
    }
}
