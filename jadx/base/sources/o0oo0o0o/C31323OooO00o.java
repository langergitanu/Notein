package o0oo0o0o;

import OooOoo.C20593OooO0Oo;
import OooOooO.C20741OooOOoo;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;
import o0oo0ooo.C31412OooO00o;

/* JADX INFO: renamed from: o0oo0o0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31323OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final BufferedInputStream f111839OooO00o;

    public C31323OooO00o(BufferedInputStream bufferedInputStream) {
        this.f111839OooO00o = bufferedInputStream;
    }

    public static boolean OooO00o(int i) {
        return i == 32 || i == 9 || i == 13 || i == 10;
    }

    public static void OooO0oO(StringTokenizer stringTokenizer) throws IOException {
        if (!stringTokenizer.hasMoreTokens()) {
            throw new IOException("CharMetrics is missing a semicolon after a command");
        }
        String strNextToken = stringTokenizer.nextToken();
        if (!";".equals(strNextToken)) {
            throw new IOException(C20593OooO0Oo.OooO0O0("Error: Expected semicolon in stream actual='", strNextToken, "'"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x03ec, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C31325OooO0OO OooO0O0() throws IOException {
        C31325OooO0OO c31325OooO0OO = new C31325OooO0OO();
        String strOooO0o = OooO0o();
        if (!"StartFontMetrics".equals(strOooO0o)) {
            throw new IOException(C20593OooO0Oo.OooO0O0("Error: The AFM file should start with StartFontMetrics and not '", strOooO0o, "'"));
        }
        OooO0OO();
        boolean z = false;
        while (true) {
            String strOooO0o2 = OooO0o();
            if ("EndFontMetrics".equals(strOooO0o2)) {
                break;
            }
            if ("FontName".equals(strOooO0o2)) {
                c31325OooO0OO.f111845OooO00o = OooO0o0();
            } else if ("FullName".equals(strOooO0o2)) {
                OooO0o0();
            } else if ("FamilyName".equals(strOooO0o2)) {
                c31325OooO0OO.f111846OooO0O0 = OooO0o0();
            } else if ("Weight".equals(strOooO0o2)) {
                OooO0o0();
            } else if ("FontBBox".equals(strOooO0o2)) {
                C31412OooO00o c31412OooO00o = new C31412OooO00o();
                c31412OooO00o.f112165OooO00o = OooO0OO();
                c31412OooO00o.f112166OooO0O0 = OooO0OO();
                c31412OooO00o.f112167OooO0OO = OooO0OO();
                c31412OooO00o.f112168OooO0Oo = OooO0OO();
                c31325OooO0OO.f111847OooO0OO = c31412OooO00o;
            } else if ("Version".equals(strOooO0o2)) {
                OooO0o0();
            } else if ("Notice".equals(strOooO0o2)) {
                OooO0o0();
            } else if ("EncodingScheme".equals(strOooO0o2)) {
                c31325OooO0OO.f111848OooO0Oo = OooO0o0();
            } else if ("MappingScheme".equals(strOooO0o2)) {
                OooO0Oo();
            } else if ("EscChar".equals(strOooO0o2)) {
                OooO0Oo();
            } else if ("CharacterSet".equals(strOooO0o2)) {
                c31325OooO0OO.f111850OooO0o0 = OooO0o0();
            } else if ("Characters".equals(strOooO0o2)) {
                OooO0Oo();
            } else if ("IsBaseFont".equals(strOooO0o2)) {
                Boolean.parseBoolean(OooO0o());
            } else if ("VVector".equals(strOooO0o2)) {
                OooO0OO();
                OooO0OO();
            } else if ("IsFixedV".equals(strOooO0o2)) {
                Boolean.parseBoolean(OooO0o());
            } else if ("CapHeight".equals(strOooO0o2)) {
                c31325OooO0OO.f111849OooO0o = OooO0OO();
            } else if ("XHeight".equals(strOooO0o2)) {
                c31325OooO0OO.f111851OooO0oO = OooO0OO();
            } else if ("Ascender".equals(strOooO0o2)) {
                c31325OooO0OO.f111852OooO0oo = OooO0OO();
            } else if ("Descender".equals(strOooO0o2)) {
                c31325OooO0OO.f111844OooO = OooO0OO();
            } else if ("StdHW".equals(strOooO0o2)) {
                OooO0OO();
            } else if ("StdVW".equals(strOooO0o2)) {
                OooO0OO();
            } else if ("Comment".equals(strOooO0o2)) {
                c31325OooO0OO.f111853OooOO0.add(OooO0o0());
            } else if ("UnderlinePosition".equals(strOooO0o2)) {
                OooO0OO();
            } else if ("UnderlineThickness".equals(strOooO0o2)) {
                OooO0OO();
            } else if ("ItalicAngle".equals(strOooO0o2)) {
                c31325OooO0OO.f111854OooOO0O = OooO0OO();
            } else if ("CharWidth".equals(strOooO0o2)) {
                OooO0OO();
                OooO0OO();
            } else if ("IsFixedPitch".equals(strOooO0o2)) {
                Boolean.parseBoolean(OooO0o());
            } else if ("StartCharMetrics".equals(strOooO0o2)) {
                int iOooO0Oo = OooO0Oo();
                ArrayList<C31324OooO0O0> arrayList = new ArrayList(iOooO0Oo);
                for (int i = 0; i < iOooO0Oo; i++) {
                    C31324OooO0O0 c31324OooO0O0 = new C31324OooO0O0();
                    StringTokenizer stringTokenizer = new StringTokenizer(OooO0o0());
                    while (stringTokenizer.hasMoreTokens()) {
                        try {
                            String strNextToken = stringTokenizer.nextToken();
                            if (strNextToken.equals("C")) {
                                c31324OooO0O0.f111840OooO00o = Integer.parseInt(stringTokenizer.nextToken());
                                OooO0oO(stringTokenizer);
                            } else if (strNextToken.equals("CH")) {
                                c31324OooO0O0.f111840OooO00o = Integer.parseInt(stringTokenizer.nextToken(), 16);
                                OooO0oO(stringTokenizer);
                            } else if (strNextToken.equals("WX")) {
                                c31324OooO0O0.f111841OooO0O0 = Float.parseFloat(stringTokenizer.nextToken());
                                OooO0oO(stringTokenizer);
                            } else if (strNextToken.equals("W0X")) {
                                Float.parseFloat(stringTokenizer.nextToken());
                                OooO0oO(stringTokenizer);
                            } else if (strNextToken.equals("W1X")) {
                                Float.parseFloat(stringTokenizer.nextToken());
                                OooO0oO(stringTokenizer);
                            } else if (strNextToken.equals("WY")) {
                                Float.parseFloat(stringTokenizer.nextToken());
                                OooO0oO(stringTokenizer);
                            } else if (strNextToken.equals("W0Y")) {
                                Float.parseFloat(stringTokenizer.nextToken());
                                OooO0oO(stringTokenizer);
                            } else if (strNextToken.equals("W1Y")) {
                                Float.parseFloat(stringTokenizer.nextToken());
                                OooO0oO(stringTokenizer);
                            } else if (strNextToken.equals("W")) {
                                Float.parseFloat(stringTokenizer.nextToken());
                                Float.parseFloat(stringTokenizer.nextToken());
                                OooO0oO(stringTokenizer);
                            } else if (strNextToken.equals("W0")) {
                                Float.parseFloat(stringTokenizer.nextToken());
                                Float.parseFloat(stringTokenizer.nextToken());
                                OooO0oO(stringTokenizer);
                            } else if (strNextToken.equals("W1")) {
                                Float.parseFloat(stringTokenizer.nextToken());
                                Float.parseFloat(stringTokenizer.nextToken());
                                OooO0oO(stringTokenizer);
                            } else if (strNextToken.equals("VV")) {
                                Float.parseFloat(stringTokenizer.nextToken());
                                Float.parseFloat(stringTokenizer.nextToken());
                                OooO0oO(stringTokenizer);
                            } else if (strNextToken.equals("N")) {
                                c31324OooO0O0.f111842OooO0OO = stringTokenizer.nextToken();
                                OooO0oO(stringTokenizer);
                            } else if (strNextToken.equals("B")) {
                                Float.parseFloat(stringTokenizer.nextToken());
                                Float.parseFloat(stringTokenizer.nextToken());
                                Float.parseFloat(stringTokenizer.nextToken());
                                Float.parseFloat(stringTokenizer.nextToken());
                                OooO0oO(stringTokenizer);
                            } else {
                                if (!strNextToken.equals("L")) {
                                    throw new IOException("Unknown CharMetrics command '" + strNextToken + "'");
                                }
                                C20741OooOOoo c20741OooOOoo = new C20741OooOOoo();
                                stringTokenizer.nextToken();
                                stringTokenizer.nextToken();
                                c31324OooO0O0.f111843OooO0Oo.add(c20741OooOOoo);
                                OooO0oO(stringTokenizer);
                            }
                        } catch (NumberFormatException e) {
                            throw new IOException("Error: Corrupt AFM document:" + e);
                        }
                    }
                    arrayList.add(c31324OooO0O0);
                }
                String strOooO0o3 = OooO0o();
                if (!strOooO0o3.equals("EndCharMetrics")) {
                    throw new IOException(C20593OooO0Oo.OooO0O0("Error: Expected 'EndCharMetrics' actual '", strOooO0o3, "'"));
                }
                c31325OooO0OO.f111855OooOO0o = arrayList;
                c31325OooO0OO.f111856OooOOO0 = new HashMap(c31325OooO0OO.f111855OooOO0o.size());
                for (C31324OooO0O0 c31324OooO0O02 : arrayList) {
                    c31325OooO0OO.f111856OooOOO0.put(c31324OooO0O02.f111842OooO0OO, c31324OooO0O02);
                }
                z = true;
            } else if (!z) {
                throw new IOException(C20593OooO0Oo.OooO0O0("Unknown AFM key '", strOooO0o2, "'"));
            }
        }
    }

    public final float OooO0OO() throws IOException {
        return Float.parseFloat(OooO0o());
    }

    public final int OooO0Oo() throws IOException {
        try {
            return Integer.parseInt(OooO0o());
        } catch (NumberFormatException e) {
            throw new IOException("Error parsing AFM document:" + e);
        }
    }

    public final String OooO0o() throws IOException {
        StringBuilder sb = new StringBuilder(24);
        BufferedInputStream bufferedInputStream = this.f111839OooO00o;
        int i = bufferedInputStream.read();
        while (OooO00o(i)) {
            i = bufferedInputStream.read();
        }
        sb.append((char) i);
        for (int i2 = bufferedInputStream.read(); i2 != -1 && !OooO00o(i2); i2 = bufferedInputStream.read()) {
            sb.append((char) i2);
        }
        return sb.toString();
    }

    public final String OooO0o0() throws IOException {
        StringBuilder sb = new StringBuilder(60);
        BufferedInputStream bufferedInputStream = this.f111839OooO00o;
        int i = bufferedInputStream.read();
        while (OooO00o(i)) {
            i = bufferedInputStream.read();
        }
        sb.append((char) i);
        for (int i2 = bufferedInputStream.read(); i2 != -1 && i2 != 13 && i2 != 10; i2 = bufferedInputStream.read()) {
            sb.append((char) i2);
        }
        return sb.toString();
    }
}
