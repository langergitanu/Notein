package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
class zzZ6H extends zzZ6S {
    private String zzYK;
    private String zzYN;
    private Font zzYfd;
    protected boolean zzYfe;
    private String zzYff;
    protected long zzZN;
    protected String zzZi;

    public zzZ6H(zzYMD zzymd) throws Exception {
        this(zzymd, null);
    }

    private static String zzJu(String str) {
        if (str == null) {
            return null;
        }
        return com.aspose.words.internal.zzZKN.zzZ(com.aspose.words.internal.zzZKN.zzZ(com.aspose.words.internal.zzZKN.zzZ(str, (char) 0, ControlChar.SPACE_CHAR), (char) 7, ControlChar.SPACE_CHAR), ControlChar.NON_BREAKING_SPACE_CHAR, ControlChar.SPACE_CHAR);
    }

    private void zzYRJ() throws Exception {
        this.zzYff = null;
        this.zzYK = null;
        zzZ99 zzz99ZzY = zzY(zz14(), false);
        if (zzz99ZzY == null) {
            zzz99ZzY = (zzZ99) com.aspose.words.internal.zzZKW.zzZ(zz14(), zzZ99.class);
        }
        if (zzz99ZzY == null) {
            return;
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzz99ZzY.zzZkA())) {
            this.zzYff = zzz99ZzY.zzZkA();
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzz99ZzY.zzYWa())) {
            this.zzYK = zzz99ZzY.zzYWa();
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzz99ZzY.getScreenTip())) {
            this.zzYN = zzz99ZzY.getScreenTip();
        }
        if (this.zzYff == null) {
            this.zzYK = null;
        }
    }

    private boolean zzYRN() throws Exception {
        return (!zz14().zzY6g() || zz14().zzaa() == null || zz14().zzab() == null || zz14().zzab().zza8() == null || !zz14().zzab().zza8().zzYSN()) ? false : true;
    }

    private boolean zzYRS() {
        return zz14().zzY6F() && !zz14().zza7().zzYMH() && (zz14().zzZSu() == ((zzZ55) zz14().zzZZJ()).zz5T());
    }

    private boolean zzYRT() throws Exception {
        return zz14().zzY6F() && zz14().zzY6J() > ((zzZ55) zz14().zzZZJ()).zzZXS();
    }

    private Font zzYRV() {
        byte b = 2;
        if (zz14().zzY6F()) {
            if (!zz14().zzZZJ().zzaa().zza7().zzYMH()) {
                b = 0;
            } else if (((zzZ55) zz14().zzZZJ()).zzYQh()) {
                b = 1;
            }
        }
        return (zz14().zzY72() == null || zz14().zzY72().zzZ9o()) ? zz14().zzY6N().zzp(b) : zz14().zzY6N().zzW(zz14().zzY72().zzZ9q(), b);
    }

    private float zzYSo() throws Exception {
        return zz14().getY() / 1000.0f;
    }

    private float zzYSr() throws Exception {
        return zz14().getHeight() / 1000.0f;
    }

    public final Font getFont() {
        if (this.zzYfd == null) {
            this.zzYfd = zzYRV();
        }
        return this.zzYfd;
    }

    @Override // com.aspose.words.zzZ6S
    public final float getHeight() throws Exception {
        if (this.zzYgm == null) {
            return 0.0f;
        }
        return super.getHeight();
    }

    public final String getScreenTip() {
        return this.zzYN;
    }

    public final String getText() throws Exception {
        if (this.zzZi == null) {
            this.zzZi = zzJu(zz14().getText());
        }
        return this.zzZi;
    }

    @Override // com.aspose.words.zzZ6S
    public final float getWidth() throws Exception {
        if (this.zzYgm == null) {
            return 0.0f;
        }
        return super.getWidth();
    }

    public final zzYAU zz14() {
        return (zzYAU) com.aspose.words.internal.zzZKW.zzZ(this.zzYgm, zzYAU.class);
    }

    public final boolean zz6c() {
        return zz14().zzY6N().zz6c();
    }

    public boolean zzM8() throws Exception {
        if (zz14().zzY6N().getUnderline() == 0 || zzYRS() || zzYRT()) {
            return false;
        }
        return (zz14().zzY6N().getUnderline() == 2 && (zz14().zzZo6() == 12803 || zz14().zzZo6() == 10754 || zz14().zzZo6() == 9747 || zz14().zzZo6() == 10770 || zz14().zzZo6() == 10782)) ? false : true;
    }

    public final boolean zzUU(boolean z) throws Exception {
        zzY9W zzy9w;
        return (getText().length() > 1 && ((!zzYRN() && zz14().zzY7f() != 0) || (z && (zzy9w = (zzY9W) com.aspose.words.internal.zzZKW.zzZ(zz14(), zzY9W.class)) != null && zzy9w.zzY4V()))) || zz6c();
    }

    @Override // com.aspose.words.zzZ6S
    public final void zzY(long j) {
        this.zzZN = j;
        this.zzYfe = true;
    }

    public final ArrayList<zzZ6H> zzYRK() throws Exception {
        return new zzZ6E(this).zzYRI();
    }

    public boolean zzYRL() throws Exception {
        return true;
    }

    public boolean zzYRM() throws Exception {
        return true;
    }

    public final boolean zzYRO() throws Exception {
        return zz14().zzY7r() == 5121;
    }

    public final double zzYRP() throws Exception {
        return zz14().zzY7f() / 1000.0f;
    }

    public boolean zzYRQ() throws Exception {
        return (zz14().zzY6N().zzYKW() == 0 || zzYRX() == 0.0f || zzYRS() || zzYRT()) ? false : true;
    }

    public final float zzYRR() throws Exception {
        if (zzYRT()) {
            return 0.0f;
        }
        return zzYRU() ? (((zzZ55) zz14().zzZZJ()).zzZXS() - zz14().zzY6J()) / 1000.0f : zzYRX();
    }

    public final boolean zzYRU() throws Exception {
        return zz14().zzY6F() && zz14().zzY6J() <= ((zzZ55) zz14().zzZZJ()).zzZXS() && zz14().zzY6J() + zz14().zzZXS() > ((zzZ55) zz14().zzZZJ()).zzZXS();
    }

    public final float zzYRW() throws Exception {
        return zz14().getContentHeight() / 1000.0f;
    }

    public final float zzYRX() throws Exception {
        return zz14().zzZXS() / 1000.0f;
    }

    public final com.aspose.words.internal.zzPM zzYRY() {
        return zz14().zzY6N().zzZr();
    }

    public final String zzYRZ() {
        return this.zzYff;
    }

    public boolean zzYS0() {
        return false;
    }

    public final com.aspose.words.internal.zzZQ4 zzYSx() throws Exception {
        return new com.aspose.words.internal.zzZQ4(zzZm(), zzYSo(), getWidth(), zzYSr());
    }

    public com.aspose.words.internal.zzZQ4 zzYTP() throws Exception {
        return com.aspose.words.internal.zzSA.zzY(zz14().zzYPH());
    }

    @Override // com.aspose.words.zzZ6S
    public long zzZT() throws Exception {
        if (!this.zzYfe) {
            this.zzZN = com.aspose.words.internal.zzSA.zzF(com.aspose.words.internal.zzZPZ.zzZm(zz14().zzY6J(), zz14().getBaseline()));
            this.zzYfe = true;
        }
        return this.zzZN;
    }

    public final String zzZe() {
        return this.zzYK;
    }

    public zzZ6H(zzYMD zzymd, String str) throws Exception {
        super(zzymd);
        this.zzZN = 0L;
        String strZzJu = zzJu(str);
        this.zzZi = strZzJu;
        if (strZzJu != null) {
            com.aspose.words.internal.zzZKN.equals(strZzJu, com.aspose.words.internal.zzZYD.zzX9(strZzJu));
        }
        zzYRJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.aspose.words.zzYAU] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.aspose.words.zzYAU] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.aspose.words.zzYAH, com.aspose.words.zzYAU] */
    private static zzYAH zzY(zzYAU zzyau, boolean z) {
        do {
            zzyau = zzyau.zzZ(z, 88, 3, 72, 37);
            if (zzyau == 0) {
                return null;
            }
            if (zzyau.getField().getType() == 88) {
                break;
            }
            z = true;
        } while (zzY(zzyau, true) != null);
        return zzyau;
    }
}
