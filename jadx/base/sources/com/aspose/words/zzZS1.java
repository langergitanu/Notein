package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZS1 {
    private int zzYI6;
    private com.aspose.words.internal.zzZOW zzYI7;
    private com.aspose.words.internal.zzZOR zzYI8;
    private zzZZH zzYI9;
    private com.aspose.words.internal.zzD4 zzYIa = new com.aspose.words.internal.zzD4();

    public zzZS1(int i) {
        this.zzYI9 = new zzZZH(i);
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(512);
        this.zzYI8 = zzzor;
        this.zzYI7 = new com.aspose.words.internal.zzZOW(zzzor, com.aspose.words.internal.zzZO0.zzhU());
        this.zzYI6 = 510;
    }

    private int zz1e() {
        return this.zzYI6 - this.zzYI9.getSize();
    }

    private boolean zzDP(int i) {
        return zz1e() >= this.zzYI9.zzZrQ() + i;
    }

    public abstract Object zzOI(int i);

    public final boolean zzZ(int i, int i2, zzZ8Q zzz8q) throws Exception {
        int iHashCode = zzz8q.hashCode();
        int i3 = this.zzYIa.get(iHashCode);
        if (com.aspose.words.internal.zzD4.zzWm(i3)) {
            int iZz7b = zzz8q.zz7b();
            if (com.aspose.words.internal.zzAN.zzZP(iZz7b)) {
                iZz7b++;
            }
            if (!zzDP(iZz7b)) {
                return false;
            }
            if (iZz7b > 0) {
                int i4 = this.zzYI6 - iZz7b;
                this.zzYI6 = i4;
                this.zzYI8.zzU(i4, 0);
                zzz8q.zzZ(this.zzYI7, true);
                i3 = this.zzYI6 / 2;
                this.zzYIa.set(iHashCode, i3);
            } else {
                i3 = 0;
            }
        } else if (!zzDP(0)) {
            return false;
        }
        this.zzYI9.zzZ(i, i2, zzOI(i3));
        return true;
    }

    public final zzZOF zzZhk() throws Exception {
        this.zzYI8.zzU(0L, 0);
        this.zzYI9.zzV(this.zzYI7);
        this.zzYI8.zzU(511L, 0);
        this.zzYI7.writeByte((byte) this.zzYI9.getItemCount());
        return new zzZOF(this.zzYI9.getStartPosition(), this.zzYI9.zzsm(), this.zzYI8.zzWy());
    }
}
