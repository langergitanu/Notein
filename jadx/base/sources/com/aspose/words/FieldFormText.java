package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldFormText extends Field {
    @Override // com.aspose.words.Field
    public final void zzZgJ() {
        BookmarkStart bookmarkStart;
        FormField formFieldZzZcg = getStart().zzZcg();
        if (formFieldZzZcg == null || (bookmarkStart = formFieldZzZcg.getBookmarkStart()) == null) {
            return;
        }
        getStart().zzYC(bookmarkStart);
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        FormField formFieldZzZcg = getStart().zzZcg();
        if (formFieldZzZcg == null) {
            return null;
        }
        int textInputType = formFieldZzZcg.getTextInputType();
        if (textInputType == 3 || textInputType == 4) {
            return new zzZP5((Field) this, (zzZB2) zzZgq().zzDH(0), false);
        }
        if (textInputType != 5) {
            return null;
        }
        FieldFormula fieldFormula = zzZgn().zzZaZ() != null ? (FieldFormula) com.aspose.words.internal.zzZKW.zzZ(zzZgn().zzZaZ().getField(), FieldFormula.class) : null;
        String strZzT = zzZgq().zzT(0, true, true);
        double dZzZs = Double.NaN;
        if (fieldFormula != null) {
            zzTL zztlZzZdV = fieldFormula.zzZdV();
            if (zztlZzZdV instanceof zzZVZ) {
                dZzZs = zztlZzZdV.zz8Y();
            } else if (zztlZzZdV instanceof zzY94) {
                strZzT = zztlZzZdV.zz8W();
            } else if (zztlZzZdV instanceof zzZU3) {
                strZzT = FormField.zzYwj;
            }
        }
        if (Double.isNaN(dZzZs)) {
            dZzZs = com.aspose.words.internal.zzJB.zzZs(strZzT);
        }
        if (!Double.isNaN(dZzZs)) {
            strZzT = com.aspose.words.internal.zzJB.zzZ(dZzZs, formFieldZzZcg.getTextInputFormat(), getStart().zzYBb().getFieldOptions().zzZcL() | 3);
        }
        return new zzZP5((Field) this, strZzT, false);
    }
}
