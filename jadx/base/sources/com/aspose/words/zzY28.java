package com.aspose.words;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzY28 implements zzZ8W {
    private static HashMap<String, String> zzWWc;
    private boolean zzYkj;
    private zzYU4 zzZ7n;

    static {
        HashMap<String, String> map = new HashMap<>();
        zzWWc = map;
        com.aspose.words.internal.zzZQF.zzY(map, "v", "urn:schemas-microsoft-com:vml");
        com.aspose.words.internal.zzZQF.zzY(zzWWc, "o", "urn:schemas-microsoft-com:office:office");
    }

    public zzY28(String str) {
        this.zzZ7n = new zzYU4(str, zzWWc);
    }

    @Override // com.aspose.words.zzZ8W
    public final DocumentBase getDocument() {
        return null;
    }

    @Override // com.aspose.words.zzZ8W
    public final zzYC3 zzJI(String str) {
        return null;
    }

    @Override // com.aspose.words.zzZ8W
    public final ShapeBase zzJJ(String str) {
        return null;
    }

    @Override // com.aspose.words.zzZ8W
    public final boolean zzNM(String str) {
        return false;
    }

    @Override // com.aspose.words.zzZ8W
    public final byte[] zzNO(String str) {
        return null;
    }

    @Override // com.aspose.words.zzZ8W
    public final zzZBL zzNP(String str) {
        return null;
    }

    @Override // com.aspose.words.zzZ8W
    public final void zzVb(boolean z) {
        this.zzYkj = z;
    }

    @Override // com.aspose.words.zzZ8W
    public final String zzY9(String str) {
        return null;
    }

    @Override // com.aspose.words.zzZ8W
    public final boolean zzYXm() {
        return this.zzYkj;
    }

    @Override // com.aspose.words.zzZ8W
    public final void zzZ(String str, ShapeBase shapeBase) {
    }

    @Override // com.aspose.words.zzZ8W
    public final void zzZml() {
    }

    @Override // com.aspose.words.zzZ8W
    public final zzYU4 zzZsD() {
        return this.zzZ7n;
    }

    @Override // com.aspose.words.zzZ8W
    public final void zzb(ShapeBase shapeBase) {
    }

    @Override // com.aspose.words.zzZ8W
    public final boolean zzs(ShapeBase shapeBase) {
        return false;
    }

    @Override // com.aspose.words.zzZ8W
    public final void zzZ(String str, zzYC3 zzyc3) {
    }
}
