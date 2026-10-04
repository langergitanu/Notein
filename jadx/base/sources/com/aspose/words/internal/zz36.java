package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz36 {
    private zzZYV<String> zzhu = new zzZYV<>();
    private int zzhv;

    private static String zzTO(int i) {
        return zzZKN.format("Note{0}", zzJB.zzWD(i));
    }

    public final boolean isEmpty() {
        return this.zzhu.getCount() == 0;
    }

    public final void zzH(zzFY zzfy) throws Exception {
        zzfy.zzFd();
        zzfy.zzYY("/Names");
        zzfy.zzFf();
        for (int i = 0; i < this.zzhu.getCount(); i++) {
            int iZzT3 = this.zzhu.zzT3(i);
            String strZzVY = this.zzhu.zzVY(i);
            zzfy.zzYW(zzTO(iZzT3));
            zzfy.zzFh();
            zzfy.zzYU(strZzVY);
            if (i < this.zzhu.getCount() - 1) {
                zzfy.zzFh();
            }
        }
        zzfy.zzFe();
        zzfy.zzFc();
    }

    public final void zzZ(zz1Y zz1y) {
        int i = this.zzhv;
        this.zzhv = i + 1;
        this.zzhu.add(i, zz1y.zzF0());
        zz1y.zzXL(zzTO(i));
    }
}
