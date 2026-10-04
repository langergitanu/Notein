package com.aspose.words;

import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: loaded from: classes6.dex */
public class FieldDocProperty extends Field {
    private static com.aspose.words.internal.zzZNR zzYEy = new com.aspose.words.internal.zzZNR("\\A([^']*'[^']*')*?[^']*?((h|H)\\3?)", 0);
    private static com.aspose.words.internal.zzZNR zzYEx = new com.aspose.words.internal.zzZNR("\\G(([^']*'[^']*')*?[^']*?)y(y?)y*", 0);

    private String getPropertyName() {
        return zzZgq().zzDG(0);
    }

    private String zzY(DocumentProperty documentProperty, boolean z) {
        documentProperty.getType();
        com.aspose.words.internal.zzZP1 zzzp1ZzZcK = getStart().zzYBb().getFieldOptions().zzZcK();
        com.aspose.words.internal.zzZQ9 zzzq9ZzZ = com.aspose.words.internal.zzR1.zzZ(documentProperty.zzZoj());
        String strZzZS = zzYEx.zzZS(com.aspose.words.internal.zzJB.zzZ(zzzp1ZzZcK), "$1yy$3$3");
        if (z) {
            return zzzq9ZzZ.toString(strZzZS);
        }
        com.aspose.words.internal.zzZNT zzzntZzUX = zzYEy.zzUX(com.aspose.words.internal.zzJB.zzY(zzzp1ZzZcK));
        String strOooO00o = zzzntZzUX.zzhL() ? OooO0O0.OooO00o(zzzntZzUX, 2) : "H";
        String strZzX = com.aspose.words.internal.zzJB.zzX(zzzp1ZzZcK);
        if (strZzX == null || strZzX.length() != 1) {
            strZzX = C18241k5.f55433h;
        }
        return zzzq9ZzZ.toString(com.aspose.words.internal.zzZKN.format("{0} {1}'{2}'mm", strZzZS, strOooO00o, strZzX));
    }

    private zzTL zzZ(DocumentProperty documentProperty, boolean z) {
        int type = documentProperty.getType();
        return type != 1 ? type != 2 ? new zzY94(documentProperty.toString()) : new zzZVZ(documentProperty.toDouble()) : new zzY94(zzY(documentProperty, z));
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() {
        if (!com.aspose.words.internal.zzZYD.zzXk(getPropertyName())) {
            return new zzZP2(this, "Error! No property name supplied.");
        }
        Document documentZzYBb = getStart().zzYBb();
        DocumentProperty documentProperty = documentZzYBb.getCustomDocumentProperties().get(getPropertyName());
        boolean z = documentProperty != null;
        if (!z) {
            documentProperty = documentZzYBb.getBuiltInDocumentProperties().get(getPropertyName());
        }
        return documentProperty == null ? new zzZP2(this, "Error! Unknown document property name.") : new zzZP5(this, zzZ(documentProperty, z));
    }
}
