package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzY6S implements zzZCY {
    com.aspose.words.internal.zzDB zzX6a;

    public zzY6S(com.aspose.words.internal.zzDB zzdb) {
        if (zzdb == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: columnWidths");
        }
        this.zzX6a = zzdb;
    }

    @Override // com.aspose.words.zzZCY
    public zzZCY deepCloneComplexAttr() {
        com.aspose.words.internal.zzDB zzdb = new com.aspose.words.internal.zzDB(this.zzX6a.getCount());
        zzdb.zzX(this.zzX6a);
        return new zzY6S(zzdb);
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzY6S.class) {
            return false;
        }
        return this.zzX6a.equals(((zzY6S) obj).zzX6a);
    }

    public int hashCode() {
        return this.zzX6a.hashCode();
    }

    @Override // com.aspose.words.zzZCY
    public boolean isInheritedComplexAttr() {
        return false;
    }
}
