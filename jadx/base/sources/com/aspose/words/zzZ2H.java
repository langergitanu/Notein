package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzZ2H implements zzZAX, zzZAY {
    private String mName;
    private boolean zzPx;
    private boolean zzY51;
    private zzY zzY52;
    private zzZA5 zzY53;
    private zzZA5 zzY54;
    private Node zzY55;
    private Node zzY56;
    private boolean zzY57;
    private Node zzY58;
    private Node zzY59;
    private MailMerge zzY5W;
    private ArrayList<Node> zzY5a;
    private ArrayList<Node> zzY5b;
    private zzZ2H zzY5c;
    private boolean zzY5d;
    private Node zzY5e;
    private CompositeNode zzY5f;
    private ArrayList<Row> zzY5g;
    private zzYZK zzY5h;
    private boolean zzY5i;
    private String zzY5j;
    private zzZAF zzY5k;
    private com.aspose.words.internal.zzZYG<zzZ> zzY5l;
    private com.aspose.words.internal.zzIM<zzZ2H> zzY5m;
    private zzZ2F zzY5n;
    private int zzY5o;
    private boolean zzY5p;
    private zzZAF[] zzY5q;
    private Node zzY5r;
    private Node zzY5s;
    private ArrayList<Node> zzY5t;
    private Field zzY5u;
    private Field zzY5v;
    private Node zzY5w;
    private Node zzY5x;
    private int zzYDi;
    private zzZAF zzYHV;

    public static class zzX implements zzZA5 {
        private zzZ2H zzY4Z;

        public zzX(zzZ2H zzz2h) {
            this.zzY4Z = zzz2h;
        }

        @Override // com.aspose.words.zzZA5
        public final void zzW(Node node, Node node2) {
            if (this.zzY4Z.zzY58 == node) {
                this.zzY4Z.zzY58 = node2;
            }
            if (this.zzY4Z.zzY59 == node) {
                this.zzY4Z.zzY59 = node2;
            }
            for (int i = 0; i < this.zzY4Z.zzY5a.size(); i++) {
                if (this.zzY4Z.zzY5a.get(i) == node) {
                    this.zzY4Z.zzY5a.set(i, node2);
                }
            }
            for (int i2 = 0; i2 < this.zzY4Z.zzY5b.size(); i2++) {
                if (this.zzY4Z.zzY5b.get(i2) == node) {
                    this.zzY4Z.zzY5b.set(i2, node2);
                }
            }
        }
    }

    public static class zzY extends zzK4 {
        private zzZ2H zzY4Z;

        public zzY(zzZ2H zzz2h) {
            this.zzY4Z = zzz2h;
        }

        private static boolean zzs(zzZOY zzzoy) {
            if (zzzoy.getField().getType() == 12) {
                return true;
            }
            Iterator<zzZOY> it = zzzoy.iterator();
            while (it.hasNext()) {
                if (zzs(it.next())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.aspose.words.zzK4
        public final boolean zzO(Paragraph paragraph) {
            if (this.zzY4Z.zzYJo() == paragraph) {
                return true;
            }
            return super.zzO(paragraph);
        }

        @Override // com.aspose.words.zzK4
        public final boolean zzX(zzZOY zzzoy) {
            if (zzs(zzzoy)) {
                return true;
            }
            return super.zzX(zzzoy);
        }

        @Override // com.aspose.words.zzK4
        public final boolean zzY(zzZOY zzzoy) throws Exception {
            if (!this.zzY4Z.zzY51) {
                return super.zzY(zzzoy);
            }
            this.zzY4Z.zzY5c.zzY52.zzY(zzzoy.getField());
            return false;
        }
    }

    public static class zzZ {
        private boolean zzD7;
        private boolean zzY50;
        private zzZAF zzYHV;

        public zzZ(zzZAF zzzaf, boolean z, boolean z2) {
            this.zzYHV = zzzaf;
            this.zzD7 = z;
            this.zzY50 = z2;
        }

        public final boolean isEmpty() {
            return this.zzD7;
        }

        public final boolean zzYJm() {
            return this.zzY50;
        }

        public final zzZAF zzYJn() {
            return this.zzYHV;
        }
    }

    public zzZ2H(Document document) {
        this.zzY5t = new ArrayList<>();
        this.zzY5g = new ArrayList<>();
        this.zzY5b = new ArrayList<>();
        this.zzY5a = new ArrayList<>();
        this.mName = "";
        this.zzY5x = document.getFirstSection();
        this.zzY5w = document.getLastSection();
        this.zzY5W = document.getMailMerge();
        this.zzY5v = null;
        this.zzY5u = null;
    }

    private boolean zz7(Field field) throws Exception {
        if (!this.zzY5W.getUnconditionalMergeFieldsAndRegions()) {
            return false;
        }
        int type = field.getType();
        if (type != 59 && type != 68 && type != 75 && type != 93 && type != 94) {
            switch (type) {
                case 41:
                case 42:
                case 43:
                case 44:
                    break;
                default:
                    return zza(field) != null;
            }
        }
        return true;
    }

    private boolean zz8(Field field) {
        int type;
        return ((this.zzY5W.getCleanupOptions() & 16) == 0 || (type = field.getType()) == 23 || type == 34 || type == 36 || type == 56 || type == 63 || type == 65 || type == 68 || type == 72 || type == 88 || type == 31 || type == 32 || type == 6301 || type == 6302 || zzZOO.zzCF(field.getType()) == 0 || zzZOO.zzCN(field.getType())) ? false : true;
    }

    private boolean zz9(Field field) {
        if (field.isRemoved() || this.zzY5n.zzYJi()) {
            return true;
        }
        if (field.getType() != 59) {
            return false;
        }
        FieldMergeField fieldMergeField = (FieldMergeField) field;
        return fieldMergeField.zzZd6() || fieldMergeField.zzZd5();
    }

    private static boolean zzC(Iterable<Node> iterable) {
        Iterator<Node> it = iterable.iterator();
        while (it.hasNext()) {
            if (zzYVU.zzXV(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzK(Cell cell) {
        Iterator<T> it = cell.getParagraphs().iterator();
        while (it.hasNext()) {
            if (((Paragraph) it.next()).zzYoW()) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzO(Row row) {
        Iterator<T> it = row.getCells().iterator();
        while (it.hasNext()) {
            if (!zzK((Cell) it.next())) {
                return false;
            }
        }
        return true;
    }

    private void zzTt(boolean z) throws Exception {
        Field field = this.zzY5v;
        if (field != null) {
            zzZ(field, field.getStart(), z);
            Field field2 = this.zzY5u;
            zzZ(field2, field2.getEnd(), z);
        }
    }

    private static boolean zzX(zzZ2H zzz2h) {
        return (zzz2h.zzY5x instanceof Row) && (zzz2h.zzY5w instanceof Row);
    }

    private static boolean zzY(zzZ2H zzz2h, zzZ2H zzz2h2) {
        if (zzz2h.zzY5W.getUseWholeParagraphAsRegion()) {
            return true;
        }
        return zzX(zzz2h) && zzX(zzz2h2);
    }

    private void zzYJA() {
        Cell cell = (Cell) com.aspose.words.internal.zzZKW.zzZ(this.zzY5w.getParentNode(), Cell.class);
        Node node = this.zzY5x;
        while (true) {
            Node nextSibling = node.getNextSibling();
            node.remove();
            if (cell != null && cell.getChildNodes(0, false).getCount() == 0 && node.getNodeType() == 8) {
                Paragraph paragraph = (Paragraph) node;
                cell.appendChild(new Paragraph(cell.getDocument(), (zzYMX) paragraph.zzZYj().zzbn(), (zzYEF) paragraph.zzYp5().zzbn()));
            }
            if (node == this.zzY5w) {
                return;
            }
            if (nextSibling == null) {
                throw new IllegalStateException("Unexpected end of children nodes reached.");
            }
            node = nextSibling;
        }
    }

    private void zzYJB() {
        if (this.zzY5a.size() > 0) {
            CompositeNode compositeNode = (CompositeNode) this.zzY58;
            Iterator<Node> it = this.zzY5a.iterator();
            Node nodeInsertAfter = null;
            while (it.hasNext()) {
                nodeInsertAfter = compositeNode.insertAfter(it.next(), nodeInsertAfter);
            }
        }
        if (this.zzY5b.size() > 0) {
            CompositeNode compositeNode2 = (CompositeNode) this.zzY59;
            Iterator<Node> it2 = this.zzY5b.iterator();
            while (it2.hasNext()) {
                compositeNode2.appendChild(it2.next());
            }
        }
    }

    private void zzYJC() throws Exception {
        Node node;
        Field field = this.zzY5v;
        if (field != null) {
            zzW(field, this.zzY5u);
        }
        this.zzY5x.getParentNode();
        this.zzY5w.getParentNode();
        zzTt(true);
        CompositeNode parentNode = this.zzY5x.getParentNode();
        this.zzY5f = parentNode;
        if (parentNode == null) {
            return;
        }
        this.zzY5e = this.zzY5x;
        do {
            node = this.zzY5e;
            if (node == null) {
                throw new IllegalStateException("Unexpected end of children nodes reached.");
            }
            this.zzY5e = node.getNextSibling();
            Node node2 = node == this.zzY5x ? this.zzY5s : null;
            Node nextSibling = node == this.zzY5w ? this.zzY5r : null;
            if (node2 != null) {
                for (Node firstChild = ((CompositeNode) node).getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
                    com.aspose.words.internal.zzZQG.zzZ(this.zzY5a, firstChild);
                    if (firstChild == node2) {
                        break;
                    }
                }
                Iterator<Node> it = this.zzY5a.iterator();
                while (it.hasNext()) {
                    it.next().remove();
                }
            }
            if (nextSibling != null) {
                while (nextSibling != null) {
                    com.aspose.words.internal.zzZQG.zzZ(this.zzY5b, nextSibling);
                    nextSibling = nextSibling.getNextSibling();
                }
                Iterator<Node> it2 = this.zzY5b.iterator();
                while (it2.hasNext()) {
                    it2.next().remove();
                }
            }
            node.remove();
            com.aspose.words.internal.zzZQG.zzZ(this.zzY5t, node);
        } while (node != this.zzY5w);
        boolean z = this.zzY5f.getNodeType() == 3 && this.zzY5e == null;
        this.zzY5d = z;
        if (z) {
            Paragraph paragraph = new Paragraph(this.zzY5f.zzYBb());
            this.zzY5e = paragraph;
            CompositeNode compositeNode = this.zzY5f;
            compositeNode.insertAfter(paragraph, compositeNode.getLastChild());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CompositeNode zzYJo() {
        Node node = this.zzY5e;
        return node != null ? node.getParentNode() : this.zzY5f;
    }

    private int zzYJp() {
        if (this.zzY5k == this.zzYHV) {
            return this.zzYDi;
        }
        return 1;
    }

    private void zzYJq() {
        if (this.zzY5d) {
            CompositeNode compositeNodeZzYJo = zzYJo();
            this.zzY5e.remove();
            ((Body) compositeNodeZzYJo).ensureMinimum();
        }
    }

    private ArrayList<Node> zzYJr() {
        Node node = this.zzY5e;
        this.zzY55 = node;
        if (node != null) {
            this.zzY56 = node.getPreviousSibling();
        } else if (zzYJo() != null) {
            this.zzY56 = zzYJo().getLastChild();
        } else {
            this.zzY56 = null;
        }
        ArrayList<Node> arrayList = new ArrayList<>();
        Iterator<Node> it = this.zzY5t.iterator();
        while (it.hasNext()) {
            Node nodeZzZ = it.next().zzZ(true, this.zzY53);
            if (this.zzY5e != null) {
                zzYJo().insertBefore(nodeZzZ, this.zzY5e);
            } else {
                zzYJo().insertAfter(nodeZzZ, zzYJo().getLastChild());
            }
            arrayList.add(nodeZzZ);
            if (this.zzY58 == null) {
                this.zzY58 = nodeZzZ;
            }
            this.zzY59 = nodeZzZ;
        }
        return arrayList;
    }

    private void zzYJs() throws Exception {
        if (!this.zzYHV.moveNext()) {
            this.zzPx = true;
        } else {
            this.zzYDi++;
            zzYJv();
        }
    }

    private void zzYJu() throws Exception {
        if (!this.zzPx && this.zzY5p) {
            this.zzY5n.zzYJl();
            zzZAF[] zzzafArr = this.zzY5q;
            zzZAF[] zzzafArr2 = new zzZAF[zzzafArr.length + 1];
            System.arraycopy(zzzafArr, 0, zzzafArr2, 1, zzzafArr.length);
            zzzafArr2[0] = this.zzYHV;
            for (zzZ2H zzz2h : this.zzY5n.zzYJh()) {
                zzz2h.zzY5c = this;
                if (!this.zzY5m.contains(zzz2h)) {
                    zzZAF zzzafZzu = this.zzYHV.zzu(zzz2h.mName, false);
                    if (zzzafZzu != null) {
                        zzz2h.zzZ(zzzafZzu, zzzafArr2, true);
                    } else if (this.zzY5W.zzYKd()) {
                        zzz2h.remove();
                    }
                } else if (this.zzY5W.zzYKd()) {
                    zzz2h.remove();
                }
            }
        }
    }

    private void zzYJv() {
        zzYZK zzyzk = this.zzY5h;
        if (zzyzk != null) {
            zzyzk.clearCache();
        }
        com.aspose.words.internal.zzZYG<zzZ> zzzyg = this.zzY5l;
        if (zzzyg != null) {
            zzzyg.clear();
        }
    }

    private void zzYJw() {
        Node nextSibling;
        Node lastChild;
        Node node = this.zzY55;
        if (node != null) {
            Node node2 = this.zzY56;
            nextSibling = node2 != null ? node2.getNextSibling() : node.getParentNode().getFirstChild();
            lastChild = this.zzY55.getPreviousSibling();
            if (nextSibling == this.zzY55) {
                return;
            }
        } else {
            Node node3 = this.zzY56;
            nextSibling = node3 != null ? node3.getNextSibling() : zzYJo().getFirstChild();
            lastChild = zzYJo().getLastChild();
        }
        while (nextSibling != null) {
            Node nextSibling2 = nextSibling == lastChild ? null : nextSibling.getNextSibling();
            nextSibling.remove();
            nextSibling = nextSibling2;
        }
    }

    private void zzYJx() {
        if (this.zzY5W.zzYKa() && (this.zzY5x instanceof Row)) {
            for (Row row : this.zzY5g) {
                if (zzO(row)) {
                    row.remove();
                }
            }
        }
    }

    private void zzYJz() throws Exception {
        this.zzY52 = new zzY(this);
        zzZOQ zzzoq = new zzZOQ(this.zzY5W.getDocument(), this.zzY5W.zzZau(), this.zzY52);
        zzzoq.zzZaH();
        zzzoq.zzZaw().zzZ(this);
        zzzoq.zzZav().zzZ(this);
        boolean z = false;
        while (this.zzYHV.moveNext()) {
            if (!z) {
                zzYJC();
                z = true;
            }
            this.zzYDi++;
            zzYJv();
            zzZ(zzYJr(), zzzoq);
        }
        zzYJB();
        zzzoq.zzZaw().zzY(this);
        zzzoq.zzZav().zzX(this);
        zzzoq.zzZaF();
        zzYJx();
        if (z) {
            zzYJq();
        } else if (this.zzY5W.zzYKd()) {
            remove();
        }
        this.zzY5W.getDocument().zzZqk();
        this.zzY52 = null;
    }

    public static boolean zzZ(zzZ2H zzz2h, zzZ2H zzz2h2) {
        return zzY(zzz2h, zzz2h2) && zzX(zzz2h, zzz2h2);
    }

    private void zzZs(ArrayList<Node> arrayList) {
        if (this.zzY5W.zzYKa() && (this.zzY5x instanceof Row)) {
            if (arrayList.size() == 1) {
                arrayList.get(0);
            }
            com.aspose.words.internal.zzZQG.zzZ(this.zzY5g, (Row) arrayList.get(0));
        }
    }

    private boolean zzZv(Paragraph paragraph) {
        zzZ2H zzz2h;
        if (paragraph.zzYoW()) {
            return false;
        }
        if (this.zzY5W.getUseWholeParagraphAsRegion() || (zzz2h = this.zzY5c) == null) {
            return true;
        }
        if (zzz2h.zzY58 == paragraph && zzC(zzz2h.zzY5a)) {
            return false;
        }
        zzZ2H zzz2h2 = this.zzY5c;
        return (zzz2h2.zzY59 == paragraph && zzC(zzz2h2.zzY5b)) ? false : true;
    }

    private Field zza(Field field) throws Exception {
        zzZAA zzzaaZzL;
        this.zzY5n.zzYJi();
        if (zzZOO.zzj(field) || (zzzaaZzL = FieldMergeField.zzL(field)) == null) {
            return null;
        }
        FieldMergeField fieldMergeFieldZzZ = FieldMergeField.zzZ(zzzaaZzL);
        if (!zzzaaZzL.isMergeValueRequired() || (zzZ(fieldMergeFieldZzZ) != null && this.zzY5i)) {
            return fieldMergeFieldZzZ;
        }
        return null;
    }

    private void zzt(zzZOY zzzoy) {
        Field field = zzzoy.getField();
        if (field.getType() == 59 && ((FieldMergeField) field).zzZd6()) {
            for (zzZ2H zzz2h : this.zzY5n.zzYJh()) {
                if (zzz2h.zzY5v == field) {
                    this.zzY5m.add(zzz2h);
                    return;
                }
            }
        }
    }

    private void zzu(zzZOY zzzoy) {
        if (this.zzY5n.zzYJh().getCount() - this.zzY5m.getCount() == 0) {
            return;
        }
        zzt(zzzoy);
        Iterator<zzZOY> it = zzzoy.iterator();
        while (it.hasNext()) {
            zzu(it.next());
        }
    }

    public final String getName() {
        return this.mName;
    }

    public final boolean isDefined() {
        return (this.zzY5x == null || this.zzY5w == null) ? false : true;
    }

    public final void remove() throws Exception {
        this.zzY5x.getParentNode();
        this.zzY5w.getParentNode();
        if (this.zzY5x.isRemoved()) {
            return;
        }
        if (this.zzY5W.getUseWholeParagraphAsRegion() || (this.zzY5x instanceof Row)) {
            zzYJA();
        } else {
            zzYW0.zzZ((Node) this.zzY5v.getEnd(), false, (Node) this.zzY5u.getStart(), false, 0);
        }
        zzTt(false);
    }

    @Override // com.aspose.words.zzZAY
    public final Object zzA(Field field) {
        if (this.zzPx) {
            return null;
        }
        if (field.getType() == 59) {
            return this;
        }
        int type = field.getType();
        if (type == 93 || type == 94) {
            return this.zzYHV;
        }
        return null;
    }

    @Override // com.aspose.words.zzZAX
    public final void zzCR(int i) throws Exception {
        if (i == 1) {
            zzYJu();
        }
    }

    public final Field zzYJD() {
        return this.zzY5u;
    }

    public final Field zzYJE() {
        return this.zzY5v;
    }

    public final int zzYJt() throws Exception {
        if (!this.zzYHV.zzZhb()) {
            return -1;
        }
        if (this.zzY5h == null) {
            this.zzY5h = new zzYZK(this.zzY5W, this.zzYHV);
        }
        return this.zzY5h.zzZ(this.zzY5k, this.zzY5j, this.zzY5i);
    }

    public boolean zzYJy() {
        return false;
    }

    @Override // com.aspose.words.zzZAY
    public final zzTL zzz(Field field) throws Exception {
        if (this.zzPx) {
            return null;
        }
        int type = field.getType();
        if (type == 75) {
            return new zzZ7P((this.zzYDi - this.zzY5o) + 1);
        }
        switch (type) {
            case 41:
                zzYJs();
                break;
            case 42:
                zzTL zztlZzZcY = ((FieldNextIf) field).zzZcY();
                if (!zztlZzZcY.isError() && zztlZzZcY.zz8X()) {
                    zzYJs();
                }
                break;
            case 43:
                zzTL zztlZzZcY2 = ((FieldSkipIf) field).zzZcY();
                if (!zztlZzZcY2.isError() && zztlZzZcY2.zz8X()) {
                    this.zzY57 = true;
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.aspose.words.FieldChar, com.aspose.words.SpecialChar] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.aspose.words.Node] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.aspose.words.Node] */
    private static boolean zzR(FieldChar fieldChar) {
        fieldChar.getNodeType();
        fieldChar.getNodeType();
        boolean z = fieldChar.getNodeType() == 24;
        do {
            fieldChar = fieldChar.zzSI(z);
            if (fieldChar == 0) {
                return false;
            }
        } while (!zzYVU.zzXV(fieldChar));
        return true;
    }

    private void zzW(Field field, Field field2) {
        if (field.isRemoved() || field2.isRemoved()) {
            return;
        }
        if (field.getStart().zzYBd().getNodeType() != 8 || field2.getStart().zzYBd().getNodeType() != 8) {
            throw new IllegalStateException("Mail merge region start and end should be inside paragraphs.");
        }
        Paragraph paragraph = (Paragraph) field.getEnd().zzYBd();
        Paragraph paragraph2 = (Paragraph) field2.getStart().zzYBd();
        if (paragraph.zzYBd() != paragraph2.zzYBd()) {
            if (paragraph.zzYBd().getNodeType() != 7 || paragraph2.zzYBd().getNodeType() != 7 || paragraph.zzYBd().zzYBd() != paragraph2.zzYBd().zzYBd()) {
                throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Mail merge region '{0}' is badly formed. TableStart and TableEnd should be in the same section, same table row or same table cell.", this.mName));
            }
            Row parentRow = paragraph.zzZex().getParentRow();
            this.zzY5x = parentRow;
            this.zzY5w = parentRow;
            return;
        }
        boolean zZzR = zzR(field.getEnd());
        boolean zZzR2 = zzR(field2.getStart());
        boolean z = true;
        if (!zZzR && !zZzR2 && field.getEnd().getParentNode().getNextSibling() == field2.getStart().getParentNode()) {
            zZzR = true;
            zZzR2 = true;
        }
        if (!this.zzY5W.zzYKc() && this.zzY5W.getUseWholeParagraphAsRegion()) {
            z = false;
        }
        this.zzY5x = (!z || zZzR) ? paragraph : paragraph.getNextSibling();
        this.zzY5w = (!z || zZzR2) ? paragraph2 : paragraph2.getPreviousSibling();
        this.zzY5s = null;
        this.zzY5r = null;
        if (this.zzY5W.getUseWholeParagraphAsRegion()) {
            return;
        }
        if (paragraph == this.zzY5x) {
            this.zzY5s = field.getStart().getPreviousSibling();
        }
        if (paragraph2 == this.zzY5w) {
            this.zzY5r = field2.getEnd().getNextSibling();
        }
        if (paragraph == paragraph2) {
            this.zzY5x = field.getEnd().getNextSibling();
            this.zzY5w = field2.getStart().getPreviousSibling();
            this.zzY5s = null;
            this.zzY5r = null;
        }
    }

    @Override // com.aspose.words.zzZAX
    public final zzZOT zzV(Field field, boolean z) throws Exception {
        if (this.zzY5n.zzS(field, z) && z) {
            return zzW(field, 1);
        }
        if (zz9(field)) {
            return zzW(field, 2);
        }
        Field fieldZza = zza(field);
        return fieldZza != null ? zzW(fieldZza, 0) : zzW(field, 0);
    }

    public final boolean zzY(FieldMergeField fieldMergeField, Ref<ImageFieldMergingArgs> ref) throws Exception {
        ref.set(new ImageFieldMergingArgs(this.zzY5W.getDocument(), this.zzY5k.getTableName(), zzYJp(), fieldMergeField, this.zzY5j, fieldMergeField.getFieldNameNoPrefix(), zzZ(fieldMergeField), fieldMergeField.zzZd8(), fieldMergeField.zzZd7()));
        this.zzY5W.zzZ(ref.get());
        return this.zzY5i;
    }

    public final int zzZ(zzZAF zzzaf, zzZAF[] zzzafArr, boolean z) throws Exception {
        this.zzYHV = zzzaf;
        this.zzY5q = zzzafArr;
        this.zzY5p = z;
        this.zzYDi = -1;
        this.zzPx = false;
        zzZ2H zzz2h = this.zzY5c;
        zzZA5 zzza5 = zzz2h != null ? zzz2h.zzY54 : null;
        this.zzY54 = zzTT.zzZ(zzza5, new zzX(this));
        this.zzY53 = zzTT.zzZ(zzza5, this.zzY5W.zzYKe());
        zzYJz();
        this.zzY5l = null;
        this.zzY5k = null;
        return this.zzYDi + 1;
    }

    private static boolean zzX(zzZ2H zzz2h, zzZ2H zzz2h2) {
        Node node;
        Node node2;
        Node node3 = zzz2h.zzY5x;
        Node node4 = zzz2h2.zzY5x;
        return node3 == node4 || node3 == (node = zzz2h2.zzY5w) || (node2 = zzz2h.zzY5w) == node4 || node2 == node;
    }

    public zzZ2H(String str, Field field, Field field2, boolean z) {
        this.zzY5t = new ArrayList<>();
        this.zzY5g = new ArrayList<>();
        this.zzY5b = new ArrayList<>();
        this.zzY5a = new ArrayList<>();
        this.zzY51 = z;
        this.mName = str;
        this.zzY5W = field.getStart().zzYBb().getMailMerge();
        zzW(field, field2);
        this.zzY5v = field;
        this.zzY5u = field2;
    }

    private void zzZ(Field field, FieldChar fieldChar, boolean z) throws Exception {
        if (fieldChar.getParentNode().getParentNode() == null) {
            return;
        }
        Paragraph paragraph = (this.zzY5W.zzYKc() || !(z || this.zzY5W.getUseWholeParagraphAsRegion())) ? (Paragraph) com.aspose.words.internal.zzZKW.zzZ(fieldChar.getParentNode(), Paragraph.class) : null;
        field.remove();
        if (paragraph == null || !zzZv(paragraph)) {
            return;
        }
        paragraph.remove();
    }

    private void zzZ(ArrayList<Node> arrayList, zzZOQ zzzoq) throws Exception {
        this.zzY5n = new zzZ2F();
        this.zzY5m = new com.aspose.words.internal.zzIM<>();
        this.zzY57 = false;
        zzzoq.zzZE(arrayList);
        if (this.zzY57) {
            zzzoq.zzZD(arrayList);
            zzYJw();
            this.zzY5o++;
        } else {
            zzZs(arrayList);
        }
        zzzoq.zzZaN().invalidate();
        zzZPF zzzpf = (zzZPF) zzzoq.zzZav().zzm(zzZPF.class);
        if (zzzpf != null) {
            zzzpf.invalidate();
        }
    }

    public final boolean zzZ(FieldMergeField fieldMergeField, Ref<FieldMergingArgs> ref) throws Exception {
        ref.set(new FieldMergingArgs(this.zzY5W.getDocument(), this.zzY5k.getTableName(), zzYJp(), fieldMergeField, this.zzY5j, fieldMergeField.getFieldNameNoPrefix(), zzZ(fieldMergeField)));
        this.zzY5W.zzZ(ref.get());
        return this.zzY5i;
    }

    private zzZOT zzW(Field field, int i) throws Exception {
        return new zzZOT(field, i, i != 2 && zz7(field), zz8(field) ? 1 : 0);
    }

    private Object zzZ(FieldMergeField fieldMergeField) throws Exception {
        int iZzZz;
        zzZ zzz;
        zzZAF zzzaf = this.zzYHV;
        this.zzY5k = zzzaf;
        String strZzIX = this.zzY5W.zzIX(fieldMergeField.getFieldNameNoPrefix());
        if (strZzIX == null) {
            return null;
        }
        int i = -1;
        boolean z = true;
        boolean zIsEmpty = false;
        int i2 = 0;
        while (true) {
            this.zzY5k = zzzaf;
            this.zzY5j = zzZ2M.zzZx(strZzIX, i);
            if (!zIsEmpty && (iZzZz = zzZ2M.zzZz(strZzIX, i)) != -1) {
                String strZzZy = zzZ2M.zzZy(strZzIX, iZzZz);
                com.aspose.words.internal.zzZYG<zzZ> zzzyg = this.zzY5l;
                if (zzzyg != null && zzzyg.containsKey(strZzZy)) {
                    zzz = this.zzY5l.get(strZzZy);
                    if (zzz != null) {
                        if (zzz.zzYJm()) {
                            i2++;
                        } else {
                            z = false;
                        }
                    }
                } else {
                    String strZzZx = zzZ2M.zzZx(strZzZy, i);
                    if (z && com.aspose.words.internal.zzZYD.zzi(strZzZx, "Parent")) {
                        zzZAF[] zzzafArr = this.zzY5q;
                        if (i2 < zzzafArr.length) {
                            zzz = new zzZ(zzzafArr[i2], false, true);
                            i2++;
                        } else {
                            zzz = null;
                        }
                    } else {
                        zzZAF zzzafZzu = zzzaf.zzu(strZzZx, true);
                        zzz = zzzafZzu != null ? new zzZ(zzzafZzu, !zzzafZzu.moveNext(), false) : null;
                        z = false;
                    }
                    if (this.zzY5l == null) {
                        this.zzY5l = new com.aspose.words.internal.zzZYG<>(false);
                    }
                    this.zzY5l.set(strZzZy, zzz);
                }
                if (zzz == null) {
                    break;
                }
                zzZAF zzzafZzYJn = zzz.zzYJn();
                zIsEmpty = zzz.isEmpty();
                zzzaf = zzzafZzYJn;
                i = iZzZz;
            } else {
                break;
            }
        }
        Ref<Object> ref = new Ref<>(null);
        this.zzY5i = !zIsEmpty && this.zzY5k.getValue(this.zzY5j, ref);
        return ref.get();
    }

    @Override // com.aspose.words.zzZAX
    public final void zzZ(zzZOY zzzoy, int i) {
        if (this.zzY5p && i == 3) {
            zzu(zzzoy);
        }
    }
}
