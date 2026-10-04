package com.huawei.hms.network.embedded;

import com.aspose.words.ControlChar;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.bb */
/* JADX INFO: loaded from: classes9.dex */
public final class C18121bb {

    /* JADX INFO: renamed from: a */
    public final String f54330a;

    /* JADX INFO: renamed from: b */
    public final int f54331b;

    /* JADX INFO: renamed from: c */
    public int f54332c;

    /* JADX INFO: renamed from: d */
    public int f54333d;

    /* JADX INFO: renamed from: e */
    public int f54334e;

    /* JADX INFO: renamed from: f */
    public int f54335f;

    /* JADX INFO: renamed from: g */
    public char[] f54336g;

    public C18121bb(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f54330a = name;
        this.f54331b = name.length();
    }

    /* JADX INFO: renamed from: a */
    private int m78017a(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 >= this.f54331b) {
            throw new IllegalStateException("Malformed DN: " + this.f54330a);
        }
        char[] cArr = this.f54336g;
        char c = cArr[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else {
            if (c < 'A' || c > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f54330a);
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
                throw new IllegalStateException("Malformed DN: " + this.f54330a);
            }
            i3 = c2 - '7';
        }
        return (i2 << 4) + i3;
    }

    /* JADX INFO: renamed from: b */
    private char m78019b() {
        int i = this.f54332c + 1;
        this.f54332c = i;
        if (i == this.f54331b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f54330a);
        }
        char c = this.f54336g[i];
        if (c == ' ' || c == '%' || c == '\\' || c == '_' || c == '\"' || c == '#') {
            return c;
        }
        switch (c) {
            case '*':
            case '+':
            case ',':
                return c;
            default:
                switch (c) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        return c;
                    default:
                        return m78020c();
                }
        }
    }

    /* JADX INFO: renamed from: c */
    private char m78020c() {
        int i;
        int i2;
        int iM78017a = m78017a(this.f54332c);
        this.f54332c++;
        if (iM78017a < 128) {
            return (char) iM78017a;
        }
        if (iM78017a < 192 || iM78017a > 247) {
            return '?';
        }
        if (iM78017a <= 223) {
            i = iM78017a & 31;
            i2 = 1;
        } else if (iM78017a <= 239) {
            i = iM78017a & 15;
            i2 = 2;
        } else {
            i = iM78017a & 7;
            i2 = 3;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.f54332c;
            int i5 = i4 + 1;
            this.f54332c = i5;
            if (i5 == this.f54331b || this.f54336g[i5] != '\\') {
                return '?';
            }
            int i6 = i4 + 2;
            this.f54332c = i6;
            int iM78017a2 = m78017a(i6);
            this.f54332c++;
            if ((iM78017a2 & 192) != 128) {
                return '?';
            }
            i = (i << 6) + (iM78017a2 & 63);
        }
        return (char) i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        r6.f54334e = r0;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String m78021d() {
        char[] cArr;
        char c;
        int i = this.f54332c;
        if (i + 4 >= this.f54331b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f54330a);
        }
        this.f54333d = i;
        while (true) {
            this.f54332c = i + 1;
            i = this.f54332c;
            if (i == this.f54331b || (c = (cArr = this.f54336g)[i]) == '+' || c == ',' || c == ';') {
                break;
            }
            if (c == ' ') {
                this.f54334e = i;
                do {
                    this.f54332c = i + 1;
                    i = this.f54332c;
                    if (i >= this.f54331b) {
                        break;
                    }
                } while (this.f54336g[i] == ' ');
            } else if (c >= 'A' && c <= 'F') {
                cArr[i] = (char) (c + ControlChar.SPACE_CHAR);
            }
        }
        int i2 = this.f54334e;
        int i3 = this.f54333d;
        int i4 = i2 - i3;
        if (i4 < 5 || (i4 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f54330a);
        }
        int i5 = i4 / 2;
        byte[] bArr = new byte[i5];
        int i6 = i3 + 1;
        for (int i7 = 0; i7 < i5; i7++) {
            bArr[i7] = (byte) m78017a(i6);
            i6 += 2;
        }
        return new String(this.f54336g, this.f54333d, i4);
    }

    /* JADX INFO: renamed from: e */
    private String m78022e() {
        int i;
        int i2;
        int i3;
        char c;
        char c2;
        char c3;
        int i4;
        int i5;
        char c4;
        char c5;
        while (true) {
            i = this.f54332c;
            i2 = this.f54331b;
            if (i >= i2 || this.f54336g[i] != ' ') {
                break;
            }
            this.f54332c = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.f54333d = i;
        do {
            this.f54332c = i + 1;
            i = this.f54332c;
            i3 = this.f54331b;
            if (i >= i3 || (c5 = this.f54336g[i]) == '=') {
                break;
            }
        } while (c5 != ' ');
        if (i >= i3) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f54330a);
        }
        this.f54334e = i;
        if (this.f54336g[i] == ' ') {
            while (true) {
                i4 = this.f54332c;
                i5 = this.f54331b;
                if (i4 >= i5 || (c4 = this.f54336g[i4]) == '=' || c4 != ' ') {
                    break;
                }
                this.f54332c = i4 + 1;
            }
            if (this.f54336g[i4] != '=' || i4 == i5) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f54330a);
            }
        }
        int i6 = this.f54332c;
        do {
            this.f54332c = i6 + 1;
            i6 = this.f54332c;
            if (i6 >= this.f54331b) {
                break;
            }
        } while (this.f54336g[i6] == ' ');
        int i7 = this.f54334e;
        int i8 = this.f54333d;
        if (i7 - i8 > 4) {
            char[] cArr = this.f54336g;
            if (cArr[i8 + 3] == '.' && (((c = cArr[i8]) == 'O' || c == 'o') && (((c2 = cArr[i8 + 1]) == 'I' || c2 == 'i') && ((c3 = cArr[i8 + 2]) == 'D' || c3 == 'd')))) {
                this.f54333d = i8 + 4;
            }
        }
        char[] cArr2 = this.f54336g;
        int i9 = this.f54333d;
        return new String(cArr2, i9, i7 - i9);
    }

    /* JADX INFO: renamed from: f */
    private String m78023f() {
        int i = this.f54332c + 1;
        this.f54332c = i;
        this.f54333d = i;
        while (true) {
            this.f54334e = i;
            int i2 = this.f54332c;
            if (i2 == this.f54331b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f54330a);
            }
            char[] cArr = this.f54336g;
            char c = cArr[i2];
            if (c == '\"') {
                do {
                    i2++;
                    this.f54332c = i2;
                    if (i2 >= this.f54331b) {
                        break;
                    }
                } while (this.f54336g[i2] == ' ');
                char[] cArr2 = this.f54336g;
                int i3 = this.f54333d;
                return new String(cArr2, i3, this.f54334e - i3);
            }
            if (c == '\\') {
                cArr[this.f54334e] = m78019b();
            } else {
                cArr[this.f54334e] = c;
            }
            this.f54332c++;
            i = this.f54334e + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        r2 = r8.f54333d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        return new java.lang.String(r1, r2, r8.f54334e - r2);
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String m78018a() {
        int i;
        int i2;
        char c;
        int i3 = this.f54332c;
        this.f54333d = i3;
        this.f54334e = i3;
        while (true) {
            int i4 = this.f54332c;
            if (i4 >= this.f54331b) {
                char[] cArr = this.f54336g;
                int i5 = this.f54333d;
                return new String(cArr, i5, this.f54334e - i5);
            }
            char[] cArr2 = this.f54336g;
            char c2 = cArr2[i4];
            if (c2 == ' ') {
                int i6 = this.f54334e;
                this.f54335f = i6;
                this.f54332c = i4 + 1;
                this.f54334e = i6 + 1;
                cArr2[i6] = ControlChar.SPACE_CHAR;
                while (true) {
                    i = this.f54332c;
                    i2 = this.f54331b;
                    if (i >= i2) {
                        break;
                    }
                    char[] cArr3 = this.f54336g;
                    if (cArr3[i] != ' ') {
                        break;
                    }
                    int i7 = this.f54334e;
                    this.f54334e = i7 + 1;
                    cArr3[i7] = ControlChar.SPACE_CHAR;
                    this.f54332c = i + 1;
                }
                if (i == i2 || (c = this.f54336g[i]) == ',' || c == '+' || c == ';') {
                    break;
                }
            } else {
                if (c2 == ';') {
                    break;
                }
                if (c2 == '\\') {
                    int i8 = this.f54334e;
                    this.f54334e = i8 + 1;
                    cArr2[i8] = m78019b();
                    i4 = this.f54332c;
                } else {
                    if (c2 == '+' || c2 == ',') {
                        break;
                    }
                    int i9 = this.f54334e;
                    this.f54334e = i9 + 1;
                    cArr2[i9] = c2;
                }
                this.f54332c = i4 + 1;
            }
        }
        char[] cArr4 = this.f54336g;
        int i10 = this.f54333d;
        return new String(cArr4, i10, this.f54335f - i10);
    }

    /* JADX INFO: renamed from: a */
    public String m78024a(String str) {
        this.f54332c = 0;
        this.f54333d = 0;
        this.f54334e = 0;
        this.f54335f = 0;
        this.f54336g = this.f54330a.toCharArray();
        String strM78022e = m78022e();
        if (strM78022e == null) {
            return null;
        }
        do {
            int i = this.f54332c;
            if (i == this.f54331b) {
                return null;
            }
            char c = this.f54336g[i];
            String strM78018a = c != '\"' ? c != '#' ? (c == '+' || c == ',' || c == ';') ? "" : m78018a() : m78021d() : m78023f();
            if (str.equalsIgnoreCase(strM78022e)) {
                return strM78018a;
            }
            int i2 = this.f54332c;
            if (i2 >= this.f54331b) {
                return null;
            }
            char c2 = this.f54336g[i2];
            if (c2 != ',' && c2 != ';' && c2 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f54330a);
            }
            this.f54332c = i2 + 1;
            strM78022e = m78022e();
        } while (strM78022e != null);
        throw new IllegalStateException("Malformed DN: " + this.f54330a);
    }
}
