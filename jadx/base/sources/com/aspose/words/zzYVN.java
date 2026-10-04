package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYVN extends zzYCT {
    public static zzYAU zzv(zzYMD zzymd) {
        zzymd.isActive();
        zzymd.zzaa();
        return ((zzYVN) zzymd.zza9().zzxY(2)).zzYc6();
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzB(zzYMD zzymd) throws Exception {
        if (zzymd.zzYo1() != null) {
            zzymd.zzYo1().zzt(zzymd.zzYo0());
        }
        if (zzymd.zzYo0() != null) {
            zzymd.zzYo0().zzu(zzymd.zzYo1());
        }
        if (zzymd == zz6x()) {
            zzZ((zzymd.zzYo1() == null || zzymd.zzYo1().zza9() != this) ? null : zzymd.zzYo1());
        }
        if (zzymd == zz6w()) {
            zzY((zzymd.zzYo0() == null || zzymd.zzYo0().zza9() != this) ? null : zzymd.zzYo0());
        }
        if (zz6x() == null && zz6w() == null) {
            zzYc5();
        }
        zzymd.zzu(null);
        zzymd.zzt(null);
        zzymd.zzZ((zzZ6T) null);
    }

    @Override // com.aspose.words.zzTG, com.aspose.words.zzZ6T
    public final void zzW(zzZ6T zzz6t) throws Exception {
        super.zzW(zzz6t);
        zzYc5();
        zzYVR zzyvr = (zzYVR) zzX((zzYVQ) zz6x());
        if (((zzYVQ) zz6x()).zzZZJ() != zzyvr) {
            ((zzYVQ) zz6x()).zzZ(zzyvr, false);
        }
    }

    @Override // com.aspose.words.zzYCT, com.aspose.words.zzZ6T
    public final zzTF zzX(zzYMD zzymd) throws Exception {
        zzymd.zza9();
        int iZz60 = zzymd.zz60();
        if (iZz60 == 8 || iZz60 == 32) {
            if (zz6x() != null) {
                return (zzTF) zz6w();
            }
            zzYVN zzyvn = (zzYVN) ((zzYCT) zzYTo());
            zzYVN zzyvn2 = (zzYVN) ((zzYCT) zzYTp());
            zzZ(zzyvn != null ? (zzYVQ) zzyvn.zz6w() : null, zzyvn2 != null ? (zzYVQ) zzyvn2.zz6x() : null, new zzYVQ(), true);
            return (zzTF) zz6x();
        }
        if (iZz60 != 16384) {
            throw new IllegalStateException("Unexpected part type.");
        }
        zzYVR zzyvrZzY = ((zzYVI) zza9()).zzY((zzUZ) zzYc6().zzqh(2), true);
        zzyvrZzY.zza9();
        zzyvrZzY.zzZZJ();
        return zzyvrZzY;
    }

    public final void zzYzj() throws Exception {
        if (zz6x() == zz6w()) {
            return;
        }
        while (true) {
            zzYVQ zzyvq = (zzYVQ) zz6w();
            if (zzyvq == ((zzYVQ) zz6x())) {
                return;
            } else {
                zzyvq.zzZ((zzYVR) ((zzYVQ) zzyvq.zzYo0()).zzZZJ(), false);
            }
        }
    }

    public final zzYAU zzYzk() {
        return zzYc6();
    }
}
