package com.aspose.words;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes6.dex */
public class FrameFormat {
    private zzZ9Q zzYvp;

    public FrameFormat(zzZ9Q zzz9q) {
        this.zzYvp = zzz9q;
    }

    private static boolean zzW(zzZ9Q zzz9q) {
        if (((Integer) zzz9q.fetchParaAttr(1302)).intValue() > 0) {
            return true;
        }
        int iIntValue = ((Integer) zzz9q.fetchParaAttr(1300)).intValue();
        if (iIntValue != 0 && iIntValue != -1) {
            return true;
        }
        int iIntValue2 = ((Integer) zzz9q.fetchParaAttr(1330)).intValue();
        return (iIntValue2 == 0 || iIntValue2 == 1) ? false : true;
    }

    private static boolean zzX(zzZ9Q zzz9q) {
        if (((Integer) zzz9q.fetchParaAttr(1292)).intValue() > 0) {
            return true;
        }
        int iIntValue = ((Integer) zzz9q.fetchParaAttr(1290)).intValue();
        return ((iIntValue == 0 || iIntValue == 1) && ((Integer) zzz9q.fetchParaAttr(1320)).intValue() == 2) ? false : true;
    }

    public static boolean zzY(zzZ9Q zzz9q) {
        if (zzX(zzz9q) || zzW(zzz9q) || ((zzZKP) zzz9q.fetchParaAttr(1430)).getValue() > 0 || ((Integer) zzz9q.fetchParaAttr(1310)).intValue() > 0) {
            return true;
        }
        return (((Integer) zzz9q.fetchParaAttr(1340)).intValue() == 0 && ((Integer) zzz9q.fetchParaAttr(1440)).intValue() == 0) ? false : true;
    }

    public double getHeight() {
        return ((double) ((zzZKP) this.zzYvp.fetchParaAttr(1430)).getValue()) / 20.0d;
    }

    public int getHeightRule() {
        return ((zzZKP) this.zzYvp.fetchParaAttr(1430)).zzZ4A();
    }

    public int getHorizontalAlignment() {
        return ((Integer) this.zzYvp.fetchParaAttr(1290)).intValue();
    }

    public double getHorizontalDistanceFromText() {
        return ((double) ((Integer) this.zzYvp.fetchParaAttr(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)).intValue()) / 20.0d;
    }

    public double getHorizontalPosition() {
        return ((double) ((Integer) this.zzYvp.fetchParaAttr(1292)).intValue()) / 20.0d;
    }

    public int getRelativeHorizontalPosition() {
        return ((Integer) this.zzYvp.fetchParaAttr(1320)).intValue();
    }

    public int getRelativeVerticalPosition() {
        return ((Integer) this.zzYvp.fetchParaAttr(1330)).intValue();
    }

    public int getVerticalAlignment() {
        return ((Integer) this.zzYvp.fetchParaAttr(1300)).intValue();
    }

    public double getVerticalDistanceFromText() {
        return ((double) ((Integer) this.zzYvp.fetchParaAttr(1490)).intValue()) / 20.0d;
    }

    public double getVerticalPosition() {
        return ((double) ((Integer) this.zzYvp.fetchParaAttr(1302)).intValue()) / 20.0d;
    }

    public double getWidth() {
        return ((double) ((Integer) this.zzYvp.fetchParaAttr(1310)).intValue()) / 20.0d;
    }

    public boolean isFrame() {
        return zzY(this.zzYvp);
    }
}
