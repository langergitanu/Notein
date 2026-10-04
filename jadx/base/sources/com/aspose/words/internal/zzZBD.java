package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZBD {
    private int index = 0;
    private String zzWHA;

    public zzZBD(String str) {
        this.zzWHA = str;
    }

    public final boolean hasMoreTokens() {
        return this.index != -1;
    }

    public final String nextToken() {
        int i = this.index;
        if (i == -1) {
            return null;
        }
        int iIndexOf = this.zzWHA.indexOf(46, i);
        if (iIndexOf == -1) {
            String strSubstring = this.zzWHA.substring(this.index);
            this.index = -1;
            return strSubstring;
        }
        String strSubstring2 = this.zzWHA.substring(this.index, iIndexOf);
        this.index = iIndexOf + 1;
        return strSubstring2;
    }
}
