package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYY8 {
    private com.aspose.words.internal.zzZO0 zzMW;
    private long zzXY1;
    private long zzXY2;
    private com.aspose.words.internal.zzXZ zzXYi;

    public zzYY8(com.aspose.words.internal.zzXZ zzxz, com.aspose.words.internal.zzZO0 zzzo0) {
        this.zzXYi = zzxz;
        this.zzMW = zzzo0;
    }

    private void zzB(String str, String str2, String str3) throws Exception {
        zzYYE zzyye = new zzYYE(this.zzMW);
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            zzyye.zzq(100, str);
        }
        if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
            zzyye.zzq(105, str2);
        }
        if (com.aspose.words.internal.zzZYD.zzXk(str3)) {
            zzyye.zzq(108, str3);
        }
        zzyye.zzX(this.zzXYi);
    }

    private void zzG(int i, int i2, int i3, int i4) throws Exception {
        this.zzXY1 = this.zzXYi.zzq().getPosition();
        this.zzXYi.zzk(1297039945);
        this.zzXYi.zzk(StyleIdentifier.BOOK_TITLE);
        this.zzXYi.zzk(2);
        this.zzXYi.zzk(i);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(i3);
        this.zzXYi.zzk(-1);
        this.zzXYi.zzk(-1);
        this.zzXYi.zzk(-1);
        this.zzXYi.zzk(-1);
        this.zzXYi.zzk(-1);
        this.zzXYi.zzk(-1);
        this.zzXYi.zzk(-1);
        this.zzXYi.zzk(-1);
        this.zzXYi.zzk(-1);
        this.zzXYi.zzk(-1);
        this.zzXYi.zzk(i2);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(i3);
        this.zzXYi.zzk(i4);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(80);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(-1);
        this.zzXYi.zzk(-1);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(-1);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(-1);
        this.zzXYi.zzk(-1);
        this.zzXYi.zzk(1);
        this.zzXYi.zzk(-1);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(-1);
        this.zzXYi.zzk(-1);
        this.zzXYi.zzk(-1);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(-1);
        this.zzXYi.zzk(0);
        this.zzXYi.zzq().getPosition();
    }

    private void zzHM(String str) throws Exception {
        byte[] bytes = this.zzMW.getBytes(str);
        zzWE(68, (int) (this.zzXYi.zzq().getPosition() - this.zzXY2));
        zzWE(72, bytes.length);
        this.zzXYi.writeBytes(bytes);
        this.zzXYi.zzi(0);
        zzYXM.zzQ(this.zzXYi, bytes.length + 2);
    }

    private void zzWE(int i, int i2) throws Exception {
        long position = this.zzXYi.zzq().getPosition();
        this.zzXYi.zzq().zzH(this.zzXY1 + (((long) i) & 4294967295L));
        this.zzXYi.zzk(i2);
        this.zzXYi.zzq().zzH(position);
    }

    private void zzWF(int i, int i2) throws Exception {
        this.zzXY2 = this.zzXYi.zzq().getPosition();
        this.zzXYi.zzi(2);
        this.zzXYi.zzi(0);
        this.zzXYi.zzk(i);
        this.zzXYi.zzi(i2);
        this.zzXYi.zzi(4096);
        this.zzXYi.zzi(0);
        this.zzXYi.zzi(0);
    }

    public final void zzYCE() throws Exception {
        zzWE(196, 1);
    }

    public final void zzYCF() throws Exception {
        zzWE(188, 1);
    }

    public final void zzZ(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4) throws Exception {
        zzWF(i2, i3);
        zzG(this.zzMW.getCodePage(), i3 + 1, i, i4);
        zzB(str2, str3, str4);
        zzHM(str);
    }

    public final void zztZ(int i) throws Exception {
        zzWE(236, i);
    }

    public final void zzu0(int i) throws Exception {
        zzWE(232, i);
    }

    public final void zzu1(int i) throws Exception {
        zzWE(228, i);
    }

    public final void zzu2(int i) throws Exception {
        zzWE(192, i);
    }

    public final void zzu3(int i) throws Exception {
        zzWE(184, i);
    }

    public final void zzu4(int i) throws Exception {
        zzWE(180, i);
    }

    public final void zzu5(int i) throws Exception {
        zzWE(176, i);
    }
}
