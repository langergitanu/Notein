package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzYAB {
    private boolean zzWD;
    private boolean zzXc1;
    private boolean zzXc2;
    private zzYMK zzXc3;
    private zzZQ zzXc4;
    private CompatibilityOptions zzXc5;
    private boolean zzYQw;
    private zzZ6R zzYj1;
    private zzX6 zzZEX;
    private HashMap<zzY9O, zzZ32> zzXc0 = new HashMap<>();
    private com.aspose.words.internal.zzD3<zzYAP> zzXbZ = new com.aspose.words.internal.zzD3<>();
    private ArrayList<zzYAU> zzXl = new ArrayList<>();

    public zzYAB(Document document, zzZ6R zzz6r, zzX6 zzx6) {
        this.zzZEX = zzx6;
        this.zzYj1 = zzz6r;
        this.zzXc4 = new zzZQ(document, this.zzZEX, this.zzYj1);
        this.zzXc3 = new zzYMK(this.zzZEX, this.zzYj1);
        this.zzXc5 = document.getCompatibilityOptions();
    }

    private zzYAS zzYk(Paragraph paragraph) {
        zzYAS zzyas = new zzYAS(21577, paragraph);
        zzyas.zzX(this.zzXc4.zzX((Node) paragraph));
        return zzyas;
    }

    private zzYAS zzYl(Paragraph paragraph) {
        zzYAS zzyas = new zzYAS(21857, paragraph);
        if (paragraph.zzYBd().getNodeType() == 3) {
            zzyas.zzX(zzZ35.zzZ(this.zzXc4.zzZ((Section) paragraph.zzYBd().getParentNode())));
        }
        return zzyas;
    }

    private zzYAS zzYm(Paragraph paragraph) throws Exception {
        zzYAS zzyas = new zzYAS(21639, paragraph);
        if (paragraph.zzYBd() instanceof Body) {
            zzyas.zzV(zzZ3A.zzW(this.zzXc4.zzZ(paragraph.zzYBb())));
            zzyas.zzX(zzZ35.zzZ(this.zzXc4.zzZ((Section) paragraph.zzYBd().getParentNode())));
        }
        return zzyas;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzYAU zzZ(int i, String str, int i2, Inline inline) throws Exception {
        if (i == 21514 && inline.zzZYh().zzZUF() != 0) {
            i = 21513;
        }
        int i3 = i != 21537 ? i : 21514;
        if (i3 == 9217) {
            return (inline != null && inline.getNodeType() == 26 && (str.charAt(0) == 5 || str.charAt(0) == 2)) ? new zzY9Z(inline) : new zzY9S(str, i2);
        }
        if (i3 != 9238 && i3 != 9250 && i3 != 9747) {
            if (i3 == 10754) {
                return new zzY9W(str.length());
            }
            if (i3 != 11799) {
                if (i3 == 12803) {
                    return zzY9U.zzx(inline);
                }
                if (i3 != 21779 && i3 != 21788) {
                    if (i3 == 9244) {
                        return new zzYA1();
                    }
                    if (i3 == 9245) {
                        return new zzYA2();
                    }
                    if (i3 != 11284 && i3 != 11285) {
                        switch (i3) {
                            case 9752:
                            case 9753:
                                break;
                            case 9754:
                                return new zzYAJ(str);
                            default:
                                switch (i3) {
                                    default:
                                        switch (i3) {
                                            case 10782:
                                            case 10783:
                                            case 10784:
                                            case 10785:
                                                break;
                                            default:
                                                switch (i3) {
                                                    case 21513:
                                                    case 21514:
                                                    case 21515:
                                                        break;
                                                    default:
                                                        throw new IllegalStateException("Unrecognized span type, " + Integer.toString(i3));
                                                }
                                                break;
                                        }
                                    case 10768:
                                    case 10769:
                                    case 10770:
                                        return new zzY9V(i3);
                                }
                                break;
                        }
                    }
                }
                return new zzYAS(i3, null);
            }
        }
        return new zzY9V(i3);
    }

    private zzYAP zzlG(int i) {
        zzYAP zzyap = this.zzXbZ.get(i);
        if (zzyap != null) {
            return zzyap;
        }
        zzYAP zzyap2 = new zzYAP();
        this.zzXbZ.add(i, zzyap2);
        return zzyap2;
    }

    private zzYAS zzp(Row row) {
        row.getLastCell().getLastParagraph();
        zzYAS zzyas = new zzYAS(row.isLastRow() ? 21595 : 21586, row.getLastCell().getLastParagraph());
        zzyas.zzY(this.zzXc4.zzZ(row));
        if (row.isLastRow()) {
            zzyas.zzY(this.zzXc4.zzZ((Table) row.zzYBd()));
        }
        return zzyas;
    }

    public final CompatibilityOptions getCompatibilityOptions() {
        return this.zzXc5;
    }

    public final void zzQt(boolean z) {
        this.zzXc1 = z;
    }

    public final void zzQu(boolean z) {
        this.zzWD = z;
    }

    public final void zzQv(boolean z) {
        this.zzYQw = z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzYAU zzWw(Node node) throws Exception {
        zzYAU zzyat;
        int nodeType = node.getNodeType();
        if (nodeType == 9 || nodeType == 10) {
            zzyat = new zzYAT(node);
        } else {
            if (nodeType == 27) {
                return null;
            }
            if (nodeType != 28) {
                switch (nodeType) {
                    case 17:
                    case 18:
                        zzYAU zzy9x = new zzY9X(node);
                        zzy9x.zzY(this.zzXc4.zzY(node));
                        zzyat = zzy9x;
                        break;
                    case 19:
                        zzYAQ zzyaq = new zzYAQ();
                        zzYAP zzyapZzlG = zzlG(((zzZA1) node).getIdInternal());
                        zzyapZzlG.zzJ((Comment) node);
                        zzyapZzlG.zzZ(zzyaq, 1);
                        zzyat = zzyaq;
                        break;
                    case 20:
                        zzyat = new zzYAD((Footnote) node);
                        break;
                    default:
                        switch (nodeType) {
                            case 22:
                            case 23:
                            case 24:
                                zzyat = new zzYAH((FieldChar) node);
                                break;
                            case 25:
                                zzyat = new zzYAC((FormField) node);
                                break;
                            default:
                                switch (nodeType) {
                                    case 33:
                                        zzYAP zzyapZzlG2 = zzlG(((zzZA1) node).getIdInternal());
                                        zzYAQ zzyaq2 = new zzYAQ();
                                        zzyapZzlG2.zzZ(zzyaq2, 2);
                                        zzyat = zzyaq2;
                                        break;
                                    case 34:
                                        zzYAP zzyapZzlG3 = zzlG(((zzZA1) node).getIdInternal());
                                        zzYAQ zzyaq3 = new zzYAQ();
                                        zzyapZzlG3.zzZ(zzyaq3, 3);
                                        zzyat = zzyaq3;
                                        break;
                                    case 35:
                                        break;
                                    default:
                                        throw new IllegalArgumentException("The node cannot be used to generate span.\r\nParameter name: node");
                                }
                                break;
                        }
                        break;
                }
            } else {
                zzyat = new zzY9Y((StructuredDocumentTag) node);
            }
        }
        zzyat.zzlT(zzYVU.zzXX(node));
        zzyat.zzU(zzZ32.zzW(this.zzXc4.zzZ(node)));
        zzZ(node, zzyat);
        return zzyat;
    }

    public final zzYA5 zzWx(Node node) throws Exception {
        Paragraph paragraph = (Paragraph) node;
        zzZ32 zzz32ZzY = this.zzXc4.zzY(paragraph);
        zzYA5 zzya5 = new zzYA5(paragraph);
        zzya5.zzU(zzZ32.zzW(zzz32ZzY));
        zzya5.zzlT(zzYVU.zzXX(paragraph));
        return zzya5;
    }

    public final zzYAS zzWy(Node node) throws Exception {
        zzYAS zzyasZzYm;
        if (6 == node.getNodeType()) {
            zzyasZzYm = zzp((Row) node);
        } else {
            Paragraph paragraph = (Paragraph) node;
            boolean z = paragraph.zzYB4() == null;
            zzyasZzYm = (z && (paragraph.isEndOfHeaderFooter() || paragraph.zzYp0() || paragraph.isEndOfDocument())) ? zzYm(paragraph) : (z && (paragraph.isEndOfSection() || paragraph.zzYp3() || paragraph.zzYp2() || paragraph.zzYp1())) ? zzYl(paragraph) : paragraph.isEndOfCell() ? zzYk(paragraph) : new zzYAS(21537, paragraph);
        }
        zzZ32 zzz32ZzZ = this.zzXc4.zzZ(node);
        zzyasZzYm.zzX(zzZ37.zzY(this.zzXc3.zzXf(node)));
        if (node.getNodeType() == 6) {
            zzz32ZzZ.isHidden(zzyasZzYm.zzYk1().isHidden());
        } else if (!((Paragraph) node).isEndOfCell() && zzyasZzYm.zzY6c().zzYLJ().zzYMb()) {
            zzz32ZzZ.isHidden(false);
        }
        zzyasZzYm.zzU(zzZ32.zzW(zzz32ZzZ));
        zzyasZzYm.zzlT(zzYVU.zzXX(node));
        zzZ(node, zzyasZzYm);
        this.zzXc2 = false;
        return zzyasZzYm;
    }

    public final ArrayList<zzYAU> zzY(Inline inline, String str, boolean z) throws Exception {
        if (!zzZ(inline, str)) {
            return null;
        }
        if (str == null) {
            str = inline.getText();
        }
        int iZzXX = zzYVU.zzXX(inline);
        zzYEF zzyefZzZ = this.zzXc4.zzZ(inline);
        zzZYP zzzyp = new zzZYP(inline, zzyefZzZ, str, this);
        this.zzXl.clear();
        this.zzXc0.clear();
        while (zzzyp.moveNext()) {
            zzYAU zzyauZzZ = zzZ(zzzyp.zzZo6(), zzzyp.getText(), zzzyp.zzZg() == 1 ? 2 : 0, inline);
            zzyauZzZ.zzlY(zzzyp.zzZo2());
            zzY9O zzy9oZzZo3 = zzzyp.zzZo3();
            zzy9oZzZo3.zzTC(zzZ3X.zzwJ(zzyauZzZ.zzZo2()));
            zzZ32 zzz32ZzW = (zzZ32) com.aspose.words.internal.zzQW.zzZ(this.zzXc0, zzy9oZzZo3);
            if (zzz32ZzW == null) {
                zzz32ZzW = zzZ32.zzW(this.zzXc4.zzZ(inline, zzyefZzZ, zzy9oZzZo3));
                com.aspose.words.internal.zzZQF.zzY(this.zzXc0, zzy9oZzZo3, zzz32ZzW);
            }
            zzyauZzZ.zzU(zzz32ZzW);
            zzyauZzZ.zzlT(iZzXX);
            zzyauZzZ.zzQH(z);
            com.aspose.words.internal.zzZQG.zzZ(this.zzXl, zzyauZzZ);
        }
        this.zzXc2 |= zzzyp.zzZo5();
        return this.zzXl;
    }

    public final boolean zzY5o() {
        return this.zzXc2;
    }

    public final zzZQ zzY5p() {
        return this.zzXc4;
    }

    public final zzZ6R zzYTR() {
        return this.zzYj1;
    }

    public final boolean zzZng() {
        return this.zzYQw;
    }

    public final boolean zzZnh() {
        return this.zzWD;
    }

    private static boolean zzZ(Inline inline, String str) {
        if (inline.getNodeType() == 21 && com.aspose.words.internal.zzZYD.zzXk(str)) {
            return true;
        }
        return inline.getNodeType() != 21 && inline.zz0R() > 0;
    }

    private void zzZ(Node node, zzYAU zzyau) {
        LayoutCollector layoutCollectorZzYSQ = this.zzYj1.zzYSQ();
        if (layoutCollectorZzYSQ != null) {
            layoutCollectorZzYSQ.zzZ(node, zzyau);
        }
    }
}
