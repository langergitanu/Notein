package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZT4 extends zzZT7 {
    private int zzYJH;
    private int zzYJI;

    public zzZT4() {
        super(61450, 2);
    }

    private void zzWj(boolean z) {
        this.zzYJH = com.aspose.words.internal.zzXU.zzZ(this.zzYJH, 128, z);
    }

    private void zzWk(boolean z) {
        this.zzYJH = com.aspose.words.internal.zzXU.zzZ(this.zzYJH, 64, z);
    }

    private boolean zzZug() {
        return (this.zzYJH & 128) != 0;
    }

    private boolean zzZuh() {
        return (this.zzYJH & 64) != 0;
    }

    public final boolean isChild() {
        return (this.zzYJH & 2) != 0;
    }

    public final boolean isGroup() {
        return (this.zzYJH & 1) != 0;
    }

    public final void setShapeType(int i) {
        zzZii().zzE7(i);
    }

    @Override // com.aspose.words.zzZT7
    public String toString() {
        StringBuilder sb = new StringBuilder();
        com.aspose.words.internal.zzZNH.zzZ(sb, "{0}\n", super.toString());
        com.aspose.words.internal.zzZNH.zzZ(sb, "ShapeId:{0:X}, ShapeRecordFlags:{1:X} ({2})\n", Integer.valueOf(this.zzYJI), Integer.valueOf(this.zzYJH), Integer.valueOf(this.zzYJH));
        return sb.toString();
    }

    @Override // com.aspose.words.zzZT7
    public final void zzD(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzYJI = zzzox.zzXc();
        this.zzYJH = zzzox.zzXc();
    }

    public final void zzE3(int i) {
        if (i == 0) {
            zzWk(false);
            zzWj(false);
            return;
        }
        if (i == 1) {
            zzWk(true);
            zzWj(false);
        } else if (i == 2) {
            zzWk(false);
            zzWj(true);
        } else {
            if (i != 3) {
                throw new IllegalStateException("Unknown flip type.");
            }
            zzWk(true);
            zzWj(true);
        }
    }

    public final void zzE4(int i) {
        this.zzYJI = i;
    }

    public final void zzWg(boolean z) {
        this.zzYJH = com.aspose.words.internal.zzXU.zzZ(this.zzYJH, 2048, z);
    }

    public final void zzWh(boolean z) {
        this.zzYJH = com.aspose.words.internal.zzXU.zzZ(this.zzYJH, 1024, z);
    }

    public final void zzWi(boolean z) {
        this.zzYJH = com.aspose.words.internal.zzXU.zzZ(this.zzYJH, 256, z);
    }

    public final void zzWl(boolean z) {
        this.zzYJH = com.aspose.words.internal.zzXU.zzZ(this.zzYJH, 16, z);
    }

    public final void zzWm(boolean z) {
        this.zzYJH = com.aspose.words.internal.zzXU.zzZ(this.zzYJH, 2, z);
    }

    public final void zzWn(boolean z) {
        this.zzYJH = com.aspose.words.internal.zzXU.zzZ(this.zzYJH, 1, z);
    }

    @Override // com.aspose.words.zzZT7
    public final void zzZ(zzZSP zzzsp) throws Exception {
        zzzsp.write(this.zzYJI);
        zzzsp.write(this.zzYJH);
    }

    public final int zzZi9() {
        if (zzZuh() && zzZug()) {
            return 3;
        }
        if (zzZuh()) {
            return 1;
        }
        return zzZug() ? 2 : 0;
    }

    public final boolean zzZia() {
        return (this.zzYJH & 2048) != 0;
    }

    public final void zzZib() {
        this.zzYJH = com.aspose.words.internal.zzXU.zzZ(this.zzYJH, 512, true);
    }

    public final boolean zzZic() {
        return (this.zzYJH & 1024) != 0;
    }

    public final boolean zzZid() {
        return (this.zzYJH & 16) != 0;
    }

    public final boolean zzZie() {
        return (this.zzYJH & 8) != 0;
    }

    public final void zzZif() {
        this.zzYJH = com.aspose.words.internal.zzXU.zzZ(this.zzYJH, 4, true);
    }

    public final boolean zzZig() {
        return (this.zzYJH & 4) != 0;
    }

    public final int zzZih() {
        return this.zzYJI;
    }
}
