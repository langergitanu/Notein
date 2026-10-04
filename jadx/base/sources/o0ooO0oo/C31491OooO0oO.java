package o0ooO0oo;

import OooO0o.C20424OooO0Oo;
import android.util.Log;
import com.aspose.words.ControlChar;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import o0ooO0O.InterfaceC31429OooO00o;
import o0ooO0OO.C31431OooO00o;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.AbstractC31443OooOO0o;
import o0ooO0Oo.C31435OooO0OO;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31442OooOO0O;
import o0ooO0o.C31457OooO0OO;

/* JADX INFO: renamed from: o0ooO0oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31491OooO0oO extends AbstractC31485OooO00o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final byte[] f112663OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f112664OooO0o0;

    public C31491OooO0oO(InterfaceC31429OooO00o interfaceC31429OooO00o) throws IOException {
        super(new C31488OooO0Oo(interfaceC31429OooO00o.OooO00o()));
        this.f112664OooO0o0 = new ArrayList(100);
        this.f112663OooO0o = new byte[10];
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x02c5, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01eb A[PHI: r7
      0x01eb: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v4 int), (r7v2 int) binds: [B:83:0x012b, B:84:0x012d, B:151:0x01e9, B:88:0x013d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOo0O() throws IOException {
        boolean z;
        Object objOooOo0O;
        boolean z2;
        int i;
        char c;
        OooOo0();
        InterfaceC31494OooOO0O interfaceC31494OooOO0O = this.f112626OooO0O0;
        if (interfaceC31494OooOO0O.OooOOOo()) {
            return null;
        }
        char cPeek = (char) interfaceC31494OooOO0O.peek();
        if (cPeek == '(') {
            return OooOO0O();
        }
        int i2 = 0;
        if (cPeek != '+') {
            if (cPeek == '<') {
                int i3 = interfaceC31494OooOO0O.read();
                char cPeek2 = (char) interfaceC31494OooOO0O.peek();
                interfaceC31494OooOO0O.o0000(i3);
                return cPeek2 == '<' ? OooO() : OooOO0O();
            }
            if (cPeek == 'B') {
                String strOooOOoo = OooOOoo();
                C31431OooO00o c31431OooO00oOooO00o = C31431OooO00o.OooO00o(strOooOOoo);
                if (strOooOOoo.equals("BI")) {
                    C31436OooO0Oo c31436OooO0Oo = new C31436OooO0Oo();
                    c31431OooO00oOooO00o.f112207OooO0OO = c31436OooO0Oo;
                    while (true) {
                        objOooOo0O = OooOo0O();
                        if (!(objOooOo0O instanceof C31441OooOO0)) {
                            break;
                        }
                        Object objOooOo0O2 = OooOo0O();
                        if (!(objOooOo0O2 instanceof AbstractC31434OooO0O0)) {
                            Log.w("PdfBox-Android", "Unexpected token in inline image dictionary at offset " + interfaceC31494OooOO0O.getPosition());
                            break;
                        }
                        c31436OooO0Oo.o000OoOO((C31441OooOO0) objOooOo0O, (AbstractC31434OooO0O0) objOooOo0O2);
                    }
                    if (objOooOo0O instanceof C31431OooO00o) {
                        C31431OooO00o c31431OooO00o = (C31431OooO00o) objOooOo0O;
                        byte[] bArr = c31431OooO00o.f112206OooO0O0;
                        if (bArr == null || bArr.length == 0) {
                            Log.w("PdfBox-Android", "empty inline image at stream offset " + interfaceC31494OooOO0O.getPosition());
                        }
                        c31431OooO00oOooO00o.f112206OooO0O0 = c31431OooO00o.f112206OooO0O0;
                    }
                }
                return c31431OooO00oOooO00o;
            }
            int i4 = -1;
            int i5 = 73;
            if (cPeek != 'I') {
                if (cPeek == '[') {
                    return OooO0oo();
                }
                if (cPeek == ']') {
                    interfaceC31494OooOO0O.read();
                    return C31442OooOO0O.f112464OooOoO0;
                }
                if (cPeek != 'f') {
                    if (cPeek == 'n') {
                        String strOooOOoo2 = OooOOoo();
                        return strOooOOoo2.equals(CloudMetaExtra.DEFINE_NON_PARENT_ID) ? C31442OooOO0O.f112464OooOoO0 : C31431OooO00o.OooO00o(strOooOOoo2);
                    }
                    if (cPeek != 't') {
                        switch (cPeek) {
                            case '-':
                            case '.':
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                break;
                            case '/':
                                return OooOO0();
                            default:
                                OooOo0();
                                StringBuilder sb = new StringBuilder(4);
                                int iPeek = interfaceC31494OooOO0O.peek();
                                while (iPeek != -1 && !AbstractC31485OooO00o.OooO0oO(iPeek) && iPeek != 93 && iPeek != 91 && iPeek != 60 && iPeek != 40 && iPeek != 47 && (iPeek < 48 || iPeek > 57)) {
                                    char c2 = (char) interfaceC31494OooOO0O.read();
                                    int iPeek2 = interfaceC31494OooOO0O.peek();
                                    sb.append(c2);
                                    if (c2 == 'd' && (iPeek2 == 48 || iPeek2 == 49)) {
                                        sb.append((char) interfaceC31494OooOO0O.read());
                                        iPeek = interfaceC31494OooOO0O.peek();
                                    } else {
                                        iPeek = iPeek2;
                                    }
                                }
                                String strTrim = sb.toString().trim();
                                if (strTrim.length() > 0) {
                                    return C31431OooO00o.OooO00o(strTrim);
                                }
                                return null;
                        }
                    }
                }
                String strOooOOoo3 = OooOOoo();
                return strOooOOoo3.equals(TelemetryEventStrings.Value.TRUE) ? C31435OooO0OO.f112218OooOoOO : strOooOOoo3.equals(TelemetryEventStrings.Value.FALSE) ? C31435OooO0OO.f112219OooOoo0 : C31431OooO00o.OooO00o(strOooOOoo3);
            }
            String str = Character.toString((char) interfaceC31494OooOO0O.read()) + ((char) interfaceC31494OooOO0O.read());
            if (!str.equals("ID")) {
                StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Error: Expected operator 'ID' actual='", str, "' at stream offset ");
                sbOooO0o0.append(interfaceC31494OooOO0O.getPosition());
                throw new IOException(sbOooO0o0.toString());
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (AbstractC31485OooO00o.OooO0oO(interfaceC31494OooOO0O.peek())) {
                interfaceC31494OooOO0O.read();
            }
            int i6 = interfaceC31494OooOO0O.read();
            int i7 = interfaceC31494OooOO0O.read();
            while (true) {
                if (i6 != 69 || i7 != i5) {
                    if (interfaceC31494OooOO0O.OooOOOo()) {
                        break;
                    }
                    byteArrayOutputStream.write(i6);
                    i6 = i7;
                    i2 = 0;
                    i5 = 73;
                    i7 = interfaceC31494OooOO0O.read();
                } else {
                    int iPeek3 = interfaceC31494OooOO0O.peek();
                    byte b = 10;
                    if (iPeek3 == 10 || iPeek3 == 13 || iPeek3 == 32) {
                        byte[] bArr2 = this.f112663OooO0o;
                        int i8 = interfaceC31494OooOO0O.read(bArr2, i2, 10);
                        if (i8 > 0) {
                            int i9 = i2;
                            int i10 = i4;
                            int i11 = i10;
                            while (i9 < i8) {
                                byte b2 = bArr2[i9];
                                if ((b2 != 0 && b2 < 9) || (b2 > b && b2 < 32 && b2 != 13)) {
                                    z2 = false;
                                    i = -1;
                                    break;
                                }
                                int i12 = -1;
                                if (i10 == -1) {
                                    if (b2 != 0 && b2 != 9 && b2 != 32 && b2 != 10) {
                                        c = ControlChar.PARAGRAPH_BREAK_CHAR;
                                        if (b2 != 13) {
                                            i10 = i9;
                                        }
                                    }
                                    i12 = -1;
                                    if (i10 == i12) {
                                        c = ControlChar.PARAGRAPH_BREAK_CHAR;
                                    }
                                } else if (i10 == i12 && i11 == i12) {
                                    if (b2 == 0 || b2 == 9 || b2 == 32 || b2 == 10) {
                                        c = ControlChar.PARAGRAPH_BREAK_CHAR;
                                    } else {
                                        c = ControlChar.PARAGRAPH_BREAK_CHAR;
                                        if (b2 == 13) {
                                        }
                                    }
                                    i11 = i9;
                                } else {
                                    c = ControlChar.PARAGRAPH_BREAK_CHAR;
                                }
                                i9++;
                                i4 = -1;
                                b = 10;
                            }
                            i = i4;
                            z2 = true;
                            if (i11 != i && i10 != i) {
                                String str2 = new String(bArr2, i10, i11 - i10);
                                if (!"Q".equals(str2) && !"EMC".equals(str2) && !"S".equals(str2)) {
                                    z2 = false;
                                }
                            }
                            i4 = -1;
                            if (i8 == 10) {
                                int i13 = (i10 == -1 || i11 != -1) ? i11 : 10;
                                if (i13 != -1 && i10 != -1 && i13 - i10 > 3) {
                                    z2 = false;
                                }
                            }
                            interfaceC31494OooOO0O.OooOo0o(i8, bArr2);
                        } else {
                            z2 = true;
                        }
                        if (!z2) {
                            Log.w("PdfBox-Android", "ignoring 'EI' assumed to be in the middle of inline image at stream offset " + interfaceC31494OooOO0O.getPosition());
                        }
                        if (z2) {
                            break;
                        }
                    }
                }
            }
            C31431OooO00o c31431OooO00oOooO00o2 = C31431OooO00o.OooO00o("ID");
            c31431OooO00oOooO00o2.f112206OooO0O0 = byteArrayOutputStream.toByteArray();
            return c31431OooO00oOooO00o2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cPeek);
        interfaceC31494OooOO0O.read();
        if (cPeek == '-' && interfaceC31494OooOO0O.peek() == cPeek) {
            interfaceC31494OooOO0O.read();
        }
        if (cPeek != '.') {
            z = true;
            while (true) {
                char cPeek3 = (char) interfaceC31494OooOO0O.peek();
                if (!Character.isDigit(cPeek3) && ((!z || cPeek3 != '.') && cPeek3 != '-')) {
                    return AbstractC31443OooOO0o.Oooo00o(sb2.toString());
                }
                if (cPeek3 != '-') {
                    sb2.append(cPeek3);
                }
                interfaceC31494OooOO0O.read();
                if (!z || cPeek3 != '.') {
                }
            }
        }
        z = false;
    }

    public C31491OooO0oO(byte[] bArr) throws IOException {
        C31457OooO0OO c31457OooO0OO = new C31457OooO0OO();
        c31457OooO0OO.f112498OooOo0o = 1024;
        c31457OooO0OO.f112497OooOo = null;
        ArrayList arrayList = new ArrayList(1);
        c31457OooO0OO.f112497OooOo = arrayList;
        int length = bArr.length;
        c31457OooO0OO.f112498OooOo0o = length;
        c31457OooO0OO.f112500OooOoO0 = bArr;
        arrayList.add(bArr);
        c31457OooO0OO.f112499OooOoO = 0L;
        c31457OooO0OO.f112501OooOoOO = 0;
        c31457OooO0OO.f112503OooOoo0 = length;
        c31457OooO0OO.f112502OooOoo = 0;
        c31457OooO0OO.f112504OooOooO = 0;
        super(new C31493OooOO0(c31457OooO0OO));
        this.f112664OooO0o0 = new ArrayList(100);
        this.f112663OooO0o = new byte[10];
    }
}
