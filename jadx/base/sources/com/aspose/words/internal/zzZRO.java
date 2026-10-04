package com.aspose.words.internal;

import java.io.IOException;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZRO {
    protected zzXZ zz58;
    private final boolean zz59;
    protected final ByteOrder zz5a;
    protected final zzZOP zzN5;
    protected zzZOW zzW5;

    public zzZRO(ByteOrder byteOrder, zzZOP zzzop) throws Exception {
        this.zz5a = byteOrder;
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        if (byteOrder == byteOrder2) {
            this.zz58 = new zzXZ(zzzop);
        } else {
            this.zzW5 = new zzZOW(zzzop);
        }
        this.zz59 = byteOrder == byteOrder2;
        this.zzN5 = zzzop;
    }

    public final void flush() {
        try {
            this.zzN5.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void writeByte(int i) throws Exception {
        if (this.zz59) {
            this.zz58.writeByte((byte) i);
        } else {
            this.zzW5.writeByte((byte) i);
        }
    }

    public final void writeInt(int i) throws Exception {
        if (this.zz59) {
            this.zz58.zzl(i);
        } else {
            this.zzW5.zzl(i);
        }
    }

    public final void writeShort(int i) throws Exception {
        if (this.zz59) {
            this.zz58.zzj(i);
        } else {
            this.zzW5.zzK((short) i);
        }
    }

    public final void zzC(byte[] bArr, int i) throws IOException {
        try {
            this.zzN5.write(bArr, 0, i);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }
}
