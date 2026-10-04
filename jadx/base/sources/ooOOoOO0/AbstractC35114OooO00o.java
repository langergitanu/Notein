package ooOOoOO0;

import OooO0Oo.C20398OooO0O0;
import com.aspose.slides.C22226Oooo0oo;
import com.aspose.words.ControlChar;
import com.facebook.imagepipeline.producers.C22306Ooooooo;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: ooOOoOO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC35114OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f126099OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C35130OooOo0o f126100OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f126101OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final StringBuilder f126102OooO0Oo;

    public AbstractC35114OooO00o() {
        C35130OooOo0o c35130OooOo0o = new C35130OooOo0o();
        c35130OooOo0o.f126138OooO00o = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        c35130OooOo0o.f126139OooO0O0 = iArr;
        c35130OooOo0o.f126140OooO0OO = -1;
        this.f126100OooO0O0 = c35130OooOo0o;
        this.f126102OooO0Oo = new StringBuilder();
    }

    public static /* synthetic */ void OooOOo(AbstractC35114OooO00o abstractC35114OooO00o, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = abstractC35114OooO00o.f126099OooO00o;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        abstractC35114OooO00o.OooOOo0(i, str, str2);
        throw null;
    }

    public static boolean OooOo0O(char c) {
        return (c == ',' || c == ':' || c == ']' || c == '}') ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b4, code lost:
    
        OooOOo(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ba, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c0, code lost:
    
        throw new oO00ooO.C32442OooOO0o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c1, code lost:
    
        if (r13 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c3, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c8, code lost:
    
        if (r14 == Long.MIN_VALUE) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01cb, code lost:
    
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01cc, code lost:
    
        OooOOo(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01d2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01d3, code lost:
    
        OooOOo(r22, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01d8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0111, code lost:
    
        r12 = r6;
        OooOOo(r22, "Unexpected symbol '" + r8 + "' in numeric literal", 0, r12, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012a, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012b, code lost:
    
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0133, code lost:
    
        if (r11 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0135, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0137, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0138, code lost:
    
        if (r1 == r11) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013a, code lost:
    
        if (r13 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013e, code lost:
    
        if (r1 == (r11 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0146, code lost:
    
        if (r19 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0148, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0154, code lost:
    
        if (OooOo0().charAt(r11) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0156, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0159, code lost:
    
        OooOOo(r22, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0161, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0162, code lost:
    
        OooOOo(r22, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0168, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0169, code lost:
    
        r22.f126099OooO00o = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x016b, code lost:
    
        if (r21 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016d, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0170, code lost:
    
        if (r20 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0172, code lost:
    
        r5 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x017c, code lost:
    
        if (r20 != true) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x017e, code lost:
    
        r5 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0183, code lost:
    
        r1 = r1 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0188, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x018e, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0196, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0198, code lost:
    
        r14 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x019a, code lost:
    
        OooOOo(r22, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long OooO() {
        boolean z;
        boolean z2;
        boolean z3;
        int iOooOoO = OooOoO(OooOoOO());
        ?? r6 = 0;
        if (iOooOoO < OooOo0().length() && iOooOoO != -1) {
            if (OooOo0().charAt(iOooOoO) == '\"') {
                iOooOoO++;
                if (iOooOoO == OooOo0().length()) {
                    OooOOo(this, "EOF", 0, null, 6);
                    throw null;
                }
                z = true;
            } else {
                z = false;
            }
            int i = iOooOoO;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            long j = 0;
            long j2 = 0;
            while (true) {
                if (i == OooOo0().length()) {
                    z2 = z;
                    z3 = z5;
                    break;
                }
                char cCharAt = OooOo0().charAt(i);
                if ((cCharAt != 'e' && cCharAt != 'E') || z5) {
                    z2 = z;
                    if (cCharAt == '-' && z5) {
                        if (i == iOooOoO) {
                            OooOOo(this, "Unexpected symbol '-' in numeric literal", 0, r6, 6);
                            throw r6;
                        }
                        i++;
                        z = z2;
                        z4 = false;
                        r6 = r6;
                    } else if (cCharAt != '+' || !z5) {
                        z3 = z5;
                        if (cCharAt != '-') {
                            if (C22306Ooooooo.OooO0OO(cCharAt) != 0) {
                                break;
                            }
                            i++;
                            int i2 = cCharAt - '0';
                            if (i2 < 0 || i2 >= 10) {
                                break;
                            }
                            if (z3) {
                                j = (j * ((long) 10)) + ((long) i2);
                                z = z2;
                                z5 = z3;
                                r6 = r6;
                            } else {
                                boolean z7 = z4;
                                j2 = (j2 * ((long) 10)) - ((long) i2);
                                if (j2 > 0) {
                                    OooOOo(this, "Numeric value overflow", 0, null, 6);
                                    throw null;
                                }
                                z = z2;
                                z4 = z7;
                                z5 = z3;
                                r6 = 0;
                            }
                        } else {
                            if (i != iOooOoO) {
                                OooOOo(this, "Unexpected symbol '-' in numeric literal", 0, r6, 6);
                                throw r6;
                            }
                            i++;
                            z = z2;
                            z5 = z3;
                            z6 = true;
                        }
                    } else {
                        if (i == iOooOoO) {
                            OooOOo(this, "Unexpected symbol '+' in numeric literal", 0, r6, 6);
                            throw r6;
                        }
                        i++;
                        z = z2;
                        z4 = true;
                        r6 = r6;
                    }
                } else {
                    if (i == iOooOoO) {
                        OooOOo(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, r6, 6);
                        throw r6;
                    }
                    i++;
                    z4 = true;
                    z5 = true;
                }
            }
        } else {
            OooOOo(this, "EOF", 0, null, 6);
            throw null;
        }
    }

    public final int OooO00o(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            this.f126102OooO0Oo.append((char) (OooOo00(i + 3, charSequence) + (OooOo00(i, charSequence) << 12) + (OooOo00(i + 1, charSequence) << 8) + (OooOo00(i + 2, charSequence) << 4)));
            return i2;
        }
        this.f126099OooO00o = i;
        OooOOOO();
        if (this.f126099OooO00o + 4 < charSequence.length()) {
            return OooO00o(this.f126099OooO00o, charSequence);
        }
        OooOOo(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void OooO0O0(int i, int i2) {
        this.f126102OooO0Oo.append(OooOo0(), i, i2);
    }

    public abstract boolean OooO0OO();

    public final void OooO0Oo(int i, String str) {
        if (OooOo0().length() - i < str.length()) {
            OooOOo(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (OooOo0().charAt(i + i2) | ControlChar.SPACE_CHAR)) {
                OooOOo(this, "Expected valid boolean literal prefix, but had '" + OooOO0o() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f126099OooO00o = str.length() + i;
    }

    public abstract byte OooO0o();

    public abstract String OooO0o0();

    public final byte OooO0oO(byte b) {
        byte bOooO0o = OooO0o();
        if (bOooO0o == b) {
            return bOooO0o;
        }
        OooOOoo(b, true);
        throw null;
    }

    public abstract void OooO0oo(char c);

    public final String OooOO0() {
        String str = this.f126101OooO0OO;
        if (str == null) {
            return OooO0o0();
        }
        kotlin.jvm.internal.OooOOO0.OooO0Oo(str);
        this.f126101OooO0OO = null;
        return str;
    }

    public final String OooOO0O(CharSequence source, int i, int i2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(source, "source");
        char cCharAt = source.charAt(i2);
        boolean z = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                OooO0O0(i, i2);
                int iOooOoO = OooOoO(i2 + 1);
                if (iOooOoO == -1) {
                    OooOOo(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
                int iOooO00o = iOooOoO + 1;
                char cCharAt2 = OooOo0().charAt(iOooOoO);
                if (cCharAt2 == 'u') {
                    iOooO00o = OooO00o(iOooO00o, OooOo0());
                } else {
                    char c = cCharAt2 < 'u' ? C35113OooO.f126097OooO00o[cCharAt2] : (char) 0;
                    if (c == 0) {
                        OooOOo(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                        throw null;
                    }
                    this.f126102OooO0Oo.append(c);
                }
                i = OooOoO(iOooO00o);
                if (i == -1) {
                    OooOOo(this, "Unexpected EOF", i, null, 4);
                    throw null;
                }
            } else {
                i2++;
                if (i2 >= source.length()) {
                    OooO0O0(i, i2);
                    i = OooOoO(i2);
                    if (i == -1) {
                        OooOOo(this, "Unexpected EOF", i, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                    cCharAt = source.charAt(i2);
                }
            }
            i2 = i;
            z = true;
            cCharAt = source.charAt(i2);
        }
        String strOooOoo0 = !z ? OooOoo0(i, i2) : OooOOO(i, i2);
        this.f126099OooO00o = i2 + 1;
        return strOooOoo0;
    }

    public final String OooOO0o() {
        String str = this.f126101OooO0OO;
        if (str != null) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(str);
            this.f126101OooO0OO = null;
            return str;
        }
        int iOooOoOO = OooOoOO();
        if (iOooOoOO >= OooOo0().length() || iOooOoOO == -1) {
            OooOOo(this, "EOF", iOooOoOO, null, 4);
            throw null;
        }
        byte bOooO0OO = C22306Ooooooo.OooO0OO(OooOo0().charAt(iOooOoOO));
        if (bOooO0OO == 1) {
            return OooOO0();
        }
        if (bOooO0OO != 0) {
            OooOOo(this, "Expected beginning of the string, but got " + OooOo0().charAt(iOooOoOO), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (C22306Ooooooo.OooO0OO(OooOo0().charAt(iOooOoOO)) == 0) {
            iOooOoOO++;
            if (iOooOoOO >= OooOo0().length()) {
                OooO0O0(this.f126099OooO00o, iOooOoOO);
                int iOooOoO = OooOoO(iOooOoOO);
                if (iOooOoO == -1) {
                    this.f126099OooO00o = iOooOoOO;
                    return OooOOO(0, 0);
                }
                iOooOoOO = iOooOoO;
                z = true;
            }
        }
        String strOooOoo0 = !z ? OooOoo0(this.f126099OooO00o, iOooOoOO) : OooOOO(this.f126099OooO00o, iOooOoOO);
        this.f126099OooO00o = iOooOoOO;
        return strOooOoo0;
    }

    public final String OooOOO(int i, int i2) {
        OooO0O0(i, i2);
        StringBuilder sb = this.f126102OooO0Oo;
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
        sb.setLength(0);
        return string;
    }

    public final String OooOOO0() {
        String strOooOO0o = OooOO0o();
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(strOooOO0o, CloudMetaExtra.DEFINE_NON_PARENT_ID) || OooOo0().charAt(this.f126099OooO00o - 1) == '\"') {
            return strOooOO0o;
        }
        OooOOo(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public void OooOOOO() {
    }

    public final void OooOOOo() {
        if (OooO0o() == 10) {
            return;
        }
        OooOOo(this, "Expected EOF after parsing, but had " + OooOo0().charAt(this.f126099OooO00o - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final void OooOOo0(int i, String message, String hint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(message, "message");
        kotlin.jvm.internal.OooOOO0.OooO0oO(hint, "hint");
        String strConcat = hint.length() == 0 ? "" : IOUtils.LINE_SEPARATOR_UNIX.concat(hint);
        StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(message, " at path: ");
        sbOooO0OO.append(this.f126100OooO0O0.OooO00o());
        sbOooO0OO.append(strConcat);
        throw OoooO0O.OooOo.OooO0o0(OooOo0(), i, sbOooO0OO.toString());
    }

    public final void OooOOoo(byte b, boolean z) {
        String strOooO0o0 = C22306Ooooooo.OooO0o0(b);
        int i = z ? this.f126099OooO00o - 1 : this.f126099OooO00o;
        OooOOo(this, androidx.core.database.OooO00o.OooO00o("Expected ", strOooO0o0, ", but had '", (this.f126099OooO00o == OooOo0().length() || i < 0) ? "EOF" : String.valueOf(OooOo0().charAt(i)), "' instead"), i, null, 4);
        throw null;
    }

    public byte OooOo() {
        CharSequence charSequenceOooOo0 = OooOo0();
        int i = this.f126099OooO00o;
        while (true) {
            int iOooOoO = OooOoO(i);
            if (iOooOoO == -1) {
                this.f126099OooO00o = iOooOoO;
                return (byte) 10;
            }
            char cCharAt = charSequenceOooOo0.charAt(iOooOoO);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f126099OooO00o = iOooOoO;
                return C22306Ooooooo.OooO0OO(cCharAt);
            }
            i = iOooOoO + 1;
        }
    }

    public abstract CharSequence OooOo0();

    public final int OooOo00(int i, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        OooOOo(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public abstract String OooOo0o(String str, boolean z);

    public abstract int OooOoO(int i);

    public final String OooOoO0(boolean z) {
        String strOooOO0;
        byte bOooOo = OooOo();
        if (z) {
            if (bOooOo != 1 && bOooOo != 0) {
                return null;
            }
            strOooOO0 = OooOO0o();
        } else {
            if (bOooOo != 1) {
                return null;
            }
            strOooOO0 = OooOO0();
        }
        this.f126101OooO0OO = strOooOO0;
        return strOooOO0;
    }

    public abstract int OooOoOO();

    public final boolean OooOoo() {
        int iOooOoOO = OooOoOO();
        CharSequence charSequenceOooOo0 = OooOo0();
        if (iOooOoOO >= charSequenceOooOo0.length() || iOooOoOO == -1 || charSequenceOooOo0.charAt(iOooOoOO) != ',') {
            return false;
        }
        this.f126099OooO00o++;
        return true;
    }

    public String OooOoo0(int i, int i2) {
        return OooOo0().subSequence(i, i2).toString();
    }

    public final void OooOooO(char c) {
        int i = this.f126099OooO00o;
        if (i > 0 && c == '\"') {
            try {
                this.f126099OooO00o = i - 1;
                String strOooOO0o = OooOO0o();
                this.f126099OooO00o = i;
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(strOooOO0o, CloudMetaExtra.DEFINE_NON_PARENT_ID)) {
                    OooOOo0(this.f126099OooO00o - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f126099OooO00o = i;
                throw th;
            }
        }
        OooOOoo(C22306Ooooooo.OooO0OO(c), true);
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(source='");
        sb.append((Object) OooOo0());
        sb.append("', currentPosition=");
        return C20398OooO0O0.OooO00o(')', sb, this.f126099OooO00o);
    }
}
