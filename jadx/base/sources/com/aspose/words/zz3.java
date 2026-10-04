package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz3 extends zzY4K {
    private com.aspose.words.internal.zzZNR zzZFn;

    public zz3() {
        super(false, false, 0);
        this.zzZFn = new com.aspose.words.internal.zzZNR("^[1-9]\\d*\\)", 0);
    }

    @Override // com.aspose.words.zzY4K
    public final String zzPm(int i) {
        return "\u0000)";
    }

    @Override // com.aspose.words.zzY4K
    public final zzY4L zzTD(String str) {
        com.aspose.words.internal.zzZNT zzzntZzUX = this.zzZFn.zzUX(str);
        if (zzzntZzUX.zzhL()) {
            return new zzY4L(new String[]{zzzntZzUX.getValue().substring(0, zzzntZzUX.getValue().length() - 1)}, zzzntZzUX.getValue());
        }
        return null;
    }

    @Override // com.aspose.words.zzY4K
    public final String zzTE(String str) {
        int iZzZo = com.aspose.words.internal.zzJB.zzZo(str);
        return iZzZo == Integer.MIN_VALUE ? "" : Integer.toString(iZzZo + 1);
    }

    @Override // com.aspose.words.zzY4K
    public final boolean zzTF(String str) {
        return "1".equals(str);
    }
}
