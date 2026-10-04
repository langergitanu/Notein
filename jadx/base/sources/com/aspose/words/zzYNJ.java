package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYNJ extends zzZLN implements zzZ8Q {
    static boolean zzZD5 = false;
    private int zzXI9;

    public zzYNJ() {
    }

    public static zzZLN zzI(com.aspose.words.internal.zzZOX zzzox, int i) throws Exception {
        if (zzzox == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: reader");
        }
        zzzox.zzq().zzU(i, 0);
        zzZLN zzzln = new zzZLN(zzzox, zzzox.zzXa());
        if (zzZD5) {
            com.aspose.words.internal.zzZKN.format("Read PrcData: {0}", zzzln.toString());
        }
        return zzzln;
    }

    public static zzYNJ zzY(com.aspose.words.internal.zzZOX zzzox, boolean z, int i) throws Exception {
        int iZzXa;
        short sZzXa;
        int i2;
        if (z) {
            int i3 = zzzox.readByte() & 255;
            iZzXa = i3 == 0 ? (zzzox.readByte() & 255) * 2 : (i3 * 2) - (!zzZRA.zzDL(i) ? 1 : 0);
        } else {
            iZzXa = zzzox.zzXa();
        }
        if (iZzXa > 0) {
            sZzXa = zzzox.zzXa();
            i2 = iZzXa - 2;
        } else {
            sZzXa = 0;
            i2 = 0;
        }
        return new zzYNJ(sZzXa, i2 > 0 ? zzzox.zzn(i2) : com.aspose.words.internal.zzZ1.zzXW);
    }

    private boolean zzZ(zzYNJ zzynj) {
        return zzZ((zzZLN) zzynj) && this.zzXI9 == zzynj.zzXI9;
    }

    @Override // com.aspose.words.zzZLN
    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzYNJ.class) {
            return false;
        }
        return zzZ((zzYNJ) obj);
    }

    @Override // com.aspose.words.zzZLN, com.aspose.words.zzZ8Q
    public int hashCode() {
        return super.hashCode() ^ this.zzXI9;
    }

    @Override // com.aspose.words.zzZ8Q
    public final int zz7b() {
        int length = getData().length;
        int i = length + 3;
        return com.aspose.words.internal.zzAN.zzZP((long) i) ? length + 4 : i;
    }

    public final int zzZ7j() {
        return this.zzXI9;
    }

    public zzYNJ(int i, byte[] bArr) {
        super(bArr);
        this.zzXI9 = i;
    }

    public static zzYNJ zzZ(com.aspose.words.internal.zzZOP zzzop, zzYNJ zzynj) throws Exception {
        int position = (int) zzzop.getPosition();
        com.aspose.words.internal.zzZOW zzzow = new com.aspose.words.internal.zzZOW(zzzop, com.aspose.words.internal.zzZO0.zzhU());
        zzzow.zzK((short) zzynj.getData().length);
        zzzow.writeBytes(zzynj.getData());
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        new zzY9I(zzzor).zzVy(26182, position);
        return new zzYNJ(zzynj.zzXI9, zzzor.zzWy());
    }

    public final zzYNJ zzY(zzZLN zzzln) {
        byte[] bArr = new byte[getData().length + zzzln.getData().length];
        System.arraycopy(getData(), 0, bArr, 0, getData().length);
        System.arraycopy(zzzln.getData(), 0, bArr, getData().length, zzzln.getData().length);
        return new zzYNJ(this.zzXI9, bArr);
    }

    @Override // com.aspose.words.zzZ8Q
    public final void zzZ(com.aspose.words.internal.zzZOW zzzow, boolean z) throws Exception {
        if (z) {
            if (com.aspose.words.internal.zzAN.zzZP(getData().length)) {
                zzzow.writeByte((byte) ((getData().length + 3) / 2));
            } else {
                zzzow.writeByte((byte) 0);
                zzzow.writeByte((byte) ((getData().length + 2) / 2));
            }
        } else {
            zzzow.zzK((short) (getData().length + 2));
        }
        zzzow.zzK((short) this.zzXI9);
        zzzow.writeBytes(getData());
    }

    public static boolean zzY(zzYNJ zzynj) {
        return zzynj.getData().length > 485;
    }
}
