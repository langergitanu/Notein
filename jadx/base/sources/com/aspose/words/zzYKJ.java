package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYKJ extends zzYKF {
    private String zzXD9;

    private zzYKJ(String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        this.zzXD9 = str;
    }

    public static zzYKJ zzZ(zzP1 zzp1) {
        if (!"attr".equals(zzp1.getName()) || zzp1.zzZW3().getCount() != 1) {
            return null;
        }
        zzL4 zzl4ZzMl = zzp1.zzZW3().zzMl(0);
        if (zzl4ZzMl.getValueType() != 0) {
            return null;
        }
        String value = ((zzOT) zzl4ZzMl).getValue();
        com.aspose.words.internal.zzZYD.zzXk(value);
        return new zzYKJ(value.toLowerCase());
    }

    @Override // com.aspose.words.zzYKF
    public final void zzZ(zzZ9L zzz9l) {
        zzz9l.zzLc(this.zzXD9);
    }
}
