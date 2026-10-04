package com.aspose.words;

import android.graphics.PointF;
import com.google.firebase.firestore.local.SQLitePersistence;

/* JADX INFO: loaded from: classes6.dex */
public class ThumbnailGeneratingOptions {
    private static long zzX2Q = com.aspose.words.internal.zzZPX.zzZm(600, SQLitePersistence.MAX_ARGS);
    private boolean zzX2S = true;
    private long zzX2R = zzX2Q;

    public boolean getGenerateFromFirstPage() {
        return this.zzX2S;
    }

    public PointF getThumbnailSize() {
        return com.aspose.words.internal.zzZPX.zzYB(this.zzX2R);
    }

    public void setGenerateFromFirstPage(boolean z) {
        this.zzX2S = z;
    }

    public void setThumbnailSize(PointF pointF) {
        this.zzX2R = com.aspose.words.internal.zzZPX.zzY(pointF);
    }

    public final long zzXVo() {
        return this.zzX2R;
    }
}
