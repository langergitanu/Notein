package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.miui.penengine.p596e.C18773h;
import com.orion.penkit.tools.DrawToolFactory;

/* JADX INFO: loaded from: classes6.dex */
final class zzYP5 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW(ContextChain.TAG_PRODUCT, C18773h.f57233c, "list", "table", "index-title", "section", "control", "tracked-changes", "change", "change-start", "change-end", "user-field-decls", "calculation-settings", "consolidation", "content-validations", "database-ranges", "data-pilot-tables", "dde-links", "label-ranges", "named-expressions", "alphabetical-index-auto-mark-file", "dde-connection-decls", "numbered-paragraph", "page-sequence", "sequence-decls", "soft-page-break", "variable-decls", "annotation", "cell-range-source", "detective", "dde-source", "section-source", "name", "protected", "protection-key", "protection-key-digest-algorithm", "style-name", "id", "a", "g", "line", "connector", DrawToolFactory.LASSO_TYPE_RECT, "circle", "ellipse", "polyline", "polygon", "regular-polygon", "path", "page-thumbnail", "measure", "caption", "scene", "custom-shape");

    private static boolean zzT(zzYQ7 zzyq7, CompositeNode compositeNode) {
        if (zzZX(zzyq7)) {
            return (compositeNode == null || (compositeNode instanceof Body)) ? false : true;
        }
        return true;
    }

    private static void zzU(zzYQ7 zzyq7, CompositeNode compositeNode) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                    zzyq7.zzZ(256, false, "text:index-title");
                    break;
                default:
                    zzyq7.zzYi("text:index-title", zzyq9ZzYuT.getLocalName());
                    break;
            }
        }
        zzZ(zzyq7, "index-title", compositeNode);
    }

    private static Section zzV(zzYQ7 zzyq7, zzYR0 zzyr0) {
        Section sectionPeek = zzyq7.zzYuL().peek();
        Section sectionDeepClone = sectionPeek.deepClone();
        zzyr0.zzYBx().zzYvR().zzY(sectionDeepClone.zzYvR());
        zzY((zzYCZ) sectionPeek.zzYvR().zzbn(), sectionDeepClone.zzYvR());
        zzyq7.getDocument().getSections().add(sectionDeepClone);
        return sectionDeepClone;
    }

    private static Section zzY(zzYQ7 zzyq7, zzYR0 zzyr0, CompositeNode compositeNode) {
        Section lastSection = zzyq7.getDocument().getLastSection();
        boolean zZzU = zzU(zzyq7, zzyr0);
        boolean zZzT = zzT(zzyq7, zZzU);
        if (!zzZ(zzyq7, compositeNode, zZzT)) {
            return lastSection;
        }
        Section sectionZzZ = zzyq7.zzYuL().size() == 0 ? zzZ(zzyq7, zzyr0, zZzT, lastSection) : zzV(zzyq7, zzyr0);
        boolean z = false;
        sectionZzZ.zzYvR().setSectionStart(zzU(zzyq7, zZzU) ? 2 : 0);
        zzZ(zzyq7, zzyr0, sectionZzZ);
        zzYPP zzyppZzY = zzyq7.zzYuS().zzY(zzyq7.zzYuP(), null, zzyq7.zzYuO(), true);
        if (zzyppZzY instanceof zzYQK) {
            return sectionZzZ;
        }
        zzYPQ zzypq = (zzYPQ) zzyppZzY;
        zzyq7.zzE4(zzypq != null ? zzypq.zzYu6() : "Standard");
        if (!"Standard".equals(zzyq7.zzYuP()) && (zzypq instanceof zzYQB) && com.aspose.words.internal.zzZYD.zzXk(zzypq.zzYu6())) {
            z = true;
        }
        zzyq7.zzSb(z);
        return sectionZzZ;
    }

    public static void zzZ(zzYQ7 zzyq7, String str, CompositeNode compositeNode) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ(str)) {
            zzyq7.zzE5(zzYOU.zzDr(zzyq9ZzYuT.zzV("style-name", "Standard")));
            zzYR0 zzyr0ZzZW = zzZW(zzyq7);
            compositeNode = zzZ(zzyq7, zzyr0ZzZW, compositeNode);
            if (!zzZ(zzyq7, compositeNode, zzyr0ZzZW, str)) {
                zzyq9ZzYuT.zzk();
            }
        }
    }

    public static zzYR0 zzZW(zzYQ7 zzyq7) {
        zzYPP zzyppZzY = zzyq7.zzYuS().zzY(zzyq7.zzYuP(), null, zzyq7.zzYuO(), true);
        if (zzyppZzY instanceof zzYQK) {
            return zzyq7.zzYuR().zzYvw();
        }
        zzYPQ zzypq = (zzYPQ) zzyppZzY;
        return zzZ(zzyq7.zzYuR(), zzypq != null ? zzypq.zzYu6() : zzyq7.zzYuN());
    }

    private static boolean zzZX(zzYQ7 zzyq7) {
        int iZzTP;
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        if (!zzYOU.zzDJ(zzyq9ZzYuT.getLocalName()) && (iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName())) != 0 && iZzTP != 1 && iZzTP != 2 && iZzTP != 3) {
            switch (iZzTP) {
                default:
                    switch (iZzTP) {
                        case 38:
                            return "draw".equals(zzyq9ZzYuT.getPrefix());
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                            break;
                        default:
                            return false;
                    }
                case 8:
                case 9:
                case 10:
                    return true;
            }
        }
        return true;
    }

    private static void zzg(Document document) {
        PageSetup pageSetup = document.getLastSection().getPageSetup();
        if (pageSetup.getSectionStart() != 0 || document.getSections().getCount() <= 1) {
            return;
        }
        PageSetup pageSetup2 = ((Section) document.getLastSection().zztC(2)).getPageSetup();
        pageSetup.setPageWidth(pageSetup2.getPageWidth());
        pageSetup.setPageHeight(pageSetup2.getPageHeight());
        pageSetup.setTopMargin(pageSetup2.getTopMargin());
        pageSetup.setBottomMargin(pageSetup2.getBottomMargin());
        pageSetup.setLeftMargin(pageSetup2.getLeftMargin());
        pageSetup.setRightMargin(pageSetup2.getRightMargin());
    }

    private static boolean zzT(zzYQ7 zzyq7, boolean z) {
        return zzyq7.zzYuJ() || zzyq7.zzYuK() || z || zzyq7.getDocument().getSections().getCount() == 0;
    }

    private static boolean zzU(zzYQ7 zzyq7, boolean z) {
        return z && (zzyq7.zzYuG() == null || zzyq7.zzYuG().zzYta() || zzyq7.getDocument().getFirstSection().getBody().getChildNodes(0, false).getCount() != 0);
    }

    public static boolean zzZ(zzYQ7 zzyq7, CompositeNode compositeNode, zzYR0 zzyr0, String str) throws Exception {
        String localName = zzyq7.zzYuT().getLocalName();
        if (zzYQ7.zzZ(zzyq7, compositeNode, null, null, str)) {
            return true;
        }
        if (zzYOU.zzDJ(localName)) {
            return zzYP2.zzY(zzyq7, compositeNode, zzyr0, str);
        }
        switch (zzUR.zzTP(localName)) {
            case 0:
            case 1:
                zzYQC.zzZ(zzyq7, localName, compositeNode);
                return true;
            case 2:
                zzYR8.zzZ(zzyq7, compositeNode, null);
                return true;
            case 3:
                zzYPC.zzV(zzyq7, compositeNode);
                return true;
            case 4:
                zzU(zzyq7, compositeNode);
                return true;
            case 5:
                zzYPZ.zzZ(zzyq7, zzyr0, compositeNode, str);
                return true;
            case 6:
                zzYSG.zzZ(zzyq7, compositeNode, null, null);
                return true;
            case 7:
                zzYOX.zzJ(zzyq7);
                return true;
            case 8:
                Paragraph paragraph = new Paragraph(zzyq7.getDocument());
                compositeNode.appendChild(paragraph);
                zzYT9.zzZ(zzyq7, paragraph);
                return true;
            case 9:
                zzYT9.zzY(zzyq7);
                return true;
            case 10:
                zzYT9.zzX(zzyq7);
                return true;
            case 11:
                zzYOV.zzZO(zzyq7);
                return true;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                zzyq7.zzZ(1, true, str);
                return false;
            default:
                return false;
        }
    }

    private static boolean zzU(zzYQ7 zzyq7, zzYR0 zzyr0) {
        String strZzYuN = zzyq7.zzYuN();
        zzYPP zzyppZzY = zzyq7.zzYuS().zzY(zzyq7.zzYuP(), null, zzyq7.zzYuO(), true);
        zzYR0 zzyr0ZzZ = !(zzyppZzY instanceof zzYQK) ? zzZ(zzyq7.zzYuR(), strZzYuN) : null;
        if (!zzZ(zzyq7, zzyppZzY)) {
            return false;
        }
        zzYCZ zzyczZzYvR = zzyr0.zzYBx().zzYvR();
        zzYCZ zzyczZzYvR2 = zzyr0ZzZ != null ? zzyr0ZzZ.zzYBx().zzYvR() : null;
        return zzY(zzyr0, strZzYuN) || zzyq7.zzYuI() || !(zzyczZzYvR2 == null || com.aspose.words.internal.zzZKO.zzA(zzyczZzYvR, zzyczZzYvR2)) || ((zzyppZzY instanceof zzYQB) && ((zzYQB) zzyppZzY).zzYLV());
    }

    private static void zzY(zzYCZ zzycz, zzYCZ zzycz2) {
        if (zzycz.getColumnsCount() == 0) {
            return;
        }
        zzycz2.zzmy(zzycz.getColumnsCount());
        zzycz2.zzY(zzycz.zzYcn());
        zzycz2.zzQZ(zzycz.zzYcp());
        zzycz2.zzR0(zzycz.zzYct());
        zzycz2.zzmx(zzycz.zzYco());
    }

    private static boolean zzY(zzYR0 zzyr0, String str) {
        return (com.aspose.words.internal.zzZKN.equals(zzyr0.getName(), str) || str == null) ? false : true;
    }

    public static CompositeNode zzZ(zzYQ7 zzyq7, zzYR0 zzyr0, CompositeNode compositeNode) {
        if (zzT(zzyq7, compositeNode) || (compositeNode != null && compositeNode == zzyr0.zzYBx().getBody())) {
            return compositeNode;
        }
        Section sectionZzY = zzY(zzyq7, zzyr0, compositeNode);
        zzg(zzyq7.getDocument());
        zzyq7.zzSc(false);
        zzyq7.zzSd(false);
        for (Paragraph paragraph : zzyq7.zzYuH()) {
            if (paragraph.getParentNode() != sectionZzY.getBody()) {
                sectionZzY.getBody().appendChild(paragraph);
            }
        }
        return sectionZzY.getBody();
    }

    private static boolean zzZ(zzYQ7 zzyq7, CompositeNode compositeNode, boolean z) {
        return z || (compositeNode == null && zzyq7.zzYuL().size() == 0);
    }

    private static Section zzZ(zzYQ7 zzyq7, zzYR0 zzyr0, boolean z, Section section) {
        if (!z) {
            return section;
        }
        Section sectionZzY = zzYPZ.zzY(zzyr0);
        zzyq7.getDocument().getSections().add(sectionZzY);
        return sectionZzY;
    }

    private static boolean zzZ(zzYQ7 zzyq7, zzYPP zzypp) {
        return (zzypp == null || (zzypp instanceof zzYQK) || zzyq7.zzYuR().zzEq(((zzYPQ) zzypp).zzYu6()) == null) ? false : true;
    }

    private static void zzZ(zzYQ7 zzyq7, zzYR0 zzyr0, Section section) {
        zzYQK zzyqk = (zzYQK) com.aspose.words.internal.zzZKW.zzZ(zzyq7.zzYuS().zzY(zzyr0.zzYvy(), null, zzyq7.zzYuO(), true), zzYQK.class);
        PageSetup pageSetup = section.getPageSetup();
        pageSetup.setHeaderDistance(pageSetup.getTopMargin());
        pageSetup.setFooterDistance(pageSetup.getBottomMargin());
        if (zzyqk == null) {
            return;
        }
        zzYRI zzyriZzYvf = zzyqk.zzYvf();
        if (zzyriZzYvf != null) {
            section.zzYvR().zzvT(section.zzYvR().zzZRg() + (zzyriZzYvf.zzYvP() ? 0 : zzyriZzYvf.getHeight()) + zzyriZzYvf.getMinHeight());
        }
        zzYRI zzyriZzYve = zzyqk.zzYve();
        if (zzyriZzYve != null) {
            section.zzYvR().zzvS(section.zzYvR().zzZRf() + (zzyriZzYve.zzYvP() ? 0 : zzyriZzYve.getHeight()) + zzyriZzYve.getMinHeight());
        }
    }

    public static zzYR0 zzZ(zzYQZ zzyqz, String str) {
        return zzyqz.zzEq(str) != null ? zzyqz.zzEq(str) : zzyqz.zzYvw();
    }
}
