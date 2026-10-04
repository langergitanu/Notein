package com.aspose.words.internal;

import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes5.dex */
public final class zzJX {
    private static Paint[] zzAA;
    private static String[] zzAD = {"Wingdings", "Wingdings 2", "Wingdings 3", "Webdings"};
    private static String zzAC = "Calibri";
    private static final Paint zzAB = zzZQ0.zzX("Arial", 1.0f, 0);

    static {
        if (zz0T.zzsp()) {
            zzAA = new Paint[]{zzZQ0.zzX("Garuda", 1.0f, 0), zzZQ0.zzX("FreeSans", 1.0f, 0), zzZQ0.zzX("Liberation Sans", 1.0f, 0), zzZQ0.zzX("DejaVu Sans", 1.0f, 0)};
        } else {
            zzAA = new Paint[]{zzZQ0.zzX("Arial", 1.0f, 0), zzZQ0.zzX("Arial Unicode MS", 1.0f, 0)};
        }
    }

    public static zzD3<zzP8> zzHM() {
        return null;
    }

    private static int zzWS(int i) {
        int i2 = (i & 1) != 0 ? 1 : 0;
        return (i & 2) != 0 ? i2 | 2 : i2;
    }

    private static int zzWT(int i) {
        int i2 = (i & 4) != 0 ? 8 : 0;
        return (i & 8) != 0 ? i2 | 16 : i2;
    }

    private static Typeface zzY(zzPM zzpm, zz0I zz0i) {
        Typeface typefaceCreateFromFile;
        try {
            typefaceCreateFromFile = zz0i.zzK(zzpm);
        } catch (Exception unused) {
            typefaceCreateFromFile = null;
        }
        if (typefaceCreateFromFile == null) {
            typefaceCreateFromFile = Typeface.createFromFile(zzpm.zzPl().getFileName());
        }
        return typefaceCreateFromFile == null ? Typeface.create(zzpm.zzPh(), 0) : typefaceCreateFromFile;
    }

    public static Paint zzZ(zzPM zzpm, zz0I zz0i) {
        int iZzPk = zzpm.zzPk();
        if (zzpm.zzPj()) {
            iZzPk |= 1;
        }
        int iZzWS = zzWS(iZzPk);
        int iZzWT = zzWT(iZzPk);
        float fZzPg = zzpm.zzPg();
        if (zzZXT.zzqd().zzX2(zzpm.zzPl().zzPh()) == null || zz0T.zzsp()) {
            try {
                Paint paint = new Paint();
                paint.setFakeBoldText(zzpm.zzPj());
                paint.setTextSize(fZzPg);
                paint.setFlags(iZzWT);
                paint.setTypeface(Typeface.create(zzY(zzpm, zz0i), iZzWS));
                paint.setAntiAlias(true);
                return paint;
            } catch (Exception e) {
                zzZHV.zzZ(e);
            }
        }
        return zzZ(zzpm.zzPl().getFullFontName(), fZzPg, iZzWS);
    }

    private static String zzZP(String str) {
        String strZzX2 = zzZXT.zzqd().zzX2(str);
        if (strZzX2 == null) {
            strZzX2 = zzZXT.zzqd().zzX2("Times New Roman");
        }
        if (strZzX2 == null) {
            strZzX2 = zzZXT.zzqd().zzHw();
        }
        if (strZzX2 != null) {
            return strZzX2;
        }
        throw new IllegalStateException("No fonts are installed on the system.");
    }

    public static boolean zzY(zzZXH zzzxh) {
        if (zzzxh == null) {
            return true;
        }
        String strZzPh = zzzxh.zzPh();
        return strZzPh.startsWith("Adobe") || strZzPh.startsWith("Arial") || strZzPh.startsWith("Times") || strZzPh.startsWith("Microsoft") || strZzPh.startsWith("Tahoma") || strZzPh.startsWith("Courier") || strZzPh.startsWith("Comic") || strZzPh.startsWith("Verdana") || strZzPh.startsWith("Webdings") || strZzPh.startsWith("Calibri") || strZzPh.startsWith("Cambria") || strZzPh.startsWith("Comic") || strZzPh.startsWith("Georgia") || strZzPh.startsWith("Segoe") || strZzPh.startsWith("FangSong") || strZzPh.startsWith("SimSun") || strZzPh.startsWith("Symbol") || strZzPh.startsWith("Trebuchet") || strZzPh.startsWith("Yu") || strZzPh.contains("MS");
    }

    private static Paint zzZ(String str, float f, int i) {
        try {
            return zzZQ0.zzX(str, f, i);
        } catch (Throwable th) {
            zzZHV.zzZ(th);
            return zzZQ0.zzX(zzZP(str), f, i);
        }
    }
}
