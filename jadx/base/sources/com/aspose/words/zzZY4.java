package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZY4 {
    private static com.aspose.words.internal.zzIM<String> zzYP9;

    static {
        com.aspose.words.internal.zzIM<String> zzim = new com.aspose.words.internal.zzIM<>();
        zzYP9 = zzim;
        zzim.add(zzZWV.zz0(0, false));
        zzYP9.add(zzZWV.zz0(1, false));
        zzYP9.add(zzZWV.zz0(3, false));
        zzYP9.add(zzZWV.zz0(2, false));
        zzYP9.add("http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/origin");
        zzYP9.add(zzZWV.zz0(4, false));
        zzYP9.add(zzZWV.zz0(56, false));
        zzYP9.add(zzZWV.zz0(0, true));
        zzYP9.add(zzZWV.zz0(1, true));
        zzYP9.add(zzZWV.zz0(3, true));
        zzYP9.add(zzZWV.zz0(2, true));
        zzYP9.add("http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/origin");
        zzYP9.add(zzZWV.zz0(4, true));
        zzYP9.add(zzZWV.zz0(56, true));
    }

    public static void zzZ(com.aspose.words.internal.zz74 zz74Var, com.aspose.words.internal.zz78 zz78Var, CustomPartCollection customPartCollection) {
        CustomPart customPartZzZ;
        for (com.aspose.words.internal.zz75 zz75Var : zz74Var) {
            if (!zzYP9.contains(zz75Var.getType()) && (customPartZzZ = zzZ(zz75Var, zz74Var.zzxf(), zz78Var, customPartCollection)) != null) {
                customPartCollection.add(customPartZzZ);
            }
        }
    }

    private static CustomPart zzZ(com.aspose.words.internal.zz75 zz75Var, String str, com.aspose.words.internal.zz78 zz78Var, CustomPartCollection customPartCollection) {
        CustomPart customPart = new CustomPart();
        customPart.zzRX(zz75Var.getId());
        customPart.setRelationshipType(zz75Var.getType());
        customPart.isExternal(zz75Var.isExternal());
        if (zz75Var.isExternal()) {
            customPart.setName(zz75Var.getTarget());
        } else {
            com.aspose.words.internal.zz77 zz77VarZzYe = zz78Var.zzYe(com.aspose.words.internal.zz78.zzs(str, zz75Var.getTarget()));
            if (zz77VarZzYe == null) {
                return null;
            }
            customPart.setName(zz77VarZzYe.getName());
            customPart.setContentType(zz77VarZzYe.getContentType());
            customPart.setData(com.aspose.words.internal.zzZYQ.zzZX(zz77VarZzYe.zzR1()));
            if (zz77VarZzYe.zzxn() != null) {
                Iterator<com.aspose.words.internal.zz75> it = zz77VarZzYe.zzxn().iterator();
                while (it.hasNext()) {
                    CustomPart customPartZzZ = zzZ(it.next(), customPart.getName(), zz78Var, customPartCollection);
                    if (customPartZzZ != null) {
                        customPartCollection.add(customPartZzZ);
                    }
                }
            }
        }
        customPart.zzRY(str);
        return customPart;
    }
}
