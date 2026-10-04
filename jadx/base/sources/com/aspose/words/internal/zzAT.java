package com.aspose.words.internal;

import com.aspose.slides.Oooo0;

/* JADX INFO: loaded from: classes5.dex */
final class zzAT {

    public static class zzZ {
        private int mLength;
        private int zzsh;
        private int zzsi;
        private int zzsj;

        private zzZ() {
        }

        public final int getLength() {
            return this.mLength;
        }

        public final void setLength(int i) {
            this.mLength = i;
        }

        public final int zzAO() {
            int i = this.mLength;
            if (i != 0) {
                return this.zzsh / i;
            }
            return 0;
        }

        public final int zzAP() {
            return this.zzsi;
        }

        public final int zzAQ() {
            return this.zzsj;
        }

        public final void zzVh(int i) {
            this.zzsh = i;
        }

        public final void zzVi(int i) {
            this.zzsi = i;
        }

        public final void zzVj(int i) {
            this.zzsj = i;
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    private static int zzVk(int i) {
        return (zzXU.zz6(i - 1) + 2) / 3;
    }

    private static int zzY(zzAS zzas, int i, int i2) {
        int i3 = i - 1;
        int iZzX = 0;
        for (int i4 = (i2 - 1) * 3; i4 >= 0; i4 -= 3) {
            iZzX += zzas.zzAY().zzX((i3 >> i4) & 7);
        }
        return iZzX;
    }

    private static byte[] zzZ(byte[] bArr, boolean z) throws Exception {
        zzZOR zzzor = new zzZOR();
        zzXV zzxv = new zzXV(zzzor, true);
        try {
            zzxv.zzD(z);
            zzxv.zzO(bArr.length, 24);
            zzAS zzas = new zzAS(bArr, zzxv);
            int length = zzas.zzAZ().length;
            while (length < zzas.zzAR()) {
                int i = length + 1;
                zzZ zzzZzY = zzY(zzas, length);
                if (zzzZzY.getLength() > 0) {
                    int iZzVk = zzVk(zzzZzY.zzAQ());
                    zzZ(zzas, zzzZzY.getLength(), zzzZzY.zzAQ(), iZzVk);
                    zzZ(zzas, zzzZzY.zzAQ(), iZzVk);
                    length = i;
                    int i2 = 1;
                    while (i2 < zzzZzY.getLength()) {
                        zzas.zzVg(length);
                        i2++;
                        length++;
                    }
                } else {
                    byte bZzVf = zzas.zzVf(length);
                    if (length >= 2 && bZzVf == zzas.zzVf(length - 2)) {
                        zzas.zzAW().zzY(zzas.zzAV());
                    } else if (length >= 4 && bZzVf == zzas.zzVf(length - 4)) {
                        zzas.zzAW().zzY(zzas.zzAU());
                    } else if (length < 6 || bZzVf != zzas.zzVf(length - 6)) {
                        zzas.zzAW().zzY(bZzVf & 255);
                    } else {
                        zzas.zzAW().zzY(zzas.zzAT());
                    }
                    length = i;
                }
            }
            zzxv.flush();
            byte[] bArrZzWy = zzzor.zzWy();
            zzxv.dispose();
            return bArrZzWy;
        } catch (Throwable th) {
            zzxv.dispose();
            throw th;
        }
    }

    public static byte[] zzZp(byte[] bArr) throws Exception {
        if (bArr == null || bArr.length == 0) {
            return new byte[4];
        }
        if ((((long) bArr.length) & 4278190080L) != 0) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: data");
        }
        byte[] bArrEncode = zzZZB.encode(bArr);
        boolean z = bArrEncode.length < (bArr.length * 3) / 4;
        if (z) {
            bArr = bArrEncode;
        }
        return zzZ(bArr, z);
    }

