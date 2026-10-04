package com.google.android.flexbox;

import OooO0O0.OooO00o;
import OooO0Oo.C20398OooO0O0;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.widget.CompoundButtonCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
class FlexboxHelper {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int INITIAL_CAPACITY = 10;
    private static final long MEASURE_SPEC_WIDTH_MASK = 4294967295L;
    private boolean[] mChildrenFrozen;
    private final FlexContainer mFlexContainer;
    int[] mIndexToFlexLine;
    long[] mMeasureSpecCache;
    private long[] mMeasuredSizeCache;

    public static class FlexLinesResult {
        int mChildState;
        List<FlexLine> mFlexLines;

        public void reset() {
            this.mFlexLines = null;
            this.mChildState = 0;
        }
    }

    public static class Order implements Comparable<Order> {
        int index;
        int order;

        private Order() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Order{order=");
            sb.append(this.order);
            sb.append(", index=");
            return C20398OooO0O0.OooO00o('}', sb, this.index);
        }

        @Override // java.lang.Comparable
        public int compareTo(Order order) {
            int i = this.order;
            int i2 = order.order;
            return i != i2 ? i - i2 : this.index - order.index;
        }
    }

    public FlexboxHelper(FlexContainer flexContainer) {
        this.mFlexContainer = flexContainer;
    }

