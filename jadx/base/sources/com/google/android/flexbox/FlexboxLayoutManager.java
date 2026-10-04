package com.google.android.flexbox;

import OooO0Oo.C20398OooO0O0;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.location.LocationRequestCompat;
import androidx.recyclerview.widget.AbstractC22055OooOoo0;
import androidx.recyclerview.widget.C22049OooOo0O;
import androidx.recyclerview.widget.C22051OooOoO;
import androidx.recyclerview.widget.C22053OooOoOO;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class FlexboxLayoutManager extends RecyclerView.OooOOOO implements FlexContainer, RecyclerView.AbstractC22073OooOoO.OooO0O0 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean DEBUG = false;
    private static final String TAG = "FlexboxLayoutManager";
    private static final Rect TEMP_RECT = new Rect();
    private int mAlignItems;
    private AnchorInfo mAnchorInfo;
    private final Context mContext;
    private int mDirtyPosition;
    private int mFlexDirection;
    private List<FlexLine> mFlexLines;
    private FlexboxHelper.FlexLinesResult mFlexLinesResult;
    private int mFlexWrap;
    private final FlexboxHelper mFlexboxHelper;
    private boolean mFromBottomToTop;
    private boolean mIsRtl;
    private int mJustifyContent;
    private int mLastHeight;
    private int mLastWidth;
    private LayoutState mLayoutState;
    private int mMaxLine;
    private AbstractC22055OooOoo0 mOrientationHelper;
    private View mParent;
    private SavedState mPendingSavedState;
    private int mPendingScrollPosition;
    private int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private RecyclerView.C22071OooOo0O mRecycler;
    private RecyclerView.C22075OooOoOO mState;
    private AbstractC22055OooOoo0 mSubOrientationHelper;
    private SparseArray<View> mViewCache;

    public class AnchorInfo {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private boolean mAssignedFromSavedState;
        private int mCoordinate;
        private int mFlexLinePosition;
        private boolean mLayoutFromEnd;
        private int mPerpendicularCoordinate;
        private int mPosition;
        private boolean mValid;

        private AnchorInfo() {
            this.mPerpendicularCoordinate = 0;
        }

        public static /* synthetic */ int access$2412(AnchorInfo anchorInfo, int i) {
            int i2 = anchorInfo.mPerpendicularCoordinate + i;
            anchorInfo.mPerpendicularCoordinate = i2;
            return i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void assignCoordinateFromPadding() {
            if (FlexboxLayoutManager.this.isMainAxisDirectionHorizontal() || !FlexboxLayoutManager.this.mIsRtl) {
                this.mCoordinate = this.mLayoutFromEnd ? FlexboxLayoutManager.this.mOrientationHelper.OooO0oO() : FlexboxLayoutManager.this.mOrientationHelper.OooOO0O();
            } else {
                this.mCoordinate = this.mLayoutFromEnd ? FlexboxLayoutManager.this.mOrientationHelper.OooO0oO() : FlexboxLayoutManager.this.getWidth() - FlexboxLayoutManager.this.mOrientationHelper.OooOO0O();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void assignFromView(View view) {
            AbstractC22055OooOoo0 abstractC22055OooOoo0 = FlexboxLayoutManager.this.mFlexWrap == 0 ? FlexboxLayoutManager.this.mSubOrientationHelper : FlexboxLayoutManager.this.mOrientationHelper;
            if (FlexboxLayoutManager.this.isMainAxisDirectionHorizontal() || !FlexboxLayoutManager.this.mIsRtl) {
                if (this.mLayoutFromEnd) {
                    this.mCoordinate = abstractC22055OooOoo0.OooOOO0() + abstractC22055OooOoo0.OooO0O0(view);
                } else {
                    this.mCoordinate = abstractC22055OooOoo0.OooO0o0(view);
                }
            } else if (this.mLayoutFromEnd) {
                this.mCoordinate = abstractC22055OooOoo0.OooOOO0() + abstractC22055OooOoo0.OooO0o0(view);
            } else {
                this.mCoordinate = abstractC22055OooOoo0.OooO0O0(view);
            }
            this.mPosition = FlexboxLayoutManager.this.getPosition(view);
            this.mAssignedFromSavedState = false;
            int[] iArr = FlexboxLayoutManager.this.mFlexboxHelper.mIndexToFlexLine;
            int i = this.mPosition;
            if (i == -1) {
                i = 0;
            }
            int i2 = iArr[i];
            this.mFlexLinePosition = i2 != -1 ? i2 : 0;
            if (FlexboxLayoutManager.this.mFlexLines.size() > this.mFlexLinePosition) {
                this.mPosition = ((FlexLine) FlexboxLayoutManager.this.mFlexLines.get(this.mFlexLinePosition)).mFirstIndex;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void reset() {
            this.mPosition = -1;
            this.mFlexLinePosition = -1;
            this.mCoordinate = Integer.MIN_VALUE;
            this.mValid = false;
            this.mAssignedFromSavedState = false;
            if (FlexboxLayoutManager.this.isMainAxisDirectionHorizontal()) {
                if (FlexboxLayoutManager.this.mFlexWrap == 0) {
                    this.mLayoutFromEnd = FlexboxLayoutManager.this.mFlexDirection == 1;
                    return;
                } else {
                    this.mLayoutFromEnd = FlexboxLayoutManager.this.mFlexWrap == 2;
                    return;
                }
            }
            if (FlexboxLayoutManager.this.mFlexWrap == 0) {
                this.mLayoutFromEnd = FlexboxLayoutManager.this.mFlexDirection == 3;
            } else {
                this.mLayoutFromEnd = FlexboxLayoutManager.this.mFlexWrap == 2;
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.mPosition + ", mFlexLinePosition=" + this.mFlexLinePosition + ", mCoordinate=" + this.mCoordinate + ", mPerpendicularCoordinate=" + this.mPerpendicularCoordinate + ", mLayoutFromEnd=" + this.mLayoutFromEnd + ", mValid=" + this.mValid + ", mAssignedFromSavedState=" + this.mAssignedFromSavedState + '}';
        }
    }

    public static class LayoutState {
        private static final int ITEM_DIRECTION_TAIL = 1;
        private static final int LAYOUT_END = 1;
        private static final int LAYOUT_START = -1;
        private static final int SCROLLING_OFFSET_NaN = Integer.MIN_VALUE;
        private int mAvailable;
        private int mFlexLinePosition;
        private boolean mInfinite;
        private int mItemDirection;
        private int mLastScrollDelta;
        private int mLayoutDirection;
        private int mOffset;
        private int mPosition;
        private int mScrollingOffset;
        private boolean mShouldRecycle;

        private LayoutState() {
            this.mItemDirection = 1;
            this.mLayoutDirection = 1;
        }

        public static /* synthetic */ int access$1012(LayoutState layoutState, int i) {
            int i2 = layoutState.mOffset + i;
            layoutState.mOffset = i2;
            return i2;
        }

        public static /* synthetic */ int access$1020(LayoutState layoutState, int i) {
            int i2 = layoutState.mOffset - i;
            layoutState.mOffset = i2;
            return i2;
        }

        public static /* synthetic */ int access$1220(LayoutState layoutState, int i) {
            int i2 = layoutState.mAvailable - i;
            layoutState.mAvailable = i2;
            return i2;
        }

        public static /* synthetic */ int access$1508(LayoutState layoutState) {
            int i = layoutState.mFlexLinePosition;
            layoutState.mFlexLinePosition = i + 1;
            return i;
        }

        public static /* synthetic */ int access$1510(LayoutState layoutState) {
            int i = layoutState.mFlexLinePosition;
            layoutState.mFlexLinePosition = i - 1;
            return i;
        }

        public static /* synthetic */ int access$1512(LayoutState layoutState, int i) {
            int i2 = layoutState.mFlexLinePosition + i;
            layoutState.mFlexLinePosition = i2;
            return i2;
        }

        public static /* synthetic */ int access$2012(LayoutState layoutState, int i) {
            int i2 = layoutState.mScrollingOffset + i;
            layoutState.mScrollingOffset = i2;
            return i2;
        }

        public static /* synthetic */ int access$2212(LayoutState layoutState, int i) {
            int i2 = layoutState.mPosition + i;
            layoutState.mPosition = i2;
            return i2;
        }

        public static /* synthetic */ int access$2220(LayoutState layoutState, int i) {
            int i2 = layoutState.mPosition - i;
            layoutState.mPosition = i2;
            return i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasMore(RecyclerView.C22075OooOoOO c22075OooOoOO, List<FlexLine> list) {
            int i;
            int i2 = this.mPosition;
            return i2 >= 0 && i2 < c22075OooOoOO.OooO0O0() && (i = this.mFlexLinePosition) >= 0 && i < list.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
            sb.append(this.mAvailable);
            sb.append(", mFlexLinePosition=");
            sb.append(this.mFlexLinePosition);
            sb.append(", mPosition=");
            sb.append(this.mPosition);
            sb.append(", mOffset=");
            sb.append(this.mOffset);
            sb.append(", mScrollingOffset=");
            sb.append(this.mScrollingOffset);
            sb.append(", mLastScrollDelta=");
            sb.append(this.mLastScrollDelta);
            sb.append(", mItemDirection=");
            sb.append(this.mItemDirection);
            sb.append(", mLayoutDirection=");
            return C20398OooO0O0.OooO00o('}', sb, this.mLayoutDirection);
        }
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    private boolean canViewBeRecycledFromEnd(View view, int i) {
        return (isMainAxisDirectionHorizontal() || !this.mIsRtl) ? this.mOrientationHelper.OooO0o0(view) >= this.mOrientationHelper.OooO0o() - i : this.mOrientationHelper.OooO0O0(view) <= i;
    }

    private boolean canViewBeRecycledFromStart(View view, int i) {
        return (isMainAxisDirectionHorizontal() || !this.mIsRtl) ? this.mOrientationHelper.OooO0O0(view) <= i : this.mOrientationHelper.OooO0o() - this.mOrientationHelper.OooO0o0(view) <= i;
    }

    private void clearFlexLines() {
        this.mFlexLines.clear();
        this.mAnchorInfo.reset();
        this.mAnchorInfo.mPerpendicularCoordinate = 0;
    }

    private int computeScrollExtent(RecyclerView.C22075OooOoOO c22075OooOoOO) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iOooO0O0 = c22075OooOoOO.OooO0O0();
        ensureOrientationHelper();
        View viewFindFirstReferenceChild = findFirstReferenceChild(iOooO0O0);
        View viewFindLastReferenceChild = findLastReferenceChild(iOooO0O0);
        if (c22075OooOoOO.OooO0O0() == 0 || viewFindFirstReferenceChild == null || viewFindLastReferenceChild == null) {
            return 0;
        }
        return Math.min(this.mOrientationHelper.OooOO0o(), this.mOrientationHelper.OooO0O0(viewFindLastReferenceChild) - this.mOrientationHelper.OooO0o0(viewFindFirstReferenceChild));
    }

    private int computeScrollOffset(RecyclerView.C22075OooOoOO c22075OooOoOO) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iOooO0O0 = c22075OooOoOO.OooO0O0();
        View viewFindFirstReferenceChild = findFirstReferenceChild(iOooO0O0);
        View viewFindLastReferenceChild = findLastReferenceChild(iOooO0O0);
        if (c22075OooOoOO.OooO0O0() == 0 || viewFindFirstReferenceChild == null || viewFindLastReferenceChild == null) {
            return 0;
        }
        int position = getPosition(viewFindFirstReferenceChild);
        int position2 = getPosition(viewFindLastReferenceChild);
        int iAbs = Math.abs(this.mOrientationHelper.OooO0O0(viewFindLastReferenceChild) - this.mOrientationHelper.OooO0o0(viewFindFirstReferenceChild));
        int i = this.mFlexboxHelper.mIndexToFlexLine[position];
        if (i == 0 || i == -1) {
            return 0;
        }
        return Math.round((i * (iAbs / ((r3[position2] - i) + 1))) + (this.mOrientationHelper.OooOO0O() - this.mOrientationHelper.OooO0o0(viewFindFirstReferenceChild)));
    }

    private int computeScrollRange(RecyclerView.C22075OooOoOO c22075OooOoOO) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iOooO0O0 = c22075OooOoOO.OooO0O0();
        View viewFindFirstReferenceChild = findFirstReferenceChild(iOooO0O0);
        View viewFindLastReferenceChild = findLastReferenceChild(iOooO0O0);
        if (c22075OooOoOO.OooO0O0() == 0 || viewFindFirstReferenceChild == null || viewFindLastReferenceChild == null) {
            return 0;
        }
        int iFindFirstVisibleItemPosition = findFirstVisibleItemPosition();
        return (int) ((Math.abs(this.mOrientationHelper.OooO0O0(viewFindLastReferenceChild) - this.mOrientationHelper.OooO0o0(viewFindFirstReferenceChild)) / ((findLastVisibleItemPosition() - iFindFirstVisibleItemPosition) + 1)) * c22075OooOoOO.OooO0O0());
    }

    private void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = new LayoutState();
        }
    }

    private void ensureOrientationHelper() {
        if (this.mOrientationHelper != null) {
            return;
        }
        if (isMainAxisDirectionHorizontal()) {
            if (this.mFlexWrap == 0) {
                this.mOrientationHelper = new C22051OooOoO(this);
                this.mSubOrientationHelper = new C22053OooOoOO(this);
                return;
            } else {
                this.mOrientationHelper = new C22053OooOoOO(this);
                this.mSubOrientationHelper = new C22051OooOoO(this);
                return;
            }
        }
        if (this.mFlexWrap == 0) {
            this.mOrientationHelper = new C22053OooOoOO(this);
            this.mSubOrientationHelper = new C22051OooOoO(this);
        } else {
            this.mOrientationHelper = new C22051OooOoO(this);
            this.mSubOrientationHelper = new C22053OooOoOO(this);
        }
    }

    private int fill(RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO, LayoutState layoutState) {
        if (layoutState.mScrollingOffset != Integer.MIN_VALUE) {
            if (layoutState.mAvailable < 0) {
                LayoutState.access$2012(layoutState, layoutState.mAvailable);
            }
            recycleByLayoutState(c22071OooOo0O, layoutState);
        }
        int i = layoutState.mAvailable;
        int crossSize = layoutState.mAvailable;
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int iLayoutFlexLine = 0;
        while (true) {
            if ((crossSize <= 0 && !this.mLayoutState.mInfinite) || !layoutState.hasMore(c22075OooOoOO, this.mFlexLines)) {
                break;
            }
            FlexLine flexLine = this.mFlexLines.get(layoutState.mFlexLinePosition);
            layoutState.mPosition = flexLine.mFirstIndex;
            iLayoutFlexLine += layoutFlexLine(flexLine, layoutState);
            if (zIsMainAxisDirectionHorizontal || !this.mIsRtl) {
                LayoutState.access$1012(layoutState, flexLine.getCrossSize() * layoutState.mLayoutDirection);
            } else {
                LayoutState.access$1020(layoutState, flexLine.getCrossSize() * layoutState.mLayoutDirection);
            }
            crossSize -= flexLine.getCrossSize();
        }
        LayoutState.access$1220(layoutState, iLayoutFlexLine);
        if (layoutState.mScrollingOffset != Integer.MIN_VALUE) {
            LayoutState.access$2012(layoutState, iLayoutFlexLine);
            if (layoutState.mAvailable < 0) {
                LayoutState.access$2012(layoutState, layoutState.mAvailable);
            }
            recycleByLayoutState(c22071OooOo0O, layoutState);
        }
        return i - layoutState.mAvailable;
    }

    private View findFirstReferenceChild(int i) {
        View viewFindReferenceChild = findReferenceChild(0, getChildCount(), i);
        if (viewFindReferenceChild == null) {
            return null;
        }
        int i2 = this.mFlexboxHelper.mIndexToFlexLine[getPosition(viewFindReferenceChild)];
        if (i2 == -1) {
            return null;
        }
        return findFirstReferenceViewInLine(viewFindReferenceChild, this.mFlexLines.get(i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private View findFirstReferenceViewInLine(View view, FlexLine flexLine) {
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int i = flexLine.mItemCount;
        for (int i2 = 1; i2 < i; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.mIsRtl || zIsMainAxisDirectionHorizontal) {
                    if (this.mOrientationHelper.OooO0o0(view) > this.mOrientationHelper.OooO0o0(childAt)) {
                        view = childAt;
                    }
                } else if (this.mOrientationHelper.OooO0O0(view) < this.mOrientationHelper.OooO0O0(childAt)) {
                }
            }
        }
        return view;
    }

    private View findLastReferenceChild(int i) {
        View viewFindReferenceChild = findReferenceChild(getChildCount() - 1, -1, i);
        if (viewFindReferenceChild == null) {
            return null;
        }
        return findLastReferenceViewInLine(viewFindReferenceChild, this.mFlexLines.get(this.mFlexboxHelper.mIndexToFlexLine[getPosition(viewFindReferenceChild)]));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private View findLastReferenceViewInLine(View view, FlexLine flexLine) {
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int childCount = (getChildCount() - flexLine.mItemCount) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.mIsRtl || zIsMainAxisDirectionHorizontal) {
                    if (this.mOrientationHelper.OooO0O0(view) < this.mOrientationHelper.OooO0O0(childAt)) {
                        view = childAt;
                    }
                } else if (this.mOrientationHelper.OooO0o0(view) > this.mOrientationHelper.OooO0o0(childAt)) {
                }
            }
        }
        return view;
    }

    private View findOneVisibleChild(int i, int i2, boolean z) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View childAt = getChildAt(i);
            if (isViewVisible(childAt, z)) {
                return childAt;
            }
            i += i3;
        }
        return null;
    }

    private View findReferenceChild(int i, int i2, int i3) {
        int position;
        ensureOrientationHelper();
        ensureLayoutState();
        int iOooOO0O = this.mOrientationHelper.OooOO0O();
        int iOooO0oO = this.mOrientationHelper.OooO0oO();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            if (childAt != null && (position = getPosition(childAt)) >= 0 && position < i3) {
                if (((RecyclerView.C22066OooOOOo) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.OooO0o0(childAt) >= iOooOO0O && this.mOrientationHelper.OooO0O0(childAt) <= iOooO0oO) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    private int fixLayoutEndGap(int i, RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO, boolean z) {
        int iHandleScrollingMainOrientation;
        int iOooO0oO;
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            int iOooO0oO2 = this.mOrientationHelper.OooO0oO() - i;
            if (iOooO0oO2 <= 0) {
                return 0;
            }
            iHandleScrollingMainOrientation = -handleScrollingMainOrientation(-iOooO0oO2, c22071OooOo0O, c22075OooOoOO);
        } else {
            int iOooOO0O = i - this.mOrientationHelper.OooOO0O();
            if (iOooOO0O <= 0) {
                return 0;
            }
            iHandleScrollingMainOrientation = handleScrollingMainOrientation(iOooOO0O, c22071OooOo0O, c22075OooOoOO);
        }
        int i2 = i + iHandleScrollingMainOrientation;
        if (!z || (iOooO0oO = this.mOrientationHelper.OooO0oO() - i2) <= 0) {
            return iHandleScrollingMainOrientation;
        }
        this.mOrientationHelper.OooOOOo(iOooO0oO);
        return iOooO0oO + iHandleScrollingMainOrientation;
    }

    private int fixLayoutStartGap(int i, RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO, boolean z) {
        int iHandleScrollingMainOrientation;
        int iOooOO0O;
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            int iOooOO0O2 = i - this.mOrientationHelper.OooOO0O();
            if (iOooOO0O2 <= 0) {
                return 0;
            }
            iHandleScrollingMainOrientation = -handleScrollingMainOrientation(iOooOO0O2, c22071OooOo0O, c22075OooOoOO);
        } else {
            int iOooO0oO = this.mOrientationHelper.OooO0oO() - i;
            if (iOooO0oO <= 0) {
                return 0;
            }
            iHandleScrollingMainOrientation = handleScrollingMainOrientation(-iOooO0oO, c22071OooOo0O, c22075OooOoOO);
        }
        int i2 = i + iHandleScrollingMainOrientation;
        if (!z || (iOooOO0O = i2 - this.mOrientationHelper.OooOO0O()) <= 0) {
            return iHandleScrollingMainOrientation;
        }
        this.mOrientationHelper.OooOOOo(-iOooOO0O);
        return iHandleScrollingMainOrientation - iOooOO0O;
    }

    private int getChildBottom(View view) {
        return getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C22066OooOOOo) view.getLayoutParams())).bottomMargin;
    }

    private View getChildClosestToStart() {
        return getChildAt(0);
    }

    private int getChildLeft(View view) {
        return getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C22066OooOOOo) view.getLayoutParams())).leftMargin;
    }

    private int getChildRight(View view) {
        return getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C22066OooOOOo) view.getLayoutParams())).rightMargin;
    }

    private int getChildTop(View view) {
        return getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C22066OooOOOo) view.getLayoutParams())).topMargin;
    }

    private int handleScrollingMainOrientation(int i, RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureOrientationHelper();
        int i2 = 1;
        this.mLayoutState.mShouldRecycle = true;
        boolean z = !isMainAxisDirectionHorizontal() && this.mIsRtl;
        if (!z ? i <= 0 : i >= 0) {
            i2 = -1;
        }
        int iAbs = Math.abs(i);
        updateLayoutState(i2, iAbs);
        int iFill = this.mLayoutState.mScrollingOffset + fill(c22071OooOo0O, c22075OooOoOO, this.mLayoutState);
        if (iFill < 0) {
            return 0;
        }
        if (z) {
            if (iAbs > iFill) {
                i = (-i2) * iFill;
            }
        } else if (iAbs > iFill) {
            i = i2 * iFill;
        }
        this.mOrientationHelper.OooOOOo(-i);
        this.mLayoutState.mLastScrollDelta = i;
        return i;
    }

    private int handleScrollingSubOrientation(int i) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureOrientationHelper();
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        View view = this.mParent;
        int width = zIsMainAxisDirectionHorizontal ? view.getWidth() : view.getHeight();
        int width2 = zIsMainAxisDirectionHorizontal ? getWidth() : getHeight();
        if (getLayoutDirection() == 1) {
            int iAbs = Math.abs(i);
            if (i < 0) {
                return -Math.min((width2 + this.mAnchorInfo.mPerpendicularCoordinate) - width, iAbs);
            }
            if (this.mAnchorInfo.mPerpendicularCoordinate + i > 0) {
                return -this.mAnchorInfo.mPerpendicularCoordinate;
            }
        } else {
            if (i > 0) {
                return Math.min((width2 - this.mAnchorInfo.mPerpendicularCoordinate) - width, i);
            }
            if (this.mAnchorInfo.mPerpendicularCoordinate + i < 0) {
                return -this.mAnchorInfo.mPerpendicularCoordinate;
            }
        }
        return i;
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

    private boolean isViewVisible(View view, boolean z) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int childLeft = getChildLeft(view);
        int childTop = getChildTop(view);
        int childRight = getChildRight(view);
        int childBottom = getChildBottom(view);
        return z ? (paddingLeft <= childLeft && width >= childRight) && (paddingTop <= childTop && height >= childBottom) : (childLeft >= width || childRight >= paddingLeft) && (childTop >= height || childBottom >= paddingTop);
    }

    private int layoutFlexLine(FlexLine flexLine, LayoutState layoutState) {
        return isMainAxisDirectionHorizontal() ? layoutFlexLineMainAxisHorizontal(flexLine, layoutState) : layoutFlexLineMainAxisVertical(flexLine, layoutState);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int layoutFlexLineMainAxisHorizontal(FlexLine flexLine, LayoutState layoutState) {
        float f;
        float f2;
        float f3;
        int itemCount;
        int i;
        float f4;
        FlexLine flexLine2 = flexLine;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int width = getWidth();
        int i2 = layoutState.mOffset;
        if (layoutState.mLayoutDirection == -1) {
            i2 -= flexLine2.mCrossSize;
        }
        int i3 = i2;
        int i4 = layoutState.mPosition;
        int i5 = this.mJustifyContent;
        int i6 = 1;
        if (i5 == 0) {
            f = paddingLeft;
            f2 = width - paddingRight;
        } else if (i5 == 1) {
            int i7 = flexLine2.mMainSize;
            float f5 = (width - i7) + paddingRight;
            f2 = i7 - paddingLeft;
            f = f5;
        } else {
            if (i5 != 2) {
                if (i5 == 3) {
                    f = paddingLeft;
                    f3 = (width - flexLine2.mMainSize) / (flexLine2.mItemCount != 1 ? r5 - 1 : 1.0f);
                    f2 = width - paddingRight;
                } else if (i5 == 4) {
                    int i8 = flexLine2.mItemCount;
                    f3 = i8 != 0 ? (width - flexLine2.mMainSize) / i8 : 0.0f;
                    float f6 = f3 / 2.0f;
                    f = paddingLeft + f6;
                    f2 = (width - paddingRight) - f6;
                } else {
                    if (i5 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.mJustifyContent);
                    }
                    f3 = flexLine2.mItemCount != 0 ? (width - flexLine2.mMainSize) / (r5 + 1) : 0.0f;
                    f = paddingLeft + f3;
                    f2 = (width - paddingRight) - f3;
                }
                float rightDecorationWidth = f - this.mAnchorInfo.mPerpendicularCoordinate;
                float leftDecorationWidth = f2 - this.mAnchorInfo.mPerpendicularCoordinate;
                float fMax = Math.max(f3, 0.0f);
                itemCount = flexLine2.getItemCount();
                int i9 = 0;
                i = i4;
                while (i < i4 + itemCount) {
                    float f7 = leftDecorationWidth;
                    View flexItemAt = getFlexItemAt(i);
                    if (flexItemAt == null) {
                        leftDecorationWidth = f7;
                        f4 = fMax;
                    } else {
                        if (layoutState.mLayoutDirection == i6) {
                            calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                            addView(flexItemAt);
                        } else {
                            calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                            addView(flexItemAt, i9);
                            i9++;
                        }
                        int i10 = i9;
                        FlexboxHelper flexboxHelper = this.mFlexboxHelper;
                        f4 = fMax;
                        long j = flexboxHelper.mMeasureSpecCache[i];
                        int iExtractLowerInt = flexboxHelper.extractLowerInt(j);
                        int iExtractHigherInt = this.mFlexboxHelper.extractHigherInt(j);
                        if (shouldMeasureChild(flexItemAt, iExtractLowerInt, iExtractHigherInt, (LayoutParams) flexItemAt.getLayoutParams())) {
                            flexItemAt.measure(iExtractLowerInt, iExtractHigherInt);
                        }
                        float leftDecorationWidth2 = rightDecorationWidth + getLeftDecorationWidth(flexItemAt) + ((ViewGroup.MarginLayoutParams) r10).leftMargin;
                        float rightDecorationWidth2 = f7 - (getRightDecorationWidth(flexItemAt) + ((ViewGroup.MarginLayoutParams) r10).rightMargin);
                        int topDecorationHeight = getTopDecorationHeight(flexItemAt) + i3;
                        if (this.mIsRtl) {
                            this.mFlexboxHelper.layoutSingleChildHorizontal(flexItemAt, flexLine2, Math.round(rightDecorationWidth2) - flexItemAt.getMeasuredWidth(), topDecorationHeight, Math.round(rightDecorationWidth2), flexItemAt.getMeasuredHeight() + topDecorationHeight);
                        } else {
                            this.mFlexboxHelper.layoutSingleChildHorizontal(flexItemAt, flexLine, Math.round(leftDecorationWidth2), topDecorationHeight, flexItemAt.getMeasuredWidth() + Math.round(leftDecorationWidth2), flexItemAt.getMeasuredHeight() + topDecorationHeight);
                        }
                        rightDecorationWidth = getRightDecorationWidth(flexItemAt) + flexItemAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r10).rightMargin + f4 + leftDecorationWidth2;
                        i9 = i10;
                        leftDecorationWidth = rightDecorationWidth2 - ((getLeftDecorationWidth(flexItemAt) + (flexItemAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r10).leftMargin)) + f4);
                    }
                    i++;
                    flexLine2 = flexLine;
                    fMax = f4;
                    i6 = 1;
                }
                LayoutState.access$1512(layoutState, this.mLayoutState.mLayoutDirection);
                return flexLine.getCrossSize();
            }
            int i11 = flexLine2.mMainSize;
            f = paddingLeft + ((width - i11) / 2.0f);
            f2 = (width - paddingRight) - ((width - i11) / 2.0f);
        }
        f3 = 0.0f;
        float rightDecorationWidth3 = f - this.mAnchorInfo.mPerpendicularCoordinate;
        float leftDecorationWidth3 = f2 - this.mAnchorInfo.mPerpendicularCoordinate;
        float fMax2 = Math.max(f3, 0.0f);
        itemCount = flexLine2.getItemCount();
        int i92 = 0;
        i = i4;
        while (i < i4 + itemCount) {
        }
        LayoutState.access$1512(layoutState, this.mLayoutState.mLayoutDirection);
        return flexLine.getCrossSize();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int layoutFlexLineMainAxisVertical(FlexLine flexLine, LayoutState layoutState) {
        float f;
        float f2;
        float f3;
        int itemCount;
        int i;
        float f4;
        boolean z;
        FlexLine flexLine2 = flexLine;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i2 = layoutState.mOffset;
        int i3 = layoutState.mOffset;
        if (layoutState.mLayoutDirection == -1) {
            int i4 = flexLine2.mCrossSize;
            i2 -= i4;
            i3 += i4;
        }
        int i5 = i2;
        int i6 = i3;
        int i7 = layoutState.mPosition;
        int i8 = this.mJustifyContent;
        boolean z2 = true;
        if (i8 == 0) {
            f = paddingTop;
            f2 = height - paddingBottom;
        } else if (i8 == 1) {
            int i9 = flexLine2.mMainSize;
            float f5 = (height - i9) + paddingBottom;
            f2 = i9 - paddingTop;
            f = f5;
        } else {
            if (i8 != 2) {
                if (i8 == 3) {
                    f = paddingTop;
                    f3 = (height - flexLine2.mMainSize) / (flexLine2.mItemCount != 1 ? r5 - 1 : 1.0f);
                    f2 = height - paddingBottom;
                } else if (i8 == 4) {
                    int i10 = flexLine2.mItemCount;
                    f3 = i10 != 0 ? (height - flexLine2.mMainSize) / i10 : 0.0f;
                    float f6 = f3 / 2.0f;
                    f = paddingTop + f6;
                    f2 = (height - paddingBottom) - f6;
                } else {
                    if (i8 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.mJustifyContent);
                    }
                    f3 = flexLine2.mItemCount != 0 ? (height - flexLine2.mMainSize) / (r5 + 1) : 0.0f;
                    f = paddingTop + f3;
                    f2 = (height - paddingBottom) - f3;
                }
                float bottomDecorationHeight = f - this.mAnchorInfo.mPerpendicularCoordinate;
                float topDecorationHeight = f2 - this.mAnchorInfo.mPerpendicularCoordinate;
                float fMax = Math.max(f3, 0.0f);
                itemCount = flexLine2.getItemCount();
                int i11 = 0;
                i = i7;
                while (i < i7 + itemCount) {
                    float f7 = topDecorationHeight;
                    View flexItemAt = getFlexItemAt(i);
                    if (flexItemAt == null) {
                        topDecorationHeight = f7;
                        z = z2;
                        f4 = fMax;
                    } else {
                        FlexboxHelper flexboxHelper = this.mFlexboxHelper;
                        f4 = fMax;
                        long j = flexboxHelper.mMeasureSpecCache[i];
                        int iExtractLowerInt = flexboxHelper.extractLowerInt(j);
                        int iExtractHigherInt = this.mFlexboxHelper.extractHigherInt(j);
                        if (shouldMeasureChild(flexItemAt, iExtractLowerInt, iExtractHigherInt, (LayoutParams) flexItemAt.getLayoutParams())) {
                            flexItemAt.measure(iExtractLowerInt, iExtractHigherInt);
                        }
                        float topDecorationHeight2 = bottomDecorationHeight + getTopDecorationHeight(flexItemAt) + ((ViewGroup.MarginLayoutParams) r12).topMargin;
                        float bottomDecorationHeight2 = f7 - (getBottomDecorationHeight(flexItemAt) + ((ViewGroup.MarginLayoutParams) r12).rightMargin);
                        if (layoutState.mLayoutDirection == 1) {
                            calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                            addView(flexItemAt);
                        } else {
                            calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                            addView(flexItemAt, i11);
                            i11++;
                        }
                        int i12 = i11;
                        int leftDecorationWidth = getLeftDecorationWidth(flexItemAt) + i5;
                        int rightDecorationWidth = i6 - getRightDecorationWidth(flexItemAt);
                        boolean z3 = this.mIsRtl;
                        if (!z3) {
                            z = true;
                            if (this.mFromBottomToTop) {
                                this.mFlexboxHelper.layoutSingleChildVertical(flexItemAt, flexLine, z3, leftDecorationWidth, Math.round(bottomDecorationHeight2) - flexItemAt.getMeasuredHeight(), flexItemAt.getMeasuredWidth() + leftDecorationWidth, Math.round(bottomDecorationHeight2));
                            } else {
                                this.mFlexboxHelper.layoutSingleChildVertical(flexItemAt, flexLine, z3, leftDecorationWidth, Math.round(topDecorationHeight2), flexItemAt.getMeasuredWidth() + leftDecorationWidth, flexItemAt.getMeasuredHeight() + Math.round(topDecorationHeight2));
                            }
                        } else if (this.mFromBottomToTop) {
                            z = true;
                            this.mFlexboxHelper.layoutSingleChildVertical(flexItemAt, flexLine2, z3, rightDecorationWidth - flexItemAt.getMeasuredWidth(), Math.round(bottomDecorationHeight2) - flexItemAt.getMeasuredHeight(), rightDecorationWidth, Math.round(bottomDecorationHeight2));
                        } else {
                            z = true;
                            this.mFlexboxHelper.layoutSingleChildVertical(flexItemAt, flexLine, z3, rightDecorationWidth - flexItemAt.getMeasuredWidth(), Math.round(topDecorationHeight2), rightDecorationWidth, flexItemAt.getMeasuredHeight() + Math.round(topDecorationHeight2));
                        }
                        bottomDecorationHeight = getBottomDecorationHeight(flexItemAt) + flexItemAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r12).topMargin + f4 + topDecorationHeight2;
                        i11 = i12;
                        topDecorationHeight = bottomDecorationHeight2 - ((getTopDecorationHeight(flexItemAt) + (flexItemAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r12).bottomMargin)) + f4);
                    }
                    i++;
                    flexLine2 = flexLine;
                    fMax = f4;
                    z2 = z;
                }
                LayoutState.access$1512(layoutState, this.mLayoutState.mLayoutDirection);
                return flexLine.getCrossSize();
            }
            int i13 = flexLine2.mMainSize;
            f = paddingTop + ((height - i13) / 2.0f);
            f2 = (height - paddingBottom) - ((height - i13) / 2.0f);
        }
        f3 = 0.0f;
        float bottomDecorationHeight3 = f - this.mAnchorInfo.mPerpendicularCoordinate;
        float topDecorationHeight3 = f2 - this.mAnchorInfo.mPerpendicularCoordinate;
        float fMax2 = Math.max(f3, 0.0f);
        itemCount = flexLine2.getItemCount();
        int i112 = 0;
        i = i7;
        while (i < i7 + itemCount) {
        }
        LayoutState.access$1512(layoutState, this.mLayoutState.mLayoutDirection);
        return flexLine.getCrossSize();
    }

    private void recycleByLayoutState(RecyclerView.C22071OooOo0O c22071OooOo0O, LayoutState layoutState) {
        if (layoutState.mShouldRecycle) {
            if (layoutState.mLayoutDirection == -1) {
                recycleFlexLinesFromEnd(c22071OooOo0O, layoutState);
            } else {
                recycleFlexLinesFromStart(c22071OooOo0O, layoutState);
            }
        }
    }

    private void recycleChildren(RecyclerView.C22071OooOo0O c22071OooOo0O, int i, int i2) {
        while (i2 >= i) {
            removeAndRecycleViewAt(i2, c22071OooOo0O);
            i2--;
        }
    }

    private void recycleFlexLinesFromEnd(RecyclerView.C22071OooOo0O c22071OooOo0O, LayoutState layoutState) {
        int childCount;
        int i;
        View childAt;
        int i2;
        if (layoutState.mScrollingOffset < 0 || (childCount = getChildCount()) == 0 || (childAt = getChildAt(childCount - 1)) == null || (i2 = this.mFlexboxHelper.mIndexToFlexLine[getPosition(childAt)]) == -1) {
            return;
        }
        FlexLine flexLine = this.mFlexLines.get(i2);
        int i3 = i;
        while (true) {
            if (i3 < 0) {
                break;
            }
            View childAt2 = getChildAt(i3);
            if (childAt2 != null) {
                if (!canViewBeRecycledFromEnd(childAt2, layoutState.mScrollingOffset)) {
                    break;
                }
                if (flexLine.mFirstIndex != getPosition(childAt2)) {
                    continue;
                } else if (i2 <= 0) {
                    childCount = i3;
                    break;
                } else {
                    i2 += layoutState.mLayoutDirection;
                    flexLine = this.mFlexLines.get(i2);
                    childCount = i3;
                }
            }
            i3--;
        }
        recycleChildren(c22071OooOo0O, childCount, i);
    }

    private void recycleFlexLinesFromStart(RecyclerView.C22071OooOo0O c22071OooOo0O, LayoutState layoutState) {
        int childCount;
        View childAt;
        if (layoutState.mScrollingOffset < 0 || (childCount = getChildCount()) == 0 || (childAt = getChildAt(0)) == null) {
            return;
        }
        int i = this.mFlexboxHelper.mIndexToFlexLine[getPosition(childAt)];
        int i2 = -1;
        if (i == -1) {
            return;
        }
        FlexLine flexLine = this.mFlexLines.get(i);
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt2 = getChildAt(i3);
            if (childAt2 != null) {
                if (!canViewBeRecycledFromStart(childAt2, layoutState.mScrollingOffset)) {
                    break;
                }
                if (flexLine.mLastIndex != getPosition(childAt2)) {
                    continue;
                } else if (i >= this.mFlexLines.size() - 1) {
                    i2 = i3;
                    break;
                } else {
                    i += layoutState.mLayoutDirection;
                    flexLine = this.mFlexLines.get(i);
                    i2 = i3;
                }
            }
            i3++;
        }
        recycleChildren(c22071OooOo0O, 0, i2);
    }

    private void resolveInfiniteAmount() {
        int heightMode = isMainAxisDirectionHorizontal() ? getHeightMode() : getWidthMode();
        this.mLayoutState.mInfinite = heightMode == 0 || heightMode == Integer.MIN_VALUE;
    }

    private void resolveLayoutDirection() {
        int layoutDirection = getLayoutDirection();
        int i = this.mFlexDirection;
        if (i == 0) {
            this.mIsRtl = layoutDirection == 1;
            this.mFromBottomToTop = this.mFlexWrap == 2;
            return;
        }
        if (i == 1) {
            this.mIsRtl = layoutDirection != 1;
            this.mFromBottomToTop = this.mFlexWrap == 2;
            return;
        }
        if (i == 2) {
            boolean z = layoutDirection == 1;
            this.mIsRtl = z;
            if (this.mFlexWrap == 2) {
                this.mIsRtl = !z;
            }
            this.mFromBottomToTop = false;
            return;
        }
        if (i != 3) {
            this.mIsRtl = false;
            this.mFromBottomToTop = false;
            return;
        }
        boolean z2 = layoutDirection == 1;
        this.mIsRtl = z2;
        if (this.mFlexWrap == 2) {
            this.mIsRtl = !z2;
        }
        this.mFromBottomToTop = true;
    }

    private boolean shouldMeasureChild(View view, int i, int i2, RecyclerView.C22066OooOOOo c22066OooOOOo) {
        return (!view.isLayoutRequested() && isMeasurementCacheEnabled() && isMeasurementUpToDate(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c22066OooOOOo).width) && isMeasurementUpToDate(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c22066OooOOOo).height)) ? false : true;
    }

    private boolean updateAnchorFromChildren(RecyclerView.C22075OooOoOO c22075OooOoOO, AnchorInfo anchorInfo) {
        if (getChildCount() == 0) {
            return false;
        }
        View viewFindLastReferenceChild = anchorInfo.mLayoutFromEnd ? findLastReferenceChild(c22075OooOoOO.OooO0O0()) : findFirstReferenceChild(c22075OooOoOO.OooO0O0());
        if (viewFindLastReferenceChild == null) {
            return false;
        }
        anchorInfo.assignFromView(viewFindLastReferenceChild);
        if (c22075OooOoOO.f66100OooO0oO || !supportsPredictiveItemAnimations()) {
            return true;
        }
        if (this.mOrientationHelper.OooO0o0(viewFindLastReferenceChild) < this.mOrientationHelper.OooO0oO() && this.mOrientationHelper.OooO0O0(viewFindLastReferenceChild) >= this.mOrientationHelper.OooOO0O()) {
            return true;
        }
        anchorInfo.mCoordinate = anchorInfo.mLayoutFromEnd ? this.mOrientationHelper.OooO0oO() : this.mOrientationHelper.OooOO0O();
        return true;
    }

    private boolean updateAnchorFromPendingState(RecyclerView.C22075OooOoOO c22075OooOoOO, AnchorInfo anchorInfo, SavedState savedState) {
        int i;
        View childAt;
        if (!c22075OooOoOO.f66100OooO0oO && (i = this.mPendingScrollPosition) != -1) {
            if (i >= 0 && i < c22075OooOoOO.OooO0O0()) {
                anchorInfo.mPosition = this.mPendingScrollPosition;
                anchorInfo.mFlexLinePosition = this.mFlexboxHelper.mIndexToFlexLine[anchorInfo.mPosition];
                SavedState savedState2 = this.mPendingSavedState;
                if (savedState2 != null && savedState2.hasValidAnchor(c22075OooOoOO.OooO0O0())) {
                    anchorInfo.mCoordinate = this.mOrientationHelper.OooOO0O() + savedState.mAnchorOffset;
                    anchorInfo.mAssignedFromSavedState = true;
                    anchorInfo.mFlexLinePosition = -1;
                    return true;
                }
                if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
                        anchorInfo.mCoordinate = this.mOrientationHelper.OooOO0O() + this.mPendingScrollPositionOffset;
                        return true;
                    }
                    anchorInfo.mCoordinate = this.mPendingScrollPositionOffset - this.mOrientationHelper.OooO0oo();
                    return true;
                }
                View viewFindViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                if (viewFindViewByPosition == null) {
                    if (getChildCount() > 0 && (childAt = getChildAt(0)) != null) {
                        anchorInfo.mLayoutFromEnd = this.mPendingScrollPosition < getPosition(childAt);
                    }
                    anchorInfo.assignCoordinateFromPadding();
                    return true;
                }
                if (this.mOrientationHelper.OooO0OO(viewFindViewByPosition) > this.mOrientationHelper.OooOO0o()) {
                    anchorInfo.assignCoordinateFromPadding();
                    return true;
                }
                if (this.mOrientationHelper.OooO0o0(viewFindViewByPosition) - this.mOrientationHelper.OooOO0O() < 0) {
                    anchorInfo.mCoordinate = this.mOrientationHelper.OooOO0O();
                    anchorInfo.mLayoutFromEnd = false;
                    return true;
                }
                if (this.mOrientationHelper.OooO0oO() - this.mOrientationHelper.OooO0O0(viewFindViewByPosition) >= 0) {
                    anchorInfo.mCoordinate = anchorInfo.mLayoutFromEnd ? this.mOrientationHelper.OooOOO0() + this.mOrientationHelper.OooO0O0(viewFindViewByPosition) : this.mOrientationHelper.OooO0o0(viewFindViewByPosition);
                    return true;
                }
                anchorInfo.mCoordinate = this.mOrientationHelper.OooO0oO();
                anchorInfo.mLayoutFromEnd = true;
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.C22075OooOoOO c22075OooOoOO, AnchorInfo anchorInfo) {
        if (updateAnchorFromPendingState(c22075OooOoOO, anchorInfo, this.mPendingSavedState) || updateAnchorFromChildren(c22075OooOoOO, anchorInfo)) {
            return;
        }
        anchorInfo.assignCoordinateFromPadding();
        anchorInfo.mPosition = 0;
        anchorInfo.mFlexLinePosition = 0;
    }

    private void updateDirtyPosition(int i) {
        if (i >= findLastVisibleItemPosition()) {
            return;
        }
        int childCount = getChildCount();
        this.mFlexboxHelper.ensureMeasureSpecCache(childCount);
        this.mFlexboxHelper.ensureMeasuredSizeCache(childCount);
        this.mFlexboxHelper.ensureIndexToFlexLine(childCount);
        if (i >= this.mFlexboxHelper.mIndexToFlexLine.length) {
            return;
        }
        this.mDirtyPosition = i;
        View childClosestToStart = getChildClosestToStart();
        if (childClosestToStart == null) {
            return;
        }
        this.mPendingScrollPosition = getPosition(childClosestToStart);
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            this.mPendingScrollPositionOffset = this.mOrientationHelper.OooO0o0(childClosestToStart) - this.mOrientationHelper.OooOO0O();
        } else {
            this.mPendingScrollPositionOffset = this.mOrientationHelper.OooO0oo() + this.mOrientationHelper.OooO0O0(childClosestToStart);
        }
    }

    private void updateFlexLines(int i) {
        int i2;
        int i3;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        int width = getWidth();
        int height = getHeight();
        boolean z = false;
        if (isMainAxisDirectionHorizontal()) {
            int i4 = this.mLastWidth;
            if (i4 != Integer.MIN_VALUE && i4 != width) {
                z = true;
            }
            i2 = this.mLayoutState.mInfinite ? this.mContext.getResources().getDisplayMetrics().heightPixels : this.mLayoutState.mAvailable;
        } else {
            int i5 = this.mLastHeight;
            if (i5 != Integer.MIN_VALUE && i5 != height) {
                z = true;
            }
            i2 = this.mLayoutState.mInfinite ? this.mContext.getResources().getDisplayMetrics().widthPixels : this.mLayoutState.mAvailable;
        }
        int i6 = i2;
        this.mLastWidth = width;
        this.mLastHeight = height;
        int i7 = this.mDirtyPosition;
        if (i7 == -1 && (this.mPendingScrollPosition != -1 || z)) {
            if (this.mAnchorInfo.mLayoutFromEnd) {
                return;
            }
            this.mFlexLines.clear();
            this.mFlexLinesResult.reset();
            if (isMainAxisDirectionHorizontal()) {
                this.mFlexboxHelper.calculateHorizontalFlexLinesToIndex(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i6, this.mAnchorInfo.mPosition, this.mFlexLines);
            } else {
                this.mFlexboxHelper.calculateVerticalFlexLinesToIndex(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i6, this.mAnchorInfo.mPosition, this.mFlexLines);
            }
            this.mFlexLines = this.mFlexLinesResult.mFlexLines;
            this.mFlexboxHelper.determineMainSize(iMakeMeasureSpec, iMakeMeasureSpec2);
            this.mFlexboxHelper.stretchViews();
            AnchorInfo anchorInfo = this.mAnchorInfo;
            anchorInfo.mFlexLinePosition = this.mFlexboxHelper.mIndexToFlexLine[anchorInfo.mPosition];
            this.mLayoutState.mFlexLinePosition = this.mAnchorInfo.mFlexLinePosition;
            return;
        }
        int iMin = i7 != -1 ? Math.min(i7, this.mAnchorInfo.mPosition) : this.mAnchorInfo.mPosition;
        this.mFlexLinesResult.reset();
        if (!isMainAxisDirectionHorizontal()) {
            i3 = iMin;
            if (this.mFlexLines.size() > 0) {
                this.mFlexboxHelper.clearFlexLines(this.mFlexLines, i3);
                iMin = i3;
                this.mFlexboxHelper.calculateFlexLines(this.mFlexLinesResult, iMakeMeasureSpec2, iMakeMeasureSpec, i6, iMin, this.mAnchorInfo.mPosition, this.mFlexLines);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
                i3 = iMin;
            } else {
                this.mFlexboxHelper.ensureIndexToFlexLine(i);
                this.mFlexboxHelper.calculateVerticalFlexLines(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i6, 0, this.mFlexLines);
            }
        } else if (this.mFlexLines.size() > 0) {
            this.mFlexboxHelper.clearFlexLines(this.mFlexLines, iMin);
            this.mFlexboxHelper.calculateFlexLines(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i6, iMin, this.mAnchorInfo.mPosition, this.mFlexLines);
            i3 = iMin;
        } else {
            i3 = iMin;
            this.mFlexboxHelper.ensureIndexToFlexLine(i);
            this.mFlexboxHelper.calculateHorizontalFlexLines(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i6, 0, this.mFlexLines);
        }
        this.mFlexLines = this.mFlexLinesResult.mFlexLines;
        this.mFlexboxHelper.determineMainSize(iMakeMeasureSpec, iMakeMeasureSpec2, i3);
        this.mFlexboxHelper.stretchViews(i3);
    }

    private void updateLayoutState(int i, int i2) {
        this.mLayoutState.mLayoutDirection = i;
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        boolean z = !zIsMainAxisDirectionHorizontal && this.mIsRtl;
        if (i == 1) {
            View childAt = getChildAt(getChildCount() - 1);
            if (childAt == null) {
                return;
            }
            this.mLayoutState.mOffset = this.mOrientationHelper.OooO0O0(childAt);
            int position = getPosition(childAt);
            View viewFindLastReferenceViewInLine = findLastReferenceViewInLine(childAt, this.mFlexLines.get(this.mFlexboxHelper.mIndexToFlexLine[position]));
            this.mLayoutState.mItemDirection = 1;
            LayoutState layoutState = this.mLayoutState;
            layoutState.mPosition = position + layoutState.mItemDirection;
            if (this.mFlexboxHelper.mIndexToFlexLine.length <= this.mLayoutState.mPosition) {
                this.mLayoutState.mFlexLinePosition = -1;
            } else {
                LayoutState layoutState2 = this.mLayoutState;
                layoutState2.mFlexLinePosition = this.mFlexboxHelper.mIndexToFlexLine[layoutState2.mPosition];
            }
            if (z) {
                this.mLayoutState.mOffset = this.mOrientationHelper.OooO0o0(viewFindLastReferenceViewInLine);
                this.mLayoutState.mScrollingOffset = this.mOrientationHelper.OooOO0O() + (-this.mOrientationHelper.OooO0o0(viewFindLastReferenceViewInLine));
                LayoutState layoutState3 = this.mLayoutState;
                layoutState3.mScrollingOffset = Math.max(layoutState3.mScrollingOffset, 0);
            } else {
                this.mLayoutState.mOffset = this.mOrientationHelper.OooO0O0(viewFindLastReferenceViewInLine);
                this.mLayoutState.mScrollingOffset = this.mOrientationHelper.OooO0O0(viewFindLastReferenceViewInLine) - this.mOrientationHelper.OooO0oO();
            }
            if ((this.mLayoutState.mFlexLinePosition == -1 || this.mLayoutState.mFlexLinePosition > this.mFlexLines.size() - 1) && this.mLayoutState.mPosition <= getFlexItemCount()) {
                int i3 = i2 - this.mLayoutState.mScrollingOffset;
                this.mFlexLinesResult.reset();
                if (i3 > 0) {
                    if (zIsMainAxisDirectionHorizontal) {
                        this.mFlexboxHelper.calculateHorizontalFlexLines(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i3, this.mLayoutState.mPosition, this.mFlexLines);
                    } else {
                        this.mFlexboxHelper.calculateVerticalFlexLines(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i3, this.mLayoutState.mPosition, this.mFlexLines);
                    }
                    this.mFlexboxHelper.determineMainSize(iMakeMeasureSpec, iMakeMeasureSpec2, this.mLayoutState.mPosition);
                    this.mFlexboxHelper.stretchViews(this.mLayoutState.mPosition);
                }
            }
        } else {
            View childAt2 = getChildAt(0);
            if (childAt2 == null) {
                return;
            }
            this.mLayoutState.mOffset = this.mOrientationHelper.OooO0o0(childAt2);
            int position2 = getPosition(childAt2);
            View viewFindFirstReferenceViewInLine = findFirstReferenceViewInLine(childAt2, this.mFlexLines.get(this.mFlexboxHelper.mIndexToFlexLine[position2]));
            this.mLayoutState.mItemDirection = 1;
            int i4 = this.mFlexboxHelper.mIndexToFlexLine[position2];
            if (i4 == -1) {
                i4 = 0;
            }
            if (i4 > 0) {
                this.mLayoutState.mPosition = position2 - this.mFlexLines.get(i4 - 1).getItemCount();
            } else {
                this.mLayoutState.mPosition = -1;
            }
            this.mLayoutState.mFlexLinePosition = i4 > 0 ? i4 - 1 : 0;
            if (z) {
                this.mLayoutState.mOffset = this.mOrientationHelper.OooO0O0(viewFindFirstReferenceViewInLine);
                this.mLayoutState.mScrollingOffset = this.mOrientationHelper.OooO0O0(viewFindFirstReferenceViewInLine) - this.mOrientationHelper.OooO0oO();
                LayoutState layoutState4 = this.mLayoutState;
                layoutState4.mScrollingOffset = Math.max(layoutState4.mScrollingOffset, 0);
            } else {
                this.mLayoutState.mOffset = this.mOrientationHelper.OooO0o0(viewFindFirstReferenceViewInLine);
                this.mLayoutState.mScrollingOffset = this.mOrientationHelper.OooOO0O() + (-this.mOrientationHelper.OooO0o0(viewFindFirstReferenceViewInLine));
            }
        }
        LayoutState layoutState5 = this.mLayoutState;
        layoutState5.mAvailable = i2 - layoutState5.mScrollingOffset;
    }

    private void updateLayoutStateToFillEnd(AnchorInfo anchorInfo, boolean z, boolean z2) {
        if (z2) {
            resolveInfiniteAmount();
        } else {
            this.mLayoutState.mInfinite = false;
        }
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            this.mLayoutState.mAvailable = this.mOrientationHelper.OooO0oO() - anchorInfo.mCoordinate;
        } else {
            this.mLayoutState.mAvailable = anchorInfo.mCoordinate - getPaddingRight();
        }
        this.mLayoutState.mPosition = anchorInfo.mPosition;
        this.mLayoutState.mItemDirection = 1;
        this.mLayoutState.mLayoutDirection = 1;
        this.mLayoutState.mOffset = anchorInfo.mCoordinate;
        this.mLayoutState.mScrollingOffset = Integer.MIN_VALUE;
        this.mLayoutState.mFlexLinePosition = anchorInfo.mFlexLinePosition;
        if (!z || this.mFlexLines.size() <= 1 || anchorInfo.mFlexLinePosition < 0 || anchorInfo.mFlexLinePosition >= this.mFlexLines.size() - 1) {
            return;
        }
        FlexLine flexLine = this.mFlexLines.get(anchorInfo.mFlexLinePosition);
        LayoutState.access$1508(this.mLayoutState);
        LayoutState.access$2212(this.mLayoutState, flexLine.getItemCount());
    }

    private void updateLayoutStateToFillStart(AnchorInfo anchorInfo, boolean z, boolean z2) {
        if (z2) {
            resolveInfiniteAmount();
        } else {
            this.mLayoutState.mInfinite = false;
        }
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            this.mLayoutState.mAvailable = anchorInfo.mCoordinate - this.mOrientationHelper.OooOO0O();
        } else {
            this.mLayoutState.mAvailable = (this.mParent.getWidth() - anchorInfo.mCoordinate) - this.mOrientationHelper.OooOO0O();
        }
        this.mLayoutState.mPosition = anchorInfo.mPosition;
        this.mLayoutState.mItemDirection = 1;
        this.mLayoutState.mLayoutDirection = -1;
        this.mLayoutState.mOffset = anchorInfo.mCoordinate;
        this.mLayoutState.mScrollingOffset = Integer.MIN_VALUE;
        this.mLayoutState.mFlexLinePosition = anchorInfo.mFlexLinePosition;
        if (!z || anchorInfo.mFlexLinePosition <= 0 || this.mFlexLines.size() <= anchorInfo.mFlexLinePosition) {
            return;
        }
        FlexLine flexLine = this.mFlexLines.get(anchorInfo.mFlexLinePosition);
        LayoutState.access$1510(this.mLayoutState);
        LayoutState.access$2220(this.mLayoutState, flexLine.getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public boolean canScrollHorizontally() {
        if (this.mFlexWrap == 0) {
            return isMainAxisDirectionHorizontal();
        }
        if (!isMainAxisDirectionHorizontal()) {
            return true;
        }
        int width = getWidth();
        View view = this.mParent;
        return width > (view != null ? view.getWidth() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public boolean canScrollVertically() {
        if (this.mFlexWrap == 0) {
            return !isMainAxisDirectionHorizontal();
        }
        if (!isMainAxisDirectionHorizontal()) {
            int height = getHeight();
            View view = this.mParent;
            if (height <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public boolean checkLayoutParams(RecyclerView.C22066OooOOOo c22066OooOOOo) {
        return c22066OooOOOo instanceof LayoutParams;
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
        View childAt;
        if (getChildCount() == 0 || (childAt = getChildAt(0)) == null) {
            return null;
        }
        int i2 = i < getPosition(childAt) ? -1 : 1;
        return isMainAxisDirectionHorizontal() ? new PointF(0.0f, i2) : new PointF(i2, 0.0f);
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

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public RecyclerView.C22066OooOOOo generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public RecyclerView.C22066OooOOOo generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getAlignContent() {
        return 5;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getAlignItems() {
        return this.mAlignItems;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getChildHeightMeasureSpec(int i, int i2, int i3) {
        return RecyclerView.OooOOOO.getChildMeasureSpec(getHeight(), getHeightMode(), i2, i3, canScrollVertically());
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getChildWidthMeasureSpec(int i, int i2, int i3) {
        return RecyclerView.OooOOOO.getChildMeasureSpec(getWidth(), getWidthMode(), i2, i3, canScrollHorizontally());
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getDecorationLengthCrossAxis(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (isMainAxisDirectionHorizontal()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return rightDecorationWidth + leftDecorationWidth;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getDecorationLengthMainAxis(View view, int i, int i2) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (isMainAxisDirectionHorizontal()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return bottomDecorationHeight + topDecorationHeight;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexDirection() {
        return this.mFlexDirection;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public View getFlexItemAt(int i) {
        View view = this.mViewCache.get(i);
        return view != null ? view : this.mRecycler.OooOO0O(i, LocationRequestCompat.PASSIVE_INTERVAL).itemView;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexItemCount() {
        return this.mState.OooO0O0();
    }

    @Override // com.google.android.flexbox.FlexContainer
    public List<FlexLine> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.mFlexLines.size());
        int size = this.mFlexLines.size();
        for (int i = 0; i < size; i++) {
            FlexLine flexLine = this.mFlexLines.get(i);
            if (flexLine.getItemCount() != 0) {
                arrayList.add(flexLine);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public List<FlexLine> getFlexLinesInternal() {
        return this.mFlexLines;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexWrap() {
        return this.mFlexWrap;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getJustifyContent() {
        return this.mJustifyContent;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getLargestMainSize() {
        if (this.mFlexLines.size() == 0) {
            return 0;
        }
        int size = this.mFlexLines.size();
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, this.mFlexLines.get(i).mMainSize);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getMaxLine() {
        return this.mMaxLine;
    }

    public int getPositionToFlexLineIndex(int i) {
        return this.mFlexboxHelper.mIndexToFlexLine[i];
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public View getReorderedFlexItemAt(int i) {
        return getFlexItemAt(i);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getSumOfCrossSize() {
        int size = this.mFlexLines.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.mFlexLines.get(i2).mCrossSize;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRtl() {
        return this.mIsRtl;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public boolean isMainAxisDirectionHorizontal() {
        int i = this.mFlexDirection;
        return i == 0 || i == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public void onAdapterChanged(RecyclerView.AbstractC22062OooO0oO abstractC22062OooO0oO, RecyclerView.AbstractC22062OooO0oO abstractC22062OooO0oO2) {
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.mParent = (View) recyclerView.getParent();
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
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        updateDirtyPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        super.onItemsMoved(recyclerView, i, i2, i3);
        updateDirtyPosition(Math.min(i, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        updateDirtyPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.onItemsUpdated(recyclerView, i, i2, obj);
        updateDirtyPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public void onLayoutChildren(RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        int i;
        int i2;
        this.mRecycler = c22071OooOo0O;
        this.mState = c22075OooOoOO;
        int iOooO0O0 = c22075OooOoOO.OooO0O0();
        if (iOooO0O0 == 0 && c22075OooOoOO.f66100OooO0oO) {
            return;
        }
        resolveLayoutDirection();
        ensureOrientationHelper();
        ensureLayoutState();
        this.mFlexboxHelper.ensureMeasureSpecCache(iOooO0O0);
        this.mFlexboxHelper.ensureMeasuredSizeCache(iOooO0O0);
        this.mFlexboxHelper.ensureIndexToFlexLine(iOooO0O0);
        this.mLayoutState.mShouldRecycle = false;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.hasValidAnchor(iOooO0O0)) {
            this.mPendingScrollPosition = this.mPendingSavedState.mAnchorPosition;
        }
        if (!this.mAnchorInfo.mValid || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            this.mAnchorInfo.reset();
            updateAnchorInfoForLayout(c22075OooOoOO, this.mAnchorInfo);
            this.mAnchorInfo.mValid = true;
        }
        detachAndScrapAttachedViews(c22071OooOo0O);
        if (this.mAnchorInfo.mLayoutFromEnd) {
            updateLayoutStateToFillStart(this.mAnchorInfo, false, true);
        } else {
            updateLayoutStateToFillEnd(this.mAnchorInfo, false, true);
        }
        updateFlexLines(iOooO0O0);
        fill(c22071OooOo0O, c22075OooOoOO, this.mLayoutState);
        if (this.mAnchorInfo.mLayoutFromEnd) {
            i2 = this.mLayoutState.mOffset;
            updateLayoutStateToFillEnd(this.mAnchorInfo, true, false);
            fill(c22071OooOo0O, c22075OooOoOO, this.mLayoutState);
            i = this.mLayoutState.mOffset;
        } else {
            i = this.mLayoutState.mOffset;
            updateLayoutStateToFillStart(this.mAnchorInfo, true, false);
            fill(c22071OooOo0O, c22075OooOoOO, this.mLayoutState);
            i2 = this.mLayoutState.mOffset;
        }
        if (getChildCount() > 0) {
            if (this.mAnchorInfo.mLayoutFromEnd) {
                fixLayoutStartGap(i2 + fixLayoutEndGap(i, c22071OooOo0O, c22075OooOoOO, true), c22071OooOo0O, c22075OooOoOO, false);
            } else {
                fixLayoutEndGap(i + fixLayoutStartGap(i2, c22071OooOo0O, c22075OooOoOO, true), c22071OooOo0O, c22075OooOoOO, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public void onLayoutCompleted(RecyclerView.C22075OooOoOO c22075OooOoOO) {
        super.onLayoutCompleted(c22075OooOoOO);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mDirtyPosition = -1;
        this.mAnchorInfo.reset();
        this.mViewCache.clear();
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void onNewFlexItemAdded(View view, int i, int i2, FlexLine flexLine) {
        calculateItemDecorationsForChild(view, TEMP_RECT);
        if (isMainAxisDirectionHorizontal()) {
            int rightDecorationWidth = getRightDecorationWidth(view) + getLeftDecorationWidth(view);
            flexLine.mMainSize += rightDecorationWidth;
            flexLine.mDividerLengthInMainSize += rightDecorationWidth;
            return;
        }
        int bottomDecorationHeight = getBottomDecorationHeight(view) + getTopDecorationHeight(view);
        flexLine.mMainSize += bottomDecorationHeight;
        flexLine.mDividerLengthInMainSize += bottomDecorationHeight;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void onNewFlexLineAdded(FlexLine flexLine) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.mPendingSavedState = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() <= 0) {
            savedState.invalidateAnchor();
            return savedState;
        }
        View childClosestToStart = getChildClosestToStart();
        savedState.mAnchorPosition = getPosition(childClosestToStart);
        savedState.mAnchorOffset = this.mOrientationHelper.OooO0o0(childClosestToStart) - this.mOrientationHelper.OooOO0O();
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public int scrollHorizontallyBy(int i, RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        if (!isMainAxisDirectionHorizontal() || this.mFlexWrap == 0) {
            int iHandleScrollingMainOrientation = handleScrollingMainOrientation(i, c22071OooOo0O, c22075OooOoOO);
            this.mViewCache.clear();
            return iHandleScrollingMainOrientation;
        }
        int iHandleScrollingSubOrientation = handleScrollingSubOrientation(i);
        AnchorInfo.access$2412(this.mAnchorInfo, iHandleScrollingSubOrientation);
        this.mSubOrientationHelper.OooOOOo(-iHandleScrollingSubOrientation);
        return iHandleScrollingSubOrientation;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.invalidateAnchor();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public int scrollVerticallyBy(int i, RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        if (isMainAxisDirectionHorizontal() || (this.mFlexWrap == 0 && !isMainAxisDirectionHorizontal())) {
            int iHandleScrollingMainOrientation = handleScrollingMainOrientation(i, c22071OooOo0O, c22075OooOoOO);
            this.mViewCache.clear();
            return iHandleScrollingMainOrientation;
        }
        int iHandleScrollingSubOrientation = handleScrollingSubOrientation(i);
        AnchorInfo.access$2412(this.mAnchorInfo, iHandleScrollingSubOrientation);
        this.mSubOrientationHelper.OooOOOo(-iHandleScrollingSubOrientation);
        return iHandleScrollingSubOrientation;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setAlignContent(int i) {
        throw new UnsupportedOperationException("Setting the alignContent in the FlexboxLayoutManager is not supported. Use FlexboxLayout if you need to use this attribute.");
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setAlignItems(int i) {
        int i2 = this.mAlignItems;
        if (i2 != i) {
            if (i2 == 4 || i == 4) {
                removeAllViews();
                clearFlexLines();
            }
            this.mAlignItems = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexDirection(int i) {
        if (this.mFlexDirection != i) {
            removeAllViews();
            this.mFlexDirection = i;
            this.mOrientationHelper = null;
            this.mSubOrientationHelper = null;
            clearFlexLines();
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexLines(List<FlexLine> list) {
        this.mFlexLines = list;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexWrap(int i) {
        if (i == 2) {
            throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
        }
        int i2 = this.mFlexWrap;
        if (i2 != i) {
            if (i2 == 0 || i == 0) {
                removeAllViews();
                clearFlexLines();
            }
            this.mFlexWrap = i;
            this.mOrientationHelper = null;
            this.mSubOrientationHelper = null;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setJustifyContent(int i) {
        if (this.mJustifyContent != i) {
            this.mJustifyContent = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setMaxLine(int i) {
        if (this.mMaxLine != i) {
            this.mMaxLine = i;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C22075OooOoOO c22075OooOoOO, int i) {
        C22049OooOo0O c22049OooOo0O = new C22049OooOo0O(recyclerView.getContext());
        c22049OooOo0O.setTargetPosition(i);
        startSmoothScroll(c22049OooOo0O);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void updateViewCache(int i, View view) {
        this.mViewCache.put(i, view);
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.flexbox.FlexboxLayoutManager.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        private int mAnchorOffset;
        private int mAnchorPosition;

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasValidAnchor(int i) {
            int i2 = this.mAnchorPosition;
            return i2 >= 0 && i2 < i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void invalidateAnchor() {
            this.mAnchorPosition = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
            sb.append(this.mAnchorPosition);
            sb.append(", mAnchorOffset=");
            return C20398OooO0O0.OooO00o('}', sb, this.mAnchorOffset);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mAnchorOffset);
        }

        public SavedState() {
        }

        private SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mAnchorOffset = parcel.readInt();
        }

        private SavedState(SavedState savedState) {
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mAnchorOffset = savedState.mAnchorOffset;
        }
    }

    public FlexboxLayoutManager(Context context, int i) {
        this(context, i, 1);
    }

    public FlexboxLayoutManager(Context context, int i, int i2) {
        this.mMaxLine = -1;
        this.mFlexLines = new ArrayList();
        this.mFlexboxHelper = new FlexboxHelper(this);
        this.mAnchorInfo = new AnchorInfo();
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mLastWidth = Integer.MIN_VALUE;
        this.mLastHeight = Integer.MIN_VALUE;
        this.mViewCache = new SparseArray<>();
        this.mDirtyPosition = -1;
        this.mFlexLinesResult = new FlexboxHelper.FlexLinesResult();
        setFlexDirection(i);
        setFlexWrap(i2);
        setAlignItems(4);
        this.mContext = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        super.onItemsUpdated(recyclerView, i, i2);
        updateDirtyPosition(i);
    }

    public static class LayoutParams extends RecyclerView.C22066OooOOOo implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator<LayoutParams>() { // from class: com.google.android.flexbox.FlexboxLayoutManager.LayoutParams.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        };
        private int mAlignSelf;
        private float mFlexBasisPercent;
        private float mFlexGrow;
        private float mFlexShrink;
        private int mMaxHeight;
        private int mMaxWidth;
        private int mMinHeight;
        private int mMinWidth;
        private boolean mWrapBefore;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getAlignSelf() {
            return this.mAlignSelf;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexBasisPercent() {
            return this.mFlexBasisPercent;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexGrow() {
            return this.mFlexGrow;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexShrink() {
            return this.mFlexShrink;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginBottom() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginLeft() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginRight() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginTop() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxHeight() {
            return this.mMaxHeight;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxWidth() {
            return this.mMaxWidth;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinHeight() {
            return this.mMinHeight;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinWidth() {
            return this.mMinWidth;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean isWrapBefore() {
            return this.mWrapBefore;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setAlignSelf(int i) {
            this.mAlignSelf = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexBasisPercent(float f) {
            this.mFlexBasisPercent = f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexGrow(float f) {
            this.mFlexGrow = f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexShrink(float f) {
            this.mFlexShrink = f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setHeight(int i) {
            ((ViewGroup.MarginLayoutParams) this).height = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMaxHeight(int i) {
            this.mMaxHeight = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMaxWidth(int i) {
            this.mMaxWidth = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinHeight(int i) {
            this.mMinHeight = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinWidth(int i) {
            this.mMinWidth = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setOrder(int i) {
            throw new UnsupportedOperationException("Setting the order in the FlexboxLayoutManager is not supported. Use FlexboxLayout if you need to reorder using the attribute.");
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setWidth(int i) {
            ((ViewGroup.MarginLayoutParams) this).width = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setWrapBefore(boolean z) {
            this.mWrapBefore = z;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.mFlexGrow);
            parcel.writeFloat(this.mFlexShrink);
            parcel.writeInt(this.mAlignSelf);
            parcel.writeFloat(this.mFlexBasisPercent);
            parcel.writeInt(this.mMinWidth);
            parcel.writeInt(this.mMinHeight);
            parcel.writeInt(this.mMaxWidth);
            parcel.writeInt(this.mMaxHeight);
            parcel.writeByte(this.mWrapBefore ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(RecyclerView.C22066OooOOOo c22066OooOOOo) {
            super(c22066OooOOOo);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((RecyclerView.C22066OooOOOo) layoutParams);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
            this.mFlexGrow = layoutParams.mFlexGrow;
            this.mFlexShrink = layoutParams.mFlexShrink;
            this.mAlignSelf = layoutParams.mAlignSelf;
            this.mFlexBasisPercent = layoutParams.mFlexBasisPercent;
            this.mMinWidth = layoutParams.mMinWidth;
            this.mMinHeight = layoutParams.mMinHeight;
            this.mMaxWidth = layoutParams.mMaxWidth;
            this.mMaxHeight = layoutParams.mMaxHeight;
            this.mWrapBefore = layoutParams.mWrapBefore;
        }

        public LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
            this.mFlexGrow = parcel.readFloat();
            this.mFlexShrink = parcel.readFloat();
            this.mAlignSelf = parcel.readInt();
            this.mFlexBasisPercent = parcel.readFloat();
            this.mMinWidth = parcel.readInt();
            this.mMinHeight = parcel.readInt();
            this.mMaxWidth = parcel.readInt();
            this.mMaxHeight = parcel.readInt();
            this.mWrapBefore = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mMaxLine = -1;
        this.mFlexLines = new ArrayList();
        this.mFlexboxHelper = new FlexboxHelper(this);
        this.mAnchorInfo = new AnchorInfo();
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mLastWidth = Integer.MIN_VALUE;
        this.mLastHeight = Integer.MIN_VALUE;
        this.mViewCache = new SparseArray<>();
        this.mDirtyPosition = -1;
        this.mFlexLinesResult = new FlexboxHelper.FlexLinesResult();
        RecyclerView.OooOOOO.C22065OooO0Oo properties = RecyclerView.OooOOOO.getProperties(context, attributeSet, i, i2);
        int i3 = properties.f66067OooO00o;
        if (i3 != 0) {
            if (i3 == 1) {
                if (properties.f66069OooO0OO) {
                    setFlexDirection(3);
                } else {
                    setFlexDirection(2);
                }
            }
        } else if (properties.f66069OooO0OO) {
            setFlexDirection(1);
        } else {
            setFlexDirection(0);
        }
        setFlexWrap(1);
        setAlignItems(4);
        this.mContext = context;
    }
}