    private static zzZ zzY(zzAS zzas, int i) {
        zzZ zzZ2 = zzZ(zzas, i);
        int i2 = i + 1;
        zzas.zzVg(i);
        if (zzZ2.zzAP() > 0) {
            zzZ zzZ3 = zzZ(zzas, i2);
            int iZzX = zzas.zzAW().zzX(zzas.zzVf(i) & 255);
            if (zzZ3.zzAP() >= zzZ2.zzAP() && zzZ2.zzAO() > ((zzZ3.zzAO() * zzZ3.getLength()) + iZzX) / (zzZ3.getLength() + 1)) {
                zzZ2.setLength(0);
            } else if (zzZ2.getLength() > 3) {
                zzZ zzZ4 = zzZ(zzas, zzZ2.getLength() + i);
                if (zzZ4.getLength() >= 2) {
                    zzZ zzZ5 = zzZ(zzas, (zzZ2.getLength() + i) - 1);
                    if (zzZ5.getLength() > zzZ4.getLength() && zzZ5.zzAO() < zzZ4.zzAO()) {
                        int iZzVk = zzVk(zzZ2.zzAQ() + 1);
                        if (((zzZ4.zzAO() * zzZ4.getLength()) + (zzZ2.zzAO() * zzZ2.getLength())) / (zzZ2.getLength() + zzZ4.getLength()) > ((zzZ5.zzAO() * zzZ5.getLength()) + (zzY(zzas, zzZ2.getLength() - 1, zzZ2.zzAQ() + 1, iZzVk) + zzY(zzas, zzZ2.zzAQ() + 1, iZzVk))) / ((zzZ2.getLength() - 1) + zzZ5.getLength())) {
                            zzZ2.setLength(zzZ2.getLength() - 1);
                            zzZ2.zzVj(zzZ2.zzAQ() + 1);
                        }
                    }
                }
            }
            if (zzZ2.getLength() == 2) {
                if (i >= 2 && zzas.zzVf(i) == zzas.zzVf(i - 2)) {
                    if (zzZ2.zzAO() * 2 > zzas.zzAW().zzX(zzas.zzAV()) + zzas.zzAW().zzX(zzas.zzVf(i2) & 255)) {
                        zzZ2.setLength(0);
                        return zzZ2;
                    }
                } else if (i > 0 && i2 < zzas.zzAR() && zzas.zzVf(i2) == zzas.zzVf(i - 1)) {
                    if (zzZ2.zzAO() * 2 > iZzX + zzas.zzAW().zzX(zzas.zzAV())) {
                        zzZ2.setLength(0);
                    }
                }
            }
        }
        return zzZ2;
    }

