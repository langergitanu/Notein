package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz9N extends zz9Y {
    private zz60 zzZ6j;
    private int zzZ6k;

    public zz9N(int i, zz60 zz60Var) {
        this.zzZ6k = i;
        this.zzZ6j = zz60Var;
    }

    @Override // com.aspose.words.zz9Y
    public final int zzZEb() {
        switch (this.zzZ6k) {
            case 1:
                return this.zzZ6j.zzZyQ();
            case 2:
                return this.zzZ6j.zzZyR();
            case 3:
                return this.zzZ6j.zzZyT() ? 1 : 0;
            case 4:
                return this.zzZ6j.zzZyV().getValue();
            case 5:
                return this.zzZ6j.zzZyU().getValue();
            case 6:
                return this.zzZ6j.getDirection();
            case 7:
                return this.zzZ6j.zzZyS();
            case 8:
                return this.zzZ6j.zzZyW() ? 1 : 0;
            case 9:
                return this.zzZ6j.zzZyP();
            default:
                throw new IllegalStateException("Unexpected function argument.");
        }
    }
}
