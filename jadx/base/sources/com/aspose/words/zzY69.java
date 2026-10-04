package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY69 {
    private static com.aspose.words.internal.zzZNR zzX4v = new com.aspose.words.internal.zzZNR("\\{\\{(([^}]|}[^}])*}?)}}");
    private static com.aspose.words.internal.zzZNR zzYAd = new com.aspose.words.internal.zzZNR("(\"[^\"]*\"|[^\"\\\\]*)\\s*(\\\\.*)?");
    private ArrayList<zzY> zzX4w = new ArrayList<>();
    private Document zzZEY;

    public static class zzX implements IReplacingCallback {
        private ArrayList<zzY> zzX4w;

        public zzX(ArrayList<zzY> arrayList) {
            this.zzX4w = arrayList;
        }

        @Override // com.aspose.words.IReplacingCallback
        public final int replacing(ReplacingArgs replacingArgs) {
            com.aspose.words.internal.zzZNT zzzntZzUX = zzY69.zzYAd.zzUX(com.aspose.words.internal.zzZKN.zzTX(replacingArgs.zzYlS().zzhJ().zzQx(1).getValue()));
            this.zzX4w.add(new zzY(replacingArgs.zzYlS().getValue(), (Run) replacingArgs.getMatchNode(), replacingArgs.getMatchOffset(), replacingArgs.zzYlS().getLength(), com.aspose.words.internal.zzZKN.zzS(com.aspose.words.internal.zzZKN.zzTX(zzzntZzUX.zzhJ().zzQx(1).getValue()), '\"'), OooO0O0.OooO00o(zzzntZzUX, 2)));
            return 1;
        }
    }

    public static class zzY {
        private int zzX4o;
        private String zzX4p;
        private String zzX4q;
        private int zzX4r;
        private int zzX4s;
        private String zzXCk;
        private Run zzYiB;

        public zzY(String str, Run run, int i, int i2, String str2, String str3) {
            this.zzXCk = str;
            this.zzYiB = run;
            this.zzX4o = run.getText().length();
            this.zzX4s = i;
            this.zzX4r = i2;
            this.zzX4q = str2;
            this.zzX4p = str3;
        }

        public final int getOffset() {
            return this.zzX4s - (this.zzX4o - this.zzYiB.getText().length());
        }

        public final String getTag() {
            return this.zzXCk;
        }

        public final String zzXWE() {
            return this.zzX4p;
        }

        public final String zzXWF() {
            return this.zzX4q;
        }

        public final int zzXWG() {
            return this.zzX4r;
        }

        public final int zzXWH() {
            return this.zzX4s;
        }

        public final Run zzYVe() {
            return this.zzYiB;
        }
    }

    public static class zzZ {
        private String zzX4t;
        private String zzX4u;

        public zzZ(String str, String str2) {
            this.zzX4u = str;
            this.zzX4t = str2;
        }

        public final String getFieldCode() {
            return this.zzX4u;
        }

        public final String zzXWI() {
            return this.zzX4t;
        }
    }

    private zzY69(Document document) {
        this.zzZEY = document;
    }

    private Iterable<MustacheTag> zzXWK() {
        ArrayList arrayList = new ArrayList();
        for (zzY zzy : this.zzX4w) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<MustacheTag>) arrayList, new MustacheTag(zzy.zzYVe(), zzy.getOffset(), zzy.getTag(), FieldMergeField.zzZ(zzZ(zzy).getFieldCode(), this.zzZEY.getMailMerge())));
        }
        return arrayList;
    }

    private Iterable<zzZPZ> zzXWL() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.zzX4w.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZPZ>) arrayList, FieldMergeField.zzZ(zzZ((zzY) it.next()).getFieldCode(), this.zzZEY.getMailMerge()));
        }
        return arrayList;
    }

    private ArrayList<zzY6A> zzXWM() {
        DocumentBuilder documentBuilder = new DocumentBuilder(this.zzZEY);
        ArrayList<zzY6A> arrayList = new ArrayList<>();
        for (zzY zzy : this.zzX4w) {
            documentBuilder.moveTo(zzY(zzy));
            documentBuilder.zzZ(zzy.zzYVe().zzZYh(), true);
            zzZ zzZ2 = zzZ(zzy);
            com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzY6A(documentBuilder.insertField(zzZ2.getFieldCode(), zzZ2.zzXWI()).getStart(), zzy.getTag()));
        }
        return arrayList;
    }

    private void zzXWN() throws Exception {
        this.zzZEY.getRange().zzZ(zzX4v, "", new FindReplaceOptions(new zzX(this.zzX4w)));
    }

    private Iterable<MustacheTag> zzXWO() throws Exception {
        zzXWN();
        return zzXWK();
    }

    private Iterable<zzZPZ> zzXWP() throws Exception {
        zzXWN();
        return zzXWL();
    }

    private ArrayList<zzY6A> zzXWQ() throws Exception {
        zzXWN();
        return zzXWM();
    }

    private Node zzY(zzY zzy) {
        Run runZzYVe = zzy.zzYVe();
        int iZzXWG = zzy.zzXWG();
        int offset = zzy.getOffset();
        int i = runZzYVe.zz0R() - offset > iZzXWG ? offset : -1;
        Run run = runZzYVe;
        while (iZzXWG > 0) {
            int iMin = Math.min(run.zz0R() - offset, iZzXWG);
            run.setText(com.aspose.words.internal.zzZKN.zzT(run.getText(), offset, iMin));
            iZzXWG -= iMin;
            Node nodeNextPreOrder = run;
            do {
                nodeNextPreOrder = nodeNextPreOrder.nextPreOrder(this.zzZEY);
                if (nodeNextPreOrder != null && nodeNextPreOrder.getNodeType() == 8) {
                    iZzXWG--;
                }
                if (nodeNextPreOrder == null) {
                    break;
                }
            } while (nodeNextPreOrder.getNodeType() != 21);
            if (run != runZzYVe && run.getText().length() == 0) {
                run.remove();
            }
            run = (Run) nodeNextPreOrder;
            offset = 0;
        }
        if (i == -1) {
            return zzy.zzXWH() == 0 ? runZzYVe : runZzYVe.getNextSibling() != null ? runZzYVe.getNextSibling() : runZzYVe.getParentParagraph();
        }
        runZzYVe.zzng(i);
        return runZzYVe;
    }

    private static zzZ zzZ(zzY zzy) {
        String strZzTX = com.aspose.words.internal.zzZKN.zzTX(zzy.zzXWF());
        String strZzTX2 = com.aspose.words.internal.zzZKN.zzTX(zzy.zzXWE());
        if (com.aspose.words.internal.zzZYD.zzXk(strZzTX2)) {
            strZzTX2 = com.aspose.words.internal.zzZKN.format(" {0}", strZzTX2);
        }
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        if (com.aspose.words.internal.zzZKN.zzS(strZzTX, "#foreach", i)) {
            strZzTX = com.aspose.words.internal.zzZKN.format("TableStart:{0}", com.aspose.words.internal.zzZKN.zzTX(strZzTX.substring(8)));
        } else if (com.aspose.words.internal.zzZKN.zzS(strZzTX, "/foreach", i)) {
            strZzTX = com.aspose.words.internal.zzZKN.format("TableEnd:{0}", com.aspose.words.internal.zzZKN.zzTX(strZzTX.substring(8)));
        }
        return new zzZ(com.aspose.words.internal.zzZKN.format("MERGEFIELD \"{0}\"{1}", strZzTX, strZzTX2), com.aspose.words.internal.zzZKN.format("«{0}»", strZzTX));
    }

    public static Iterable<MustacheTag> zzZT(Document document) throws Exception {
        return new zzY69(document).zzXWO();
    }

    public static Iterable<zzZPZ> zzZU(Document document) throws Exception {
        return new zzY69(document).zzXWP();
    }

    public static ArrayList<zzY6A> zzZV(Document document) throws Exception {
        return new zzY69(document).zzXWQ();
    }
}
