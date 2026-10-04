package ooOOoOO0;

/* JADX INFO: renamed from: ooOOoOO0.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35142Oooo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String[] f126191OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f126192OooO0O0;

    static {
        String[] strArr = new String[93];
        for (int i = 0; i < 32; i++) {
            strArr[i] = "\\u" + OooO0O0(i >> 12) + OooO0O0(i >> 8) + OooO0O0(i >> 4) + OooO0O0(i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f126191OooO00o = strArr;
        byte[] bArr = new byte[93];
        for (int i2 = 0; i2 < 32; i2++) {
            bArr[i2] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f126192OooO0O0 = bArr;
    }

    public static final void OooO00o(String value, StringBuilder sb) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        sb.append('\"');
        int length = value.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = value.charAt(i2);
            String[] strArr = f126191OooO00o;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb.append((CharSequence) value, i, i2);
                sb.append(strArr[cCharAt]);
                i = i2 + 1;
            }
        }
        if (i != 0) {
            sb.append((CharSequence) value, i, value.length());
        } else {
            sb.append(value);
        }
        sb.append('\"');
    }

    public static final char OooO0O0(int i) {
        int i2 = i & 15;
        return (char) (i2 < 10 ? i2 + 48 : i2 + 87);
    }
}
