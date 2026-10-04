package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class RevisionGroupCollection implements Iterable<RevisionGroup> {
    private static int[] zzXBo = {810, 815, 820, 825, 830, 835, 840};
    private static int[] zzYw4 = {30, 40, 810, 815, 820, 825, 830, 835, 840, 1580};
    private HashMap<zzYJC, RevisionGroup> zzXBn = new HashMap<>();
    private ArrayList<RevisionGroup> zzZm = new ArrayList<>();

    public RevisionGroupCollection(DocumentBase documentBase) {
        zzW(documentBase, 1);
        zzW(documentBase, 0);
        zzw(documentBase);
        zzV(documentBase, 21);
        zzV(documentBase, 8);
        zzV(documentBase, 2);
        zzv(documentBase);
    }

    private static Node zzB(Node node) {
        while (node.isComposite()) {
            CompositeNode compositeNode = (CompositeNode) node;
            if (!compositeNode.hasChildNodes()) {
                break;
            }
            node = compositeNode.getFirstChild();
        }
        return node;
    }

    private static WordAttrCollection zzE(Node node, int i) {
        if (i == 2) {
            if (node.getNodeType() == 2) {
                return ((Section) node).zzYvR();
            }
            return null;
        }
        if (i == 8) {
            if (node.getNodeType() == 8) {
                return ((Paragraph) node).zzZYj();
            }
            return null;
        }
        if (i != 21) {
            throw new IllegalStateException();
        }
        zzZAM zzzam = (zzZAM) com.aspose.words.internal.zzZKW.zzZ(node, zzZAM.class);
        if (zzzam != null) {
            return zzzam.getRunPr_IInline();
        }
        if (node.getNodeType() == 8) {
            return ((Paragraph) node).zzYp5();
        }
        return null;
    }

    private void zzV(DocumentBase documentBase, int i) {
        Node nodeZzB = zzB(documentBase);
        while (nodeZzB != null) {
            WordAttrCollection wordAttrCollectionZzE = zzE(nodeZzB, i);
            nodeZzB = (wordAttrCollectionZzE == null || !wordAttrCollectionZzE.zz6D()) ? zzX1(nodeZzB) : zzZ(nodeZzB, wordAttrCollectionZzE.zzYsN(), i);
        }
    }

    private void zzW(DocumentBase documentBase, int i) {
        Node nodeZzB = zzB(documentBase);
        while (nodeZzB != null) {
            zzZ8X zzz8x = (zzZ8X) com.aspose.words.internal.zzZKW.zzZ(nodeZzB, zzZ8X.class);
            if (zzz8x != null) {
                zzZV8 zzzv8ZzZ = zzZ(zzz8x, i);
                nodeZzB = zzzv8ZzZ != null ? zzY(nodeZzB, zzzv8ZzZ) : zzX1(nodeZzB);
            } else {
                nodeZzB = zzX1(nodeZzB);
            }
        }
    }

    private static boolean zzX0(Node node) {
        int nodeType = node.getNodeType();
        return nodeType == 9 || nodeType == 10 || nodeType == 19 || nodeType == 33 || nodeType == 34;
    }

    private static Node zzX1(Node node) {
        Node nextSibling = node.getNextSibling();
        while (nextSibling != null && zzX0(nextSibling)) {
            nextSibling = nextSibling.getNextSibling();
        }
        return nextSibling == null ? node.getParentNode() : nextSibling.isComposite() ? zzB(nextSibling) : nextSibling;
    }

    private static zzYMX zzYt(Paragraph paragraph) {
        zzYMX zzymxZzqw = paragraph.zzqw(0);
        zzymxZzqw.zzW(paragraph.zzqw(128));
        zzYMX zzymxZzqw2 = paragraph.zzqw(18);
        zzymxZzqw2.zzW(paragraph.zzqw(146));
        zzymxZzqw2.zzW(zzymxZzqw);
        if (zzymxZzqw2.zzYpL()) {
            if (zzymxZzqw2.zzYM7() == 0) {
                zzymxZzqw2.remove(1160);
            }
            if (zzymxZzqw2.zzYMa() == 0) {
                zzymxZzqw2.remove(EditingLanguage.CENTRAL_KURDISH_IRAQ);
            }
        }
        return zzymxZzqw2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038 A[LOOP:0: B:3:0x000a->B:14:0x0038, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Node zzZ(Node node, zzZMK zzzmk, int i) {
        Node nodeZzX1;
        ArrayList arrayList = new ArrayList();
        ArrayList<zzYJC> arrayList2 = new ArrayList<>();
        while (true) {
            if (node == null) {
                break;
            }
            WordAttrCollection wordAttrCollectionZzE = zzE(node, i);
            if (wordAttrCollectionZzE == null) {
                nodeZzX1 = zzX1(node);
                if (!zza(node, nodeZzX1)) {
                    node = nodeZzX1;
                    break;
                }
                node = nodeZzX1;
            } else {
                if (!wordAttrCollectionZzE.zz6D() || !zzZ(zzzmk, wordAttrCollectionZzE.zzYsN())) {
                    break;
                }
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<Node>) arrayList, node);
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZMK>) arrayList2, wordAttrCollectionZzE.zzYsN());
                nodeZzX1 = zzX1(node);
                if (!zza(node, nodeZzX1)) {
                }
            }
        }
        if (i == 8 && zzzmk.zzZ6C().contains(EditingLanguage.KASHMIRI_ARABIC)) {
            zzzmk = new zzZMK(zzYt((Paragraph) arrayList.get(0)), zzzmk.getAuthor(), zzzmk.zzZx());
        }
        RevisionGroup revisionGroup = new RevisionGroup((ArrayList<Node>) arrayList, zzzmk);
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, revisionGroup);
        zzZ(arrayList2, revisionGroup);
        return node;
    }

    private static boolean zza(Node node, Node node2) {
        CompositeNode ancestor;
        if (node != null && node2 != null) {
            if (node.getNodeType() != 6) {
                node = node.getAncestor(6);
            }
            if (node != null && node2.getNodeType() != 6 && (ancestor = node2.getAncestor(6)) != null && !com.aspose.words.internal.zzZKO.zzA(node, ancestor)) {
                return true;
            }
        }
        return false;
    }

    private static ArrayList<zzYJC> zzb(Table table) {
        ArrayList<zzYJC> arrayList = new ArrayList<>();
        for (Row row : table.getRows()) {
            if (row.zzZYf().zzYsN() != null && row.zzZYf().zzYsN().zzZ6C().getCount() > 0) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZMK>) arrayList, row.zzZYf().zzYsN());
            }
            for (Cell cell : row.getCells()) {
                if (cell.zz6G().zzYsN() != null) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZMK>) arrayList, cell.zz6G().zzYsN());
                }
            }
        }
        return arrayList;
    }

    private void zzv(DocumentBase documentBase) {
        for (Table table : documentBase.getChildNodes(5, true)) {
            ArrayList<zzYJC> arrayListZzb = zzb(table);
            if (arrayListZzb.size() > 0) {
                ArrayList arrayList = new ArrayList();
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<Table>) arrayList, table);
                RevisionGroup revisionGroup = new RevisionGroup((ArrayList<Node>) arrayList, (zzZMK) arrayListZzb.get(0));
                com.aspose.words.internal.zzZQG.zzZ(this.zzZm, revisionGroup);
                zzZ(arrayListZzb, revisionGroup);
            }
        }
    }

    private void zzw(DocumentBase documentBase) {
        Node nodeZzB = zzB(documentBase);
        while (nodeZzB != null) {
            nodeZzB = (nodeZzB.getNodeType() == 13 || nodeZzB.getNodeType() == 15) ? zzW((zzYX6) nodeZzB) : zzX1(nodeZzB);
        }
    }

    public final RevisionGroup get(int i) {
        return this.zzZm.get(i);
    }

    public final int getCount() {
        return this.zzZm.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<RevisionGroup> iterator() {
        return this.zzZm.iterator();
    }

    public final RevisionGroup zzY(zzYJC zzyjc) {
        if (this.zzXBn.containsKey(zzyjc)) {
            return this.zzXBn.get(zzyjc);
        }
        return null;
    }

    private Node zzY(Node node, zzZV8 zzzv8) {
        ArrayList arrayList = new ArrayList();
        ArrayList<zzYJC> arrayList2 = new ArrayList<>();
        boolean z = false;
        boolean z2 = false;
        while (node != null) {
            zzZ8X zzz8x = (zzZ8X) com.aspose.words.internal.zzZKW.zzZ(node, zzZ8X.class);
            if (zzz8x != null) {
                zzZV8 zzzv8ZzZ = zzZ(zzz8x, zzzv8.getType());
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZV8>) arrayList2, zzzv8ZzZ);
                if ((zzzv8ZzZ == null || !zzY(zzzv8ZzZ, zzzv8)) && !z) {
                    break;
                }
                if (node.getNodeType() == 6) {
                    z2 = true;
                    z = false;
                } else if (z2) {
                    z = node instanceof zzZAM;
                    z2 = false;
                }
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<Node>) arrayList, node);
            }
            node = zzX1(node);
        }
        RevisionGroup revisionGroup = new RevisionGroup((ArrayList<Node>) arrayList, zzzv8);
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, revisionGroup);
        zzZ(arrayList2, revisionGroup);
        return node;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Node zzW(zzYX6 zzyx6) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        int i = zzyx6.getNodeType() == 13 ? 1 : 0;
        int i2 = i != 0 ? 14 : 16;
        Node nodeZzX1 = zzX1(zzyx6);
        while (nodeZzX1 != null && (nodeZzX1.getNodeType() != i2 || ((zzYX9) nodeZzX1).getId() != zzyx6.getId())) {
            if (nodeZzX1 instanceof zzZA6) {
                zzZA6 zzza6 = (zzZA6) com.aspose.words.internal.zzZKW.zzZ(nodeZzX1, zzZA6.class);
                z = (zzza6.getMoveFromRevision() == null && zzza6.getMoveToRevision() == null && !(nodeZzX1 instanceof Paragraph)) ? false : true;
            }
            if (!z && (nodeZzX1 instanceof zzZ8X)) {
                zzZ8X zzz8x = (zzZ8X) com.aspose.words.internal.zzZKW.zzZ(nodeZzX1, zzZ8X.class);
                z = (zzz8x.getDeleteRevision() == null && zzz8x.getInsertRevision() == null) ? false : true;
            }
            if (z) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<Node>) arrayList, nodeZzX1);
            }
            nodeZzX1 = zzX1(nodeZzX1);
        }
        if (nodeZzX1 != null && arrayList.size() > 0) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzZm, new RevisionGroup(arrayList, new zzYX5(i ^ 1, zzyx6.getAuthor(), zzyx6.zzkT()), zzyx6.getName()));
            return zzX1(nodeZzX1);
        }
        return zzX1(zzyx6);
    }

    private static zzZV8 zzZ(zzZ8X zzz8x, int i) {
        zzZV8 insertRevision;
        if (i == 1) {
            insertRevision = zzz8x.getDeleteRevision();
        } else {
            insertRevision = zzz8x.getInsertRevision();
        }
        return (insertRevision == null && (zzz8x instanceof Cell)) ? zzZ(((Cell) zzz8x).getParentRow(), i) : insertRevision;
    }

    private static boolean zzY(zzZV8 zzzv8, zzZV8 zzzv82) {
        return zzzv8.getType() == zzzv82.getType() && com.aspose.words.internal.zzZYD.zzi(zzzv8.getAuthor(), zzzv82.getAuthor());
    }

    private static boolean zzZ(zzZMK zzzmk, zzZMK zzzmk2) {
        if (!com.aspose.words.internal.zzZYD.zzi(zzzmk.getAuthor(), zzzmk2.getAuthor()) || !zzzmk.zzZ6C().zzW(zzzmk2.zzZ6C(), zzYw4)) {
            return false;
        }
        for (int i : zzXBo) {
            if (zzzmk.zzZ6C().contains(i) != zzzmk2.zzZ6C().contains(i)) {
                return false;
            }
        }
        return true;
    }

    private void zzZ(ArrayList<zzYJC> arrayList, RevisionGroup revisionGroup) {
        for (zzYJC zzyjc : arrayList) {
            if (zzyjc != null) {
                this.zzXBn.put(zzyjc, revisionGroup);
            }
        }
    }
}
