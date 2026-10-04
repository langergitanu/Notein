package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzY9S extends zzYAU {
    private String zzZi;

    private zzY9S() {
    }

    private void zzQn(boolean z) {
        zzZ((short) 512, z);
    }

    private int zzVE(int i, int i2) throws Exception {
        return zzYof().zzZ(this, i, i2);
    }

    private int zzY4D() {
        return zzY6N().zzZr().zzP7();
    }

    private boolean zzY4E() throws Exception {
        zzYAU zzyauZzY6z;
        if (zzYRO() || !zzYMB() || ((zzZ55) zzZZJ()) == null || (zzyauZzY6z = zzY6z()) == null || !com.aspose.words.internal.zzZYD.zzXk(zzyauZzY6z.getText()) || (zzY6D() && zzyauZzY6z.zzY6D())) {
            return false;
        }
        return zzZ(getText().charAt(getText().length() - 1), zzyauZzY6z.getText().charAt(0), ((zzZ37) zzY6S().zzYTt()).getAddSpaceBetweenFarEastAndAlpha(), ((zzZ37) zzY6S().zzYTt()).getAddSpaceBetweenFarEastAndDigit());
    }

    private int zzY4F() {
        boolean z = zzaa() != null && zza7().getBalanceSingleByteDoubleByteWidth();
        return (int) (((com.aspose.words.internal.zzSA.zzn(zzY6N().zzZr().zzPg()) * ((zzY6D() || z) ? 1.0f : zzY6N().zzZr().zzP1())) + ((z ? 2 : 1) * zzY6N().getSpacing())) / 4.0f);
    }

    private int zzY4G() throws Exception {
        int iZzY4F = zzY4E() ? zzY4F() : 0;
        return zzY4C() ? iZzY4F - zzY4D() : iZzY4F;
    }

    private boolean zzY4H() throws Exception {
        if (zza7().getBalanceSingleByteDoubleByteWidth()) {
            return zz0.zzZx(getText().charAt(0));
        }
        return false;
    }

    private boolean zzY4I() {
        return zzY6N().zzZr().zzP1() >= 0.9f;
    }

    private String zzY4M() {
        com.aspose.words.internal.zzZP1 zzzp1ZzWY;
        String strZzVn = com.aspose.words.internal.zzBM.zzVn(zzY6N().getLocaleId());
        if (zzab() != null && zzab().zza8().zzYSL()) {
            strZzVn = "XOXO";
        }
        return (!com.aspose.words.internal.zzZYD.zzXk(strZzVn) || (zzzp1ZzWY = com.aspose.words.internal.zzZXR.zzWY(strZzVn)) == null) ? com.aspose.words.internal.zzZKN.zzU1(this.zzZi) : com.aspose.words.internal.zzZKN.zzZ(this.zzZi, zzzp1ZzWY);
    }

    private boolean zzYMB() {
        return zzaa() != null && zza7().zzYMB();
    }

    private static boolean zzZ(char c, char c2, boolean z, boolean z2) {
        boolean zZzZB;
        if ((!z && !z2) || (zZzZB = zz0.zzZB(c)) == zz0.zzZB(c2)) {
            return false;
        }
        char c3 = zZzZB ? c : c2;
        if (c == c3) {
            c = c2;
        }
        if (zz0.zzZy(c) || zz0.zzZw(c3)) {
            return false;
        }
        if (z && com.aspose.words.internal.zzUX.isLetter(c)) {
            return true;
        }
        return z2 && Character.isDigit(c);
    }

    private void zzlz(int i) {
        zzZY(3072, 10, i);
    }

    @Override // com.aspose.words.zzYAU
    public final int getLength() throws Exception {
        return zzYof().zzY(this);
    }

    @Override // com.aspose.words.zzYAU
    public final String getText() {
        return (zzY6N() == null || !zzY6N().zzYKZ()) ? this.zzZi : zzY4M();
    }

    @Override // com.aspose.words.zzYAU, com.aspose.words.zzYMD
    public final int getWidth() throws Exception {
        return super.getWidth() + zzY5J();
    }

    public final void setText(String str) {
        this.zzZi = str;
    }

    @Override // com.aspose.words.zzYAU
    public final int zz0R() throws Exception {
        return zzYof().zzY(this);
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzQK(boolean z) throws Exception {
        if (!zzZf(1024, z)) {
            return false;
        }
        zzY9S zzy9s = (zzY9S) com.aspose.words.internal.zzZKW.zzZ((zzYAU) zzYo1(), zzY9S.class);
        zzYof().zzZ(this, zzy9s);
        if (zzy9s != null) {
            zzlI(zzy9s.zzY5J());
        }
        zzY6K();
        return true;
    }

    public final int zzVD(int i, int i2) throws Exception {
        int i3 = (i2 - i) + 1;
        if (i3 < 0) {
            return 0;
        }
        if (i == 0 && i3 == getLength()) {
            return getWidth() - zzY5J();
        }
        return zzlS(i) + zzlS(i2) + zzVH(zzVE(i, i2), i3);
    }

    public final boolean zzY4C() throws Exception {
        int iZzR;
        zzYAU zzyauZzY6z;
        if (zzY6N().zzYL3() && zzYMB() && zzab().zzZp0().zza7().zzYMz()) {
            com.aspose.words.internal.zzZYD.zzXk(getText());
            char cCharAt = getText().charAt(getText().length() - 1);
            if (zz0.zzZx(cCharAt) || (iZzR = zz0.zzR(cCharAt, zzZo2())) == 0 || (zzyauZzY6z = zzY6z()) == null) {
                return false;
            }
            if ((zzZ3X.zzwL(zzyauZzY6z.zzZo2()) || !((zzZ37) zzY6S().zzYTt()).getWordWrap()) && zzY6B() && zzyauZzY6z.zzY6B() && !zzY6N().zzZr().zzOY() && !zzyauZzY6z.zzY6N().zzZr().zzOY()) {
                char cCharAt2 = zzyauZzY6z.getText().charAt(0);
                if (zz0.zzZx(cCharAt2)) {
                    return false;
                }
                int iZzR2 = zz0.zzR(cCharAt2, zzyauZzY6z.zzZo2());
                if (iZzR == 2 && iZzR2 != 0) {
                    return true;
                }
                if ((iZzR == 1 || iZzR == 3) && iZzR2 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void zzY4J() throws Exception {
        if (zzE((short) 512)) {
            return;
        }
        int iZzY4G = zzY4G();
        if (iZzY4G != 0) {
            zzlI(iZzY4G);
        } else {
            zzQn(true);
        }
    }

    public final void zzY4K() throws Exception {
        if (".".equals(this.zzZi)) {
            this.zzZi = com.aspose.words.internal.zzK5.zzZ("٫".charAt(0), zzY6N().zzZr().zzPl()) ? "," : "٫";
        }
    }

    public final void zzY4L() {
        if (",".equals(this.zzZi)) {
            this.zzZi = "،";
        }
    }

    public final int zzY5J() throws Exception {
        if (zzE((short) 512)) {
            return 0;
        }
        if (zzY6t() && this.zzXcW.zzY5I()) {
            return this.zzXcW.zzY5J();
        }
        int iZzY4G = zzY4G();
        if (iZzY4G == 0) {
            zzQn(true);
            return iZzY4G;
        }
        zzY6u();
        this.zzXcW.zzlI(iZzY4G);
        return iZzY4G;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzY6g() {
        return true;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzY6x() throws Exception {
        if (zzaa() == null) {
            return false;
        }
        if (zza7().getBalanceSingleByteDoubleByteWidth()) {
            return (zzY6D() && !zzY4H() && zzY4I()) || zzY6N().zzYKJ();
        }
        return true;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzY6y() {
        return zzaa() != null && zza7().getBalanceSingleByteDoubleByteWidth() && zzY6D();
    }

    @Override // com.aspose.words.zzYAU
    public final zzYAU zzY71() throws Exception {
        zzY9S zzy9s = new zzY9S(getText(), zzY7u());
        zzy9s.zzlY(zzZo2());
        zzZB(zzy9s);
        return zzy9s;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzY77() {
        return true;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzY7s() {
        return true;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzY7u() {
        int iZzVG = zzVG(3072, 10);
        if (iZzVG != 0) {
            return iZzVG;
        }
        int iZzXK = zzY5Z.zzXK(getText().charAt(0));
        zzlz(iZzXK);
        return iZzXK;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzYKY() throws Exception {
        return zzY42.zzA1(getText());
    }

    @Override // com.aspose.words.zzYAU
    public final com.aspose.words.internal.zzZQ5 zzYPH() throws Exception {
        if (zzE((short) 512)) {
            return super.zzYPH();
        }
        com.aspose.words.internal.zzZQ5 zzzq5ZzYPH = super.zzYPH();
        return new com.aspose.words.internal.zzZQ5(zzzq5ZzYPH.getLeft(), zzzq5ZzYPH.getTop(), zzzq5ZzYPH.getWidth() + zzY5J(), zzzq5ZzYPH.getHeight());
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzYRO() throws Exception {
        return zzY7r() == 5121;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzYoJ() throws Exception {
        return zzYof().zzQ(this);
    }

    @Override // com.aspose.words.zzYAU
    public final int zzZo6() {
        return EditingLanguage.ARABIC_YEMEN;
    }

    public final void zzlI(int i) {
        if (i == 0) {
            zzQn(true);
            return;
        }
        zzQn(false);
        if (i != Integer.MIN_VALUE) {
            zzY6u();
        }
        if (zzY6t()) {
            this.zzXcW.zzlI(i);
        }
    }

    @Override // com.aspose.words.zzYAU
    public final char zzlV(int i) throws Exception {
        return zzYof().zzW(this, i);
    }

    @Override // com.aspose.words.zzYAU
    public final int zzlW(int i) throws Exception {
        if (i < 0) {
            i += getLength();
        }
        return zzVH(zzYof().zzX(this, i), 1) + zzlS(i);
    }

    @Override // com.aspose.words.zzYAU
    public final zzYAU zzlX(int i) throws Exception {
        zz0R();
        if (i > 0) {
            zz0R();
        }
        zzY9S zzy9s = new zzY9S();
        zzYof().zzZ(this, zzy9s, i);
        zzy9s.zzlY(zzZo2());
        zzy9s.zzlz(zzY7u());
        zzZw(zzy9s);
        return zzy9s;
    }

    public final boolean zzly(int i) {
        return com.aspose.words.internal.zzSA.zzn((double) zzY6N().zzZr().zzY6(i)) == com.aspose.words.internal.zzSA.zzn((double) zzY6N().zzZr().zzPg());
    }

    public zzY9S(String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        this.zzZi = str;
    }

    public zzY9S(String str, int i) {
        this(str);
        zzlz(i);
    }
}
