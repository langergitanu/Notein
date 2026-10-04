package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzY9W extends zzYAU {
    private static String[] zzXbp = new String[10];
    private short zzXbq = 1;

    static {
        int i = 0;
        while (true) {
            String[] strArr = zzXbp;
            if (i >= strArr.length) {
                return;
            }
            strArr[i] = com.aspose.words.internal.zzZKN.zzS(ControlChar.SPACE_CHAR, i);
            i++;
        }
    }

    private zzY9W() {
    }

    private boolean zzY4S() throws Exception {
        zza7();
        if (zzY73()) {
            return false;
        }
        return zzlQ(16);
    }

    private boolean zzY4T() throws Exception {
        return this.zzXbq == 1 && !zzlQ(1);
    }

    private boolean zzY4U() throws Exception {
        return ((zzZ55) zzZZJ()).zzI(true, true) == this;
    }

    @Override // com.aspose.words.zzYAU
    public final int getLength() {
        return this.zzXbq;
    }

    @Override // com.aspose.words.zzYAU
    public final String getText() {
        return getText(this.zzXbq);
    }

    public final void setLength(int i) {
        if (i < 0) {
            this.zzXbq = (short) 0;
        } else if (i > 32767) {
            this.zzXbq = Short.MAX_VALUE;
        } else {
            this.zzXbq = (short) i;
        }
    }

    @Override // com.aspose.words.zzYAU
    public final int zz0R() {
        return this.zzXbq;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzQK(boolean z) throws Exception {
        if (!zzZf(2048, z)) {
            return false;
        }
        zzYof().zzZ(this, (zzY9W) ((zzYAU) zzYo1()));
        zzY6K();
        return true;
    }

    public final boolean zzY4V() throws Exception {
        if (!zzE((short) 512)) {
            zzZ((short) 1024, (zzY6N().zzZr().zzPl().zzpA() || !zzY6y() || zzY7b()) ? false : true);
            zzZ((short) 512, true);
        }
        return zzE((short) 1024);
    }

    public final int zzY4W() throws Exception {
        return zzY4V() ? zzY6N().zzZr().zzP7() : zzY6N().zzZr().zzY5(32);
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzY6g() throws Exception {
        return !zzY4V();
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzY6x() throws Exception {
        if (zzaa() == null) {
            return false;
        }
        if (zza7().getBalanceSingleByteDoubleByteWidth()) {
            return zzY6N().zzYKJ() && zzY4T() && !zzlQ(2) && !zzY4U();
        }
        return true;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzY6y() throws Exception {
        if (zzaa() == null || !zza7().getBalanceSingleByteDoubleByteWidth()) {
            return false;
        }
        if (zzY4U()) {
            return true;
        }
        if (!zzZ3X.zzwL(zzY6N().getLocaleIdFarEast()) || ((zzZ37) zzY6S().zzYTt()).getWordWrap()) {
            return (zza7().zzYMt() && zzY4S()) || !zzY4T() || zzlQ(14);
        }
        return true;
    }

    @Override // com.aspose.words.zzYAU
    public final zzYAU zzY71() throws Exception {
        zzY9W zzy9w = new zzY9W(this.zzXbq);
        zzZB(zzy9w);
        return zzy9w;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzY77() {
        return true;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzY7c() throws Exception {
        return !zzY7e() && zzY4V() && zzY6N().zzYKJ();
    }

    @Override // com.aspose.words.zzYAU
    public final float zzY7d() throws Exception {
        return zzY7c() ? zzY6N().zzZr().zzP1() : super.zzY7d();
    }

    @Override // com.aspose.words.zzYAU
    public final int zzY7f() throws Exception {
        if (zzY72() == null && zzY4V() && zzY6N().zzYKJ()) {
            return (zzYPO() * (zzY6x() ? 2 : 1)) + (zzY6N().getSpacing() / 2) + zzY6N().getSpacing();
        }
        return super.zzY7f();
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzY7s() {
        return true;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzYKY() {
        return UnicodeScript.COMMON;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzYRO() throws Exception {
        return zzY7r() == 5121;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzYoJ() throws Exception {
        return zzY4V() ? zzY6N().zzZr().zzP7() * this.zzXbq : zzYof().zzQ(this);
    }

    @Override // com.aspose.words.zzYAU
    public final int zzZo6() {
        return 10754;
    }

    public final int zzlA(int i) throws Exception {
        if (zzY72() != null || zzlQ(8) || i == 2) {
            return 0;
        }
        if (!zza7().getBalanceSingleByteDoubleByteWidth() || (zzY4T() && !zzlQ(6))) {
            return zzZXS() / 2;
        }
        return 0;
    }

    public final int zzlB(int i) throws Exception {
        boolean z = false;
        if (zzY72() != null || zzlQ(8)) {
            return 0;
        }
        boolean balanceSingleByteDoubleByteWidth = zza7().getBalanceSingleByteDoubleByteWidth();
        if (i != 1) {
            if (i != 2 || (zza7().getUseWord97LineBreakRules() && zza7().getBalanceSingleByteDoubleByteWidth() && !zzY6N().zzZr().zzPl().zzpy())) {
                return 0;
            }
            if (!balanceSingleByteDoubleByteWidth || zzY4T()) {
                if (balanceSingleByteDoubleByteWidth && !zzY6N().zzYKJ()) {
                    z = true;
                }
                return com.aspose.words.internal.zzJF.zzZ(zzZXS(), zzY6N().zzZr(), z);
            }
        } else if (!balanceSingleByteDoubleByteWidth || (zzY4T() && !zzlQ(6))) {
            return (int) Math.ceil(((double) zzZXS()) / 4.0d);
        }
        return 0;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzlW(int i) throws Exception {
        return zzVH(zzY4W(), 1) + zzY78() + zzlS(i);
    }

    @Override // com.aspose.words.zzYAU
    public final zzYAU zzlX(int i) throws Exception {
        zzY9W zzy9w = new zzY9W();
        zzYof().zzZ(this, zzy9w, i);
        zzlU(0);
        zzZw(zzy9w);
        return zzy9w;
    }

    public static String getText(int i) {
        String[] strArr = zzXbp;
        return i < strArr.length ? strArr[i] : com.aspose.words.internal.zzZKN.zzS(ControlChar.SPACE_CHAR, i);
    }

    public zzY9W(int i) {
        setLength(i);
    }
}
