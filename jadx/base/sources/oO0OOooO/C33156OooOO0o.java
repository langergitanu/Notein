package oO0OOooO;

import java.util.Arrays;
import oO0OoOoO.C33290OooO00o;

/* JADX INFO: renamed from: oO0OOooO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33156OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final double[][] f119887OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final double[] f119888OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final double[] f119889OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public InterfaceC33145OooO f119890OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public AbstractC33146OooO00o f119891OooO0o0;

    public C33156OooOO0o(InterfaceC33145OooO interfaceC33145OooO) {
        double dSqrt;
        if (!interfaceC33145OooO.mo80631b()) {
            throw new C33153OooO0oo(interfaceC33145OooO.mo80632c(), interfaceC33145OooO.mo80628a());
        }
        int iMo80632c = interfaceC33145OooO.mo80632c();
        double[][] dArrMo80634e = interfaceC33145OooO.mo80634e();
        this.f119887OooO00o = dArrMo80634e;
        this.f119888OooO0O0 = new double[iMo80632c];
        this.f119889OooO0OO = new double[iMo80632c - 1];
        this.f119890OooO0Oo = null;
        this.f119891OooO0o0 = null;
        int length = dArrMo80634e.length;
        double[] dArr = new double[length];
        int i = 0;
        while (true) {
            int i2 = length - 1;
            double[] dArr2 = this.f119888OooO0O0;
            if (i >= i2) {
                dArr2[i2] = dArrMo80634e[i2][i2];
                return;
            }
            double[] dArr3 = dArrMo80634e[i];
            dArr2[i] = dArr3[i];
            int i3 = i + 1;
            double d = 0.0d;
            for (int i4 = i3; i4 < length; i4++) {
                double d2 = dArr3[i4];
                d += d2 * d2;
            }
            if (dArr3[i3] > 0.0d) {
                int i5 = C33290OooO00o.f120515OooO00o;
                dSqrt = -Math.sqrt(d);
            } else {
                int i6 = C33290OooO00o.f120515OooO00o;
                dSqrt = Math.sqrt(d);
            }
            this.f119889OooO0OO[i] = dSqrt;
            if (dSqrt != 0.0d) {
                double d3 = dArr3[i3] - dSqrt;
                dArr3[i3] = d3;
                double d4 = (-1.0d) / (dSqrt * d3);
                Arrays.fill(dArr, i3, length, 0.0d);
                int i7 = i3;
                while (i7 < length) {
                    double[] dArr4 = dArrMo80634e[i7];
                    double d5 = dArr3[i7];
                    double d6 = dArr4[i7] * d5;
                    int i8 = i7 + 1;
                    for (int i9 = i8; i9 < length; i9++) {
                        double d7 = dArr4[i9];
                        d6 = (dArr3[i9] * d7) + d6;
                        dArr[i9] = (d7 * d5) + dArr[i9];
                    }
                    dArr[i7] = (dArr[i7] + d6) * d4;
                    i7 = i8;
                }
                double d8 = 0.0d;
                for (int i10 = i3; i10 < length; i10++) {
                    d8 += dArr[i10] * dArr3[i10];
                }
                double d9 = (d4 / 2.0d) * d8;
                for (int i11 = i3; i11 < length; i11++) {
                    dArr[i11] = dArr[i11] - (dArr3[i11] * d9);
                }
                for (int i12 = i3; i12 < length; i12++) {
                    double[] dArr5 = dArrMo80634e[i12];
                    for (int i13 = i12; i13 < length; i13++) {
                        dArr5[i13] = dArr5[i13] - ((dArr[i12] * dArr3[i13]) + (dArr3[i12] * dArr[i13]));
                    }
                }
            }
            i = i3;
        }
    }
}
