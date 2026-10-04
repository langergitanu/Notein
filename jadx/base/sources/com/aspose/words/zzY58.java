package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzY58 {
    private zzY[] zzX2t;
    private ArrayList<String> zzX2s = new ArrayList<>();
    private ArrayList<Node> zzX2r = new ArrayList<>();

    public static class zzY {
        private int zzX2n;
        private Node zzYR6;

        public zzY(Node node, int i) {
            this.zzYR6 = node;
            this.zzX2n = i;
        }

        public final Node getNode() {
            return this.zzYR6;
        }

        public final int zzXV1() {
            return this.zzX2n;
        }
    }

    public static class zzZ extends zzYWG {
        private ArrayList<Integer> zzX2o;
        private Paragraph zzX2p;
        private ArrayList<String> zzX2q;

        private zzZ(zzYWB zzywb, ArrayList<String> arrayList) {
            super(zzywb, 9, 10);
            this.zzX2o = new ArrayList<>();
            this.zzX2q = arrayList;
            this.zzX2p = (Paragraph) zzywb.zzYA2().getNode().getAncestor(8);
        }

        public static zzY[] zzZ(zzYWB zzywb, ArrayList<String> arrayList) {
            zzZ zzz = new zzZ(zzywb, arrayList);
            ArrayList<Node> arrayListZzYAp = zzz.zzYAp();
            arrayListZzYAp.size();
            zzz.zzX2o.size();
            int size = arrayListZzYAp.size();
            zzY[] zzyArr = new zzY[size];
            for (int i = 0; i < size; i++) {
                zzyArr[i] = new zzY(arrayListZzYAp.get(i), zzz.zzX2o.get(i).intValue());
            }
            return zzyArr;
        }

        @Override // com.aspose.words.zzYWG
        public final boolean zzYAo() {
            int i = 0;
            if (this.zzX2q.indexOf(((zzZD7) next()).getName()) == -1) {
                return false;
            }
            Paragraph paragraph = (Paragraph) next().getAncestor(8);
            this.zzX2p.getParentNode();
            paragraph.getParentNode();
            while (paragraph != this.zzX2p) {
                paragraph = (Paragraph) paragraph.zztC(8);
                i++;
            }
            com.aspose.words.internal.zzZQG.zzZ(this.zzX2o, Integer.valueOf(i));
            return true;
        }
    }

    private static Paragraph zzN(Paragraph paragraph, int i) {
        for (int i2 = 0; i2 < i && paragraph.zzYB4() != null; i2++) {
            paragraph = (Paragraph) paragraph.zzYB4();
        }
        return paragraph;
    }

    public final void zzAc(String str) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzX2s, str);
    }

    public final void zzXV2() {
        for (Node node : this.zzX2r) {
            if (node.getParentNode() != null) {
                node.remove();
            }
        }
    }

    public final void zzZR(Field field) {
        zzY[] zzyArr = this.zzX2t;
        if (zzyArr == null || zzyArr.length == 0) {
            return;
        }
        field.zzW4(false);
        Paragraph paragraph = (Paragraph) field.getSeparator().getAncestor(8);
        for (int length = this.zzX2t.length - 1; length >= 0; length--) {
            zzY zzy = this.zzX2t[length];
            Paragraph paragraphZzN = zzN(paragraph, zzy.zzXV1());
            Node node = zzy.getNode();
            paragraphZzN.insertAfter(node, paragraphZzN == paragraph ? field.getSeparator() : null);
            com.aspose.words.internal.zzZQG.zzZ(this.zzX2r, node);
        }
    }

    public final void zzZS(Field field) {
        this.zzX2t = null;
        if (field.getType() != 13) {
            return;
        }
        this.zzX2t = zzZ.zzZ(new zzYWB(field.getSeparator(), field.getEnd()), this.zzX2s);
    }
}
