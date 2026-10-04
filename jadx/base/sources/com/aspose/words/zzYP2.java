package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYP2 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("table-of-content", "alphabetical-index", "illustration-index", "table-index", "object-index", "user-index", "bibliography", "style-name", "name", "protected", "protection-key", "display", "condition", "protection-key-digest-algorithm", "id", "outline-level", "use-outline-level", "use-index-marks", "use-index-source-styles", "index-scope", "relative-tab-stop-position");

    private static void zzS(zzYQ7 zzyq7, CompositeNode compositeNode) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String strZzZTQ = zzyq7.zzYuG().zzZTQ();
        while (zzyq9ZzYuT.zzQ(strZzZTQ)) {
            if (com.aspose.words.internal.zzZKN.equals(zzyq9ZzYuT.getLocalName(), zzyq7.zzYuG().zzYt7())) {
                if ("alphabetical-index".equals(strZzZTQ)) {
                    zzyq7.zzZ(256, true, strZzZTQ);
                }
                zzZU(zzyq7);
            } else if ("index-body".equals(zzyq9ZzYuT.getLocalName())) {
                zzYP5.zzZ(zzyq7, "index-body", compositeNode);
            } else {
                zzyq9ZzYuT.zzk();
            }
        }
        zzyq7.zzE5(zzYOU.zzDr(zzyq7.zzYuT().zzV("style-name", "Standard")));
        if (zzyq7.zzYuG() == null || !zzyq7.zzYuG().zzYta()) {
            return;
        }
        CompositeNode compositeNodeZzZ = zzYP5.zzZ(zzyq7, zzYP5.zzZW(zzyq7), compositeNode);
        ((Paragraph) (compositeNodeZzZ.zzZYq() instanceof Paragraph ? compositeNodeZzZ.zzZYq() : compositeNodeZzZ.appendChild(new Paragraph(zzyq7.getDocument())))).appendChild(new FieldEnd(zzyq7.getDocument(), new zzYEF(), zzyq7.zzYuG().getFieldType(), true));
    }

    private static void zzT(zzYQ7 zzyq7, zzYR0 zzyr0) {
        zzYP3 zzyp3ZzYuG = zzyq7.zzYuG();
        zzyp3ZzYuG.setStyleName(zzYOU.zzDr(zzyq7.zzYuT().zzV("style-name", null)));
        if (com.aspose.words.internal.zzZYD.zzXk(zzyp3ZzYuG.getStyleName())) {
            Section sectionZzY = zzYPZ.zzY(zzyr0);
            sectionZzY.zzYvR().setSectionStart(0);
            zzYPY zzypy = (zzYPY) zzyq7.zzYuS().zzK(zzyp3ZzYuG.getStyleName(), "section", zzyq7.zzYuO());
            if (zzypy != null && zzypy.zzYvR() != null) {
                zzYCZ zzycz = (zzYCZ) sectionZzY.zzYvR().zzbn();
                sectionZzY.zzY((zzYCZ) zzypy.zzYvR().zzbn());
                zzycz.zzY(sectionZzY.zzYvR());
            }
            zzyq7.zzYuL().push(sectionZzY);
            zzyq7.zzSd(true);
        }
    }

    public static boolean zzY(zzYQ7 zzyq7, CompositeNode compositeNode, zzYR0 zzyr0, String str) throws Exception {
        zzyq7.zzZ(new zzYP3());
        zzYP3 zzyp3ZzYuG = zzyq7.zzYuG();
        zzyp3ZzYuG.zzDO(zzyq7.zzYuT().getLocalName());
        zzyp3ZzYuG.zzDM(com.aspose.words.internal.zzZKN.format("{0}-source", zzyp3ZzYuG.zzZTQ()));
        zzyp3ZzYuG.zzDL(com.aspose.words.internal.zzZKN.format("{0}-entry-template", zzyp3ZzYuG.zzZTQ()));
        if (!zzZ(zzyq7, compositeNode, str)) {
            return false;
        }
        zzT(zzyq7, zzyr0);
        zzZV(zzyq7);
        zzS(zzyq7, compositeNode);
        if (com.aspose.words.internal.zzZYD.zzXk(zzyp3ZzYuG.getStyleName())) {
            zzyq7.zzSc(true);
            zzyq7.zzYuL().pop();
        }
        if (zzyp3ZzYuG.zzYta()) {
            if (compositeNode == null) {
                compositeNode = zzyq7.getDocument().getLastSection().getBody();
            }
            NodeCollection childNodes = compositeNode.getChildNodes(8, false);
            (childNodes.getCount() == 0 ? new Paragraph(zzyq7.getDocument()) : (Paragraph) childNodes.get(childNodes.getCount() - 1)).appendChild(new FieldEnd(zzyq7.getDocument(), new zzYEF(), zzyp3ZzYuG.getFieldType(), true));
        } else {
            zzyp3ZzYuG.zzYt5();
        }
        return true;
    }

    private static boolean zzZ(zzYQ7 zzyq7, CompositeNode compositeNode, String str) throws Exception {
        switch (zzUR.zzTP(zzyq7.zzYuG().zzZTQ())) {
            case 0:
                zzyq7.zzYuG().zzDJ(13);
                zzyq7.zzYuG().zzDN("TOC");
                break;
            case 1:
                zzyq7.zzYuG().zzDJ(8);
                zzyq7.zzYuG().zzDN("INDEX");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                zzyq7.zzYuG().zzYt9();
                zzyq7.zzZ(1, true, str);
                zzS(zzyq7, compositeNode);
                break;
        }
        return false;
    }

    private static void zzZS(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ(zzyq7.zzYuG().zzYt7())) {
            String localName = zzyq9ZzYuT.getLocalName();
            if ("index-title-template".equals(localName) || com.aspose.words.internal.zzZKN.equals(localName, zzyq7.zzYuG().zzYt6()) || "index-source-styles".equals(localName)) {
                zzyq7.zzZ(256, true, zzyq7.zzYuG().zzYt7());
            } else {
                zzyq9ZzYuT.zzk();
            }
        }
    }

    private static void zzZT(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 15:
                    zzyq7.zzYuG().zzDN(com.aspose.words.internal.zzZKN.format("{0} \\o \"1-{1}\"", zzyq7.zzYuG().zzYtb(), zzyq9ZzYuT.getValue()));
                    break;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                    zzyq7.zzZ(256, false, zzyq7.zzYuG().zzYt7());
                    break;
                default:
                    zzyq7.zzYi(zzyq7.zzYuG().zzYt7(), zzyq9ZzYuT.getLocalName());
                    break;
            }
        }
    }

    private static void zzZU(zzYQ7 zzyq7) {
        zzZT(zzyq7);
        zzZS(zzyq7);
    }

    private static void zzZV(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 7:
                    zzyq7.zzYuG().setStyleName(zzyq9ZzYuT.getValue());
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    zzyq7.zzZ(256, false, zzyq7.zzYuG().zzZTQ());
                    break;
                default:
                    zzyq7.zzYi(zzyq7.zzYuG().zzZTQ(), zzyq9ZzYuT.getLocalName());
                    break;
            }
        }
    }
}
