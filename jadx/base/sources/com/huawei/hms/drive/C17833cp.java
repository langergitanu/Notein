package com.huawei.hms.drive;

import com.aspose.words.ControlChar;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: com.huawei.hms.drive.cp */
/* JADX INFO: loaded from: classes6.dex */
public final class C17833cp {

    /* JADX INFO: renamed from: a */
    public final EnumC17796bf f53136a;

    /* JADX INFO: renamed from: b */
    public final int f53137b;

    /* JADX INFO: renamed from: c */
    public final String f53138c;

    public C17833cp(EnumC17796bf enumC17796bf, int i, String str) {
        this.f53136a = enumC17796bf;
        this.f53137b = i;
        this.f53138c = str;
    }

    /* JADX INFO: renamed from: a */
    public static C17833cp m76514a(String str) throws IOException {
        EnumC17796bf enumC17796bf;
        int i;
        String strSubstring;
        if (str.startsWith("HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                enumC17796bf = EnumC17796bf.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                enumC17796bf = EnumC17796bf.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            enumC17796bf = EnumC17796bf.HTTP_1_0;
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
            return new C17833cp(enumC17796bf, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f53136a == EnumC17796bf.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(ControlChar.SPACE_CHAR);
        sb.append(this.f53137b);
        if (this.f53138c != null) {
            sb.append(ControlChar.SPACE_CHAR);
            sb.append(this.f53138c);
        }
        return sb.toString();
    }
}
