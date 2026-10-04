package androidx.recyclerview.widget;

import OooO0Oo.C20398OooO0O0;
import OooOo.C20493Oooo00o;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.os.TraceCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild2;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.EdgeEffectCompat;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.C22030OooO0oO;
import androidx.recyclerview.widget.C22056OooOooO;
import androidx.recyclerview.widget.C22059Oooo00o;
import androidx.recyclerview.widget.OooO00o;
import androidx.recyclerview.widget.Oooo0;
import androidx.recyclerview.widget.RunnableC22046OooOOo0;
import com.aspose.slides.C22218Oooo;
import com.aspose.slides.C22226Oooo0oo;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o000oo00.C24702OooO00o;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, NestedScrollingChild2, NestedScrollingChild3 {
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator;
    C22056OooOooO mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    AbstractC22062OooO0oO mAdapter;
    androidx.recyclerview.widget.OooO00o mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private OooOO0 mChildDrawingOrderCallback;
    C22030OooO0oO mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private OooOO0O mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    RunnableC22046OooOOo0 mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private InterfaceC22069OooOOoo mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    AbstractC22064OooOO0o mItemAnimator;
    private AbstractC22064OooOO0o.OooO0O0 mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<OooOOO> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    OooOOOO mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final OooOo mObserver;
    private List<InterfaceC22068OooOOo0> mOnChildAttachStateListeners;
    private AbstractC22067OooOOo mOnFlingListener;
    private final ArrayList<InterfaceC22069OooOOoo> mOnItemTouchListeners;
    final List<AbstractC22078OooOooO> mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    boolean mPostedAnimatorRunner;
    RunnableC22046OooOOo0.OooO0O0 mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final C22071OooOo0O mRecycler;
    InterfaceC22072OooOo0o mRecyclerListener;
    final List<InterfaceC22072OooOo0o> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private OooOo00 mScrollListener;
    private List<OooOo00> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private NestedScrollingChildHelper mScrollingChildHelper;
    final C22075OooOoOO mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final RunnableC22076OooOoo mViewFlinger;
    private final Oooo0.OooO0O0 mViewInfoProcessCallback;
    final Oooo0 mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    public static abstract class OooO {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i, int i2) {
        }

        public void onItemRangeInserted(int i, int i2) {
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
        }

        public void onItemRangeRemoved(int i, int i2) {
        }

        public void onStateRestorationPolicyChanged() {
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
            onItemRangeChanged(i, i2);
        }
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            if (!recyclerView.mIsAttached) {
                recyclerView.requestLayout();
            } else if (recyclerView.mLayoutSuppressed) {
                recyclerView.mLayoutWasDefered = true;
            } else {
                recyclerView.consumePendingUpdateOperations();
            }
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            AbstractC22064OooOO0o abstractC22064OooOO0o = recyclerView.mItemAnimator;
            if (abstractC22064OooOO0o != null) {
                abstractC22064OooOO0o.OooOO0O();
            }
            recyclerView.mPostedAnimatorRunner = false;
        }
    }

    public class OooO0OO implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$OooO0Oo, reason: case insensitive filesystem */
    public class C22060OooO0Oo implements Oooo0.OooO0O0 {
        public C22060OooO0Oo() {
        }
    }

    public class OooO0o {
        public OooO0o() {
        }

        public final void OooO00o(OooO00o.C19033OooO00o c19033OooO00o) {
            int i = c19033OooO00o.f65797OooO00o;
            RecyclerView recyclerView = RecyclerView.this;
            if (i == 1) {
                recyclerView.mLayout.onItemsAdded(recyclerView, c19033OooO00o.f65798OooO0O0, c19033OooO00o.f65800OooO0Oo);
                return;
            }
            if (i == 2) {
                recyclerView.mLayout.onItemsRemoved(recyclerView, c19033OooO00o.f65798OooO0O0, c19033OooO00o.f65800OooO0Oo);
            } else if (i == 4) {
                recyclerView.mLayout.onItemsUpdated(recyclerView, c19033OooO00o.f65798OooO0O0, c19033OooO00o.f65800OooO0Oo, c19033OooO00o.f65799OooO0OO);
            } else {
                if (i != 8) {
                    return;
                }
                recyclerView.mLayout.onItemsMoved(recyclerView, c19033OooO00o.f65798OooO0O0, c19033OooO00o.f65800OooO0Oo, 1);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$OooO0o0, reason: case insensitive filesystem */
    public class C22061OooO0o0 {
        public C22061OooO0o0() {
        }

        public final void OooO00o(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                recyclerView.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeViewAt(i);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$OooO0oo, reason: case insensitive filesystem */
    public static class C22063OooO0oo extends Observable<OooO> {
        public final boolean OooO00o() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void OooO0O0() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((OooO) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        public final void OooO0OO(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((OooO) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i, i2, 1);
            }
        }

        public final void OooO0Oo(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((OooO) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i, i2, obj);
            }
        }

        public final void OooO0o(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((OooO) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i, i2);
            }
        }

        public final void OooO0o0(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((OooO) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i, i2);
            }
        }

        public final void OooO0oO() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((OooO) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    public interface OooOO0 {
    }

    public static class OooOO0O {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$OooOO0o, reason: case insensitive filesystem */
    public static abstract class AbstractC22064OooOO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooO0O0 f66056OooO00o = null;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList<OooO00o> f66057OooO0O0 = new ArrayList<>();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f66058OooO0OO = 120;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f66059OooO0Oo = 120;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f66061OooO0o0 = 250;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final long f66060OooO0o = 250;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$OooOO0o$OooO00o */
        public interface OooO00o {
            void OooO00o();
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$OooOO0o$OooO0O0 */
        public interface OooO0O0 {
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$OooOO0o$OooO0OO */
        public static class OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public int f66062OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public int f66063OooO0O0;

            public final void OooO00o(AbstractC22078OooOooO abstractC22078OooOooO) {
                View view = abstractC22078OooOooO.itemView;
                this.f66062OooO00o = view.getLeft();
                this.f66063OooO0O0 = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public static void OooO0o0(AbstractC22078OooOooO abstractC22078OooOooO) {
            int i = abstractC22078OooOooO.mFlags;
            if (!abstractC22078OooOooO.isInvalid() && (i & 4) == 0) {
                abstractC22078OooOooO.getOldPosition();
                abstractC22078OooOooO.getAbsoluteAdapterPosition();
            }
        }

        public abstract void OooO();

        public abstract boolean OooO00o(AbstractC22078OooOooO abstractC22078OooOooO, OooO0OO oooO0OO, OooO0OO oooO0OO2);

        public abstract boolean OooO0O0(AbstractC22078OooOooO abstractC22078OooOooO, AbstractC22078OooOooO abstractC22078OooOooO2, OooO0OO oooO0OO, OooO0OO oooO0OO2);

        public abstract boolean OooO0OO(AbstractC22078OooOooO abstractC22078OooOooO, OooO0OO oooO0OO, OooO0OO oooO0OO2);

        public abstract boolean OooO0Oo(AbstractC22078OooOooO abstractC22078OooOooO, OooO0OO oooO0OO, OooO0OO oooO0OO2);

        public abstract boolean OooO0o(AbstractC22078OooOooO abstractC22078OooOooO, List<Object> list);

        public final void OooO0oO(AbstractC22078OooOooO abstractC22078OooOooO) {
            OooO0O0 oooO0O0 = this.f66056OooO00o;
            if (oooO0O0 != null) {
                OooOOO0 oooOOO0 = (OooOOO0) oooO0O0;
                oooOOO0.getClass();
                abstractC22078OooOooO.setIsRecyclable(true);
                if (abstractC22078OooOooO.mShadowedHolder != null && abstractC22078OooOooO.mShadowingHolder == null) {
                    abstractC22078OooOooO.mShadowedHolder = null;
                }
                abstractC22078OooOooO.mShadowingHolder = null;
                if (abstractC22078OooOooO.shouldBeKeptAsChild()) {
                    return;
                }
                View view = abstractC22078OooOooO.itemView;
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.removeAnimatingView(view) || !abstractC22078OooOooO.isTmpDetached()) {
                    return;
                }
                recyclerView.removeDetachedView(abstractC22078OooOooO.itemView, false);
            }
        }

        public abstract void OooO0oo(AbstractC22078OooOooO abstractC22078OooOooO);

        public abstract boolean OooOO0();

        public abstract void OooOO0O();
    }

    public static abstract class OooOOO {
        @Deprecated
        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C22075OooOoOO c22075OooOoOO) {
            getItemOffsets(rect, ((C22066OooOOOo) view.getLayoutParams()).getViewLayoutPosition(), recyclerView);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, C22075OooOoOO c22075OooOoOO) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C22075OooOoOO c22075OooOoOO) {
            onDrawOver(canvas, recyclerView);
        }
    }

    public class OooOOO0 implements AbstractC22064OooOO0o.OooO0O0 {
        public OooOOO0() {
        }
    }

    public static abstract class OooOOOO {
        boolean mAutoMeasure;
        C22030OooO0oO mChildHelper;
        private int mHeight;
        private int mHeightMode;
        C22059Oooo00o mHorizontalBoundCheck;
        private final C22059Oooo00o.OooO0O0 mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;
        AbstractC22073OooOoO mSmoothScroller;
        C22059Oooo00o mVerticalBoundCheck;
        private final C22059Oooo00o.OooO0O0 mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        public class OooO00o implements C22059Oooo00o.OooO0O0 {
            public OooO00o() {
            }

            @Override // androidx.recyclerview.widget.C22059Oooo00o.OooO0O0
            public final int OooO00o() {
                return OooOOOO.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.C22059Oooo00o.OooO0O0
            public final int OooO0O0() {
                OooOOOO oooOOOO = OooOOOO.this;
                return oooOOOO.getWidth() - oooOOOO.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.C22059Oooo00o.OooO0O0
            public final View OooO0OO(int i) {
                return OooOOOO.this.getChildAt(i);
            }

            @Override // androidx.recyclerview.widget.C22059Oooo00o.OooO0O0
            public final int OooO0Oo(View view) {
                return OooOOOO.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((C22066OooOOOo) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.C22059Oooo00o.OooO0O0
            public final int OooO0o0(View view) {
                return OooOOOO.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((C22066OooOOOo) view.getLayoutParams())).rightMargin;
            }
        }

        public class OooO0O0 implements C22059Oooo00o.OooO0O0 {
            public OooO0O0() {
            }

            @Override // androidx.recyclerview.widget.C22059Oooo00o.OooO0O0
            public final int OooO00o() {
                return OooOOOO.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.C22059Oooo00o.OooO0O0
            public final int OooO0O0() {
                OooOOOO oooOOOO = OooOOOO.this;
                return oooOOOO.getHeight() - oooOOOO.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.C22059Oooo00o.OooO0O0
            public final View OooO0OO(int i) {
                return OooOOOO.this.getChildAt(i);
            }

            @Override // androidx.recyclerview.widget.C22059Oooo00o.OooO0O0
            public final int OooO0Oo(View view) {
                return OooOOOO.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((C22066OooOOOo) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.C22059Oooo00o.OooO0O0
            public final int OooO0o0(View view) {
                return OooOOOO.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((C22066OooOOOo) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface OooO0OO {
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$OooOOOO$OooO0Oo, reason: case insensitive filesystem */
        public static class C22065OooO0Oo {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public int f66067OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public int f66068OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public boolean f66069OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public boolean f66070OooO0Oo;
        }

        public OooOOOO() {
            OooO00o oooO00o = new OooO00o();
            this.mHorizontalBoundCheckCallback = oooO00o;
            OooO0O0 oooO0O0 = new OooO0O0();
            this.mVerticalBoundCheckCallback = oooO0O0;
            this.mHorizontalBoundCheck = new C22059Oooo00o(oooO00o);
            this.mVerticalBoundCheck = new C22059Oooo00o(oooO0O0);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        private void addViewInt(View view, int i, boolean z) {
            AbstractC22078OooOooO childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.isRemoved()) {
                C20493Oooo00o<AbstractC22078OooOooO, Oooo0.OooO00o> c20493Oooo00o = this.mRecyclerView.mViewInfoStore.f66032OooO00o;
                Oooo0.OooO00o OooO00o2 = c20493Oooo00o.get(childViewHolderInt);
                if (OooO00o2 == null) {
                    OooO00o2 = Oooo0.OooO00o.OooO00o();
                    c20493Oooo00o.put(childViewHolderInt, OooO00o2);
                }
                OooO00o2.f66035OooO00o |= 1;
            } else {
                this.mRecyclerView.mViewInfoStore.OooO0OO(childViewHolderInt);
            }
            C22066OooOOOo c22066OooOOOo = (C22066OooOOOo) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.OooO0O0(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int iOooOO0 = this.mChildHelper.OooOO0(view);
                if (i == -1) {
                    i = this.mChildHelper.OooO0o0();
                }
                if (iOooOO0 == -1) {
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.mRecyclerView.indexOfChild(view));
                    throw new IllegalStateException(androidx.recyclerview.widget.OooO0o.OooO00o(this.mRecyclerView, sb));
                }
                if (iOooOO0 != i) {
                    this.mRecyclerView.mLayout.moveView(iOooOO0, i);
                }
            } else {
                this.mChildHelper.OooO00o(view, i, false);
                c22066OooOOOo.mInsetsDirty = true;
                AbstractC22073OooOoO abstractC22073OooOoO = this.mSmoothScroller;
                if (abstractC22073OooOoO != null && abstractC22073OooOoO.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
            if (c22066OooOOOo.mPendingInvalidate) {
                childViewHolderInt.itemView.invalidate();
                c22066OooOOOo.mPendingInvalidate = false;
            }
        }

        public static int chooseSize(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        private void detachViewInternal(int i, View view) {
            this.mChildHelper.OooO0OO(i);
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x000c A[PHI: r3
          0x000c: PHI (r3v5 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:7:0x0010, B:11:0x0016, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
        @Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int getChildMeasureSpec(int i, int i2, int i3, boolean z) {
            int i4 = i - i2;
            int i5 = 0;
            int iMax = Math.max(0, i4);
            if (z) {
                if (i3 >= 0) {
                    i5 = 1073741824;
                } else {
                    i3 = 0;
                }
            } else if (i3 < 0) {
                if (i3 == -1) {
                    i3 = iMax;
                    i5 = 1073741824;
                } else if (i3 == -2) {
                    i5 = Integer.MIN_VALUE;
                    i3 = iMax;
                }
            }
            return View.MeasureSpec.makeMeasureSpec(i3, i5);
        }

        private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i = left - paddingLeft;
            int iMin = Math.min(0, i);
            int i2 = top - paddingTop;
            int iMin2 = Math.min(0, i2);
            int i3 = iWidth - width;
            int iMax = Math.max(0, i3);
            int iMax2 = Math.max(0, iHeight - height);
            if (getLayoutDirection() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i3);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i2, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        public static C22065OooO0Oo getProperties(Context context, AttributeSet attributeSet, int i, int i2) {
            C22065OooO0Oo c22065OooO0Oo = new C22065OooO0Oo();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C24702OooO00o.f83744OooO00o, i, i2);
            c22065OooO0Oo.f66067OooO00o = typedArrayObtainStyledAttributes.getInt(0, 1);
            c22065OooO0Oo.f66068OooO0O0 = typedArrayObtainStyledAttributes.getInt(10, 1);
            c22065OooO0Oo.f66069OooO0OO = typedArrayObtainStyledAttributes.getBoolean(9, false);
            c22065OooO0Oo.f66070OooO0Oo = typedArrayObtainStyledAttributes.getBoolean(11, false);
            typedArrayObtainStyledAttributes.recycle();
            return c22065OooO0Oo;
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i < width && rect.right - i > paddingLeft && rect.top - i2 < height && rect.bottom - i2 > paddingTop;
        }

        private static boolean isMeasurementUpToDate(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        private void scrapOrRecycleView(C22071OooOo0O c22071OooOo0O, int i, View view) {
            AbstractC22078OooOooO childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i);
                c22071OooOo0O.OooO(childViewHolderInt);
            } else {
                detachViewAt(i);
                c22071OooOo0O.OooOO0(view);
                this.mRecyclerView.mViewInfoStore.OooO0OO(childViewHolderInt);
            }
        }

        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(View view, int i, C22066OooOOOo c22066OooOOOo) {
            AbstractC22078OooOooO childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                C20493Oooo00o<AbstractC22078OooOooO, Oooo0.OooO00o> c20493Oooo00o = this.mRecyclerView.mViewInfoStore.f66032OooO00o;
                Oooo0.OooO00o OooO00o2 = c20493Oooo00o.get(childViewHolderInt);
                if (OooO00o2 == null) {
                    OooO00o2 = Oooo0.OooO00o.OooO00o();
                    c20493Oooo00o.put(childViewHolderInt, OooO00o2);
                }
                OooO00o2.f66035OooO00o |= 1;
            } else {
                this.mRecyclerView.mViewInfoStore.OooO0OO(childViewHolderInt);
            }
            this.mChildHelper.OooO0O0(view, i, c22066OooOOOo, childViewHolderInt.isRemoved());
        }

        public void calculateItemDecorationsForChild(View view, Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(C22066OooOOOo c22066OooOOOo) {
            return c22066OooOOOo != null;
        }

        public void collectAdjacentPrefetchPositions(int i, int i2, C22075OooOoOO c22075OooOoOO, OooO0OO oooO0OO) {
        }

        public void collectInitialPrefetchPositions(int i, OooO0OO oooO0OO) {
        }

        public int computeHorizontalScrollExtent(C22075OooOoOO c22075OooOoOO) {
            return 0;
        }

        public int computeHorizontalScrollOffset(C22075OooOoOO c22075OooOoOO) {
            return 0;
        }

        public int computeHorizontalScrollRange(C22075OooOoOO c22075OooOoOO) {
            return 0;
        }

        public int computeVerticalScrollExtent(C22075OooOoOO c22075OooOoOO) {
            return 0;
        }

        public int computeVerticalScrollOffset(C22075OooOoOO c22075OooOoOO) {
            return 0;
        }

        public int computeVerticalScrollRange(C22075OooOoOO c22075OooOoOO) {
            return 0;
        }

        public void detachAndScrapAttachedViews(C22071OooOo0O c22071OooOo0O) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(c22071OooOo0O, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(View view, C22071OooOo0O c22071OooOo0O) {
            scrapOrRecycleView(c22071OooOo0O, this.mChildHelper.OooOO0(view), view);
        }

        public void detachAndScrapViewAt(int i, C22071OooOo0O c22071OooOo0O) {
            scrapOrRecycleView(c22071OooOo0O, i, getChildAt(i));
        }

        public void detachView(View view) {
            int iOooOO0 = this.mChildHelper.OooOO0(view);
            if (iOooOO0 >= 0) {
                detachViewInternal(iOooOO0, view);
            }
        }

        public void detachViewAt(int i) {
            detachViewInternal(i, getChildAt(i));
        }

        public void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        public void dispatchDetachedFromWindow(RecyclerView recyclerView, C22071OooOo0O c22071OooOo0O) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, c22071OooOo0O);
        }

        public void endAnimation(View view) {
            AbstractC22064OooOO0o abstractC22064OooOO0o = this.mRecyclerView.mItemAnimator;
            if (abstractC22064OooOO0o != null) {
                abstractC22064OooOO0o.OooO0oo(RecyclerView.getChildViewHolderInt(view));
            }
        }

        public View findContainingItemView(View view) {
            View viewFindContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.f65830OooO0OO.contains(viewFindContainingItemView)) {
                return null;
            }
            return viewFindContainingItemView;
        }

        public View findViewByPosition(int i) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                AbstractC22078OooOooO childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.f66100OooO0oO || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public abstract C22066OooOOOo generateDefaultLayoutParams();

        public C22066OooOOOo generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C22066OooOOOo ? new C22066OooOOOo((C22066OooOOOo) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C22066OooOOOo((ViewGroup.MarginLayoutParams) layoutParams) : new C22066OooOOOo(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(View view) {
            return ((C22066OooOOOo) view.getLayoutParams()).mDecorInsets.bottom;
        }

        public View getChildAt(int i) {
            C22030OooO0oO c22030OooO0oO = this.mChildHelper;
            if (c22030OooO0oO != null) {
                return c22030OooO0oO.OooO0Oo(i);
            }
            return null;
        }

        public int getChildCount() {
            C22030OooO0oO c22030OooO0oO = this.mChildHelper;
            if (c22030OooO0oO != null) {
                return c22030OooO0oO.OooO0o0();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int getColumnCountForAccessibility(C22071OooOo0O c22071OooOo0O, C22075OooOoOO c22075OooOoOO) {
            return -1;
        }

        public int getDecoratedBottom(View view) {
            return getBottomDecorationHeight(view) + view.getBottom();
        }

        public void getDecoratedBoundsWithMargins(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(View view) {
            Rect rect = ((C22066OooOOOo) view.getLayoutParams()).mDecorInsets;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(View view) {
            Rect rect = ((C22066OooOOOo) view.getLayoutParams()).mDecorInsets;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(View view) {
            return getRightDecorationWidth(view) + view.getRight();
        }

        public int getDecoratedTop(View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.f65830OooO0OO.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            AbstractC22062OooO0oO adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLayoutDirection() {
            return ViewCompat.getLayoutDirection(this.mRecyclerView);
        }

        public int getLeftDecorationWidth(View view) {
            return ((C22066OooOOOo) view.getLayoutParams()).mDecorInsets.left;
        }

        public int getMinimumHeight() {
            return ViewCompat.getMinimumHeight(this.mRecyclerView);
        }

        public int getMinimumWidth() {
            return ViewCompat.getMinimumWidth(this.mRecyclerView);
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return ViewCompat.getPaddingEnd(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return ViewCompat.getPaddingStart(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(View view) {
            return ((C22066OooOOOo) view.getLayoutParams()).getViewLayoutPosition();
        }

        public int getRightDecorationWidth(View view) {
            return ((C22066OooOOOo) view.getLayoutParams()).mDecorInsets.right;
        }

        public int getRowCountForAccessibility(C22071OooOo0O c22071OooOo0O, C22075OooOoOO c22075OooOoOO) {
            return -1;
        }

        public int getSelectionModeForAccessibility(C22071OooOo0O c22071OooOo0O, C22075OooOoOO c22075OooOoOO) {
            return 0;
        }

        public int getTopDecorationHeight(View view) {
            return ((C22066OooOOOo) view.getLayoutParams()).mDecorInsets.top;
        }

        public void getTransformedBoundingBox(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C22066OooOOOo) view.getLayoutParams()).mDecorInsets;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException(androidx.recyclerview.widget.OooO0o.OooO00o(this.mRecyclerView, new StringBuilder("View should be fully attached to be ignored")));
            }
            AbstractC22078OooOooO childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.mRecyclerView.mViewInfoStore.OooO0Oo(childViewHolderInt);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(C22071OooOo0O c22071OooOo0O, C22075OooOoOO c22075OooOoOO) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            AbstractC22073OooOoO abstractC22073OooOoO = this.mSmoothScroller;
            return abstractC22073OooOoO != null && abstractC22073OooOoO.isRunning();
        }

        public boolean isViewPartiallyVisible(View view, boolean z, boolean z2) {
            boolean z3 = this.mHorizontalBoundCheck.OooO0O0(view) && this.mVerticalBoundCheck.OooO0O0(view);
            return z ? z3 : !z3;
        }

        public void layoutDecorated(View view, int i, int i2, int i3, int i4) {
            Rect rect = ((C22066OooOOOo) view.getLayoutParams()).mDecorInsets;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
            C22066OooOOOo c22066OooOOOo = (C22066OooOOOo) view.getLayoutParams();
            Rect rect = c22066OooOOOo.mDecorInsets;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c22066OooOOOo).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c22066OooOOOo).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c22066OooOOOo).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c22066OooOOOo).bottomMargin);
        }

        public void measureChild(View view, int i, int i2) {
            C22066OooOOOo c22066OooOOOo = (C22066OooOOOo) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
            int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i3, ((ViewGroup.MarginLayoutParams) c22066OooOOOo).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i4, ((ViewGroup.MarginLayoutParams) c22066OooOOOo).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, c22066OooOOOo)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(View view, int i, int i2) {
            C22066OooOOOo c22066OooOOOo = (C22066OooOOOo) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
            int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c22066OooOOOo).leftMargin + ((ViewGroup.MarginLayoutParams) c22066OooOOOo).rightMargin + i3, ((ViewGroup.MarginLayoutParams) c22066OooOOOo).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) c22066OooOOOo).topMargin + ((ViewGroup.MarginLayoutParams) c22066OooOOOo).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) c22066OooOOOo).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, c22066OooOOOo)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                detachViewAt(i);
                attachView(childAt, i2);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.mRecyclerView.toString());
            }
        }

        public void offsetChildrenHorizontal(int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        public void offsetChildrenVertical(int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        public void onAdapterChanged(AbstractC22062OooO0oO abstractC22062OooO0oO, AbstractC22062OooO0oO abstractC22062OooO0oO2) {
        }

        public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public View onFocusSearchFailed(View view, int i, C22071OooOo0O c22071OooOo0O, C22075OooOoOO c22075OooOoOO) {
            return null;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, accessibilityNodeInfoCompat);
        }

        public void onInitializeAccessibilityNodeInfoForItem(C22071OooOo0O c22071OooOo0O, C22075OooOoOO c22075OooOoOO, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        public View onInterceptFocusSearch(View view, int i) {
            return null;
        }

        public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsChanged(RecyclerView recyclerView) {
        }

        public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        }

        public void onLayoutChildren(C22071OooOo0O c22071OooOo0O, C22075OooOoOO c22075OooOoOO) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void onLayoutCompleted(C22075OooOoOO c22075OooOoOO) {
        }

        public void onMeasure(C22071OooOo0O c22071OooOo0O, C22075OooOoOO c22075OooOoOO, int i, int i2) {
            this.mRecyclerView.defaultOnMeasure(i, i2);
        }

        @Deprecated
        public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i) {
        }

        public void onSmoothScrollerStopped(AbstractC22073OooOoO abstractC22073OooOoO) {
            if (this.mSmoothScroller == abstractC22073OooOoO) {
                this.mSmoothScroller = null;
            }
        }

        public boolean performAccessibilityAction(int i, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i, bundle);
        }

        public boolean performAccessibilityActionForItem(C22071OooOo0O c22071OooOo0O, C22075OooOoOO c22075OooOoOO, View view, int i, Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                ViewCompat.postOnAnimation(recyclerView, runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.OooOO0O(childCount);
            }
        }

        public void removeAndRecycleAllViews(C22071OooOo0O c22071OooOo0O) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, c22071OooOo0O);
                }
            }
        }

        public void removeAndRecycleScrapInt(C22071OooOo0O c22071OooOo0O) {
            ArrayList<AbstractC22078OooOooO> arrayList;
            int size = c22071OooOo0O.f66078OooO00o.size();
            int i = size - 1;
            while (true) {
                arrayList = c22071OooOo0O.f66078OooO00o;
                if (i < 0) {
                    break;
                }
                View view = arrayList.get(i).itemView;
                AbstractC22078OooOooO childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(view, false);
                    }
                    AbstractC22064OooOO0o abstractC22064OooOO0o = this.mRecyclerView.mItemAnimator;
                    if (abstractC22064OooOO0o != null) {
                        abstractC22064OooOO0o.OooO0oo(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    AbstractC22078OooOooO childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.mScrapContainer = null;
                    childViewHolderInt2.mInChangeScrap = false;
                    childViewHolderInt2.clearReturnedFromScrapFlag();
                    c22071OooOo0O.OooO(childViewHolderInt2);
                }
                i--;
            }
            arrayList.clear();
            ArrayList<AbstractC22078OooOooO> arrayList2 = c22071OooOo0O.f66079OooO0O0;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(View view, C22071OooOo0O c22071OooOo0O) {
            removeView(view);
            c22071OooOo0O.OooO0oo(view);
        }

        public void removeAndRecycleViewAt(int i, C22071OooOo0O c22071OooOo0O) {
            View childAt = getChildAt(i);
            removeViewAt(i);
            c22071OooOo0O.OooO0oo(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        public void removeView(View view) {
            C22030OooO0oO c22030OooO0oO = this.mChildHelper;
            C22061OooO0o0 c22061OooO0o0 = c22030OooO0oO.f65828OooO00o;
            int iIndexOfChild = RecyclerView.this.indexOfChild(view);
            if (iIndexOfChild < 0) {
                return;
            }
            if (c22030OooO0oO.f65829OooO0O0.OooO0o(iIndexOfChild)) {
                c22030OooO0oO.OooOO0o(view);
            }
            c22061OooO0o0.OooO00o(iIndexOfChild);
        }

        public void removeViewAt(int i) {
            if (getChildAt(i) != null) {
                this.mChildHelper.OooOO0O(i);
            }
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public int scrollHorizontallyBy(int i, C22071OooOo0O c22071OooOo0O, C22075OooOoOO c22075OooOoOO) {
            return 0;
        }

        public void scrollToPosition(int i) {
        }

        public int scrollVerticallyBy(int i, C22071OooOo0O c22071OooOo0O, C22075OooOoOO c22075OooOoOO) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z) {
            this.mAutoMeasure = z;
        }

        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z) {
            if (z != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.OooOOO0();
                }
            }
        }

        public void setMeasureSpecs(int i, int i2) {
            this.mWidth = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        public void setMeasuredDimension(Rect rect, int i, int i2) {
            setMeasuredDimension(chooseSize(i, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i2, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
        }

        public void setMeasuredDimensionFromChildren(int i, int i2) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.mRecyclerView.mTempRect.set(i6, i4, i3, i5);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i, i2);
        }

        public void setMeasurementCacheEnabled(boolean z) {
            this.mMeasurementCacheEnabled = z;
        }

        public void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        public boolean shouldMeasureChild(View view, int i, int i2, C22066OooOOOo c22066OooOOOo) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c22066OooOOOo).width) && isMeasurementUpToDate(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c22066OooOOOo).height)) ? false : true;
        }

        public boolean shouldMeasureTwice() {
            return false;
        }

        public boolean shouldReMeasureChild(View view, int i, int i2, C22066OooOOOo c22066OooOOOo) {
            return (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c22066OooOOOo).width) && isMeasurementUpToDate(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c22066OooOOOo).height)) ? false : true;
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, C22075OooOoOO c22075OooOoOO, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void startSmoothScroll(AbstractC22073OooOoO abstractC22073OooOoO) {
            AbstractC22073OooOoO abstractC22073OooOoO2 = this.mSmoothScroller;
            if (abstractC22073OooOoO2 != null && abstractC22073OooOoO != abstractC22073OooOoO2 && abstractC22073OooOoO2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = abstractC22073OooOoO;
            abstractC22073OooOoO.start(this.mRecyclerView, this);
        }

        public void stopIgnoringView(View view) {
            AbstractC22078OooOooO childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        public void stopSmoothScroller() {
            AbstractC22073OooOoO abstractC22073OooOoO = this.mSmoothScroller;
            if (abstractC22073OooOoO != null) {
                abstractC22073OooOoO.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        public void addDisappearingView(View view, int i) {
            addViewInt(view, i, true);
        }

        public void addView(View view, int i) {
            addViewInt(view, i, false);
        }

        public void onDetachedFromWindow(RecyclerView recyclerView, C22071OooOo0O c22071OooOo0O) {
            onDetachedFromWindow(recyclerView);
        }

        public void onInitializeAccessibilityEvent(C22071OooOo0O c22071OooOo0O, C22075OooOoOO c22075OooOoOO, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            AbstractC22062OooO0oO abstractC22062OooO0oO = this.mRecyclerView.mAdapter;
            if (abstractC22062OooO0oO != null) {
                accessibilityEvent.setItemCount(abstractC22062OooO0oO.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(C22071OooOo0O c22071OooOo0O, C22075OooOoOO c22075OooOoOO, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
                accessibilityNodeInfoCompat.setScrollable(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
                accessibilityNodeInfoCompat.setScrollable(true);
            }
            accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(getRowCountForAccessibility(c22071OooOo0O, c22075OooOoOO), getColumnCountForAccessibility(c22071OooOo0O, c22075OooOoOO), isLayoutHierarchical(c22071OooOo0O, c22075OooOoOO), getSelectionModeForAccessibility(c22071OooOo0O, c22075OooOoOO)));
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AbstractC22078OooOooO childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved()) {
                return;
            }
            C22030OooO0oO c22030OooO0oO = this.mChildHelper;
            if (c22030OooO0oO.f65830OooO0OO.contains(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, accessibilityNodeInfoCompat);
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
            onItemsUpdated(recyclerView, i, i2);
        }

        public boolean onRequestChildFocus(RecyclerView recyclerView, C22075OooOoOO c22075OooOoOO, View view, View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public boolean performAccessibilityAction(C22071OooOo0O c22071OooOo0O, C22075OooOoOO c22075OooOoOO, int i, Bundle bundle) {
            int height;
            int width;
            int i2;
            int i3;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return false;
            }
            if (i == 4096) {
                height = recyclerView.canScrollVertically(1) ? (getHeight() - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    i2 = height;
                    i3 = width;
                }
                i2 = height;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                height = recyclerView.canScrollVertically(-1) ? -((getHeight() - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    width = -((getWidth() - getPaddingLeft()) - getPaddingRight());
                    i2 = height;
                    i3 = width;
                }
                i2 = height;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        public boolean performAccessibilityActionForItem(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
            int i = childRectangleOnScreenScrollAmount[0];
            int i2 = childRectangleOnScreenScrollAmount[1];
            if ((z2 && !isFocusedChildVisibleAfterScrolling(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.smoothScrollBy(i, i2);
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int getChildMeasureSpec(int i, int i2, int i3, int i4, boolean z) {
            int iMax = Math.max(0, i - i3);
            if (z) {
                if (i4 < 0) {
                    if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                        i2 = 0;
                        i4 = 0;
                    } else {
                        i4 = iMax;
                    }
                }
                i2 = 1073741824;
            } else if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1) {
                if (i4 == -2) {
                    if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                        i4 = iMax;
                        i2 = Integer.MIN_VALUE;
                    } else {
                        i4 = iMax;
                        i2 = 0;
                    }
                }
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        public C22066OooOOOo generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new C22066OooOOOo(context, attributeSet);
        }

        public void setMeasuredDimension(int i, int i2) {
            this.mRecyclerView.setMeasuredDimension(i, i2);
        }

        public void attachView(View view, int i) {
            attachView(view, i, (C22066OooOOOo) view.getLayoutParams());
        }

        public void attachView(View view) {
            attachView(view, -1);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$OooOOo, reason: case insensitive filesystem */
    public static abstract class AbstractC22067OooOOo {
        public abstract boolean onFling(int i, int i2);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$OooOOo0, reason: case insensitive filesystem */
    public interface InterfaceC22068OooOOo0 {
        void OooO0O0(View view);

        void OooO0Oo(View view);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$OooOOoo, reason: case insensitive filesystem */
    public interface InterfaceC22069OooOOoo {
        void OooO00o(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean OooO0OO(RecyclerView recyclerView, MotionEvent motionEvent);

        void OooO0o0(boolean z);
    }

    public class OooOo extends OooO {
        public OooOo() {
        }

        public final void OooO00o() {
            boolean z = RecyclerView.POST_UPDATES_ON_ANIMATION;
            RecyclerView recyclerView = RecyclerView.this;
            if (z && recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                ViewCompat.postOnAnimation(recyclerView, recyclerView.mUpdateChildViewsRunnable);
            } else {
                recyclerView.mAdapterUpdateDuringMeasure = true;
                recyclerView.requestLayout();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooO
        public final void onChanged() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            recyclerView.mState.f66098OooO0o = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (recyclerView.mAdapterHelper.OooO0oO()) {
                return;
            }
            recyclerView.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooO
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.OooO00o oooO00o = recyclerView.mAdapterHelper;
            if (i2 < 1) {
                oooO00o.getClass();
                return;
            }
            ArrayList<OooO00o.C19033OooO00o> arrayList = oooO00o.f65792OooO0O0;
            arrayList.add(oooO00o.OooO0oo(4, i, i2, obj));
            oooO00o.f65795OooO0o |= 4;
            if (arrayList.size() == 1) {
                OooO00o();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooO
        public final void onItemRangeInserted(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.OooO00o oooO00o = recyclerView.mAdapterHelper;
            if (i2 < 1) {
                oooO00o.getClass();
                return;
            }
            ArrayList<OooO00o.C19033OooO00o> arrayList = oooO00o.f65792OooO0O0;
            arrayList.add(oooO00o.OooO0oo(1, i, i2, null));
            oooO00o.f65795OooO0o |= 1;
            if (arrayList.size() == 1) {
                OooO00o();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooO
        public final void onItemRangeMoved(int i, int i2, int i3) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.OooO00o oooO00o = recyclerView.mAdapterHelper;
            oooO00o.getClass();
            if (i == i2) {
                return;
            }
            if (i3 != 1) {
                throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
            }
            ArrayList<OooO00o.C19033OooO00o> arrayList = oooO00o.f65792OooO0O0;
            arrayList.add(oooO00o.OooO0oo(8, i, i2, null));
            oooO00o.f65795OooO0o |= 8;
            if (arrayList.size() == 1) {
                OooO00o();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooO
        public final void onItemRangeRemoved(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.OooO00o oooO00o = recyclerView.mAdapterHelper;
            if (i2 < 1) {
                oooO00o.getClass();
                return;
            }
            ArrayList<OooO00o.C19033OooO00o> arrayList = oooO00o.f65792OooO0O0;
            arrayList.add(oooO00o.OooO0oo(2, i, i2, null));
            oooO00o.f65795OooO0o |= 2;
            if (arrayList.size() == 1) {
                OooO00o();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooO
        public final void onStateRestorationPolicyChanged() {
            AbstractC22062OooO0oO abstractC22062OooO0oO;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState == null || (abstractC22062OooO0oO = recyclerView.mAdapter) == null || !abstractC22062OooO0oO.canRestoreState()) {
                return;
            }
            recyclerView.requestLayout();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$OooOo0, reason: case insensitive filesystem */
    public static class C22070OooOo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public SparseArray<OooO00o> f66072OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f66073OooO0O0;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$OooOo0$OooO00o */
        public static class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final ArrayList<AbstractC22078OooOooO> f66074OooO00o = new ArrayList<>();

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final int f66075OooO0O0 = 5;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public long f66076OooO0OO = 0;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public long f66077OooO0Oo = 0;
        }

        public final OooO00o OooO00o(int i) {
            SparseArray<OooO00o> sparseArray = this.f66072OooO00o;
            OooO00o oooO00o = sparseArray.get(i);
            if (oooO00o != null) {
                return oooO00o;
            }
            OooO00o oooO00o2 = new OooO00o();
            sparseArray.put(i, oooO00o2);
            return oooO00o2;
        }
    }

    public static abstract class OooOo00 {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$OooOo0O, reason: case insensitive filesystem */
    public final class C22071OooOo0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList<AbstractC22078OooOooO> f66078OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ArrayList<AbstractC22078OooOooO> f66079OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ArrayList<AbstractC22078OooOooO> f66080OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final List<AbstractC22078OooOooO> f66081OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f66082OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f66083OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public C22070OooOo0 f66084OooO0oO;

        public C22071OooOo0O() {
            ArrayList<AbstractC22078OooOooO> arrayList = new ArrayList<>();
            this.f66078OooO00o = arrayList;
            this.f66079OooO0O0 = null;
            this.f66080OooO0OO = new ArrayList<>();
            this.f66081OooO0Oo = Collections.unmodifiableList(arrayList);
            this.f66083OooO0o0 = 2;
            this.f66082OooO0o = 2;
        }

        public static void OooO0o0(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    OooO0o0((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x0092, code lost:
        
            r5 = r5 - 1;
         */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO(AbstractC22078OooOooO abstractC22078OooOooO) {
            boolean z;
            int i;
            boolean zIsScrap = abstractC22078OooOooO.isScrap();
            RecyclerView recyclerView = RecyclerView.this;
            boolean z2 = true;
            if (zIsScrap || abstractC22078OooOooO.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(abstractC22078OooOooO.isScrap());
                sb.append(" isAttached:");
                sb.append(abstractC22078OooOooO.itemView.getParent() != null);
                sb.append(recyclerView.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
            if (abstractC22078OooOooO.isTmpDetached()) {
                StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(abstractC22078OooOooO);
                throw new IllegalArgumentException(androidx.recyclerview.widget.OooO0o.OooO00o(recyclerView, sb2));
            }
            if (abstractC22078OooOooO.shouldIgnore()) {
                throw new IllegalArgumentException(androidx.recyclerview.widget.OooO0o.OooO00o(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            }
            boolean zDoesTransientStatePreventRecycling = abstractC22078OooOooO.doesTransientStatePreventRecycling();
            AbstractC22062OooO0oO abstractC22062OooO0oO = recyclerView.mAdapter;
            if ((abstractC22062OooO0oO != null && zDoesTransientStatePreventRecycling && abstractC22062OooO0oO.onFailedToRecycleView(abstractC22078OooOooO)) || abstractC22078OooOooO.isRecyclable()) {
                if (this.f66082OooO0o <= 0 || abstractC22078OooOooO.hasAnyOfTheFlags(526)) {
                    z = false;
                } else {
                    ArrayList<AbstractC22078OooOooO> arrayList = this.f66080OooO0OO;
                    int size = arrayList.size();
                    if (size >= this.f66082OooO0o && size > 0) {
                        OooO0oO(0);
                        size--;
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0) {
                        RunnableC22046OooOOo0.OooO0O0 oooO0O0 = recyclerView.mPrefetchRegistry;
                        int i2 = abstractC22078OooOooO.mPosition;
                        if (oooO0O0.f66002OooO0OO != null) {
                            int i3 = oooO0O0.f66003OooO0Oo * 2;
                            for (int i4 = 0; i4 < i3; i4 += 2) {
                                if (oooO0O0.f66002OooO0OO[i4] == i2) {
                                    break;
                                }
                            }
                            i = size - 1;
                            loop1: while (i >= 0) {
                                int i5 = arrayList.get(i).mPosition;
                                RunnableC22046OooOOo0.OooO0O0 oooO0O02 = recyclerView.mPrefetchRegistry;
                                if (oooO0O02.f66002OooO0OO == null) {
                                    break;
                                }
                                int i6 = oooO0O02.f66003OooO0Oo * 2;
                                for (int i7 = 0; i7 < i6; i7 += 2) {
                                    if (oooO0O02.f66002OooO0OO[i7] == i5) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i + 1;
                        } else {
                            i = size - 1;
                            loop1: while (i >= 0) {
                            }
                            size = i + 1;
                        }
                    }
                    arrayList.add(size, abstractC22078OooOooO);
                    z = true;
                }
                if (z) {
                    z2 = false;
                } else {
                    OooO00o(abstractC22078OooOooO, true);
                }
                z = z;
            } else {
                z2 = false;
            }
            recyclerView.mViewInfoStore.OooO0Oo(abstractC22078OooOooO);
            if (z || z2 || !zDoesTransientStatePreventRecycling) {
                return;
            }
            abstractC22078OooOooO.mBindingAdapter = null;
            abstractC22078OooOooO.mOwnerRecyclerView = null;
        }

        public final void OooO00o(AbstractC22078OooOooO abstractC22078OooOooO, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(abstractC22078OooOooO);
            View view = abstractC22078OooOooO.itemView;
            RecyclerView recyclerView = RecyclerView.this;
            C22056OooOooO c22056OooOooO = recyclerView.mAccessibilityDelegate;
            if (c22056OooOooO != null) {
                AccessibilityDelegateCompat itemDelegate = c22056OooOooO.getItemDelegate();
                ViewCompat.setAccessibilityDelegate(view, itemDelegate instanceof C22056OooOooO.OooO00o ? (AccessibilityDelegateCompat) ((C22056OooOooO.OooO00o) itemDelegate).f66031OooO0O0.remove(view) : null);
            }
            if (z) {
                InterfaceC22072OooOo0o interfaceC22072OooOo0o = recyclerView.mRecyclerListener;
                if (interfaceC22072OooOo0o != null) {
                    interfaceC22072OooOo0o.OooO00o();
                }
                int size = recyclerView.mRecyclerListeners.size();
                for (int i = 0; i < size; i++) {
                    recyclerView.mRecyclerListeners.get(i).OooO00o();
                }
                AbstractC22062OooO0oO abstractC22062OooO0oO = recyclerView.mAdapter;
                if (abstractC22062OooO0oO != null) {
                    abstractC22062OooO0oO.onViewRecycled(abstractC22078OooOooO);
                }
                if (recyclerView.mState != null) {
                    recyclerView.mViewInfoStore.OooO0Oo(abstractC22078OooOooO);
                }
            }
            abstractC22078OooOooO.mBindingAdapter = null;
            abstractC22078OooOooO.mOwnerRecyclerView = null;
            C22070OooOo0 c22070OooOo0OooO0Oo = OooO0Oo();
            c22070OooOo0OooO0Oo.getClass();
            int itemViewType = abstractC22078OooOooO.getItemViewType();
            ArrayList<AbstractC22078OooOooO> arrayList = c22070OooOo0OooO0Oo.OooO00o(itemViewType).f66074OooO00o;
            if (c22070OooOo0OooO0Oo.f66072OooO00o.get(itemViewType).f66075OooO0O0 <= arrayList.size()) {
                return;
            }
            abstractC22078OooOooO.resetInternal();
            arrayList.add(abstractC22078OooOooO);
        }

        public final void OooO0O0() {
            this.f66078OooO00o.clear();
            OooO0o();
        }

        public final int OooO0OO(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i >= 0 && i < recyclerView.mState.OooO0O0()) {
                return !recyclerView.mState.f66100OooO0oO ? i : recyclerView.mAdapterHelper.OooO0o(i, 0);
            }
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "invalid position ", ". State item count is ");
            sbOooO0OO.append(recyclerView.mState.OooO0O0());
            sbOooO0OO.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(sbOooO0OO.toString());
        }

        public final C22070OooOo0 OooO0Oo() {
            if (this.f66084OooO0oO == null) {
                C22070OooOo0 c22070OooOo0 = new C22070OooOo0();
                c22070OooOo0.f66072OooO00o = new SparseArray<>();
                c22070OooOo0.f66073OooO0O0 = 0;
                this.f66084OooO0oO = c22070OooOo0;
            }
            return this.f66084OooO0oO;
        }

        public final void OooO0o() {
            ArrayList<AbstractC22078OooOooO> arrayList = this.f66080OooO0OO;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                OooO0oO(size);
            }
            arrayList.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RunnableC22046OooOOo0.OooO0O0 oooO0O0 = RecyclerView.this.mPrefetchRegistry;
                int[] iArr = oooO0O0.f66002OooO0OO;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                oooO0O0.f66003OooO0Oo = 0;
            }
        }

        public final void OooO0oO(int i) {
            ArrayList<AbstractC22078OooOooO> arrayList = this.f66080OooO0OO;
            OooO00o(arrayList.get(i), true);
            arrayList.remove(i);
        }

        public final void OooO0oo(View view) {
            AbstractC22078OooOooO childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean zIsTmpDetached = childViewHolderInt.isTmpDetached();
            RecyclerView recyclerView = RecyclerView.this;
            if (zIsTmpDetached) {
                recyclerView.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            OooO(childViewHolderInt);
            if (recyclerView.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            recyclerView.mItemAnimator.OooO0oo(childViewHolderInt);
        }

        public final void OooOO0(View view) {
            AbstractC22078OooOooO childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean zHasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
            RecyclerView recyclerView = RecyclerView.this;
            if (!zHasAnyOfTheFlags && childViewHolderInt.isUpdated() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f66079OooO0O0 == null) {
                    this.f66079OooO0O0 = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f66079OooO0O0.add(childViewHolderInt);
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !recyclerView.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException(androidx.recyclerview.widget.OooO0o.OooO00o(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
            childViewHolderInt.setScrapContainer(this, false);
            this.f66078OooO00o.add(childViewHolderInt);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:173:0x030f  */
        /* JADX WARN: Removed duplicated region for block: B:175:0x0312  */
        /* JADX WARN: Removed duplicated region for block: B:260:0x0497  */
        /* JADX WARN: Removed duplicated region for block: B:261:0x04a3  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AbstractC22078OooOooO OooOO0O(int i, long j) {
            int i2;
            AbstractC22078OooOooO abstractC22078OooOooOCreateViewHolder;
            int i3;
            long j2;
            long j3;
            long j4;
            int i4;
            int i5;
            ViewGroup.LayoutParams layoutParams;
            C22066OooOOOo c22066OooOOOo;
            RecyclerView recyclerViewFindNestedRecyclerView;
            AbstractC22078OooOooO abstractC22078OooOooORemove;
            View view;
            AbstractC22078OooOooO abstractC22078OooOooO;
            boolean z;
            int size;
            int iOooO0o;
            RecyclerView recyclerView = RecyclerView.this;
            if (i < 0 || i >= recyclerView.mState.OooO0O0()) {
                StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("Invalid item position ", i, "(", "). Item count:", i);
                sbOooO0O0.append(recyclerView.mState.OooO0O0());
                sbOooO0O0.append(recyclerView.exceptionLabel());
                throw new IndexOutOfBoundsException(sbOooO0O0.toString());
            }
            boolean z2 = 0;
            z2 = 0;
            int i6 = 1;
            if (recyclerView.mState.f66100OooO0oO) {
                ArrayList<AbstractC22078OooOooO> arrayList = this.f66079OooO0O0;
                if (arrayList == null || (size = arrayList.size()) == 0) {
                    abstractC22078OooOooOCreateViewHolder = null;
                    i2 = abstractC22078OooOooOCreateViewHolder == null ? 1 : 0;
                } else {
                    int i7 = 0;
                    while (true) {
                        if (i7 < size) {
                            abstractC22078OooOooOCreateViewHolder = this.f66079OooO0O0.get(i7);
                            if (!abstractC22078OooOooOCreateViewHolder.wasReturnedFromScrap() && abstractC22078OooOooOCreateViewHolder.getLayoutPosition() == i) {
                                abstractC22078OooOooOCreateViewHolder.addFlags(32);
                                break;
                            }
                            i7++;
                        } else if (recyclerView.mAdapter.hasStableIds() && (iOooO0o = recyclerView.mAdapterHelper.OooO0o(i, 0)) > 0 && iOooO0o < recyclerView.mAdapter.getItemCount()) {
                            long itemId = recyclerView.mAdapter.getItemId(iOooO0o);
                            for (int i8 = 0; i8 < size; i8++) {
                                AbstractC22078OooOooO abstractC22078OooOooO2 = this.f66079OooO0O0.get(i8);
                                if (!abstractC22078OooOooO2.wasReturnedFromScrap() && abstractC22078OooOooO2.getItemId() == itemId) {
                                    abstractC22078OooOooO2.addFlags(32);
                                    abstractC22078OooOooOCreateViewHolder = abstractC22078OooOooO2;
                                    break;
                                }
                            }
                        }
                    }
                    abstractC22078OooOooOCreateViewHolder = null;
                    if (abstractC22078OooOooOCreateViewHolder == null) {
                    }
                }
            } else {
                i2 = 0;
                abstractC22078OooOooOCreateViewHolder = null;
            }
            ArrayList<AbstractC22078OooOooO> arrayList2 = this.f66080OooO0OO;
            ArrayList<AbstractC22078OooOooO> arrayList3 = this.f66078OooO00o;
            if (abstractC22078OooOooOCreateViewHolder == null) {
                int size2 = arrayList3.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    abstractC22078OooOooO = arrayList3.get(i9);
                    if (!abstractC22078OooOooO.wasReturnedFromScrap() && abstractC22078OooOooO.getLayoutPosition() == i && !abstractC22078OooOooO.isInvalid() && (recyclerView.mState.f66100OooO0oO || !abstractC22078OooOooO.isRemoved())) {
                        abstractC22078OooOooO.addFlags(32);
                        break;
                    }
                }
                ArrayList arrayList4 = recyclerView.mChildHelper.f65830OooO0OO;
                int size3 = arrayList4.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size3) {
                        view = null;
                        break;
                    }
                    view = (View) arrayList4.get(i10);
                    AbstractC22078OooOooO childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                    if (childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved()) {
                        break;
                    }
                    i10++;
                }
                if (view != null) {
                    abstractC22078OooOooOCreateViewHolder = RecyclerView.getChildViewHolderInt(view);
                    C22030OooO0oO c22030OooO0oO = recyclerView.mChildHelper;
                    int iIndexOfChild = RecyclerView.this.indexOfChild(view);
                    if (iIndexOfChild < 0) {
                        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                    }
                    C22030OooO0oO.OooO00o oooO00o = c22030OooO0oO.f65829OooO0O0;
                    if (!oooO00o.OooO0Oo(iIndexOfChild)) {
                        throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                    }
                    oooO00o.OooO00o(iIndexOfChild);
                    c22030OooO0oO.OooOO0o(view);
                    int iOooOO0 = recyclerView.mChildHelper.OooOO0(view);
                    if (iOooOO0 == -1) {
                        StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                        sb.append(abstractC22078OooOooOCreateViewHolder);
                        throw new IllegalStateException(androidx.recyclerview.widget.OooO0o.OooO00o(recyclerView, sb));
                    }
                    recyclerView.mChildHelper.OooO0OO(iOooOO0);
                    OooOO0(view);
                    abstractC22078OooOooOCreateViewHolder.addFlags(8224);
                } else {
                    int size4 = arrayList2.size();
                    for (int i11 = 0; i11 < size4; i11++) {
                        abstractC22078OooOooO = arrayList2.get(i11);
                        if (!abstractC22078OooOooO.isInvalid() && abstractC22078OooOooO.getLayoutPosition() == i && !abstractC22078OooOooO.isAttachedToTransitionOverlay()) {
                            arrayList2.remove(i11);
                            abstractC22078OooOooOCreateViewHolder = abstractC22078OooOooO;
                        }
                    }
                    abstractC22078OooOooOCreateViewHolder = null;
                }
                if (abstractC22078OooOooOCreateViewHolder != null) {
                    if (abstractC22078OooOooOCreateViewHolder.isRemoved()) {
                        z = recyclerView.mState.f66100OooO0oO;
                    } else {
                        int i12 = abstractC22078OooOooOCreateViewHolder.mPosition;
                        if (i12 < 0 || i12 >= recyclerView.mAdapter.getItemCount()) {
                            StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                            sb2.append(abstractC22078OooOooOCreateViewHolder);
                            throw new IndexOutOfBoundsException(androidx.recyclerview.widget.OooO0o.OooO00o(recyclerView, sb2));
                        }
                        z = (recyclerView.mState.f66100OooO0oO || recyclerView.mAdapter.getItemViewType(abstractC22078OooOooOCreateViewHolder.mPosition) == abstractC22078OooOooOCreateViewHolder.getItemViewType()) && (!recyclerView.mAdapter.hasStableIds() || abstractC22078OooOooOCreateViewHolder.getItemId() == recyclerView.mAdapter.getItemId(abstractC22078OooOooOCreateViewHolder.mPosition));
                    }
                    if (z) {
                        i2 = 1;
                    } else {
                        abstractC22078OooOooOCreateViewHolder.addFlags(4);
                        if (abstractC22078OooOooOCreateViewHolder.isScrap()) {
                            recyclerView.removeDetachedView(abstractC22078OooOooOCreateViewHolder.itemView, false);
                            abstractC22078OooOooOCreateViewHolder.unScrap();
                        } else if (abstractC22078OooOooOCreateViewHolder.wasReturnedFromScrap()) {
                            abstractC22078OooOooOCreateViewHolder.clearReturnedFromScrapFlag();
                        }
                        OooO(abstractC22078OooOooOCreateViewHolder);
                        abstractC22078OooOooOCreateViewHolder = null;
                    }
                }
            }
            if (abstractC22078OooOooOCreateViewHolder == null) {
                j2 = 3;
                int iOooO0o2 = recyclerView.mAdapterHelper.OooO0o(i, 0);
                if (iOooO0o2 < 0 || iOooO0o2 >= recyclerView.mAdapter.getItemCount()) {
                    StringBuilder sbOooO0O02 = C20398OooO0O0.OooO0O0("Inconsistency detected. Invalid item position ", i, "(offset:", ").state:", iOooO0o2);
                    sbOooO0O02.append(recyclerView.mState.OooO0O0());
                    sbOooO0O02.append(recyclerView.exceptionLabel());
                    throw new IndexOutOfBoundsException(sbOooO0O02.toString());
                }
                int itemViewType = recyclerView.mAdapter.getItemViewType(iOooO0o2);
                j3 = 4;
                if (recyclerView.mAdapter.hasStableIds()) {
                    long itemId2 = recyclerView.mAdapter.getItemId(iOooO0o2);
                    int size5 = arrayList3.size() - 1;
                    while (true) {
                        if (size5 >= 0) {
                            j4 = 0;
                            AbstractC22078OooOooO abstractC22078OooOooO3 = arrayList3.get(size5);
                            if (abstractC22078OooOooO3.getItemId() != itemId2 || abstractC22078OooOooO3.wasReturnedFromScrap()) {
                                i3 = i6;
                            } else {
                                i3 = i6;
                                if (itemViewType == abstractC22078OooOooO3.getItemViewType()) {
                                    abstractC22078OooOooO3.addFlags(32);
                                    if (abstractC22078OooOooO3.isRemoved() && !recyclerView.mState.f66100OooO0oO) {
                                        abstractC22078OooOooO3.setFlags(2, 14);
                                    }
                                    abstractC22078OooOooOCreateViewHolder = abstractC22078OooOooO3;
                                } else {
                                    arrayList3.remove(size5);
                                    recyclerView.removeDetachedView(abstractC22078OooOooO3.itemView, false);
                                    AbstractC22078OooOooO childViewHolderInt2 = RecyclerView.getChildViewHolderInt(abstractC22078OooOooO3.itemView);
                                    childViewHolderInt2.mScrapContainer = null;
                                    childViewHolderInt2.mInChangeScrap = false;
                                    childViewHolderInt2.clearReturnedFromScrapFlag();
                                    OooO(childViewHolderInt2);
                                }
                            }
                            size5--;
                            i6 = i3;
                        } else {
                            i3 = i6;
                            j4 = 0;
                            int size6 = arrayList2.size() - 1;
                            while (true) {
                                if (size6 < 0) {
                                    break;
                                }
                                AbstractC22078OooOooO abstractC22078OooOooO4 = arrayList2.get(size6);
                                if (abstractC22078OooOooO4.getItemId() != itemId2 || abstractC22078OooOooO4.isAttachedToTransitionOverlay()) {
                                    size6--;
                                } else if (itemViewType == abstractC22078OooOooO4.getItemViewType()) {
                                    arrayList2.remove(size6);
                                    abstractC22078OooOooOCreateViewHolder = abstractC22078OooOooO4;
                                } else {
                                    OooO0oO(size6);
                                }
                            }
                            abstractC22078OooOooOCreateViewHolder = null;
                        }
                    }
                    if (abstractC22078OooOooOCreateViewHolder != null) {
                        abstractC22078OooOooOCreateViewHolder.mPosition = iOooO0o2;
                        i2 = i3;
                    }
                } else {
                    i3 = 1;
                    j4 = 0;
                }
                if (abstractC22078OooOooOCreateViewHolder == null) {
                    C22070OooOo0.OooO00o oooO00o2 = OooO0Oo().f66072OooO00o.get(itemViewType);
                    if (oooO00o2 != null) {
                        ArrayList<AbstractC22078OooOooO> arrayList5 = oooO00o2.f66074OooO00o;
                        if (arrayList5.isEmpty()) {
                            abstractC22078OooOooORemove = null;
                            if (abstractC22078OooOooORemove != null) {
                            }
                            abstractC22078OooOooOCreateViewHolder = abstractC22078OooOooORemove;
                        } else {
                            for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                                if (!arrayList5.get(size7).isAttachedToTransitionOverlay()) {
                                    abstractC22078OooOooORemove = arrayList5.remove(size7);
                                    break;
                                }
                            }
                            abstractC22078OooOooORemove = null;
                            if (abstractC22078OooOooORemove != null) {
                                abstractC22078OooOooORemove.resetInternal();
                                if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                    View view2 = abstractC22078OooOooORemove.itemView;
                                    if (view2 instanceof ViewGroup) {
                                        OooO0o0((ViewGroup) view2, false);
                                    }
                                }
                            }
                            abstractC22078OooOooOCreateViewHolder = abstractC22078OooOooORemove;
                        }
                    }
                }
                if (abstractC22078OooOooOCreateViewHolder == null) {
                    long nanoTime = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        long j5 = this.f66084OooO0oO.OooO00o(itemViewType).f66076OooO0OO;
                        if (((j5 == j4 || j5 + nanoTime < j) ? i3 : 0) == 0) {
                            return null;
                        }
                    }
                    abstractC22078OooOooOCreateViewHolder = recyclerView.mAdapter.createViewHolder(recyclerView, itemViewType);
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && (recyclerViewFindNestedRecyclerView = RecyclerView.findNestedRecyclerView(abstractC22078OooOooOCreateViewHolder.itemView)) != null) {
                        abstractC22078OooOooOCreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewFindNestedRecyclerView);
                    }
                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    C22070OooOo0.OooO00o OooO00o2 = this.f66084OooO0oO.OooO00o(itemViewType);
                    long j6 = OooO00o2.f66076OooO0OO;
                    if (j6 != j4) {
                        nanoTime2 = (nanoTime2 / 4) + ((j6 / 4) * 3);
                    }
                    OooO00o2.f66076OooO0OO = nanoTime2;
                }
            } else {
                i3 = 1;
                j2 = 3;
                j3 = 4;
                j4 = 0;
            }
            if (i2 != 0 && !recyclerView.mState.f66100OooO0oO && abstractC22078OooOooOCreateViewHolder.hasAnyOfTheFlags(8192)) {
                abstractC22078OooOooOCreateViewHolder.setFlags(0, 8192);
                if (recyclerView.mState.f66102OooOO0) {
                    AbstractC22064OooOO0o.OooO0o0(abstractC22078OooOooOCreateViewHolder);
                    AbstractC22064OooOO0o abstractC22064OooOO0o = recyclerView.mItemAnimator;
                    abstractC22078OooOooOCreateViewHolder.getUnmodifiedPayloads();
                    abstractC22064OooOO0o.getClass();
                    AbstractC22064OooOO0o.OooO0OO oooO0OO = new AbstractC22064OooOO0o.OooO0OO();
                    oooO0OO.OooO00o(abstractC22078OooOooOCreateViewHolder);
                    recyclerView.recordAnimationInfoIfBouncedHiddenView(abstractC22078OooOooOCreateViewHolder, oooO0OO);
                }
            }
            if (!recyclerView.mState.f66100OooO0oO || !abstractC22078OooOooOCreateViewHolder.isBound()) {
                if (!abstractC22078OooOooOCreateViewHolder.isBound() || abstractC22078OooOooOCreateViewHolder.needsUpdate() || abstractC22078OooOooOCreateViewHolder.isInvalid()) {
                    int iOooO0o3 = recyclerView.mAdapterHelper.OooO0o(i, 0);
                    abstractC22078OooOooOCreateViewHolder.mBindingAdapter = null;
                    abstractC22078OooOooOCreateViewHolder.mOwnerRecyclerView = recyclerView;
                    int itemViewType2 = abstractC22078OooOooOCreateViewHolder.getItemViewType();
                    long nanoTime3 = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        long j7 = this.f66084OooO0oO.OooO00o(itemViewType2).f66077OooO0Oo;
                        if (j7 == j4 || j7 + nanoTime3 < j) {
                        }
                    }
                    recyclerView.mAdapter.bindViewHolder(abstractC22078OooOooOCreateViewHolder, iOooO0o3);
                    long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                    C22070OooOo0.OooO00o OooO00o3 = this.f66084OooO0oO.OooO00o(abstractC22078OooOooOCreateViewHolder.getItemViewType());
                    long j8 = OooO00o3.f66077OooO0Oo;
                    if (j8 != j4) {
                        nanoTime4 = (nanoTime4 / j3) + ((j8 / j3) * j2);
                    }
                    OooO00o3.f66077OooO0Oo = nanoTime4;
                    if (recyclerView.isAccessibilityEnabled()) {
                        View view3 = abstractC22078OooOooOCreateViewHolder.itemView;
                        if (ViewCompat.getImportantForAccessibility(view3) == 0) {
                            i4 = i3;
                            ViewCompat.setImportantForAccessibility(view3, i4);
                        } else {
                            i4 = i3;
                        }
                        C22056OooOooO c22056OooOooO = recyclerView.mAccessibilityDelegate;
                        if (c22056OooOooO != null) {
                            AccessibilityDelegateCompat itemDelegate = c22056OooOooO.getItemDelegate();
                            if (itemDelegate instanceof C22056OooOooO.OooO00o) {
                                C22056OooOooO.OooO00o oooO00o3 = (C22056OooOooO.OooO00o) itemDelegate;
                                oooO00o3.getClass();
                                AccessibilityDelegateCompat accessibilityDelegate = ViewCompat.getAccessibilityDelegate(view3);
                                if (accessibilityDelegate != null && accessibilityDelegate != oooO00o3) {
                                    oooO00o3.f66031OooO0O0.put(view3, accessibilityDelegate);
                                }
                            }
                            ViewCompat.setAccessibilityDelegate(view3, itemDelegate);
                        }
                    } else {
                        i4 = i3;
                    }
                    if (recyclerView.mState.f66100OooO0oO) {
                        abstractC22078OooOooOCreateViewHolder.mPreLayoutPosition = i;
                    }
                    i5 = i4;
                }
                layoutParams = abstractC22078OooOooOCreateViewHolder.itemView.getLayoutParams();
                if (layoutParams != null) {
                    c22066OooOOOo = (C22066OooOOOo) recyclerView.generateDefaultLayoutParams();
                    abstractC22078OooOooOCreateViewHolder.itemView.setLayoutParams(c22066OooOOOo);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    c22066OooOOOo = (C22066OooOOOo) layoutParams;
                } else {
                    c22066OooOOOo = (C22066OooOOOo) recyclerView.generateLayoutParams(layoutParams);
                    abstractC22078OooOooOCreateViewHolder.itemView.setLayoutParams(c22066OooOOOo);
                }
                c22066OooOOOo.mViewHolder = abstractC22078OooOooOCreateViewHolder;
                if (i2 != 0 && i5 != 0) {
                    z2 = i4;
                }
                c22066OooOOOo.mPendingInvalidate = z2;
                return abstractC22078OooOooOCreateViewHolder;
            }
            abstractC22078OooOooOCreateViewHolder.mPreLayoutPosition = i;
            i5 = 0;
            i4 = i3;
            layoutParams = abstractC22078OooOooOCreateViewHolder.itemView.getLayoutParams();
            if (layoutParams != null) {
            }
            c22066OooOOOo.mViewHolder = abstractC22078OooOooOCreateViewHolder;
            if (i2 != 0) {
                z2 = i4;
            }
            c22066OooOOOo.mPendingInvalidate = z2;
            return abstractC22078OooOooOCreateViewHolder;
        }

        public final void OooOO0o(AbstractC22078OooOooO abstractC22078OooOooO) {
            if (abstractC22078OooOooO.mInChangeScrap) {
                this.f66079OooO0O0.remove(abstractC22078OooOooO);
            } else {
                this.f66078OooO00o.remove(abstractC22078OooOooO);
            }
            abstractC22078OooOooO.mScrapContainer = null;
            abstractC22078OooOooO.mInChangeScrap = false;
            abstractC22078OooOooO.clearReturnedFromScrapFlag();
        }

        public final void OooOOO0() {
            OooOOOO oooOOOO = RecyclerView.this.mLayout;
            this.f66082OooO0o = this.f66083OooO0o0 + (oooOOOO != null ? oooOOOO.mPrefetchMaxCountObserved : 0);
            ArrayList<AbstractC22078OooOooO> arrayList = this.f66080OooO0OO;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f66082OooO0o; size--) {
                OooO0oO(size);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$OooOo0o, reason: case insensitive filesystem */
    public interface InterfaceC22072OooOo0o {
        void OooO00o();
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$OooOoO, reason: case insensitive filesystem */
    public static abstract class AbstractC22073OooOoO {
        private OooOOOO mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private final OooO00o mRecyclingAction;
        private boolean mRunning;
        private boolean mStarted;
        private int mTargetPosition = -1;
        private View mTargetView;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$OooOoO$OooO00o */
        public static class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public int f66086OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public int f66087OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public int f66088OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f66089OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public boolean f66090OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public Interpolator f66091OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public int f66092OooO0oO;

            public final void OooO00o(RecyclerView recyclerView) {
                int i = this.f66089OooO0Oo;
                if (i >= 0) {
                    this.f66089OooO0Oo = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f66090OooO0o = false;
                    return;
                }
                if (!this.f66090OooO0o) {
                    this.f66092OooO0oO = 0;
                    return;
                }
                Interpolator interpolator = this.f66091OooO0o0;
                if (interpolator != null && this.f66088OooO0OO < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                int i2 = this.f66088OooO0OO;
                if (i2 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                recyclerView.mViewFlinger.OooO0O0(this.f66086OooO00o, this.f66087OooO0O0, interpolator, i2);
                int i3 = this.f66092OooO0oO + 1;
                this.f66092OooO0oO = i3;
                if (i3 > 10) {
                    Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f66090OooO0o = false;
            }

            public final void OooO0O0(int i, int i2, Interpolator interpolator, int i3) {
                this.f66086OooO00o = i;
                this.f66087OooO0O0 = i2;
                this.f66088OooO0OO = i3;
                this.f66091OooO0o0 = interpolator;
                this.f66090OooO0o = true;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$OooOoO$OooO0O0 */
        public interface OooO0O0 {
            PointF computeScrollVectorForPosition(int i);
        }

        public AbstractC22073OooOoO() {
            OooO00o oooO00o = new OooO00o();
            oooO00o.f66089OooO0Oo = -1;
            oooO00o.f66090OooO0o = false;
            oooO00o.f66092OooO0oO = 0;
            oooO00o.f66086OooO00o = 0;
            oooO00o.f66087OooO0O0 = 0;
            oooO00o.f66088OooO0OO = Integer.MIN_VALUE;
            oooO00o.f66091OooO0o0 = null;
            this.mRecyclingAction = oooO00o;
        }

        public PointF computeScrollVectorForPosition(int i) {
            Object layoutManager = getLayoutManager();
            if (layoutManager instanceof OooO0O0) {
                return ((OooO0O0) layoutManager).computeScrollVectorForPosition(i);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + OooO0O0.class.getCanonicalName());
            return null;
        }

        public View findViewByPosition(int i) {
            return this.mRecyclerView.mLayout.findViewByPosition(i);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        public OooOOOO getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i) {
            this.mRecyclerView.scrollToPosition(i);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        public void normalize(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        public void onAnimation(int i, int i2) {
            PointF pointFComputeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f = pointFComputeScrollVectorForPosition.x;
                if (f != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.OooO00o(recyclerView);
                    stop();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i, i2, recyclerView.mState, this.mRecyclingAction);
                OooO00o oooO00o = this.mRecyclingAction;
                boolean z = oooO00o.f66089OooO0Oo >= 0;
                oooO00o.OooO00o(recyclerView);
                if (z && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.OooO00o();
                }
            }
        }

        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }

        public abstract void onSeekTargetStep(int i, int i2, C22075OooOoOO c22075OooOoOO, OooO00o oooO00o);

        public abstract void onStart();

        public abstract void onStop();

        public abstract void onTargetFound(View view, C22075OooOoOO c22075OooOoOO, OooO00o oooO00o);

        public void setTargetPosition(int i) {
            this.mTargetPosition = i;
        }

        public void start(RecyclerView recyclerView, OooOOOO oooOOOO) {
            RunnableC22076OooOoo runnableC22076OooOoo = recyclerView.mViewFlinger;
            RecyclerView.this.removeCallbacks(runnableC22076OooOoo);
            runnableC22076OooOoo.f66110OooOoO0.abortAnimation();
            if (this.mStarted) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = oooOOOO;
            int i = this.mTargetPosition;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.f66094OooO00o = i;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.mViewFlinger.OooO00o();
            this.mStarted = true;
        }

        public final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.f66094OooO00o = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$OooOoO0, reason: case insensitive filesystem */
    public static class C22074OooOoO0 implements InterfaceC22069OooOOoo {
        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC22069OooOOoo
        public final void OooO00o(RecyclerView recyclerView, MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC22069OooOOoo
        public final void OooO0o0(boolean z) {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$OooOoOO, reason: case insensitive filesystem */
    public static class C22075OooOoOO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f66093OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f66094OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f66095OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f66096OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f66097OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f66098OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f66099OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f66100OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f66101OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f66102OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f66103OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f66104OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public int f66105OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public long f66106OooOOO0;

        public final void OooO00o(int i) {
            if ((this.f66097OooO0Oo & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f66097OooO0Oo));
        }

        public final int OooO0O0() {
            return this.f66100OooO0oO ? this.f66095OooO0O0 - this.f66096OooO0OO : this.f66099OooO0o0;
        }

        public final String toString() {
            return "State{mTargetPosition=" + this.f66094OooO00o + ", mData=null, mItemCount=" + this.f66099OooO0o0 + ", mIsMeasuring=" + this.f66093OooO + ", mPreviousLayoutItemCount=" + this.f66095OooO0O0 + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f66096OooO0OO + ", mStructureChanged=" + this.f66098OooO0o + ", mInPreLayout=" + this.f66100OooO0oO + ", mRunSimpleAnimations=" + this.f66102OooOO0 + ", mRunPredictiveAnimations=" + this.f66103OooOO0O + '}';
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$OooOoo, reason: case insensitive filesystem */
    public class RunnableC22076OooOoo implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f66107OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f66108OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public Interpolator f66109OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public OverScroller f66110OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public boolean f66111OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public boolean f66113OooOoo0;

        public RunnableC22076OooOoo() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f66109OooOoO = interpolator;
            this.f66111OooOoOO = false;
            this.f66113OooOoo0 = false;
            this.f66110OooOoO0 = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final void OooO00o() {
            if (this.f66111OooOoOO) {
                this.f66113OooOoo0 = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            ViewCompat.postOnAnimation(recyclerView, this);
        }

        public final void OooO0O0(int i, int i2, Interpolator interpolator, int i3) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i3 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i);
                int iAbs2 = Math.abs(i2);
                boolean z = iAbs > iAbs2;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z) {
                    iAbs = iAbs2;
                }
                i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f66109OooOoO != interpolator) {
                this.f66109OooOoO = interpolator;
                this.f66110OooOoO0 = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.f66107OooOo = 0;
            this.f66108OooOo0o = 0;
            recyclerView.setScrollState(2);
            this.f66110OooOoO0.startScroll(0, 0, i, i2, i4);
            OooO00o();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                recyclerView.removeCallbacks(this);
                this.f66110OooOoO0.abortAnimation();
                return;
            }
            this.f66113OooOoo0 = false;
            this.f66111OooOoOO = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f66110OooOoO0;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f66108OooOo0o;
                int i5 = currY - this.f66107OooOo;
                this.f66108OooOo0o = currX;
                this.f66107OooOo = currY;
                int i6 = i4;
                int[] iArr = recyclerView.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView.dispatchNestedPreScroll(i6, i5, iArr, null, 1)) {
                    int[] iArr2 = recyclerView.mReusableIntPair;
                    i6 -= iArr2[0];
                    i = i5 - iArr2[1];
                } else {
                    i = i5;
                }
                int i7 = i6;
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.considerReleasingGlowsOnScroll(i7, i);
                }
                if (recyclerView.mAdapter != null) {
                    int[] iArr3 = recyclerView.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView.scrollStep(i7, i, iArr3);
                    int[] iArr4 = recyclerView.mReusableIntPair;
                    int i8 = iArr4[0];
                    int i9 = iArr4[1];
                    i7 -= i8;
                    i -= i9;
                    AbstractC22073OooOoO abstractC22073OooOoO = recyclerView.mLayout.mSmoothScroller;
                    if (abstractC22073OooOoO != null && !abstractC22073OooOoO.isPendingInitialRun() && abstractC22073OooOoO.isRunning()) {
                        int iOooO0O0 = recyclerView.mState.OooO0O0();
                        if (iOooO0O0 == 0) {
                            abstractC22073OooOoO.stop();
                        } else if (abstractC22073OooOoO.getTargetPosition() >= iOooO0O0) {
                            abstractC22073OooOoO.setTargetPosition(iOooO0O0 - 1);
                            abstractC22073OooOoO.onAnimation(i8, i9);
                        } else {
                            abstractC22073OooOoO.onAnimation(i8, i9);
                        }
                    }
                    i3 = i9;
                    i2 = i8;
                } else {
                    i2 = 0;
                    i3 = 0;
                }
                if (!recyclerView.mItemDecorations.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr5 = recyclerView.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView.dispatchNestedScroll(i2, i3, i7, i, null, 1, iArr5);
                int[] iArr6 = recyclerView.mReusableIntPair;
                int i10 = i7 - iArr6[0];
                int i11 = i - iArr6[1];
                if (i2 != 0 || i3 != 0) {
                    recyclerView.dispatchOnScrolled(i2, i3);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i10 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i11 != 0));
                AbstractC22073OooOoO abstractC22073OooOoO2 = recyclerView.mLayout.mSmoothScroller;
                if ((abstractC22073OooOoO2 == null || !abstractC22073OooOoO2.isPendingInitialRun()) && z) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i12 = i10 < 0 ? -currVelocity : i10 > 0 ? currVelocity : 0;
                        if (i11 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i11 <= 0) {
                            currVelocity = 0;
                        }
                        recyclerView.absorbGlows(i12, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RunnableC22046OooOOo0.OooO0O0 oooO0O0 = recyclerView.mPrefetchRegistry;
                        int[] iArr7 = oooO0O0.f66002OooO0OO;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        oooO0O0.f66003OooO0Oo = 0;
                    }
                } else {
                    OooO00o();
                    RunnableC22046OooOOo0 runnableC22046OooOOo0 = recyclerView.mGapWorker;
                    if (runnableC22046OooOOo0 != null) {
                        runnableC22046OooOOo0.OooO00o(recyclerView, i2, i3);
                    }
                }
            }
            AbstractC22073OooOoO abstractC22073OooOoO3 = recyclerView.mLayout.mSmoothScroller;
            if (abstractC22073OooOoO3 != null && abstractC22073OooOoO3.isPendingInitialRun()) {
                abstractC22073OooOoO3.onAnimation(0, 0);
            }
            this.f66111OooOoOO = false;
            if (this.f66113OooOoo0) {
                recyclerView.removeCallbacks(this);
                ViewCompat.postOnAnimation(recyclerView, this);
            } else {
                recyclerView.setScrollState(0);
                recyclerView.stopNestedScroll(1);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$OooOoo0, reason: case insensitive filesystem */
    public static abstract class AbstractC22077OooOoo0 {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$OooOooO, reason: case insensitive filesystem */
    public static abstract class AbstractC22078OooOooO {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        AbstractC22062OooO0oO<? extends AbstractC22078OooOooO> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        AbstractC22078OooOooO mShadowedHolder = null;
        AbstractC22078OooOooO mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        C22071OooOo0O mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public AbstractC22078OooOooO(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && ViewCompat.hasTransientState(this.itemView);
        }

        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final AbstractC22062OooO0oO<? extends AbstractC22078OooOooO> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            AbstractC22062OooO0oO adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !ViewCompat.hasTransientState(this.itemView);
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((C22066OooOOOo) this.itemView.getLayoutParams()).mInsetsDirty = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = ViewCompat.getImportantForAccessibility(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            int i = this.mIsRecyclableCount;
            int i2 = z ? i - 1 : i + 1;
            this.mIsRecyclableCount = i2;
            if (i2 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i2 == 1) {
                this.mFlags |= 16;
            } else if (z && i2 == 0) {
                this.mFlags &= -17;
            }
        }

        public void setScrapContainer(C22071OooOo0O c22071OooOo0O, boolean z) {
            this.mScrapContainer = c22071OooOo0O;
            this.mInChangeScrap = z;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            sbOooO0OO.append(Integer.toHexString(hashCode()));
            sbOooO0OO.append(" position=");
            sbOooO0OO.append(this.mPosition);
            sbOooO0OO.append(" id=");
            sbOooO0OO.append(this.mItemId);
            sbOooO0OO.append(", oldPos=");
            sbOooO0OO.append(this.mOldPosition);
            sbOooO0OO.append(", pLpos:");
            sbOooO0OO.append(this.mPreLayoutPosition);
            StringBuilder sb = new StringBuilder(sbOooO0OO.toString());
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.OooOO0o(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public Parcelable f66114OooOo0o;

        public class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f66114OooOo0o = parcel.readParcelable(classLoader == null ? OooOOOO.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f66114OooOo0o, 0);
        }
    }

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new OooO0OO();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void addAnimatingView(AbstractC22078OooOooO abstractC22078OooOooO) {
        View view = abstractC22078OooOooO.itemView;
        boolean z = view.getParent() == this;
        this.mRecycler.OooOO0o(getChildViewHolder(view));
        if (abstractC22078OooOooO.isTmpDetached()) {
            this.mChildHelper.OooO0O0(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.mChildHelper.OooO00o(view, -1, true);
            return;
        }
        C22030OooO0oO c22030OooO0oO = this.mChildHelper;
        int iIndexOfChild = RecyclerView.this.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            c22030OooO0oO.f65829OooO0O0.OooO0oo(iIndexOfChild);
            c22030OooO0oO.OooO(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    private void animateChange(AbstractC22078OooOooO abstractC22078OooOooO, AbstractC22078OooOooO abstractC22078OooOooO2, AbstractC22064OooOO0o.OooO0OO oooO0OO, AbstractC22064OooOO0o.OooO0OO oooO0OO2, boolean z, boolean z2) {
        abstractC22078OooOooO.setIsRecyclable(false);
        if (z) {
            addAnimatingView(abstractC22078OooOooO);
        }
        if (abstractC22078OooOooO != abstractC22078OooOooO2) {
            if (z2) {
                addAnimatingView(abstractC22078OooOooO2);
            }
            abstractC22078OooOooO.mShadowedHolder = abstractC22078OooOooO2;
            addAnimatingView(abstractC22078OooOooO);
            this.mRecycler.OooOO0o(abstractC22078OooOooO);
            abstractC22078OooOooO2.setIsRecyclable(false);
            abstractC22078OooOooO2.mShadowingHolder = abstractC22078OooOooO;
        }
        if (this.mItemAnimator.OooO0O0(abstractC22078OooOooO, abstractC22078OooOooO2, oooO0OO, oooO0OO2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(AbstractC22078OooOooO abstractC22078OooOooO) {
        WeakReference<RecyclerView> weakReference = abstractC22078OooOooO.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == abstractC22078OooOooO.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            abstractC22078OooOooO.mNestedRecyclerView = null;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(OooOOOO.class);
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                } catch (NoSuchMethodException e) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e2);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((OooOOOO) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e7);
            }
        }
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        AccessibilityEventCompat.setContentChangeTypes(accessibilityEventObtain, i);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void dispatchLayoutStep1() {
        Oooo0.OooO00o oooO00o;
        this.mState.OooO00o(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f66093OooO = false;
        startInterceptRequestLayout();
        Oooo0 oooo0 = this.mViewInfoStore;
        oooo0.f66032OooO00o.clear();
        oooo0.f66033OooO0O0.OooO00o();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        C22075OooOoOO c22075OooOoOO = this.mState;
        c22075OooOoOO.f66101OooO0oo = c22075OooOoOO.f66102OooOO0 && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        c22075OooOoOO.f66100OooO0oO = c22075OooOoOO.f66103OooOO0O;
        c22075OooOoOO.f66099OooO0o0 = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f66102OooOO0) {
            int iOooO0o0 = this.mChildHelper.OooO0o0();
            for (int i = 0; i < iOooO0o0; i++) {
                AbstractC22078OooOooO childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0Oo(i));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    AbstractC22064OooOO0o abstractC22064OooOO0o = this.mItemAnimator;
                    AbstractC22064OooOO0o.OooO0o0(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    abstractC22064OooOO0o.getClass();
                    AbstractC22064OooOO0o.OooO0OO oooO0OO = new AbstractC22064OooOO0o.OooO0OO();
                    oooO0OO.OooO00o(childViewHolderInt);
                    C20493Oooo00o<AbstractC22078OooOooO, Oooo0.OooO00o> c20493Oooo00o = this.mViewInfoStore.f66032OooO00o;
                    Oooo0.OooO00o OooO00o2 = c20493Oooo00o.get(childViewHolderInt);
                    if (OooO00o2 == null) {
                        OooO00o2 = Oooo0.OooO00o.OooO00o();
                        c20493Oooo00o.put(childViewHolderInt, OooO00o2);
                    }
                    OooO00o2.f66036OooO0O0 = oooO0OO;
                    OooO00o2.f66035OooO00o |= 4;
                    if (this.mState.f66101OooO0oo && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.f66033OooO0O0.OooO0o0(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f66103OooOO0O) {
            saveOldPositions();
            C22075OooOoOO c22075OooOoOO2 = this.mState;
            boolean z = c22075OooOoOO2.f66098OooO0o;
            c22075OooOoOO2.f66098OooO0o = false;
            this.mLayout.onLayoutChildren(this.mRecycler, c22075OooOoOO2);
            this.mState.f66098OooO0o = z;
            for (int i2 = 0; i2 < this.mChildHelper.OooO0o0(); i2++) {
                AbstractC22078OooOooO childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.OooO0Oo(i2));
                if (!childViewHolderInt2.shouldIgnore() && ((oooO00o = this.mViewInfoStore.f66032OooO00o.get(childViewHolderInt2)) == null || (oooO00o.f66035OooO00o & 4) == 0)) {
                    AbstractC22064OooOO0o.OooO0o0(childViewHolderInt2);
                    boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    AbstractC22064OooOO0o abstractC22064OooOO0o2 = this.mItemAnimator;
                    childViewHolderInt2.getUnmodifiedPayloads();
                    abstractC22064OooOO0o2.getClass();
                    AbstractC22064OooOO0o.OooO0OO oooO0OO2 = new AbstractC22064OooOO0o.OooO0OO();
                    oooO0OO2.OooO00o(childViewHolderInt2);
                    if (zHasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, oooO0OO2);
                    } else {
                        C20493Oooo00o<AbstractC22078OooOooO, Oooo0.OooO00o> c20493Oooo00o2 = this.mViewInfoStore.f66032OooO00o;
                        Oooo0.OooO00o OooO00o3 = c20493Oooo00o2.get(childViewHolderInt2);
                        if (OooO00o3 == null) {
                            OooO00o3 = Oooo0.OooO00o.OooO00o();
                            c20493Oooo00o2.put(childViewHolderInt2, OooO00o3);
                        }
                        OooO00o3.f66035OooO00o |= 2;
                        OooO00o3.f66036OooO0O0 = oooO0OO2;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f66097OooO0Oo = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.OooO00o(6);
        this.mAdapterHelper.OooO0OO();
        this.mState.f66099OooO0o0 = this.mAdapter.getItemCount();
        this.mState.f66096OooO0OO = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f66114OooOo0o;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        C22075OooOoOO c22075OooOoOO = this.mState;
        c22075OooOoOO.f66100OooO0oO = false;
        this.mLayout.onLayoutChildren(this.mRecycler, c22075OooOoOO);
        C22075OooOoOO c22075OooOoOO2 = this.mState;
        c22075OooOoOO2.f66098OooO0o = false;
        c22075OooOoOO2.f66102OooOO0 = c22075OooOoOO2.f66102OooOO0 && this.mItemAnimator != null;
        c22075OooOoOO2.f66097OooO0Oo = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        RecyclerView recyclerView;
        this.mState.OooO00o(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C22075OooOoOO c22075OooOoOO = this.mState;
        c22075OooOoOO.f66097OooO0Oo = 1;
        if (c22075OooOoOO.f66102OooOO0) {
            for (int iOooO0o0 = this.mChildHelper.OooO0o0() - 1; iOooO0o0 >= 0; iOooO0o0--) {
                AbstractC22078OooOooO childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0Oo(iOooO0o0));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    this.mItemAnimator.getClass();
                    AbstractC22064OooOO0o.OooO0OO oooO0OO = new AbstractC22064OooOO0o.OooO0OO();
                    oooO0OO.OooO00o(childViewHolderInt);
                    AbstractC22078OooOooO abstractC22078OooOooOOooO0O0 = this.mViewInfoStore.f66033OooO0O0.OooO0O0(changedHolderKey);
                    if (abstractC22078OooOooOOooO0O0 == null || abstractC22078OooOooOOooO0O0.shouldIgnore()) {
                        this.mViewInfoStore.OooO00o(childViewHolderInt, oooO0OO);
                    } else {
                        Oooo0.OooO00o oooO00o = this.mViewInfoStore.f66032OooO00o.get(abstractC22078OooOooOOooO0O0);
                        boolean z = (oooO00o == null || (oooO00o.f66035OooO00o & 1) == 0) ? false : true;
                        Oooo0.OooO00o oooO00o2 = this.mViewInfoStore.f66032OooO00o.get(childViewHolderInt);
                        boolean z2 = (oooO00o2 == null || (oooO00o2.f66035OooO00o & 1) == 0) ? false : true;
                        if (z && abstractC22078OooOooOOooO0O0 == childViewHolderInt) {
                            this.mViewInfoStore.OooO00o(childViewHolderInt, oooO0OO);
                        } else {
                            AbstractC22064OooOO0o.OooO0OO oooO0OOOooO0O0 = this.mViewInfoStore.OooO0O0(abstractC22078OooOooOOooO0O0, 4);
                            this.mViewInfoStore.OooO00o(childViewHolderInt, oooO0OO);
                            AbstractC22064OooOO0o.OooO0OO oooO0OOOooO0O02 = this.mViewInfoStore.OooO0O0(childViewHolderInt, 8);
                            if (oooO0OOOooO0O0 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, abstractC22078OooOooOOooO0O0);
                            } else {
                                animateChange(abstractC22078OooOooOOooO0O0, childViewHolderInt, oooO0OOOooO0O0, oooO0OOOooO0O02, z, z2);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            Oooo0 oooo0 = recyclerView.mViewInfoStore;
            Oooo0.OooO0O0 oooO0O0 = recyclerView.mViewInfoProcessCallback;
            C20493Oooo00o<AbstractC22078OooOooO, Oooo0.OooO00o> c20493Oooo00o = oooo0.f66032OooO00o;
            for (int i = c20493Oooo00o.f58550OooOoO0 - 1; i >= 0; i--) {
                AbstractC22078OooOooO abstractC22078OooOooOOooO0oO = c20493Oooo00o.OooO0oO(i);
                Oooo0.OooO00o oooO00oOooO = c20493Oooo00o.OooO(i);
                int i2 = oooO00oOooO.f66035OooO00o;
                if ((i2 & 3) == 3) {
                    RecyclerView recyclerView2 = RecyclerView.this;
                    recyclerView2.mLayout.removeAndRecycleView(abstractC22078OooOooOOooO0oO.itemView, recyclerView2.mRecycler);
                } else if ((i2 & 1) != 0) {
                    AbstractC22064OooOO0o.OooO0OO oooO0OO2 = oooO00oOooO.f66036OooO0O0;
                    if (oooO0OO2 == null) {
                        RecyclerView recyclerView3 = RecyclerView.this;
                        recyclerView3.mLayout.removeAndRecycleView(abstractC22078OooOooOOooO0oO.itemView, recyclerView3.mRecycler);
                    } else {
                        AbstractC22064OooOO0o.OooO0OO oooO0OO3 = oooO00oOooO.f66037OooO0OO;
                        RecyclerView recyclerView4 = RecyclerView.this;
                        recyclerView4.mRecycler.OooOO0o(abstractC22078OooOooOOooO0oO);
                        recyclerView4.animateDisappearance(abstractC22078OooOooOOooO0oO, oooO0OO2, oooO0OO3);
                    }
                } else if ((i2 & 14) == 14) {
                    RecyclerView.this.animateAppearance(abstractC22078OooOooOOooO0oO, oooO00oOooO.f66036OooO0O0, oooO00oOooO.f66037OooO0OO);
                } else if ((i2 & 12) == 12) {
                    AbstractC22064OooOO0o.OooO0OO oooO0OO4 = oooO00oOooO.f66036OooO0O0;
                    AbstractC22064OooOO0o.OooO0OO oooO0OO5 = oooO00oOooO.f66037OooO0OO;
                    C22060OooO0Oo c22060OooO0Oo = (C22060OooO0Oo) oooO0O0;
                    c22060OooO0Oo.getClass();
                    abstractC22078OooOooOOooO0oO.setIsRecyclable(false);
                    RecyclerView recyclerView5 = RecyclerView.this;
                    if (recyclerView5.mDataSetHasChangedAfterLayout) {
                        if (recyclerView5.mItemAnimator.OooO0O0(abstractC22078OooOooOOooO0oO, abstractC22078OooOooOOooO0oO, oooO0OO4, oooO0OO5)) {
                            recyclerView5.postAnimationRunner();
                        }
                    } else if (recyclerView5.mItemAnimator.OooO0Oo(abstractC22078OooOooOOooO0oO, oooO0OO4, oooO0OO5)) {
                        recyclerView5.postAnimationRunner();
                    }
                } else if ((i2 & 4) != 0) {
                    AbstractC22064OooOO0o.OooO0OO oooO0OO6 = oooO00oOooO.f66036OooO0O0;
                    RecyclerView recyclerView6 = RecyclerView.this;
                    recyclerView6.mRecycler.OooOO0o(abstractC22078OooOooOOooO0oO);
                    recyclerView6.animateDisappearance(abstractC22078OooOooOOooO0oO, oooO0OO6, null);
                } else if ((i2 & 8) != 0) {
                    RecyclerView.this.animateAppearance(abstractC22078OooOooOOooO0oO, oooO00oOooO.f66036OooO0O0, oooO00oOooO.f66037OooO0OO);
                }
                oooO00oOooO.f66035OooO00o = 0;
                oooO00oOooO.f66036OooO0O0 = null;
                oooO00oOooO.f66037OooO0OO = null;
                Oooo0.OooO00o.f66034OooO0Oo.release(oooO00oOooO);
            }
        } else {
            recyclerView = this;
        }
        recyclerView.mLayout.removeAndRecycleScrapInt(recyclerView.mRecycler);
        C22075OooOoOO c22075OooOoOO2 = recyclerView.mState;
        c22075OooOoOO2.f66095OooO0O0 = c22075OooOoOO2.f66099OooO0o0;
        recyclerView.mDataSetHasChangedAfterLayout = false;
        recyclerView.mDispatchItemsChangedEvent = false;
        c22075OooOoOO2.f66102OooOO0 = false;
        c22075OooOoOO2.f66103OooOO0O = false;
        recyclerView.mLayout.mRequestedSimpleAnimations = false;
        ArrayList<AbstractC22078OooOooO> arrayList = recyclerView.mRecycler.f66079OooO0O0;
        if (arrayList != null) {
            arrayList.clear();
        }
        OooOOOO oooOOOO = recyclerView.mLayout;
        if (oooOOOO.mPrefetchMaxObservedInInitialPrefetch) {
            oooOOOO.mPrefetchMaxCountObserved = 0;
            oooOOOO.mPrefetchMaxObservedInInitialPrefetch = false;
            recyclerView.mRecycler.OooOOO0();
        }
        recyclerView.mLayout.onLayoutCompleted(recyclerView.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        Oooo0 oooo02 = recyclerView.mViewInfoStore;
        oooo02.f66032OooO00o.clear();
        oooo02.f66033OooO0O0.OooO00o();
        int[] iArr = recyclerView.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        InterfaceC22069OooOOoo interfaceC22069OooOOoo = this.mInterceptingOnItemTouchListener;
        if (interfaceC22069OooOOoo == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        interfaceC22069OooOOoo.OooO00o(this, motionEvent);
        int action = motionEvent.getAction();
        if (action != 3 && action != 1) {
            return true;
        }
        this.mInterceptingOnItemTouchListener = null;
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            InterfaceC22069OooOOoo interfaceC22069OooOOoo = this.mOnItemTouchListeners.get(i);
            if (interfaceC22069OooOOoo.OooO0OO(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = interfaceC22069OooOOoo;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int iOooO0o0 = this.mChildHelper.OooO0o0();
        if (iOooO0o0 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iOooO0o0; i3++) {
            AbstractC22078OooOooO childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0Oo(i3));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        AbstractC22078OooOooO abstractC22078OooOooOFindViewHolderForAdapterPosition;
        C22075OooOoOO c22075OooOoOO = this.mState;
        int i = c22075OooOoOO.f66104OooOO0o;
        if (i == -1) {
            i = 0;
        }
        int iOooO0O0 = c22075OooOoOO.OooO0O0();
        for (int i2 = i; i2 < iOooO0O0; i2++) {
            AbstractC22078OooOooO abstractC22078OooOooOFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (abstractC22078OooOooOFindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (abstractC22078OooOooOFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return abstractC22078OooOooOFindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = Math.min(iOooO0O0, i);
        do {
            iMin--;
            if (iMin < 0 || (abstractC22078OooOooOFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!abstractC22078OooOooOFindViewHolderForAdapterPosition.itemView.hasFocusable());
        return abstractC22078OooOooOFindViewHolderForAdapterPosition.itemView;
    }

    public static AbstractC22078OooOooO getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((C22066OooOOOo) view.getLayoutParams()).mViewHolder;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        C22066OooOOOo c22066OooOOOo = (C22066OooOOOo) view.getLayoutParams();
        Rect rect2 = c22066OooOOOo.mDecorInsets;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c22066OooOOOo).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c22066OooOOOo).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c22066OooOOOo).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c22066OooOOOo).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + FilenameUtils.EXTENSION_SEPARATOR + str;
    }

    private NestedScrollingChildHelper getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new NestedScrollingChildHelper(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j, AbstractC22078OooOooO abstractC22078OooOooO, AbstractC22078OooOooO abstractC22078OooOooO2) {
        int iOooO0o0 = this.mChildHelper.OooO0o0();
        for (int i = 0; i < iOooO0o0; i++) {
            AbstractC22078OooOooO childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0Oo(i));
            if (childViewHolderInt != abstractC22078OooOooO && getChangedHolderKey(childViewHolderInt) == j) {
                AbstractC22062OooO0oO abstractC22062OooO0oO = this.mAdapter;
                if (abstractC22062OooO0oO == null || !abstractC22062OooO0oO.hasStableIds()) {
                    StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(childViewHolderInt);
                    sb.append(" \n View Holder 2:");
                    sb.append(abstractC22078OooOooO);
                    throw new IllegalStateException(androidx.recyclerview.widget.OooO0o.OooO00o(this, sb));
                }
                StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(childViewHolderInt);
                sb2.append(" \n View Holder 2:");
                sb2.append(abstractC22078OooOooO);
                throw new IllegalStateException(androidx.recyclerview.widget.OooO0o.OooO00o(this, sb2));
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC22078OooOooO2 + " cannot be found but it is necessary for " + abstractC22078OooOooO + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int iOooO0o0 = this.mChildHelper.OooO0o0();
        for (int i = 0; i < iOooO0o0; i++) {
            AbstractC22078OooOooO childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0Oo(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    private void initAutofill() {
        if (ViewCompat.getImportantForAutofill(this) == 0) {
            ViewCompat.setImportantForAutofill(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C22030OooO0oO(new C22061OooO0o0());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        byte b = -1;
        int i3 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i4 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i2 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            b = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                b = 0;
            }
        }
        if (i == 1) {
            return b < 0 || (b == 0 && i2 * i3 < 0);
        }
        if (i == 2) {
            return b > 0 || (b == 0 && i2 * i3 > 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return b < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return b > 0;
        }
        StringBuilder sb = new StringBuilder("Invalid direction: ");
        sb.append(i);
        throw new IllegalArgumentException(androidx.recyclerview.widget.OooO0o.OooO00o(this, sb));
    }

    private void nestedScrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zCanScrollHorizontally = oooOOOO.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        startNestedScroll(zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0, i3);
        if (dispatchNestedPreScroll(zCanScrollHorizontally ? i : 0, zCanScrollVertically ? i2 : 0, this.mReusableIntPair, this.mScrollOffset, i3)) {
            int[] iArr2 = this.mReusableIntPair;
            i -= iArr2[0];
            i2 -= iArr2[1];
        }
        scrollByInternal(zCanScrollHorizontally ? i : 0, zCanScrollVertically ? i2 : 0, motionEvent, i3);
        RunnableC22046OooOOo0 runnableC22046OooOOo0 = this.mGapWorker;
        if (runnableC22046OooOOo0 != null && (i != 0 || i2 != 0)) {
            runnableC22046OooOOo0.OooO00o(this, i, i2);
        }
        stopNestedScroll(i3);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z;
        boolean z2 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            androidx.recyclerview.widget.OooO00o oooO00o = this.mAdapterHelper;
            oooO00o.OooOO0O(oooO00o.f65792OooO0O0);
            oooO00o.OooOO0O(oooO00o.f65793OooO0OO);
            oooO00o.f65795OooO0o = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.OooOO0();
        } else {
            this.mAdapterHelper.OooO0OO();
        }
        boolean z3 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f66102OooOO0 = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z = this.mDataSetHasChangedAfterLayout) || z3 || this.mLayout.mRequestedSimpleAnimations) && (!z || this.mAdapter.hasStableIds());
        C22075OooOoOO c22075OooOoOO = this.mState;
        if (c22075OooOoOO.f66102OooOO0 && z3 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z2 = true;
        }
        c22075OooOoOO.f66103OooOO0O = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pullGlows(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2 = true;
        if (f2 < 0.0f) {
            ensureLeftGlow();
            EdgeEffectCompat.onPull(this.mLeftGlow, (-f2) / getWidth(), 1.0f - (f3 / getHeight()));
        } else {
            if (f2 <= 0.0f) {
                z = false;
                if (f4 >= 0.0f) {
                    ensureTopGlow();
                    EdgeEffectCompat.onPull(this.mTopGlow, (-f4) / getHeight(), f / getWidth());
                } else if (f4 > 0.0f) {
                    ensureBottomGlow();
                    EdgeEffectCompat.onPull(this.mBottomGlow, f4 / getHeight(), 1.0f - (f / getWidth()));
                } else {
                    z2 = z;
                }
                if (z2 && f2 == 0.0f && f4 == 0.0f) {
                    return;
                }
                ViewCompat.postInvalidateOnAnimation(this);
            }
            ensureRightGlow();
            EdgeEffectCompat.onPull(this.mRightGlow, f2 / getWidth(), f3 / getHeight());
        }
        z = true;
        if (f4 >= 0.0f) {
        }
        if (z2) {
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void recoverFocusFromState() {
        View viewFindViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.f65830OooO0OO.contains(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.OooO0o0() == 0) {
                requestFocus();
                return;
            }
        }
        View viewFindNextViewToFocus = null;
        AbstractC22078OooOooO abstractC22078OooOooOFindViewHolderForItemId = (this.mState.f66106OooOOO0 == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f66106OooOOO0);
        if (abstractC22078OooOooOFindViewHolderForItemId != null) {
            if (!this.mChildHelper.f65830OooO0OO.contains(abstractC22078OooOooOFindViewHolderForItemId.itemView) && abstractC22078OooOooOFindViewHolderForItemId.itemView.hasFocusable()) {
                viewFindNextViewToFocus = abstractC22078OooOooOFindViewHolderForItemId.itemView;
            } else if (this.mChildHelper.OooO0o0() > 0) {
                viewFindNextViewToFocus = findNextViewToFocus();
            }
        }
        if (viewFindNextViewToFocus != null) {
            int i = this.mState.f66105OooOOO;
            if (i != -1 && (viewFindViewById = viewFindNextViewToFocus.findViewById(i)) != null && viewFindViewById.isFocusable()) {
                viewFindNextViewToFocus = viewFindViewById;
            }
            viewFindNextViewToFocus.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C22066OooOOOo) {
            C22066OooOOOo c22066OooOOOo = (C22066OooOOOo) layoutParams;
            if (!c22066OooOOOo.mInsetsDirty) {
                Rect rect = c22066OooOOOo.mDecorInsets;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        C22075OooOoOO c22075OooOoOO = this.mState;
        c22075OooOoOO.f66106OooOOO0 = -1L;
        c22075OooOoOO.f66104OooOO0o = -1;
        c22075OooOoOO.f66105OooOOO = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        AbstractC22078OooOooO abstractC22078OooOooOFindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (abstractC22078OooOooOFindContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f66106OooOOO0 = this.mAdapter.hasStableIds() ? abstractC22078OooOooOFindContainingViewHolder.getItemId() : -1L;
        this.mState.f66104OooOO0o = this.mDataSetHasChangedAfterLayout ? -1 : abstractC22078OooOooOFindContainingViewHolder.isRemoved() ? abstractC22078OooOooOFindContainingViewHolder.mOldPosition : abstractC22078OooOooOFindContainingViewHolder.getAbsoluteAdapterPosition();
        this.mState.f66105OooOOO = getDeepestFocusedViewWithId(abstractC22078OooOooOFindContainingViewHolder.itemView);
    }

    private void setAdapterInternal(AbstractC22062OooO0oO abstractC22062OooO0oO, boolean z, boolean z2) {
        AbstractC22062OooO0oO abstractC22062OooO0oO2 = this.mAdapter;
        if (abstractC22062OooO0oO2 != null) {
            abstractC22062OooO0oO2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        androidx.recyclerview.widget.OooO00o oooO00o = this.mAdapterHelper;
        oooO00o.OooOO0O(oooO00o.f65792OooO0O0);
        oooO00o.OooOO0O(oooO00o.f65793OooO0OO);
        int i = 0;
        oooO00o.f65795OooO0o = 0;
        AbstractC22062OooO0oO abstractC22062OooO0oO3 = this.mAdapter;
        this.mAdapter = abstractC22062OooO0oO;
        if (abstractC22062OooO0oO != null) {
            abstractC22062OooO0oO.registerAdapterDataObserver(this.mObserver);
            abstractC22062OooO0oO.onAttachedToRecyclerView(this);
        }
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO != null) {
            oooOOOO.onAdapterChanged(abstractC22062OooO0oO3, this.mAdapter);
        }
        C22071OooOo0O c22071OooOo0O = this.mRecycler;
        AbstractC22062OooO0oO abstractC22062OooO0oO4 = this.mAdapter;
        c22071OooOo0O.OooO0O0();
        C22070OooOo0 c22070OooOo0OooO0Oo = c22071OooOo0O.OooO0Oo();
        if (abstractC22062OooO0oO3 != null) {
            c22070OooOo0OooO0Oo.f66073OooO0O0--;
        }
        if (!z && c22070OooOo0OooO0Oo.f66073OooO0O0 == 0) {
            while (true) {
                SparseArray<C22070OooOo0.OooO00o> sparseArray = c22070OooOo0OooO0Oo.f66072OooO00o;
                if (i >= sparseArray.size()) {
                    break;
                }
                sparseArray.valueAt(i).f66074OooO00o.clear();
                i++;
            }
        }
        if (abstractC22062OooO0oO4 != null) {
            c22070OooOo0OooO0Oo.f66073OooO0O0++;
        } else {
            c22070OooOo0OooO0Oo.getClass();
        }
        this.mState.f66098OooO0o = true;
    }

    private void stopScrollersInternal() {
        RunnableC22076OooOoo runnableC22076OooOoo = this.mViewFlinger;
        RecyclerView.this.removeCallbacks(runnableC22076OooOoo);
        runnableC22076OooOoo.f66110OooOoO0.abortAnimation();
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO != null) {
            oooOOOO.stopSmoothScroller();
        }
    }

    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO == null || !oooOOOO.onAddFocusables(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public void addItemDecoration(OooOOO oooOOO, int i) {
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO != null) {
            oooOOOO.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(oooOOO);
        } else {
            this.mItemDecorations.add(i, oooOOO);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(InterfaceC22068OooOOo0 interfaceC22068OooOOo0) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(interfaceC22068OooOOo0);
    }

    public void addOnItemTouchListener(InterfaceC22069OooOOoo interfaceC22069OooOOoo) {
        this.mOnItemTouchListeners.add(interfaceC22069OooOOoo);
    }

    public void addOnScrollListener(OooOo00 oooOo00) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(oooOo00);
    }

    public void addRecyclerListener(InterfaceC22072OooOo0o interfaceC22072OooOo0o) {
        Preconditions.checkArgument(interfaceC22072OooOo0o != null, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(interfaceC22072OooOo0o);
    }

    public void animateAppearance(AbstractC22078OooOooO abstractC22078OooOooO, AbstractC22064OooOO0o.OooO0OO oooO0OO, AbstractC22064OooOO0o.OooO0OO oooO0OO2) {
        abstractC22078OooOooO.setIsRecyclable(false);
        if (this.mItemAnimator.OooO00o(abstractC22078OooOooO, oooO0OO, oooO0OO2)) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(AbstractC22078OooOooO abstractC22078OooOooO, AbstractC22064OooOO0o.OooO0OO oooO0OO, AbstractC22064OooOO0o.OooO0OO oooO0OO2) {
        addAnimatingView(abstractC22078OooOooO);
        abstractC22078OooOooO.setIsRecyclable(false);
        if (this.mItemAnimator.OooO0OO(abstractC22078OooOooO, oooO0OO, oooO0OO2)) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str != null) {
            throw new IllegalStateException(androidx.recyclerview.widget.OooO0o.OooO00o(this, C22218Oooo.OooO0OO(str)));
        }
        throw new IllegalStateException(androidx.recyclerview.widget.OooO0o.OooO00o(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(androidx.recyclerview.widget.OooO0o.OooO00o(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(androidx.recyclerview.widget.OooO0o.OooO00o(this, new StringBuilder(""))));
        }
    }

    public boolean canReuseUpdatedViewHolder(AbstractC22078OooOooO abstractC22078OooOooO) {
        AbstractC22064OooOO0o abstractC22064OooOO0o = this.mItemAnimator;
        return abstractC22064OooOO0o == null || abstractC22064OooOO0o.OooO0o(abstractC22078OooOooO, abstractC22078OooOooO.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C22066OooOOOo) && this.mLayout.checkLayoutParams((C22066OooOOOo) layoutParams);
    }

    public void clearOldPositions() {
        int iOooO0oo = this.mChildHelper.OooO0oo();
        for (int i = 0; i < iOooO0oo; i++) {
            AbstractC22078OooOooO childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        C22071OooOo0O c22071OooOo0O = this.mRecycler;
        ArrayList<AbstractC22078OooOooO> arrayList = c22071OooOo0O.f66080OooO0OO;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).clearOldPosition();
        }
        ArrayList<AbstractC22078OooOooO> arrayList2 = c22071OooOo0O.f66078OooO00o;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList2.get(i3).clearOldPosition();
        }
        ArrayList<AbstractC22078OooOooO> arrayList3 = c22071OooOo0O.f66079OooO0O0;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                c22071OooOo0O.f66079OooO0O0.get(i4).clearOldPosition();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<InterfaceC22068OooOOo0> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<OooOo00> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO != null && oooOOOO.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO != null && oooOOOO.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO != null && oooOOOO.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO != null && oooOOOO.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO != null && oooOOOO.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO != null && oooOOOO.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            TraceCompat.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            TraceCompat.endSection();
            return;
        }
        if (this.mAdapterHelper.OooO0oO()) {
            androidx.recyclerview.widget.OooO00o oooO00o = this.mAdapterHelper;
            int i = oooO00o.f65795OooO0o;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (oooO00o.OooO0oO()) {
                    TraceCompat.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    TraceCompat.endSection();
                    return;
                }
                return;
            }
            TraceCompat.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.OooOO0();
            if (!this.mLayoutWasDefered) {
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.OooO0O0();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            TraceCompat.endSection();
        }
    }

    public void defaultOnMeasure(int i, int i2) {
        setMeasuredDimension(OooOOOO.chooseSize(i, getPaddingRight() + getPaddingLeft(), ViewCompat.getMinimumWidth(this)), OooOOOO.chooseSize(i2, getPaddingBottom() + getPaddingTop(), ViewCompat.getMinimumHeight(this)));
    }

    public void dispatchChildAttached(View view) {
        AbstractC22078OooOooO childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        AbstractC22062OooO0oO abstractC22062OooO0oO = this.mAdapter;
        if (abstractC22062OooO0oO != null && childViewHolderInt != null) {
            abstractC22062OooO0oO.onViewAttachedToWindow(childViewHolderInt);
        }
        List<InterfaceC22068OooOOo0> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).OooO0Oo(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        AbstractC22078OooOooO childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        AbstractC22062OooO0oO abstractC22062OooO0oO = this.mAdapter;
        if (abstractC22062OooO0oO != null && childViewHolderInt != null) {
            abstractC22062OooO0oO.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<InterfaceC22068OooOOo0> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).OooO0O0(view);
            }
        }
    }

    public void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        this.mState.f66093OooO = false;
        boolean z = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f66097OooO0Oo == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else {
            androidx.recyclerview.widget.OooO00o oooO00o = this.mAdapterHelper;
            if ((oooO00o.f65793OooO0OO.isEmpty() || oooO00o.f65792OooO0O0.isEmpty()) && !z && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
                dispatchLayoutStep2();
            }
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    public void dispatchOnScrollStateChanged(int i) {
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO != null) {
            oooOOOO.onScrollStateChanged(i);
        }
        onScrollStateChanged(i);
        OooOo00 oooOo00 = this.mScrollListener;
        if (oooOo00 != null) {
            oooOo00.onScrollStateChanged(this, i);
        }
        List<OooOo00> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i);
            }
        }
    }

    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        OooOo00 oooOo00 = this.mScrollListener;
        if (oooOo00 != null) {
            oooOo00.onScrolled(this, i, i2);
        }
        List<OooOo00> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            AbstractC22078OooOooO abstractC22078OooOooO = this.mPendingAccessibilityImportanceChange.get(size);
            if (abstractC22078OooOooO.itemView.getParent() == this && !abstractC22078OooOooO.shouldIgnore() && (i = abstractC22078OooOooO.mPendingAccessibilityState) != -1) {
                ViewCompat.setImportantForAccessibility(abstractC22078OooOooO.itemView, i);
                abstractC22078OooOooO.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.OooOO0()) ? z : true) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        this.mEdgeEffectFactory.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mBottomGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        this.mEdgeEffectFactory.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mLeftGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        this.mEdgeEffectFactory.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mRightGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        this.mEdgeEffectFactory.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mTopGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void fillRemainingScrollValues(C22075OooOoOO c22075OooOoOO) {
        if (getScrollState() != 2) {
            c22075OooOoOO.getClass();
            return;
        }
        OverScroller overScroller = this.mViewFlinger.f66110OooOoO0;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c22075OooOoOO.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View findChildViewUnder(float f, float f2) {
        for (int iOooO0o0 = this.mChildHelper.OooO0o0() - 1; iOooO0o0 >= 0; iOooO0o0--) {
            View viewOooO0Oo = this.mChildHelper.OooO0Oo(iOooO0o0);
            float translationX = viewOooO0Oo.getTranslationX();
            float translationY = viewOooO0Oo.getTranslationY();
            if (f >= viewOooO0Oo.getLeft() + translationX && f <= viewOooO0Oo.getRight() + translationX && f2 >= viewOooO0Oo.getTop() + translationY && f2 <= viewOooO0Oo.getBottom() + translationY) {
                return viewOooO0Oo;
            }
        }
        return null;
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public AbstractC22078OooOooO findContainingViewHolder(View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    public AbstractC22078OooOooO findViewHolderForAdapterPosition(int i) {
        AbstractC22078OooOooO abstractC22078OooOooO = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int iOooO0oo = this.mChildHelper.OooO0oo();
        for (int i2 = 0; i2 < iOooO0oo; i2++) {
            AbstractC22078OooOooO childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i) {
                C22030OooO0oO c22030OooO0oO = this.mChildHelper;
                if (!c22030OooO0oO.f65830OooO0OO.contains(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                abstractC22078OooOooO = childViewHolderInt;
            }
        }
        return abstractC22078OooOooO;
    }

    public AbstractC22078OooOooO findViewHolderForItemId(long j) {
        AbstractC22062OooO0oO abstractC22062OooO0oO = this.mAdapter;
        AbstractC22078OooOooO abstractC22078OooOooO = null;
        if (abstractC22062OooO0oO != null && abstractC22062OooO0oO.hasStableIds()) {
            int iOooO0oo = this.mChildHelper.OooO0oo();
            for (int i = 0; i < iOooO0oo; i++) {
                AbstractC22078OooOooO childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j) {
                    C22030OooO0oO c22030OooO0oO = this.mChildHelper;
                    if (!c22030OooO0oO.f65830OooO0OO.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    abstractC22078OooOooO = childViewHolderInt;
                }
            }
        }
        return abstractC22078OooOooO;
    }

    public AbstractC22078OooOooO findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    @Deprecated
    public AbstractC22078OooOooO findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public boolean fling(int i, int i2) {
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        int iCanScrollHorizontally = oooOOOO.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        int i3 = (iCanScrollHorizontally == 0 || Math.abs(i) < this.mMinFlingVelocity) ? 0 : i;
        int i4 = (!zCanScrollVertically || Math.abs(i2) < this.mMinFlingVelocity) ? 0 : i2;
        if (i3 == 0 && i4 == 0) {
            return false;
        }
        float f = i3;
        float f2 = i4;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = iCanScrollHorizontally != 0 || zCanScrollVertically;
            dispatchNestedFling(f, f2, z);
            AbstractC22067OooOOo abstractC22067OooOOo = this.mOnFlingListener;
            if (abstractC22067OooOOo != null && abstractC22067OooOOo.onFling(i3, i4)) {
                return true;
            }
            if (z) {
                if (zCanScrollVertically) {
                    iCanScrollHorizontally = (iCanScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(iCanScrollHorizontally, 1);
                int i5 = this.mMaxFlingVelocity;
                int iMax = Math.max(-i5, Math.min(i3, i5));
                int i6 = this.mMaxFlingVelocity;
                int iMax2 = Math.max(-i6, Math.min(i4, i6));
                RunnableC22076OooOoo runnableC22076OooOoo = this.mViewFlinger;
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.setScrollState(2);
                runnableC22076OooOoo.f66107OooOo = 0;
                runnableC22076OooOoo.f66108OooOo0o = 0;
                Interpolator interpolator = runnableC22076OooOoo.f66109OooOoO;
                Interpolator interpolator2 = sQuinticInterpolator;
                if (interpolator != interpolator2) {
                    runnableC22076OooOoo.f66109OooOoO = interpolator2;
                    runnableC22076OooOoo.f66110OooOoO0 = new OverScroller(recyclerView.getContext(), interpolator2);
                }
                runnableC22076OooOoo.f66110OooOoO0.fling(0, 0, iMax, iMax2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                runnableC22076OooOoo.OooO00o();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        View viewOnFocusSearchFailed;
        boolean z;
        View viewOnInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i);
        if (viewOnInterceptFocusSearch != null) {
            return viewOnInterceptFocusSearch;
        }
        boolean z2 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z2 && (i == 2 || i == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i2 = i == 2 ? 130 : 33;
                z = focusFinder.findNextFocus(this, view, i2) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.mLayout.canScrollHorizontally()) {
                int i3 = (this.mLayout.getLayoutDirection() == 1) ^ (i == 2) ? 66 : 17;
                boolean z3 = focusFinder.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
                z = z3;
            }
            if (z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            viewOnFocusSearchFailed = focusFinder.findNextFocus(this, view, i);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
            if (viewFindNextFocus == null && z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                viewOnFocusSearchFailed = this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                viewOnFocusSearchFailed = viewFindNextFocus;
            }
        }
        if (viewOnFocusSearchFailed == null || viewOnFocusSearchFailed.hasFocusable()) {
            return isPreferredNextFocus(view, viewOnFocusSearchFailed, i) ? viewOnFocusSearchFailed : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        requestChildOnScreen(viewOnFocusSearchFailed, null);
        return view;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO != null) {
            return oooOOOO.generateDefaultLayoutParams();
        }
        throw new IllegalStateException(androidx.recyclerview.widget.OooO0o.OooO00o(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO != null) {
            return oooOOOO.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException(androidx.recyclerview.widget.OooO0o.OooO00o(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC22062OooO0oO getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(AbstractC22078OooOooO abstractC22078OooOooO) {
        if (abstractC22078OooOooO.hasAnyOfTheFlags(524) || !abstractC22078OooOooO.isBound()) {
            return -1;
        }
        androidx.recyclerview.widget.OooO00o oooO00o = this.mAdapterHelper;
        int i = abstractC22078OooOooO.mPosition;
        ArrayList<OooO00o.C19033OooO00o> arrayList = oooO00o.f65792OooO0O0;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            OooO00o.C19033OooO00o c19033OooO00o = arrayList.get(i2);
            int i3 = c19033OooO00o.f65797OooO00o;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c19033OooO00o.f65798OooO0O0;
                    if (i4 <= i) {
                        int i5 = c19033OooO00o.f65800OooO0Oo;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c19033OooO00o.f65798OooO0O0;
                    if (i6 == i) {
                        i = c19033OooO00o.f65800OooO0Oo;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c19033OooO00o.f65800OooO0Oo <= i) {
                            i++;
                        }
                    }
                }
            } else if (c19033OooO00o.f65798OooO0O0 <= i) {
                i += c19033OooO00o.f65800OooO0Oo;
            }
        }
        return i;
    }

    @Override // android.view.View
    public int getBaseline() {
        OooOOOO oooOOOO = this.mLayout;
        return oooOOOO != null ? oooOOOO.getBaseline() : super.getBaseline();
    }

    public long getChangedHolderKey(AbstractC22078OooOooO abstractC22078OooOooO) {
        return this.mAdapter.hasStableIds() ? abstractC22078OooOooO.getItemId() : abstractC22078OooOooO.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        AbstractC22078OooOooO childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    public long getChildItemId(View view) {
        AbstractC22078OooOooO childViewHolderInt;
        AbstractC22062OooO0oO abstractC22062OooO0oO = this.mAdapter;
        if (abstractC22062OooO0oO == null || !abstractC22062OooO0oO.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        AbstractC22078OooOooO childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public AbstractC22078OooOooO getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public C22056OooOooO getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public OooOO0O getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public AbstractC22064OooOO0o getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        C22066OooOOOo c22066OooOOOo = (C22066OooOOOo) view.getLayoutParams();
        if (!c22066OooOOOo.mInsetsDirty) {
            return c22066OooOOOo.mDecorInsets;
        }
        if (this.mState.f66100OooO0oO && (c22066OooOOOo.isItemChanged() || c22066OooOOOo.isViewInvalid())) {
            return c22066OooOOOo.mDecorInsets;
        }
        Rect rect = c22066OooOOOo.mDecorInsets;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i2 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c22066OooOOOo.mInsetsDirty = false;
        return rect;
    }

    public OooOOO getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.mItemDecorations.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public OooOOOO getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC22067OooOOo getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public C22070OooOo0 getRecycledViewPool() {
        return this.mRecycler.OooO0Oo();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().hasNestedScrollingParent();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.OooO0oO();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new androidx.recyclerview.widget.OooO00o(new OooO0o());
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(androidx.recyclerview.widget.OooO0o.OooO00o(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new C22039OooOOOo(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.orion.notein.global.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.orion.notein.global.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.orion.notein.global.R.dimen.fastscroll_margin));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO != null) {
            oooOOOO.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        AbstractC22064OooOO0o abstractC22064OooOO0o = this.mItemAnimator;
        return abstractC22064OooOO0o != null && abstractC22064OooOO0o.OooOO0();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().isNestedScrollingEnabled();
    }

    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int iOooO0oo = this.mChildHelper.OooO0oo();
        for (int i = 0; i < iOooO0oo; i++) {
            ((C22066OooOOOo) this.mChildHelper.OooO0oO(i).getLayoutParams()).mInsetsDirty = true;
        }
        ArrayList<AbstractC22078OooOooO> arrayList = this.mRecycler.f66080OooO0OO;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C22066OooOOOo c22066OooOOOo = (C22066OooOOOo) arrayList.get(i2).itemView.getLayoutParams();
            if (c22066OooOOOo != null) {
                c22066OooOOOo.mInsetsDirty = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int iOooO0oo = this.mChildHelper.OooO0oo();
        for (int i = 0; i < iOooO0oo; i++) {
            AbstractC22078OooOooO childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        C22071OooOo0O c22071OooOo0O = this.mRecycler;
        ArrayList<AbstractC22078OooOooO> arrayList = c22071OooOo0O.f66080OooO0OO;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC22078OooOooO abstractC22078OooOooO = arrayList.get(i2);
            if (abstractC22078OooOooO != null) {
                abstractC22078OooOooO.addFlags(6);
                abstractC22078OooOooO.addChangePayload(null);
            }
        }
        AbstractC22062OooO0oO abstractC22062OooO0oO = RecyclerView.this.mAdapter;
        if (abstractC22062OooO0oO == null || !abstractC22062OooO0oO.hasStableIds()) {
            c22071OooOo0O.OooO0o();
        }
    }

    public void nestedScrollBy(int i, int i2) {
        nestedScrollByInternal(i, i2, null, 1);
    }

    public void offsetChildrenHorizontal(int i) {
        int iOooO0o0 = this.mChildHelper.OooO0o0();
        for (int i2 = 0; i2 < iOooO0o0; i2++) {
            this.mChildHelper.OooO0Oo(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        int iOooO0o0 = this.mChildHelper.OooO0o0();
        for (int i2 = 0; i2 < iOooO0o0; i2++) {
            this.mChildHelper.OooO0Oo(i2).offsetTopAndBottom(i);
        }
    }

    public void offsetPositionRecordsForInsert(int i, int i2) {
        int iOooO0oo = this.mChildHelper.OooO0oo();
        for (int i3 = 0; i3 < iOooO0oo; i3++) {
            AbstractC22078OooOooO childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i3));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i) {
                childViewHolderInt.offsetPosition(i2, false);
                this.mState.f66098OooO0o = true;
            }
        }
        ArrayList<AbstractC22078OooOooO> arrayList = this.mRecycler.f66080OooO0OO;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC22078OooOooO abstractC22078OooOooO = arrayList.get(i4);
            if (abstractC22078OooOooO != null && abstractC22078OooOooO.mPosition >= i) {
                abstractC22078OooOooO.offsetPosition(i2, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iOooO0oo = this.mChildHelper.OooO0oo();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iOooO0oo; i11++) {
            AbstractC22078OooOooO childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i11));
            if (childViewHolderInt != null && (i9 = childViewHolderInt.mPosition) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    childViewHolderInt.offsetPosition(i2 - i, false);
                } else {
                    childViewHolderInt.offsetPosition(i5, false);
                }
                this.mState.f66098OooO0o = true;
            }
        }
        C22071OooOo0O c22071OooOo0O = this.mRecycler;
        c22071OooOo0O.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i10 = 1;
            i7 = i2;
        }
        ArrayList<AbstractC22078OooOooO> arrayList = c22071OooOo0O.f66080OooO0OO;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC22078OooOooO abstractC22078OooOooO = arrayList.get(i12);
            if (abstractC22078OooOooO != null && (i8 = abstractC22078OooOooO.mPosition) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    abstractC22078OooOooO.offsetPosition(i2 - i, false);
                } else {
                    abstractC22078OooOooO.offsetPosition(i10, false);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iOooO0oo = this.mChildHelper.OooO0oo();
        for (int i4 = 0; i4 < iOooO0oo; i4++) {
            AbstractC22078OooOooO childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i5 = childViewHolderInt.mPosition;
                if (i5 >= i3) {
                    childViewHolderInt.offsetPosition(-i2, z);
                    this.mState.f66098OooO0o = true;
                } else if (i5 >= i) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.mState.f66098OooO0o = true;
                }
            }
        }
        C22071OooOo0O c22071OooOo0O = this.mRecycler;
        ArrayList<AbstractC22078OooOooO> arrayList = c22071OooOo0O.f66080OooO0OO;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC22078OooOooO abstractC22078OooOooO = arrayList.get(size);
            if (abstractC22078OooOooO != null) {
                int i6 = abstractC22078OooOooO.mPosition;
                if (i6 >= i3) {
                    abstractC22078OooOooO.offsetPosition(-i2, z);
                } else if (i6 >= i) {
                    abstractC22078OooOooO.addFlags(8);
                    c22071OooOo0O.OooO0oO(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO != null) {
            oooOOOO.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<RunnableC22046OooOOo0> threadLocal = RunnableC22046OooOOo0.f65994OooOoOO;
            RunnableC22046OooOOo0 runnableC22046OooOOo0 = threadLocal.get();
            this.mGapWorker = runnableC22046OooOOo0;
            if (runnableC22046OooOOo0 == null) {
                this.mGapWorker = new RunnableC22046OooOOo0();
                Display display = ViewCompat.getDisplay(this);
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                    RunnableC22046OooOOo0 runnableC22046OooOOo02 = this.mGapWorker;
                    runnableC22046OooOOo02.f65999OooOoO0 = (long) (1.0E9f / refreshRate);
                    threadLocal.set(runnableC22046OooOOo02);
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                    }
                    RunnableC22046OooOOo0 runnableC22046OooOOo022 = this.mGapWorker;
                    runnableC22046OooOOo022.f65999OooOoO0 = (long) (1.0E9f / refreshRate);
                    threadLocal.set(runnableC22046OooOOo022);
                }
            }
            this.mGapWorker.f65997OooOo0o.add(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RunnableC22046OooOOo0 runnableC22046OooOOo0;
        super.onDetachedFromWindow();
        AbstractC22064OooOO0o abstractC22064OooOO0o = this.mItemAnimator;
        if (abstractC22064OooOO0o != null) {
            abstractC22064OooOO0o.OooO();
        }
        stopScroll();
        this.mIsAttached = false;
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO != null) {
            oooOOOO.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while (Oooo0.OooO00o.f66034OooO0Oo.acquire() != 0) {
        }
        if (!ALLOW_THREAD_GAP_WORK || (runnableC22046OooOOo0 = this.mGapWorker) == null) {
            return;
        }
        runnableC22046OooOOo0.f65997OooOo0o.remove(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.mLayout.canScrollHorizontally() ? motionEvent.getAxisValue(10) : 0.0f;
                if (f != 0.0f || axisValue != 0.0f) {
                    nestedScrollByInternal((int) (axisValue * this.mScaledHorizontalScrollFactor), (int) (f * this.mScaledVerticalScrollFactor), motionEvent, 1);
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.mLayout.canScrollVertically()) {
                    f = -axisValue2;
                    if (f != 0.0f) {
                        nestedScrollByInternal((int) (axisValue * this.mScaledHorizontalScrollFactor), (int) (f * this.mScaledVerticalScrollFactor), motionEvent, 1);
                    }
                } else {
                    if (this.mLayout.canScrollHorizontally()) {
                        axisValue = axisValue2;
                        f = 0.0f;
                    } else {
                        f = 0.0f;
                        axisValue = 0.0f;
                    }
                    if (f != 0.0f) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO == null) {
            return false;
        }
        boolean zCanScrollHorizontally = oooOOOO.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = zCanScrollHorizontally;
            if (zCanScrollVertically) {
                i = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i2 = x2 - this.mInitialTouchX;
                int i3 = y2 - this.mInitialTouchY;
                if (!zCanScrollHorizontally || Math.abs(i2) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (zCanScrollVertically && Math.abs(i3) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TraceCompat.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        TraceCompat.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (oooOOOO.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z;
            if (z || this.mAdapter == null) {
                return;
            }
            if (this.mState.f66097OooO0Oo == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i, i2);
            this.mState.f66093OooO = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f66093OooO = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            C22075OooOoOO c22075OooOoOO = this.mState;
            if (c22075OooOoOO.f66103OooOO0O) {
                c22075OooOoOO.f66100OooO0oO = true;
            } else {
                this.mAdapterHelper.OooO0OO();
                this.mState.f66100OooO0oO = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f66103OooOO0O) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC22062OooO0oO abstractC22062OooO0oO = this.mAdapter;
        if (abstractC22062OooO0oO != null) {
            this.mState.f66099OooO0o0 = abstractC22062OooO0oO.getItemCount();
        } else {
            this.mState.f66099OooO0o0 = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
        stopInterceptRequestLayout(false);
        this.mState.f66100OooO0oO = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.getSuperState());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.f66114OooOo0o = savedState2.f66114OooOo0o;
            return savedState;
        }
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO != null) {
            savedState.f66114OooOo0o = oooOOOO.onSaveInstanceState();
            return savedState;
        }
        savedState.f66114OooOo0o = null;
        return savedState;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i2) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc A[PHI: r1
      0x00dc: PHI (r1v45 int) = (r1v26 int), (r1v49 int) binds: [B:41:0x00c5, B:45:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchToOnItemTouchListeners(motionEvent)) {
            cancelScroll();
            return true;
        }
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO == null) {
            return false;
        }
        boolean zCanScrollHorizontally = oooOOOO.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.mNestedOffsets;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked == 0) {
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            int i = zCanScrollHorizontally;
            if (zCanScrollVertically) {
                i = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i, 0);
        } else {
            if (actionMasked == 1) {
                this.mVelocityTracker.addMovement(motionEventObtain);
                this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                float f = zCanScrollHorizontally ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                float f2 = zCanScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                if ((f == 0.0f && f2 == 0.0f) || !fling((int) f, (int) f2)) {
                    setScrollState(0);
                }
                resetScroll();
                motionEventObtain.recycle();
                return true;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                if (iFindPointerIndex < 0) {
                    Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int iMax = this.mLastTouchX - x2;
                int iMax2 = this.mLastTouchY - y2;
                if (this.mScrollState != 1) {
                    if (zCanScrollHorizontally) {
                        iMax = iMax > 0 ? Math.max(0, iMax - this.mTouchSlop) : Math.min(0, iMax + this.mTouchSlop);
                        if (iMax != 0) {
                            z = true;
                        }
                        if (zCanScrollVertically) {
                        }
                        if (z) {
                        }
                    } else {
                        z = false;
                        if (zCanScrollVertically) {
                            iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.mTouchSlop) : Math.min(0, iMax2 + this.mTouchSlop);
                            if (iMax2 != 0) {
                                z = true;
                            }
                        }
                        if (z) {
                            setScrollState(1);
                        }
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                int i2 = iMax;
                int i3 = iMax2;
                if (this.mScrollState == 1) {
                    int[] iArr3 = this.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    if (dispatchNestedPreScroll(zCanScrollHorizontally ? i2 : 0, zCanScrollVertically ? i3 : 0, iArr3, this.mScrollOffset, 0)) {
                        int[] iArr4 = this.mReusableIntPair;
                        i2 -= iArr4[0];
                        i3 -= iArr4[1];
                        int[] iArr5 = this.mNestedOffsets;
                        int i4 = iArr5[0];
                        int[] iArr6 = this.mScrollOffset;
                        iArr5[0] = i4 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int[] iArr7 = this.mScrollOffset;
                    this.mLastTouchX = x2 - iArr7[0];
                    this.mLastTouchY = y2 - iArr7[1];
                    if (scrollByInternal(zCanScrollHorizontally ? i2 : 0, zCanScrollVertically ? i3 : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    RunnableC22046OooOOo0 runnableC22046OooOOo0 = this.mGapWorker;
                    if (runnableC22046OooOOo0 != null && (i2 != 0 || i3 != 0)) {
                        runnableC22046OooOOo0.OooO00o(this, i2, i3);
                    }
                }
            } else if (actionMasked == 3) {
                cancelScroll();
            } else if (actionMasked == 5) {
                this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.mLastTouchX = x3;
                this.mInitialTouchX = x3;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.mLastTouchY = y3;
                this.mInitialTouchY = y3;
            } else if (actionMasked == 6) {
                onPointerUp(motionEvent);
            }
        }
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        ViewCompat.postOnAnimation(this, this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(AbstractC22078OooOooO abstractC22078OooOooO, AbstractC22064OooOO0o.OooO0OO oooO0OO) {
        abstractC22078OooOooO.setFlags(0, 8192);
        if (this.mState.f66101OooO0oo && abstractC22078OooOooO.isUpdated() && !abstractC22078OooOooO.isRemoved() && !abstractC22078OooOooO.shouldIgnore()) {
            this.mViewInfoStore.f66033OooO0O0.OooO0o0(getChangedHolderKey(abstractC22078OooOooO), abstractC22078OooOooO);
        }
        C20493Oooo00o<AbstractC22078OooOooO, Oooo0.OooO00o> c20493Oooo00o = this.mViewInfoStore.f66032OooO00o;
        Oooo0.OooO00o OooO00o2 = c20493Oooo00o.get(abstractC22078OooOooO);
        if (OooO00o2 == null) {
            OooO00o2 = Oooo0.OooO00o.OooO00o();
            c20493Oooo00o.put(abstractC22078OooOooO, OooO00o2);
        }
        OooO00o2.f66036OooO0O0 = oooO0OO;
        OooO00o2.f66035OooO00o |= 4;
    }

    public void removeAndRecycleViews() {
        AbstractC22064OooOO0o abstractC22064OooOO0o = this.mItemAnimator;
        if (abstractC22064OooOO0o != null) {
            abstractC22064OooOO0o.OooO();
        }
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO != null) {
            oooOOOO.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.OooO0O0();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        C22030OooO0oO c22030OooO0oO = this.mChildHelper;
        C22061OooO0o0 c22061OooO0o0 = c22030OooO0oO.f65828OooO00o;
        int iIndexOfChild = RecyclerView.this.indexOfChild(view);
        boolean z = true;
        if (iIndexOfChild == -1) {
            c22030OooO0oO.OooOO0o(view);
        } else {
            C22030OooO0oO.OooO00o oooO00o = c22030OooO0oO.f65829OooO0O0;
            if (oooO00o.OooO0Oo(iIndexOfChild)) {
                oooO00o.OooO0o(iIndexOfChild);
                c22030OooO0oO.OooOO0o(view);
                c22061OooO0o0.OooO00o(iIndexOfChild);
            } else {
                z = false;
            }
        }
        if (z) {
            AbstractC22078OooOooO childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.OooOO0o(childViewHolderInt);
            this.mRecycler.OooO(childViewHolderInt);
        }
        stopInterceptRequestLayout(!z);
        return z;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        AbstractC22078OooOooO childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(androidx.recyclerview.widget.OooO0o.OooO00o(this, sb));
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(OooOOO oooOOO) {
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO != null) {
            oooOOOO.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(oooOOO);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i));
            return;
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(InterfaceC22068OooOOo0 interfaceC22068OooOOo0) {
        List<InterfaceC22068OooOOo0> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(interfaceC22068OooOOo0);
    }

    public void removeOnItemTouchListener(InterfaceC22069OooOOoo interfaceC22069OooOOoo) {
        this.mOnItemTouchListeners.remove(interfaceC22069OooOOoo);
        if (this.mInterceptingOnItemTouchListener == interfaceC22069OooOOoo) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(OooOo00 oooOo00) {
        List<OooOo00> list = this.mScrollListeners;
        if (list != null) {
            list.remove(oooOo00);
        }
    }

    public void removeRecyclerListener(InterfaceC22072OooOo0o interfaceC22072OooOo0o) {
        this.mRecyclerListeners.remove(interfaceC22072OooOo0o);
    }

    public void repositionShadowingViews() {
        AbstractC22078OooOooO abstractC22078OooOooO;
        int iOooO0o0 = this.mChildHelper.OooO0o0();
        for (int i = 0; i < iOooO0o0; i++) {
            View viewOooO0Oo = this.mChildHelper.OooO0Oo(i);
            AbstractC22078OooOooO childViewHolder = getChildViewHolder(viewOooO0Oo);
            if (childViewHolder != null && (abstractC22078OooOooO = childViewHolder.mShadowingHolder) != null) {
                View view = abstractC22078OooOooO.itemView;
                int left = viewOooO0Oo.getLeft();
                int top = viewOooO0Oo.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i).OooO0o0(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int iOooO0oo = this.mChildHelper.OooO0oo();
        for (int i = 0; i < iOooO0oo; i++) {
            AbstractC22078OooOooO childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = oooOOOO.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i = 0;
            }
            if (!zCanScrollVertically) {
                i2 = 0;
            }
            scrollByInternal(i, i2, null, 0);
        }
    }

    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i, i2, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i6 = i - i8;
            i7 = i2 - i9;
            i5 = i9;
            i4 = i8;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i4, i5, i6, i7, this.mScrollOffset, i3, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i10 = iArr4[0];
        int i11 = i6 - i10;
        int i12 = iArr4[1];
        int i13 = i7 - i12;
        boolean z = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i15 = iArr5[0];
        this.mLastTouchX = i14 - i15;
        int i16 = this.mLastTouchY;
        int i17 = iArr5[1];
        this.mLastTouchY = i16 - i17;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i15;
        iArr6[1] = iArr6[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !MotionEventCompat.isFromSource(motionEvent, InputDeviceCompat.SOURCE_MOUSE)) {
                pullGlows(motionEvent.getX(), i11, motionEvent.getY(), i13);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (i4 != 0 || i5 != 0) {
            dispatchOnScrolled(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i4 == 0 && i5 == 0) ? false : true;
    }

    public void scrollStep(int i, int i2, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        TraceCompat.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int iScrollHorizontallyBy = i != 0 ? this.mLayout.scrollHorizontallyBy(i, this.mRecycler, this.mState) : 0;
        int iScrollVerticallyBy = i2 != 0 ? this.mLayout.scrollVerticallyBy(i2, this.mRecycler, this.mState) : 0;
        TraceCompat.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oooOOOO.scrollToPosition(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C22056OooOooO c22056OooOooO) {
        this.mAccessibilityDelegate = c22056OooOooO;
        ViewCompat.setAccessibilityDelegate(this, c22056OooOooO);
    }

    public void setAdapter(AbstractC22062OooO0oO abstractC22062OooO0oO) {
        setLayoutFrozen(false);
        setAdapterInternal(abstractC22062OooO0oO, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(OooOO0 oooOO02) {
        if (oooOO02 == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = oooOO02;
        setChildrenDrawingOrderEnabled(oooOO02 != null);
    }

    public boolean setChildImportantForAccessibilityInternal(AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        if (!isComputingLayout()) {
            ViewCompat.setImportantForAccessibility(abstractC22078OooOooO.itemView, i);
            return true;
        }
        abstractC22078OooOooO.mPendingAccessibilityState = i;
        this.mPendingAccessibilityImportanceChange.add(abstractC22078OooOooO);
        return false;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(OooOO0O oooOO0O) {
        Preconditions.checkNotNull(oooOO0O);
        this.mEdgeEffectFactory = oooOO0O;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(AbstractC22064OooOO0o abstractC22064OooOO0o) {
        AbstractC22064OooOO0o abstractC22064OooOO0o2 = this.mItemAnimator;
        if (abstractC22064OooOO0o2 != null) {
            abstractC22064OooOO0o2.OooO();
            this.mItemAnimator.f66056OooO00o = null;
        }
        this.mItemAnimator = abstractC22064OooOO0o;
        if (abstractC22064OooOO0o != null) {
            abstractC22064OooOO0o.f66056OooO00o = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i) {
        C22071OooOo0O c22071OooOo0O = this.mRecycler;
        c22071OooOo0O.f66083OooO0o0 = i;
        c22071OooOo0O.OooOOO0();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(OooOOOO oooOOOO) {
        RecyclerView recyclerView;
        if (oooOOOO == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            AbstractC22064OooOO0o abstractC22064OooOO0o = this.mItemAnimator;
            if (abstractC22064OooOO0o != null) {
                abstractC22064OooOO0o.OooO();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.OooO0O0();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.OooO0O0();
        }
        C22030OooO0oO c22030OooO0oO = this.mChildHelper;
        c22030OooO0oO.f65829OooO0O0.OooO0oO();
        ArrayList arrayList = c22030OooO0oO.f65830OooO0OO;
        int size = arrayList.size();
        while (true) {
            size--;
            recyclerView = RecyclerView.this;
            if (size < 0) {
                break;
            }
            AbstractC22078OooOooO childViewHolderInt = getChildViewHolderInt((View) arrayList.get(size));
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.mLayout = oooOOOO;
        if (oooOOOO != null) {
            if (oooOOOO.mRecyclerView != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(oooOOOO);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(androidx.recyclerview.widget.OooO0o.OooO00o(oooOOOO.mRecyclerView, sb));
            }
            oooOOOO.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.OooOOO0();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().setNestedScrollingEnabled(z);
    }

    public void setOnFlingListener(AbstractC22067OooOOo abstractC22067OooOOo) {
        this.mOnFlingListener = abstractC22067OooOOo;
    }

    @Deprecated
    public void setOnScrollListener(OooOo00 oooOo00) {
        this.mScrollListener = oooOo00;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(C22070OooOo0 c22070OooOo0) {
        C22071OooOo0O c22071OooOo0O = this.mRecycler;
        if (c22071OooOo0O.f66084OooO0oO != null) {
            r1.f66073OooO0O0--;
        }
        c22071OooOo0O.f66084OooO0oO = c22070OooOo0;
        if (c22070OooOo0 == null || RecyclerView.this.getAdapter() == null) {
            return;
        }
        c22071OooOo0O.f66084OooO0oO.f66073OooO0O0++;
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC22072OooOo0o interfaceC22072OooOo0o) {
        this.mRecyclerListener = interfaceC22072OooOo0o;
    }

    public void setScrollState(int i) {
        if (i == this.mScrollState) {
            return;
        }
        this.mScrollState = i;
        if (i != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i);
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC22077OooOoo0 abstractC22077OooOoo0) {
        this.mRecycler.getClass();
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? AccessibilityEventCompat.getContentChangeTypes(accessibilityEvent) : 0;
        this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, null);
    }

    public void smoothScrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oooOOOO.smoothScrollToPosition(this, this.mState, i);
        }
    }

    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().startNestedScroll(i);
    }

    public void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        getScrollingChildHelper().stopNestedScroll();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(AbstractC22062OooO0oO abstractC22062OooO0oO, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(abstractC22062OooO0oO, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int i4;
        int iOooO0oo = this.mChildHelper.OooO0oo();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iOooO0oo; i6++) {
            View viewOooO0oO = this.mChildHelper.OooO0oO(i6);
            AbstractC22078OooOooO childViewHolderInt = getChildViewHolderInt(viewOooO0oO);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i4 = childViewHolderInt.mPosition) >= i && i4 < i5) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((C22066OooOOOo) viewOooO0oO.getLayoutParams()).mInsetsDirty = true;
            }
        }
        C22071OooOo0O c22071OooOo0O = this.mRecycler;
        ArrayList<AbstractC22078OooOooO> arrayList = c22071OooOo0O.f66080OooO0OO;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC22078OooOooO abstractC22078OooOooO = arrayList.get(size);
            if (abstractC22078OooOooO != null && (i3 = abstractC22078OooOooO.mPosition) >= i && i3 < i5) {
                abstractC22078OooOooO.addFlags(2);
                c22071OooOo0O.OooO0oO(size);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$OooO0oO, reason: case insensitive filesystem */
    public static abstract class AbstractC22062OooO0oO<VH extends AbstractC22078OooOooO> {
        private final C22063OooO0oo mObservable = new C22063OooO0oo();
        private boolean mHasStableIds = false;
        private OooO00o mStateRestorationPolicy = OooO00o.f66055OooOo0o;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$OooO0oO$OooO00o */
        public static final class OooO00o {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public static final /* synthetic */ OooO00o[] f66054OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public static final OooO00o f66055OooOo0o;

            static {
                OooO00o oooO00o = new OooO00o("ALLOW", 0);
                f66055OooOo0o = oooO00o;
                f66054OooOo = new OooO00o[]{oooO00o, new OooO00o("PREVENT_WHEN_EMPTY", 1), new OooO00o("PREVENT", 2)};
            }

            public OooO00o() {
                throw null;
            }

            public static OooO00o valueOf(String str) {
                return (OooO00o) Enum.valueOf(OooO00o.class, str);
            }

            public static OooO00o[] values() {
                return (OooO00o[]) f66054OooOo.clone();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(VH vh, int i) {
            boolean z = vh.mBindingAdapter == null;
            if (z) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                TraceCompat.beginSection(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof C22066OooOOOo) {
                    ((C22066OooOOOo) layoutParams).mInsetsDirty = true;
                }
                TraceCompat.endSection();
            }
        }

        public boolean canRestoreState() {
            int iOrdinal = this.mStateRestorationPolicy.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return false;
                }
            } else if (getItemCount() <= 0) {
                return false;
            }
            return true;
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            try {
                TraceCompat.beginSection(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH vh = (VH) onCreateViewHolder(viewGroup, i);
                if (vh.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh.mItemViewType = i;
                return vh;
            } finally {
                TraceCompat.endSection();
            }
        }

        public int findRelativeAdapterPositionIn(AbstractC22062OooO0oO<? extends AbstractC22078OooOooO> abstractC22062OooO0oO, AbstractC22078OooOooO abstractC22078OooOooO, int i) {
            if (abstractC22062OooO0oO == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1L;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public final OooO00o getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.OooO00o();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.OooO0O0();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.OooO0Oo(i, 1, null);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.OooO0o0(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.OooO0OO(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.OooO0Oo(i, i2, null);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.OooO0o0(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.OooO0o(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.OooO0o(i, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void registerAdapterDataObserver(OooO oooO) {
            this.mObservable.registerObserver(oooO);
        }

        public void setHasStableIds(boolean z) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z;
        }

        public void setStateRestorationPolicy(OooO00o oooO00o) {
            this.mStateRestorationPolicy = oooO00o;
            this.mObservable.OooO0oO();
        }

        public void unregisterAdapterDataObserver(OooO oooO) {
            this.mObservable.unregisterObserver(oooO);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.OooO0Oo(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.OooO0Oo(i, i2, obj);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.orion.notein.global.R.attr.recyclerViewStyle);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC22078OooOooO findViewHolderForPosition(int i, boolean z) {
        int iOooO0oo = this.mChildHelper.OooO0oo();
        AbstractC22078OooOooO abstractC22078OooOooO = null;
        for (int i2 = 0; i2 < iOooO0oo; i2++) {
            AbstractC22078OooOooO childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z) {
                    if (childViewHolderInt.mPosition != i) {
                        continue;
                    } else {
                        C22030OooO0oO c22030OooO0oO = this.mChildHelper;
                        if (!c22030OooO0oO.f65830OooO0OO.contains(childViewHolderInt.itemView)) {
                            return childViewHolderInt;
                        }
                        abstractC22078OooOooO = childViewHolderInt;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i) {
                    continue;
                }
            }
        }
        return abstractC22078OooOooO;
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().hasNestedScrollingParent(i);
    }

    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, Integer.MIN_VALUE);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().startNestedScroll(i, i2);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i) {
        getScrollingChildHelper().stopNestedScroll(i);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mObserver = new OooOo();
        this.mRecycler = new C22071OooOo0O();
        this.mViewInfoStore = new Oooo0();
        this.mUpdateChildViewsRunnable = new OooO00o();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new OooOO0O();
        this.mItemAnimator = new C22031OooO0oo();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new RunnableC22076OooOoo();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new RunnableC22046OooOOo0.OooO0O0() : null;
        C22075OooOoOO c22075OooOoOO = new C22075OooOoOO();
        c22075OooOoOO.f66094OooO00o = -1;
        c22075OooOoOO.f66095OooO0O0 = 0;
        c22075OooOoOO.f66096OooO0OO = 0;
        c22075OooOoOO.f66097OooO0Oo = 1;
        c22075OooOoOO.f66099OooO0o0 = 0;
        c22075OooOoOO.f66098OooO0o = false;
        c22075OooOoOO.f66100OooO0oO = false;
        c22075OooOoOO.f66101OooO0oo = false;
        c22075OooOoOO.f66093OooO = false;
        c22075OooOoOO.f66102OooOO0 = false;
        c22075OooOoOO.f66103OooOO0O = false;
        this.mState = c22075OooOoOO;
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new OooOOO0();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new OooO0O0();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new C22060OooO0Oo();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.f66056OooO00o = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C22056OooOooO(this));
        int[] iArr = C24702OooO00o.f83744OooO00o;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, false);
        this.mEnableFastScroller = z;
        if (z) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6), typedArrayObtainStyledAttributes.getDrawable(7), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4), typedArrayObtainStyledAttributes.getDrawable(5));
        }
        typedArrayObtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().dispatchNestedScroll(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$OooOOOo, reason: case insensitive filesystem */
    public static class C22066OooOOOo extends ViewGroup.MarginLayoutParams {
        final Rect mDecorInsets;
        boolean mInsetsDirty;
        boolean mPendingInvalidate;
        AbstractC22078OooOooO mViewHolder;

        public C22066OooOOOo(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public int getAbsoluteAdapterPosition() {
            return this.mViewHolder.getAbsoluteAdapterPosition();
        }

        public int getBindingAdapterPosition() {
            return this.mViewHolder.getBindingAdapterPosition();
        }

        @Deprecated
        public int getViewAdapterPosition() {
            return this.mViewHolder.getBindingAdapterPosition();
        }

        public int getViewLayoutPosition() {
            return this.mViewHolder.getLayoutPosition();
        }

        @Deprecated
        public int getViewPosition() {
            return this.mViewHolder.getPosition();
        }

        public boolean isItemChanged() {
            return this.mViewHolder.isUpdated();
        }

        public boolean isItemRemoved() {
            return this.mViewHolder.isRemoved();
        }

        public boolean isViewInvalid() {
            return this.mViewHolder.isInvalid();
        }

        public boolean viewNeedsUpdate() {
            return this.mViewHolder.needsUpdate();
        }

        public C22066OooOOOo(int i, int i2) {
            super(i, i2);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public C22066OooOOOo(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public C22066OooOOOo(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public C22066OooOOOo(C22066OooOOOo c22066OooOOOo) {
            super((ViewGroup.LayoutParams) c22066OooOOOo);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!oooOOOO.canScrollHorizontally()) {
            i = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (i3 != Integer.MIN_VALUE && i3 <= 0) {
            scrollBy(i, i2);
            return;
        }
        if (z) {
            int i4 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i4 |= 2;
            }
            startNestedScroll(i4, 1);
        }
        this.mViewFlinger.OooO0O0(i, i2, interpolator, i3);
    }

    public void addItemDecoration(OooOOO oooOOO) {
        addItemDecoration(oooOOO, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        OooOOOO oooOOOO = this.mLayout;
        if (oooOOOO != null) {
            return oooOOOO.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException(androidx.recyclerview.widget.OooO0o.OooO00o(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
