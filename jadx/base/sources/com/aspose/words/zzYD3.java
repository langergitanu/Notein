package com.aspose.words;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYD3 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("DefaultPlaceholder_22675703", "DefaultPlaceholder_22675704", "DefaultPlaceholder_22675705", "DefaultPlaceholder_22675706");
    private static int zzXo2 = 17;
    private Style zzYDw;
    private GlossaryDocument zzYTg;
    private Document zzYuD;
    private BuildingBlock[] zzXo5 = new BuildingBlock[zzXo2];
    private HashMap<String, BuildingBlock> zzXo4 = new HashMap<>();
    private zzYJT zzXo3 = new zzYJT();

    public zzYD3(DocumentBase documentBase) {
        if (documentBase instanceof Document) {
            Document document = (Document) documentBase;
            this.zzYuD = document;
            this.zzYTg = document.getGlossaryDocument();
        } else {
            this.zzYTg = (GlossaryDocument) documentBase;
            this.zzYuD = null;
        }
        if (zzYcD()) {
            return;
        }
        zzYcH();
    }

    private BuildingBlock zzBf(String str) {
        zzYcG();
        BuildingBlock buildingBlock = new BuildingBlock(zzYcC());
        buildingBlock.setCategory("General");
        buildingBlock.setGallery(33);
        buildingBlock.setType(2);
        buildingBlock.setBehavior(0);
        buildingBlock.zzR(com.aspose.words.internal.zzZZS.zzY(str));
        buildingBlock.setName(str);
        return buildingBlock;
    }

    public static boolean zzBh(String str) {
        int iZzTP = zzUR.zzTP(str);
        return iZzTP == 0 || iZzTP == 1 || iZzTP == 2 || iZzTP == 3;
    }

    private static boolean zzU(BuildingBlock buildingBlock) {
        return buildingBlock.getGallery() == 33 && buildingBlock.getType() == 2;
    }

    private void zzV(BuildingBlock buildingBlock) {
        this.zzXo5[7] = buildingBlock;
        this.zzXo4.put("DefaultPlaceholder_22675706", buildingBlock);
    }

    private void zzW(BuildingBlock buildingBlock) {
        this.zzXo5[6] = buildingBlock;
        this.zzXo4.put("DefaultPlaceholder_22675705", buildingBlock);
    }

    private void zzX(BuildingBlock buildingBlock) {
        zzZ(5, buildingBlock);
        zzZ(4, buildingBlock);
        zzZ("DefaultPlaceholder_22675704", buildingBlock);
    }

    private BuildingBlock zzY2(String str, String str2) {
        BuildingBlock buildingBlockZzBf = zzBf(str);
        zzYcC().appendChild(buildingBlockZzBf);
        Section section = new Section(zzYcC());
        buildingBlockZzBf.appendChild(section);
        Body body = new Body(zzYcC());
        section.appendChild(body);
        Paragraph paragraph = new Paragraph(zzYcC());
        body.appendChild(paragraph);
        Run run = new Run(zzYcC(), str2);
        run.zzZYh().zzQ(50, Integer.valueOf(this.zzYDw.zzZ7j()));
        paragraph.appendChild(run);
        return buildingBlockZzBf;
    }

    private GlossaryDocument zzYcC() {
        if (this.zzYTg == null) {
            Document document = this.zzYuD;
            if (document == null) {
                throw new IllegalStateException("Please report exception.");
            }
            if (document.getGlossaryDocument() == null) {
                this.zzYuD.setGlossaryDocument(new GlossaryDocument());
            }
            this.zzYTg = this.zzYuD.getGlossaryDocument();
        }
        return this.zzYTg;
    }

    private String zzYcF() {
        long j = 0;
        for (BuildingBlock buildingBlock : zzYcC()) {
            if (com.aspose.words.internal.zzZKN.zzS(buildingBlock.getName(), "CustomPlaceholder_", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                long jZzZl = com.aspose.words.internal.zzJB.zzZl(buildingBlock.getName().substring(18));
                if (j < jZzZl) {
                    j = jZzZl;
                }
            }
        }
        return com.aspose.words.internal.zzZKN.format("{0}{1}", "CustomPlaceholder_", Long.valueOf(j + 1));
    }

    private void zzYcG() {
        if (this.zzYDw == null) {
            zzYcC().getStyles().ensureMinimum();
            Style styleZz0 = zzYcC().getStyles().zz0("Placeholder Text", false);
            this.zzYDw = styleZz0;
            if (styleZz0 == null) {
                Style styleAdd = zzYcC().getStyles().add(2, "Placeholder Text");
                this.zzYDw = styleAdd;
                styleAdd.zzl5(10);
                this.zzYDw.setPriority(99);
                this.zzYDw.setSemiHidden(true);
                this.zzYDw.zzZYh().zzY(com.aspose.words.internal.zzPV.zzX(0, 128, 128, 128));
            }
        }
    }

    private void zzYcH() {
        for (BuildingBlock buildingBlock : zzYcC()) {
            if (buildingBlock.getGallery() == 33) {
                int iZzTP = zzUR.zzTP(buildingBlock.getName());
                if (iZzTP == 0) {
                    zzY(buildingBlock);
                } else if (iZzTP == 1) {
                    zzX(buildingBlock);
                } else if (iZzTP == 2) {
                    zzW(buildingBlock);
                } else if (iZzTP == 3) {
                    zzV(buildingBlock);
                }
            }
        }
    }

    private void zzZ(String str, BuildingBlock buildingBlock) {
        if (this.zzXo4.containsKey(str)) {
            return;
        }
        com.aspose.words.internal.zzZQF.zzY(this.zzXo4, str, buildingBlock);
    }

    private BuildingBlock zzmA(int i) {
        switch (i) {
            case 4:
            case 5:
                BuildingBlock buildingBlockZzY2 = zzY2("DefaultPlaceholder_22675704", "Choose an item.");
                zzX(buildingBlockZzY2);
                return buildingBlockZzY2;
            case 6:
                BuildingBlock buildingBlockZzY22 = zzY2("DefaultPlaceholder_22675705", "Click here to enter a date.");
                zzW(buildingBlockZzY22);
                return buildingBlockZzY22;
            case 7:
                BuildingBlock buildingBlockZzY23 = zzY2("DefaultPlaceholder_22675706", "Choose a building block.");
                zzV(buildingBlockZzY23);
                return buildingBlockZzY23;
            case 8:
            case 10:
            default:
                return null;
            case 9:
            case 11:
            case 12:
                BuildingBlock buildingBlockZzY24 = zzY2("DefaultPlaceholder_22675703", "Click here to enter text.");
                zzY(buildingBlockZzY24);
                return buildingBlockZzY24;
        }
    }

    private BuildingBlock zzq(StructuredDocumentTag structuredDocumentTag) {
        String placeholderName = structuredDocumentTag.getPlaceholderName();
        BuildingBlock buildingBlock = this.zzXo4.containsKey(placeholderName) ? this.zzXo4.get(placeholderName) : null;
        if (buildingBlock == null && (buildingBlock = zzYcC().getBuildingBlock(33, null, placeholderName)) != null) {
            zzZ(placeholderName, buildingBlock);
            zzZ(structuredDocumentTag.getSdtType(), buildingBlock);
        }
        return buildingBlock;
    }

    public final void zzB(Iterable<Object> iterable) {
        Iterator<Object> it = iterable.iterator();
        while (it.hasNext()) {
            this.zzXo3.zzZ3(it.next());
        }
    }

    public final String zzBg(String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        return zzY2(zzYcF(), str).getName();
    }

    public final BuildingBlock zzY(StructuredDocumentTag structuredDocumentTag, boolean z) {
        BuildingBlock buildingBlockZzq = !"".equals(structuredDocumentTag.getPlaceholderName()) ? zzq(structuredDocumentTag) : null;
        if (buildingBlockZzq == null) {
            Iterator<T> it = zzYcC().getBuildingBlocks().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BuildingBlock buildingBlock = (BuildingBlock) it.next();
                if (com.aspose.words.internal.zzZKN.zzX(buildingBlock.getName(), structuredDocumentTag.getPlaceholderName(), com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                    buildingBlockZzq = buildingBlock;
                    break;
                }
            }
        }
        return (z && buildingBlockZzq == null) ? zzmB(structuredDocumentTag.getSdtType()) : buildingBlockZzq;
    }

    public final boolean zzYcD() {
        return this.zzYTg == null;
    }

    public final Iterable<Object> zzYcE() {
        return this.zzXo3.zzYlY();
    }

    public final boolean zzYcI() {
        boolean z = false;
        for (BuildingBlock buildingBlock : zzYcC().getBuildingBlocks()) {
            if (buildingBlock.getParentNode() != null && zzU(buildingBlock) && !this.zzXo3.zzZ2(buildingBlock.getName())) {
                buildingBlock.remove();
                z = true;
            }
        }
        return z;
    }

    public final void zzYcJ() {
        this.zzXo3.reset();
    }

    public final BuildingBlock zzmB(int i) {
        BuildingBlock buildingBlock = this.zzXo5[i];
        return buildingBlock != null ? buildingBlock : zzmA(i);
    }

    public final void zzr(StructuredDocumentTag structuredDocumentTag) {
        if (structuredDocumentTag.getPlaceholder() != null) {
            this.zzXo3.zzZ3(structuredDocumentTag.getPlaceholder().getName());
        }
    }

    private void zzZ(int i, BuildingBlock buildingBlock) {
        BuildingBlock[] buildingBlockArr = this.zzXo5;
        if (buildingBlockArr[i] == null) {
            buildingBlockArr[i] = buildingBlock;
        }
    }

    private void zzY(BuildingBlock buildingBlock) {
        zzZ(11, buildingBlock);
        zzZ(12, buildingBlock);
        zzZ(9, buildingBlock);
        zzZ("DefaultPlaceholder_22675703", buildingBlock);
    }
}