    private void addFlexLine(List<FlexLine> list, FlexLine flexLine, int i, int i2) {
        flexLine.mSumCrossSizeBefore = i2;
        this.mFlexContainer.onNewFlexLineAdded(flexLine);
        flexLine.mLastIndex = i;
        list.add(flexLine);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void checkSizeConstraints(View view, int i) {
        boolean z;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth < flexItem.getMinWidth()) {
            measuredWidth = flexItem.getMinWidth();
        } else {
            if (measuredWidth <= flexItem.getMaxWidth()) {
                z = false;
                if (measuredHeight >= flexItem.getMinHeight()) {
                    measuredHeight = flexItem.getMinHeight();
                } else if (measuredHeight > flexItem.getMaxHeight()) {
                    measuredHeight = flexItem.getMaxHeight();
                } else {
                    z2 = z;
                }
                if (z2) {
                    return;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                updateMeasureCache(i, iMakeMeasureSpec, iMakeMeasureSpec2, view);
                this.mFlexContainer.updateViewCache(i, view);
                return;
            }
            measuredWidth = flexItem.getMaxWidth();
        }
        z = true;
        if (measuredHeight >= flexItem.getMinHeight()) {
        }
        if (z2) {
        }
    }

    private List<FlexLine> constructFlexLinesForAlignContentCenter(List<FlexLine> list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        FlexLine flexLine = new FlexLine();
        flexLine.mCrossSize = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(flexLine);
            }
            arrayList.add(list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(flexLine);
            }
        }
        return arrayList;
    }

    private List<Order> createOrders(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            FlexItem flexItem = (FlexItem) this.mFlexContainer.getFlexItemAt(i2).getLayoutParams();
            Order order = new Order();
            order.order = flexItem.getOrder();
            order.index = i2;
            arrayList.add(order);
        }
        return arrayList;
    }

    private void ensureChildrenFrozen(int i) {
        boolean[] zArr = this.mChildrenFrozen;
        if (zArr == null) {
            this.mChildrenFrozen = new boolean[Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.mChildrenFrozen = new boolean[Math.max(zArr.length * 2, i)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    private void evaluateMinimumSizeForCompoundButton(CompoundButton compoundButton) {
        FlexItem flexItem = (FlexItem) compoundButton.getLayoutParams();
        int minWidth = flexItem.getMinWidth();
        int minHeight = flexItem.getMinHeight();
        Drawable buttonDrawable = CompoundButtonCompat.getButtonDrawable(compoundButton);
        int minimumWidth = buttonDrawable == null ? 0 : buttonDrawable.getMinimumWidth();
        int minimumHeight = buttonDrawable != null ? buttonDrawable.getMinimumHeight() : 0;
        if (minWidth == -1) {
            minWidth = minimumWidth;
        }
        flexItem.setMinWidth(minWidth);
        if (minHeight == -1) {
            minHeight = minimumHeight;
        }
        flexItem.setMinHeight(minHeight);
    }

    private void expandFlexItems(int i, int i2, FlexLine flexLine, int i3, int i4, boolean z) {
        int i5;
        float f;
        float f2;
        int iMax;
        double d;
        double d2;
        float f3 = flexLine.mTotalFlexGrow;
        float f4 = 0.0f;
        if (f3 <= 0.0f || i3 < (i5 = flexLine.mMainSize)) {
            return;
        }
        float f5 = (i3 - i5) / f3;
        flexLine.mMainSize = i4 + flexLine.mDividerLengthInMainSize;
        if (!z) {
            flexLine.mCrossSize = Integer.MIN_VALUE;
        }
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        float f6 = 0.0f;
        while (i6 < flexLine.mItemCount) {
            int i8 = flexLine.mFirstIndex + i6;
            View reorderedFlexItemAt = this.mFlexContainer.getReorderedFlexItemAt(i8);
            if (reorderedFlexItemAt == null || reorderedFlexItemAt.getVisibility() == 8) {
                f = f4;
                f2 = f5;
                z2 = z2;
            } else {
                FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                int flexDirection = this.mFlexContainer.getFlexDirection();
                f = f4;
                if (flexDirection == 0 || flexDirection == 1) {
                    f2 = f5;
                    boolean z3 = z2;
                    int measuredWidth = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr = this.mMeasuredSizeCache;
                    if (jArr != null) {
                        measuredWidth = extractLowerInt(jArr[i8]);
                    }
                    int measuredHeight = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr2 = this.mMeasuredSizeCache;
                    if (jArr2 != null) {
                        measuredHeight = extractHigherInt(jArr2[i8]);
                    }
                    if (this.mChildrenFrozen[i8] || flexItem.getFlexGrow() <= f) {
                        z2 = z3;
                    } else {
                        float flexGrow = (flexItem.getFlexGrow() * f2) + measuredWidth;
                        if (i6 == flexLine.mItemCount - 1) {
                            flexGrow += f6;
                            f6 = f;
                        }
                        int iRound = Math.round(flexGrow);
                        if (iRound > flexItem.getMaxWidth()) {
                            iRound = flexItem.getMaxWidth();
                            this.mChildrenFrozen[i8] = true;
                            flexLine.mTotalFlexGrow -= flexItem.getFlexGrow();
                            z2 = true;
                        } else {
                            float f7 = (flexGrow - iRound) + f6;
                            double d3 = f7;
                            if (d3 > 1.0d) {
                                iRound++;
                                d = d3 - 1.0d;
                            } else {
                                if (d3 < -1.0d) {
                                    iRound--;
                                    d = d3 + 1.0d;
                                }
                                f6 = f7;
                                z2 = z3;
                            }
                            f7 = (float) d;
                            f6 = f7;
                            z2 = z3;
                        }
                        int childHeightMeasureSpecInternal = getChildHeightMeasureSpecInternal(i2, flexItem, flexLine.mSumCrossSizeBefore);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        reorderedFlexItemAt.measure(iMakeMeasureSpec, childHeightMeasureSpecInternal);
                        int measuredWidth2 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight2 = reorderedFlexItemAt.getMeasuredHeight();
                        updateMeasureCache(i8, iMakeMeasureSpec, childHeightMeasureSpecInternal, reorderedFlexItemAt);
                        this.mFlexContainer.updateViewCache(i8, reorderedFlexItemAt);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, measuredHeight + flexItem.getMarginTop() + flexItem.getMarginBottom() + this.mFlexContainer.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.mMainSize = measuredWidth + flexItem.getMarginLeft() + flexItem.getMarginRight() + flexLine.mMainSize;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr3 = this.mMeasuredSizeCache;
                    if (jArr3 != null) {
                        measuredHeight3 = extractHigherInt(jArr3[i8]);
                    }
                    int measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr4 = this.mMeasuredSizeCache;
                    f2 = f5;
                    boolean z4 = z2;
                    if (jArr4 != null) {
                        measuredWidth3 = extractLowerInt(jArr4[i8]);
                    }
                    if (this.mChildrenFrozen[i8] || flexItem.getFlexGrow() <= f) {
                        z2 = z4;
                    } else {
                        float flexGrow2 = (flexItem.getFlexGrow() * f2) + measuredHeight3;
                        if (i6 == flexLine.mItemCount - 1) {
                            flexGrow2 += f6;
                            f6 = f;
                        }
                        int iRound2 = Math.round(flexGrow2);
                        if (iRound2 > flexItem.getMaxHeight()) {
                            iRound2 = flexItem.getMaxHeight();
                            this.mChildrenFrozen[i8] = true;
                            flexLine.mTotalFlexGrow -= flexItem.getFlexGrow();
                            z2 = true;
                        } else {
                            float f8 = (flexGrow2 - iRound2) + f6;
                            double d4 = f8;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d2 = d4 - 1.0d;
                            } else {
                                if (d4 < -1.0d) {
                                    iRound2--;
                                    d2 = d4 + 1.0d;
                                }
                                f6 = f8;
                                z2 = z4;
                            }
                            f8 = (float) d2;
                            f6 = f8;
                            z2 = z4;
                        }
                        int childWidthMeasureSpecInternal = getChildWidthMeasureSpecInternal(i, flexItem, flexLine.mSumCrossSizeBefore);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        reorderedFlexItemAt.measure(childWidthMeasureSpecInternal, iMakeMeasureSpec2);
                        int measuredWidth4 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight4 = reorderedFlexItemAt.getMeasuredHeight();
                        updateMeasureCache(i8, childWidthMeasureSpecInternal, iMakeMeasureSpec2, reorderedFlexItemAt);
                        this.mFlexContainer.updateViewCache(i8, reorderedFlexItemAt);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, measuredWidth3 + flexItem.getMarginLeft() + flexItem.getMarginRight() + this.mFlexContainer.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.mMainSize = measuredHeight3 + flexItem.getMarginTop() + flexItem.getMarginBottom() + flexLine.mMainSize;
                }
                flexLine.mCrossSize = Math.max(flexLine.mCrossSize, iMax);
                i7 = iMax;
            }
            i6++;
            f5 = f2;
            f4 = f;
        }
        if (!z2 || i5 == flexLine.mMainSize) {
            return;
        }
        expandFlexItems(i, i2, flexLine, i3, i4, true);
    }

    private int getChildHeightMeasureSpecInternal(int i, FlexItem flexItem, int i2) {
        FlexContainer flexContainer = this.mFlexContainer;
        int childHeightMeasureSpec = flexContainer.getChildHeightMeasureSpec(i, flexContainer.getPaddingTop() + this.mFlexContainer.getPaddingBottom() + flexItem.getMarginTop() + flexItem.getMarginBottom() + i2, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(childHeightMeasureSpec);
        return size > flexItem.getMaxHeight() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMaxHeight(), View.MeasureSpec.getMode(childHeightMeasureSpec)) : size < flexItem.getMinHeight() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMinHeight(), View.MeasureSpec.getMode(childHeightMeasureSpec)) : childHeightMeasureSpec;
    }

    private int getChildWidthMeasureSpecInternal(int i, FlexItem flexItem, int i2) {
        FlexContainer flexContainer = this.mFlexContainer;
        int childWidthMeasureSpec = flexContainer.getChildWidthMeasureSpec(i, flexContainer.getPaddingLeft() + this.mFlexContainer.getPaddingRight() + flexItem.getMarginLeft() + flexItem.getMarginRight() + i2, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(childWidthMeasureSpec);
        return size > flexItem.getMaxWidth() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMaxWidth(), View.MeasureSpec.getMode(childWidthMeasureSpec)) : size < flexItem.getMinWidth() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMinWidth(), View.MeasureSpec.getMode(childWidthMeasureSpec)) : childWidthMeasureSpec;
    }

    private int getFlexItemMarginEndCross(FlexItem flexItem, boolean z) {
        return z ? flexItem.getMarginBottom() : flexItem.getMarginRight();
    }

    private int getFlexItemMarginEndMain(FlexItem flexItem, boolean z) {
        return z ? flexItem.getMarginRight() : flexItem.getMarginBottom();
    }

    private int getFlexItemMarginStartCross(FlexItem flexItem, boolean z) {
        return z ? flexItem.getMarginTop() : flexItem.getMarginLeft();
    }

    private int getFlexItemMarginStartMain(FlexItem flexItem, boolean z) {
        return z ? flexItem.getMarginLeft() : flexItem.getMarginTop();
    }

    private int getFlexItemSizeCross(FlexItem flexItem, boolean z) {
        return z ? flexItem.getHeight() : flexItem.getWidth();
    }

    private int getFlexItemSizeMain(FlexItem flexItem, boolean z) {
        return z ? flexItem.getWidth() : flexItem.getHeight();
    }

    private int getPaddingEndCross(boolean z) {
        return z ? this.mFlexContainer.getPaddingBottom() : this.mFlexContainer.getPaddingEnd();
    }

    private int getPaddingEndMain(boolean z) {
        return z ? this.mFlexContainer.getPaddingEnd() : this.mFlexContainer.getPaddingBottom();
    }

    private int getPaddingStartCross(boolean z) {
        return z ? this.mFlexContainer.getPaddingTop() : this.mFlexContainer.getPaddingStart();
    }

    private int getPaddingStartMain(boolean z) {
        return z ? this.mFlexContainer.getPaddingStart() : this.mFlexContainer.getPaddingTop();
    }

    private int getViewMeasuredSizeCross(View view, boolean z) {
        return z ? view.getMeasuredHeight() : view.getMeasuredWidth();
    }

    private int getViewMeasuredSizeMain(View view, boolean z) {
        return z ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private boolean isLastFlexItem(int i, int i2, FlexLine flexLine) {
        return i == i2 - 1 && flexLine.getItemCountNotGone() != 0;
    }

    private boolean isWrapRequired(View view, int i, int i2, int i3, int i4, FlexItem flexItem, int i5, int i6, int i7) {
        if (this.mFlexContainer.getFlexWrap() == 0) {
            return false;
        }
        if (flexItem.isWrapBefore()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.mFlexContainer.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int decorationLengthMainAxis = this.mFlexContainer.getDecorationLengthMainAxis(view, i5, i6);
        if (decorationLengthMainAxis > 0) {
            i4 += decorationLengthMainAxis;
        }
        return i2 < i3 + i4;
    }

    private void shrinkFlexItems(int i, int i2, FlexLine flexLine, int i3, int i4, boolean z) {
        float f;
        float f2;
        int iMax;
        int minWidth;
        int i5 = flexLine.mMainSize;
        float f3 = flexLine.mTotalFlexShrink;
        float f4 = 0.0f;
        if (f3 <= 0.0f || i3 > i5) {
            return;
        }
        float f5 = (i5 - i3) / f3;
        flexLine.mMainSize = i4 + flexLine.mDividerLengthInMainSize;
        if (!z) {
            flexLine.mCrossSize = Integer.MIN_VALUE;
        }
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        float f6 = 0.0f;
        while (i6 < flexLine.mItemCount) {
            int i8 = flexLine.mFirstIndex + i6;
            View reorderedFlexItemAt = this.mFlexContainer.getReorderedFlexItemAt(i8);
            if (reorderedFlexItemAt == null || reorderedFlexItemAt.getVisibility() == 8) {
                f = f4;
                f2 = f5;
            } else {
                FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                int flexDirection = this.mFlexContainer.getFlexDirection();
                f = f4;
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr = this.mMeasuredSizeCache;
                    if (jArr != null) {
                        measuredWidth = extractLowerInt(jArr[i8]);
                    }
                    int measuredHeight = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr2 = this.mMeasuredSizeCache;
                    f2 = f5;
                    if (jArr2 != null) {
                        measuredHeight = extractHigherInt(jArr2[i8]);
                    }
                    if (!this.mChildrenFrozen[i8] && flexItem.getFlexShrink() > f) {
                        float flexShrink = measuredWidth - (f2 * flexItem.getFlexShrink());
                        if (i6 == flexLine.mItemCount - 1) {
                            flexShrink += f6;
                            f6 = f;
                        }
                        int iRound = Math.round(flexShrink);
                        if (iRound < flexItem.getMinWidth()) {
                            minWidth = flexItem.getMinWidth();
                            this.mChildrenFrozen[i8] = true;
                            flexLine.mTotalFlexShrink -= flexItem.getFlexShrink();
                            z2 = true;
                        } else {
                            float f7 = (flexShrink - iRound) + f6;
                            double d = f7;
                            if (d > 1.0d) {
                                minWidth = iRound + 1;
                                f7 -= 1.0f;
                            } else if (d < -1.0d) {
                                minWidth = iRound - 1;
                                f7 += 1.0f;
                            } else {
                                minWidth = iRound;
                            }
                            f6 = f7;
                        }
                        int childHeightMeasureSpecInternal = getChildHeightMeasureSpecInternal(i2, flexItem, flexLine.mSumCrossSizeBefore);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(minWidth, 1073741824);
                        reorderedFlexItemAt.measure(iMakeMeasureSpec, childHeightMeasureSpecInternal);
                        int measuredWidth2 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight2 = reorderedFlexItemAt.getMeasuredHeight();
                        updateMeasureCache(i8, iMakeMeasureSpec, childHeightMeasureSpecInternal, reorderedFlexItemAt);
                        this.mFlexContainer.updateViewCache(i8, reorderedFlexItemAt);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, measuredHeight + flexItem.getMarginTop() + flexItem.getMarginBottom() + this.mFlexContainer.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.mMainSize = measuredWidth + flexItem.getMarginLeft() + flexItem.getMarginRight() + flexLine.mMainSize;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr3 = this.mMeasuredSizeCache;
                    if (jArr3 != null) {
                        measuredHeight3 = extractHigherInt(jArr3[i8]);
                    }
                    int measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr4 = this.mMeasuredSizeCache;
                    if (jArr4 != null) {
                        measuredWidth3 = extractLowerInt(jArr4[i8]);
                    }
                    if (!this.mChildrenFrozen[i8] && flexItem.getFlexShrink() > f) {
                        float flexShrink2 = measuredHeight3 - (flexItem.getFlexShrink() * f5);
                        if (i6 == flexLine.mItemCount - 1) {
                            flexShrink2 += f6;
                            f6 = f;
                        }
                        int iRound2 = Math.round(flexShrink2);
                        if (iRound2 < flexItem.getMinHeight()) {
                            iRound2 = flexItem.getMinHeight();
                            this.mChildrenFrozen[i8] = true;
                            flexLine.mTotalFlexShrink -= flexItem.getFlexShrink();
                            z2 = true;
                        } else {
                            float f8 = (flexShrink2 - iRound2) + f6;
                            double d2 = f8;
                            if (d2 > 1.0d) {
                                iRound2++;
                                f8 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iRound2--;
                                f8 += 1.0f;
                            }
                            f6 = f8;
                        }
                        int childWidthMeasureSpecInternal = getChildWidthMeasureSpecInternal(i, flexItem, flexLine.mSumCrossSizeBefore);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        reorderedFlexItemAt.measure(childWidthMeasureSpecInternal, iMakeMeasureSpec2);
                        int measuredWidth4 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight4 = reorderedFlexItemAt.getMeasuredHeight();
                        updateMeasureCache(i8, childWidthMeasureSpecInternal, iMakeMeasureSpec2, reorderedFlexItemAt);
                        this.mFlexContainer.updateViewCache(i8, reorderedFlexItemAt);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, measuredWidth3 + flexItem.getMarginLeft() + flexItem.getMarginRight() + this.mFlexContainer.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.mMainSize = measuredHeight3 + flexItem.getMarginTop() + flexItem.getMarginBottom() + flexLine.mMainSize;
                    f2 = f5;
                }
                flexLine.mCrossSize = Math.max(flexLine.mCrossSize, iMax);
                i7 = iMax;
            }
            i6++;
            f5 = f2;
            f4 = f;
        }
        if (!z2 || i5 == flexLine.mMainSize) {
            return;
        }
        shrinkFlexItems(i, i2, flexLine, i3, i4, true);
    }

    private int[] sortOrdersIntoReorderedIndices(int i, List<Order> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (Order order : list) {
            int i3 = order.index;
            iArr[i2] = i3;
            sparseIntArray.append(i3, order.order);
            i2++;
        }
        return iArr;
    }

    private void stretchViewHorizontally(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - flexItem.getMarginLeft()) - flexItem.getMarginRight()) - this.mFlexContainer.getDecorationLengthCrossAxis(view), flexItem.getMinWidth()), flexItem.getMaxWidth());
        long[] jArr = this.mMeasuredSizeCache;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? extractHigherInt(jArr[i2]) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        updateMeasureCache(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        this.mFlexContainer.updateViewCache(i2, view);
    }

    private void stretchViewVertically(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - flexItem.getMarginTop()) - flexItem.getMarginBottom()) - this.mFlexContainer.getDecorationLengthCrossAxis(view), flexItem.getMinHeight()), flexItem.getMaxHeight());
        long[] jArr = this.mMeasuredSizeCache;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? extractLowerInt(jArr[i2]) : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        updateMeasureCache(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        this.mFlexContainer.updateViewCache(i2, view);
    }

    private void updateMeasureCache(int i, int i2, int i3, View view) {
        long[] jArr = this.mMeasureSpecCache;
        if (jArr != null) {
            jArr[i] = makeCombinedLong(i2, i3);
        }
        long[] jArr2 = this.mMeasuredSizeCache;
        if (jArr2 != null) {
            jArr2[i] = makeCombinedLong(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void calculateFlexLines(FlexLinesResult flexLinesResult, int i, int i2, int i3, int i4, int i5, List<FlexLine> list) {
        int i6;
        FlexLinesResult flexLinesResult2;
        boolean z;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int childWidthMeasureSpec;
        int i12;
        int i13;
        FlexLine flexLine;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = i;
        boolean zIsMainAxisDirectionHorizontal = this.mFlexContainer.isMainAxisDirectionHorizontal();
        int mode = View.MeasureSpec.getMode(i19);
        int size = View.MeasureSpec.getSize(i19);
        List<FlexLine> arrayList = list == null ? new ArrayList() : list;
        flexLinesResult.mFlexLines = arrayList;
        boolean z2 = i5 == -1;
        int paddingStartMain = getPaddingStartMain(zIsMainAxisDirectionHorizontal);
        int paddingEndMain = getPaddingEndMain(zIsMainAxisDirectionHorizontal);
        int paddingStartCross = getPaddingStartCross(zIsMainAxisDirectionHorizontal);
        int paddingEndCross = getPaddingEndCross(zIsMainAxisDirectionHorizontal);
        FlexLine flexLine2 = new FlexLine();
        int i20 = i4;
        flexLine2.mFirstIndex = i20;
        int i21 = paddingStartMain + paddingEndMain;
        flexLine2.mMainSize = i21;
        int flexItemCount = this.mFlexContainer.getFlexItemCount();
        boolean z3 = z2;
        FlexLine flexLine3 = flexLine2;
        int i22 = Integer.MIN_VALUE;
        int i23 = 0;
        int iCombineMeasuredStates = 0;
        int i24 = 0;
        while (true) {
            if (i20 >= flexItemCount) {
                i6 = iCombineMeasuredStates;
                flexLinesResult2 = flexLinesResult;
                break;
            }
            View reorderedFlexItemAt = this.mFlexContainer.getReorderedFlexItemAt(i20);
            if (reorderedFlexItemAt != null) {
                z = true;
                i7 = i21;
                if (reorderedFlexItemAt.getVisibility() != 8) {
                    if (reorderedFlexItemAt instanceof CompoundButton) {
                        evaluateMinimumSizeForCompoundButton((CompoundButton) reorderedFlexItemAt);
                    }
                    FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                    int i25 = flexItemCount;
                    if (flexItem.getAlignSelf() == 4) {
                        flexLine3.mIndicesAlignSelfStretch.add(Integer.valueOf(i20));
                    }
                    int flexItemSizeMain = getFlexItemSizeMain(flexItem, zIsMainAxisDirectionHorizontal);
                    if (flexItem.getFlexBasisPercent() != -1.0f && mode == 1073741824) {
                        flexItemSizeMain = Math.round(size * flexItem.getFlexBasisPercent());
                    }
                    if (zIsMainAxisDirectionHorizontal) {
                        i9 = mode;
                        childWidthMeasureSpec = this.mFlexContainer.getChildWidthMeasureSpec(i19, i7 + getFlexItemMarginStartMain(flexItem, true) + getFlexItemMarginEndMain(flexItem, true), flexItemSizeMain);
                        i8 = size;
                        i10 = i23;
                        int childHeightMeasureSpec = this.mFlexContainer.getChildHeightMeasureSpec(i2, paddingStartCross + paddingEndCross + getFlexItemMarginStartCross(flexItem, true) + getFlexItemMarginEndCross(flexItem, true) + i23, getFlexItemSizeCross(flexItem, true));
                        reorderedFlexItemAt.measure(childWidthMeasureSpec, childHeightMeasureSpec);
                        updateMeasureCache(i20, childWidthMeasureSpec, childHeightMeasureSpec, reorderedFlexItemAt);
                        i11 = 0;
                    } else {
                        i8 = size;
                        i9 = mode;
                        i10 = i23;
                        i11 = 0;
                        int childWidthMeasureSpec2 = this.mFlexContainer.getChildWidthMeasureSpec(i2, paddingStartCross + paddingEndCross + getFlexItemMarginStartCross(flexItem, false) + getFlexItemMarginEndCross(flexItem, false) + i10, getFlexItemSizeCross(flexItem, false));
                        int childHeightMeasureSpec2 = this.mFlexContainer.getChildHeightMeasureSpec(i19, i7 + getFlexItemMarginStartMain(flexItem, false) + getFlexItemMarginEndMain(flexItem, false), flexItemSizeMain);
                        reorderedFlexItemAt.measure(childWidthMeasureSpec2, childHeightMeasureSpec2);
                        updateMeasureCache(i20, childWidthMeasureSpec2, childHeightMeasureSpec2, reorderedFlexItemAt);
                        childWidthMeasureSpec = childHeightMeasureSpec2;
                    }
                    this.mFlexContainer.updateViewCache(i20, reorderedFlexItemAt);
                    checkSizeConstraints(reorderedFlexItemAt, i20);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, reorderedFlexItemAt.getMeasuredState());
                    int i26 = i11;
                    i12 = i20;
                    int i27 = childWidthMeasureSpec;
                    FlexLine flexLine4 = flexLine3;
                    int i28 = i24;
                    i13 = i10;
                    size = i8;
                    if (isWrapRequired(reorderedFlexItemAt, i9, size, flexLine3.mMainSize, getViewMeasuredSizeMain(reorderedFlexItemAt, zIsMainAxisDirectionHorizontal) + getFlexItemMarginStartMain(flexItem, zIsMainAxisDirectionHorizontal) + getFlexItemMarginEndMain(flexItem, zIsMainAxisDirectionHorizontal), flexItem, i12, i28, arrayList.size())) {
                        if (flexLine4.getItemCountNotGone() > 0) {
                            addFlexLine(arrayList, flexLine4, i12 > 0 ? i12 - 1 : i26, i13);
                            i18 = i13 + flexLine4.mCrossSize;
                        } else {
                            i18 = i13;
                        }
                        if (zIsMainAxisDirectionHorizontal) {
                            if (flexItem.getHeight() == -1) {
                                FlexContainer flexContainer = this.mFlexContainer;
                                reorderedFlexItemAt.measure(i27, flexContainer.getChildHeightMeasureSpec(i2, flexContainer.getPaddingTop() + this.mFlexContainer.getPaddingBottom() + flexItem.getMarginTop() + flexItem.getMarginBottom() + i18, flexItem.getHeight()));
                                checkSizeConstraints(reorderedFlexItemAt, i12);
                            }
                        } else if (flexItem.getWidth() == -1) {
                            FlexContainer flexContainer2 = this.mFlexContainer;
                            reorderedFlexItemAt.measure(flexContainer2.getChildWidthMeasureSpec(i2, flexContainer2.getPaddingLeft() + this.mFlexContainer.getPaddingRight() + flexItem.getMarginLeft() + flexItem.getMarginRight() + i18, flexItem.getWidth()), i27);
                            checkSizeConstraints(reorderedFlexItemAt, i12);
                        }
                        FlexLine flexLine5 = new FlexLine();
                        flexLine5.mItemCount = 1;
                        i14 = i7;
                        flexLine5.mMainSize = i14;
                        flexLine5.mFirstIndex = i12;
                        i13 = i18;
                        i16 = Integer.MIN_VALUE;
                        flexLine = flexLine5;
                        i15 = i26;
                    } else {
                        flexLine = flexLine4;
                        i14 = i7;
                        flexLine.mItemCount++;
                        i15 = i28 + 1;
                        i16 = i22;
                    }
                    flexLine.mAnyItemsHaveFlexGrow = (flexLine.mAnyItemsHaveFlexGrow ? 1 : 0) | (flexItem.getFlexGrow() != 0.0f ? 1 : i26);
                    flexLine.mAnyItemsHaveFlexShrink = (flexLine.mAnyItemsHaveFlexShrink ? 1 : 0) | (flexItem.getFlexShrink() != 0.0f ? 1 : i26);
                    int[] iArr = this.mIndexToFlexLine;
                    if (iArr != null) {
                        iArr[i12] = arrayList.size();
                    }
                    flexLine.mMainSize = getViewMeasuredSizeMain(reorderedFlexItemAt, zIsMainAxisDirectionHorizontal) + getFlexItemMarginStartMain(flexItem, zIsMainAxisDirectionHorizontal) + getFlexItemMarginEndMain(flexItem, zIsMainAxisDirectionHorizontal) + flexLine.mMainSize;
                    flexLine.mTotalFlexGrow += flexItem.getFlexGrow();
                    flexLine.mTotalFlexShrink += flexItem.getFlexShrink();
                    this.mFlexContainer.onNewFlexItemAdded(reorderedFlexItemAt, i12, i15, flexLine);
                    int iMax = Math.max(i16, getViewMeasuredSizeCross(reorderedFlexItemAt, zIsMainAxisDirectionHorizontal) + getFlexItemMarginStartCross(flexItem, zIsMainAxisDirectionHorizontal) + getFlexItemMarginEndCross(flexItem, zIsMainAxisDirectionHorizontal) + this.mFlexContainer.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.mCrossSize = Math.max(flexLine.mCrossSize, iMax);
                    if (zIsMainAxisDirectionHorizontal) {
                        if (this.mFlexContainer.getFlexWrap() != 2) {
                            flexLine.mMaxBaseline = Math.max(flexLine.mMaxBaseline, reorderedFlexItemAt.getBaseline() + flexItem.getMarginTop());
                        } else {
                            flexLine.mMaxBaseline = Math.max(flexLine.mMaxBaseline, (reorderedFlexItemAt.getMeasuredHeight() - reorderedFlexItemAt.getBaseline()) + flexItem.getMarginBottom());
                        }
                    }
                    i17 = i25;
                    if (isLastFlexItem(i12, i17, flexLine)) {
                        addFlexLine(arrayList, flexLine, i12, i13);
                        i13 += flexLine.mCrossSize;
                    }
                    if (i5 != -1 && arrayList.size() > 0) {
                        if (((FlexLine) OooO00o.OooO00o(1, arrayList)).mLastIndex >= i5 && i12 >= i5 && !z3) {
                            i13 = -flexLine.getCrossSize();
                            z3 = true;
                        }
                    }
                    if (i13 > i3 && z3) {
                        flexLinesResult2 = flexLinesResult;
                        i6 = iCombineMeasuredStates;
                        break;
                    }
                    i24 = i15;
                    i22 = iMax;
                    flexItemCount = i17;
                    i20 = i12 + 1;
                    i21 = i14;
                    flexLine3 = flexLine;
                    i23 = i13;
                    mode = i9;
                    i19 = i;
                } else {
                    flexLine3.mGoneItemCount++;
                    flexLine3.mItemCount++;
                    if (isLastFlexItem(i20, flexItemCount, flexLine3)) {
                        addFlexLine(arrayList, flexLine3, i20, i23);
                    }
                }
            } else {
                if (isLastFlexItem(i20, flexItemCount, flexLine3)) {
                    addFlexLine(arrayList, flexLine3, i20, i23);
                }
                i7 = i21;
                z = true;
            }
            i12 = i20;
            i9 = mode;
            i17 = flexItemCount;
            i13 = i23;
            i14 = i7;
            flexLine = flexLine3;
            flexItemCount = i17;
            i20 = i12 + 1;
            i21 = i14;
            flexLine3 = flexLine;
            i23 = i13;
            mode = i9;
            i19 = i;
        }
        flexLinesResult2.mChildState = i6;
    }

    public void calculateHorizontalFlexLines(FlexLinesResult flexLinesResult, int i, int i2) {
        calculateFlexLines(flexLinesResult, i, i2, Integer.MAX_VALUE, 0, -1, null);
    }

    public void calculateHorizontalFlexLinesToIndex(FlexLinesResult flexLinesResult, int i, int i2, int i3, int i4, List<FlexLine> list) {
        calculateFlexLines(flexLinesResult, i, i2, i3, 0, i4, list);
    }

    public void calculateVerticalFlexLines(FlexLinesResult flexLinesResult, int i, int i2) {
        calculateFlexLines(flexLinesResult, i2, i, Integer.MAX_VALUE, 0, -1, null);
    }

    public void calculateVerticalFlexLinesToIndex(FlexLinesResult flexLinesResult, int i, int i2, int i3, int i4, List<FlexLine> list) {
        calculateFlexLines(flexLinesResult, i2, i, i3, 0, i4, list);
    }

    public void clearFlexLines(List<FlexLine> list, int i) {
        int i2 = this.mIndexToFlexLine[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.mIndexToFlexLine;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.mMeasureSpecCache;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] createReorderedIndices(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.mFlexContainer.getFlexItemCount();
        List<Order> listCreateOrders = createOrders(flexItemCount);
        Order order = new Order();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            order.order = 1;
        } else {
            order.order = ((FlexItem) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount || i >= this.mFlexContainer.getFlexItemCount()) {
            order.index = flexItemCount;
        } else {
            order.index = i;
            while (i < flexItemCount) {
                listCreateOrders.get(i).index++;
                i++;
            }
        }
        listCreateOrders.add(order);
        return sortOrdersIntoReorderedIndices(flexItemCount + 1, listCreateOrders, sparseIntArray);
    }

    public void determineCrossSize(int i, int i2, int i3) {
        int mode;
        int size;
        int flexDirection = this.mFlexContainer.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            mode = mode2;
            size = size2;
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(flexDirection, "Invalid flex direction: "));
            }
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        }
        List<FlexLine> flexLinesInternal = this.mFlexContainer.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.mFlexContainer.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).mCrossSize = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.mFlexContainer.getAlignContent();
                if (alignContent == 1) {
                    int i5 = size - sumOfCrossSize;
                    FlexLine flexLine = new FlexLine();
                    flexLine.mCrossSize = i5;
                    flexLinesInternal.add(0, flexLine);
                    return;
                }
                if (alignContent == 2) {
                    this.mFlexContainer.setFlexLines(constructFlexLinesForAlignContentCenter(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size4 = flexLinesInternal.size();
                    float f = 0.0f;
                    while (i4 < size4) {
                        arrayList.add(flexLinesInternal.get(i4));
                        if (i4 != flexLinesInternal.size() - 1) {
                            FlexLine flexLine2 = new FlexLine();
                            if (i4 == flexLinesInternal.size() - 2) {
                                flexLine2.mCrossSize = Math.round(f + size3);
                                f = 0.0f;
                            } else {
                                flexLine2.mCrossSize = Math.round(size3);
                            }
                            int i6 = flexLine2.mCrossSize;
                            float f2 = (size3 - i6) + f;
                            if (f2 > 1.0f) {
                                flexLine2.mCrossSize = i6 + 1;
                                f2 -= 1.0f;
                            } else if (f2 < -1.0f) {
                                flexLine2.mCrossSize = i6 - 1;
                                f2 += 1.0f;
                            }
                            f = f2;
                            arrayList.add(flexLine2);
                        }
                        i4++;
                    }
                    this.mFlexContainer.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.mFlexContainer.setFlexLines(constructFlexLinesForAlignContentCenter(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    FlexLine flexLine3 = new FlexLine();
                    flexLine3.mCrossSize = size5;
                    for (FlexLine flexLine4 : flexLinesInternal) {
                        arrayList2.add(flexLine3);
                        arrayList2.add(flexLine4);
                        arrayList2.add(flexLine3);
                    }
                    this.mFlexContainer.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i4 < size7) {
                        FlexLine flexLine5 = flexLinesInternal.get(i4);
                        float f4 = flexLine5.mCrossSize + size6;
                        if (i4 == flexLinesInternal.size() - 1) {
                            f4 += f3;
                            f3 = 0.0f;
                        }
                        int iRound = Math.round(f4);
                        float f5 = (f4 - iRound) + f3;
                        if (f5 > 1.0f) {
                            iRound++;
                            f5 -= 1.0f;
                        } else if (f5 < -1.0f) {
                            iRound--;
                            f5 += 1.0f;
                        }
                        f3 = f5;
                        flexLine5.mCrossSize = iRound;
                        i4++;
                    }
                }
            }
        }
    }

    public void determineMainSize(int i, int i2) {
        determineMainSize(i, i2, 0);
    }

    public void ensureIndexToFlexLine(int i) {
        int[] iArr = this.mIndexToFlexLine;
        if (iArr == null) {
            this.mIndexToFlexLine = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.mIndexToFlexLine = Arrays.copyOf(this.mIndexToFlexLine, Math.max(iArr.length * 2, i));
        }
    }

    public void ensureMeasureSpecCache(int i) {
        long[] jArr = this.mMeasureSpecCache;
        if (jArr == null) {
            this.mMeasureSpecCache = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.mMeasureSpecCache = Arrays.copyOf(this.mMeasureSpecCache, Math.max(jArr.length * 2, i));
        }
    }

    public void ensureMeasuredSizeCache(int i) {
        long[] jArr = this.mMeasuredSizeCache;
        if (jArr == null) {
            this.mMeasuredSizeCache = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.mMeasuredSizeCache = Arrays.copyOf(this.mMeasuredSizeCache, Math.max(jArr.length * 2, i));
        }
    }

    public int extractHigherInt(long j) {
        return (int) (j >> 32);
    }

    public int extractLowerInt(long j) {
        return (int) j;
    }

    public boolean isOrderChangedFromLastMeasurement(SparseIntArray sparseIntArray) {
        int flexItemCount = this.mFlexContainer.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View flexItemAt = this.mFlexContainer.getFlexItemAt(i);
            if (flexItemAt != null && ((FlexItem) flexItemAt.getLayoutParams()).getOrder() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    public void layoutSingleChildHorizontal(View view, FlexLine flexLine, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.mFlexContainer.getAlignItems();
        if (flexItem.getAlignSelf() != -1) {
            alignItems = flexItem.getAlignSelf();
        }
        int i5 = flexLine.mCrossSize;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.mFlexContainer.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - flexItem.getMarginBottom(), i3, i6 - flexItem.getMarginBottom());
                    return;
                } else {
                    view.layout(i, view.getMeasuredHeight() + (i2 - i5) + flexItem.getMarginTop(), i3, view.getMeasuredHeight() + (i4 - i5) + flexItem.getMarginTop());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.getMarginTop()) - flexItem.getMarginBottom()) / 2;
                if (this.mFlexContainer.getFlexWrap() != 2) {
                    int i7 = i2 + measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - measuredHeight;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.mFlexContainer.getFlexWrap() != 2) {
                    int iMax = Math.max(flexLine.mMaxBaseline - view.getBaseline(), flexItem.getMarginTop());
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (flexLine.mMaxBaseline - view.getMeasuredHeight()), flexItem.getMarginBottom());
                    view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.mFlexContainer.getFlexWrap() != 2) {
            view.layout(i, i2 + flexItem.getMarginTop(), i3, i4 + flexItem.getMarginTop());
        } else {
            view.layout(i, i2 - flexItem.getMarginBottom(), i3, i4 - flexItem.getMarginBottom());
        }
    }

    public void layoutSingleChildVertical(View view, FlexLine flexLine, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.mFlexContainer.getAlignItems();
        if (flexItem.getAlignSelf() != -1) {
            alignItems = flexItem.getAlignSelf();
        }
        int i5 = flexLine.mCrossSize;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.getMarginRight(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.getMarginRight(), i4);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i - i5) + flexItem.getMarginLeft(), i2, view.getMeasuredWidth() + (i3 - i5) + flexItem.getMarginLeft(), i4);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int marginStart = ((MarginLayoutParamsCompat.getMarginStart(marginLayoutParams) + (i5 - view.getMeasuredWidth())) - MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams)) / 2;
                if (z) {
                    view.layout(i - marginStart, i2, i3 - marginStart, i4);
                    return;
                } else {
                    view.layout(i + marginStart, i2, i3 + marginStart, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z) {
            view.layout(i - flexItem.getMarginRight(), i2, i3 - flexItem.getMarginRight(), i4);
        } else {
            view.layout(i + flexItem.getMarginLeft(), i2, i3 + flexItem.getMarginLeft(), i4);
        }
    }

    public long makeCombinedLong(int i, int i2) {
        return (((long) i) & MEASURE_SPEC_WIDTH_MASK) | (((long) i2) << 32);
    }

    public void stretchViews() {
        stretchViews(0);
    }

    public void calculateHorizontalFlexLines(FlexLinesResult flexLinesResult, int i, int i2, int i3, int i4, List<FlexLine> list) {
        calculateFlexLines(flexLinesResult, i, i2, i3, i4, -1, list);
    }

    public void calculateVerticalFlexLines(FlexLinesResult flexLinesResult, int i, int i2, int i3, int i4, List<FlexLine> list) {
        calculateFlexLines(flexLinesResult, i2, i, i3, i4, -1, list);
    }

    public void determineMainSize(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i4;
        int i5;
        ensureChildrenFrozen(this.mFlexContainer.getFlexItemCount());
        if (i3 >= this.mFlexContainer.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.mFlexContainer.getFlexDirection();
        int flexDirection2 = this.mFlexContainer.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = this.mFlexContainer.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.mFlexContainer.getPaddingLeft();
            paddingRight = this.mFlexContainer.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(flexDirection, "Invalid flex direction: "));
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = this.mFlexContainer.getLargestMainSize();
            }
            paddingLeft = this.mFlexContainer.getPaddingTop();
            paddingRight = this.mFlexContainer.getPaddingBottom();
        }
        int i6 = paddingLeft + paddingRight;
        int i7 = size;
        int[] iArr = this.mIndexToFlexLine;
        int i8 = iArr != null ? iArr[i3] : 0;
        List<FlexLine> flexLinesInternal = this.mFlexContainer.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i8 < size2) {
            FlexLine flexLine = flexLinesInternal.get(i8);
            int i9 = flexLine.mMainSize;
            if (i9 >= i7 || !flexLine.mAnyItemsHaveFlexGrow) {
                i4 = i;
                i5 = i2;
                if (i9 > i7 && flexLine.mAnyItemsHaveFlexShrink) {
                    shrinkFlexItems(i4, i5, flexLine, i7, i6, false);
                }
            } else {
                i4 = i;
                i5 = i2;
                expandFlexItems(i4, i5, flexLine, i7, i6, false);
            }
            i8++;
            i = i4;
            i2 = i5;
        }
    }

    public void stretchViews(int i) {
        View reorderedFlexItemAt;
        if (i >= this.mFlexContainer.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.mFlexContainer.getFlexDirection();
        if (this.mFlexContainer.getAlignItems() != 4) {
            for (FlexLine flexLine : this.mFlexContainer.getFlexLinesInternal()) {
                for (Integer num : flexLine.mIndicesAlignSelfStretch) {
                    View reorderedFlexItemAt2 = this.mFlexContainer.getReorderedFlexItemAt(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        stretchViewVertically(reorderedFlexItemAt2, flexLine.mCrossSize, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(flexDirection, "Invalid flex direction: "));
                        }
                        stretchViewHorizontally(reorderedFlexItemAt2, flexLine.mCrossSize, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.mIndexToFlexLine;
        List<FlexLine> flexLinesInternal = this.mFlexContainer.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
            FlexLine flexLine2 = flexLinesInternal.get(i2);
            int i3 = flexLine2.mItemCount;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = flexLine2.mFirstIndex + i4;
                if (i4 < this.mFlexContainer.getFlexItemCount() && (reorderedFlexItemAt = this.mFlexContainer.getReorderedFlexItemAt(i5)) != null && reorderedFlexItemAt.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                    if (flexItem.getAlignSelf() == -1 || flexItem.getAlignSelf() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            stretchViewVertically(reorderedFlexItemAt, flexLine2.mCrossSize, i5);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(flexDirection, "Invalid flex direction: "));
                            }
                            stretchViewHorizontally(reorderedFlexItemAt, flexLine2.mCrossSize, i5);
                        }
                    }
                }
            }
        }
    }

    public int[] createReorderedIndices(SparseIntArray sparseIntArray) {
        int flexItemCount = this.mFlexContainer.getFlexItemCount();
        return sortOrdersIntoReorderedIndices(flexItemCount, createOrders(flexItemCount), sparseIntArray);
    }
}
