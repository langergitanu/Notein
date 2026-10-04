package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzMZ {
    private String[] zzZpr;

    public zzMZ(String[] strArr) {
        this.zzZpr = strArr;
    }

    public final boolean matches(String str) {
        if ("auto".equals(com.aspose.words.internal.zzZYD.zzXl(str))) {
            return false;
        }
        String[] strArr = this.zzZpr;
        if (strArr == null) {
            return true;
        }
        for (String str2 : strArr) {
            if (com.aspose.words.internal.zzZKN.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzZVK() {
        String[] strArr = this.zzZpr;
        return strArr != null && strArr.length > 0;
    }

    public final String zzZXu() {
        String[] strArr = this.zzZpr;
        if (strArr == null) {
            return "";
        }
        if (strArr.length == 0) {
            return "auto";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : this.zzZpr) {
            if (sb.length() > 0) {
                com.aspose.words.internal.zzZNH.zzU(sb, ", ");
            }
            com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzS0.zzl(str));
        }
        return sb.toString();
    }
}
