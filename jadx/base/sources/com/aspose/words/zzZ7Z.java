package com.aspose.words;

import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ7Z {
    private ArrayList<zzZ7X> zzYij;
    private com.aspose.words.internal.zzZQH<String, zzZ7Z> zzYik;
    private boolean zzYil;
    private zzYWB zzYim;
    private zzZQO zzYin;

    public static class zzX implements Comparator<String> {
        static zzX zzYi3 = new zzX();

        private zzX() {
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(String str, String str2) {
            return compare2(str, str2);
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        private static int compare2(String str, String str2) {
            if (com.aspose.words.internal.zzZKO.zzA(str, str2)) {
                return 0;
            }
            int iZzU = com.aspose.words.internal.zzZKN.zzU(str, str2, com.aspose.words.internal.zzZOF.CURRENT_CULTURE$4894b8c8);
            return iZzU != 0 ? iZzU : com.aspose.words.internal.zzZYO.compare2(str, str2);
        }
    }

    public static class zzY extends zzZQF {
        private zzZPF zzYi9;
        private boolean zzYia;
        private int zzYib;
        private zzZ7Z zzYic;
        private zzZ zzYid;
        private zzZ7Z zzYie;
        private zzZQV zzYif;
        private FieldSeq zzYig;

        public static class zzZ extends zzZOM {
            private zzZYT zzYi4;
            private Node zzYi5;
            private StringBuilder zzYi6;
            private zzZQO zzYi7;
            private zzY zzYi8;

            public zzZ(zzY zzy, zzZQO zzzqo) {
                super(zzzqo.zzZeH());
                this.zzYi6 = new StringBuilder();
                this.zzYi8 = zzy;
                this.zzYi7 = zzzqo;
            }

            private zzZYT zzYV4() {
                zzZYT zzzyt = this.zzYi4;
                return zzzyt != null ? zzzyt : this.zzYi7.zzZeH().zzYA2().zzZop();
            }

            @Override // com.aspose.words.zzZOM, com.aspose.words.zzZP9
            public final boolean zzQ(Node node, Node node2) {
                boolean zZzQ = super.zzQ(node, node2);
                if (zZzQ && !isInFieldCode() && node.getNodeType() == 21) {
                    this.zzYi5 = node;
                }
                return zZzQ;
            }

            @Override // com.aspose.words.zzZOM, com.aspose.words.zzZPA
            public final StringBuilder zzY(StringBuilder sb, char c, int i) {
                if (isInFieldCode()) {
                    return null;
                }
                if (c != ':' || zzZbC()) {
                    this.zzYi6.append(c);
                } else {
                    zzZYT zzzytZzYV4 = zzYV4();
                    if (this.zzYi5 == this.zzYi7.zzZeH().zzYA2().getNode()) {
                        i += this.zzYi7.zzZeH().zzYA2().getOffset();
                    }
                    this.zzYi4 = new zzZYT(this.zzYi5, i + 1);
                    zzZ(zzzytZzYV4, new zzZYT(this.zzYi5, i));
                }
                return null;
            }

            public final void zzYV3() {
                zzZ(zzYV4(), this.zzYi7.zzZeH().zzYA1().zzZop());
            }

            @Override // com.aspose.words.zzZOM, com.aspose.words.zzZPA
            public final zzYIS zzZ(zzYIS zzyis, zzYIV zzyiv, int i) {
                return super.zzZ(zzyis, zzyiv, i);
            }

            private void zzZ(zzZYT zzzyt, zzZYT zzzyt2) {
                String string = this.zzYi6.toString();
                this.zzYi6.setLength(0);
                this.zzYi8.zzY(string, this.zzYi7, new zzYWB(zzzyt, zzzyt2));
            }
        }

        public zzY(zzZQV zzzqv, zzZ7Z zzz7z, boolean z, Node node, zzZPF zzzpf) {
            this(zzzqv, zzz7z, z, zzZ.zzU(node, zzzqv.getSequenceName()), zzzpf);
        }

        private void zzU(FieldSeq fieldSeq) {
            if (this.zzYif.hasSequenceName() && com.aspose.words.internal.zzZKN.equals(this.zzYif.getSequenceName(), fieldSeq.getSequenceIdentifier())) {
                this.zzYig = fieldSeq;
            }
        }

        private void zzX(FieldRD fieldRD) throws Exception {
            Document documentZzZ;
            if (this.zzYia && (documentZzZ = zzZQ3.zzZ(fieldRD)) != null) {
                new zzY(this.zzYif, this.zzYie, false, (Node) documentZzZ, this.zzYif.hasSequenceName() ? new zzZPF(documentZzZ) : null).zzZQ(documentZzZ);
            }
        }

        private void zzY(FieldXE fieldXE, zzZQO zzzqo) throws Exception {
            this.zzYic = this.zzYie;
            this.zzYib = 1;
            if (zzzqo.getText().indexOf(58) == -1) {
                zzY(zzzqo.getText(), zzzqo, zzzqo.zzZeH());
            } else {
                zzZ zzz = new zzZ(this, zzzqo);
                new zzYWC(zzzqo.zzZeH(), zzz).zzYAa();
                zzz.zzYV3();
            }
            zzZ7Z zzz7z = this.zzYic;
            if (zzz7z != this.zzYie) {
                zzz7z.zzZ(fieldXE, zzzqo, this.zzYig, this.zzYid, this.zzYi9);
            }
        }

        @Override // com.aspose.words.zzZQF
        public final void zzZe8() throws Exception {
            int iZzZe6 = zzZe6();
            if (iZzZe6 == 4) {
                zzZ((FieldXE) zzZe7());
            } else if (iZzZe6 == 11) {
                zzX((FieldRD) zzZe7());
            } else {
                if (iZzZe6 != 12) {
                    return;
                }
                zzU((FieldSeq) zzZe7());
            }
        }

        private void zzZ(FieldXE fieldXE) throws Exception {
            zzZQO zzzqo = new zzZQO(fieldXE);
            if (zzZ(fieldXE, zzzqo)) {
                zzY(fieldXE, zzzqo);
            }
        }

        public zzY(zzZQV zzzqv, zzZ7Z zzz7z, zzYWB zzywb, zzZPF zzzpf) throws Exception {
            this(zzzqv, zzz7z, true, zzZ.zzZ(zzywb, zzzqv.getSequenceName()), zzzpf);
        }

        private zzY(zzZQV zzzqv, zzZ7Z zzz7z, boolean z, zzZ zzz, zzZPF zzzpf) {
            this.zzYif = zzzqv;
            this.zzYie = zzz7z;
            this.zzYid = zzz;
            this.zzYia = z;
            this.zzYi9 = zzzpf;
        }

        private boolean zzZ(FieldXE fieldXE, zzZQO zzzqo) {
            if (this.zzYif.zzuZ() != zzzqo.zzZeC() || !fieldXE.zzX(zzzqo)) {
                return false;
            }
            if (this.zzYif.zzZfc()) {
                char cZzZK = com.aspose.words.internal.zzZKU.zzZK(zzzqo.getText().charAt(com.aspose.words.internal.zzZYD.zzXf(zzzqo.getText())));
                if (cZzZK < this.zzYif.getLetterRange().charAt(0) || cZzZK > this.zzYif.getLetterRange().charAt(1)) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzY(String str, zzZQO zzzqo, zzYWB zzywb) {
            if (this.zzYib > 7) {
                return;
            }
            this.zzYic = this.zzYic.zzZ(str, zzzqo, zzywb);
            this.zzYib++;
        }
    }

    public static class zzZ extends zzZQF {
        private String zzYFr;
        private FieldSeq zzYig;
        private com.aspose.words.internal.zzZYG<FieldSeq> zzYii = new com.aspose.words.internal.zzZYG<>(false);
        private com.aspose.words.internal.zzZYG<FieldSeq> zzYih = new com.aspose.words.internal.zzZYG<>(false);

        private zzZ(String str) {
            this.zzYFr = str;
        }

        public static zzZ zzU(Node node, String str) {
            if (str == null) {
                return null;
            }
            zzZ zzz = new zzZ(str);
            zzz.zzZQ(node);
            return zzz;
        }

        public static zzZ zzZ(zzYWB zzywb, String str) throws Exception {
            if (str == null) {
                return null;
            }
            zzZ zzz = new zzZ(str);
            zzz.zzV(zzywb);
            return zzz;
        }

        @Override // com.aspose.words.DocumentVisitor
        public final int visitBookmarkEnd(BookmarkEnd bookmarkEnd) throws Exception {
            this.zzYih.set(bookmarkEnd.getName(), this.zzYig);
            return super.visitBookmarkEnd(bookmarkEnd);
        }

        @Override // com.aspose.words.DocumentVisitor
        public final int visitBookmarkStart(BookmarkStart bookmarkStart) throws Exception {
            this.zzYii.set(bookmarkStart.getName(), this.zzYig);
            return super.visitBookmarkStart(bookmarkStart);
        }

        public final FieldSeq zzJw(String str) {
            return this.zzYih.get(str);
        }

        public final FieldSeq zzJx(String str) {
            return this.zzYii.get(str);
        }

        @Override // com.aspose.words.zzZQF
        public final void zzZe8() {
            if (zzZe6() != 12) {
                return;
            }
            FieldSeq fieldSeq = (FieldSeq) zzZe7();
            if (com.aspose.words.internal.zzZKN.equals(fieldSeq.getSequenceIdentifier(), this.zzYFr)) {
                this.zzYig = fieldSeq;
            }
        }
    }

    private zzZ7Z() {
        this(null, null);
    }

    private static zzZ7X zzY(FieldXE fieldXE, zzZQO zzzqo, FieldSeq fieldSeq, zzZ zzz, zzZPF zzzpf) throws Exception {
        int iZzZt;
        FieldSeq fieldSeq2;
        int iZzZt2;
        FieldSeq fieldSeqZzJw;
        fieldXE.zzX(zzzqo);
        zzYAT zzyatZzV = fieldXE.zzV(zzzqo);
        if (zzyatZzV != null) {
            int iZzZt3 = zzYAH.zzZt(zzyatZzV);
            iZzZt = zzYAH.zzZt(zzyatZzV.zzY7o());
            if (zzz != null) {
                FieldSeq fieldSeqZzJx = zzz.zzJx(zzyatZzV.getName());
                iZzZt2 = iZzZt3;
                fieldSeqZzJw = zzz.zzJw(zzyatZzV.getName());
                fieldSeq2 = fieldSeqZzJx;
            } else {
                iZzZt2 = iZzZt3;
                fieldSeq2 = null;
                fieldSeqZzJw = null;
            }
        } else {
            zzYAH zzyahZzJ = fieldXE.getStart().zzYBb().zzZqh().zzJ(fieldXE.getStart());
            iZzZt = -1;
            fieldSeq2 = fieldSeq;
            iZzZt2 = zzyahZzJ != null ? zzYAH.zzZt(zzyahZzJ) : 0;
            fieldSeqZzJw = null;
        }
        return new zzZ7X(iZzZt2, iZzZt, fieldSeq2, fieldSeqZzJw, zzzqo, fieldXE, zzzpf);
    }

    public final zzYWB zz9m() {
        return this.zzYim;
    }

    public final boolean zzYV5() {
        return this.zzYil;
    }

    public final boolean zzYV6() {
        return this.zzYij != null;
    }

    public final ArrayList<zzZ7X> zzYV7() {
        return this.zzYij;
    }

    public final boolean zzYV8() {
        return this.zzYik != null;
    }

    public final int zzYV9() {
        if (zzYV8()) {
            return this.zzYik.getCount();
        }
        return 0;
    }

    public final zzZ7Z zzyd(int i) {
        return this.zzYik.zzl9().get(i);
    }

    public final String zzye(int i) {
        return this.zzYik.getKeys().get(i);
    }

    private zzZ7Z(zzZQO zzzqo, zzYWB zzywb) {
        this.zzYin = zzzqo;
        this.zzYim = zzywb;
    }

    public static zzZ7Z zzZ(zzZQV zzzqv, zzZPF zzzpf, DocumentBase documentBase) {
        zzZ7Z zzz7z = new zzZ7Z();
        new zzY(zzzqv, zzz7z, true, (Node) documentBase, zzzpf).zzZQ(documentBase);
        return zzz7z;
    }

    public static zzZ7Z zzZ(zzZQV zzzqv, zzZPF zzzpf, zzYWB zzywb) throws Exception {
        zzZ7Z zzz7z = new zzZ7Z();
        new zzY(zzzqv, zzz7z, zzywb, zzzpf).zzV(zzywb);
        return zzz7z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zzZ(FieldXE fieldXE, zzZQO zzzqo, FieldSeq fieldSeq, zzZ zzz, zzZPF zzzpf) throws Exception {
        if (!zzYV6()) {
            this.zzYij = new ArrayList<>();
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzYij, zzY(fieldXE, zzzqo, fieldSeq, zzz, zzzpf));
        if (zzzqo.zzZez()) {
            this.zzYil = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzZ7Z zzZ(String str, zzZQO zzzqo, zzYWB zzywb) {
        zzZ7Z zzz7z;
        if (zzYV8()) {
            zzz7z = (zzZ7Z) com.aspose.words.internal.zzQW.zzZ((com.aspose.words.internal.zzZQH<String, TValue>) this.zzYik, str);
        } else {
            this.zzYik = new com.aspose.words.internal.zzZQH<>(zzX.zzYi3);
            zzz7z = null;
        }
        if (zzz7z != null) {
            return zzz7z;
        }
        zzZ7Z zzz7z2 = new zzZ7Z(zzzqo, zzywb);
        this.zzYik.set(str, zzz7z2);
        return zzz7z2;
    }
}
