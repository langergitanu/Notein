package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY60 {
    private static long zzW(zzZ92 zzz92) {
        return zzz92.getMarkupLanguage_ITextBox() == 0 ? zz1P.zzL((Shape) zzz92) : zzZh((Shape) zzz92).getSize();
    }

    private static zzZL4 zzWg(Node node) {
        while (node.getNodeType() == 18 && node.getParentNode() != null) {
            node = node.getParentNode();
        }
        GroupShape groupShape = node.getNodeType() == 17 ? (GroupShape) node : null;
        if (groupShape == null) {
            return new zzZL4();
        }
        CompositeNode parentNode = groupShape.getParentNode();
        zzZL4 zzzl4 = new zzZL4();
        if (parentNode != null && parentNode.getNodeType() == 17) {
            zzzl4 = zzWg(parentNode);
        }
        long size = groupShape.getSize();
        com.aspose.words.internal.zzP9 zzp9ZzZ = zzYBX.zzZ((ShapeBase) groupShape, size, false);
        zzp9ZzZ.zzZ(zzzl4.zzZ54(), 1);
        zzYBX.zzZ((ShapeBase) groupShape, size, true).zzZ(zzzl4.zzZ54(), 1);
        long jZzZ = zzYBX.zzZ(groupShape, zzzl4.getScaleX(), zzzl4.getScaleY());
        return new zzZL4(zzp9ZzZ, (Float.intBitsToFloat((int) size) / groupShape.zzY9c()) * Float.intBitsToFloat((int) jZzZ), (com.aspose.words.internal.zzZPW.zzYz(size) / groupShape.zzY9b()) * com.aspose.words.internal.zzZPW.zzYz(jZzZ), (float) (groupShape.getRotation() + ((double) zzzl4.getRotation())));
    }

    public static long[] zzZ(zzZ92[] zzz92Arr) {
        int length = zzz92Arr.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = zzW(zzz92Arr[i]);
        }
        return jArr;
    }

    private static com.aspose.words.internal.zzZQ4 zzZh(Shape shape) {
        return new zzYCD(new zzYC5(shape), zzWg(shape), null).zzYad().zzXW7();
    }
}
