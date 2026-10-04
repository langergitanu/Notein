package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZW extends zzYOE {
    private com.aspose.words.internal.zzZOX zzW6;
    private String zzZF8;
    private String zzZF9;
    private String zzZFa;
    private String zzZFb;

    private zzZW(com.aspose.words.internal.zzZOR zzzor) throws Exception {
        zzzor.zzH(0L);
        com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(zzzor);
        this.zzW6 = zzzox;
        int iZzX9 = zzzox.zzX9() & 65535;
        if (zzPl(iZzX9)) {
            zzbt();
            zzbt();
            zzbt();
            zzbt();
            this.zzZF9 = zzbt();
            this.zzZFb = zzbt();
            this.zzW6.zzn(8);
            this.zzW6.zzn(8);
            this.zzW6.zzXc();
            if (iZzX9 == 515) {
                zzbs();
                zzbs();
                zzbs();
                zzbs();
                zzbs();
                zzbs();
                this.zzZF8 = zzbs();
                this.zzZFa = zzbs();
                zzbs();
                zzbs();
                zzbs();
                this.zzW6.zzXc();
                this.zzW6.zzXc();
            }
            zzzor.getPosition();
            zzzor.getLength();
        }
    }

    private static boolean zzPl(int i) {
        return i == 515 || i == 256;
    }

    public static zzZW zzZ(com.aspose.words.internal.zzAA zzaa) throws Exception {
        if (zzaa.containsKey("AttachDesc")) {
            return new zzZW(zzaa.zzYu("AttachDesc"));
        }
        return null;
    }

    private String zzbs() throws Exception {
        int i = this.zzW6.readByte() & 255;
        return i > 0 ? com.aspose.words.internal.zzZO0.zzhU().zzZn(this.zzW6.zzn(i * 2)) : "";
    }

    private String zzbt() throws Exception {
        int i = this.zzW6.readByte() & 255;
        return i > 0 ? com.aspose.words.internal.zzZO0.zzQz(1251).zzZn(this.zzW6.zzn(i)) : "";
    }

    public final String getFileName() {
        return com.aspose.words.internal.zzZYD.zzXk(this.zzZF8) ? this.zzZF8 : this.zzZF9;
    }

    @Override // com.aspose.words.zzYOE
    public final String getName() {
        return "AttachDesc";
    }

    public final String zzxl() {
        return com.aspose.words.internal.zzZYD.zzXk(this.zzZFa) ? this.zzZFa : this.zzZFb;
    }

    @Override // com.aspose.words.zzYOE
    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) {
        throw new UnsupportedOperationException();
    }
}
