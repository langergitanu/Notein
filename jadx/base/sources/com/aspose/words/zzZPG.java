package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZPG {
    private Field zzZz7;
    private ArrayList<zzZ> zzYC3 = new ArrayList<>();
    private boolean zzYC2 = true;

    public static class zzZ {
        private Node zzYR6;
        private String zzZCG;
        private int zzp8 = 0;

        /* JADX WARN: Multi-variable type inference failed */
        public zzZ(Node node) {
            this.zzYR6 = node;
            this.zzZCG = ((zzZD7) node).getName();
        }

        public final String getBookmarkName() {
            return this.zzZCG;
        }

        public final Node getNode() {
            return this.zzYR6;
        }

        public final int getPosition() {
            return this.zzp8;
        }

        public final void setPosition(int i) {
            this.zzp8 = i;
        }
    }

    public zzZPG(Field field) {
        this.zzZz7 = field;
        zzZcv();
    }

    private void zzCZ(int i) {
        for (zzZ zzz : this.zzYC3) {
            if (zzz.getPosition() == 0) {
                zzz.setPosition(i);
            }
        }
    }

    private static zzZ zzY(String str, Iterable<zzZ> iterable) {
        for (zzZ zzz : iterable) {
            if (com.aspose.words.internal.zzZKN.equals(zzz.getBookmarkName(), str)) {
                return zzz;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void zzZA(Node node) {
        if (zzYVU.zzXT(node) && !"_GoBack".equals(((zzZD7) node).getName())) {
            this.zzYC3.add(new zzZ(node));
        }
    }

    private com.aspose.words.internal.zzIM<String> zzZct() {
        ArrayList<Node> arrayListZzY = zzYWG.zzY(this.zzZz7.zzZgF(), 9, 10);
        com.aspose.words.internal.zzIM zzim = new com.aspose.words.internal.zzIM();
        com.aspose.words.internal.zzIM<String> zzim2 = new com.aspose.words.internal.zzIM<>();
        Iterator<Node> it = arrayListZzY.iterator();
        while (it.hasNext()) {
            String name = ((zzZD7) ((Node) it.next())).getName();
            String strZzU2 = com.aspose.words.internal.zzZKN.zzU2(name);
            if (zzim.contains(strZzU2)) {
                zzim.remove(strZzU2);
                zzim2.add(name);
            } else {
                zzim.add(strZzU2);
            }
        }
        return zzim2;
    }

    private void zzZcu() {
        ArrayList arrayList = new ArrayList();
        for (int size = this.zzYC3.size() - 1; size >= 0; size--) {
            zzZ zzz = this.zzYC3.get(size);
            if (zzz.getPosition() == 2) {
                zzZ zzzZzY = zzY(zzz.getBookmarkName(), arrayList);
                if (zzzZzY == null) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZ>) arrayList, zzz);
                } else {
                    arrayList.remove(zzzZzY);
                    this.zzYC3.remove(zzzZzY);
                    this.zzYC3.remove(zzz);
                }
            }
        }
    }

    private void zzZcv() {
        if (this.zzZz7.hasSeparator()) {
            zzYWI zzywi = new zzYWI(this.zzZz7.zzZgF());
            while (zzywi.zzF(true, true)) {
                zzZz(zzywi.next());
                zzZy(zzywi.next());
                zzZA(zzywi.next());
            }
            zzCZ(3);
            zzZcu();
        }
    }

    private void zzZy(Node node) {
        if (this.zzYC2 || zzYVU.zztq(node.getNodeType())) {
            return;
        }
        zzCZ(2);
    }

    private void zzZz(Node node) {
        if (this.zzYC2 && !zzYVU.zztq(node.getNodeType())) {
            this.zzYC2 = false;
            zzCZ(1);
        }
    }

    public final void restore() {
        com.aspose.words.internal.zzIM<String> zzimZzZct = zzZct();
        for (int i = 0; i < this.zzYC3.size(); i++) {
            zzZ zzz = this.zzYC3.get(i);
            if (!zzimZzZct.contains(zzz.getBookmarkName()) && (zzz.getPosition() == 2 || zzz.getPosition() == 3)) {
                this.zzZz7.getEnd().zzYC(zzz.getNode());
            }
        }
        for (int size = this.zzYC3.size() - 1; size >= 0; size--) {
            zzZ zzz2 = this.zzYC3.get(size);
            if (!zzimZzZct.contains(zzz2.getBookmarkName()) && zzz2.getPosition() == 1) {
                this.zzZz7.getSeparator().zzYD(zzz2.getNode());
            }
        }
    }
}
