package oO0OOooO;

import oO0OoOoO.C33290OooO00o;
import oO0OoOoO.C33291OooO0O0;

/* JADX INFO: renamed from: oO0OOooO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33151OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final double[][] f119877OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final double[] f119878OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public AbstractC33146OooO00o f119879OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public AbstractC33146OooO00o f119880OooO0Oo;

    public C33151OooO0o0(InterfaceC33145OooO interfaceC33145OooO) {
        int i;
        double[] dArr;
        double dSqrt;
        int i2 = 1;
        if (!interfaceC33145OooO.mo80631b()) {
            throw new C33153OooO0oo(interfaceC33145OooO.mo80632c(), interfaceC33145OooO.mo80628a());
        }
        int iMo80632c = interfaceC33145OooO.mo80632c();
        double[][] dArrMo80634e = interfaceC33145OooO.mo80634e();
        this.f119877OooO00o = dArrMo80634e;
        this.f119878OooO0O0 = new double[iMo80632c];
        this.f119879OooO0OO = null;
        this.f119880OooO0Oo = null;
        int length = dArrMo80634e.length;
        int i3 = length - 1;
        int i4 = 1;
        while (i4 <= length - 2) {
            double dOooO00o = 0.0d;
            for (int i5 = i4; i5 <= i3; i5 += i2) {
                dOooO00o += C33290OooO00o.OooO00o(dArrMo80634e[i5][i4 - 1]);
            }
            if (C33291OooO0O0.OooO00o(dOooO00o)) {
                i = i2;
            } else {
                int i6 = i3;
                double d = 0.0d;
                while (true) {
                    dArr = this.f119878OooO0O0;
                    if (i6 < i4) {
                        break;
                    }
                    double d2 = dArrMo80634e[i6][i4 - 1] / dOooO00o;
                    dArr[i6] = d2;
                    d += d2 * d2;
                    i6--;
                }
                if (dArr[i4] > 0.0d) {
                    int i7 = C33290OooO00o.f120515OooO00o;
                    dSqrt = -Math.sqrt(d);
                } else {
                    int i8 = C33290OooO00o.f120515OooO00o;
                    dSqrt = Math.sqrt(d);
                }
                double d3 = dArr[i4];
                double d4 = d - (d3 * dSqrt);
                dArr[i4] = d3 - dSqrt;
                int i9 = i4;
                while (true) {
                    i = i2;
                    if (i9 >= length) {
                        break;
                    }
                    double d5 = 0.0d;
                    for (int i10 = i3; i10 >= i4; i10--) {
                        d5 = (dArr[i10] * dArrMo80634e[i10][i9]) + d5;
                    }
                    double d6 = d5 / d4;
                    for (int i11 = i4; i11 <= i3; i11++) {
                        double[] dArr2 = dArrMo80634e[i11];
                        dArr2[i9] = dArr2[i9] - (dArr[i11] * d6);
                    }
                    i9++;
                    i2 = i;
                }
                for (int i12 = 0; i12 <= i3; i12++) {
                    double d7 = 0.0d;
                    for (int i13 = i3; i13 >= i4; i13--) {
                        d7 = (dArr[i13] * dArrMo80634e[i12][i13]) + d7;
                    }
                    double d8 = d7 / d4;
                    for (int i14 = i4; i14 <= i3; i14++) {
                        double[] dArr3 = dArrMo80634e[i12];
                        dArr3[i14] = dArr3[i14] - (dArr[i14] * d8);
                    }
                }
                dArr[i4] = dArr[i4] * dOooO00o;
                dArrMo80634e[i4][i4 - 1] = dOooO00o * dSqrt;
            }
            i4++;
            i2 = i;
        }
    }
}
