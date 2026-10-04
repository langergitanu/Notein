package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.OooO0o;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class CircularFlow extends VirtualLayout {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static int f63613OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static float f63614OoooO0O;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public Float f63615Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public int f63616Oooo0;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public ConstraintLayout f63617Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public float[] f63618Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public int[] f63619Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f63620Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public int f63621Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public String f63622Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public String f63623Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Integer f63624OoooO00;

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.f63620Oooo0o = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                OooOOOO(str.substring(i).trim());
                return;
            } else {
                OooOOOO(str.substring(i, iIndexOf).trim());
                i = iIndexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.f63621Oooo0o0 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                OooOOOo(str.substring(i).trim());
                return;
            } else {
                OooOOOo(str.substring(i, iIndexOf).trim());
                i = iIndexOf + 1;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void OooO(AttributeSet attributeSet) {
        super.OooO(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, OooO0o.f64131OooO0O0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 33) {
                    this.f63616Oooo0 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                } else if (index == 29) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f63622Oooo0oO = string;
                    setAngles(string);
                } else if (index == 32) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f63623Oooo0oo = string2;
                    setRadius(string2);
                } else if (index == 30) {
                    Float fValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, f63614OoooO0O));
                    this.f63615Oooo = fValueOf;
                    setDefaultAngle(fValueOf.floatValue());
                } else if (index == 31) {
                    Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, f63613OoooO0));
                    this.f63624OoooO00 = numValueOf;
                    setDefaultRadius(numValueOf.intValue());
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void OooOOOO(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.f63870OooOoO0 == null || (fArr = this.f63618Oooo0O0) == null) {
            return;
        }
        if (this.f63620Oooo0o + 1 > fArr.length) {
            this.f63618Oooo0O0 = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.f63618Oooo0O0[this.f63620Oooo0o] = Integer.parseInt(str);
        this.f63620Oooo0o++;
    }

    public final void OooOOOo(String str) {
        Context context;
        int[] iArr;
        if (str == null || str.length() == 0 || (context = this.f63870OooOoO0) == null || (iArr = this.f63619Oooo0OO) == null) {
            return;
        }
        if (this.f63621Oooo0o0 + 1 > iArr.length) {
            this.f63619Oooo0OO = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.f63619Oooo0OO[this.f63621Oooo0o0] = (int) (Integer.parseInt(str) * context.getResources().getDisplayMetrics().density);
        this.f63621Oooo0o0++;
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f63618Oooo0O0, this.f63620Oooo0o);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.f63619Oooo0OO, this.f63621Oooo0o0);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f63622Oooo0oO;
        if (str != null) {
            this.f63618Oooo0O0 = new float[1];
            setAngles(str);
        }
        String str2 = this.f63623Oooo0oo;
        if (str2 != null) {
            this.f63619Oooo0OO = new int[1];
            setRadius(str2);
        }
        Float f = this.f63615Oooo;
        if (f != null) {
            setDefaultAngle(f.floatValue());
        }
        Integer num = this.f63624OoooO00;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        this.f63617Oooo00o = (ConstraintLayout) getParent();
        for (int i = 0; i < this.f63867OooOo; i++) {
            View viewById = this.f63617Oooo00o.getViewById(this.f63868OooOo0o[i]);
            if (viewById != null) {
                int i2 = f63613OoooO0;
                float f2 = f63614OoooO0O;
                int[] iArr = this.f63619Oooo0OO;
                HashMap<Integer, String> map = this.f63875OooOooo;
                if (iArr == null || i >= iArr.length) {
                    Integer num2 = this.f63624OoooO00;
                    if (num2 == null || num2.intValue() == -1) {
                        Log.e("CircularFlow", "Added radius to view with id: " + map.get(Integer.valueOf(viewById.getId())));
                    } else {
                        this.f63621Oooo0o0++;
                        if (this.f63619Oooo0OO == null) {
                            this.f63619Oooo0OO = new int[1];
                        }
                        int[] radius = getRadius();
                        this.f63619Oooo0OO = radius;
                        radius[this.f63621Oooo0o0 - 1] = i2;
                    }
                } else {
                    i2 = iArr[i];
                }
                float[] fArr = this.f63618Oooo0O0;
                if (fArr == null || i >= fArr.length) {
                    Float f3 = this.f63615Oooo;
                    if (f3 == null || f3.floatValue() == -1.0f) {
                        Log.e("CircularFlow", "Added angle to view with id: " + map.get(Integer.valueOf(viewById.getId())));
                    } else {
                        this.f63620Oooo0o++;
                        if (this.f63618Oooo0O0 == null) {
                            this.f63618Oooo0O0 = new float[1];
                        }
                        float[] angles = getAngles();
                        this.f63618Oooo0O0 = angles;
                        angles[this.f63620Oooo0o - 1] = f2;
                    }
                } else {
                    f2 = fArr[i];
                }
                ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) viewById.getLayoutParams();
                oooO00o.f63892OooOOo = f2;
                oooO00o.f63891OooOOOo = this.f63616Oooo0;
                oooO00o.f63893OooOOo0 = i2;
                viewById.setLayoutParams(oooO00o);
            }
        }
        OooO0Oo();
    }

    public void setDefaultAngle(float f) {
        f63614OoooO0O = f;
    }

    public void setDefaultRadius(int i) {
        f63613OoooO0 = i;
    }
}
