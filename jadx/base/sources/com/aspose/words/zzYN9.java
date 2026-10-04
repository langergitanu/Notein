package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYN9 {
    private int zzXHA;
    private int zzXHB;
    private int zzXHC;
    private int zzXHD;
    private boolean zzXHu;
    private boolean zzXHv;
    private int zzXHw;
    private boolean zzXHx;
    private boolean zzXHy;
    private int zzXHz;
    private int zzYWh;

    public zzYN9(zzYN7 zzyn7) {
        this.zzXHD = zzyn7.zzZRi();
        this.zzXHC = zzyn7.zzZRh();
        this.zzXHB = Math.abs(zzyn7.zzZRg());
        this.zzXHA = Math.abs(zzyn7.zzZRf());
        this.zzXHz = zzyn7.zzYLq();
        this.zzYWh = zzyn7.getMultiplePages();
        this.zzXHu = zzyn7.zzYq8();
        this.zzXHw = zzyn7.getOrientation();
        this.zzXHv = zzyn7.zzYq9();
        this.zzXHy = zzyn7.zzYqb();
        this.zzXHx = zzyn7.zzYqa();
    }

    private boolean zzRJ(boolean z) {
        int i = this.zzYWh;
        if (i != 0) {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    return this.zzXHw == 2 && z;
                }
                if (i == 4) {
                    return this.zzXHw == 2 && !z;
                }
                throw new IllegalStateException("Unexpected multiple page setup value.");
            }
            if (this.zzXHv && !z) {
                return true;
            }
        }
        return false;
    }

    private int zzRK(boolean z) {
        return zzRJ(z) ? this.zzXHD : this.zzXHC;
    }

    private int zzRL(boolean z) {
        return zzRJ(z) ? this.zzXHC : this.zzXHD;
    }

    private int zzRM(boolean z) {
        return (zzYqs() && z) ? this.zzXHB : this.zzXHA;
    }

    private int zzRN(boolean z) {
        return (zzYqs() && z) ? this.zzXHA : this.zzXHB;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int zzS(int i, boolean z, int i2) {
        int i3 = this.zzYWh;
        boolean z2 = true;
        if (i3 == 0 || i3 == 1) {
            boolean z3 = this.zzXHv;
            if (z3 ? this.zzXHy : !this.zzXHy) {
                if (i != (z3 || this.zzXHw == 2 ? 1 : 3)) {
                    z2 = false;
                }
            } else {
                boolean z4 = z || !(this.zzXHu || i3 == 1);
                if (this.zzXHx) {
                    z4 = !z4;
                }
                if (i != (z4 ? 0 : 2)) {
                }
            }
        } else {
            if (i3 != 2 && i3 != 3 && i3 != 4) {
                throw new IllegalStateException("Unexpected multiple page setup value.");
            }
            if (this.zzXHw == 1) {
                if (i != (z ? 1 : 3)) {
                }
            } else {
                if (i3 == 4) {
                    z = !z;
                }
                int i4 = z ? 0 : 2;
                boolean z5 = i3 != 2 ? !this.zzXHv : this.zzXHv && this.zzXHy;
                boolean z6 = (z5 && i2 == 1) ? false : true;
                if ((!z5 || i != 1) && (!z6 || i != i4)) {
                }
            }
        }
        if (z2) {
            return this.zzXHz;
        }
        return 0;
    }

    private boolean zzYqs() {
        int i = this.zzYWh;
        if (i != 0 && i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                throw new IllegalStateException("Unexpected multiple page setup value.");
            }
            if (this.zzXHw == 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean zzZ(zzYCZ zzycz, zzZZF zzzzf, int i) {
        zzYN9 zzyn9 = new zzYN9(zzycz, zzzzf, i);
        return zzyn9.zzS(0, true, 1) + zzyn9.zzS(2, true, 1) > 0;
    }

    private long zzZN(int i, boolean z) {
        return com.aspose.words.internal.zzZPZ.zzZm(zzZt(0, z), i - zzZt(2, z));
    }

    private long zzZs(int i, boolean z) {
        int iZzRL = zzRL(z);
        int iZzRK = zzRK(z);
        int iZzS = zzS(0, z, 1);
        int iZzS2 = zzS(2, z, 1);
        int iZzS3 = zzS(0, z, 0) + iZzRL;
        return com.aspose.words.internal.zzZPZ.zzZm(iZzS3, (i - (((iZzRL + iZzS) + iZzRK) + iZzS2)) + iZzS3);
    }

    public final int zzZt(int i, boolean z) {
        int iZzRL;
        if (i == 0) {
            iZzRL = zzRL(z);
        } else if (i == 1) {
            iZzRL = zzRN(z);
        } else if (i == 2) {
            iZzRL = zzRK(z);
        } else {
            if (i != 3) {
                throw new IllegalStateException("Unexpected page side value.");
            }
            iZzRL = zzRM(z);
        }
        return iZzRL + zzS(i, z, 0);
    }

    public final long zzZ(int i, int i2, boolean z, boolean z2) {
        if (i == 0) {
            z2 = false;
        } else if (i == 1) {
            z2 = true;
        } else if (i == 2) {
            z2 = !z2;
        } else if (i != 3) {
            throw new IllegalStateException("Unknown gutter behavior");
        }
        if (z2) {
            return zzZs(i2, z);
        }
        return zzZN(i2, z);
    }

    public zzYN9(zzZ9E zzz9e, zzZZF zzzzf, int i) {
        this.zzXHD = ((Integer) zzz9e.fetchSectionAttr(2280)).intValue();
        this.zzXHC = ((Integer) zzz9e.fetchSectionAttr(2290)).intValue();
        this.zzXHB = Math.abs(((Integer) zzz9e.fetchSectionAttr(2300)).intValue());
        this.zzXHA = Math.abs(((Integer) zzz9e.fetchSectionAttr(2310)).intValue());
        this.zzXHz = ((Integer) zzz9e.fetchSectionAttr(2312)).intValue();
        this.zzYWh = zzzzf.zzYWh;
        this.zzXHu = zzzzf.zzYVX;
        int iIntValue = ((Integer) zzz9e.fetchSectionAttr(2210)).intValue();
        this.zzXHw = iIntValue;
        this.zzXHv = iIntValue == i;
        this.zzXHy = zzzzf.zzYWr;
        this.zzXHx = ((Boolean) zzz9e.fetchSectionAttr(2410)).booleanValue();
    }
}
