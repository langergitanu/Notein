package com.aspose.words.internal;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZOP implements zzZOY {
    public static final zzZOP zzZXp = new zzZ(0);

    public static class zzZ extends zzZOP {
        private zzZ() {
        }

        @Override // com.aspose.words.internal.zzZOP
        public final boolean canRead() throws Exception {
            return true;
        }

        @Override // com.aspose.words.internal.zzZOP
        public final boolean canWrite() throws Exception {
            return true;
        }

        @Override // com.aspose.words.internal.zzZOP
        public final void close() throws IOException {
        }

        @Override // com.aspose.words.internal.zzZOP
        public final void flush() throws Exception {
        }

        @Override // com.aspose.words.internal.zzZOP
        public final long getLength() throws Exception {
            return 0L;
        }

        @Override // com.aspose.words.internal.zzZOP
        public final long getPosition() throws Exception {
            return 0L;
        }

        @Override // com.aspose.words.internal.zzZOP
        public final int read(byte[] bArr, int i, int i2) throws Exception {
            return 0;
        }

        @Override // com.aspose.words.internal.zzZOP
        public final void setLength(long j) throws Exception {
        }

        @Override // com.aspose.words.internal.zzZOP
        public final void write(byte[] bArr, int i, int i2) throws Exception {
        }

        @Override // com.aspose.words.internal.zzZOP
        public final void writeByte(byte b) throws Exception {
        }

        @Override // com.aspose.words.internal.zzZOP
        public final void zzH(long j) throws Exception {
        }

        @Override // com.aspose.words.internal.zzZOP
        public final boolean zzRG() throws Exception {
            return false;
        }

        @Override // com.aspose.words.internal.zzZOP
        public final int zzRI() throws Exception {
            return 0;
        }

        @Override // com.aspose.words.internal.zzZOP
        public final long zzU(long j, int i) throws Exception {
            return 0L;
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    private static zzZOR zzX(InputStream inputStream) {
        try {
            return zzZKB.zzW(inputStream);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static zzZOP zzY(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        if (inputStream instanceof FileInputStream) {
            return new zzZKD((FileInputStream) inputStream);
        }
        if (inputStream.markSupported()) {
            return new zzZKC(inputStream);
        }
        return zzX(inputStream);
    }

    public static zzZOP[] zzZ(InputStream[] inputStreamArr) {
        zzZOP[] zzzopArr = new zzZOP[inputStreamArr.length];
        int length = inputStreamArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            zzzopArr[i2] = zzY(inputStreamArr[i]);
            i++;
            i2++;
        }
        return zzzopArr;
    }

    public static OutputStream zzZF(zzZOP zzzop) {
        return new zzZK6(zzzop);
    }

    public static InputStream zzZG(zzZOP zzzop) {
        return new zzZK7(zzzop);
    }

    public abstract boolean canRead() throws Exception;

    public abstract boolean canWrite() throws Exception;

    public abstract void close() throws IOException;

    @Override // com.aspose.words.internal.zzZOY
    public void dispose() throws Exception {
        close();
    }

    public abstract void flush() throws Exception;

    public abstract long getLength() throws Exception;

    public abstract long getPosition() throws Exception;

    public abstract int read(byte[] bArr, int i, int i2) throws Exception;

    public abstract void setLength(long j) throws Exception;

    public abstract void write(byte[] bArr, int i, int i2) throws Exception;

    public abstract void writeByte(byte b) throws Exception;

    public abstract void zzH(long j) throws Exception;

    public abstract boolean zzRG() throws Exception;

    public abstract int zzRI() throws Exception;

    public abstract long zzU(long j, int i) throws Exception;

    public static zzZK8 zzY(OutputStream outputStream) {
        return new zzZK8(outputStream);
    }
}
