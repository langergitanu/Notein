package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZTZ extends zzZU0 {
    private byte[] zzP;
    private int zzYKx;
    private zzZ zzYKy;

    public static class zzZ {
        private int mLength;
        private com.aspose.words.internal.zzZOX zzW6;
        private int zzWz;
        private int zzwi;

        public zzZ(com.aspose.words.internal.zzZOX zzzox, int i, int i2, int i3) {
            this.zzW6 = zzzox;
            this.zzWz = i;
            this.mLength = i2;
            this.zzwi = i3;
        }

        public final byte[] zzZiL() throws Exception {
            this.zzW6.zzq().zzH(this.zzWz);
            return this.zzwi == 7 ? com.aspose.words.internal.zzEF.zzZ(this.zzW6, this.mLength) : this.zzW6.zzn(this.mLength);
        }
    }

    public zzZTZ() {
    }

    @Override // com.aspose.words.zzZU0
    public final byte[] getImageBytes() throws Exception {
        zzZ zzz;
        if (this.zzP == null && (zzz = this.zzYKy) != null) {
            this.zzP = zzz.zzZiL();
        }
        return this.zzP;
    }

    @Override // com.aspose.words.zzZU0
    public final int getPresetTexture() {
        return this.zzYKx;
    }

    @Override // com.aspose.words.zzZT7
    public final void zzD(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        int position = (int) zzzox.zzq().getPosition();
        zzB(zzzox);
        this.zzYKx = zzzox.readByte() & 255;
        this.zzYKy = new zzZ(zzzox, (int) zzzox.zzq().getPosition(), zzZii().getLength() - (((int) zzzox.zzq().getPosition()) - position), getImageType());
        zzzox.zzq().zzH(position + zzZii().getLength());
    }

    @Override // com.aspose.words.zzZT7
    public final void zzZ(zzZSP zzzsp) throws Exception {
        zzY(zzzsp);
        zzzsp.zzr((byte) this.zzYKx);
        if (getImageType() != 7) {
            zzzsp.write(this.zzP);
        } else {
            byte[] bArr = this.zzP;
            zzzsp.write(bArr, 14, bArr.length - 14);
        }
    }

    public zzZTZ(com.aspose.words.internal.zzXC zzxc, byte[] bArr, int i) throws Exception {
        super(zzxc);
        this.zzYKx = i;
        zzVX(FileFormatUtil.zzC7(com.aspose.words.internal.zzEF.zzZU(bArr)));
        int imageType = getImageType();
        if (imageType != 5 && imageType != 6 && imageType != 7) {
            throw new IllegalStateException("Not expected other image formats here.");
        }
        this.zzP = bArr;
    }
}
