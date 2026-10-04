package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.internal.view.SupportMenu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import o0000.C24041OooO0Oo;
import o0000.C24042OooO0o0;
import o0000oO.AbstractC24322OooOOOo;
import o0000oO.C24309OooO0O0;
import o0000oO.C24310OooO0OO;
import o0000oO.C24313OooO0o0;
import o0000oO.C24316OooOO0;
import o0000oO.C24318OooOO0o;
import o0000oO.C24319OooOOO;
import o0000oo.C24342OooO;
import o0000oo.C24343OooO00o;
import o0000oo.C24346OooO0Oo;
import o0000oo.C24347OooO0o;
import o0000oo.C24348OooO0o0;
import o0000oo.C24350OooO0oo;
import o0000oo.C24351OooOO0;
import o0000oo.C24353OooOO0o;
import o0000oo.C24354OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.2.0-alpha04";
    private static C21627OooO0oO sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<ConstraintHelper> mConstraintHelpers;
    protected androidx.constraintlayout.widget.OooO0O0 mConstraintLayoutSpec;
    private androidx.constraintlayout.widget.OooO0OO mConstraintSet;
    private int mConstraintSetId;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected C24347OooO0o mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    OooO0O0 mMeasurer;
    private C24042OooO0o0 mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private ArrayList<OooO0OO> mModifiers;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<C24348OooO0o0> mTempMapIdToWidget;

    public class OooO0O0 implements C24309OooO0O0.InterfaceC19609OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ConstraintLayout f63946OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f63947OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f63948OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f63949OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f63950OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f63951OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f63952OooO0oO;

        public OooO0O0(ConstraintLayout constraintLayout) {
            this.f63946OooO00o = constraintLayout;
        }

        public static boolean OooO00o(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:116:0x01a8  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x01ad  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x01bb  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x01c3  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x01da  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x01dd A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:145:0x01de  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x012d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0O0(C24348OooO0o0 c24348OooO0o0, C24309OooO0O0.OooO00o oooO00o) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int iOrdinal;
            int iMakeMeasureSpec3;
            C24347OooO0o c24347OooO0o;
            int baseline;
            int iMax;
            int iMax2;
            ConstraintLayout constraintLayout;
            boolean z;
            int i;
            if (c24348OooO0o0 == null) {
                return;
            }
            if (c24348OooO0o0.f82052OoooooO == 8 && !c24348OooO0o0.f82026Oooo000) {
                oooO00o.f81826OooO0o0 = 0;
                oooO00o.f81825OooO0o = 0;
                oooO00o.f81827OooO0oO = 0;
                return;
            }
            if (c24348OooO0o0.f82054o000oOoO == null) {
                return;
            }
            ConstraintLayout constraintLayout2 = ConstraintLayout.this;
            ConstraintLayout.access$000(constraintLayout2);
            C24348OooO0o0.OooO00o oooO00o2 = oooO00o.f81821OooO00o;
            C24348OooO0o0.OooO00o oooO00o3 = oooO00o.f81822OooO0O0;
            int i2 = oooO00o.f81823OooO0OO;
            int i3 = oooO00o.f81824OooO0Oo;
            int i4 = this.f63947OooO0O0 + this.f63948OooO0OO;
            int i5 = this.f63949OooO0Oo;
            View view = c24348OooO0o0.f82050Oooooo;
            int iOrdinal2 = oooO00o2.ordinal();
            C24346OooO0Oo c24346OooO0Oo = c24348OooO0o0.f82032Oooo0o0;
            C24346OooO0Oo c24346OooO0Oo2 = c24348OooO0o0.f82029Oooo0O0;
            if (iOrdinal2 == 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            } else if (iOrdinal2 == 1) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f63950OooO0o, i5, -2);
            } else {
                if (iOrdinal2 != 2) {
                    if (iOrdinal2 != 3) {
                        iMakeMeasureSpec2 = 0;
                    } else {
                        int i6 = this.f63950OooO0o;
                        int i7 = c24346OooO0Oo2 != null ? c24346OooO0Oo2.f81961OooO0oO : 0;
                        if (c24346OooO0Oo != null) {
                            i7 += c24346OooO0Oo.f81961OooO0oO;
                        }
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, i5 + i7, -1);
                    }
                    iOrdinal = oooO00o3.ordinal();
                    if (iOrdinal != 0) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                    } else if (iOrdinal == 1) {
                        iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f63952OooO0oO, i4, -2);
                    } else if (iOrdinal == 2) {
                        iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f63952OooO0oO, i4, -2);
                        boolean z2 = c24348OooO0o0.f82011OooOOoo == 1;
                        int i8 = oooO00o.f81829OooOO0;
                        if (i8 == 1 || i8 == 2) {
                            boolean z3 = view.getMeasuredWidth() == c24348OooO0o0.OooOOo0();
                            if (oooO00o.f81829OooOO0 == 2 || !z2 || ((z2 && z3) || (view instanceof Placeholder) || c24348OooO0o0.OooOoo0())) {
                                iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(c24348OooO0o0.OooOO0O(), 1073741824);
                            }
                        }
                    } else if (iOrdinal != 3) {
                        iMakeMeasureSpec3 = 0;
                    } else {
                        int i9 = this.f63952OooO0oO;
                        int i10 = c24346OooO0Oo2 != null ? c24348OooO0o0.f82030Oooo0OO.f81961OooO0oO : 0;
                        if (c24346OooO0Oo != null) {
                            i10 += c24348OooO0o0.f82031Oooo0o.f81961OooO0oO;
                        }
                        iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(i9, i4 + i10, -1);
                    }
                    c24347OooO0o = (C24347OooO0o) c24348OooO0o0.f82054o000oOoO;
                    if (c24347OooO0o == null && C24351OooOO0.OooO0O0(constraintLayout2.mOptimizationLevel, 256) && view.getMeasuredWidth() == c24348OooO0o0.OooOOo0() && view.getMeasuredWidth() < c24347OooO0o.OooOOo0() && view.getMeasuredHeight() == c24348OooO0o0.OooOO0O() && view.getMeasuredHeight() < c24347OooO0o.OooOO0O() && view.getBaseline() == c24348OooO0o0.f82046Ooooo0o && !c24348OooO0o0.OooOoO() && OooO00o(c24348OooO0o0.f82028Oooo00o, iMakeMeasureSpec2, c24348OooO0o0.OooOOo0()) && OooO00o(c24348OooO0o0.f82025Oooo0, iMakeMeasureSpec3, c24348OooO0o0.OooOO0O())) {
                        oooO00o.f81826OooO0o0 = c24348OooO0o0.OooOOo0();
                        oooO00o.f81825OooO0o = c24348OooO0o0.OooOO0O();
                        oooO00o.f81827OooO0oO = c24348OooO0o0.f82046Ooooo0o;
                        return;
                    }
                    C24348OooO0o0.OooO00o oooO00o4 = C24348OooO0o0.OooO00o.f82065OooOoO0;
                    boolean z4 = oooO00o2 != oooO00o4;
                    boolean z5 = oooO00o3 != oooO00o4;
                    C24348OooO0o0.OooO00o oooO00o5 = C24348OooO0o0.OooO00o.f82064OooOoO;
                    C24348OooO0o0.OooO00o oooO00o6 = C24348OooO0o0.OooO00o.f82063OooOo0o;
                    boolean z6 = oooO00o3 != oooO00o5 || oooO00o3 == oooO00o6;
                    boolean z7 = oooO00o2 != oooO00o5 || oooO00o2 == oooO00o6;
                    boolean z8 = !z4 && c24348OooO0o0.f82042OoooOo0 > 0.0f;
                    boolean z9 = !z5 && c24348OooO0o0.f82042OoooOo0 > 0.0f;
                    if (view != null) {
                        return;
                    }
                    OooO00o oooO00o7 = (OooO00o) view.getLayoutParams();
                    int i11 = oooO00o.f81829OooOO0;
                    if (i11 != 1 && i11 != 2 && z4 && c24348OooO0o0.f82009OooOOo == 0 && z5 && c24348OooO0o0.f82011OooOOoo == 0) {
                        constraintLayout = constraintLayout2;
                        iMax2 = 0;
                        i = -1;
                        z = false;
                        baseline = 0;
                        iMax = 0;
                    } else {
                        if ((view instanceof VirtualLayout) && (c24348OooO0o0 instanceof C24353OooOO0o)) {
                            ((VirtualLayout) view).OooOOO((C24353OooOO0o) c24348OooO0o0, iMakeMeasureSpec2, iMakeMeasureSpec3);
                        } else {
                            view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                        }
                        c24348OooO0o0.f82028Oooo00o = iMakeMeasureSpec2;
                        c24348OooO0o0.f82025Oooo0 = iMakeMeasureSpec3;
                        c24348OooO0o0.f82000OooO0oO = false;
                        int measuredWidth = view.getMeasuredWidth();
                        int measuredHeight = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        int i12 = c24348OooO0o0.f82013OooOo0;
                        iMax = i12 > 0 ? Math.max(i12, measuredWidth) : measuredWidth;
                        int i13 = c24348OooO0o0.f82015OooOo0O;
                        if (i13 > 0) {
                            iMax = Math.min(i13, iMax);
                        }
                        int i14 = c24348OooO0o0.f82012OooOo;
                        iMax2 = i14 > 0 ? Math.max(i14, measuredHeight) : measuredHeight;
                        constraintLayout = constraintLayout2;
                        int i15 = c24348OooO0o0.f82018OooOoO0;
                        if (i15 > 0) {
                            iMax2 = Math.min(i15, iMax2);
                        }
                        boolean z10 = z9;
                        if (!C24351OooOO0.OooO0O0(constraintLayout.mOptimizationLevel, 1)) {
                            if (z8 && z6) {
                                iMax = (int) ((iMax2 * c24348OooO0o0.f82042OoooOo0) + 0.5f);
                            } else if (z10 && z7) {
                                iMax2 = (int) ((iMax / c24348OooO0o0.f82042OoooOo0) + 0.5f);
                            }
                        }
                        if (measuredWidth == iMax && measuredHeight == iMax2) {
                            i = -1;
                            z = false;
                        } else {
                            if (measuredWidth != iMax) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                            }
                            if (measuredHeight != iMax2) {
                                iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                            c24348OooO0o0.f82028Oooo00o = iMakeMeasureSpec2;
                            c24348OooO0o0.f82025Oooo0 = iMakeMeasureSpec3;
                            z = false;
                            c24348OooO0o0.f82000OooO0oO = false;
                            iMax = view.getMeasuredWidth();
                            iMax2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            i = -1;
                        }
                    }
                    boolean z11 = baseline != i ? true : z;
                    oooO00o.f81820OooO = (iMax == oooO00o.f81823OooO0OO && iMax2 == oooO00o.f81824OooO0Oo) ? z : true;
                    if (oooO00o7.f63929Ooooo0o) {
                        z11 = true;
                    }
                    if (z11 && baseline != -1 && c24348OooO0o0.f82046Ooooo0o != baseline) {
                        oooO00o.f81820OooO = true;
                    }
                    oooO00o.f81826OooO0o0 = iMax;
                    oooO00o.f81825OooO0o = iMax2;
                    oooO00o.f81828OooO0oo = z11;
                    oooO00o.f81827OooO0oO = baseline;
                    ConstraintLayout.access$000(constraintLayout);
                    return;
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f63950OooO0o, i5, -2);
                boolean z12 = c24348OooO0o0.f82009OooOOo == 1;
                int i16 = oooO00o.f81829OooOO0;
                if (i16 == 1 || i16 == 2) {
                    boolean z13 = view.getMeasuredHeight() == c24348OooO0o0.OooOO0O();
                    if (oooO00o.f81829OooOO0 == 2 || !z12 || ((z12 && z13) || (view instanceof Placeholder) || c24348OooO0o0.OooOoOO())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c24348OooO0o0.OooOOo0(), 1073741824);
                    }
                }
            }
            iMakeMeasureSpec2 = iMakeMeasureSpec;
            iOrdinal = oooO00o3.ordinal();
            if (iOrdinal != 0) {
            }
            c24347OooO0o = (C24347OooO0o) c24348OooO0o0.f82054o000oOoO;
            if (c24347OooO0o == null) {
            }
            C24348OooO0o0.OooO00o oooO00o42 = C24348OooO0o0.OooO00o.f82065OooOoO0;
            if (oooO00o2 != oooO00o42) {
            }
            if (oooO00o3 != oooO00o42) {
            }
            C24348OooO0o0.OooO00o oooO00o52 = C24348OooO0o0.OooO00o.f82064OooOoO;
            C24348OooO0o0.OooO00o oooO00o62 = C24348OooO0o0.OooO00o.f82063OooOo0o;
            if (oooO00o3 != oooO00o52) {
            }
            if (oooO00o2 != oooO00o52) {
            }
            if (z4) {
            }
            if (z5) {
            }
            if (view != null) {
            }
        }
    }

    public interface OooO0OO {
        boolean OooO00o();
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C24347OooO0o();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new OooO0O0(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(null, 0, 0);
    }

    public static /* synthetic */ C24042OooO0o0 access$000(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        return null;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static C21627OooO0oO getSharedValues() {
        if (sSharedValues == null) {
            C21627OooO0oO c21627OooO0oO = new C21627OooO0oO();
            new SparseIntArray();
            c21627OooO0oO.f64154OooO00o = new HashMap<>();
            sSharedValues = c21627OooO0oO;
        }
        return sSharedValues;
    }

    private C24348OooO0o0 getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View viewFindViewById = this.mChildrenByIds.get(i);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.mLayoutWidget;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((OooO00o) viewFindViewById.getLayoutParams()).f63942o00ooo;
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        C24347OooO0o c24347OooO0o = this.mLayoutWidget;
        c24347OooO0o.f82050Oooooo = this;
        OooO0O0 oooO0O0 = this.mMeasurer;
        c24347OooO0o.f81990o0ooOOo = oooO0O0;
        c24347OooO0o.f81983o00oO0O.f81857OooO0o = oooO0O0;
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, OooO0o.f64131OooO0O0, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == 17) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == 14) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == 15) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == 113) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.OooO0OO oooO0OO = new androidx.constraintlayout.widget.OooO0OO();
                        this.mConstraintSet = oooO0OO;
                        oooO0OO.OooOO0o(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        C24347OooO0o c24347OooO0o2 = this.mLayoutWidget;
        c24347OooO0o2.f81974o000000O = this.mOptimizationLevel;
        C24041OooO0Oo.f80982OooOOo0 = c24347OooO0o2.OoooOOO(512);
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void setChildrenConstraints() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C24348OooO0o0 viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.OooOoo();
            }
        }
        if (zIsInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).f82053Ooooooo = resourceName;
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof Constraints)) {
                    this.mConstraintSet = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        androidx.constraintlayout.widget.OooO0OO oooO0OO = this.mConstraintSet;
        if (oooO0OO != null) {
            oooO0OO.OooO0OO(this);
        }
        this.mLayoutWidget.f82127oo000o.clear();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                ConstraintHelper constraintHelper = this.mConstraintHelpers.get(i4);
                if (constraintHelper.isInEditMode()) {
                    constraintHelper.setIds(constraintHelper.f63873OooOoo0);
                }
                C24342OooO c24342OooO = constraintHelper.f63869OooOoO;
                if (c24342OooO != null) {
                    c24342OooO.f81931o00oO0o = 0;
                    Arrays.fill(c24342OooO.f81932oo000o, (Object) null);
                    for (int i5 = 0; i5 < constraintHelper.f63867OooOo; i5++) {
                        int i6 = constraintHelper.f63868OooOo0o[i5];
                        View viewById = getViewById(i6);
                        if (viewById == null) {
                            Integer numValueOf = Integer.valueOf(i6);
                            HashMap<Integer, String> map = constraintHelper.f63875OooOooo;
                            String str = map.get(numValueOf);
                            int iOooO0oO = constraintHelper.OooO0oO(this, str);
                            if (iOooO0oO != 0) {
                                constraintHelper.f63868OooOo0o[i5] = iOooO0oO;
                                map.put(Integer.valueOf(iOooO0oO), str);
                                viewById = getViewById(iOooO0oO);
                            }
                        }
                        if (viewById != null) {
                            C24342OooO c24342OooO2 = constraintHelper.f63869OooOoO;
                            C24348OooO0o0 viewWidget2 = getViewWidget(viewById);
                            c24342OooO2.getClass();
                            if (viewWidget2 != c24342OooO2 && viewWidget2 != null) {
                                int i7 = c24342OooO2.f81931o00oO0o + 1;
                                C24348OooO0o0[] c24348OooO0o0Arr = c24342OooO2.f81932oo000o;
                                if (i7 > c24348OooO0o0Arr.length) {
                                    c24342OooO2.f81932oo000o = (C24348OooO0o0[]) Arrays.copyOf(c24348OooO0o0Arr, c24348OooO0o0Arr.length * 2);
                                }
                                C24348OooO0o0[] c24348OooO0o0Arr2 = c24342OooO2.f81932oo000o;
                                int i8 = c24342OooO2.f81931o00oO0o;
                                c24348OooO0o0Arr2[i8] = viewWidget2;
                                c24342OooO2.f81931o00oO0o = i8 + 1;
                            }
                        }
                    }
                    constraintHelper.f63869OooOoO.OoooO0O();
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt3 = getChildAt(i9);
            if (childAt3 instanceof Placeholder) {
                Placeholder placeholder = (Placeholder) childAt3;
                if (placeholder.f64166OooOo0o == -1 && !placeholder.isInEditMode()) {
                    placeholder.setVisibility(placeholder.f64167OooOoO0);
                }
                View viewFindViewById = findViewById(placeholder.f64166OooOo0o);
                placeholder.f64165OooOo = viewFindViewById;
                if (viewFindViewById != null) {
                    ((OooO00o) viewFindViewById.getLayoutParams()).f63932OooooOo = true;
                    placeholder.f64165OooOo.setVisibility(0);
                    placeholder.setVisibility(0);
                }
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt4 = getChildAt(i10);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt5 = getChildAt(i11);
            C24348OooO0o0 viewWidget3 = getViewWidget(childAt5);
            if (viewWidget3 != null) {
                OooO00o oooO00o = (OooO00o) childAt5.getLayoutParams();
                C24347OooO0o c24347OooO0o = this.mLayoutWidget;
                c24347OooO0o.f82127oo000o.add(viewWidget3);
                C24348OooO0o0 c24348OooO0o0 = viewWidget3.f82054o000oOoO;
                if (c24348OooO0o0 != null) {
                    ((C24354OooOOO0) c24348OooO0o0).f82127oo000o.remove(viewWidget3);
                    viewWidget3.OooOoo();
                }
                viewWidget3.f82054o000oOoO = c24347OooO0o;
                applyConstraintsFromLayoutParams(zIsInEditMode, childAt5, viewWidget3, oooO00o, this.mTempMapIdToWidget);
            }
        }
    }

    private void setWidgetBaseline(C24348OooO0o0 c24348OooO0o0, OooO00o oooO00o, SparseArray<C24348OooO0o0> sparseArray, int i, C24346OooO0Oo.OooO00o oooO00o2) {
        View view = this.mChildrenByIds.get(i);
        C24348OooO0o0 c24348OooO0o02 = sparseArray.get(i);
        if (c24348OooO0o02 == null || view == null || !(view.getLayoutParams() instanceof OooO00o)) {
            return;
        }
        oooO00o.f63929Ooooo0o = true;
        C24346OooO0Oo.OooO00o oooO00o3 = C24346OooO0Oo.OooO00o.f81967OooOoOO;
        if (oooO00o2 == oooO00o3) {
            OooO00o oooO00o4 = (OooO00o) view.getLayoutParams();
            oooO00o4.f63929Ooooo0o = true;
            oooO00o4.f63942o00ooo.f82023OooOooo = true;
        }
        c24348OooO0o0.OooO(oooO00o3).OooO0O0(c24348OooO0o02.OooO(oooO00o2), oooO00o.f63905OooOooO, oooO00o.f63903OooOoo, true);
        c24348OooO0o0.f82023OooOooo = true;
        c24348OooO0o0.OooO(C24346OooO0Oo.OooO00o.f81963OooOo).OooOO0();
        c24348OooO0o0.OooO(C24346OooO0Oo.OooO00o.f81965OooOoO).OooOO0();
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            setChildrenConstraints();
        }
        return z;
    }

    public void addValueModifier(OooO0OO oooO0OO) {
        if (this.mModifiers == null) {
            this.mModifiers = new ArrayList<>();
        }
        this.mModifiers.add(oooO0OO);
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:164:0x02de -> B:165:0x02df). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void applyConstraintsFromLayoutParams(boolean z, View view, C24348OooO0o0 c24348OooO0o0, OooO00o oooO00o, SparseArray<C24348OooO0o0> sparseArray) {
        ConstraintLayout constraintLayout;
        int i;
        C24346OooO0Oo.OooO00o oooO00o2;
        float f;
        C24348OooO0o0 c24348OooO0o02;
        C24346OooO0Oo.OooO00o oooO00o3;
        C24346OooO0Oo.OooO00o oooO00o4;
        C24346OooO0Oo.OooO00o oooO00o5;
        C24348OooO0o0 c24348OooO0o03;
        C24346OooO0Oo.OooO00o oooO00o6;
        int i2;
        C24346OooO0Oo.OooO00o oooO00o7;
        C24348OooO0o0 c24348OooO0o04;
        C24346OooO0Oo.OooO00o oooO00o8;
        C24346OooO0Oo.OooO00o oooO00o9;
        int i3;
        C24346OooO0Oo.OooO00o oooO00o10;
        C24348OooO0o0 c24348OooO0o05;
        int i4;
        OooO00o oooO00o11;
        C24348OooO0o0 c24348OooO0o06;
        C24346OooO0Oo.OooO00o oooO00o12;
        float f2;
        int i5;
        float fAbs;
        int i6;
        float f3;
        C24348OooO0o0 c24348OooO0o07 = c24348OooO0o0;
        oooO00o.OooO00o();
        c24348OooO0o07.f82052OoooooO = view.getVisibility();
        if (oooO00o.f63932OooooOo) {
            c24348OooO0o07.f82026Oooo000 = true;
            c24348OooO0o07.f82052OoooooO = 8;
        }
        c24348OooO0o07.f82050Oooooo = view;
        if (view instanceof ConstraintHelper) {
            constraintLayout = this;
            ((ConstraintHelper) view).OooOO0(c24348OooO0o07, constraintLayout.mLayoutWidget.f81991o0ooOoO);
        } else {
            constraintLayout = this;
        }
        int i7 = -1;
        if (oooO00o.f63930OooooO0) {
            C24350OooO0oo c24350OooO0oo = (C24350OooO0oo) c24348OooO0o07;
            int i8 = oooO00o.f63939o00Oo0;
            int i9 = oooO00o.f63940o00Ooo;
            float f4 = oooO00o.f63941o00o0O;
            if (f4 != -1.0f) {
                if (f4 > -1.0f) {
                    c24350OooO0oo.f82114oo000o = f4;
                    c24350OooO0oo.f82110o00oO0o = -1;
                    c24350OooO0oo.f82109o00oO0O = -1;
                    return;
                }
                return;
            }
            if (i8 != -1) {
                if (i8 > -1) {
                    c24350OooO0oo.f82114oo000o = -1.0f;
                    c24350OooO0oo.f82110o00oO0o = i8;
                    c24350OooO0oo.f82109o00oO0O = -1;
                    return;
                }
                return;
            }
            if (i9 == -1 || i9 <= -1) {
                return;
            }
            c24350OooO0oo.f82114oo000o = -1.0f;
            c24350OooO0oo.f82110o00oO0o = -1;
            c24350OooO0oo.f82109o00oO0O = i9;
            return;
        }
        int i10 = oooO00o.f63934Oooooo0;
        int i11 = oooO00o.f63933Oooooo;
        int i12 = oooO00o.f63935OoooooO;
        int i13 = oooO00o.f63936Ooooooo;
        int i14 = oooO00o.f63943o0OoOo0;
        int i15 = oooO00o.f63944ooOO;
        float f5 = oooO00o.f63938o00O0O;
        int i16 = oooO00o.f63891OooOOOo;
        C24346OooO0Oo.OooO00o oooO00o13 = C24346OooO0Oo.OooO00o.f81966OooOoO0;
        C24346OooO0Oo.OooO00o oooO00o14 = C24346OooO0Oo.OooO00o.f81964OooOo0o;
        C24346OooO0Oo.OooO00o oooO00o15 = C24346OooO0Oo.OooO00o.f81965OooOoO;
        C24346OooO0Oo.OooO00o oooO00o16 = C24346OooO0Oo.OooO00o.f81963OooOo;
        if (i16 != -1) {
            C24348OooO0o0 c24348OooO0o08 = sparseArray.get(i16);
            if (c24348OooO0o08 != null) {
                float f6 = oooO00o.f63892OooOOo;
                int i17 = oooO00o.f63893OooOOo0;
                C24346OooO0Oo.OooO00o oooO00o17 = C24346OooO0Oo.OooO00o.f81969OooOoo0;
                f3 = 0.0f;
                c24348OooO0o0.OooOo0O(oooO00o17, c24348OooO0o08, oooO00o17, i17, 0);
                c24348OooO0o07 = c24348OooO0o0;
                c24348OooO0o07.f82022OooOooO = f6;
            } else {
                f3 = 0.0f;
            }
            c24348OooO0o06 = c24348OooO0o07;
            oooO00o11 = oooO00o;
            i = 1;
            f = f3;
            oooO00o6 = oooO00o13;
            oooO00o5 = oooO00o14;
            oooO00o12 = oooO00o15;
            oooO00o10 = oooO00o16;
        } else {
            if (i10 != -1) {
                C24348OooO0o0 c24348OooO0o09 = sparseArray.get(i10);
                if (c24348OooO0o09 != null) {
                    i = 1;
                    f = 0.0f;
                    oooO00o2 = oooO00o14;
                    c24348OooO0o07.OooOo0O(oooO00o2, c24348OooO0o09, oooO00o14, ((ViewGroup.MarginLayoutParams) oooO00o).leftMargin, i14);
                } else {
                    i = 1;
                    oooO00o2 = oooO00o14;
                    f = 0.0f;
                }
            } else {
                i = 1;
                oooO00o2 = oooO00o14;
                f = 0.0f;
                if (i11 != -1 && (c24348OooO0o02 = sparseArray.get(i11)) != null) {
                    c24348OooO0o0.OooOo0O(oooO00o2, c24348OooO0o02, oooO00o13, ((ViewGroup.MarginLayoutParams) oooO00o).leftMargin, i14);
                    oooO00o3 = oooO00o2;
                    oooO00o4 = oooO00o13;
                }
                if (i12 == -1) {
                    C24348OooO0o0 c24348OooO0o010 = sparseArray.get(i12);
                    if (c24348OooO0o010 != null) {
                        c24348OooO0o0.OooOo0O(oooO00o4, c24348OooO0o010, oooO00o3, ((ViewGroup.MarginLayoutParams) oooO00o).rightMargin, i15);
                    }
                    oooO00o5 = oooO00o3;
                } else {
                    oooO00o5 = oooO00o3;
                    if (i13 != -1 && (c24348OooO0o03 = sparseArray.get(i13)) != null) {
                        c24348OooO0o0.OooOo0O(oooO00o4, c24348OooO0o03, oooO00o4, ((ViewGroup.MarginLayoutParams) oooO00o).rightMargin, i15);
                    }
                }
                oooO00o6 = oooO00o4;
                i2 = oooO00o.f63876OooO;
                if (i2 == -1) {
                    C24348OooO0o0 c24348OooO0o011 = sparseArray.get(i2);
                    if (c24348OooO0o011 != null) {
                        oooO00o7 = oooO00o16;
                        c24348OooO0o0.OooOo0O(oooO00o7, c24348OooO0o011, oooO00o16, ((ViewGroup.MarginLayoutParams) oooO00o).topMargin, oooO00o.f63895OooOo);
                    } else {
                        oooO00o7 = oooO00o16;
                    }
                } else {
                    oooO00o7 = oooO00o16;
                    int i18 = oooO00o.f63885OooOO0;
                    if (i18 != -1 && (c24348OooO0o04 = sparseArray.get(i18)) != null) {
                        c24348OooO0o0.OooOo0O(oooO00o7, c24348OooO0o04, oooO00o15, ((ViewGroup.MarginLayoutParams) oooO00o).topMargin, oooO00o.f63895OooOo);
                        oooO00o8 = oooO00o7;
                        oooO00o9 = oooO00o15;
                    }
                    i3 = oooO00o.f63886OooOO0O;
                    if (i3 != -1) {
                        C24348OooO0o0 c24348OooO0o012 = sparseArray.get(i3);
                        if (c24348OooO0o012 != null) {
                            c24348OooO0o0.OooOo0O(oooO00o9, c24348OooO0o012, oooO00o8, ((ViewGroup.MarginLayoutParams) oooO00o).bottomMargin, oooO00o.f63900OooOoO);
                        }
                        oooO00o10 = oooO00o8;
                    } else {
                        oooO00o10 = oooO00o8;
                        int i19 = oooO00o.f63887OooOO0o;
                        if (i19 != -1 && (c24348OooO0o05 = sparseArray.get(i19)) != null) {
                            c24348OooO0o0.OooOo0O(oooO00o9, c24348OooO0o05, oooO00o9, ((ViewGroup.MarginLayoutParams) oooO00o).bottomMargin, oooO00o.f63900OooOoO);
                        }
                    }
                    C24346OooO0Oo.OooO00o oooO00o18 = oooO00o9;
                    i4 = oooO00o.f63889OooOOO0;
                    if (i4 != -1) {
                        oooO00o11 = oooO00o;
                        constraintLayout.setWidgetBaseline(c24348OooO0o0, oooO00o11, sparseArray, i4, C24346OooO0Oo.OooO00o.f81967OooOoOO);
                    } else {
                        oooO00o11 = oooO00o;
                        int i20 = oooO00o11.f63888OooOOO;
                        if (i20 != -1) {
                            setWidgetBaseline(c24348OooO0o0, oooO00o11, sparseArray, i20, oooO00o10);
                        } else {
                            int i21 = oooO00o11.f63890OooOOOO;
                            if (i21 != -1) {
                                setWidgetBaseline(c24348OooO0o0, oooO00o11, sparseArray, i21, oooO00o18);
                                c24348OooO0o06 = c24348OooO0o0;
                                oooO00o12 = oooO00o18;
                            }
                            if (f5 >= f) {
                                c24348OooO0o06.f82049OooooOo = f5;
                            }
                            f2 = oooO00o11.f63909Oooo000;
                            if (f2 >= f) {
                                c24348OooO0o06.f82051Oooooo0 = f2;
                            }
                        }
                    }
                    c24348OooO0o06 = c24348OooO0o0;
                    oooO00o12 = oooO00o18;
                    if (f5 >= f) {
                    }
                    f2 = oooO00o11.f63909Oooo000;
                    if (f2 >= f) {
                    }
                }
                oooO00o8 = oooO00o7;
                oooO00o9 = oooO00o15;
                i3 = oooO00o.f63886OooOO0O;
                if (i3 != -1) {
                }
                C24346OooO0Oo.OooO00o oooO00o182 = oooO00o9;
                i4 = oooO00o.f63889OooOOO0;
                if (i4 != -1) {
                }
                c24348OooO0o06 = c24348OooO0o0;
                oooO00o12 = oooO00o182;
                if (f5 >= f) {
                }
                f2 = oooO00o11.f63909Oooo000;
                if (f2 >= f) {
                }
            }
            oooO00o3 = oooO00o2;
            oooO00o4 = oooO00o13;
            if (i12 == -1) {
            }
            oooO00o6 = oooO00o4;
            i2 = oooO00o.f63876OooO;
            if (i2 == -1) {
            }
            oooO00o8 = oooO00o7;
            oooO00o9 = oooO00o15;
            i3 = oooO00o.f63886OooOO0O;
            if (i3 != -1) {
            }
            C24346OooO0Oo.OooO00o oooO00o1822 = oooO00o9;
            i4 = oooO00o.f63889OooOOO0;
            if (i4 != -1) {
            }
            c24348OooO0o06 = c24348OooO0o0;
            oooO00o12 = oooO00o1822;
            if (f5 >= f) {
            }
            f2 = oooO00o11.f63909Oooo000;
            if (f2 >= f) {
            }
        }
        if (z && ((i6 = oooO00o11.f63918OoooO) != -1 || oooO00o11.f63922OoooOO0 != -1)) {
            int i22 = oooO00o11.f63922OoooOO0;
            c24348OooO0o06.f82044OoooOoo = i6;
            c24348OooO0o06.f82045Ooooo00 = i22;
        }
        boolean z2 = oooO00o11.f63927OoooOoo;
        C24348OooO0o0.OooO00o oooO00o19 = C24348OooO0o0.OooO00o.f82062OooOo;
        C24348OooO0o0.OooO00o oooO00o20 = C24348OooO0o0.OooO00o.f82063OooOo0o;
        C24348OooO0o0.OooO00o oooO00o21 = C24348OooO0o0.OooO00o.f82064OooOoO;
        C24348OooO0o0.OooO00o oooO00o22 = C24348OooO0o0.OooO00o.f82065OooOoO0;
        if (z2) {
            c24348OooO0o06.Oooo0o(oooO00o20);
            c24348OooO0o06.Oooo0oo(((ViewGroup.MarginLayoutParams) oooO00o11).width);
            if (((ViewGroup.MarginLayoutParams) oooO00o11).width == -2) {
                c24348OooO0o06.Oooo0o(oooO00o19);
            }
        } else if (((ViewGroup.MarginLayoutParams) oooO00o11).width == -1) {
            if (oooO00o11.f63923OoooOOO) {
                c24348OooO0o06.Oooo0o(oooO00o22);
            } else {
                c24348OooO0o06.Oooo0o(oooO00o21);
            }
            c24348OooO0o06.OooO(oooO00o5).f81961OooO0oO = ((ViewGroup.MarginLayoutParams) oooO00o11).leftMargin;
            c24348OooO0o06.OooO(oooO00o6).f81961OooO0oO = ((ViewGroup.MarginLayoutParams) oooO00o11).rightMargin;
        } else {
            c24348OooO0o06.Oooo0o(oooO00o22);
            c24348OooO0o06.Oooo0oo(0);
        }
        if (oooO00o11.f63928Ooooo00) {
            c24348OooO0o06.Oooo0oO(oooO00o20);
            c24348OooO0o06.Oooo0o0(((ViewGroup.MarginLayoutParams) oooO00o11).height);
            if (((ViewGroup.MarginLayoutParams) oooO00o11).height == -2) {
                c24348OooO0o06.Oooo0oO(oooO00o19);
            }
        } else if (((ViewGroup.MarginLayoutParams) oooO00o11).height == -1) {
            if (oooO00o11.f63924OoooOOo) {
                c24348OooO0o06.Oooo0oO(oooO00o22);
            } else {
                c24348OooO0o06.Oooo0oO(oooO00o21);
            }
            c24348OooO0o06.OooO(oooO00o10).f81961OooO0oO = ((ViewGroup.MarginLayoutParams) oooO00o11).topMargin;
            c24348OooO0o06.OooO(oooO00o12).f81961OooO0oO = ((ViewGroup.MarginLayoutParams) oooO00o11).bottomMargin;
        } else {
            c24348OooO0o06.Oooo0oO(oooO00o22);
            c24348OooO0o06.Oooo0o0(0);
        }
        String str = oooO00o11.f63910Oooo00O;
        if (str == null || str.length() == 0) {
            c24348OooO0o06.f82042OoooOo0 = f;
        } else {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                i5 = 0;
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i7 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i7 = i;
                }
                i5 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i5);
                fAbs = strSubstring2.length() > 0 ? Float.parseFloat(strSubstring2) : f;
                if (fAbs > f) {
                    c24348OooO0o06.f82042OoooOo0 = fAbs;
                    c24348OooO0o06.f82043OoooOoO = i7;
                }
            } else {
                String strSubstring3 = str.substring(i5, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                    float f7 = Float.parseFloat(strSubstring3);
                    float f8 = Float.parseFloat(strSubstring4);
                    if (f7 > f && f8 > f) {
                        fAbs = i7 == i ? Math.abs(f8 / f7) : Math.abs(f7 / f8);
                    }
                    if (fAbs > f) {
                    }
                }
            }
        }
        float f9 = oooO00o11.f63911Oooo00o;
        float[] fArr = c24348OooO0o06.f82055o00O0O;
        fArr[0] = f9;
        fArr[1] = oooO00o11.f63908Oooo0;
        c24348OooO0o06.f82060o0OoOo0 = oooO00o11.f63912Oooo0O0;
        c24348OooO0o06.f82061ooOO = oooO00o11.f63913Oooo0OO;
        int i23 = oooO00o11.f63926OoooOoO;
        if (i23 >= 0 && i23 <= 3) {
            c24348OooO0o06.f82010OooOOo0 = i23;
        }
        int i24 = oooO00o11.f63915Oooo0o0;
        int i25 = oooO00o11.f63916Oooo0oO;
        int i26 = oooO00o11.f63907Oooo;
        float f10 = oooO00o11.f63919OoooO0;
        c24348OooO0o06.f82009OooOOo = i24;
        c24348OooO0o06.f82013OooOo0 = i25;
        if (i26 == Integer.MAX_VALUE) {
            i26 = 0;
        }
        c24348OooO0o06.f82015OooOo0O = i26;
        c24348OooO0o06.f82016OooOo0o = f10;
        if (f10 > f && f10 < 1.0f && i24 == 0) {
            c24348OooO0o06.f82009OooOOo = 2;
        }
        int i27 = oooO00o11.f63914Oooo0o;
        int i28 = oooO00o11.f63917Oooo0oo;
        int i29 = oooO00o11.f63920OoooO00;
        float f11 = oooO00o11.f63921OoooO0O;
        c24348OooO0o06.f82011OooOOoo = i27;
        c24348OooO0o06.f82012OooOo = i28;
        c24348OooO0o06.f82018OooOoO0 = i29 != Integer.MAX_VALUE ? i29 : 0;
        c24348OooO0o06.f82017OooOoO = f11;
        if (f11 <= f || f11 >= 1.0f || i27 != 0) {
            return;
        }
        c24348OooO0o06.f82011OooOOoo = 2;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof OooO00o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).OooOO0o(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(SupportMenu.CATEGORY_MASK);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public boolean dynamicUpdateConstraints(int i, int i2) {
        boolean zOooO00o = false;
        if (this.mModifiers == null) {
            return false;
        }
        View.MeasureSpec.getSize(i);
        View.MeasureSpec.getSize(i2);
        for (OooO0OO oooO0OO : this.mModifiers) {
            Iterator<C24348OooO0o0> it = this.mLayoutWidget.f82127oo000o.iterator();
            while (it.hasNext()) {
                View view = it.next().f82050Oooooo;
                view.getId();
                zOooO00o |= oooO0OO.OooO00o();
            }
        }
        return zOooO00o;
    }

    public void fillMetrics(C24042OooO0o0 c24042OooO0o0) {
        this.mLayoutWidget.f81987o0OOO0o.getClass();
    }

    @Override // android.view.View
    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.mDesignIds;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.f81974o000000O;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.mLayoutWidget.f82002OooOO0 == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.mLayoutWidget.f82002OooOO0 = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.mLayoutWidget.f82002OooOO0 = "parent";
            }
        }
        C24347OooO0o c24347OooO0o = this.mLayoutWidget;
        if (c24347OooO0o.f82053Ooooooo == null) {
            c24347OooO0o.f82053Ooooooo = c24347OooO0o.f82002OooOO0;
            Log.v(TAG, " setDebugName " + this.mLayoutWidget.f82053Ooooooo);
        }
        for (C24348OooO0o0 c24348OooO0o0 : this.mLayoutWidget.f82127oo000o) {
            View view = c24348OooO0o0.f82050Oooooo;
            if (view != null) {
                if (c24348OooO0o0.f82002OooOO0 == null && (id = view.getId()) != -1) {
                    c24348OooO0o0.f82002OooOO0 = getContext().getResources().getResourceEntryName(id);
                }
                if (c24348OooO0o0.f82053Ooooooo == null) {
                    c24348OooO0o0.f82053Ooooooo = c24348OooO0o0.f82002OooOO0;
                    Log.v(TAG, " setDebugName " + c24348OooO0o0.f82053Ooooooo);
                }
            }
        }
        this.mLayoutWidget.OooOOO(sb);
        return sb.toString();
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final C24348OooO0o0 getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof OooO00o) {
            return ((OooO00o) view.getLayoutParams()).f63942o00ooo;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof OooO00o) {
            return ((OooO00o) view.getLayoutParams()).f63942o00ooo;
        }
        return null;
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i) {
        if (i == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.OooO0O0(getContext(), this, i);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            OooO00o oooO00o = (OooO00o) childAt.getLayoutParams();
            C24348OooO0o0 c24348OooO0o0 = oooO00o.f63942o00ooo;
            if ((childAt.getVisibility() != 8 || oooO00o.f63930OooooO0 || oooO00o.f63931OooooOO || zIsInEditMode) && !oooO00o.f63932OooooOo) {
                int iOooOOo = c24348OooO0o0.OooOOo();
                int iOooOOoo = c24348OooO0o0.OooOOoo();
                int iOooOOo0 = c24348OooO0o0.OooOOo0() + iOooOOo;
                int iOooOO0O = c24348OooO0o0.OooOO0O() + iOooOOoo;
                childAt.layout(iOooOOo, iOooOOoo, iOooOOo0, iOooOO0O);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iOooOOo, iOooOOoo, iOooOOo0, iOooOO0O);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).OooOO0O();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean zDynamicUpdateConstraints = this.mDirtyHierarchy | dynamicUpdateConstraints(i, i2);
        this.mDirtyHierarchy = zDynamicUpdateConstraints;
        if (!zDynamicUpdateConstraints) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                if (getChildAt(i3).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
                i3++;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.f81991o0ooOoO = isRtl();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                C24347OooO0o c24347OooO0o = this.mLayoutWidget;
                c24347OooO0o.f81984o00oO0o.OooO0OO(c24347OooO0o);
            }
        }
        this.mLayoutWidget.f81987o0OOO0o.getClass();
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        int iOooOOo0 = this.mLayoutWidget.OooOOo0();
        int iOooOO0O = this.mLayoutWidget.OooOO0O();
        C24347OooO0o c24347OooO0o2 = this.mLayoutWidget;
        resolveMeasuredDimension(i, i2, iOooOOo0, iOooOO0O, c24347OooO0o2.f81975o000000o, c24347OooO0o2.f81972o00000);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C24348OooO0o0 viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof C24350OooO0oo)) {
            OooO00o oooO00o = (OooO00o) view.getLayoutParams();
            C24350OooO0oo c24350OooO0oo = new C24350OooO0oo();
            oooO00o.f63942o00ooo = c24350OooO0oo;
            oooO00o.f63930OooooO0 = true;
            c24350OooO0oo.OoooO0O(oooO00o.f63937o000oOoO);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.OooOOO0();
            ((OooO00o) view.getLayoutParams()).f63931OooooOO = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        C24348OooO0o0 viewWidget = getViewWidget(view);
        this.mLayoutWidget.f82127oo000o.remove(viewWidget);
        viewWidget.OooOoo();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.OooO0O0(getContext(), this, i);
    }

    public void removeValueModifier(OooO0OO oooO0OO) {
        if (oooO0OO == null) {
            return;
        }
        this.mModifiers.remove(oooO0OO);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        OooO0O0 oooO0O0 = this.mMeasurer;
        int i5 = oooO0O0.f63951OooO0o0;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + oooO0O0.f63949OooO0Oo, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int iMin = Math.min(this.mMaxWidth, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.mMaxHeight, iResolveSizeAndState2);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100 A[PHI: r6 r7
      0x0100: PHI (r6v3 int) = (r6v2 int), (r6v28 int) binds: [B:18:0x009d, B:353:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x0100: PHI (r7v1 int) = (r7v0 int), (r7v57 int) binds: [B:18:0x009d, B:353:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void resolveSystem(C24347OooO0o c24347OooO0o, int i, int i2, int i3) {
        C24309OooO0O0 c24309OooO0O0;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C24309OooO0O0.InterfaceC19609OooO0O0 interfaceC19609OooO0O0;
        int i10;
        int i11;
        boolean zOoooOO0;
        int i12;
        int size;
        int i13;
        C24346OooO0Oo.OooO00o oooO00o;
        C24346OooO0Oo.OooO00o oooO00o2;
        ArrayList<C24348OooO0o0> arrayList;
        int i14;
        int i15;
        boolean z;
        int i16;
        C24309OooO0O0.InterfaceC19609OooO0O0 interfaceC19609OooO0O02;
        int i17;
        boolean z2;
        C24318OooOO0o c24318OooOO0o;
        C24319OooOOO c24319OooOOO;
        boolean z3;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z4;
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size3 = View.MeasureSpec.getSize(i3);
        int i23 = 0;
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i24 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        OooO0O0 oooO0O0 = this.mMeasurer;
        oooO0O0.f63947OooO0O0 = iMax;
        oooO0O0.f63948OooO0OO = iMax2;
        oooO0O0.f63949OooO0Oo = paddingWidth;
        oooO0O0.f63951OooO0o0 = i24;
        oooO0O0.f63950OooO0o = i2;
        oooO0O0.f63952OooO0oO = i3;
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (!isRtl()) {
            }
            int i25 = size2 - paddingWidth;
            int i26 = size3 - i24;
            setSelfDimensionBehaviour(c24347OooO0o, mode, i25, mode2, i26);
            c24347OooO0o.f81988o0Oo0oo = iMax4;
            c24347OooO0o.f81986o0OO00O = iMax;
            c24309OooO0O0 = c24347OooO0o.f81984o00oO0o;
            c24309OooO0O0.getClass();
            C24309OooO0O0.InterfaceC19609OooO0O0 interfaceC19609OooO0O03 = c24347OooO0o.f81990o0ooOOo;
            int size4 = c24347OooO0o.f82127oo000o.size();
            int iOooOOo0 = c24347OooO0o.OooOOo0();
            int iOooOO0O = c24347OooO0o.OooOO0O();
            boolean zOooO0O0 = C24351OooOO0.OooO0O0(i, 128);
            i4 = (!zOooO0O0 || C24351OooOO0.OooO0O0(i, 64)) ? 1 : 0;
            C24348OooO0o0.OooO00o oooO00o3 = C24348OooO0o0.OooO00o.f82065OooOoO0;
            if (i4 == 0) {
                int i27 = 0;
                while (i27 < size4) {
                    i5 = i23;
                    C24348OooO0o0 c24348OooO0o0 = c24347OooO0o.f82127oo000o.get(i27);
                    i6 = 1;
                    C24348OooO0o0.OooO00o[] oooO00oArr = c24348OooO0o0.f82039OoooOO0;
                    int i28 = i4;
                    int i29 = ((oooO00oArr[i5] == oooO00o3 ? 1 : i5) == 0 || (oooO00oArr[1] == oooO00o3 ? 1 : i5) == 0 || c24348OooO0o0.f82042OoooOo0 <= 0.0f) ? i5 : 1;
                    if ((c24348OooO0o0.OooOo() && i29 != 0) || ((c24348OooO0o0.OooOoO0() && i29 != 0) || (c24348OooO0o0 instanceof C24353OooOO0o) || c24348OooO0o0.OooOo() || c24348OooO0o0.OooOoO0())) {
                        i7 = i5;
                        break;
                    } else {
                        i27++;
                        i4 = i28;
                        i23 = i5;
                    }
                }
                i5 = i23;
                i6 = 1;
                i7 = i4;
            } else {
                i5 = i23;
                i6 = 1;
                i7 = i4;
            }
            i8 = i7 & (((mode == 1073741824 || mode2 != 1073741824) && !zOooO0O0) ? i5 : i6);
            C24348OooO0o0.OooO00o oooO00o4 = C24348OooO0o0.OooO00o.f82063OooOo0o;
            C24348OooO0o0.OooO00o oooO00o5 = C24348OooO0o0.OooO00o.f82062OooOo;
            if (i8 == 0) {
                int[] iArr = c24347OooO0o.f82020OooOoo;
                i9 = i8;
                int iMin = Math.min(iArr[i5], i25);
                int iMin2 = Math.min(iArr[i6], i26);
                if (mode != 1073741824 || c24347OooO0o.OooOOo0() == iMin) {
                    z3 = i6;
                } else {
                    c24347OooO0o.Oooo0oo(iMin);
                    boolean z5 = i6;
                    c24347OooO0o.f81983o00oO0O.f81854OooO0O0 = z5;
                    z3 = z5;
                }
                if (mode2 == 1073741824 && c24347OooO0o.OooOO0O() != iMin2) {
                    c24347OooO0o.Oooo0o0(iMin2);
                    c24347OooO0o.f81983o00oO0O.f81854OooO0O0 = z3;
                }
                C24313OooO0o0 c24313OooO0o0 = c24347OooO0o.f81983o00oO0O;
                if (mode == 1073741824 && mode2 == 1073741824) {
                    boolean z6 = c24313OooO0o0.f81854OooO0O0;
                    C24347OooO0o c24347OooO0o2 = c24313OooO0o0.f81853OooO00o;
                    if (z6 || c24313OooO0o0.f81855OooO0OO) {
                        Iterator<C24348OooO0o0> it = c24347OooO0o2.f82127oo000o.iterator();
                        while (it.hasNext()) {
                            C24348OooO0o0 next = it.next();
                            next.OooO0oo();
                            next.f81994OooO00o = i5;
                            next.f81997OooO0Oo.OooOOO();
                            next.f81999OooO0o0.OooOOO0();
                            it = it;
                            i5 = 0;
                        }
                        c24347OooO0o2.OooO0oo();
                        i20 = 0;
                        c24347OooO0o2.f81994OooO00o = false;
                        c24347OooO0o2.f81997OooO0Oo.OooOOO();
                        c24347OooO0o2.f81999OooO0o0.OooOOO0();
                        c24313OooO0o0.f81855OooO0OO = false;
                    } else {
                        i20 = i5;
                    }
                    c24313OooO0o0.OooO0O0(c24313OooO0o0.f81856OooO0Oo);
                    c24347OooO0o2.f82044OoooOoo = i20;
                    c24347OooO0o2.f82045Ooooo00 = i20;
                    C24348OooO0o0.OooO00o oooO00oOooOO0 = c24347OooO0o2.OooOO0(i20);
                    i10 = size4;
                    C24348OooO0o0.OooO00o oooO00oOooOO02 = c24347OooO0o2.OooOO0(1);
                    if (c24313OooO0o0.f81854OooO0O0) {
                        c24313OooO0o0.OooO0OO();
                    }
                    int iOooOOo = c24347OooO0o2.OooOOo();
                    interfaceC19609OooO0O0 = interfaceC19609OooO0O03;
                    int iOooOOoo = c24347OooO0o2.OooOOoo();
                    i11 = iOooOOo0;
                    c24347OooO0o2.f81997OooO0Oo.f81882OooO0oo.OooO0Oo(iOooOOo);
                    c24347OooO0o2.f81999OooO0o0.f81882OooO0oo.OooO0Oo(iOooOOoo);
                    c24313OooO0o0.OooO0oO();
                    ArrayList<AbstractC24322OooOOOo> arrayList2 = c24313OooO0o0.f81858OooO0o0;
                    if (oooO00oOooOO0 == oooO00o5 || oooO00oOooOO02 == oooO00o5) {
                        if (zOooO0O0) {
                            Iterator<AbstractC24322OooOOOo> it2 = arrayList2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().OooOO0O()) {
                                        zOooO0O0 = false;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        if (zOooO0O0 && oooO00oOooOO0 == oooO00o5) {
                            c24347OooO0o2.Oooo0o(oooO00o4);
                            i21 = iOooOOo;
                            i22 = iOooOOoo;
                            c24347OooO0o2.Oooo0oo(c24313OooO0o0.OooO0Oo(c24347OooO0o2, 0));
                            c24347OooO0o2.f81997OooO0Oo.f81880OooO0o0.OooO0Oo(c24347OooO0o2.OooOOo0());
                        } else {
                            i21 = iOooOOo;
                            i22 = iOooOOoo;
                        }
                        if (zOooO0O0 && oooO00oOooOO02 == oooO00o5) {
                            c24347OooO0o2.Oooo0oO(oooO00o4);
                            c24347OooO0o2.Oooo0o0(c24313OooO0o0.OooO0Oo(c24347OooO0o2, 1));
                            c24347OooO0o2.f81999OooO0o0.f81880OooO0o0.OooO0Oo(c24347OooO0o2.OooOO0O());
                        }
                    } else {
                        i21 = iOooOOo;
                        i22 = iOooOOoo;
                    }
                    C24348OooO0o0.OooO00o[] oooO00oArr2 = c24347OooO0o2.f82039OoooOO0;
                    C24348OooO0o0.OooO00o oooO00o6 = oooO00oArr2[0];
                    C24348OooO0o0.OooO00o oooO00o7 = C24348OooO0o0.OooO00o.f82064OooOoO;
                    if (oooO00o6 == oooO00o4 || oooO00o6 == oooO00o7) {
                        int iOooOOo02 = c24347OooO0o2.OooOOo0() + i21;
                        c24347OooO0o2.f81997OooO0Oo.f81874OooO.OooO0Oo(iOooOOo02);
                        c24347OooO0o2.f81997OooO0Oo.f81880OooO0o0.OooO0Oo(iOooOOo02 - i21);
                        c24313OooO0o0.OooO0oO();
                        C24348OooO0o0.OooO00o oooO00o8 = oooO00oArr2[1];
                        if (oooO00o8 == oooO00o4 || oooO00o8 == oooO00o7) {
                            int iOooOO0O2 = c24347OooO0o2.OooOO0O() + i22;
                            c24347OooO0o2.f81999OooO0o0.f81874OooO.OooO0Oo(iOooOO0O2);
                            c24347OooO0o2.f81999OooO0o0.f81880OooO0o0.OooO0Oo(iOooOO0O2 - i22);
                        }
                        c24313OooO0o0.OooO0oO();
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    for (AbstractC24322OooOOOo abstractC24322OooOOOo : arrayList2) {
                        if (abstractC24322OooOOOo.f81876OooO0O0 != c24347OooO0o2 || abstractC24322OooOOOo.f81881OooO0oO) {
                            abstractC24322OooOOOo.OooO0o0();
                        }
                    }
                    for (AbstractC24322OooOOOo abstractC24322OooOOOo2 : arrayList2) {
                        if (z4 || abstractC24322OooOOOo2.f81876OooO0O0 != c24347OooO0o2) {
                            if (!abstractC24322OooOOOo2.f81882OooO0oo.f81841OooOO0 || ((!abstractC24322OooOOOo2.f81874OooO.f81841OooOO0 && !(abstractC24322OooOOOo2 instanceof C24316OooOO0)) || (!abstractC24322OooOOOo2.f81880OooO0o0.f81841OooOO0 && !(abstractC24322OooOOOo2 instanceof C24310OooO0OO) && !(abstractC24322OooOOOo2 instanceof C24316OooOO0)))) {
                                zOoooOO0 = false;
                                break;
                            }
                        }
                    }
                    zOoooOO0 = true;
                    c24347OooO0o2.Oooo0o(oooO00oOooOO0);
                    c24347OooO0o2.Oooo0oO(oooO00oOooOO02);
                    i12 = 2;
                    i19 = 1073741824;
                } else {
                    interfaceC19609OooO0O0 = interfaceC19609OooO0O03;
                    i10 = size4;
                    i11 = iOooOOo0;
                    boolean z7 = c24313OooO0o0.f81854OooO0O0;
                    C24347OooO0o c24347OooO0o3 = c24313OooO0o0.f81853OooO00o;
                    if (z7) {
                        for (C24348OooO0o0 c24348OooO0o02 : c24347OooO0o3.f82127oo000o) {
                            c24348OooO0o02.OooO0oo();
                            c24348OooO0o02.f81994OooO00o = false;
                            C24318OooOO0o c24318OooOO0o2 = c24348OooO0o02.f81997OooO0Oo;
                            c24318OooOO0o2.f81880OooO0o0.f81841OooOO0 = false;
                            c24318OooOO0o2.f81881OooO0oO = false;
                            c24318OooOO0o2.OooOOO();
                            C24319OooOOO c24319OooOOO2 = c24348OooO0o02.f81999OooO0o0;
                            c24319OooOOO2.f81880OooO0o0.f81841OooOO0 = false;
                            c24319OooOOO2.f81881OooO0oO = false;
                            c24319OooOOO2.OooOOO0();
                        }
                        i18 = 0;
                        c24347OooO0o3.OooO0oo();
                        c24347OooO0o3.f81994OooO00o = false;
                        C24318OooOO0o c24318OooOO0o3 = c24347OooO0o3.f81997OooO0Oo;
                        c24318OooOO0o3.f81880OooO0o0.f81841OooOO0 = false;
                        c24318OooOO0o3.f81881OooO0oO = false;
                        c24318OooOO0o3.OooOOO();
                        C24319OooOOO c24319OooOOO3 = c24347OooO0o3.f81999OooO0o0;
                        c24319OooOOO3.f81880OooO0o0.f81841OooOO0 = false;
                        c24319OooOOO3.f81881OooO0oO = false;
                        c24319OooOOO3.OooOOO0();
                        c24313OooO0o0.OooO0OO();
                    } else {
                        i18 = 0;
                    }
                    c24313OooO0o0.OooO0O0(c24313OooO0o0.f81856OooO0Oo);
                    c24347OooO0o3.f82044OoooOoo = i18;
                    c24347OooO0o3.f82045Ooooo00 = i18;
                    c24347OooO0o3.f81997OooO0Oo.f81882OooO0oo.OooO0Oo(i18);
                    c24347OooO0o3.f81999OooO0o0.f81882OooO0oo.OooO0Oo(i18);
                    i19 = 1073741824;
                    if (mode == 1073741824) {
                        zOoooOO0 = c24347OooO0o.OoooOO0(i18, zOooO0O0);
                        i12 = 1;
                    } else {
                        zOoooOO0 = true;
                        i12 = 0;
                    }
                    if (mode2 == 1073741824) {
                        zOoooOO0 &= c24347OooO0o.OoooOO0(1, zOooO0O0);
                        i12++;
                    }
                }
                if (zOoooOO0) {
                    c24347OooO0o.Oooo(mode == i19, mode2 == i19);
                }
            } else {
                i9 = i8;
                interfaceC19609OooO0O0 = interfaceC19609OooO0O03;
                i10 = size4;
                i11 = iOooOOo0;
                zOoooOO0 = false;
                i12 = 0;
            }
            if (zOoooOO0 || i12 != 2) {
                int i30 = c24347OooO0o.f81974o000000O;
                if (i10 > 0) {
                    int size5 = c24347OooO0o.f82127oo000o.size();
                    boolean zOoooOOO = c24347OooO0o.OoooOOO(64);
                    C24309OooO0O0.InterfaceC19609OooO0O0 interfaceC19609OooO0O04 = c24347OooO0o.f81990o0ooOOo;
                    for (int i31 = 0; i31 < size5; i31++) {
                        C24348OooO0o0 c24348OooO0o03 = c24347OooO0o.f82127oo000o.get(i31);
                        if (!(c24348OooO0o03 instanceof C24350OooO0oo) && !(c24348OooO0o03 instanceof C24343OooO00o) && !c24348OooO0o03.f82027Oooo00O && (!zOoooOOO || (c24318OooOO0o = c24348OooO0o03.f81997OooO0Oo) == null || (c24319OooOOO = c24348OooO0o03.f81999OooO0o0) == null || !c24318OooOO0o.f81880OooO0o0.f81841OooOO0 || !c24319OooOOO.f81880OooO0o0.f81841OooOO0)) {
                            C24348OooO0o0.OooO00o oooO00oOooOO03 = c24348OooO0o03.OooOO0(0);
                            C24348OooO0o0.OooO00o oooO00oOooOO04 = c24348OooO0o03.OooOO0(1);
                            boolean z8 = oooO00oOooOO03 == oooO00o3 && c24348OooO0o03.f82009OooOOo != 1 && oooO00oOooOO04 == oooO00o3 && c24348OooO0o03.f82011OooOOoo != 1;
                            if (!z8 && c24347OooO0o.OoooOOO(1) && !(c24348OooO0o03 instanceof C24353OooOO0o)) {
                                if (oooO00oOooOO03 == oooO00o3 && c24348OooO0o03.f82009OooOOo == 0 && oooO00oOooOO04 != oooO00o3 && !c24348OooO0o03.OooOo()) {
                                    z8 = true;
                                }
                                if (oooO00oOooOO04 == oooO00o3 && c24348OooO0o03.f82011OooOOoo == 0 && oooO00oOooOO03 != oooO00o3 && !c24348OooO0o03.OooOo()) {
                                    z8 = true;
                                }
                                if ((oooO00oOooOO03 == oooO00o3 || oooO00oOooOO04 == oooO00o3) && c24348OooO0o03.f82042OoooOo0 > 0.0f) {
                                    z8 = true;
                                }
                            }
                            if (!z8) {
                                c24309OooO0O0.OooO00o(0, interfaceC19609OooO0O04, c24348OooO0o03);
                            }
                        }
                    }
                    ConstraintLayout constraintLayout = ((OooO0O0) interfaceC19609OooO0O04).f63946OooO00o;
                    int childCount = constraintLayout.getChildCount();
                    for (int i32 = 0; i32 < childCount; i32++) {
                        View childAt = constraintLayout.getChildAt(i32);
                        if (childAt instanceof Placeholder) {
                            Placeholder placeholder = (Placeholder) childAt;
                            if (placeholder.f64165OooOo != null) {
                                OooO00o oooO00o9 = (OooO00o) placeholder.getLayoutParams();
                                OooO00o oooO00o10 = (OooO00o) placeholder.f64165OooOo.getLayoutParams();
                                C24348OooO0o0 c24348OooO0o04 = oooO00o10.f63942o00ooo;
                                c24348OooO0o04.f82052OoooooO = 0;
                                C24348OooO0o0 c24348OooO0o05 = oooO00o9.f63942o00ooo;
                                if (c24348OooO0o05.f82039OoooOO0[0] != oooO00o4) {
                                    c24348OooO0o05.Oooo0oo(c24348OooO0o04.OooOOo0());
                                }
                                C24348OooO0o0 c24348OooO0o06 = oooO00o9.f63942o00ooo;
                                if (c24348OooO0o06.f82039OoooOO0[1] != oooO00o4) {
                                    c24348OooO0o06.Oooo0o0(oooO00o10.f63942o00ooo.OooOO0O());
                                }
                                oooO00o10.f63942o00ooo.f82052OoooooO = 8;
                            }
                        }
                    }
                    int size6 = constraintLayout.mConstraintHelpers.size();
                    if (size6 > 0) {
                        for (int i33 = 0; i33 < size6; i33++) {
                            ((ConstraintHelper) constraintLayout.mConstraintHelpers.get(i33)).getClass();
                        }
                    }
                }
                c24309OooO0O0.OooO0OO(c24347OooO0o);
                ArrayList<C24348OooO0o0> arrayList3 = c24309OooO0O0.f81817OooO00o;
                size = arrayList3.size();
                int i34 = i11;
                if (i10 > 0) {
                    c24309OooO0O0.OooO0O0(c24347OooO0o, 0, i34, iOooOO0O);
                }
                if (size <= 0) {
                    C24348OooO0o0.OooO00o[] oooO00oArr3 = c24347OooO0o.f82039OoooOO0;
                    boolean z9 = oooO00oArr3[0] == oooO00o5;
                    boolean z10 = oooO00oArr3[1] == oooO00o5;
                    int iOooOOo03 = c24347OooO0o.OooOOo0();
                    C24347OooO0o c24347OooO0o4 = c24309OooO0O0.f81819OooO0OO;
                    int iMax5 = Math.max(iOooOOo03, c24347OooO0o4.f82047OooooO0);
                    int iMax6 = Math.max(c24347OooO0o.OooOO0O(), c24347OooO0o4.f82048OooooOO);
                    int i35 = 0;
                    boolean z11 = false;
                    while (true) {
                        oooO00o = C24346OooO0Oo.OooO00o.f81965OooOoO;
                        oooO00o2 = C24346OooO0Oo.OooO00o.f81966OooOoO0;
                        if (i35 >= size) {
                            break;
                        }
                        C24348OooO0o0 c24348OooO0o07 = arrayList3.get(i35);
                        boolean z12 = z10;
                        if (c24348OooO0o07 instanceof C24353OooOO0o) {
                            int iOooOOo04 = c24348OooO0o07.OooOOo0();
                            z = z9;
                            int iOooOO0O3 = c24348OooO0o07.OooOO0O();
                            i16 = i35;
                            interfaceC19609OooO0O02 = interfaceC19609OooO0O0;
                            boolean zOooO00o = z11 | c24309OooO0O0.OooO00o(1, interfaceC19609OooO0O02, c24348OooO0o07);
                            int iOooOOo05 = c24348OooO0o07.OooOOo0();
                            i17 = i30;
                            int iOooOO0O4 = c24348OooO0o07.OooOO0O();
                            if (iOooOOo05 != iOooOOo04) {
                                c24348OooO0o07.Oooo0oo(iOooOOo05);
                                if (z && c24348OooO0o07.OooOOo() + c24348OooO0o07.f82040OoooOOO > iMax5) {
                                    iMax5 = Math.max(iMax5, c24348OooO0o07.OooO(oooO00o2).OooO0o0() + c24348OooO0o07.OooOOo() + c24348OooO0o07.f82040OoooOOO);
                                }
                                z2 = true;
                            } else {
                                z2 = zOooO00o;
                            }
                            if (iOooOO0O4 != iOooOO0O3) {
                                c24348OooO0o07.Oooo0o0(iOooOO0O4);
                                if (z12 && c24348OooO0o07.OooOOoo() + c24348OooO0o07.f82041OoooOOo > iMax6) {
                                    iMax6 = Math.max(iMax6, c24348OooO0o07.OooO(oooO00o).OooO0o0() + c24348OooO0o07.OooOOoo() + c24348OooO0o07.f82041OoooOOo);
                                }
                                z2 = true;
                            }
                            z11 = ((C24353OooOO0o) c24348OooO0o07).f82120o0OO00O | z2;
                        } else {
                            i17 = i30;
                            z = z9;
                            i16 = i35;
                            interfaceC19609OooO0O02 = interfaceC19609OooO0O0;
                        }
                        z10 = z12;
                        interfaceC19609OooO0O0 = interfaceC19609OooO0O02;
                        z9 = z;
                        i35 = i16 + 1;
                        i30 = i17;
                    }
                    int i36 = i30;
                    boolean z13 = z10;
                    boolean z14 = z9;
                    C24309OooO0O0.InterfaceC19609OooO0O0 interfaceC19609OooO0O05 = interfaceC19609OooO0O0;
                    boolean zOooO00o2 = z11;
                    int i37 = 0;
                    while (i37 < 2) {
                        int i38 = 0;
                        while (i38 < size) {
                            C24348OooO0o0 c24348OooO0o08 = arrayList3.get(i38);
                            if ((!(c24348OooO0o08 instanceof C24342OooO) || (c24348OooO0o08 instanceof C24353OooOO0o)) && !(c24348OooO0o08 instanceof C24350OooO0oo)) {
                                if (c24348OooO0o08.f82052OoooooO != 8 && ((i9 == 0 || !c24348OooO0o08.f81997OooO0Oo.f81880OooO0o0.f81841OooOO0 || !c24348OooO0o08.f81999OooO0o0.f81880OooO0o0.f81841OooOO0) && !(c24348OooO0o08 instanceof C24353OooOO0o))) {
                                    int iOooOOo06 = c24348OooO0o08.OooOOo0();
                                    int iOooOO0O5 = c24348OooO0o08.OooOO0O();
                                    arrayList = arrayList3;
                                    int i39 = c24348OooO0o08.f82046Ooooo0o;
                                    i14 = size;
                                    zOooO00o2 |= c24309OooO0O0.OooO00o(i37 == 1 ? 2 : 1, interfaceC19609OooO0O05, c24348OooO0o08);
                                    int iOooOOo07 = c24348OooO0o08.OooOOo0();
                                    i15 = i37;
                                    int iOooOO0O6 = c24348OooO0o08.OooOO0O();
                                    if (iOooOOo07 != iOooOOo06) {
                                        c24348OooO0o08.Oooo0oo(iOooOOo07);
                                        if (z14 && c24348OooO0o08.OooOOo() + c24348OooO0o08.f82040OoooOOO > iMax5) {
                                            iMax5 = Math.max(iMax5, c24348OooO0o08.OooO(oooO00o2).OooO0o0() + c24348OooO0o08.OooOOo() + c24348OooO0o08.f82040OoooOOO);
                                        }
                                        zOooO00o2 = true;
                                    }
                                    if (iOooOO0O6 != iOooOO0O5) {
                                        c24348OooO0o08.Oooo0o0(iOooOO0O6);
                                        if (z13 && c24348OooO0o08.OooOOoo() + c24348OooO0o08.f82041OoooOOo > iMax6) {
                                            iMax6 = Math.max(iMax6, c24348OooO0o08.OooO(oooO00o).OooO0o0() + c24348OooO0o08.OooOOoo() + c24348OooO0o08.f82041OoooOOo);
                                        }
                                        zOooO00o2 = true;
                                    }
                                    if (c24348OooO0o08.f82023OooOooo && i39 != c24348OooO0o08.f82046Ooooo0o) {
                                        zOooO00o2 = true;
                                    }
                                }
                                i38++;
                                arrayList3 = arrayList;
                                size = i14;
                                i37 = i15;
                            }
                            arrayList = arrayList3;
                            i14 = size;
                            i15 = i37;
                            i38++;
                            arrayList3 = arrayList;
                            size = i14;
                            i37 = i15;
                        }
                        ArrayList<C24348OooO0o0> arrayList4 = arrayList3;
                        int i40 = size;
                        int i41 = i37;
                        if (!zOooO00o2) {
                            break;
                        }
                        i37 = i41 + 1;
                        c24309OooO0O0.OooO0O0(c24347OooO0o, i37, i34, iOooOO0O);
                        arrayList3 = arrayList4;
                        size = i40;
                        zOooO00o2 = false;
                    }
                    i13 = i36;
                } else {
                    i13 = i30;
                }
                c24347OooO0o.f81974o000000O = i13;
                C24041OooO0Oo.f80982OooOOo0 = c24347OooO0o.OoooOOO(512);
            }
            return;
        }
        iMax3 = Math.max(0, getPaddingLeft());
        iMax4 = iMax3;
        int i252 = size2 - paddingWidth;
        int i262 = size3 - i24;
        setSelfDimensionBehaviour(c24347OooO0o, mode, i252, mode2, i262);
        c24347OooO0o.f81988o0Oo0oo = iMax4;
        c24347OooO0o.f81986o0OO00O = iMax;
        c24309OooO0O0 = c24347OooO0o.f81984o00oO0o;
        c24309OooO0O0.getClass();
        C24309OooO0O0.InterfaceC19609OooO0O0 interfaceC19609OooO0O032 = c24347OooO0o.f81990o0ooOOo;
        int size42 = c24347OooO0o.f82127oo000o.size();
        int iOooOOo08 = c24347OooO0o.OooOOo0();
        int iOooOO0O7 = c24347OooO0o.OooOO0O();
        boolean zOooO0O02 = C24351OooOO0.OooO0O0(i, 128);
        if (zOooO0O02) {
        }
        C24348OooO0o0.OooO00o oooO00o32 = C24348OooO0o0.OooO00o.f82065OooOoO0;
        if (i4 == 0) {
        }
        i8 = i7 & (((mode == 1073741824 || mode2 != 1073741824) && !zOooO0O02) ? i5 : i6);
        C24348OooO0o0.OooO00o oooO00o42 = C24348OooO0o0.OooO00o.f82063OooOo0o;
        C24348OooO0o0.OooO00o oooO00o52 = C24348OooO0o0.OooO00o.f82062OooOo;
        if (i8 == 0) {
        }
        if (zOoooOO0) {
        }
        int i302 = c24347OooO0o.f81974o000000O;
        if (i10 > 0) {
        }
        c24309OooO0O0.OooO0OO(c24347OooO0o);
        ArrayList<C24348OooO0o0> arrayList32 = c24309OooO0O0.f81817OooO00o;
        size = arrayList32.size();
        int i342 = i11;
        if (i10 > 0) {
        }
        if (size <= 0) {
        }
        c24347OooO0o.f81974o000000O = i13;
        C24041OooO0Oo.f80982OooOOo0 = c24347OooO0o.OoooOOO(512);
    }

    public void setConstraintSet(androidx.constraintlayout.widget.OooO0OO oooO0OO) {
        this.mConstraintSet = oooO0OO;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.mDesignIds.put(strSubstring, num);
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC21625OooO0Oo abstractC21625OooO0Oo) {
        androidx.constraintlayout.widget.OooO0O0 oooO0O0 = this.mConstraintLayoutSpec;
        if (oooO0O0 != null) {
            oooO0O0.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        C24347OooO0o c24347OooO0o = this.mLayoutWidget;
        c24347OooO0o.f81974o000000O = i;
        C24041OooO0Oo.f80982OooOOo0 = c24347OooO0o.OoooOOO(512);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSelfDimensionBehaviour(C24347OooO0o c24347OooO0o, int i, int i2, int i3, int i4) {
        C24348OooO0o0.OooO00o oooO00o;
        int i5;
        int i6;
        OooO0O0 oooO0O0 = this.mMeasurer;
        int i7 = oooO0O0.f63951OooO0o0;
        int i8 = oooO0O0.f63949OooO0Oo;
        C24348OooO0o0.OooO00o oooO00o2 = C24348OooO0o0.OooO00o.f82063OooOo0o;
        int childCount = getChildCount();
        C24348OooO0o0.OooO00o oooO00o3 = C24348OooO0o0.OooO00o.f82062OooOo;
        if (i != Integer.MIN_VALUE) {
            if (i != 0) {
                if (i != 1073741824) {
                    oooO00o = oooO00o2;
                } else {
                    i2 = Math.min(this.mMaxWidth - i8, i2);
                    oooO00o = oooO00o2;
                    if (i3 != Integer.MIN_VALUE) {
                        if (i3 != 0) {
                            if (i3 == 1073741824) {
                                i4 = Math.min(this.mMaxHeight - i7, i4);
                            }
                            if (i2 != c24347OooO0o.OooOOo0() || i4 != c24347OooO0o.OooOO0O()) {
                                c24347OooO0o.f81983o00oO0O.f81855OooO0OO = true;
                            }
                            c24347OooO0o.f82044OoooOoo = 0;
                            c24347OooO0o.f82045Ooooo00 = 0;
                            int i9 = this.mMaxWidth - i8;
                            int[] iArr = c24347OooO0o.f82020OooOoo;
                            iArr[0] = i9;
                            iArr[1] = this.mMaxHeight - i7;
                            c24347OooO0o.f82047OooooO0 = 0;
                            c24347OooO0o.f82048OooooOO = 0;
                            c24347OooO0o.Oooo0o(oooO00o);
                            c24347OooO0o.Oooo0oo(i2);
                            c24347OooO0o.Oooo0oO(oooO00o2);
                            c24347OooO0o.Oooo0o0(i4);
                            i5 = this.mMinWidth - i8;
                            if (i5 < 0) {
                                c24347OooO0o.f82047OooooO0 = 0;
                            } else {
                                c24347OooO0o.f82047OooooO0 = i5;
                            }
                            i6 = this.mMinHeight - i7;
                            if (i6 < 0) {
                                c24347OooO0o.f82048OooooOO = 0;
                                return;
                            } else {
                                c24347OooO0o.f82048OooooOO = i6;
                                return;
                            }
                        }
                        if (childCount == 0) {
                            i4 = Math.max(0, this.mMinHeight);
                        } else {
                            oooO00o2 = oooO00o3;
                        }
                        i4 = 0;
                        if (i2 != c24347OooO0o.OooOOo0()) {
                            c24347OooO0o.f81983o00oO0O.f81855OooO0OO = true;
                        }
                        c24347OooO0o.f82044OoooOoo = 0;
                        c24347OooO0o.f82045Ooooo00 = 0;
                        int i92 = this.mMaxWidth - i8;
                        int[] iArr2 = c24347OooO0o.f82020OooOoo;
                        iArr2[0] = i92;
                        iArr2[1] = this.mMaxHeight - i7;
                        c24347OooO0o.f82047OooooO0 = 0;
                        c24347OooO0o.f82048OooooOO = 0;
                        c24347OooO0o.Oooo0o(oooO00o);
                        c24347OooO0o.Oooo0oo(i2);
                        c24347OooO0o.Oooo0oO(oooO00o2);
                        c24347OooO0o.Oooo0o0(i4);
                        i5 = this.mMinWidth - i8;
                        if (i5 < 0) {
                        }
                        i6 = this.mMinHeight - i7;
                        if (i6 < 0) {
                        }
                    } else if (childCount == 0) {
                        i4 = Math.max(0, this.mMinHeight);
                    }
                    oooO00o2 = oooO00o3;
                    if (i2 != c24347OooO0o.OooOOo0()) {
                    }
                    c24347OooO0o.f82044OoooOoo = 0;
                    c24347OooO0o.f82045Ooooo00 = 0;
                    int i922 = this.mMaxWidth - i8;
                    int[] iArr22 = c24347OooO0o.f82020OooOoo;
                    iArr22[0] = i922;
                    iArr22[1] = this.mMaxHeight - i7;
                    c24347OooO0o.f82047OooooO0 = 0;
                    c24347OooO0o.f82048OooooOO = 0;
                    c24347OooO0o.Oooo0o(oooO00o);
                    c24347OooO0o.Oooo0oo(i2);
                    c24347OooO0o.Oooo0oO(oooO00o2);
                    c24347OooO0o.Oooo0o0(i4);
                    i5 = this.mMinWidth - i8;
                    if (i5 < 0) {
                    }
                    i6 = this.mMinHeight - i7;
                    if (i6 < 0) {
                    }
                }
            } else if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            } else {
                oooO00o = oooO00o3;
            }
            i2 = 0;
            if (i3 != Integer.MIN_VALUE) {
            }
            oooO00o2 = oooO00o3;
            if (i2 != c24347OooO0o.OooOOo0()) {
            }
            c24347OooO0o.f82044OoooOoo = 0;
            c24347OooO0o.f82045Ooooo00 = 0;
            int i9222 = this.mMaxWidth - i8;
            int[] iArr222 = c24347OooO0o.f82020OooOoo;
            iArr222[0] = i9222;
            iArr222[1] = this.mMaxHeight - i7;
            c24347OooO0o.f82047OooooO0 = 0;
            c24347OooO0o.f82048OooooOO = 0;
            c24347OooO0o.Oooo0o(oooO00o);
            c24347OooO0o.Oooo0oo(i2);
            c24347OooO0o.Oooo0oO(oooO00o2);
            c24347OooO0o.Oooo0o0(i4);
            i5 = this.mMinWidth - i8;
            if (i5 < 0) {
            }
            i6 = this.mMinHeight - i7;
            if (i6 < 0) {
            }
        } else if (childCount == 0) {
            i2 = Math.max(0, this.mMinWidth);
        }
        oooO00o = oooO00o3;
        if (i3 != Integer.MIN_VALUE) {
        }
        oooO00o2 = oooO00o3;
        if (i2 != c24347OooO0o.OooOOo0()) {
        }
        c24347OooO0o.f82044OoooOoo = 0;
        c24347OooO0o.f82045Ooooo00 = 0;
        int i92222 = this.mMaxWidth - i8;
        int[] iArr2222 = c24347OooO0o.f82020OooOoo;
        iArr2222[0] = i92222;
        iArr2222[1] = this.mMaxHeight - i7;
        c24347OooO0o.f82047OooooO0 = 0;
        c24347OooO0o.f82048OooooOO = 0;
        c24347OooO0o.Oooo0o(oooO00o);
        c24347OooO0o.Oooo0oo(i2);
        c24347OooO0o.Oooo0oO(oooO00o2);
        c24347OooO0o.Oooo0o0(i4);
        i5 = this.mMinWidth - i8;
        if (i5 < 0) {
        }
        i6 = this.mMinHeight - i7;
        if (i6 < 0) {
        }
    }

    public void setState(int i, int i2, int i3) {
        androidx.constraintlayout.widget.OooO0O0 oooO0O0 = this.mConstraintLayoutSpec;
        if (oooO0O0 != null) {
            oooO0O0.OooO0O0(i2, i3, i);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public OooO00o generateDefaultLayoutParams() {
        return new OooO00o(-2, -2);
    }

    @Override // android.view.ViewGroup
    public OooO00o generateLayoutParams(AttributeSet attributeSet) {
        return new OooO00o(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new OooO00o(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C24347OooO0o();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new OooO0O0(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C24347OooO0o();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new OooO0O0(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C24347OooO0o();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new OooO0O0(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, i2);
    }

    public static class OooO00o extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f63876OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f63877OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f63878OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f63879OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f63880OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f63881OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f63882OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f63883OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f63884OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f63885OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f63886OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f63887OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public int f63888OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public int f63889OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public int f63890OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public int f63891OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public float f63892OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public int f63893OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public int f63894OooOOoo;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f63895OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public int f63896OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public int f63897OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public int f63898OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f63899OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f63900OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final int f63901OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f63902OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final int f63903OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f63904OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public final int f63905OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public float f63906OooOooo;

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f63907Oooo;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public float f63908Oooo0;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public float f63909Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public String f63910Oooo00O;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public float f63911Oooo00o;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public int f63912Oooo0O0;

        /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
        public int f63913Oooo0OO;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f63914Oooo0o;

        /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
        public int f63915Oooo0o0;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f63916Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f63917Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public int f63918OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public float f63919OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f63920OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public float f63921OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public int f63922OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public boolean f63923OoooOOO;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public boolean f63924OoooOOo;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public String f63925OoooOo0;

        /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
        public int f63926OoooOoO;

        /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
        public boolean f63927OoooOoo;

        /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
        public boolean f63928Ooooo00;

        /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
        public boolean f63929Ooooo0o;

        /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
        public boolean f63930OooooO0;

        /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
        public boolean f63931OooooOO;

        /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
        public boolean f63932OooooOo;

        /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
        public int f63933Oooooo;

        /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
        public int f63934Oooooo0;

        /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
        public int f63935OoooooO;

        /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
        public int f63936Ooooooo;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public int f63937o000oOoO;

        /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
        public float f63938o00O0O;

        /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
        public int f63939o00Oo0;

        /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
        public int f63940o00Ooo;

        /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
        public float f63941o00o0O;

        /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
        public C24348OooO0o0 f63942o00ooo;

        /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
        public int f63943o0OoOo0;

        /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
        public int f63944ooOO;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C19003OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final SparseIntArray f63945OooO00o;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f63945OooO00o = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        public OooO00o(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f63877OooO00o = -1;
            this.f63878OooO0O0 = -1;
            this.f63879OooO0OO = -1.0f;
            this.f63880OooO0Oo = true;
            this.f63882OooO0o0 = -1;
            this.f63881OooO0o = -1;
            this.f63883OooO0oO = -1;
            this.f63884OooO0oo = -1;
            this.f63876OooO = -1;
            this.f63885OooOO0 = -1;
            this.f63886OooOO0O = -1;
            this.f63887OooOO0o = -1;
            this.f63889OooOOO0 = -1;
            this.f63888OooOOO = -1;
            this.f63890OooOOOO = -1;
            this.f63891OooOOOo = -1;
            this.f63893OooOOo0 = 0;
            this.f63892OooOOo = 0.0f;
            this.f63894OooOOoo = -1;
            this.f63897OooOo00 = -1;
            this.f63896OooOo0 = -1;
            this.f63898OooOo0O = -1;
            this.f63899OooOo0o = Integer.MIN_VALUE;
            this.f63895OooOo = Integer.MIN_VALUE;
            this.f63901OooOoO0 = Integer.MIN_VALUE;
            this.f63900OooOoO = Integer.MIN_VALUE;
            this.f63902OooOoOO = Integer.MIN_VALUE;
            this.f63904OooOoo0 = Integer.MIN_VALUE;
            this.f63903OooOoo = Integer.MIN_VALUE;
            this.f63905OooOooO = 0;
            this.f63906OooOooo = 0.5f;
            this.f63909Oooo000 = 0.5f;
            this.f63910Oooo00O = null;
            this.f63911Oooo00o = -1.0f;
            this.f63908Oooo0 = -1.0f;
            this.f63912Oooo0O0 = 0;
            this.f63913Oooo0OO = 0;
            this.f63915Oooo0o0 = 0;
            this.f63914Oooo0o = 0;
            this.f63916Oooo0oO = 0;
            this.f63917Oooo0oo = 0;
            this.f63907Oooo = 0;
            this.f63920OoooO00 = 0;
            this.f63919OoooO0 = 1.0f;
            this.f63921OoooO0O = 1.0f;
            this.f63918OoooO = -1;
            this.f63922OoooOO0 = -1;
            this.f63937o000oOoO = -1;
            this.f63923OoooOOO = false;
            this.f63924OoooOOo = false;
            this.f63925OoooOo0 = null;
            this.f63926OoooOoO = 0;
            this.f63927OoooOoo = true;
            this.f63928Ooooo00 = true;
            this.f63929Ooooo0o = false;
            this.f63930OooooO0 = false;
            this.f63931OooooOO = false;
            this.f63932OooooOo = false;
            this.f63934Oooooo0 = -1;
            this.f63933Oooooo = -1;
            this.f63935OoooooO = -1;
            this.f63936Ooooooo = -1;
            this.f63943o0OoOo0 = Integer.MIN_VALUE;
            this.f63944ooOO = Integer.MIN_VALUE;
            this.f63938o00O0O = 0.5f;
            this.f63942o00ooo = new C24348OooO0o0();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof OooO00o) {
                OooO00o oooO00o = (OooO00o) layoutParams;
                this.f63877OooO00o = oooO00o.f63877OooO00o;
                this.f63878OooO0O0 = oooO00o.f63878OooO0O0;
                this.f63879OooO0OO = oooO00o.f63879OooO0OO;
                this.f63880OooO0Oo = oooO00o.f63880OooO0Oo;
                this.f63882OooO0o0 = oooO00o.f63882OooO0o0;
                this.f63881OooO0o = oooO00o.f63881OooO0o;
                this.f63883OooO0oO = oooO00o.f63883OooO0oO;
                this.f63884OooO0oo = oooO00o.f63884OooO0oo;
                this.f63876OooO = oooO00o.f63876OooO;
                this.f63885OooOO0 = oooO00o.f63885OooOO0;
                this.f63886OooOO0O = oooO00o.f63886OooOO0O;
                this.f63887OooOO0o = oooO00o.f63887OooOO0o;
                this.f63889OooOOO0 = oooO00o.f63889OooOOO0;
                this.f63888OooOOO = oooO00o.f63888OooOOO;
                this.f63890OooOOOO = oooO00o.f63890OooOOOO;
                this.f63891OooOOOo = oooO00o.f63891OooOOOo;
                this.f63893OooOOo0 = oooO00o.f63893OooOOo0;
                this.f63892OooOOo = oooO00o.f63892OooOOo;
                this.f63894OooOOoo = oooO00o.f63894OooOOoo;
                this.f63897OooOo00 = oooO00o.f63897OooOo00;
                this.f63896OooOo0 = oooO00o.f63896OooOo0;
                this.f63898OooOo0O = oooO00o.f63898OooOo0O;
                this.f63899OooOo0o = oooO00o.f63899OooOo0o;
                this.f63895OooOo = oooO00o.f63895OooOo;
                this.f63901OooOoO0 = oooO00o.f63901OooOoO0;
                this.f63900OooOoO = oooO00o.f63900OooOoO;
                this.f63902OooOoOO = oooO00o.f63902OooOoOO;
                this.f63904OooOoo0 = oooO00o.f63904OooOoo0;
                this.f63903OooOoo = oooO00o.f63903OooOoo;
                this.f63905OooOooO = oooO00o.f63905OooOooO;
                this.f63906OooOooo = oooO00o.f63906OooOooo;
                this.f63909Oooo000 = oooO00o.f63909Oooo000;
                this.f63910Oooo00O = oooO00o.f63910Oooo00O;
                this.f63911Oooo00o = oooO00o.f63911Oooo00o;
                this.f63908Oooo0 = oooO00o.f63908Oooo0;
                this.f63912Oooo0O0 = oooO00o.f63912Oooo0O0;
                this.f63913Oooo0OO = oooO00o.f63913Oooo0OO;
                this.f63923OoooOOO = oooO00o.f63923OoooOOO;
                this.f63924OoooOOo = oooO00o.f63924OoooOOo;
                this.f63915Oooo0o0 = oooO00o.f63915Oooo0o0;
                this.f63914Oooo0o = oooO00o.f63914Oooo0o;
                this.f63916Oooo0oO = oooO00o.f63916Oooo0oO;
                this.f63907Oooo = oooO00o.f63907Oooo;
                this.f63917Oooo0oo = oooO00o.f63917Oooo0oo;
                this.f63920OoooO00 = oooO00o.f63920OoooO00;
                this.f63919OoooO0 = oooO00o.f63919OoooO0;
                this.f63921OoooO0O = oooO00o.f63921OoooO0O;
                this.f63918OoooO = oooO00o.f63918OoooO;
                this.f63922OoooOO0 = oooO00o.f63922OoooOO0;
                this.f63937o000oOoO = oooO00o.f63937o000oOoO;
                this.f63927OoooOoo = oooO00o.f63927OoooOoo;
                this.f63928Ooooo00 = oooO00o.f63928Ooooo00;
                this.f63929Ooooo0o = oooO00o.f63929Ooooo0o;
                this.f63930OooooO0 = oooO00o.f63930OooooO0;
                this.f63934Oooooo0 = oooO00o.f63934Oooooo0;
                this.f63933Oooooo = oooO00o.f63933Oooooo;
                this.f63935OoooooO = oooO00o.f63935OoooooO;
                this.f63936Ooooooo = oooO00o.f63936Ooooooo;
                this.f63943o0OoOo0 = oooO00o.f63943o0OoOo0;
                this.f63944ooOO = oooO00o.f63944ooOO;
                this.f63938o00O0O = oooO00o.f63938o00O0O;
                this.f63925OoooOo0 = oooO00o.f63925OoooOo0;
                this.f63926OoooOoO = oooO00o.f63926OoooOoO;
                this.f63942o00ooo = oooO00o.f63942o00ooo;
            }
        }

        public final void OooO00o() {
            this.f63930OooooO0 = false;
            this.f63927OoooOoo = true;
            this.f63928Ooooo00 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.f63923OoooOOO) {
                this.f63927OoooOoo = false;
                if (this.f63915Oooo0o0 == 0) {
                    this.f63915Oooo0o0 = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.f63924OoooOOo) {
                this.f63928Ooooo00 = false;
                if (this.f63914Oooo0o == 0) {
                    this.f63914Oooo0o = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f63927OoooOoo = false;
                if (i == 0 && this.f63915Oooo0o0 == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f63923OoooOOO = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f63928Ooooo00 = false;
                if (i2 == 0 && this.f63914Oooo0o == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f63924OoooOOo = true;
                }
            }
            if (this.f63879OooO0OO == -1.0f && this.f63877OooO00o == -1 && this.f63878OooO0O0 == -1) {
                return;
            }
            this.f63930OooooO0 = true;
            this.f63927OoooOoo = true;
            this.f63928Ooooo00 = true;
            if (!(this.f63942o00ooo instanceof C24350OooO0oo)) {
                this.f63942o00ooo = new C24350OooO0oo();
            }
            ((C24350OooO0oo) this.f63942o00ooo).OoooO0O(this.f63937o000oOoO);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void resolveLayoutDirection(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i);
            boolean z = false;
            boolean z2 = 1 == getLayoutDirection();
            this.f63935OoooooO = -1;
            this.f63936Ooooooo = -1;
            this.f63934Oooooo0 = -1;
            this.f63933Oooooo = -1;
            this.f63943o0OoOo0 = this.f63899OooOo0o;
            this.f63944ooOO = this.f63901OooOoO0;
            float f = this.f63906OooOooo;
            this.f63938o00O0O = f;
            int i8 = this.f63877OooO00o;
            this.f63939o00Oo0 = i8;
            int i9 = this.f63878OooO0O0;
            this.f63940o00Ooo = i9;
            float f2 = this.f63879OooO0OO;
            this.f63941o00o0O = f2;
            if (z2) {
                int i10 = this.f63894OooOOoo;
                if (i10 != -1) {
                    this.f63935OoooooO = i10;
                } else {
                    int i11 = this.f63897OooOo00;
                    if (i11 != -1) {
                        this.f63936Ooooooo = i11;
                    }
                    i2 = this.f63896OooOo0;
                    if (i2 != -1) {
                        this.f63933Oooooo = i2;
                        z = true;
                    }
                    i3 = this.f63898OooOo0O;
                    if (i3 != -1) {
                        this.f63934Oooooo0 = i3;
                        z = true;
                    }
                    i4 = this.f63902OooOoOO;
                    if (i4 != Integer.MIN_VALUE) {
                        this.f63944ooOO = i4;
                    }
                    i5 = this.f63904OooOoo0;
                    if (i5 != Integer.MIN_VALUE) {
                        this.f63943o0OoOo0 = i5;
                    }
                    if (z) {
                        this.f63938o00O0O = 1.0f - f;
                    }
                    if (this.f63930OooooO0 && this.f63937o000oOoO == 1 && this.f63880OooO0Oo) {
                        if (f2 == -1.0f) {
                            this.f63941o00o0O = 1.0f - f2;
                            this.f63939o00Oo0 = -1;
                            this.f63940o00Ooo = -1;
                        } else if (i8 != -1) {
                            this.f63940o00Ooo = i8;
                            this.f63939o00Oo0 = -1;
                            this.f63941o00o0O = -1.0f;
                        } else if (i9 != -1) {
                            this.f63939o00Oo0 = i9;
                            this.f63940o00Ooo = -1;
                            this.f63941o00o0O = -1.0f;
                        }
                    }
                }
                z = true;
                i2 = this.f63896OooOo0;
                if (i2 != -1) {
                }
                i3 = this.f63898OooOo0O;
                if (i3 != -1) {
                }
                i4 = this.f63902OooOoOO;
                if (i4 != Integer.MIN_VALUE) {
                }
                i5 = this.f63904OooOoo0;
                if (i5 != Integer.MIN_VALUE) {
                }
                if (z) {
                }
                if (this.f63930OooooO0) {
                    if (f2 == -1.0f) {
                    }
                }
            } else {
                int i12 = this.f63894OooOOoo;
                if (i12 != -1) {
                    this.f63933Oooooo = i12;
                }
                int i13 = this.f63897OooOo00;
                if (i13 != -1) {
                    this.f63934Oooooo0 = i13;
                }
                int i14 = this.f63896OooOo0;
                if (i14 != -1) {
                    this.f63935OoooooO = i14;
                }
                int i15 = this.f63898OooOo0O;
                if (i15 != -1) {
                    this.f63936Ooooooo = i15;
                }
                int i16 = this.f63902OooOoOO;
                if (i16 != Integer.MIN_VALUE) {
                    this.f63943o0OoOo0 = i16;
                }
                int i17 = this.f63904OooOoo0;
                if (i17 != Integer.MIN_VALUE) {
                    this.f63944ooOO = i17;
                }
            }
            if (this.f63896OooOo0 == -1 && this.f63898OooOo0O == -1 && this.f63897OooOo00 == -1 && this.f63894OooOOoo == -1) {
                int i18 = this.f63883OooO0oO;
                if (i18 != -1) {
                    this.f63935OoooooO = i18;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                } else {
                    int i19 = this.f63884OooO0oo;
                    if (i19 != -1) {
                        this.f63936Ooooooo = i19;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                        }
                    }
                }
                int i20 = this.f63882OooO0o0;
                if (i20 != -1) {
                    this.f63934Oooooo0 = i20;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                    return;
                }
                int i21 = this.f63881OooO0o;
                if (i21 != -1) {
                    this.f63933Oooooo = i21;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                }
            }
        }

        public OooO00o(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f63877OooO00o = -1;
            this.f63878OooO0O0 = -1;
            this.f63879OooO0OO = -1.0f;
            this.f63880OooO0Oo = true;
            this.f63882OooO0o0 = -1;
            this.f63881OooO0o = -1;
            this.f63883OooO0oO = -1;
            this.f63884OooO0oo = -1;
            this.f63876OooO = -1;
            this.f63885OooOO0 = -1;
            this.f63886OooOO0O = -1;
            this.f63887OooOO0o = -1;
            this.f63889OooOOO0 = -1;
            this.f63888OooOOO = -1;
            this.f63890OooOOOO = -1;
            this.f63891OooOOOo = -1;
            this.f63893OooOOo0 = 0;
            this.f63892OooOOo = 0.0f;
            this.f63894OooOOoo = -1;
            this.f63897OooOo00 = -1;
            this.f63896OooOo0 = -1;
            this.f63898OooOo0O = -1;
            this.f63899OooOo0o = Integer.MIN_VALUE;
            this.f63895OooOo = Integer.MIN_VALUE;
            this.f63901OooOoO0 = Integer.MIN_VALUE;
            this.f63900OooOoO = Integer.MIN_VALUE;
            this.f63902OooOoOO = Integer.MIN_VALUE;
            this.f63904OooOoo0 = Integer.MIN_VALUE;
            this.f63903OooOoo = Integer.MIN_VALUE;
            this.f63905OooOooO = 0;
            this.f63906OooOooo = 0.5f;
            this.f63909Oooo000 = 0.5f;
            this.f63910Oooo00O = null;
            this.f63911Oooo00o = -1.0f;
            this.f63908Oooo0 = -1.0f;
            this.f63912Oooo0O0 = 0;
            this.f63913Oooo0OO = 0;
            this.f63915Oooo0o0 = 0;
            this.f63914Oooo0o = 0;
            this.f63916Oooo0oO = 0;
            this.f63917Oooo0oo = 0;
            this.f63907Oooo = 0;
            this.f63920OoooO00 = 0;
            this.f63919OoooO0 = 1.0f;
            this.f63921OoooO0O = 1.0f;
            this.f63918OoooO = -1;
            this.f63922OoooOO0 = -1;
            this.f63937o000oOoO = -1;
            this.f63923OoooOOO = false;
            this.f63924OoooOOo = false;
            this.f63925OoooOo0 = null;
            this.f63926OoooOoO = 0;
            this.f63927OoooOoo = true;
            this.f63928Ooooo00 = true;
            this.f63929Ooooo0o = false;
            this.f63930OooooO0 = false;
            this.f63931OooooOO = false;
            this.f63932OooooOo = false;
            this.f63934Oooooo0 = -1;
            this.f63933Oooooo = -1;
            this.f63935OoooooO = -1;
            this.f63936Ooooooo = -1;
            this.f63943o0OoOo0 = Integer.MIN_VALUE;
            this.f63944ooOO = Integer.MIN_VALUE;
            this.f63938o00O0O = 0.5f;
            this.f63942o00ooo = new C24348OooO0o0();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO0o.f64131OooO0O0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = C19003OooO00o.f63945OooO00o.get(index);
                switch (i2) {
                    case 1:
                        this.f63937o000oOoO = typedArrayObtainStyledAttributes.getInt(index, this.f63937o000oOoO);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f63891OooOOOo);
                        this.f63891OooOOOo = resourceId;
                        if (resourceId == -1) {
                            this.f63891OooOOOo = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f63893OooOOo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f63893OooOOo0);
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.f63892OooOOo) % 360.0f;
                        this.f63892OooOOo = f;
                        if (f < 0.0f) {
                            this.f63892OooOOo = (360.0f - f) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f63877OooO00o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f63877OooO00o);
                        break;
                    case 6:
                        this.f63878OooO0O0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f63878OooO0O0);
                        break;
                    case 7:
                        this.f63879OooO0OO = typedArrayObtainStyledAttributes.getFloat(index, this.f63879OooO0OO);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f63882OooO0o0);
                        this.f63882OooO0o0 = resourceId2;
                        if (resourceId2 == -1) {
                            this.f63882OooO0o0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f63881OooO0o);
                        this.f63881OooO0o = resourceId3;
                        if (resourceId3 == -1) {
                            this.f63881OooO0o = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f63883OooO0oO);
                        this.f63883OooO0oO = resourceId4;
                        if (resourceId4 == -1) {
                            this.f63883OooO0oO = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f63884OooO0oo);
                        this.f63884OooO0oo = resourceId5;
                        if (resourceId5 == -1) {
                            this.f63884OooO0oo = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f63876OooO);
                        this.f63876OooO = resourceId6;
                        if (resourceId6 == -1) {
                            this.f63876OooO = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f63885OooOO0);
                        this.f63885OooOO0 = resourceId7;
                        if (resourceId7 == -1) {
                            this.f63885OooOO0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f63886OooOO0O);
                        this.f63886OooOO0O = resourceId8;
                        if (resourceId8 == -1) {
                            this.f63886OooOO0O = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f63887OooOO0o);
                        this.f63887OooOO0o = resourceId9;
                        if (resourceId9 == -1) {
                            this.f63887OooOO0o = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f63889OooOOO0);
                        this.f63889OooOOO0 = resourceId10;
                        if (resourceId10 == -1) {
                            this.f63889OooOOO0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f63894OooOOoo);
                        this.f63894OooOOoo = resourceId11;
                        if (resourceId11 == -1) {
                            this.f63894OooOOoo = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f63897OooOo00);
                        this.f63897OooOo00 = resourceId12;
                        if (resourceId12 == -1) {
                            this.f63897OooOo00 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f63896OooOo0);
                        this.f63896OooOo0 = resourceId13;
                        if (resourceId13 == -1) {
                            this.f63896OooOo0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f63898OooOo0O);
                        this.f63898OooOo0O = resourceId14;
                        if (resourceId14 == -1) {
                            this.f63898OooOo0O = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f63899OooOo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f63899OooOo0o);
                        break;
                    case 22:
                        this.f63895OooOo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f63895OooOo);
                        break;
                    case 23:
                        this.f63901OooOoO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f63901OooOoO0);
                        break;
                    case 24:
                        this.f63900OooOoO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f63900OooOoO);
                        break;
                    case 25:
                        this.f63902OooOoOO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f63902OooOoOO);
                        break;
                    case 26:
                        this.f63904OooOoo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f63904OooOoo0);
                        break;
                    case 27:
                        this.f63923OoooOOO = typedArrayObtainStyledAttributes.getBoolean(index, this.f63923OoooOOO);
                        break;
                    case 28:
                        this.f63924OoooOOo = typedArrayObtainStyledAttributes.getBoolean(index, this.f63924OoooOOo);
                        break;
                    case 29:
                        this.f63906OooOooo = typedArrayObtainStyledAttributes.getFloat(index, this.f63906OooOooo);
                        break;
                    case 30:
                        this.f63909Oooo000 = typedArrayObtainStyledAttributes.getFloat(index, this.f63909Oooo000);
                        break;
                    case 31:
                        int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f63915Oooo0o0 = i3;
                        if (i3 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f63914Oooo0o = i4;
                        if (i4 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.f63916Oooo0oO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f63916Oooo0oO);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f63916Oooo0oO) == -2) {
                                this.f63916Oooo0oO = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.f63907Oooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f63907Oooo);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f63907Oooo) == -2) {
                                this.f63907Oooo = -2;
                            }
                        }
                        break;
                    case 35:
                        this.f63919OoooO0 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f63919OoooO0));
                        this.f63915Oooo0o0 = 2;
                        break;
                    case 36:
                        try {
                            this.f63917Oooo0oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f63917Oooo0oo);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f63917Oooo0oo) == -2) {
                                this.f63917Oooo0oo = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.f63920OoooO00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f63920OoooO00);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f63920OoooO00) == -2) {
                                this.f63920OoooO00 = -2;
                            }
                        }
                        break;
                    case 38:
                        this.f63921OoooO0O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f63921OoooO0O));
                        this.f63914Oooo0o = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                androidx.constraintlayout.widget.OooO0OO.OooOOOo(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f63911Oooo00o = typedArrayObtainStyledAttributes.getFloat(index, this.f63911Oooo00o);
                                break;
                            case 46:
                                this.f63908Oooo0 = typedArrayObtainStyledAttributes.getFloat(index, this.f63908Oooo0);
                                break;
                            case 47:
                                this.f63912Oooo0O0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f63913Oooo0OO = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f63918OoooO = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f63918OoooO);
                                break;
                            case 50:
                                this.f63922OoooOO0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f63922OoooOO0);
                                break;
                            case 51:
                                this.f63925OoooOo0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f63888OooOOO);
                                this.f63888OooOOO = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f63888OooOOO = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f63890OooOOOO);
                                this.f63890OooOOOO = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f63890OooOOOO = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.f63905OooOooO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f63905OooOooO);
                                break;
                            case 55:
                                this.f63903OooOoo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f63903OooOoo);
                                break;
                            default:
                                switch (i2) {
                                    case 64:
                                        androidx.constraintlayout.widget.OooO0OO.OooOOOO(this, typedArrayObtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        androidx.constraintlayout.widget.OooO0OO.OooOOOO(this, typedArrayObtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.f63926OoooOoO = typedArrayObtainStyledAttributes.getInt(index, this.f63926OoooOoO);
                                        break;
                                    case 67:
                                        this.f63880OooO0Oo = typedArrayObtainStyledAttributes.getBoolean(index, this.f63880OooO0Oo);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            OooO00o();
        }

        public OooO00o(int i, int i2) {
            super(i, i2);
            this.f63877OooO00o = -1;
            this.f63878OooO0O0 = -1;
            this.f63879OooO0OO = -1.0f;
            this.f63880OooO0Oo = true;
            this.f63882OooO0o0 = -1;
            this.f63881OooO0o = -1;
            this.f63883OooO0oO = -1;
            this.f63884OooO0oo = -1;
            this.f63876OooO = -1;
            this.f63885OooOO0 = -1;
            this.f63886OooOO0O = -1;
            this.f63887OooOO0o = -1;
            this.f63889OooOOO0 = -1;
            this.f63888OooOOO = -1;
            this.f63890OooOOOO = -1;
            this.f63891OooOOOo = -1;
            this.f63893OooOOo0 = 0;
            this.f63892OooOOo = 0.0f;
            this.f63894OooOOoo = -1;
            this.f63897OooOo00 = -1;
            this.f63896OooOo0 = -1;
            this.f63898OooOo0O = -1;
            this.f63899OooOo0o = Integer.MIN_VALUE;
            this.f63895OooOo = Integer.MIN_VALUE;
            this.f63901OooOoO0 = Integer.MIN_VALUE;
            this.f63900OooOoO = Integer.MIN_VALUE;
            this.f63902OooOoOO = Integer.MIN_VALUE;
            this.f63904OooOoo0 = Integer.MIN_VALUE;
            this.f63903OooOoo = Integer.MIN_VALUE;
            this.f63905OooOooO = 0;
            this.f63906OooOooo = 0.5f;
            this.f63909Oooo000 = 0.5f;
            this.f63910Oooo00O = null;
            this.f63911Oooo00o = -1.0f;
            this.f63908Oooo0 = -1.0f;
            this.f63912Oooo0O0 = 0;
            this.f63913Oooo0OO = 0;
            this.f63915Oooo0o0 = 0;
            this.f63914Oooo0o = 0;
            this.f63916Oooo0oO = 0;
            this.f63917Oooo0oo = 0;
            this.f63907Oooo = 0;
            this.f63920OoooO00 = 0;
            this.f63919OoooO0 = 1.0f;
            this.f63921OoooO0O = 1.0f;
            this.f63918OoooO = -1;
            this.f63922OoooOO0 = -1;
            this.f63937o000oOoO = -1;
            this.f63923OoooOOO = false;
            this.f63924OoooOOo = false;
            this.f63925OoooOo0 = null;
            this.f63926OoooOoO = 0;
            this.f63927OoooOoo = true;
            this.f63928Ooooo00 = true;
            this.f63929Ooooo0o = false;
            this.f63930OooooO0 = false;
            this.f63931OooooOO = false;
            this.f63932OooooOo = false;
            this.f63934Oooooo0 = -1;
            this.f63933Oooooo = -1;
            this.f63935OoooooO = -1;
            this.f63936Ooooooo = -1;
            this.f63943o0OoOo0 = Integer.MIN_VALUE;
            this.f63944ooOO = Integer.MIN_VALUE;
            this.f63938o00O0O = 0.5f;
            this.f63942o00ooo = new C24348OooO0o0();
        }
    }
}
