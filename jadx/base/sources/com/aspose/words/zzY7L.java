package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY7L {
    public static com.aspose.words.internal.zzPY zzO(zzY7J zzy7j, zzY7X zzy7x) throws Exception {
        com.aspose.words.internal.zzG zzgZzPM = zzy7j.zzPM(false);
        Iterator<zzY7X> it = zzy7x.zzY1D().iterator();
        while (it.hasNext()) {
            zzY7S.zzV(zzy7j, it.next());
        }
        zzy7j.zzZAD();
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = new com.aspose.words.internal.zzH().zzZ((com.aspose.words.internal.zzZL) zzgZzPM);
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        try {
            zzYDY.zzZ(zzgZzPM, zzzq4ZzZ.getSize(), zzzor, new ImageSaveOptions(101), zzy7j.zzZqx());
            byte[] bArrZzWy = zzzor.zzWy();
            zzzor.close();
            com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4(0L, zzzq4ZzZ.getSize());
            float fZzZ = zzY7B.zzZ(zzy7j, zzy7x, "x", 0.0f);
            float fZzZ2 = zzY7B.zzZ(zzy7j, zzy7x, "y", 0.0f);
            float fZzZ3 = (float) zzY7B.zzZ(zzy7j, zzy7x, "width", 0.0d);
            float fZzZ4 = (float) zzY7B.zzZ(zzy7j, zzy7x, "height", 0.0d);
            com.aspose.words.internal.zzZQ4 zzzq42 = new com.aspose.words.internal.zzZQ4(fZzZ, fZzZ2, (float) com.aspose.words.internal.zzSA.pixelToPoint(fZzZ3), (float) com.aspose.words.internal.zzSA.pixelToPoint(fZzZ4));
            com.aspose.words.internal.zzOH zzoh = new com.aspose.words.internal.zzOH(bArrZzWy, 0);
            if (fZzZ3 > 0.0f && fZzZ4 > 0.0f) {
                zzoh.zzL(com.aspose.words.internal.zzP9.zzZ(zzzq4, zzzq42));
            }
            return zzoh;
        } catch (Throwable th) {
            zzzor.close();
            throw th;
        }
    }
}
