package com.aspose.words;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYLC {
    private ArrayList<zzYL8> zzXE4;

    public zzYLC() {
        this(new long[0]);
    }

    private static boolean zzW(long[] jArr, long j) {
        long j2;
        if (jArr.length < 3) {
            return false;
        }
        boolean z = true;
        long jZzG = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jArr[jArr.length - 1]), com.aspose.words.internal.zzZPY.zzYC(jArr[jArr.length - 1]));
        int i = 0;
        boolean z2 = false;
        while (i < jArr.length) {
            long jZzG2 = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jArr[i]), com.aspose.words.internal.zzZPY.zzYC(jArr[i]));
            int i2 = (int) jZzG2;
            int i3 = (int) jZzG;
            if (Float.intBitsToFloat(i2) > Float.intBitsToFloat(i3)) {
                j2 = jZzG2;
            } else {
                j2 = jZzG;
                jZzG = jZzG2;
            }
            int i4 = (int) j;
            if ((Float.intBitsToFloat(i2) < Float.intBitsToFloat(i4) ? z : false) == (Float.intBitsToFloat(i4) <= Float.intBitsToFloat(i3) ? z : false)) {
                int i5 = (int) jZzG;
                if ((Float.intBitsToFloat((int) j2) - Float.intBitsToFloat(i5)) * (com.aspose.words.internal.zzZPY.zzYC(j) - com.aspose.words.internal.zzZPY.zzYC(jZzG)) < (Float.intBitsToFloat(i4) - Float.intBitsToFloat(i5)) * (com.aspose.words.internal.zzZPY.zzYC(j2) - com.aspose.words.internal.zzZPY.zzYC(jZzG))) {
                    z2 = !z2;
                }
            }
            i++;
            jZzG = jZzG2;
            z = true;
        }
        return z2;
    }

    public final int getIndex(int i) {
        return i % this.zzXE4.size();
    }

    public final void zzM(com.aspose.words.internal.zz0Q zz0q) {
        for (int i = 0; i < zz0q.getCount(); i++) {
            zzXx(zz0q.get(i));
        }
    }

    public final void zzRx(boolean z) {
        if (com.aspose.words.internal.zzJ6.zzT(zzYno())) {
            return;
        }
        Collections.reverse(this.zzXE4);
    }

    public final void zzXx(long j) {
        zzZ(new zzYL8(j));
    }

    public final int zzY(zzYL8 zzyl8) {
        return this.zzXE4.indexOf(zzyl8);
    }

    public final int zzYnf() {
        float fZzYC = -3.4028235E38f;
        int i = 0;
        for (int i2 = 0; i2 < this.zzXE4.size(); i2++) {
            long jZzYn8 = zzq1(i2).zzYn8();
            if (com.aspose.words.internal.zzZPY.zzYC(jZzYn8) > fZzYC) {
                fZzYC = com.aspose.words.internal.zzZPY.zzYC(jZzYn8);
                i = i2;
            }
        }
        return i;
    }

    public final int zzYng() {
        float fZzYC = Float.MAX_VALUE;
        int i = 0;
        for (int i2 = 0; i2 < this.zzXE4.size(); i2++) {
            long jZzYn8 = zzq1(i2).zzYn8();
            if (com.aspose.words.internal.zzZPY.zzYC(jZzYn8) < fZzYC) {
                fZzYC = com.aspose.words.internal.zzZPY.zzYC(jZzYn8);
                i = i2;
            }
        }
        return i;
    }

    public final int zzYnh() {
        float fIntBitsToFloat = -3.4028235E38f;
        int i = 0;
        for (int i2 = 0; i2 < this.zzXE4.size(); i2++) {
            int iZzYn8 = (int) zzq1(i2).zzYn8();
            if (Float.intBitsToFloat(iZzYn8) > fIntBitsToFloat) {
                fIntBitsToFloat = Float.intBitsToFloat(iZzYn8);
                i = i2;
            }
        }
        return i;
    }

    public final int zzYni() {
        float f = Float.MAX_VALUE;
        float fZzYC = Float.MAX_VALUE;
        int i = 0;
        for (int i2 = 0; i2 < this.zzXE4.size(); i2++) {
            long jZzYn8 = zzq1(i2).zzYn8();
            int i3 = (int) jZzYn8;
            if (Float.intBitsToFloat(i3) < f || (Float.intBitsToFloat(i3) == f && com.aspose.words.internal.zzZPY.zzYC(jZzYn8) < fZzYC)) {
                float fIntBitsToFloat = Float.intBitsToFloat(i3);
                fZzYC = com.aspose.words.internal.zzZPY.zzYC(jZzYn8);
                f = fIntBitsToFloat;
                i = i2;
            }
        }
        return i;
    }

    public final int zzYnj() {
        return this.zzXE4.size();
    }

    public final zzYLC zzYnk() {
        return new zzYLC(zzYno());
    }

    public final boolean zzYnl() {
        Iterator<zzYL8> it = this.zzXE4.iterator();
        while (it.hasNext()) {
            if (it.next().zzYn9() != 1) {
                return false;
            }
        }
        return true;
    }

    public final void zzYnm() {
        Iterator<zzYL8> it = this.zzXE4.iterator();
        while (it.hasNext()) {
            it.next().zzpZ(0);
        }
    }

    public final long[] zzYnn() {
        long[] jArr = new long[this.zzXE4.size()];
        for (int i = 0; i < this.zzXE4.size(); i++) {
            jArr[i] = com.aspose.words.internal.zzSA.zzD(this.zzXE4.get(i).zzYn8());
        }
        return jArr;
    }

    public final long[] zzYno() {
        long[] jArr = new long[this.zzXE4.size()];
        for (int i = 0; i < this.zzXE4.size(); i++) {
            long jZzYn8 = this.zzXE4.get(i).zzYn8();
            jArr[i] = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jZzYn8), com.aspose.words.internal.zzZPY.zzYC(jZzYn8));
        }
        return jArr;
    }

    public final void zzZ(int i, ArrayList<zzYL8> arrayList) {
        this.zzXE4.addAll(i, arrayList);
    }

    public final boolean zzk(long j) {
        return zzW(zzYno(), j);
    }

    public final void zzq(com.aspose.words.internal.zzP9 zzp9) {
        if (zzp9 == null || zzp9.isIdentity()) {
            return;
        }
        for (zzYL8 zzyl8 : this.zzXE4) {
            zzyl8.zzXu(zzp9.zzR(zzyl8.zzYn8()));
        }
    }

    public final zzYL8 zzq1(int i) {
        if (i < 0 || i >= this.zzXE4.size()) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        return this.zzXE4.get(i);
    }

    public final ArrayList<zzYL8> zzq2(int i) {
        ArrayList<zzYL8> arrayList = new ArrayList<>(this.zzXE4.size());
        for (int i2 = 0; i2 < this.zzXE4.size(); i2++) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, zzq1((i + i2) % this.zzXE4.size()));
        }
        return arrayList;
    }

    public final void zzq3(int i) {
        if (i < 0 || i >= this.zzXE4.size()) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        this.zzXE4.remove(i);
    }

    public zzYLC(float f, float f2) {
        this(new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, f, f2));
    }

    public final void zzY(int i, zzYL8 zzyl8) {
        if (i < 0 || i >= this.zzXE4.size()) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        this.zzXE4.set(i, zzyl8);
    }

    public zzYLC(com.aspose.words.internal.zzZQ4 zzzq4) {
        this(new long[]{com.aspose.words.internal.zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZo()), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZo()), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZn()), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZn())});
    }

    public final void zzZ(zzYL8 zzyl8) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzXE4, zzyl8);
    }

    public final void zzZ(int i, zzYL8 zzyl8) {
        if (i >= 0 && i < this.zzXE4.size()) {
            this.zzXE4.add(i, zzyl8);
            return;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
    }

    public zzYLC(long[] jArr) {
        if (jArr != null) {
            this.zzXE4 = new ArrayList<>(jArr.length);
            for (long j : jArr) {
                zzZ(new zzYL8(j));
            }
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: points");
    }

    public zzYLC(long[] jArr, byte b) {
        this(jArr);
        zzRx(true);
    }
}
