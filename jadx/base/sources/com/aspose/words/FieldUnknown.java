package com.aspose.words;

import com.aspose.words.ref.RefBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class FieldUnknown extends Field implements zzZAA {
    private static com.aspose.words.internal.zzZNR zzYBn = new com.aspose.words.internal.zzZNR("^(?!\\d)\\w+$");
    private static com.aspose.words.internal.zzFQ<String> zzYBm = new com.aspose.words.internal.zzX6("ADDIN", "CONTROL", "DATA", "DISPLAYNFC", "EMBED", "FTNREF", "HTMLCONTROL");

    public static boolean zzY(FieldStart fieldStart, FieldChar fieldChar) {
        return zzZU(zzZQT.zzZ(fieldStart, fieldChar), fieldStart.getFieldType());
    }

    private static boolean zzZU(String str, int i) {
        int iZzLE = zzZOO.zzLE(str);
        if (i == 2) {
            i = 0;
        }
        return iZzLE == i && !zzYBm.contains(str) && zzYBn.zzUV(str);
    }

    @Override // com.aspose.words.zzZAA
    @ReservedForInternalUse
    @Deprecated
    public boolean canWorkAsMergeField() {
        return true;
    }

    @Override // com.aspose.words.zzZAA
    @ReservedForInternalUse
    @Deprecated
    public String getMergeFieldName() {
        return zzZgq().zzZfB();
    }

    @Override // com.aspose.words.zzZAA
    @ReservedForInternalUse
    @Deprecated
    public boolean isMergeValueRequired() {
        return true;
    }

    public final boolean zzZbA() {
        return zzZU(zzZgq().zzZfB(), getType());
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        if (!zzZbA()) {
            return new zzZP4(this);
        }
        zzW4(true);
        Bookmark bookmarkZzT = zzZOO.zzT(this, zzZgq().zzZfB());
        if (bookmarkZzT == null) {
            return new zzZP2(this, "Error! Bookmark not defined.");
        }
        zzYWB zzywbZz9m = bookmarkZzT.zz9m();
        RefBoolean refBoolean = new RefBoolean(false);
        return zzZPO.zzZ((Field) this, bookmarkZzT, zzywbZz9m, zzZPO.zzZ((Field) this, bookmarkZzT, false, refBoolean), refBoolean.get(), false);
    }

    @Override // com.aspose.words.Field
    public final int zzZgN() throws Exception {
        if (zzZbA()) {
            return zzZPO.zzZ((Field) this, zzZgq().zzZfB(), false);
        }
        return 0;
    }
}
