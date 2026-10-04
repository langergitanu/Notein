package androidx.constraintlayout.helper.widget;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.OooO0o;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.core.internal.view.SupportMenu;
import com.huawei.hms.network.embedded.C18241k5;
import java.lang.reflect.Array;
import java.util.Arrays;
import o000o0o.C24611OooO00o;

/* JADX INFO: loaded from: classes.dex */
public class Grid extends VirtualLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public String f63626Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public ConstraintLayout f63627Oooo0;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View[] f63628Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f63629Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public int f63630Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f63631Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public int f63632Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public String f63633Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public String f63634Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f63635OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public float f63636OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public String f63637OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public float f63638OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f63639OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int[] f63640OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean[][] f63641o000oOoO;

    public static void OooOOOO(View view) {
        ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) view.getLayoutParams();
        oooO00o.f63911Oooo00o = -1.0f;
        oooO00o.f63881OooO0o = -1;
        oooO00o.f63882OooO0o0 = -1;
        oooO00o.f63883OooO0oO = -1;
        oooO00o.f63884OooO0oo = -1;
        ((ViewGroup.MarginLayoutParams) oooO00o).leftMargin = -1;
        view.setLayoutParams(oooO00o);
    }

    public static void OooOOOo(View view) {
        ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) view.getLayoutParams();
        oooO00o.f63908Oooo0 = -1.0f;
        oooO00o.f63885OooOO0 = -1;
        oooO00o.f63876OooO = -1;
        oooO00o.f63886OooOO0O = -1;
        oooO00o.f63887OooOO0o = -1;
        ((ViewGroup.MarginLayoutParams) oooO00o).topMargin = -1;
        view.setLayoutParams(oooO00o);
    }

    public static float[] OooOo0(int i, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length != i) {
            return null;
        }
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = Float.parseFloat(strArrSplit[i2].trim());
        }
        return fArr;
    }

    public static int[][] OooOo00(String str) {
        String[] strArrSplit = str.split(",");
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
        for (int i = 0; i < strArrSplit.length; i++) {
            String[] strArrSplit2 = strArrSplit[i].trim().split(C18241k5.f55433h);
            String[] strArrSplit3 = strArrSplit2[1].split("x");
            iArr[i][0] = Integer.parseInt(strArrSplit2[0]);
            iArr[i][1] = Integer.parseInt(strArrSplit3[0]);
            iArr[i][2] = Integer.parseInt(strArrSplit3[1]);
        }
        return iArr;
    }

    private int getNextPosition() {
        boolean z = false;
        int i = 0;
        while (!z) {
            i = this.f63639OoooOO0;
            int i2 = this.f63629Oooo0O0;
            int i3 = this.f63632Oooo0o0;
            if (i >= i2 * i3) {
                return -1;
            }
            int i4 = this.f63635OoooO;
            int i5 = i4 == 1 ? i % i2 : i / i3;
            int i6 = i4 == 1 ? i / i2 : i % i3;
            boolean[] zArr = this.f63641o000oOoO[i5];
            if (zArr[i6]) {
                zArr[i6] = false;
                z = true;
            }
            this.f63639OoooOO0 = i + 1;
        }
        return i;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void OooO(AttributeSet attributeSet) {
        super.OooO(attributeSet);
        this.f63871OooOoOO = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, OooO0o.f64134OooO0o);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 5) {
                    this.f63630Oooo0OO = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == 1) {
                    this.f63631Oooo0o = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == 7) {
                    this.f63633Oooo0oO = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 6) {
                    this.f63634Oooo0oo = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 4) {
                    this.f63626Oooo = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 0) {
                    this.f63637OoooO00 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 3) {
                    this.f63635OoooO = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 2) {
                    this.f63636OoooO0 = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == 10) {
                    this.f63638OoooO0O = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == 9) {
                    typedArrayObtainStyledAttributes.getBoolean(index, false);
                } else if (index == 8) {
                    typedArrayObtainStyledAttributes.getBoolean(index, false);
                }
            }
            OooOo0O();
            OooOOo();
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void OooOOo() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.f63629Oooo0O0, this.f63632Oooo0o0);
        this.f63641o000oOoO = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
    }

    public final void OooOOo0(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int[][] iArrOooOo00;
        int[][] iArrOooOo002;
        if (this.f63627Oooo0 == null || (i = this.f63629Oooo0O0) < 1 || (i2 = this.f63632Oooo0o0) < 1) {
            return;
        }
        if (z) {
            for (int i5 = 0; i5 < this.f63641o000oOoO.length; i5++) {
                int i6 = 0;
                while (true) {
                    boolean[][] zArr = this.f63641o000oOoO;
                    if (i6 < zArr[0].length) {
                        zArr[i5][i6] = true;
                        i6++;
                    }
                }
            }
            throw null;
        }
        this.f63639OoooOO0 = 0;
        int iMax = Math.max(i, i2);
        if (iMax != this.f63628Oooo00o.length) {
            View[] viewArr = new View[iMax];
            for (int i7 = 0; i7 < iMax; i7++) {
                View[] viewArr2 = this.f63628Oooo00o;
                if (i7 < viewArr2.length) {
                    viewArr[i7] = viewArr2[i7];
                } else {
                    View view = new View(getContext());
                    view.setId(View.generateViewId());
                    view.setVisibility(4);
                    this.f63627Oooo0.addView(view, new ConstraintLayout.OooO00o(0, 0));
                    viewArr[i7] = view;
                }
            }
            int i8 = iMax;
            while (true) {
                View[] viewArr3 = this.f63628Oooo00o;
                if (i8 >= viewArr3.length) {
                    break;
                }
                this.f63627Oooo0.removeView(viewArr3[i8]);
                i8++;
            }
            this.f63628Oooo00o = viewArr;
        }
        this.f63640OoooOOO = new int[iMax];
        int i9 = 0;
        while (true) {
            View[] viewArr4 = this.f63628Oooo00o;
            if (i9 >= viewArr4.length) {
                break;
            }
            this.f63640OoooOOO[i9] = viewArr4[i9].getId();
            i9++;
        }
        int id = getId();
        int iMax2 = Math.max(this.f63629Oooo0O0, this.f63632Oooo0o0);
        float[] fArrOooOo0 = OooOo0(this.f63629Oooo0O0, this.f63626Oooo);
        if (this.f63629Oooo0O0 == 1) {
            ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) this.f63628Oooo00o[0].getLayoutParams();
            OooOOOo(this.f63628Oooo00o[0]);
            oooO00o.f63876OooO = id;
            oooO00o.f63887OooOO0o = id;
            this.f63628Oooo00o[0].setLayoutParams(oooO00o);
        } else {
            int i10 = 0;
            while (true) {
                i3 = this.f63629Oooo0O0;
                if (i10 >= i3) {
                    break;
                }
                ConstraintLayout.OooO00o oooO00o2 = (ConstraintLayout.OooO00o) this.f63628Oooo00o[i10].getLayoutParams();
                OooOOOo(this.f63628Oooo00o[i10]);
                if (fArrOooOo0 != null) {
                    oooO00o2.f63908Oooo0 = fArrOooOo0[i10];
                }
                if (i10 > 0) {
                    oooO00o2.f63885OooOO0 = this.f63640OoooOOO[i10 - 1];
                } else {
                    oooO00o2.f63876OooO = id;
                }
                if (i10 < this.f63629Oooo0O0 - 1) {
                    oooO00o2.f63886OooOO0O = this.f63640OoooOOO[i10 + 1];
                } else {
                    oooO00o2.f63887OooOO0o = id;
                }
                if (i10 > 0) {
                    ((ViewGroup.MarginLayoutParams) oooO00o2).topMargin = (int) this.f63636OoooO0;
                }
                this.f63628Oooo00o[i10].setLayoutParams(oooO00o2);
                i10++;
            }
            while (i3 < iMax2) {
                ConstraintLayout.OooO00o oooO00o3 = (ConstraintLayout.OooO00o) this.f63628Oooo00o[i3].getLayoutParams();
                OooOOOo(this.f63628Oooo00o[i3]);
                oooO00o3.f63876OooO = id;
                oooO00o3.f63887OooOO0o = id;
                this.f63628Oooo00o[i3].setLayoutParams(oooO00o3);
                i3++;
            }
        }
        int id2 = getId();
        int iMax3 = Math.max(this.f63629Oooo0O0, this.f63632Oooo0o0);
        float[] fArrOooOo02 = OooOo0(this.f63632Oooo0o0, this.f63637OoooO00);
        ConstraintLayout.OooO00o oooO00o4 = (ConstraintLayout.OooO00o) this.f63628Oooo00o[0].getLayoutParams();
        if (this.f63632Oooo0o0 == 1) {
            OooOOOO(this.f63628Oooo00o[0]);
            oooO00o4.f63882OooO0o0 = id2;
            oooO00o4.f63884OooO0oo = id2;
            this.f63628Oooo00o[0].setLayoutParams(oooO00o4);
        } else {
            int i11 = 0;
            while (true) {
                i4 = this.f63632Oooo0o0;
                if (i11 >= i4) {
                    break;
                }
                ConstraintLayout.OooO00o oooO00o5 = (ConstraintLayout.OooO00o) this.f63628Oooo00o[i11].getLayoutParams();
                OooOOOO(this.f63628Oooo00o[i11]);
                if (fArrOooOo02 != null) {
                    oooO00o5.f63911Oooo00o = fArrOooOo02[i11];
                }
                if (i11 > 0) {
                    oooO00o5.f63881OooO0o = this.f63640OoooOOO[i11 - 1];
                } else {
                    oooO00o5.f63882OooO0o0 = id2;
                }
                if (i11 < this.f63632Oooo0o0 - 1) {
                    oooO00o5.f63883OooO0oO = this.f63640OoooOOO[i11 + 1];
                } else {
                    oooO00o5.f63884OooO0oo = id2;
                }
                if (i11 > 0) {
                    ((ViewGroup.MarginLayoutParams) oooO00o5).leftMargin = (int) this.f63636OoooO0;
                }
                this.f63628Oooo00o[i11].setLayoutParams(oooO00o5);
                i11++;
            }
            while (i4 < iMax3) {
                ConstraintLayout.OooO00o oooO00o6 = (ConstraintLayout.OooO00o) this.f63628Oooo00o[i4].getLayoutParams();
                OooOOOO(this.f63628Oooo00o[i4]);
                oooO00o6.f63882OooO0o0 = id2;
                oooO00o6.f63884OooO0oo = id2;
                this.f63628Oooo00o[i4].setLayoutParams(oooO00o6);
                i4++;
            }
        }
        String str = this.f63634Oooo0oo;
        if (str != null && !str.trim().isEmpty() && (iArrOooOo002 = OooOo00(this.f63634Oooo0oo)) != null) {
            for (int[] iArr : iArrOooOo002) {
                int i12 = iArr[0];
                int i13 = this.f63635OoooO;
                if (!OooOOoo(i13 == 1 ? i12 % this.f63629Oooo0O0 : i12 / this.f63632Oooo0o0, i13 == 1 ? i12 / this.f63629Oooo0O0 : i12 % this.f63632Oooo0o0, iArr[1], iArr[2])) {
                    break;
                }
            }
        }
        String str2 = this.f63633Oooo0oO;
        if (str2 != null && !str2.trim().isEmpty() && (iArrOooOo00 = OooOo00(this.f63633Oooo0oO)) != null) {
            int[] iArr2 = this.f63868OooOo0o;
            View[] viewArrOooO0oo = OooO0oo(this.f63627Oooo0);
            if (iArrOooOo00.length > 0) {
                int[] iArr3 = iArrOooOo00[0];
                int i14 = iArr3[0];
                int i15 = this.f63635OoooO;
                int i16 = i15 == 1 ? i14 % this.f63629Oooo0O0 : i14 / this.f63632Oooo0o0;
                int i17 = i15 == 1 ? i14 / this.f63629Oooo0O0 : i14 % this.f63632Oooo0o0;
                if (OooOOoo(i16, i17, iArr3[1], iArr3[2])) {
                    View view2 = viewArrOooO0oo[0];
                    int[] iArr4 = iArrOooOo00[0];
                    int i18 = iArr4[1];
                    int i19 = iArr4[2];
                    ConstraintLayout.OooO00o oooO00o7 = (ConstraintLayout.OooO00o) view2.getLayoutParams();
                    int[] iArr5 = this.f63640OoooOOO;
                    oooO00o7.f63882OooO0o0 = iArr5[i17];
                    oooO00o7.f63876OooO = iArr5[i16];
                    oooO00o7.f63884OooO0oo = iArr5[(i17 + i19) - 1];
                    oooO00o7.f63887OooOO0o = iArr5[(i16 + i18) - 1];
                    view2.setLayoutParams(oooO00o7);
                    int i20 = iArr2[0];
                    throw null;
                }
            }
        }
        OooO0oo(this.f63627Oooo0);
        if (this.f63867OooOo <= 0) {
            return;
        }
        int i21 = this.f63868OooOo0o[0];
        throw null;
    }

    public final boolean OooOOoo(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.f63641o000oOoO;
                if (i5 < zArr.length && i6 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final void OooOo0O() {
        int i;
        int i2 = this.f63630Oooo0OO;
        if (i2 != 0 && (i = this.f63631Oooo0o) != 0) {
            this.f63629Oooo0O0 = i2;
            this.f63632Oooo0o0 = i;
            return;
        }
        int i3 = this.f63631Oooo0o;
        if (i3 > 0) {
            this.f63632Oooo0o0 = i3;
            this.f63629Oooo0O0 = C24611OooO00o.OooO00o(this.f63867OooOo, i3, 1, i3);
        } else if (i2 > 0) {
            this.f63629Oooo0O0 = i2;
            this.f63632Oooo0o0 = C24611OooO00o.OooO00o(this.f63867OooOo, i2, 1, i2);
        } else {
            int iSqrt = (int) (Math.sqrt(this.f63867OooOo) + 1.5d);
            this.f63629Oooo0O0 = iSqrt;
            this.f63632Oooo0o0 = C24611OooO00o.OooO00o(this.f63867OooOo, iSqrt, 1, iSqrt);
        }
    }

    public String getColumnWeights() {
        return this.f63637OoooO00;
    }

    public int getColumns() {
        return this.f63631Oooo0o;
    }

    public float getHorizontalGaps() {
        return this.f63636OoooO0;
    }

    public int getOrientation() {
        return this.f63635OoooO;
    }

    public String getRowWeights() {
        return this.f63626Oooo;
    }

    public int getRows() {
        return this.f63630Oooo0OO;
    }

    public String getSkips() {
        return this.f63634Oooo0oo;
    }

    public String getSpans() {
        return this.f63633Oooo0oO;
    }

    public float getVerticalGaps() {
        return this.f63638OoooO0O;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f63627Oooo0 = (ConstraintLayout) getParent();
        OooOOo0(false);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            Paint paint = new Paint();
            paint.setColor(SupportMenu.CATEGORY_MASK);
            paint.setStyle(Paint.Style.STROKE);
            int top = getTop();
            int left = getLeft();
            int bottom = getBottom();
            int right = getRight();
            for (View view : this.f63628Oooo00o) {
                int left2 = view.getLeft() - left;
                int top2 = view.getTop() - top;
                int right2 = view.getRight() - left;
                int bottom2 = view.getBottom() - top;
                canvas.drawRect(left2, 0.0f, right2, bottom - top, paint);
                canvas.drawRect(0.0f, top2, right - left, bottom2, paint);
            }
        }
    }

    public void setColumnWeights(String str) {
        String str2 = this.f63637OoooO00;
        if (str2 == null || !str2.equals(str)) {
            this.f63637OoooO00 = str;
            OooOOo0(true);
            invalidate();
        }
    }

    public void setColumns(int i) {
        if (i <= 50 && this.f63631Oooo0o != i) {
            this.f63631Oooo0o = i;
            OooOo0O();
            OooOOo();
            OooOOo0(false);
            invalidate();
        }
    }

    public void setHorizontalGaps(float f) {
        if (f >= 0.0f && this.f63636OoooO0 != f) {
            this.f63636OoooO0 = f;
            OooOOo0(true);
            invalidate();
        }
    }

    public void setOrientation(int i) {
        if ((i == 0 || i == 1) && this.f63635OoooO != i) {
            this.f63635OoooO = i;
            OooOOo0(true);
            invalidate();
        }
    }

    public void setRowWeights(String str) {
        String str2 = this.f63626Oooo;
        if (str2 == null || !str2.equals(str)) {
            this.f63626Oooo = str;
            OooOOo0(true);
            invalidate();
        }
    }

    public void setRows(int i) {
        if (i <= 50 && this.f63630Oooo0OO != i) {
            this.f63630Oooo0OO = i;
            OooOo0O();
            OooOOo();
            OooOOo0(false);
            invalidate();
        }
    }

    public void setSkips(String str) {
        String str2 = this.f63634Oooo0oo;
        if (str2 == null || !str2.equals(str)) {
            this.f63634Oooo0oo = str;
            OooOOo0(true);
            invalidate();
        }
    }

    public void setSpans(CharSequence charSequence) {
        String str = this.f63633Oooo0oO;
        if (str == null || !str.contentEquals(charSequence)) {
            this.f63633Oooo0oO = charSequence.toString();
            OooOOo0(true);
            invalidate();
        }
    }

    public void setVerticalGaps(float f) {
        if (f >= 0.0f && this.f63638OoooO0O != f) {
            this.f63638OoooO0O = f;
            OooOOo0(true);
            invalidate();
        }
    }
}
