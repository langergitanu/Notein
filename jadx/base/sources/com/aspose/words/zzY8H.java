package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY8H {
    private static String zzX92 = " ";
    private DocumentBuilder zzZwh;

    private zzY8H() {
    }

    private boolean isAtEndOfParagraph() {
        Node currentNode = this.zzZwh.getCurrentNode();
        if (currentNode == null) {
            return true;
        }
        Node lastChild = this.zzZwh.getCurrentParagraph().getLastChild();
        while (lastChild != null && lastChild != currentNode) {
            if (!zzYVU.zztq(lastChild.getNodeType())) {
                return false;
            }
            lastChild = lastChild.getPreviousSibling();
        }
        return zzYVU.zztq(lastChild.getNodeType());
    }

    private void moveTo(Node node) {
        this.zzZwh.moveTo(node);
    }

    private static boolean zzQ(DocumentBuilder documentBuilder) {
        Paragraph currentParagraph = documentBuilder.getCurrentParagraph();
        CompositeNode ancestor = currentParagraph.getAncestor(18);
        if (currentParagraph.zzZ7D() && ancestor == null) {
            return true;
        }
        zzY1Z.zzZ(documentBuilder.getDocument().getWarningCallback(), 0, "Insertion of style separator allowed in the main text story.", new Object[0]);
        return false;
    }

    public static void zzR(DocumentBuilder documentBuilder) {
        if (zzQ(documentBuilder)) {
            zzY8H zzy8h = new zzY8H();
            zzy8h.zzZwh = documentBuilder;
            if (zzy8h.zzY2a()) {
                zzy8h.zzY2a();
            }
        }
    }

    private static boolean zzWl(Node node) {
        return node.getNodeType() == 28 && zzYVU.zzXR(node);
    }

    private void zzY(zzY8I zzy8i, Node node) {
        while (node != null) {
            if (node.getNodeType() == 8) {
                Paragraph paragraph = (Paragraph) node;
                if (paragraph.isEndOfCell() || (paragraph.isEndOfSection() && zzWl(paragraph.getParentNode()) && paragraph.zzYoV())) {
                    zzy8i.zzY9(null);
                    return;
                }
                zzYEF zzyefZzYp5 = paragraph.zzYp5();
                if (!zzyefZzYp5.zzVE(10) || !zzyefZzYp5.zzVE(130)) {
                    zzy8i.zzY9(paragraph);
                    return;
                }
            }
            node = node.nextPreOrder(this.zzZwh.getDocument());
        }
    }

    private zzY8I zzY29() {
        zzY8I zzy8i = new zzY8I();
        zzY(zzy8i, this.zzZwh.getCurrentParagraph());
        if (zzy8i.zzY2g() == null) {
            return zzy8i;
        }
        zzZ(zzy8i, zzy8i.zzY2g());
        return zzy8i;
    }

    private boolean zzY2a() {
        zzY8I zzy8iZzY29 = zzY29();
        Paragraph paragraphZzY2g = zzy8iZzY29.zzY2g();
        Paragraph paragraphZzY2f = zzy8iZzY29.zzY2f();
        if (paragraphZzY2g == null || paragraphZzY2f == null) {
            return false;
        }
        zzY7(paragraphZzY2g);
        if (paragraphZzY2f.getParentNode() == null) {
            if (zzy8iZzY29.zzY2d() != null) {
                zzy8iZzY29.zzY2e().insertBefore(paragraphZzY2f, zzy8iZzY29.zzY2d());
            } else if (zzy8iZzY29.zzY2c() != null) {
                zzy8iZzY29.zzY2e().insertAfter(paragraphZzY2f, zzy8iZzY29.zzY2c());
            }
        }
        zzZ(zzy8iZzY29);
        return zzy8iZzY29.zzY2b();
    }

    private boolean zzY6(Paragraph paragraph) {
        if (!com.aspose.words.internal.zzZKO.zzA(this.zzZwh.getCurrentParagraph(), paragraph) || !isAtEndOfParagraph()) {
            return false;
        }
        CompositeNode parentNode = paragraph.getParentNode();
        return (parentNode.getNodeType() == 28 && parentNode.zzZYs() == paragraph) ? false : true;
    }

    private static void zzY7(Paragraph paragraph) {
        paragraph.zzYp5().set(10, zzZU.zzZF6);
        paragraph.zzYp5().set(130, zzZU.zzZF6);
    }

    private void zzZ(zzY8I zzy8i) {
        Paragraph paragraphZzY2f = zzy8i.zzY2f();
        Run runZzYVe = paragraphZzY2f.zzYVe();
        boolean z = false;
        boolean z2 = runZzYVe != null && com.aspose.words.internal.zzZYD.zzXk(runZzYVe.getText());
        if (z2 && com.aspose.words.internal.zzZKN.zzS(runZzYVe.getText(), zzX92, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            z = true;
        }
        if (!zzy8i.zzY2b() && (!paragraphZzY2f.isEndOfCell() || !paragraphZzY2f.zzYoV())) {
            if (!z2) {
                paragraphZzY2f.appendChild(new Run(this.zzZwh.getDocument(), zzX92));
            }
            if (!com.aspose.words.internal.zzZKN.zzS(paragraphZzY2f.zzYVe().getText(), zzX92, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                paragraphZzY2f.prependChild(new Run(this.zzZwh.getDocument(), zzX92));
            }
        }
        if (zzY6(zzy8i.zzY2g())) {
            if (!z2) {
                moveTo(paragraphZzY2f);
            } else if (!z || zzy8i.zzY2b()) {
                moveTo(paragraphZzY2f.getRuns().get(1));
            } else {
                moveTo(paragraphZzY2f.zzYVe());
            }
        }
    }

    private void zzZ(zzY8I zzy8i, Node node) {
        while (node != null) {
            if (node.getNodeType() == 5) {
                zzy8i.zzPZ(false);
            }
            if (zzWl(node)) {
                zzy8i.zzPZ(!zzy8i.zzY2g().zzYoW());
                if (!zzy8i.zzY2b()) {
                    zzy8i.zzWn(node);
                    zzy8i.zzY8(new Paragraph(this.zzZwh.getDocument()));
                    zzy8i.zzH(node.getParentNode());
                    return;
                } else if (zzY6(zzy8i.zzY2g())) {
                    return;
                }
            }
            boolean z = zzy8i.zzY2g() == node;
            if (node.getNodeType() == 8 && (!z || zzy8i.zzY2g().isEndOfSection())) {
                if (z) {
                    zzy8i.zzY8(new Paragraph(this.zzZwh.getDocument()));
                    zzy8i.zzWm(node);
                } else {
                    zzy8i.zzY8((Paragraph) node);
                }
                zzy8i.zzH(node.getParentNode());
                return;
            }
            node = node.nextPreOrder(this.zzZwh.getDocument());
        }
    }
}
