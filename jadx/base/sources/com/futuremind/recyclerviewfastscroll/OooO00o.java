package com.futuremind.recyclerviewfastscroll;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import o00ooo00.AbstractC25813OooO0OO;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO00o extends RecyclerView.OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final FastScroller f67551OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f67552OooO0O0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f67553OooO0OO = 0;

    /* JADX INFO: renamed from: com.futuremind.recyclerviewfastscroll.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC19105OooO00o {
        void OooO00o();
    }

    public OooO00o(FastScroller fastScroller) {
        this.f67551OooO00o = fastScroller;
    }

    public final void OooO00o(RecyclerView recyclerView) {
        int iComputeHorizontalScrollOffset;
        int iComputeHorizontalScrollExtent;
        int iComputeHorizontalScrollRange;
        FastScroller fastScroller = this.f67551OooO00o;
        if (fastScroller.OooO0OO()) {
            iComputeHorizontalScrollOffset = recyclerView.computeVerticalScrollOffset();
            iComputeHorizontalScrollExtent = recyclerView.computeVerticalScrollExtent();
            iComputeHorizontalScrollRange = recyclerView.computeVerticalScrollRange();
        } else {
            iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            iComputeHorizontalScrollExtent = recyclerView.computeHorizontalScrollExtent();
            iComputeHorizontalScrollRange = recyclerView.computeHorizontalScrollRange();
        }
        fastScroller.setScrollerPosition(iComputeHorizontalScrollOffset / (iComputeHorizontalScrollRange - iComputeHorizontalScrollExtent));
        Iterator it = this.f67552OooO0O0.iterator();
        while (it.hasNext()) {
            ((InterfaceC19105OooO00o) it.next()).OooO00o();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo00
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        FastScroller fastScroller = this.f67551OooO00o;
        if (i == 0 && this.f67553OooO0OO != 0) {
            AbstractC25813OooO0OO viewProvider = fastScroller.getViewProvider();
            viewProvider.getClass();
            if (viewProvider.OooO00o() != null) {
                viewProvider.OooO00o().getClass();
            }
        } else if (i != 0 && this.f67553OooO0OO == 0) {
            AbstractC25813OooO0OO viewProvider2 = fastScroller.getViewProvider();
            viewProvider2.getClass();
            if (viewProvider2.OooO00o() != null) {
                viewProvider2.OooO00o().getClass();
            }
        }
        this.f67553OooO0OO = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo00
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        FastScroller fastScroller = this.f67551OooO00o;
        if (fastScroller.f67538OooOoO == null || fastScroller.f67548Oooo00o || fastScroller.f67536OooOo.getChildCount() <= 0) {
            return;
        }
        OooO00o(recyclerView);
    }
}
