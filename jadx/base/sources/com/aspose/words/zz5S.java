package com.aspose.words;

import androidx.appcompat.widget.C21532OooOOo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
class zz5S implements zzZCE {
    private boolean zzZ1J;
    private zzHK zzZ1K;
    private zzZ90 zzZxX;

    public zz5S() {
        this.zzZ1K = new zzHK();
    }

    private static com.aspose.words.internal.zzZQ4 zzX(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzP9 zzp9) {
        if (zzp9 == null) {
            return zzzq4;
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = com.aspose.words.internal.zzJ6.zzZ(zzzq4, zzp9);
        return new com.aspose.words.internal.zzZQ4(zzzq4ZzZ.getX(), zzzq4ZzZ.getY(), com.aspose.words.internal.zzAN.zzf(zzzq4ZzZ.getWidth()) ? 1.0f : zzzq4ZzZ.getWidth(), com.aspose.words.internal.zzAN.zzf(zzzq4ZzZ.getHeight()) ? 1.0f : zzzq4ZzZ.getHeight());
    }

    private static double zzY2(int i, int i2) {
        double d;
        if (i != 1) {
            d = 0.0d;
            if (i != 2) {
                if (i == 3) {
                    d = 45.0d;
                } else if (i == 4) {
                    d = 135.0d;
                }
            }
        } else {
            d = 90.0d;
        }
        return (i2 == 2 || i2 == 4) ? d + 180.0d : d;
    }

    public static ArrayList<zz7B> zzZ(zzBW zzbw, zzBW zzbw2, int i) {
        ArrayList<zz7B> arrayList = new ArrayList<>();
        if (i == 1 || i == 2) {
            arrayList.add(new zz7B(0.0d, zzbw));
            arrayList.add(new zz7B(1.0d, zzbw2));
            return arrayList;
        }
        if (i == 3) {
            arrayList.add(new zz7B(0.0d, zzbw));
            arrayList.add(new zz7B(0.5d, zzbw2));
            arrayList.add(new zz7B(1.0d, zzbw));
            return arrayList;
        }
        if (i != 4) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "The specified value is out of range.\r\nParameter name: variant\r\nParameter value: "));
        }
        arrayList.add(new zz7B(0.5d, zzbw));
        arrayList.add(new zz7B(0.0d, zzbw2));
        arrayList.add(new zz7B(1.0d, zzbw2));
        return arrayList;
    }

    private com.aspose.words.internal.zzP9 zzZw(com.aspose.words.internal.zzZQ4 zzzq4) {
        if (com.aspose.words.internal.zzAN.zzZD(this.zzZ1K.zzZQQ())) {
            return null;
        }
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzZ((float) this.zzZ1K.zzZQQ(), com.aspose.words.internal.zzZPY.zzG((zzzq4.zzkw() + zzzq4.zzZm()) / 2.0f, (zzzq4.zzZn() + zzzq4.zzZo()) / 2.0f), 0);
        return zzp9;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!com.aspose.words.internal.zzZ4.zzW(this, obj)) {
            return false;
        }
        zz5S zz5s = (zz5S) obj;
        return zz5s.zzZ1J == this.zzZ1J && com.aspose.words.internal.zzZKO.equals(zz5s.zzZ1K, this.zzZ1K);
    }

    @Override // com.aspose.words.zzZCE
    public final int getGradientStyle() {
        double dZzZQQ = this.zzZ1K.zzZQQ();
        if (com.aspose.words.internal.zzAN.zzL(dZzZQQ, 0.0d) || com.aspose.words.internal.zzAN.zzL(dZzZQQ, 180.0d)) {
            return 2;
        }
        if (com.aspose.words.internal.zzAN.zzL(dZzZQQ, 45.0d) || com.aspose.words.internal.zzAN.zzL(dZzZQQ, 225.0d)) {
            return 3;
        }
        if (com.aspose.words.internal.zzAN.zzL(dZzZQQ, 90.0d) || com.aspose.words.internal.zzAN.zzL(dZzZQQ, 270.0d)) {
            return 1;
        }
        return (com.aspose.words.internal.zzAN.zzL(dZzZQQ, 135.0d) || com.aspose.words.internal.zzAN.zzL(dZzZQQ, 315.0d)) ? 4 : -1;
    }

    public int hashCode() {
        return com.aspose.words.internal.zzZKP.zzZ9(this.zzZ1K.getValue()) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzZ1J);
    }

    @Override // com.aspose.words.zzZCE
    public final void zzQ(zzGR zzgr) {
    }

    public final void zzU(zzHK zzhk) {
        this.zzZ1K = zzhk;
    }

    public final void zzX0(boolean z) {
        this.zzZ1J = z;
    }

    public final boolean zzZRC() {
        return this.zzZ1J;
    }

    @Override // com.aspose.words.zzZCE
    public final int zzZZ(ArrayList<zz7B> arrayList) {
        int i;
        double dZzZQQ = this.zzZ1K.zzZQQ();
        if (com.aspose.words.internal.zzAN.zzL(dZzZQQ, 0.0d) || com.aspose.words.internal.zzAN.zzL(dZzZQQ, 45.0d) || com.aspose.words.internal.zzAN.zzL(dZzZQQ, 90.0d) || com.aspose.words.internal.zzAN.zzL(dZzZQQ, 135.0d)) {
            i = 1;
        } else {
            if (!com.aspose.words.internal.zzAN.zzL(dZzZQQ, 180.0d) && !com.aspose.words.internal.zzAN.zzL(dZzZQQ, 225.0d) && !com.aspose.words.internal.zzAN.zzL(dZzZQQ, 270.0d) && !com.aspose.words.internal.zzAN.zzL(dZzZQQ, 315.0d)) {
                return 0;
            }
            i = 2;
        }
        if (arrayList == null) {
            return i;
        }
        if (arrayList.size() == 3) {
            zz7B zz7b = arrayList.get(i - 1);
            zz7B zz7b2 = arrayList.get(2);
            return (com.aspose.words.internal.zzZ4.zzY(zz7b, zz7b2) && zz7b.zzZQX().zzZ(this.zzZxX, (zzZCM) null).equals(zz7b2.zzZQX().zzZ(this.zzZxX, (zzZCM) null))) ? i + 2 : i;
        }
        if (arrayList.size() <= 3) {
            return i;
        }
        com.aspose.words.internal.zzPV zzpvZzZ = arrayList.get(0).zzZQX().zzZ(this.zzZxX, (zzZCM) null);
        int i2 = 1;
        while (i2 < arrayList.size() - 1) {
            com.aspose.words.internal.zzPV zzpvZzZ2 = arrayList.get(i2).zzZQX().zzZ(this.zzZxX, (zzZCM) null);
            if (!zzpvZzZ.equals(zzpvZzZ2)) {
                return i;
            }
            i2++;
            zzpvZzZ = zzpvZzZ2;
        }
        return i + 2;
    }

    public final zzHK zzZyG() {
        return this.zzZ1K;
    }

    @Override // com.aspose.words.zzZCE
    public final boolean zzZyH() {
        return false;
    }

    @Override // com.aspose.words.zzZCE
    public final zzZCE zzZyI() {
        zz5S zz5s = new zz5S();
        zz5s.zzZ1K = this.zzZ1K;
        zz5s.zzZ1J = this.zzZ1J;
        return zz5s;
    }

    public zz5S(int i, int i2, zzZ90 zzz90) {
        this.zzZ1K = new zzHK();
        this.zzZ1K = zzHK.zzYR(zzY2(i, i2));
        this.zzZ1J = true;
        this.zzZxX = zzz90;
    }

    @Override // com.aspose.words.zzZCE
    public final com.aspose.words.internal.zzPL zzZ(com.aspose.words.internal.zzZQ4 zzzq4, zzGR zzgr, boolean z) {
        com.aspose.words.internal.zzP9 zzp9ZzZw = zzZw(zzzq4);
        com.aspose.words.internal.zzZQ4 zzzq4ZzX = zzX(zzzq4, zzp9ZzZw);
        com.aspose.words.internal.zzPA zzpa = new com.aspose.words.internal.zzPA(zzzq4ZzX);
        zzpa.zzL(zzp9ZzZw);
        if (z) {
            zzpa.zzNb().zzZ(zz32.zzZ(zzgr, com.aspose.words.internal.zzJ6.zzB(zzzq4ZzX)), 1);
        }
        return zzpa;
    }

    @Override // com.aspose.words.zzZCE
    public final void zzZ(zzZYD zzzyd, boolean z) {
        zzzyd.zzY(z ? "w14:lin" : "a:lin");
        zzzyd.zzO(z ? "w14:ang" : "ang", this.zzZ1K.getValue());
        zzzyd.zzx(z ? "w14:scaled" : "scaled", this.zzZ1J);
        zzzyd.zzo();
    }
}
