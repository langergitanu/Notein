package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZK9 {
    private String mName;
    private String mValue;

    public zzZK9(String str, String str2) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        this.mName = str;
        this.mValue = str2;
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(obj, null)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(obj, this)) {
            return true;
        }
        if (obj.getClass() != zzZK9.class) {
            return false;
        }
        return zzZ((zzZK9) obj);
    }

    public final String getName() {
        return this.mName;
    }

    public final String getValue() {
        return this.mValue;
    }

    public int hashCode() {
        return (this.mName.hashCode() * 397) ^ this.mValue.hashCode();
    }

    public final boolean zzZ(zzZK9 zzzk9) {
        if (com.aspose.words.internal.zzZKO.zzA(zzzk9, null)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(zzzk9, this)) {
            return true;
        }
        return com.aspose.words.internal.zzZKN.equals(zzzk9.mName, this.mName) && com.aspose.words.internal.zzZKN.equals(zzzk9.mValue, this.mValue);
    }
}
