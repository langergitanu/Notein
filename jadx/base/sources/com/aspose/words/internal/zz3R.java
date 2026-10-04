package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz3R extends zz3W {
    public zz3R(zzZOP zzzop) {
        super(zzzop);
    }

    private void zzK(byte[] bArr, int i) throws Exception {
        zzuy().writeByte((byte) (i - 1));
        zzuy().write(bArr, 0, i);
    }

    private void zzZQ(int i, int i2) throws Exception {
        zzuy().writeByte((byte) (257 - i2));
        zzuy().writeByte((byte) i);
    }

    @Override // com.aspose.words.internal.zz3W, com.aspose.words.internal.zzZOP
    public final void write(byte[] bArr, int i, int i2) throws Exception {
        byte[] bArr2 = new byte[128];
        char c = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = i + i6;
            if (c != 0) {
                i4 = bArr[i7] & 255;
                i5 = bArr[i7 - 1] & 255;
            }
            if (c == 0) {
                i3 = 0;
                c = 1;
            } else if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        throw new IllegalStateException("Unknown RLE state.");
                    }
                    if (i4 != i5) {
                        zzZQ(i5, i3);
                        i3 = 0;
                        c = 1;
                    } else {
                        i3++;
                        if (i3 == 128) {
                            zzZQ(i4, i3);
                            c = 0;
                        }
                    }
                } else if (i4 == i5) {
                    zzK(bArr2, i3);
                    c = 3;
                    i3 = 2;
                } else {
                    bArr2[i3] = (byte) i5;
                    i3++;
                    if (i3 == 128) {
                        zzK(bArr2, i3);
                        i3 = 0;
                        c = 1;
                    }
                }
            } else if (i4 == i5) {
                c = 3;
                i3 = 2;
            } else {
                bArr2[0] = (byte) i5;
                c = 2;
                i3 = 1;
            }
        }
        if (c == 1 || c == 2) {
            bArr2[i3] = (byte) i4;
            zzK(bArr2, i3 + 1);
        } else {
            if (c != 3) {
                throw new IllegalStateException("Unknown RLE state.");
            }
            zzZQ(i4, i3);
        }
        zzuy().writeByte((byte) -127);
    }
}
