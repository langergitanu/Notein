package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzSB extends zz72 {
    private static final zzZHW zzUR = new zzZHW("op_Explicit", "op_Implicit");
    private boolean zzOj;
    private zzZ zzOk;
    private zzZ zzOl;

    public static class zzX extends zzZ {
        public zzX(zzSB zzsb, zzZVP zzzvp) {
            super(zzsb, zzzvp);
        }

        @Override // com.aspose.words.internal.zzSB.zzZ
        public final zzZVP zzU(zzZW5 zzzw5) {
            return zzRz().zzP(zzzw5);
        }

        @Override // com.aspose.words.internal.zzSB.zzZ
        public final boolean zzW(zzZW5 zzzw5) {
            return zzSC.zzX(zzU(zzzw5), zzRy());
        }

        @Override // com.aspose.words.internal.zzSB.zzZ
        public final zzZW5 zzY(boolean z, boolean z2) {
            return zzj(!z2);
        }
    }

    public static class zzY extends zzZ {
        public zzY(zzSB zzsb, zzZVP zzzvp) {
            super(zzsb, zzzvp);
        }

        @Override // com.aspose.words.internal.zzSB.zzZ
        public final zzZVP zzU(zzZW5 zzzw5) {
            return zzRz().zzY(zzzw5, 0);
        }

        @Override // com.aspose.words.internal.zzSB.zzZ
        public final boolean zzW(zzZW5 zzzw5) {
            return zzSC.zzX(zzRy(), zzU(zzzw5));
        }

        @Override // com.aspose.words.internal.zzSB.zzZ
        public final zzZW5 zzY(boolean z, boolean z2) {
            return zzj(z);
        }
    }

    public zzSB(zzZVP zzzvp, zzZVP zzzvp2) {
        super(new zzZVP[]{zzzvp});
        this.zzOl = new zzY(this, zzzvp);
        this.zzOk = new zzX(this, zzzvp2);
    }

    private boolean zzX(zzZW5 zzzw5) {
        return zzO(zzzw5) == this.zzOj && this.zzOl.zzV(zzzw5) && this.zzOk.zzV(zzzw5);
    }

    private static boolean zzY(zzZW5 zzzw5) {
        int iZzTP = zzUR.zzTP(zzzw5.zznU());
        return (iZzTP == 0 || iZzTP == 1) && zzzw5.zzAE().length == 1;
    }

    @Override // com.aspose.words.internal.zzZW8, com.aspose.words.internal.zzF7
    public final zzZW5 zzRB() {
        if (zznW() == null || !this.zzOl.zzRA() || !this.zzOk.zzRA()) {
            return null;
        }
        this.zzOj = false;
        zzZW5 zzzw5ZzRB = super.zzRB();
        if (zzzw5ZzRB != null) {
            return zzzw5ZzRB;
        }
        this.zzOj = true;
        return super.zzRB();
    }

    @Override // com.aspose.words.internal.zz72
    public final boolean zzZ(zzZW5 zzzw5) {
        return zzY(zzzw5) && this.zzOl.zzW(zzzw5) && this.zzOk.zzW(zzzw5);
    }

    public static abstract class zzZ {
        private zzZW5 zzOg;
        private zzZVP zzOh;
        private zzSB zzOi;

        public zzZ(zzSB zzsb, zzZVP zzzvp) {
            this.zzOi = zzsb;
            this.zzOh = zzzvp;
        }

        private zzZW5 zzRB() {
            boolean z = false;
            boolean z2 = false;
            for (zzZW5 zzzw5 : this.zzOi.zznW()) {
                zzZVP zzzvpZzU = zzU(zzzw5);
                if (this.zzOh.getType() == zzzvpZzU.getType()) {
                    return zzzw5;
                }
                if (zzSC.zzU(this.zzOh, zzzvpZzU)) {
                    z = true;
                } else if (zzSC.zzU(zzzvpZzU, this.zzOh)) {
                    z2 = true;
                }
            }
            if (z || z2) {
                return zzY(z, z2);
            }
            return null;
        }

        private boolean zzX(zzZW5 zzzw5, zzZW5 zzzw52) {
            return zzU(zzzw5).getType() == zzU(zzzw52).getType();
        }

        private boolean zzY(zzZW5 zzzw5, boolean z) {
            return zzSC.zzU(z ? this.zzOh : zzU(zzzw5), z ? zzU(zzzw5) : this.zzOh);
        }

        private boolean zzZ(zzZW5 zzzw5, boolean z) {
            if (!zzY(zzzw5, z)) {
                return false;
            }
            for (zzZW5 zzzw52 : this.zzOi.zznW()) {
                if (zzzw5 != zzzw52 && zzY(zzzw52, z) && !zzZ(zzzw5, zzzw52, z)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean zzRA() {
            zzZW5 zzzw5ZzRB = zzRB();
            this.zzOg = zzzw5ZzRB;
            return zzzw5ZzRB != null;
        }

        public final zzZVP zzRy() {
            return this.zzOh;
        }

        public final zzSB zzRz() {
            return this.zzOi;
        }

        public abstract zzZVP zzU(zzZW5 zzzw5);

        public final boolean zzV(zzZW5 zzzw5) {
            return zzX(this.zzOg, zzzw5);
        }

        public abstract boolean zzW(zzZW5 zzzw5);

        public abstract zzZW5 zzY(boolean z, boolean z2);

        public final zzZW5 zzj(boolean z) {
            zzZW5 zzzw5 = null;
            for (zzZW5 zzzw52 : this.zzOi.zznW()) {
                if (zzzw5 == null || !zzX(zzzw5, zzzw52)) {
                    if (!zzZ(zzzw52, z)) {
                        continue;
                    } else {
                        if (zzzw5 != null) {
                            return null;
                        }
                        zzzw5 = zzzw52;
                    }
                }
            }
            return zzzw5;
        }

        private boolean zzZ(zzZW5 zzzw5, zzZW5 zzzw52, boolean z) {
            zzZW5 zzzw53 = z ? zzzw52 : zzzw5;
            if (!z) {
                zzzw5 = zzzw52;
            }
            return zzSC.zzU(zzU(zzzw5), zzU(zzzw53));
        }
    }

    @Override // com.aspose.words.internal.zzZW8
    public final boolean zzZ(zzZW5 zzzw5, zzZW5 zzzw52) {
        return zzX(zzzw5) && !zzX(zzzw52);
    }
}
