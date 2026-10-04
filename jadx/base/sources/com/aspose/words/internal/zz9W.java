package com.aspose.words.internal;

import androidx.core.view.InputDeviceCompat;
import com.aspose.words.EditingLanguage;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: loaded from: classes5.dex */
final class zz9W extends zzA0 implements zzG8 {
    private zzA4 zzFG;
    private zzG6 zzqY;
    private zzZT3 zzqZ;
    private zzZTY zzr0;

    public zz9W(zzA1 zza1, zzG6 zzg6, boolean z) {
        super(zza1, z);
        this.zzqY = zzg6;
        this.zzr0 = new zzZTY(zza1.zzAg(), this);
    }

    private zzGA zzFk() {
        return this.zzFG.zzAl().zzFk();
    }

    private zzGC zzMK() {
        return this.zzFG.zzAl().zzMK();
    }

    private void zzV3(int i) {
        zzI().zzZ(2, 3, "'{0}' binary raster operation is not supported.", zz9D.zzUQ(i));
        zzZR(true);
    }

    private void zzXF(int i) {
        zzI().zzZ(2, 3, "{0} raster operation is not supported.", zz9D.zzUR(i));
        zzZR(true);
    }

    private void zzXG(int i) {
        zzI().zzZ(2, 3, "Record with '{0}' type is not supported.", Integer.valueOf(i));
    }

    private void zzXH(int i) {
        zzI().zzZ(2, 3, "'{0}' record is not supported.", zz9D.zzUS(i));
    }

    private void zzZ(zzZU0 zzzu0) throws Exception {
        if (zzzu0.isEmpty()) {
            return;
        }
        if (zz8I.zzUI(zzMK().zzFq())) {
            this.zzFG.zzZ(zzzu0.zzJL(), true, zzzu0.zzJB());
        } else if (this.zzqY.zzFj()) {
            this.zzFG.zzZ(zzzu0.zzJL(), true, zzzu0.zzJB(), this.zzr0.zzmO().zzJp());
        } else {
            zzV3(zzMK().zzFq());
            this.zzFG.zzZ(zzzu0.zzJL(), true, zzzu0.zzJB());
        }
    }

