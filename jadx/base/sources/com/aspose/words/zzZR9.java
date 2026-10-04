package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZR9 {
    private static Run zzX(String str, zzYEF zzyef, CompositeNode compositeNode, Node node, boolean z) {
        Run run = new Run(compositeNode.getDocument(), str, (zzYEF) zzyef.zzbn());
        zzZ(run, compositeNode, node, z);
        return run;
    }

    public static Run zzY(String str, zzYEF zzyef, CompositeNode compositeNode, Node node, boolean z) {
        return zzX(str, zzyef, compositeNode, node, z);
    }

    public static Field zzZ(int i, boolean z, zzYEF zzyef, CompositeNode compositeNode, Node node, boolean z2) throws Exception {
        String strZzCH = zzZOO.zzCH(i);
        zzYEF zzyef2 = (zzYEF) zzyef.zzbn();
        zzYJ3.zzz(zzyef2);
        Field fieldZzZ = zzZ(com.aspose.words.internal.zzZKN.format(" {0} ", strZzCH), (String) null, zzyef2, compositeNode, node, z2);
        if (z) {
            fieldZzZ.update();
        }
        return fieldZzZ;
    }

    public static FieldSeparator zzY(int i, zzYEF zzyef, CompositeNode compositeNode, Node node, boolean z) {
        FieldSeparator fieldSeparator = new FieldSeparator(compositeNode.getDocument(), (zzYEF) zzyef.zzbn(), i);
        zzZ(fieldSeparator, compositeNode, node, z);
        return fieldSeparator;
    }

    public static FieldEnd zzY(int i, boolean z, zzYEF zzyef, CompositeNode compositeNode, Node node, boolean z2) {
        FieldEnd fieldEnd = new FieldEnd(compositeNode.getDocument(), (zzYEF) zzyef.zzbn(), i, z);
        zzZ(fieldEnd, compositeNode, node, z2);
        return fieldEnd;
    }

    public static Field zzZ(String str, zzYEF zzyef, CompositeNode compositeNode, Node node, boolean z) throws Exception {
        Field fieldZzZ = zzZ(str, (String) null, zzyef, compositeNode, node, z);
        fieldZzZ.update();
        return fieldZzZ;
    }

    public static Field zzZ(String str, String str2, zzYEF zzyef, CompositeNode compositeNode, Node node, boolean z) {
        FieldEnd fieldEndZzY;
        FieldSeparator fieldSeparatorZzY;
        int iZzLE = zzZOO.zzLE(str);
        FieldStart fieldStartZzZ = zzZ(iZzLE, zzyef, compositeNode, node, z);
        Run runZzY = zzY(str, zzyef, compositeNode, (Node) fieldStartZzZ, true);
        if (zzZOO.zzCF(iZzLE) == 2) {
            fieldSeparatorZzY = zzY(iZzLE, zzyef, compositeNode, (Node) runZzY, true);
            fieldEndZzY = zzY(iZzLE, true, zzyef, compositeNode, str2 != null ? zzX(str2, zzyef, compositeNode, fieldSeparatorZzY, true) : fieldSeparatorZzY, true);
        } else {
            fieldEndZzY = zzY(iZzLE, false, zzyef, compositeNode, runZzY, true);
            fieldSeparatorZzY = null;
        }
        return zzZQB.zzX(fieldStartZzZ, fieldSeparatorZzY, fieldEndZzY);
    }

    public static FieldStart zzZ(int i, zzYEF zzyef, CompositeNode compositeNode, Node node, boolean z) {
        FieldStart fieldStart = new FieldStart(compositeNode.getDocument(), (zzYEF) zzyef.zzbn(), i);
        zzZ(fieldStart, compositeNode, node, z);
        return fieldStart;
    }

    private static void zzZ(Node node, CompositeNode compositeNode, Node node2, boolean z) {
        if (!z) {
            if (node2 == null) {
                node2 = compositeNode.getLastChild();
            }
            compositeNode.insertBefore(node, node2);
        } else if (node2 == null) {
            compositeNode.appendChild(node);
        } else {
            compositeNode.insertAfter(node, node2);
        }
    }
}
