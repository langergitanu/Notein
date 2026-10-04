package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzTZ extends zzU1 {

    public static class zzZ {
        private int zzRE;
        private zzUU zzRF;
        private int zzVQ;

        public zzZ(zzUU zzuu) {
            this.zzRF = zzuu;
        }

        public final int zzU9() {
            return this.zzRE;
        }

        public final int zzUa() {
            if (this.zzVQ >= this.zzRF.zzUe()) {
                return -1;
            }
            this.zzRE++;
            byte[] bArrZzUg = this.zzRF.zzUg();
            int i = this.zzVQ;
            this.zzVQ = i + 1;
            return bArrZzUg[i] & 255;
        }
    }

    private static boolean zzZ0(int i) {
        if (i >= 65 && i <= 90) {
            return true;
        }
        if (i >= 97 && i <= 122) {
            return true;
        }
        if ((i >= 48 && i <= 57) || i == 43 || i == 92 || i == 126) {
            return true;
        }
        if ((i >= 0 && i <= 8) || i == 11 || i == 12 || i == 127) {
            return true;
        }
        return i >= 14 && i <= 31;
    }

    private static boolean zzZ1(int i) {
        return i == 13 || i == 9 || i == 10 || i == 32;
    }

    private static boolean zzZ2(int i) {
        return i == 33 || i == 34 || i == 35 || i == 36 || i == 37 || i == 38 || i == 42 || i == 59 || i == 60 || i == 61 || i == 62 || i == 64 || i == 91 || i == 93 || i == 94 || i == 95 || i == 39 || i == 123 || i == 124 || i == 125;
    }

    private static boolean zzZ3(int i) {
        if (i >= 65 && i <= 90) {
            return true;
        }
        if (i < 97 || i > 122) {
            return (i >= 48 && i <= 57) || i == 39 || i == 40 || i == 41 || i == 44 || i == 45 || i == 46 || i == 47 || i == 58 || i == 63;
        }
        return true;
    }

    private static boolean zzZ4(int i) {
        return i == 61 || i == 92 || i == 126;
    }

    @Override // com.aspose.words.internal.zzU1
    public final String getName() {
        return "UTF-7";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    @Override // com.aspose.words.internal.zzU1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzUP zzZ(zzUU zzuu) {
        boolean z;
        byte[] bArrZzUf = zzuu.zzUf();
        int i = 0;
        if (zzuu.zzUd() < 3 || bArrZzUf[0] != 43) {
            z = false;
        } else {
            z = true;
            if (bArrZzUf[1] != 47 || bArrZzUf[2] != 118) {
            }
        }
        zzZ zzz = new zzZ(zzuu);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int iZzUa = zzz.zzUa();
            if (iZzUa < 0) {
                break;
            }
            if (zzZ4(iZzUa)) {
                i6++;
            } else if (iZzUa != 43) {
                if (!zzZ3(iZzUa)) {
                    if (zzZ2(iZzUa)) {
                        i7++;
                    } else if (!zzZ1(iZzUa)) {
                        i4++;
                    }
                }
                i3++;
            } else if (zzZ(zzz)) {
                i2++;
            } else {
                i5++;
            }
        }
        int i8 = i2 + i3;
        int i9 = i4 + i5;
        int iZzU9 = (int) ((i9 / zzz.zzU9()) * 100.0f);
        if (!z || i9 != 0) {
            if (z && i8 > i9 * 10) {
                i = 80;
            } else if (z || i2 != 0) {
                if (i8 > 3 && i2 > 3 && i9 == 0) {
                    i = 100;
                } else if (iZzU9 > 30) {
                    i = 10;
                } else if (i3 > 3 && i2 > 3) {
                    i = 50 - iZzU9;
                }
            }
        }
        int i10 = (i - (i6 * 10)) - (i7 * 10);
        if (i10 <= 0) {
            return null;
        }
        return new zzUP(this, i10);
    }

    private static boolean zzZ(zzZ zzz) {
        int iZzUa;
        do {
            iZzUa = zzz.zzUa();
            if (iZzUa < 0 || iZzUa == 45 || iZzUa == 10 || iZzUa == 13) {
                return true;
            }
        } while (zzZ0(iZzUa));
        return false;
    }
}
