package com.huawei.hms.drive;

import OooO0Oo.C20398OooO0O0;
import com.aspose.slides.C22218Oooo;
import com.aspose.words.ControlChar;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: renamed from: com.huawei.hms.drive.b */
/* JADX INFO: loaded from: classes6.dex */
public class C17790b implements Closeable {

    /* JADX INFO: renamed from: b */
    private static final char[] f52766b = ")]}'\n".toCharArray();

    /* JADX INFO: renamed from: c */
    private final Reader f52768c;

    /* JADX INFO: renamed from: j */
    private long f52775j;

    /* JADX INFO: renamed from: k */
    private int f52776k;

    /* JADX INFO: renamed from: l */
    private String f52777l;

    /* JADX INFO: renamed from: m */
    private int[] f52778m;

    /* JADX INFO: renamed from: o */
    private String[] f52780o;

    /* JADX INFO: renamed from: p */
    private int[] f52781p;

    /* JADX INFO: renamed from: d */
    private boolean f52769d = false;

    /* JADX INFO: renamed from: e */
    private final char[] f52770e = new char[1024];

    /* JADX INFO: renamed from: f */
    private int f52771f = 0;

    /* JADX INFO: renamed from: g */
    private int f52772g = 0;

    /* JADX INFO: renamed from: h */
    private int f52773h = 0;

    /* JADX INFO: renamed from: i */
    private int f52774i = 0;

    /* JADX INFO: renamed from: a */
    int f52767a = 0;

    /* JADX INFO: renamed from: n */
    private int f52779n = 1;

    static {
        AbstractC17763a.f52543a = new AbstractC17763a() { // from class: com.huawei.hms.drive.b.1
        };
    }

    public C17790b(Reader reader) {
        int[] iArr = new int[32];
        this.f52778m = iArr;
        iArr[0] = 6;
        this.f52780o = new String[32];
        this.f52781p = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f52768c = reader;
    }

    /* JADX INFO: renamed from: n */
    private int m76103n() throws IOException {
        String str;
        String str2;
        int i;
        char c = this.f52770e[this.f52771f];
        if (c == 't' || c == 'T') {
            str = TelemetryEventStrings.Value.TRUE;
            str2 = "TRUE";
            i = 5;
        } else if (c == 'f' || c == 'F') {
            str = TelemetryEventStrings.Value.FALSE;
            str2 = "FALSE";
            i = 6;
        } else {
            if (c != 'n' && c != 'N') {
                return 0;
            }
            str = CloudMetaExtra.DEFINE_NON_PARENT_ID;
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f52771f + i2 >= this.f52772g && !m76101b(i2 + 1)) {
                return 0;
            }
            char c2 = this.f52770e[this.f52771f + i2];
            if (c2 != str.charAt(i2) && c2 != str2.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f52771f + length < this.f52772g || m76101b(length + 1)) && m76096a(this.f52770e[this.f52771f + length])) {
            return 0;
        }
        this.f52771f += length;
        this.f52767a = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0093, code lost:
    
