package com.aspose.words;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zz4I implements zzZC5 {
    private zzZ91 zzZ0U;
    private com.aspose.words.internal.zzF4 zzv;
    private int zzZ0V = 0;
    private HashMap<ShapeBase, com.aspose.words.internal.zzZL> zzZ0T = new HashMap<>();
    private int zzZ0S = 0;

    @Override // com.aspose.words.zzZC5
    public final int getDml3DEffectsRenderingMode() {
        return this.zzZ0S;
    }

    @Override // com.aspose.words.zzZC5
    public final int getDmlEffectsRenderingMode() {
        return this.zzZ0V;
    }

    public final void setDml3DEffectsRenderingMode(int i) {
        this.zzZ0S = i;
    }

    public final void setDmlEffectsRenderingMode(int i) {
        this.zzZ0V = i;
    }

    @Override // com.aspose.words.zzZC5
    public final com.aspose.words.internal.zzF4 zzI() {
        if (this.zzv == null) {
            this.zzv = com.aspose.words.internal.zz7M.zznW;
        }
        return this.zzv;
    }

    public final void zzZ(com.aspose.words.internal.zzF4 zzf4) {
        this.zzv = zzf4;
    }

    @Override // com.aspose.words.zzZC5
    public final Map<ShapeBase, com.aspose.words.internal.zzZL> zzZxM() {
        return this.zzZ0T;
    }

    @Override // com.aspose.words.zzZC5
    public final zzZ91 zzZxN() {
        return this.zzZ0U;
    }

    public final void zzZ(zzZ91 zzz91) {
        this.zzZ0U = zzz91;
    }
}
