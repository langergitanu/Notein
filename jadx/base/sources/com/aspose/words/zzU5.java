package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzU5 extends zzYWE {
    private zzU8 zzZGE;
    private com.aspose.words.internal.zzD4 zzZtA;
    private zzYWB zzZtB;
    private boolean zzZty;
    private int zzZtz;

    public zzU5(Node node, zzU8 zzu8) throws Exception {
        super(node);
        this.zzZty = true;
        this.zzZtB = null;
        this.zzZGE = zzu8;
        update();
    }

    private boolean zzE(Node node) {
        CompareOptions compareOptions = this.zzZGE.zzZup;
        int nodeType = node.getNodeType();
        if (nodeType == 5) {
            return compareOptions.getIgnoreTables();
        }
        if (nodeType != 19) {
            if (nodeType == 20) {
                return compareOptions.getIgnoreFootnotes() && ((Footnote) node).isAuto();
            }
            if (nodeType != 33 && nodeType != 34) {
                return false;
            }
        }
        return compareOptions.getIgnoreComments() && compareOptions.getTarget() == 0;
    }

    @Override // com.aspose.words.zzYWE
    public final String zzF(Node node) {
        int nodeType = node.getNodeType();
        if (nodeType != 5) {
            if (nodeType == 22) {
                return zzU7.zzZtT;
            }
            if (nodeType == 24) {
                return zzU7.zzZtR;
            }
            if (nodeType != 37) {
                switch (nodeType) {
                    case 17:
                    case 18:
                        return zzU7.zzZtO;
                    case 19:
                        return zzU7.zzX((char) 57856, this.zzZGE.zzMZ(zzZZ0().get(((Comment) node).getId())), 512);
                    case 20:
                        return zzU7.zzZtS;
                    default:
                        switch (nodeType) {
                            case 27:
                                return zzU7.zzZtV;
                            case 28:
                                return zzU7.zzZtP;
                            case 29:
                                return zzU7.zzZtK;
                            case 30:
                                return zzU7.zzZtJ;
                            default:
                                switch (nodeType) {
                                    case 33:
                                        return zzU7.zzX(node.zzYAY() == 6 ? (char) 58368 : (char) 59392, this.zzZGE.zzMZ(zzZZ0().get(((CommentRangeStart) node).getId())), 512);
                                    case 34:
                                        return zzU7.zzX(node.zzYAY() == 6 ? (char) 58880 : (char) 59904, this.zzZGE.zzMZ(zzZZ0().get(((CommentRangeEnd) node).getId())), 512);
                                    case 35:
                                        return zzU7.zzZtU;
                                }
                        }
                }
            }
            if (node instanceof zzYD5) {
                return ((zzYD5) node).zzYcK().getLevel() == 1 ? zzU7.zzZtM : zzU7.zzZtK;
            }
            if (node instanceof zzYD6) {
                return ((zzYD6) node).zzXWe == 1 ? zzU7.zzZtL : zzU7.zzZtJ;
            }
        } else if (node != zzYAb()) {
            Table table = (Table) node;
            return this.zzZGE.zzZuj.containsKey(table.getText()) ? zzU7.zzX((char) 60416, this.zzZGE.zzZuj.get(table.getText()), TableStyleOptions.DEFAULT_2003) : zzU7.zzZtH;
        }
        return node instanceof AbsolutePositionTab ? zzU7.zzZtQ : (node.getNodeType() == 26 && com.aspose.words.internal.zzZKN.equals(((SpecialChar) node).getText(), ControlChar.zzZtN)) ? zzU7.zzZtN : node.getText();
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00a2  */
    @Override // com.aspose.words.zzYWE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzG(Node node) {
        zzYWB zzywb = this.zzZtB;
        if (zzywb != null && node == zzywb.zzYA2().getNode()) {
            this.zzZty = true;
            return this.zzZtB.zzYA4() ? 0 : 2;
        }
        zzYWB zzywb2 = this.zzZtB;
        if (zzywb2 != null && node == zzywb2.zzYA1().getNode()) {
            this.zzZty = false;
            return 0;
        }
        if (!this.zzZty) {
            return 2;
        }
        if (node.getNodeType() == 22) {
            if (this.zzZtz < 0) {
                this.zzZtz = 0;
            }
            int i = this.zzZtz + 1;
            this.zzZtz = i;
            return (i != 1 || zzE(node)) ? 2 : 0;
        }
        if (node.getNodeType() == 24) {
            this.zzZtz--;
            return 2;
        }
        if (this.zzZtz > 0) {
            return 2;
        }
        if (zzE(node)) {
            return 1;
        }
        int nodeType = node.getNodeType();
        if (nodeType == 3) {
            Body body = (Body) node;
            body.ensureMinimum();
            if (body.getLastChild().getNodeType() != 8) {
                body.appendChild(new Paragraph(body.getDocument()));
            }
        } else if (nodeType != 4) {
            if (nodeType != 5 && nodeType != 35) {
                switch (nodeType) {
                    case 17:
                    case 18:
                        if (node != zzYAb()) {
                            return 3;
                        }
                        break;
                    case 19:
                        if (node != zzYAb()) {
                            return 3;
                        }
                        break;
                    case 20:
                        break;
                    default:
                        switch (nodeType) {
                            case 28:
                                if (node == zzYAb()) {
                                    return 0;
                                }
                                if (zzU4.zzZ((StructuredDocumentTag) node)) {
                                    return 3;
                                }
                            case 27:
                                return 2;
                            case 29:
                            case 30:
                                return 3;
                        }
                        break;
                }
            } else if (node != zzYAb()) {
                return 3;
            }
        } else if (node != zzYAb()) {
            return 1;
        }
        return 0;
    }

    @Override // com.aspose.words.zzYWE
    public final String zzX(CompositeNode compositeNode) {
        if (compositeNode.getNodeType() != 8) {
            return compositeNode.getNodeType() == 6 ? zzU7.zzZtX : compositeNode.zzZYp();
        }
        Paragraph paragraph = (Paragraph) compositeNode;
        if (paragraph.isEndOfSection()) {
            return paragraph.getParentSection().zzYB3() ? zzU7.zzZtR : zzU7.SECTION_BREAK;
        }
        if (!paragraph.isEndOfCell()) {
            return (zzYAb().getNodeType() == 20 && com.aspose.words.internal.zzZKO.zzA(compositeNode.getParentNode(), zzYAb()) && compositeNode.zzYB3()) ? zzU7.zzZtR : paragraph.zzYoV() ? zzU7.zzZtI : zzU7.PARAGRAPH_BREAK;
        }
        if (zzYAb().getNodeType() != 7 && zzYAb().getNodeType() != 6 && zzYAb().getNodeType() != 5) {
            return zzU7.PARAGRAPH_BREAK;
        }
        return zzU7.zzZtW;
    }

    public final com.aspose.words.internal.zzD4 zzZZ0() {
        if (this.zzZtA == null) {
            this.zzZtA = new com.aspose.words.internal.zzD4();
            for (Comment comment : zzYAb().getDocument().getChildNodes(19, true)) {
                this.zzZtA.set(comment.getId(), comment.getText().hashCode());
            }
        }
        return this.zzZtA;
    }

    public zzU5(ArrayList<Node> arrayList, zzU8 zzu8) throws Exception {
        super(arrayList);
        this.zzZty = true;
        this.zzZtB = null;
        this.zzZGE = zzu8;
        update();
    }

    public zzU5(Node node, zzYWB zzywb, zzU8 zzu8) throws Exception {
        super(node);
        this.zzZty = false;
        this.zzZtB = zzywb;
        this.zzZGE = zzu8;
        update();
    }
}
