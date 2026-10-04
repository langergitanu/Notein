package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ2F {
    private Field zzY4W;
    private com.aspose.words.internal.zzZQC<String> zzY4X = new com.aspose.words.internal.zzZQC<>();
    private zzZ2G zzY4Y = new zzZ2G();

    private void zzYJj() {
        int i = 0;
        while (i < this.zzY4Y.getCount()) {
            zzZ2H zzz2hZzvd = this.zzY4Y.zzvd(i);
            i++;
            for (int i2 = i; i2 < this.zzY4Y.getCount(); i2++) {
                zzZ2H zzz2hZzvd2 = this.zzY4Y.zzvd(i2);
                if (zzZ2H.zzZ(zzz2hZzvd, zzz2hZzvd2)) {
                    throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Mail merge regions '{0}' and '{1}' overlap. Two regions cannot start/end in the same paragraph or occupy the same table row.", zzz2hZzvd.getName(), zzz2hZzvd2.getName()));
                }
            }
        }
    }

    private void zzYJk() {
        if (zzYJi()) {
            throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Found start of mail merge region '{0}' without matching end.", this.zzY4X.pop()));
        }
    }

    public static zzZ2G zzYR(Node node) {
        zzZ2F zzz2f = new zzZ2F();
        Iterator<Field> it = zzZQF.zzZS(node).iterator();
        while (it.hasNext()) {
            zzz2f.zzS(it.next(), false);
        }
        zzz2f.zzYJl();
        return zzz2f.zzY4Y;
    }

    private void zzZ(String str, Field field) {
        if (!zzYJi()) {
            this.zzY4W = field;
        }
        this.zzY4X.push(str);
    }

    public final boolean zzS(Field field, boolean z) {
        int iZz6 = zzZ2E.zz6(field);
        if (iZz6 == 0) {
            return false;
        }
        if (iZz6 == 1) {
            zzZ(((FieldMergeField) field).getFieldNameNoPrefix(), field);
            return true;
        }
        if (iZz6 != 2) {
            throw new IllegalStateException();
        }
        zzZ(((FieldMergeField) field).getFieldNameNoPrefix(), field, z);
        return true;
    }

    public final zzZ2G zzYJh() {
        return this.zzY4Y;
    }

    public final boolean zzYJi() {
        return this.zzY4X.size() > 0;
    }

    public final void zzYJl() {
        zzYJk();
        zzYJj();
    }

    private void zzZ(String str, Field field, boolean z) {
        if (zzYJi()) {
            String strPop = this.zzY4X.pop();
            if (com.aspose.words.internal.zzZYD.zzi(str, strPop)) {
                if (zzYJi()) {
                    return;
                }
                this.zzY4Y.zzO(new zzZ2H(str, this.zzY4W, field, z));
                return;
            }
            throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Found end of mail merge region '{0}' that does not match start of mail merge region '{1}'.", str, strPop));
        }
        throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Found end of mail merge region '{0}' without matching start.", str));
    }
}
