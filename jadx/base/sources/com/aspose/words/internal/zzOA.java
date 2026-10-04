package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzOA extends zzAH {

    public static class zzZ implements zzH0 {
        private zzKO zzFK;
        private Class zzFL;
        private Class zzFM;
        private zzKO zzXY;

        public zzZ(zzKO zzko, zzKO zzko2) {
            Class<?> componentType = zzko.getType().getComponentType();
            this.zzFM = componentType;
            this.zzFL = zzZZO.zzz(componentType);
            this.zzXY = zzko;
            this.zzFK = zzko2;
        }

        @Override // com.aspose.words.internal.zzF6
        public final Class getType() {
            return this.zzFM;
        }

        @Override // com.aspose.words.internal.zzF6
        public final boolean zzs() {
            return false;
        }

        @Override // com.aspose.words.internal.zzF6
        public final Object zzu() {
            return null;
        }

        @Override // com.aspose.words.internal.zzF6
        public final Object zzv() {
            return this.zzXY.zzv();
        }

        @Override // com.aspose.words.internal.zzF6
        public final Class zzw() {
            return this.zzFL;
        }

        @Override // com.aspose.words.internal.zzH0
        public final Object zzx() throws Exception {
            return zzZZO.zzO(this.zzXY.zzx(), zz7F.zzT(this.zzFK.zzx(), this.zzFK.zznw()));
        }
    }

    private zzOA(zzKO zzko, zzAD zzad, zzKO[] zzkoArr) {
        super(zzko, zzad, zzkoArr);
    }

    public static zzOA zzY(zzKO zzko, zzKO[] zzkoArr, zzGY zzgy) {
        if (zzko.zzSj()) {
            return new zzOA();
        }
        int i = 1;
        if (!zzko.getType().isArray()) {
            zzAD zzadZzZ = zzRE.zzZ(zzko, zzkoArr, zzgy);
            if (zzadZzZ != null) {
                return new zzOA(zzko, zzadZzZ, zzkoArr);
            }
        } else if (zzkoArr.length == 1) {
            zzko.getType();
            zzZZO.zzrM();
            if (zzkoArr[0].zzIM()) {
                return new zzOA(zzko, zzkoArr[0]);
            }
            i = 2;
        } else {
            i = 3;
        }
        if (zzgy.zzIH()) {
            return new zzOA();
        }
        throw new zzCX(zzZ(i, zzko));
    }

    private static String zzZ(int i, zzKO zzko) {
        if (i == 1) {
            return zzZKN.format("Can not resolve an indexer on type '{0}'.", zzko.getType());
        }
        if (i == 2) {
            return zzZKN.format("An array index value must be implicitly convertible to type '{0}'.", Integer.TYPE);
        }
        if (i == 3) {
            return "Indexing of multi-dimensional arrays is not supported.";
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: error");
    }

    private zzOA(zzKO zzko, zzKO zzko2) {
        super(new zzZ(zzko, zzko2));
    }

    private zzOA() {
    }
}
