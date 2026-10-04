package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZY implements zzZC8 {
    private zz5K zzYWY;
    private zzBE zzZ2u;

    public zzZZY(zz5K zz5k, int i) {
        this.zzYWY = zz5k;
        this.zzZ2u = new zzBE(i, zz5k.zzZyF().zzZDW());
    }

    @Override // com.aspose.words.zzZC9
    public final int getType() {
        return this.zzZ2u.getType();
    }

    @Override // com.aspose.words.zzZC9
    public final void invalidate() {
    }

    @Override // com.aspose.words.zzZC9
    public final void zzX9(boolean z) {
    }

    @Override // com.aspose.words.zzZC9
    public final void zzXa(boolean z) {
    }

    @Override // com.aspose.words.zzZC9
    public final void zzYS(float f) {
        zzYT(f);
    }

    @Override // com.aspose.words.zzZC9
    public final void zzYT(float f) {
        this.zzYWY.zzP(this.zzZ2u.getType(), f);
    }

    @Override // com.aspose.words.zzZC9
    public final void zzZzf() {
        this.zzYWY.zzZyB();
    }

    @Override // com.aspose.words.zzZC8
    public final zzB9 zzZzi() {
        return null;
    }

    @Override // com.aspose.words.zzZC8
    public final ArrayList<zzBC> zzZzj() {
        return new ArrayList<>();
    }

    @Override // com.aspose.words.zzZC9
    public final boolean zzZzk() {
        return true;
    }

    @Override // com.aspose.words.zzZC8
    public final void zzZzl() {
    }

    @Override // com.aspose.words.zzZC8
    public final boolean zzZzm() {
        return false;
    }

    @Override // com.aspose.words.zzZC9
    public final zz9K zzZzn() {
        return this.zzYWY.zzZyE();
    }

    @Override // com.aspose.words.zzZC9
    public final float zzZzp() {
        return Float.POSITIVE_INFINITY;
    }

    @Override // com.aspose.words.zzZC9
    public final float zzZzq() {
        return zzZzs();
    }

    @Override // com.aspose.words.zzZC9
    public final float zzZzr() {
        return zzZzs();
    }

    @Override // com.aspose.words.zzZC9
    public final float zzZzs() {
        return this.zzYWY.zzHI(this.zzZ2u.getType());
    }

    @Override // com.aspose.words.zzZC8
    public final zzBE zzZzt() {
        return this.zzZ2u;
    }
}