    @Override // com.aspose.words.internal.zzA0
    public final zzG zzAb() throws Exception {
        zzZT3 zzzt3 = new zzZT3(zzKp());
        this.zzqZ = zzzt3;
        zzA4 zza4 = new zzA4(zzzt3, this.zzqY);
        this.zzFG = zza4;
        this.zzr0.play();
        return zza4.zzMN();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2  */
    @Override // com.aspose.words.internal.zzG8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzMO() throws Exception {
        int type = this.zzr0.zzmO().getType();
        if (type == 531) {
            zzZ((zzZU9) this.zzr0.zzmO().zzmM());
        } else if (type != 532) {
            if (type == 804 || type == 805) {
                zzZ((zzZU0) this.zzr0.zzmO().zzmM());
            } else if (type != 1045 && type != 1046) {
                if (type != 1048) {
                    if (type == 1049) {
                        zzXH(this.zzr0.zzmO().getType());
                    } else if (type != 1564) {
                        if (type != 1565) {
                            switch (type) {
                                case 30:
                                case 53:
                                case 55:
                                case StyleIdentifier.LIGHT_LIST_ACCENT_6 /* 247 */:
                                case StyleIdentifier.GRID_TABLE_2_ACCENT_3 /* 295 */:
                                case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_5 /* 313 */:
                                case StyleIdentifier.LIST_TABLE_1_LIGHT /* 322 */:
                                case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_1 /* 329 */:
                                case 496:
                                case 505:
                                case InputDeviceCompat.SOURCE_DPAD /* 513 */:
                                case 529:
                                case 544:
                                case 561:
                                case 564:
                                case EditingLanguage.ITALIAN_ITALY /* 1040 */:
                                case EditingLanguage.KOREAN /* 1042 */:
                                case EditingLanguage.AFRIKAANS /* 1078 */:
                                case 1574:
                                case 1791:
                                case 3379:
                                    break;
                                case 552:
                                    zzZ((zzZUD) this.zzr0.zzmO().zzmM());
                                    break;
                                case 1051:
                                case 1336:
                                case 2071:
                                case EditingLanguage.SERBIAN_LATIN_SERBIA_AND_MONTENEGRO /* 2074 */:
                                case 2096:
                                    break;
                                case 1055:
                                    zzZ((zzZTJ) this.zzr0.zzmO().zzmM());
                                    break;
                                case EditingLanguage.PERSIAN /* 1065 */:
                                    zzZ((zzZUC) this.zzr0.zzmO().zzmM());
                                    break;
                                case 1313:
                                    zzZ((zzZT8) this.zzr0.zzmO().zzmM());
                                    break;
                                case 1352:
                                    break;
                                case 2368:
                                case 2881:
                                case 3907:
                                    zzZ((zzZUL) this.zzr0.zzmO().zzmM());
                                    break;
                                case 2610:
                                    zzZ((zzZUE) this.zzr0.zzmO().zzmM());
                                    break;
                                default:
                                    switch (type) {
                                        case StyleIdentifier.COLORFUL_LIST_ACCENT_6 /* 258 */:
                                        case StyleIdentifier.COLORFUL_GRID_ACCENT_6 /* 259 */:
                                        case StyleIdentifier.SUBTLE_EMPHASIS /* 260 */:
                                        case StyleIdentifier.INTENSE_EMPHASIS /* 261 */:
                                        case StyleIdentifier.SUBTLE_REFERENCE /* 262 */:
                                        case StyleIdentifier.INTENSE_REFERENCE /* 263 */:
                                        case StyleIdentifier.BOOK_TITLE /* 264 */:
                                            break;
                                        default:
                                            switch (type) {
                                                case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_3 /* 298 */:
                                                    zzZ((zzZUA) this.zzr0.zzmO().zzmM());
                                                    break;
                                                case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_3 /* 299 */:
                                                    zzZ((zzZU2) this.zzr0.zzmO().zzmM());
                                                    break;
                                                case 300:
                                                case 301:
                                                case 302:
                                                    break;
                                                default:
                                                    switch (type) {
                                                        case 521:
                                                        case 522:
                                                        case 523:
                                                        case 524:
                                                        case 525:
                                                        case 526:
                                                        case 527:
                                                            break;
                                                        default:
                                                            switch (type) {
                                                                case 762:
                                                                case 763:
                                                                case 764:
                                                                    break;
                                                                default:
                                                                    zzXG(this.zzr0.zzmO().getType());
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            zzZ((zzZU1) this.zzr0.zzmO().zzmM());
                        }
                    }
                }
            }
        }
        this.zzqZ.zzZ(this.zzr0.zzmO());
        if (this.zzFG.zzML()) {
            zzZR(true);
        }
        return (zzA9() && zzML()) ? false : true;
    }

    private void zzZ(zzZU9 zzzu9) throws Exception {
        this.zzFG.zzZ(zzP8.zzT(zzMK().zzFn(), zzzu9.zzYK()), true, false);
    }

    private void zzZ(zzZUD zzzud) throws Exception {
        this.zzFG.zzZ((zz8O) zzFk().zzWd(zzzud.zzmQ()), (zzOU) null, zzMK().zzWf(zzzud.zzmR()));
    }

    private void zzZ(zzZUC zzzuc) throws Exception {
        this.zzFG.zzZ((zz8O) zzFk().zzWd(zzzuc.zzmQ()), new zzOU(zzMK().zzWf(zzzuc.zzmR()), zzzuc.getWidth()), (zzPY) null);
    }

    private void zzZ(zzZUA zzzua) throws Exception {
        this.zzFG.zzZ((zz8O) zzFk().zzWd(zzzua.zzmQ()), new zzOU(zzPV.zzKa), (zzPY) null);
    }

    private void zzZ(zzZU2 zzzu2) throws Exception {
        this.zzFG.zzZ((zz8O) zzFk().zzWd(zzzu2.zzmQ()), (zzOU) null, zzMK().zzZ1());
    }

    private void zzZ(zzZT8 zzzt8) throws Exception {
        zzZ(zzzt8.zzZT(), zzzt8.zzY(zzMK().zzZr(), zzMK().zzFs().zzQ(zzMK().zzZr()), zzMK().zzFp(), zzKp().zzMk(), zzKp().zzAt().zzFF()), null, false);
    }

    private void zzZ(zzZUE zzzue) throws Exception {
        if (zzzue.isOpaque()) {
            this.zzFG.zzt(zzzue.zzJH());
        }
        zzZ(zzzue.zzZT(), zzzue.zzY(zzMK().zzZr(), zzMK().zzFs().zzQ(zzMK().zzZr()), zzMK().zzFp(), zzKp().zzMk(), zzKp().zzAt().zzFF()), zzzue.zzmS() ? zzP8.zzM(zzzue.zzJH()) : null, zzzue.zzmT() != null);
    }

    private void zzZ(long j, zz8N zz8n, zzP8 zzp8, boolean z) throws Exception {
        if (zzMK().zzFr()) {
            j = zzMK().zzFn();
        }
        zz8M zz8mZzZ = zz8M.zzZ(this.zzFG.zzAl().zzA1(), zz8n, j, z, zzp8);
        zzA4 zza4 = this.zzFG;
        zzG zzgZzyv = zz8mZzZ.zzyv();
        zz8mZzZ.zzyA();
        zza4.zzJ(zzgZzyv);
    }

    private void zzZ(zzZTJ zzztj) throws Exception {
        this.zzFG.zzZ(zzztj.getPosition(), zzztj.zzmK());
    }

    private void zzZ(zzZUL zzzul) throws Exception {
        if (zz8I.zzUJ(zzzul.zzJP())) {
            zz8I.zzZ(zzzul, this.zzFG, zzzul.zzT(zzMK().zzJb(), zzMK().zzOK()));
        } else if (!this.zzqY.zzL(zzzul.zzJP(), zzzul.zzJM())) {
            zzXF(zzzul.zzJP());
            zz8I.zzY(zzzul, this.zzFG, zzzul.zzT(zzMK().zzJb(), zzMK().zzOK()));
        } else {
            this.zzFG.zzZ(new zz83(zzzul, zzMK().zzJb(), zzMK().zzOK()), this.zzr0.zzmO().zzJp());
        }
    }

    private void zzZ(zzZU1 zzzu1) throws Exception {
        int iZzJP = zzzu1.zzJP();
        if (iZzJP != 11141161) {
            if (iZzJP != 15728673) {
                this.zzFG.zzu(zzzu1.zzJH());
            } else {
                this.zzFG.zzu(zzzu1.zzJH());
            }
        }
    }
}
