package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzU0 implements zzZ9P {
    static boolean zzZD5 = false;
    private int zzZD8;
    private com.aspose.words.internal.zzZOX zzZtg;
    private ArrayList<zzTZ> zzZm = new ArrayList<>();
    private ArrayList<zzZLN> zzZth = new ArrayList<>();

    public zzU0() {
    }

    private void zzZYH() throws Exception {
        zzYLK.zzZ(this.zzZtg, this.zzZtg.zzXc(), zzTZ.zzZtc, this, "PlcfPcd");
    }

    public final int getCount() {
        return this.zzZm.size();
    }

    public final zzTZ zzMS(int i) {
        return this.zzZm.get(i);
    }

    public final int zzMT(int i) {
        for (int i2 = 0; i2 < this.zzZm.size(); i2++) {
            if (zzMS(i2).zzZYG().contains(i)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.aspose.words.zzZ9P
    public final void zzY(com.aspose.words.internal.zzZOX zzzox, int i, int i2) throws Exception {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, new zzTZ(zzzox, i, i2, this.zzZth, this.zzZD8));
    }

    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        this.zzZth.size();
        zzZZH zzzzh = new zzZZH(zzTZ.zzZtc);
        for (zzTZ zztz : this.zzZm) {
            zzzzh.zzZ(zztz.zzZYG().getStart(), zztz.zzZYG().getEnd(), zztz);
        }
        zzzow.writeByte((byte) 2);
        zzzow.zzk(zzzzh.getSize());
        zzzzh.zzV(zzzow);
    }

    public zzU0(zzZRA zzzra, com.aspose.words.internal.zzZOX zzzox, boolean z) throws Exception {
        int i;
        int i2;
        this.zzZD8 = zzzra.zzYHB;
        if (zzzra.zzYGE.zzXA8.zzYHJ > 0) {
            this.zzZtg = zzzox;
            zzzox.zzq().zzU(zzzra.zzYGE.zzXA8.zzYHK, 0);
            while (true) {
                i2 = zzzox.readByte() & 255;
                if (i2 != 1) {
                    break;
                }
                short sZzXa = zzzox.zzXa();
                if (z) {
                    com.aspose.words.internal.zzZQG.zzZ(this.zzZth, new zzZLN(zzzox, sZzXa));
                } else {
                    zzzox.zzq().zzH(zzzox.zzq().getPosition() + ((long) sZzXa));
                }
            }
            if (i2 == 2) {
                zzZYH();
                return;
            }
            throw new IllegalStateException("Unknown format of the piece table.");
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, new zzTZ(0, zzzra.zzYGY, zzzra.zzYHa, false));
        if (zzzra.zzYHv || (i = zzzra.zzYGW) <= 0) {
            return;
        }
        ArrayList<zzTZ> arrayList = this.zzZm;
        int i3 = zzzra.zzYGY;
        com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzTZ(i3, i + i3, zzzra.zzYHa + i3, false));
    }

    public final int zzZ(zzTZ zztz) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, zztz);
        return this.zzZm.size() - 1;
    }
}
