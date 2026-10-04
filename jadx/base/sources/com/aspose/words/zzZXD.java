package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZXD extends zzZXR {
    public zzZXD(zzZW2 zzzw2) {
        super(zzzw2, zzzw2.zzZqS().zzYfy.getGlossaryDocument(), zzzw2.getWarningCallback());
    }

    private void zzZ(BuildingBlock buildingBlock) {
        zzZYD zzzydZzZlV = zzZlV();
        zzzydZzZlV.zzY("w:docPartPr");
        zzzydZzZlV.zzY("w:name");
        zzzydZzZlV.zzw("w:decorated", buildingBlock.zz7j());
        zzzydZzZlV.zz0("w:val", buildingBlock.getName());
        zzzydZzZlV.zzp();
        zzzydZzZlV.zzYz("w:style", buildingBlock.zzG7());
        zzzydZzZlV.zzY("w:category");
        zzzydZzZlV.zzYz("w:name", buildingBlock.getCategory());
        zzzydZzZlV.zzYz("w:gallery", zzZXP.zzF5(buildingBlock.getGallery()));
        zzzydZzZlV.zzp();
        if (buildingBlock.getType() != 0) {
            zzzydZzZlV.zzY("w:types");
            if (buildingBlock.getType() == 7) {
                zzzydZzZlV.zzx("all", true);
            } else {
                zzzydZzZlV.zzYz("w:type", zzZXP.zzF4(buildingBlock.getType()));
            }
            zzzydZzZlV.zzp();
        }
        zzzydZzZlV.zzY("w:behaviors");
        zzzydZzZlV.zzYz("w:behavior", zzZXP.zzF6(buildingBlock.getBehavior()));
        zzzydZzZlV.zzp();
        zzzydZzZlV.zzYz("w:description", buildingBlock.getDescription());
        if (!buildingBlock.zz7i().equals(com.aspose.words.internal.zzZOZ.zzZXP)) {
            zzzydZzZlV.zzYz("w:guid", buildingBlock.zz7i().toString("B").toUpperCase());
        }
        zzzydZzZlV.zzp();
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBuildingBlockStart(BuildingBlock buildingBlock) throws Exception {
        zzZlV().zzY("w:docPart");
        zzZ(buildingBlock);
        zzZlV().zzY("w:docPartBody");
        zzV(buildingBlock);
        zzZlV().zzp();
        zzZlV().zzp();
        return 1;
    }

    @Override // com.aspose.words.zzZXR
    public final void zzZm8() throws Exception {
        zzZYD zzzydZzZlV = zzZlV();
        zzzydZzZlV.zzNU("w:glossaryDocument");
        zzzydZzZlV.zzY("w:docParts");
        getDocument().accept(this);
        zzzydZzZlV.zzp();
        zzzydZzZlV.endDocument();
    }

    @Override // com.aspose.words.zzZXR
    public final com.aspose.words.internal.zz77 zzZma() throws Exception {
        return zzZmf().zzZ(zzZmf().zzYc(zzZmp().zzZkX()), "glossary/document.xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.document.glossary+xml", zzZmp().zzZkG());
    }
}
