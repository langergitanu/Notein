package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz42 {
    private zz45 zzZ0o;

    private zz42(zz45 zz45Var) {
        this.zzZ0o = zz45Var;
    }

    private com.aspose.words.internal.zzZG zzX(zzZC2 zzzc2) throws Exception {
        if (!this.zzZ0o.zzZx2() && this.zzZ0o.zzO6() == 4) {
            return null;
        }
        try {
            com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG();
            zzZ(zzzc2, zzzg);
            if (this.zzZ0o.zzZx2()) {
                zzzg.zzX(zzzc2.zzZ2());
            }
            zzzg.zzY(zzY(zzzc2, zzzg));
            if (zzzg.zzZ2() != null && zzzg.zzZ1() != null && zzzg.zzZ1().isEmpty()) {
                zzzg.zzY((com.aspose.words.internal.zzPY) null);
            }
            if (zzzg.zzZ2() == null) {
                if (zzzg.zzZ1() == null) {
                    return null;
                }
            }
            return zzzg;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    private com.aspose.words.internal.zzPY zzY(zzZC2 zzzc2, com.aspose.words.internal.zzZG zzzg) throws Exception {
        if (this.zzZ0o.zzO6() == 4) {
            return null;
        }
        return zzzc2.zzZ(zzZwM(), zzzg);
    }

    public static void zzZ(zz45 zz45Var, com.aspose.words.internal.zzZG zzzg, zzZC2 zzzc2) {
        new zz42(zz45Var).zzZ(zzzg, zzzc2);
    }

    private zzZCM zzZwM() {
        int iZzO6 = this.zzZ0o.zzO6();
        if (iZzO6 == 0) {
            return new zz2P(0.4d);
        }
        if (iZzO6 == 1) {
            return new zz2P(0.6d);
        }
        if (iZzO6 == 2) {
            return new zz0C(0.6d);
        }
        if (iZzO6 == 3) {
            return new zz0C(0.8d);
        }
        if (iZzO6 == 4 || iZzO6 == 5) {
            return null;
        }
        throw new IllegalArgumentException();
    }

    public static com.aspose.words.internal.zzZG zzZ(zz45 zz45Var, zzZC2 zzzc2) throws Exception {
        return new zz42(zz45Var).zzX(zzzc2);
    }

    private void zzZ(com.aspose.words.internal.zzZG zzzg, zzZC2 zzzc2) {
        if (this.zzZ0o.zzO6() == 4) {
            return;
        }
        zzZ(zzzc2, zzzg);
    }

    private void zzZ(zzZC2 zzzc2, com.aspose.words.internal.zzZG zzzg) {
        com.aspose.words.internal.zzP5 zzp5;
        zzzc2.zzn(this.zzZ0o.getWidth(), this.zzZ0o.getHeight());
        loop0: while (true) {
            zzp5 = null;
            for (zzZC4 zzzc4 : this.zzZ0o.zzZx3()) {
                if (zzp5 == null) {
                    zzp5 = new com.aspose.words.internal.zzP5();
                }
                zzzc4.zzZ(zzzc2, zzp5);
                boolean z = zzzc4 instanceof zzC4;
                if ((zzzc4 instanceof zz57) && zzp5.getCount() > 0) {
                    z = true;
                }
                if (z) {
                    break;
                }
            }
            zzZ(zzzg, zzp5);
        }
        if (zzp5 != null) {
            zzZ(zzzg, zzp5);
        }
    }

    private static void zzZ(com.aspose.words.internal.zzZG zzzg, com.aspose.words.internal.zzP5 zzp5) {
        if (zzp5.getCount() > 0) {
            com.aspose.words.internal.OooO00o.OooO00o(zzzg, zzp5);
        }
    }
}
