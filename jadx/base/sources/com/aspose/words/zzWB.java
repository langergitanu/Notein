package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzWB extends zzZPS {
    private Section zzZz6;
    private Field zzZz7;

    private zzWB(Field field, Section section) {
        this.zzZz7 = field;
        this.zzZz6 = section;
    }

    private Paragraph zz4s() throws Exception {
        Paragraph paragraphZzZH = null;
        if (this.zzZz7.getType() == 37) {
            return null;
        }
        if (this.zzZz7.getStart().zzYBb().getCompatibilityOptions().getMswVersion() < 15) {
            return zzG(this.zzZz7);
        }
        Body body = this.zzZz6.getBody();
        if (body != null && body.hasChildNodes()) {
            paragraphZzZH = zzZH(body.getChild(8, 0, true));
        }
        return (paragraphZzZH != null ? paragraphZzZH : zzZ(this.zzZz6, false, false)) != null ? paragraphZzZH != null ? paragraphZzZH : zzZ(this.zzZz6, false, false) : zzZ(this.zzZz6, true, true);
    }

    private Node zz4t() throws Exception {
        int type = this.zzZz7.getType();
        if (type == 33) {
            return this.zzZz7.getStart();
        }
        if (type != 37) {
            return null;
        }
        return ((FieldPageRef) this.zzZz7).zzZcH();
    }

    private Paragraph zz4u() throws Exception {
        Node nodeZz4t = zz4t();
        if (nodeZz4t == null) {
            return null;
        }
        return nodeZz4t.getAncestor(4) != null ? zz4s() : zzK(nodeZz4t);
    }

    private Paragraph zzK(Node node) throws Exception {
        return zzZ(node, false, true) != null ? zzZ(node, false, true) : zzZ(node, true, false);
    }

    private static boolean zzU(Paragraph paragraph) {
        String numberFormat = paragraph.getListLabel().zzYOJ().getNumberFormat();
        for (int i = 0; i < numberFormat.length(); i++) {
            if (ListLevel.zzx7(numberFormat.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean zzV(Paragraph paragraph) {
        CompositeNode ancestor = paragraph.getAncestor(1);
        if (ancestor == null || ancestor != this.zzZz6.getAncestor(1) || paragraph.zztB(3) == null) {
            return false;
        }
        int iZzZ7j = paragraph.zzZYj().zzZ7j();
        if (zzY8O.zzkF(iZzZ7j) && this.zzZz6.zzYvR().zzYcs() == iZzZ7j && paragraph.zzYoT() && paragraph.getListLabel().zzYOJ().zzYOc() == iZzZ7j && paragraph.getListLabel().zzYOC() != null) {
            return zzU(paragraph);
        }
        return false;
    }

    public static Paragraph zzZ(Field field, Section section) throws Exception {
        return new zzWB(field, section).zz4u();
    }

    @Override // com.aspose.words.zzZPS
    public final boolean zz4r() {
        return false;
    }

    @Override // com.aspose.words.zzZPS
    public final Paragraph zzW(Paragraph paragraph) {
        if (paragraph != null && zzV(paragraph)) {
            return paragraph;
        }
        return null;
    }
}
