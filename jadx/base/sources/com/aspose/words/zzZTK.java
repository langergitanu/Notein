package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
class zzZTK extends zzZT7 {
    private ArrayList<zzZTG> zzYK1;
    private int zzYK2;
    private int zzYK3;
    private int zzYK4;

    public zzZTK() {
        super(61446, 0);
        this.zzYK1 = new ArrayList<>();
    }

    @Override // com.aspose.words.zzZT7
    public String toString() {
        StringBuilder sb = new StringBuilder();
        com.aspose.words.internal.zzZNH.zzZ(sb, "{0}\n", super.toString());
        com.aspose.words.internal.zzZNH.zzZ(sb, "SpidMax:{0:X}, FidclCount:{1}, ShapeCount:{2}, DrawingCount:{3}\n", Integer.valueOf(this.zzYK4), Integer.valueOf(this.zzYK1.size()), Integer.valueOf(this.zzYK3), Integer.valueOf(this.zzYK2));
        for (int i = 0; i < this.zzYK1.size(); i++) {
            com.aspose.words.internal.zzZNH.zzZ(sb, "{0}\n", this.zzYK1.get(i).toString());
        }
        return sb.toString();
    }

    @Override // com.aspose.words.zzZT7
    public final void zzD(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzYK4 = zzzox.zzXc();
        int iZzXc = zzzox.zzXc() - 1;
        this.zzYK3 = zzzox.zzXc();
        this.zzYK2 = zzzox.zzXc();
        for (int i = 0; i < iZzXc; i++) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzYK1, new zzZTG(zzzox));
        }
    }

    public final void zzEb(int i) {
        this.zzYK2 = i;
    }

    public final void zzEc(int i) {
        this.zzYK4 = i;
    }

    public final void zzEg(int i) {
        this.zzYK3 = i;
    }

    @Override // com.aspose.words.zzZT7
    public final void zzZ(zzZSP zzzsp) throws Exception {
        zzzsp.write(this.zzYK4);
        zzzsp.write(this.zzYK1.size() + 1);
        zzzsp.write(this.zzYK3);
        zzzsp.write(this.zzYK2);
        for (int i = 0; i < this.zzYK1.size(); i++) {
            this.zzYK1.get(i).zzT(zzzsp);
        }
    }

    public final ArrayList<zzZTG> zzZiu() {
        return this.zzYK1;
    }

    public final int zzZiv() {
        return this.zzYK2;
    }
}
