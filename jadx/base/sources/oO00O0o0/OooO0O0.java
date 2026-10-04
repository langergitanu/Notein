package oO00O0o0;

import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o00oo0O0.C25679OooOo0o;
import oO00Oo0.C32266OooO0Oo;
import oO00Oo0O.C32271OooO00o;
import oO00Oo0O.C32273OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0o.C33580OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Set<Byte> f115511OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Set<Character> f115512OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Set<Character> f115513OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final ArrayList f115514OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final ArrayList f115515OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Set<Character> f115516OooO0o0;

    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Byte, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ boolean f115517OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f115518OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(StringBuilder sb, boolean z) {
            super(1);
            this.f115518OooOo0o = sb;
            this.f115517OooOo = z;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Byte b) {
            byte bByteValue = b.byteValue();
            boolean zContains = OooO0O0.f115511OooO00o.contains(Byte.valueOf(bByteValue));
            StringBuilder sb = this.f115518OooOo0o;
            if (zContains || OooO0O0.f115515OooO0o.contains(Byte.valueOf(bByteValue))) {
                sb.append((char) bByteValue);
            } else if (this.f115517OooOo && bByteValue == 32) {
                sb.append('+');
            } else {
                sb.append(OooO0O0.OooO00o(bByteValue));
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    static {
        ArrayList arrayListOooooOO = oOo000Oo.OooOo.OooooOO(oOo000Oo.OooOo.Ooooo0o(new oO0O00oo.OooO0OO('a', 'z'), new oO0O00oo.OooO0OO('A', 'Z')), new oO0O00oo.OooO0OO('0', '9'));
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooooOO, 10));
        Iterator it = arrayListOooooOO.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        f115511OooO00o = oOo000Oo.OooOo.o0OO00O(arrayList);
        f115512OooO0O0 = oOo000Oo.OooOo.o0OO00O(oOo000Oo.OooOo.OooooOO(oOo000Oo.OooOo.Ooooo0o(new oO0O00oo.OooO0OO('a', 'z'), new oO0O00oo.OooO0OO('A', 'Z')), new oO0O00oo.OooO0OO('0', '9')));
        f115513OooO0OO = oOo000Oo.OooOo.o0OO00O(oOo000Oo.OooOo.OooooOO(oOo000Oo.OooOo.Ooooo0o(new oO0O00oo.OooO0OO('a', 'f'), new oO0O00oo.OooO0OO('A', 'F')), new oO0O00oo.OooO0OO('0', '9')));
        Set setOoooOo0 = oOo000Oo.OooOOO.OoooOo0(new Character[]{':', Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX), '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', '=', '-', Character.valueOf(FilenameUtils.EXTENSION_SEPARATOR), '_', '~', '+'});
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(setOoooOo0, 10));
        Iterator it2 = setOoooOo0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        f115514OooO0Oo = arrayList2;
        f115516OooO0o0 = oOo000Oo.OooOOO.OoooOo0(new Character[]{':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '=', '-', Character.valueOf(FilenameUtils.EXTENSION_SEPARATOR), '_', '~'});
        C34449Oooo0oo.OooO0oo(f115512OooO0O0, oOo000Oo.OooOOO.OoooOo0(new Character[]{'!', '#', '$', '&', '+', '-', Character.valueOf(FilenameUtils.EXTENSION_SEPARATOR), '^', '_', '`', '|', '~'}));
        List listOooOO0o = C34429OooOOo0.OooOO0o('-', Character.valueOf(FilenameUtils.EXTENSION_SEPARATOR), '_', '~');
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(listOooOO0o, 10));
        Iterator it3 = listOooOO0o.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        f115515OooO0o = arrayList3;
    }

    public static final String OooO00o(byte b) {
        int i = (b & 255) >> 4;
        int i2 = b & 15;
        return new String(new char[]{'%', (char) ((i < 0 || i >= 10) ? ((char) (i + 65)) - '\n' : i + 48), (char) ((i2 < 0 || i2 >= 10) ? ((char) (i2 + 65)) - '\n' : i2 + 48)});
    }

    public static final int OooO0O0(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        if ('a' > c || c >= 'g') {
            return -1;
        }
        return c - 'W';
    }

    public static final String OooO0OO(String str, int i, int i2, boolean z, Charset charset) throws C32201OooOooo {
        int i3 = i;
        while (i3 < i2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (z && cCharAt == '+')) {
                int i4 = i2 - i;
                if (i4 > 255) {
                    i4 /= 3;
                }
                StringBuilder sb = new StringBuilder(i4);
                if (i3 > i) {
                    sb.append((CharSequence) str, i, i3);
                }
                byte[] bArr = null;
                while (i3 < i2) {
                    char cCharAt2 = str.charAt(i3);
                    if (z && cCharAt2 == '+') {
                        sb.append(ControlChar.SPACE_CHAR);
                    } else if (cCharAt2 == '%') {
                        if (bArr == null) {
                            bArr = new byte[(i2 - i3) / 3];
                        }
                        int i5 = 0;
                        while (i3 < i2 && str.charAt(i3) == '%') {
                            int i6 = i3 + 2;
                            if (i6 >= i2) {
                                throw new C32201OooOooo("Incomplete trailing HEX escape: " + str.subSequence(i3, str.length()).toString() + ", in " + ((Object) str) + " at " + i3);
                            }
                            int i7 = i3 + 1;
                            int iOooO0O0 = OooO0O0(str.charAt(i7));
                            int iOooO0O02 = OooO0O0(str.charAt(i6));
                            if (iOooO0O0 == -1 || iOooO0O02 == -1) {
                                throw new C32201OooOooo("Wrong HEX escape: %" + str.charAt(i7) + str.charAt(i6) + ", in " + ((Object) str) + ", at " + i3);
                            }
                            bArr[i5] = (byte) ((iOooO0O0 * 16) + iOooO0O02);
                            i3 += 3;
                            i5++;
                        }
                        sb.append(new String(bArr, 0, i5, charset));
                    } else {
                        sb.append(cCharAt2);
                    }
                    i3++;
                }
                String string = sb.toString();
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "sb.toString()");
                return string;
            }
            i3++;
        }
        if (i == 0 && i2 == str.length()) {
            return str.toString();
        }
        String strSubstring = str.substring(i, i2);
        kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static String OooO0Oo(String str) {
        int length = str.length();
        Charset charset = C33580OooO00o.f121231OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(charset, "charset");
        return OooO0OO(str, 0, length, false, charset);
    }

    public static final String OooO0o(String str, boolean z) throws Throwable {
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = C33580OooO00o.f121231OooO0O0.newEncoder();
        kotlin.jvm.internal.OooOOO0.OooO0o(charsetEncoderNewEncoder, "UTF_8.newEncoder()");
        OooO0oO(C25679OooOo0o.OooO0O0(charsetEncoderNewEncoder, str, 0, str.length()), new OooO00o(sb, z));
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static String OooO0o0(int i, int i2, int i3, String str) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        Charset charset = C33580OooO00o.f121231OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(charset, "charset");
        return OooO0OO(str, i, i2, z, charset);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        throw new java.io.EOFException("No readable bytes available.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OooO0oO(C32266OooO0Oo c32266OooO0Oo, InterfaceC32507OooOO0o<? super Byte, C32460OooOooO> interfaceC32507OooOO0o) throws Throwable {
        int i;
        int i2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(c32266OooO0Oo, "<this>");
        boolean z = true;
        C32271OooO00o c32271OooO00oOoOO = c32266OooO0Oo.ooOO(1);
        if (c32271OooO00oOoOO == null) {
            return;
        }
        while (true) {
            try {
                i = c32271OooO00oOoOO.f115946OooO0OO;
                i2 = c32271OooO00oOoOO.f115945OooO0O0;
            } catch (Throwable th) {
                th = th;
            }
            if (i > i2) {
                if (i2 == i) {
                    break;
                }
                c32271OooO00oOoOO.f115945OooO0O0 = i2 + 1;
                interfaceC32507OooOO0o.invoke(Byte.valueOf(c32271OooO00oOoOO.f115944OooO00o.get(i2)));
                if (z) {
                    C32273OooO0Oo.OooO00o(c32266OooO0Oo, c32271OooO00oOoOO);
                }
                throw th;
            }
            try {
                c32271OooO00oOoOO = C32273OooO0Oo.OooO0O0(c32266OooO0Oo, c32271OooO00oOoOO);
                if (c32271OooO00oOoOO == null) {
                    return;
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
        }
    }
}
