package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYIN {
    private com.aspose.words.internal.zzZOW zzW5;
    private int zzXxv;
    private byte[] zzXxy;
    private ArrayList<zzY4Y> zzXxx = new ArrayList<>();
    private zzY4Y zzXxw = new zzY4Y();

    private zzYIN(byte[] bArr, com.aspose.words.internal.zzZOW zzzow) {
        this.zzXxy = bArr;
        this.zzW5 = zzzow;
    }

    private void zzSa() throws Exception {
        this.zzXxx.clear();
        int length = 0;
        this.zzXxv = 0;
        while (length < this.zzXxy.length && this.zzXxv < 4096) {
            zzYIM zzyimZzpm = zzpm(length);
            length += zzyimZzpm.getLength();
            zzZ(zzyimZzpm);
            this.zzXxv += zzyimZzpm.getBytes().length;
        }
        if (this.zzXxw.zzXUR() > 0) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXxx, this.zzXxw);
            this.zzXxv++;
        }
    }

    public static void zzY(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZOR zzzor) throws Exception {
        com.aspose.words.internal.zzZOW zzzow = new com.aspose.words.internal.zzZOW(zzzor);
        zzzow.writeByte((byte) 1);
        com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(zzzop);
        while (zzzox.zzq().getPosition() < zzzox.zzq().getLength()) {
            try {
                int length = (int) (zzzox.zzq().getLength() - zzzox.zzq().getPosition());
                if (length > 4096) {
                    length = 4096;
                }
                new zzYIN(zzzox.zzn(length), zzzow).zzYkl();
            } finally {
                zzzox.close();
            }
        }
    }

    private void zzYkj() throws Exception {
        this.zzW5.zzJ((short) ((this.zzXxv - 1) | 45056));
        Iterator<zzY4Y> it = this.zzXxx.iterator();
        while (it.hasNext()) {
            this.zzW5.writeBytes(it.next().getData());
        }
    }

    private void zzYkk() throws Exception {
        this.zzW5.zzJ((short) 16383);
        this.zzW5.writeBytes(this.zzXxy);
        int length = 4096 - this.zzXxy.length;
        for (int i = 0; i < length; i++) {
            this.zzW5.writeByte((byte) 0);
        }
    }

    private void zzYkl() throws Exception {
        zzSa();
        if (this.zzXxv >= 4096) {
            zzYkk();
        } else {
            zzYkj();
        }
    }

    public static void zzZ(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZOR zzzor) throws Exception {
        com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(zzzop);
        com.aspose.words.internal.zzZOW zzzow = new com.aspose.words.internal.zzZOW(zzzor);
        zzzox.readByte();
        while (zzzox.zzq().getPosition() < zzzox.zzq().getLength() - 1) {
            int position = (int) zzzow.zzq().getPosition();
            int position2 = (int) zzzox.zzq().getPosition();
            short sZzX9 = zzzox.zzX9();
            int i = 65535 & sZzX9;
            int i2 = (sZzX9 & 4095) + 3;
            if ((i >> 15) == 0) {
                throw new IllegalStateException();
            }
            while (true) {
                long j = position2 + i2;
                if (zzzox.zzq().getPosition() < j) {
                    byte b = zzzox.readByte();
                    for (int i3 = 0; i3 < 8 && zzzox.zzq().getPosition() < j; i3++) {
                        int i4 = b & 255;
                        if ((b & 1) == 0) {
                            zzzow.writeByte(zzzox.readByte());
                        } else {
                            zzYIM.zzZ(zzzox.zzX9(), ((int) zzzow.zzq().getPosition()) - position, zzzow);
                        }
                        b = (byte) (i4 >>> 1);
                    }
                }
            }
        }
    }

    private zzYIM zzpm(int i) throws Exception {
        int length = this.zzXxy.length;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = i - 1; i4 >= 0; i4--) {
            int i5 = i4;
            int i6 = 0;
            for (int i7 = i; i7 < length; i7++) {
                byte[] bArr = this.zzXxy;
                if (bArr[i7] != bArr[i5]) {
                    break;
                }
                i6++;
                i5++;
            }
            if (i6 > i2) {
                i3 = i4;
                i2 = i6;
            }
        }
        return i2 >= 3 ? zzYIM.zzZZ(i, i3, i2) : zzYIM.zzk(this.zzXxy[i]);
    }

    private void zzZ(zzYIM zzyim) {
        if (this.zzXxw.zzXUR() == 8) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXxx, this.zzXxw);
            this.zzXxw = new zzY4Y();
            this.zzXxv++;
        }
        this.zzXxw.zzZ(zzyim);
    }
}
