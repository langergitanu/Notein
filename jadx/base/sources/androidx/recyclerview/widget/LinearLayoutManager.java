package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.location.LocationRequestCompat;
import androidx.recyclerview.widget.C22041OooOOo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RunnableC22046OooOOo0;
import com.aspose.words.EditingLanguage;
import com.aspose.words.StyleIdentifier;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.OooOOOO implements C22041OooOOo.InterfaceC22045OooO0oo, RecyclerView.AbstractC22073OooOoO.OooO0O0 {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final OooO00o mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final OooO0O0 mLayoutChunkResult;
    private OooO0OO mLayoutState;
    int mOrientation;
    AbstractC22055OooOoo0 mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public AbstractC22055OooOoo0 f65763OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f65764OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f65765OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f65766OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f65767OooO0o0;

        public OooO00o() {
            OooO0Oo();
        }

        public final void OooO00o() {
            this.f65765OooO0OO = this.f65766OooO0Oo ? this.f65763OooO00o.OooO0oO() : this.f65763OooO00o.OooOO0O();
        }

        public final void OooO0O0(int i, View view) {
            if (this.f65766OooO0Oo) {
                this.f65765OooO0OO = this.f65763OooO00o.OooOOO0() + this.f65763OooO00o.OooO0O0(view);
            } else {
                this.f65765OooO0OO = this.f65763OooO00o.OooO0o0(view);
            }
            this.f65764OooO0O0 = i;
        }

        public final void OooO0OO(int i, View view) {
            int iOooOOO0 = this.f65763OooO00o.OooOOO0();
            if (iOooOOO0 >= 0) {
                OooO0O0(i, view);
                return;
            }
            this.f65764OooO0O0 = i;
            if (!this.f65766OooO0Oo) {
                int iOooO0o0 = this.f65763OooO00o.OooO0o0(view);
                int iOooOO0O = iOooO0o0 - this.f65763OooO00o.OooOO0O();
                this.f65765OooO0OO = iOooO0o0;
                if (iOooOO0O > 0) {
                    int iOooO0oO = (this.f65763OooO00o.OooO0oO() - Math.min(0, (this.f65763OooO00o.OooO0oO() - iOooOOO0) - this.f65763OooO00o.OooO0O0(view))) - (this.f65763OooO00o.OooO0OO(view) + iOooO0o0);
                    if (iOooO0oO < 0) {
                        this.f65765OooO0OO -= Math.min(iOooOO0O, -iOooO0oO);
                        return;
                    }
                    return;
                }
                return;
            }
            int iOooO0oO2 = (this.f65763OooO00o.OooO0oO() - iOooOOO0) - this.f65763OooO00o.OooO0O0(view);
            this.f65765OooO0OO = this.f65763OooO00o.OooO0oO() - iOooO0oO2;
            if (iOooO0oO2 > 0) {
                int iOooO0OO = this.f65765OooO0OO - this.f65763OooO00o.OooO0OO(view);
                int iOooOO0O2 = this.f65763OooO00o.OooOO0O();
                int iMin = iOooO0OO - (Math.min(this.f65763OooO00o.OooO0o0(view) - iOooOO0O2, 0) + iOooOO0O2);
                if (iMin < 0) {
                    this.f65765OooO0OO = Math.min(iOooO0oO2, -iMin) + this.f65765OooO0OO;
                }
            }
        }

        public final void OooO0Oo() {
            this.f65764OooO0O0 = -1;
            this.f65765OooO0OO = Integer.MIN_VALUE;
            this.f65766OooO0Oo = false;
            this.f65767OooO0o0 = false;
        }

        public final String toString() {
            return "AnchorInfo{mPosition=" + this.f65764OooO0O0 + ", mCoordinate=" + this.f65765OooO0OO + ", mLayoutFromEnd=" + this.f65766OooO0Oo + ", mValid=" + this.f65767OooO0o0 + '}';
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f65768OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f65769OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f65770OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f65771OooO0Oo;
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f65772OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f65773OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f65774OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f65775OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f65776OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f65777OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f65778OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f65779OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f65780OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f65781OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public List<RecyclerView.AbstractC22078OooOooO> f65782OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public boolean f65783OooOO0o;

        public final void OooO00o(View view) {
            int viewLayoutPosition;
            int size = this.f65782OooOO0O.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f65782OooOO0O.get(i2).itemView;
                RecyclerView.C22066OooOOOo c22066OooOOOo = (RecyclerView.C22066OooOOOo) view3.getLayoutParams();
                if (view3 != view && !c22066OooOOOo.isItemRemoved() && (viewLayoutPosition = (c22066OooOOOo.getViewLayoutPosition() - this.f65776OooO0Oo) * this.f65778OooO0o0) >= 0 && viewLayoutPosition < i) {
                    view2 = view3;
                    if (viewLayoutPosition == 0) {
                        break;
                    } else {
                        i = viewLayoutPosition;
                    }
                }
            }
            if (view2 == null) {
                this.f65776OooO0Oo = -1;
            } else {
                this.f65776OooO0Oo = ((RecyclerView.C22066OooOOOo) view2.getLayoutParams()).getViewLayoutPosition();
            }
        }

        public final View OooO0O0(RecyclerView.C22071OooOo0O c22071OooOo0O) {
            List<RecyclerView.AbstractC22078OooOooO> list = this.f65782OooOO0O;
            if (list == null) {
                View view = c22071OooOo0O.OooOO0O(this.f65776OooO0Oo, LocationRequestCompat.PASSIVE_INTERVAL).itemView;
                this.f65776OooO0Oo += this.f65778OooO0o0;
                return view;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view2 = this.f65782OooOO0O.get(i).itemView;
                RecyclerView.C22066OooOOOo c22066OooOOOo = (RecyclerView.C22066OooOOOo) view2.getLayoutParams();
                if (!c22066OooOOOo.isItemRemoved() && this.f65776OooO0Oo == c22066OooOOOo.getViewLayoutPosition()) {
                    OooO00o(view2);
                    return view2;
                }
            }
            return null;
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f65784OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f65785OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public boolean f65786OooOoO0;

        public class OooO00o implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.f65785OooOo0o = parcel.readInt();
                savedState.f65784OooOo = parcel.readInt();
                savedState.f65786OooOoO0 = parcel.readInt() == 1;
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f65785OooOo0o);
            parcel.writeInt(this.f65784OooOo);
            parcel.writeInt(this.f65786OooOoO0 ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private int computeScrollExtent(RecyclerView.C22075OooOoOO c22075OooOoOO) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C22057OooOooo.OooO00o(c22075OooOoOO, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.C22075OooOoOO c22075OooOoOO) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C22057OooOooo.OooO0O0(c22075OooOoOO, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.C22075OooOoOO c22075OooOoOO) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C22057OooOooo.OooO0OO(c22075OooOoOO, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        return this.mShouldReverseLayout ? findFirstPartiallyOrCompletelyInvisibleChild() : findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        return this.mShouldReverseLayout ? findLastPartiallyOrCompletelyInvisibleChild() : findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private int fixLayoutEndGap(int i, RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO, boolean z) {
        int iOooO0oO;
        int iOooO0oO2 = this.mOrientationHelper.OooO0oO() - i;
        if (iOooO0oO2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(-iOooO0oO2, c22071OooOo0O, c22075OooOoOO);
        int i3 = i + i2;
        if (!z || (iOooO0oO = this.mOrientationHelper.OooO0oO() - i3) <= 0) {
            return i2;
        }
        this.mOrientationHelper.OooOOOo(iOooO0oO);
        return iOooO0oO + i2;
    }

    private int fixLayoutStartGap(int i, RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO, boolean z) {
        int iOooOO0O;
        int iOooOO0O2 = i - this.mOrientationHelper.OooOO0O();
        if (iOooOO0O2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(iOooOO0O2, c22071OooOo0O, c22075OooOoOO);
        int i3 = i + i2;
        if (!z || (iOooOO0O = i3 - this.mOrientationHelper.OooOO0O()) <= 0) {
            return i2;
        }
        this.mOrientationHelper.OooOOOo(-iOooOO0O);
        return i2 - iOooOO0O;
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void layoutForPredictiveAnimations(RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO, int i, int i2) {
        if (!c22075OooOoOO.f66103OooOO0O || getChildCount() == 0 || c22075OooOoOO.f66100OooO0oO || !supportsPredictiveItemAnimations()) {
            return;
        }
        List<RecyclerView.AbstractC22078OooOooO> list = c22071OooOo0O.f66081OooO0Oo;
        int size = list.size();
        int position = getPosition(getChildAt(0));
        int iOooO0OO = 0;
        int iOooO0OO2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO = list.get(i3);
            if (!abstractC22078OooOooO.isRemoved()) {
                if ((abstractC22078OooOooO.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                    iOooO0OO += this.mOrientationHelper.OooO0OO(abstractC22078OooOooO.itemView);
                } else {
                    iOooO0OO2 += this.mOrientationHelper.OooO0OO(abstractC22078OooOooO.itemView);
                }
            }
        }
        this.mLayoutState.f65782OooOO0O = list;
        if (iOooO0OO > 0) {
            updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i);
            OooO0OO oooO0OO = this.mLayoutState;
            oooO0OO.f65780OooO0oo = iOooO0OO;
            oooO0OO.f65775OooO0OO = 0;
            oooO0OO.OooO00o(null);
            fill(c22071OooOo0O, this.mLayoutState, c22075OooOoOO, false);
        }
        if (iOooO0OO2 > 0) {
            updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i2);
            OooO0OO oooO0OO2 = this.mLayoutState;
            oooO0OO2.f65780OooO0oo = iOooO0OO2;
            oooO0OO2.f65775OooO0OO = 0;
            oooO0OO2.OooO00o(null);
            fill(c22071OooOo0O, this.mLayoutState, c22075OooOoOO, false);
        }
        this.mLayoutState.f65782OooOO0O = null;
    }

    private void logChildren() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.OooO0o0(childAt));
        }
        Log.d(TAG, "==============");
    }

    private void recycleByLayoutState(RecyclerView.C22071OooOo0O c22071OooOo0O, OooO0OO oooO0OO) {
        if (!oooO0OO.f65773OooO00o || oooO0OO.f65783OooOO0o) {
            return;
        }
        int i = oooO0OO.f65779OooO0oO;
        int i2 = oooO0OO.f65772OooO;
        if (oooO0OO.f65777OooO0o == -1) {
            recycleViewsFromEnd(c22071OooOo0O, i, i2);
        } else {
            recycleViewsFromStart(c22071OooOo0O, i, i2);
        }
    }

    private void recycleChildren(RecyclerView.C22071OooOo0O c22071OooOo0O, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                removeAndRecycleViewAt(i, c22071OooOo0O);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                removeAndRecycleViewAt(i3, c22071OooOo0O);
            }
        }
    }

    private void recycleViewsFromEnd(RecyclerView.C22071OooOo0O c22071OooOo0O, int i, int i2) {
        int childCount = getChildCount();
        if (i < 0) {
            return;
        }
        int iOooO0o = (this.mOrientationHelper.OooO0o() - i) + i2;
        if (this.mShouldReverseLayout) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (this.mOrientationHelper.OooO0o0(childAt) < iOooO0o || this.mOrientationHelper.OooOOOO(childAt) < iOooO0o) {
                    recycleChildren(c22071OooOo0O, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = childCount - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            if (this.mOrientationHelper.OooO0o0(childAt2) < iOooO0o || this.mOrientationHelper.OooOOOO(childAt2) < iOooO0o) {
                recycleChildren(c22071OooOo0O, i4, i5);
                return;
            }
        }
    }

    private void recycleViewsFromStart(RecyclerView.C22071OooOo0O c22071OooOo0O, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (this.mOrientationHelper.OooO0O0(childAt) > i3 || this.mOrientationHelper.OooOOO(childAt) > i3) {
                    recycleChildren(c22071OooOo0O, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = childCount - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            if (this.mOrientationHelper.OooO0O0(childAt2) > i3 || this.mOrientationHelper.OooOOO(childAt2) > i3) {
                recycleChildren(c22071OooOo0O, i5, i6);
                return;
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    private boolean updateAnchorFromChildren(RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO, OooO00o oooO00o) {
        View viewFindReferenceChild;
        boolean z = false;
        if (getChildCount() != 0) {
            View focusedChild = getFocusedChild();
            if (focusedChild != null) {
                oooO00o.getClass();
                RecyclerView.C22066OooOOOo c22066OooOOOo = (RecyclerView.C22066OooOOOo) focusedChild.getLayoutParams();
                if (!c22066OooOOOo.isItemRemoved() && c22066OooOOOo.getViewLayoutPosition() >= 0 && c22066OooOOOo.getViewLayoutPosition() < c22075OooOoOO.OooO0O0()) {
                    oooO00o.OooO0OO(getPosition(focusedChild), focusedChild);
                    return true;
                }
            }
            boolean z2 = this.mLastStackFromEnd;
            boolean z3 = this.mStackFromEnd;
            if (z2 == z3 && (viewFindReferenceChild = findReferenceChild(c22071OooOo0O, c22075OooOoOO, oooO00o.f65766OooO0Oo, z3)) != null) {
                oooO00o.OooO0O0(getPosition(viewFindReferenceChild), viewFindReferenceChild);
                if (!c22075OooOoOO.f66100OooO0oO && supportsPredictiveItemAnimations()) {
                    int iOooO0o0 = this.mOrientationHelper.OooO0o0(viewFindReferenceChild);
                    int iOooO0O0 = this.mOrientationHelper.OooO0O0(viewFindReferenceChild);
                    int iOooOO0O = this.mOrientationHelper.OooOO0O();
                    int iOooO0oO = this.mOrientationHelper.OooO0oO();
                    boolean z4 = iOooO0O0 <= iOooOO0O && iOooO0o0 < iOooOO0O;
                    if (iOooO0o0 >= iOooO0oO && iOooO0O0 > iOooO0oO) {
                        z = true;
                    }
                    if (z4 || z) {
                        if (oooO00o.f65766OooO0Oo) {
                            iOooOO0O = iOooO0oO;
                        }
                        oooO00o.f65765OooO0OO = iOooOO0O;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private boolean updateAnchorFromPendingData(RecyclerView.C22075OooOoOO c22075OooOoOO, OooO00o oooO00o) {
        int i;
        if (!c22075OooOoOO.f66100OooO0oO && (i = this.mPendingScrollPosition) != -1) {
            if (i >= 0 && i < c22075OooOoOO.OooO0O0()) {
                int i2 = this.mPendingScrollPosition;
                oooO00o.f65764OooO0O0 = i2;
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.f65785OooOo0o >= 0) {
                    boolean z = savedState.f65786OooOoO0;
                    oooO00o.f65766OooO0Oo = z;
                    if (z) {
                        oooO00o.f65765OooO0OO = this.mOrientationHelper.OooO0oO() - this.mPendingSavedState.f65784OooOo;
                        return true;
                    }
                    oooO00o.f65765OooO0OO = this.mOrientationHelper.OooOO0O() + this.mPendingSavedState.f65784OooOo;
                    return true;
                }
                if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    boolean z2 = this.mShouldReverseLayout;
                    oooO00o.f65766OooO0Oo = z2;
                    if (z2) {
                        oooO00o.f65765OooO0OO = this.mOrientationHelper.OooO0oO() - this.mPendingScrollPositionOffset;
                        return true;
                    }
                    oooO00o.f65765OooO0OO = this.mOrientationHelper.OooOO0O() + this.mPendingScrollPositionOffset;
                    return true;
                }
                View viewFindViewByPosition = findViewByPosition(i2);
                if (viewFindViewByPosition == null) {
                    if (getChildCount() > 0) {
                        oooO00o.f65766OooO0Oo = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                    }
                    oooO00o.OooO00o();
                    return true;
                }
                if (this.mOrientationHelper.OooO0OO(viewFindViewByPosition) > this.mOrientationHelper.OooOO0o()) {
                    oooO00o.OooO00o();
                    return true;
                }
                if (this.mOrientationHelper.OooO0o0(viewFindViewByPosition) - this.mOrientationHelper.OooOO0O() < 0) {
                    oooO00o.f65765OooO0OO = this.mOrientationHelper.OooOO0O();
                    oooO00o.f65766OooO0Oo = false;
                    return true;
                }
                if (this.mOrientationHelper.OooO0oO() - this.mOrientationHelper.OooO0O0(viewFindViewByPosition) >= 0) {
                    oooO00o.f65765OooO0OO = oooO00o.f65766OooO0Oo ? this.mOrientationHelper.OooOOO0() + this.mOrientationHelper.OooO0O0(viewFindViewByPosition) : this.mOrientationHelper.OooO0o0(viewFindViewByPosition);
                    return true;
                }
                oooO00o.f65765OooO0OO = this.mOrientationHelper.OooO0oO();
                oooO00o.f65766OooO0Oo = true;
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO, OooO00o oooO00o) {
        if (updateAnchorFromPendingData(c22075OooOoOO, oooO00o) || updateAnchorFromChildren(c22071OooOo0O, c22075OooOoOO, oooO00o)) {
            return;
        }
        oooO00o.OooO00o();
        oooO00o.f65764OooO0O0 = this.mStackFromEnd ? c22075OooOoOO.OooO0O0() - 1 : 0;
    }

    private void updateLayoutState(int i, int i2, boolean z, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        int iOooOO0O;
        this.mLayoutState.f65783OooOO0o = resolveIsInfinite();
        this.mLayoutState.f65777OooO0o = i;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c22075OooOoOO, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z2 = i == 1;
        OooO0OO oooO0OO = this.mLayoutState;
        int i3 = z2 ? iMax2 : iMax;
        oooO0OO.f65780OooO0oo = i3;
        if (!z2) {
            iMax = iMax2;
        }
        oooO0OO.f65772OooO = iMax;
        if (z2) {
            oooO0OO.f65780OooO0oo = this.mOrientationHelper.OooO0oo() + i3;
            View childClosestToEnd = getChildClosestToEnd();
            OooO0OO oooO0OO2 = this.mLayoutState;
            oooO0OO2.f65778OooO0o0 = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            OooO0OO oooO0OO3 = this.mLayoutState;
            oooO0OO2.f65776OooO0Oo = position + oooO0OO3.f65778OooO0o0;
            oooO0OO3.f65774OooO0O0 = this.mOrientationHelper.OooO0O0(childClosestToEnd);
            iOooOO0O = this.mOrientationHelper.OooO0O0(childClosestToEnd) - this.mOrientationHelper.OooO0oO();
        } else {
            View childClosestToStart = getChildClosestToStart();
            OooO0OO oooO0OO4 = this.mLayoutState;
            oooO0OO4.f65780OooO0oo = this.mOrientationHelper.OooOO0O() + oooO0OO4.f65780OooO0oo;
            OooO0OO oooO0OO5 = this.mLayoutState;
            oooO0OO5.f65778OooO0o0 = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(childClosestToStart);
            OooO0OO oooO0OO6 = this.mLayoutState;
            oooO0OO5.f65776OooO0Oo = position2 + oooO0OO6.f65778OooO0o0;
            oooO0OO6.f65774OooO0O0 = this.mOrientationHelper.OooO0o0(childClosestToStart);
            iOooOO0O = (-this.mOrientationHelper.OooO0o0(childClosestToStart)) + this.mOrientationHelper.OooOO0O();
        }
        OooO0OO oooO0OO7 = this.mLayoutState;
        oooO0OO7.f65775OooO0OO = i2;
        if (z) {
            oooO0OO7.f65775OooO0OO = i2 - iOooOO0O;
        }
        oooO0OO7.f65779OooO0oO = iOooOO0O;
    }

    private void updateLayoutStateToFillEnd(OooO00o oooO00o) {
        updateLayoutStateToFillEnd(oooO00o.f65764OooO0O0, oooO00o.f65765OooO0OO);
    }

    private void updateLayoutStateToFillStart(OooO00o oooO00o) {
        updateLayoutStateToFillStart(oooO00o.f65764OooO0O0, oooO00o.f65765OooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(RecyclerView.C22075OooOoOO c22075OooOoOO, int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(c22075OooOoOO);
        if (this.mLayoutState.f65777OooO0o == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.C22075OooOoOO c22075OooOoOO, RecyclerView.OooOOOO.OooO0OO oooO0OO) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        ensureLayoutState();
        updateLayoutState(i > 0 ? 1 : -1, Math.abs(i), true, c22075OooOoOO);
        collectPrefetchPositionsForLayoutState(c22075OooOoOO, this.mLayoutState, oooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public void collectInitialPrefetchPositions(int i, RecyclerView.OooOOOO.OooO0OO oooO0OO) {
        boolean z;
        int i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState == null || (i2 = savedState.f65785OooOo0o) < 0) {
            resolveShouldLayoutReverse();
            z = this.mShouldReverseLayout;
            i2 = this.mPendingScrollPosition;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = savedState.f65786OooOoO0;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i4++) {
            ((RunnableC22046OooOOo0.OooO0O0) oooO0OO).OooO00o(i2, 0);
            i2 += i3;
        }
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.C22075OooOoOO c22075OooOoOO, OooO0OO oooO0OO, RecyclerView.OooOOOO.OooO0OO oooO0OO2) {
        int i = oooO0OO.f65776OooO0Oo;
        if (i < 0 || i >= c22075OooOoOO.OooO0O0()) {
            return;
        }
        ((RunnableC22046OooOOo0.OooO0O0) oooO0OO2).OooO00o(i, Math.max(0, oooO0OO.f65779OooO0oO));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public int computeHorizontalScrollExtent(RecyclerView.C22075OooOoOO c22075OooOoOO) {
        return computeScrollExtent(c22075OooOoOO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public int computeHorizontalScrollOffset(RecyclerView.C22075OooOoOO c22075OooOoOO) {
        return computeScrollOffset(c22075OooOoOO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public int computeHorizontalScrollRange(RecyclerView.C22075OooOoOO c22075OooOoOO) {
        return computeScrollRange(c22075OooOoOO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22073OooOoO.OooO0O0
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = (i < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public int computeVerticalScrollExtent(RecyclerView.C22075OooOoOO c22075OooOoOO) {
        return computeScrollExtent(c22075OooOoOO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public int computeVerticalScrollOffset(RecyclerView.C22075OooOoOO c22075OooOoOO) {
        return computeScrollOffset(c22075OooOoOO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public int computeVerticalScrollRange(RecyclerView.C22075OooOoOO c22075OooOoOO) {
        return computeScrollRange(c22075OooOoOO);
    }

    public int convertFocusDirectionToLayoutDirection(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    public OooO0OO createLayoutState() {
        OooO0OO oooO0OO = new OooO0OO();
        oooO0OO.f65773OooO00o = true;
        oooO0OO.f65780OooO0oo = 0;
        oooO0OO.f65772OooO = 0;
        oooO0OO.f65782OooOO0O = null;
        return oooO0OO;
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public int fill(RecyclerView.C22071OooOo0O c22071OooOo0O, OooO0OO oooO0OO, RecyclerView.C22075OooOoOO c22075OooOoOO, boolean z) {
        int i;
        int i2 = oooO0OO.f65775OooO0OO;
        int i3 = oooO0OO.f65779OooO0oO;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                oooO0OO.f65779OooO0oO = i3 + i2;
            }
            recycleByLayoutState(c22071OooOo0O, oooO0OO);
        }
        int i4 = oooO0OO.f65775OooO0OO + oooO0OO.f65780OooO0oo;
        OooO0O0 oooO0O0 = this.mLayoutChunkResult;
        while (true) {
            if ((!oooO0OO.f65783OooOO0o && i4 <= 0) || (i = oooO0OO.f65776OooO0Oo) < 0 || i >= c22075OooOoOO.OooO0O0()) {
                break;
            }
            oooO0O0.f65768OooO00o = 0;
            oooO0O0.f65769OooO0O0 = false;
            oooO0O0.f65770OooO0OO = false;
            oooO0O0.f65771OooO0Oo = false;
            layoutChunk(c22071OooOo0O, c22075OooOoOO, oooO0OO, oooO0O0);
            if (!oooO0O0.f65769OooO0O0) {
                int i5 = oooO0OO.f65774OooO0O0;
                int i6 = oooO0O0.f65768OooO00o;
                oooO0OO.f65774OooO0O0 = (oooO0OO.f65777OooO0o * i6) + i5;
                if (!oooO0O0.f65770OooO0OO || oooO0OO.f65782OooOO0O != null || !c22075OooOoOO.f66100OooO0oO) {
                    oooO0OO.f65775OooO0OO -= i6;
                    i4 -= i6;
                }
                int i7 = oooO0OO.f65779OooO0oO;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    oooO0OO.f65779OooO0oO = i8;
                    int i9 = oooO0OO.f65775OooO0OO;
                    if (i9 < 0) {
                        oooO0OO.f65779OooO0oO = i8 + i9;
                    }
                    recycleByLayoutState(c22071OooOo0O, oooO0OO);
                }
                if (z && oooO0O0.f65771OooO0Oo) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - oooO0OO.f65775OooO0OO;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z, z2) : findOneVisibleChild(getChildCount() - 1, -1, z, z2);
    }

    public View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z, z2) : findOneVisibleChild(0, getChildCount(), z, z2);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        int i3;
        int i4;
        ensureLayoutState();
        if (i2 <= i && i2 >= i) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.OooO0o0(getChildAt(i)) < this.mOrientationHelper.OooOO0O()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = EditingLanguage.ARABIC_LIBYA;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.OooO00o(i, i2, i3, i4) : this.mVerticalBoundCheck.OooO00o(i, i2, i3, i4);
    }

    public View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        ensureLayoutState();
        int i3 = StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.OooO00o(i, i2, i4, i3) : this.mVerticalBoundCheck.OooO00o(i, i2, i4, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View findReferenceChild(RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO, boolean z, boolean z2) {
        int i;
        int childCount;
        int i2;
        ensureLayoutState();
        int childCount2 = getChildCount();
        if (z2) {
            childCount = getChildCount() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = childCount2;
            childCount = 0;
            i2 = 1;
        }
        int iOooO0O0 = c22075OooOoOO.OooO0O0();
        int iOooOO0O = this.mOrientationHelper.OooOO0O();
        int iOooO0oO = this.mOrientationHelper.OooO0oO();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            int iOooO0o0 = this.mOrientationHelper.OooO0o0(childAt);
            int iOooO0O02 = this.mOrientationHelper.OooO0O0(childAt);
            if (position >= 0 && position < iOooO0O0) {
                if (!((RecyclerView.C22066OooOOOo) childAt.getLayoutParams()).isItemRemoved()) {
                    boolean z3 = iOooO0O02 <= iOooOO0O && iOooO0o0 < iOooOO0O;
                    boolean z4 = iOooO0o0 >= iOooO0oO && iOooO0O02 > iOooO0oO;
                    if (!z3 && !z4) {
                        return childAt;
                    }
                    if (z) {
                        if (z4) {
                            view2 = childAt;
                        } else if (view == null) {
                            view = childAt;
                        }
                    } else if (!z3) {
                        if (view == null) {
                        }
                    }
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            childCount += i2;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public RecyclerView.C22066OooOOOo generateDefaultLayoutParams() {
        return new RecyclerView.C22066OooOOOo(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.C22075OooOoOO c22075OooOoOO) {
        if (c22075OooOoOO.f66094OooO00o != -1) {
            return this.mOrientationHelper.OooOO0o();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public void layoutChunk(RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO, OooO0OO oooO0OO, OooO0O0 oooO0O0) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingLeft;
        int iOooO0Oo;
        int i5;
        int i6;
        View viewOooO0O0 = oooO0OO.OooO0O0(c22071OooOo0O);
        if (viewOooO0O0 == null) {
            oooO0O0.f65769OooO0O0 = true;
            return;
        }
        RecyclerView.C22066OooOOOo c22066OooOOOo = (RecyclerView.C22066OooOOOo) viewOooO0O0.getLayoutParams();
        if (oooO0OO.f65782OooOO0O == null) {
            if (this.mShouldReverseLayout == (oooO0OO.f65777OooO0o == -1)) {
                addView(viewOooO0O0);
            } else {
                addView(viewOooO0O0, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (oooO0OO.f65777OooO0o == -1)) {
                addDisappearingView(viewOooO0O0);
            } else {
                addDisappearingView(viewOooO0O0, 0);
            }
        }
        measureChildWithMargins(viewOooO0O0, 0, 0);
        oooO0O0.f65768OooO00o = this.mOrientationHelper.OooO0OO(viewOooO0O0);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iOooO0Oo = getWidth() - getPaddingRight();
                paddingLeft = iOooO0Oo - this.mOrientationHelper.OooO0Oo(viewOooO0O0);
            } else {
                paddingLeft = getPaddingLeft();
                iOooO0Oo = this.mOrientationHelper.OooO0Oo(viewOooO0O0) + paddingLeft;
            }
            if (oooO0OO.f65777OooO0o == -1) {
                i6 = oooO0OO.f65774OooO0O0;
                i5 = i6 - oooO0O0.f65768OooO00o;
            } else {
                i5 = oooO0OO.f65774OooO0O0;
                i6 = oooO0O0.f65768OooO00o + i5;
            }
            int i7 = paddingLeft;
            i4 = i5;
            i3 = i7;
            i2 = i6;
            i = iOooO0Oo;
        } else {
            int paddingTop = getPaddingTop();
            int iOooO0Oo2 = this.mOrientationHelper.OooO0Oo(viewOooO0O0) + paddingTop;
            if (oooO0OO.f65777OooO0o == -1) {
                int i8 = oooO0OO.f65774OooO0O0;
                i3 = i8 - oooO0O0.f65768OooO00o;
                i = i8;
                i2 = iOooO0Oo2;
            } else {
                int i9 = oooO0OO.f65774OooO0O0;
                i = oooO0O0.f65768OooO00o + i9;
                i2 = iOooO0Oo2;
                i3 = i9;
            }
            i4 = paddingTop;
        }
        layoutDecoratedWithMargins(viewOooO0O0, i3, i4, i, i2);
        if (c22066OooOOOo.isItemRemoved() || c22066OooOOOo.isItemChanged()) {
            oooO0O0.f65770OooO0OO = true;
        }
        oooO0O0.f65771OooO0Oo = viewOooO0O0.hasFocusable();
    }

    public void onAnchorReady(RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO, OooO00o oooO00o, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C22071OooOo0O c22071OooOo0O) {
        super.onDetachedFromWindow(recyclerView, c22071OooOo0O);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(c22071OooOo0O);
            c22071OooOo0O.OooO0O0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public View onFocusSearchFailed(View view, int i, RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        int iConvertFocusDirectionToLayoutDirection;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.OooOO0o() * MAX_SCROLL_FACTOR), false, c22075OooOoOO);
        OooO0OO oooO0OO = this.mLayoutState;
        oooO0OO.f65779OooO0oO = Integer.MIN_VALUE;
        oooO0OO.f65773OooO00o = false;
        fill(c22071OooOo0O, oooO0OO, c22075OooOoOO, true);
        View viewFindPartiallyOrCompletelyInvisibleChildClosestToStart = iConvertFocusDirectionToLayoutDirection == -1 ? findPartiallyOrCompletelyInvisibleChildClosestToStart() : findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        View childClosestToStart = iConvertFocusDirectionToLayoutDirection == -1 ? getChildClosestToStart() : getChildClosestToEnd();
        if (!childClosestToStart.hasFocusable()) {
            return viewFindPartiallyOrCompletelyInvisibleChildClosestToStart;
        }
        if (viewFindPartiallyOrCompletelyInvisibleChildClosestToStart == null) {
            return null;
        }
        return childClosestToStart;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public void onLayoutChildren(RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        int i;
        int i2;
        int i3;
        int i4;
        int iFixLayoutEndGap;
        int i5;
        View viewFindViewByPosition;
        int iOooO0o0;
        int iOooO0oO;
        int i6;
        int i7 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && c22075OooOoOO.OooO0O0() == 0) {
            removeAndRecycleAllViews(c22071OooOo0O);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && (i6 = savedState.f65785OooOo0o) >= 0) {
            this.mPendingScrollPosition = i6;
        }
        ensureLayoutState();
        this.mLayoutState.f65773OooO00o = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        OooO00o oooO00o = this.mAnchorInfo;
        if (!oooO00o.f65767OooO0o0 || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            oooO00o.OooO0Oo();
            OooO00o oooO00o2 = this.mAnchorInfo;
            oooO00o2.f65766OooO0Oo = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(c22071OooOo0O, c22075OooOoOO, oooO00o2);
            this.mAnchorInfo.f65767OooO0o0 = true;
        } else if (focusedChild != null && (this.mOrientationHelper.OooO0o0(focusedChild) >= this.mOrientationHelper.OooO0oO() || this.mOrientationHelper.OooO0O0(focusedChild) <= this.mOrientationHelper.OooOO0O())) {
            this.mAnchorInfo.OooO0OO(getPosition(focusedChild), focusedChild);
        }
        OooO0OO oooO0OO = this.mLayoutState;
        oooO0OO.f65777OooO0o = oooO0OO.f65781OooOO0 >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c22075OooOoOO, iArr);
        int iOooOO0O = this.mOrientationHelper.OooOO0O() + Math.max(0, this.mReusableIntPair[0]);
        int iOooO0oo = this.mOrientationHelper.OooO0oo() + Math.max(0, this.mReusableIntPair[1]);
        if (c22075OooOoOO.f66100OooO0oO && (i5 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i5)) != null) {
            if (this.mShouldReverseLayout) {
                iOooO0oO = this.mOrientationHelper.OooO0oO() - this.mOrientationHelper.OooO0O0(viewFindViewByPosition);
                iOooO0o0 = this.mPendingScrollPositionOffset;
            } else {
                iOooO0o0 = this.mOrientationHelper.OooO0o0(viewFindViewByPosition) - this.mOrientationHelper.OooOO0O();
                iOooO0oO = this.mPendingScrollPositionOffset;
            }
            int i8 = iOooO0oO - iOooO0o0;
            if (i8 > 0) {
                iOooOO0O += i8;
            } else {
                iOooO0oo -= i8;
            }
        }
        OooO00o oooO00o3 = this.mAnchorInfo;
        if (!oooO00o3.f65766OooO0Oo ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i7 = 1;
        }
        onAnchorReady(c22071OooOo0O, c22075OooOoOO, oooO00o3, i7);
        detachAndScrapAttachedViews(c22071OooOo0O);
        this.mLayoutState.f65783OooOO0o = resolveIsInfinite();
        this.mLayoutState.getClass();
        this.mLayoutState.f65772OooO = 0;
        OooO00o oooO00o4 = this.mAnchorInfo;
        if (oooO00o4.f65766OooO0Oo) {
            updateLayoutStateToFillStart(oooO00o4);
            OooO0OO oooO0OO2 = this.mLayoutState;
            oooO0OO2.f65780OooO0oo = iOooOO0O;
            fill(c22071OooOo0O, oooO0OO2, c22075OooOoOO, false);
            OooO0OO oooO0OO3 = this.mLayoutState;
            i2 = oooO0OO3.f65774OooO0O0;
            int i9 = oooO0OO3.f65776OooO0Oo;
            int i10 = oooO0OO3.f65775OooO0OO;
            if (i10 > 0) {
                iOooO0oo += i10;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            OooO0OO oooO0OO4 = this.mLayoutState;
            oooO0OO4.f65780OooO0oo = iOooO0oo;
            oooO0OO4.f65776OooO0Oo += oooO0OO4.f65778OooO0o0;
            fill(c22071OooOo0O, oooO0OO4, c22075OooOoOO, false);
            OooO0OO oooO0OO5 = this.mLayoutState;
            i = oooO0OO5.f65774OooO0O0;
            int i11 = oooO0OO5.f65775OooO0OO;
            if (i11 > 0) {
                updateLayoutStateToFillStart(i9, i2);
                OooO0OO oooO0OO6 = this.mLayoutState;
                oooO0OO6.f65780OooO0oo = i11;
                fill(c22071OooOo0O, oooO0OO6, c22075OooOoOO, false);
                i2 = this.mLayoutState.f65774OooO0O0;
            }
        } else {
            updateLayoutStateToFillEnd(oooO00o4);
            OooO0OO oooO0OO7 = this.mLayoutState;
            oooO0OO7.f65780OooO0oo = iOooO0oo;
            fill(c22071OooOo0O, oooO0OO7, c22075OooOoOO, false);
            OooO0OO oooO0OO8 = this.mLayoutState;
            i = oooO0OO8.f65774OooO0O0;
            int i12 = oooO0OO8.f65776OooO0Oo;
            int i13 = oooO0OO8.f65775OooO0OO;
            if (i13 > 0) {
                iOooOO0O += i13;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            OooO0OO oooO0OO9 = this.mLayoutState;
            oooO0OO9.f65780OooO0oo = iOooOO0O;
            oooO0OO9.f65776OooO0Oo += oooO0OO9.f65778OooO0o0;
            fill(c22071OooOo0O, oooO0OO9, c22075OooOoOO, false);
            OooO0OO oooO0OO10 = this.mLayoutState;
            int i14 = oooO0OO10.f65774OooO0O0;
            int i15 = oooO0OO10.f65775OooO0OO;
            if (i15 > 0) {
                updateLayoutStateToFillEnd(i12, i);
                OooO0OO oooO0OO11 = this.mLayoutState;
                oooO0OO11.f65780OooO0oo = i15;
                fill(c22071OooOo0O, oooO0OO11, c22075OooOoOO, false);
                i = this.mLayoutState.f65774OooO0O0;
            }
            i2 = i14;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iFixLayoutEndGap2 = fixLayoutEndGap(i, c22071OooOo0O, c22075OooOoOO, true);
                i3 = i2 + iFixLayoutEndGap2;
                i4 = i + iFixLayoutEndGap2;
                iFixLayoutEndGap = fixLayoutStartGap(i3, c22071OooOo0O, c22075OooOoOO, false);
            } else {
                int iFixLayoutStartGap = fixLayoutStartGap(i2, c22071OooOo0O, c22075OooOoOO, true);
                i3 = i2 + iFixLayoutStartGap;
                i4 = i + iFixLayoutStartGap;
                iFixLayoutEndGap = fixLayoutEndGap(i4, c22071OooOo0O, c22075OooOoOO, false);
            }
            i2 = i3 + iFixLayoutEndGap;
            i = i4 + iFixLayoutEndGap;
        }
        layoutForPredictiveAnimations(c22071OooOo0O, c22075OooOoOO, i2, i);
        if (c22075OooOoOO.f66100OooO0oO) {
            this.mAnchorInfo.OooO0Oo();
        } else {
            AbstractC22055OooOoo0 abstractC22055OooOoo0 = this.mOrientationHelper;
            abstractC22055OooOoo0.f66028OooO0O0 = abstractC22055OooOoo0.OooOO0o();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public void onLayoutCompleted(RecyclerView.C22075OooOoOO c22075OooOoOO) {
        super.onLayoutCompleted(c22075OooOoOO);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.OooO0Oo();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.f65785OooOo0o = -1;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f65785OooOo0o = savedState.f65785OooOo0o;
            savedState2.f65784OooOo = savedState.f65784OooOo;
            savedState2.f65786OooOoO0 = savedState.f65786OooOoO0;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (getChildCount() <= 0) {
            savedState3.f65785OooOo0o = -1;
            return savedState3;
        }
        ensureLayoutState();
        boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        savedState3.f65786OooOoO0 = z;
        if (z) {
            View childClosestToEnd = getChildClosestToEnd();
            savedState3.f65784OooOo = this.mOrientationHelper.OooO0oO() - this.mOrientationHelper.OooO0O0(childClosestToEnd);
            savedState3.f65785OooOo0o = getPosition(childClosestToEnd);
            return savedState3;
        }
        View childClosestToStart = getChildClosestToStart();
        savedState3.f65785OooOo0o = getPosition(childClosestToStart);
        savedState3.f65784OooOo = this.mOrientationHelper.OooO0o0(childClosestToStart) - this.mOrientationHelper.OooOO0O();
        return savedState3;
    }

    @Override // androidx.recyclerview.widget.C22041OooOOo.InterfaceC22045OooO0oo
    public void prepareForDrop(View view, View view2, int i, int i2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        byte b = position < position2 ? (byte) 1 : (byte) -1;
        if (this.mShouldReverseLayout) {
            if (b == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.OooO0oO() - (this.mOrientationHelper.OooO0OO(view) + this.mOrientationHelper.OooO0o0(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.OooO0oO() - this.mOrientationHelper.OooO0O0(view2));
                return;
            }
        }
        if (b == -1) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.OooO0o0(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.OooO0O0(view2) - this.mOrientationHelper.OooO0OO(view));
        }
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.OooO() == 0 && this.mOrientationHelper.OooO0o() == 0;
    }

    public int scrollBy(int i, RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f65773OooO00o = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        updateLayoutState(i2, iAbs, true, c22075OooOoOO);
        OooO0OO oooO0OO = this.mLayoutState;
        int iFill = fill(c22071OooOo0O, oooO0OO, c22075OooOoOO, false) + oooO0OO.f65779OooO0oO;
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i = i2 * iFill;
        }
        this.mOrientationHelper.OooOOOo(-i);
        this.mLayoutState.f65781OooOO0 = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public int scrollHorizontallyBy(int i, RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, c22071OooOo0O, c22075OooOoOO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.f65785OooOo0o = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.f65785OooOo0o = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public int scrollVerticallyBy(int i, RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, c22071OooOo0O, c22075OooOoOO);
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        if (i != this.mOrientation || this.mOrientationHelper == null) {
            AbstractC22055OooOoo0 abstractC22055OooOoo0OooO00o = AbstractC22055OooOoo0.OooO00o(this, i);
            this.mOrientationHelper = abstractC22055OooOoo0OooO00o;
            this.mAnchorInfo.f65763OooO00o = abstractC22055OooOoo0OooO00o;
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (z == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z) {
            return;
        }
        this.mStackFromEnd = z;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C22075OooOoOO c22075OooOoOO, int i) {
        C22049OooOo0O c22049OooOo0O = new C22049OooOo0O(recyclerView.getContext());
        c22049OooOo0O.setTargetPosition(i);
        startSmoothScroll(c22049OooOo0O);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iOooO0o0 = this.mOrientationHelper.OooO0o0(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i = 1; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                int position2 = getPosition(childAt);
                int iOooO0o02 = this.mOrientationHelper.OooO0o0(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                    sb.append(iOooO0o02 < iOooO0o0);
                    throw new RuntimeException(sb.toString());
                }
                if (iOooO0o02 > iOooO0o0) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i2 = 1; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            int position3 = getPosition(childAt2);
            int iOooO0o03 = this.mOrientationHelper.OooO0o0(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                sb2.append(iOooO0o03 < iOooO0o0);
                throw new RuntimeException(sb2.toString());
            }
            if (iOooO0o03 < iOooO0o0) {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new OooO00o();
        this.mLayoutChunkResult = new OooO0O0();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i);
        setReverseLayout(z);
    }

    private void updateLayoutStateToFillEnd(int i, int i2) {
        this.mLayoutState.f65775OooO0OO = this.mOrientationHelper.OooO0oO() - i2;
        OooO0OO oooO0OO = this.mLayoutState;
        oooO0OO.f65778OooO0o0 = this.mShouldReverseLayout ? -1 : 1;
        oooO0OO.f65776OooO0Oo = i;
        oooO0OO.f65777OooO0o = 1;
        oooO0OO.f65774OooO0O0 = i2;
        oooO0OO.f65779OooO0oO = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(int i, int i2) {
        this.mLayoutState.f65775OooO0OO = i2 - this.mOrientationHelper.OooOO0O();
        OooO0OO oooO0OO = this.mLayoutState;
        oooO0OO.f65776OooO0Oo = i;
        oooO0OO.f65778OooO0o0 = this.mShouldReverseLayout ? 1 : -1;
        oooO0OO.f65777OooO0o = -1;
        oooO0OO.f65774OooO0O0 = i2;
        oooO0OO.f65779OooO0oO = Integer.MIN_VALUE;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new OooO00o();
        this.mLayoutChunkResult = new OooO0O0();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.OooOOOO.C22065OooO0Oo properties = RecyclerView.OooOOOO.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.f66067OooO00o);
        setReverseLayout(properties.f66069OooO0OO);
        setStackFromEnd(properties.f66070OooO0Oo);
    }
}
