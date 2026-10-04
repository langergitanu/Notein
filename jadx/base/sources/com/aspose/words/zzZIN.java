package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZIN extends DocumentVisitor {
    private int zzYrg;
    private zzZIO zzYrh;
    private zzZ1I zzYrj;
    private boolean zzYrk;
    private int zzYrl;
    private int zzYrm;
    private ArrayList<zzZIO> zzYKL = new ArrayList<>();
    private com.aspose.words.internal.zzZYG<zzZIO> zzYri = new com.aspose.words.internal.zzZYG<>(false);

    public zzZIN(int i, int i2, boolean z, zzZ1I zzz1i) {
        this.zzYrm = i;
        this.zzYrl = i2;
        this.zzYrk = z;
        this.zzYrj = zzz1i;
        zzZ2Y();
    }

    private void zzP(Inline inline) {
        if (zzZ2W()) {
            int i = this.zzYrm;
            if ((i & 3) == 0) {
                return;
            }
            String text = inline.getText();
            int length = text.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = text.charAt(i2);
                if (cCharAt != '\f') {
                    if (cCharAt == 14 && (i & 2) != 0) {
                        zzZ(inline, i2, length);
                    }
                } else if ((i & 1) != 0) {
                    zzZ(inline, i2, length);
                }
            }
        }
    }

    private boolean zzY(ParagraphFormat paragraphFormat) {
        int iZzZ7j = paragraphFormat.zzZ7j();
        return zzY8O.zzkF(iZzZ7j) && iZzZ7j <= this.zzYrl;
    }

    private void zzZ(Node node, int i, Node node2, int i2) {
        this.zzYKL.size();
        this.zzYKL.get(r0.size() - 1);
        if (i == 0 && this.zzYrh.zzYrr == 0) {
            Node node3 = node;
            for (CompositeNode parentNode = node.getParentNode(); parentNode != null && zzY(parentNode, node3); parentNode = parentNode.getParentNode()) {
                if (parentNode == this.zzYrh.zzYrs) {
                    return;
                }
                node3 = parentNode;
            }
        }
        zzZIO zzzio = this.zzYrh;
        zzzio.zzYrq = node;
        zzzio.zzYrp = i;
        if (node2 != null) {
            zzZIO zzzio2 = new zzZIO();
            zzzio2.zzYrs = node2;
            zzzio2.zzYrr = i2;
            this.zzYrh = zzzio2;
            com.aspose.words.internal.zzZQG.zzZ(this.zzYKL, zzzio2);
        }
    }

    private boolean zzZ2W() {
        return !isLocked() && this.zzYrg <= 0;
    }

    private void zzZ2X() {
        this.zzYrg--;
    }

    private void zzZ2Y() {
        this.zzYrg++;
    }

    private static boolean zzZY(Paragraph paragraph) {
        return com.aspose.words.internal.zzZKN.zzTX(paragraph.zzZYo()).length() == 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBodyEnd(Body body) {
        zzZ2Y();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBodyStart(Body body) {
        zzZ2X();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBookmarkStart(BookmarkStart bookmarkStart) {
        if (isLocked()) {
            return 0;
        }
        this.zzYri.set(bookmarkStart.getName(), this.zzYrh);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentEnd(Comment comment) {
        zzZ2X();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentStart(Comment comment) {
        zzZ2Y();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldEnd(FieldEnd fieldEnd) {
        if (fieldEnd.hasSeparator() && !this.zzYrj.zz5(fieldEnd.getField())) {
            return 0;
        }
        unlock();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldSeparator(FieldSeparator fieldSeparator) {
        if (this.zzYrj.zz5(fieldSeparator.getField())) {
            return 0;
        }
        unlock();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldStart(FieldStart fieldStart) {
        lock();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFootnoteEnd(Footnote footnote) {
        zzZ2X();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFootnoteStart(Footnote footnote) {
        zzZ2Y();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphStart(Paragraph paragraph) {
        if (zzZ2W()) {
            int i = this.zzYrm;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 8) != 0;
            if (z || z2) {
                ParagraphFormat paragraphFormat = paragraph.getParagraphFormat();
                if ((z && paragraphFormat.getPageBreakBefore()) || (z2 && zzY(paragraphFormat) && !zzZY(paragraph))) {
                    if (this.zzYrk) {
                        zzYMX zzymxZzZI = zzZDY.zzZI(paragraph);
                        Paragraph paragraph2 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(paragraph.zzYB6(), Paragraph.class);
                        zzYMX zzymxZzZI2 = zzZDY.zzZI(paragraph2);
                        zzYMX zzymx = zzymxZzZI;
                        Paragraph paragraph3 = paragraph;
                        Paragraph paragraph4 = paragraph2;
                        while (!zzZDY.zzX(paragraph4, zzymxZzZI2, paragraph3, zzymx) && zzZY(paragraph4)) {
                            Paragraph paragraph5 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(paragraph4.zzYB6(), Paragraph.class);
                            zzYMX zzymxZzZI3 = zzZDY.zzZI(paragraph5);
                            paragraph3 = paragraph4;
                            paragraph4 = paragraph5;
                            zzymx = zzymxZzZI2;
                            zzymxZzZI2 = zzymxZzZI3;
                        }
                        zzZ(paragraph3, 0, paragraph3, 0);
                    } else {
                        zzZ(paragraph, 0, paragraph, 0);
                    }
                }
            }
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRun(Run run) {
        zzP(run);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSectionStart(Section section) {
        if (section.zz9I()) {
            zzZIO zzzio = new zzZIO();
            this.zzYrh = zzzio;
            zzzio.zzYrs = section;
            com.aspose.words.internal.zzZQG.zzZ(this.zzYKL, zzzio);
        } else if (!isLocked()) {
            int i = this.zzYrm;
            boolean z = true;
            boolean z2 = (i & 4) != 0;
            if (!z2 && (i & 3) != 0) {
                int sectionStart = section.getPageSetup().getSectionStart();
                if (((i & 1) == 0 || (sectionStart != 2 && sectionStart != 4 && sectionStart != 3)) && ((i & 2) == 0 || sectionStart != 1)) {
                    z = false;
                }
                z2 = z;
            }
            if (z2) {
                zzZ(section, 0, section, 0);
            }
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitShapeEnd(Shape shape) {
        zzZ2X();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitShapeStart(Shape shape) {
        zzZ2Y();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSpecialChar(SpecialChar specialChar) {
        zzP(specialChar);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitTableEnd(Table table) {
        zzZ2X();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitTableStart(Table table) {
        zzZ2Y();
        return 0;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
        java.lang.IllegalArgumentException: Illegal Capacity: -1
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
        	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final void zzF(
    /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
        java.lang.IllegalArgumentException: Illegal Capacity: -1
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
        	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public final zzZIO zzKP(String str) {
        return this.zzYri.get(str);
    }

    public final zzZIO zzzL(int i) {
        return this.zzYKL.get(i);
    }

    public final boolean zzzM(int i) {
        return i >= 0 && i < this.zzYKL.size();
    }

    private static boolean zzY(CompositeNode compositeNode, Node node) {
        node.getParentNode();
        for (Node firstChild = compositeNode.getFirstChild(); firstChild != node; firstChild = firstChild.getNextSibling()) {
            int nodeType = firstChild.getNodeType();
            if (nodeType == 5 || nodeType == 8 || nodeType == 17 || nodeType == 18 || nodeType == 21 || nodeType == 26) {
                return false;
            }
        }
        return true;
    }

    private void zzZ(Node node, int i, int i2) {
        Node nextSibling;
        int i3 = i + 1;
        if (i3 >= i2) {
            nextSibling = node.getNextSibling();
            for (CompositeNode parentNode = node.getParentNode(); nextSibling == null && parentNode != null; parentNode = parentNode.getParentNode()) {
                nextSibling = parentNode.getNextSibling();
            }
            i3 = 0;
        } else {
            nextSibling = node;
        }
        zzZ(node, i, nextSibling, i3);
    }
}
