package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.view.ViewCompat;
import com.google.android.flexbox.FlexboxHelper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class FlexboxLayout extends ViewGroup implements FlexContainer {
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    private int mAlignContent;
    private int mAlignItems;
    private Drawable mDividerDrawableHorizontal;
    private Drawable mDividerDrawableVertical;
    private int mDividerHorizontalHeight;
    private int mDividerVerticalWidth;
    private int mFlexDirection;
    private List<FlexLine> mFlexLines;
    private FlexboxHelper.FlexLinesResult mFlexLinesResult;
    private int mFlexWrap;
    private FlexboxHelper mFlexboxHelper;
    private int mJustifyContent;
    private int mMaxLine;
    private SparseIntArray mOrderCache;
    private int[] mReorderedIndices;
    private int mShowDividerHorizontal;
    private int mShowDividerVertical;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    private boolean allFlexLinesAreDummyBefore(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.mFlexLines.get(i2).getItemCountNotGone() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean allViewsAreGoneBefore(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View reorderedChildAt = getReorderedChildAt(i - i3);
            if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private void drawDividersHorizontal(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.mFlexLines.size();
        for (int i = 0; i < size; i++) {
            FlexLine flexLine = this.mFlexLines.get(i);
            for (int i2 = 0; i2 < flexLine.mItemCount; i2++) {
                int i3 = flexLine.mFirstIndex + i2;
                View reorderedChildAt = getReorderedChildAt(i3);
                if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                    if (hasDividerBeforeChildAtAlongMainAxis(i3, i2)) {
                        drawVerticalDivider(canvas, z ? reorderedChildAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (reorderedChildAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.mDividerVerticalWidth, flexLine.mTop, flexLine.mCrossSize);
                    }
                    if (i2 == flexLine.mItemCount - 1 && (this.mShowDividerVertical & 4) > 0) {
                        drawVerticalDivider(canvas, z ? (reorderedChildAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.mDividerVerticalWidth : reorderedChildAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, flexLine.mTop, flexLine.mCrossSize);
                    }
                }
            }
            if (hasDividerBeforeFlexLine(i)) {
                drawHorizontalDivider(canvas, paddingLeft, z2 ? flexLine.mBottom : flexLine.mTop - this.mDividerHorizontalHeight, iMax);
            }
            if (hasEndDividerAfterFlexLine(i) && (this.mShowDividerHorizontal & 4) > 0) {
                drawHorizontalDivider(canvas, paddingLeft, z2 ? flexLine.mTop - this.mDividerHorizontalHeight : flexLine.mBottom, iMax);
            }
        }
    }

    private void drawDividersVertical(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.mFlexLines.size();
        for (int i = 0; i < size; i++) {
            FlexLine flexLine = this.mFlexLines.get(i);
            for (int i2 = 0; i2 < flexLine.mItemCount; i2++) {
                int i3 = flexLine.mFirstIndex + i2;
                View reorderedChildAt = getReorderedChildAt(i3);
                if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                    if (hasDividerBeforeChildAtAlongMainAxis(i3, i2)) {
                        drawHorizontalDivider(canvas, flexLine.mLeft, z2 ? reorderedChildAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (reorderedChildAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.mDividerHorizontalHeight, flexLine.mCrossSize);
                    }
                    if (i2 == flexLine.mItemCount - 1 && (this.mShowDividerHorizontal & 4) > 0) {
                        drawHorizontalDivider(canvas, flexLine.mLeft, z2 ? (reorderedChildAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.mDividerHorizontalHeight : reorderedChildAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, flexLine.mCrossSize);
                    }
                }
            }
            if (hasDividerBeforeFlexLine(i)) {
                drawVerticalDivider(canvas, z ? flexLine.mRight : flexLine.mLeft - this.mDividerVerticalWidth, paddingTop, iMax);
            }
            if (hasEndDividerAfterFlexLine(i) && (this.mShowDividerVertical & 4) > 0) {
                drawVerticalDivider(canvas, z ? flexLine.mLeft - this.mDividerVerticalWidth : flexLine.mRight, paddingTop, iMax);
            }
        }
    }

    private void drawHorizontalDivider(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.mDividerDrawableHorizontal;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.mDividerHorizontalHeight + i2);
        this.mDividerDrawableHorizontal.draw(canvas);
    }

    private void drawVerticalDivider(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.mDividerDrawableVertical;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.mDividerVerticalWidth + i, i3 + i2);
        this.mDividerDrawableVertical.draw(canvas);
    }

    private boolean hasDividerBeforeChildAtAlongMainAxis(int i, int i2) {
        return allViewsAreGoneBefore(i, i2) ? isMainAxisDirectionHorizontal() ? (this.mShowDividerVertical & 1) != 0 : (this.mShowDividerHorizontal & 1) != 0 : isMainAxisDirectionHorizontal() ? (this.mShowDividerVertical & 2) != 0 : (this.mShowDividerHorizontal & 2) != 0;
    }

    private boolean hasDividerBeforeFlexLine(int i) {
        if (i >= 0 && i < this.mFlexLines.size()) {
            if (allFlexLinesAreDummyBefore(i)) {
                return isMainAxisDirectionHorizontal() ? (this.mShowDividerHorizontal & 1) != 0 : (this.mShowDividerVertical & 1) != 0;
            }
            if (isMainAxisDirectionHorizontal()) {
                return (this.mShowDividerHorizontal & 2) != 0;
            }
            if ((this.mShowDividerVertical & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean hasEndDividerAfterFlexLine(int i) {
        if (i >= 0 && i < this.mFlexLines.size()) {
            for (int i2 = i + 1; i2 < this.mFlexLines.size(); i2++) {
                if (this.mFlexLines.get(i2).getItemCountNotGone() > 0) {
                    return false;
                }
            }
            if (isMainAxisDirectionHorizontal()) {
                return (this.mShowDividerHorizontal & 4) != 0;
            }
            if ((this.mShowDividerVertical & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void layoutHorizontal(boolean z, int i, int i2, int i3, int i4) {
        float measuredWidth;
        float f;
        float f2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        View view;
        FlexLine flexLine;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i10 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.mFlexLines.size();
        for (int i11 = 0; i11 < size; i11++) {
            FlexLine flexLine2 = this.mFlexLines.get(i11);
            if (hasDividerBeforeFlexLine(i11)) {
                int i12 = this.mDividerHorizontalHeight;
                paddingBottom -= i12;
                paddingTop += i12;
            }
            int i13 = paddingBottom;
            int i14 = this.mJustifyContent;
            char c = 4;
            int i15 = 2;
            boolean z3 = true;
            if (i14 == 0) {
                measuredWidth = paddingLeft;
                f = i10 - paddingRight;
            } else if (i14 == 1) {
                int i16 = flexLine2.mMainSize;
                f = i16 - paddingLeft;
                measuredWidth = (i10 - i16) + paddingRight;
            } else if (i14 != 2) {
                if (i14 == 3) {
                    measuredWidth = paddingLeft;
                    f2 = (i10 - flexLine2.mMainSize) / (flexLine2.getItemCountNotGone() != 1 ? r7 - 1 : 1.0f);
                    f = i10 - paddingRight;
                } else if (i14 == 4) {
                    int itemCountNotGone = flexLine2.getItemCountNotGone();
                    float f3 = itemCountNotGone != 0 ? (i10 - flexLine2.mMainSize) / itemCountNotGone : 0.0f;
                    float f4 = f3 / 2.0f;
                    measuredWidth = paddingLeft + f4;
                    float f5 = (i10 - paddingRight) - f4;
                    f2 = f3;
                    f = f5;
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.mJustifyContent);
                    }
                    f2 = flexLine2.getItemCountNotGone() != 0 ? (i10 - flexLine2.mMainSize) / (r3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f2;
                    f = (i10 - paddingRight) - f2;
                }
                float fMax = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < flexLine2.mItemCount) {
                    int i17 = flexLine2.mFirstIndex + i5;
                    View reorderedChildAt = getReorderedChildAt(i17);
                    char c2 = c;
                    if (reorderedChildAt != null) {
                        boolean z4 = z3;
                        if (reorderedChildAt.getVisibility() == 8) {
                            z2 = z4;
                        } else {
                            LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                            float f6 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                            float f7 = f - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            if (hasDividerBeforeChildAtAlongMainAxis(i17, i5)) {
                                int i18 = this.mDividerVerticalWidth;
                                float f8 = i18;
                                f6 += f8;
                                f7 -= f8;
                                i9 = i18;
                            } else {
                                i9 = 0;
                            }
                            float f9 = f7;
                            int i19 = (i5 != flexLine2.mItemCount + (-1) || (this.mShowDividerVertical & 4) <= 0) ? 0 : this.mDividerVerticalWidth;
                            if (this.mFlexWrap == i15) {
                                if (z) {
                                    i8 = i15;
                                    i7 = i5;
                                    view = reorderedChildAt;
                                    z2 = z4;
                                    this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f9) - reorderedChildAt.getMeasuredWidth(), i13 - reorderedChildAt.getMeasuredHeight(), Math.round(f9), i13);
                                } else {
                                    i8 = i15;
                                    i7 = i5;
                                    view = reorderedChildAt;
                                    z2 = z4;
                                    this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f6), i13 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f6), i13);
                                }
                                i6 = i13;
                            } else {
                                i8 = i15;
                                i7 = i5;
                                i6 = i13;
                                view = reorderedChildAt;
                                z2 = z4;
                                if (z) {
                                    this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f9) - view.getMeasuredWidth(), paddingTop, Math.round(f9), view.getMeasuredHeight() + paddingTop);
                                } else {
                                    int i20 = paddingTop;
                                    this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f6), i20, view.getMeasuredWidth() + Math.round(f6), view.getMeasuredHeight() + i20);
                                    paddingTop = i20;
                                }
                            }
                            measuredWidth = f6 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            float measuredWidth2 = f9 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
                            if (z) {
                                flexLine = flexLine2;
                                flexLine.updatePositionFromView(view, i19, 0, i9, 0);
                            } else {
                                flexLine = flexLine2;
                                flexLine.updatePositionFromView(view, i9, 0, i19, 0);
                            }
                            flexLine2 = flexLine;
                            f = measuredWidth2;
                            i5 = i7 + 1;
                            c = c2;
                            z3 = z2;
                            i15 = i8;
                            i13 = i6;
                        }
                    } else {
                        z2 = z3;
                    }
                    i8 = i15;
                    i7 = i5;
                    i6 = i13;
                    i5 = i7 + 1;
                    c = c2;
                    z3 = z2;
                    i15 = i8;
                    i13 = i6;
                }
                int i21 = flexLine2.mCrossSize;
                paddingTop += i21;
                paddingBottom = i13 - i21;
            } else {
                int i22 = flexLine2.mMainSize;
                measuredWidth = paddingLeft + ((i10 - i22) / 2.0f);
                f = (i10 - paddingRight) - ((i10 - i22) / 2.0f);
            }
            f2 = 0.0f;
            float fMax2 = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < flexLine2.mItemCount) {
            }
            int i212 = flexLine2.mCrossSize;
            paddingTop += i212;
            paddingBottom = i13 - i212;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void layoutVertical(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        float measuredHeight;
        float f;
        float f2;
        int i5;
        char c;
        int i6;
        int i7;
        int i8;
        int i9;
        FlexLine flexLine;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i10 = i4 - i2;
        int i11 = (i3 - i) - paddingRight;
        int size = this.mFlexLines.size();
        for (int i12 = 0; i12 < size; i12++) {
            FlexLine flexLine2 = this.mFlexLines.get(i12);
            if (hasDividerBeforeFlexLine(i12)) {
                int i13 = this.mDividerVerticalWidth;
                paddingLeft += i13;
                i11 -= i13;
            }
            int i14 = i11;
            int i15 = this.mJustifyContent;
            char c2 = 4;
            int i16 = 1;
            if (i15 == 0) {
                measuredHeight = paddingTop;
                f = i10 - paddingBottom;
            } else if (i15 == 1) {
                int i17 = flexLine2.mMainSize;
                f = i17 - paddingTop;
                measuredHeight = (i10 - i17) + paddingBottom;
            } else if (i15 != 2) {
                if (i15 == 3) {
                    measuredHeight = paddingTop;
                    f2 = (i10 - flexLine2.mMainSize) / (flexLine2.getItemCountNotGone() != 1 ? r13 - 1 : 1.0f);
                    f = i10 - paddingBottom;
                } else if (i15 == 4) {
                    int itemCountNotGone = flexLine2.getItemCountNotGone();
                    f2 = itemCountNotGone != 0 ? (i10 - flexLine2.mMainSize) / itemCountNotGone : 0.0f;
                    float f3 = f2 / 2.0f;
                    measuredHeight = paddingTop + f3;
                    f = (i10 - paddingBottom) - f3;
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.mJustifyContent);
                    }
                    f2 = flexLine2.getItemCountNotGone() != 0 ? (i10 - flexLine2.mMainSize) / (r5 + 1) : 0.0f;
                    measuredHeight = paddingTop + f2;
                    f = (i10 - paddingBottom) - f2;
                }
                float fMax = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < flexLine2.mItemCount) {
                    int i18 = flexLine2.mFirstIndex + i5;
                    int i19 = i16;
                    View reorderedChildAt = getReorderedChildAt(i18);
                    if (reorderedChildAt != null) {
                        c = c2;
                        if (reorderedChildAt.getVisibility() != 8) {
                            LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                            float f4 = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                            float f5 = f - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (hasDividerBeforeChildAtAlongMainAxis(i18, i5)) {
                                i9 = this.mDividerHorizontalHeight;
                                float f6 = i9;
                                f4 += f6;
                                f5 -= f6;
                            } else {
                                i9 = 0;
                            }
                            float f7 = f5;
                            int i20 = (i5 != flexLine2.mItemCount - i19 || (this.mShowDividerHorizontal & 4) <= 0) ? 0 : this.mDividerHorizontalHeight;
                            if (z) {
                                if (z2) {
                                    i8 = i19;
                                    i7 = i5;
                                    this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, true, i14 - reorderedChildAt.getMeasuredWidth(), Math.round(f7) - reorderedChildAt.getMeasuredHeight(), i14, Math.round(f7));
                                } else {
                                    i7 = i5;
                                    i8 = i19;
                                    this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, true, i14 - reorderedChildAt.getMeasuredWidth(), Math.round(f4), i14, reorderedChildAt.getMeasuredHeight() + Math.round(f4));
                                }
                                i6 = i14;
                            } else {
                                i7 = i5;
                                i8 = i19;
                                i6 = i14;
                                if (z2) {
                                    this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, false, paddingLeft, Math.round(f7) - reorderedChildAt.getMeasuredHeight(), reorderedChildAt.getMeasuredWidth() + paddingLeft, Math.round(f7));
                                } else {
                                    int i21 = paddingLeft;
                                    this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, false, i21, Math.round(f4), reorderedChildAt.getMeasuredWidth() + i21, reorderedChildAt.getMeasuredHeight() + Math.round(f4));
                                    paddingLeft = i21;
                                }
                            }
                            measuredHeight = f4 + reorderedChildAt.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            float measuredHeight2 = f7 - ((reorderedChildAt.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                            if (z2) {
                                flexLine = flexLine2;
                                flexLine.updatePositionFromView(reorderedChildAt, 0, i20, 0, i9);
                            } else {
                                flexLine = flexLine2;
                                flexLine.updatePositionFromView(reorderedChildAt, 0, i9, 0, i20);
                            }
                            flexLine2 = flexLine;
                            f = measuredHeight2;
                        }
                        i5 = i7 + 1;
                        c2 = c;
                        i16 = i8;
                        i14 = i6;
                    } else {
                        c = c2;
                    }
                    i7 = i5;
                    i8 = i19;
                    i6 = i14;
                    i5 = i7 + 1;
                    c2 = c;
                    i16 = i8;
                    i14 = i6;
                }
                int i22 = flexLine2.mCrossSize;
                paddingLeft += i22;
                i11 = i14 - i22;
            } else {
                int i23 = flexLine2.mMainSize;
                measuredHeight = paddingTop + ((i10 - i23) / 2.0f);
                f = (i10 - paddingBottom) - ((i10 - i23) / 2.0f);
            }
            f2 = 0.0f;
            float fMax2 = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < flexLine2.mItemCount) {
            }
            int i222 = flexLine2.mCrossSize;
            paddingLeft += i222;
            i11 = i14 - i222;
        }
    }

    private void measureHorizontal(int i, int i2) {
        this.mFlexLines.clear();
        this.mFlexLinesResult.reset();
        this.mFlexboxHelper.calculateHorizontalFlexLines(this.mFlexLinesResult, i, i2);
        this.mFlexLines = this.mFlexLinesResult.mFlexLines;
        this.mFlexboxHelper.determineMainSize(i, i2);
        if (this.mAlignItems == 3) {
            for (FlexLine flexLine : this.mFlexLines) {
                int iMax = Integer.MIN_VALUE;
                for (int i3 = 0; i3 < flexLine.mItemCount; i3++) {
                    View reorderedChildAt = getReorderedChildAt(flexLine.mFirstIndex + i3);
                    if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                        iMax = this.mFlexWrap != 2 ? Math.max(iMax, reorderedChildAt.getMeasuredHeight() + Math.max(flexLine.mMaxBaseline - reorderedChildAt.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(iMax, reorderedChildAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max(reorderedChildAt.getBaseline() + (flexLine.mMaxBaseline - reorderedChildAt.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                flexLine.mCrossSize = iMax;
            }
        }
        this.mFlexboxHelper.determineCrossSize(i, i2, getPaddingBottom() + getPaddingTop());
        this.mFlexboxHelper.stretchViews();
        setMeasuredDimensionForFlex(this.mFlexDirection, i, i2, this.mFlexLinesResult.mChildState);
    }

    private void measureVertical(int i, int i2) {
        this.mFlexLines.clear();
        this.mFlexLinesResult.reset();
        this.mFlexboxHelper.calculateVerticalFlexLines(this.mFlexLinesResult, i, i2);
        this.mFlexLines = this.mFlexLinesResult.mFlexLines;
        this.mFlexboxHelper.determineMainSize(i, i2);
        this.mFlexboxHelper.determineCrossSize(i, i2, getPaddingRight() + getPaddingLeft());
        this.mFlexboxHelper.stretchViews();
        setMeasuredDimensionForFlex(this.mFlexDirection, i, i2, this.mFlexLinesResult.mChildState);
    }

    private void setMeasuredDimensionForFlex(int i, int i2, int i3, int i4) {
        int paddingBottom;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Invalid flex direction: "));
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException(C21532OooOOo.OooO0OO(mode, "Unknown width mode is set: "));
            }
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = paddingBottom;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i3, i4);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException(C21532OooOOo.OooO0OO(mode2, "Unknown height mode is set: "));
            }
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    private void setWillNotDrawFlag() {
        if (this.mDividerDrawableHorizontal == null && this.mDividerDrawableVertical == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.mOrderCache == null) {
            this.mOrderCache = new SparseIntArray(getChildCount());
        }
        this.mReorderedIndices = this.mFlexboxHelper.createReorderedIndices(view, i, layoutParams, this.mOrderCache);
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getAlignContent() {
        return this.mAlignContent;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getAlignItems() {
        return this.mAlignItems;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getChildHeightMeasureSpec(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getChildWidthMeasureSpec(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getDecorationLengthCrossAxis(View view) {
        return 0;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getDecorationLengthMainAxis(View view, int i, int i2) {
        int i3;
        int i4;
        if (isMainAxisDirectionHorizontal()) {
            i3 = hasDividerBeforeChildAtAlongMainAxis(i, i2) ? this.mDividerVerticalWidth : 0;
            if ((this.mShowDividerVertical & 4) <= 0) {
                return i3;
            }
            i4 = this.mDividerVerticalWidth;
        } else {
            i3 = hasDividerBeforeChildAtAlongMainAxis(i, i2) ? this.mDividerHorizontalHeight : 0;
            if ((this.mShowDividerHorizontal & 4) <= 0) {
                return i3;
            }
            i4 = this.mDividerHorizontalHeight;
        }
        return i3 + i4;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.mDividerDrawableHorizontal;
    }

    public Drawable getDividerDrawableVertical() {
        return this.mDividerDrawableVertical;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexDirection() {
        return this.mFlexDirection;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public View getFlexItemAt(int i) {
        return getChildAt(i);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexItemCount() {
        return getChildCount();
    }

    @Override // com.google.android.flexbox.FlexContainer
    public List<FlexLine> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.mFlexLines.size());
        for (FlexLine flexLine : this.mFlexLines) {
            if (flexLine.getItemCountNotGone() != 0) {
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
        Iterator<FlexLine> it = this.mFlexLines.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().mMainSize);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getMaxLine() {
        return this.mMaxLine;
    }

    public View getReorderedChildAt(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.mReorderedIndices;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public View getReorderedFlexItemAt(int i) {
        return getReorderedChildAt(i);
    }

    public int getShowDividerHorizontal() {
        return this.mShowDividerHorizontal;
    }

    public int getShowDividerVertical() {
        return this.mShowDividerVertical;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getSumOfCrossSize() {
        int size = this.mFlexLines.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            FlexLine flexLine = this.mFlexLines.get(i2);
            if (hasDividerBeforeFlexLine(i2)) {
                i += isMainAxisDirectionHorizontal() ? this.mDividerHorizontalHeight : this.mDividerVerticalWidth;
            }
            if (hasEndDividerAfterFlexLine(i2)) {
                i += isMainAxisDirectionHorizontal() ? this.mDividerHorizontalHeight : this.mDividerVerticalWidth;
            }
            i += flexLine.mCrossSize;
        }
        return i;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public boolean isMainAxisDirectionHorizontal() {
        int i = this.mFlexDirection;
        return i == 0 || i == 1;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mDividerDrawableVertical == null && this.mDividerDrawableHorizontal == null) {
            return;
        }
        if (this.mShowDividerHorizontal == 0 && this.mShowDividerVertical == 0) {
            return;
        }
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int i = this.mFlexDirection;
        if (i == 0) {
            drawDividersHorizontal(canvas, layoutDirection == 1, this.mFlexWrap == 2);
            return;
        }
        if (i == 1) {
            drawDividersHorizontal(canvas, layoutDirection != 1, this.mFlexWrap == 2);
            return;
        }
        if (i == 2) {
            boolean z = layoutDirection == 1;
            if (this.mFlexWrap == 2) {
                z = !z;
            }
            drawDividersVertical(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = layoutDirection == 1;
        if (this.mFlexWrap == 2) {
            z2 = !z2;
        }
        drawDividersVertical(canvas, z2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        FlexboxLayout flexboxLayout;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        FlexboxLayout flexboxLayout2;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z4;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int i13 = this.mFlexDirection;
        if (i13 == 0) {
            if (layoutDirection == 1) {
                z2 = true;
                flexboxLayout = this;
                i5 = i;
                i8 = i2;
                i7 = i4;
                i6 = i3;
            } else {
                z2 = false;
                flexboxLayout = this;
                i5 = i;
                i6 = i3;
                i7 = i4;
                i8 = i2;
            }
            flexboxLayout.layoutHorizontal(z2, i5, i8, i6, i7);
            return;
        }
        if (i13 != 1) {
            if (i13 == 2) {
                z4 = layoutDirection == 1;
                if (this.mFlexWrap == 2) {
                    z4 = !z4;
                }
                layoutVertical(z4, false, i, i2, i3, i4);
                return;
            }
            if (i13 != 3) {
                throw new IllegalStateException("Invalid flex direction is set: " + this.mFlexDirection);
            }
            z4 = layoutDirection == 1;
            if (this.mFlexWrap == 2) {
                z4 = !z4;
            }
            layoutVertical(z4, true, i, i2, i3, i4);
            return;
        }
        if (layoutDirection != 1) {
            z3 = true;
            flexboxLayout2 = this;
            i9 = i;
            i12 = i2;
            i11 = i4;
            i10 = i3;
        } else {
            z3 = false;
            flexboxLayout2 = this;
            i9 = i;
            i10 = i3;
            i11 = i4;
            i12 = i2;
        }
        flexboxLayout2.layoutHorizontal(z3, i9, i12, i10, i11);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mOrderCache == null) {
            this.mOrderCache = new SparseIntArray(getChildCount());
        }
        if (this.mFlexboxHelper.isOrderChangedFromLastMeasurement(this.mOrderCache)) {
            this.mReorderedIndices = this.mFlexboxHelper.createReorderedIndices(this.mOrderCache);
        }
        int i3 = this.mFlexDirection;
        if (i3 == 0 || i3 == 1) {
            measureHorizontal(i, i2);
        } else if (i3 == 2 || i3 == 3) {
            measureVertical(i, i2);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.mFlexDirection);
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void onNewFlexItemAdded(View view, int i, int i2, FlexLine flexLine) {
        if (hasDividerBeforeChildAtAlongMainAxis(i, i2)) {
            if (isMainAxisDirectionHorizontal()) {
                int i3 = flexLine.mMainSize;
                int i4 = this.mDividerVerticalWidth;
                flexLine.mMainSize = i3 + i4;
                flexLine.mDividerLengthInMainSize += i4;
                return;
            }
            int i5 = flexLine.mMainSize;
            int i6 = this.mDividerHorizontalHeight;
            flexLine.mMainSize = i5 + i6;
            flexLine.mDividerLengthInMainSize += i6;
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void onNewFlexLineAdded(FlexLine flexLine) {
        if (isMainAxisDirectionHorizontal()) {
            if ((this.mShowDividerVertical & 4) > 0) {
                int i = flexLine.mMainSize;
                int i2 = this.mDividerVerticalWidth;
                flexLine.mMainSize = i + i2;
                flexLine.mDividerLengthInMainSize += i2;
                return;
            }
            return;
        }
        if ((this.mShowDividerHorizontal & 4) > 0) {
            int i3 = flexLine.mMainSize;
            int i4 = this.mDividerHorizontalHeight;
            flexLine.mMainSize = i3 + i4;
            flexLine.mDividerLengthInMainSize += i4;
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setAlignContent(int i) {
        if (this.mAlignContent != i) {
            this.mAlignContent = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setAlignItems(int i) {
        if (this.mAlignItems != i) {
            this.mAlignItems = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.mDividerDrawableHorizontal) {
            return;
        }
        this.mDividerDrawableHorizontal = drawable;
        if (drawable != null) {
            this.mDividerHorizontalHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerHorizontalHeight = 0;
        }
        setWillNotDrawFlag();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.mDividerDrawableVertical) {
            return;
        }
        this.mDividerDrawableVertical = drawable;
        if (drawable != null) {
            this.mDividerVerticalWidth = drawable.getIntrinsicWidth();
        } else {
            this.mDividerVerticalWidth = 0;
        }
        setWillNotDrawFlag();
        requestLayout();
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexDirection(int i) {
        if (this.mFlexDirection != i) {
            this.mFlexDirection = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexLines(List<FlexLine> list) {
        this.mFlexLines = list;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexWrap(int i) {
        if (this.mFlexWrap != i) {
            this.mFlexWrap = i;
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

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.mShowDividerHorizontal) {
            this.mShowDividerHorizontal = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.mShowDividerVertical) {
            this.mShowDividerVertical = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void updateViewCache(int i, View view) {
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMaxLine = -1;
        this.mFlexboxHelper = new FlexboxHelper(this);
        this.mFlexLines = new ArrayList();
        this.mFlexLinesResult = new FlexboxHelper.FlexLinesResult();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15946R.styleable.FlexboxLayout, i, 0);
        this.mFlexDirection = typedArrayObtainStyledAttributes.getInt(C15946R.styleable.FlexboxLayout_flexDirection, 0);
        this.mFlexWrap = typedArrayObtainStyledAttributes.getInt(C15946R.styleable.FlexboxLayout_flexWrap, 0);
        this.mJustifyContent = typedArrayObtainStyledAttributes.getInt(C15946R.styleable.FlexboxLayout_justifyContent, 0);
        this.mAlignItems = typedArrayObtainStyledAttributes.getInt(C15946R.styleable.FlexboxLayout_alignItems, 0);
        this.mAlignContent = typedArrayObtainStyledAttributes.getInt(C15946R.styleable.FlexboxLayout_alignContent, 0);
        this.mMaxLine = typedArrayObtainStyledAttributes.getInt(C15946R.styleable.FlexboxLayout_maxLine, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C15946R.styleable.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(C15946R.styleable.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(C15946R.styleable.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(C15946R.styleable.FlexboxLayout_showDivider, 0);
        if (i2 != 0) {
            this.mShowDividerVertical = i2;
            this.mShowDividerHorizontal = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(C15946R.styleable.FlexboxLayout_showDividerVertical, 0);
        if (i3 != 0) {
            this.mShowDividerVertical = i3;
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(C15946R.styleable.FlexboxLayout_showDividerHorizontal, 0);
        if (i4 != 0) {
            this.mShowDividerHorizontal = i4;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator<LayoutParams>() { // from class: com.google.android.flexbox.FlexboxLayout.LayoutParams.1
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
        private int mOrder;
        private boolean mWrapBefore;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15946R.styleable.FlexboxLayout_Layout);
            this.mOrder = typedArrayObtainStyledAttributes.getInt(C15946R.styleable.FlexboxLayout_Layout_layout_order, 1);
            this.mFlexGrow = typedArrayObtainStyledAttributes.getFloat(C15946R.styleable.FlexboxLayout_Layout_layout_flexGrow, 0.0f);
            this.mFlexShrink = typedArrayObtainStyledAttributes.getFloat(C15946R.styleable.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.mAlignSelf = typedArrayObtainStyledAttributes.getInt(C15946R.styleable.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.mFlexBasisPercent = typedArrayObtainStyledAttributes.getFraction(C15946R.styleable.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C15946R.styleable.FlexboxLayout_Layout_layout_minWidth, -1);
            this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C15946R.styleable.FlexboxLayout_Layout_layout_minHeight, -1);
            this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C15946R.styleable.FlexboxLayout_Layout_layout_maxWidth, 16777215);
            this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C15946R.styleable.FlexboxLayout_Layout_layout_maxHeight, 16777215);
            this.mWrapBefore = typedArrayObtainStyledAttributes.getBoolean(C15946R.styleable.FlexboxLayout_Layout_layout_wrapBefore, false);
            typedArrayObtainStyledAttributes.recycle();
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
            return this.mOrder;
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
            this.mOrder = i;
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
            parcel.writeInt(this.mOrder);
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

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
            this.mOrder = layoutParams.mOrder;
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

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(int i, int i2) {
            super(new ViewGroup.LayoutParams(i, i2));
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(Parcel parcel) {
            super(0, 0);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
            this.mOrder = parcel.readInt();
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
}
