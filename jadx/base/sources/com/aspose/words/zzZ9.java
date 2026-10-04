package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ9 {
    private com.aspose.words.internal.zzD3<com.aspose.words.internal.zzDB> zzZEi = new com.aspose.words.internal.zzD3<>();
    private String zzZi;

    public static class zzZ {
        private int mTag;
        private int zzZEf;
        private int zzZEg;
        private int zzZEh;

        public zzZ(int i, int i2, int i3, int i4) {
            this.mTag = i;
            this.zzZEh = i2;
            this.zzZEg = i3;
            this.zzZEf = i4;
        }

        public final int getTag() {
            return this.mTag;
        }

        public final int getValueCount() {
            return this.zzZEh;
        }

        public final int zzaJ() {
            return this.zzZEf;
        }

        public final int zzaK() {
            return this.zzZEg;
        }
    }

    public zzZ9(zzYYL zzyyl, int i, zzYY[] zzyyArr) throws Exception {
        this.zzZi = com.aspose.words.internal.zzZO0.zzhX().zzZn(zzyyl.zzn(zzyyl.readByte() & 255));
        zzZ(zzyyl, i, zzyyArr);
    }

    private int zzYF(int i, int i2) {
        com.aspose.words.internal.zzDB zzdb = this.zzZEi.get(i);
        if (zzdb == null || i2 >= zzdb.getCount()) {
            throw new IllegalStateException("Tag or index is invalid.");
        }
        return zzdb.get(i2);
    }

    private void zzZ(zzYYL zzyyl, int i, zzYY[] zzyyArr) throws Exception {
        ArrayList<zzZ> arrayList = new ArrayList();
        byte[] bArrZzn = zzyyl.zzn(i);
        int i2 = 0;
        for (zzYY zzyy : zzyyArr) {
            if (zzyy.zzag()) {
                i2++;
            } else {
                byte b = bArrZzn[i2];
                byte bZzah = zzyy.zzah();
                int i3 = bZzah & 255;
                byte b2 = (byte) (b & 255 & i3);
                if (b2 != 0) {
                    if (b2 != bZzah) {
                        while ((bZzah & 1) == 0) {
                            bZzah = (byte) (bZzah >>> 1);
                            b2 = (byte) (b2 >>> 1);
                        }
                        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZ>) arrayList, new zzZ(zzyy.zzaj() & 255, b2 & 255, -1, zzyy.zzai() & 255));
                    } else if (com.aspose.words.internal.zzXU.zz7(i3) > 1) {
                        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZ>) arrayList, new zzZ(zzyy.zzaj() & 255, -1, zzyyl.zzYCY(), zzyy.zzai() & 255));
                    } else {
                        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZ>) arrayList, new zzZ(zzyy.zzaj() & 255, 1, -1, zzyy.zzai() & 255));
                    }
                }
            }
        }
        for (zzZ zzz : arrayList) {
            com.aspose.words.internal.zzDB zzdb = new com.aspose.words.internal.zzDB();
            if (zzz.getValueCount() != -1) {
                for (int i4 = 0; i4 < zzz.getValueCount(); i4++) {
                    for (int i5 = 0; i5 < zzz.zzaJ(); i5++) {
                        zzdb.add(zzyyl.zzYCY());
                    }
                }
            } else {
                long position = 0;
                while (position < zzz.zzaK()) {
                    long position2 = zzyyl.zzq().getPosition();
                    int iZzYCY = zzyyl.zzYCY();
                    position += zzyyl.zzq().getPosition() - position2;
                    zzdb.add(iZzYCY);
                }
            }
            this.zzZEi.set(zzz.getTag(), zzdb);
        }
    }

    public final int getLength() {
        return zzYF(6, 1);
    }

    public final int getStartPosition() {
        return zzYF(6, 0);
    }

    public final String getText() {
        return this.zzZi;
    }

    public final int zzaL() {
        return zzYF(4, 0);
    }

    public final int zzaM() {
        return zzYF(1, 0);
    }

    public final int zzaP() {
        return zzYF(3, 0);
    }
}
