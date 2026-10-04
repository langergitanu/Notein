package com.aspose.words;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes6.dex */
public class PageInfo {
    private static int[] zzXHH = new int[18];
    private long zzEp;
    private zzZ6P zzXHK;
    private boolean zzXHL;
    private int zzXHM;
    private boolean zzXHJ = false;
    private boolean zzXHI = false;

    public PageInfo(zzZ6P zzz6p) throws Exception {
        this.zzEp = 0L;
        this.zzEp = com.aspose.words.internal.zzZPW.zzG(zzz6p.getWidth(), zzz6p.getHeight());
        this.zzXHM = ((zzYN8) zzz6p.zzYgm).getPaperTray();
        this.zzXHL = ((zzYN8) zzz6p.zzYgm).zzZ3();
        this.zzXHK = zzz6p;
    }

    private long zzP(float f, float f2, float f3) {
        return com.aspose.words.internal.zzSA.zzY(this.zzEp, f, f2, f3);
    }

    public boolean getColored() throws Exception {
        if (this.zzXHI) {
            return this.zzXHJ;
        }
        if (this.zzXHK == null) {
            throw new IllegalStateException("Property cannot be evaluated.");
        }
        zzZ72 zzz72 = new zzZ72();
        zzZ6P zzz6p = this.zzXHK;
        boolean zZzY = com.aspose.words.internal.zzA.zzY((com.aspose.words.internal.zzZL) zzz72.zzZ(zzz6p, zzz6p.zzYfy.zzZqg()));
        this.zzXHJ = zZzY;
        this.zzXHI = true;
        return zZzY;
    }

    public float getHeightInPoints() {
        return com.aspose.words.internal.zzZPW.zzYz(this.zzEp);
    }

    public boolean getLandscape() {
        return this.zzXHL;
    }

    public int getPaperSize() {
        return zzY0C.zzX(com.aspose.words.internal.zzSA.zzr(Float.intBitsToFloat((int) this.zzEp)), com.aspose.words.internal.zzSA.zzr(com.aspose.words.internal.zzZPW.zzYz(this.zzEp)), this.zzXHL);
    }

    public int getPaperTray() {
        return this.zzXHM;
    }

    public PointF getSizeInPixels(float f, float f2, float f3) {
        return com.aspose.words.internal.zzZPX.zzYB(zzP(f, f2, f3));
    }

    public PointF getSizeInPoints() {
        return com.aspose.words.internal.zzZPW.zzYB(this.zzEp);
    }

    public float getWidthInPoints() {
        return Float.intBitsToFloat((int) this.zzEp);
    }

    public PointF getSizeInPixels(float f, float f2) {
        return com.aspose.words.internal.zzZPX.zzYB(zzP(f, f2, f2));
    }
}
