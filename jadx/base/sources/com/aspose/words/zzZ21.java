package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ21 {
    private zzZ28[] zzY3W = {new zzYK9(), new zzZKS(), new zzZKG(), new zzZ4I(), new zzZRC(), new zzZ4T(), new zzZUR()};
    private zzZ27 zzY3X;

    private zzZ21(com.aspose.words.internal.zzRK zzrk) {
        this.zzY3X = new zzZ27(zzrk);
    }

    private static FileFormatInfo zzP(com.aspose.words.internal.zzZO0 zzzo0) {
        FileFormatInfo fileFormatInfo = new FileFormatInfo();
        fileFormatInfo.setLoadFormat(63);
        fileFormatInfo.zzZ(zzzo0);
        return fileFormatInfo;
    }

    public static FileFormatInfo zzZ(com.aspose.words.internal.zzRK zzrk) throws Exception {
        com.aspose.words.internal.zzZOS zzzos = (com.aspose.words.internal.zzZOS) com.aspose.words.internal.zzZKW.zzZ(zzrk.zzR1(), com.aspose.words.internal.zzZOS.class);
        return (zzzos != null && com.aspose.words.internal.zzZYD.zzXk(zzzos.getName()) && com.aspose.words.internal.zzKE.zzZT(com.aspose.words.internal.zzZOQ.zzVe(zzzos.getName())) == 35) ? zzP(zzrk.zzQZ()) : new zzZ21(zzrk).zzZ1V();
    }

    private FileFormatInfo zzZ1V() throws Exception {
        int count = 0;
        int weight = 0;
        while (this.zzY3X.zzYIV() && ((double) this.zzY3X.zzYIO()) / this.zzY3X.getLength() <= 0.01d) {
            for (zzZ28 zzz28 : this.zzY3W) {
                if (zzz28.zzY(this.zzY3X)) {
                    count += zzz28.getCount();
                    weight += zzz28.getWeight();
                    if (weight >= 12 && count >= 2) {
                        return zzP(this.zzY3X.zzQZ());
                    }
                }
            }
        }
        return null;
    }
}
