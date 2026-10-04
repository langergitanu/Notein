package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYTR extends zzYOE {
    private int zzXS7;
    private int zzXS8;
    private int zzXS9;

    private zzYTR() {
        this.zzXS7 = 0;
    }

    public static zzYTR zzE(boolean z, boolean z2) {
        zzYTR zzytr = new zzYTR();
        zzytr.zzXS9 = (z ? 64 : 0) | (z2 ? 16 : 0);
        zzytr.zzXS8 = 1;
        zzytr.zzXS7 = 3;
        return zzytr;
    }

    public static zzYTR zzQ(com.aspose.words.internal.zzAA zzaa) throws Exception {
        if (!zzaa.containsKey("\u0003ObjInfo")) {
            return null;
        }
        com.aspose.words.internal.zzZOR zzzorZzYu = zzaa.zzYu("\u0003ObjInfo");
        if (zzzorZzYu.getLength() == 0) {
            return null;
        }
        return new zzYTR(new com.aspose.words.internal.zzZOX(zzzorZzYu));
    }

    public static zzYTR zzYyl() {
        zzYTR zzytr = new zzYTR();
        zzytr.zzXS9 = 4608;
        zzytr.zzXS8 = 4;
        zzytr.zzXS7 = 3;
        return zzytr;
    }

    @Override // com.aspose.words.zzYOE
    public final String getName() {
        return "\u0003ObjInfo";
    }

    public final boolean zzYyj() {
        return (this.zzXS9 & 64) != 0;
    }

    public final int zzYyk() {
        return this.zzXS9;
    }

    @Override // com.aspose.words.zzYOE
    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzJ((short) this.zzXS9);
        zzzow.zzJ((short) this.zzXS7);
        zzzow.zzJ((short) this.zzXS8);
    }

    public final void zzsS(int i) {
        this.zzXS9 = i;
    }

    private zzYTR(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzXS7 = 0;
        this.zzXS9 = zzzox.zzX9() & 65535;
        this.zzXS7 = zzzox.zzX9() & 65535;
        if (com.aspose.words.internal.zzZYQ.zzT(zzzox, 2)) {
            this.zzXS8 = zzzox.zzX9() & 15;
        }
    }
}
