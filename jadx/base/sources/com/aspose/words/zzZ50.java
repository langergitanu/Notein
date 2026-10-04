package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ50 extends zzY09 {
    private int zzVN;
    private int zzYd6;
    private boolean zzYd7;
    private int zzdo;

    public zzZ50(com.aspose.words.internal.zzZQ5 zzzq5, int i) {
        zzYR(new ArrayList<>(1));
        zzyD().add(new zzYCP(zzzq5.getX(), zzzq5.getRight()));
        this.zzdo = zzzq5.getY();
        this.zzVN = i;
        zzhw(1073741823);
    }

    public final int getHeight() {
        return this.zzVN;
    }

    public final int getY() {
        return this.zzdo;
    }

    @Override // com.aspose.words.zzY09
    public final void offset(int i, int i2) {
        super.offset(i, i2);
        this.zzdo = zzY09.zzUX(this.zzdo, i2);
    }

    public final int zzYPv() {
        return this.zzYd6;
    }

    public final boolean zzYPw() {
        return this.zzYd7;
    }

    public zzZ50(ArrayList<zzYCP> arrayList, int i, int i2, int i3, boolean z, int i4) {
        zzYR(arrayList);
        this.zzVN = i2;
        zzhw(i3);
        this.zzYd7 = z;
        this.zzYd6 = i4;
        this.zzdo = i;
    }
}
