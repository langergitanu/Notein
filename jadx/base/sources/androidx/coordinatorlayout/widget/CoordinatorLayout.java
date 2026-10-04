package androidx.coordinatorlayout.widget;

import OooOo.C20493Oooo00o;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Pools;
import androidx.core.view.GravityCompat;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.orion.notein.global.R;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent2, NestedScrollingParent3 {
    static final Class<?>[] CONSTRUCTOR_PARAMS;
    static final int EVENT_NESTED_SCROLL = 1;
    static final int EVENT_PRE_DRAW = 0;
    static final int EVENT_VIEW_REMOVED = 2;
    static final String TAG = "CoordinatorLayout";
    static final Comparator<View> TOP_SORTED_CHILDREN_COMPARATOR;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    static final String WIDGET_PACKAGE_NAME;
    static final ThreadLocal<Map<String, Constructor<OooO0OO>>> sConstructors;
    private static final Pools.Pool<Rect> sRectPool;
    private OnApplyWindowInsetsListener mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private View mBehaviorTouchView;
    private final androidx.coordinatorlayout.widget.OooO0OO<View> mChildDag;
    private final List<View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private WindowInsetsCompat mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final NestedScrollingParentHelper mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private ViewTreeObserverOnPreDrawListenerC21631OooO0oO mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List<View> mTempDependenciesList;
    private final List<View> mTempList1;

    public class OooO00o implements OnApplyWindowInsetsListener {
        public OooO00o() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return CoordinatorLayout.this.setWindowInsets(windowInsetsCompat);
        }
    }

    public interface OooO0O0 {
        OooO0OO getBehavior();
    }

    public static abstract class OooO0OO<V extends View> {
        public OooO0OO() {
        }

        public static Object getTag(View view) {
            return ((OooO0o) view.getLayoutParams()).f64189OooOOo;
        }

        public static void setTag(View view, Object obj) {
            ((OooO0o) view.getLayoutParams()).f64189OooOOo = obj;
        }

        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, V v) {
            return getScrimOpacity(coordinatorLayout, v) > 0.0f;
        }

        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public int getScrimColor(CoordinatorLayout coordinatorLayout, V v) {
            return ViewCompat.MEASURED_STATE_MASK;
        }

        public float getScrimOpacity(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public WindowInsetsCompat onApplyWindowInsets(CoordinatorLayout coordinatorLayout, V v, WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        public void onAttachedToLayoutParams(OooO0o oooO0o) {
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public OooO0OO(Context context, AttributeSet attributeSet) {
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v, view, view2, i);
            }
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return onStartNestedScroll(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                onStopNestedScroll(coordinatorLayout, v, view);
            }
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$OooO0Oo, reason: case insensitive filesystem */
    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface InterfaceC21629OooO0Oo {
        Class<? extends OooO0OO> value();
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$OooO0o0, reason: case insensitive filesystem */
    public class ViewGroupOnHierarchyChangeListenerC21630OooO0o0 implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroupOnHierarchyChangeListenerC21630OooO0o0() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.onChildViewsChanged(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$OooO0oO, reason: case insensitive filesystem */
    public class ViewTreeObserverOnPreDrawListenerC21631OooO0oO implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserverOnPreDrawListenerC21631OooO0oO() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.onChildViewsChanged(0);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$OooO0oo, reason: case insensitive filesystem */
    public static class C21632OooO0oo implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            float z = ViewCompat.getZ(view);
            float z2 = ViewCompat.getZ(view2);
            if (z > z2) {
                return -1;
            }
            return z < z2 ? 1 : 0;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public SparseArray<Parcelable> f64193OooOo0o;

        public static class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
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
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f64193OooOo0o = new SparseArray<>(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.f64193OooOo0o.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f64193OooOo0o;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f64193OooOo0o.keyAt(i2);
                parcelableArr[i2] = this.f64193OooOo0o.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        WIDGET_PACKAGE_NAME = r0 != null ? r0.getName() : null;
        TOP_SORTED_CHILDREN_COMPARATOR = new C21632OooO0oo();
        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        sConstructors = new ThreadLocal<>();
        sRectPool = new Pools.SynchronizedPool(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private static Rect acquireTempRect() {
        Rect rectAcquire = sRectPool.acquire();
        return rectAcquire == null ? new Rect() : rectAcquire;
    }

    private static int clamp(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    private void constrainChildRect(OooO0o oooO0o, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) oooO0o).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) oooO0o).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) oooO0o).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) oooO0o).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    private WindowInsetsCompat dispatchApplyWindowInsetsToBehaviors(WindowInsetsCompat windowInsetsCompat) {
        OooO0OO oooO0OO;
        if (windowInsetsCompat.isConsumed()) {
            return windowInsetsCompat;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (ViewCompat.getFitsSystemWindows(childAt) && (oooO0OO = ((OooO0o) childAt.getLayoutParams()).f64174OooO00o) != null) {
                windowInsetsCompat = oooO0OO.onApplyWindowInsets(this, childAt, windowInsetsCompat);
                if (windowInsetsCompat.isConsumed()) {
                    return windowInsetsCompat;
                }
            }
        }
        return windowInsetsCompat;
    }

    private void getDesiredAnchoredChildRectWithoutConstraints(View view, int i, Rect rect, Rect rect2, OooO0o oooO0o, int i2, int i3) {
        int absoluteGravity = GravityCompat.getAbsoluteGravity(resolveAnchoredChildGravity(oooO0o.f64176OooO0OO), i);
        int absoluteGravity2 = GravityCompat.getAbsoluteGravity(resolveGravity(oooO0o.f64177OooO0Oo), i);
        int i4 = absoluteGravity & 7;
        int i5 = absoluteGravity & 112;
        int i6 = absoluteGravity2 & 7;
        int i7 = absoluteGravity2 & 112;
        int iWidth = i6 != 1 ? i6 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i7 != 16 ? i7 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i4 == 1) {
            iWidth -= i2 / 2;
        } else if (i4 != 5) {
            iWidth -= i2;
        }
        if (i5 == 16) {
            iHeight -= i3 / 2;
        } else if (i5 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    private int getKeyline(int i) {
        int[] iArr = this.mKeylines;
        if (iArr == null) {
            Log.e(TAG, "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e(TAG, "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    private void getTopSortedChildren(List<View> list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean hasDependencies(View view) {
        C20493Oooo00o<View, ArrayList<View>> c20493Oooo00o = this.mChildDag.f64195OooO0O0;
        int i = c20493Oooo00o.f58550OooOoO0;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList<View> arrayListOooOO0O = c20493Oooo00o.OooOO0O(i2);
            if (arrayListOooOO0O != null && arrayListOooOO0O.contains(view)) {
                return true;
            }
        }
        return false;
    }

    private void layoutChild(View view, int i) {
        OooO0o oooO0o = (OooO0o) view.getLayoutParams();
        Rect rectAcquireTempRect = acquireTempRect();
        rectAcquireTempRect.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) oooO0o).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) oooO0o).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) oooO0o).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) oooO0o).bottomMargin);
        if (this.mLastInsets != null && ViewCompat.getFitsSystemWindows(this) && !ViewCompat.getFitsSystemWindows(view)) {
            rectAcquireTempRect.left = this.mLastInsets.getSystemWindowInsetLeft() + rectAcquireTempRect.left;
            rectAcquireTempRect.top = this.mLastInsets.getSystemWindowInsetTop() + rectAcquireTempRect.top;
            rectAcquireTempRect.right -= this.mLastInsets.getSystemWindowInsetRight();
            rectAcquireTempRect.bottom -= this.mLastInsets.getSystemWindowInsetBottom();
        }
        Rect rectAcquireTempRect2 = acquireTempRect();
        GravityCompat.apply(resolveGravity(oooO0o.f64176OooO0OO), view.getMeasuredWidth(), view.getMeasuredHeight(), rectAcquireTempRect, rectAcquireTempRect2, i);
        view.layout(rectAcquireTempRect2.left, rectAcquireTempRect2.top, rectAcquireTempRect2.right, rectAcquireTempRect2.bottom);
        releaseTempRect(rectAcquireTempRect);
        releaseTempRect(rectAcquireTempRect2);
    }

    private void layoutChildWithAnchor(View view, View view2, int i) {
        Rect rectAcquireTempRect = acquireTempRect();
        Rect rectAcquireTempRect2 = acquireTempRect();
        try {
            getDescendantRect(view2, rectAcquireTempRect);
            getDesiredAnchoredChildRect(view, i, rectAcquireTempRect, rectAcquireTempRect2);
            view.layout(rectAcquireTempRect2.left, rectAcquireTempRect2.top, rectAcquireTempRect2.right, rectAcquireTempRect2.bottom);
        } finally {
            releaseTempRect(rectAcquireTempRect);
            releaseTempRect(rectAcquireTempRect2);
        }
    }

    private void layoutChildWithKeyline(View view, int i, int i2) {
        OooO0o oooO0o = (OooO0o) view.getLayoutParams();
        int absoluteGravity = GravityCompat.getAbsoluteGravity(resolveKeylineGravity(oooO0o.f64176OooO0OO), i2);
        int i3 = absoluteGravity & 7;
        int i4 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int keyline = getKeyline(i) - measuredWidth;
        if (i3 == 1) {
            keyline += measuredWidth / 2;
        } else if (i3 == 5) {
            keyline += measuredWidth;
        }
        int i5 = i4 != 16 ? i4 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) oooO0o).leftMargin, Math.min(keyline, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) oooO0o).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) oooO0o).topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) oooO0o).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private void offsetChildByInset(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (ViewCompat.isLaidOut(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            OooO0o oooO0o = (OooO0o) view.getLayoutParams();
            OooO0OO oooO0OO = oooO0o.f64174OooO00o;
            Rect rectAcquireTempRect = acquireTempRect();
            Rect rectAcquireTempRect2 = acquireTempRect();
            rectAcquireTempRect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (oooO0OO == null || !oooO0OO.getInsetDodgeRect(this, view, rectAcquireTempRect)) {
                rectAcquireTempRect.set(rectAcquireTempRect2);
            } else if (!rectAcquireTempRect2.contains(rectAcquireTempRect)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectAcquireTempRect.toShortString() + " | Bounds:" + rectAcquireTempRect2.toShortString());
            }
            releaseTempRect(rectAcquireTempRect2);
            if (rectAcquireTempRect.isEmpty()) {
                releaseTempRect(rectAcquireTempRect);
                return;
            }
            int absoluteGravity = GravityCompat.getAbsoluteGravity(oooO0o.f64181OooO0oo, i);
            boolean z3 = true;
            if ((absoluteGravity & 48) != 48 || (i6 = (rectAcquireTempRect.top - ((ViewGroup.MarginLayoutParams) oooO0o).topMargin) - oooO0o.f64182OooOO0) >= (i7 = rect.top)) {
                z = false;
            } else {
                setInsetOffsetY(view, i7 - i6);
                z = true;
            }
            if ((absoluteGravity & 80) == 80 && (height = ((getHeight() - rectAcquireTempRect.bottom) - ((ViewGroup.MarginLayoutParams) oooO0o).bottomMargin) + oooO0o.f64182OooOO0) < (i5 = rect.bottom)) {
                setInsetOffsetY(view, height - i5);
                z = true;
            }
            if (!z) {
                setInsetOffsetY(view, 0);
            }
            if ((absoluteGravity & 3) != 3 || (i3 = (rectAcquireTempRect.left - ((ViewGroup.MarginLayoutParams) oooO0o).leftMargin) - oooO0o.f64173OooO) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                setInsetOffsetX(view, i4 - i3);
                z2 = true;
            }
            if ((absoluteGravity & 5) != 5 || (width = ((getWidth() - rectAcquireTempRect.right) - ((ViewGroup.MarginLayoutParams) oooO0o).rightMargin) + oooO0o.f64173OooO) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                setInsetOffsetX(view, width - i2);
            }
            if (!z3) {
                setInsetOffsetX(view, 0);
            }
            releaseTempRect(rectAcquireTempRect);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static OooO0OO parseBehavior(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = WIDGET_PACKAGE_NAME;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + FilenameUtils.EXTENSION_SEPARATOR + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<OooO0OO>>> threadLocal = sConstructors;
            Map<String, Constructor<OooO0OO>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<OooO0OO> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Could not inflate Behavior subclass ", str), e);
        }
    }

    private boolean performIntercept(MotionEvent motionEvent, int i) {
        boolean zBlocksInteractionBelow;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.mTempList1;
        getTopSortedChildren(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zOnInterceptTouchEvent = false;
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = list.get(i2);
            OooO0o oooO0o = (OooO0o) view.getLayoutParams();
            OooO0OO oooO0OO = oooO0o.f64174OooO00o;
            if (!(zOnInterceptTouchEvent || z) || actionMasked == 0) {
                if (!zOnInterceptTouchEvent && oooO0OO != null) {
                    if (i == 0) {
                        zOnInterceptTouchEvent = oooO0OO.onInterceptTouchEvent(this, view, motionEvent);
                    } else if (i == 1) {
                        zOnInterceptTouchEvent = oooO0OO.onTouchEvent(this, view, motionEvent);
                    }
                    if (zOnInterceptTouchEvent) {
                        this.mBehaviorTouchView = view;
                    }
                }
                OooO0OO oooO0OO2 = oooO0o.f64174OooO00o;
                if (oooO0OO2 == null) {
                    oooO0o.f64186OooOOO0 = false;
                }
                boolean z2 = oooO0o.f64186OooOOO0;
                if (z2) {
                    zBlocksInteractionBelow = true;
                } else {
                    zBlocksInteractionBelow = (oooO0OO2 != null ? oooO0OO2.blocksInteractionBelow(this, view) : false) | z2;
                    oooO0o.f64186OooOOO0 = zBlocksInteractionBelow;
                }
                boolean z3 = zBlocksInteractionBelow && !z2;
                if (zBlocksInteractionBelow && !z3) {
                    break;
                }
                z = z3;
            } else if (oooO0OO != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    oooO0OO.onInterceptTouchEvent(this, view, motionEventObtain);
                } else if (i == 1) {
                    oooO0OO.onTouchEvent(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zOnInterceptTouchEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v3 java.util.Collection<? extends android.view.View>
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    private void prepareChildren() {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.prepareChildren():void");
    }

    private static void releaseTempRect(Rect rect) {
        rect.setEmpty();
        sRectPool.release(rect);
    }

    private void resetTouchBehaviors(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            OooO0OO oooO0OO = ((OooO0o) childAt.getLayoutParams()).f64174OooO00o;
            if (oooO0OO != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    oooO0OO.onInterceptTouchEvent(this, childAt, motionEventObtain);
                } else {
                    oooO0OO.onTouchEvent(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((OooO0o) getChildAt(i2).getLayoutParams()).f64186OooOOO0 = false;
        }
        this.mBehaviorTouchView = null;
        this.mDisallowInterceptReset = false;
    }

    private static int resolveAnchoredChildGravity(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    private static int resolveGravity(int i) {
        if ((i & 7) == 0) {
            i |= GravityCompat.START;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    private static int resolveKeylineGravity(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    private void setInsetOffsetX(View view, int i) {
        OooO0o oooO0o = (OooO0o) view.getLayoutParams();
        int i2 = oooO0o.f64173OooO;
        if (i2 != i) {
            ViewCompat.offsetLeftAndRight(view, i - i2);
            oooO0o.f64173OooO = i;
        }
    }

    private void setInsetOffsetY(View view, int i) {
        OooO0o oooO0o = (OooO0o) view.getLayoutParams();
        int i2 = oooO0o.f64182OooOO0;
        if (i2 != i) {
            ViewCompat.offsetTopAndBottom(view, i - i2);
            oooO0o.f64182OooOO0 = i;
        }
    }

    private void setupForInsets() {
        if (!ViewCompat.getFitsSystemWindows(this)) {
            ViewCompat.setOnApplyWindowInsetsListener(this, null);
            return;
        }
        if (this.mApplyWindowInsetsListener == null) {
            this.mApplyWindowInsetsListener = new OooO00o();
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, this.mApplyWindowInsetsListener);
        setSystemUiVisibility(1280);
    }

    public void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new ViewTreeObserverOnPreDrawListenerC21631OooO0oO();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof OooO0o) && super.checkLayoutParams(layoutParams);
    }

    public void dispatchDependentViewsChanged(View view) {
        ArrayList<View> arrayList = this.mChildDag.f64195OooO0O0.get(view);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View view2 = arrayList.get(i);
            OooO0OO oooO0OO = ((OooO0o) view2.getLayoutParams()).f64174OooO00o;
            if (oooO0OO != null) {
                oooO0OO.onDependentViewChanged(this, view2, view);
            }
        }
    }

    public boolean doViewsOverlap(View view, View view2) {
        boolean z = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect rectAcquireTempRect = acquireTempRect();
        getChildRect(view, view.getParent() != this, rectAcquireTempRect);
        Rect rectAcquireTempRect2 = acquireTempRect();
        getChildRect(view2, view2.getParent() != this, rectAcquireTempRect2);
        try {
            if (rectAcquireTempRect.left <= rectAcquireTempRect2.right && rectAcquireTempRect.top <= rectAcquireTempRect2.bottom && rectAcquireTempRect.right >= rectAcquireTempRect2.left) {
                if (rectAcquireTempRect.bottom >= rectAcquireTempRect2.top) {
                    z = true;
                }
            }
            return z;
        } finally {
            releaseTempRect(rectAcquireTempRect);
            releaseTempRect(rectAcquireTempRect2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean drawChild(Canvas canvas, View view, long j) {
        OooO0o oooO0o = (OooO0o) view.getLayoutParams();
        OooO0OO oooO0OO = oooO0o.f64174OooO00o;
        if (oooO0OO != null) {
            float scrimOpacity = oooO0OO.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new Paint();
                }
                this.mScrimPaint.setColor(oooO0o.f64174OooO00o.getScrimColor(this, view));
                this.mScrimPaint.setAlpha(clamp(Math.round(scrimOpacity * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.mScrimPaint);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mStatusBarBackground;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (hasDependencies(getChildAt(i))) {
                z = true;
                break;
            }
            i++;
        }
        if (z != this.mNeedsPreDrawListener) {
            if (z) {
                addPreDrawListener();
            } else {
                removePreDrawListener();
            }
        }
    }

    public void getChildRect(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            getDescendantRect(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List<View> getDependencies(View view) {
        C20493Oooo00o<View, ArrayList<View>> c20493Oooo00o = this.mChildDag.f64195OooO0O0;
        int i = c20493Oooo00o.f58550OooOoO0;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList<View> arrayListOooOO0O = c20493Oooo00o.OooOO0O(i2);
            if (arrayListOooOO0O != null && arrayListOooOO0O.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c20493Oooo00o.OooO0oO(i2));
            }
        }
        this.mTempDependenciesList.clear();
        if (arrayList != null) {
            this.mTempDependenciesList.addAll(arrayList);
        }
        return this.mTempDependenciesList;
    }

    public final List<View> getDependencySortedChildren() {
        prepareChildren();
        return Collections.unmodifiableList(this.mDependencySortedChildren);
    }

    public List<View> getDependents(View view) {
        ArrayList<View> arrayList = this.mChildDag.f64195OooO0O0.get(view);
        this.mTempDependenciesList.clear();
        if (arrayList != null) {
            this.mTempDependenciesList.addAll(arrayList);
        }
        return this.mTempDependenciesList;
    }

    public void getDescendantRect(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = C21633OooO0Oo.f64198OooO00o;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = C21633OooO0Oo.f64198OooO00o;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        C21633OooO0Oo.OooO00o(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = C21633OooO0Oo.f64199OooO0O0;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public void getDesiredAnchoredChildRect(View view, int i, Rect rect, Rect rect2) {
        OooO0o oooO0o = (OooO0o) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        getDesiredAnchoredChildRectWithoutConstraints(view, i, rect, rect2, oooO0o, measuredWidth, measuredHeight);
        constrainChildRect(oooO0o, rect2, measuredWidth, measuredHeight);
    }

    public void getLastChildRect(View view, Rect rect) {
        rect.set(((OooO0o) view.getLayoutParams()).f64190OooOOo0);
    }

    public final WindowInsetsCompat getLastWindowInsets() {
        return this.mLastInsets;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.getNestedScrollAxes();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OooO0o getResolvedLayoutParams(View view) {
        OooO0o oooO0o = (OooO0o) view.getLayoutParams();
        if (!oooO0o.f64175OooO0O0) {
            if (view instanceof OooO0O0) {
                OooO0OO behavior = ((OooO0O0) view).getBehavior();
                if (behavior == null) {
                    Log.e(TAG, "Attached behavior class is null");
                }
                oooO0o.OooO0O0(behavior);
                oooO0o.f64175OooO0O0 = true;
                return oooO0o;
            }
            InterfaceC21629OooO0Oo interfaceC21629OooO0Oo = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC21629OooO0Oo = (InterfaceC21629OooO0Oo) superclass.getAnnotation(InterfaceC21629OooO0Oo.class);
                if (interfaceC21629OooO0Oo != null) {
                    break;
                }
            }
            if (interfaceC21629OooO0Oo != null) {
                try {
                    oooO0o.OooO0O0(interfaceC21629OooO0Oo.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception e) {
                    Log.e(TAG, "Default behavior class " + interfaceC21629OooO0Oo.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            oooO0o.f64175OooO0O0 = true;
        }
        return oooO0o;
    }

    public Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public boolean isPointInChildBounds(View view, int i, int i2) {
        Rect rectAcquireTempRect = acquireTempRect();
        getDescendantRect(view, rectAcquireTempRect);
        try {
            return rectAcquireTempRect.contains(i, i2);
        } finally {
            releaseTempRect(rectAcquireTempRect);
        }
    }

    public void offsetChildToAnchor(View view, int i) {
        OooO0OO oooO0OO;
        OooO0o oooO0o = (OooO0o) view.getLayoutParams();
        if (oooO0o.f64183OooOO0O != null) {
            Rect rectAcquireTempRect = acquireTempRect();
            Rect rectAcquireTempRect2 = acquireTempRect();
            Rect rectAcquireTempRect3 = acquireTempRect();
            getDescendantRect(oooO0o.f64183OooOO0O, rectAcquireTempRect);
            getChildRect(view, false, rectAcquireTempRect2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            getDesiredAnchoredChildRectWithoutConstraints(view, i, rectAcquireTempRect, rectAcquireTempRect3, oooO0o, measuredWidth, measuredHeight);
            boolean z = (rectAcquireTempRect3.left == rectAcquireTempRect2.left && rectAcquireTempRect3.top == rectAcquireTempRect2.top) ? false : true;
            constrainChildRect(oooO0o, rectAcquireTempRect3, measuredWidth, measuredHeight);
            int i2 = rectAcquireTempRect3.left - rectAcquireTempRect2.left;
            int i3 = rectAcquireTempRect3.top - rectAcquireTempRect2.top;
            if (i2 != 0) {
                ViewCompat.offsetLeftAndRight(view, i2);
            }
            if (i3 != 0) {
                ViewCompat.offsetTopAndBottom(view, i3);
            }
            if (z && (oooO0OO = oooO0o.f64174OooO00o) != null) {
                oooO0OO.onDependentViewChanged(this, view, oooO0o.f64183OooOO0O);
            }
            releaseTempRect(rectAcquireTempRect);
            releaseTempRect(rectAcquireTempRect2);
            releaseTempRect(rectAcquireTempRect3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new ViewTreeObserverOnPreDrawListenerC21631OooO0oO();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null && ViewCompat.getFitsSystemWindows(this)) {
            ViewCompat.requestApplyInsets(this);
        }
        this.mIsAttachedToWindow = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onChildViewsChanged(int i) {
        int i2;
        boolean z;
        boolean zOnDependentViewChanged;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int size = this.mDependencySortedChildren.size();
        Rect rectAcquireTempRect = acquireTempRect();
        Rect rectAcquireTempRect2 = acquireTempRect();
        Rect rectAcquireTempRect3 = acquireTempRect();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.mDependencySortedChildren.get(i3);
            OooO0o oooO0o = (OooO0o) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (oooO0o.f64184OooOO0o == this.mDependencySortedChildren.get(i4)) {
                        offsetChildToAnchor(view, layoutDirection);
                    }
                }
                boolean z2 = true;
                getChildRect(view, true, rectAcquireTempRect2);
                if (oooO0o.f64180OooO0oO != 0 && !rectAcquireTempRect2.isEmpty()) {
                    int absoluteGravity = GravityCompat.getAbsoluteGravity(oooO0o.f64180OooO0oO, layoutDirection);
                    int i5 = absoluteGravity & 112;
                    if (i5 == 48) {
                        rectAcquireTempRect.top = Math.max(rectAcquireTempRect.top, rectAcquireTempRect2.bottom);
                    } else if (i5 == 80) {
                        rectAcquireTempRect.bottom = Math.max(rectAcquireTempRect.bottom, getHeight() - rectAcquireTempRect2.top);
                    }
                    int i6 = absoluteGravity & 7;
                    if (i6 == 3) {
                        rectAcquireTempRect.left = Math.max(rectAcquireTempRect.left, rectAcquireTempRect2.right);
                    } else if (i6 == 5) {
                        rectAcquireTempRect.right = Math.max(rectAcquireTempRect.right, getWidth() - rectAcquireTempRect2.left);
                    }
                }
                if (oooO0o.f64181OooO0oo != 0 && view.getVisibility() == 0) {
                    offsetChildByInset(view, rectAcquireTempRect, layoutDirection);
                }
                if (i != 2) {
                    getLastChildRect(view, rectAcquireTempRect3);
                    if (!rectAcquireTempRect3.equals(rectAcquireTempRect2)) {
                        recordLastChildRect(view, rectAcquireTempRect2);
                        i2 = i3 + 1;
                        while (i2 < size) {
                            View view2 = this.mDependencySortedChildren.get(i2);
                            OooO0o oooO0o2 = (OooO0o) view2.getLayoutParams();
                            OooO0OO oooO0OO = oooO0o2.f64174OooO00o;
                            if (oooO0OO == null || !oooO0OO.layoutDependsOn(this, view2, view)) {
                                z = z2;
                            } else if (i == 0 && oooO0o2.f64188OooOOOo) {
                                oooO0o2.f64188OooOOOo = false;
                                z = true;
                            } else {
                                if (i != 2) {
                                    zOnDependentViewChanged = oooO0OO.onDependentViewChanged(this, view2, view);
                                } else {
                                    oooO0OO.onDependentViewRemoved(this, view2, view);
                                    zOnDependentViewChanged = true;
                                }
                                z = true;
                                if (i == 1) {
                                    oooO0o2.f64188OooOOOo = zOnDependentViewChanged;
                                }
                            }
                            i2++;
                            z2 = z;
                        }
                    }
                } else {
                    i2 = i3 + 1;
                    while (i2 < size) {
                    }
                }
            }
        }
        releaseTempRect(rectAcquireTempRect);
        releaseTempRect(rectAcquireTempRect2);
        releaseTempRect(rectAcquireTempRect3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.mIsAttachedToWindow = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mDrawStatusBarBackground || this.mStatusBarBackground == null) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.mLastInsets;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetTouchBehaviors(true);
        }
        boolean zPerformIntercept = performIntercept(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zPerformIntercept;
        }
        resetTouchBehaviors(true);
        return zPerformIntercept;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        OooO0OO oooO0OO;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int size = this.mDependencySortedChildren.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.mDependencySortedChildren.get(i5);
            if (view.getVisibility() != 8 && ((oooO0OO = ((OooO0o) view.getLayoutParams()).f64174OooO00o) == null || !oooO0OO.onLayoutChild(this, view, layoutDirection))) {
                onLayoutChild(view, layoutDirection);
            }
        }
    }

    public void onLayoutChild(View view, int i) {
        OooO0o oooO0o = (OooO0o) view.getLayoutParams();
        View view2 = oooO0o.f64183OooOO0O;
        if (view2 == null && oooO0o.f64178OooO0o != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            layoutChildWithAnchor(view, view2, i);
            return;
        }
        int i2 = oooO0o.f64179OooO0o0;
        if (i2 >= 0) {
            layoutChildWithKeyline(view, i2, i);
        } else {
            layoutChild(view, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        OooO0OO oooO0OO;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        View view;
        int i15;
        int i16;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.prepareChildren();
        coordinatorLayout.ensurePreDrawListener();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int layoutDirection = ViewCompat.getLayoutDirection(coordinatorLayout);
        boolean z = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i17 = paddingLeft + paddingRight;
        int i18 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z2 = coordinatorLayout.mLastInsets != null && ViewCompat.getFitsSystemWindows(coordinatorLayout);
        int size3 = coordinatorLayout.mDependencySortedChildren.size();
        int i19 = 0;
        int iCombineMeasuredStates = 0;
        while (i19 < size3) {
            View view2 = coordinatorLayout.mDependencySortedChildren.get(i19);
            int i20 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                i9 = size3;
                i6 = i19;
                i15 = paddingRight;
                i11 = layoutDirection;
                suggestedMinimumWidth = i20;
                i7 = paddingLeft;
            } else {
                OooO0o oooO0o = (OooO0o) view2.getLayoutParams();
                int i21 = oooO0o.f64179OooO0o0;
                if (i21 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                } else {
                    int keyline = coordinatorLayout.getKeyline(i21);
                    int absoluteGravity = GravityCompat.getAbsoluteGravity(resolveKeylineGravity(oooO0o.f64176OooO0OO), layoutDirection) & 7;
                    i3 = suggestedMinimumHeight;
                    if ((absoluteGravity == 3 && !z) || (absoluteGravity == 5 && z)) {
                        iMax = Math.max(0, (size - paddingRight) - keyline);
                    } else if ((absoluteGravity == 5 && !z) || (absoluteGravity == 3 && z)) {
                        iMax = Math.max(0, keyline - paddingLeft);
                    }
                    int i22 = i19;
                    i5 = iMax;
                    i4 = i22;
                    if (z2 || ViewCompat.getFitsSystemWindows(view2)) {
                        i6 = i4;
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        i6 = i4;
                        int systemWindowInsetRight = coordinatorLayout.mLastInsets.getSystemWindowInsetRight() + coordinatorLayout.mLastInsets.getSystemWindowInsetLeft();
                        int systemWindowInsetBottom = coordinatorLayout.mLastInsets.getSystemWindowInsetBottom() + coordinatorLayout.mLastInsets.getSystemWindowInsetTop();
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - systemWindowInsetRight, mode);
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - systemWindowInsetBottom, mode2);
                    }
                    oooO0OO = oooO0o.f64174OooO00o;
                    if (oooO0OO == null) {
                        i9 = size3;
                        int i23 = iMakeMeasureSpec;
                        view = view2;
                        i7 = paddingLeft;
                        i8 = i20;
                        i11 = layoutDirection;
                        i12 = i3;
                        i15 = paddingRight;
                        i16 = iCombineMeasuredStates;
                        int i24 = iMakeMeasureSpec2;
                        boolean zOnMeasureChild = oooO0OO.onMeasureChild(this, view, i23, i5, i24, 0);
                        i14 = i23;
                        i10 = i5;
                        i13 = i24;
                        if (zOnMeasureChild) {
                            coordinatorLayout = this;
                        }
                        suggestedMinimumWidth = Math.max(i8, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) oooO0o).leftMargin + ((ViewGroup.MarginLayoutParams) oooO0o).rightMargin);
                        int iMax2 = Math.max(i12, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) oooO0o).topMargin + ((ViewGroup.MarginLayoutParams) oooO0o).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i16, view.getMeasuredState());
                        suggestedMinimumHeight = iMax2;
                    } else {
                        i7 = paddingLeft;
                        i8 = i20;
                        i9 = size3;
                        i10 = i5;
                        i11 = layoutDirection;
                        i12 = i3;
                        i13 = iMakeMeasureSpec2;
                        i14 = iMakeMeasureSpec;
                        view = view2;
                        i15 = paddingRight;
                        i16 = iCombineMeasuredStates;
                    }
                    View view3 = view;
                    coordinatorLayout = this;
                    coordinatorLayout.onMeasureChild(view3, i14, i10, i13, 0);
                    view = view3;
                    suggestedMinimumWidth = Math.max(i8, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) oooO0o).leftMargin + ((ViewGroup.MarginLayoutParams) oooO0o).rightMargin);
                    int iMax22 = Math.max(i12, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) oooO0o).topMargin + ((ViewGroup.MarginLayoutParams) oooO0o).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i16, view.getMeasuredState());
                    suggestedMinimumHeight = iMax22;
                }
                i4 = i19;
                i5 = 0;
                if (z2) {
                    i6 = i4;
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                    oooO0OO = oooO0o.f64174OooO00o;
                    if (oooO0OO == null) {
                    }
                    View view32 = view;
                    coordinatorLayout = this;
                    coordinatorLayout.onMeasureChild(view32, i14, i10, i13, 0);
                    view = view32;
                    suggestedMinimumWidth = Math.max(i8, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) oooO0o).leftMargin + ((ViewGroup.MarginLayoutParams) oooO0o).rightMargin);
                    int iMax222 = Math.max(i12, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) oooO0o).topMargin + ((ViewGroup.MarginLayoutParams) oooO0o).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i16, view.getMeasuredState());
                    suggestedMinimumHeight = iMax222;
                }
            }
            i19 = i6 + 1;
            paddingLeft = i7;
            paddingRight = i15;
            size3 = i9;
            layoutDirection = i11;
        }
        int i25 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i25), View.resolveSizeAndState(suggestedMinimumHeight, i2, i25 << 16));
    }

    public void onMeasureChild(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        OooO0OO oooO0OO;
        View view2;
        float f3;
        float f4;
        boolean z2;
        int childCount = getChildCount();
        int i = 0;
        boolean zOnNestedFling = false;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f3 = f;
                f4 = f2;
                z2 = z;
            } else {
                OooO0o oooO0o = (OooO0o) childAt.getLayoutParams();
                if (oooO0o.OooO00o(0) && (oooO0OO = oooO0o.f64174OooO00o) != null) {
                    view2 = view;
                    f3 = f;
                    f4 = f2;
                    z2 = z;
                    zOnNestedFling |= oooO0OO.onNestedFling(this, childAt, view2, f3, f4, z2);
                }
            }
            i++;
            view = view2;
            f = f3;
            f2 = f4;
            z = z2;
        }
        if (zOnNestedFling) {
            onChildViewsChanged(1);
        }
        return zOnNestedFling;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onNestedPreFling(View view, float f, float f2) {
        OooO0OO oooO0OO;
        View view2;
        float f3;
        float f4;
        int childCount = getChildCount();
        int i = 0;
        boolean zOnNestedPreFling = false;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f3 = f;
                f4 = f2;
            } else {
                OooO0o oooO0o = (OooO0o) childAt.getLayoutParams();
                if (oooO0o.OooO00o(0) && (oooO0OO = oooO0o.f64174OooO00o) != null) {
                    view2 = view;
                    f3 = f;
                    f4 = f2;
                    zOnNestedPreFling |= oooO0OO.onNestedPreFling(this, childAt, view2, f3, f4);
                }
            }
            i++;
            view = view2;
            f = f3;
            f2 = f4;
        }
        return zOnNestedPreFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray<Parcelable> sparseArray = savedState.f64193OooOo0o;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            OooO0OO oooO0OO = getResolvedLayoutParams(childAt).f64174OooO00o;
            if (id != -1 && oooO0OO != null && (parcelable2 = sparseArray.get(id)) != null) {
                oooO0OO.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            OooO0OO oooO0OO = ((OooO0o) childAt.getLayoutParams()).f64174OooO00o;
            if (id != -1 && oooO0OO != null && (parcelableOnSaveInstanceState = oooO0OO.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, parcelableOnSaveInstanceState);
            }
        }
        savedState.f64193OooOo0o = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zPerformIntercept;
        boolean zOnTouchEvent;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.mBehaviorTouchView == null) {
            zPerformIntercept = performIntercept(motionEvent, 1);
            if (!zPerformIntercept) {
                zOnTouchEvent = false;
            }
            motionEventObtain = null;
            if (this.mBehaviorTouchView != null) {
                zOnTouchEvent |= super.onTouchEvent(motionEvent);
            } else if (zPerformIntercept) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zOnTouchEvent;
            }
            resetTouchBehaviors(false);
            return zOnTouchEvent;
        }
        zPerformIntercept = false;
        OooO0OO oooO0OO = ((OooO0o) this.mBehaviorTouchView.getLayoutParams()).f64174OooO00o;
        if (oooO0OO != null) {
            zOnTouchEvent = oooO0OO.onTouchEvent(this, this.mBehaviorTouchView, motionEvent);
        }
        motionEventObtain = null;
        if (this.mBehaviorTouchView != null) {
        }
        if (motionEventObtain != null) {
        }
        if (actionMasked == 1) {
        }
        resetTouchBehaviors(false);
        return zOnTouchEvent;
    }

    public void recordLastChildRect(View view, Rect rect) {
        ((OooO0o) view.getLayoutParams()).f64190OooOOo0.set(rect);
    }

    public void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        OooO0OO oooO0OO = ((OooO0o) view.getLayoutParams()).f64174OooO00o;
        if (oooO0OO == null || !oooO0OO.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.mDisallowInterceptReset) {
            return;
        }
        resetTouchBehaviors(false);
        this.mDisallowInterceptReset = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        setupForInsets();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.mStatusBarBackground = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.mStatusBarBackground, ViewCompat.getLayoutDirection(this));
                this.mStatusBarBackground.setVisible(getVisibility() == 0, false);
                this.mStatusBarBackground.setCallback(this);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? ContextCompat.getDrawable(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.mStatusBarBackground;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.mStatusBarBackground.setVisible(z, false);
    }

    public final WindowInsetsCompat setWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        if (ObjectsCompat.equals(this.mLastInsets, windowInsetsCompat)) {
            return windowInsetsCompat;
        }
        this.mLastInsets = windowInsetsCompat;
        boolean z = false;
        boolean z2 = windowInsetsCompat != null && windowInsetsCompat.getSystemWindowInsetTop() > 0;
        this.mDrawStatusBarBackground = z2;
        if (!z2 && getBackground() == null) {
            z = true;
        }
        setWillNotDraw(z);
        WindowInsetsCompat windowInsetsCompatDispatchApplyWindowInsetsToBehaviors = dispatchApplyWindowInsetsToBehaviors(windowInsetsCompat);
        requestLayout();
        return windowInsetsCompatDispatchApplyWindowInsetsToBehaviors;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mStatusBarBackground;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    @Override // android.view.ViewGroup
    public OooO0o generateDefaultLayoutParams() {
        return new OooO0o();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        OooO0OO oooO0OO;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                OooO0o oooO0o = (OooO0o) childAt.getLayoutParams();
                if (oooO0o.OooO00o(i3) && (oooO0OO = oooO0o.f64174OooO00o) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    oooO0OO.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.mBehaviorConsumed;
                    iMax = i > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            onChildViewsChanged(1);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        OooO0OO oooO0OO;
        View view3;
        View view4;
        int i3;
        int i4;
        this.mNestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i, i2);
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            OooO0o oooO0o = (OooO0o) childAt.getLayoutParams();
            if (oooO0o.OooO00o(i2) && (oooO0OO = oooO0o.f64174OooO00o) != null) {
                view3 = view;
                view4 = view2;
                i3 = i;
                i4 = i2;
                oooO0OO.onNestedScrollAccepted(this, childAt, view3, view4, i3, i4);
            } else {
                view3 = view;
                view4 = view2;
                i3 = i;
                i4 = i2;
            }
            i5++;
            view = view3;
            view2 = view4;
            i = i3;
            i2 = i4;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                OooO0o oooO0o = (OooO0o) childAt.getLayoutParams();
                OooO0OO oooO0OO = oooO0o.f64174OooO00o;
                if (oooO0OO != null) {
                    boolean zOnStartNestedScroll = oooO0OO.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    z |= zOnStartNestedScroll;
                    if (i2 == 0) {
                        oooO0o.f64185OooOOO = zOnStartNestedScroll;
                    } else if (i2 == 1) {
                        oooO0o.f64187OooOOOO = zOnStartNestedScroll;
                    }
                } else if (i2 == 0) {
                    oooO0o.f64185OooOOO = false;
                } else if (i2 == 1) {
                    oooO0o.f64187OooOOOO = false;
                }
            }
        }
        return z;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        this.mNestedScrollingParentHelper.onStopNestedScroll(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            OooO0o oooO0o = (OooO0o) childAt.getLayoutParams();
            if (oooO0o.OooO00o(i)) {
                OooO0OO oooO0OO = oooO0o.f64174OooO00o;
                if (oooO0OO != null) {
                    oooO0OO.onStopNestedScroll(this, childAt, view, i);
                }
                if (i == 0) {
                    oooO0o.f64185OooOOO = false;
                } else if (i == 1) {
                    oooO0o.f64187OooOOOO = false;
                }
                oooO0o.f64188OooOOOo = false;
            }
        }
        this.mNestedScrollingTarget = null;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes;
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i);
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new androidx.coordinatorlayout.widget.OooO0OO<>();
        this.mTempList1 = new ArrayList();
        this.mTempDependenciesList = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        int[] iArr = o0000O.OooO00o.f81340OooO00o;
        if (i == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 2132018354);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i == 0) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, 0, 2132018354);
            coordinatorLayout = this;
            context2 = context;
        } else {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArray, i, 0);
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.mKeylines = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.mKeylines.length;
            for (int i2 = 0; i2 < length; i2++) {
                coordinatorLayout.mKeylines[i2] = (int) (r10[i2] * f);
            }
        }
        coordinatorLayout.mStatusBarBackground = typedArray.getDrawable(1);
        typedArray.recycle();
        setupForInsets();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC21630OooO0o0());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
    }

    @Override // android.view.ViewGroup
    public OooO0o generateLayoutParams(AttributeSet attributeSet) {
        return new OooO0o(getContext(), attributeSet);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        OooO0OO oooO0OO;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                OooO0o oooO0o = (OooO0o) childAt.getLayoutParams();
                if (oooO0o.OooO00o(i5) && (oooO0OO = oooO0o.f64174OooO00o) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    oooO0OO.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.mBehaviorConsumed;
                    iMax = i3 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            onChildViewsChanged(1);
        }
    }

    @Override // android.view.ViewGroup
    public OooO0o generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof OooO0o) {
            return new OooO0o((OooO0o) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new OooO0o((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new OooO0o(layoutParams);
    }

    public static class OooO0o extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f64173OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooO0OO f64174OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f64175OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f64176OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f64177OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f64178OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f64179OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f64180OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f64181OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f64182OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public View f64183OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public View f64184OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public boolean f64185OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f64186OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public boolean f64187OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public boolean f64188OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public Object f64189OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final Rect f64190OooOOo0;

        public OooO0o() {
            super(-2, -2);
            this.f64175OooO0O0 = false;
            this.f64176OooO0OO = 0;
            this.f64177OooO0Oo = 0;
            this.f64179OooO0o0 = -1;
            this.f64178OooO0o = -1;
            this.f64180OooO0oO = 0;
            this.f64181OooO0oo = 0;
            this.f64190OooOOo0 = new Rect();
        }

        public final boolean OooO00o(int i) {
            if (i == 0) {
                return this.f64185OooOOO;
            }
            if (i != 1) {
                return false;
            }
            return this.f64187OooOOOO;
        }

        public final void OooO0O0(OooO0OO oooO0OO) {
            OooO0OO oooO0OO2 = this.f64174OooO00o;
            if (oooO0OO2 != oooO0OO) {
                if (oooO0OO2 != null) {
                    oooO0OO2.onDetachedFromLayoutParams();
                }
                this.f64174OooO00o = oooO0OO;
                this.f64189OooOOo = null;
                this.f64175OooO0O0 = true;
                if (oooO0OO != null) {
                    oooO0OO.onAttachedToLayoutParams(this);
                }
            }
        }

        public OooO0o(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f64175OooO0O0 = false;
            this.f64176OooO0OO = 0;
            this.f64177OooO0Oo = 0;
            this.f64179OooO0o0 = -1;
            this.f64178OooO0o = -1;
            this.f64180OooO0oO = 0;
            this.f64181OooO0oo = 0;
            this.f64190OooOOo0 = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0000O.OooO00o.f81341OooO0O0);
            this.f64176OooO0OO = typedArrayObtainStyledAttributes.getInteger(0, 0);
            this.f64178OooO0o = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            this.f64177OooO0Oo = typedArrayObtainStyledAttributes.getInteger(2, 0);
            this.f64179OooO0o0 = typedArrayObtainStyledAttributes.getInteger(6, -1);
            this.f64180OooO0oO = typedArrayObtainStyledAttributes.getInt(5, 0);
            this.f64181OooO0oo = typedArrayObtainStyledAttributes.getInt(4, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
            this.f64175OooO0O0 = zHasValue;
            if (zHasValue) {
                this.f64174OooO00o = CoordinatorLayout.parseBehavior(context, attributeSet, typedArrayObtainStyledAttributes.getString(3));
            }
            typedArrayObtainStyledAttributes.recycle();
            OooO0OO oooO0OO = this.f64174OooO00o;
            if (oooO0OO != null) {
                oooO0OO.onAttachedToLayoutParams(this);
            }
        }

        public OooO0o(OooO0o oooO0o) {
            super((ViewGroup.MarginLayoutParams) oooO0o);
            this.f64175OooO0O0 = false;
            this.f64176OooO0OO = 0;
            this.f64177OooO0Oo = 0;
            this.f64179OooO0o0 = -1;
            this.f64178OooO0o = -1;
            this.f64180OooO0oO = 0;
            this.f64181OooO0oo = 0;
            this.f64190OooOOo0 = new Rect();
        }

        public OooO0o(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f64175OooO0O0 = false;
            this.f64176OooO0OO = 0;
            this.f64177OooO0Oo = 0;
            this.f64179OooO0o0 = -1;
            this.f64178OooO0o = -1;
            this.f64180OooO0oO = 0;
            this.f64181OooO0oo = 0;
            this.f64190OooOOo0 = new Rect();
        }

        public OooO0o(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f64175OooO0O0 = false;
            this.f64176OooO0OO = 0;
            this.f64177OooO0Oo = 0;
            this.f64179OooO0o0 = -1;
            this.f64178OooO0o = -1;
            this.f64180OooO0oO = 0;
            this.f64181OooO0oo = 0;
            this.f64190OooOOo0 = new Rect();
        }
    }
}
