package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C22054OooOoo extends AbstractC22058Oooo00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C22053OooOoOO f66024OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C22051OooOoO f66025OooO0O0;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooOoo$OooO00o */
    public class OooO00o extends C22049OooOo0O {
        public OooO00o(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C22049OooOo0O
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C22049OooOo0O
        public final int calculateTimeForScrolling(int i) {
            return Math.min(100, super.calculateTimeForScrolling(i));
        }

        @Override // androidx.recyclerview.widget.C22049OooOo0O, androidx.recyclerview.widget.RecyclerView.AbstractC22073OooOoO
        public final void onTargetFound(View view, RecyclerView.C22075OooOoOO c22075OooOoOO, RecyclerView.AbstractC22073OooOoO.OooO00o oooO00o) {
            C22054OooOoo c22054OooOoo = C22054OooOoo.this;
            int[] iArrCalculateDistanceToFinalSnap = c22054OooOoo.calculateDistanceToFinalSnap(c22054OooOoo.mRecyclerView.getLayoutManager(), view);
            int i = iArrCalculateDistanceToFinalSnap[0];
            int i2 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (iCalculateTimeForDeceleration > 0) {
                oooO00o.OooO0O0(i, i2, this.mDecelerateInterpolator, iCalculateTimeForDeceleration);
            }
        }
    }

    public static int OooO00o(View view, AbstractC22055OooOoo0 abstractC22055OooOoo0) {
        return ((abstractC22055OooOoo0.OooO0OO(view) / 2) + abstractC22055OooOoo0.OooO0o0(view)) - ((abstractC22055OooOoo0.OooOO0o() / 2) + abstractC22055OooOoo0.OooOO0O());
    }

    public static View OooO0O0(RecyclerView.OooOOOO oooOOOO, AbstractC22055OooOoo0 abstractC22055OooOoo0) {
        int childCount = oooOOOO.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iOooOO0o = (abstractC22055OooOoo0.OooOO0o() / 2) + abstractC22055OooOoo0.OooOO0O();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = oooOOOO.getChildAt(i2);
            int iAbs = Math.abs(((abstractC22055OooOoo0.OooO0OO(childAt) / 2) + abstractC22055OooOoo0.OooO0o0(childAt)) - iOooOO0o);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    public final AbstractC22055OooOoo0 OooO0OO(RecyclerView.OooOOOO oooOOOO) {
        C22051OooOoO c22051OooOoO = this.f66025OooO0O0;
        if (c22051OooOoO == null || c22051OooOoO.f66027OooO00o != oooOOOO) {
            this.f66025OooO0O0 = new C22051OooOoO(oooOOOO);
        }
        return this.f66025OooO0O0;
    }

    public final AbstractC22055OooOoo0 OooO0Oo(RecyclerView.OooOOOO oooOOOO) {
        C22053OooOoOO c22053OooOoOO = this.f66024OooO00o;
        if (c22053OooOoOO == null || c22053OooOoOO.f66027OooO00o != oooOOOO) {
            this.f66024OooO00o = new C22053OooOoOO(oooOOOO);
        }
        return this.f66024OooO00o;
    }

    @Override // androidx.recyclerview.widget.AbstractC22058Oooo00O
    public final int[] calculateDistanceToFinalSnap(RecyclerView.OooOOOO oooOOOO, View view) {
        int[] iArr = new int[2];
        if (oooOOOO.canScrollHorizontally()) {
            iArr[0] = OooO00o(view, OooO0OO(oooOOOO));
        } else {
            iArr[0] = 0;
        }
        if (oooOOOO.canScrollVertically()) {
            iArr[1] = OooO00o(view, OooO0Oo(oooOOOO));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC22058Oooo00O
    public final RecyclerView.AbstractC22073OooOoO createScroller(RecyclerView.OooOOOO oooOOOO) {
        if (oooOOOO instanceof RecyclerView.AbstractC22073OooOoO.OooO0O0) {
            return new OooO00o(this.mRecyclerView.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC22058Oooo00O
    public View findSnapView(RecyclerView.OooOOOO oooOOOO) {
        if (oooOOOO.canScrollVertically()) {
            return OooO0O0(oooOOOO, OooO0Oo(oooOOOO));
        }
        if (oooOOOO.canScrollHorizontally()) {
            return OooO0O0(oooOOOO, OooO0OO(oooOOOO));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.AbstractC22058Oooo00O
    public final int findTargetSnapPosition(RecyclerView.OooOOOO oooOOOO, int i, int i2) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = oooOOOO.getItemCount();
        if (itemCount != 0) {
            View view = null;
            AbstractC22055OooOoo0 abstractC22055OooOoo0OooO0Oo = oooOOOO.canScrollVertically() ? OooO0Oo(oooOOOO) : oooOOOO.canScrollHorizontally() ? OooO0OO(oooOOOO) : null;
            if (abstractC22055OooOoo0OooO0Oo != null) {
                int childCount = oooOOOO.getChildCount();
                boolean z = false;
                int i3 = Integer.MAX_VALUE;
                int i4 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = oooOOOO.getChildAt(i5);
                    if (childAt != null) {
                        int iOooO00o = OooO00o(childAt, abstractC22055OooOoo0OooO0Oo);
                        if (iOooO00o <= 0 && iOooO00o > i4) {
                            view2 = childAt;
                            i4 = iOooO00o;
                        }
                        if (iOooO00o >= 0 && iOooO00o < i3) {
                            view = childAt;
                            i3 = iOooO00o;
                        }
                    }
                }
                boolean z2 = !oooOOOO.canScrollHorizontally() ? i2 <= 0 : i <= 0;
                if (z2 && view != null) {
                    return oooOOOO.getPosition(view);
                }
                if (!z2 && view2 != null) {
                    return oooOOOO.getPosition(view2);
                }
                if (z2) {
                    view = view2;
                }
                if (view != null) {
                    int position = oooOOOO.getPosition(view);
                    int itemCount2 = oooOOOO.getItemCount();
                    if ((oooOOOO instanceof RecyclerView.AbstractC22073OooOoO.OooO0O0) && (pointFComputeScrollVectorForPosition = ((RecyclerView.AbstractC22073OooOoO.OooO0O0) oooOOOO).computeScrollVectorForPosition(itemCount2 - 1)) != null && (pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f)) {
                        z = true;
                    }
                    int i6 = position + (z == z2 ? -1 : 1);
                    if (i6 >= 0 && i6 < itemCount) {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }
}
