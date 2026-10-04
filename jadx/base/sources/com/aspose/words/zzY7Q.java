package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY7Q {
    public static void zzQ(zzY7J zzy7j, zzY7X zzy7x) throws Exception {
        byte[] bArrZzDL;
        float fZzZ = zzY7B.zzZ(zzy7j, zzy7x, "x", 0.0f);
        float fZzZ2 = zzY7B.zzZ(zzy7j, zzy7x, "y", 0.0f);
        String strZzKM = zzy7x.zzKM("href");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzKM)) {
            bArrZzDL = zzy7j.zzAo(strZzKM);
            if (zzy7j.zzY0R()) {
                zzy7x.zzQ(strZzKM, bArrZzDL);
            }
        } else {
            bArrZzDL = null;
        }
        com.aspose.words.internal.zzP9 zzp9ZzZ = zzY7B.zzZ(zzy7j, zzy7x, (com.aspose.words.internal.zzP9) null);
        String strZzSE = zzy7x.zzZWe().zzSE("clip-path");
        com.aspose.words.internal.zzP8 zzp8ZzAr = com.aspose.words.internal.zzZYD.zzXk(strZzSE) ? zzy7j.zzAr(strZzSE) : null;
        if (bArrZzDL == null) {
            zzy7j.zzT(1, com.aspose.words.internal.zzZKN.format("Cannot load image \"{0}\"", strZzKM));
            bArrZzDL = com.aspose.words.internal.zzEF.zzDL();
        }
        com.aspose.words.internal.zzZP zzzp = new com.aspose.words.internal.zzZP(com.aspose.words.internal.zzZPY.zzG(fZzZ, fZzZ2), com.aspose.words.internal.zzZPW.zzG((float) zzY7B.zzZ(zzy7j, zzy7x, "width", 0.0d), (float) zzY7B.zzZ(zzy7j, zzy7x, "height", 0.0d)), bArrZzDL);
        if (zzp9ZzZ == null && zzp8ZzAr == null) {
            zzy7j.zzS(zzzp);
            return;
        }
        com.aspose.words.internal.zzG zzgZzPM = zzy7j.zzPM(true);
        zzgZzPM.zzW(zzp9ZzZ);
        zzgZzPM.zzZ(zzp8ZzAr);
        zzy7j.zzS(zzzp);
        zzy7j.zzZAD();
    }
}
