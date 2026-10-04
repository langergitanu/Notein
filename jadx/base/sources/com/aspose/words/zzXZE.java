package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzXZE extends zzXZI {
    static zzXZI zzWSt;
    static zzXZE zzWSu;
    private com.aspose.words.internal.zzPV zzHv;
    private com.aspose.words.internal.zzPV zzHw;
    private int zzWSv;

    static {
        com.aspose.words.internal.zzPV zzpv = com.aspose.words.internal.zzPV.zzHZ;
        zzWSu = new zzXZE(0, zzpv, zzpv);
        com.aspose.words.internal.zzPV zzpv2 = com.aspose.words.internal.zzPV.zzHZ;
        zzWSt = new zzXZE(17, zzpv2, zzpv2);
    }

    private zzXZE(int i, com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzPV zzpv2) {
        this.zzWSv = i;
        this.zzHv = zzpv;
        this.zzHw = zzpv2;
    }

    public static zzXZE zzL(Shading shading) {
        com.aspose.words.internal.zzPV zzpvZzYbK = shading.zzYbK();
        if (zzpvZzYbK == null) {
            zzpvZzYbK = com.aspose.words.internal.zzPV.zzHZ;
        }
        int iZzhj = zzhj(shading.getTexture());
        return (iZzhj == 0 || (shading.getTexture() == 0 && com.aspose.words.internal.zzPV.zzZ(zzpvZzYbK, com.aspose.words.internal.zzPV.zzHZ))) ? zzWSu : shading.getTexture() == 0 ? new zzXZE(1, zzpvZzYbK, com.aspose.words.internal.zzPV.zzHZ) : new zzXZE(iZzhj, shading.zzYbJ(), zzpvZzYbK);
    }

    private static int zzhj(int i) {
        if (i == 65535) {
            return 0;
        }
        switch (i) {
            case 2:
            case 3:
                return 17;
            case 4:
            case 5:
            case 6:
                return 4;
            default:
                switch (i) {
                    case 14:
                        return 5;
                    case 15:
                        return 6;
                    case 16:
                        return 7;
                    case 17:
                        return 8;
                    case 18:
                        return 9;
                    case 19:
                        return 10;
                    case 20:
                        return 11;
                    case 21:
                        return 12;
                    case 22:
                        return 13;
                    case 23:
                        return 14;
                    case 24:
                        return 15;
                    case 25:
                        return 16;
                    default:
                        switch (i) {
                            case 35:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                                return 4;
                            case 36:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                                break;
                            case 37:
                            case 38:
                            case 39:
                                return 17;
                            default:
                                return 1;
                        }
                        break;
                }
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return 2;
        }
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzXZE.class) {
            return false;
        }
        zzXZE zzxze = (zzXZE) obj;
        return zzxze.zzWSv == this.zzWSv && com.aspose.words.internal.zzZKO.equals(zzxze.zzHv, this.zzHv) && com.aspose.words.internal.zzZKO.equals(zzxze.zzHw, this.zzHw);
    }

    public final int getPatternType() {
        return this.zzWSv;
    }

    public int hashCode() {
        int i = this.zzWSv * 397;
        com.aspose.words.internal.zzPV zzpv = this.zzHv;
        int iHashCode = (i ^ (zzpv != null ? zzpv.hashCode() : 0)) * 397;
        com.aspose.words.internal.zzPV zzpv2 = this.zzHw;
        return iHashCode ^ (zzpv2 != null ? zzpv2.hashCode() : 0);
    }

    public final com.aspose.words.internal.zzPV zzXQW() {
        return this.zzHw;
    }

    public final com.aspose.words.internal.zzPV zzXQX() {
        return this.zzHv;
    }
}
