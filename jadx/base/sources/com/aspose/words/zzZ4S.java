package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ4S extends zzYOE {
    private String zzYcU;
    private String zzYcV;

    public zzZ4S(String str, String str2) {
        this.zzYcV = str;
        this.zzYcU = str2;
    }

    public static zzZ4S zzR(com.aspose.words.internal.zzAA zzaa) throws Exception {
        if (zzaa.containsKey("\u0003LinkInfo")) {
            return new zzZ4S(new com.aspose.words.internal.zzZOX(zzaa.zzYu("\u0003LinkInfo")));
        }
        return null;
    }

    @Override // com.aspose.words.zzYOE
    public final String getName() {
        return "\u0003LinkInfo";
    }

    public final String zzYPn() {
        return this.zzYcU;
    }

    public final String zzYPo() {
        return this.zzYcV;
    }

    @Override // com.aspose.words.zzYOE
    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzZZQ.zzZ(zzzow, com.aspose.words.internal.zzZYD.zzXk(this.zzYcV) ? this.zzYcV : "", 1251, true);
        zzZZQ.zzZ(zzzow, com.aspose.words.internal.zzZYD.zzXk(this.zzYcU) ? this.zzYcU : "", 1251, true);
    }

    private zzZ4S(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        String strZzZn = com.aspose.words.internal.zzZO0.zzQz(1251).zzZn(zzzox.zzn(zzzox.zzXa()));
        this.zzYcV = strZzZn;
        this.zzYcV = com.aspose.words.internal.zzZKN.zzS(strZzZn, (char) 0);
        String strZzZn2 = com.aspose.words.internal.zzZO0.zzQz(1251).zzZn(zzzox.zzn(zzzox.zzXa()));
        this.zzYcU = strZzZn2;
        this.zzYcU = com.aspose.words.internal.zzZKN.zzS(strZzZn2, (char) 0);
    }
}
