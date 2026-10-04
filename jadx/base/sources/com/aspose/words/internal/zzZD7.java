package com.aspose.words.internal;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public class zzZD7 {
    private OutputStream zzWIm;

    public static class zzZ extends zzZD7 {
        private boolean zzWIl;

        public zzZ(OutputStream outputStream) {
            super(outputStream);
            this.zzWIl = true;
        }

        @Override // com.aspose.words.internal.zzZD7
        public final void write(int i) throws IOException {
            if (this.zzWIl) {
                this.zzWIl = false;
            } else {
                super.write(i);
            }
        }
    }

    public zzZD7(OutputStream outputStream) {
        this.zzWIm = outputStream;
    }

    public void write(int i) throws IOException {
        this.zzWIm.write(i);
    }

    public final void writeTag(int i, int i2) throws IOException {
        if (i2 < 31) {
            write(i | i2);
            return;
        }
        write(i | 31);
        if (i2 < 128) {
            write(i2);
            return;
        }
        byte[] bArr = new byte[5];
        int i3 = 4;
        bArr[4] = (byte) (i2 & 127);
        do {
            i2 >>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        } while (i2 > 127);
        write(bArr, i3, 5 - i3);
    }

    public final void zzV(int i, byte[] bArr) throws IOException {
        write(i);
        zzg7(bArr.length);
        write(bArr);
    }

    public zzZD7 zzXKG() {
        return new zzZBO(this.zzWIm);
    }

    public zzZD7 zzXKH() {
        return new zzZC4(this.zzWIm);
    }

    public final void zzY(int i, int i2, byte[] bArr) throws IOException {
        writeTag(i, i2);
        zzg7(bArr.length);
        write(bArr);
    }

    public final void zzg7(int i) throws IOException {
        if (i <= 127) {
            write((byte) i);
            return;
        }
        int i2 = i;
        int i3 = 1;
        while (true) {
            i2 >>>= 8;
            if (i2 == 0) {
                break;
            } else {
                i3++;
            }
        }
        write((byte) (i3 | 128));
        for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
            write((byte) (i >> i4));
        }
    }

    public final void write(byte[] bArr) throws IOException {
        this.zzWIm.write(bArr);
    }

    private void write(byte[] bArr, int i, int i2) throws IOException {
        this.zzWIm.write(bArr, i, i2);
    }

    public void zzY(zzZDK zzzdk) throws IOException {
        if (zzzdk != null) {
            zzzdk.zzXL0().zzZ(this);
            return;
        }
        throw new IOException("null object detected");
    }

    public final void zzY(zzZD5 zzzd5) throws IOException {
        if (zzzd5 != null) {
            zzzd5.zzZ(new zzZ(this.zzWIm));
            return;
        }
        throw new IOException("null object detected");
    }
}
