package com.aspose.words;

import com.aspose.words.ref.Ref;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ2Q extends zzZ2Y implements zzZAF {
    private Object[] zzY5X;
    private String[] zzY5Y;
    private com.aspose.words.internal.zzZYG<Object> zzY5Z;
    private String[] zzY63;

    public zzZ2Q(String[] strArr, Object[] objArr) {
        if (objArr.length != strArr.length) {
            throw new IllegalArgumentException("Length of fieldValues must be same as length of fieldNames.");
        }
        this.zzY63 = new String[strArr.length];
        this.zzY5Z = new com.aspose.words.internal.zzZYG<>(false);
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            Object obj = objArr[i];
            this.zzY5Z.set(str, obj);
            String strZzIN = zzZ2M.zzIN(str);
            if (!com.aspose.words.internal.zzZKN.equals(str, strZzIN) && !this.zzY5Z.containsKey(strZzIN)) {
                this.zzY5Z.set(strZzIN, obj);
            }
            this.zzY63[i] = strZzIN;
        }
        this.zzY5Y = strArr;
        this.zzY5X = objArr;
    }

    @Override // com.aspose.words.zzZAF
    public final int getFieldCount() throws Exception {
        zzYC();
        return this.zzY5X.length;
    }

    @Override // com.aspose.words.zzZAF
    public final String getTableName() {
        return "";
    }

    @Override // com.aspose.words.zzZAF
    public final boolean getValue(String str, Ref<Object> ref) throws Exception {
        zzYC();
        if (this.zzY5Z.containsKey(str)) {
            ref.set(this.zzY5Z.get(str));
            return true;
        }
        ref.set(null);
        return false;
    }

    @Override // com.aspose.words.zzZAF
    public final int zzMq(String str) throws Exception {
        zzYC();
        int iZzX = com.aspose.words.internal.zzZ1.zzX(this.zzY5Y, str);
        return iZzX != -1 ? iZzX : com.aspose.words.internal.zzZ1.zzX(this.zzY63, str);
    }

    @Override // com.aspose.words.zzZ2Y
    public final boolean zzYC() {
        return zzYK7() > 0;
    }

    @Override // com.aspose.words.zzZAF
    public final boolean zzZ(int i, Ref<Object> ref) throws Exception {
        zzYC();
        if (zzZ2M.zzZ(this, i)) {
            ref.set(this.zzY5X[i]);
            return true;
        }
        ref.set(null);
        return false;
    }

    @Override // com.aspose.words.zzZAF
    public final boolean zzZhb() {
        return true;
    }

    @Override // com.aspose.words.zzZAF
    public final zzZAF zzu(String str, boolean z) {
        return null;
    }
}
