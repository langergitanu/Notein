package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZX implements zzZC8 {
    private zz65 zzYWX;
    private zz5K zzYWY;
    private zzBE zzZ2u;

    public zzZZX(int i, zz5K zz5k) {
        this.zzYWY = zz5k;
        this.zzYWX = zz5k.zzZyF().zzJ2(i);
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
        ArrayList<zzBC> arrayList = new ArrayList<>();
        if (!Float.isInfinite(this.zzYWY.zzHJ(this.zzZ2u.getType()))) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzB8>) arrayList, new zzB8(this.zzYWY.zzHJ(this.zzZ2u.getType()), this.zzYWX));
        }
        return arrayList;
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
