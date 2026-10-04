package OooO0O0;

import android.graphics.PointF;
import android.util.Log;
import java.lang.reflect.Array;
import java.util.List;
import o00O0o.C24918OooO0O0;
import o00O0o0O.C24933OooO00o;
import oO0OOooO.AbstractC33146OooO00o;
import oO0OOooO.C33147OooO0O0;
import oO0OOooO.C33148OooO0OO;
import oO0OOooO.C33149OooO0Oo;
import oO0OOooO.C33152OooO0oO;
import oO0OOooO.C33155OooOO0O;
import oO0OOooO.C33156OooOO0o;
import oO0OOooO.InterfaceC33145OooO;
import oO0OoOoO.C33290OooO00o;
import oO0OoOoO.C33291OooO0O0;

/* JADX INFO: renamed from: OooO0O0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20396OooO0oO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f58150OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public PointF[] f58151OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float[] f58152OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float[] f58153OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float[][] f58154OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f58155OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f58156OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f58157OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f58158OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public PointF f58159OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f58160OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f58161OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public PointF f58162OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public PointF f58163OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f58164OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public long f58165OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public long f58166OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public long f58167OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f58168OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f58169OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public float f58170OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f58171OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public float f58172OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f58173OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f58174OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f58175OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public List<PointF> f58176OooOoOO;

    public static float[] OooO0Oo(PointF pointF, PointF pointF2) {
        float f = pointF2.x - pointF.x;
        float f2 = pointF2.y - pointF.y;
        return new float[]{(float) Math.hypot(f, f2), f, f2};
    }

    public final void OooO00o() {
        this.f58168OooOOoo = true;
        this.f58164OooOOOO = 0L;
        this.f58171OooOo00 = 0;
        this.f58160OooOO0O = 0.0f;
        this.f58161OooOO0o = 0.0f;
        this.f58163OooOOO0 = new PointF(0.0f, 0.0f);
        this.f58162OooOOO = new PointF(0.0f, 0.0f);
        this.f58174OooOoO = 0;
        if (this.f58169OooOo == 2) {
            this.f58169OooOo = 0;
        }
        this.f58175OooOoO0 = false;
        float f = this.f58170OooOo0;
        if (f <= 0.0f || f >= 40.0f || this.f58172OooOo0O >= 200.0f) {
            this.f58173OooOo0o = 0;
        } else {
            this.f58173OooOo0o++;
        }
        String str = "newest_trajectory_length = " + this.f58172OooOo0O + "newest_stroke_length = " + this.f58170OooOo0;
        if (this.f58158OooO0oo >= 1) {
            Log.d("LenovoFiltering===!!!", str);
        }
        this.f58170OooOo0 = 0.0f;
        this.f58172OooOo0O = 0.0f;
        if (this.f58173OooOo0o >= 3) {
            if (this.f58169OooOo != 1) {
                this.f58175OooOoO0 = true;
            } else {
                this.f58175OooOoO0 = false;
            }
            this.f58169OooOo = 1;
        }
        String str2 = "call  consecutive_short_stroke_num = " + this.f58173OooOo0o + "write_mode = " + this.f58169OooOo;
        if (this.f58158OooO0oo >= 1) {
            Log.d("LenovoFiltering===!!!", str2);
        }
    }

    public final void OooO0O0(String str, String str2) {
        if (this.f58158OooO0oo >= 1) {
            Log.d(str, str2);
        }
    }

    public final float[] OooO0OO(long j) {
        int i = (int) (j / 4);
        if (i < 0) {
            i = 0;
        }
        if (i >= 10) {
            i = 10;
        }
        return this.f58154OooO0Oo[i];
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0859 A[LOOP:17: B:297:0x0857->B:298:0x0859, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x08af  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final double[] OooO0o() {
        double[] dArr;
        int i;
        C33148OooO0OO[] c33148OooO0OOArr;
        int i2;
        double d;
        double d2;
        double d3;
        double d4;
        double dSqrt;
        double d5;
        long j;
        int length;
        int i3;
        double[] dArr2;
        int i4;
        double dMo80627a;
        double d6;
        double d7;
        int i5;
        double[][] dArr3;
        double[][] dArr4;
        int i6;
        int i7;
        double[] dArr5;
        double[] dArr6;
        double d8;
        double dOooO00o;
        double dOooO00o2;
        double d9;
        double dOooO00o3;
        int i8;
        int i9 = 2;
        int i10 = 1;
        int i11 = 0;
        Class cls = Double.TYPE;
        double[][] dArr7 = (double[][]) Array.newInstance((Class<?>) cls, 16, 2);
        double[][] dArr8 = (double[][]) Array.newInstance((Class<?>) cls, 16, 2);
        int i12 = 8;
        double d10 = 0.0d;
        double d11 = 0.0d;
        double d12 = 0.0d;
        while (i12 < 24) {
            int i13 = i12 - 8;
            double[][] dArr9 = dArr7;
            dArr7[i13][0] = this.f58176OooOoOO.get(i12).x;
            dArr9[i13][1] = this.f58176OooOoOO.get(i12).y;
            dArr8[i13][0] = this.f58176OooOoOO.get(i12).x;
            dArr8[i13][1] = this.f58176OooOoOO.get(i12).y;
            d11 += (double) this.f58176OooOoOO.get(i12).x;
            d10 += (double) this.f58176OooOoOO.get(i12).y;
            i12++;
            i9 = i9;
            dArr7 = dArr9;
        }
        int i14 = i9;
        double[][] dArr10 = dArr7;
        double d13 = d11 / 16.0d;
        double d14 = d10 / 16.0d;
        for (int i15 = 0; i15 < 16; i15++) {
            double[] dArr11 = dArr8[i15];
            dArr11[0] = dArr11[0] - d13;
            dArr11[1] = dArr11[1] - d14;
        }
        AbstractC33146OooO00o abstractC33146OooO00oOooO00o = C33152OooO0oO.OooO00o(dArr8);
        InterfaceC33145OooO interfaceC33145OooOMo80629a = abstractC33146OooO00oOooO00o.mo80633d().OooO0O0(abstractC33146OooO00oOooO00o).mo80629a();
        double dMo80628a = ((double) (interfaceC33145OooOMo80629a.mo80628a() * interfaceC33145OooOMo80629a.mo80632c() * 10)) * C33291OooO0O0.f120516OooO00o;
        int iMo80632c = interfaceC33145OooOMo80629a.mo80632c();
        if (iMo80632c == interfaceC33145OooOMo80629a.mo80628a()) {
            int i16 = 0;
            while (i16 < iMo80632c) {
                int i17 = i16 + 1;
                int i18 = i17;
                j = Long.MIN_VALUE;
                while (i18 < iMo80632c) {
                    double dMo80627a2 = interfaceC33145OooOMo80629a.mo80627a(i16, i18);
                    double dMo80627a3 = interfaceC33145OooOMo80629a.mo80627a(i18, i16);
                    double dOooO00o4 = C33290OooO00o.OooO00o(dMo80627a2 - dMo80627a3);
                    double dOooO00o5 = C33290OooO00o.OooO00o(dMo80627a2);
                    double dOooO00o6 = C33290OooO00o.OooO00o(dMo80627a3);
                    if (dOooO00o5 <= dOooO00o6) {
                        if (dOooO00o5 >= dOooO00o6) {
                            if (dOooO00o5 != dOooO00o6) {
                                dOooO00o5 = Double.NaN;
                            } else if (Double.doubleToRawLongBits(dOooO00o5) == Long.MIN_VALUE) {
                                dOooO00o5 = dOooO00o6;
                            }
                        }
                        length = c33148OooO0OOArr.length;
                        int i19 = C33152OooO0oO.f119881OooO00o;
                        InterfaceC33145OooO c33147OooO0O0 = length * length <= 4096 ? new C33147OooO0O0(length, length) : new C33149OooO0Oo(length, length);
                        for (i3 = 0; i3 < length; i3++) {
                            c33147OooO0O0.OooO0Oo(i3, c33148OooO0OOArr[i3]);
                        }
                        dArr2 = (double[]) dArr.clone();
                        int i20 = 0;
                        for (i4 = 1; i4 < dArr2.length; i4++) {
                            if (dArr2[i4] < dArr2[i20]) {
                                i20 = i4;
                            }
                        }
                        InterfaceC33145OooO interfaceC33145OooOMo80630a = c33147OooO0O0.mo80630a(i20);
                        dMo80627a = interfaceC33145OooOMo80630a.mo80627a(0, 0);
                        double dMo80627a4 = interfaceC33145OooOMo80630a.mo80627a(1, 0);
                        double[] dArr12 = dArr10[15];
                        double dMo80627a5 = interfaceC33145OooOMo80630a.mo80633d().OooO0O0(new C33147OooO0O0(new double[][]{new double[]{dArr12[0]}, new double[]{dArr12[1]}})).mo80627a(0, 0);
                        if (dMo80627a == 0.0d || dMo80627a4 == 0.0d) {
                            d6 = 0.0d;
                        } else {
                            d6 = -(dMo80627a / dMo80627a4);
                            d12 = dMo80627a5 / dMo80627a4;
                        }
                        return new double[]{dMo80627a, dMo80627a4, d6, d12};
                    }
                    if (dOooO00o4 <= dOooO00o5 * dMo80628a) {
                        i18++;
                        i11 = 0;
                    }
                }
                i16 = i17;
            }
            C33156OooOO0o c33156OooOO0o = new C33156OooOO0o(interfaceC33145OooOMo80629a);
            InterfaceC33145OooO interfaceC33145OooO = c33156OooOO0o.f119890OooO0Oo;
            double[] dArr13 = c33156OooOO0o.f119889OooO0OO;
            if (interfaceC33145OooO == null) {
                if (c33156OooOO0o.f119891OooO0o0 == null) {
                    double[][] dArr14 = c33156OooOO0o.f119887OooO00o;
                    int length2 = dArr14.length;
                    int[] iArr = new int[i14];
                    iArr[1] = length2;
                    iArr[0] = length2;
                    double[][] dArr15 = (double[][]) Array.newInstance((Class<?>) cls, iArr);
                    int i21 = length2 - 1;
                    for (int i22 = 1; i21 >= i22; i22 = 1) {
                        int i23 = i21 - 1;
                        double[] dArr16 = dArr14[i23];
                        double[] dArr17 = dArr15[i21];
                        dArr17[i21] = 1.0d;
                        double d15 = dArr16[i21];
                        if (d15 != 0.0d) {
                            double d16 = dArr13[i23];
                            double d17 = 1.0d / (d16 * d15);
                            double d18 = 1.0d / d16;
                            dArr17[i21] = (d15 * d18) + 1.0d;
                            int i24 = 1;
                            int i25 = i21 + 1;
                            for (int i26 = i25; i26 < length2; i26++) {
                                dArr15[i21][i26] = dArr16[i26] * d18;
                            }
                            int i27 = i25;
                            while (i27 < length2) {
                                int i28 = i25;
                                double d19 = 0.0d;
                                while (i28 < length2) {
                                    d19 = (dArr15[i27][i28] * dArr16[i28]) + d19;
                                    i28 += i24;
                                    i24 = 1;
                                }
                                double d20 = d19 * d17;
                                dArr15[i27][i21] = dArr16[i21] * d20;
                                for (int i29 = i25; i29 < length2; i29++) {
                                    double[] dArr18 = dArr15[i27];
                                    dArr18[i29] = (dArr16[i29] * d20) + dArr18[i29];
                                }
                                i27++;
                                i24 = 1;
                            }
                        }
                        i21--;
                    }
                    dArr15[0][0] = 1.0d;
                    c33156OooOO0o.f119891OooO0o0 = C33152OooO0oO.OooO00o(dArr15);
                }
                c33156OooOO0o.f119890OooO0Oo = c33156OooOO0o.f119891OooO0o0.mo80633d();
            }
            double[][] dArr19 = (double[][]) c33156OooOO0o.f119890OooO0Oo.mo80634e().clone();
            double[] dArr20 = c33156OooOO0o.f119888OooO0O0;
            int length3 = dArr20.length;
            dArr = new double[length3];
            double[] dArr21 = new double[length3];
            double[] dArr22 = new double[length3];
            int i30 = 0;
            while (true) {
                i = length3 - 1;
                if (i30 >= i) {
                    break;
                }
                dArr[i30] = dArr20[i30];
                dArr22[i30] = dArr13[i30];
                i30++;
            }
            dArr[i] = dArr20[i];
            dArr22[i] = 0.0d;
            double dOooO00o7 = 0.0d;
            for (int i31 = 0; i31 < length3; i31++) {
                if (C33290OooO00o.OooO00o(dArr[i31]) > dOooO00o7) {
                    dOooO00o7 = C33290OooO00o.OooO00o(dArr[i31]);
                }
                if (C33290OooO00o.OooO00o(dArr22[i31]) > dOooO00o7) {
                    dOooO00o7 = C33290OooO00o.OooO00o(dArr22[i31]);
                }
            }
            if (dOooO00o7 != 0.0d) {
                for (int i32 = 0; i32 < length3; i32++) {
                    double dOooO00o8 = C33290OooO00o.OooO00o(dArr[i32]);
                    double d21 = C33291OooO0O0.f120516OooO00o * dOooO00o7;
                    if (dOooO00o8 <= d21) {
                        dArr[i32] = 0.0d;
                    }
                    if (C33290OooO00o.OooO00o(dArr22[i32]) <= d21) {
                        dArr22[i32] = 0.0d;
                    }
                }
            }
            int i33 = 1;
            for (int i34 = 0; i34 < length3; i34++) {
                int i35 = 0;
                do {
                    i2 = i34;
                    while (i2 < i) {
                        int i36 = i2 + 1;
                        double dOooO00o9 = C33290OooO00o.OooO00o(dArr[i36]) + C33290OooO00o.OooO00o(dArr[i2]);
                        if (C33290OooO00o.OooO00o(dArr22[i2]) + dOooO00o9 == dOooO00o9) {
                            break;
                        }
                        i2 = i36;
                    }
                    if (i2 != i34) {
                        if (i35 == 30) {
                            throw new o00O0o.OooO0o((byte) 30, new Object[0]);
                        }
                        i35++;
                        double d22 = (dArr[i34 + 1] - dArr[i34]) / (dArr22[i34] * 2.0d);
                        int i37 = C33290OooO00o.f120515OooO00o;
                        double dSqrt2 = Math.sqrt((d22 * d22) + 1.0d);
                        if (d22 < 0.0d) {
                            d = dArr[i2] - dArr[i34];
                            d2 = dArr22[i34];
                            d3 = d22 - dSqrt2;
                        } else {
                            d = dArr[i2] - dArr[i34];
                            d2 = dArr22[i34];
                            d3 = d22 + dSqrt2;
                        }
                        double d23 = (d2 / d3) + d;
                        int i38 = i2 - 1;
                        double d24 = 0.0d;
                        double d25 = 1.0d;
                        double d26 = 1.0d;
                        while (true) {
                            if (i38 < i34) {
                                break;
                            }
                            double d27 = dArr22[i38];
                            double d28 = d26 * d27;
                            double d29 = d25 * d27;
                            if (C33290OooO00o.OooO00o(d28) >= C33290OooO00o.OooO00o(d23)) {
                                double d30 = d23 / d28;
                                dSqrt = Math.sqrt((d30 * d30) + 1.0d);
                                dArr22[i38 + 1] = d28 * dSqrt;
                                d4 = 1.0d / dSqrt;
                                d5 = d30 * d4;
                            } else {
                                double d31 = d28 / d23;
                                double dSqrt3 = Math.sqrt((d31 * d31) + 1.0d);
                                dArr22[i38 + 1] = d23 * dSqrt3;
                                double d32 = 1.0d / dSqrt3;
                                d4 = d31 * d32;
                                dSqrt = dSqrt3;
                                d5 = d32;
                            }
                            double d33 = d4;
                            int i39 = i38 + 1;
                            if (dArr22[i39] == 0.0d) {
                                dArr[i39] = dArr[i39] - d24;
                                dArr22[i2] = 0.0d;
                                dSqrt2 = dSqrt;
                                break;
                            }
                            double d34 = dArr[i39] - d24;
                            double d35 = d5;
                            dSqrt2 = C20395OooO0o0.OooO00o(d35, 2.0d, d29, (dArr[i38] - d34) * d33);
                            d24 = d33 * dSqrt2;
                            dArr[i39] = d34 + d24;
                            double d36 = (d35 * dSqrt2) - d29;
                            for (int i40 = 0; i40 < length3; i40++) {
                                double[] dArr23 = dArr19[i40];
                                double d37 = dArr23[i39];
                                dArr23[i39] = (d35 * d37) + (dArr23[i38] * d33);
                                dArr23[i38] = (dArr23[i38] * d35) - (d37 * d33);
                            }
                            i38--;
                            d23 = d36;
                            d25 = d35;
                            d26 = d33;
                        }
                        if (dSqrt2 != 0.0d || i38 < i34) {
                            dArr[i34] = dArr[i34] - d24;
                            dArr22[i34] = d23;
                            dArr22[i2] = 0.0d;
                        }
                    }
                    i33 = 1;
                } while (i2 != i34);
            }
            int i41 = 0;
            while (i41 < length3) {
                double d38 = dArr[i41];
                int i42 = i41 + 1;
                int i43 = i41;
                int i44 = i42;
                while (i44 < length3) {
                    double d39 = dArr[i44];
                    if (d39 > d38) {
                        i43 = i44;
                        d38 = d39;
                    }
                    i44 += i33;
                    i33 = 1;
                }
                if (i43 != i41) {
                    dArr[i43] = dArr[i41];
                    dArr[i41] = d38;
                    for (int i45 = 0; i45 < length3; i45++) {
                        double[] dArr24 = dArr19[i45];
                        double d40 = dArr24[i41];
                        dArr24[i41] = dArr24[i43];
                        dArr24[i43] = d40;
                    }
                }
                i41 = i42;
                i33 = 1;
            }
            double dOooO00o10 = 0.0d;
            for (int i46 = 0; i46 < length3; i46++) {
                if (C33290OooO00o.OooO00o(dArr[i46]) > dOooO00o10) {
                    dOooO00o10 = C33290OooO00o.OooO00o(dArr[i46]);
                }
            }
            if (dOooO00o10 != 0.0d) {
                for (int i47 = 0; i47 < length3; i47++) {
                    if (C33290OooO00o.OooO00o(dArr[i47]) < C33291OooO0O0.f120516OooO00o * dOooO00o10) {
                        dArr[i47] = 0.0d;
                    }
                }
            }
            C33148OooO0OO[] c33148OooO0OOArr2 = new C33148OooO0OO[length3];
            double[] dArr25 = new double[length3];
            for (int i48 = 0; i48 < length3; i48++) {
                for (int i49 = 0; i49 < length3; i49++) {
                    dArr25[i49] = dArr19[i49][i48];
                }
                c33148OooO0OOArr2[i48] = new C33148OooO0OO(dArr25);
            }
            c33148OooO0OOArr = c33148OooO0OOArr2;
            length = c33148OooO0OOArr.length;
            int i192 = C33152OooO0oO.f119881OooO00o;
            if (length * length <= 4096) {
            }
            while (i3 < length) {
            }
            dArr2 = (double[]) dArr.clone();
            int i202 = 0;
            while (i4 < dArr2.length) {
            }
            InterfaceC33145OooO interfaceC33145OooOMo80630a2 = c33147OooO0O0.mo80630a(i202);
            dMo80627a = interfaceC33145OooOMo80630a2.mo80627a(0, 0);
            double dMo80627a42 = interfaceC33145OooOMo80630a2.mo80627a(1, 0);
            double[] dArr122 = dArr10[15];
            double dMo80627a52 = interfaceC33145OooOMo80630a2.mo80633d().OooO0O0(new C33147OooO0O0(new double[][]{new double[]{dArr122[0]}, new double[]{dArr122[1]}})).mo80627a(0, 0);
            if (dMo80627a == 0.0d) {
                d6 = 0.0d;
            }
            return new double[]{dMo80627a, dMo80627a42, d6, d12};
        }
        j = Long.MIN_VALUE;
        C33155OooOO0O c33155OooOO0O = new C33155OooOO0O(interfaceC33145OooOMo80629a);
        AbstractC33146OooO00o abstractC33146OooO00o = c33155OooOO0O.f119885OooO0Oo;
        double[][] dArr26 = c33155OooOO0O.f119883OooO0O0;
        if (abstractC33146OooO00o == null) {
            c33155OooOO0O.f119885OooO0Oo = C33152OooO0oO.OooO00o(dArr26);
        }
        double[][] dArrMo80634e = c33155OooOO0O.f119885OooO0Oo.mo80634e();
        double[] dArr27 = new double[dArrMo80634e.length];
        double[] dArr28 = new double[dArrMo80634e.length];
        int i50 = i11;
        while (true) {
            d7 = 1.0E-12d;
            if (i50 >= dArr27.length) {
                break;
            }
            if (i50 != dArr27.length - i10) {
                int i51 = i50 + 1;
                if (!C33291OooO0O0.OooO0O0(dArrMo80634e[i51][i50], 1.0E-12d)) {
                    double[] dArr29 = dArrMo80634e[i51];
                    double d41 = dArr29[i51];
                    double[] dArr30 = dArrMo80634e[i50];
                    double d42 = (dArr30[i50] - d41) * 0.5d;
                    double d43 = dArr29[i50] * dArr30[i51];
                    i8 = i10;
                    double dSqrt4 = Math.sqrt(C33290OooO00o.OooO00o(d43 + (d42 * d42)));
                    double d44 = d41 + d42;
                    dArr27[i50] = d44;
                    dArr28[i50] = dSqrt4;
                    dArr27[i51] = d44;
                    dArr28[i51] = -dSqrt4;
                    i50 = i51;
                }
                i50 += i8;
                i10 = i8;
            }
            i8 = i10;
            dArr27[i50] = dArrMo80634e[i50][i50];
            i50 += i8;
            i10 = i8;
        }
        int i52 = i10;
        if (c33155OooOO0O.f119885OooO0Oo == null) {
            c33155OooOO0O.f119885OooO0Oo = C33152OooO0oO.OooO00o(dArr26);
        }
        double[][] dArrMo80634e2 = c33155OooOO0O.f119885OooO0Oo.mo80634e();
        if (c33155OooOO0O.f119884OooO0OO == null) {
            c33155OooOO0O.f119884OooO0OO = C33152OooO0oO.OooO00o(c33155OooOO0O.f119882OooO00o);
        }
        double[][] dArrMo80634e3 = c33155OooOO0O.f119884OooO0OO.mo80634e();
        int length4 = dArrMo80634e2.length;
        double dOooO00o11 = 0.0d;
        for (int i53 = 0; i53 < length4; i53 += i52) {
            int i54 = i53 - 1;
            int i55 = C33290OooO00o.f120515OooO00o;
            if (i54 <= 0) {
                i54 = 0;
            }
            while (i54 < length4) {
                dOooO00o11 += C33290OooO00o.OooO00o(dArrMo80634e2[i53][i54]);
                i54 += i52;
            }
        }
        if (C33291OooO0O0.OooO0O0(dOooO00o11, 1.0E-12d)) {
            throw new C24918OooO0O0(new Object[0]);
        }
        int i56 = length4 - 1;
        int i57 = i56;
        double d45 = 0.0d;
        double d46 = 0.0d;
        double d47 = 0.0d;
        while (i57 >= 0) {
            double d48 = dArr27[i57];
            double d49 = dArr28[i57];
            if (C33291OooO0O0.OooO00o(d49)) {
                dArrMo80634e2[i57][i57] = 1.0d;
                int i58 = i57 - 1;
                double d50 = d46;
                int i59 = i57;
                while (i58 >= 0) {
                    double d51 = dArrMo80634e2[i58][i58] - d48;
                    int i60 = i52;
                    double d52 = d45;
                    double d53 = 0.0d;
                    for (int i61 = i59; i61 <= i57; i61++) {
                        d53 = (dArrMo80634e2[i58][i61] * dArrMo80634e2[i61][i57]) + d53;
                    }
                    double[][] dArr31 = dArrMo80634e2;
                    double d54 = dArr28[i58];
                    if (!C33291OooO0O0.OooO0O0(d54, d7) && d54 < 0.0d) {
                        d9 = d53;
                        d50 = d51;
                    } else {
                        if (!C33291OooO0O0.OooO00o(dArr28[i58])) {
                            double[] dArr32 = dArr31[i58];
                            int i62 = i58 + 1;
                            double d55 = dArr32[i62];
                            double d56 = dArr31[i62][i58];
                            double d57 = dArr27[i58] - d48;
                            double d58 = dArr28[i58];
                            double dOooO00o12 = C20394OooO0Oo.OooO00o(d50, d53, d55 * d52, (d58 * d58) + (d57 * d57));
                            dArr32[i57] = dOooO00o12;
                            if (C33290OooO00o.OooO00o(d55) > C33290OooO00o.OooO00o(d50)) {
                                dArr31[i62][i57] = C20394OooO0Oo.OooO00o(d51, dOooO00o12, -d53, d55);
                            } else {
                                d9 = d52;
                                double d59 = d50;
                                d50 = d59;
                                dArr31[i62][i57] = C20394OooO0Oo.OooO00o(d56, dOooO00o12, -d9, d59);
                                dOooO00o3 = C33290OooO00o.OooO00o(dArr31[i58][i57]);
                                if (C33291OooO0O0.f120516OooO00o * dOooO00o3 * dOooO00o3 > 1.0d) {
                                    for (int i63 = i58; i63 <= i57; i63++) {
                                        double[] dArr33 = dArr31[i63];
                                        dArr33[i57] = dArr33[i57] / dOooO00o3;
                                    }
                                }
                                i59 = i58;
                            }
                        } else if (d51 != 0.0d) {
                            dArr31[i58][i57] = (-d53) / d51;
                        } else {
                            dArr31[i58][i57] = (-d53) / (C33291OooO0O0.f120516OooO00o * dOooO00o11);
                        }
                        d9 = d52;
                        dOooO00o3 = C33290OooO00o.OooO00o(dArr31[i58][i57]);
                        if (C33291OooO0O0.f120516OooO00o * dOooO00o3 * dOooO00o3 > 1.0d) {
                        }
                        i59 = i58;
                    }
                    i58--;
                    dArrMo80634e2 = dArr31;
                    d47 = d53;
                    i52 = i60;
                    d45 = d9;
                    d7 = 1.0E-12d;
                }
                i5 = i52;
                dArr3 = dArrMo80634e2;
                dArr4 = dArrMo80634e3;
                i6 = length4;
                i7 = i56;
                dArr5 = dArr27;
                dArr6 = dArr28;
                d8 = dOooO00o11;
                d46 = d50;
            } else {
                i5 = i52;
                dArr3 = dArrMo80634e2;
                if (d49 < 0.0d) {
                    int i64 = i57 - 1;
                    if (C33290OooO00o.OooO00o(dArr3[i57][i64]) > C33290OooO00o.OooO00o(dArr3[i64][i57])) {
                        double[] dArr34 = dArr3[i64];
                        double[] dArr35 = dArr3[i57];
                        dArr34[i64] = d49 / dArr35[i64];
                        dArr34[i57] = (-(dArr35[i57] - d48)) / dArr35[i64];
                    } else {
                        double[] dArr36 = dArr3[i64];
                        C24933OooO00o c24933OooO00oOooO00o = kotlin.jvm.internal.OooO0OO.OooO00o(0.0d, -dArr36[i57], dArr36[i64] - d48, d49);
                        double[] dArr37 = dArr3[i64];
                        dArr37[i64] = c24933OooO00oOooO00o.f84599OooOo;
                        dArr37[i57] = c24933OooO00oOooO00o.f84600OooOo0o;
                    }
                    double[] dArr38 = dArr3[i57];
                    dArr38[i64] = 0.0d;
                    dArr38[i57] = 1.0d;
                    int i65 = i57 - 2;
                    int i66 = i64;
                    double d60 = d47;
                    while (i65 >= 0) {
                        int i67 = i64;
                        int i68 = i65;
                        double[][] dArr39 = dArrMo80634e3;
                        double[] dArr40 = dArr27;
                        double[] dArr41 = dArr28;
                        double d61 = 0.0d;
                        double d62 = 0.0d;
                        for (int i69 = i66; i69 <= i57; i69++) {
                            double d63 = dArr3[i68][i69];
                            double[] dArr42 = dArr3[i69];
                            d61 = (dArr42[i67] * d63) + d61;
                            d62 = (d63 * dArr42[i57]) + d62;
                        }
                        double d64 = dArr3[i68][i68] - d48;
                        double d65 = dOooO00o11;
                        double d66 = dArr41[i68];
                        int i70 = length4;
                        int i71 = i56;
                        if (!C33291OooO0O0.OooO0O0(d66, 1.0E-12d) && d66 < 0.0d) {
                            d60 = d61;
                            d45 = d62;
                        } else {
                            if (C33291OooO0O0.OooO00o(dArr41[i68])) {
                                C24933OooO00o c24933OooO00oOooO00o2 = kotlin.jvm.internal.OooO0OO.OooO00o(-d61, -d62, d64, d49);
                                double[] dArr43 = dArr3[i68];
                                dArr43[i67] = c24933OooO00oOooO00o2.f84599OooOo;
                                dArr43[i57] = c24933OooO00oOooO00o2.f84600OooOo0o;
                            } else {
                                int i72 = i68 + 1;
                                double d67 = dArr3[i68][i72];
                                double d68 = dArr3[i72][i68];
                                double d69 = dArr40[i68] - d48;
                                double d70 = dArr41[i68];
                                double dOooO00o13 = ((d70 * d70) + (d69 * d69)) - (d49 * d49);
                                double d71 = d69 * 2.0d * d49;
                                if (C33291OooO0O0.OooO00o(dOooO00o13) && C33291OooO0O0.OooO00o(d71)) {
                                    dOooO00o13 = (C33290OooO00o.OooO00o(d46) + C33290OooO00o.OooO00o(d68) + C33290OooO00o.OooO00o(d67) + C33290OooO00o.OooO00o(d49) + C33290OooO00o.OooO00o(d64)) * C33291OooO0O0.f120516OooO00o * d65;
                                }
                                C24933OooO00o c24933OooO00oOooO00o3 = kotlin.jvm.internal.OooO0OO.OooO00o((d49 * d62) + ((d67 * d60) - (d46 * d61)), ((d67 * d45) - (d46 * d62)) - (d49 * d61), dOooO00o13, d71);
                                double[] dArr44 = dArr3[i68];
                                dArr44[i67] = c24933OooO00oOooO00o3.f84599OooOo;
                                dArr44[i57] = c24933OooO00oOooO00o3.f84600OooOo0o;
                                if (C33290OooO00o.OooO00o(d67) > C33290OooO00o.OooO00o(d49) + C33290OooO00o.OooO00o(d46)) {
                                    double[] dArr45 = dArr3[i72];
                                    double[] dArr46 = dArr3[i68];
                                    double d72 = d49;
                                    dArr45[i67] = OooO0OO.OooO00o(d72, dArr46[i57], (-d61) - (d64 * dArr46[i67]), d67);
                                    d49 = d72;
                                    dArr45[i57] = C20394OooO0Oo.OooO00o(d72, dArr46[i67], (-d62) - (d64 * dArr46[i57]), d67);
                                } else {
                                    double[] dArr47 = dArr3[i68];
                                    d64 = d46;
                                    C24933OooO00o c24933OooO00oOooO00o4 = kotlin.jvm.internal.OooO0OO.OooO00o((-d60) - (dArr47[i67] * d68), (-d45) - (d68 * dArr47[i57]), d64, d49);
                                    double[] dArr48 = dArr3[i72];
                                    dArr48[i67] = c24933OooO00oOooO00o4.f84599OooOo;
                                    dArr48[i57] = c24933OooO00oOooO00o4.f84600OooOo0o;
                                    dOooO00o = C33290OooO00o.OooO00o(dArr3[i68][i67]);
                                    dOooO00o2 = C33290OooO00o.OooO00o(dArr3[i68][i57]);
                                    if (dOooO00o <= dOooO00o2) {
                                        if (dOooO00o >= dOooO00o2) {
                                            if (dOooO00o != dOooO00o2) {
                                                dOooO00o = Double.NaN;
                                            } else if (Double.doubleToRawLongBits(dOooO00o) == j) {
                                                dOooO00o = dOooO00o2;
                                            }
                                        }
                                    }
                                    if (C33291OooO0O0.f120516OooO00o * dOooO00o * dOooO00o > 1.0d) {
                                        for (int i73 = i68; i73 <= i57; i73++) {
                                            double[] dArr49 = dArr3[i73];
                                            dArr49[i67] = dArr49[i67] / dOooO00o;
                                            dArr49[i57] = dArr49[i57] / dOooO00o;
                                        }
                                    }
                                    i66 = i68;
                                }
                            }
                            d64 = d46;
                            dOooO00o = C33290OooO00o.OooO00o(dArr3[i68][i67]);
                            dOooO00o2 = C33290OooO00o.OooO00o(dArr3[i68][i57]);
                            if (dOooO00o <= dOooO00o2) {
                            }
                            if (C33291OooO0O0.f120516OooO00o * dOooO00o * dOooO00o > 1.0d) {
                            }
                            i66 = i68;
                        }
                        d46 = d64;
                        i65 = i68 - 1;
                        length4 = i70;
                        i64 = i67;
                        dArrMo80634e3 = dArr39;
                        dArr27 = dArr40;
                        dArr28 = dArr41;
                        i56 = i71;
                        dOooO00o11 = d65;
                    }
                    dArr4 = dArrMo80634e3;
                    i6 = length4;
                    i7 = i56;
                    dArr5 = dArr27;
                    dArr6 = dArr28;
                    d8 = dOooO00o11;
                    d47 = d60;
                } else {
                    dArr4 = dArrMo80634e3;
                    i6 = length4;
                    i7 = i56;
                    dArr5 = dArr27;
                    dArr6 = dArr28;
                    d8 = dOooO00o11;
                }
            }
            i57--;
            length4 = i6;
            dArrMo80634e2 = dArr3;
            dArrMo80634e3 = dArr4;
            dArr27 = dArr5;
            i52 = i5;
            dArr28 = dArr6;
            i56 = i7;
            dOooO00o11 = d8;
            d7 = 1.0E-12d;
        }
        double[][] dArr50 = dArrMo80634e3;
        int i74 = length4;
        int i75 = i56;
        double[] dArr51 = dArr27;
        double[][] dArr52 = dArrMo80634e2;
        int i76 = i75;
        while (i76 >= 0) {
            int i77 = i75;
            for (int i78 = 0; i78 <= i77; i78++) {
                double d73 = 0.0d;
                int i79 = 0;
                while (true) {
                    int i80 = C33290OooO00o.f120515OooO00o;
                    if (i79 <= (i76 <= i77 ? i76 : i77)) {
                        d73 += dArr50[i78][i79] * dArr52[i79][i76];
                        i79++;
                    }
                }
                dArr50[i78][i76] = d73;
            }
            i76--;
            i75 = i77;
        }
        c33148OooO0OOArr = new C33148OooO0OO[i74];
        double[] dArr53 = new double[i74];
        for (int i81 = 0; i81 < i74; i81++) {
            for (int i82 = 0; i82 < i74; i82++) {
                dArr53[i82] = dArr50[i82][i81];
            }
            c33148OooO0OOArr[i81] = new C33148OooO0OO(dArr53);
        }
        dArr = dArr51;
        length = c33148OooO0OOArr.length;
        int i1922 = C33152OooO0oO.f119881OooO00o;
        if (length * length <= 4096) {
        }
        while (i3 < length) {
        }
        dArr2 = (double[]) dArr.clone();
        int i2022 = 0;
        while (i4 < dArr2.length) {
        }
        InterfaceC33145OooO interfaceC33145OooOMo80630a22 = c33147OooO0O0.mo80630a(i2022);
        dMo80627a = interfaceC33145OooOMo80630a22.mo80627a(0, 0);
        double dMo80627a422 = interfaceC33145OooOMo80630a22.mo80627a(1, 0);
        double[] dArr1222 = dArr10[15];
        double dMo80627a522 = interfaceC33145OooOMo80630a22.mo80633d().OooO0O0(new C33147OooO0O0(new double[][]{new double[]{dArr1222[0]}, new double[]{dArr1222[1]}})).mo80627a(0, 0);
        if (dMo80627a == 0.0d) {
        }
        return new double[]{dMo80627a, dMo80627a422, d6, d12};
    }

    public final float[] OooO0o0(PointF[] pointFArr) {
        float f = OooO0Oo(pointFArr[0], pointFArr[1])[0];
        float f2 = OooO0Oo(pointFArr[1], pointFArr[2])[0];
        float fPow = ((float) ((Math.pow(f2, 2.0d) + Math.pow(f, 2.0d)) - Math.pow(OooO0Oo(pointFArr[2], pointFArr[0])[0], 2.0d))) / ((f * 2.0f) * f2);
        float[] fArr = this.f58153OooO0OO;
        return new float[]{fPow, (fArr[0] > fPow || fPow >= fArr[1]) ? (fArr[1] > fPow || fPow >= fArr[2]) ? (fArr[2] > fPow || fPow >= fArr[3]) ? (fArr[3] > fPow || fPow >= fArr[4]) ? fArr[4] <= fPow ? -1.0f : 0.0f : this.f58152OooO0O0[3] : this.f58152OooO0O0[2] : this.f58152OooO0O0[1] : this.f58152OooO0O0[0]};
    }

    public final int OooO0oO() {
        int i = 5;
        float[] fArr = new float[5];
        for (int i2 = 2; i2 < 7; i2++) {
            PointF pointF = (PointF) OooO0O0.OooO0O0(1, this.f58176OooOoOO);
            List<PointF> list = this.f58176OooOoOO;
            PointF pointF2 = list.get((list.size() - 1) - i2);
            List<PointF> list2 = this.f58176OooOoOO;
            float[] fArrOooO0o0 = OooO0o0(new PointF[]{pointF, pointF2, list2.get((list2.size() - 1) - (i2 * 2))});
            fArr[i2 - 2] = fArrOooO0o0[0];
            StringBuilder sbOooO0OO = OooO0o.OooO0OO(i2, "cos value of interval ", " is");
            sbOooO0OO.append(fArrOooO0o0[0]);
            String string = sbOooO0OO.toString();
            if (this.f58158OooO0oo >= 1) {
                Log.d("LenovoFiltering", string);
            }
        }
        float fAbs = 0.0f;
        float f = 1.0f;
        float f2 = -1.0f;
        float f3 = 0.0f;
        for (int i3 = 0; i3 < 5; i3++) {
            float f4 = fArr[i3];
            if (f4 > f2) {
                f2 = f4;
            }
            if (f4 < f) {
                f = f4;
            }
            f3 += f4;
        }
        float f5 = f3 / 5.0f;
        for (int i4 = 0; i4 < 5; i4++) {
            fAbs += Math.abs(fArr[i4] - f5);
        }
        double d = f5;
        if (d >= -0.996d || f2 >= -0.99d) {
            float f6 = fArr[0];
            float f7 = fArr[2];
            if (f6 >= f7 || f7 >= fArr[4]) {
                i = 0;
            } else if (fAbs < 0.5d) {
                i = (d >= -0.93d || ((double) f2) >= -0.9d) ? 3 : 2;
            }
        } else {
            i = 1;
        }
        String str = "line_mode=" + i + ", cur_max=" + f2 + ", cur_min=" + f + ", cur_avg=" + f5;
        if (this.f58158OooO0oo >= 1) {
            Log.d("LenovoFiltering", str);
        }
        return i;
    }
}
