package com.aspose.slides.internal.p077d8;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.nv */
/* JADX INFO: loaded from: classes3.dex */
public class C3076nv {
    /* JADX INFO: renamed from: k4 */
    private static String m13016k4(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append((char) (str.charAt(i) ^ "patterns.bin".charAt(i % 12)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m13017k4(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        if (iArr.length == 0) {
            return "";
        }
        int length = (iArr.length - 1) % 56;
        StringBuilder sb = new StringBuilder(iArr.length - 1);
        for (int i = 0; i < iArr.length - 1; i++) {
            sb.append((char) iArr[i]);
            length = (length + iArr[i]) % 56;
        }
        if (iArr[iArr.length - 1] == length) {
            return m13016k4(sb.toString());
        }
        throw new IllegalStateException();
    }
}
