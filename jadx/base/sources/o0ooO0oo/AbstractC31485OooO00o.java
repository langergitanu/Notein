package o0ooO0oo;

import OooO0o.C20424OooO0Oo;
import OooOoo.C20593OooO0Oo;
import Oooo0oO.o0Oo0oo;
import android.util.Log;
import androidx.core.location.LocationRequestCompat;
import com.aspose.slides.C22200OooO0o0;
import com.huawei.hms.network.embedded.C18177fb;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.ArrayList;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.AbstractC31443OooOO0o;
import o0ooO0Oo.C31432OooO;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31435OooO0OO;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31438OooO0o0;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31442OooOO0O;
import o0ooO0Oo.C31444OooOOO;
import o0ooO0Oo.C31445OooOOO0;
import o0ooO0Oo.C31450OooOOoo;
import o0oooOO0.C31835OooO00o;

/* JADX INFO: renamed from: o0ooO0oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31485OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int f112624OooO0Oo = Long.toString(LocationRequestCompat.PASSIVE_INTERVAL).length();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CharsetDecoder f112625OooO00o = C31835OooO00o.f113460OooO0o.newDecoder();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC31494OooOO0O f112626OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C31438OooO0o0 f112627OooO0OO;

    public AbstractC31485OooO00o(InterfaceC31494OooOO0O interfaceC31494OooOO0O) {
        this.f112626OooO0O0 = interfaceC31494OooOO0O;
    }

    public static boolean OooO0Oo(int i) {
        return i >= 48 && i <= 57;
    }

    public static boolean OooO0o(char c) {
        if (OooO0Oo(c)) {
            return true;
        }
        if (c < 'a' || c > 'f') {
            return c >= 'A' && c <= 'F';
        }
        return true;
    }

    public static boolean OooO0o0(int i) {
        return i == 32 || i == 13 || i == 10 || i == 9 || i == 62 || i == 60 || i == 91 || i == 47 || i == 93 || i == 41 || i == 40 || i == 0 || i == 12 || i == 37;
    }

    public static boolean OooO0oO(int i) {
        return i == 0 || i == 9 || i == 12 || i == 10 || i == 13 || i == 32;
    }

    public final C31436OooO0Oo OooO() throws IOException {
        OooOOO0('<');
        OooOOO0('<');
        OooOo0();
        C31436OooO0Oo c31436OooO0Oo = new C31436OooO0Oo();
        boolean z = false;
        loop0: while (!z) {
            OooOo0();
            InterfaceC31494OooOO0O interfaceC31494OooOO0O = this.f112626OooO0O0;
            char cPeek = (char) interfaceC31494OooOO0O.peek();
            if (cPeek == '>') {
                z = true;
            } else if (cPeek == '/') {
                C31441OooOO0 c31441OooOO0OooOO0 = OooOO0();
                long position = interfaceC31494OooOO0O.getPosition();
                AbstractC31434OooO0O0 abstractC31434OooO0O0OooOO0o = OooOO0o();
                OooOo0();
                if ((abstractC31434OooO0O0OooOO0o instanceof AbstractC31443OooOO0o) && OooO0OO()) {
                    long position2 = interfaceC31494OooOO0O.getPosition();
                    AbstractC31434OooO0O0 abstractC31434OooO0O0OooOO0o2 = OooOO0o();
                    OooOo0();
                    OooOOO0('R');
                    if (!(abstractC31434OooO0O0OooOO0o instanceof C31432OooO)) {
                        Log.e("PdfBox-Android", "expected number, actual=" + abstractC31434OooO0O0OooOO0o + " at offset " + position);
                        abstractC31434OooO0O0OooOO0o = C31442OooOO0O.f112464OooOoO0;
                    } else if (abstractC31434OooO0O0OooOO0o2 instanceof C31432OooO) {
                        abstractC31434OooO0O0OooOO0o = OooO0O0(new C31444OooOOO(((C31432OooO) abstractC31434OooO0O0OooOO0o).f112212OooOo, (int) ((C31432OooO) abstractC31434OooO0O0OooOO0o2).f112212OooOo));
                    } else {
                        Log.e("PdfBox-Android", "expected number, actual=" + abstractC31434OooO0O0OooOO0o + " at offset " + position2);
                        abstractC31434OooO0O0OooOO0o = C31442OooOO0O.f112464OooOoO0;
                    }
                }
                OooOo0();
                if (abstractC31434OooO0O0OooOO0o == null) {
                    Log.w("PdfBox-Android", "Bad dictionary declaration at offset " + interfaceC31494OooOO0O.getPosition());
                    return c31436OooO0Oo;
                }
                if (!(abstractC31434OooO0O0OooOO0o instanceof C31432OooO) || ((C31432OooO) abstractC31434OooO0O0OooOO0o).f112213OooOoO0) {
                    abstractC31434OooO0O0OooOO0o.f112215OooOo0o = true;
                    c31436OooO0Oo.o000OoOO(c31441OooOO0OooOO0, abstractC31434OooO0O0OooOO0o);
                } else {
                    Log.w("PdfBox-Android", "Skipped out of range number value at offset " + interfaceC31494OooOO0O.getPosition());
                }
            } else {
                Log.w("PdfBox-Android", "Invalid dictionary, found: '" + cPeek + "' but expected: '/' at offset " + interfaceC31494OooOO0O.getPosition());
                int i = interfaceC31494OooOO0O.read();
                while (i != -1 && i != 47 && i != 62) {
                    if (i == 101 && interfaceC31494OooOO0O.read() == 110 && interfaceC31494OooOO0O.read() == 100) {
                        int i2 = interfaceC31494OooOO0O.read();
                        boolean z2 = i2 == 115 && interfaceC31494OooOO0O.read() == 116 && interfaceC31494OooOO0O.read() == 114 && interfaceC31494OooOO0O.read() == 101 && interfaceC31494OooOO0O.read() == 97 && interfaceC31494OooOO0O.read() == 109;
                        boolean z3 = !z2 && i2 == 111 && interfaceC31494OooOO0O.read() == 98 && interfaceC31494OooOO0O.read() == 106;
                        if (z2 || z3) {
                            break loop0;
                        }
                    }
                    i = interfaceC31494OooOO0O.read();
                }
                if (i == -1) {
                    return c31436OooO0Oo;
                }
                interfaceC31494OooOO0O.o0000(i);
            }
        }
        OooOOO0('>');
        OooOOO0('>');
        return c31436OooO0Oo;
    }

    public final int OooO00o(int i) throws IOException {
        byte b;
        byte[] bArr = new byte[3];
        InterfaceC31494OooOO0O interfaceC31494OooOO0O = this.f112626OooO0O0;
        int i2 = interfaceC31494OooOO0O.read(bArr);
        if (i2 == 3 && bArr[0] == 13 && (((b = bArr[1]) == 10 && bArr[2] == 47) || bArr[2] == 62 || b == 47 || b == 62)) {
            i = 0;
        }
        if (i2 > 0) {
            interfaceC31494OooOO0O.OooOo0o(i2, bArr);
        }
        return i;
    }

    public final C31445OooOOO0 OooO0O0(C31444OooOOO c31444OooOOO) throws IOException {
        C31438OooO0o0 c31438OooO0o0 = this.f112627OooO0OO;
        if (c31438OooO0o0 != null) {
            return c31438OooO0o0.Oooo00o(c31444OooOOO);
        }
        throw new IOException("object reference " + c31444OooOOO + " at offset " + this.f112626OooO0O0.getPosition() + " in content stream");
    }

    public final boolean OooO0OO() throws IOException {
        return OooO0Oo(this.f112626OooO0O0.peek());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cf, code lost:
    
        r0.read();
        OooOo0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C31433OooO00o OooO0oo() throws IOException {
        InterfaceC31494OooOO0O interfaceC31494OooOO0O = this.f112626OooO0O0;
        long position = interfaceC31494OooOO0O.getPosition();
        OooOOO0('[');
        C31433OooO00o c31433OooO00o = new C31433OooO00o();
        OooOo0();
        while (true) {
            int iPeek = interfaceC31494OooOO0O.peek();
            if (iPeek <= 0 || ((char) iPeek) == ']') {
                break;
            }
            AbstractC31434OooO0O0 abstractC31434OooO0O0OooOO0o = OooOO0o();
            if (abstractC31434OooO0O0OooOO0o instanceof C31445OooOOO0) {
                ArrayList arrayList = c31433OooO00o.f112214OooOo;
                if (arrayList.size() <= 0 || !(c31433OooO00o.Oooo0(arrayList.size() - 1) instanceof C31432OooO)) {
                    abstractC31434OooO0O0OooOO0o = null;
                } else {
                    C31432OooO c31432OooO = (C31432OooO) c31433OooO00o.o0Oo0oo(arrayList.size() - 1);
                    if (arrayList.size() > 0 && (c31433OooO00o.Oooo0(arrayList.size() - 1) instanceof C31432OooO)) {
                        abstractC31434OooO0O0OooOO0o = OooO0O0(new C31444OooOOO(((C31432OooO) c31433OooO00o.o0Oo0oo(arrayList.size() - 1)).f112212OooOo, (int) c31432OooO.f112212OooOo));
                    }
                }
            }
            if (abstractC31434OooO0O0OooOO0o == null) {
                Log.w("PdfBox-Android", "Corrupt array element at offset " + interfaceC31494OooOO0O.getPosition() + ", start offset: " + position);
                String strOooOOoo = OooOOoo();
                if (strOooOOoo.isEmpty() && interfaceC31494OooOO0O.peek() == 91) {
                    break;
                }
                interfaceC31494OooOO0O.Oooo0o(strOooOOoo.getBytes(C31835OooO00o.f113459OooO0Oo));
                if ("endobj".equals(strOooOOoo) || "endstream".equals(strOooOOoo)) {
                    break;
                }
            } else {
                c31433OooO00o.OooOooo(abstractC31434OooO0O0OooOO0o);
            }
            OooOo0();
        }
        return c31433OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C31441OooOO0 OooOO0() throws IOException {
        String str;
        OooOOO0(IOUtils.DIR_SEPARATOR_UNIX);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InterfaceC31494OooOO0O interfaceC31494OooOO0O = this.f112626OooO0O0;
        int i = interfaceC31494OooOO0O.read();
        while (i != -1) {
            if (i == 35) {
                int i2 = interfaceC31494OooOO0O.read();
                int i3 = interfaceC31494OooOO0O.read();
                char c = (char) i2;
                if (OooO0o(c)) {
                    char c2 = (char) i3;
                    if (OooO0o(c2)) {
                        String str2 = Character.toString(c) + c2;
                        try {
                            byteArrayOutputStream.write(Integer.parseInt(str2, 16));
                            i2 = interfaceC31494OooOO0O.read();
                        } catch (NumberFormatException e) {
                            throw new IOException(C20593OooO0Oo.OooO0O0("Error: expected hex digit, actual='", str2, "'"), e);
                        }
                    } else {
                        if (i3 == -1 || i2 == -1) {
                            Log.e("PdfBox-Android", "Premature EOF in BaseParser#parseCOSName");
                            i = -1;
                            break;
                        }
                        interfaceC31494OooOO0O.o0000(i3);
                        byteArrayOutputStream.write(i);
                    }
                    i = i2;
                }
            } else {
                if (OooO0o0(i)) {
                    break;
                }
                byteArrayOutputStream.write(i);
                i = interfaceC31494OooOO0O.read();
            }
        }
        if (i != -1) {
            interfaceC31494OooOO0O.o0000(i);
        }
        try {
            this.f112625OooO00o.decode(ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
            str = new String(byteArrayOutputStream.toByteArray(), C31835OooO00o.f113460OooO0o);
        } catch (CharacterCodingException unused) {
            str = new String(byteArrayOutputStream.toByteArray(), C31835OooO00o.f113461OooO0o0);
        }
        return C31441OooOO0.OooOooo(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        r2 = r0.toString();
        r0 = o0ooO0Oo.C31450OooOOoo.f112479OooOoO0;
        r3 = new java.io.ByteArrayOutputStream();
        r4 = new java.lang.StringBuilder(r2.trim());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        if ((r4.length() % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        r4.append('0');
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        r5 = r4.length();
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r0 >= r5) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        r6 = r0 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        r3.write(java.lang.Integer.parseInt(r4.substring(r0, r6), 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        if (o0ooO0Oo.C31450OooOOoo.f112479OooOoO0 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
    
        android.util.Log.w("PdfBox-Android", "Encountered a malformed hex string");
        r3.write(63);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
    
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b5, code lost:
    
        throw new java.io.IOException("Invalid hex string: ".concat(r2), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bf, code lost:
    
        return new o0ooO0Oo.C31450OooOOoo(r3.toByteArray());
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01b6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C31450OooOOoo OooOO0O() throws IOException {
        int i;
        int i2;
        InterfaceC31494OooOO0O interfaceC31494OooOO0O = this.f112626OooO0O0;
        char c = (char) interfaceC31494OooOO0O.read();
        int i3 = 1;
        if (c != '<') {
            if (c != '(') {
                throw new IOException("parseCOSString string should start with '(' or '<' and not '" + c + "' at offset " + interfaceC31494OooOO0O.getPosition());
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i4 = interfaceC31494OooOO0O.read();
            int iOooO00o = 1;
            while (iOooO00o > 0 && i4 != -1) {
                char c2 = (char) i4;
                if (c2 == ')') {
                    iOooO00o = OooO00o(iOooO00o - 1);
                    if (iOooO00o != 0) {
                        byteArrayOutputStream.write(c2);
                    }
                } else if (c2 == '(') {
                    iOooO00o += i3;
                    byteArrayOutputStream.write(c2);
                } else if (c2 == '\\') {
                    char c3 = (char) interfaceC31494OooOO0O.read();
                    if (c3 == '\n' || c3 == '\r') {
                        i4 = interfaceC31494OooOO0O.read();
                        while (true) {
                            if ((10 == i4 || 13 == i4) && i4 != -1) {
                                i4 = interfaceC31494OooOO0O.read();
                            }
                        }
                    } else {
                        if (c3 == '\\') {
                            byteArrayOutputStream.write(c3);
                            i4 = -2;
                        } else {
                            if (c3 == 'b') {
                                byteArrayOutputStream.write(8);
                            } else if (c3 == 'f') {
                                byteArrayOutputStream.write(12);
                            } else if (c3 == 'n') {
                                byteArrayOutputStream.write(10);
                            } else if (c3 == 'r') {
                                byteArrayOutputStream.write(13);
                            } else if (c3 == 't') {
                                byteArrayOutputStream.write(9);
                            } else if (c3 != '(') {
                                if (c3 != ')') {
                                    switch (c3) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(c3);
                                            i4 = interfaceC31494OooOO0O.read();
                                            char c4 = (char) i4;
                                            if (c4 >= '0' && c4 <= '7') {
                                                sb.append(c4);
                                                i4 = interfaceC31494OooOO0O.read();
                                                char c5 = (char) i4;
                                                if (c5 >= '0' && c5 <= '7') {
                                                    sb.append(c5);
                                                    i4 = -2;
                                                }
                                            }
                                            try {
                                                byteArrayOutputStream.write(Integer.parseInt(sb.toString(), 8));
                                            } catch (NumberFormatException e) {
                                                throw new IOException("Error: Expected octal character, actual='" + ((Object) sb) + "'", e);
                                            }
                                            break;
                                        default:
                                            byteArrayOutputStream.write(c3);
                                            break;
                                    }
                                } else {
                                    iOooO00o = OooO00o(iOooO00o);
                                    if (iOooO00o != 0) {
                                        byteArrayOutputStream.write(c3);
                                    } else {
                                        byteArrayOutputStream.write(92);
                                    }
                                }
                            }
                            i4 = -2;
                        }
                        if (i4 == i) {
                            i4 = interfaceC31494OooOO0O.read();
                        }
                        i3 = 1;
                    }
                    i = -2;
                    if (i4 == i) {
                    }
                    i3 = 1;
                } else {
                    byteArrayOutputStream.write(c2);
                }
                i = -2;
                i4 = -2;
                if (i4 == i) {
                }
                i3 = 1;
            }
            if (i4 != -1) {
                interfaceC31494OooOO0O.o0000(i4);
            }
            return new C31450OooOOoo(byteArrayOutputStream.toByteArray());
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i5 = interfaceC31494OooOO0O.read();
            char c6 = (char) i5;
            if (!OooO0o(c6)) {
                if (i5 == 62) {
                    break;
                }
                if (i5 < 0) {
                    throw new IOException("Missing closing bracket for hex string. Reached EOS.");
                }
                if (i5 != 32 && i5 != 10 && i5 != 9 && i5 != 13 && i5 != 8 && i5 != 12) {
                    if (sb2.length() % 2 != 0) {
                        sb2.deleteCharAt(sb2.length() - 1);
                    }
                    do {
                        i2 = interfaceC31494OooOO0O.read();
                        if (i2 == 62) {
                            break;
                        }
                    } while (i2 >= 0);
                    if (i2 < 0) {
                        throw new IOException("Missing closing bracket for hex string. Reached EOS.");
                    }
                }
            } else {
                sb2.append(c6);
            }
        }
    }

    public final AbstractC31434OooO0O0 OooOO0o() throws IOException {
        OooOo0();
        InterfaceC31494OooOO0O interfaceC31494OooOO0O = this.f112626OooO0O0;
        char cPeek = (char) interfaceC31494OooOO0O.peek();
        if (cPeek == '(') {
            return OooOO0O();
        }
        if (cPeek == '/') {
            return OooOO0();
        }
        if (cPeek == '<') {
            int i = interfaceC31494OooOO0O.read();
            char cPeek2 = (char) interfaceC31494OooOO0O.peek();
            interfaceC31494OooOO0O.o0000(i);
            return cPeek2 == '<' ? OooO() : OooOO0O();
        }
        if (cPeek == 'R') {
            interfaceC31494OooOO0O.read();
            return new C31445OooOOO0(null);
        }
        if (cPeek == '[') {
            return OooO0oo();
        }
        if (cPeek == 'f') {
            String str = new String(interfaceC31494OooOO0O.OooO0oo(5), C31835OooO00o.f113459OooO0Oo);
            if (str.equals(TelemetryEventStrings.Value.FALSE)) {
                return C31435OooO0OO.f112219OooOoo0;
            }
            throw new IOException("expected false actual='" + str + "' " + interfaceC31494OooOO0O + "' at offset " + interfaceC31494OooOO0O.getPosition());
        }
        if (cPeek == 'n') {
            OooOOO(CloudMetaExtra.DEFINE_NON_PARENT_ID.toCharArray());
            return C31442OooOO0O.f112464OooOoO0;
        }
        if (cPeek == 't') {
            String str2 = new String(interfaceC31494OooOO0O.OooO0oo(4), C31835OooO00o.f113459OooO0Oo);
            if (str2.equals(TelemetryEventStrings.Value.TRUE)) {
                return C31435OooO0OO.f112218OooOoOO;
            }
            throw new IOException("expected true actual='" + str2 + "' " + interfaceC31494OooOO0O + "' at offset " + interfaceC31494OooOO0O.getPosition());
        }
        if (cPeek == 65535) {
            return null;
        }
        if (Character.isDigit(cPeek) || cPeek == '-' || cPeek == '+' || cPeek == '.') {
            StringBuilder sb = new StringBuilder();
            int i2 = interfaceC31494OooOO0O.read();
            while (true) {
                char c = (char) i2;
                if (!Character.isDigit(c) && c != '-' && c != '+' && c != '.' && c != 'E' && c != 'e') {
                    break;
                }
                sb.append(c);
                i2 = interfaceC31494OooOO0O.read();
            }
            if (i2 != -1) {
                interfaceC31494OooOO0O.o0000(i2);
            }
            return AbstractC31443OooOO0o.Oooo00o(sb.toString());
        }
        long position = interfaceC31494OooOO0O.getPosition();
        String strOooOOoo = OooOOoo();
        if (!strOooOOoo.isEmpty()) {
            if ("endobj".equals(strOooOOoo) || "endstream".equals(strOooOOoo)) {
                interfaceC31494OooOO0O.Oooo0o(strOooOOoo.getBytes(C31835OooO00o.f113459OooO0Oo));
                return null;
            }
            StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Skipped unexpected dir object = '", strOooOOoo, "' at offset ");
            sbOooO0o0.append(interfaceC31494OooOO0O.getPosition());
            sbOooO0o0.append(" (start offset: ");
            sbOooO0o0.append(position);
            sbOooO0o0.append(")");
            Log.w("PdfBox-Android", sbOooO0o0.toString());
            return null;
        }
        int iPeek = interfaceC31494OooOO0O.peek();
        throw new IOException("Unknown dir object c='" + cPeek + "' cInt=" + ((int) cPeek) + " peek='" + ((char) iPeek) + "' peekInt=" + iPeek + " at offset " + interfaceC31494OooOO0O.getPosition() + " (start offset: " + position + ")");
    }

    public final void OooOOO(char[] cArr) throws IOException {
        OooOo0();
        for (char c : cArr) {
            InterfaceC31494OooOO0O interfaceC31494OooOO0O = this.f112626OooO0O0;
            if (interfaceC31494OooOO0O.read() != c) {
                throw new IOException("Expected string '" + new String(cArr) + "' but missed at character '" + c + "' at offset " + interfaceC31494OooOO0O.getPosition());
            }
        }
        OooOo0();
    }

    public final void OooOOO0(char c) throws IOException {
        InterfaceC31494OooOO0O interfaceC31494OooOO0O = this.f112626OooO0O0;
        char c2 = (char) interfaceC31494OooOO0O.read();
        if (c2 == c) {
            return;
        }
        throw new IOException("expected='" + c + "' actual='" + c2 + "' at offset " + interfaceC31494OooOO0O.getPosition());
    }

    public final int OooOOOO() throws IOException {
        OooOo0();
        StringBuilder sbOooOo00 = OooOo00();
        try {
            int i = Integer.parseInt(sbOooOo00.toString());
            if (i < 0 || i > C18177fb.f54859s) {
                throw new IOException(o0Oo0oo.OooO0O0(i, "Generation Number '", "' has more than 5 digits"));
            }
            return i;
        } catch (NumberFormatException e) {
            byte[] bytes = sbOooOo00.toString().getBytes(C31835OooO00o.f113459OooO0Oo);
            InterfaceC31494OooOO0O interfaceC31494OooOO0O = this.f112626OooO0O0;
            interfaceC31494OooOO0O.Oooo0o(bytes);
            throw new IOException("Error: Expected an integer type at offset " + interfaceC31494OooOO0O.getPosition() + ", instead got '" + ((Object) sbOooOo00) + "'", e);
        }
    }

    public final String OooOOOo() throws IOException {
        int i;
        InterfaceC31494OooOO0O interfaceC31494OooOO0O = this.f112626OooO0O0;
        if (interfaceC31494OooOO0O.OooOOOo()) {
            throw new IOException("Error: End-of-File, expected line");
        }
        StringBuilder sb = new StringBuilder(11);
        while (true) {
            i = interfaceC31494OooOO0O.read();
            if (i == -1 || 10 == i || 13 == i) {
                break;
            }
            sb.append((char) i);
        }
        if (13 == i && 10 == interfaceC31494OooOO0O.peek()) {
            interfaceC31494OooOO0O.read();
        }
        return sb.toString();
    }

    public final long OooOOo() throws IOException {
        long jOooOOo0 = OooOOo0();
        if (jOooOOo0 < 0 || jOooOOo0 >= 10000000000L) {
            throw new IOException(C22200OooO0o0.OooO0O0(jOooOOo0, "Object Number '", "' has more than 10 digits or is negative"));
        }
        return jOooOOo0;
    }

    public final long OooOOo0() throws IOException {
        OooOo0();
        StringBuilder sbOooOo00 = OooOo00();
        try {
            return Long.parseLong(sbOooOo00.toString());
        } catch (NumberFormatException e) {
            byte[] bytes = sbOooOo00.toString().getBytes(C31835OooO00o.f113459OooO0Oo);
            InterfaceC31494OooOO0O interfaceC31494OooOO0O = this.f112626OooO0O0;
            interfaceC31494OooOO0O.Oooo0o(bytes);
            throw new IOException("Error: Expected a long type at offset " + interfaceC31494OooOO0O.getPosition() + ", instead got '" + ((Object) sbOooOo00) + "'", e);
        }
    }

    public final String OooOOoo() throws IOException {
        OooOo0();
        StringBuilder sb = new StringBuilder();
        InterfaceC31494OooOO0O interfaceC31494OooOO0O = this.f112626OooO0O0;
        int i = interfaceC31494OooOO0O.read();
        while (true) {
            char c = (char) i;
            if (OooO0o0(c) || i == -1) {
                break;
            }
            sb.append(c);
            i = interfaceC31494OooOO0O.read();
        }
        if (i != -1) {
            interfaceC31494OooOO0O.o0000(i);
        }
        return sb.toString();
    }

    public final void OooOo0() throws IOException {
        InterfaceC31494OooOO0O interfaceC31494OooOO0O = this.f112626OooO0O0;
        int i = interfaceC31494OooOO0O.read();
        while (true) {
            if (!OooO0oO(i) && i != 37) {
                break;
            }
            if (i == 37) {
                i = interfaceC31494OooOO0O.read();
                while (10 != i && 13 != i && i != -1) {
                    i = interfaceC31494OooOO0O.read();
                }
            } else {
                i = interfaceC31494OooOO0O.read();
            }
        }
        if (i != -1) {
            interfaceC31494OooOO0O.o0000(i);
        }
    }

    public final StringBuilder OooOo00() throws IOException {
        InterfaceC31494OooOO0O interfaceC31494OooOO0O;
        StringBuilder sb = new StringBuilder();
        do {
            interfaceC31494OooOO0O = this.f112626OooO0O0;
            int i = interfaceC31494OooOO0O.read();
            if (i < 48 || i > 57) {
                if (i != -1) {
                    interfaceC31494OooOO0O.o0000(i);
                }
                return sb;
            }
            sb.append((char) i);
        } while (sb.length() <= f112624OooO0Oo);
        throw new IOException("Number '" + ((Object) sb) + "' is getting too long, stop reading at offset " + interfaceC31494OooOO0O.getPosition());
    }
}
