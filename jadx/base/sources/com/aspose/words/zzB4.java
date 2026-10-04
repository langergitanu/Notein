package com.aspose.words;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzB4 extends zz53 implements zzZCL {
    private HashMap<String, com.aspose.words.internal.zz77> zzZ7H = new HashMap<>();
    private com.aspose.words.internal.zz77 zzZ7I;
    private int zzZjh;

    @Override // com.aspose.words.zzZCL
    public final zz7X getFill() {
        return new zz19();
    }

    @Override // com.aspose.words.zzZCL
    public final zz4G getOutline() {
        return new zz4G();
    }

    @Override // com.aspose.words.zzZCL
    public final void setFill(zz7X zz7x) {
    }

    @Override // com.aspose.words.zzZCL
    public final void setOutline(zz4G zz4g) {
    }

    public final void zzLV(int i) {
        this.zzZjh = i;
    }

    public final void zzV(com.aspose.words.internal.zz77 zz77Var) {
        this.zzZ7I = zz77Var;
    }

    @Override // com.aspose.words.zz53
    public final zz53 zzY(boolean z, zzZA5 zzza5) {
        zzB4 zzb4 = (zzB4) super.zzY(z, zzza5);
        zzb4.zzZ7I = this.zzZ7I.zzxm();
        return zzb4;
    }

    @Override // com.aspose.words.zzZCL
    public final void zzZ(zz1K zz1k) {
    }

    public final HashMap<String, com.aspose.words.internal.zz77> zzZEZ() {
        return this.zzZ7H;
    }

    public final com.aspose.words.internal.zz77 zzZF0() {
        return this.zzZ7I;
    }

    @Override // com.aspose.words.zz53
    public final int zzZHY() {
        return 11;
    }

    public final int zzZTg() {
        return this.zzZjh;
    }

    @Override // com.aspose.words.zzZCL
    public final zz1K zzZTj() {
        return null;
    }
}
