package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzYJN implements zzZA5 {
    private HashMap<Node, zzZ> zzXCl;
    private Document zzZEY;

    public static class zzZ {
        private String zzXCk;
        private ArrayList<FieldStart> zzYAj = new ArrayList<>();

        public zzZ(String str) {
            this.zzXCk = str;
        }

        public final String getTag() {
            return this.zzXCk;
        }

        public final ArrayList<FieldStart> zzZat() {
            return this.zzYAj;
        }
    }

    public zzYJN(Document document) {
        this.zzZEY = document;
    }

    @Override // com.aspose.words.zzZA5
    public final void zzW(Node node, Node node2) {
        zzZ zzz;
        if (node.getNodeType() == 22 && (zzz = (zzZ) com.aspose.words.internal.zzQW.zzZ(this.zzXCl, node)) != null) {
            zzz.zzZat().add((FieldStart) node2);
        }
    }

    public final void zzYlT() throws Exception {
        DocumentBuilder documentBuilder = new DocumentBuilder(this.zzZEY);
        for (zzZ zzz : this.zzXCl.values()) {
            for (FieldStart fieldStart : zzz.zzZat()) {
                if (!fieldStart.isRemoved()) {
                    Field field = fieldStart.getField();
                    documentBuilder.moveToField(field, false);
                    documentBuilder.write(zzz.getTag());
                    field.remove();
                }
            }
        }
        this.zzXCl = null;
    }

    public final void zzZx(ArrayList<zzY6A> arrayList) {
        this.zzXCl = new HashMap<>(arrayList.size());
        for (zzY6A zzy6a : arrayList) {
            zzZ zzz = new zzZ(zzy6a.getTag());
            zzz.zzZat().add(zzy6a.getStart());
            this.zzXCl.put(zzy6a.getStart(), zzz);
        }
    }
}
