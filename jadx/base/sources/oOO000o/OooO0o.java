package oOO000o;

import o0Oo0o00.o0OOO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f123242OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34329OooO0o0 f123243OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C34329OooO0o0[] f123244OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C34329OooO0o0[] f123245OooO0Oo;

    public OooO0o(OooO0O0 oooO0O0, C34329OooO0o0 c34329OooO0o0) {
        int i;
        OooO0O0 oooO0O02;
        OooO0O0 oooO0O03;
        int iOooO0Oo;
        int i2;
        int[] iArr;
        this.f123242OooO00o = oooO0O0;
        this.f123243OooO0O0 = c34329OooO0o0;
        int[] iArr2 = c34329OooO0o0.f123248OooO0OO;
        int i3 = 1;
        int length = iArr2.length - 1;
        int i4 = -1;
        length = iArr2[length] == 0 ? -1 : length;
        this.f123244OooO0OO = new C34329OooO0o0[length];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = length >> 1;
            oooO0O02 = this.f123242OooO00o;
            if (i6 >= i) {
                break;
            }
            int i7 = i6 << 1;
            int[] iArr3 = new int[i7 + 1];
            iArr3[i7] = 1;
            this.f123244OooO0OO[i6] = new C34329OooO0o0(oooO0O02, iArr3);
            i6++;
        }
        while (i < length) {
            int i8 = i << 1;
            int[] iArr4 = new int[i8 + 1];
            iArr4[i8] = i3;
            C34329OooO0o0 c34329OooO0o02 = new C34329OooO0o0(oooO0O02, iArr4);
            C34329OooO0o0[] c34329OooO0o0Arr = this.f123244OooO0OO;
            int[] iArr5 = c34329OooO0o02.f123248OooO0OO;
            int[] iArr6 = c34329OooO0o0.f123248OooO0OO;
            int iOooO0O0 = C34329OooO0o0.OooO0O0(iArr6);
            if (iOooO0O0 == i4) {
                throw new ArithmeticException("Division by zero");
            }
            int length2 = iArr5.length;
            int[] iArrOooO00o = new int[length2];
            int iOooO0O02 = C34329OooO0o0.OooO0O0(iArr6);
            int iOooO00o = oooO0O02.OooO00o(iOooO0O02 == i4 ? i5 : iArr6[iOooO0O02]);
            System.arraycopy(iArr5, i5, iArrOooO00o, i5, length2);
            while (iOooO0O0 <= C34329OooO0o0.OooO0O0(iArrOooO00o)) {
                int iOooO0O03 = C34329OooO0o0.OooO0O0(iArrOooO00o);
                int iOooO0OO = o0OOO0o.OooO0OO(iOooO0O03 == i4 ? i5 : iArrOooO00o[iOooO0O03], iOooO00o, oooO0O02.f123239OooO0O0);
                int iOooO0O04 = C34329OooO0o0.OooO0O0(iArrOooO00o) - iOooO0O0;
                int iOooO0O05 = C34329OooO0o0.OooO0O0(iArr6);
                if (iOooO0O05 == i4) {
                    iArr = new int[i3];
                    i2 = i3;
                } else {
                    i2 = i3;
                    int[] iArr7 = new int[iOooO0O05 + iOooO0O04 + 1];
                    System.arraycopy(iArr6, 0, iArr7, iOooO0O04, iOooO0O05 + 1);
                    iArr = iArr7;
                }
                iArrOooO00o = c34329OooO0o02.OooO00o(c34329OooO0o02.OooO0o(iArr, iOooO0OO), iArrOooO00o);
                i3 = i2;
                i5 = 0;
                i4 = -1;
            }
            c34329OooO0o0Arr[i] = new C34329OooO0o0(oooO0O02, iArrOooO00o);
            i++;
            i3 = i3;
            i5 = 0;
            i4 = -1;
        }
        int i9 = i3;
        int[] iArr8 = this.f123243OooO0O0.f123248OooO0OO;
        int length3 = iArr8.length - 1;
        int i10 = iArr8[length3] == 0 ? -1 : length3;
        C34329OooO0o0[] c34329OooO0o0Arr2 = new C34329OooO0o0[i10];
        int i11 = i10 - 1;
        for (int i12 = i11; i12 >= 0; i12--) {
            C34329OooO0o0 c34329OooO0o03 = this.f123244OooO0OO[i12];
            C34329OooO0o0 c34329OooO0o04 = new C34329OooO0o0();
            c34329OooO0o04.f123246OooO00o = c34329OooO0o03.f123246OooO00o;
            c34329OooO0o04.f123247OooO0O0 = c34329OooO0o03.f123247OooO0O0;
            int[] iArr9 = c34329OooO0o03.f123248OooO0OO;
            int[] iArr10 = new int[iArr9.length];
            System.arraycopy(iArr9, 0, iArr10, 0, iArr9.length);
            c34329OooO0o04.f123248OooO0OO = iArr10;
            c34329OooO0o0Arr2[i12] = c34329OooO0o04;
        }
        this.f123245OooO0Oo = new C34329OooO0o0[i10];
        while (true) {
            oooO0O03 = this.f123242OooO00o;
            if (i11 < 0) {
                break;
            }
            C34329OooO0o0[] c34329OooO0o0Arr3 = this.f123245OooO0Oo;
            C34329OooO0o0 c34329OooO0o05 = new C34329OooO0o0();
            c34329OooO0o05.f123246OooO00o = oooO0O03;
            c34329OooO0o05.f123247OooO0O0 = i11;
            int[] iArr11 = new int[i11 + 1];
            c34329OooO0o05.f123248OooO0OO = iArr11;
            iArr11[i11] = i9;
            c34329OooO0o0Arr3[i11] = c34329OooO0o05;
            i11--;
        }
        for (int i13 = 0; i13 < i10; i13++) {
            if (c34329OooO0o0Arr2[i13].OooO0Oo(i13) == 0) {
                int i14 = i13 + 1;
                int i15 = 0;
                while (i14 < i10) {
                    if (c34329OooO0o0Arr2[i14].OooO0Oo(i13) != 0) {
                        C34329OooO0o0 c34329OooO0o06 = c34329OooO0o0Arr2[i13];
                        c34329OooO0o0Arr2[i13] = c34329OooO0o0Arr2[i14];
                        c34329OooO0o0Arr2[i14] = c34329OooO0o06;
                        C34329OooO0o0[] c34329OooO0o0Arr4 = this.f123245OooO0Oo;
                        C34329OooO0o0 c34329OooO0o07 = c34329OooO0o0Arr4[i13];
                        c34329OooO0o0Arr4[i13] = c34329OooO0o0Arr4[i14];
                        c34329OooO0o0Arr4[i14] = c34329OooO0o07;
                        i14 = i10;
                        i15 = i9;
                    }
                    i14++;
                }
                if (i15 == 0) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int iOooO00o2 = oooO0O03.OooO00o(c34329OooO0o0Arr2[i13].OooO0Oo(i13));
            C34329OooO0o0 c34329OooO0o08 = c34329OooO0o0Arr2[i13];
            if (!c34329OooO0o08.f123246OooO00o.OooO0O0(iOooO00o2)) {
                throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
            }
            c34329OooO0o08.f123248OooO0OO = c34329OooO0o08.OooO0o(c34329OooO0o08.f123248OooO0OO, iOooO00o2);
            c34329OooO0o08.OooO0OO();
            C34329OooO0o0 c34329OooO0o09 = this.f123245OooO0Oo[i13];
            if (!c34329OooO0o09.f123246OooO00o.OooO0O0(iOooO00o2)) {
                throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
            }
            c34329OooO0o09.f123248OooO0OO = c34329OooO0o09.OooO0o(c34329OooO0o09.f123248OooO0OO, iOooO00o2);
            c34329OooO0o09.OooO0OO();
            for (int i16 = 0; i16 < i10; i16++) {
                if (i16 != i13 && (iOooO0Oo = c34329OooO0o0Arr2[i16].OooO0Oo(i13)) != 0) {
                    C34329OooO0o0 c34329OooO0o010 = c34329OooO0o0Arr2[i13];
                    OooO0O0 oooO0O04 = c34329OooO0o010.f123246OooO00o;
                    if (!oooO0O04.OooO0O0(iOooO0Oo)) {
                        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
                    }
                    C34329OooO0o0 c34329OooO0o011 = new C34329OooO0o0(oooO0O04, c34329OooO0o010.OooO0o(c34329OooO0o010.f123248OooO0OO, iOooO0Oo));
                    C34329OooO0o0 c34329OooO0o012 = this.f123245OooO0Oo[i13];
                    OooO0O0 oooO0O05 = c34329OooO0o012.f123246OooO00o;
                    if (!oooO0O05.OooO0O0(iOooO0Oo)) {
                        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
                    }
                    C34329OooO0o0 c34329OooO0o013 = new C34329OooO0o0(oooO0O05, c34329OooO0o012.OooO0o(c34329OooO0o012.f123248OooO0OO, iOooO0Oo));
                    C34329OooO0o0 c34329OooO0o014 = c34329OooO0o0Arr2[i16];
                    c34329OooO0o014.f123248OooO0OO = c34329OooO0o014.OooO00o(c34329OooO0o014.f123248OooO0OO, c34329OooO0o011.f123248OooO0OO);
                    c34329OooO0o014.OooO0OO();
                    C34329OooO0o0 c34329OooO0o015 = this.f123245OooO0Oo[i16];
                    c34329OooO0o015.f123248OooO0OO = c34329OooO0o015.OooO00o(c34329OooO0o015.f123248OooO0OO, c34329OooO0o013.f123248OooO0OO);
                    c34329OooO0o015.OooO0OO();
                }
            }
        }
    }
}
