package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYYM {
    public static Node[] zzZ(DocumentBase documentBase, zzYEF zzyef) {
        return zzZ(documentBase, zzyef, 33, "PAGE");
    }

    public static Node[] zzZ(DocumentBase documentBase, zzYEF zzyef, int i, String str) {
        return new Node[]{new FieldStart(documentBase, (zzYEF) zzyef.zzbn(), i), new Run(documentBase, str, (zzYEF) zzyef.zzbn()), new FieldSeparator(documentBase, (zzYEF) zzyef.zzbn(), i, null), new Run(documentBase, "XXX", (zzYEF) zzyef.zzbn()), new FieldEnd(documentBase, (zzYEF) zzyef.zzbn(), i, true)};
    }
}
