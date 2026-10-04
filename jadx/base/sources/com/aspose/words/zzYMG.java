package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYMG implements zzZ8Z {
    private static int[] zzXG1 = {30, 40};
    private Node zzXG2;
    private Node zzXG3;
    private boolean zzXG4;
    private zzYWB zzXG5;
    private Paragraph zzYtC;
    private int zzYw;

    public zzYMG(Paragraph paragraph, zzYMF zzymf) {
        this.zzYtC = paragraph;
        this.zzYw = zzymf.getLevel();
        this.zzXG2 = zzymf.getFirstChild();
        this.zzXG3 = zzymf.getLastChild();
        if (zzymf.zzYo2()) {
            return;
        }
        if (this.zzXG2 == null) {
            this.zzXG2 = paragraph.zzZYv();
        }
        if (this.zzXG3 == null) {
            this.zzXG3 = paragraph.zzZYu();
        }
    }

    private static boolean zzY(FieldChar fieldChar, int i) {
        return i == 0 && zzZPU.zzD9(fieldChar.getFieldType()) && !fieldChar.zzYUU();
    }

    private static boolean zzY5(char c) {
        return (com.aspose.words.internal.zzZKU.zzG(c) || c == '\f' || c == 14) ? false : true;
    }

    private Node zzYo3() {
        return zzZ(-1, this.zzXG3, this.zzXG2);
    }

    private Node zzYo4() {
        return zzZ(1, this.zzXG2, this.zzXG3);
    }

    private void zzYo5() {
        if (this.zzXG4) {
            return;
        }
        this.zzXG4 = true;
        Node nodeZzYo4 = zzYo4();
        Node nodeZzYo3 = zzYo3();
        if (nodeZzYo4 != null && nodeZzYo3 != null) {
            this.zzXG5 = new zzYWB(nodeZzYo4, nodeZzYo3);
            return;
        }
        if (this.zzYtC.zzYoX() && !this.zzYtC.getParagraphBreakFont().getHidden()) {
            if (this.zzYtC.zzYB4() == null && this.zzYtC.getParentSection().zzYB3() && !this.zzYtC.zzZYw()) {
                return;
            }
            Paragraph paragraph = this.zzYtC;
            this.zzXG5 = new zzYWB(paragraph, paragraph);
        }
    }

    private zzYEF zzYo6() {
        zzYEF zzyef = (zzYEF) this.zzYtC.getListLabel().zzU(true, 8).zzbn();
        for (int i : zzXG1) {
            zzyef.remove(i);
        }
        return zzyef;
    }

    private static void zzZ(Node node, BookmarkStart bookmarkStart) {
        while (node.getParentNode().getNodeType() != 8) {
            node = node.getParentNode();
        }
        node.zzYC(bookmarkStart);
    }

    private static int zzZ7(String str, int i) {
        int length;
        int length2;
        boolean zZzY5 = false;
        if (i == -1) {
            length = str.length() - 1;
            length2 = -1;
        } else {
            if (i != 1) {
                throw new IllegalArgumentException("step");
            }
            length2 = str.length();
            length = 0;
        }
        while (length != length2) {
            zZzY5 = zzY5(str.charAt(length));
            if (zZzY5) {
                break;
            }
            length += i;
        }
        if (zZzY5) {
            return length;
        }
        return -1;
    }

    private zzYWB zzZc0() {
        zzYo5();
        return this.zzXG5;
    }

    @Override // com.aspose.words.zzZ8Z
    public final String getDocumentOutlineTitle() {
        if (((Integer) this.zzYtC.zzWm(1280, 1)).intValue() == 9) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        zzYWB zzywbZzZc0 = zzZc0() != null ? zzZc0() : zzYWB.zzXV4;
        zzYVX zzyvx = new zzYVX();
        zzyvx.zzSC(false);
        zzyvx.zzSD(true);
        String strZzZ = com.aspose.words.internal.zzZKN.zzZ(com.aspose.words.internal.zzZKN.zzTX(zzYVY.zzZ(zzywbZzZc0, zzyvx)), ControlChar.LINE_BREAK_CHAR, ControlChar.SPACE_CHAR);
        if (this.zzYtC.zzYoX()) {
            com.aspose.words.internal.zzZNH.zzU(sb, this.zzYtC.getListLabel().zzYOt());
        }
        if (this.zzYtC.zzYoX() && !com.aspose.words.internal.zzZKN.zzU3(strZzZ)) {
            int trailingCharacter = this.zzYtC.getListFormat().zzYOJ().getTrailingCharacter();
            if (trailingCharacter == 0) {
                com.aspose.words.internal.zzZNH.zzU(sb, ControlChar.TAB);
            } else {
                if (trailingCharacter != 1 && trailingCharacter != 2) {
                    throw new IllegalArgumentException();
                }
                sb.append(ControlChar.SPACE_CHAR);
            }
        }
        com.aspose.words.internal.zzZNH.zzU(sb, strZzZ);
        return sb.toString();
    }

    @Override // com.aspose.words.zzZ8Z
    public final zzYWB getLabelRange() {
        String str;
        if (!this.zzYtC.zzYoX()) {
            return null;
        }
        Run run = new Run(this.zzYtC.zzYBb(), com.aspose.words.internal.zzZKN.zzTX(this.zzYtC.getListLabel().zzYOt()), zzYo6());
        Paragraph paragraph = new Paragraph(this.zzYtC.zzYBb());
        paragraph.getParagraphFormat().setStyle(this.zzYtC.zzqy(1));
        paragraph.appendChild(run);
        int trailingCharacter = this.zzYtC.getListFormat().zzYOJ().getTrailingCharacter();
        if (trailingCharacter == 0) {
            str = ControlChar.TAB;
        } else {
            if (trailingCharacter != 1 && trailingCharacter != 2) {
                throw new IllegalArgumentException();
            }
            str = ControlChar.zzZs5;
        }
        Run run2 = new Run(this.zzYtC.zzYBb(), str, zzYo6());
        paragraph.appendChild(run2);
        return new zzYWB(run, run2);
    }

    @Override // com.aspose.words.zzZ8Z
    public final int getLevel() {
        return this.zzYw;
    }

    @Override // com.aspose.words.zzZ8Z
    public final boolean getOmitPageNumber() {
        return false;
    }

    @Override // com.aspose.words.zzZ8Z
    public final int getPageNumber() {
        throw new IllegalStateException();
    }

    @Override // com.aspose.words.zzZ8Z
    public final Paragraph getParagraph() {
        return this.zzYtC;
    }

    @Override // com.aspose.words.zzZ8Z
    public final int getSequenceValue(String str) {
        throw new IllegalStateException();
    }

    @Override // com.aspose.words.zzZ8Z
    public final boolean hasBookmark() {
        return true;
    }

    @Override // com.aspose.words.zzZ8Z
    public final zzYWB insertBookmark(String str) {
        zzYWB zzywbZzZc0 = zzZc0();
        if (zzywbZzZc0 == null) {
            return null;
        }
        BookmarkStart bookmarkStart = new BookmarkStart(this.zzYtC.zzYBb(), str);
        BookmarkEnd bookmarkEnd = new BookmarkEnd(this.zzYtC.zzYBb(), str);
        if (zzywbZzZc0.zzYA2().getNode().getNodeType() == 8) {
            ((Paragraph) zzywbZzZc0.zzYA2().getNode()).appendChild(bookmarkStart);
            ((Paragraph) zzywbZzZc0.zzYA2().getNode()).appendChild(bookmarkEnd);
        } else {
            zzZ(zzywbZzZc0.zzYA2().getNode(), bookmarkStart);
            zzZ(zzywbZzZc0.zzYA1().getNode(), bookmarkEnd);
        }
        return Bookmark.zzZ(bookmarkStart, bookmarkEnd);
    }

    @Override // com.aspose.words.zzZ8Z
    public final boolean isInFieldCode() {
        return false;
    }

    private static void zzZ(Node node, BookmarkEnd bookmarkEnd) {
        while (node.getParentNode().getNodeType() != 8) {
            node = node.getParentNode();
        }
        node.zzYD(bookmarkEnd);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0075 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Node zzZ(int i, Node node, Node node2) {
        int iZzZ7;
        boolean z = false;
        int i2 = 0;
        while (node != null && !z) {
            int nodeType = node.getNodeType();
            if (nodeType != 17) {
                if (nodeType != 18) {
                    if (nodeType != 35) {
                        switch (nodeType) {
                            case 21:
                                if (i2 == 0) {
                                    Run run = (Run) node;
                                    if (!run.zzYUU() && (iZzZ7 = zzZ7(run.getText(), i)) != -1) {
                                        zzZ(run, i, iZzZ7);
                                        return run;
                                    }
                                }
                                z = node == node2;
                                if (i == 1) {
                                    node = node.zzYB7();
                                } else {
                                    node = node.zzYB8();
                                }
                                break;
                            case 22:
                                if (i != 1 || !zzY((FieldStart) node, i2)) {
                                    i2++;
                                    if (node == node2) {
                                    }
                                    if (i == 1) {
                                    }
                                }
                                break;
                            case 23:
                                i2--;
                                if (node == node2) {
                                }
                                if (i == 1) {
                                }
                                break;
                            case 24:
                                FieldEnd fieldEnd = (FieldEnd) node;
                                if (!fieldEnd.hasSeparator()) {
                                    if (i == -1 && zzY(fieldEnd, i2)) {
                                    }
                                    i2--;
                                }
                                if (node == node2) {
                                }
                                if (i == 1) {
                                }
                                break;
                            default:
                                if (node == node2) {
                                }
                                if (i == 1) {
                                }
                                break;
                        }
                    }
                    return node;
                }
                if (((Shape) node).isInline()) {
                    return node;
                }
                if (node == node2) {
                }
                if (i == 1) {
                }
            } else {
                if (((GroupShape) node).isInline()) {
                    return node;
                }
                if (node == node2) {
                }
                if (i == 1) {
                }
            }
        }
        return null;
    }

    private static void zzZ(Run run, int i, int i2) {
        if (i == 1) {
            run.zzng(i2);
        } else {
            run.zznf(i2 + 1);
        }
    }
}
