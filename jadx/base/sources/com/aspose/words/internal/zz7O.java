package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz7O {
    private zzY zzo2;
    private zzY zzo3;
    private zzKO zzo4;

    public static class zzY {
        zzY zznY;
        zzKO zznZ;
        zz6N zzo0;

        public zzY(zz6N zz6n) {
            this.zzo0 = zz6n;
        }
    }

    public static class zzZ extends zzKO {
        private zzKO zzo1;
        private zzY zzo3;
        private zzKO zzo4;

        public zzZ(Class cls, zzY zzy, zzKO zzko, zzKO zzko2) {
            super(cls);
            this.zzo3 = zzy;
            this.zzo4 = zzko;
            this.zzo1 = zzko2;
        }

        private static boolean zzp(Object obj) {
            if (obj == null) {
                return true;
            }
            zzHA zzha = (zzHA) zzZKW.zzZ(obj, zzHA.class);
            return (zzha == null || zzha.zzFH()) ? false : true;
        }

        @Override // com.aspose.words.internal.zzKO
        public final String zzN5() {
            return this.zzo1.zzN5();
        }

        @Override // com.aspose.words.internal.zzKO
        public final boolean zzSj() {
            return this.zzo1.zzSj();
        }

        @Override // com.aspose.words.internal.zzZVP
        public final Object zzTT() {
            return this.zzo1.zzTT();
        }

        @Override // com.aspose.words.internal.zzZVP
        public final boolean zzTU() {
            return this.zzo1.zzTU();
        }

        @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
        public final boolean zzs() {
            return this.zzo1.zzs();
        }

        @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
        public final Object zzu() {
            return this.zzo1.zzu();
        }

        @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
        public final Object zzv() {
            return this.zzo1.zzv();
        }

        @Override // com.aspose.words.internal.zzKO, com.aspose.words.internal.zzH0
        public final Object zzx() throws Exception {
            Object objZzx = this.zzo4.zzx();
            for (zzY zzy = this.zzo3; zzy != null; zzy = zzy.zznY) {
                if (zzp(objZzx)) {
                    return null;
                }
                zzy.zzo0.setValue(objZzx);
                objZzx = zzy.zznZ.zzx();
                zzy.zzo0.zzFi();
            }
            return objZzx;
        }
    }

    private zz7O(zzKO zzko) {
        this.zzo4 = zzko;
    }

    private zz7O zzK(zzKO zzko) {
        this.zzo2.zznZ = zzko;
        return this;
    }

    public static zz7O zzZ(zzKO zzko, String str, zzGY zzgy, zzGZ zzgz) {
        return new zz7O(zzko).zzZ(true, str, zzgy, zzgz);
    }

    private zzKO zzZN(boolean z) {
        if (!z) {
            return this.zzo2.zznZ;
        }
        zzY zzy = this.zzo2;
        zzKO zzko = zzy != null ? zzy.zznZ : this.zzo4;
        if (!zzko.zznr()) {
            throw new zzCX(zzZKN.format("Can not use null-conditional access on a value of type '{0}'.", zzko.getType()));
        }
        zzY zzy2 = new zzY(zz6N.zzZ(zzKK.zzV(zzko, true), null));
        zzY zzy3 = this.zzo2;
        if (zzy3 != null) {
            zzy3.zznY = zzy2;
        }
        this.zzo2 = zzy2;
        if (this.zzo3 == null) {
            this.zzo3 = zzy2;
        }
        return zzy2.zzo0;
    }

    public final zzKO zzxM() {
        return this.zzo2.zznZ;
    }

    public final zzKO zzxN() {
        return new zzZ(this.zzo2.zznZ.zznr() ? this.zzo2.zznZ.getType() : zzZZO.zzA(this.zzo2.zznZ.getType()), this.zzo3, this.zzo4, this.zzo2.zznZ);
    }

    public static zz7O zzZ(zzKO zzko, zzKO[] zzkoArr, zzGY zzgy, zzGZ zzgz) {
        return new zz7O(zzko).zzZ(true, zzkoArr, zzgy, zzgz);
    }

    public static zz7O zzZ(zzKO zzko, String str, zzKO[] zzkoArr, zzGY zzgy, zzGZ zzgz) {
        return new zz7O(zzko).zzZ(true, str, zzkoArr, zzgy, zzgz);
    }

    public final zz7O zzZ(boolean z, String str, zzGY zzgy, zzGZ zzgz) {
        return zzK(zzgz.zzZ(zzZN(z), str, zzgy));
    }

    public final zz7O zzZ(boolean z, zzKO[] zzkoArr, zzGY zzgy, zzGZ zzgz) {
        return zzK(zzgz.zzZ(zzZN(z), zzkoArr, zzgy));
    }

    public final zz7O zzZ(boolean z, String str, zzKO[] zzkoArr, zzGY zzgy, zzGZ zzgz) {
        return zzK(zzgz.zzZ(zzZN(z), str, zzkoArr, zzgy));
    }
}
