package com.aspose.words;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.words.internal.C22244OooO0o0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
class zz44 implements zzZCE {
    private int zzZ0v;
    private zz3Z zzZ0w;
    private zzZ90 zzZxX;
    private static zz3Z zzZ0u = new zz3Z(0.0d, 0.0d, 1.0d, 1.0d);
    private static zz3Z zzZ0t = new zz3Z(1.0d, 0.0d, 0.0d, 1.0d);
    private static zz3Z zzZ0s = new zz3Z(0.0d, 1.0d, 1.0d, 0.0d);
    private static zz3Z zzZ0r = new zz3Z(1.0d, 1.0d, 0.0d, 0.0d);
    private static zz3Z zzZ0q = new zz3Z(0.5d, 0.5d, 0.5d, 0.5d);

    public zz44() {
    }

    public static zz3Z zzHh(int i) {
        if (i == 1) {
            return new zz3Z(-1.0d, -1.0d, 0.0d, 0.0d);
        }
        if (i == 2) {
            return new zz3Z(0.0d, -1.0d, -1.0d, 0.0d);
        }
        if (i == 3) {
            return new zz3Z(-1.0d, 0.0d, 0.0d, -1.0d);
        }
        if (i == 4) {
            return new zz3Z(0.0d, 0.0d, -1.0d, -1.0d);
        }
        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "The specified value is out of range.\r\nParameter name: variant\r\nParameter value: "));
    }

    private static com.aspose.words.internal.zzP9 zzK(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42) {
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY(-zzzq4.getX(), -zzzq4.getY(), 1);
        zzp9.zzZ(zzzq4.getWidth() > 0.0f ? zzzq42.getWidth() / zzzq4.getWidth() : 1.0f, zzzq4.getHeight() > 0.0f ? zzzq42.getHeight() / zzzq4.getHeight() : 1.0f, 1);
        zzp9.zzY(zzzq42.getX(), zzzq42.getY(), 1);
        return zzp9;
    }

    private static com.aspose.words.internal.zzZG zzN(zzGR zzgr) {
        com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
        com.aspose.words.internal.zzZQ4 zzzq4ZzZPK = zzgr.zzZPK();
        long jZzG = com.aspose.words.internal.zzZPY.zzG(C22244OooO0o0.OooO00o(zzzq4ZzZPK, 2.0f, zzzq4ZzZPK.zzZm()), (zzzq4ZzZPK.getHeight() / 2.0f) + zzzq4ZzZPK.zzZo());
        float fSqrt = (float) Math.sqrt(((zzzq4ZzZPK.zzZo() - com.aspose.words.internal.zzZPY.zzYC(jZzG)) * (zzzq4ZzZPK.zzZo() - com.aspose.words.internal.zzZPY.zzYC(jZzG))) + ((zzzq4ZzZPK.zzZm() - Float.intBitsToFloat(r5)) * (zzzq4ZzZPK.zzZm() - Float.intBitsToFloat(r5))));
        float fIntBitsToFloat = Float.intBitsToFloat((int) jZzG) - fSqrt;
        float fZzYC = com.aspose.words.internal.zzZPY.zzYC(jZzG) - fSqrt;
        float f = fSqrt * 2.0f;
        zzp5.zzZ(new com.aspose.words.internal.zzQ5(new com.aspose.words.internal.zzZQ4(fIntBitsToFloat, fZzYC, f, f)));
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG();
        com.aspose.words.internal.OooO00o.OooO00o(zzzg, zzp5);
        return zzzg;
    }

    private static com.aspose.words.internal.zzZG zzO(zzGR zzgr) {
        return zzgr.zzRV() == null ? zzN(zzgr) : zzgr.zzRV().zzYZ();
    }

    private static com.aspose.words.internal.zzZG zzP(zzGR zzgr) {
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG();
        com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), com.aspose.words.internal.zzP5.zzK(zzgr.zzZPK()));
        return zzzg;
    }

    public static ArrayList<zz7B> zzY(zzBW zzbw, zzBW zzbw2, int i) {
        ArrayList<zz7B> arrayList = new ArrayList<>();
        if (i == 1) {
            arrayList.add(new zz7B(0.0d, zzbw));
            arrayList.add(new zz7B(1.0d, zzbw2));
            return arrayList;
        }
        if (i == 2) {
            arrayList.add(new zz7B(1.0d, zzbw));
            arrayList.add(new zz7B(0.0d, zzbw2));
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

    private static zz3Z zzY0(int i, int i2) {
        if (i != 5) {
            if (i == 6) {
                return zzZ0q;
            }
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "The specified value is out of range.\r\nParameter name: style\r\nParameter value: "));
        }
        if (i2 == 1) {
            return zzZ0u;
        }
        if (i2 == 2) {
            return zzZ0t;
        }
        if (i2 == 3) {
            return zzZ0s;
        }
        if (i2 == 4) {
            return zzZ0r;
        }
        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i2, "The specified value is out of range.\r\nParameter name: variant\r\nParameter value: "));
    }

    private int zzZY(ArrayList<zz7B> arrayList) {
        this.zzZ0w.zzV(zzZ0q);
        if (arrayList == null || arrayList.size() < 3) {
            return 1;
        }
        if (arrayList.size() != 3) {
            com.aspose.words.internal.zzPV zzpvZzZ = arrayList.get(0).zzZQX().zzZ(this.zzZxX, (zzZCM) null);
            int i = 1;
            while (i < arrayList.size() - 1) {
                com.aspose.words.internal.zzPV zzpvZzZ2 = arrayList.get(i).zzZQX().zzZ(this.zzZxX, (zzZCM) null);
                if (!zzpvZzZ.equals(zzpvZzZ2)) {
                    return 1;
                }
                i++;
                zzpvZzZ = zzpvZzZ2;
            }
            return 3;
        }
        zz7B zz7b = arrayList.get(0);
        zz7B zz7b2 = arrayList.get(2);
        if (com.aspose.words.internal.zzZ4.zzY(zz7b, zz7b2)) {
            com.aspose.words.internal.zzPV zzpvZzZ3 = zz7b.zzZQX().zzZ(this.zzZxX, (zzZCM) null);
            com.aspose.words.internal.zzPV zzpvZzZ4 = zz7b2.zzZQX().zzZ(this.zzZxX, (zzZCM) null);
            if (zzpvZzZ3.equals(zzpvZzZ4)) {
                return 3;
            }
            zz7B zz7b3 = arrayList.get(1);
            if (zz7b3 != null && zz7b3.zzZQX().zzZ(this.zzZxX, (zzZCM) null).equals(zzpvZzZ4)) {
                return 3;
            }
        }
        return 1;
    }

    private long zzZv(com.aspose.words.internal.zzZQ4 zzzq4) {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZu = zzZwW().zzZu(zzzq4);
        return com.aspose.words.internal.zzZPY.zzG(C22244OooO0o0.OooO00o(zzzq4ZzZu, 2.0f, zzzq4ZzZu.zzZm()), (zzzq4ZzZu.getHeight() / 2.0f) + zzzq4ZzZu.zzZo());
    }

    private int zzZwX() {
        if (this.zzZ0w.zzV(zzZ0u)) {
            return 1;
        }
        if (this.zzZ0w.zzV(zzZ0t)) {
            return 2;
        }
        if (this.zzZ0w.zzV(zzZ0s)) {
            return 3;
        }
        return this.zzZ0w.zzV(zzZ0r) ? 4 : 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!com.aspose.words.internal.zzZ4.zzW(this, obj)) {
            return false;
        }
        zz44 zz44Var = (zz44) obj;
        return zz44Var.zzZ0v == this.zzZ0v && com.aspose.words.internal.zzZKO.equals(zz44Var.zzZwW(), zzZwW());
    }

    @Override // com.aspose.words.zzZCE
    public final int getGradientStyle() {
        zz3Z zz3z = this.zzZ0w;
        if (zz3z == null) {
            return -1;
        }
        if (zz3z.zzV(zzZ0q)) {
            return 6;
        }
        return (this.zzZ0w.zzV(zzZ0u) || this.zzZ0w.zzV(zzZ0t) || this.zzZ0w.zzV(zzZ0s) || this.zzZ0w.zzV(zzZ0r)) ? 5 : -1;
    }

    public int hashCode() {
        return this.zzZ0v ^ zzZwW().hashCode();
    }

    public final void zzHg(int i) {
        this.zzZ0v = i;
    }

    @Override // com.aspose.words.zzZCE
    public final void zzQ(zzGR zzgr) throws Exception {
        if (zzgr.zzRV() == null) {
            return;
        }
        zzgr.zzZK(new com.aspose.words.internal.zzH().zzZ((com.aspose.words.internal.zzZL) zzgr.zzRV()));
    }

    public final void zzW(zz3Z zz3z) {
        this.zzZ0w = zz3z;
    }

    @Override // com.aspose.words.zzZCE
    public final com.aspose.words.internal.zzPL zzZ(com.aspose.words.internal.zzZQ4 zzzq4, zzGR zzgr, boolean z) {
        com.aspose.words.internal.zzP0 zzp0 = new com.aspose.words.internal.zzP0(zzZ(zzgr, zzzq4).zzZ0(), zzZv(zzgr.zzZPK()));
        if (zzgr.zzZPF() && (!zzgr.zzZPF() || !z)) {
            return zzp0;
        }
        zzp0.zzL(zz32.zzZ(zzgr, zzgr.zzZPI()));
        return zzp0;
    }

    @Override // com.aspose.words.zzZCE
    public final int zzZZ(ArrayList<zz7B> arrayList) {
        zz3Z zz3z = this.zzZ0w;
        if (zz3z != null) {
            return zz3z.zzV(zzZ0q) ? zzZY(arrayList) : zzZwX();
        }
        return 0;
    }

    public final int zzZwV() {
        return this.zzZ0v;
    }

    public final zz3Z zzZwW() {
        if (this.zzZ0w == null) {
            this.zzZ0w = new zz3Z();
        }
        return this.zzZ0w;
    }

    public final int zzZwY() {
        int i = this.zzZ0v;
        if (i == 0 || i == 1) {
            return 6;
        }
        return i != 2 ? 4 : 5;
    }

    @Override // com.aspose.words.zzZCE
    public final boolean zzZyH() {
        return true;
    }

    @Override // com.aspose.words.zzZCE
    public final zzZCE zzZyI() {
        zz44 zz44Var = new zz44();
        zz44Var.zzZ0v = this.zzZ0v;
        zz44Var.zzZ0w = zzZwW().zzZwI();
        return zz44Var;
    }

    public zz44(int i, int i2, zzZ90 zzz90) {
        this.zzZ0w = new zz3Z(zzY0(i, i2));
        this.zzZ0v = 2;
        this.zzZxX = zzz90;
    }

    @Override // com.aspose.words.zzZCE
    public final void zzZ(zzZYD zzzyd, boolean z) {
        String str = "w14:path";
        zzzyd.zzY(z ? "w14:path" : "a:path");
        if (!z) {
            str = "path";
        }
        zzzyd.zz0(str, zz84.zzIN(this.zzZ0v));
        zzzyd.zzZ(zzZwW(), z ? "w14" : "a", "fillToRect", false);
        zzzyd.zzo();
    }

    private com.aspose.words.internal.zzZG zzZ(zzGR zzgr, com.aspose.words.internal.zzZQ4 zzzq4) {
        com.aspose.words.internal.zzZG zzzgZzO;
        int i = this.zzZ0v;
        if (i == 0) {
            zzzgZzO = zzO(zzgr);
        } else if (i == 1) {
            zzzgZzO = zzN(zzgr);
        } else if (i == 2) {
            zzzgZzO = zzP(zzgr);
        } else {
            throw new IllegalArgumentException();
        }
        zzZ(zzgr, zzzgZzO, zzzq4);
        return zzzgZzO;
    }

    public static ArrayList<zz7B> zzY(zzBW zzbw, zzBW zzbw2) {
        ArrayList<zz7B> arrayList = new ArrayList<>();
        arrayList.add(new zz7B(0.0d, zzbw));
        arrayList.add(new zz7B(1.0d, zzbw2));
        return arrayList;
    }

    private void zzZ(zzGR zzgr, com.aspose.words.internal.zzZG zzzg, com.aspose.words.internal.zzZQ4 zzzq4) {
        if (this.zzZ0v != 0) {
            zzzg.zzY(zzK(zzgr.zzZPK(), zzzq4));
        }
    }
}
