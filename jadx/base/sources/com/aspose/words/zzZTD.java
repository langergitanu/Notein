package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZTD extends zzZTQ {
    private String zzYJR;
    private String zzYJS;
    private String zzYL;
    private static byte[] zzYJQ = {-48, -55, -22, 121, -7, -70, -50, 17, -116, -126, 0, -86, 0, 75, -87, 11};
    private static byte[] zzYJP = {-32, -55, -22, 121, -7, -70, -50, 17, -116, -126, 0, -86, 0, 75, -87, 11};
    private static byte[] zzYJO = {3, 3, 0, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70};

    public zzZTD(int i, int i2) {
        super(i, i2);
    }

    private int zzZil() throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzS(new com.aspose.words.internal.zzZOW(zzzor));
        return (int) zzzor.getPosition();
    }

    private static String zzu(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        zzzox.zzX9();
        String strZzF = zzZZR.zzF(zzzox);
        zzzox.zzX9();
        zzzox.zzX9();
        for (int i = 0; i < 5; i++) {
            zzzox.zzXc();
        }
        if (zzzox.zzXc() <= 0) {
            return strZzF;
        }
        int iZzXc = zzzox.zzXc();
        zzzox.zzXa();
        return com.aspose.words.internal.zzZO0.zzhU().zzZn(zzzox.zzn(iZzXc));
    }

    private static String zzv(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        String strZzH = zzZZR.zzH(zzzox);
        int iIndexOf = strZzH.indexOf(0);
        return iIndexOf >= 0 ? strZzH.substring(0, iIndexOf) : strZzH;
    }

    private void zzw(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        if (zzZiF() == 0) {
            return;
        }
        zzzox.zzn(16);
        if (zzzox.zzXc() != 2) {
            return;
        }
        int iZzXc = zzzox.zzXc();
        if ((iZzXc & 16) != 0) {
            zzZZR.zzG(zzzox);
        }
        if ((iZzXc & 128) != 0) {
            this.zzYL = zzZZR.zzG(zzzox);
        }
        if ((iZzXc & 1) != 0) {
            if ((iZzXc & 256) != 0) {
                this.zzYJS = zzZZR.zzG(zzzox);
            } else {
                byte[] bArrZzn = zzzox.zzn(16);
                if (com.aspose.words.internal.zzZ1.zzZ(bArrZzn, zzYJP)) {
                    this.zzYJS = zzv(zzzox);
                } else {
                    if (!com.aspose.words.internal.zzZ1.zzZ(bArrZzn, zzYJO)) {
                        throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unknown hyperlink format. Moniker GUID is {0}.", new com.aspose.words.internal.zzZOZ(bArrZzn).toString()));
                    }
                    this.zzYJS = zzu(zzzox);
                }
            }
        }
        if ((iZzXc & 8) != 0) {
            this.zzYJR = zzZZR.zzG(zzzox);
        }
        if ((iZzXc & 32) != 0) {
            zzzox.zzn(16);
        }
        if ((iZzXc & 64) != 0) {
            zzzox.zzn(8);
        }
    }

    public final String getAddress() {
        return this.zzYJS;
    }

    public final String getSubAddress() {
        return this.zzYJR;
    }

    public final String getTarget() {
        return this.zzYL;
    }

    @Override // com.aspose.words.zzZTQ
    public final void zzC(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        int position = (int) zzzox.zzq().getPosition();
        try {
            zzw(zzzox);
        } finally {
            zzzox.zzq().zzH(position + zzZiF());
        }
    }

    @Override // com.aspose.words.zzZTQ
    public final void zzS(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.writeBytes(zzYJQ);
        zzzow.zzl(2);
        int position = (int) zzzow.zzq().getPosition();
        int i = 0;
        zzzow.zzl(0);
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzYL)) {
            zzZZQ.zzY(this.zzYL, zzzow);
            i = 128;
        }
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzYJS)) {
            zzzow.writeBytes(zzYJP);
            zzZZQ.zzX(this.zzYJS, zzzow);
            i |= 3;
        }
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzYJR)) {
            zzZZQ.zzY(this.zzYJR, zzzow);
            i |= 8;
        }
        int position2 = (int) zzzow.zzq().getPosition();
        zzzow.zzq().zzH(position);
        zzzow.zzl(i);
        zzzow.zzq().zzH(position2);
    }

    public zzZTD(int i, String str, String str2, String str3) throws Exception {
        super(i, 0);
        this.zzYJS = str;
        this.zzYJR = str2;
        this.zzYL = str3;
        zzEj(zzZil());
    }
}
