package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz25 extends zz33 {
    private long zzg1;
    private long zzg2;
    private long zzg3;
    private long zzg4;
    private long zzg5;
    private zz4Q zzg6;

    public zz25(zz4W zz4w, zz4Q zz4q) {
        super(zz4w);
        this.zzg6 = zz4q;
    }

    public final zzZOP zzY(zzZOP zzzop, long j) throws Exception {
        int i = (int) this.zzg4;
        byte[] bArr = new byte[i];
        int i2 = (int) (j - this.zzg2);
        byte[] bArr2 = new byte[i2];
        zzzop.zzH(0L);
        zzzop.read(bArr, 0, i);
        zzzop.zzH(this.zzg2);
        zzzop.read(bArr2, 0, i2);
        byte[] bArr3 = new byte[i + i2];
        System.arraycopy(bArr, 0, bArr3, 0, i);
        System.arraycopy(bArr2, 0, bArr3, i, i2);
        return new zzZOR(bArr3);
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        zzfy.zzFd();
        zzfy.zzH("/Type", "/Sig");
        zzfy.zzH("/Filter", "/Adobe.PPKLite");
        zzfy.zzH("/SubFilter", "/adbe.pkcs7.detached");
        zzfy.zzC("/Name", this.zzg6.zzuV().zzZ(zzZ89.zzWsm));
        zzfy.zzC("/ContactInfo", this.zzg6.zzuV().zzZ(zzZ89.zzWrU));
        zzfy.zzC("/Location", this.zzg6.getLocation());
        zzfy.zzC("/Reason", this.zzg6.getReason());
        if (zzuN().zzvc().zztB().zzuT() == null) {
            zzfy.zzY("/M", this.zzg6.zzuU());
        }
        if (zzZYD.zzXk(zzuN().zzv9().zzQG())) {
            zzfy.zzYY("/Prop_Build");
            zzfy.zzFd();
            zzfy.zzYY("/App");
            zzfy.zzFd();
            zzfy.zzE("/Name", zzuN().zzv9().zzQG());
            zzfy.zzFc();
            zzfy.zzFc();
        }
        zzfy.zzYY("/Contents");
        long jZzF4 = zzfy.zzF4();
        this.zzg4 = jZzF4;
        this.zzg5 = jZzF4 + 1;
        zzfy.zzF7();
        long jZzF42 = zzfy.zzF4();
        this.zzg2 = jZzF42;
        this.zzg3 = jZzF42 - 1;
        zzfy.zzYY("/ByteRange");
        zzfy.zzFf();
        zzfy.writeInt(0);
        zzfy.zzFh();
        zzfy.zzZT(this.zzg4);
        zzfy.zzFh();
        zzfy.zzZT(this.zzg2);
        zzfy.zzFh();
        this.zzg1 = zzfy.zzF4();
        zzfy.zzF6();
        zzfy.zzFe();
        zzfy.zzFc();
    }

    public final void zzZ(zzZOP zzzop, long j) throws Exception {
        String strZz8 = zzJB.zz8((j - this.zzg3) - 1);
        if (strZz8.length() <= 15) {
            byte[] bytes = zzZO0.zzhX().getBytes(strZz8);
            zzzop.zzH(this.zzg1);
            zzzop.write(bytes, 0, bytes.length);
            return;
        }
        throw new IllegalStateException("Can't insert digital signature to the PDF document. The size of the digital signature exceeds allocated space.");
    }

    public final void zzZ(zzZOP zzzop, byte[] bArr) throws Exception {
        if (bArr.length <= 32000) {
            byte[] bytes = zzZO0.zzhX().getBytes(zzZYD.zzZ8(bArr));
            zzzop.zzH(this.zzg5);
            zzzop.write(bytes, 0, bytes.length);
            return;
        }
        throw new IllegalStateException("Can't insert digital signature to the PDF document. The size of the digital signature exceeds allocated space.");
    }
}
