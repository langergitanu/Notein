package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzTR {
    public static void zzY(DocumentBase documentBase, NodeChangingArgs nodeChangingArgs) {
        if (nodeChangingArgs != null) {
            documentBase.zzY(nodeChangingArgs);
        }
    }

    public static NodeChangingArgs zzZ(DocumentBase documentBase, Node node, Node node2, Node node3, int i) {
        return documentBase.zzZ(node, node2, node3, i);
    }

    public static void zzZ(DocumentBase documentBase, NodeChangingArgs nodeChangingArgs) {
        if (nodeChangingArgs != null) {
            documentBase.zzZ(nodeChangingArgs);
        }
    }

    public static void zzZ(DocumentBase documentBase, DocumentBase documentBase2) {
        if (documentBase2 != documentBase) {
            throw new IllegalArgumentException("The newChild was created from a different document than the one that created this node.");
        }
    }
}
