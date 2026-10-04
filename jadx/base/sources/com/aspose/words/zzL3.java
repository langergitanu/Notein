package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzL3 {
    static zzZCX zzZkg;
    static zzZCX zzZkk;
    static zzZCX zzZkm = new zzV(3);
    static zzZCX zzZkl = new zzV(4);
    static zzZCX zzZkj = new zzV(5);
    static zzZCX zzZki = new zzY(3);
    static zzZCX zzZkh = new zzY(4);
    static zzZCX zzZkf = new zzY(5);
    static zzZCX zzZke = new zzV(0);
    static zzZCX zzZkd = new zzV(2);
    static zzZCX zzZkc = new zzV(6);
    static zzZCX zzZkb = new zzV(9);

    public static class zzU implements zzZCX {
        private zzL4[] zzZk9;

        public zzU(zzL4[] zzl4Arr) {
            this.zzZk9 = zzl4Arr;
        }

        @Override // com.aspose.words.zzZCX
        public final boolean zzX(zzL4 zzl4, boolean z) {
            return zzl4.zzY(this.zzZk9);
        }
    }

    public static class zzV implements zzZCX {
        private int zzZxi;

        public zzV(int i) {
            this.zzZxi = i;
        }

        @Override // com.aspose.words.zzZCX
        public final boolean zzX(zzL4 zzl4, boolean z) {
            return zzl4.getValueType() == this.zzZxi;
        }
    }

    public static class zzW implements zzZCX {
        private zzW() {
        }

        @Override // com.aspose.words.zzZCX
        public final boolean zzX(zzL4 zzl4, boolean z) {
            return zzl4.zzYa(z);
        }

        public /* synthetic */ zzW(byte b) {
            this();
        }
    }

    public static class zzX implements zzZCX {
        private zzX() {
        }

        @Override // com.aspose.words.zzZCX
        public final boolean zzX(zzL4 zzl4, boolean z) {
            return zzl4.zzYa(z) && zzl4.getDoubleValue() >= 0.0d;
        }

        public /* synthetic */ zzX(byte b) {
            this();
        }
    }

    public static class zzY implements zzZCX {
        private int zzZxi;

        public zzY(int i) {
            this.zzZxi = i;
        }

        @Override // com.aspose.words.zzZCX
        public final boolean zzX(zzL4 zzl4, boolean z) {
            return zzl4.getValueType() == this.zzZxi && zzl4.getDoubleValue() >= 0.0d;
        }
    }

    public static class zzZ implements zzZCX {
        private zzZCX[] zzZka;

        public zzZ(zzZCX[] zzzcxArr) {
            this.zzZka = zzzcxArr;
        }

        @Override // com.aspose.words.zzZCX
        public final boolean zzX(zzL4 zzl4, boolean z) {
            for (zzZCX zzzcx : this.zzZka) {
                if (zzzcx.zzX(zzl4, z)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        byte b = 0;
        zzZkk = new zzW(b);
        zzZkg = new zzX(b);
    }

    public static zzZCX zzJ(zzL4 zzl4) {
        return zzX(zzl4);
    }

    public static zzZCX zzX(zzL4... zzl4Arr) {
        return new zzU(zzl4Arr);
    }

    public static zzZCX zzZ(zzZCX... zzzcxArr) {
        return new zzZ(zzzcxArr);
    }
}
