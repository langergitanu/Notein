package o0oo0ooO;

import android.util.Log;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import o0oo0ooO.C31407OooO0O0;

/* JADX INFO: renamed from: o0oo0ooO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31411OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ByteBuffer f112162OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f112164OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C31407OooO0O0 f112163OooO0O0 = OooO0Oo(null);

    public C31411OooO0o0(byte[] bArr) throws IOException {
        this.f112162OooO00o = ByteBuffer.wrap(bArr);
    }

    public final char OooO00o() {
        return (char) this.f112162OooO00o.get();
    }

    public final C31407OooO0O0 OooO0O0() throws IOException {
        C31407OooO0O0 c31407OooO0O0 = this.f112163OooO0O0;
        this.f112163OooO0O0 = OooO0Oo(c31407OooO0O0);
        return c31407OooO0O0;
    }

    public final String OooO0OO() {
        ByteBuffer byteBuffer;
        StringBuilder sb = new StringBuilder();
        while (true) {
            byteBuffer = this.f112162OooO00o;
            if (!byteBuffer.hasRemaining()) {
                break;
            }
            byteBuffer.mark();
            char cOooO00o = OooO00o();
            if (Character.isWhitespace(cOooO00o) || cOooO00o == '(' || cOooO00o == ')' || cOooO00o == '<' || cOooO00o == '>' || cOooO00o == '[' || cOooO00o == ']' || cOooO00o == '{' || cOooO00o == '}' || cOooO00o == '/' || cOooO00o == '%') {
                break;
            }
            sb.append(cOooO00o);
        }
        byteBuffer.reset();
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x02e3, code lost:
    
        if (r2 != false) goto L190;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0211 A[LOOP:3: B:133:0x020b->B:135:0x0211, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0285 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0286  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C31407OooO0O0 OooO0Oo(C31407OooO0O0 c31407OooO0O0) throws IOException {
        char cOooO00o;
        StringBuilder sb;
        char cOooO00o2;
        boolean z = false;
        while (true) {
            boolean z2 = false;
            while (true) {
                ByteBuffer byteBuffer = this.f112162OooO00o;
                C31407OooO0O0 c31407OooO0O02 = null;
                if (!byteBuffer.hasRemaining()) {
                    break;
                }
                char cOooO00o3 = OooO00o();
                if (cOooO00o3 == '%') {
                    while (byteBuffer.hasRemaining() && (cOooO00o = OooO00o()) != '\r' && cOooO00o != '\n') {
                    }
                } else if (cOooO00o3 == '(') {
                    StringBuilder sb2 = new StringBuilder();
                    while (byteBuffer.hasRemaining()) {
                        char cOooO00o4 = OooO00o();
                        if (cOooO00o4 == '\n' || cOooO00o4 == '\r') {
                            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                        } else if (cOooO00o4 == '\\') {
                            char cOooO00o5 = OooO00o();
                            if (cOooO00o5 == '(') {
                                sb2.append('(');
                            } else if (cOooO00o5 == ')') {
                                sb2.append(')');
                            } else if (cOooO00o5 == '\\') {
                                sb2.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                            } else if (cOooO00o5 == 'b') {
                                sb2.append('\b');
                            } else if (cOooO00o5 == 'f') {
                                sb2.append('\f');
                            } else if (cOooO00o5 == 'n' || cOooO00o5 == 'r') {
                                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                            } else if (cOooO00o5 == 't') {
                                sb2.append('\t');
                            }
                            if (Character.isDigit(cOooO00o5)) {
                                try {
                                    sb2.append((char) Integer.parseInt(String.valueOf(new char[]{cOooO00o5, OooO00o(), OooO00o()}), 8));
                                } catch (NumberFormatException e) {
                                    throw new IOException(e);
                                }
                            } else {
                                continue;
                            }
                        } else if (cOooO00o4 == '(') {
                            this.f112164OooO0OO++;
                            sb2.append('(');
                        } else if (cOooO00o4 != ')') {
                            sb2.append(cOooO00o4);
                        } else {
                            if (this.f112164OooO0OO == 0) {
                                return new C31407OooO0O0(sb2.toString(), C31407OooO0O0.OooO00o.f112140OooOo0o);
                            }
                            sb2.append(')');
                            this.f112164OooO0OO--;
                        }
                    }
                } else {
                    if (cOooO00o3 == ')') {
                        throw new IOException("unexpected closing parenthesis");
                    }
                    if (cOooO00o3 == '[') {
                        return new C31407OooO0O0(cOooO00o3, C31407OooO0O0.OooO00o.f112145OooOoo0);
                    }
                    if (cOooO00o3 == '{') {
                        return new C31407OooO0O0(cOooO00o3, C31407OooO0O0.OooO00o.f112146OooOooO);
                    }
                    if (cOooO00o3 == ']') {
                        return new C31407OooO0O0(cOooO00o3, C31407OooO0O0.OooO00o.f112144OooOoo);
                    }
                    if (cOooO00o3 == '}') {
                        return new C31407OooO0O0(cOooO00o3, C31407OooO0O0.OooO00o.f112147OooOooo);
                    }
                    if (cOooO00o3 == '/') {
                        return new C31407OooO0O0(OooO0OO(), C31407OooO0O0.OooO00o.f112142OooOoO0);
                    }
                    C31407OooO0O0.OooO00o oooO00o = C31407OooO0O0.OooO00o.f112139OooOo;
                    if (cOooO00o3 == '<') {
                        if (OooO00o() == cOooO00o3) {
                            return new C31407OooO0O0("<<", C31407OooO0O0.OooO00o.f112149Oooo000);
                        }
                        byteBuffer.position(byteBuffer.position() - 1);
                        return new C31407OooO0O0(cOooO00o3, oooO00o);
                    }
                    if (cOooO00o3 == '>') {
                        if (OooO00o() == cOooO00o3) {
                            return new C31407OooO0O0(">>", C31407OooO0O0.OooO00o.f112150Oooo00O);
                        }
                        byteBuffer.position(byteBuffer.position() - 1);
                        return new C31407OooO0O0(cOooO00o3, oooO00o);
                    }
                    if (!Character.isWhitespace(cOooO00o3)) {
                        if (cOooO00o3 == 0) {
                            Log.w("PdfBox-Android", "NULL byte in font, skipped");
                        } else {
                            byteBuffer.position(byteBuffer.position() - 1);
                            byteBuffer.mark();
                            StringBuilder sb3 = new StringBuilder();
                            char cOooO00o6 = OooO00o();
                            if (cOooO00o6 == '+' || cOooO00o6 == '-') {
                                sb3.append(cOooO00o6);
                                cOooO00o6 = OooO00o();
                            }
                            while (Character.isDigit(cOooO00o6)) {
                                sb3.append(cOooO00o6);
                                cOooO00o6 = OooO00o();
                                z = true;
                            }
                            C31407OooO0O0.OooO00o oooO00o2 = C31407OooO0O0.OooO00o.f112143OooOoOO;
                            if (cOooO00o6 == '.') {
                                sb3.append(cOooO00o6);
                                cOooO00o6 = OooO00o();
                            } else if (cOooO00o6 == '#') {
                                StringBuilder sb4 = new StringBuilder();
                                cOooO00o6 = OooO00o();
                                sb3 = sb4;
                                sb = sb3;
                                if (Character.isDigit(cOooO00o6)) {
                                    if (cOooO00o6 != 'e' && cOooO00o6 != 'E') {
                                        byteBuffer.reset();
                                    }
                                    if (c31407OooO0O02 == null) {
                                        return c31407OooO0O02;
                                    }
                                    String strOooO0OO = OooO0OO();
                                    if (strOooO0OO == null) {
                                        throw new C31406OooO00o("Could not read token at position " + byteBuffer.position());
                                    }
                                    if (!strOooO0OO.equals("RD") && !strOooO0OO.equals("-|")) {
                                        return new C31407OooO0O0(strOooO0OO, oooO00o);
                                    }
                                    if (c31407OooO0O0 == null || c31407OooO0O0.f112138OooO0OO != oooO00o2) {
                                        throw new IOException("expected INTEGER before -| or RD");
                                    }
                                    int iOooO00o = c31407OooO0O0.OooO00o();
                                    byteBuffer.get();
                                    byte[] bArr = new byte[iOooO00o];
                                    byteBuffer.get(bArr);
                                    return new C31407OooO0O0(bArr);
                                }
                                sb3.append(cOooO00o6);
                                cOooO00o6 = OooO00o();
                                while (Character.isDigit(cOooO00o6)) {
                                    sb3.append(cOooO00o6);
                                    cOooO00o6 = OooO00o();
                                }
                                if (cOooO00o6 != 'E' || cOooO00o6 == 'e') {
                                    sb3.append(cOooO00o6);
                                    cOooO00o2 = OooO00o();
                                    if (cOooO00o2 == '-') {
                                        sb3.append(cOooO00o2);
                                        cOooO00o2 = OooO00o();
                                    }
                                    if (Character.isDigit(cOooO00o2)) {
                                        byteBuffer.reset();
                                    } else {
                                        sb3.append(cOooO00o2);
                                        char cOooO00o7 = OooO00o();
                                        while (Character.isDigit(cOooO00o7)) {
                                            sb3.append(cOooO00o7);
                                            cOooO00o7 = OooO00o();
                                        }
                                        byteBuffer.position(byteBuffer.position() - 1);
                                        c31407OooO0O02 = sb == null ? new C31407OooO0O0(Integer.valueOf(Integer.parseInt(sb3.toString(), Integer.parseInt(sb.toString()))).toString(), oooO00o2) : new C31407OooO0O0(sb3.toString(), C31407OooO0O0.OooO00o.f112141OooOoO);
                                    }
                                } else {
                                    byteBuffer.position(byteBuffer.position() - 1);
                                    if (sb == null) {
                                    }
                                }
                                if (c31407OooO0O02 == null) {
                                }
                            } else {
                                if (sb3.length() == 0 || !z) {
                                    byteBuffer.reset();
                                } else if (cOooO00o6 != 'e' && cOooO00o6 != 'E') {
                                    byteBuffer.position(byteBuffer.position() - 1);
                                    c31407OooO0O02 = new C31407OooO0O0(sb3.toString(), oooO00o2);
                                }
                                if (c31407OooO0O02 == null) {
                                }
                            }
                            sb = null;
                            if (Character.isDigit(cOooO00o6)) {
                            }
                            while (Character.isDigit(cOooO00o6)) {
                            }
                            if (cOooO00o6 != 'E') {
                                sb3.append(cOooO00o6);
                                cOooO00o2 = OooO00o();
                                if (cOooO00o2 == '-') {
                                }
                                if (Character.isDigit(cOooO00o2)) {
                                }
                            }
                            if (c31407OooO0O02 == null) {
                            }
                        }
                    }
                    z2 = true;
                }
            }
        }
        return null;
    }
}
