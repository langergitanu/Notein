package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYB1 {
    private zzYB2 zzXdW;

    public zzYB1(zzYB2 zzyb2) {
        this.zzXdW = zzyb2;
    }

    public final int[] zzY7L() throws Exception {
        int[] iArr = new int[(int) this.zzXdW.zzY7N().getLength()];
        iArr[0] = 10;
        if (this.zzXdW.zzY7N().getLength() > 0 && this.zzXdW.zzY7N().canRead()) {
            int length = (((int) this.zzXdW.zzY7N().getLength()) / 2) + 1;
            byte[] bArrZzWy = this.zzXdW.zzY7N().zzWy();
            for (int i = 0; i < length; i++) {
                if (bArrZzWy[i] != ((byte) this.zzXdW.zzY7M().zzY7R()[i])) {
                    zzY3F.zzje(150);
                }
                iArr[i] = bArrZzWy[i] & 255;
            }
            zzY3F.zzXTO();
        }
        return iArr;
    }
}
