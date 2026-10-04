package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY6R {
    private boolean zzX60;
    private int zzX61;
    private int zzX62;
    private ArrayList<com.aspose.words.internal.zzDB> zzX63;
    private com.aspose.words.internal.zzDB zzX64;
    private ArrayList<zzY6V> zzX65;
    private ArrayList<int[]> zzX66;
    private ArrayList<Integer> zzX67;
    private boolean zzX68;
    private com.aspose.words.internal.zzDB zzX69;
    private int zzY6A;
    private boolean zzY6B;
    private ArrayList<zzYI8> zzZEU;

    public zzY6R(com.aspose.words.internal.zzDB zzdb, ArrayList<zzYI8> arrayList, int i, boolean z, boolean z2) {
        this.zzY6B = z;
        this.zzY6A = i;
        zzdb = zzdb == null ? new com.aspose.words.internal.zzDB() : zzdb;
        this.zzX69 = zzdb;
        zzT(zzdb);
        this.zzZEU = arrayList;
        this.zzX67 = new ArrayList<>();
        this.zzX66 = new ArrayList<>();
        this.zzX65 = new ArrayList<>();
        this.zzX64 = new com.aspose.words.internal.zzDB();
        this.zzX63 = new ArrayList<>();
        this.zzX61 = -1;
        this.zzX60 = z2;
        zzXZa();
    }

    private static com.aspose.words.internal.zzDB zz0(int[] iArr) {
        if (iArr == null || iArr.length < 2) {
            return null;
        }
        int i = 1;
        com.aspose.words.internal.zzDB zzdb = new com.aspose.words.internal.zzDB(iArr.length - 1);
        int i2 = 0;
        while (i < iArr.length) {
            int i3 = iArr[i];
            zzdb.add(i3 - i2);
            i++;
            i2 = i3;
        }
        return zzdb;
    }

    private static int[] zzL(com.aspose.words.internal.zzZYV<Object> zzzyv) {
        int[] iArr = new int[zzzyv.getCount()];
        for (int i = 0; i < zzzyv.getCount(); i++) {
            iArr[i] = zzzyv.zzT3(i);
        }
        return iArr;
    }

    private boolean zzPI(boolean z) {
        boolean z2 = !z;
        zzXYW().getCount();
        int count = zzXYW().getCount();
        int i = 0;
        int width = 0;
        while (i < zzXYW().getCount()) {
            zzY6T zzy6tZzkf = zzXYW().zzkf(i);
            if (zzy6tZzkf.zzW(z2, z, zzYKt())) {
                width += z ? zzy6tZzkf.getWidth() : zzy6tZzkf.zzXZh();
                zzk7(i);
                if (zzXYX() != null && i < zzXYX().getCount()) {
                    int i2 = zzXYX().get(i);
                    zzXYX().removeAt(i);
                    if (i < zzXYX().getCount()) {
                        zzXYX().set(i, zzXYX().get(i) + i2);
                    }
                }
                if (!this.zzX60) {
                }
            }
            i++;
        }
        return zzXYW().zzYKv() ? width > 0 : zzXYW().getCount() < count;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[PHI: r5
      0x0051: PHI (r5v4 com.aspose.words.zzY6T) = (r5v1 com.aspose.words.zzY6T), (r5v6 com.aspose.words.zzY6T) binds: [B:17:0x0069, B:13:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[PHI: r5
      0x0053: PHI (r5v2 com.aspose.words.zzY6T) = 
      (r5v1 com.aspose.words.zzY6T)
      (r5v6 com.aspose.words.zzY6T)
      (r5v6 com.aspose.words.zzY6T)
      (r5v6 com.aspose.words.zzY6T)
     binds: [B:17:0x0069, B:9:0x0037, B:11:0x0041, B:13:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzPJ(boolean z) {
        zzY6T zzy6tZzkf;
        boolean z2;
        int iZz5q;
        zzWJ zzwjZzYjv;
        boolean z3 = zzXYW().zzkd(zzXYW().getCount()) > 0;
        int count = zzXYW().getCount() - 1;
        if (z) {
            zzy6tZzkf = zzXYW().zzkf(0);
            z2 = (this.zzX67.get(0).intValue() == 1 || zzXYW().getCount() <= 1 || this.zzX67.get(1).intValue() == 1) ? false : true;
        } else {
            zzy6tZzkf = zzXYW().zzkf(count);
            if (this.zzX67.get(count).intValue() == 2) {
            }
        }
        int i = this.zzX62;
        int i2 = 0;
        while (i < zzXYU()) {
            zzYI8 zzyi8 = this.zzZEU.get(i);
            if (z) {
                zzwjZzYjv = zzyi8.zzYjv();
                iZz5q = zzyi8.zzYjv().zz5q() - 1;
            } else {
                zzWJ zzwjZzYju = zzyi8.zzYju();
                int iZzYjt = zzyi8.zzYjt();
                zzwjZzYju.zzOu(zzXYW().getCount() - zzyi8.zzYjt());
                iZz5q = count;
                zzwjZzYjv = zzwjZzYju;
                i2 = iZzYjt;
            }
            if (zzwjZzYjv.zz5q() != 0) {
                zzwjZzYjv.getPreferredWidth().zzYmB();
                if (z3) {
                    this.zzX68 = true;
                    return;
                }
                int iZzVg = zzwjZzYjv.getPreferredWidth().zzYmE() == 0 ? zzVg(i2, zzwjZzYjv.zz5q()) : 0;
                int iZz57 = zzwjZzYjv.zz57();
                if (zzwjZzYjv.zz5q() != 1) {
                    zzXYW().zzkf(iZz5q);
                    if (z && iZz57 == 0) {
                        zzwjZzYjv.setPreferredWidth(PreferredWidth.AUTO);
                    } else {
                        if (iZz57 == 0) {
                            zzwjZzYjv.setPreferredWidth(PreferredWidth.zzpK(iZzVg));
                        }
                        zzZ(iZz5q, zzwjZzYjv);
                    }
                } else if (z2) {
                    if (iZz57 != 0) {
                        iZzVg = iZz57;
                    } else if (z) {
                        iZzVg = 5;
                    } else {
                        zzwjZzYjv.setPreferredWidth(PreferredWidth.zzpK(iZzVg));
                    }
                    if (iZzVg > zzy6tZzkf.zzXZo()) {
                        zzy6tZzkf.zzka(iZzVg);
                        this.zzX66.get(iZz5q)[0] = iZzVg;
                        this.zzX67.set(i2, 2);
                        zzy6tZzkf.zzXZk().add(2);
                    }
                } else {
                    zzwjZzYjv.setPreferredWidth(PreferredWidth.AUTO);
                }
            }
            i++;
            count = iZz5q;
        }
    }

    public static void zzT(com.aspose.words.internal.zzDB zzdb) {
        if (zzdb == null) {
            return;
        }
        for (int i = 0; i < zzdb.getCount(); i++) {
            if (zzdb.get(i) <= 0) {
                zzdb.removeRange(i, zzdb.getCount() - i);
                return;
            }
        }
    }

    private int zzVg(int i, int i2) {
        int i3;
        int i4 = 0;
        if (zzXYX() != null) {
            int i5 = 0;
            while (i < zzXYX().getCount() && i4 < i2) {
                i5 += zzXYX().get(i);
                i4++;
                i++;
            }
            i3 = i4;
            i4 = i5;
        } else {
            i3 = 0;
        }
        return androidx.core.graphics.OooO0OO.OooO00o(i2, i3, StyleIdentifier.LIST_TABLE_4_ACCENT_5, i4);
    }

    private int zzX(zzWJ zzwj, int i, int i2) {
        int iMin;
        int i3;
        int iZzOg;
        if (!zzwj.getPreferredWidth().zzYmB() && i2 <= 0) {
            return 0;
        }
        if (zzwj.getPreferredWidth().zzYmB()) {
            i3 = 0;
            iZzOg = 0;
            for (int i4 = 0; i4 < zzwj.zz5q(); i4++) {
                int i5 = i + i4;
                zzY6T zzy6tZzkf = zzXYW().zzkf(i5);
                if (!zzy6tZzkf.zzXZl()) {
                    zzy6tZzkf.zzk9(0);
                }
                if (zzy6tZzkf.zzXZm() <= 0) {
                    iZzOg += zzXYW().zzOg(i5);
                    i3++;
                }
            }
            iMin = Math.min(5000, zzwj.getPreferredWidth().zzYmE()) - i2;
        } else {
            iMin = 0;
            i3 = 0;
            iZzOg = 0;
        }
        if (iMin <= 0 || i3 <= 0) {
            return Math.min(5000, i2);
        }
        int i6 = iMin / i3;
        int i7 = 0;
        for (int i8 = 0; i8 < zzwj.zz5q(); i8++) {
            int i9 = i + i8;
            zzY6T zzy6tZzkf2 = zzXYW().zzkf(i9);
            int iZzXZm = zzy6tZzkf2.zzXZm();
            int iZzOg2 = zzXYW().zzOg(i9);
            if (iZzXZm <= 0) {
                iZzXZm = iZzOg > 0 ? (iZzOg2 * iMin) / iZzOg : i6;
            }
            if (iZzXZm > zzy6tZzkf2.zzXZm()) {
                zzy6tZzkf2.zzk9(iZzXZm);
            }
            i7 += iZzXZm;
        }
        return i7;
    }

    private int zzXYU() {
        return this.zzX64.get(this.zzX61);
    }

    private com.aspose.words.internal.zzDB zzXYX() {
        return this.zzX63.get(this.zzX61);
    }

    private int[] zzXYY() {
        int iZz5q;
        int iIndexOfKey;
        if (this.zzX65.size() != this.zzX64.getCount() || this.zzX65.size() == 0) {
            return null;
        }
        com.aspose.words.internal.zzZYV zzzyv = new com.aspose.words.internal.zzZYV(Math.max(64, this.zzX65.get(0).getCount()) * this.zzX65.size());
        zzzyv.add(0, null);
        int[][] iArr = new int[this.zzX65.size()][];
        for (int i = 0; i < this.zzX65.size(); i++) {
            zzY6V zzy6v = this.zzX65.get(i);
            int[] iArr2 = new int[zzy6v.getCount() + 1];
            iArr2[0] = 0;
            iArr[i] = iArr2;
            int i2 = 0;
            int width = 0;
            while (i2 < zzy6v.getCount()) {
                width += zzy6v.zzkf(i2).getWidth();
                if (!zzzyv.zzVE(width)) {
                    zzzyv.set(width, null);
                }
                i2++;
                iArr2[i2] = width;
            }
        }
        if (this.zzX65.size() == 1) {
            return iArr[0];
        }
        int count = zzzyv.getCount() - 1;
        int i3 = this.zzX64.get(0);
        int[] iArr3 = iArr[0];
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzZEU.size(); i5++) {
            zzYI8 zzyi8 = this.zzZEU.get(i5);
            if (i5 == i3) {
                i4++;
                iArr3 = iArr[i4];
                i3 = this.zzX64.get(i4);
            }
            if (zzyi8.zzYjv().zz5q() > 0) {
                iZz5q = zzyi8.zzYjv().zz5q();
                iIndexOfKey = zzzyv.indexOfKey(iArr3[iZz5q]);
                zzyi8.zzYjv().zzOu(iIndexOfKey);
            } else {
                iZz5q = 0;
                iIndexOfKey = 0;
            }
            for (zzWJ zzwj : zzyi8.zzYjs()) {
                iZz5q += zzwj.zz5q();
                int iIndexOfKey2 = zzzyv.indexOfKey(iArr3[iZz5q]);
                zzwj.zzOu(iIndexOfKey2 - iIndexOfKey);
                iIndexOfKey = iIndexOfKey2;
            }
            zzyi8.zzp9(iIndexOfKey);
            int iMax = Math.max(count - zzyi8.zzYjt(), 0);
            if (zzyi8.zzYju().zz5q() != iMax || !zzyi8.zzYju().getPreferredWidth().isAuto()) {
                zzyi8.zzYju().zzOu(iMax);
                zzyi8.zzYju().setPreferredWidth(PreferredWidth.AUTO);
            }
        }
        return zzL(zzzyv);
    }

    private void zzXYZ() {
        zzXYW().getCount();
        for (int i = 0; i < zzXYW().getCount(); i++) {
            zzY6T zzy6tZzkf = zzXYW().zzkf(i);
            if (!zzy6tZzkf.isAuto()) {
                if (zzy6tZzkf.zz56() < 5) {
                    zzy6tZzkf.zz55().zzk6(5);
                }
                if (this.zzY6B) {
                    if (zzy6tZzkf.zz6f() < zzy6tZzkf.zz56()) {
                        zzy6tZzkf.zz55().zzk5(zzy6tZzkf.zz56());
                    }
                    if (zzy6tZzkf.zz6e() < zzy6tZzkf.zz56()) {
                        zzy6tZzkf.zz55().zzk4(zzy6tZzkf.zz56());
                    }
                }
            }
        }
    }

    private void zzXZ0() {
        if (this.zzX60) {
            for (int i = 0; i < zzXYW().getCount(); i++) {
                zzY6T zzy6tZzkf = zzXYW().zzkf(i);
                zzY6P zzy6pZz55 = zzy6tZzkf.zz55();
                int iZzYKt = 1;
                if (!zzy6tZzkf.zzXZl() && !zzy6tZzkf.zzXZn()) {
                    iZzYKt = 1 + (zzYKt() * 2);
                }
                zzy6pZz55.zzk6(Math.max(zzy6pZz55.zz56(), iZzYKt));
                zzy6pZz55.zzk5(Math.max(zzy6pZz55.zz6f(), iZzYKt));
            }
        }
    }

    private void zzXZ1() {
        zzXZ0();
        zzXYZ();
    }

    private void zzXZ2() {
        for (int i = this.zzX62; i < zzXYU(); i++) {
            zzYI8 zzyi8 = this.zzZEU.get(i);
            int iZz5q = zzyi8.zzYjv().zz5q();
            for (zzWJ zzwj : zzyi8.zzYjs()) {
                if (zzwj.zz5q() > 1 && !zzwj.zz54()) {
                    zzY(zzwj, iZz5q);
                }
                iZz5q += zzwj.zz5q();
            }
        }
    }

    private boolean zzXZ4() {
        if (this.zzX60) {
            return false;
        }
        return zzPI(false);
    }

    private void zzXZ5() {
        int[] iArr = new int[zzXYW().getCount()];
        char c = 0;
        int i = 0;
        boolean z = false;
        while (i < zzXYW().getCount()) {
            zzY6T zzy6tZzkf = zzXYW().zzkf(i);
            int iIntValue = this.zzX67.get(i).intValue();
            if (iIntValue != 0) {
                int i2 = 1;
                if (iIntValue != 1) {
                    int[] iArr2 = this.zzX66.get(i);
                    int i3 = iArr2[c];
                    if (zzy6tZzkf.zzXZl() == (iIntValue == 4 ? (char) 1 : c)) {
                        if ((iIntValue == 4 ? zzy6tZzkf.zzXZm() : zzy6tZzkf.zzXZo()) < i3) {
                            if (iIntValue == 4) {
                                zzy6tZzkf.zzk9(i3);
                            } else {
                                zzy6tZzkf.zzka(i3);
                            }
                        }
                    }
                    iArr[i] = i3;
                    int i4 = 1;
                    while (i4 <= i) {
                        int i5 = i4 + 1;
                        int i6 = (i - i5) + i2;
                        int iZzYKt = iArr2[i4];
                        for (int i7 = i - 1; i7 >= i6; i7--) {
                            int iIntValue2 = this.zzX67.get(i7).intValue();
                            if (zzXYW().getCount() > 64) {
                                if (iIntValue2 != iIntValue && iIntValue2 != 0) {
                                    iZzYKt = 0;
                                    break;
                                }
                                iZzYKt -= iArr[i7];
                            } else {
                                if (iIntValue2 != iIntValue) {
                                    iZzYKt = 0;
                                    break;
                                }
                                iZzYKt -= iArr[i7];
                            }
                        }
                        if (iIntValue == 2) {
                            iZzYKt -= (zzYKt() * 2) * i4;
                        }
                        if (iZzYKt > i3) {
                            iArr[i] = iZzYKt;
                            i3 = iZzYKt;
                            z = true;
                        }
                        i4 = i5;
                        i2 = 1;
                    }
                }
            }
            i++;
            c = 0;
        }
        if (z) {
            for (int i8 = 0; i8 < zzXYW().getCount(); i8++) {
                zzY6T zzy6tZzkf2 = zzXYW().zzkf(i8);
                int iZz6e = iArr[i8];
                if (iZz6e > 0) {
                    if (this.zzX67.get(i8).intValue() == 4) {
                        zzy6tZzkf2.zzk9(iZz6e);
                    } else {
                        if (zzy6tZzkf2.zzXZk().isAuto() && iZz6e < zzy6tZzkf2.zz6e()) {
                            iZz6e = zzy6tZzkf2.zz6e();
                            zzy6tZzkf2.zz55().zzk4(zzy6tZzkf2.zz6f());
                        }
                        zzy6tZzkf2.zzka(iZz6e);
                        zzy6tZzkf2.zzXZk().add(2);
                    }
                }
            }
        }
    }

    private void zzXZ6() {
        for (int i = this.zzX62; i < zzXYU(); i++) {
            zzYI8 zzyi8 = this.zzZEU.get(i);
            zzZ(zzyi8.zzYju(), zzyi8.zzYjt(), zzXYW().getCount() - 1);
            zzZ(zzyi8.zzYjv(), 0, zzyi8.zzYjv().zz5q());
        }
    }

    private void zzXZ7() {
        this.zzX67.clear();
        this.zzX66.clear();
        for (int i = this.zzX62; i < zzXYU(); i++) {
            zzYI8 zzyi8 = this.zzZEU.get(i);
            zzZ(0, zzyi8.zzYjv(), false);
            int iZz5q = zzyi8.zzYjv().zz5q();
            for (zzWJ zzwj : zzyi8.zzYjs()) {
                if (!this.zzY6B && !zzwj.getPreferredWidth().zzYmB() && !zzwj.getPreferredWidth().isFixed()) {
                    zzZ(iZz5q, zzwj, zzyi8);
                }
                zzZ(iZz5q, zzwj, true);
                iZz5q += zzwj.zz5q();
            }
        }
        for (int i2 = this.zzX62; i2 < zzXYU(); i2++) {
            zzYI8 zzyi82 = this.zzZEU.get(i2);
            int iZz5q2 = zzyi82.zzYjv().zz5q() - 1;
            for (zzWJ zzwj2 : zzyi82.zzYjs()) {
                if (!zzwj2.getPreferredWidth().zzYmB()) {
                    zzwj2.getPreferredWidth().isFixed();
                }
                iZz5q2 += zzwj2.zz5q();
                if (!zzwj2.zz54()) {
                    zzZ(iZz5q2, zzwj2);
                }
            }
        }
    }

    private int zzXZ8() {
        int iMax = 0;
        for (int i = 0; i < this.zzZEU.size(); i++) {
            zzYI8 zzyi8 = this.zzZEU.get(i);
            zzyi8.zzYjs().size();
            if (zzyi8.zzYjs().size() > 0) {
                if (zzyi8.zzYjv().zz5q() > Math.max(iMax, this.zzX69.getCount())) {
                    int iZz5q = zzyi8.zzYjv().zz5q();
                    zzyi8.zzYjv().zzOu(0);
                    zzyi8.zzYjv().setPreferredWidth(PreferredWidth.AUTO);
                    zzWJ zzwj = zzyi8.zzYjs().get(0);
                    zzwj.zzOu(zzwj.zz5q() + iZz5q);
                }
                iMax = Math.max(iMax, zzyi8.zzYjt());
            }
        }
        return iMax;
    }

    private void zzXZ9() {
        if (this.zzX62 < zzXYU()) {
            return;
        }
        ArrayList<Integer> arrayList = new ArrayList<>(this.zzZEU.get(this.zzX62).zzYjt());
        this.zzX64.set(this.zzX61, zzZ(64, this.zzX62, arrayList));
        this.zzZEU.size();
        zzY(this.zzZEU.get(this.zzX62));
        int count = zzXYX().getCount() - arrayList.size();
        if (count > 0) {
            zzXYX().removeRange(arrayList.size(), count);
        }
        zzXYU();
        zzZ(this.zzX62, zzXYU(), zzXYX(), arrayList);
    }

    private void zzXZa() {
        int iZzXZ8 = zzXZ8();
        ArrayList<Integer> arrayList = new ArrayList<>(this.zzZEU.get(0).zzYjt());
        zzZ(Integer.MAX_VALUE, 0, arrayList);
        this.zzZEU.size();
        int count = iZzXZ8 - this.zzX69.getCount();
        while (count > 0) {
            this.zzX69.add(StyleIdentifier.LIST_TABLE_4_ACCENT_5);
            count--;
        }
        if (count < 0) {
            this.zzX69.removeRange(iZzXZ8, -count);
        }
        zzZ(0, this.zzZEU.size(), this.zzX69, arrayList);
    }

    private static void zzY(zzYI8 zzyi8) {
        Iterator<zzWJ> it = zzyi8.zzYjs().iterator();
        while (it.hasNext()) {
            it.next().zzYy(false);
        }
    }

    private int zzYKt() {
        if (zzYk5()) {
            return this.zzY6A;
        }
        return 0;
    }

    private boolean zzYk5() {
        return this.zzY6A >= 0;
    }

    private void zzZ(int i, int i2, com.aspose.words.internal.zzDB zzdb, ArrayList<Integer> arrayList) {
        int i3 = 0;
        while (true) {
            if (i3 >= zzdb.getCount() - 1) {
                return;
            }
            boolean z = zzdb.get(i3) <= 5;
            int iIntValue = arrayList.get(i3).intValue();
            if (iIntValue == 0 || (z && iIntValue != 2)) {
                zzZ(i, i2, i3, arrayList);
                int i4 = i3 + 1;
                if (i4 < zzdb.getCount()) {
                    zzdb.set(i4, zzdb.get(i3) + zzdb.get(i4));
                }
                zzdb.removeAt(i3);
                arrayList.remove(i3);
            } else {
                i3++;
            }
        }
    }

    private static zzY6U zzZZ(int[] iArr) {
        if (iArr != null && iArr.length > 1) {
            return new zzY6U(zz0(iArr));
        }
        zzY6U zzy6u = new zzY6U();
        zzy6u.setState(1);
        return zzy6u;
    }

    private void zzk7(int i) {
        zzZ(this.zzX62, zzXYU(), i, (ArrayList<Integer>) null);
        zzXYW().zzkb(i);
    }

    private void zzk8(int i) {
        while (i > 0) {
            zzXYW().zzZ(new zzY6T());
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<int>) this.zzX67, 0);
            com.aspose.words.internal.zzZQG.zzZ(this.zzX66, new int[zzXYW().getCount()]);
            i--;
        }
    }

    public final zzY6U zzW(Table table, boolean z) {
        int[] iArrZzXYY = zzXYY();
        if (zzYk5() && zzYKt() > 0) {
            zzT(zzYKt(), iArrZzXYY);
        }
        zzY6U zzy6uZzZZ = zzZZ(iArrZzXYY);
        if (!z || iArrZzXYY == null) {
            zzy6uZzZZ.setState(1);
            return zzy6uZzZZ;
        }
        zzZ(table, iArrZzXYY, zzy6uZzZZ);
        return zzy6uZzZZ;
    }

    public final boolean zzXYV() {
        return this.zzX68;
    }

    public final zzY6V zzXYW() {
        return this.zzX65.get(this.zzX61);
    }

    public final boolean zzXZ3() {
        boolean zZzPI = zzPI(true);
        if (this.zzX68) {
            return false;
        }
        if (zZzPI) {
            zzXZf();
        }
        return zZzPI;
    }

    public final int[] zzXZb() {
        int[] iArr = new int[zzXYW().getCount()];
        for (int i = this.zzX62; i < zzXYU(); i++) {
            zzYI8 zzyi8 = this.zzZEU.get(i);
            int iZz5q = zzyi8.zzYjv().zz5q();
            for (zzWJ zzwj : zzyi8.zzYjs()) {
                if (zzwj.zz5q() > 1 && iArr[iZz5q] < zzwj.zz56()) {
                    iArr[iZz5q] = zzwj.zz56();
                }
                iZz5q += zzwj.zz5q();
            }
        }
        return iArr;
    }

    public final void zzXZc() {
        this.zzX61 = -1;
    }

    public final boolean zzXZd() {
        if (this.zzX65.size() == this.zzX64.getCount()) {
            this.zzX65.size();
            this.zzX63.size();
        }
        int i = this.zzX61;
        if (i == -1) {
            this.zzX61 = 0;
            this.zzX62 = 0;
        } else if (i < this.zzX65.size()) {
            this.zzX62 = zzXYU();
            this.zzX61++;
        }
        return this.zzX61 < this.zzX65.size();
    }

    public final boolean zzXZe() {
        zzXZd();
        boolean z = this.zzX62 < this.zzZEU.size();
        if (z) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzX65, new zzY6V(this.zzY6B));
            com.aspose.words.internal.zzZQG.zzZ(this.zzX63, new com.aspose.words.internal.zzDB(this.zzX69));
            this.zzX64.add(this.zzX62);
        }
        return z;
    }

    public final void zzXZf() {
        do {
            zzXYW().zzXZr();
            zzXZ9();
            zzXZ7();
            zzPJ(true);
            zzPJ(false);
            zzXZ5();
            zzXZ6();
            zzXZ1();
            zzXZ2();
        } while (zzXZ4());
    }

    private void zzY(zzWJ zzwj, int i) {
        int iZzXZm = 0;
        int i2 = 0;
        int iMax = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        for (int i5 = 0; i5 < zzwj.zz5q(); i5++) {
            int i6 = i + i5;
            zzY6T zzy6tZzkf = zzXYW().zzkf(i6);
            int iZzOg = zzXYW().zzOg(i6);
            int iZzke = zzXYW().zzke(i6);
            i2 += iZzke;
            iMax += Math.max(iZzke, iZzOg);
            if (zzy6tZzkf.zzXZl()) {
                iZzXZm += zzy6tZzkf.zzXZm();
                i3 += iZzke;
                i4 += iZzOg;
            } else {
                z = true;
            }
        }
        int i7 = iZzXZm > 5000 ? 5000 : iZzXZm;
        if (this.zzX60) {
            zzZ(zzwj, i, i2, iMax, i3, i4, i7);
        } else {
            zzZ(zzwj, i, i2, i7, z);
        }
    }

    private static void zzT(int i, int[] iArr) {
        if (iArr.length < 2) {
            return;
        }
        int i2 = i * 2;
        int i3 = i;
        for (int i4 = 1; i4 < iArr.length; i4++) {
            i3 += i2;
            iArr[i4] = iArr[i4] + i3;
        }
        int length = iArr.length - 1;
        iArr[length] = iArr[length] + i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ed, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int zzZ(int i, int i2, ArrayList<Integer> arrayList) {
        com.aspose.words.internal.zzDB zzdb = new com.aspose.words.internal.zzDB(arrayList.size());
        com.aspose.words.internal.zzDB zzdb2 = new com.aspose.words.internal.zzDB(arrayList.size());
        int i3 = i2;
        int count = 0;
        while (true) {
            if (i3 >= this.zzZEU.size()) {
                break;
            }
            zzYI8 zzyi8 = this.zzZEU.get(i3);
            zzdb.clear();
            zzdb2.clear();
            for (int iZzYjt = zzyi8.zzYjt() - arrayList.size(); iZzYjt > 0; iZzYjt--) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<int>) arrayList, 0);
            }
            if (zzyi8.zzYjv().zz5q() > 0) {
                int iZz5q = zzyi8.zzYjv().zz5q() - 1;
                if (arrayList.get(iZz5q).intValue() == 0) {
                    zzdb.add(iZz5q);
                }
            }
            int iZz5q2 = zzyi8.zzYjv().zz5q();
            for (zzWJ zzwj : zzyi8.zzYjs()) {
                int iZz5q3 = zzwj.zz5q();
                if (iZz5q3 == 1 && arrayList.get(iZz5q2).intValue() != 2) {
                    zzdb2.add(iZz5q2);
                }
                int iZz5q4 = (zzwj.zz5q() + iZz5q2) - 1;
                if (arrayList.get(iZz5q4).intValue() == 0) {
                    zzdb.add(iZz5q4);
                }
                iZz5q2 += iZz5q3;
            }
            if (zzdb.getCount() + count <= i) {
                for (int i4 = 0; i4 < zzdb.getCount(); i4++) {
                    arrayList.set(zzdb.get(i4), 1);
                }
                for (int i5 = 0; i5 < zzdb2.getCount(); i5++) {
                    arrayList.set(zzdb2.get(i5), 2);
                }
                count += zzdb.getCount();
                i3++;
            } else if (count <= 0 || i3 <= i2) {
                this.zzX68 = true;
                return i3;
            }
        }
    }

    public final zzY6P zzT(PreferredWidth preferredWidth) {
        int iMax = 0;
        int iMax2 = 0;
        int iMax3 = 0;
        int iMax4 = 0;
        for (zzY6V zzy6v : this.zzX65) {
            zzY6P zzy6pZzXZs = zzy6v.zzXZs();
            int count = (zzy6v.getCount() + 1) * zzYKt() * 2;
            iMax2 = Math.max(iMax2, zzy6pZzXZs.zz56() + count);
            iMax3 = Math.max(iMax3, zzy6pZzXZs.zz6f() + count);
            iMax4 = Math.max(iMax4, zzy6pZzXZs.zz6e() + count);
        }
        if (preferredWidth.isFixed()) {
            if (preferredWidth.zzYmD() > 0) {
                iMax3 = Math.max(iMax3, preferredWidth.zzYmD());
                iMax4 = iMax3;
            } else {
                iMax3 = iMax4;
            }
        } else {
            for (zzY6V zzy6v2 : this.zzX65) {
                iMax = Math.max(iMax, zzY6O.zzZ(zzy6v2) + ((zzy6v2.getCount() + 1) * zzYKt() * 2));
            }
            iMax4 = Math.max(iMax, iMax3);
        }
        return new zzY6P(iMax2, iMax3, iMax4);
    }

    private int zzY(zzWJ zzwj) {
        return (zzwj.zz5q() - 1) * zzYKt() * 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    private int zzY(zzWJ zzwj, int i, int i2) {
        boolean z;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < zzwj.zz5q(); i6++) {
            int i7 = i + i6;
            zzY6T zzy6tZzkf = zzXYW().zzkf(i7);
            int iZzOg = zzXYW().zzOg(i7);
            int iZzke = zzXYW().zzke(i7);
            if (zzy6tZzkf.zzXZm() <= 0) {
                i4++;
                i5 += iZzke;
                i3 += iZzOg;
            }
        }
        int iZzX = zzX(zzwj);
        if (i3 < iZzX && iZzX < i3 + 5) {
            iZzX = i3;
        }
        int i8 = iZzX - i2;
        if (i4 == 0) {
            return i8;
        }
        if (i8 <= i5) {
            return 0;
        }
        if (i8 <= i3) {
            double d = i3 + i5;
            double[] dArr = new double[zzwj.zz5q()];
            for (int i9 = 0; i9 < zzwj.zz5q(); i9++) {
                int i10 = i + i9;
                if (zzXYW().zzkf(i10).zzXZm() <= 0) {
                    dArr[i9] = ((double) (zzXYW().zzke(i10) + zzXYW().zzOg(i10))) / d;
                }
            }
            double d2 = i8 - i5;
            boolean[] zArr = new boolean[zzwj.zz5q()];
            int i11 = 0;
            double d3 = 0.0d;
            double d4 = 0.0d;
            while (i11 < zzwj.zz5q()) {
                int i12 = i + i11;
                if (zzXYW().zzkf(i12).zzXZm() <= 0) {
                    int iZzOg2 = zzXYW().zzOg(i12);
                    z = z2;
                    int iZzke2 = zzXYW().zzke(i12);
                    double d5 = dArr[i11];
                    if ((d5 * d2) + ((double) iZzke2) <= iZzOg2) {
                        d3 += d5;
                        zArr[i11] = z;
                    } else {
                        zArr[i11] = true;
                        int i13 = iZzOg2 - iZzke2;
                        double d6 = i13 > 0 ? ((double) i13) / d2 : 0.0d;
                        d4 = (d5 - d6) + d4;
                        dArr[i11] = d6;
                    }
                } else {
                    z = z2;
                }
                i11++;
                z2 = z;
            }
            boolean z3 = z2;
            for (?? r1 = z2; r1 < zzwj.zz5q(); r1++) {
                if (!zArr[r1]) {
                    double d7 = dArr[r1];
                    dArr[r1] = ((d4 * d7) / d3) + d7;
                }
            }
            for (int i14 = z3 ? 1 : 0; i14 < zzwj.zz5q(); i14++) {
                int i15 = i + i14;
                zzY6T zzy6tZzkf2 = zzXYW().zzkf(i15);
                if (zzy6tZzkf2.zzXZm() <= 0) {
                    int iZzOg3 = zzXYW().zzOg(i15);
                    int iZzke3 = zzXYW().zzke(i15);
                    int i16 = (int) (dArr[i14] * d2);
                    if (iZzke3 + i16 > iZzOg3) {
                        i16 = iZzOg3 - iZzke3;
                    }
                    if (this.zzY6B) {
                        zzy6tZzkf2.zz55().zzk5(zzy6tZzkf2.zz55().zz6f() + i16);
                    } else {
                        zzy6tZzkf2.zz55().zzk6(zzy6tZzkf2.zz55().zz56() + i16);
                    }
                    d2 -= (double) i16;
                }
            }
            int i17 = (int) d2;
            while (i17 > 0) {
                int i18 = i17;
                for (int i19 = z3 ? 1 : 0; i19 < zzwj.zz5q(); i19++) {
                    int i20 = i + i19;
                    zzY6T zzy6tZzkf3 = zzXYW().zzkf(i20);
                    if (zzXYW().zzke(i20) < zzXYW().zzOg(i20)) {
                        if (this.zzY6B) {
                            zzy6tZzkf3.zz55().zzk5(zzy6tZzkf3.zz55().zz6f() + 1);
                        } else {
                            zzy6tZzkf3.zz55().zzk6(zzy6tZzkf3.zz55().zz56() + 1);
                        }
                        i18--;
                    }
                }
                if (i18 == i17) {
                    return z3 ? 1 : 0;
                }
                i17 = i18;
            }
            return i17;
        }
        int i21 = i5 + i3;
        int iZzZX = com.aspose.words.internal.zzAN.zzZX(i8, i4);
        int i22 = i8;
        for (int i23 = 0; i23 < zzwj.zz5q(); i23++) {
            int i24 = i + i23;
            zzY6T zzy6tZzkf4 = zzXYW().zzkf(i24);
            if (zzy6tZzkf4.zzXZm() <= 0) {
                int iZzZX2 = i21 > 0 ? com.aspose.words.internal.zzAN.zzZX((zzXYW().zzke(i24) + zzXYW().zzOg(i24)) * i8, i21) : iZzZX;
                if (this.zzY6B) {
                    zzy6tZzkf4.zz55().zzk5(iZzZX2);
                } else {
                    zzy6tZzkf4.zz55().zzk6(iZzZX2);
                }
                i22 -= iZzZX2;
            }
        }
        return i22;
    }

    private void zzX(zzWJ zzwj, int i) {
        int iZz6e;
        if (!zzwj.getPreferredWidth().zzYmB() || this.zzY6B) {
            boolean zZzXZl = false;
            int i2 = 0;
            for (int i3 = 0; i3 < zzwj.zz5q(); i3++) {
                int i4 = i + i3;
                zzY6T zzy6tZzkf = zzXYW().zzkf(i4);
                int iZzOg = zzXYW().zzOg(i4);
                zZzXZl |= zzy6tZzkf.zzXZl();
                i2 += iZzOg;
            }
            if (zzwj.getPreferredWidth().isFixed()) {
                iZz6e = zzwj.getPreferredWidth().zzYmD();
            } else {
                iZz6e = this.zzY6B ? zzwj.zz6e() : 0;
            }
            int iZzY = iZz6e - zzY(zzwj);
            if (iZzY <= i2) {
                return;
            }
            int iZzZX = zZzXZl ? 0 : com.aspose.words.internal.zzAN.zzZX(iZzY, zzwj.zz5q());
            int i5 = iZzY;
            for (int i6 = 0; i6 < zzwj.zz5q(); i6++) {
                int i7 = i + i6;
                zzY6T zzy6tZzkf2 = zzXYW().zzkf(i7);
                int iZzZX2 = i2 > 0 ? com.aspose.words.internal.zzAN.zzZX(zzXYW().zzOg(i7) * iZzY, i2) : iZzZX;
                if (this.zzY6B && zzy6tZzkf2.zzXZo() <= 0) {
                    zzy6tZzkf2.zz55().zzk4(iZzZX2);
                } else {
                    zzy6tZzkf2.zzka(iZzZX2);
                }
                i5 -= iZzZX2;
            }
            zzZ(zzXYW(), i, zzwj.zz5q(), i5, 0);
        }
    }

    private void zzZ(int i, zzWJ zzwj, boolean z) {
        zzk8(Math.max(0, (zzwj.zz5q() + i) - zzXYW().getCount()));
        if (z && zzwj.zz5q() == 1) {
            zzZ(zzwj, i);
        }
    }

    private int zzX(zzWJ zzwj) {
        int iZz56;
        if (this.zzY6B) {
            iZz56 = zzwj.zz6f();
        } else {
            iZz56 = zzwj.zz56();
        }
        return iZz56 - zzY(zzwj);
    }

    private void zzZ(zzWJ zzwj, int i) {
        if (zzwj.zz5q() != 1) {
            return;
        }
        zzY6T zzy6tZzkf = zzXYW().zzkf(i);
        boolean zIsSet = zzy6tZzkf.zzXZk().isSet(2);
        if (zzwj.zz54()) {
            return;
        }
        zzy6tZzkf.zzXZk().zzW(zzwj.getPreferredWidth());
        zzy6tZzkf.zz55().zzW(zzwj);
        int type = zzwj.getPreferredWidth().getType();
        if (type == 1) {
            if (this.zzY6B) {
                if (zIsSet) {
                    zzy6tZzkf.zzka(Math.max(zzy6tZzkf.zzXZo(), zzwj.zz6e()));
                }
                if (this.zzX60 || !zIsSet) {
                    zzy6tZzkf.zz55().zzk4(Math.max(zzy6tZzkf.zz6e(), zzwj.zz55().zz6e()));
                    return;
                }
                return;
            }
            return;
        }
        if (type == 2) {
            zzy6tZzkf.zzk9(Math.max(zzy6tZzkf.zzXZm(), zzwj.getPreferredWidth().zzYmE()));
            return;
        }
        if (type == 3) {
            if (zzwj.getPreferredWidth().zzYmD() > 0) {
                zzy6tZzkf.zzka(Math.max(zzy6tZzkf.zzXZo(), zzwj.getPreferredWidth().zzYmE()));
                if (this.zzX60 || zIsSet) {
                    return;
                }
                zzy6tZzkf.zz55().zzk4(zzy6tZzkf.zz6f());
                return;
            }
            return;
        }
        throw new IllegalStateException("Unexpected cell width type.");
    }

    private void zzZ(int i, zzWJ zzwj) {
        if (zzwj.getPreferredWidth().isAuto() && this.zzY6B) {
            if (this.zzX67.get(i).intValue() == 0) {
                this.zzX67.set(i, 1);
                return;
            }
            return;
        }
        int iIntValue = this.zzX67.get(i).intValue();
        int i2 = zzwj.getPreferredWidth().zzYmB() ? 4 : 2;
        if (i2 == 4 || iIntValue != 4) {
            int[] iArr = this.zzX66.get(i);
            int iZzYmE = zzwj.getPreferredWidth().zzYmE();
            int iZz5q = zzwj.zz5q() - 1;
            if (i2 == iIntValue) {
                if (iArr[iZz5q] < iZzYmE) {
                    iArr[iZz5q] = iZzYmE;
                }
            } else {
                iArr[iZz5q] = iZzYmE;
                this.zzX67.set(i, Integer.valueOf(i2));
            }
        }
    }

    private void zzZ(zzWJ zzwj, int i, int i2) {
        while (i < i2) {
            if (zzXYW().zzkf(i).zzXZk().isAuto()) {
                zzwj.setPreferredWidth(PreferredWidth.AUTO);
                return;
            }
            i++;
        }
    }

    private int zzZ(int i, zzWJ zzwj, zzYI8 zzyi8) {
        zzwj.getPreferredWidth().isAuto();
        if (this.zzY6B) {
            return 0;
        }
        int iZzVg = zzVg(i, zzwj.zz5q());
        if (zzYk5()) {
            int iZzYKt = iZzVg - (zzYKt() * 2);
            if (i == zzyi8.zzYjv().zz5q()) {
                iZzYKt -= zzYKt();
            }
            if (i + zzwj.zz5q() == zzyi8.zzYjt()) {
                iZzYKt -= zzYKt();
            }
            iZzVg = Math.max(1, iZzYKt);
        }
        zzwj.setPreferredWidth(PreferredWidth.zzpK(iZzVg));
        return iZzVg;
    }

    private void zzZ(zzWJ zzwj, int i, int i2, int i3, boolean z) {
        int iZzX = zzX(zzwj, i, i3);
        int iZzX2 = zzX(zzwj) - i2;
        boolean z2 = false;
        boolean z3 = Math.max(0, iZzX2) >= 5;
        boolean zZzYmB = zzwj.getPreferredWidth().zzYmB();
        if (z3) {
            if (!zZzYmB && z) {
                z2 = true;
            }
            zzZ(zzXYW(), i, zzwj.zz5q(), zzY(zzwj, i, zzZ(zzwj, i, iZzX, z2)), 1);
        }
        zzX(zzwj, i);
    }

    private void zzZ(zzWJ zzwj, int i, int i2, int i3, int i4, int i5, int i6) {
        int iZz57;
        int iMax;
        int iMax2;
        int iMax3;
        int iZzZX;
        int iZzZX2;
        int iZzZX3;
        int iZzZX4;
        int i7;
        int i8;
        int iZzZX5;
        int iZzZX6;
        int iZzZX7;
        int iZzZX8;
        int iZzX = zzX(zzwj);
        int iMax4 = Math.max(0, iZzX - i2);
        if (zzwj.getPreferredWidth().zzYmB()) {
            iMax2 = 0;
            iMax3 = Math.max(0, zzwj.getPreferredWidth().zzYmE() - i6);
            iMax = iZzX;
        } else {
            if (this.zzY6B && zzwj.getPreferredWidth().isAuto()) {
                iZz57 = Math.max(zzwj.zz57(), zzwj.zz6e());
            } else {
                iZz57 = zzwj.zz57();
            }
            iMax = Math.max(iZzX, iZz57 - zzY(zzwj));
            iMax2 = Math.max(0, iMax - i3);
            iMax3 = 0;
        }
        int iZzYmE = (i2 <= i4 || zzwj.getPreferredWidth().zzYmB()) ? i6 : 5000;
        if (i4 > 0) {
            int i9 = iZzYmE - i6;
            if (iMax2 > 0) {
                iZzZX4 = (iZzYmE > 0 ? com.aspose.words.internal.zzAN.zzZX(iMax * i6, iZzYmE) : 0) - i5;
                if (iZzZX4 < 0) {
                    iZzZX4 = 0;
                }
                iZzZX3 = (i5 - i3) + (iZzYmE > 0 ? com.aspose.words.internal.zzAN.zzZX(iMax * i9, iZzYmE) : iMax);
                if (iZzZX3 < 0) {
                    iZzZX3 = 0;
                }
            } else {
                iZzZX4 = 0;
                iZzZX3 = 0;
            }
            if (iMax4 > 0) {
                iZzZX2 = (iZzYmE > 0 ? com.aspose.words.internal.zzAN.zzZX(iZzX * i6, iZzYmE) : 0) - i4;
                if (iZzZX2 < 0) {
                    iZzZX2 = 0;
                }
                iZzZX = (i4 - i2) + (iZzYmE > 0 ? com.aspose.words.internal.zzAN.zzZX(i9 * iZzX, iZzYmE) : iZzX);
                if (iZzZX < 0) {
                    iZzZX = 0;
                }
            } else {
                iZzZX2 = 0;
                iZzZX = 0;
            }
        } else {
            iZzZX = iMax4;
            iZzZX2 = 0;
            iZzZX3 = iMax2;
            iZzZX4 = 0;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i10 < zzwj.zz5q()) {
            int i15 = i + i10;
            zzY6T zzy6tZzkf = zzXYW().zzkf(i15);
            int iZzOg = zzXYW().zzOg(i15);
            int i16 = iZzX;
            int iZzke = zzXYW().zzke(i15);
            if (iMax3 > 0) {
                iZzYmE = zzwj.getPreferredWidth().zzYmE();
                if (zzy6tZzkf.zzXZl()) {
                    i7 = iMax4;
                } else {
                    int i17 = i3 - i5;
                    if (i17 > 0) {
                        i7 = iMax4;
                        iZzZX8 = com.aspose.words.internal.zzAN.zzZX(iZzOg * iMax3, i17);
                    } else {
                        i7 = iMax4;
                        iZzZX8 = com.aspose.words.internal.zzAN.zzZX(iMax3, 1);
                    }
                    zzy6tZzkf.zzk9(iZzZX8);
                }
                iZzZX2 = i7;
            } else {
                i7 = iMax4;
            }
            if (zzy6tZzkf.zzXZl()) {
                iZzZX5 = iZzZX4 > 0 ? com.aspose.words.internal.zzAN.zzZX(zzy6tZzkf.zzXZm() * iMax, iZzYmE) : 0;
                if (iZzZX2 > 0) {
                    i8 = iMax3;
                    iZzZX7 = com.aspose.words.internal.zzAN.zzZX(zzy6tZzkf.zzXZm() * i16, iZzYmE);
                    iZzZX5 = iZzZX5;
                } else {
                    i8 = iMax3;
                    iZzZX7 = 0;
                }
            } else {
                i13++;
                if (iZzZX > 0) {
                    int i18 = i3 - i5;
                    i8 = iMax3;
                    int i19 = i2 - i4;
                    if (iZzZX3 <= 0) {
                        int i20 = i18 - i19;
                        if (i20 > 0) {
                            iZzZX6 = com.aspose.words.internal.zzAN.zzZX((iZzOg - iZzke) * iZzZX, i20);
                        } else if (i19 > 0) {
                            iZzZX6 = com.aspose.words.internal.zzAN.zzZX(iZzZX * iZzke, i19);
                        } else {
                            iZzZX6 = com.aspose.words.internal.zzAN.zzZX(iZzZX, 1);
                        }
                    } else {
                        iZzZX6 = com.aspose.words.internal.zzAN.zzZX(iZzZX * iZzOg, i18);
                    }
                    iZzZX7 = iZzZX6 + iZzke;
                    iZzZX5 = 0;
                } else {
                    i8 = iMax3;
                    iZzZX5 = 0;
                    iZzZX7 = 0;
                }
            }
            if (iZzZX5 > iZzOg) {
                zzy6tZzkf.zzka(iZzZX5);
            }
            if (iZzZX7 > iZzke) {
                if (this.zzY6B) {
                    zzy6tZzkf.zz55().zzk5(iZzZX7);
                    zzy6tZzkf.zz55().zzk4(Math.max(iZzZX7, zzy6tZzkf.zz6e()));
                } else {
                    zzy6tZzkf.zz55().zzk6(iZzZX7);
                }
                iZzke = iZzZX7;
            }
            int iZzOg2 = zzXYW().zzOg(i15);
            i11 += iZzke;
            i12 += iZzOg2;
            if (zzy6tZzkf.zzXZl()) {
                i14 += iZzOg2;
            }
            i10++;
            iZzX = i16;
            iMax4 = i7;
            iMax3 = i8;
        }
        int i21 = iZzX - i11;
        if (i21 > 0) {
            int iZz5q = (i + zzwj.zz5q()) - 1;
            zzY6T zzy6tZzkf2 = zzXYW().zzkf(iZz5q);
            int iZzOg3 = zzXYW().zzOg(iZz5q);
            if (this.zzY6B) {
                zzy6tZzkf2.zz55().zzk5(zzy6tZzkf2.zz55().zz6f() + i21);
                zzy6tZzkf2.zz55().zzk4(Math.max(zzy6tZzkf2.zz6f(), zzy6tZzkf2.zz6e()));
            } else {
                zzy6tZzkf2.zz55().zzk6(zzy6tZzkf2.zz55().zz56() + i21);
            }
            int iZzOg4 = zzXYW().zzOg(iZz5q);
            if (iZzOg3 < iZzOg4) {
                int i22 = iZzOg4 - iZzOg3;
                i12 += i22;
                if (zzy6tZzkf2.zzXZl()) {
                    i14 += i22;
                }
            }
        }
        if (iMax - i12 > 0) {
            if (i13 > 0) {
                int i23 = i12 - i14;
                int i24 = iMax - i14;
                int i25 = i24 / i13;
                int i26 = 0;
                for (int i27 = 0; i27 < zzwj.zz5q(); i27++) {
                    int i28 = i + i27;
                    zzY6T zzy6tZzkf3 = zzXYW().zzkf(i28);
                    int iZzOg5 = zzXYW().zzOg(i28);
                    if (!zzy6tZzkf3.zzXZl()) {
                        int iZzZX9 = i23 > 0 ? com.aspose.words.internal.zzAN.zzZX(i24 * iZzOg5, i23) : i25;
                        if (iZzZX9 > iZzOg5) {
                            if (this.zzY6B && zzy6tZzkf3.zzXZo() <= 0) {
                                zzy6tZzkf3.zz55().zzk4(iZzZX9);
                            } else {
                                zzy6tZzkf3.zzka(iZzZX9);
                            }
                        }
                        iZzOg5 = iZzZX9;
                    }
                    i26 += iZzOg5;
                }
                i12 = i26;
            }
            if (iMax > i12) {
                int iZz5q2 = (i + zzwj.zz5q()) - 1;
                zzY6T zzy6tZzkf4 = zzXYW().zzkf(iZz5q2);
                int iZzOg6 = (zzXYW().zzOg(iZz5q2) + iMax) - i12;
                if (this.zzY6B && zzy6tZzkf4.zzXZo() <= 0) {
                    zzy6tZzkf4.zz55().zzk4(iZzOg6);
                } else {
                    zzy6tZzkf4.zzka(iZzOg6);
                }
            }
        }
    }

    public static void zzZ(zzY6V zzy6v, int i, int i2, int i3, int i4) {
        if (i3 <= 0) {
            return;
        }
        for (int i5 = 0; i3 > 0 && i5 < i2; i5++) {
            zzY6T zzy6tZzkf = zzy6v.zzkf(i + i5);
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        zzy6tZzkf.setWidth(zzy6tZzkf.getWidth() + 1);
                    }
                } else if (zzy6v.zzYKv()) {
                    zzy6tZzkf.zz55().zzk5(zzy6tZzkf.zz55().zz6f() + 1);
                } else {
                    zzy6tZzkf.zz55().zzk6(zzy6tZzkf.zz55().zz56() + 1);
                }
            } else if (zzy6v.zzYKv() && zzy6tZzkf.zzXZo() <= 0) {
                zzy6tZzkf.zz55().zzk4(zzy6tZzkf.zz55().zz6e() + 1);
            } else {
                zzy6tZzkf.zzka(zzy6tZzkf.zzXZo() + 1);
            }
            i3--;
        }
    }

    private int zzZ(zzWJ zzwj, int i, int i2, boolean z) {
        if (i2 <= 0) {
            return 0;
        }
        if (z && !zzwj.getPreferredWidth().zzYmB()) {
            i2 = 5000;
        }
        int iZzX = zzX(zzwj);
        int i3 = i2;
        int i4 = 0;
        for (int i5 = 0; i5 < zzwj.zz5q(); i5++) {
            int i6 = i + i5;
            zzY6T zzy6tZzkf = zzXYW().zzkf(i6);
            int iZzXZm = zzy6tZzkf.zzXZm();
            if (i3 < iZzXZm) {
                iZzXZm = i3;
            }
            i3 -= iZzXZm;
            int i7 = (iZzXZm * iZzX) / i2;
            i4 += i7;
            if (i7 > zzXYW().zzke(i6)) {
                if (this.zzY6B) {
                    zzy6tZzkf.zz55().zzk5(i7);
                } else {
                    zzy6tZzkf.zz55().zzk6(i7);
                }
            }
        }
        return i4;
    }

    private void zzZ(Table table, int[] iArr, zzY6U zzy6u) {
        Row row;
        RowCollection rows = table.getRows();
        if (!table.getAllowAutoFit()) {
            table.zzY0d();
        }
        int i = 0;
        for (zzYI8 zzyi8 : this.zzZEU) {
            do {
                row = (Row) rows.get(i);
                i++;
            } while (row.getCells().getCount() == 0);
            int i2 = iArr[zzyi8.zzYjv().zz5q()];
            zzZ(row.zzZYf(), zzyi8.zzYjv());
            CellCollection cells = row.getCells();
            int iZz5q = zzyi8.zzYjv().zz5q();
            int i3 = 0;
            for (zzWJ zzwj : zzyi8.zzYjs()) {
                Cell cell = (Cell) cells.get(i3);
                i3++;
                iZz5q += zzwj.zz5q();
                int i4 = iArr[iZz5q];
                cell.zz6G().setWidth(i4 - i2);
                cell.zz6G().zzOu(zzwj.zz5q());
                if (!table.getAllowAutoFit() && cell.zz6G().getPreferredWidth().isAuto()) {
                    cell.zz6G().setPreferredWidth(zzwj.getPreferredWidth());
                }
                i2 = i4;
            }
            zzZ(zzyi8.zzYju(), row.zzZYf());
        }
        table.zzZYf().zzQ(5103, zzy6u.zzXZp());
        zzy6u.setState(2);
    }

    private static void zzZ(zzY6G zzy6g, zzWJ zzwj) {
        if (zzwj.zz5q() > 0) {
            zzy6g.zzQ(5104, Integer.valueOf(zzwj.zz5q()));
            zzy6g.zzQ(4250, Integer.valueOf(zzwj.getPreferredWidth().zzYmE()));
            return;
        }
        if (zzy6g.zzYka() != 0) {
            zzy6g.zzQ(5104, 0);
        }
        if (zzy6g.zzYk9() != 0) {
            zzy6g.zzQ(4250, 0);
        }
    }

    private static void zzZ(zzWJ zzwj, zzY6G zzy6g) {
        int iZzYmE = zzwj.getPreferredWidth().zzYmE();
        int iZz5q = zzwj.zz5q();
        if (iZzYmE > 0) {
            zzy6g.zzQ(4260, Integer.valueOf(iZzYmE));
            iZz5q = Math.max(1, iZz5q);
        } else if (zzy6g.zzYk7() != 0) {
            zzy6g.zzQ(4260, 0);
        }
        if (iZz5q > 0) {
            zzy6g.zzQ(5105, Integer.valueOf(iZz5q));
        } else if (zzy6g.zzYk8() != 0) {
            zzy6g.zzQ(5105, 0);
        }
    }

    private void zzZ(int i, int i2, int i3, ArrayList<Integer> arrayList) {
        boolean z = arrayList != null;
        while (i < i2) {
            zzYI8 zzyi8 = this.zzZEU.get(i);
            if (zzyi8.zzYjv().zz5q() > i3) {
                zzyi8.zzpa(zzyi8.zzYjv().zz5q() - 1);
            } else if (!z && zzyi8.zzYjt() <= i3) {
                if (zzyi8.zzYju().zz5q() > 0) {
                    zzyi8.zzYju().zzOu(zzyi8.zzYju().zz5q() - 1);
                    if (zzyi8.zzYju().zz5q() == 0) {
                        zzyi8.zzYju().setPreferredWidth(PreferredWidth.AUTO);
                    }
                }
            } else {
                int iZz5q = zzyi8.zzYjv().zz5q();
                Iterator<zzWJ> it = zzyi8.zzYjs().iterator();
                while (true) {
                    if (it.hasNext()) {
                        zzWJ next = it.next();
                        if (next.zz5q() + iZz5q > i3) {
                            next.zzOu(next.zz5q() - 1);
                            zzyi8.zzp9(zzyi8.zzYjt() - 1);
                            if (next.zz5q() <= 0) {
                                this.zzX68 = true;
                            }
                            if (next.zz5q() == 1) {
                                if (z) {
                                    arrayList.set(iZz5q, 2);
                                } else {
                                    if (iZz5q >= i3) {
                                        iZz5q = i3 + 1;
                                    }
                                    zzY6T zzy6tZzkf = zzXYW().zzkf(iZz5q);
                                    zzy6tZzkf.zz55().zzW(next);
                                    zzy6tZzkf.zzXZk().zzW(next.getPreferredWidth());
                                }
                            }
                        } else {
                            iZz5q += next.zz5q();
                        }
                    }
                }
            }
            i++;
        }
    }
}
