package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ0I extends zzZ0J {
    private static boolean zzYk(char c) {
        if (c < 8592 || c > 8703) {
            return c >= 8960 && c <= 9215;
        }
        return true;
    }

    private static char zzYl(char c) {
        if (c < 768) {
            return (char) 768;
        }
        if (c > 879 && c < 8400) {
            return c < 4639 ? (char) 879 : (char) 8400;
        }
        if (c <= 8431 || zzYk(c)) {
            return c;
        }
        return (char) 8431;
    }

    public static boolean zzYm(char c) {
        if (c < 768 || c > 879) {
            return (c >= 8400 && c <= 8431) || zzYk(c);
        }
        return true;
    }

    public final char getCharacter() {
        return ((Character) zzPj(15040)).charValue();
    }

    @Override // com.aspose.words.zzZ0J
    public final int getMathObjectType() {
        return 2;
    }

    public final void setCharacter(char c) {
        char cZzYl = zzYl(c);
        zzX(15040, Character.valueOf(cZzYl), cZzYl != 770);
    }
}
