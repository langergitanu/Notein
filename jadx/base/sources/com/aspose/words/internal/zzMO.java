package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzMO {
    private long zzDC;
    private zzO8 zzFs;

    private static zzMO zzX6(int i) {
        if (i == 15) {
            return new zzLH();
        }
        if (i == 22) {
            return new zzLE();
        }
        if (i == 49) {
            return new zzMQ();
        }
        if (i == 108) {
            return new zzL7();
        }
        if (i == 114) {
            return new zzMY();
        }
        if (i == 118) {
            return new zzMD();
        }
        if (i == 67) {
            return new zzLO();
        }
        if (i != 68) {
            switch (i) {
                case 2:
                    return new zzM1(false, false);
                case 3:
                    return new zzLW(false);
                case 4:
                    return new zzLV(false, false);
                case 5:
                    return new zzM1(false, true);
                case 6:
                    return new zzLV(false, true);
                case 7:
                    return new zzLY(false);
                case 8:
                    return new zzLZ(false);
                case 9:
                    return new zzLA();
                case 10:
                    return new zzL9();
                case 11:
                    return new zzLC();
                case 12:
                    return new zzLB();
                default:
                    switch (i) {
                        case 17:
                            return new zzLI();
                        case 18:
                            return new zzLJ();
                        case 19:
                            return new zzLG();
                        case 20:
                            return new zzLF();
                        default:
                            switch (i) {
                                case 24:
                                    return new zzLD();
                                case 25:
                                    return new zzLK();
                                case 26:
                                    return new zzM6();
                                case 27:
                                    return new zzM8();
                                case 28:
                                case 33:
                                    break;
                                case 29:
                                    return new zzMK();
                                case 30:
                                    return new zzMC();
                                case 31:
                                    return new zzLQ();
                                case 32:
                                    return new zzLP();
                                case 34:
                                    return new zzLS();
                                case 35:
                                    return new zzL8();
                                case 36:
                                    return new zzM9();
                                case 37:
                                    return new zzLM();
                                case 38:
                                    return new zzMP();
                                case 39:
                                    return new zzMU();
                                case 40:
                                    return new zzMN();
                                default:
                                    switch (i) {
                                        case 42:
                                            return new zzMM();
                                        case 43:
                                            return new zzLT();
                                        case 44:
                                            return new zzLR();
                                        case 45:
                                            return new zzMX(false);
                                        case 46:
                                            return new zzMV();
                                        case 47:
                                            return new zzM3();
                                        default:
                                            switch (i) {
                                                case 54:
                                                    return new zzMA();
                                                case 55:
                                                    return new zzMX(true);
                                                case 56:
                                                    return new zzM0(false);
                                                case 57:
                                                    return new zzLL();
                                                default:
                                                    switch (i) {
                                                        case 59:
                                                        case 60:
                                                        case 61:
                                                        case 62:
                                                        case 63:
                                                        case 64:
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case 71:
                                                                    return new zzMF();
                                                                case 72:
                                                                    return new zzME();
                                                                case 73:
                                                                    return new zzMB();
                                                                case 74:
                                                                    return new zzM5();
                                                                case 75:
                                                                    return new zzLN();
                                                                case 76:
                                                                case 77:
                                                                    break;
                                                                default:
                                                                    switch (i) {
                                                                        case 81:
                                                                            break;
                                                                        case 82:
                                                                            return new zzMJ();
                                                                        case 83:
                                                                            return new zzMH(true);
                                                                        case 84:
                                                                            return new zzMH(false);
                                                                        case 85:
                                                                            return new zzM1(true, false);
                                                                        case 86:
                                                                            return new zzLW(true);
                                                                        case 87:
                                                                            return new zzLV(true, false);
                                                                        case 88:
                                                                            return new zzM1(true, true);
                                                                        case 89:
                                                                            return new zzLV(true, true);
                                                                        case 90:
                                                                            return new zzLY(true);
                                                                        case 91:
                                                                            return new zzLZ(true);
                                                                        case 92:
                                                                            return new zzM0(true);
                                                                        case 93:
                                                                            return new zzMR();
                                                                        case 94:
                                                                            return new zzMT();
                                                                        case 95:
                                                                            return new zzMI();
                                                                        case 96:
                                                                            return new zzLX(true);
                                                                        case 97:
                                                                            return new zzLX(false);
                                                                        default:
                                                                            return new zzM7(i);
                                                                    }
                                                                    break;
                                                            }
                                                            return new zzMW(i);
                                                    }
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
        }
        return new zzML(i);
    }

    public static zzMO zzZ(int i, zzO8 zzo8, long j) throws Exception {
        zzMO zzmoZzX6 = zzX6(i);
        zzmoZzX6.zzFs = zzo8;
        zzmoZzX6.zzDC = j;
        zzmoZzX6.zzK0();
        return zzmoZzX6;
    }

    public final long zzJI() {
        return this.zzDC;
    }

    public final zzO8 zzJJ() {
        return this.zzFs;
    }

    public void zzK0() throws Exception {
    }
}
