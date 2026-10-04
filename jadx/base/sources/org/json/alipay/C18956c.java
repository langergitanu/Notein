package org.json.alipay;

import com.aspose.slides.C22218Oooo;
import com.aspose.words.ControlChar;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* JADX INFO: renamed from: org.json.alipay.c */
/* JADX INFO: loaded from: classes10.dex */
public final class C18956c {

    /* JADX INFO: renamed from: a */
    public int f58134a;

    /* JADX INFO: renamed from: b */
    public Reader f58135b;

    /* JADX INFO: renamed from: c */
    public char f58136c;

    /* JADX INFO: renamed from: d */
    public boolean f58137d;

    public C18956c(Reader reader) {
        this.f58135b = reader.markSupported() ? reader : new BufferedReader(reader);
        this.f58137d = false;
        this.f58134a = 0;
    }

    /* JADX INFO: renamed from: a */
    private String m80654a(int i) throws JSONException {
        if (i == 0) {
            return "";
        }
        char[] cArr = new char[i];
        int i2 = 0;
        if (this.f58137d) {
            this.f58137d = false;
            cArr[0] = this.f58136c;
            i2 = 1;
        }
        while (i2 < i) {
            try {
                int i3 = this.f58135b.read(cArr, i2, i - i2);
                if (i3 == -1) {
                    break;
                }
                i2 += i3;
            } catch (IOException e) {
                throw new JSONException(e);
            }
        }
        this.f58134a += i2;
        if (i2 < i) {
            throw m80655a("Substring bounds error");
        }
        this.f58136c = cArr[i - 1];
        return new String(cArr);
    }

    /* JADX INFO: renamed from: b */
    public final char m80657b() throws JSONException {
        if (this.f58137d) {
            this.f58137d = false;
            char c = this.f58136c;
            if (c != 0) {
                this.f58134a++;
            }
            return c;
        }
        try {
            int i = this.f58135b.read();
            if (i <= 0) {
                this.f58136c = (char) 0;
                return (char) 0;
            }
            this.f58134a++;
            char c2 = (char) i;
            this.f58136c = c2;
            return c2;
        } catch (IOException e) {
            throw new JSONException(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final char m80658c() {
        char cM80657b;
        char cM80657b2;
        char cM80657b3;
        while (true) {
            cM80657b = m80657b();
            if (cM80657b == '/') {
                char cM80657b4 = m80657b();
                if (cM80657b4 == '*') {
                    while (true) {
                        char cM80657b5 = m80657b();
                        if (cM80657b5 == 0) {
                            throw m80655a("Unclosed comment");
                        }
                        if (cM80657b5 == '*') {
                            if (m80657b() != '/') {
                                m80656a();
                            }
                        }
                    }
                } else {
                    if (cM80657b4 != '/') {
                        m80656a();
                        return IOUtils.DIR_SEPARATOR_UNIX;
                    }
                    do {
                        cM80657b2 = m80657b();
                        if (cM80657b2 == '\n' || cM80657b2 == '\r') {
                            break;
                        }
                    } while (cM80657b2 != 0);
                }
            } else if (cM80657b == '#') {
                do {
                    cM80657b3 = m80657b();
                    if (cM80657b3 == '\n' || cM80657b3 == '\r') {
                        break;
                    }
                } while (cM80657b3 != 0);
            } else if (cM80657b == 0 || cM80657b > ' ') {
                break;
            }
        }
        return cM80657b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0144, code lost:
    
        throw m80655a("Unterminated string");
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m80659d() {
        String strM80654a;
        char cM80658c = m80658c();
        if (cM80658c != '\"') {
            if (cM80658c != '[') {
                if (cM80658c == '{') {
                    m80656a();
                    return new C18955b(this);
                }
                if (cM80658c != '\'') {
                    if (cM80658c != '(') {
                        StringBuffer stringBuffer = new StringBuffer();
                        char cM80657b = cM80658c;
                        while (cM80657b >= ' ' && ",:]}/\\\"[{;=#".indexOf(cM80657b) < 0) {
                            stringBuffer.append(cM80657b);
                            cM80657b = m80657b();
                        }
                        m80656a();
                        String strTrim = stringBuffer.toString().trim();
                        if (strTrim.equals("")) {
                            throw m80655a("Missing value");
                        }
                        if (strTrim.equalsIgnoreCase(TelemetryEventStrings.Value.TRUE)) {
                            return Boolean.TRUE;
                        }
                        if (strTrim.equalsIgnoreCase(TelemetryEventStrings.Value.FALSE)) {
                            return Boolean.FALSE;
                        }
                        if (strTrim.equalsIgnoreCase(CloudMetaExtra.DEFINE_NON_PARENT_ID)) {
                            return C18955b.f58132a;
                        }
                        if ((cM80658c >= '0' && cM80658c <= '9') || cM80658c == '.' || cM80658c == '-' || cM80658c == '+') {
                            if (cM80658c == '0') {
                                try {
                                    return (strTrim.length() <= 2 || !(strTrim.charAt(1) == 'x' || strTrim.charAt(1) == 'X')) ? new Integer(Integer.parseInt(strTrim, 8)) : new Integer(Integer.parseInt(strTrim.substring(2), 16));
                                } catch (Exception unused) {
                                }
                            }
                            try {
                                try {
                                    try {
                                        return new Integer(strTrim);
                                    } catch (Exception unused2) {
                                        return new Double(strTrim);
                                    }
                                } catch (Exception unused3) {
                                    return new Long(strTrim);
                                }
                            } catch (Exception unused4) {
                            }
                        }
                        return strTrim;
                    }
                }
            }
            m80656a();
            return new C18954a(this);
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        while (true) {
            char cM80657b2 = m80657b();
            if (cM80657b2 == 0 || cM80657b2 == '\n' || cM80657b2 == '\r') {
                break;
            }
            if (cM80657b2 == '\\') {
                cM80657b2 = m80657b();
                if (cM80657b2 == 'b') {
                    stringBuffer2.append('\b');
                } else if (cM80657b2 == 'f') {
                    cM80657b2 = '\f';
                } else if (cM80657b2 == 'n') {
                    stringBuffer2.append('\n');
                } else if (cM80657b2 != 'r') {
                    if (cM80657b2 == 'x') {
                        strM80654a = m80654a(2);
                    } else if (cM80657b2 == 't') {
                        cM80657b2 = '\t';
                    } else if (cM80657b2 == 'u') {
                        strM80654a = m80654a(4);
                    }
                    cM80657b2 = (char) Integer.parseInt(strM80654a, 16);
                } else {
                    stringBuffer2.append(ControlChar.PARAGRAPH_BREAK_CHAR);
                }
            } else if (cM80657b2 == cM80658c) {
                return stringBuffer2.toString();
            }
            stringBuffer2.append(cM80657b2);
        }
    }

    public final String toString() {
        return " at character " + this.f58134a;
    }

    public C18956c(String str) {
        this(new StringReader(str));
    }

    /* JADX INFO: renamed from: a */
    public final JSONException m80655a(String str) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(str);
        sbOooO0OO.append(toString());
        return new JSONException(sbOooO0OO.toString());
    }

    /* JADX INFO: renamed from: a */
    public final void m80656a() {
        int i;
        if (this.f58137d || (i = this.f58134a) <= 0) {
            throw new JSONException("Stepping back two steps is not supported");
        }
        this.f58134a = i - 1;
        this.f58137d = true;
    }
}
