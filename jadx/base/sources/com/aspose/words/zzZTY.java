package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZTY extends zzZU0 {
    private byte[] zzP;
    private zzZ zzYKw;

    public static class zzZ {
        private com.aspose.words.internal.zzZOX zzW6;
        private int zzWz;

        public zzZ(com.aspose.words.internal.zzZOX zzzox, int i) {
            this.zzW6 = zzzox;
            this.zzWz = i;
        }

        public final byte[] zzZiL() throws Exception {
            this.zzW6.zzq().zzH(this.zzWz);
            int iZzXc = this.zzW6.zzXc();
            com.aspose.words.internal.zzEG zzegZzY = com.aspose.words.internal.zzEG.zzY(this.zzW6.zzXc(), this.zzW6.zzXc(), this.zzW6.zzXc(), this.zzW6.zzXc(), this.zzW6.zzXc(), this.zzW6.zzXc());
            int iZzXc2 = this.zzW6.zzXc();
            if (iZzXc2 <= 0) {
                return null;
            }
            int i = this.zzW6.readByte() & 255;
            this.zzW6.readByte();
            byte[] bArrZzn = this.zzW6.zzn(iZzXc2);
            if (i == 0) {
                try {
                    bArrZzn = com.aspose.words.internal.zzZRV.zzT(bArrZzn, iZzXc, 1);
                } catch (Exception unused) {
                    bArrZzn = com.aspose.words.internal.zzEF.zzDL();
                }
            } else if (i != 254) {
                throw new IllegalStateException("Invalid metafile compression method.");
            }
            return com.aspose.words.internal.zzEF.zzZK(bArrZzn) ? com.aspose.words.internal.zzEF.zzZ(bArrZzn, zzegZzY) : bArrZzn;
        }
    }

    public zzZTY() {
    }

    @Override // com.aspose.words.zzZU0
    public final byte[] getImageBytes() throws Exception {
        zzZ zzz;
        if (this.zzP == null && (zzz = this.zzYKw) != null) {
            this.zzP = zzz.zzZiL();
        }
        return this.zzP;
    }

    @Override // com.aspose.words.zzZU0
    public final int getPresetTexture() {
        return 255;
    }

    @Override // com.aspose.words.zzZT7
    public final void zzD(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        int position = (int) zzzox.zzq().getPosition();
        zzB(zzzox);
        this.zzYKw = new zzZ(zzzox, (int) zzzox.zzq().getPosition());
        zzzox.zzq().zzH(position + zzZii().getLength());
    }

    @Override // com.aspose.words.zzZT7
    public final void zzZ(zzZSP zzzsp) throws Exception {
        byte[] bArrZzZw = com.aspose.words.internal.zzEF.zzZw(this.zzP);
        zzY(zzzsp);
        zzzsp.write(bArrZzZw.length);
        com.aspose.words.internal.zzEG zzegZzZT = com.aspose.words.internal.zzEF.zzZT(this.zzP);
        zzzsp.write(zzegZzZT.getLeft());
        zzzsp.write(zzegZzZT.getTop());
        zzzsp.write(zzegZzZT.getRight());
        zzzsp.write(zzegZzZT.getBottom());
        zzzsp.write(zzegZzZT.zzDQ());
        zzzsp.write(zzegZzZT.zzDP());
        if ((zzzsp.zzZqQ() == null || !zzzsp.zzZqQ().getAlwaysCompressMetafiles()) && bArrZzZw.length <= 16384) {
            zzzsp.write(bArrZzZw.length);
            zzzsp.zzr((byte) -2);
            zzzsp.zzr((byte) -2);
            zzzsp.write(bArrZzZw);
            return;
        }
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(bArrZzZw);
        com.aspose.words.internal.zzZOR zzzor2 = new com.aspose.words.internal.zzZOR();
        com.aspose.words.internal.zzZRV.zzZ(zzzor, zzzor2, 1);
        zzzsp.write((int) zzzor2.getLength());
        zzzsp.zzr((byte) 0);
        zzzsp.zzr((byte) -2);
        zzzsp.write(zzzor2.zziA(), 0, (int) zzzor2.getLength());
        zzzor2.close();
        zzzor.close();
    }

    public zzZTY(com.aspose.words.internal.zzXC zzxc, byte[] bArr) throws Exception {
        super(zzxc);
        zzVX(FileFormatUtil.zzC7(com.aspose.words.internal.zzEF.zzZU(bArr)));
        int imageType = getImageType();
        if (imageType != 2 && imageType != 3 && imageType != 4) {
            throw new IllegalStateException("Not expecting this image format here.");
        }
        this.zzP = bArr;
    }
}
