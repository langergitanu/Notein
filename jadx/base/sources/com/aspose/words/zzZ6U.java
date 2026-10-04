package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ6U extends zzZ6S {
    private ArrayList<zzYAU> zzYgi;
    private boolean zzYgj;
    private long zzYgo;

    public zzZ6U(zzYMD zzymd, long j) {
        super(zzymd);
        this.zzYgo = 0L;
        this.zzYgi = new ArrayList<>(5);
        this.zzYgo = j;
    }

    private static void zzS(zzYAU zzyau, zzYAU zzyau2) {
        zzZ4N zzz4nZzYPe = zzyau.zzaa().zzY4s().zzYPe();
        zzz4nZzYPe.zzX(zzyau);
        new ArrayList();
        while (zzz4nZzYPe.moveNext()) {
            zzYAU zzyau3 = (zzYAU) zzz4nZzYPe.zzYPi();
            zzyau3.zzQA(true);
            if (zzyau3 == zzyau2) {
                return;
            }
        }
    }

    private boolean zzW(zzZ61 zzz61, zzYAU zzyau) throws Exception {
        int iZzZo6 = zzyau.zzZo6();
        if (iZzZo6 == 0) {
            if (zzyau instanceof zzYAC) {
                this.zzYgj = true;
            } else {
                if (!this.zzYgj || !(zzyau instanceof zzYAH) || 3 != zzyau.zzZ1s()) {
                    return false;
                }
                zzY(zzz61);
            }
            return true;
        }
        if (iZzZo6 == 9217 || iZzZo6 == 10754) {
            if (this.zzYgj) {
                zzY(zzz61);
            }
            return false;
        }
        if (iZzZo6 == 12803 || iZzZo6 == 25604 || !this.zzYgj || !zzY9R.zzmX(zzyau.zzZo6())) {
            return false;
        }
        zzyau.getText();
        if (zzyau.getText().charAt(0) == 8194) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzYgi, zzyau);
        } else {
            zzY(zzz61);
        }
        return true;
    }

    private static boolean zzX(zzZ61 zzz61, zzYAU zzyau) throws Exception {
        zzY9Y zzy9y = (zzY9Y) com.aspose.words.internal.zzZKW.zzZ(zzyau, zzY9Y.class);
        boolean z = false;
        if (zzy9y == null) {
            return false;
        }
        if (zzy9y.zzZ1s() != 2) {
            zzy9y.zzZ1s();
        }
        zzY9Y zzy9yZzZ = zzZ(zzy9y);
        boolean z2 = (zzy9yZzZ.zzYRv().getLevel() == 2 || zzy9yZzZ.zzYRv().getLevel() == 4) ? false : true;
        boolean z3 = zzy9yZzZ.zzY5a() && zzy9yZzZ.zza8().zzYT6();
        if (!z3 || zzy9yZzZ.zzYRv().getChild(7, 0, true) == null) {
            z = z3;
        } else {
            zzY20.zzZ(zzy9yZzZ.zzYRv().getDocument().getWarningCallback(), "Sdt control cannot be preserved as editable because content is not rich text only", zzy9yZzZ.zzYRv());
        }
        if (zzy9yZzZ.zzZ1s() == 2) {
            if (z || z2) {
                new zzZ66(zzy9yZzZ).zzZ(zzz61);
            }
            if (z) {
                new zzZ67(zzy9yZzZ).zzZ(zzz61);
                if (!zzy9yZzZ.isEmpty()) {
                    zzS(zzy9yZzZ, (zzYAU) zzy9yZzZ.zzY7o().zzYo0());
                    return z;
                }
            }
        } else {
            zzy9yZzZ.zzZ1s();
            if (z || z2) {
                new zzZ66(zzy9yZzZ).zzZ(zzz61);
                return z;
            }
        }
        return z;
    }

    private static boolean zzY(zzZ61 zzz61, zzYAU zzyau) throws Exception {
        zzYAC zzyac = (zzYAC) com.aspose.words.internal.zzZKW.zzZ(zzyau, zzYAC.class);
        if (zzyac == null || !zzyac.zza8().zzYT7()) {
            return false;
        }
        new zzZ6A(zzyau).zzZ(zzz61);
        zzS(zzyau, zzt(zzyau));
        return true;
    }

    private static zzYAU zzt(zzYAU zzyau) {
        while (zzyau != null) {
            zzYAH zzyah = (zzYAH) com.aspose.words.internal.zzZKW.zzZ(zzyau.zzY6Y(), zzYAH.class);
            if (zzyah != null) {
                return zzyah.zzY5A();
            }
            zzyau = zzyau.zzY6Y();
        }
        throw new IllegalStateException("Enclosing field not found.");
    }

    private static void zzu(zzYAU zzyau) throws Exception {
        if (zzyau.zzZo6() == 25604 && zzyau.zzY6M().zzYLJ().getWrapType() != 0) {
            ((zzY9X) com.aspose.words.internal.zzZKW.zzZ(zzyau, zzY9X.class)).zzF(null);
        }
    }

    private static zzZ6H zzv(zzYAU zzyau) throws Exception {
        if (zzyau instanceof zzYAS) {
            if (zzyau.zzZo6() == 10784) {
                return null;
            }
            return new zzZ6B(zzyau);
        }
        if (zzyau instanceof zzYAT) {
            return new zzZ6G(zzyau);
        }
        if (zzyau instanceof zzY9V) {
            return new zzZ6F(zzyau);
        }
        int iZzZo6 = zzyau.zzZo6();
        if (iZzZo6 != 9217) {
            if (iZzZo6 == 9754) {
                return new zzZ6F(zzyau);
            }
            if (iZzZo6 != 10754) {
                if (iZzZo6 == 12803) {
                    return new zzZ65(zzyau);
                }
                if (iZzZo6 == 25604) {
                    return new zzZ68(zzyau);
                }
                if (iZzZo6 == 9244 || iZzZo6 == 9245) {
                    return new zzZ69(zzyau);
                }
                return null;
            }
        }
        return new zzZ64(zzyau);
    }

    @Override // com.aspose.words.zzZ6S
    public final void zzZ(zzZ61 zzz61) throws Exception {
        zzZ6H zzz6hZzv;
        zzz61.zzZ(this);
        ArrayList<zzYAU> arrayListZzUS = ((zzZ55) this.zzYgm).zzUS(zzz61.zzYTT());
        for (int i = 0; i < arrayListZzUS.size(); i++) {
            zzYAU zzyau = arrayListZzUS.get(i);
            if (zzyau.zzZo6() == 11799 && i == arrayListZzUS.size() - 1) {
                zzyau.setContentWidth(Integer.MIN_VALUE);
            }
            if (zzyau.zzY6E()) {
                zzyau.zzQA(false);
            } else if (!zzX(zzz61, zzyau) && !zzY(zzz61, zzyau) && !zzW(zzz61, zzyau) && !zzZ(zzz61, zzyau) && (zzz6hZzv = zzv(zzyau)) != null && zzz6hZzv.zzYRM()) {
                zzu(zzyau);
                zzz6hZzv.zzZ(zzz61);
            }
        }
        zzz61.zzY(this);
    }

    @Override // com.aspose.words.zzZ6S
    public final float zzZm() {
        return (this.zzYgm.getX() - ((int) this.zzYgo)) / 1000.0f;
    }

    @Override // com.aspose.words.zzZ6S
    public final float zzZo() throws Exception {
        return ((this.zzYgm.getY() - ((int) (this.zzYgo >> 32))) + ((zzZ55) this.zzYgm).zzZXQ()) / 1000.0f;
    }

    private void zzY(zzZ61 zzz61) throws Exception {
        int size = this.zzYgi.size();
        if (size > 0) {
            if (5 == size) {
                for (int i = 0; i < size; i++) {
                    new zzZ64(this.zzYgi.get(i), " ").zzZ(zzz61);
                }
            } else {
                for (int i2 = 0; i2 < size; i2++) {
                    new zzZ6F(this.zzYgi.get(i2)).zzZ(zzz61);
                }
            }
            this.zzYgi.clear();
        }
        this.zzYgj = false;
    }

    private static boolean zzZ(zzZ61 zzz61, zzYAU zzyau) throws Exception {
        zzYAC zzyac = (zzYAC) com.aspose.words.internal.zzZKW.zzZ(zzyau, zzYAC.class);
        if (zzyac == null || zzyac.zza8().zzYT7() || zzyac.zzYRH() != 1) {
            return false;
        }
        new zzZ6D(zzyau).zzZ(zzz61);
        return true;
    }

    private static zzY9Y zzZ(zzY9Y zzy9y) {
        return zzy9y.zzY59() ? (zzY9Y) zzy9y.zzY7o() : zzy9y;
    }
}
