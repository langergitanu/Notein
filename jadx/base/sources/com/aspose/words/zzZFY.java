package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZFY extends OleControl {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("5512d122-5cc6-11cf-8d67-00aa00bdce1d", "5512d118-5cc6-11cf-8d67-00aa00bdce1d", "5512d110-5cc6-11cf-8d67-00aa00bdce1d", "5512d11c-5cc6-11cf-8d67-00aa00bdce1d", "5512d11a-5cc6-11cf-8d67-00aa00bdce1d");
    private int zzL4;
    private String zzZE2;

    public zzZFY(String str, String str2) {
        super(str);
        this.zzL4 = 2;
        this.zzZE2 = str2;
    }

    private static int zzLh(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0) {
            return 1;
        }
        if (iZzTP == 1) {
            return 2;
        }
        if (iZzTP == 2) {
            return 3;
        }
        if (iZzTP != 3) {
            return iZzTP != 4 ? 0 : 5;
        }
        return 4;
    }

    @Override // com.aspose.words.OleControl
    public String getClsidVirtual() {
        int i = this.zzL4;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? com.aspose.words.internal.zzZOZ.zzZXP.toString() : "5512d11a-5cc6-11cf-8d67-00aa00bdce1d" : "5512d11c-5cc6-11cf-8d67-00aa00bdce1d" : "5512d110-5cc6-11cf-8d67-00aa00bdce1d" : "5512d118-5cc6-11cf-8d67-00aa00bdce1d" : "5512d122-5cc6-11cf-8d67-00aa00bdce1d";
    }

    @Override // com.aspose.words.OleControl
    public final int zzV(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        long position = zzzow.zzq().getPosition();
        zzzow.writeBytes(new com.aspose.words.internal.zzZOZ(getClsidVirtual()).toByteArray());
        zzzow.writeBytes(com.aspose.words.internal.zzZO0.zzhU().getBytes(this.zzZE2));
        return (int) (zzzow.zzq().getPosition() - position);
    }

    @Override // com.aspose.words.OleControl
    public final void zzW(com.aspose.words.internal.zzAA zzaa) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzV(new com.aspose.words.internal.zzZOW(zzzor));
        zzYTP zzytp = new zzYTP();
        zzytp.setData(zzzor.zzWy());
        zzytp.zzW(zzaa);
        zzYTR zzytrZzQ = zzYTR.zzQ(zzaa);
        zzytrZzQ.zzsS(zzytrZzQ.zzYyk() | 8192);
        zzytrZzQ.zzW(zzaa);
    }

    @Override // com.aspose.words.OleControl
    public void zzX(com.aspose.words.internal.zzAA zzaa) throws Exception {
        com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(zzaa.zzYs("\u0003OCXDATA"));
        this.zzL4 = zzLh(new com.aspose.words.internal.zzZOZ(zzzox.zzn(16)).toString());
        this.zzZE2 = com.aspose.words.internal.zzZO0.zzhU().zzZn(zzzox.zzn((int) (zzzox.zzq().getLength() - zzzox.zzq().getPosition())));
    }

    public final String zzau() {
        return this.zzZE2;
    }

    public zzZFY(String str) {
        super(str);
    }
}
