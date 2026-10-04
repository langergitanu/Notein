package com.aspose.words.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzXL {
    private final int zzVm;
    private ByteArrayOutputStream zzVn;
    private zzZ5N zzVo;
    private zzZ4W zzVp;
    private zzZ4U zzVq;

    public zzXL(zzZ4W zzz4w, int i) {
        if (zzz4w == null) {
            throw new IllegalArgumentException("decryptor cannot be null");
        }
        this.zzVp = zzz4w;
        this.zzVm = i;
    }

    public final byte[] doFinal() {
        try {
            this.zzVo.close();
        } catch (IOException e) {
            zzZHV.zzY(e);
        }
        return this.zzVn.toByteArray();
    }

    public final int getBlockSize() {
        return this.zzVm;
    }

    public final int getOutputSize(int i) {
        zzZ4U zzz4u = this.zzVq;
        if (zzz4u != null) {
            return zzz4u.zzfZ(i);
        }
        zzZ4W zzz4w = this.zzVp;
        if (zzz4w != null) {
            return zzz4w.zzfZ(i);
        }
        throw new IllegalStateException("Either Encryptor or Decryptor must exist");
    }

    public final int zzX(byte[] bArr, byte[] bArr2) throws zzZ5D {
        return zzY(bArr, 0, bArr.length, bArr2, 0);
    }

    public final void zzY(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.zzVm;
        if (length % i != 0) {
            throw new IllegalArgumentException("Data size is not rounded to the cipher block size.");
        }
        if (bArr2.length < bArr.length) {
            throw new IllegalArgumentException("Not enough bytes in output array");
        }
        for (int i2 = 0; i2 < bArr.length; i2 += i) {
            zzZ(bArr, i2, bArr2, i2);
        }
    }

    public final void zzZ(byte[] bArr, int i, byte[] bArr2, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzZ5N zzz5nZzZ = zzZ(byteArrayOutputStream);
        zzz5nZzZ.update(bArr, i, this.zzVm);
        try {
            zzz5nZzZ.flush();
        } catch (IOException e) {
            zzZHV.zzY(e);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        System.arraycopy(byteArray, 0, bArr2, i2, byteArray.length);
    }

    public zzXL(zzZ4U zzz4u, int i) {
        if (zzz4u != null) {
            this.zzVq = zzz4u;
            this.zzVm = i;
            return;
        }
        throw new IllegalArgumentException("decryptor cannot be null");
    }

    public final byte[] zzY(byte[] bArr, int i, int i2) {
        if (this.zzVn == null) {
            this.zzVn = new ByteArrayOutputStream();
        }
        zzZ5N zzz5nZzZ = zzZ(this.zzVn);
        this.zzVo = zzz5nZzZ;
        zzz5nZzZ.update(bArr, i, i2);
        return null;
    }

    public final void zzZ(zzZOP zzzop, zzZOP zzzop2) throws Exception {
        zzZKB.zzZ(zzzop, zzZ(new zzZK6(zzzop2)));
    }

    public final int zzY(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzZ5N zzz5nZzZ = zzZ(byteArrayOutputStream);
        zzz5nZzZ.update(bArr, 0, i2);
        try {
            zzz5nZzZ.close();
        } catch (IOException e) {
            zzZHV.zzY(e);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        System.arraycopy(byteArray, 0, bArr2, 0, byteArray.length);
        return byteArray.length;
    }

    public final int zzZ(byte[] bArr, int i, byte[] bArr2) {
        return zzY(bArr, 0, i, bArr2, 0);
    }

    private zzZ5N zzZ(OutputStream outputStream) {
        if (outputStream != null) {
            zzZ4U zzz4u = this.zzVq;
            if (zzz4u != null) {
                return zzz4u.zzR(outputStream);
            }
            zzZ4W zzz4w = this.zzVp;
            if (zzz4w != null) {
                return zzz4w.zzS(outputStream);
            }
            throw new IllegalStateException("Either Encryptor or Decryptor must exist");
        }
        throw new IllegalArgumentException("Stream cannot be null");
    }
}
