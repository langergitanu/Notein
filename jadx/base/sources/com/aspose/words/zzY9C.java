package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzY9C extends zzTG {
    private int zzXZT = -1;
    private zzYZD zzXaQ;
    private zzZ4N zzXaR;
    private zzZYW zzXaS;
    private zzY9A zzXaT;

    public zzY9C(zzZYW zzzyw) {
        this.zzXaS = zzzyw;
    }

    private static void zzM(zzZ6T zzz6t) {
        if (zzz6t.zz6y() == 32) {
            for (zzZ55 zzz55ZzYos = ((zzYMM) zzz6t).zzYos(); zzz55ZzYos != null; zzz55ZzYos = (zzZ55) zzz55ZzYos.zzYo1()) {
                zzz55ZzYos.setLineNumber(-1);
            }
            return;
        }
        if (zzz6t instanceof zzTG) {
            for (zzZ6T zzz6tZzZXZ = ((zzTG) zzz6t).zzZXZ(); zzz6tZzZXZ != null; zzz6tZzZXZ = zzz6tZzZXZ.zzYTp()) {
                zzM(zzz6tZzZXZ);
            }
        }
    }

    private boolean zzY4q() {
        zzYZD zzyzd = this.zzXaQ;
        return (zzyzd == null || zzyzd.isEmpty()) ? false : true;
    }

    private static void zzlk(int i) {
        if (i > 100000) {
            throw new IllegalStateException("Infinite loop detected.");
        }
    }

    public abstract int getStoryType();

    @Override // com.aspose.words.zzZ6T
    public final int zz6y() {
        return 1;
    }

    public final void zzJ(zzYMD zzymd) throws Exception {
        zzYMD zzymdZz6x = zzymd != null ? zzymd : zz6x();
        zzYMD zzymdZzYo1 = zzymd == null ? null : zzymd.zzYo1();
        try {
            zzFM(2);
            do {
                if (zzY4q()) {
                    this.zzXaQ.flush();
                    zzymdZz6x = zz6x();
                }
                if (!zzac()) {
                    int i = this.zzXZT + 1;
                    this.zzXZT = i;
                    zzlk(i);
                    zzYMD zzymdZz6x2 = zzymdZz6x;
                    boolean z = false;
                    int i2 = 0;
                    while (zzymdZz6x != null && !z) {
                        z = zzymdZzYo1 != null && zzymdZz6x.zzYo1() == zzymdZzYo1;
                        if (!zzymdZz6x.zzac()) {
                            zzZ4B().zzJ(zzymdZz6x);
                        }
                        if (zzymdZz6x.isActive()) {
                            zzymdZz6x = zzymdZz6x.zzYo1();
                        } else {
                            i2++;
                            zzlk(i2);
                            zzymdZz6x2 = zz6x();
                            z = false;
                            zzymdZz6x = zzymdZz6x2;
                        }
                    }
                    if (zzymdZz6x == null) {
                        zzYU(true);
                    }
                    zzymdZz6x = zzymdZz6x2;
                }
            } while (zzY4q());
            zzZoA();
            this.zzXaT = null;
            zzY4q();
        } catch (Throwable th) {
            zzZoA();
            this.zzXaT = null;
            throw th;
        }
    }

    public final zzYMM zzU(zzYAS zzyas) throws Exception {
        zzyas.zzZo6();
        zzZ6T zzz6tZzmu = zzYCT.zzmu(getStoryType());
        zzZ(zzZXY(), null, zzz6tZzmu);
        zzYMM zzymm = new zzYMM();
        zzz6tZzmu.zzZ(null, null, zzymm);
        zzymm.zzZ(zzyas.zzY6c());
        return zzymm;
    }

    @Override // com.aspose.words.zzTG, com.aspose.words.zzZ6T
    public final void zzW(zzZ6T zzz6t) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzY4r() throws Exception {
        if (!zzbD()) {
            zzM(this);
            return;
        }
        zzYN8 zzyn8 = null;
        int lineStartingNumber = -1;
        for (zzYCT zzyct = (zzYCT) zzZXZ(); zzyct != null; zzyct = (zzYCT) zzyct.zzYTp()) {
            zzZ35 zzz35 = (zzZ35) ((zzZ2D) zzyct).zzYTt();
            if (zzz35.getLineNumberCountBy() <= 0) {
                zzM(zzyct);
            } else {
                if (lineStartingNumber < 0 || zzz35.getLineNumberRestartMode() == 1) {
                    lineStartingNumber = zzz35.getLineStartingNumber();
                }
                for (zzZ6T zzz6tZzZXZ = zzyct.zzZXZ(); zzz6tZzZXZ != null; zzz6tZzZXZ = zzz6tZzZXZ.zzYTp()) {
                    if (zzz6tZzZXZ.zz6y() == 32) {
                        zzYMM zzymm = (zzYMM) zzz6tZzZXZ;
                        if (((zzZ37) zzymm.zzYTt()).zzYLK()) {
                            zzM(zzz6tZzZXZ);
                        } else {
                            zzZ55 zzz55ZzYos = zzymm.zzYos();
                            while (zzz55ZzYos != null) {
                                zzYN8 zzyn82 = (zzYN8) zzz55ZzYos.zzZZJ().zzZZJ();
                                if (zzyn8 != zzyn82 && zzz35.getLineNumberRestartMode() == 0) {
                                    lineStartingNumber = zzz35.getLineStartingNumber();
                                }
                                boolean z = zzz55ZzYos.zzYTn() && zzz55ZzYos.zzYQ9();
                                zzz55ZzYos.setLineNumber(((lineStartingNumber % zzz35.getLineNumberCountBy() != 0 || z || zzY9R.zzlw(zzz55ZzYos.zzI(true, true).zzZo6())) ? -1 : 1) * lineStartingNumber);
                                if (!z) {
                                    lineStartingNumber++;
                                }
                                zzz55ZzYos = (zzZ55) zzz55ZzYos.zzYo1();
                                zzyn8 = zzyn82;
                            }
                        }
                    }
                }
            }
        }
    }

    public final zzZ4N zzY4s() {
        if (this.zzXaR == null) {
            this.zzXaR = new zzZ4N();
        }
        return this.zzXaR;
    }

    public final void zzY4t() {
        if (this.zzXZT > 0) {
            this.zzXZT = 0;
        }
    }

    public final int zzYDM() {
        return this.zzXZT;
    }

    @Override // com.aspose.words.zzYS
    public final void zzZ(Object obj, zzYZC zzyzc) {
        if (this.zzXaQ == null) {
            this.zzXaQ = new zzYZD();
        }
        zzyzc.zzYDN();
        zzyzc.zzYDM();
        this.zzXaQ.zzY(obj, zzyzc);
    }

    public zzY9A zzZ4B() {
        return this.zzXaT;
    }

    public boolean zzZ4E() {
        return false;
    }

    @Override // com.aspose.words.zzTG, com.aspose.words.zzZ6T
    public final void zzZY0() {
    }

    public boolean zzZZB() {
        return true;
    }

    @Override // com.aspose.words.zzZ6T, com.aspose.words.zzYS
    public final zzY9C zzaa() {
        return this;
    }

    @Override // com.aspose.words.zzYS
    public final zzZYW zzab() {
        return this.zzXaS;
    }

    public boolean zzbD() {
        return false;
    }

    public final void zzZ(zzY9A zzy9a) {
        this.zzXaT = zzy9a;
    }

    public zzYMM zzZ(zzYAS zzyas) throws Exception {
        zzYCT zzyctZzmu;
        zzyas.zzZo6();
        zzYMM zzymm = new zzYMM();
        if (zzZXX()) {
            zzyctZzmu = zzYCT.zzmu(getStoryType());
            zzZ(null, null, zzyctZzmu);
            zzyctZzmu.zzZ(null, null, zzymm);
        } else {
            zzY4s();
            zzZ4N zzz4nZzYPe = zzY4s().zzYPe();
            zzz4nZzYPe.movePrevious();
            ((zzYAS) zzz4nZzYPe.zzYPi()).zzX(zzyas);
            zzyctZzmu = (zzYCT) zzZXY();
            zzyctZzmu.zzZ(zzyctZzmu.zzZXY(), null, zzymm);
        }
        zzymm.zzZ(zzyas.zzY6c());
        if (zzbD()) {
            zzyctZzmu.zzZ(zzyas.zzY69());
            zzZ(zzyas.zzY68());
        }
        return zzymm;
    }
}
