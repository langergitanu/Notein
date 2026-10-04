package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class OlePackage {
    byte[] zzXJa;
    String zzXJb;
    private zzYOC zzYC1;
    private String zzZM;
    private String zzZS;

    public OlePackage() {
    }

    private static String zzK(com.aspose.words.internal.zzZOX zzzox, int i) throws Exception {
        return com.aspose.words.internal.zzZO0.zzhU().zzZn(zzzox.zzn(i * 2));
    }

    private static void zzX(com.aspose.words.internal.zzZOW zzzow, String str) throws Exception {
        byte[] bytes = com.aspose.words.internal.zzZO0.zzhU().getBytes(str);
        zzzow.zzl(str.length());
        zzzow.writeBytes(bytes);
    }

    private static void zzY(com.aspose.words.internal.zzZOW zzzow, String str) throws Exception {
        zzzow.writeBytes(com.aspose.words.internal.zzZO0.zzQz(1251).getBytes(str));
        zzzow.writeByte((byte) 0);
    }

    private void zzYrp() throws Exception {
        if (this.zzYC1 != null) {
            com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
            zzZ(new com.aspose.words.internal.zzZOW(zzzor));
            zzYOI zzyoi = new zzYOI();
            zzyoi.zzXW(zzzor.zzWy());
            zzyoi.zzW(this.zzYC1.zzYrr());
        }
    }

    private static String zzg(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        StringBuilder sb = new StringBuilder();
        byte[] bArr = new byte[1];
        while (true) {
            zzzox.read(bArr, 0, 1);
            char c = com.aspose.words.internal.zzZO0.zzQz(1251).zzYO(bArr)[0];
            if (c == 0) {
                return sb.toString();
            }
            sb.append(c);
        }
    }

    private static String zzh(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        int iZzXc;
        return (!com.aspose.words.internal.zzZYQ.zzT(zzzox, 4) || (iZzXc = zzzox.zzXc()) <= 0) ? "" : zzK(zzzox, iZzXc);
    }

    private void zzi(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        String strZzh = zzh(zzzox);
        if (!com.aspose.words.internal.zzZYD.zzXk(strZzh)) {
            strZzh = this.zzXJb;
        }
        this.zzXJb = strZzh;
        String strZzh2 = zzh(zzzox);
        if (!com.aspose.words.internal.zzZYD.zzXk(strZzh2)) {
            strZzh2 = this.zzZM;
        }
        this.zzZM = strZzh2;
        String strZzh3 = zzh(zzzox);
        if (!com.aspose.words.internal.zzZYD.zzXk(strZzh3)) {
            strZzh3 = this.zzZS;
        }
        this.zzZS = strZzh3;
    }

    public String getDisplayName() {
        return this.zzZM;
    }

    public String getFileName() {
        return this.zzZS;
    }

    public final boolean isLink() {
        return this.zzXJa == null;
    }

    public void setDisplayName(String str) throws Exception {
        if (str == null) {
            str = "";
        }
        if (com.aspose.words.internal.zzZKN.zzX(str, this.zzZM, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            return;
        }
        this.zzZM = str;
        zzYrp();
    }

    public void setFileName(String str) throws Exception {
        if (str == null) {
            str = "";
        }
        if (com.aspose.words.internal.zzZKN.zzX(str, this.zzZS, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            return;
        }
        this.zzZS = str;
        this.zzXJb = str;
        zzYrp();
    }

    public final void zzZ(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        if ((zzzox.zzX9() & 65535) != 2) {
            return;
        }
        this.zzZM = zzg(zzzox);
        this.zzZS = zzg(zzzox);
        zzzox.zzX9();
        int iZzX9 = zzzox.zzX9() & 65535;
        if (iZzX9 == 1) {
            zzzox.zzX9();
            this.zzXJb = zzg(zzzox);
            this.zzXJa = null;
        } else {
            if (iZzX9 != 3) {
                return;
            }
            zzzox.zzXc();
            this.zzXJb = zzg(zzzox);
            this.zzXJa = zzzox.zzn(zzzox.zzXc());
        }
        zzi(zzzox);
    }

    public OlePackage(zzYOC zzyoc) {
        this.zzYC1 = zzyoc;
    }

    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzJ((short) 2);
        zzY(zzzow, this.zzZM);
        zzY(zzzow, this.zzZS);
        zzzow.zzJ((short) 0);
        byte[] bArr = this.zzXJa;
        if (bArr != null && bArr.length > 0) {
            zzzow.zzJ((short) 3);
            zzzow.zzl(this.zzXJb.length() + 1);
            zzY(zzzow, this.zzXJb);
            zzzow.zzl(this.zzXJa.length);
            zzzow.writeBytes(this.zzXJa);
            zzX(zzzow, this.zzXJb);
            zzX(zzzow, this.zzZM);
            zzX(zzzow, this.zzZS);
            return;
        }
        zzzow.zzJ((short) 1);
        zzzow.zzJ((short) 1);
        zzY(zzzow, this.zzXJb);
    }
}
