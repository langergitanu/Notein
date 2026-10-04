package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYY0 {
    private com.aspose.words.internal.zzZO0 zzMW;
    private zzZA7 zzXXP;

    public static class zzY {
        private zzYYG zzXXJ;
        private zzYYG zzXXK;
        private zzYYG zzXXL;
        private zzYYG zzXXM;

        public zzY() {
            try {
                this.zzXXM = new zzYYG();
                this.zzXXL = new zzYYG();
                this.zzXXK = new zzYYG();
                zzYYG zzyyg = new zzYYG();
                this.zzXXJ = zzyyg;
                zzyyg.zzYCU().zzk(1229215828);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        public final zzYYG zzYCu() {
            return this.zzXXJ;
        }

        public final zzYYG zzYCv() {
            return this.zzXXK;
        }

        public final zzYYG zzYCw() {
            return this.zzXXL;
        }

        public final zzYYG zzYCx() {
            return this.zzXXM;
        }
    }

    public static class zzZ extends zzY {
        private int zzXXN;
        private int zzXXO;

        private zzZ() {
        }

        public final int zzYCy() {
            return this.zzXXO;
        }

        public final int zzas() {
            return this.zzXXN;
        }

        public final void zztU(int i) {
            this.zzXXN = i;
        }

        public final void zztV(int i) {
            this.zzXXO = i;
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    public zzYY0(zzZA7 zzza7, com.aspose.words.internal.zzZO0 zzzo0) {
        this.zzXXP = zzza7;
        this.zzMW = zzzo0;
    }

    private static void zzX(zzYYG zzyyg, int i, int i2) throws Exception {
        zzyyg.zzYCU().zzi(i + 192 + i2);
    }

    private static void zzY(zzYYG zzyyg, int i, int i2) throws Exception {
        com.aspose.words.internal.zzXZ zzxzZzYCU = zzyyg.zzYCU();
        zzxzZzYCU.zzk(1229866072);
        zzxzZzYCU.zzk(192);
        zzxzZzYCU.zzk(0);
        zzxzZzYCU.zzk(1);
        zzxzZzYCU.zzk(0);
        zzxzZzYCU.zzk(i + 192);
        zzxzZzYCU.zzk(i2);
        zzxzZzYCU.zzk(-1);
        zzxzZzYCU.zzk(-1);
        for (int i3 = 0; i3 < 39; i3++) {
            zzxzZzYCU.zzk(0);
        }
    }

    private static void zzZ(zzYYG zzyyg, int i, int i2, int i3, int i4, int i5, int i6) throws Exception {
        com.aspose.words.internal.zzXZ zzxzZzYCU = zzyyg.zzYCU();
        zzxzZzYCU.zzk(1229866072);
        zzxzZzYCU.zzk(192);
        zzxzZzYCU.zzk(0);
        zzxzZzYCU.zzk(0);
        zzxzZzYCU.zzk(2);
        zzxzZzYCU.zzk(i + 192 + i2);
        zzxzZzYCU.zzk(i3);
        zzxzZzYCU.zzk(i4);
        zzxzZzYCU.zzk(-1);
        zzxzZzYCU.zzk(i5);
        zzxzZzYCU.zzk(0);
        zzxzZzYCU.zzk(0);
        zzxzZzYCU.zzk(0);
        zzxzZzYCU.zzk(i6);
        for (int i7 = 0; i7 < 31; i7++) {
            zzxzZzYCU.zzk(0);
        }
        zzxzZzYCU.zzk(192);
        zzxzZzYCU.zzk(0);
        zzxzZzYCU.zzk(0);
    }

    public final ArrayList<zzYYG> zzYCz() throws Exception {
        zzY zzy = new zzY();
        this.zzXXP.zzZ(zzy.zzYCw());
        zzy.zzYCw().zzYCV();
        ArrayList<zzZ> arrayList = new ArrayList();
        byte b = 0;
        zzZ zzz = new zzZ(b);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZ>) arrayList, zzz);
        for (int i = 0; i < this.zzXXP.zzas(); i++) {
            zzYYG zzyyg = new zzYYG();
            this.zzXXP.zzZ(zzyyg, i);
            if (zzz.zzYCv().getLength() + 192 + zzz.zzYCu().getLength() + zzyyg.getLength() + 2 > 64488) {
                zzz = new zzZ(b);
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZ>) arrayList, zzz);
            }
            zzY(zzz.zzYCu(), zzz.zzYCv().getLength());
            zzyyg.zzY(zzz.zzYCv());
            zzz.zztV(i);
            zzz.zztU(zzz.zzas() + 1);
        }
        for (zzZ zzz2 : arrayList) {
            zzX(zzy.zzYCu(), zzy.zzYCw().getLength(), zzy.zzYCv().getLength());
            this.zzXXP.zzZ(zzy.zzYCv(), zzz2.zzYCy(), zzz2.zzas());
        }
        zzy.zzYCv().zzYCV();
        zzy.zzYCu().zzYCV();
        zzZ(zzy.zzYCx(), zzy.zzYCw().getLength(), zzy.zzYCv().getLength(), arrayList.size(), this.zzMW.getCodePage(), this.zzXXP.zzas(), this.zzXXP.zzar());
        zzy.zzYCx().zzYCV();
        ArrayList<zzYYG> arrayList2 = new ArrayList<>();
        zzYYG zzyyg2 = new zzYYG();
        zzy.zzYCx().zzY(zzyyg2);
        zzy.zzYCw().zzY(zzyyg2);
        zzy.zzYCv().zzY(zzyyg2);
        zzy.zzYCu().zzY(zzyyg2);
        com.aspose.words.internal.zzZQG.zzZ(arrayList2, zzyyg2);
        for (zzZ zzz3 : arrayList) {
            zzYYG zzyyg3 = new zzYYG();
            zzz3.zzYCv().zzYCV();
            zzz3.zzYCu().zzYCV();
            zzY(zzz3.zzYCx(), zzz3.zzYCv().getLength(), zzz3.zzas());
            zzz3.zzYCx().zzYCV();
            zzz3.zzYCx().zzY(zzyyg3);
            zzz3.zzYCv().zzY(zzyyg3);
            zzz3.zzYCu().zzY(zzyyg3);
            com.aspose.words.internal.zzZQG.zzZ(arrayList2, zzyyg3);
        }
        return arrayList2;
    }

    private static void zzY(zzYYG zzyyg, int i) throws Exception {
        zzyyg.zzYCU().zzi(i + 192);
    }
}
