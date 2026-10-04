package com.aspose.words;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYJO extends zzY4X implements Comparator<com.aspose.words.internal.zz75> {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("Relationship", "Id", "Type", "Target", "TargetMode");
    private ArrayList<String> zzXCn = new ArrayList<>();
    private ArrayList<String> zzXCm = new ArrayList<>();

    private static int zzZ(com.aspose.words.internal.zz75 zz75Var, com.aspose.words.internal.zz75 zz75Var2) {
        return com.aspose.words.internal.zzZYO.compare2(zz75Var.getId(), zz75Var2.getId());
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(com.aspose.words.internal.zz75 zz75Var, com.aspose.words.internal.zz75 zz75Var2) {
        return zzZ(zz75Var, zz75Var2);
    }

    public final void zzCP(String str) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzXCm, str);
    }

    public final void zzCQ(String str) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzXCn, str);
    }

    @Override // com.aspose.words.zzY4X
    public final void zzX(com.aspose.words.internal.zzO zzo) {
        while (zzo.zzQ("Transform")) {
            if ("RelationshipReference".equals(zzo.getLocalName())) {
                zzCQ(zzo.zzV("SourceId", null));
            } else if ("RelationshipsGroupReference".equals(zzo.getLocalName())) {
                zzCP(zzo.zzV("SourceType", null));
            }
        }
    }

    @Override // com.aspose.words.zzY4X
    public final com.aspose.words.internal.zzZOR zzZB(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        com.aspose.words.internal.zzO zzo = new com.aspose.words.internal.zzO(zzzop);
        ArrayList<com.aspose.words.internal.zz75> arrayList = new ArrayList();
        while (zzo.zzQ("Relationships")) {
            if (zzUR.zzTP(zzo.getLocalName()) != 0) {
                throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unexpected element '{0}'.", zzo.getLocalName()));
            }
            zzZ(zzo, (ArrayList<com.aspose.words.internal.zz75>) arrayList);
        }
        Collections.sort(arrayList, this);
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        com.aspose.words.internal.zzP zzp = new com.aspose.words.internal.zzP(zzzor, false);
        zzp.zzZ("Relationships");
        zzp.zzX("xmlns", "http://schemas.openxmlformats.org/package/2006/relationships");
        for (com.aspose.words.internal.zz75 zz75Var : arrayList) {
            if (this.zzXCn.contains(zz75Var.getId()) || this.zzXCm.contains(zz75Var.getType())) {
                zzp.zzY("Relationship");
                zzp.zzX("Id", zz75Var.getId());
                zzp.zzX("Type", zz75Var.getType());
                zzp.zzX("Target", zz75Var.getTarget());
                zzp.zzX("TargetMode", zz75Var.isExternal() ? "External" : "Internal");
                zzp.zzo();
            }
        }
        zzp.endDocument();
        return zzzor;
    }

    private static void zzZ(com.aspose.words.internal.zzO zzo, ArrayList<com.aspose.words.internal.zz75> arrayList) {
        String value = "";
        String value2 = "";
        boolean zEquals = false;
        String value3 = value2;
        while (zzo.zzi()) {
            int iZzTP = zzUR.zzTP(zzo.getLocalName());
            if (iZzTP == 1) {
                value = zzo.getValue();
            } else if (iZzTP == 2) {
                value3 = zzo.getValue();
            } else if (iZzTP == 3) {
                value2 = zzo.getValue();
            } else if (iZzTP == 4) {
                zEquals = "External".equals(zzo.getValue());
            }
        }
        com.aspose.words.internal.zzZQG.zzZ(arrayList, new com.aspose.words.internal.zz75(value, value3, value2, zEquals));
    }

    @Override // com.aspose.words.zzY4X
    public final void zzX(com.aspose.words.internal.zzP zzp) {
        zzp.zzY("Transform");
        zzp.zzX("Algorithm", "http://schemas.openxmlformats.org/package/2006/RelationshipTransform");
        for (String str : this.zzXCn) {
            zzp.zzY("mdssi:RelationshipReference");
            zzp.zzX("SourceId", str);
            zzp.zzo();
        }
        for (String str2 : this.zzXCm) {
            zzp.zzY("opc:RelationshipsGroupReference");
            zzp.zzX("SourceType", str2);
            zzp.zzo();
        }
        zzp.zzo();
    }
}
