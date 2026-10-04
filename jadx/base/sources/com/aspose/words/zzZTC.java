package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZTC {
    public static int zzZ(byte[] bArr, boolean z, int i, zzZTN zzztn) throws Exception {
        zzZU0 zzzty;
        com.aspose.words.internal.zzXC zzxcZz3 = com.aspose.words.internal.zzIL.zz3(bArr);
        int iZzY = zzztn.zzYK9.zzY(zzxcZz3);
        if (!z && !com.aspose.words.internal.zzIS.zzWm(iZzY)) {
            zzztn.zzYKb.zzEl(iZzY).zzYKs++;
            return iZzY;
        }
        switch (com.aspose.words.internal.zzEF.zzZU(bArr)) {
            case 2:
            case 3:
            case 4:
                zzzty = new zzZTY(zzxcZz3, bArr);
                break;
            case 5:
            case 6:
            case 7:
                zzzty = new zzZTZ(zzxcZz3, bArr, i);
                break;
            default:
                throw new IllegalStateException("Not expected other image formats here.");
        }
        zzZTW zzztw = new zzZTW();
        zzztw.zzZii().zzE7(zzzty.getImageType());
        zzztw.zzYKv = zzzty.getImageType() != 4 ? zzzty.getImageType() : 3;
        zzztw.zzYKu = zzzty.getImageType();
        zzztw.zzYKt = zzzty.zzZiM().zzWw();
        zzztw.tag = 255;
        zzztw.zzYKs = 1;
        zzztw.zzWo(zzztn.zzYKb instanceof zzZTA);
        zzztw.zzZ(zzzty);
        if (!com.aspose.words.internal.zzIS.zzWm(iZzY)) {
            zzztn.zzYKb.zzZ(zzztw);
            return iZzY;
        }
        int iZzZ = zzztn.zzYKb.zzZ(zzztw);
        zzztn.zzYK9.zzZ(zzxcZz3, iZzZ);
        return iZzZ;
    }
}
