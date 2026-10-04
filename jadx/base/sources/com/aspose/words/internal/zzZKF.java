package com.aspose.words.internal;

import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZKF {
    private zzZOP zzN5;
    private zzZKJ zzZPe;
    private zzZOX zzZPf;

    public zzZKF(ByteOrder byteOrder, zzZOP zzzop) {
        this.zzN5 = zzzop;
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.zzZPe = new zzZKJ(zzzop);
        } else {
            this.zzZPf = new zzZOX(zzzop);
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws Exception {
        zzZKJ zzzkj = this.zzZPe;
        return zzzkj != null ? zzzkj.read(bArr, i, i2) : this.zzZPf.read(bArr, i, i2);
    }

    public final double readDouble() throws Exception {
        return this.zzZPe != null ? Double.longBitsToDouble(zzZKH.zzP(this.zzZPf.zzX8())) : this.zzZPf.readDouble();
    }

    public final float readFloat() throws Exception {
        return this.zzZPe != null ? Float.intBitsToFloat(zzZKH.zz9(this.zzZPf.zzXc())) : this.zzZPf.zziC();
    }

    public final void readFully(byte[] bArr) throws Exception {
        readFully(bArr, 0, bArr.length);
    }

    public final int readInt() throws Exception {
        zzZKJ zzzkj = this.zzZPe;
        return zzzkj != null ? zzzkj.zzXc() : this.zzZPf.zzXc();
    }

    public final short readShort() throws Exception {
        zzZKJ zzzkj = this.zzZPe;
        return zzzkj != null ? zzzkj.zzXa() : this.zzZPf.zzXa();
    }

    public final int readUnsignedShort() throws Exception {
        zzZKJ zzzkj = this.zzZPe;
        return (zzzkj != null ? zzzkj.zzXa() : this.zzZPf.zzXa()) & 65535;
    }

    public final void seek(long j) throws Exception {
        this.zzN5.zzH(j);
    }

    public final void zzQk(int i) throws Exception {
        zzZOP zzzop = this.zzN5;
        zzzop.zzH(zzzop.getPosition() + ((long) i));
    }

    public final long zzf0() throws Exception {
        return this.zzN5.getPosition();
    }

    public final long zzf1() throws Exception {
        zzZKJ zzzkj = this.zzZPe;
        return ((long) (zzzkj != null ? zzzkj.zzXc() : this.zzZPf.zzXc())) & 4294967295L;
    }

    public final void readFully(byte[] bArr, int i, int i2) throws Exception {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException("off < 0 || len < 0 || off + len > b.length!");
        }
        while (i2 > 0) {
            int i4 = read(bArr, i, i2);
            if (i4 <= 0) {
                return;
            }
            i += i4;
            i2 -= i4;
        }
    }
}
