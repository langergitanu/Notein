package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZU0 extends zzZT7 {
    private com.aspose.words.internal.zzXC zzYKA;
    private com.aspose.words.internal.zzXC zzYKz;

    public zzZU0() {
        com.aspose.words.internal.zzXC zzxc = com.aspose.words.internal.zzXC.zzV3;
        this.zzYKA = zzxc;
        this.zzYKz = zzxc;
    }

    private static com.aspose.words.internal.zzXC zzA(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        return new com.aspose.words.internal.zzXC(zzzox.zzn(16));
    }

    private static int zzEm(int i) {
        switch (i) {
            case 2:
                return 980;
            case 3:
                return 534;
            case 4:
                return 1346;
            case 5:
                return EditingLanguage.YORUBA;
            case 6:
                return 1760;
            case 7:
                return 1960;
            default:
                throw new IllegalStateException("Unknown image format.");
        }
    }

    public abstract byte[] getImageBytes() throws Exception;

    public final int getImageType() {
        return zzZii().getType() - 61464;
    }

    public abstract int getPresetTexture();

    public final void zzB(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzYKA = zzA(zzzox);
        if ((zzZii().zzZim() & 1) != 0) {
            this.zzYKz = zzA(zzzox);
        }
    }

    public final void zzVX(int i) {
        zzZii().setType(61464 + i);
        zzZii().zzE7(zzEm(i));
    }

    public final void zzY(zzZSP zzzsp) throws Exception {
        zzzsp.write(this.zzYKA.zzWw());
        if ((zzZii().zzZim() & 1) != 0) {
            zzzsp.write(this.zzYKz.zzWw());
        }
    }

    public final com.aspose.words.internal.zzXC zzZiM() {
        return this.zzYKA;
    }

    public zzZU0(com.aspose.words.internal.zzXC zzxc) {
        this.zzYKz = com.aspose.words.internal.zzXC.zzV3;
        this.zzYKA = zzxc;
    }
}
