package oO000Oo;

import com.aspose.slides.PatternStyle;
import com.google.common.base.Charsets;
import com.huawei.hms.network.embedded.C18134ca;
import java.nio.charset.Charset;
import java.util.Locale;
import oO000Oo.OooO00o;
import oO0OOo0o.C33094OoooO;
import oO0OOo0o.Oooo0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class o000oOoO extends OooO00o.OooO0O0 {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final C33094OoooO.OooO0o f114599OooOo0 = oO0OOo0o.Oooo0.OooO00o(C18134ca.f54486e, new OooO00o());

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public C33094OoooO f114600OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public oO0OOo0o.o00Oo0 f114601OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public Charset f114602OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f114603OooOo00;

    public class OooO00o implements Oooo0.OooO00o<Integer> {
        @Override // oO0OOo0o.C33094OoooO.InterfaceC33097OooO0oO
        public final byte[] OooO00o(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // oO0OOo0o.C33094OoooO.InterfaceC33097OooO0oO
        public final Object OooO0O0(byte[] bArr) {
            if (bArr.length < 3) {
                throw new NumberFormatException("Malformed status code ".concat(new String(bArr, oO0OOo0o.Oooo0.f119617OooO00o)));
            }
            return Integer.valueOf((bArr[2] - PatternStyle.Wave) + androidx.core.graphics.OooO0OO.OooO00o(bArr[1], 48, 10, (bArr[0] - PatternStyle.Wave) * 100));
        }
    }

    public static Charset OooOO0(C33094OoooO c33094OoooO) {
        String str = (String) c33094OoooO.OooO0OO(C31989OoooO0O.f114213OooO);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return Charsets.UTF_8;
    }

    public static oO0OOo0o.o00Oo0 OooOO0O(C33094OoooO c33094OoooO) {
        char cCharAt;
        Integer num = (Integer) c33094OoooO.OooO0OO(f114599OooOo0);
        if (num == null) {
            return oO0OOo0o.o00Oo0.f119723OooOOO.OooO0oo("Missing HTTP status code");
        }
        String str = (String) c33094OoooO.OooO0OO(C31989OoooO0O.f114213OooO);
        if (str != null && 16 <= str.length()) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';')) {
                return null;
            }
        }
        return C31989OoooO0O.OooO0oO(num.intValue()).OooO0O0("invalid content-type: " + str);
    }
}
