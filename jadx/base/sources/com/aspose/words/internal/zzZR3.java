package com.aspose.words.internal;

import android.graphics.Bitmap;
import com.aspose.words.internal.zzZR5;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZR3 extends zzZR6 {
    @Override // com.aspose.words.internal.zzZR6
    public final void zzR(Bitmap bitmap, zzZOP zzzop, zzZR5.zzZ zzz) throws Exception {
        zzz.zzO(bitmap);
        if (bitmap == null) {
            zzZRN.zzZM(zzzop);
            return;
        }
        zzXN zzxn = new zzXN(bitmap.getWidth(), bitmap.getHeight(), (float) zzz.zzlw(), (float) zzz.zzlv());
        zzxn.zzV(bitmap);
        zzZRN.zzY(zzxn, zzzop, zzz.zzlo().intValue(), zzz.zzlr().intValue(), zzz.zzls().byteValue());
    }

    @Override // com.aspose.words.internal.zzZR6
    public final void zzS(Bitmap bitmap, zzZOP zzzop, zzZR5.zzZ zzz) throws Exception {
        zzz.zzO(bitmap);
        zzZRN.zzX(bitmap, zzzop);
    }

    @Override // com.aspose.words.internal.zzZR6
    public final void zzT(Bitmap bitmap, zzZOP zzzop, zzZR5.zzZ zzz) throws Exception {
        zzz.zzO(bitmap);
        zzZRN.zzZ(bitmap, new zzZK6(zzzop), zzz.zzlq().intValue());
    }

    @Override // com.aspose.words.internal.zzZR6
    public final void zzU(Bitmap bitmap, zzZOP zzzop, zzZR5.zzZ zzz) throws Exception {
        zzz.zzO(bitmap);
        zzZRN.zzZ(bitmap, new zzZK6(zzzop));
    }

    @Override // com.aspose.words.internal.zzZR6
    public final void zzV(Bitmap bitmap, zzZOP zzzop, zzZR5.zzZ zzz) throws Exception {
        zzz.zzO(bitmap);
        zzZRN.zzY(bitmap, zzzop);
    }
}
