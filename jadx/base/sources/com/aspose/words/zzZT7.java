package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZT7 {
    static boolean zzZD5 = false;
    private byte[] zzYJJ;
    private zzZTE zzYJK;
    private IWarningCallback zzZG0;

    public zzZT7() {
        this.zzYJK = new zzZTE();
    }

    private void zz2(String str) {
        IWarningCallback iWarningCallback = this.zzZG0;
        if (iWarningCallback != null) {
            OooO00o.OooO0O0(iWarningCallback, 16777216, 10, str);
        }
    }

    public final IWarningCallback getWarningCallback() {
        return this.zzZG0;
    }

    public String toString() {
        return com.aspose.words.internal.zzZKN.format("{0}, Header:{1}, Data:{2}", getClass().getName(), this.zzYJK.toString(), com.aspose.words.internal.zzZ1.zzY(this.zzYJJ));
    }

    public abstract void zzD(com.aspose.words.internal.zzZOX zzzox) throws Exception;

    public final int zzS(zzZSP zzzsp) throws Exception {
        int position = (int) zzzsp.zzq().getPosition();
        this.zzYJK.zzT(zzzsp);
        int position2 = (int) zzzsp.zzq().getPosition();
        zzZ(zzzsp);
        int position3 = (int) zzzsp.zzq().getPosition();
        this.zzYJK.setLength(position3 - position2);
        zzzsp.zzq().zzU(position, 0);
        this.zzYJK.zzT(zzzsp);
        zzzsp.zzq().zzU(position3, 0);
        return position3 - position;
    }

    public abstract void zzZ(zzZSP zzzsp) throws Exception;

    public final void zzZ(zzZTE zzzte, com.aspose.words.internal.zzZOX zzzox, IWarningCallback iWarningCallback) throws Exception {
        this.zzYJK = zzzte;
        this.zzZG0 = iWarningCallback;
        int position = (int) zzzox.zzq().getPosition();
        zzD(zzzox);
        if (((int) zzzox.zzq().getPosition()) - position != this.zzYJK.getLength()) {
            zz2("Read wrong number of bytes from OfficeArt record, ignored.");
        }
        if (zzZD5) {
            zzzox.zzq().zzH(position);
            this.zzYJJ = zzzox.zzn(this.zzYJK.getLength());
        }
    }

    public final zzZTE zzZii() {
        return this.zzYJK;
    }

    public zzZT7(int i, int i2) {
        this();
        this.zzYJK.setType(i);
        this.zzYJK.setVersion(i2);
    }
}
