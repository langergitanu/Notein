package oO0OOoo0;

import com.aspose.words.ControlChar;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: oO0OOoo0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33142OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EnumC33141OooOO0O f119855OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f119856OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f119857OooO0OO;

    public C33142OooOO0o(EnumC33141OooOO0O enumC33141OooOO0O, int i, String str) {
        this.f119855OooO00o = enumC33141OooOO0O;
        this.f119856OooO0O0 = i;
        this.f119857OooO0OO = str;
    }

    public static C33142OooOO0o OooO00o(String str) throws IOException {
        int i;
        String strSubstring;
        boolean zStartsWith = str.startsWith("HTTP/1.");
        EnumC33141OooOO0O enumC33141OooOO0O = EnumC33141OooOO0O.HTTP_1_0;
        if (zStartsWith) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                enumC33141OooOO0O = EnumC33141OooOO0O.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i3 = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
            }
            return new C33142OooOO0o(enumC33141OooOO0O, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f119855OooO00o == EnumC33141OooOO0O.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(ControlChar.SPACE_CHAR);
        sb.append(this.f119856OooO0O0);
        String str = this.f119857OooO0OO;
        if (str != null) {
            sb.append(ControlChar.SPACE_CHAR);
            sb.append(str);
        }
        return sb.toString();
    }
}
