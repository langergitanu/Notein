package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzJX extends zzYI {
    private int zzWz;
    private String zzZi;
    private ArrayList<zzJZ> zzZj3;

    private zzJZ zzLT(int i) {
        char cCharAt = zz9C().charAt(i);
        if (cCharAt == '!') {
            return new zzZ8G(this, i);
        }
        if (cCharAt == '<') {
            return new zzZJ(this, i);
        }
        if (cCharAt == '>') {
            return new zzZL(this, i);
        }
        if (cCharAt == '[') {
            return new zzZ4O(this, i);
        }
        if (cCharAt == '~') {
            return new zzY96(this, i);
        }
        switch (cCharAt) {
            case '(':
                return new zzZ4U(this, i);
            case ')':
                return new zzZ4W(this, i);
            case '*':
                return new zzZZ(this, i);
            case '+':
                return new zzY49(this, i);
            default:
                switch (cCharAt) {
                    case ']':
                        return new zzZ4Q(this, i);
                    case '^':
                        return new zzZMX(this, i);
                    case '_':
                        return new zzY45(this, i);
                    case '`':
                        return new zzZ7T(this, i);
                    default:
                        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: " + com.aspose.words.internal.zzZKN.format("Unexpected delimiter character '{0}'.", Character.valueOf(cCharAt)));
                }
        }
    }

    public final int getStart() {
        return this.zzWz;
    }

    @Override // com.aspose.words.zzYI
    public final String getText() {
        return this.zzZi;
    }

    public final String toString() {
        return zz9C();
    }

    @Override // com.aspose.words.zzYI
    public final String zzL(String str, int i, int i2) {
        return "";
    }

    @Override // com.aspose.words.zzYI
    public final String zzM(String str, int i, int i2) {
        return "";
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzZ(zzYI zzyi) {
        return false;
    }

    public final ArrayList<zzJZ> zzZST() {
        if (this.zzZj3 == null) {
            this.zzZj3 = new ArrayList<>();
            int length = 0;
            while (length < zz9C().length()) {
                zzJZ zzjzZzLT = zzLT(length);
                length += zzjzZzLT.getLength();
                com.aspose.words.internal.zzZQG.zzZ(this.zzZj3, zzjzZzLT);
            }
        }
        return this.zzZj3;
    }

    public final boolean zzZSW() {
        return zzZ1N.zzZu(this.zzZi, this.zzWz);
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzZt(char c) {
        return !zzZv(c);
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzZv(char c) {
        return c == '*' || c == '_' || c == '~' || c == '+' || c == '`' || c == '<' || c == '>' || c == '[' || c == ']' || c == '(' || c == ')' || c == '!' || c == '^';
    }

    @Override // com.aspose.words.zzYI
    public final int zzb4() {
        return 0;
    }

    @Override // com.aspose.words.zzYI
    public final String zzc(String str, int i) {
        return "";
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzf(String str, int i) {
        if (!zze(str, i)) {
            return false;
        }
        this.zzZi = str;
        if (zz9C().length() == 0) {
            return false;
        }
        this.zzWz = zz9D().length() + i;
        return !zzZSW() || str.charAt(this.zzWz) == '`';
    }

    @Override // com.aspose.words.zzYI
    public final byte zzkz() {
        return (byte) 28;
    }
}
