package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZQF extends DocumentVisitor {
    private Field zzYEc;
    private FieldEnd zzYEd;
    private FieldSeparator zzYEe;
    private FieldStart zzYEf;
    private com.aspose.words.internal.zzZQC<Node> zzYEg;
    private Field zzYEh;
    private FieldEnd zzYEi;
    private FieldSeparator zzYEj;
    private FieldStart zzYEk;
    private boolean zzYEl;
    private int[] zzYEm;
    private com.aspose.words.internal.zzZQC<Node> zzYEn;

    public static class zzZ extends zzYVW {
        private zzZQF zzYEb;

        public zzZ(zzYWB zzywb, zzZQF zzzqf) {
            super(zzywb);
            this.zzYEb = zzzqf;
        }

        @Override // com.aspose.words.zzYVW
        public final void zz9c() {
            this.zzYEb.zzZQ(next());
        }

        @Override // com.aspose.words.zzYVW
        public final void zzZe4() {
            this.zzYEb.zzZQ(next());
        }

        public final void zzZe5() throws Exception {
            zzYzw();
        }
    }

    public zzZQF(int... iArr) {
        this.zzYEn = new com.aspose.words.internal.zzZQC<>();
        this.zzYEg = new com.aspose.words.internal.zzZQC<>();
        this.zzYEm = iArr;
        this.zzYEl = iArr == null || iArr.length == 0;
    }

    private Node zzDq(int i) {
        Node nodePeek;
        if (this.zzYEn.size() <= 0 || (nodePeek = this.zzYEn.peek()) == null || nodePeek.getNodeType() != i) {
            return null;
        }
        return this.zzYEn.pop();
    }

    private boolean zzY(FieldStart fieldStart, FieldSeparator fieldSeparator, FieldEnd fieldEnd) {
        if (fieldStart.isDeleteRevision() || fieldEnd.isDeleteRevision() || !zzYVU.zzk(fieldStart, fieldEnd)) {
            return false;
        }
        if (fieldSeparator == null || zzYVU.zzk(fieldStart, fieldSeparator)) {
            return this.zzYEl || com.aspose.words.internal.zzZKV.zzZ(this.zzYEm, fieldStart.getFieldType(), 0, this.zzYEm.length) != -1;
        }
        return false;
    }

    public static ArrayList<Field> zzZ(Node node, boolean z, int... iArr) {
        zzZQD zzzqd = new zzZQD(z, iArr);
        zzzqd.zzZQ(node);
        return zzzqd.getFields();
    }

    public static Map<Node, Field> zzZR(Node node) {
        zzZQC zzzqc = new zzZQC();
        zzzqc.zzZQ(node);
        return zzzqc.zzZqO();
    }

    public static ArrayList<Field> zzZS(Node node) {
        return zzZ(node, true, null);
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitFieldEnd(FieldEnd fieldEnd) throws Exception {
        if (!fieldEnd.zzZ(this)) {
            return 0;
        }
        FieldSeparator fieldSeparator = (FieldSeparator) zzDq(23);
        if (fieldSeparator != null && fieldSeparator.isDeleteRevision()) {
            fieldSeparator = null;
        }
        FieldStart fieldStart = (FieldStart) zzDq(22);
        if (fieldStart == null || !zzY(fieldStart, fieldSeparator, fieldEnd)) {
            return 0;
        }
        this.zzYEk = fieldStart;
        this.zzYEj = fieldSeparator;
        this.zzYEi = fieldEnd;
        zzZe8();
        this.zzYEk = null;
        this.zzYEj = null;
        this.zzYEi = null;
        this.zzYEh = null;
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitFieldSeparator(FieldSeparator fieldSeparator) throws Exception {
        if (!fieldSeparator.zzZ(this)) {
            return 0;
        }
        this.zzYEn.push(fieldSeparator);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitFieldStart(FieldStart fieldStart) throws Exception {
        if (!fieldStart.zzZ(this)) {
            return 0;
        }
        this.zzYEn.push(fieldStart);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitHeaderFooterEnd(HeaderFooter headerFooter) {
        this.zzYEk = this.zzYEf;
        this.zzYEj = this.zzYEe;
        this.zzYEi = this.zzYEd;
        this.zzYEh = this.zzYEc;
        this.zzYEn = this.zzYEg;
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitHeaderFooterStart(HeaderFooter headerFooter) {
        this.zzYEf = this.zzYEk;
        this.zzYEe = this.zzYEj;
        this.zzYEd = this.zzYEi;
        this.zzYEc = this.zzYEh;
        this.zzYEg = this.zzYEn;
        this.zzYEk = null;
        this.zzYEj = null;
        this.zzYEi = null;
        this.zzYEh = null;
        this.zzYEn = new com.aspose.words.internal.zzZQC<>();
        return 0;
    }

    public final void zzV(zzYWB zzywb) throws Exception {
        new zzZ(zzywb, this).zzZe5();
    }

    public final void zzZH(ArrayList<Node> arrayList) {
        Iterator<Node> it = arrayList.iterator();
        while (it.hasNext()) {
            zzZQ(it.next());
        }
    }

    public final void zzZQ(Node node) {
        try {
            node.accept(this);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public final int zzZe6() {
        return this.zzYEk.getFieldType();
    }

    public final Field zzZe7() {
        if (this.zzYEh == null) {
            this.zzYEh = zzZQB.zzX(this.zzYEk, this.zzYEj, this.zzYEi);
        }
        return this.zzYEh;
    }

    public abstract void zzZe8() throws Exception;

    public final boolean zzZfT() {
        return this.zzYEn.size() > 0;
    }

    public static ArrayList<Field> zzZ(zzYWB zzywb, int... iArr) throws Exception {
        zzZQD zzzqd = new zzZQD(true, iArr);
        zzzqd.zzV(zzywb);
        return zzzqd.getFields();
    }

    public zzZQF() {
        this(null);
    }
}
