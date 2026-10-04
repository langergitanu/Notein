package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZO {
    public static zzZP zzZ(zzZP zzzp, zz6 zz6Var, zzA2 zza2, zzP9 zzp9) throws Exception {
        int imageType = zzzp.getImageType();
        if (imageType == 0 || imageType == 11) {
            return zzzp;
        }
        if (imageType == 2 || imageType == 3) {
            zzZ(zzzp, zza2, zz6Var, zzp9);
            return null;
        }
        switch (imageType) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return zzzp;
            default:
                return zzZP.zzY(zzzp);
        }
    }

    private static void zzZ(zzZP zzzp, zzA2 zza2, zz6 zz6Var, zzP9 zzp9) throws Exception {
        zzG zzgZzZ = zza2.zzZ(zzzp, zzp9);
        if (zzgZzZ == null) {
            return;
        }
        zz3.zzZ(zzgZzZ, zzzp.zzZb());
        zzgZzZ.zzZ(zz6Var);
    }
}
