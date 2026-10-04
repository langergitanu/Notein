package o0ooo0O;

import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import o0ooO00o.C31428OooO00o;
import o0ooO0o.C31455OooO00o;

/* JADX INFO: renamed from: o0ooo0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31754OooO0Oo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C31754OooO0Oo f113393OooO0Oo = OooO0O0(4281, "glyphlist.txt");

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C31754OooO0Oo f113394OooO0o0 = OooO0O0(201, "zapfdingbats.txt");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f113395OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f113396OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ConcurrentHashMap f113397OooO0OO = new ConcurrentHashMap();

    static {
        try {
            if (System.getProperty("glyphlist_ext") == null) {
            } else {
                throw new UnsupportedOperationException("glyphlist_ext is no longer supported, use GlyphList.DEFAULT.addGlyphs(Properties) instead");
            }
        } catch (SecurityException unused) {
        }
    }

    public C31754OooO0Oo(InputStream inputStream, int i) throws IOException {
        HashMap map = new HashMap(i);
        this.f113395OooO00o = map;
        HashMap map2 = new HashMap(i);
        this.f113396OooO0O0 = map2;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "ISO-8859-1"));
        while (bufferedReader.ready()) {
            try {
                String line = bufferedReader.readLine();
                if (line != null && !line.startsWith("#")) {
                    String[] strArrSplit = line.split(";");
                    if (strArrSplit.length < 2) {
                        throw new IOException("Invalid glyph list entry: " + line);
                    }
                    String str = strArrSplit[0];
                    String[] strArrSplit2 = strArrSplit[1].split(" ");
                    if (map.containsKey(str)) {
                        Log.w("PdfBox-Android", "duplicate value for " + str + " -> " + strArrSplit[1] + " " + ((String) map.get(str)));
                    }
                    int length = strArrSplit2.length;
                    int[] iArr = new int[length];
                    int length2 = strArrSplit2.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length2) {
                        iArr[i3] = Integer.parseInt(strArrSplit2[i2], 16);
                        i2++;
                        i3++;
                    }
                    String str2 = new String(iArr, 0, length);
                    map.put(str, str2);
                    boolean z = C31760OooOO0O.f113406OooOoO.f113391OooOo.containsKey(str) || C31757OooO0oO.f113402OooOoO.f113391OooOo.containsKey(str) || C31756OooO0o0.f113400OooOoO.f113391OooOo.containsKey(str) || C31750OooO.f113386OooOoO.f113391OooOo.containsKey(str) || C31761OooOO0o.f113408OooOoO.f113391OooOo.containsKey(str);
                    if (!map2.containsKey(str2) || z) {
                        map2.put(str2, str);
                    }
                }
            } catch (Throwable th) {
                bufferedReader.close();
                throw th;
            }
        }
        bufferedReader.close();
    }

    public static C31754OooO0Oo OooO0O0(int i, String str) {
        InputStream resourceAsStream;
        String strConcat = "com/tom_roush/pdfbox/resources/glyphlist/".concat(str);
        try {
            try {
                if (C31428OooO00o.f112202OooO00o != null) {
                    resourceAsStream = C31428OooO00o.OooO00o(strConcat);
                } else {
                    resourceAsStream = C31754OooO0Oo.class.getResourceAsStream("/" + strConcat);
                }
                InputStream inputStream = resourceAsStream;
                if (inputStream != null) {
                    C31754OooO0Oo c31754OooO0Oo = new C31754OooO0Oo(inputStream, i);
                    C31455OooO00o.OooO0O0(inputStream);
                    return c31754OooO0Oo;
                }
                throw new IOException("GlyphList '" + strConcat + "' not found");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            C31455OooO00o.OooO0O0(null);
            throw th;
        }
    }

    public final String OooO00o(int i) {
        String str = (String) this.f113396OooO0O0.get(new String(new int[]{i}, 0, 1));
        return str == null ? ".notdef" : str;
    }

    public final String OooO0OO(String str) {
        if (str == null) {
            return null;
        }
        String str2 = (String) this.f113395OooO00o.get(str);
        if (str2 != null) {
            return str2;
        }
        ConcurrentHashMap concurrentHashMap = this.f113397OooO0OO;
        String strValueOf = (String) concurrentHashMap.get(str);
        if (strValueOf == null) {
            if (str.indexOf(46) > 0) {
                strValueOf = OooO0OO(str.substring(0, str.indexOf(46)));
            } else if (str.startsWith("uni") && str.length() == 7) {
                int length = str.length();
                StringBuilder sb = new StringBuilder();
                int i = 3;
                while (true) {
                    int i2 = i + 4;
                    if (i2 > length) {
                        break;
                    }
                    try {
                        int i3 = Integer.parseInt(str.substring(i, i2), 16);
                        if (i3 <= 55295 || i3 >= 57344) {
                            sb.append((char) i3);
                        } else {
                            Log.w("PdfBox-Android", "Unicode character name with disallowed code area: " + str);
                        }
                        i = i2;
                    } catch (NumberFormatException unused) {
                        Log.w("PdfBox-Android", "Not a number in Unicode character name: ".concat(str));
                    }
                    Log.w("PdfBox-Android", "Not a number in Unicode character name: ".concat(str));
                }
                strValueOf = sb.toString();
            } else if (str.startsWith("u") && str.length() == 5) {
                try {
                    int i4 = Integer.parseInt(str.substring(1), 16);
                    if (i4 <= 55295 || i4 >= 57344) {
                        strValueOf = String.valueOf((char) i4);
                    } else {
                        Log.w("PdfBox-Android", "Unicode character name with disallowed code area: ".concat(str));
                    }
                } catch (NumberFormatException unused2) {
                    Log.w("PdfBox-Android", "Not a number in Unicode character name: ".concat(str));
                }
            }
            if (strValueOf != null) {
                concurrentHashMap.put(str, strValueOf);
            }
        }
        return strValueOf;
    }
}
