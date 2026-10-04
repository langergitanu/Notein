package com.aspose.words.internal;

import android.graphics.Bitmap;
import androidx.core.view.ViewCompat;
import com.aspose.words.WarningType;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZRC {
    public int height;
    public int width;
    public int zz4g;
    public int zz4h;
    public int zz4i;
    public byte[] zz4b = null;
    public String zz4l = "BMP v. 3.x";
    public int zz4j = 0;
    public short zz4k = 24;
    public int zz4f = WarningType.MINOR_FORMATTING_LOSS_CATEGORY;
    public int zz4e = 65280;
    public int zz4d = 255;
    public int zz4c = ViewCompat.MEASURED_STATE_MASK;

    public zzZRC(Bitmap bitmap) {
        this.width = bitmap.getWidth();
        this.height = bitmap.getHeight();
    }
}
