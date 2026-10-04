package com.aspose.words.internal;

import com.aspose.words.EditingLanguage;
import com.aspose.words.StyleIdentifier;
import com.aspose.words.internal.zz8D;

/* JADX INFO: loaded from: classes5.dex */
final class zzZT6 extends zz8D implements zzG8 {
    private zzZT3 zz6T;
    private zz8Q zzCJ;
    private zzZTY zzr0;

    private zzZT6(zzA1 zza1, zz8Q zz8q, zzG6 zzg6) {
        super(zzg6);
        this.zzr0 = new zzZTY(zza1.zzAg(), this);
        this.zzCJ = zz8q;
        this.zz6T = new zzZT3(zza1, true, false, true);
    }

    private zz8E zzW(zz8D.zzY zzy) throws Exception {
        zz8D.zzW zzw = (zz8D.zzW) zzZKW.zzZ(zzy, zz8D.zzW.class);
        if (zzw == null || zzw.zzJP() != 8913094 || this.zzoF.get(0) != zzw) {
            return null;
        }
        if (this.zzoF.size() > 1 && zzAN.zzX(this.zzoF.get(1).zzyb(), zzw.zzyb())) {
            return null;
        }
        zzXN zzxn = new zzXN(zzw.zzya().zzJZ());
        try {
            zzZQ5 zzzq5ZzJO = zzw.zzya().zzJO();
            zzXN zzxn2 = new zzXN(zzzq5ZzJO.getWidth(), zzzq5ZzJO.getHeight());
            for (int i = 0; i < zzzq5ZzJO.getWidth(); i++) {
                try {
                    for (int i2 = 0; i2 < zzzq5ZzJO.getHeight(); i2++) {
                        zzPV zzpv = new zzPV(zzxn.getPixel(zzzq5ZzJO.getX() + i, zzzq5ZzJO.getY() + i2));
                        if (zzpv.zzPC() < 200 || zzpv.zzPB() < 200 || zzpv.zzPA() < 200) {
                            zzxn2.zzZ(i, i2, zzpv);
                        } else {
                            zzxn2.zzZ(i, i2, zzPV.zzI0);
                        }
                    }
                } catch (Throwable th) {
                    zzxn2.dispose();
                    throw th;
                }
            }
            zz8E zz8e = new zz8E();
            zz8e.zzUH(zzy.zzJp());
            zz8e.setAction(3);
            zz8e.zzo(zzy.zzyb());
            zz8e.zzZP(true);
            zzZOR zzzor = new zzZOR();
            try {
                zzxn2.zzV(zzzor);
                zz8e.zzU(new zzZP(zzy.zzyb().zzZE(), zzy.zzyb().getSize(), zzzor.zzWy()));
                zzzor.close();
                zzxn2.dispose();
                zzxn.dispose();
                return zz8e;
            } catch (Throwable th2) {
                zzzor.close();
                throw th2;
            }
        } catch (Throwable th3) {
            zzxn.dispose();
            throw th3;
        }
    }

    public static void zzZ(zzA1 zza1, zz8Q zz8q, zzG6 zzg6) throws Exception {
        zzZT6 zzzt6 = new zzZT6(zza1, zz8q, zzg6);
        zzzt6.zzr0.play();
        zzg6.zzT(zzzt6.zzyc());
    }

    @Override // com.aspose.words.internal.zzG8
    public final boolean zzMO() throws Exception {
        switch (this.zzr0.zzmO().getType()) {
            case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_3 /* 298 */:
            case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_3 /* 299 */:
            case 531:
            case 552:
            case EditingLanguage.PERSIAN /* 1065 */:
                zzUG(this.zzr0.zzmO().zzJp());
                break;
            case 804:
            case 805:
            case EditingLanguage.ROMANIAN /* 1048 */:
            case 1051:
            case 1336:
            case 1564:
            case 2071:
            case EditingLanguage.SERBIAN_LATIN_SERBIA_AND_MONTENEGRO /* 2074 */:
            case 2096:
                zzZ((zzZU0) this.zzr0.zzmO().zzmM());
                break;
            case 1055:
            case 1313:
            case 1565:
            case 2610:
                zzUG(this.zzr0.zzmO().zzJp());
                break;
            case 2368:
            case 2881:
            case 3907:
                zzZ(this.zzr0.zzmO().zzJp(), new zz83((zzZUL) this.zzr0.zzmO().zzmM(), this.zz6T.zzMK().zzJb(), this.zz6T.zzMK().zzOK()), this.zz6T.zzMK().zzFt().zzMq());
                break;
        }
        this.zz6T.zzZ(this.zzr0.zzmO());
        return this.zzr0.zzmO().zzJp() < this.zzCJ.zzyG();
    }

    private void zzZ(zzZU0 zzzu0) throws Exception {
        if (zzzu0.isEmpty()) {
            return;
        }
        zzOU zzouZzZ2 = this.zz6T.zzMK().zzZ2();
        zzPY zzpyZzZ1 = this.zz6T.zzMK().zzZ1();
        if (zzouZzZ2 == null && zzpyZzZ1 == null) {
            return;
        }
        zzZQ4 zzzq4ZzY = zzP6.zzY(zzzu0.zzJL(), zzouZzZ2 != null ? zzouZzZ2.getWidth() / 2.0f : 0.0f);
        int iZzFq = this.zz6T.zzMK().zzFq();
        if (zz8I.zzUI(iZzFq)) {
            zzZ(this.zzr0.zzmO().zzJp(), zzzq4ZzY, this.zz6T.zzMK().zzFt().zzMq());
        } else {
            zzZ(this.zzr0.zzmO().zzJp(), iZzFq, zzzq4ZzY, this.zz6T.zzMK().zzFt().zzMq());
        }
    }

    @Override // com.aspose.words.internal.zz8D
    public final zz8E zzZ(zz8D.zzY zzy) throws Exception {
        zz8E zz8eZzW = zzW(zzy);
        return zz8eZzW != null ? zz8eZzW : super.zzZ(zzy);
    }
}