    private static void zzZ(zzAS zzas, int i, int i2) throws Exception {
        int i3 = i - 1;
        for (int i4 = (i2 - 1) * 3; i4 >= 0; i4 -= 3) {
            zzas.zzAY().zzY((i3 >> i4) & 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static zzZ zzZ(zzAS zzas, int i) {
        int iOooO00o;
        int iZzY;
        int iZzY2;
        int[] iArr = new int[33];
        int i2 = 0;
        zzZ zzz = new zzZ(0 == true ? 1 : 0);
        int iZzAR = zzas.zzAR() - i;
        int i3 = 1;
        if (iZzAR > 1) {
            int iZzVe = zzas.zzVe(i);
            zzIN zzin = null;
            zzIN zzin2 = zzas.zzAN().get(iZzVe);
            int i4 = 0;
            while (zzin2 != null) {
                int index = zzin2.getIndex();
                int i5 = i - index;
                i2 += i3;
                if (i2 <= 16 && i5 <= Integer.MAX_VALUE) {
                    zzIN zzinZzGt = zzin2.zzGt();
                    int iMin = Math.min(iZzAR, i5);
                    if (iMin >= 2) {
                        int iZzL = zzas.zzL(index + 2, i + 2, iMin - 2);
                        int i6 = iZzL + 2;
                        int i7 = (i5 - i6) + i3;
                        if (i7 <= zzas.zzAS() && ((i6 != 2 || i7 < 512) && (i6 > zzz.getLength() || i7 <= zzz.zzAQ() || (i6 > zzz.getLength() - 2 && (i7 <= (zzz.zzAQ() << 3) || (i6 >= zzz.getLength() && i7 <= (zzz.zzAQ() << 4))))))) {
                            if (i6 > i4) {
                                int i8 = i6 > 32 ? 32 : i6;
                                while (i4 < i8) {
                                    int i9 = i4 + 1;
                                    iArr[i9] = iArr[i4] + zzas.zzAW().zzX(zzas.zzVf(i + i4) & 255);
                                    i4 = i9;
                                }
                                if (i6 > 32) {
                                    int i10 = iArr[32];
                                    iOooO00o = Oooo0.OooO00o(iZzL, -30, i10 / 32, i10);
                                } else {
                                    iOooO00o = iArr[i6];
                                }
                                i4 = i8;
                            } else {
                                iOooO00o = iArr[i6];
                            }
                            if (iOooO00o > zzz.zzAP()) {
                                int iZzVk = zzVk(i7);
                                int iZzY3 = zzY(zzas, i6, i7, iZzVk);
                                if ((iOooO00o - iZzY3) - (iZzVk << 16) > zzz.zzAP() && (iZzY2 = iOooO00o - (iZzY = iZzY3 + zzY(zzas, i7, iZzVk))) > zzz.zzAP()) {
                                    zzz.zzVi(iZzY2);
                                    zzz.setLength(i6);
                                    zzz.zzVj(i7);
                                    zzz.zzVh(iZzY);
                                }
                            }
                        }
                    }
                    zzin = zzin2;
                    zzin2 = zzinZzGt;
                    i3 = 1;
                } else {
                    zzas.zzZ(iZzVe, zzin, zzin2);
                    break;
                }
            }
        }
        return zzz;
    }

    private static int zzY(zzAS zzas, int i, int i2, int i3) {
        int i4 = i - (i2 >= 512 ? 3 : 2);
        int iZz6 = zzXU.zz6(i4);
        int i5 = 2;
        while (i5 < iZz6) {
            i5 += 2;
        }
        int i6 = 1 << (i5 - 1);
        int i7 = iZz6 > 2 ? 2 : 0;
        if ((i4 & i6) != 0) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        if (((i6 >> 1) & i4) != 0) {
            i8 |= 1;
        }
        int i9 = i6 >> 2;
        int iZzX = zzas.zzAW().zzX(androidx.core.graphics.OooO0OO.OooO00o(i3, 1, 8, i8 + 256));
        int i10 = iZz6 - 2;
        while (i10 > 0) {
            int i11 = i10 > 2 ? 2 : 0;
            if ((i4 & i9) != 0) {
                i11 |= 1;
            }
            int i12 = i11 << 1;
            if (((i9 >> 1) & i4) != 0) {
                i12 |= 1;
            }
            i9 >>= 2;
            i10 -= 2;
            iZzX += zzas.zzAX().zzX(i12);
        }
        return iZzX;
    }

    private static void zzZ(zzAS zzas, int i, int i2, int i3) throws Exception {
        int i4 = i - (i2 >= 512 ? 3 : 2);
        int iZz6 = zzXU.zz6(i4);
        int i5 = 2;
        while (i5 < iZz6) {
            i5 += 2;
        }
        int i6 = 1 << (i5 - 1);
        int i7 = iZz6 > 2 ? 2 : 0;
        if ((i4 & i6) != 0) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        if (((i6 >> 1) & i4) != 0) {
            i8 |= 1;
        }
        int i9 = i6 >> 2;
        zzas.zzAW().zzY(androidx.core.graphics.OooO0OO.OooO00o(i3, 1, 8, i8 + 256));
        int i10 = iZz6 - 2;
        while (i10 > 0) {
            int i11 = i10 > 2 ? 2 : 0;
            if ((i4 & i9) != 0) {
                i11 |= 1;
            }
            int i12 = i11 << 1;
            if (((i9 >> 1) & i4) != 0) {
                i12 |= 1;
            }
            i9 >>= 2;
            i10 -= 2;
            zzas.zzAX().zzY(i12);
        }
    }
}
