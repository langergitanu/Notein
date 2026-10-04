package o0O0O0O;

import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f88271OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f88272OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f88273OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f88274OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f88275OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f88276OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public char[] f88277OooO0oO;

    public OooO0O0(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f88271OooO00o = name;
        this.f88272OooO0O0 = name.length();
    }

    public final int OooO00o(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        int i5 = this.f88272OooO0O0;
        String str = this.f88271OooO00o;
        if (i4 >= i5) {
            throw new IllegalStateException("Malformed DN: " + str);
        }
        char[] cArr = this.f88277OooO0oO;
        char c = cArr[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else {
            if (c < 'A' || c > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i2 = c - '7';
        }
        char c2 = cArr[i4];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i3 = c2 - '7';
        }
        return (i2 << 4) + i3;
    }

    public final char OooO0O0() {
        int i;
        int i2;
        int i3 = this.f88273OooO0OO + 1;
        this.f88273OooO0OO = i3;
        int i4 = this.f88272OooO0O0;
        if (i3 == i4) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f88271OooO00o);
        }
        char c = this.f88277OooO0oO[i3];
        if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
            switch (c) {
                default:
                    switch (c) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            int iOooO00o = OooO00o(i3);
                            this.f88273OooO0OO++;
                            if (iOooO00o < 128) {
                                return (char) iOooO00o;
                            }
                            if (iOooO00o < 192 || iOooO00o > 247) {
                                return '?';
                            }
                            if (iOooO00o <= 223) {
                                i = iOooO00o & 31;
                                i2 = 1;
                            } else if (iOooO00o <= 239) {
                                i = iOooO00o & 15;
                                i2 = 2;
                            } else {
                                i = iOooO00o & 7;
                                i2 = 3;
                            }
                            for (int i5 = 0; i5 < i2; i5++) {
                                int i6 = this.f88273OooO0OO;
                                int i7 = i6 + 1;
                                this.f88273OooO0OO = i7;
                                if (i7 == i4 || this.f88277OooO0oO[i7] != '\\') {
                                    return '?';
                                }
                                int i8 = i6 + 2;
                                this.f88273OooO0OO = i8;
                                int iOooO00o2 = OooO00o(i8);
                                this.f88273OooO0OO++;
                                if ((iOooO00o2 & 192) != 128) {
                                    return '?';
                                }
                                i = (i << 6) + (iOooO00o2 & 63);
                            }
                            return (char) i;
                    }
                case '*':
                case '+':
                case ',':
                    return c;
            }
        }
        return c;
    }

    public final String OooO0OO() {
        int i;
        int i2;
        int i3;
        char c;
        char c2;
        char c3;
        int i4;
        char c4;
        char c5;
        while (true) {
            i = this.f88273OooO0OO;
            i2 = this.f88272OooO0O0;
            if (i >= i2 || this.f88277OooO0oO[i] != ' ') {
                break;
            }
            this.f88273OooO0OO = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.f88274OooO0Oo = i;
        this.f88273OooO0OO = i + 1;
        while (true) {
            i3 = this.f88273OooO0OO;
            if (i3 >= i2 || (c5 = this.f88277OooO0oO[i3]) == '=' || c5 == ' ') {
                break;
            }
            this.f88273OooO0OO = i3 + 1;
        }
        String str = this.f88271OooO00o;
        if (i3 >= i2) {
            throw new IllegalStateException("Unexpected end of DN: " + str);
        }
        this.f88276OooO0o0 = i3;
        if (this.f88277OooO0oO[i3] == ' ') {
            while (true) {
                i4 = this.f88273OooO0OO;
                if (i4 >= i2 || (c4 = this.f88277OooO0oO[i4]) == '=' || c4 != ' ') {
                    break;
                }
                this.f88273OooO0OO = i4 + 1;
            }
            if (this.f88277OooO0oO[i4] != '=' || i4 == i2) {
                throw new IllegalStateException("Unexpected end of DN: " + str);
            }
        }
        this.f88273OooO0OO++;
        while (true) {
            int i5 = this.f88273OooO0OO;
            if (i5 >= i2 || this.f88277OooO0oO[i5] != ' ') {
                break;
            }
            this.f88273OooO0OO = i5 + 1;
        }
        int i6 = this.f88276OooO0o0;
        int i7 = this.f88274OooO0Oo;
        if (i6 - i7 > 4) {
            char[] cArr = this.f88277OooO0oO;
            if (cArr[i7 + 3] == '.' && (((c = cArr[i7]) == 'O' || c == 'o') && (((c2 = cArr[i7 + 1]) == 'I' || c2 == 'i') && ((c3 = cArr[i7 + 2]) == 'D' || c3 == 'd')))) {
                this.f88274OooO0Oo = i7 + 4;
            }
        }
        char[] cArr2 = this.f88277OooO0oO;
        int i8 = this.f88274OooO0Oo;
        return new String(cArr2, i8, i6 - i8);
    }
}
