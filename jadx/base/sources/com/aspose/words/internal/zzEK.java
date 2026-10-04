package com.aspose.words.internal;

import android.graphics.Bitmap;
import java.io.Closeable;

/* JADX INFO: loaded from: classes5.dex */
public class zzEK implements Closeable {
    private zzEG zzM;
    private boolean zzwh;
    private int zzwi;
    private Bitmap zzwj;

    private void zzGY() {
        Bitmap bitmap = this.zzwj;
        if (bitmap != null) {
            bitmap.recycle();
            this.zzwj = null;
        }
        this.zzM = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzGY();
    }

    public final void dispose() {
        zzGY();
    }

    public final int getHeight() {
        return this.zzwj.getHeight();
    }

    public final float getHorizontalResolution() {
        if (this.zzwh) {
            return 96.0f;
        }
        return (float) this.zzM.getHorizontalResolution();
    }

    public final int getImageType() {
        return this.zzwi;
    }

    public final float getVerticalResolution() {
        if (this.zzwh) {
            return 96.0f;
        }
        return (float) this.zzM.getVerticalResolution();
    }

    public final int getWidth() {
        return this.zzwj.getWidth();
    }

    public final void zzDV() {
        if (this.zzwh) {
            this.zzM = zzEG.zzZ(this.zzwj.getWidth(), this.zzwj.getHeight(), 96.0d, 96.0d);
            this.zzwh = false;
        }
    }

    public final Bitmap zzDW() {
        return this.zzwj;
    }

    public final zzEG zzQ() {
        return this.zzM;
    }

    public final void zzV(Bitmap bitmap) {
        this.zzwj = bitmap;
    }

    public final void zzVX(int i) {
        this.zzwi = i;
    }

    public final void zzY(Bitmap bitmap, int i, zzEG zzeg) {
        this.zzwj = bitmap;
        this.zzwi = i;
        this.zzM = zzeg;
    }

    public final void zzZ(zzEG zzeg, int i) throws Exception {
        this.zzwh = zzEF.zzVW(i) || zzeg.zzDR();
    }

    public final void zzZ(zzEG zzeg) {
        this.zzM = zzeg;
    }
}
