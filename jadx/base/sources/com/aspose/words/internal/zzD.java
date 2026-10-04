package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzD extends zz6 {
    private boolean zzZt;
    private boolean zzZu;
    private boolean zzZv;
    private zzZQC<zzP9> zzZz = new zzZQC<>();
    private zzZQC<zzP8> zzZy = new zzZQC<>();
    private zzIM<zzG> zzZx = new zzIM<>();
    private zz6L zzZw = new zz6L(1000.0f);

    private zzD(boolean z, boolean z2, boolean z3) {
        this.zzZz.push(new zzP9());
        this.zzZy.push(null);
        this.zzZv = z;
        this.zzZt = z2;
        this.zzZu = z3;
    }

    private void zzU(zzG zzg) {
        this.zzZx.remove(zzg);
        zzZI();
    }

    private void zzV(zzG zzg) {
        this.zzZx.add(zzg);
        zzV(zzg.zzZO());
        zzg.zzW(zzZH());
        if (!this.zzZt) {
            zzW(zzg.zzZN());
        } else if (zzZH().isIdentity()) {
            zzg.zzZ(zzY(zzg.zzZN()));
        } else if (zzAN.zzZD(zzZH().zzOq())) {
            zzg.zzZ((zzP8) null);
        } else {
            zzP8 zzp8ZzY = zzY(zzg.zzZN());
            if (zzp8ZzY != null) {
                zzp8ZzY.zzY(zzZH().zzOo());
            }
            zzg.zzZ(zzp8ZzY);
        }
        zzZR();
        this.zzZy.push(null);
        this.zzZz.push(new zzP9());
    }

    private void zzW(zzG zzg) {
        zzV(zzg.zzZO());
        zzP8 zzp8 = null;
        zzg.zzW((zzP9) null);
        if (!this.zzZt) {
            zzW(zzg.zzZN());
            this.zzZy.push(null);
            return;
        }
        zzP8 zzp8ZzY = zzY(zzg.zzZN());
        if (zzp8ZzY == null || zzX(zzg)) {
            zzg.zzZ((zzP8) null);
            zzp8 = zzp8ZzY;
        } else {
            zzg.zzZ(zzp8ZzY);
        }
        this.zzZy.push(zzp8);
    }

    private static boolean zzX(zz7 zz7Var) {
        zz7 zz7Var2;
        for (int i = 0; i < zz7Var.getCount(); i++) {
            if (!(zz7Var.zzN(i) instanceof zzG) && ((zz7Var2 = (zz7) zzZKW.zzZ(zz7Var.zzN(i), zz7.class)) == null || !zzX(zz7Var2))) {
                return false;
            }
        }
        return true;
    }

    public static void zzZ(zzZL zzzl, boolean z, boolean z2, boolean z3) throws Exception {
        zzzl.zzZ(new zzD(z, z2, z3));
    }

    private zzP8 zzZG() {
        return this.zzZy.peek();
    }

    private zzP9 zzZH() {
        return this.zzZz.peek();
    }

    private void zzZI() {
        this.zzZz.pop();
        this.zzZy.pop();
    }

    private void zzZR() {
        this.zzZz.pop();
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(zzG zzg) {
        if (this.zzZx.contains(zzg)) {
            zzU(zzg);
        } else {
            zzZI();
        }
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzG zzg) {
        if (zzY((zz7) zzg)) {
            zzV(zzg);
        } else {
            zzW(zzg);
        }
    }

    private zzP8 zzY(zzP8 zzp8) {
        zzP8 zzp8ZzX = zzX(zzp8);
        if (zzp8ZzX != null) {
            return zzZG() == null ? zzp8ZzX : this.zzZw.zzY(zzZG(), zzp8ZzX);
        }
        if (zzZG() == null) {
            return null;
        }
        return zzZG().zzO8();
    }

    private zzP8 zzX(zzP8 zzp8) {
        if (zzp8 == null) {
            return null;
        }
        zzP8 zzp8ZzO8 = zzp8.zzO8();
        zzW(zzp8ZzO8);
        return zzp8ZzO8;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZG zzzg) {
        zzV(zzzg.zzZO());
        if (this.zzZv) {
            zzzg.zzY(zzZH());
            zzzg.zzW((zzP9) null);
            zzW(zzzg.zzZN());
        } else {
            zzzg.zzW(zzZH().isIdentity() ? null : zzZH());
        }
        zzZR();
    }

    private boolean zzY(zz7 zz7Var) {
        zz7 zz7Var2;
        zzZS zzzs;
        for (int i = 0; i < zz7Var.getCount(); i++) {
            if (zz7Var.zzN(i) instanceof zzZP) {
                if (zzZH().zzOt()) {
                    return true;
                }
                zzHR zzhr = (zzHR) zzZKW.zzZ(zz7Var, zzHR.class);
                if (zzhr != null) {
                    return zzhr.zzZO().zzOt();
                }
            }
            if (this.zzZu && (zzzs = (zzZS) zzZKW.zzZ(zz7Var.zzN(i), zzZS.class)) != null && zzzs.zzZg() == 268435456) {
                return true;
            }
            if (!(zz7Var.zzN(i) instanceof zzG) && (zz7Var2 = (zz7) zzZKW.zzZ(zz7Var.zzN(i), zz7.class)) != null && zzY(zz7Var2)) {
                return true;
            }
        }
        return false;
    }

    private void zzW(zzP8 zzp8) {
        if (zzp8 == null) {
            return;
        }
        zzp8.zzY(zzZH());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZP zzzp) {
        if (zzZH().zzOt()) {
            return;
        }
        zzZQ4 zzzq4ZzO = zzZH().zzO(zzzp.zzZj());
        zzzp.zzY(zzzq4ZzO.zzZE());
        zzzp.setSize(zzzq4ZzO.getSize());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZU zzzu) {
        zzV(zzzu.zzZO());
        zzzu.zzW(zzZH());
        zzZR();
    }

    private void zzV(zzP9 zzp9) {
        zzP9 zzp9ZzOh = zzZH().zzOh();
        if (!zzP9.zzO(zzp9)) {
            zzp9ZzOh.zzZ(zzp9, 0);
        }
        this.zzZz.push(zzp9ZzOh);
    }
}
