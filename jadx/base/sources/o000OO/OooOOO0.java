package o000OO;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.app.NotificationCompat;
import com.aspose.slides.C22218Oooo;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import o0000O00.C24140OooO0Oo;
import o0000O0O.AbstractC24153OooO0Oo;
import o0000O0O.OooO0O0;
import o0000O0O.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o0000O00.OooO00o f82595OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public View f82596OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f82597OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f82598OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooOOO f82599OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C24447OooOO0o f82600OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooOOO f82601OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public C24447OooOO0o f82602OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o0000O00.OooO0O0[] f82603OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f82604OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int[] f82605OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public double[] f82606OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public String[] f82607OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public double[] f82608OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int[] f82609OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float[] f82610OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public ArrayList<AbstractC24443OooO0Oo> f82611OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public ArrayList<OooOOO> f82612OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public HashMap<String, AbstractC24153OooO0Oo> f82613OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f82614OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public HashMap<String, o0000O0O.OooO0O0> f82615OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public HashMap<String, o0000O0O.OooO0OO> f82616OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public OooOO0O[] f82617OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f82618OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f82619OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public View f82620OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public float f82621OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f82622OooOoo0;

    public final float OooO00o() {
        OooOOO0 oooOOO0 = this;
        float[] fArr = new float[2];
        float f = 1.0f / 99;
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        float fHypot = 0.0f;
        while (i < 100) {
            float f2 = i * f;
            double dOooO00o = f2;
            o0000O00.OooO0OO oooO0OO = oooOOO0.f82599OooO0Oo.f82583OooOo0o;
            float f3 = Float.NaN;
            float f4 = 0.0f;
            for (OooOOO oooOOO : oooOOO0.f82612OooOOo0) {
                o0000O00.OooO0OO oooO0OO2 = oooOOO.f82583OooOo0o;
                if (oooO0OO2 != null) {
                    float f5 = oooOOO.f82582OooOo;
                    if (f5 < f2) {
                        f4 = f5;
                        oooO0OO = oooO0OO2;
                    } else if (Float.isNaN(f3)) {
                        f3 = oooOOO.f82582OooOo;
                    }
                }
            }
            if (oooO0OO != null) {
                if (Float.isNaN(f3)) {
                    f3 = 1.0f;
                }
                dOooO00o = (((float) oooO0OO.OooO00o((f2 - f4) / r17)) * (f3 - f4)) + f4;
            }
            oooOOO0.f82603OooO0oo[0].OooO0OO(dOooO00o, oooOOO0.f82606OooOO0o);
            int[] iArr = oooOOO0.f82605OooOO0O;
            double[] dArr = oooOOO0.f82606OooOO0o;
            OooOOO oooOOO2 = oooOOO0.f82599OooO0Oo;
            float f6 = oooOOO2.f82584OooOoO;
            float f7 = oooOOO2.f82586OooOoOO;
            float f8 = oooOOO2.f82588OooOoo0;
            float f9 = oooOOO2.f82587OooOoo;
            int i2 = 0;
            while (true) {
                int[] iArr2 = iArr;
                if (i2 >= iArr.length) {
                    break;
                }
                float[] fArr2 = fArr;
                float f10 = (float) dArr[i2];
                int i3 = iArr2[i2];
                if (i3 == 1) {
                    f6 = f10;
                } else if (i3 == 2) {
                    f7 = f10;
                } else if (i3 == 3) {
                    f8 = f10;
                } else if (i3 == 4) {
                    f9 = f10;
                }
                i2++;
                iArr = iArr2;
                fArr = fArr2;
            }
            float[] fArr3 = fArr;
            float f11 = (f8 / 2.0f) + f6 + 0.0f;
            fArr3[0] = f11;
            float f12 = (f9 / 2.0f) + f7 + 0.0f;
            fArr3[1] = f12;
            if (i > 0) {
                fHypot += (float) Math.hypot(d2 - ((double) f12), d - ((double) f11));
            }
            d = fArr3[0];
            d2 = fArr3[1];
            i++;
            oooOOO0 = this;
            fArr = fArr3;
        }
        return fHypot;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x043e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooO0O0(float f, long j, View view, C24140OooO0Oo c24140OooO0Oo) {
        float fOooO00o;
        AbstractC24153OooO0Oo.C19605OooO0Oo c19605OooO0Oo;
        boolean zOooO0o0;
        boolean z;
        float f2;
        AbstractC24153OooO0Oo.C19605OooO0Oo c19605OooO0Oo2;
        boolean z2;
        float f3;
        float f4;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        float f5;
        float f6;
        float f7;
        boolean z7;
        float f8;
        boolean z8;
        float f9 = this.f82604OooOO0;
        if (f9 != 1.0d) {
            float f10 = f < 0.0f ? 0.0f : f;
            fOooO00o = (f10 <= 0.0f || ((double) f10) >= 1.0d) ? f10 : Math.min((f10 - 0.0f) * f9, 1.0f);
        } else {
            fOooO00o = f;
        }
        o0000O00.OooO0OO oooO0OO = this.f82599OooO0Oo.f82583OooOo0o;
        float f11 = 0.0f;
        float f12 = Float.NaN;
        for (OooOOO oooOOO : this.f82612OooOOo0) {
            o0000O00.OooO0OO oooO0OO2 = oooOOO.f82583OooOo0o;
            if (oooO0OO2 != null) {
                float f13 = oooOOO.f82582OooOo;
                if (f13 < fOooO00o) {
                    oooO0OO = oooO0OO2;
                    f11 = f13;
                } else if (Float.isNaN(f12)) {
                    f12 = oooOOO.f82582OooOo;
                }
            }
        }
        if (oooO0OO != null) {
            if (Float.isNaN(f12)) {
                f12 = 1.0f;
            }
            fOooO00o = (((float) oooO0OO.OooO00o((fOooO00o - f11) / r4)) * (f12 - f11)) + f11;
        }
        int i = this.f82619OooOoO;
        if (i != -1) {
            float f14 = 1.0f / i;
            float fFloor = ((float) Math.floor(fOooO00o / f14)) * f14;
            float f15 = (fOooO00o % f14) / f14;
            float f16 = this.f82621OooOoOO;
            if (!Float.isNaN(f16)) {
                f15 = (f15 + f16) % 1.0f;
            }
            fOooO00o = ((((double) f15) > 0.5d ? 1.0f : 0.0f) * f14) + fFloor;
        }
        float f17 = fOooO00o;
        HashMap<String, o0000O0O.OooO0OO> map = this.f82616OooOo00;
        if (map != null) {
            Iterator<o0000O0O.OooO0OO> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().OooO0Oo(view, f17);
            }
        }
        HashMap<String, AbstractC24153OooO0Oo> map2 = this.f82613OooOOoo;
        if (map2 != null) {
            AbstractC24153OooO0Oo.C19605OooO0Oo c19605OooO0Oo3 = null;
            zOooO0o0 = false;
            for (AbstractC24153OooO0Oo abstractC24153OooO0Oo : map2.values()) {
                if (abstractC24153OooO0Oo instanceof AbstractC24153OooO0Oo.C19605OooO0Oo) {
                    c19605OooO0Oo3 = (AbstractC24153OooO0Oo.C19605OooO0Oo) abstractC24153OooO0Oo;
                } else {
                    zOooO0o0 |= abstractC24153OooO0Oo.OooO0o0(f17, j, view, c24140OooO0Oo);
                }
            }
            c19605OooO0Oo = c19605OooO0Oo3;
        } else {
            c19605OooO0Oo = null;
            zOooO0o0 = false;
        }
        o0000O00.OooO0O0[] oooO0O0Arr = this.f82603OooO0oo;
        OooOOO oooOOO2 = this.f82599OooO0Oo;
        if (oooO0O0Arr != null) {
            double d = f17;
            oooO0O0Arr[0].OooO0OO(d, this.f82606OooOO0o);
            this.f82603OooO0oo[0].OooO0o0(d, this.f82608OooOOO0);
            o0000O00.OooO00o oooO00o = this.f82595OooO;
            if (oooO00o != null) {
                double[] dArr = this.f82606OooOO0o;
                f2 = 0.0f;
                if (dArr.length > 0) {
                    oooO00o.OooO0OO(d, dArr);
                    this.f82595OooO.OooO0o0(d, this.f82608OooOOO0);
                }
            } else {
                f2 = 0.0f;
            }
            if (this.f82622OooOoo0) {
                c19605OooO0Oo2 = c19605OooO0Oo;
                z2 = zOooO0o0;
                f3 = 1.0f;
                f4 = 2.0f;
            } else {
                int[] iArr = this.f82605OooOO0O;
                double[] dArr2 = this.f82606OooOO0o;
                f4 = 2.0f;
                double[] dArr3 = this.f82608OooOOO0;
                f3 = 1.0f;
                boolean z9 = this.f82597OooO0O0;
                float f18 = oooOOO2.f82584OooOoO;
                float f19 = oooOOO2.f82586OooOoOO;
                float f20 = oooOOO2.f82588OooOoo0;
                int i2 = 1;
                float f21 = oooOOO2.f82587OooOoo;
                c19605OooO0Oo2 = c19605OooO0Oo;
                if (iArr.length != 0) {
                    f5 = f20;
                    if (oooOOO2.f82594Oooo00o.length <= iArr[iArr.length - 1]) {
                        int i3 = iArr[iArr.length - 1] + 1;
                        oooOOO2.f82594Oooo00o = new double[i3];
                        oooOOO2.f82591Oooo0 = new double[i3];
                    }
                } else {
                    f5 = f20;
                }
                Arrays.fill(oooOOO2.f82594Oooo00o, Double.NaN);
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    double[] dArr4 = oooOOO2.f82594Oooo00o;
                    int i5 = iArr[i4];
                    dArr4[i5] = dArr2[i4];
                    oooOOO2.f82591Oooo0[i5] = dArr3[i4];
                }
                float f22 = f2;
                float f23 = f22;
                float f24 = f5;
                float f25 = f18;
                float f26 = Float.NaN;
                int i6 = 0;
                float f27 = f23;
                float f28 = f27;
                while (true) {
                    double[] dArr5 = oooOOO2.f82594Oooo00o;
                    f6 = f24;
                    if (i6 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i6])) {
                        f7 = f21;
                        z7 = zOooO0o0;
                        z8 = z9;
                    } else {
                        f7 = f21;
                        z7 = zOooO0o0;
                        f8 = (float) (Double.isNaN(oooOOO2.f82594Oooo00o[i6]) ? 0.0d : oooOOO2.f82594Oooo00o[i6] + 0.0d);
                        z8 = z9;
                        float f29 = (float) oooOOO2.f82591Oooo0[i6];
                        if (i6 == i2) {
                            f25 = f8;
                            f22 = f29;
                        } else if (i6 == 2) {
                            f19 = f8;
                            f23 = f29;
                        } else if (i6 == 3) {
                            f6 = f8;
                            f27 = f29;
                        } else if (i6 != 4) {
                            if (i6 != 5) {
                            }
                            f21 = f7;
                            i6++;
                            f26 = f8;
                            f24 = f6;
                            z9 = z8;
                            zOooO0o0 = z7;
                            i2 = 1;
                        } else {
                            f28 = f29;
                            f21 = f8;
                            f8 = f26;
                            i6++;
                            f26 = f8;
                            f24 = f6;
                            z9 = z8;
                            zOooO0o0 = z7;
                            i2 = 1;
                        }
                    }
                    f8 = f26;
                    f21 = f7;
                    i6++;
                    f26 = f8;
                    f24 = f6;
                    z9 = z8;
                    zOooO0o0 = z7;
                    i2 = 1;
                }
                float f30 = f21;
                z2 = zOooO0o0;
                boolean z10 = z9;
                if (!Float.isNaN(f26)) {
                    view.setRotation(f26 + ((float) Math.toDegrees(Math.atan2((f28 / 2.0f) + f23, (f27 / 2.0f) + f22))) + f2);
                }
                if (view instanceof OooO0OO) {
                    ((OooO0OO) view).OooO00o(f25, f19, f25 + f6, f19 + f30);
                } else {
                    float f31 = f25 + 0.5f;
                    int i7 = (int) f31;
                    float f32 = f19 + 0.5f;
                    int i8 = (int) f32;
                    int i9 = (int) (f31 + f6);
                    int i10 = (int) (f32 + f30);
                    int i11 = i9 - i7;
                    int i12 = i10 - i8;
                    if (i11 != view.getMeasuredWidth() || i12 != view.getMeasuredHeight() || z10) {
                        view.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                    }
                    view.layout(i7, i8, i9, i10);
                }
                this.f82597OooO0O0 = false;
            }
            int i13 = this.f82614OooOo;
            if (i13 != -1) {
                if (this.f82620OooOoO0 == null) {
                    this.f82620OooOoO0 = ((View) view.getParent()).findViewById(i13);
                }
                if (this.f82620OooOoO0 != null) {
                    float bottom = (this.f82620OooOoO0.getBottom() + r1.getTop()) / f4;
                    float right = (this.f82620OooOoO0.getRight() + this.f82620OooOoO0.getLeft()) / f4;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(right - view.getLeft());
                        view.setPivotY(bottom - view.getTop());
                    }
                }
            }
            HashMap<String, o0000O0O.OooO0OO> map3 = this.f82616OooOo00;
            if (map3 != null) {
                for (o0000O0O.OooO0OO oooO0OO3 : map3.values()) {
                    if (oooO0OO3 instanceof OooO0OO.OooO0Oo) {
                        double[] dArr6 = this.f82608OooOOO0;
                        if (dArr6.length > 1) {
                            view.setRotation(((OooO0OO.OooO0Oo) oooO0OO3).OooO00o(f17) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        }
                    }
                }
            }
            if (c19605OooO0Oo2 != null) {
                double[] dArr7 = this.f82608OooOOO0;
                double d2 = dArr7[0];
                double d3 = dArr7[1];
                AbstractC24153OooO0Oo.C19605OooO0Oo c19605OooO0Oo4 = c19605OooO0Oo2;
                view.setRotation(c19605OooO0Oo4.OooO0Oo(f17, j, view, c24140OooO0Oo) + ((float) Math.toDegrees(Math.atan2(d3, d2))));
                z = z2 | c19605OooO0Oo4.f81418OooO0oo;
            } else {
                z = z2;
            }
            int i14 = 1;
            while (true) {
                o0000O00.OooO0O0[] oooO0O0Arr2 = this.f82603OooO0oo;
                if (i14 >= oooO0O0Arr2.length) {
                    break;
                }
                o0000O00.OooO0O0 oooO0O0 = oooO0O0Arr2[i14];
                float[] fArr = this.f82610OooOOOo;
                oooO0O0.OooO0Oo(d, fArr);
                o0000O0O.OooO00o.OooO0O0(oooOOO2.f82593Oooo00O.get(this.f82607OooOOO[i14 - 1]), view, fArr);
                i14++;
            }
            C24447OooOO0o c24447OooOO0o = this.f82600OooO0o;
            c24447OooOO0o.getClass();
            if (f17 <= f2) {
                view.setVisibility(c24447OooOO0o.f82565OooOo);
            } else {
                C24447OooOO0o c24447OooOO0o2 = this.f82602OooO0oO;
                if (f17 >= f3) {
                    view.setVisibility(c24447OooOO0o2.f82565OooOo);
                } else if (c24447OooOO0o2.f82565OooOo != c24447OooOO0o.f82565OooOo) {
                    view.setVisibility(0);
                }
            }
            if (this.f82617OooOo0O != null) {
                int i15 = 0;
                while (true) {
                    OooOO0O[] oooOO0OArr = this.f82617OooOo0O;
                    if (i15 >= oooOO0OArr.length) {
                        break;
                    }
                    OooOO0O oooOO0O = oooOO0OArr[i15];
                    boolean z11 = true;
                    boolean z12 = false;
                    if (oooOO0O.f82556OooOOOo != -1) {
                        if (oooOO0O.f82558OooOOo0 == null) {
                            oooOO0O.f82558OooOOo0 = ((ViewGroup) view.getParent()).findViewById(oooOO0O.f82556OooOOOo);
                        }
                        OooOO0O.OooO0oo(oooOO0O.f82549OooO0oo, oooOO0O.f82558OooOOo0, oooOO0O.f82563OooOo0o);
                        OooOO0O.OooO0oo(oooOO0O.f82544OooO, view, oooOO0O.f82563OooOo0o);
                        if (oooOO0O.f82549OooO0oo.intersect(oooOO0O.f82544OooO)) {
                            if (oooOO0O.f82557OooOOo) {
                                oooOO0O.f82557OooOOo = false;
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (oooOO0O.f82561OooOo00) {
                                oooOO0O.f82561OooOo00 = false;
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            oooOO0O.f82559OooOOoo = true;
                        } else {
                            if (oooOO0O.f82557OooOOo) {
                                z3 = false;
                            } else {
                                oooOO0O.f82557OooOOo = true;
                                z3 = true;
                            }
                            if (oooOO0O.f82559OooOOoo) {
                                oooOO0O.f82559OooOOoo = false;
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            oooOO0O.f82561OooOo00 = true;
                            boolean z13 = z5;
                            z6 = false;
                            z12 = z13;
                        }
                        z11 = z6;
                    } else {
                        if (oooOO0O.f82557OooOOo) {
                            float f33 = oooOO0O.f82560OooOo0;
                            if ((oooOO0O.f82562OooOo0O - f33) * (f17 - f33) < 0.0f) {
                                oooOO0O.f82557OooOOo = false;
                                z3 = true;
                            }
                            if (!oooOO0O.f82559OooOOoo) {
                                float f34 = oooOO0O.f82560OooOo0;
                                float f35 = f17 - f34;
                                if ((oooOO0O.f82562OooOo0O - f34) * f35 < 0.0f && f35 < 0.0f) {
                                    oooOO0O.f82559OooOOoo = false;
                                    z4 = true;
                                }
                                if (oooOO0O.f82561OooOo00) {
                                    float f36 = oooOO0O.f82560OooOo0;
                                    float f37 = f17 - f36;
                                    if ((oooOO0O.f82562OooOo0O - f36) * f37 < 0.0f && f37 > 0.0f) {
                                        oooOO0O.f82561OooOo00 = false;
                                    }
                                    z12 = z4;
                                } else if (Math.abs(f17 - oooOO0O.f82560OooOo0) > oooOO0O.f82545OooO0Oo) {
                                    oooOO0O.f82561OooOo00 = true;
                                }
                                z11 = false;
                                z12 = z4;
                            } else if (Math.abs(f17 - oooOO0O.f82560OooOo0) > oooOO0O.f82545OooO0Oo) {
                                oooOO0O.f82559OooOOoo = true;
                            }
                            z4 = false;
                            if (oooOO0O.f82561OooOo00) {
                            }
                            z11 = false;
                            z12 = z4;
                        } else if (Math.abs(f17 - oooOO0O.f82560OooOo0) > oooOO0O.f82545OooO0Oo) {
                            oooOO0O.f82557OooOOo = true;
                        }
                        z3 = false;
                        if (!oooOO0O.f82559OooOOoo) {
                        }
                        z4 = false;
                        if (oooOO0O.f82561OooOo00) {
                        }
                        z11 = false;
                        z12 = z4;
                    }
                    oooOO0O.f82562OooOo0O = f17;
                    if (z12 || z3 || z11) {
                        MotionLayout motionLayout = (MotionLayout) view.getParent();
                        MotionLayout.InterfaceC21622OooO0o0 interfaceC21622OooO0o0 = motionLayout.f63678Oooo0o;
                        Iterator<MotionLayout.InterfaceC21622OooO0o0> it2 = motionLayout.f63689OoooOo0.iterator();
                        while (it2.hasNext()) {
                            it2.next().getClass();
                        }
                    }
                    View viewFindViewById = oooOO0O.f82552OooOO0o == -1 ? view : ((MotionLayout) view.getParent()).findViewById(oooOO0O.f82552OooOO0o);
                    if (z12) {
                        String str = oooOO0O.f82554OooOOO0;
                        if (str != null) {
                            oooOO0O.OooO0oO(viewFindViewById, str);
                        }
                        if (oooOO0O.f82547OooO0o0 != -1) {
                            ((MotionLayout) view.getParent()).OooO(oooOO0O.f82547OooO0o0, viewFindViewById);
                        }
                    }
                    if (z11) {
                        String str2 = oooOO0O.f82553OooOOO;
                        if (str2 != null) {
                            oooOO0O.OooO0oO(viewFindViewById, str2);
                        }
                        if (oooOO0O.f82546OooO0o != -1) {
                            ((MotionLayout) view.getParent()).OooO(oooOO0O.f82546OooO0o, viewFindViewById);
                        }
                    }
                    if (z3) {
                        String str3 = oooOO0O.f82551OooOO0O;
                        if (str3 != null) {
                            oooOO0O.OooO0oO(viewFindViewById, str3);
                        }
                        if (oooOO0O.f82548OooO0oO != -1) {
                            ((MotionLayout) view.getParent()).OooO(oooOO0O.f82548OooO0oO, viewFindViewById);
                        }
                    }
                    i15++;
                }
            }
        } else {
            boolean z14 = zOooO0o0;
            float f38 = oooOOO2.f82584OooOoO;
            OooOOO oooOOO3 = this.f82601OooO0o0;
            float fOooO0O0 = OooOO0.OooO0OO.OooO0O0(oooOOO3.f82584OooOoO, f38, f17, f38);
            float f39 = oooOOO2.f82586OooOoOO;
            float fOooO0O02 = OooOO0.OooO0OO.OooO0O0(oooOOO3.f82586OooOoOO, f39, f17, f39);
            float f40 = oooOOO2.f82588OooOoo0;
            float f41 = oooOOO3.f82588OooOoo0;
            float fOooO0O03 = OooOO0.OooO0OO.OooO0O0(f41, f40, f17, f40);
            float f42 = oooOOO2.f82587OooOoo;
            float f43 = oooOOO3.f82587OooOoo;
            float f44 = fOooO0O0 + 0.5f;
            int i16 = (int) f44;
            float f45 = fOooO0O02 + 0.5f;
            int i17 = (int) f45;
            int i18 = (int) (f44 + fOooO0O03);
            int iOooO0O0 = (int) (f45 + OooOO0.OooO0OO.OooO0O0(f43, f42, f17, f42));
            int i19 = i18 - i16;
            int i20 = iOooO0O0 - i17;
            if (f41 != f40 || f43 != f42 || this.f82597OooO0O0) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(i20, 1073741824));
                this.f82597OooO0O0 = false;
            }
            view.layout(i16, i17, i18, iOooO0O0);
            z = z14;
        }
        HashMap<String, o0000O0O.OooO0O0> map4 = this.f82615OooOo0;
        if (map4 != null) {
            for (o0000O0O.OooO0O0 oooO0O02 : map4.values()) {
                if (oooO0O02 instanceof OooO0O0.C24145OooO0Oo) {
                    double[] dArr8 = this.f82608OooOOO0;
                    view.setRotation(((OooO0O0.C24145OooO0Oo) oooO0O02).OooO00o(f17) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    oooO0O02.OooO0o0(view, f17);
                }
            }
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:435:0x0bc5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0c43  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0OO(int i, int i2, long j) {
        String str;
        String str2;
        String str3;
        ArrayList arrayList;
        HashSet<String> hashSet;
        HashSet<String> hashSet2;
        HashSet<String> hashSet3;
        OooOOO oooOOO;
        ArrayList<OooOOO> arrayList2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        OooOOO oooOOO2;
        String str10;
        int i3;
        String str11;
        int i4;
        androidx.constraintlayout.widget.OooO00o oooO00o;
        String str12;
        HashSet<String> hashSet4;
        Iterator<String> it;
        HashMap<String, Integer> map;
        String str13;
        Object obj;
        Object obj2;
        String str14;
        byte b;
        byte b2;
        String str15;
        o0000O00.OooOOO0 c24155OooO0oO;
        String str16;
        o0000O00.OooOOO0 oooO;
        AbstractC24153OooO0Oo.OooO0O0 oooO0O0;
        o0000O00.OooOOO0 oooOOO0;
        androidx.constraintlayout.widget.OooO00o oooO00o2;
        Integer num;
        Iterator<String> it2;
        HashSet<String> hashSet5;
        HashSet<String> hashSet6;
        ArrayList<OooOOO> arrayList3;
        HashSet<String> hashSet7;
        OooOOO oooOOO3;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        OooOOO oooOOO4;
        Object obj3;
        byte b3;
        String str23;
        String str24;
        byte b4;
        byte b5;
        String str25;
        o0000O00.OooOO0O oooOO0O;
        o0000O00.OooOO0O oooO2;
        androidx.constraintlayout.widget.OooO00o oooO00o3;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        OooOOO oooOOO5;
        HashSet<String> hashSet8;
        HashSet<String> hashSet9;
        HashMap<String, Integer> map2;
        float fMin;
        float fOooO0O0;
        String str32 = "transformPivotY";
        String str33 = "transformPivotX";
        String str34 = "scaleY";
        String str35 = "scaleX";
        String str36 = NotificationCompat.CATEGORY_PROGRESS;
        new HashSet();
        HashSet<String> hashSet10 = new HashSet<>();
        HashSet<String> hashSet11 = new HashSet<>();
        HashSet<String> hashSet12 = new HashSet<>();
        HashMap<String, Integer> map3 = new HashMap<>();
        OooOOO oooOOO6 = this.f82599OooO0Oo;
        int i5 = this.f82618OooOo0o;
        if (i5 != -1) {
            oooOOO6.f82590OooOooo = i5;
        }
        C24447OooOO0o c24447OooOO0o = this.f82600OooO0o;
        float f = c24447OooOO0o.f82567OooOoO;
        OooOOO oooOOO7 = oooOOO6;
        C24447OooOO0o c24447OooOO0o2 = this.f82602OooO0oO;
        if (C24447OooOO0o.OooO0O0(f, c24447OooOO0o2.f82567OooOoO)) {
            hashSet11.add("alpha");
        }
        if (C24447OooOO0o.OooO0O0(c24447OooOO0o.f82569OooOoOO, c24447OooOO0o2.f82569OooOoOO)) {
            hashSet11.add("elevation");
        }
        int i6 = c24447OooOO0o.f82565OooOo;
        int i7 = c24447OooOO0o2.f82565OooOo;
        if (i6 != i7 && (i6 == 0 || i7 == 0)) {
            hashSet11.add("alpha");
        }
        if (C24447OooOO0o.OooO0O0(c24447OooOO0o.f82571OooOoo0, c24447OooOO0o2.f82571OooOoo0)) {
            hashSet11.add("rotation");
        }
        if (!Float.isNaN(c24447OooOO0o.f82579Oooo0OO) || !Float.isNaN(c24447OooOO0o2.f82579Oooo0OO)) {
            hashSet11.add("transitionPathRotate");
        }
        if (!Float.isNaN(c24447OooOO0o.f82580Oooo0o0) || !Float.isNaN(c24447OooOO0o2.f82580Oooo0o0)) {
            hashSet11.add(NotificationCompat.CATEGORY_PROGRESS);
        }
        if (C24447OooOO0o.OooO0O0(c24447OooOO0o.f82570OooOoo, c24447OooOO0o2.f82570OooOoo)) {
            hashSet11.add("rotationX");
        }
        if (C24447OooOO0o.OooO0O0(c24447OooOO0o.f82566OooOo0o, c24447OooOO0o2.f82566OooOo0o)) {
            hashSet11.add("rotationY");
        }
        if (C24447OooOO0o.OooO0O0(c24447OooOO0o.f82575Oooo000, c24447OooOO0o2.f82575Oooo000)) {
            hashSet11.add("transformPivotX");
        }
        if (C24447OooOO0o.OooO0O0(c24447OooOO0o.f82576Oooo00O, c24447OooOO0o2.f82576Oooo00O)) {
            hashSet11.add("transformPivotY");
        }
        if (C24447OooOO0o.OooO0O0(c24447OooOO0o.f82572OooOooO, c24447OooOO0o2.f82572OooOooO)) {
            hashSet11.add("scaleX");
        }
        if (C24447OooOO0o.OooO0O0(c24447OooOO0o.f82573OooOooo, c24447OooOO0o2.f82573OooOooo)) {
            hashSet11.add("scaleY");
        }
        if (C24447OooOO0o.OooO0O0(c24447OooOO0o.f82577Oooo00o, c24447OooOO0o2.f82577Oooo00o)) {
            str = "translationX";
            hashSet11.add(str);
        } else {
            str = "translationX";
        }
        Object obj4 = "rotationX";
        if (C24447OooOO0o.OooO0O0(c24447OooOO0o.f82574Oooo0, c24447OooOO0o2.f82574Oooo0)) {
            str2 = "translationY";
            hashSet11.add(str2);
        } else {
            str2 = "translationY";
        }
        if (C24447OooOO0o.OooO0O0(c24447OooOO0o.f82578Oooo0O0, c24447OooOO0o2.f82578Oooo0O0)) {
            str3 = "translationZ";
            hashSet11.add(str3);
        } else {
            str3 = "translationZ";
        }
        ArrayList<AbstractC24443OooO0Oo> arrayList4 = this.f82611OooOOo;
        OooOOO oooOOO8 = this.f82601OooO0o0;
        Object obj5 = "rotationY";
        ArrayList<OooOOO> arrayList5 = this.f82612OooOOo0;
        String str37 = str;
        if (arrayList4 != null) {
            ArrayList arrayList6 = null;
            for (AbstractC24443OooO0Oo abstractC24443OooO0Oo : arrayList4) {
                String str38 = str2;
                if (abstractC24443OooO0Oo instanceof C24446OooO0oo) {
                    C24446OooO0oo c24446OooO0oo = (C24446OooO0oo) abstractC24443OooO0Oo;
                    OooOOO oooOOO9 = new OooOOO();
                    str28 = str3;
                    oooOOO9.f82589OooOooO = Float.NaN;
                    oooOOO9.f82590OooOooo = -1;
                    oooOOO9.f82592Oooo000 = -1;
                    oooOOO9.f82593Oooo00O = new LinkedHashMap<>();
                    str31 = str36;
                    oooOOO9.f82594Oooo00o = new double[18];
                    oooOOO9.f82591Oooo0 = new double[18];
                    oooOOO5 = oooOOO7;
                    str30 = str35;
                    if (oooOOO5.f82592Oooo000 != -1) {
                        float f2 = c24446OooO0oo.f82475OooO00o / 100.0f;
                        oooOOO9.f82582OooOo = f2;
                        float f3 = Float.isNaN(c24446OooO0oo.f82520OooO0oo) ? f2 : c24446OooO0oo.f82520OooO0oo;
                        str29 = str34;
                        float f4 = Float.isNaN(c24446OooO0oo.f82516OooO) ? f2 : c24446OooO0oo.f82516OooO;
                        str27 = str33;
                        float f5 = oooOOO8.f82588OooOoo0 - oooOOO5.f82588OooOoo0;
                        float f6 = oooOOO8.f82587OooOoo;
                        float f7 = oooOOO5.f82587OooOoo;
                        oooOOO9.f82585OooOoO0 = oooOOO9.f82582OooOo;
                        oooOOO9.f82588OooOoo0 = (int) ((f5 * f3) + r2);
                        oooOOO9.f82587OooOoo = (int) (((f6 - f7) * f4) + f7);
                        str26 = str32;
                        if (c24446OooO0oo.f82524OooOOO != 2) {
                            float f8 = Float.isNaN(c24446OooO0oo.f82521OooOO0) ? f2 : c24446OooO0oo.f82521OooOO0;
                            float f9 = oooOOO8.f82584OooOoO;
                            float f10 = oooOOO5.f82584OooOoO;
                            oooOOO9.f82584OooOoO = OooOO0.OooO0OO.OooO0O0(f9, f10, f8, f10);
                            if (!Float.isNaN(c24446OooO0oo.f82522OooOO0O)) {
                                f2 = c24446OooO0oo.f82522OooOO0O;
                            }
                            float f11 = oooOOO8.f82586OooOoOO;
                            float f12 = oooOOO5.f82586OooOoOO;
                            oooOOO9.f82586OooOoOO = OooOO0.OooO0OO.OooO0O0(f11, f12, f2, f12);
                        } else {
                            if (Float.isNaN(c24446OooO0oo.f82521OooOO0)) {
                                float f13 = oooOOO8.f82584OooOoO;
                                float f14 = oooOOO5.f82584OooOoO;
                                fMin = OooOO0.OooO0OO.OooO0O0(f13, f14, f2, f14);
                            } else {
                                fMin = c24446OooO0oo.f82521OooOO0 * Math.min(f4, f3);
                            }
                            oooOOO9.f82584OooOoO = fMin;
                            if (Float.isNaN(c24446OooO0oo.f82522OooOO0O)) {
                                float f15 = oooOOO8.f82586OooOoOO;
                                float f16 = oooOOO5.f82586OooOoOO;
                                fOooO0O0 = OooOO0.OooO0OO.OooO0O0(f15, f16, f2, f16);
                            } else {
                                fOooO0O0 = c24446OooO0oo.f82522OooOO0O;
                            }
                            oooOOO9.f82586OooOoOO = fOooO0O0;
                        }
                        oooOOO9.f82592Oooo000 = oooOOO5.f82592Oooo000;
                        oooOOO9.f82583OooOo0o = o0000O00.OooO0OO.OooO0O0(c24446OooO0oo.f82518OooO0o0);
                        oooOOO9.f82590OooOooo = c24446OooO0oo.f82517OooO0o;
                    } else {
                        str26 = str32;
                        str27 = str33;
                        str29 = str34;
                        int i8 = c24446OooO0oo.f82524OooOOO;
                        if (i8 == 1) {
                            float f17 = c24446OooO0oo.f82475OooO00o / 100.0f;
                            oooOOO9.f82582OooOo = f17;
                            float f18 = Float.isNaN(c24446OooO0oo.f82520OooO0oo) ? f17 : c24446OooO0oo.f82520OooO0oo;
                            float f19 = Float.isNaN(c24446OooO0oo.f82516OooO) ? f17 : c24446OooO0oo.f82516OooO;
                            float f20 = oooOOO8.f82588OooOoo0 - oooOOO5.f82588OooOoo0;
                            float f21 = f17;
                            float f22 = oooOOO8.f82587OooOoo - oooOOO5.f82587OooOoo;
                            oooOOO9.f82585OooOoO0 = oooOOO9.f82582OooOo;
                            if (!Float.isNaN(c24446OooO0oo.f82521OooOO0)) {
                                f21 = c24446OooO0oo.f82521OooOO0;
                            }
                            float f23 = (oooOOO5.f82588OooOoo0 / 2.0f) + oooOOO5.f82584OooOoO;
                            float f24 = oooOOO5.f82586OooOoOO;
                            float f25 = oooOOO5.f82587OooOoo;
                            float f26 = ((oooOOO8.f82588OooOoo0 / 2.0f) + oooOOO8.f82584OooOoO) - f23;
                            float f27 = ((oooOOO8.f82587OooOoo / 2.0f) + oooOOO8.f82586OooOoOO) - ((f25 / 2.0f) + f24);
                            float f28 = f26 * f21;
                            float f29 = (f20 * f18) / 2.0f;
                            oooOOO9.f82584OooOoO = (int) ((r1 + f28) - f29);
                            float f30 = f21 * f27;
                            float f31 = (f22 * f19) / 2.0f;
                            oooOOO9.f82586OooOoOO = (int) ((f24 + f30) - f31);
                            oooOOO9.f82588OooOoo0 = (int) (r1 + r8);
                            oooOOO9.f82587OooOoo = (int) (f25 + r11);
                            float f32 = Float.isNaN(c24446OooO0oo.f82522OooOO0O) ? 0.0f : c24446OooO0oo.f82522OooOO0O;
                            float f33 = (-f27) * f32;
                            float f34 = f26 * f32;
                            float f35 = (int) ((oooOOO5.f82584OooOoO + f28) - f29);
                            float f36 = (int) ((oooOOO5.f82586OooOoOO + f30) - f31);
                            oooOOO9.f82584OooOoO = f35 + f33;
                            oooOOO9.f82586OooOoOO = f36 + f34;
                            oooOOO9.f82592Oooo000 = oooOOO9.f82592Oooo000;
                            oooOOO9.f82583OooOo0o = o0000O00.OooO0OO.OooO0O0(c24446OooO0oo.f82518OooO0o0);
                            oooOOO9.f82590OooOooo = c24446OooO0oo.f82517OooO0o;
                        } else if (i8 == 2) {
                            float f37 = c24446OooO0oo.f82475OooO00o / 100.0f;
                            oooOOO9.f82582OooOo = f37;
                            float f38 = Float.isNaN(c24446OooO0oo.f82520OooO0oo) ? f37 : c24446OooO0oo.f82520OooO0oo;
                            float f39 = Float.isNaN(c24446OooO0oo.f82516OooO) ? f37 : c24446OooO0oo.f82516OooO;
                            float f40 = oooOOO8.f82588OooOoo0;
                            float f41 = oooOOO5.f82588OooOoo0;
                            float f42 = f40 - f41;
                            float f43 = oooOOO8.f82587OooOoo;
                            float f44 = oooOOO5.f82587OooOoo;
                            float f45 = f43 - f44;
                            oooOOO9.f82585OooOoO0 = oooOOO9.f82582OooOo;
                            float f46 = (f41 / 2.0f) + oooOOO5.f82584OooOoO;
                            float f47 = oooOOO5.f82586OooOoOO;
                            float f48 = (f40 / 2.0f) + oooOOO8.f82584OooOoO;
                            float f49 = ((f43 / 2.0f) + oooOOO8.f82586OooOoOO) - ((f44 / 2.0f) + f47);
                            float f50 = f42 * f38;
                            oooOOO9.f82584OooOoO = (int) ((((f48 - f46) * f37) + r1) - (f50 / 2.0f));
                            float f51 = f45 * f39;
                            oooOOO9.f82586OooOoOO = (int) (((f49 * f37) + f47) - (f51 / 2.0f));
                            oooOOO9.f82588OooOoo0 = (int) (f41 + f50);
                            oooOOO9.f82587OooOoo = (int) (f44 + f51);
                            if (!Float.isNaN(c24446OooO0oo.f82521OooOO0)) {
                                oooOOO9.f82584OooOoO = (int) (c24446OooO0oo.f82521OooOO0 * (i - ((int) oooOOO9.f82588OooOoo0)));
                            }
                            if (!Float.isNaN(c24446OooO0oo.f82522OooOO0O)) {
                                oooOOO9.f82586OooOoOO = (int) (c24446OooO0oo.f82522OooOO0O * (i2 - ((int) oooOOO9.f82587OooOoo)));
                            }
                            oooOOO9.f82592Oooo000 = oooOOO9.f82592Oooo000;
                            oooOOO9.f82583OooOo0o = o0000O00.OooO0OO.OooO0O0(c24446OooO0oo.f82518OooO0o0);
                            oooOOO9.f82590OooOooo = c24446OooO0oo.f82517OooO0o;
                        } else if (i8 != 3) {
                            float f52 = c24446OooO0oo.f82475OooO00o / 100.0f;
                            oooOOO9.f82582OooOo = f52;
                            float f53 = Float.isNaN(c24446OooO0oo.f82520OooO0oo) ? f52 : c24446OooO0oo.f82520OooO0oo;
                            float f54 = Float.isNaN(c24446OooO0oo.f82516OooO) ? f52 : c24446OooO0oo.f82516OooO;
                            float f55 = oooOOO8.f82588OooOoo0;
                            float f56 = oooOOO5.f82588OooOoo0;
                            float f57 = f55 - f56;
                            float f58 = oooOOO8.f82587OooOoo;
                            float f59 = oooOOO5.f82587OooOoo;
                            float f60 = f58 - f59;
                            oooOOO9.f82585OooOoO0 = oooOOO9.f82582OooOo;
                            float f61 = (f56 / 2.0f) + oooOOO5.f82584OooOoO;
                            float f62 = oooOOO5.f82586OooOoOO;
                            float f63 = ((f55 / 2.0f) + oooOOO8.f82584OooOoO) - f61;
                            float f64 = ((f58 / 2.0f) + oooOOO8.f82586OooOoOO) - ((f59 / 2.0f) + f62);
                            float f65 = (f57 * f53) / 2.0f;
                            oooOOO9.f82584OooOoO = (int) (((f63 * f52) + r1) - f65);
                            float f66 = (f60 * f54) / 2.0f;
                            oooOOO9.f82586OooOoOO = (int) (((f64 * f52) + f62) - f66);
                            oooOOO9.f82588OooOoo0 = (int) (f56 + r29);
                            oooOOO9.f82587OooOoo = (int) (f59 + r49);
                            float f67 = Float.isNaN(c24446OooO0oo.f82521OooOO0) ? f52 : c24446OooO0oo.f82521OooOO0;
                            float f68 = Float.isNaN(c24446OooO0oo.f82525OooOOO0) ? 0.0f : c24446OooO0oo.f82525OooOOO0;
                            float f69 = f67;
                            float f70 = Float.isNaN(c24446OooO0oo.f82522OooOO0O) ? f52 : c24446OooO0oo.f82522OooOO0O;
                            oooOOO9.f82584OooOoO = (int) ((((Float.isNaN(c24446OooO0oo.f82523OooOO0o) ? 0.0f : c24446OooO0oo.f82523OooOO0o) * f64) + ((f69 * f63) + oooOOO5.f82584OooOoO)) - f65);
                            oooOOO9.f82586OooOoOO = (int) (((f64 * f70) + ((f63 * f68) + oooOOO5.f82586OooOoOO)) - f66);
                            oooOOO9.f82583OooOo0o = o0000O00.OooO0OO.OooO0O0(c24446OooO0oo.f82518OooO0o0);
                            oooOOO9.f82590OooOooo = c24446OooO0oo.f82517OooO0o;
                        } else {
                            float f71 = c24446OooO0oo.f82475OooO00o / 100.0f;
                            oooOOO9.f82582OooOo = f71;
                            float f72 = Float.isNaN(c24446OooO0oo.f82520OooO0oo) ? f71 : c24446OooO0oo.f82520OooO0oo;
                            float f73 = Float.isNaN(c24446OooO0oo.f82516OooO) ? f71 : c24446OooO0oo.f82516OooO;
                            float f74 = oooOOO8.f82588OooOoo0;
                            float f75 = oooOOO5.f82588OooOoo0;
                            float f76 = f74 - f75;
                            float f77 = oooOOO8.f82587OooOoo;
                            float f78 = oooOOO5.f82587OooOoo;
                            float f79 = f77 - f78;
                            oooOOO9.f82585OooOoO0 = oooOOO9.f82582OooOo;
                            float f80 = (f75 / 2.0f) + oooOOO5.f82584OooOoO;
                            float f81 = (f78 / 2.0f) + oooOOO5.f82586OooOoOO;
                            float f82 = (f74 / 2.0f) + oooOOO8.f82584OooOoO;
                            float f83 = (f77 / 2.0f) + oooOOO8.f82586OooOoOO;
                            if (f80 > f82) {
                                f80 = f82;
                                f82 = f80;
                            }
                            if (f81 <= f83) {
                                f81 = f83;
                                f83 = f81;
                            }
                            float f84 = f82 - f80;
                            float f85 = f81 - f83;
                            float f86 = (f76 * f72) / 2.0f;
                            oooOOO9.f82584OooOoO = (int) (((f84 * f71) + r1) - f86);
                            float f87 = (f79 * f73) / 2.0f;
                            oooOOO9.f82586OooOoOO = (int) (((f85 * f71) + r1) - f87);
                            oooOOO9.f82588OooOoo0 = (int) (f75 + r29);
                            oooOOO9.f82587OooOoo = (int) (f78 + r49);
                            float f88 = Float.isNaN(c24446OooO0oo.f82521OooOO0) ? f71 : c24446OooO0oo.f82521OooOO0;
                            float f89 = Float.isNaN(c24446OooO0oo.f82525OooOOO0) ? 0.0f : c24446OooO0oo.f82525OooOOO0;
                            float f90 = f88;
                            float f91 = Float.isNaN(c24446OooO0oo.f82522OooOO0O) ? f71 : c24446OooO0oo.f82522OooOO0O;
                            oooOOO9.f82584OooOoO = (int) ((((Float.isNaN(c24446OooO0oo.f82523OooOO0o) ? 0.0f : c24446OooO0oo.f82523OooOO0o) * f85) + ((f90 * f84) + oooOOO5.f82584OooOoO)) - f86);
                            oooOOO9.f82586OooOoOO = (int) (((f85 * f91) + ((f84 * f89) + oooOOO5.f82586OooOoOO)) - f87);
                            oooOOO9.f82583OooOo0o = o0000O00.OooO0OO.OooO0O0(c24446OooO0oo.f82518OooO0o0);
                            oooOOO9.f82590OooOooo = c24446OooO0oo.f82517OooO0o;
                        }
                    }
                    if (Collections.binarySearch(arrayList5, oooOOO9) == 0) {
                        Log.e("MotionController", " KeyPath position \"" + oooOOO9.f82585OooOoO0 + "\" outside of range");
                    }
                    arrayList5.add((-r1) - 1, oooOOO9);
                    int i9 = c24446OooO0oo.f82474OooO0Oo;
                    if (i9 != -1) {
                        this.f82598OooO0OO = i9;
                    }
                    hashSet9 = hashSet10;
                    hashSet8 = hashSet12;
                } else {
                    str26 = str32;
                    str27 = str33;
                    str28 = str3;
                    str29 = str34;
                    str30 = str35;
                    str31 = str36;
                    oooOOO5 = oooOOO7;
                    if (abstractC24443OooO0Oo instanceof OooO0o) {
                        hashSet8 = hashSet12;
                        abstractC24443OooO0Oo.OooO0Oo(hashSet8);
                        hashSet9 = hashSet10;
                    } else {
                        hashSet8 = hashSet12;
                        if (abstractC24443OooO0Oo instanceof OooOO0) {
                            hashSet9 = hashSet10;
                            abstractC24443OooO0Oo.OooO0Oo(hashSet9);
                        } else {
                            hashSet9 = hashSet10;
                            if (abstractC24443OooO0Oo instanceof OooOO0O) {
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                ArrayList arrayList7 = arrayList6;
                                arrayList7.add((OooOO0O) abstractC24443OooO0Oo);
                                arrayList6 = arrayList7;
                            } else {
                                map2 = map3;
                                abstractC24443OooO0Oo.OooO0o(map2);
                                abstractC24443OooO0Oo.OooO0Oo(hashSet11);
                                hashSet12 = hashSet8;
                                hashSet10 = hashSet9;
                                oooOOO7 = oooOOO5;
                                map3 = map2;
                                str2 = str38;
                                str3 = str28;
                                str36 = str31;
                                str35 = str30;
                                str34 = str29;
                                str33 = str27;
                                str32 = str26;
                            }
                        }
                    }
                }
                map2 = map3;
                hashSet12 = hashSet8;
                hashSet10 = hashSet9;
                oooOOO7 = oooOOO5;
                map3 = map2;
                str2 = str38;
                str3 = str28;
                str36 = str31;
                str35 = str30;
                str34 = str29;
                str33 = str27;
                str32 = str26;
            }
            arrayList = arrayList6;
        } else {
            arrayList = null;
        }
        String str39 = str32;
        String str40 = str33;
        String str41 = str3;
        String str42 = str2;
        String str43 = str34;
        String str44 = str35;
        String str45 = str36;
        HashSet<String> hashSet13 = hashSet10;
        HashSet<String> hashSet14 = hashSet12;
        HashMap<String, Integer> map4 = map3;
        OooOOO oooOOO10 = oooOOO7;
        if (arrayList != null) {
            this.f82617OooOo0O = (OooOO0O[]) arrayList.toArray(new OooOO0O[0]);
        }
        String str46 = "CUSTOM,";
        if (hashSet11.isEmpty()) {
            hashSet = hashSet14;
            hashSet2 = hashSet13;
            hashSet3 = hashSet11;
            oooOOO = oooOOO10;
            arrayList2 = arrayList5;
            str4 = str37;
            str5 = str42;
            str6 = str41;
            str7 = str45;
            str8 = str44;
            str9 = str43;
            oooOOO2 = oooOOO8;
        } else {
            this.f82616OooOo00 = new HashMap<>();
            Iterator<String> it3 = hashSet11.iterator();
            while (it3.hasNext()) {
                String next = it3.next();
                if (!next.startsWith("CUSTOM,")) {
                    it2 = it3;
                    hashSet5 = hashSet14;
                    hashSet6 = hashSet13;
                    arrayList3 = arrayList5;
                    switch (next.hashCode()) {
                        case -1249320806:
                            hashSet7 = hashSet11;
                            oooOOO3 = oooOOO10;
                            str17 = str37;
                            str18 = str42;
                            str19 = str41;
                            str20 = str45;
                            str21 = str44;
                            str22 = str43;
                            oooOOO4 = oooOOO8;
                            obj3 = obj4;
                            b3 = next.equals(obj3) ? (byte) 0 : (byte) -1;
                            break;
                        case -1249320805:
                            hashSet7 = hashSet11;
                            oooOOO3 = oooOOO10;
                            str17 = str37;
                            str18 = str42;
                            str19 = str41;
                            str20 = str45;
                            str21 = str44;
                            str22 = str43;
                            oooOOO4 = oooOOO8;
                            Object obj6 = obj5;
                            if (next.equals(obj6)) {
                                obj5 = obj6;
                                obj3 = obj4;
                                b3 = 1;
                            } else {
                                obj5 = obj6;
                                obj3 = obj4;
                            }
                            break;
                        case -1225497657:
                            hashSet7 = hashSet11;
                            oooOOO3 = oooOOO10;
                            str17 = str37;
                            str18 = str42;
                            str19 = str41;
                            str20 = str45;
                            str21 = str44;
                            str22 = str43;
                            if (next.equals(str17)) {
                                oooOOO4 = oooOOO8;
                                obj3 = obj4;
                                b3 = 2;
                            }
                            oooOOO4 = oooOOO8;
                            obj3 = obj4;
                            break;
                        case -1225497656:
                            hashSet7 = hashSet11;
                            str18 = str42;
                            str19 = str41;
                            str20 = str45;
                            str21 = str44;
                            str22 = str43;
                            if (next.equals(str18)) {
                                oooOOO3 = oooOOO10;
                                str17 = str37;
                                oooOOO4 = oooOOO8;
                                obj3 = obj4;
                                b3 = 3;
                            } else {
                                oooOOO3 = oooOOO10;
                                str17 = str37;
                                oooOOO4 = oooOOO8;
                                obj3 = obj4;
                            }
                            break;
                        case -1225497655:
                            str19 = str41;
                            str20 = str45;
                            str21 = str44;
                            str22 = str43;
                            if (next.equals(str19)) {
                                hashSet7 = hashSet11;
                                oooOOO3 = oooOOO10;
                                str17 = str37;
                                str18 = str42;
                                oooOOO4 = oooOOO8;
                                obj3 = obj4;
                                b3 = 4;
                            } else {
                                hashSet7 = hashSet11;
                                oooOOO3 = oooOOO10;
                                str17 = str37;
                                str18 = str42;
                                oooOOO4 = oooOOO8;
                                obj3 = obj4;
                            }
                            break;
                        case -1001078227:
                            str20 = str45;
                            str21 = str44;
                            str22 = str43;
                            if (next.equals(str20)) {
                                hashSet7 = hashSet11;
                                oooOOO3 = oooOOO10;
                                str17 = str37;
                                str18 = str42;
                                str19 = str41;
                                oooOOO4 = oooOOO8;
                                obj3 = obj4;
                                b3 = 5;
                            } else {
                                hashSet7 = hashSet11;
                                oooOOO3 = oooOOO10;
                                str17 = str37;
                                str18 = str42;
                                str19 = str41;
                                oooOOO4 = oooOOO8;
                                obj3 = obj4;
                            }
                            break;
                        case -908189618:
                            str21 = str44;
                            str22 = str43;
                            if (next.equals(str21)) {
                                hashSet7 = hashSet11;
                                oooOOO3 = oooOOO10;
                                str17 = str37;
                                str18 = str42;
                                str19 = str41;
                                str20 = str45;
                                oooOOO4 = oooOOO8;
                                obj3 = obj4;
                                b3 = 6;
                            } else {
                                hashSet7 = hashSet11;
                                oooOOO3 = oooOOO10;
                                str17 = str37;
                                str18 = str42;
                                str19 = str41;
                                str20 = str45;
                                oooOOO4 = oooOOO8;
                                obj3 = obj4;
                            }
                            break;
                        case -908189617:
                            str22 = str43;
                            String str47 = str40;
                            String str48 = str39;
                            if (next.equals(str22)) {
                                str39 = str48;
                                str40 = str47;
                                hashSet7 = hashSet11;
                                oooOOO3 = oooOOO10;
                                str17 = str37;
                                str18 = str42;
                                str19 = str41;
                                str20 = str45;
                                oooOOO4 = oooOOO8;
                                obj3 = obj4;
                                b3 = 7;
                                str21 = str44;
                            } else {
                                str39 = str48;
                                str40 = str47;
                                hashSet7 = hashSet11;
                                oooOOO3 = oooOOO10;
                                str17 = str37;
                                str18 = str42;
                                str19 = str41;
                                str20 = str45;
                                str21 = str44;
                                oooOOO4 = oooOOO8;
                                obj3 = obj4;
                            }
                            break;
                        case -797520672:
                            str23 = str40;
                            str24 = str39;
                            if (next.equals("waveVariesBy")) {
                                b4 = 8;
                                str39 = str24;
                                str40 = str23;
                                hashSet7 = hashSet11;
                                oooOOO3 = oooOOO10;
                                str17 = str37;
                                str18 = str42;
                                str19 = str41;
                                str20 = str45;
                                str21 = str44;
                                oooOOO4 = oooOOO8;
                                obj3 = obj4;
                                b3 = b4;
                                str22 = str43;
                            }
                            str39 = str24;
                            str40 = str23;
                            hashSet7 = hashSet11;
                            oooOOO3 = oooOOO10;
                            str17 = str37;
                            str18 = str42;
                            str19 = str41;
                            str20 = str45;
                            str21 = str44;
                            str22 = str43;
                            oooOOO4 = oooOOO8;
                            obj3 = obj4;
                            break;
                        case -760884510:
                            str23 = str40;
                            str24 = str39;
                            if (next.equals(str23)) {
                                b4 = 9;
                                str39 = str24;
                                str40 = str23;
                                hashSet7 = hashSet11;
                                oooOOO3 = oooOOO10;
                                str17 = str37;
                                str18 = str42;
                                str19 = str41;
                                str20 = str45;
                                str21 = str44;
                                oooOOO4 = oooOOO8;
                                obj3 = obj4;
                                b3 = b4;
                                str22 = str43;
                            }
                            str39 = str24;
                            str40 = str23;
                            hashSet7 = hashSet11;
                            oooOOO3 = oooOOO10;
                            str17 = str37;
                            str18 = str42;
                            str19 = str41;
                            str20 = str45;
                            str21 = str44;
                            str22 = str43;
                            oooOOO4 = oooOOO8;
                            obj3 = obj4;
                            break;
                        case -760884509:
                            String str49 = str39;
                            if (next.equals(str49)) {
                                str39 = str49;
                                hashSet7 = hashSet11;
                                oooOOO3 = oooOOO10;
                                str17 = str37;
                                str18 = str42;
                                str20 = str45;
                                str21 = str44;
                                str22 = str43;
                                oooOOO4 = oooOOO8;
                                obj3 = obj4;
                                b3 = 10;
                                str19 = str41;
                            } else {
                                str39 = str49;
                                hashSet7 = hashSet11;
                                oooOOO3 = oooOOO10;
                                str17 = str37;
                                str18 = str42;
                                str19 = str41;
                                str20 = str45;
                                str21 = str44;
                                str22 = str43;
                                oooOOO4 = oooOOO8;
                                obj3 = obj4;
                            }
                            break;
                        case -40300674:
                            if (next.equals("rotation")) {
                                b5 = 11;
                                hashSet7 = hashSet11;
                                oooOOO3 = oooOOO10;
                                str17 = str37;
                                str18 = str42;
                                str19 = str41;
                                str21 = str44;
                                str22 = str43;
                                oooOOO4 = oooOOO8;
                                obj3 = obj4;
                                b3 = b5;
                                str20 = str45;
                            }
                            hashSet7 = hashSet11;
                            oooOOO3 = oooOOO10;
                            str17 = str37;
                            str18 = str42;
                            str19 = str41;
                            str20 = str45;
                            str21 = str44;
                            str22 = str43;
                            oooOOO4 = oooOOO8;
                            obj3 = obj4;
                            break;
                        case -4379043:
                            if (next.equals("elevation")) {
                                b5 = 12;
                                hashSet7 = hashSet11;
                                oooOOO3 = oooOOO10;
                                str17 = str37;
                                str18 = str42;
                                str19 = str41;
                                str21 = str44;
                                str22 = str43;
                                oooOOO4 = oooOOO8;
                                obj3 = obj4;
                                b3 = b5;
                                str20 = str45;
                            }
                            hashSet7 = hashSet11;
                            oooOOO3 = oooOOO10;
                            str17 = str37;
                            str18 = str42;
                            str19 = str41;
                            str20 = str45;
                            str21 = str44;
                            str22 = str43;
                            oooOOO4 = oooOOO8;
                            obj3 = obj4;
                            break;
                        case 37232917:
                            if (next.equals("transitionPathRotate")) {
                                b5 = 13;
                                hashSet7 = hashSet11;
                                oooOOO3 = oooOOO10;
                                str17 = str37;
                                str18 = str42;
                                str19 = str41;
                                str21 = str44;
                                str22 = str43;
                                oooOOO4 = oooOOO8;
                                obj3 = obj4;
                                b3 = b5;
                                str20 = str45;
                            }
                            hashSet7 = hashSet11;
                            oooOOO3 = oooOOO10;
                            str17 = str37;
                            str18 = str42;
                            str19 = str41;
                            str20 = str45;
                            str21 = str44;
                            str22 = str43;
                            oooOOO4 = oooOOO8;
                            obj3 = obj4;
                            break;
                        case 92909918:
                            if (next.equals("alpha")) {
                                b5 = 14;
                                hashSet7 = hashSet11;
                                oooOOO3 = oooOOO10;
                                str17 = str37;
                                str18 = str42;
                                str19 = str41;
                                str21 = str44;
                                str22 = str43;
                                oooOOO4 = oooOOO8;
                                obj3 = obj4;
                                b3 = b5;
                                str20 = str45;
                            }
                            hashSet7 = hashSet11;
                            oooOOO3 = oooOOO10;
                            str17 = str37;
                            str18 = str42;
                            str19 = str41;
                            str20 = str45;
                            str21 = str44;
                            str22 = str43;
                            oooOOO4 = oooOOO8;
                            obj3 = obj4;
                            break;
                        case 156108012:
                            if (next.equals("waveOffset")) {
                                b5 = 15;
                                hashSet7 = hashSet11;
                                oooOOO3 = oooOOO10;
                                str17 = str37;
                                str18 = str42;
                                str19 = str41;
                                str21 = str44;
                                str22 = str43;
                                oooOOO4 = oooOOO8;
                                obj3 = obj4;
                                b3 = b5;
                                str20 = str45;
                            }
                            hashSet7 = hashSet11;
                            oooOOO3 = oooOOO10;
                            str17 = str37;
                            str18 = str42;
                            str19 = str41;
                            str20 = str45;
                            str21 = str44;
                            str22 = str43;
                            oooOOO4 = oooOOO8;
                            obj3 = obj4;
                            break;
                        default:
                            hashSet7 = hashSet11;
                            oooOOO3 = oooOOO10;
                            str17 = str37;
                            str18 = str42;
                            str19 = str41;
                            str20 = str45;
                            str21 = str44;
                            str22 = str43;
                            oooOOO4 = oooOOO8;
                            obj3 = obj4;
                            break;
                    }
                    switch (b3) {
                        case 0:
                            obj4 = obj3;
                            str25 = str17;
                            oooO2 = new OooO0OO.OooO();
                            break;
                        case 1:
                            obj4 = obj3;
                            str25 = str17;
                            oooO2 = new OooO0OO.OooOO0();
                            break;
                        case 2:
                            obj4 = obj3;
                            str25 = str17;
                            oooO2 = new OooO0OO.OooOOO0();
                            break;
                        case 3:
                            obj4 = obj3;
                            str25 = str17;
                            oooO2 = new OooO0OO.OooOOO();
                            break;
                        case 4:
                            obj4 = obj3;
                            str25 = str17;
                            oooO2 = new OooO0OO.OooOOOO();
                            break;
                        case 5:
                            obj4 = obj3;
                            OooO0OO.C24150OooO0oO c24150OooO0oO = new OooO0OO.C24150OooO0oO();
                            str25 = str17;
                            c24150OooO0oO.f81425OooO0o = false;
                            oooO2 = c24150OooO0oO;
                            break;
                        case 6:
                            oooOO0O = new OooO0OO.OooOO0O();
                            o0000O00.OooOO0O oooOO0O2 = oooOO0O;
                            obj4 = obj3;
                            oooO2 = oooOO0O2;
                            str25 = str17;
                            break;
                        case 7:
                            oooOO0O = new OooO0OO.C24152OooOO0o();
                            o0000O00.OooOO0O oooOO0O22 = oooOO0O;
                            obj4 = obj3;
                            oooO2 = oooOO0O22;
                            str25 = str17;
                            break;
                        case 8:
                            oooOO0O = new OooO0OO.OooO00o();
                            o0000O00.OooOO0O oooOO0O222 = oooOO0O;
                            obj4 = obj3;
                            oooO2 = oooOO0O222;
                            str25 = str17;
                            break;
                        case 9:
                            oooOO0O = new OooO0OO.C24149OooO0o0();
                            o0000O00.OooOO0O oooOO0O2222 = oooOO0O;
                            obj4 = obj3;
                            oooO2 = oooOO0O2222;
                            str25 = str17;
                            break;
                        case 10:
                            oooOO0O = new OooO0OO.OooO0o();
                            o0000O00.OooOO0O oooOO0O22222 = oooOO0O;
                            obj4 = obj3;
                            oooO2 = oooOO0O22222;
                            str25 = str17;
                            break;
                        case 11:
                            oooOO0O = new OooO0OO.C24151OooO0oo();
                            o0000O00.OooOO0O oooOO0O222222 = oooOO0O;
                            obj4 = obj3;
                            oooO2 = oooOO0O222222;
                            str25 = str17;
                            break;
                        case 12:
                            oooOO0O = new OooO0OO.C19604OooO0OO();
                            o0000O00.OooOO0O oooOO0O2222222 = oooOO0O;
                            obj4 = obj3;
                            oooO2 = oooOO0O2222222;
                            str25 = str17;
                            break;
                        case 13:
                            oooOO0O = new OooO0OO.OooO0Oo();
                            o0000O00.OooOO0O oooOO0O22222222 = oooOO0O;
                            obj4 = obj3;
                            oooO2 = oooOO0O22222222;
                            str25 = str17;
                            break;
                        case 14:
                            oooOO0O = new OooO0OO.OooO00o();
                            o0000O00.OooOO0O oooOO0O222222222 = oooOO0O;
                            obj4 = obj3;
                            oooO2 = oooOO0O222222222;
                            str25 = str17;
                            break;
                        case 15:
                            oooOO0O = new OooO0OO.OooO00o();
                            o0000O00.OooOO0O oooOO0O2222222222 = oooOO0O;
                            obj4 = obj3;
                            oooO2 = oooOO0O2222222222;
                            str25 = str17;
                            break;
                        default:
                            obj4 = obj3;
                            str25 = str17;
                            oooO2 = null;
                            break;
                    }
                } else {
                    it2 = it3;
                    SparseArray<androidx.constraintlayout.widget.OooO00o> sparseArray = new SparseArray<>();
                    hashSet5 = hashSet14;
                    String str50 = next.split(",")[1];
                    for (AbstractC24443OooO0Oo abstractC24443OooO0Oo2 : arrayList4) {
                        HashSet<String> hashSet15 = hashSet13;
                        ArrayList<OooOOO> arrayList8 = arrayList5;
                        HashMap<String, androidx.constraintlayout.widget.OooO00o> map5 = abstractC24443OooO0Oo2.f82477OooO0OO;
                        if (map5 != null && (oooO00o3 = map5.get(str50)) != null) {
                            sparseArray.append(abstractC24443OooO0Oo2.f82475OooO00o, oooO00o3);
                        }
                        arrayList5 = arrayList8;
                        hashSet13 = hashSet15;
                    }
                    hashSet6 = hashSet13;
                    arrayList3 = arrayList5;
                    OooO0OO.OooO0O0 oooO0O02 = new OooO0OO.OooO0O0();
                    String str51 = next.split(",")[1];
                    oooO0O02.f81423OooO0o = sparseArray;
                    hashSet7 = hashSet11;
                    oooOOO3 = oooOOO10;
                    str25 = str37;
                    str18 = str42;
                    str20 = str45;
                    str21 = str44;
                    str22 = str43;
                    oooOOO4 = oooOOO8;
                    oooO2 = oooO0O02;
                    str19 = str41;
                }
                if (oooO2 != null) {
                    oooO2.f81408OooO0o0 = next;
                    this.f82616OooOo00.put(next, (o0000O0O.OooO0OO) oooO2);
                }
                str45 = str20;
                str41 = str19;
                str43 = str22;
                str42 = str18;
                str44 = str21;
                hashSet11 = hashSet7;
                hashSet14 = hashSet5;
                arrayList5 = arrayList3;
                hashSet13 = hashSet6;
                oooOOO8 = oooOOO4;
                oooOOO10 = oooOOO3;
                str37 = str25;
                it3 = it2;
            }
            hashSet = hashSet14;
            hashSet2 = hashSet13;
            hashSet3 = hashSet11;
            oooOOO = oooOOO10;
            arrayList2 = arrayList5;
            str4 = str37;
            str5 = str42;
            str6 = str41;
            str7 = str45;
            str8 = str44;
            str9 = str43;
            oooOOO2 = oooOOO8;
            if (arrayList4 != null) {
                for (AbstractC24443OooO0Oo abstractC24443OooO0Oo3 : arrayList4) {
                    if (abstractC24443OooO0Oo3 instanceof C24444OooO0o0) {
                        abstractC24443OooO0Oo3.OooO00o(this.f82616OooOo00);
                    }
                }
            }
            c24447OooOO0o.OooO00o(this.f82616OooOo00, 0);
            c24447OooOO0o2.OooO00o(this.f82616OooOo00, 100);
            Iterator<String> it4 = this.f82616OooOo00.keySet().iterator();
            while (it4.hasNext()) {
                String next2 = it4.next();
                int iIntValue = (!map4.containsKey(next2) || (num = map4.get(next2)) == null) ? 0 : num.intValue();
                Iterator<String> it5 = it4;
                o0000O0O.OooO0OO oooO0OO = this.f82616OooOo00.get(next2);
                if (oooO0OO != null) {
                    oooO0OO.OooO0OO(iIntValue);
                }
                it4 = it5;
            }
        }
        if (hashSet2.isEmpty()) {
            str10 = "CUSTOM,";
        } else {
            if (this.f82613OooOOoo == null) {
                this.f82613OooOOoo = new HashMap<>();
            }
            Iterator<String> it6 = hashSet2.iterator();
            while (it6.hasNext()) {
                String next3 = it6.next();
                if (!this.f82613OooOOoo.containsKey(next3)) {
                    if (next3.startsWith(str46)) {
                        SparseArray<androidx.constraintlayout.widget.OooO00o> sparseArray2 = new SparseArray<>();
                        it = it6;
                        String str52 = next3.split(",")[1];
                        for (AbstractC24443OooO0Oo abstractC24443OooO0Oo4 : arrayList4) {
                            String str53 = str46;
                            HashMap<String, Integer> map6 = map4;
                            HashMap<String, androidx.constraintlayout.widget.OooO00o> map7 = abstractC24443OooO0Oo4.f82477OooO0OO;
                            if (map7 != null && (oooO00o2 = map7.get(str52)) != null) {
                                sparseArray2.append(abstractC24443OooO0Oo4.f82475OooO00o, oooO00o2);
                            }
                            str46 = str53;
                            map4 = map6;
                        }
                        map = map4;
                        str13 = str46;
                        AbstractC24153OooO0Oo.OooO0O0 oooO0O03 = new AbstractC24153OooO0Oo.OooO0O0();
                        oooO0O03.f81429OooOOO0 = new SparseArray<>();
                        oooO0O03.f81426OooOO0O = next3.split(",")[1];
                        oooO0O03.f81427OooOO0o = sparseArray2;
                        str15 = str7;
                        str16 = str6;
                        oooO0O0 = oooO0O03;
                        obj = obj4;
                        obj2 = obj5;
                        str14 = str4;
                    } else {
                        it = it6;
                        map = map4;
                        str13 = str46;
                        switch (next3.hashCode()) {
                            case -1249320806:
                                obj = obj4;
                                obj2 = obj5;
                                str14 = str4;
                                b = next3.equals(obj) ? (byte) 0 : (byte) -1;
                                break;
                            case -1249320805:
                                obj2 = obj5;
                                str14 = str4;
                                if (next3.equals(obj2)) {
                                    obj = obj4;
                                    b = 1;
                                } else {
                                    obj = obj4;
                                }
                                break;
                            case -1225497657:
                                str14 = str4;
                                obj = obj4;
                                if (next3.equals(str14)) {
                                    obj2 = obj5;
                                    b = 2;
                                } else {
                                    obj2 = obj5;
                                }
                                break;
                            case -1225497656:
                                if (next3.equals(str5)) {
                                    obj = obj4;
                                    obj2 = obj5;
                                    str14 = str4;
                                    b = 3;
                                }
                                obj = obj4;
                                obj2 = obj5;
                                str14 = str4;
                                break;
                            case -1225497655:
                                if (next3.equals(str6)) {
                                    b = 4;
                                    obj = obj4;
                                    obj2 = obj5;
                                    str14 = str4;
                                }
                                obj = obj4;
                                obj2 = obj5;
                                str14 = str4;
                                break;
                            case -1001078227:
                                if (next3.equals(str7)) {
                                    b = 5;
                                    obj = obj4;
                                    obj2 = obj5;
                                    str14 = str4;
                                }
                                obj = obj4;
                                obj2 = obj5;
                                str14 = str4;
                                break;
                            case -908189618:
                                if (next3.equals(str8)) {
                                    obj = obj4;
                                    obj2 = obj5;
                                    str14 = str4;
                                    b = 6;
                                }
                                obj = obj4;
                                obj2 = obj5;
                                str14 = str4;
                                break;
                            case -908189617:
                                if (next3.equals(str9)) {
                                    b2 = 7;
                                    b = b2;
                                    obj = obj4;
                                    obj2 = obj5;
                                    str14 = str4;
                                }
                                obj = obj4;
                                obj2 = obj5;
                                str14 = str4;
                                break;
                            case -40300674:
                                if (next3.equals("rotation")) {
                                    b2 = 8;
                                    b = b2;
                                    obj = obj4;
                                    obj2 = obj5;
                                    str14 = str4;
                                }
                                obj = obj4;
                                obj2 = obj5;
                                str14 = str4;
                                break;
                            case -4379043:
                                if (next3.equals("elevation")) {
                                    b2 = 9;
                                    b = b2;
                                    obj = obj4;
                                    obj2 = obj5;
                                    str14 = str4;
                                }
                                obj = obj4;
                                obj2 = obj5;
                                str14 = str4;
                                break;
                            case 37232917:
                                if (next3.equals("transitionPathRotate")) {
                                    b2 = 10;
                                    b = b2;
                                    obj = obj4;
                                    obj2 = obj5;
                                    str14 = str4;
                                }
                                obj = obj4;
                                obj2 = obj5;
                                str14 = str4;
                                break;
                            case 92909918:
                                if (next3.equals("alpha")) {
                                    b2 = 11;
                                    b = b2;
                                    obj = obj4;
                                    obj2 = obj5;
                                    str14 = str4;
                                }
                                obj = obj4;
                                obj2 = obj5;
                                str14 = str4;
                                break;
                            default:
                                obj = obj4;
                                obj2 = obj5;
                                str14 = str4;
                                break;
                        }
                        switch (b) {
                            case 0:
                                str15 = str7;
                                c24155OooO0oO = new AbstractC24153OooO0Oo.C24155OooO0oO();
                                str16 = str6;
                                c24155OooO0oO.f81410OooO = j;
                                oooOOO0 = c24155OooO0oO;
                                break;
                            case 1:
                                str15 = str7;
                                c24155OooO0oO = new AbstractC24153OooO0Oo.C24156OooO0oo();
                                str16 = str6;
                                c24155OooO0oO.f81410OooO = j;
                                oooOOO0 = c24155OooO0oO;
                                break;
                            case 2:
                                str15 = str7;
                                c24155OooO0oO = new AbstractC24153OooO0Oo.OooOO0O();
                                str16 = str6;
                                c24155OooO0oO.f81410OooO = j;
                                oooOOO0 = c24155OooO0oO;
                                break;
                            case 3:
                                str15 = str7;
                                c24155OooO0oO = new AbstractC24153OooO0Oo.C24157OooOO0o();
                                str16 = str6;
                                c24155OooO0oO.f81410OooO = j;
                                oooOOO0 = c24155OooO0oO;
                                break;
                            case 4:
                                str15 = str7;
                                c24155OooO0oO = new AbstractC24153OooO0Oo.OooOOO0();
                                str16 = str6;
                                c24155OooO0oO.f81410OooO = j;
                                oooOOO0 = c24155OooO0oO;
                                break;
                            case 5:
                                AbstractC24153OooO0Oo.C24154OooO0o0 c24154OooO0o0 = new AbstractC24153OooO0Oo.C24154OooO0o0();
                                str15 = str7;
                                c24154OooO0o0.f81430OooOO0O = false;
                                c24155OooO0oO = c24154OooO0o0;
                                str16 = str6;
                                c24155OooO0oO.f81410OooO = j;
                                oooOOO0 = c24155OooO0oO;
                                break;
                            case 6:
                                oooO = new AbstractC24153OooO0Oo.OooO();
                                str15 = str7;
                                c24155OooO0oO = oooO;
                                str16 = str6;
                                c24155OooO0oO.f81410OooO = j;
                                oooOOO0 = c24155OooO0oO;
                                break;
                            case 7:
                                oooO = new AbstractC24153OooO0Oo.OooOO0();
                                str15 = str7;
                                c24155OooO0oO = oooO;
                                str16 = str6;
                                c24155OooO0oO.f81410OooO = j;
                                oooOOO0 = c24155OooO0oO;
                                break;
                            case 8:
                                oooO = new AbstractC24153OooO0Oo.OooO0o();
                                str15 = str7;
                                c24155OooO0oO = oooO;
                                str16 = str6;
                                c24155OooO0oO.f81410OooO = j;
                                oooOOO0 = c24155OooO0oO;
                                break;
                            case 9:
                                oooO = new AbstractC24153OooO0Oo.OooO0OO();
                                str15 = str7;
                                c24155OooO0oO = oooO;
                                str16 = str6;
                                c24155OooO0oO.f81410OooO = j;
                                oooOOO0 = c24155OooO0oO;
                                break;
                            case 10:
                                oooO = new AbstractC24153OooO0Oo.C19605OooO0Oo();
                                str15 = str7;
                                c24155OooO0oO = oooO;
                                str16 = str6;
                                c24155OooO0oO.f81410OooO = j;
                                oooOOO0 = c24155OooO0oO;
                                break;
                            case 11:
                                oooO = new AbstractC24153OooO0Oo.OooO00o();
                                str15 = str7;
                                c24155OooO0oO = oooO;
                                str16 = str6;
                                c24155OooO0oO.f81410OooO = j;
                                oooOOO0 = c24155OooO0oO;
                                break;
                            default:
                                str15 = str7;
                                str16 = str6;
                                oooO0O0 = null;
                                break;
                        }
                        if (oooOOO0 != null) {
                            oooOOO0.f81415OooO0o = next3;
                            this.f82613OooOOoo.put(next3, (AbstractC24153OooO0Oo) oooOOO0);
                        }
                        str4 = str14;
                        obj5 = obj2;
                        obj4 = obj;
                        str6 = str16;
                        map4 = map;
                        str7 = str15;
                        it6 = it;
                        str46 = str13;
                    }
                    oooOOO0 = oooO0O0;
                    if (oooOOO0 != null) {
                    }
                    str4 = str14;
                    obj5 = obj2;
                    obj4 = obj;
                    str6 = str16;
                    map4 = map;
                    str7 = str15;
                    it6 = it;
                    str46 = str13;
                }
            }
            HashMap<String, Integer> map8 = map4;
            str10 = str46;
            if (arrayList4 != null) {
                for (AbstractC24443OooO0Oo abstractC24443OooO0Oo5 : arrayList4) {
                    if (abstractC24443OooO0Oo5 instanceof OooOO0) {
                        ((OooOO0) abstractC24443OooO0Oo5).OooO0oO(this.f82613OooOOoo);
                    }
                }
            }
            for (String str54 : this.f82613OooOOoo.keySet()) {
                HashMap<String, Integer> map9 = map8;
                this.f82613OooOOoo.get(str54).OooO0OO(map9.containsKey(str54) ? map9.get(str54).intValue() : 0);
                map8 = map9;
            }
        }
        int size = arrayList2.size();
        int i10 = size + 2;
        OooOOO[] oooOOOArr = new OooOOO[i10];
        oooOOOArr[0] = oooOOO;
        oooOOOArr[size + 1] = oooOOO2;
        if (arrayList2.size() > 0 && this.f82598OooO0OO == -1) {
            this.f82598OooO0OO = 0;
        }
        Iterator<OooOOO> it7 = arrayList2.iterator();
        int i11 = 1;
        while (it7.hasNext()) {
            oooOOOArr[i11] = it7.next();
            i11++;
        }
        HashSet hashSet16 = new HashSet();
        for (String str55 : oooOOO2.f82593Oooo00O.keySet()) {
            OooOOO oooOOO11 = oooOOO;
            if (oooOOO11.f82593Oooo00O.containsKey(str55)) {
                str12 = str10;
                hashSet4 = hashSet3;
                if (!hashSet4.contains(str12 + str55)) {
                    hashSet16.add(str55);
                }
            } else {
                str12 = str10;
                hashSet4 = hashSet3;
            }
            oooOOO = oooOOO11;
            str10 = str12;
            hashSet3 = hashSet4;
        }
        String[] strArr = (String[]) hashSet16.toArray(new String[0]);
        this.f82607OooOOO = strArr;
        this.f82609OooOOOO = new int[strArr.length];
        int i12 = 0;
        while (true) {
            String[] strArr2 = this.f82607OooOOO;
            if (i12 < strArr2.length) {
                String str56 = strArr2[i12];
                this.f82609OooOOOO[i12] = 0;
                int i13 = 0;
                while (true) {
                    if (i13 < i10) {
                        if (!oooOOOArr[i13].f82593Oooo00O.containsKey(str56) || (oooO00o = oooOOOArr[i13].f82593Oooo00O.get(str56)) == null) {
                            i13++;
                        } else {
                            int[] iArr = this.f82609OooOOOO;
                            iArr[i12] = oooO00o.OooO0OO() + iArr[i12];
                        }
                    }
                }
                i12++;
            } else {
                boolean z = oooOOOArr[0].f82590OooOooo != -1;
                int length = 18 + strArr2.length;
                boolean[] zArr = new boolean[length];
                for (int i14 = 1; i14 < i10; i14++) {
                    OooOOO oooOOO12 = oooOOOArr[i14];
                    OooOOO oooOOO13 = oooOOOArr[i14 - 1];
                    boolean zOooO00o = OooOOO.OooO00o(oooOOO12.f82584OooOoO, oooOOO13.f82584OooOoO);
                    boolean zOooO00o2 = OooOOO.OooO00o(oooOOO12.f82586OooOoOO, oooOOO13.f82586OooOoOO);
                    zArr[0] = zArr[0] | OooOOO.OooO00o(oooOOO12.f82585OooOoO0, oooOOO13.f82585OooOoO0);
                    boolean z2 = zOooO00o | zOooO00o2 | z;
                    zArr[1] = zArr[1] | z2;
                    zArr[2] = z2 | zArr[2];
                    zArr[3] = zArr[3] | OooOOO.OooO00o(oooOOO12.f82588OooOoo0, oooOOO13.f82588OooOoo0);
                    zArr[4] = OooOOO.OooO00o(oooOOO12.f82587OooOoo, oooOOO13.f82587OooOoo) | zArr[4];
                }
                int i15 = 0;
                for (int i16 = 1; i16 < length; i16++) {
                    if (zArr[i16]) {
                        i15++;
                    }
                }
                this.f82605OooOO0O = new int[i15];
                int iMax = Math.max(2, i15);
                this.f82606OooOO0o = new double[iMax];
                this.f82608OooOOO0 = new double[iMax];
                int i17 = 0;
                for (int i18 = 1; i18 < length; i18++) {
                    if (zArr[i18]) {
                        this.f82605OooOO0O[i17] = i18;
                        i17++;
                    }
                }
                int[] iArr2 = {i10, this.f82605OooOO0O.length};
                Class cls = Double.TYPE;
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
                double[] dArr2 = new double[i10];
                int i19 = 0;
                while (i19 < i10) {
                    OooOOO oooOOO14 = oooOOOArr[i19];
                    double[] dArr3 = dArr[i19];
                    int[] iArr3 = this.f82605OooOO0O;
                    OooOOO[] oooOOOArr2 = oooOOOArr;
                    int i20 = 6;
                    float[] fArr = {oooOOO14.f82585OooOoO0, oooOOO14.f82584OooOoO, oooOOO14.f82586OooOoOO, oooOOO14.f82588OooOoo0, oooOOO14.f82587OooOoo, oooOOO14.f82589OooOooO};
                    int i21 = 0;
                    int i22 = 0;
                    while (i21 < iArr3.length) {
                        if (iArr3[i21] < i20) {
                            dArr3[i22] = fArr[r11];
                            i22++;
                        }
                        i21++;
                        i20 = 6;
                    }
                    dArr2[i19] = oooOOOArr2[i19].f82582OooOo;
                    i19++;
                    oooOOOArr = oooOOOArr2;
                }
                OooOOO[] oooOOOArr3 = oooOOOArr;
                int i23 = 0;
                while (true) {
                    int[] iArr4 = this.f82605OooOO0O;
                    if (i23 < iArr4.length) {
                        if (iArr4[i23] < 6) {
                            String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), OooOOO.f82581Oooo0O0[this.f82605OooOO0O[i23]], " [");
                            for (int i24 = 0; i24 < i10; i24++) {
                                StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(strOooO0OO);
                                sbOooO0OO.append(dArr[i24][i23]);
                                strOooO0OO = sbOooO0OO.toString();
                            }
                        }
                        i23++;
                    } else {
                        this.f82603OooO0oo = new o0000O00.OooO0O0[this.f82607OooOOO.length + 1];
                        int i25 = 0;
                        while (true) {
                            String[] strArr3 = this.f82607OooOOO;
                            if (i25 >= strArr3.length) {
                                boolean z3 = false;
                                this.f82603OooO0oo[0] = o0000O00.OooO0O0.OooO00o(this.f82598OooO0OO, dArr2, dArr);
                                if (oooOOOArr3[0].f82590OooOooo != -1) {
                                    int[] iArr5 = new int[i10];
                                    double[] dArr4 = new double[i10];
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, i10, 2);
                                    for (int i26 = 0; i26 < i10; i26++) {
                                        iArr5[i26] = oooOOOArr3[i26].f82590OooOooo;
                                        dArr4[i26] = r4.f82582OooOo;
                                        double[] dArr6 = dArr5[i26];
                                        dArr6[0] = r4.f82584OooOoO;
                                        dArr6[1] = r4.f82586OooOoOO;
                                    }
                                    z3 = false;
                                    this.f82595OooO = new o0000O00.OooO00o(iArr5, dArr4, dArr5);
                                }
                                this.f82615OooOo0 = new HashMap<>();
                                if (arrayList4 != null) {
                                    float fOooO00o = Float.NaN;
                                    for (String str57 : hashSet) {
                                        o0000O0O.OooO0O0 oooO0O0OooO0Oo = o0000O0O.OooO0O0.OooO0Oo(str57);
                                        if (oooO0O0OooO0Oo != null) {
                                            if ((oooO0O0OooO0Oo.f81381OooO0o0 == 1 ? true : z3) && Float.isNaN(fOooO00o)) {
                                                fOooO00o = OooO00o();
                                            }
                                            oooO0O0OooO0Oo.f81377OooO0O0 = str57;
                                            this.f82615OooOo0.put(str57, oooO0O0OooO0Oo);
                                        }
                                    }
                                    for (AbstractC24443OooO0Oo abstractC24443OooO0Oo6 : arrayList4) {
                                        if (abstractC24443OooO0Oo6 instanceof OooO0o) {
                                            ((OooO0o) abstractC24443OooO0Oo6).OooO0oO(this.f82615OooOo0);
                                        }
                                    }
                                    Iterator<o0000O0O.OooO0O0> it8 = this.f82615OooOo0.values().iterator();
                                    while (it8.hasNext()) {
                                        it8.next().OooO0OO();
                                    }
                                    return;
                                }
                                return;
                            }
                            String str58 = strArr3[i25];
                            double[] dArr7 = null;
                            double[][] dArr8 = null;
                            int i27 = 0;
                            int i28 = 0;
                            while (i27 < i10) {
                                if (oooOOOArr3[i27].f82593Oooo00O.containsKey(str58)) {
                                    if (dArr8 == null) {
                                        dArr7 = new double[i10];
                                        androidx.constraintlayout.widget.OooO00o oooO00o4 = oooOOOArr3[i27].f82593Oooo00O.get(str58);
                                        dArr8 = (double[][]) Array.newInstance((Class<?>) cls, i10, oooO00o4 == null ? 0 : oooO00o4.OooO0OO());
                                    }
                                    OooOOO oooOOO15 = oooOOOArr3[i27];
                                    dArr7[i28] = oooOOO15.f82582OooOo;
                                    double[] dArr9 = dArr8[i28];
                                    androidx.constraintlayout.widget.OooO00o oooO00o5 = oooOOO15.f82593Oooo00O.get(str58);
                                    if (oooO00o5 != null) {
                                        if (oooO00o5.OooO0OO() == 1) {
                                            dArr9[0] = oooO00o5.OooO00o();
                                        } else {
                                            int iOooO0OO = oooO00o5.OooO0OO();
                                            oooO00o5.OooO0O0(new float[iOooO0OO]);
                                            int i29 = 0;
                                            int i30 = 0;
                                            while (i29 < iOooO0OO) {
                                                dArr9[i30] = r14[i29];
                                                i29++;
                                                str58 = str58;
                                                i30++;
                                                i25 = i25;
                                                i27 = i27;
                                            }
                                        }
                                    }
                                    i3 = i25;
                                    str11 = str58;
                                    i4 = i27;
                                    i28++;
                                } else {
                                    i3 = i25;
                                    str11 = str58;
                                    i4 = i27;
                                }
                                i27 = i4 + 1;
                                str58 = str11;
                                i25 = i3;
                            }
                            int i31 = i25;
                            double[] dArrCopyOf = Arrays.copyOf(dArr7, i28);
                            double[][] dArr10 = (double[][]) Arrays.copyOf(dArr8, i28);
                            int i32 = i31 + 1;
                            this.f82603OooO0oo[i32] = o0000O00.OooO0O0.OooO00o(this.f82598OooO0OO, dArrCopyOf, dArr10);
                            i25 = i32;
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        OooOOO oooOOO = this.f82599OooO0Oo;
        sb.append(oooOOO.f82584OooOoO);
        sb.append(" y: ");
        sb.append(oooOOO.f82586OooOoOO);
        sb.append(" end: x: ");
        OooOOO oooOOO2 = this.f82601OooO0o0;
        sb.append(oooOOO2.f82584OooOoO);
        sb.append(" y: ");
        sb.append(oooOOO2.f82586OooOoOO);
        return sb.toString();
    }
}
