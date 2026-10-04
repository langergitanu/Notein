package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYTO extends zzYOE {
    private String mValue;

    public zzYTO(String str) {
        this.mValue = str;
    }

    public static zzYTO zzP(com.aspose.words.internal.zzAA zzaa) throws Exception {
        if (zzaa.containsKey("\u0003OCXNAME")) {
            return new zzYTO(zzaa.zzYu("\u0003OCXNAME"));
        }
        return null;
    }

    @Override // com.aspose.words.zzYOE
    public final String getName() {
        return "\u0003OCXNAME";
    }

    public final String getValue() {
        return this.mValue;
    }

    @Override // com.aspose.words.zzYOE
    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        if (com.aspose.words.internal.zzZYD.zzXk(this.mValue)) {
            for (int i = 0; i < this.mValue.length(); i++) {
                zzzow.writeByte((byte) this.mValue.charAt(i));
                zzzow.writeByte((byte) 0);
            }
        }
        zzzow.zzl(0);
    }

    private zzYTO(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        char c;
        com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(zzzop, com.aspose.words.internal.zzZO0.zzhU());
        StringBuilder sb = new StringBuilder();
        while (com.aspose.words.internal.zzZYQ.zzT(zzzox, 2) && (c = zzzox.readChar()) != 0) {
            sb.append(c);
        }
        this.mValue = sb.toString();
    }
}
