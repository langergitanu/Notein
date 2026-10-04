package com.aspose.words.internal;

import androidx.core.view.InputDeviceCompat;
import com.aspose.words.EditingLanguage;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzZUN {
    private zzZV1 zz6S;
    private long zzDC;
    private int zzEx;

    private static zzZUN zzRP(int i) {
        if (i == 531) {
            return new zzZU9();
        }
        if (i == 532) {
            return new zzZU8();
        }
        if (i == 804) {
            return new zzZTV();
        }
        if (i == 805) {
            return new zzZTX();
        }
        if (i == 1045) {
            return new zzZUF();
        }
        if (i == 1046) {
            return new zzZUB();
        }
        if (i == 1564) {
            return new zzZTR();
        }
        if (i == 1565) {
            return new zzZU1();
        }
        switch (i) {
            case 30:
                return new zzZUG(i);
            case StyleIdentifier.LIGHT_LIST_ACCENT_6 /* 247 */:
                return new zzZUR();
            case StyleIdentifier.SUBTLE_REFERENCE /* 262 */:
                return new zzZTI();
            case StyleIdentifier.BOOK_TITLE /* 264 */:
                return new zzZTF();
            case StyleIdentifier.GRID_TABLE_2_ACCENT_3 /* 295 */:
                return new zzZTS();
            case StyleIdentifier.LIST_TABLE_1_LIGHT /* 322 */:
                return new zzZUJ();
            case 496:
                return new zzZUM();
            case 505:
                return new zzZUQ();
            case InputDeviceCompat.SOURCE_DPAD /* 513 */:
                return new zzZTM();
            case 521:
                return new zzZTE();
            case 529:
                return new zzZU4();
            case 544:
                return new zzZU5();
            case 552:
                return new zzZUD();
            case EditingLanguage.ITALIAN_ITALY /* 1040 */:
                return new zzZTP();
            case EditingLanguage.KOREAN /* 1042 */:
                return new zzZTQ();
            case EditingLanguage.ROMANIAN /* 1048 */:
                return new zzZUH();
            case 1051:
                return new zzZTT();
            case 1055:
                return new zzZTJ();
            case EditingLanguage.PERSIAN /* 1065 */:
                return new zzZUC();
            case 1313:
                return new zzZT8();
            case 1336:
                return new zzZTW();
            case 1791:
                return new zzZUO();
            case 2071:
                return new zzZUV();
            case EditingLanguage.SERBIAN_LATIN_SERBIA_AND_MONTENEGRO /* 2074 */:
                return new zzZTZ();
            case 2096:
                return new zzZUU();
            case 2368:
                return new zzZUK();
            case 2610:
                return new zzZUE();
            case 2881:
                return new zzZUI();
            case 3907:
                return new zzZT9();
            default:
                switch (i) {
                    case StyleIdentifier.COLORFUL_LIST_ACCENT_6 /* 258 */:
                        return new zzZTL();
                    case StyleIdentifier.COLORFUL_GRID_ACCENT_6 /* 259 */:
                        return new zzZTK();
                    case StyleIdentifier.SUBTLE_EMPHASIS /* 260 */:
                        return new zzZTH();
                    default:
                        switch (i) {
                            case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_3 /* 298 */:
                                return new zzZUA();
                            case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_3 /* 299 */:
                                return new zzZU2();
                            case 300:
                                return new zzZTO();
                            case 301:
                                return new zzZTN();
                            case 302:
                                return new zzZTG();
                            default:
                                switch (i) {
                                    case 523:
                                        return new zzZTA();
                                    case 524:
                                        return new zzZTB();
                                    case 525:
                                        return new zzZTC();
                                    case 526:
                                        return new zzZTD();
                                    case 527:
                                        return new zzZU3();
                                    default:
                                        switch (i) {
                                            case 762:
                                                return new zzZUP();
                                            case 763:
                                                return new zzZUS();
                                            case 764:
                                                return new zzZUT();
                                            default:
                                                return new zzZU7(i);
                                        }
                                }
                        }
                }
        }
    }

    public static zzZUN zzZ(int i, zzZV1 zzzv1, long j, int i2) throws Exception {
        zzZUN zzzunZzRP = zzRP(i);
        zzzunZzRP.zz6S = zzzv1;
        zzzunZzRP.zzDC = j;
        zzzunZzRP.zzEx = i2;
        zzzunZzRP.zzK0();
        return zzzunZzRP;
    }

    public final int getDataSize() {
        return this.zzEx - 6;
    }

    public void zzK0() throws Exception {
    }

    public final int zzLk() {
        return this.zzEx;
    }

    public final long zzmX() {
        return this.zzDC + ((long) this.zzEx);
    }

    public final zzZV1 zzmY() {
        return this.zz6S;
    }
}
