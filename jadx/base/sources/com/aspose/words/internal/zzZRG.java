package com.aspose.words.internal;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZRG extends zzZRJ {
    public zzZRG(zzOH zzoh) {
        Bitmap bitmapZzR = zzR(zzoh);
        this.zzVJ = bitmapZzR;
        zzZ(zzZRJ.zzZ(bitmapZzR, zzoh.zzNa(), zzoh.zzNb()));
    }

    private static Bitmap zzR(zzOH zzoh) {
        if (zzoh == null || zzoh.getImageBytes() == null || zzoh.getImageBytes().length == 0) {
            return zzXN.zzWR();
        }
        try {
            return new zzXN(zzoh).zzDW();
        } catch (Exception unused) {
            return zzXN.zzWR();
        }
    }
}
