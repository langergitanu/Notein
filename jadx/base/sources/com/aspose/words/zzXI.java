package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzXI extends zzY4K {
    private char zzZAV;
    private com.aspose.words.internal.zzZNR zzZFn;

    public zzXI(char c, boolean z) {
        super(true, false, 23);
        this.zzZAV = c;
        this.zzZFn = new com.aspose.words.internal.zzZNR(com.aspose.words.internal.zzZKN.format("^\\u{0:X4}{1}", Integer.valueOf(c), z ? "\\s" : "(\\w|\\s)"), 0);
    }

    @Override // com.aspose.words.zzY4K
    public final String zzPm(int i) {
        return Character.toString(this.zzZAV);
    }

    @Override // com.aspose.words.zzY4K
    public final zzY4L zzTD(String str) {
        if (!this.zzZFn.zzUX(str).zzhL()) {
            return null;
        }
        String[] strArr = {Character.toString(this.zzZAV)};
        return new zzY4L(strArr, strArr[0]);
    }

    @Override // com.aspose.words.zzY4K
    public final String zzTE(String str) {
        return Character.toString(this.zzZAV);
    }

    @Override // com.aspose.words.zzY4K
    public final boolean zzTF(String str) {
        return str.length() == 1 && str.charAt(0) == this.zzZAV;
    }

    public zzXI(char c) {
        this(c, false);
    }
}
