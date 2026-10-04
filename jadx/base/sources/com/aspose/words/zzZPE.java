package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZPE extends zzZQF {
    private com.aspose.words.internal.zzZYG<zzX> zzYBW;
    private HashMap<FieldStart, Integer> zzYBX;
    private com.aspose.words.internal.zzZYI zzYBY;
    private ArrayList<FieldSeq> zzYBZ;
    private zzYD zzZCJ;

    public static class zzX {
        private int zzYBQ;
        private int zzYBR;

        private zzX() {
        }

        private static int zzCX(int i) {
            switch (i) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 4;
                case 4:
                    return 8;
                case 5:
                    return 16;
                case 6:
                    return 32;
                case 7:
                    return 64;
                case 8:
                    return 128;
                case 9:
                    return 256;
                default:
                    return 0;
            }
        }

        private int zzV(FieldSeq fieldSeq) {
            int iZzCX;
            if (fieldSeq.zzZco()) {
                return Math.abs(fieldSeq.zzZcn().zzxK());
            }
            if (this.zzYBQ == 0 || !fieldSeq.zzZcm() || (iZzCX = zzCX(fieldSeq.zzZcl().zzxK())) == 0 || ((iZzCX | (iZzCX - 1)) & this.zzYBQ) == 0) {
                return fieldSeq.zzZcq() ? this.zzYBR : this.zzYBR + 1;
            }
            return 1;
        }

        public final int zzCL() {
            return this.zzYBR;
        }

        public final void zzW(FieldSeq fieldSeq) {
            this.zzYBR = zzV(fieldSeq);
            this.zzYBQ = 0;
        }

        public final void zzk(Paragraph paragraph) {
            this.zzYBQ = zzCX(paragraph.zzZYj().zzZ7j()) | this.zzYBQ;
        }

        public /* synthetic */ zzX(byte b) {
            this();
        }
    }

    public static class zzY implements zzZ9R {
        private String zzYBT;
        private FieldSeq zzYBU;

        public static class zzZ extends zzZQF {
            private zzYN8 zzYBS;
            private String zzYBT;
            private FieldSeq zzYBU;

            public zzZ(String str, zzYN8 zzyn8) {
                super(12);
                this.zzYBT = str;
                this.zzYBS = zzyn8;
            }

            public final FieldSeq zzO(zzYWB zzywb) throws Exception {
                zzV(zzywb);
                return this.zzYBU;
            }

            @Override // com.aspose.words.zzZQF
            public final void zzZe8() {
                zzYAH zzyah;
                FieldSeq fieldSeq = (FieldSeq) zzZe7();
                if (com.aspose.words.internal.zzZKN.equals(fieldSeq.getSequenceIdentifier(), this.zzYBT) && (zzyah = (zzYAH) this.zzYBS.zzab().zzZqO().get(fieldSeq.getStart())) != null && zzyah.zzZ8m() == this.zzYBS) {
                    this.zzYBU = fieldSeq;
                }
            }
        }

        public zzY(String str) {
            this.zzYBT = str;
        }

        @Override // com.aspose.words.zzZ9R
        public final boolean zzZ(zzYWB zzywb, zzYN8 zzyn8) throws Exception {
            FieldSeq fieldSeqZzO = new zzZ(this.zzYBT, zzyn8).zzO(zzywb);
            this.zzYBU = fieldSeqZzO;
            return fieldSeqZzO != null;
        }

        public final FieldSeq zzZci() {
            return this.zzYBU;
        }
    }

    public static class zzZ extends zzZQF {
        private com.aspose.words.internal.zzZYI zzYBV;
        private zzYD zzZCJ;

        private zzZ(zzYD zzyd) {
            super(12);
            this.zzYBV = new com.aspose.words.internal.zzZYI(false);
            this.zzZCJ = zzyd;
        }

        public static com.aspose.words.internal.zzZYI zzZ(Document document, zzYD zzyd) {
            zzZ zzz = new zzZ(zzyd);
            zzz.zzZQ(document);
            return zzz.zzYBV;
        }

        @Override // com.aspose.words.zzZQF
        public final void zzZe8() throws Exception {
            FieldSeq fieldSeq = (FieldSeq) zzZe7();
            if (com.aspose.words.internal.zzZYD.zzXk(fieldSeq.getBookmarkName()) && !fieldSeq.zzZ(this.zzZCJ)) {
                this.zzYBV.set(fieldSeq.getBookmarkName(), 0);
            }
        }
    }

    public zzZPE(Document document, zzYD zzyd) {
        super(12);
        this.zzYBZ = new ArrayList<>();
        this.zzYBX = new HashMap<>();
        this.zzZCJ = zzyd;
        this.zzYBY = zzZ.zzZ(document, zzyd);
        zzZx(document);
    }

    private int zzA(int i, String str) {
        while (i >= 0) {
            FieldSeq fieldSeq = this.zzYBZ.get(i);
            if (com.aspose.words.internal.zzZYD.zzi(fieldSeq.getSequenceIdentifier(), str)) {
                return zzP(fieldSeq.getStart());
            }
            i--;
        }
        return 0;
    }

    private static zzZ7P zzCY(int i) {
        return new zzZ7P(i);
    }

    private int zzP(FieldStart fieldStart) {
        return ((Integer) com.aspose.words.internal.zzQW.zzZ(this.zzYBX, fieldStart, -1)).intValue();
    }

    private int zzR(Node node, int i) {
        for (int iMin = Math.min(i, zzZcj()); iMin >= 0; iMin--) {
            if (Node.zzD(this.zzYBZ.get(iMin).getEnd(), node)) {
                return iMin;
            }
        }
        return -1;
    }

    private zzZ7P zzX(FieldSeq fieldSeq) throws Exception {
        zzY zzy = new zzY(fieldSeq.getSequenceIdentifier());
        fieldSeq.zzZgo().zzZay().zzZ(fieldSeq.getStart(), zzy);
        return zzy.zzZci() == null ? new zzZ7P(0) : zzY(zzy.zzZci());
    }

    private zzZ7P zzY(FieldSeq fieldSeq) {
        int iZzP;
        if (com.aspose.words.internal.zzZYD.zzXk(fieldSeq.getBookmarkName())) {
            com.aspose.words.internal.zz7I zz7iZzZ9 = zzZ9(fieldSeq.getBookmarkName(), fieldSeq.getSequenceIdentifier());
            if (!zz7iZzZ9.hasValue()) {
                return null;
            }
            iZzP = zz7iZzZ9.getValue();
        } else {
            iZzP = zzP(fieldSeq.getStart());
        }
        return zzCY(iZzP);
    }

    private int zzZcj() {
        return this.zzYBZ.size() - 1;
    }

    private void zzZx(Node node) {
        this.zzYBW = new com.aspose.words.internal.zzZYG<>(false);
        zzZQ(node);
        this.zzYBW = null;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBookmarkEnd(BookmarkEnd bookmarkEnd) {
        if (!this.zzYBY.containsKey(bookmarkEnd.getName())) {
            return 0;
        }
        this.zzYBY.set(bookmarkEnd.getName(), zzZcj());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphStart(Paragraph paragraph) {
        Iterator<zzX> it = this.zzYBW.zzCJ().iterator();
        while (it.hasNext()) {
            it.next().zzk(paragraph);
        }
        return 0;
    }

    public final void zzLM(String str) throws Exception {
        if (com.aspose.words.internal.zzZYI.zzWm(this.zzYBY.get(str))) {
            this.zzYBY.set(str, zzR(this.zzZCJ.get(str).getBookmarkEnd(), zzZcj()));
        }
    }

    public final zzZ7P zzZ(FieldSeq fieldSeq) throws Exception {
        if (fieldSeq.zzZ(this.zzZCJ)) {
            return null;
        }
        return fieldSeq.zzZgt() ? zzX(fieldSeq) : zzY(fieldSeq);
    }

    public final com.aspose.words.internal.zz7I zzZ9(String str, String str2) {
        int i = this.zzYBY.get(str);
        return com.aspose.words.internal.zzZYI.zzWm(i) ? com.aspose.words.internal.zz7I.zznT : new com.aspose.words.internal.zz7I(zzA(i, str2));
    }

    @Override // com.aspose.words.zzZQF
    public final void zzZe8() throws Exception {
        FieldSeq fieldSeq = (FieldSeq) zzZe7();
        if (com.aspose.words.internal.zzZYD.zzXk(fieldSeq.getBookmarkName()) || fieldSeq.zzZ(this.zzZCJ)) {
            return;
        }
        zzX zzx = this.zzYBW.get(fieldSeq.getSequenceIdentifier());
        if (zzx == null) {
            zzx = new zzX((byte) 0);
            this.zzYBW.set(fieldSeq.getSequenceIdentifier(), zzx);
        }
        zzx.zzW(fieldSeq);
        this.zzYBX.put(fieldSeq.getStart(), Integer.valueOf(zzx.zzCL()));
        ArrayList<FieldSeq> arrayList = this.zzYBZ;
        if (arrayList != null) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, fieldSeq);
        }
    }
}
