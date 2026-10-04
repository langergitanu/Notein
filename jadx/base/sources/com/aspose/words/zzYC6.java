package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYC6 {
    private com.aspose.words.internal.zzIM<byte[]> zzXmD = new com.aspose.words.internal.zzIM<>();
    private com.aspose.words.internal.zzXA<byte[]> zzXmC = new com.aspose.words.internal.zzXA<>();

    private void zzT(ShapeBase shapeBase, int i) {
        byte[] bArr = (byte[]) shapeBase.zzYvW().zzPk(i);
        if (bArr == null || this.zzXmD.contains(bArr)) {
            return;
        }
        com.aspose.words.internal.zzXC zzxcZz3 = com.aspose.words.internal.zzIL.zz3(bArr);
        byte[] bArrZzX = this.zzXmC.zzX(zzxcZz3);
        if (bArrZzX != null) {
            shapeBase.zzYvW().zzQ(i, bArrZzX);
        } else {
            this.zzXmD.add(bArr);
            this.zzXmC.zzY(zzxcZz3, bArr);
        }
    }

    public final void zzYC(ShapeBase shapeBase) {
        zzT(shapeBase, 4102);
        zzT(shapeBase, 4110);
        zzT(shapeBase, 4111);
    }
}
