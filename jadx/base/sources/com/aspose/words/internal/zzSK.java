package com.aspose.words.internal;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class zzSK extends zzZOP {
    private zzZOP zzOA;
    private int zzOB;
    private zzZZ5 zzOC;
    private int zzOD;
    private long zzOE;
    private HashMap<Long, byte[]> zzOz = new HashMap<>(10);
    private int zzOy = Integer.MIN_VALUE;
    private int zzOx = 0;
    private long zzQv = 0;

    public zzSK(zzZOP zzzop, zzZZ5 zzzz5, int i, int i2, int i3) {
        this.zzOC = zzzz5;
        this.zzOE = i2;
        this.zzOD = i;
        this.zzOA = zzzop;
        this.zzOB = i3;
    }

    private byte[] zzRH() throws Exception {
        int i;
        int i2 = (int) this.zzQv;
        int i3 = this.zzOB;
        int i4 = i2 / i3;
        long j = i3 * i4;
        byte[] bArr = (byte[]) zzQW.zzZ(this.zzOz, Long.valueOf(j));
        if (bArr != null) {
            return bArr;
        }
        if (i4 - 1 == this.zzOy) {
            i = this.zzOC.get(this.zzOx);
        } else {
            i = this.zzOD;
            for (int i5 = 0; i5 < i4; i5++) {
                if (zzYG(i)) {
                    throw new IllegalStateException("Unable to read beyound stream.");
                }
                i = this.zzOC.get(i);
            }
        }
        this.zzOy = i4;
        this.zzOx = i;
        return zzT(j, i);
    }

    private byte[] zzT(long j, int i) throws Exception {
        zzZOX zzzox = new zzZOX(this.zzOA);
        this.zzOA.zzH(zzZZ4.zzZB(i, this.zzOB));
        byte[] bArrZzn = zzzox.zzn(this.zzOB);
        if (this.zzOz.size() > 10) {
            Iterator<T> it = this.zzOz.keySet().iterator();
            if (it.hasNext()) {
                Long l = (Long) it.next();
                l.longValue();
                zzZQF.zzY(this.zzOz, l);
            }
        }
        zzZQF.zzY(this.zzOz, Long.valueOf(j), bArrZzn);
        return bArrZzn;
    }

    private static boolean zzYG(int i) {
        return i == -2 || i == -1;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final boolean canRead() {
        return true;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final boolean canWrite() {
        return false;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final void close() {
        throw new UnsupportedOperationException("Close()");
    }

    @Override // com.aspose.words.internal.zzZOP
    public final void flush() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.words.internal.zzZOP
    public final long getLength() {
        return this.zzOE;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final long getPosition() {
        return this.zzQv;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final int read(byte[] bArr, int i, int i2) throws Exception {
        int iMax = Math.max(Math.min(i2, (int) (this.zzOE - this.zzQv)), 0);
        long j = 0;
        while (iMax > j) {
            byte[] bArrZzRH = zzRH();
            int i3 = ((int) this.zzQv) % this.zzOB;
            long jMin = Math.min(r5 - i3, ((long) i2) - j);
            int i4 = (int) jMin;
            System.arraycopy(bArrZzRH, i3, bArr, i, i4);
            this.zzQv += jMin;
            j += jMin;
            i += i4;
        }
        return (int) j;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final void setLength(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.words.internal.zzZOP
    public final void write(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.words.internal.zzZOP
    public final void writeByte(byte b) {
        throw new UnsupportedOperationException("WriteByte(byte value)");
    }

    @Override // com.aspose.words.internal.zzZOP
    public final void zzH(long j) {
        this.zzQv = j;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final boolean zzRG() {
        return true;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final int zzRI() throws Exception {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == 0) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final long zzU(long j, int i) {
        if (i == 0) {
            this.zzQv = j;
        } else if (i == 1) {
            this.zzQv += j;
        } else if (i == 2) {
            this.zzQv = this.zzOE - j;
        }
        return this.zzQv;
    }
}
