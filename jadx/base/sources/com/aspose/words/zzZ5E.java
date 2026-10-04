package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ5E {
    private zzZ5F zzYec;
    private boolean zzYed;
    private zzZ55 zzYee;
    private zzZ54 zzYef;
    private int zzZsp;

    private zzZ55 zzF(zzZ55 zzz55) throws Exception {
        zzYMD zzymdZzi;
        if (zzz55.zzac()) {
            return zzz55;
        }
        int bottom = (zzz55.getY() == Integer.MIN_VALUE || zzz55.getHeight() == Integer.MIN_VALUE) ? Integer.MIN_VALUE : zzz55.getBottom();
        zzYAU zzyau = (zzYAU) zzz55.zzYQn().zz6w();
        if (this.zzYed) {
            if (this.zzYec == null) {
                this.zzYec = new zzZ5F();
            }
            this.zzYec.zzO(zzz55);
        } else {
            if (this.zzYef == null) {
                this.zzYef = new zzZ54();
            }
            this.zzYef.zzM(zzz55, Integer.MIN_VALUE);
        }
        if (!zzz55.isActive()) {
            return null;
        }
        zzZ55 zzz55ZzYQn = zzz55.zzYQn();
        if ((zzz55.getBottom() != bottom || zzyau != ((zzYAU) zzz55ZzYQn.zz6w())) && (zzymdZzi = ((zzYBL) zzz55ZzYQn.zzZZJ()).zzi(zzz55ZzYQn)) != null && zzymdZzi.zzac()) {
            zzymdZzi.zzNd(3);
        }
        return zzz55ZzYQn;
    }

    private void zzY(zzZ55 zzz55, int i, boolean z) throws Exception {
        zzYN8 zzyn8ZzZ8m;
        if (zzz55 != null) {
            zzz55.isActive();
        }
        int i2 = 0;
        this.zzZsp = 0;
        zzZ55 zzz55ZzF = null;
        this.zzYee = null;
        if (zzz55.zzaa().zzbD()) {
            this.zzYed = zzz55.zzZZJ().zz60() == 16 || !zzYJP.zzm(zzz55);
        } else if (zzz55.zzaa().zzZ4E()) {
            this.zzYed = zzz55.zzZZJ().zz60() == 16 || (zzz55.zza7().zzZYM() && !zzYJP.zzm(zzz55));
        }
        int height = (zzz55.zz0t() == Integer.MIN_VALUE || !zzz55.zzYQf() || (zzyn8ZzZ8m = zzz55.zzZ8m()) == null || zzyn8ZzZ8m.getHeight() <= 0) ? Integer.MAX_VALUE : zzyn8ZzZ8m.getHeight();
        int i3 = ((zzYBL) zzz55.zzZZJ()).zz60() == 1024 ? 0 : 2;
        for (zzZ55 zzz552 = zzz55; zzz552 != null && i2 <= i3; zzz552 = (zzZ55) zzz55ZzF.zzYo1()) {
            zzz552.zzO(zzz55.zzZZJ());
            if (height > 0 || zzz552.zz0t() == Integer.MIN_VALUE) {
                zzz55ZzF = zzF(zzz552);
                if (zzz55ZzF.getY() > height) {
                    height = -1;
                }
            } else {
                zzz552.setY(zzz55ZzF.getBottom());
                zzz552.zzYU(true);
                zzz55ZzF = zzz552;
            }
            if (zzZ(zzz55, z, zzz552, zzz55ZzF)) {
                break;
            }
            if (i2 <= 0) {
                this.zzYee = zzz55ZzF;
            }
            if (i2 > 0 || zzz55ZzF.getY() + zzz55ZzF.zz0t() > i) {
                i2++;
            }
            if (zzY9R.zzlw(zzz55ZzF.zzYQc().zzZo6())) {
                break;
            }
        }
        if (this.zzZsp == 5) {
            zzZ55 zzz553 = this.zzYee;
            zzz553.zzX(zzz553.zzZZJ());
        }
    }

    public final zzZ55 zzYQZ() {
        return this.zzYee;
    }

    public final void zzZ(zzZ55 zzz55, int i, boolean z) throws Exception {
        zzY(zzz55, i, z);
    }

    public final int zzZXF() {
        return this.zzZsp;
    }

    private static boolean zzZ(zzZ55 zzz55, zzZ55 zzz552) {
        boolean z = false;
        if (zzz55.zzab().zzZoR() == null) {
            return false;
        }
        zzZ55 zzz553 = zzz55;
        while (zzz553 != ((zzZ55) zzz552.zzYo1())) {
            boolean zZzZ = zzY0B.zzZ((zzYBL) zzz553.zzZZJ(), zzz553);
            boolean z2 = !zZzZ;
            if (!zZzZ) {
                zzz55.zzZZJ();
                return z2;
            }
            zzz553 = (zzZ55) zzz553.zzYo1();
            z = z2;
        }
        return z;
    }

    private boolean zzZ(zzZ55 zzz55, boolean z, zzZ55 zzz552, zzZ55 zzz553) throws Exception {
        if (!zzZ(zzz552, zzz553)) {
            return false;
        }
        if (!zzz55.zza7().zzZYM()) {
            zzZ55 zzz55ZzYos = ((zzYMM) zzz55.zza9()).zzYos();
            if (zzz55ZzYos.zzZZJ() == zzz55.zzZZJ() && !zzz55ZzYos.zzYnZ()) {
                this.zzYee = zzz55ZzYos;
                this.zzZsp = 5;
                return true;
            }
        }
        if (this.zzYee == null) {
            this.zzYee = zzz55;
            if (z) {
                this.zzZsp = 5;
            } else {
                this.zzZsp = zzY(zzz55, zzz553) ? 9 : 3;
            }
        } else {
            this.zzYee = zzz552;
            this.zzZsp = 5;
        }
        return true;
    }

    private static boolean zzY(zzZ55 zzz55, zzZ55 zzz552) throws Exception {
        zzZNO zzznoZzR;
        zzY5N zzy5nZzZO = zzY5N.zzZO(zzz55);
        ArrayList<zzZNO> arrayList = new ArrayList();
        zzYAU zzyau = (zzYAU) ((zzYAU) zzz552.zz6w()).zzYo1();
        zzYMD zzymdZz6x = zzz55.zz6x();
        while (true) {
            zzYAU zzyau2 = (zzYAU) zzymdZz6x;
            if (zzyau2 == zzyau) {
                break;
            }
            if (zzyau2.zzZo6() == 25604 && (zzznoZzR = zzZNO.zzR(zzyau2)) != null && zzznoZzR.zzZ8Y()) {
                if (!zzznoZzR.zzZ8X() && zzznoZzR.zzZ8T()) {
                    zzy5nZzZO.zzZ(zzznoZzR, true, true);
                }
                zzznoZzR.zzVJ(true);
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZNO>) arrayList, zzznoZzR);
            }
            zzymdZz6x = zzyau2.zzYo1();
        }
        boolean z = zzy5nZzZO.zzq(null) > 0;
        if (z) {
            for (zzZNO zzzno : arrayList) {
                if (zzzno.zzZ8T()) {
                    zzzno.zzZ8Q();
                    zzzno.zzZ92().zzNd(1);
                }
            }
        } else {
            for (zzZNO zzzno2 : arrayList) {
                if (!zzzno2.zzZ8T()) {
                    zzzno2.zzZ8K();
                }
            }
        }
        return z;
    }
}
