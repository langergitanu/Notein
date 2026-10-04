package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22058Oooo00O extends RecyclerView.AbstractC22067OooOOo {
    static final float MILLISECONDS_PER_INCH = 100.0f;
    private Scroller mGravityScroller;
    RecyclerView mRecyclerView;
    private final RecyclerView.OooOo00 mScrollListener = new OooO00o();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.Oooo00O$OooO00o */
    public class OooO00o extends RecyclerView.OooOo00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f66039OooO00o = false;

        public OooO00o() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOo00
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f66039OooO00o) {
                this.f66039OooO00o = false;
                AbstractC22058Oooo00O.this.snapToTargetExistingView();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOo00
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f66039OooO00o = true;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.Oooo00O$OooO0O0 */
    public class OooO0O0 extends C22049OooOo0O {
        public OooO0O0(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C22049OooOo0O
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return AbstractC22058Oooo00O.MILLISECONDS_PER_INCH / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C22049OooOo0O, androidx.recyclerview.widget.RecyclerView.AbstractC22073OooOoO
        public final void onTargetFound(View view, RecyclerView.C22075OooOoOO c22075OooOoOO, RecyclerView.AbstractC22073OooOoO.OooO00o oooO00o) {
            AbstractC22058Oooo00O abstractC22058Oooo00O = AbstractC22058Oooo00O.this;
            RecyclerView recyclerView = abstractC22058Oooo00O.mRecyclerView;
            if (recyclerView == null) {
                return;
            }
            int[] iArrCalculateDistanceToFinalSnap = abstractC22058Oooo00O.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
            int i = iArrCalculateDistanceToFinalSnap[0];
            int i2 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (iCalculateTimeForDeceleration > 0) {
                oooO00o.OooO0O0(i, i2, this.mDecelerateInterpolator, iCalculateTimeForDeceleration);
            }
        }
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(null);
    }

    private void setupCallbacks() throws IllegalStateException {
        if (this.mRecyclerView.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.mRecyclerView.addOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(this);
    }

    private boolean snapFromFling(RecyclerView.OooOOOO oooOOOO, int i, int i2) {
        RecyclerView.AbstractC22073OooOoO abstractC22073OooOoOCreateScroller;
        int iFindTargetSnapPosition;
        if (!(oooOOOO instanceof RecyclerView.AbstractC22073OooOoO.OooO0O0) || (abstractC22073OooOoOCreateScroller = createScroller(oooOOOO)) == null || (iFindTargetSnapPosition = findTargetSnapPosition(oooOOOO, i, i2)) == -1) {
            return false;
        }
        abstractC22073OooOoOCreateScroller.setTargetPosition(iFindTargetSnapPosition);
        oooOOOO.startSmoothScroll(abstractC22073OooOoOCreateScroller);
        return true;
    }

    public void attachToRecyclerView(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            destroyCallbacks();
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            setupCallbacks();
            this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
            snapToTargetExistingView();
        }
    }

    public abstract int[] calculateDistanceToFinalSnap(RecyclerView.OooOOOO oooOOOO, View view);

    public int[] calculateScrollDistance(int i, int i2) {
        this.mGravityScroller.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.mGravityScroller.getFinalX(), this.mGravityScroller.getFinalY()};
    }

    public RecyclerView.AbstractC22073OooOoO createScroller(RecyclerView.OooOOOO oooOOOO) {
        return createSnapScroller(oooOOOO);
    }

    @Deprecated
    public C22049OooOo0O createSnapScroller(RecyclerView.OooOOOO oooOOOO) {
        if (oooOOOO instanceof RecyclerView.AbstractC22073OooOoO.OooO0O0) {
            return new OooO0O0(this.mRecyclerView.getContext());
        }
        return null;
    }

    public abstract View findSnapView(RecyclerView.OooOOOO oooOOOO);

    public abstract int findTargetSnapPosition(RecyclerView.OooOOOO oooOOOO, int i, int i2);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22067OooOOo
    public boolean onFling(int i, int i2) {
        RecyclerView.OooOOOO layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.mRecyclerView.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && snapFromFling(layoutManager, i, i2);
    }

    public void snapToTargetExistingView() {
        RecyclerView.OooOOOO layoutManager;
        View viewFindSnapView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewFindSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
        int i = iArrCalculateDistanceToFinalSnap[0];
        if (i == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.mRecyclerView.smoothScrollBy(i, iArrCalculateDistanceToFinalSnap[1]);
    }
}
