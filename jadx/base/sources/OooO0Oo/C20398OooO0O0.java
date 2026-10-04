package OooO0Oo;

import com.aspose.slides.Collections.Generic.Dictionary;

/* JADX INFO: renamed from: OooO0Oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C20398OooO0O0 {
    public static String OooO00o(char c, StringBuilder sb, int i) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder OooO0O0(String str, int i, String str2, String str3, int i2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static void OooO0OO(int i, Dictionary dictionary, Integer num, Integer num2, Integer num3) {
        dictionary.addItem(num, Integer.valueOf(i));
        dictionary.addItem(num2, num3);
    }
}
