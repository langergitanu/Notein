package com.aspose.words.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
final class zzWW {
    private HashMap<Integer, Object[]> zzTP;

    public zzWW(HashMap<Integer, Object[]> map) {
        this.zzTP = map;
    }

    private void zzE(int i, int i2) {
        zzY(i, i2, 0, 1);
    }

    private void zzF(int i, int i2) {
        this.zzTP.put(Integer.valueOf(i), new Object[i2]);
    }

    private int zzG(int i, int i2) {
        Object[] objArr = (Object[]) zzQW.zzZ(this.zzTP, Integer.valueOf(i));
        if (objArr == null) {
            return 0;
        }
        return ((Integer) objArr[i2]).intValue();
    }

    private void zzY(int i, int i2, int i3, int i4) {
        if (!this.zzTP.containsKey(Integer.valueOf(i))) {
            zzF(i, i4);
        }
        this.zzTP.get(Integer.valueOf(i))[i3] = Integer.valueOf(i2);
    }

    private void zzZB(int i) {
        zzZQF.zzY(this.zzTP, Integer.valueOf(i));
    }

    public final int getEncoding() {
        return zzG(16, 0);
    }

    public final int zzUZ() {
        return zzG(1237, 0);
    }

    public final int zzV0() {
        return zzG(1236, 0);
    }

    public final void zzV1() {
        zzZB(19);
    }

    public final int zzV2() {
        return zzG(19, 0);
    }

    public final boolean zzV3() {
        return this.zzTP.containsKey(1230);
    }

    public final void zzV4() {
        zzZB(18);
    }

    public final int zzV5() {
        return zzG(18, 0);
    }

    public final int zzV6() {
        return zzG(18, 1);
    }

    public final int zzV7() {
        return zzG(17, 0);
    }

    public final void zzV8() {
        zzZB(15);
    }

    public final int zzV9() {
        return zzG(15, 0);
    }

    public final void zzVa() {
        zzZB(16);
    }

    public final HashMap<Integer, Object[]> zzVb() {
        return this.zzTP;
    }

    public final byte[] zzVf() throws Exception {
        zzZOR zzzor = new zzZOR();
        try {
            zzWV.zzZ(new zzXZ(zzzor), this);
            return zzzor.zzWy();
        } finally {
            zzzor.close();
        }
    }

    public final void zzZC(int i) {
        zzE(1237, i);
    }

    public final void zzZD(int i) {
        zzE(1236, i);
    }

    public final void zzZE(int i) {
        zzE(19, i);
    }

    public final void zzZF(int i) {
        zzY(18, i, 0, 2);
    }

    public final void zzZG(int i) {
        zzY(18, i, 1, 2);
    }

    public final void zzZH(int i) {
        zzE(17, i);
    }

    public final void zzZI(int i) {
        zzE(15, i);
    }

    public final void zzZJ(int i) {
        zzE(16, i);
    }
}
