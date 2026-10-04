package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZI {
    private ArrayList<GlossaryDocument> zzZEJ;
    private Document zzZEY;

    public zzZI(Document document) {
        this.zzZEY = document;
    }

    private void zzTy(String str) throws Exception {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            try {
                com.aspose.words.internal.zzZOP zzzopZzZ = Document.zzZ(str, this.zzZEY.getResourceLoadingCallback());
                try {
                    zzX(new Document(zzzopZzZ, null, false));
                } finally {
                    if (zzzopZzZ != null) {
                        zzzopZzZ.close();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    private void zzX(Document document) {
        if (document.getGlossaryDocument() != null) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzZEJ, document.getGlossaryDocument());
        }
    }

    private static BuildingBlock zzZ(GlossaryDocument glossaryDocument, String str) {
        for (BuildingBlock buildingBlock : glossaryDocument.getBuildingBlocks()) {
            if (buildingBlock.getGallery() != 24 && com.aspose.words.internal.zzZYD.zzi(buildingBlock.getName(), str)) {
                return buildingBlock;
            }
        }
        return null;
    }

    private void zzb5() throws Exception {
        if (this.zzZEJ != null) {
            return;
        }
        this.zzZEJ = new ArrayList<>(this.zzZEY.getFieldOptions().getBuiltInTemplatesPaths().length + 2);
        zzX(this.zzZEY);
        zzTy(this.zzZEY.getAttachedTemplate());
        for (String str : this.zzZEY.getFieldOptions().getBuiltInTemplatesPaths()) {
            zzTy(str);
        }
    }

    public final BuildingBlock zzTz(String str) throws Exception {
        zzb5();
        Iterator<GlossaryDocument> it = this.zzZEJ.iterator();
        while (it.hasNext()) {
            BuildingBlock buildingBlockZzZ = zzZ(it.next(), str);
            if (buildingBlockZzZ != null) {
                return buildingBlockZzZ;
            }
        }
        return null;
    }
}
