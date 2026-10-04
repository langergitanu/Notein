package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzY9D extends zzJV {
    private HashMap<Character, zzYL4> zzXaU;
    private zzZQC zzXaV;
    private zzZQC zzXaW;
    private Node zzXaX;
    private Node zzXaY;
    private zzU8 zzZGE;

    private zzY9D(Node node, Node node2, zzU5 zzu5, zzU5 zzu52, zzU8 zzu8) {
        super(zzu5, zzu52, zzu8);
        this.zzXaU = new HashMap<>();
        this.zzXaY = node;
        this.zzXaX = node2;
        this.zzZGE = zzu8;
        zzY4z();
    }

    private void update() throws Exception {
        zzZSP();
        this.zzXaW = null;
    }

    private Node zzQ(Node node, Node node2, boolean z) throws Exception {
        return zzZSN() ? zzU4.zzZ(node, node2, this.zzZGE, z) : zzU4.zzZ(node, node2, this.zzZGE);
    }

    public static void zzU(Node node, Node node2, zzU8 zzu8) throws Exception {
        new zzY9D(node, node2, new zzU5(node, zzu8), new zzU5(node2, zzu8), zzu8).zzY4y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void zzWt(Node node) {
        if (node instanceof zzZAM) {
            zzZAM zzzam = (zzZAM) node;
            zzzam.getRunPr_IInline().remove(14);
            zzzam.getRunPr_IInline().remove(12);
        }
        if (node instanceof Paragraph) {
            Paragraph paragraph = (Paragraph) node;
            paragraph.zzYp5().remove(14);
            paragraph.zzYp5().remove(12);
        }
        if (node.isComposite()) {
            Iterator<T> it = ((CompositeNode) node).getChildNodes(0, false).iterator();
            while (it.hasNext()) {
                zzWt((Node) it.next());
            }
        }
    }

    private static Node zzWu(Node node) {
        while (node.getPreviousSibling() != null && ((node.getPreviousSibling().getNodeType() == 9 || node.getPreviousSibling().getNodeType() == 10) && node.zzYAY() == 6)) {
            node = node.getPreviousSibling();
        }
        return node;
    }

    private void zzY(Field field, Node node) throws Exception {
        if (zzZSN()) {
            zzU4.zzY(field, node, this.zzZGE);
        } else {
            zzU4.zzZ(field, node, this.zzZGE);
        }
    }

    private Map<Node, Field> zzY4u() {
        if (this.zzXaV == null) {
            zzZQC zzzqc = new zzZQC();
            this.zzXaV = zzzqc;
            zzzqc.zzZQ(this.zzXaX);
        }
        return this.zzXaV.zzZqO();
    }

    private Map<Node, Field> zzY4v() {
        if (this.zzXaW == null) {
            zzZQC zzzqc = new zzZQC();
            this.zzXaW = zzzqc;
            zzzqc.zzZQ(this.zzXaY);
        }
        return this.zzXaW.zzZqO();
    }

    private void zzY4w() {
        if (zzZSG() <= 0 || zzZSN()) {
            return;
        }
        Run runZzng = ((Run) zzZSM()).zzng(zzZSG());
        int iZztw = zzZSE().zztw(zzZSK());
        zzZSE().zzZ(iZztw, runZzng.getText().length() + iZztw, zzZSM());
        zzZSE().zzX(iZztw, runZzng);
    }

    private void zzY4y() throws Exception {
        this.zzZGE.zzZuo.push(this);
        if (zzU6.zzZtG) {
            zzU6.zzSU(com.aspose.words.internal.zzZKN.format("\n{{Story}}\r\n'{0}'\r\n'{1}'", zzZSI(), zzZSH()));
        }
        zzZSQ();
        Iterator<T> it = this.zzXaU.values().iterator();
        while (it.hasNext()) {
            ((zzYL4) it.next()).zzYmR();
        }
        this.zzZGE.zzZuo.pop();
    }

    private void zzY4z() {
        com.aspose.words.internal.zzZQF.zzY(this.zzXaU, (char) 57369, new zzYCA(this.zzZGE));
        com.aspose.words.internal.zzZQF.zzY(this.zzXaU, (char) 57364, new zzZN0(this.zzZGE));
        com.aspose.words.internal.zzZQF.zzY(this.zzXaU, (char) 57363, new zzZQN(this.zzZGE));
        com.aspose.words.internal.zzZQF.zzY(this.zzXaU, (char) 57360, new zzYOO(this.zzZGE));
        com.aspose.words.internal.zzZQF.zzY(this.zzXaU, (char) 57352, new zzYB0(this.zzZGE));
        com.aspose.words.internal.zzZQF.zzY(this.zzXaU, (char) 57368, new zzYDJ(this.zzZGE));
        com.aspose.words.internal.zzZQF.zzY(this.zzXaU, (char) 60416, new zzY6H(this.zzZGE));
        com.aspose.words.internal.zzZQF.zzY(this.zzXaU, (char) 57367, new zzY(this.zzZGE));
    }

    public static void zzZ(zzYWB zzywb, zzYWB zzywb2, zzU8 zzu8) throws Exception {
        Node nodeZzE = Node.zzE(zzywb.zzYA2().getNode(), zzywb.zzYA1().getNode());
        Node nodeZzE2 = Node.zzE(zzywb2.zzYA2().getNode(), zzywb2.zzYA1().getNode());
        new zzY9D(nodeZzE, nodeZzE2, new zzU5(nodeZzE, zzywb, zzu8), new zzU5(nodeZzE2, zzywb2, zzu8), zzu8).zzY4y();
    }

    private ArrayList<Run> zzll(int i) throws Exception {
        int iZzZSJ = zzZSJ();
        ArrayList<Run> arrayList = new ArrayList<>();
        int iZzZSF = zzZSF();
        Run run = (Run) zzZSL();
        while (i > 0) {
            int iMin = Math.min(i, run.getText().length() - iZzZSF);
            Run runZzZ = zzU4.zzZ(run, iZzZSF, iMin, this.zzZGE);
            com.aspose.words.internal.zzZQG.zzZ(arrayList, runZzZ);
            iZzZSJ += runZzZ.zz0R();
            i -= iMin;
            if (i == 0) {
                break;
            }
            run = (Run) zzZSD().zztx(iZzZSJ);
            iZzZSF = 0;
        }
        return arrayList;
    }

    @Override // com.aspose.words.zzJV
    public final void zzLQ(int i) throws Exception {
        if (i == 0) {
            return;
        }
        if (zzZSM().getNodeType() != 21) {
            zzU6.zzH(zzZSM());
        }
        if (zzZSL().getNodeType() != 21) {
            zzU6.zzH(zzZSL());
        }
        zzZ((Run) zzZSM(), (Run) zzZSL(), false);
        while (i > 0) {
            Run run = (Run) zzZSM();
            Run run2 = (Run) zzZSL();
            int iMin = Math.min(Math.min(run.getText().length() - zzZSG(), run2.getText().length() - zzZSF()), i);
            if (this.zzZGE.zzZup.getTarget() == 1 && !com.aspose.words.internal.zzZKN.equals(run.getText().substring(zzZSG(), zzZSG() + iMin), run2.getText().substring(zzZSF(), zzZSF() + iMin))) {
                run.setText(com.aspose.words.internal.zzZKN.format("{0}{1}{2}", run.getText().substring(0, zzZSG()), run2.getText().substring(zzZSF(), zzZSF() + iMin), run.getText().substring(zzZSG() + iMin)));
            }
            zzYEF zzyefZzZ = zzZMF.zzZ(run, run2, this.zzZGE);
            boolean z = zzZSF() + iMin == run2.getText().length();
            if (zzyefZzZ != null || (z && (run2.getNextSibling() instanceof zzZD7))) {
                boolean z2 = (zzZSG() > 0 && run.zzng(zzZSG()) != null) | (run.zznf(iMin) != null);
                zzZ(run, run2, true);
                if (z2) {
                    update();
                }
                if (zzyefZzZ != null) {
                    zzZMF.zzZ(run.zzZYh(), zzyefZzZ, this.zzZGE);
                }
            }
            zzLL(zzZSK() + iMin);
            zzLK(zzZSJ() + iMin);
            i -= iMin;
        }
    }

    @Override // com.aspose.words.zzJV
    public final void zzLR(int i) {
        Run runZzng;
        if (i == 0) {
            return;
        }
        Run run = (Run) zzZSM();
        int iZzZSG = zzZSG();
        int iZzZSK = zzZSK();
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, run.getText().length() - iZzZSG);
            if (iZzZSG > 0 && (runZzng = run.zzng(iZzZSG)) != null) {
                int iZztw = zzZSE().zztw(iZzZSK);
                zzZSE().zzZ(iZztw, runZzng.getText().length() + iZztw, zzZSM());
                zzZSE().zzX(iZztw, runZzng);
            }
            if (iMin < run.getText().length()) {
                zzZSE().zzX(run.getText().length() + zzZSE().zztw(iZzZSK), run.zznf(iMin));
            }
            zzU4.zzZ((zzZ8X) run, this.zzZGE);
            i2 -= iMin;
            if (i2 <= 0) {
                break;
            }
            iZzZSK += iMin;
            run = (Run) zzZSE().zztx(iZzZSK);
            iZzZSG = 0;
        }
        zzLL(zzZSK() + i);
    }

    @Override // com.aspose.words.zzJV
    public final int zzLS(int i) throws Exception {
        int size = this.zzZGE.zzZun.size();
        if (zzZSE().zzYAd().getCount() != 0) {
            zzY4w();
        }
        ArrayList<Run> arrayListZzll = zzll(i);
        int i2 = 0;
        while (i2 < arrayListZzll.size()) {
            Run run = arrayListZzll.get(i2);
            if (zzZSE().zzYAd().getCount() != 0) {
                zzZ(run, zzZSL(), i2 == 0 ? zzWu(zzZSM()) : zzZSM());
                zzZSE().zzY(zzZSK(), run, run.getText());
                if (i2 == 0 && zzZSF() == 0) {
                    zzZ(run, (Run) zzZSL(), false);
                }
                if (run.zz0R() + zzZSF() == ((Run) zzZSL()).zz0R()) {
                    zzZ(run, (Run) zzZSL(), true);
                }
            } else {
                ((CompositeNode) zzZSE().zzYAb()).appendChild(run);
            }
            zzLL(run.getText().length() + zzZSK());
            zzLK(run.getText().length() + zzZSJ());
            i2++;
        }
        if (this.zzZGE.zzZun.size() != size) {
            update();
        }
        return i;
    }

    public final Paragraph zzY4x() {
        int iZzZSJ = zzZSJ();
        while (true) {
            Node nodeZztx = zzZSD().zztx(iZzZSJ);
            if (nodeZztx.getNodeType() == 8) {
                return (Paragraph) nodeZztx;
            }
            iZzZSJ++;
        }
    }

    @Override // com.aspose.words.zzJV
    public final void zzZ7(char c) throws Exception {
        zzYL4 zzyl4;
        if (zzU7.zzZp(c)) {
            this.zzXaU.get((char) 60416).zzb(zzZSM(), zzZSL());
        } else if (!zzU7.zzZn(c)) {
            switch (c) {
                case 57348:
                case 57613:
                case 57614:
                    zzZMF.zzZ((Paragraph) zzZSM(), (Paragraph) zzZSL(), this.zzZGE);
                    break;
                case 57359:
                case 57366:
                    if (zzZSM().getNodeType() != 27 && zzZSM().getNodeType() != 24) {
                        Paragraph paragraph = (Paragraph) zzZSM();
                        Paragraph paragraph2 = (Paragraph) zzZSL();
                        zzZMF.zzZ(paragraph, paragraph2, this.zzZGE);
                        zzZMF.zzZ(paragraph.getParentSection(), paragraph2.getParentSection(), this.zzZGE);
                    }
                    break;
                case 57363:
                    if (!this.zzZGE.zzZup.getIgnoreFields() && (zzyl4 = (zzYL4) com.aspose.words.internal.zzQW.zzZ(this.zzXaU, Character.valueOf(c))) != null) {
                        zzyl4.zzb(zzZSM(), zzZSL());
                    }
                    break;
                default:
                    zzYL4 zzyl42 = (zzYL4) com.aspose.words.internal.zzQW.zzZ(this.zzXaU, Character.valueOf(c));
                    if (zzyl42 != null) {
                        zzyl42.zzb(zzZSM(), zzZSL());
                    }
                    break;
            }
        } else {
            Comment comment = (Comment) zzZSM();
            Comment comment2 = (Comment) zzZSL();
            this.zzZGE.zzYk(comment2.getId(), comment.getId());
            if (this.zzZGE.zzZup.getTarget() == 1) {
                comment.setDone(comment2.getDone());
            }
            comment.getChildNodes(0, false).clear();
            Iterator<V> it = comment2.iterator();
            while (it.hasNext()) {
                Node nodeDeepClone = ((Node) it.next()).deepClone(true);
                nodeDeepClone.zzY(comment.getDocument());
                comment.getChildNodes(0, false).add(nodeDeepClone);
            }
        }
        zzLL(zzZSK() + 1);
        zzLK(zzZSJ() + 1);
    }

    @Override // com.aspose.words.zzJV
    public final void zzZ8(char c) {
        if (zzU7.zzZp(c)) {
            zzU4.zzY(zzZSM(), this.zzZGE);
        } else if (!zzU7.zzZn(c) && !zzU7.zzZk(c) && !zzU7.zzZh(c)) {
            switch (c) {
                case 57348:
                case 57359:
                case 57366:
                case 57613:
                case 57614:
                    zzU4.zzZ((zzZ8X) zzZSM(), this.zzZGE);
                    break;
                case 57352:
                case 57360:
                case 57364:
                case 57368:
                case 60416:
                    zzU4.zzY(zzZSM(), this.zzZGE);
                    break;
                case 57363:
                    if (!this.zzZGE.zzZup.getIgnoreFields()) {
                        zzU4.zzZ((Field) com.aspose.words.internal.zzQW.zzZ((Map<Node, TValue>) zzY4v(), zzZSM()), this.zzZGE);
                    }
                    break;
                case 57369:
                    ShapeBase shapeBase = (ShapeBase) zzZSM();
                    zzU4.zzY((Node) shapeBase, this.zzZGE);
                    if (shapeBase.getMarkupLanguage() == 0 && shapeBase.zzY9n() != null) {
                        zzU4.zzY((Node) shapeBase.zzY9n(), this.zzZGE);
                    }
                    break;
                case 57377:
                case 57379:
                    zzU4.zzZ((zzZ8X) ((zzYD5) zzZSM()).zzYcK(), this.zzZGE);
                    break;
                case 57378:
                case 57380:
                    zzYD6 zzyd6 = (zzYD6) zzZSM();
                    zzYD5 zzyd5 = this.zzZGE.zzZum.containsKey(Integer.valueOf(zzyd6.zze0)) ? this.zzZGE.zzZum.get(Integer.valueOf(zzyd6.zze0)) : null;
                    if (zzyd5 != null) {
                        zzU4.zzZ((zzZ8X) zzyd5.zzYcK(), this.zzZGE);
                    }
                    break;
                default:
                    zzU4.zzZ((zzZ8X) zzZSM(), this.zzZGE);
                    break;
            }
        }
        zzLL(zzZSK() + 1);
    }

    @Override // com.aspose.words.zzJV
    public final int zzZ9(char c) throws Exception {
        int iZzZSK = zzZSK();
        zzY4w();
        Node nodeZzWu = zzWu(zzZSM());
        if (zzU7.zzZp(c)) {
            int nodeType = nodeZzWu.getNodeType();
            Node node = nodeZzWu;
            if (nodeType == 8) {
                Paragraph paragraph = (Paragraph) nodeZzWu;
                node = nodeZzWu;
                if (!paragraph.isEndOfSection()) {
                    node = nodeZzWu;
                    if (paragraph.hasChildNodes()) {
                        Paragraph paragraph2 = (Paragraph) paragraph.deepClone(false);
                        zzU4.zzY((zzZ8X) paragraph2, this.zzZGE);
                        paragraph.zzYD(paragraph2);
                        update();
                        zzLL(zzZSK() + 1);
                        node = paragraph2;
                    }
                }
            }
            zzQ(zzZSL(), node, true);
        } else if (zzU7.zzZn(c)) {
            Comment comment = (Comment) zzZSL();
            Comment comment2 = (Comment) zzQ(comment, nodeZzWu, true);
            int id = comment.getId() + this.zzZGE.zzZuq + 1;
            this.zzZGE.zzYk(comment.getId(), id);
            comment2.setIdInternal(id);
            if (comment2.getParentId() != -1) {
                comment2.setParentId(this.zzZGE.zzN6(comment2.getParentId()));
            }
            zzWt(comment2);
        } else if (zzU7.zzZk(c)) {
            CommentRangeStart commentRangeStart = (CommentRangeStart) zzZSL();
            CommentRangeStart commentRangeStart2 = (CommentRangeStart) zzQ(commentRangeStart, nodeZzWu, true);
            commentRangeStart2.setId(commentRangeStart.getId() + this.zzZGE.zzZuq + 1);
            this.zzZGE.zzYk(commentRangeStart.getId(), commentRangeStart2.getId());
            zzZSE().zzZZ0().set(commentRangeStart2.getId(), zzZSD().zzZZ0().get(commentRangeStart.getId()));
        } else if (!zzU7.zzZh(c)) {
            switch (c) {
                case 57352:
                case 57360:
                case 57364:
                    zzQ(zzZSL(), nodeZzWu, true);
                    break;
                case 57359:
                case 57613:
                case 57614:
                    boolean zContainsKey = this.zzZGE.zzZun.containsKey(zzZSL());
                    Node nodeZzQ = zzQ(zzZSL(), nodeZzWu, false);
                    if (!zContainsKey) {
                        zzZSE().zzY(zzZSK(), nodeZzQ, com.aspose.words.internal.zzZKN.zzS(c, 1));
                    }
                    zzLL(zzZSK() + 1);
                    zzLK(zzZSJ() + 1);
                    return 1;
                case 57363:
                    if (this.zzZGE.zzZup.getIgnoreFields()) {
                        zzLK(zzZSJ() + 1);
                        return 0;
                    }
                    zzY((Field) com.aspose.words.internal.zzQW.zzZ((Map<Node, TValue>) zzY4u(), zzZSL()), nodeZzWu);
                    break;
                case 57368:
                    StructuredDocumentTag structuredDocumentTag = (StructuredDocumentTag) zzQ(zzZSL(), nodeZzWu, true);
                    if (structuredDocumentTag.getXmlMapping().isMapped()) {
                        zzU4.zzZ(structuredDocumentTag, (StructuredDocumentTag) zzZSL(), this.zzZGE);
                    }
                    break;
                case 57369:
                    int size = this.zzZGE.zzZun.size();
                    ShapeBase shapeBase = (ShapeBase) zzQ(zzZSL(), nodeZzWu, true);
                    if (shapeBase.getMarkupLanguage() == 0 && shapeBase.zzY9n() != null) {
                        zzU4.zzZ((Node) shapeBase.zzY9n(), this.zzZGE);
                    }
                    if (this.zzZGE.zzZun.size() == size) {
                        zzZSE().zzY(zzZSK(), shapeBase, com.aspose.words.internal.zzZKN.zzS(c, 1));
                        zzLL(zzZSK() + 1);
                        zzLK(zzZSJ() + 1);
                        return 1;
                    }
                    break;
                case 57377:
                case 57379:
                    zzYD5 zzyd5 = (zzYD5) zzZSL();
                    zzYD5 zzyd52 = (zzYD5) zzQ(zzZSL(), nodeZzWu, true);
                    int id2 = zzyd5.zzYcK().getId();
                    int iZzji = this.zzZGE.zzZZ6().zzZpQ().zzji(id2);
                    zzyd52.zzYcK().zzle(iZzji);
                    this.zzZGE.zzYj(id2, iZzji);
                    break;
                case 57378:
                case 57380:
                    zzYD6 zzyd6 = (zzYD6) zzZSL();
                    ((zzYD6) zzQ(zzZSL(), nodeZzWu, true)).zze0 = this.zzZGE.zzN5(zzyd6.zze0);
                    break;
                default:
                    zzQ(zzZSL(), nodeZzWu, true);
                    break;
            }
        } else {
            CommentRangeEnd commentRangeEnd = (CommentRangeEnd) zzZSL();
            CommentRangeEnd commentRangeEnd2 = (CommentRangeEnd) zzQ(commentRangeEnd, nodeZzWu, true);
            commentRangeEnd2.setId(commentRangeEnd.getId() + this.zzZGE.zzZuq + 1);
            this.zzZGE.zzYk(commentRangeEnd.getId(), commentRangeEnd2.getId());
            zzZSE().zzZZ0().set(commentRangeEnd2.getId(), zzZSD().zzZZ0().get(commentRangeEnd.getId()));
        }
        update();
        zzLL(zzZSK() + 1);
        zzLK(zzZSJ() + 1);
        return zzZSK() - iZzZSK;
    }

    @Override // com.aspose.words.zzJV
    public final boolean zzZSO() {
        return true;
    }

    private void zzZ(Run run, Node node, Node node2) throws Exception {
        if (zzZSN()) {
            zzU4.zzZ(run, node, node2, this.zzZGE);
        } else {
            zzU4.zzY(run, node, node2, this.zzZGE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.aspose.words.zzU8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.aspose.words.zzZD7] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.aspose.words.CompositeNode] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.aspose.words.Run] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.aspose.words.Node] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.aspose.words.zzU8] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZ(Run run, Run run2, boolean z) throws Exception {
        Node nextSibling = z ? run2.getNextSibling() : run2.getPreviousSibling();
        while (nextSibling != null && (nextSibling instanceof zzZD7)) {
            zzZD7 zzzd7 = (zzZD7) com.aspose.words.internal.zzZKW.zzZ(z ? run.getNextSibling() : run.getPreviousSibling(), zzZD7.class);
            ?? r2 = (zzZD7) com.aspose.words.internal.zzZKW.zzZ(nextSibling, zzZD7.class);
            if (zzzd7 != null) {
                run = run;
                if (!com.aspose.words.internal.zzZKN.equals(zzzd7.getName(), r2.getName())) {
                    run = run;
                    if (!this.zzZGE.zzX(r2)) {
                        zzU6.zzSU(com.aspose.words.internal.zzZKN.format("Copy {0} '{1}' {2} to '{3}'.", Integer.valueOf(((Node) r2).getNodeType()), r2.getName(), z ? "next" : "prior", run2));
                        Node nodeDeepClone = nextSibling.deepClone(false);
                        nodeDeepClone.zzY(this.zzZGE.zzZZ6());
                        run.getParentNode().zzZ(nodeDeepClone, run, z);
                        this.zzZGE.zzY(r2);
                        run = nodeDeepClone;
                    }
                }
            }
            nextSibling = z ? nextSibling.getNextSibling() : nextSibling.getPreviousSibling();
        }
    }
}
