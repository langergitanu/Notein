package com.google.android.material.carousel;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.AbstractC22058Oooo00O;
import androidx.recyclerview.widget.C22049OooOo0O;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public class CarouselSnapHelper extends AbstractC22058Oooo00O {
    private static final float HORIZONTAL_SNAP_SPEED = 100.0f;
    private static final float VERTICAL_SNAP_SPEED = 50.0f;
    private final boolean disableFling;
    private RecyclerView recyclerView;

    public CarouselSnapHelper() {
        this(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] calculateDistanceToSnap(RecyclerView.OooOOOO oooOOOO, View view, boolean z) {
        if (!(oooOOOO instanceof CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        int iDistanceToFirstFocalKeyline = distanceToFirstFocalKeyline(view, (CarouselLayoutManager) oooOOOO, z);
        return oooOOOO.canScrollHorizontally() ? new int[]{iDistanceToFirstFocalKeyline, 0} : oooOOOO.canScrollVertically() ? new int[]{0, iDistanceToFirstFocalKeyline} : new int[]{0, 0};
    }

    private int distanceToFirstFocalKeyline(View view, CarouselLayoutManager carouselLayoutManager, boolean z) {
        return carouselLayoutManager.getOffsetToScrollToPositionForSnap(carouselLayoutManager.getPosition(view), z);
    }

    private View findViewNearestFirstKeyline(RecyclerView.OooOOOO oooOOOO) {
        int childCount = oooOOOO.getChildCount();
        View view = null;
        if (childCount != 0 && (oooOOOO instanceof CarouselLayoutManager)) {
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) oooOOOO;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = oooOOOO.getChildAt(i2);
                int iAbs = Math.abs(carouselLayoutManager.getOffsetToScrollToPositionForSnap(oooOOOO.getPosition(childAt), false));
                if (iAbs < i) {
                    view = childAt;
                    i = iAbs;
                }
            }
        }
        return view;
    }

    private boolean isForwardFling(RecyclerView.OooOOOO oooOOOO, int i, int i2) {
        return oooOOOO.canScrollHorizontally() ? i > 0 : i2 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isReverseLayout(RecyclerView.OooOOOO oooOOOO) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = oooOOOO.getItemCount();
        if (!(oooOOOO instanceof RecyclerView.AbstractC22073OooOoO.OooO0O0) || (pointFComputeScrollVectorForPosition = ((RecyclerView.AbstractC22073OooOoO.OooO0O0) oooOOOO).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.AbstractC22058Oooo00O
    public void attachToRecyclerView(RecyclerView recyclerView) {
        super.attachToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
    }

    @Override // androidx.recyclerview.widget.AbstractC22058Oooo00O
    public int[] calculateDistanceToFinalSnap(RecyclerView.OooOOOO oooOOOO, View view) {
        return calculateDistanceToSnap(oooOOOO, view, false);
    }

    @Override // androidx.recyclerview.widget.AbstractC22058Oooo00O
    public RecyclerView.AbstractC22073OooOoO createScroller(final RecyclerView.OooOOOO oooOOOO) {
        if (oooOOOO instanceof RecyclerView.AbstractC22073OooOoO.OooO0O0) {
            return new C22049OooOo0O(this.recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselSnapHelper.1
                @Override // androidx.recyclerview.widget.C22049OooOo0O
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    float f;
                    float f2;
                    if (oooOOOO.canScrollVertically()) {
                        f = displayMetrics.densityDpi;
                        f2 = 50.0f;
                    } else {
                        f = displayMetrics.densityDpi;
                        f2 = CarouselSnapHelper.HORIZONTAL_SNAP_SPEED;
                    }
                    return f2 / f;
                }

                @Override // androidx.recyclerview.widget.C22049OooOo0O, androidx.recyclerview.widget.RecyclerView.AbstractC22073OooOoO
                public void onTargetFound(View view, RecyclerView.C22075OooOoOO c22075OooOoOO, RecyclerView.AbstractC22073OooOoO.OooO00o oooO00o) {
                    if (CarouselSnapHelper.this.recyclerView != null) {
                        CarouselSnapHelper carouselSnapHelper = CarouselSnapHelper.this;
                        int[] iArrCalculateDistanceToSnap = carouselSnapHelper.calculateDistanceToSnap(carouselSnapHelper.recyclerView.getLayoutManager(), view, true);
                        int i = iArrCalculateDistanceToSnap[0];
                        int i2 = iArrCalculateDistanceToSnap[1];
                        int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                        if (iCalculateTimeForDeceleration > 0) {
                            oooO00o.OooO0O0(i, i2, this.mDecelerateInterpolator, iCalculateTimeForDeceleration);
                        }
                    }
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC22058Oooo00O
    public View findSnapView(RecyclerView.OooOOOO oooOOOO) {
        return findViewNearestFirstKeyline(oooOOOO);
    }

    @Override // androidx.recyclerview.widget.AbstractC22058Oooo00O
    public int findTargetSnapPosition(RecyclerView.OooOOOO oooOOOO, int i, int i2) {
        int itemCount;
        if (!this.disableFling || (itemCount = oooOOOO.getItemCount()) == 0) {
            return -1;
        }
        int childCount = oooOOOO.getChildCount();
        View view = null;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = oooOOOO.getChildAt(i5);
            if (childAt != null) {
                int iDistanceToFirstFocalKeyline = distanceToFirstFocalKeyline(childAt, (CarouselLayoutManager) oooOOOO, false);
                if (iDistanceToFirstFocalKeyline <= 0 && iDistanceToFirstFocalKeyline > i4) {
                    view2 = childAt;
                    i4 = iDistanceToFirstFocalKeyline;
                }
                if (iDistanceToFirstFocalKeyline >= 0 && iDistanceToFirstFocalKeyline < i3) {
                    view = childAt;
                    i3 = iDistanceToFirstFocalKeyline;
                }
            }
        }
        boolean zIsForwardFling = isForwardFling(oooOOOO, i, i2);
        if (zIsForwardFling && view != null) {
            return oooOOOO.getPosition(view);
        }
        if (!zIsForwardFling && view2 != null) {
            return oooOOOO.getPosition(view2);
        }
        if (zIsForwardFling) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = oooOOOO.getPosition(view) + (isReverseLayout(oooOOOO) == zIsForwardFling ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }

    public CarouselSnapHelper(boolean z) {
        this.disableFling = z;
    }
}
