package com.huawei.hms.network.embedded;

import com.aspose.words.ControlChar;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.y9 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18431y9 {

    /* JADX INFO: renamed from: d */
    public static final int f56721d = 307;

    /* JADX INFO: renamed from: e */
    public static final int f56722e = 308;

    /* JADX INFO: renamed from: f */
    public static final int f56723f = 100;

    /* JADX INFO: renamed from: a */
    public final EnumC18132c8 f56724a;

    /* JADX INFO: renamed from: b */
    public final int f56725b;

    /* JADX INFO: renamed from: c */
    public final String f56726c;

    public C18431y9(EnumC18132c8 enumC18132c8, int i, String str) {
        this.f56724a = enumC18132c8;
        this.f56725b = i;
        this.f56726c = str;
    }

    /* JADX INFO: renamed from: a */
    public static C18431y9 m79995a(C18188g8 c18188g8) {
        return new C18431y9(c18188g8.m78576F(), c18188g8.m78589w(), c18188g8.m78572B());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f56724a == EnumC18132c8.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(ControlChar.SPACE_CHAR);
        sb.append(this.f56725b);
        if (this.f56726c != null) {
            sb.append(ControlChar.SPACE_CHAR);
            sb.append(this.f56726c);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static C18431y9 m79996a(String str) throws IOException {
        EnumC18132c8 enumC18132c8;
        int i;
        String strSubstring;
        if (str.startsWith("HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                enumC18132c8 = EnumC18132c8.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                enumC18132c8 = EnumC18132c8.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            enumC18132c8 = EnumC18132c8.HTTP_1_0;
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
            return new C18431y9(enumC18132c8, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }
}