        if (m76096a(r14) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0095, code lost:
    
        if (r9 != 2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0097, code lost:
    
        if (r10 == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009d, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009f, code lost:
    
        if (r13 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a3, code lost:
    
        if (r11 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a5, code lost:
    
        if (r13 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a7, code lost:
    
        if (r13 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00aa, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ab, code lost:
    
        r19.f52775j = r11;
        r19.f52771f += r8;
        r19.f52767a = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b6, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b7, code lost:
    
        if (r9 == 2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ba, code lost:
    
        if (r9 == 4) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bd, code lost:
    
        if (r9 != 7) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c0, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c1, code lost:
    
        r19.f52776k = r8;
        r19.f52767a = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c7, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c8, code lost:
    
        return r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e1  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m76104o() throws IOException {
        char c;
        int i;
        char[] cArr = this.f52770e;
        int i2 = this.f52771f;
        int i3 = this.f52772g;
        int i4 = 0;
        int i5 = 0;
        char c2 = 0;
        boolean z = false;
        int i6 = 1;
        long j = 0;
        while (true) {
            char c3 = 2;
            if (i2 + i5 != i3) {
                c = cArr[i2 + i5];
                i = i4;
                if (c == '+') {
                    if (c == 'E' || c == 'e') {
                        if (c2 != 2 && c2 != 4) {
                            return i;
                        }
                        c2 = 5;
                    } else if (c == '-') {
                        c3 = 6;
                        if (c2 == 0) {
                            c2 = 1;
                            z = true;
                        } else if (c2 != 5) {
                            return i;
                        }
                    } else if (c != '.') {
                        if (c < '0' || c > '9') {
                            break;
                        }
                        if (c2 == 1 || c2 == 0) {
                            j = -(c - '0');
                        } else if (c2 == 2) {
                            if (j == 0) {
                                return i;
                            }
                            long j2 = (10 * j) - ((long) (c - '0'));
                            i6 &= (j > -922337203685477580L || (j == -922337203685477580L && j2 < j)) ? 1 : i;
                            j = j2;
                        } else if (c2 == 3) {
                            c2 = 4;
                        } else if (c2 == 5 || c2 == 6) {
                            c2 = 7;
                        }
                    } else {
                        if (c2 != 2) {
                            return i;
                        }
                        c2 = 3;
                    }
                    i5++;
                    i4 = i;
                } else {
                    c3 = 6;
                    if (c2 != 5) {
                        return i;
                    }
                }
                c2 = c3;
                i5++;
                i4 = i;
            } else {
                if (i5 == cArr.length) {
                    return i4;
                }
                if (!m76101b(i5 + 1)) {
                    i = i4;
                    break;
                }
                i2 = this.f52771f;
                i3 = this.f52772g;
                c = cArr[i2 + i5];
                i = i4;
                if (c == '+') {
                }
                c2 = c3;
                i5++;
                i4 = i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        m76107r();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String m76105p() throws IOException {
        String string;
        StringBuilder sb = null;
        int i = 0;
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.f52771f;
                if (i3 + i2 < this.f52772g) {
                    char c = this.f52770e[i3 + i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i2 >= this.f52770e.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i2, 16));
                    }
                    sb.append(this.f52770e, this.f52771f, i2);
                    this.f52771f += i2;
                } else if (m76101b(i2 + 1)) {
                }
            }
            i = i2;
            if (sb != null) {
                string = new String(this.f52770e, this.f52771f, i);
            } else {
                sb.append(this.f52770e, this.f52771f, i);
                string = sb.toString();
            }
            this.f52771f += i;
            return string;
        } while (m76101b(1));
        if (sb != null) {
        }
        this.f52771f += i;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        m76107r();
     */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m76106q() throws IOException {
        do {
            int i = 0;
            while (true) {
                int i2 = this.f52771f;
                if (i2 + i < this.f52772g) {
                    char c = this.f52770e[i2 + i];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.f52771f = i2 + i;
                }
            }
            this.f52771f += i;
            return;
        } while (m76101b(1));
    }

    /* JADX INFO: renamed from: r */
    private void m76107r() throws IOException {
        if (!this.f52769d) {
            throw m76099b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* JADX INFO: renamed from: s */
    private void m76108s() throws IOException {
        char c;
        do {
            if (this.f52771f >= this.f52772g && !m76101b(1)) {
                return;
            }
            char[] cArr = this.f52770e;
            int i = this.f52771f;
            int i2 = i + 1;
            this.f52771f = i2;
            c = cArr[i];
            if (c == '\n') {
                this.f52773h++;
                this.f52774i = i2;
                return;
            }
        } while (c != '\r');
    }

    /* JADX INFO: renamed from: t */
    private char m76109t() throws IOException {
        int i;
        if (this.f52771f == this.f52772g && !m76101b(1)) {
            throw m76099b("Unterminated escape sequence");
        }
        char[] cArr = this.f52770e;
        int i2 = this.f52771f;
        int i3 = i2 + 1;
        this.f52771f = i3;
        char c = cArr[i2];
        if (c == '\n') {
            this.f52773h++;
            this.f52774i = i3;
            return c;
        }
        if (c == '\"' || c == '\'' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return ControlChar.PARAGRAPH_BREAK_CHAR;
        }
        if (c == 't') {
            return '\t';
        }
        if (c != 'u') {
            throw m76099b("Invalid escape sequence");
        }
        if (i2 + 5 > this.f52772g && !m76101b(4)) {
            throw m76099b("Unterminated escape sequence");
        }
        int i4 = this.f52771f;
        int i5 = i4 + 4;
        char c2 = 0;
        while (i4 < i5) {
            char c3 = this.f52770e[i4];
            char c4 = (char) (c2 << 4);
            if (c3 >= '0' && c3 <= '9') {
                i = c3 - '0';
            } else if (c3 >= 'a' && c3 <= 'f') {
                i = c3 - 'W';
            } else {
                if (c3 < 'A' || c3 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(this.f52770e, this.f52771f, 4)));
                }
                i = c3 - '7';
            }
            c2 = (char) (i + c4);
            i4++;
        }
        this.f52771f += 4;
        return c2;
    }

    /* JADX INFO: renamed from: u */
    private void m76110u() throws IOException {
        m76098b(true);
        int i = this.f52771f - 1;
        this.f52771f = i;
        char[] cArr = f52766b;
        if (i + cArr.length > this.f52772g && !m76101b(cArr.length)) {
            return;
        }
        int i2 = 0;
        while (true) {
            char[] cArr2 = f52766b;
            if (i2 >= cArr2.length) {
                this.f52771f += cArr2.length;
                return;
            } else if (this.f52770e[this.f52771f + i2] != cArr2[i2]) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m76112a(boolean z) {
        this.f52769d = z;
    }

    /* JADX INFO: renamed from: b */
    public void m76113b() throws IOException {
        int iM76117f = this.f52767a;
        if (iM76117f == 0) {
            iM76117f = m76117f();
        }
        if (iM76117f != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + m76116e() + m76123l());
        }
        int i = this.f52779n;
        this.f52779n = i - 1;
        int[] iArr = this.f52781p;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.f52767a = 0;
    }

    /* JADX INFO: renamed from: c */
    public void m76114c() throws IOException {
        int iM76117f = this.f52767a;
        if (iM76117f == 0) {
            iM76117f = m76117f();
        }
        if (iM76117f == 1) {
            m76095a(3);
            this.f52767a = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + m76116e() + m76123l());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f52767a = 0;
        this.f52778m[0] = 8;
        this.f52779n = 1;
        this.f52768c.close();
    }

    /* JADX INFO: renamed from: d */
    public void m76115d() throws IOException {
        int iM76117f = this.f52767a;
        if (iM76117f == 0) {
            iM76117f = m76117f();
        }
        if (iM76117f != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + m76116e() + m76123l());
        }
        int i = this.f52779n;
        int i2 = i - 1;
        this.f52779n = i2;
        this.f52780o[i2] = null;
        int[] iArr = this.f52781p;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f52767a = 0;
    }

    /* JADX INFO: renamed from: e */
    public EnumC17817c m76116e() throws IOException {
        int iM76117f = this.f52767a;
        if (iM76117f == 0) {
            iM76117f = m76117f();
        }
        switch (iM76117f) {
            case 1:
                return EnumC17817c.BEGIN_OBJECT;
            case 2:
                return EnumC17817c.END_OBJECT;
            case 3:
                return EnumC17817c.BEGIN_ARRAY;
            case 4:
                return EnumC17817c.END_ARRAY;
            case 5:
            case 6:
                return EnumC17817c.BOOLEAN;
            case 7:
                return EnumC17817c.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC17817c.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC17817c.NAME;
            case 15:
            case 16:
                return EnumC17817c.NUMBER;
            case 17:
                return EnumC17817c.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: f */
    public int m76117f() throws IOException {
        int iM76098b;
        int[] iArr = this.f52778m;
        int i = this.f52779n;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int iM76098b2 = m76098b(true);
            if (iM76098b2 != 44) {
                if (iM76098b2 != 59) {
                    if (iM76098b2 != 93) {
                        throw m76099b("Unterminated array");
                    }
                    this.f52767a = 4;
                    return 4;
                }
                m76107r();
            }
        } else {
            if (i2 == 3 || i2 == 5) {
                iArr[i - 1] = 4;
                if (i2 == 5 && (iM76098b = m76098b(true)) != 44) {
                    if (iM76098b != 59) {
                        if (iM76098b != 125) {
                            throw m76099b("Unterminated object");
                        }
                        this.f52767a = 2;
                        return 2;
                    }
                    m76107r();
                }
                int iM76098b3 = m76098b(true);
                if (iM76098b3 == 34) {
                    this.f52767a = 13;
                    return 13;
                }
                if (iM76098b3 == 39) {
                    m76107r();
                    this.f52767a = 12;
                    return 12;
                }
                if (iM76098b3 == 125) {
                    if (i2 == 5) {
                        throw m76099b("Expected name");
                    }
                    this.f52767a = 2;
                    return 2;
                }
                m76107r();
                this.f52771f--;
                if (!m76096a((char) iM76098b3)) {
                    throw m76099b("Expected name");
                }
                this.f52767a = 14;
                return 14;
            }
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int iM76098b4 = m76098b(true);
                if (iM76098b4 != 58) {
                    if (iM76098b4 != 61) {
                        throw m76099b("Expected ':'");
                    }
                    m76107r();
                    if (this.f52771f < this.f52772g || m76101b(1)) {
                        char[] cArr = this.f52770e;
                        int i3 = this.f52771f;
                        if (cArr[i3] == '>') {
                            this.f52771f = i3 + 1;
                        }
                    }
                }
            } else if (i2 == 6) {
                if (this.f52769d) {
                    m76110u();
                }
                this.f52778m[this.f52779n - 1] = 7;
            } else if (i2 == 7) {
                if (m76098b(false) == -1) {
                    this.f52767a = 17;
                    return 17;
                }
                m76107r();
                this.f52771f--;
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iM76098b5 = m76098b(true);
        if (iM76098b5 == 34) {
            this.f52767a = 9;
            return 9;
        }
        if (iM76098b5 == 39) {
            m76107r();
            this.f52767a = 8;
            return 8;
        }
        if (iM76098b5 != 44 && iM76098b5 != 59) {
            if (iM76098b5 == 91) {
                this.f52767a = 3;
                return 3;
            }
            if (iM76098b5 != 93) {
                if (iM76098b5 == 123) {
                    this.f52767a = 1;
                    return 1;
                }
                this.f52771f--;
                int iM76103n = m76103n();
                if (iM76103n != 0) {
                    return iM76103n;
                }
                int iM76104o = m76104o();
                if (iM76104o != 0) {
                    return iM76104o;
                }
                if (!m76096a(this.f52770e[this.f52771f])) {
                    throw m76099b("Expected value");
                }
                m76107r();
                this.f52767a = 10;
                return 10;
            }
            if (i2 == 1) {
                this.f52767a = 4;
                return 4;
            }
        }
        if (i2 != 1 && i2 != 2) {
            throw m76099b("Unexpected value");
        }
        m76107r();
        this.f52771f--;
        this.f52767a = 7;
        return 7;
    }

    /* JADX INFO: renamed from: g */
    public String m76118g() throws IOException {
        String strM76100b;
        int iM76117f = this.f52767a;
        if (iM76117f == 0) {
            iM76117f = m76117f();
        }
        if (iM76117f == 14) {
            strM76100b = m76105p();
        } else if (iM76117f == 12) {
            strM76100b = m76100b('\'');
        } else {
            if (iM76117f != 13) {
                throw new IllegalStateException("Expected a name but was " + m76116e() + m76123l());
            }
            strM76100b = m76100b('\"');
        }
        this.f52767a = 0;
        this.f52780o[this.f52779n - 1] = strM76100b;
        return strM76100b;
    }

    /* JADX INFO: renamed from: h */
    public String m76119h() throws IOException {
        String str;
        int iM76117f = this.f52767a;
        if (iM76117f == 0) {
            iM76117f = m76117f();
        }
        if (iM76117f == 10) {
            str = m76105p();
        } else if (iM76117f == 8) {
            str = m76100b('\'');
        } else if (iM76117f == 9) {
            str = m76100b('\"');
        } else if (iM76117f == 11) {
            str = this.f52777l;
            this.f52777l = null;
        } else if (iM76117f == 15) {
            str = Long.toString(this.f52775j);
        } else {
            if (iM76117f != 16) {
                throw new IllegalStateException("Expected a string but was " + m76116e() + m76123l());
            }
            str = new String(this.f52770e, this.f52771f, this.f52776k);
            this.f52771f += this.f52776k;
        }
        this.f52767a = 0;
        int[] iArr = this.f52781p;
        int i = this.f52779n - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    /* JADX INFO: renamed from: i */
    public boolean m76120i() throws IOException {
        int iM76117f = this.f52767a;
        if (iM76117f == 0) {
            iM76117f = m76117f();
        }
        if (iM76117f == 5) {
            this.f52767a = 0;
            int[] iArr = this.f52781p;
            int i = this.f52779n - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM76117f != 6) {
            throw new IllegalStateException("Expected a boolean but was " + m76116e() + m76123l());
        }
        this.f52767a = 0;
        int[] iArr2 = this.f52781p;
        int i2 = this.f52779n - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    /* JADX INFO: renamed from: j */
    public void m76121j() throws IOException {
        int iM76117f = this.f52767a;
        if (iM76117f == 0) {
            iM76117f = m76117f();
        }
        if (iM76117f != 7) {
            throw new IllegalStateException("Expected null but was " + m76116e() + m76123l());
        }
        this.f52767a = 0;
        int[] iArr = this.f52781p;
        int i = this.f52779n - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* JADX INFO: renamed from: k */
    public void m76122k() throws IOException {
        int i = 0;
        do {
            int iM76117f = this.f52767a;
            if (iM76117f == 0) {
                iM76117f = m76117f();
            }
            if (iM76117f == 3) {
                m76095a(1);
            } else if (iM76117f == 1) {
                m76095a(3);
            } else if (iM76117f == 4 || iM76117f == 2) {
                this.f52779n--;
                i--;
                this.f52767a = 0;
            } else {
                if (iM76117f == 14 || iM76117f == 10) {
                    m76106q();
                } else if (iM76117f == 8 || iM76117f == 12) {
                    m76102c('\'');
                } else if (iM76117f == 9 || iM76117f == 13) {
                    m76102c('\"');
                } else if (iM76117f == 16) {
                    this.f52771f += this.f52776k;
                }
                this.f52767a = 0;
            }
            i++;
            this.f52767a = 0;
        } while (i != 0);
        int[] iArr = this.f52781p;
        int i2 = this.f52779n;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f52780o[i2 - 1] = CloudMetaExtra.DEFINE_NON_PARENT_ID;
    }

    /* JADX INFO: renamed from: l */
    public String m76123l() {
        StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0(" at line ", this.f52773h + 1, " column ", " path ", (this.f52771f - this.f52774i) + 1);
        sbOooO0O0.append(m76124m());
        return sbOooO0O0.toString();
    }

    /* JADX INFO: renamed from: m */
    public String m76124m() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f52779n;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f52778m[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.f52781p[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append(FilenameUtils.EXTENSION_SEPARATOR);
                String str = this.f52780o[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public String toString() {
        return getClass().getSimpleName() + m76123l();
    }

    /* JADX INFO: renamed from: a */
    public void m76111a() throws IOException {
        int iM76117f = this.f52767a;
        if (iM76117f == 0) {
            iM76117f = m76117f();
        }
        if (iM76117f == 3) {
            m76095a(1);
            this.f52781p[this.f52779n - 1] = 0;
            this.f52767a = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + m76116e() + m76123l());
        }
    }

    /* JADX INFO: renamed from: c */
    private void m76102c(char c) throws IOException {
        char[] cArr = this.f52770e;
        do {
            int i = this.f52771f;
            int i2 = this.f52772g;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.f52771f = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.f52771f = i3;
                    m76109t();
                    i = this.f52771f;
                    i2 = this.f52772g;
                } else {
                    if (c2 == '\n') {
                        this.f52773h++;
                        this.f52774i = i3;
                    }
                    i = i3;
                }
            }
            this.f52771f = i;
        } while (m76101b(1));
        throw m76099b("Unterminated string");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r9.f52771f = r2;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String m76100b(char c) throws IOException {
        char[] cArr = this.f52770e;
        StringBuilder sb = null;
        do {
            int i = this.f52771f;
            int i2 = this.f52772g;
            while (true) {
                int i3 = i2;
                int i4 = i;
                while (i < i3) {
                    int i5 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.f52771f = i5;
                        int i6 = (i5 - i4) - 1;
                        if (sb == null) {
                            return new String(cArr, i4, i6);
                        }
                        sb.append(cArr, i4, i6);
                        return sb.toString();
                    }
                    if (c2 == '\\') {
                        this.f52771f = i5;
                        int i7 = i5 - i4;
                        int i8 = i7 - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max(i7 * 2, 16));
                        }
                        sb.append(cArr, i4, i8);
                        sb.append(m76109t());
                        i = this.f52771f;
                        i2 = this.f52772g;
                    } else {
                        if (c2 == '\n') {
                            this.f52773h++;
                            this.f52774i = i5;
                        }
                        i = i5;
                    }
                }
                break;
            }
        } while (m76101b(1));
        throw m76099b("Unterminated string");
    }

    /* JADX INFO: renamed from: a */
    private boolean m76096a(char c) throws IOException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m76107r();
        return false;
    }

    /* JADX INFO: renamed from: a */
    private void m76095a(int i) {
        int i2 = this.f52779n;
        int[] iArr = this.f52778m;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f52778m = Arrays.copyOf(iArr, i3);
            this.f52781p = Arrays.copyOf(this.f52781p, i3);
            this.f52780o = (String[]) Arrays.copyOf(this.f52780o, i3);
        }
        int[] iArr2 = this.f52778m;
        int i4 = this.f52779n;
        this.f52779n = i4 + 1;
        iArr2[i4] = i;
    }

    /* JADX INFO: renamed from: a */
    private boolean m76097a(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.f52771f + length > this.f52772g && !m76101b(length)) {
                return false;
            }
            char[] cArr = this.f52770e;
            int i = this.f52771f;
            if (cArr[i] != '\n') {
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.f52770e[this.f52771f + i2] != str.charAt(i2)) {
                        break;
                    }
                }
                return true;
            }
            this.f52773h++;
            this.f52774i = i + 1;
            this.f52771f++;
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m76101b(int i) throws IOException {
        int i2;
        int i3;
        char[] cArr = this.f52770e;
        int i4 = this.f52774i;
        int i5 = this.f52771f;
        this.f52774i = i4 - i5;
        int i6 = this.f52772g;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f52772g = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f52772g = 0;
        }
        this.f52771f = 0;
        do {
            Reader reader = this.f52768c;
            int i8 = this.f52772g;
            int i9 = reader.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.f52772g + i9;
            this.f52772g = i2;
            if (this.f52773h == 0 && (i3 = this.f52774i) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f52771f++;
                this.f52774i = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        return r5;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m76098b(boolean z) throws IOException {
        char[] cArr = this.f52770e;
        int i = this.f52771f;
        int i2 = this.f52772g;
        while (true) {
            if (i == i2) {
                this.f52771f = i;
                if (!m76101b(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m76123l());
                }
                i = this.f52771f;
                i2 = this.f52772g;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.f52773h++;
                this.f52774i = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f52771f = i3;
                    if (i3 == i2) {
                        this.f52771f = i;
                        boolean zM76101b = m76101b(2);
                        this.f52771f++;
                        if (!zM76101b) {
                            break;
                        }
                        break;
                        break;
                    }
                    m76107r();
                    int i4 = this.f52771f;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f52771f = i4 + 1;
                        if (m76097a("*/")) {
                            i = this.f52771f + 2;
                            i2 = this.f52772g;
                        } else {
                            throw m76099b("Unterminated comment");
                        }
                    } else {
                        if (c2 != '/') {
                            break;
                        }
                        this.f52771f = i4 + 1;
                        m76108s();
                        i = this.f52771f;
                        i2 = this.f52772g;
                    }
                } else if (c == '#') {
                    this.f52771f = i3;
                    m76107r();
                    m76108s();
                    i = this.f52771f;
                    i2 = this.f52772g;
                } else {
                    this.f52771f = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* JADX INFO: renamed from: b */
    private IOException m76099b(String str) throws IOException {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(str);
        sbOooO0OO.append(m76123l());
        throw new C17870e(sbOooO0OO.toString());
    }
}
