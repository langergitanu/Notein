package oO0OOooO;

import com.aspose.slides.o000oOoO;
import java.io.Serializable;
import java.lang.reflect.Array;
import o00O0o.C24917OooO00o;
import oO000O0.EnumC31935OooO0Oo;
import oO0OOooO.AbstractC33146OooO00o;
import oO0OoOoO.C33290OooO00o;

/* JADX INFO: renamed from: oO0OOooO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33149OooO0Oo extends AbstractC33146OooO00o implements Serializable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final double[][] f119872OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f119873OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f119874OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f119875OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int f119876OooOoo0;

    public C33149OooO0Oo(int i, int i2) {
        super(i, i2);
        this.f119874OooOoO0 = i;
        this.f119873OooOoO = i2;
        this.f119875OooOoOO = (i + 51) / 52;
        this.f119876OooOoo0 = (i2 + 51) / 52;
        int i3 = (i + 51) / 52;
        int i4 = (i2 + 51) / 52;
        double[][] dArr = new double[i3 * i4][];
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = i6 * 52;
            int i8 = i7 + 52;
            int i9 = C33290OooO00o.f120515OooO00o;
            int i10 = (i8 > i ? i : i8) - i7;
            for (int i11 = 0; i11 < i4; i11++) {
                int i12 = i11 * 52;
                int i13 = i12 + 52;
                if (i13 > i2) {
                    i13 = i2;
                }
                dArr[i5] = new double[(i13 - i12) * i10];
                i5++;
            }
        }
        this.f119872OooOo = dArr;
    }

    @Override // oO0OOooO.InterfaceC33145OooO
    public final void OooO00o(double d, int i, int i2) {
        C33152OooO0oO.OooO0Oo(this, i);
        C33152OooO0oO.OooO0O0(this, i2);
        int i3 = i / 52;
        int i4 = i2 / 52;
        this.f119872OooOo[(i3 * this.f119876OooOoo0) + i4][(i2 - (i4 * 52)) + (o000oOoO(i4) * (i - (i3 * 52)))] = d;
    }

    @Override // oO0OOooO.AbstractC33146OooO00o, oO0OOooO.InterfaceC33145OooO
    public final InterfaceC33145OooO OooO0O0(AbstractC33146OooO00o abstractC33146OooO00o) {
        C33149OooO0Oo c33149OooO0Oo = this;
        try {
            return c33149OooO0Oo.OoooO0O((C33149OooO0Oo) abstractC33146OooO00o);
        } catch (ClassCastException unused) {
            C33152OooO0oO.OooO0OO(this, abstractC33146OooO00o);
            int iMo80628a = abstractC33146OooO00o.mo80628a();
            int i = c33149OooO0Oo.f119874OooOoO0;
            C33149OooO0Oo c33149OooO0Oo2 = new C33149OooO0Oo(i, iMo80628a);
            int i2 = 0;
            int i3 = 0;
            while (i2 < c33149OooO0Oo2.f119875OooOoOO) {
                int i4 = i2 * 52;
                int i5 = i4 + 52;
                int i6 = C33290OooO00o.f120515OooO00o;
                if (i5 > i) {
                    i5 = i;
                }
                int i7 = 0;
                while (i7 < c33149OooO0Oo2.f119876OooOoo0) {
                    int i8 = i7 * 52;
                    int i9 = i8 + 52;
                    int iMo80628a2 = abstractC33146OooO00o.mo80628a();
                    if (i9 > iMo80628a2) {
                        i9 = iMo80628a2;
                    }
                    double[] dArr = c33149OooO0Oo2.f119872OooOo[i3];
                    int i10 = 0;
                    while (true) {
                        int i11 = c33149OooO0Oo.f119876OooOoo0;
                        if (i10 < i11) {
                            int iO000oOoO = c33149OooO0Oo.o000oOoO(i10);
                            double[] dArr2 = c33149OooO0Oo.f119872OooOo[(i11 * i2) + i10];
                            int i12 = i10 * 52;
                            int i13 = i4;
                            int i14 = 0;
                            while (i13 < i5) {
                                int i15 = (i13 - i4) * iO000oOoO;
                                int i16 = i13;
                                int i17 = i15 + iO000oOoO;
                                C33149OooO0Oo c33149OooO0Oo3 = c33149OooO0Oo2;
                                int i18 = i8;
                                while (i18 < i9) {
                                    double dMo80627a = 0.0d;
                                    double[] dArr3 = dArr2;
                                    int i19 = i;
                                    int i20 = i12;
                                    for (int i21 = i15; i21 < i17; i21++) {
                                        dMo80627a = (abstractC33146OooO00o.mo80627a(i20, i18) * dArr3[i21]) + dMo80627a;
                                        i20++;
                                    }
                                    dArr[i14] = dArr[i14] + dMo80627a;
                                    i14++;
                                    i18++;
                                    dArr2 = dArr3;
                                    i = i19;
                                }
                                i13 = i16 + 1;
                                c33149OooO0Oo2 = c33149OooO0Oo3;
                            }
                            i10++;
                            c33149OooO0Oo = this;
                        }
                    }
                    i3++;
                    i7++;
                    c33149OooO0Oo = this;
                }
                i2++;
                c33149OooO0Oo = this;
            }
            return c33149OooO0Oo2;
        }
    }

    @Override // oO0OOooO.AbstractC33146OooO00o, oO0OOooO.InterfaceC33145OooO
    public final void OooO0Oo(int i, C33148OooO0OO c33148OooO0OO) {
        try {
            OoooO(i, c33148OooO0OO.f119871OooOo0o);
        } catch (ClassCastException unused) {
            super.OooO0Oo(i, c33148OooO0OO);
        }
    }

    @Override // oO0OOooO.AbstractC33146OooO00o
    public final void Oooo(AbstractC33146OooO00o.C20301OooO00o c20301OooO00o) {
        int i = 0;
        for (int i2 = 0; i2 < this.f119875OooOoOO; i2++) {
            int i3 = i2 * 52;
            int i4 = i3 + 52;
            int i5 = C33290OooO00o.f120515OooO00o;
            int i6 = this.f119874OooOoO0;
            if (i4 > i6) {
                i4 = i6;
            }
            for (int i7 = 0; i7 < this.f119876OooOoo0; i7++) {
                int i8 = i7 * 52;
                int i9 = i8 + 52;
                int i10 = this.f119873OooOoO;
                if (i9 > i10) {
                    i9 = i10;
                }
                double[] dArr = this.f119872OooOo[i];
                int i11 = 0;
                for (int i12 = i3; i12 < i4; i12++) {
                    for (int i13 = i8; i13 < i9; i13++) {
                        c20301OooO00o.f119868OooO0Oo.OooO00o(dArr[i11], i13, i12);
                        i11++;
                    }
                }
                i++;
            }
        }
    }

    public final void OoooO(int i, double[] dArr) {
        C33152OooO0oO.OooO0O0(this, i);
        int length = dArr.length;
        int i2 = this.f119874OooOoO0;
        if (length != i2) {
            throw new C33150OooO0o(dArr.length, i2);
        }
        int i3 = i / 52;
        int i4 = i - (i3 * 52);
        int iO000oOoO = o000oOoO(i3);
        int i5 = 0;
        for (int i6 = 0; i6 < this.f119875OooOoOO; i6++) {
            int iOoooOO0 = OoooOO0(i6);
            double[] dArr2 = this.f119872OooOo[(this.f119876OooOoo0 * i6) + i3];
            int i7 = 0;
            while (i7 < iOoooOO0) {
                dArr2[(i7 * iO000oOoO) + i4] = dArr[i5];
                i7++;
                i5++;
            }
        }
    }

    @Override // oO0OOooO.AbstractC33146OooO00o
    public final void OoooO0(AbstractC33146OooO00o.C20301OooO00o c20301OooO00o) {
        for (int i = 0; i < this.f119875OooOoOO; i++) {
            int i2 = i * 52;
            int i3 = i2 + 52;
            int i4 = C33290OooO00o.f120515OooO00o;
            int i5 = this.f119874OooOoO0;
            if (i3 > i5) {
                i3 = i5;
            }
            for (int i6 = i2; i6 < i3; i6++) {
                int i7 = 0;
                while (true) {
                    int i8 = this.f119876OooOoo0;
                    if (i7 < i8) {
                        int iO000oOoO = o000oOoO(i7);
                        int i9 = i7 * 52;
                        int i10 = i9 + 52;
                        int i11 = this.f119873OooOoO;
                        if (i10 > i11) {
                            i10 = i11;
                        }
                        double[] dArr = this.f119872OooOo[(i8 * i) + i7];
                        int i12 = (i6 - i2) * iO000oOoO;
                        while (i9 < i10) {
                            c20301OooO00o.f119868OooO0Oo.OooO00o(dArr[i12], i9, i6);
                            i12++;
                            i9++;
                        }
                        i7++;
                    }
                }
            }
        }
    }

    @Override // oO0OOooO.AbstractC33146OooO00o
    public final InterfaceC33145OooO OoooO00(int i, int i2) {
        return new C33149OooO0Oo(i, i2);
    }

    public final C33149OooO0Oo OoooO0O(C33149OooO0Oo c33149OooO0Oo) {
        C33149OooO0Oo c33149OooO0Oo2 = this;
        C33149OooO0Oo c33149OooO0Oo3 = c33149OooO0Oo;
        C33152OooO0oO.OooO0OO(this, c33149OooO0Oo);
        int i = c33149OooO0Oo2.f119874OooOoO0;
        C33149OooO0Oo c33149OooO0Oo4 = new C33149OooO0Oo(i, c33149OooO0Oo3.f119873OooOoO);
        int i2 = 0;
        int i3 = 0;
        while (i2 < c33149OooO0Oo4.f119875OooOoOO) {
            int i4 = i2 * 52;
            int i5 = i4 + 52;
            int i6 = C33290OooO00o.f120515OooO00o;
            if (i5 > i) {
                i5 = i;
            }
            int i7 = 0;
            while (i7 < c33149OooO0Oo4.f119876OooOoo0) {
                int iO000oOoO = c33149OooO0Oo4.o000oOoO(i7);
                int i8 = iO000oOoO + iO000oOoO;
                int i9 = i8 + iO000oOoO;
                int i10 = i9 + iO000oOoO;
                double[] dArr = c33149OooO0Oo4.f119872OooOo[i3];
                int i11 = 0;
                while (true) {
                    int i12 = c33149OooO0Oo2.f119876OooOoo0;
                    if (i11 < i12) {
                        int iO000oOoO2 = c33149OooO0Oo2.o000oOoO(i11);
                        C33149OooO0Oo c33149OooO0Oo5 = c33149OooO0Oo4;
                        double[] dArr2 = c33149OooO0Oo2.f119872OooOo[(i12 * i2) + i11];
                        double[] dArr3 = c33149OooO0Oo3.f119872OooOo[(c33149OooO0Oo3.f119876OooOoo0 * i11) + i7];
                        int i13 = i4;
                        int i14 = 0;
                        while (i13 < i5) {
                            int i15 = (i13 - i4) * iO000oOoO2;
                            double[] dArr4 = dArr3;
                            int i16 = i15 + iO000oOoO2;
                            int i17 = 0;
                            while (i17 < iO000oOoO) {
                                double[] dArr5 = dArr2;
                                double dOooO00o = 0.0d;
                                int i18 = i17;
                                int i19 = i18;
                                int i20 = i15;
                                while (i20 < i16 - 3) {
                                    dOooO00o = o000oOoO.OooO00o(dArr5[i20 + 3], dArr4[i19 + i9], (dArr5[i20 + 2] * dArr4[i19 + i8]) + (dArr5[i20 + 1] * dArr4[i19 + iO000oOoO]) + (dArr5[i20] * dArr4[i19]), dOooO00o);
                                    i20 += 4;
                                    i19 += i10;
                                }
                                while (i20 < i16) {
                                    dOooO00o = (dArr5[i20] * dArr4[i19]) + dOooO00o;
                                    i19 += iO000oOoO;
                                    i20++;
                                }
                                dArr[i14] = dArr[i14] + dOooO00o;
                                i14++;
                                i17 = i18 + 1;
                                dArr2 = dArr5;
                            }
                            i13++;
                            dArr3 = dArr4;
                        }
                        i11++;
                        c33149OooO0Oo2 = this;
                        c33149OooO0Oo3 = c33149OooO0Oo;
                        c33149OooO0Oo4 = c33149OooO0Oo5;
                    }
                }
                i3++;
                i7++;
                c33149OooO0Oo2 = this;
                c33149OooO0Oo3 = c33149OooO0Oo;
            }
            i2++;
            c33149OooO0Oo2 = this;
            c33149OooO0Oo3 = c33149OooO0Oo;
        }
        return c33149OooO0Oo4;
    }

    public final int OoooOO0(int i) {
        if (i == this.f119875OooOoOO - 1) {
            return this.f119874OooOoO0 - (i * 52);
        }
        return 52;
    }

    @Override // oO0OOooO.InterfaceC33145OooO
    /* JADX INFO: renamed from: a */
    public final int mo80628a() {
        return this.f119873OooOoO;
    }

    @Override // oO0OOooO.InterfaceC33145OooO
    /* JADX INFO: renamed from: c */
    public final int mo80632c() {
        return this.f119874OooOoO0;
    }

    @Override // oO0OOooO.AbstractC33146OooO00o, oO0OOooO.InterfaceC33145OooO
    /* JADX INFO: renamed from: d */
    public final InterfaceC33145OooO mo80633d() {
        int i = this.f119873OooOoO;
        int i2 = this.f119874OooOoO0;
        C33149OooO0Oo c33149OooO0Oo = new C33149OooO0Oo(i, i2);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f119876OooOoo0;
            if (i3 >= i5) {
                return c33149OooO0Oo;
            }
            for (int i6 = 0; i6 < this.f119875OooOoOO; i6++) {
                double[] dArr = c33149OooO0Oo.f119872OooOo[i4];
                double[] dArr2 = this.f119872OooOo[(i6 * i5) + i3];
                int i7 = i3 * 52;
                int i8 = i7 + 52;
                int i9 = C33290OooO00o.f120515OooO00o;
                if (i8 > i) {
                    i8 = i;
                }
                int i10 = i6 * 52;
                int i11 = i10 + 52;
                if (i11 > i2) {
                    i11 = i2;
                }
                int i12 = 0;
                for (int i13 = i7; i13 < i8; i13++) {
                    int i14 = i8 - i7;
                    int i15 = i13 - i7;
                    for (int i16 = i10; i16 < i11; i16++) {
                        dArr[i12] = dArr2[i15];
                        i12++;
                        i15 += i14;
                    }
                }
                i4++;
            }
            i3++;
        }
    }

    @Override // oO0OOooO.InterfaceC33145OooO
    /* JADX INFO: renamed from: e */
    public final double[][] mo80634e() {
        double[][] dArr;
        boolean z = true;
        int i = this.f119873OooOoO;
        int[] iArr = {i, i};
        int i2 = 0;
        int i3 = this.f119874OooOoO0;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iArr);
        int i4 = this.f119876OooOoo0;
        char c = '4';
        int i5 = i - ((i4 - 1) * 52);
        int i6 = 0;
        while (i6 < this.f119875OooOoOO) {
            int i7 = i6 * 52;
            int i8 = i7 + 52;
            int i9 = C33290OooO00o.f120515OooO00o;
            if (i8 > i3) {
                i8 = i3;
            }
            int i10 = i2;
            int i11 = i10;
            while (i7 < i8) {
                double[] dArr3 = dArr2[i7];
                int i12 = i6 * i4;
                boolean z2 = z;
                int i13 = i2;
                int i14 = i13;
                while (true) {
                    int i15 = i4 - 1;
                    dArr = this.f119872OooOo;
                    if (i14 < i15) {
                        System.arraycopy(dArr[i12], i10, dArr3, i13, 52);
                        i13 += 52;
                        i14++;
                        i12++;
                    }
                }
                System.arraycopy(dArr[i12], i11, dArr3, i13, i5);
                i10 += 52;
                i11 += i5;
                i7++;
                z = z2;
                c = '4';
                i2 = 0;
            }
            i6++;
            i2 = 0;
        }
        return dArr2;
    }

    public final int o000oOoO(int i) {
        if (i == this.f119876OooOoo0 - 1) {
            return this.f119873OooOoO - (i * 52);
        }
        return 52;
    }

    @Override // oO0OOooO.AbstractC33146OooO00o, oO0OOooO.InterfaceC33145OooO
    /* JADX INFO: renamed from: a */
    public final InterfaceC33145OooO mo80629a() {
        C33149OooO0Oo c33149OooO0Oo = new C33149OooO0Oo(this.f119874OooOoO0, this.f119873OooOoO);
        int i = 0;
        while (true) {
            double[][] dArr = c33149OooO0Oo.f119872OooOo;
            if (i >= dArr.length) {
                return c33149OooO0Oo;
            }
            double[] dArr2 = dArr[i];
            double[] dArr3 = this.f119872OooOo[i];
            for (int i2 = 0; i2 < dArr2.length; i2++) {
                dArr2[i2] = dArr3[i2] * 2.0d;
            }
            i++;
        }
    }

    public C33149OooO0Oo(int i, int i2, double[][] dArr) {
        super(i, i2);
        this.f119874OooOoO0 = i;
        this.f119873OooOoO = i2;
        this.f119875OooOoOO = (i + 51) / 52;
        this.f119876OooOoo0 = (i2 + 51) / 52;
        this.f119872OooOo = dArr;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f119875OooOoOO; i4++) {
            int iOoooOO0 = OoooOO0(i4);
            int i5 = 0;
            while (i5 < this.f119876OooOoo0) {
                if (dArr[i3].length != o000oOoO(i5) * iOoooOO0) {
                    throw new C24917OooO00o(EnumC31935OooO0Oo.DIMENSIONS_MISMATCH_SIMPLE, dArr[i3].length, o000oOoO(i5) * iOoooOO0);
                }
                i5++;
                i3++;
            }
        }
    }

    @Override // oO0OOooO.AbstractC33146OooO00o, oO0OOooO.InterfaceC33145OooO
    /* JADX INFO: renamed from: a */
    public final InterfaceC33145OooO mo80630a(int i) {
        C33152OooO0oO.OooO0O0(this, i);
        C33149OooO0Oo c33149OooO0Oo = new C33149OooO0Oo(this.f119874OooOoO0, 1);
        int i2 = i / 52;
        int i3 = i - (i2 * 52);
        int iO000oOoO = o000oOoO(i2);
        double[][] dArr = c33149OooO0Oo.f119872OooOo;
        double[] dArr2 = dArr[0];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < this.f119875OooOoOO; i6++) {
            int iOoooOO0 = OoooOO0(i6);
            double[] dArr3 = this.f119872OooOo[(this.f119876OooOoo0 * i6) + i2];
            int i7 = 0;
            while (i7 < iOoooOO0) {
                if (i4 >= dArr2.length) {
                    i5++;
                    dArr2 = dArr[i5];
                    i4 = 0;
                }
                dArr2[i4] = dArr3[(i7 * iO000oOoO) + i3];
                i7++;
                i4++;
            }
        }
        return c33149OooO0Oo;
    }

    @Override // oO0OOooO.InterfaceC33145OooO
    /* JADX INFO: renamed from: a */
    public final double mo80627a(int i, int i2) {
        C33152OooO0oO.OooO0Oo(this, i);
        C33152OooO0oO.OooO0O0(this, i2);
        int i3 = i / 52;
        int i4 = i2 / 52;
        return this.f119872OooOo[(i3 * this.f119876OooOoo0) + i4][(i2 - (i4 * 52)) + (o000oOoO(i4) * (i - (i3 * 52)))];
    }
}
