package o0ooo0;

import OooOoo.C20593OooO0Oo;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import o0oo0o0o.C31323OooO00o;
import o0oo0o0o.C31325OooO0OO;
import o0ooO00o.C31428OooO00o;

/* JADX INFO: renamed from: o0ooo0.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31733OooOooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final HashMap f113356OooO00o = new HashMap(38);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final HashMap f113357OooO0O0 = new HashMap(14);

    static {
        OooO0OO("Courier-Bold");
        OooO0OO("Courier-BoldOblique");
        OooO0OO("Courier");
        OooO0OO("Courier-Oblique");
        OooO0OO("Helvetica");
        OooO0OO("Helvetica-Bold");
        OooO0OO("Helvetica-BoldOblique");
        OooO0OO("Helvetica-Oblique");
        OooO0OO("Symbol");
        OooO0OO("Times-Bold");
        OooO0OO("Times-BoldItalic");
        OooO0OO("Times-Italic");
        OooO0OO("Times-Roman");
        OooO0OO("ZapfDingbats");
        OooO0Oo("CourierCourierNew", "Courier");
        OooO0Oo("CourierNew", "Courier");
        OooO0Oo("CourierNew,Italic", "Courier-Oblique");
        OooO0Oo("CourierNew,Bold", "Courier-Bold");
        OooO0Oo("CourierNew,BoldItalic", "Courier-BoldOblique");
        OooO0Oo("Arial", "Helvetica");
        OooO0Oo("Arial,Italic", "Helvetica-Oblique");
        OooO0Oo("Arial,Bold", "Helvetica-Bold");
        OooO0Oo("Arial,BoldItalic", "Helvetica-BoldOblique");
        OooO0Oo("TimesNewRoman", "Times-Roman");
        OooO0Oo("TimesNewRoman,Italic", "Times-Italic");
        OooO0Oo("TimesNewRoman,Bold", "Times-Bold");
        OooO0Oo("TimesNewRoman,BoldItalic", "Times-BoldItalic");
        OooO0Oo("Symbol,Italic", "Symbol");
        OooO0Oo("Symbol,Bold", "Symbol");
        OooO0Oo("Symbol,BoldItalic", "Symbol");
        OooO0Oo("Times", "Times-Roman");
        OooO0Oo("Times,Italic", "Times-Italic");
        OooO0Oo("Times,Bold", "Times-Bold");
        OooO0Oo("Times,BoldItalic", "Times-BoldItalic");
        OooO0Oo("ArialMT", "Helvetica");
        OooO0Oo("Arial-ItalicMT", "Helvetica-Oblique");
        OooO0Oo("Arial-BoldMT", "Helvetica-Bold");
        OooO0Oo("Arial-BoldItalicMT", "Helvetica-BoldOblique");
    }

    public static C31325OooO0OO OooO00o(String str) {
        String str2 = (String) f113356OooO00o.get(str);
        if (str2 == null) {
            return null;
        }
        HashMap map = f113357OooO0O0;
        if (map.get(str2) == null) {
            synchronized (map) {
                if (map.get(str2) == null) {
                    try {
                        OooO0O0(str2);
                    } catch (IOException e) {
                        throw new IllegalArgumentException(e);
                    }
                }
            }
        }
        return (C31325OooO0OO) map.get(str2);
    }

    public static void OooO0O0(String str) throws IOException {
        InputStream resourceAsStream;
        String strOooO0O0 = C20593OooO0Oo.OooO0O0("com/tom_roush/pdfbox/resources/afm/", str, ".afm");
        if (C31428OooO00o.f112202OooO00o != null) {
            resourceAsStream = C31428OooO00o.OooO00o(strOooO0O0);
        } else {
            resourceAsStream = C31728OooOoO.class.getResourceAsStream("/" + strOooO0O0);
        }
        if (resourceAsStream == null) {
            throw new IOException(C20593OooO0Oo.OooO0O0("resource '", strOooO0O0, "' not found"));
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
        try {
            f113357OooO0O0.put(str, new C31323OooO00o(bufferedInputStream).OooO0O0());
        } finally {
            bufferedInputStream.close();
        }
    }

    public static void OooO0OO(String str) {
        f113356OooO00o.put(str, str);
    }

    public static void OooO0Oo(String str, String str2) {
        f113356OooO00o.put(str, str2);
    }
}
