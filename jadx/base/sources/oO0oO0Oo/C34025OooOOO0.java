package oO0oO0Oo;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.words.internal.C22245OooO0oO;
import com.aspose.words.internal.C22246OooO0oo;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.SimpleTimeZone;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oO0oO0Oo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C34025OooOOO0 extends AbstractC34036OooOoOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO00o f122339OooOo = new OooO00o(C34025OooOOO0.class);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final byte[] f122340OooOo0o;

    /* JADX INFO: renamed from: oO0oO0Oo.OooOOO0$OooO00o */
    public static class OooO00o extends AbstractC34046Oooo0o {
        @Override // oO0oO0Oo.AbstractC34046Oooo0o
        public final AbstractC34036OooOoOO OooO0Oo(C34075o00o0O c34075o00o0O) {
            return new C34025OooOOO0(c34075o00o0O.f122362OooOo0o);
        }
    }

    public C34025OooOOO0(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("GeneralizedTime string too short");
        }
        this.f122340OooOo0o = bArr;
        if (!OooOo0(0) || !OooOo0(1) || !OooOo0(2) || !OooOo0(3)) {
            throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
        }
    }

    public static String OooOOo(int i) {
        return i < 10 ? C21532OooOOo.OooO0OO(i, "0") : Integer.toString(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C34025OooOOO0 OooOOoo(InterfaceC34019OooO0oO interfaceC34019OooO0oO) {
        if (interfaceC34019OooO0oO == 0 || (interfaceC34019OooO0oO instanceof C34025OooOOO0)) {
            return (C34025OooOOO0) interfaceC34019OooO0oO;
        }
        AbstractC34036OooOoOO abstractC34036OooOoOOOooO0o = interfaceC34019OooO0oO.OooO0o();
        if (abstractC34036OooOoOOOooO0o instanceof C34025OooOOO0) {
            return (C34025OooOOO0) abstractC34036OooOoOOOooO0o;
        }
        if (!(interfaceC34019OooO0oO instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(interfaceC34019OooO0oO.getClass().getName()));
        }
        try {
            return (C34025OooOOO0) f122339OooOo.OooO0O0((byte[]) interfaceC34019OooO0oO);
        } catch (Exception e) {
            throw new IllegalArgumentException(C22245OooO0oO.OooO0Oo(e, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    public static String OooOo0O(String str) {
        String strOooO00o;
        StringBuilder sb;
        char cCharAt;
        String strSubstring = str.substring(14);
        int i = 1;
        while (i < strSubstring.length() && '0' <= (cCharAt = strSubstring.charAt(i)) && cCharAt <= '9') {
            i++;
        }
        int i2 = i - 1;
        if (i2 > 3) {
            strOooO00o = strSubstring.substring(0, 4) + strSubstring.substring(i);
            sb = new StringBuilder();
        } else if (i2 == 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strSubstring.substring(0, i));
            sb2.append("00");
            strOooO00o = androidx.concurrent.futures.OooO0O0.OooO00o(strSubstring, i, sb2);
            sb = new StringBuilder();
        } else {
            if (i2 != 2) {
                return str;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(strSubstring.substring(0, i));
            sb3.append("0");
            strOooO00o = androidx.concurrent.futures.OooO0O0.OooO00o(strSubstring, i, sb3);
            sb = new StringBuilder();
        }
        return C22246OooO0oo.OooO00o(sb, str, strOooO00o, 0, 14);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        c34035OooOoO0.OooOO0(24, this.f122340OooOo0o, z);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooO0oo(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        if (!(abstractC34036OooOoOO instanceof C34025OooOOO0)) {
            return false;
        }
        return Arrays.equals(this.f122340OooOo0o, ((C34025OooOOO0) abstractC34036OooOoOO).f122340OooOo0o);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooOO0() {
        return false;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public int OooOO0O(boolean z) {
        return C34035OooOoO0.OooO0Oo(this.f122340OooOo0o.length, z);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public AbstractC34036OooOoOO OooOOOO() {
        return new o0OoOo0(this.f122340OooOo0o);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public AbstractC34036OooOoOO OooOOOo() {
        return new o0OoOo0(this.f122340OooOo0o);
    }

    public final SimpleDateFormat OooOOo0() {
        SimpleDateFormat simpleDateFormat = OooOo00() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz") : (OooOo0(12) && OooOo0(13)) ? new SimpleDateFormat("yyyyMMddHHmmssz") : (OooOo0(10) && OooOo0(11)) ? new SimpleDateFormat("yyyyMMddHHmmz") : new SimpleDateFormat("yyyyMMddHHz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    public final boolean OooOo0(int i) {
        byte b;
        byte[] bArr = this.f122340OooOo0o;
        return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
    }

    public final boolean OooOo00() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f122340OooOo0o;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO, oO0oO0Oo.OooOo00
    public final int hashCode() {
        return C34332OooO00o.OooO0o0(this.f122340OooOo0o);
    }
}
