package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZNY extends zzYWE {
    private com.aspose.words.internal.zzDB zzYyQ;
    private com.aspose.words.internal.zzZQC<Node> zzYyR;
    private ArrayList<Node> zzYyS;
    private FindReplaceOptions zzYyZ;
    private static String zzYyW = Character.toString(57357);
    private static String zzYyV = Character.toString(57359);
    private static String zzYyU = Character.toString(57360);
    private static String zzYyT = Character.toString(57369);
    private static char[] zzYyP = {57357, 57359, 57360, ControlChar.LINE_BREAK_CHAR, '\f'};

    public zzZNY(Node node, FindReplaceOptions findReplaceOptions) throws Exception {
        super(node);
        this.zzYyS = new ArrayList<>();
        this.zzYyR = new com.aspose.words.internal.zzZQC<>();
        this.zzYyQ = new com.aspose.words.internal.zzDB();
        this.zzYyZ = findReplaceOptions;
        update();
    }

    private boolean isInFieldCode() {
        return zzZfT() && this.zzYyR.peek().getNodeType() == 22;
    }

    private static boolean zzBH(int i) {
        return i == 1 || i == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int zzZf(Node node) {
        FindReplaceOptions findReplaceOptions = this.zzYyZ;
        if (findReplaceOptions == null) {
            return 0;
        }
        if (findReplaceOptions.getIgnoreFields() && zzZfT()) {
            return 2;
        }
        if (this.zzYyZ.getIgnoreFieldCodes() && isInFieldCode()) {
            return 2;
        }
        if (this.zzYyZ.getIgnoreDeleted() && (node instanceof zzZ8X) && ((zzZ8X) node).getDeleteRevision() != null) {
            return 2;
        }
        return (this.zzYyZ.getIgnoreInserted() && (node instanceof zzZ8X) && ((zzZ8X) node).getInsertRevision() != null) ? 2 : 0;
    }

    private boolean zzZfT() {
        return this.zzYyR.size() > 0;
    }

    @Override // com.aspose.words.zzYWE
    public final String zzF(Node node) {
        int nodeType = node.getNodeType();
        return (nodeType == 17 || nodeType == 18) ? zzYyT : super.zzF(node);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    @Override // com.aspose.words.zzYWE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzG(Node node) {
        int nodeType = node.getNodeType();
        if (nodeType != 4) {
            if (nodeType == 5 || nodeType == 6) {
                return 2;
            }
            if (nodeType != 28) {
                if (nodeType != 35) {
                    switch (nodeType) {
                        case 18:
                            if (node != zzYAb() && (!this.zzYyZ.getUseLegacyOrder() || !((Shape) node).zzY9o())) {
                                com.aspose.words.internal.zzZQG.zzZ(this.zzYyS, node);
                                if (this.zzYyZ.getIgnoreShapes()) {
                                }
                            }
                            break;
                        case 19:
                            break;
                        case 20:
                            if (this.zzYyZ.getIgnoreFootnotes()) {
                            }
                            break;
                        default:
                            switch (nodeType) {
                                case 22:
                                case 23:
                                    this.zzYyR.push(node);
                                    break;
                                case 24:
                                    if (zzZfT()) {
                                        Node nodePop = this.zzYyR.pop();
                                        if (this.zzYyR.size() > 0 && nodePop.getNodeType() == 23) {
                                            this.zzYyR.pop();
                                        }
                                    }
                                    break;
                            }
                            break;
                    }
                    return 1;
                }
                return 1;
            }
            if (!zzBH(((StructuredDocumentTag) node).getLevel())) {
                return 2;
            }
            if (!this.zzYyZ.getIgnoreStructuredDocumentTags() && node != zzYAb()) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzYyS, node);
                return 1;
            }
        } else if (node != zzYAb()) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzYyS, node);
            return 1;
        }
        return zzZf(node);
    }

    @Override // com.aspose.words.zzYWE
    public final String zzX(CompositeNode compositeNode) {
        int nodeType = compositeNode.getNodeType();
        if (nodeType != 8) {
            return (nodeType == 17 || nodeType == 18) ? zzYyT : compositeNode.zzZYp();
        }
        Paragraph paragraph = (Paragraph) compositeNode;
        return paragraph.isEndOfSection() ? paragraph.getParentSection().zzYB3() ? zzYyW : zzYyV : paragraph.isEndOfCell() ? zzYyU : zzYyW;
    }

    @Override // com.aspose.words.zzYWE
    public final void zzZ(int i, Node node, String str) {
        super.zzZ(i, node, str);
        int iZzZ = com.aspose.words.internal.zzZKN.zzZ(str, zzYyP, 0);
        while (iZzZ != -1) {
            this.zzYyQ.add(iZzZ + i);
            iZzZ = com.aspose.words.internal.zzZKN.zzZ(str, zzYyP, iZzZ + 1);
        }
    }

    public final com.aspose.words.internal.zzDB zzZ9x() {
        return this.zzYyQ;
    }

    public final ArrayList<Node> zzZ9y() {
        return this.zzYyS;
    }
}
