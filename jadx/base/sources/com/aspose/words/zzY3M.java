package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY3M {
    private com.aspose.words.internal.zzZO0 zzMW;
    private com.aspose.words.internal.zzZOX zzW6;

    public zzY3M(com.aspose.words.internal.zzZOX zzzox) {
        this.zzW6 = zzzox;
    }

    private String zzH(com.aspose.words.internal.zzZO0 zzzo0) throws Exception {
        return zzzo0.zzZn(this.zzW6.zzn(this.zzW6.zzXc()));
    }

    private String zzI(com.aspose.words.internal.zzZO0 zzzo0) throws Exception {
        this.zzW6.zzX9();
        return zzH(zzzo0);
    }

    public final String readString() throws Exception {
        return zzH(this.zzMW);
    }

    public final com.aspose.words.internal.zzZO0 zzQZ() {
        return this.zzMW;
    }

    public final String zzV4(int i, int i2) throws Exception {
        String strZzI = zzI(this.zzMW);
        String strZzZ = zzZ(i2, com.aspose.words.internal.zzZO0.zzhU());
        return com.aspose.words.internal.zzZKN.zzU3(strZzZ) ? strZzI : strZzZ;
    }

    public final short zzX9() throws Exception {
        return this.zzW6.zzX9();
    }

    public final void zzXTV() throws Exception {
        this.zzW6.zzX9();
        this.zzW6.zzXc();
    }

    public final int zzXTW() throws Exception {
        int iZzX9 = this.zzW6.zzX9() & 65535;
        this.zzW6.zzq().zzH(this.zzW6.zzq().getPosition() - 2);
        return iZzX9;
    }

    public final short zzXTX() throws Exception {
        this.zzW6.zzX9();
        this.zzW6.zzXc();
        return this.zzW6.zzXa();
    }

    public final int zzXTY() throws Exception {
        this.zzW6.zzX9();
        this.zzW6.zzXc();
        return this.zzW6.zzXc();
    }

    public final short zzXa() throws Exception {
        return this.zzW6.zzXa();
    }

    public final int zzXb() throws Exception {
        return this.zzW6.zzXb();
    }

    public final int zzXc() throws Exception {
        return this.zzW6.zzXc();
    }

    public final void zzZ(com.aspose.words.internal.zzZO0 zzzo0) {
        this.zzMW = zzzo0;
    }

    public final String zzjf(int i) throws Exception {
        return zzI(this.zzMW);
    }

    public final byte[] zzn(int i) throws Exception {
        return this.zzW6.zzn(i);
    }

    private String zzZ(int i, com.aspose.words.internal.zzZO0 zzzo0) throws Exception {
        return zzXTW() == i ? zzI(zzzo0) : "";
    }
}
