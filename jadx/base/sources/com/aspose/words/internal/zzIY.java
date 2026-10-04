package com.aspose.words.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.RectF;
import java.io.Closeable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzIY implements Closeable {
    private float zzUj;
    private float zzyI;
    private zzEK zzyJ;
    private Canvas zzyK;
    private static final zz0I zzyQ = new zz0I();
    private static zzD4 zzyP = new zzD4();
    private static zzD4 zzyO = new zzD4();
    private static zzD4 zzyN = new zzD4();
    private static zzD4 zzyM = new zzD4();
    private static zzD4 zzyL = new zzD4();

    static {
        zzyP.add(61474, 9986);
        zzyP.add(61521, 9992);
        zzyP.add(61526, 10014);
        zzyP.add(61615, 10041);
        zzyP.add(61480, 9742);
        zzyP.add(61484, 9993);
        zzyP.add(61607, 9642);
        zzyP.add(61664, 10132);
        zzyP.add(61623, 9991);
        zzyP.add(61545, 9811);
        zzyP.add(61552, 9633);
        zzyP.add(61555, 9642);
        zzyP.add(61557, 9670);
        zzyP.add(61549, 10061);
        zzyP.add(61472, 32);
        zzyO.add(61479, 9742);
        zzyN.add(61474, 8594);
        zzyN.add(61496, 8629);
        zzyM.add(61595, 9993);
        zzyM.add(61640, 9990);
        zzyL.add(61623, 8226);
    }

    public zzIY(zzEK zzek) {
        this(zzek.zzDW());
        this.zzyJ = zzek;
    }

    private void zzGG() {
        zzEK zzek;
        if (this.zzyK == null || (zzek = this.zzyJ) == null) {
            return;
        }
        float verticalResolution = zzek.getVerticalResolution();
        float horizontalResolution = this.zzyJ.getHorizontalResolution();
        if (verticalResolution == this.zzUj && horizontalResolution == this.zzyI) {
            return;
        }
        this.zzUj = verticalResolution;
        this.zzyI = horizontalResolution;
        this.zzyK.scale(horizontalResolution / 96.0f, verticalResolution / 96.0f);
    }

    public static void zzGJ() {
    }

    private static String zzM(String str, String str2) {
        return "Wingdings".equals(str2) ? zzZ(str, zzyP) : "Wingdings 2".equals(str2) ? zzZ(str, zzyO) : "Wingdings 3".equals(str2) ? zzZ(str, zzyN) : "Webdings".equals(str2) ? zzZ(str, zzyM) : "Symbol".equals(str2) ? zzZ(str, zzyL) : str;
    }

    private static void zzY(Canvas canvas, Paint paint, zzZU zzzu, float f, float f2) {
        String strZzZp = zzzu.zzZp();
        if (zzZKN.zzU3(strZzZp)) {
            return;
        }
        Iterator itOooO00o = OooO0OO.OooO00o(strZzZp);
        float fZzY7 = f;
        while (itOooO00o.hasNext()) {
            int iIntValue = ((Integer) itOooO00o.next()).intValue();
            char[] chars = Character.toChars(iIntValue);
            Canvas canvas2 = canvas;
            canvas2.drawText(chars, 0, chars.length, fZzY7, f2, paint);
            fZzY7 += zzzu.zzZr().zzY7(iIntValue);
            canvas = canvas2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        dispose();
    }

    public final void dispose() {
        if (this.zzyK != null) {
            this.zzyK = null;
        }
    }

    public final void zzGF() {
        this.zzyK.setDrawFilter(new PaintFlagsDrawFilter(0, 1));
    }

    public final Canvas zzGH() {
        zzGG();
        return this.zzyK;
    }

    public final void zzGI() {
        this.zzyK.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
    }

    public final void zzR(float f) {
        this.zzyK.scale(f, f);
    }

    public final void zzZ(float f, float f2, float f3, float f4, float f5) {
        float f6 = f3 / f;
        float f7 = f4 / f2;
        if (f6 >= f7) {
            f6 = f7;
        }
        float f8 = f6 * f5;
        this.zzyK.translate(f3 / 2.0f, f4 / 2.0f);
        this.zzyK.scale(f8, f8);
        this.zzyK.translate((-f) / 2.0f, (-f2) / 2.0f);
    }

    private static boolean zzR(zzZU zzzu) {
        int iIndexOf;
        String strZzPh = zzzu.zzZr().zzPl().zzPh();
        String strZzZp = zzzu.zzZp();
        return strZzPh.startsWith("Times New Roman") && !zzZKN.zzU3(strZzZp) && (iIndexOf = strZzZp.indexOf(87)) <= strZzZp.length() + (-2) && Character.isLowerCase(strZzZp.charAt(iIndexOf + 1));
    }

    private zzIY(Bitmap bitmap) {
        this.zzUj = 96.0f;
        this.zzyI = 96.0f;
        this.zzyK = new Canvas(bitmap);
    }

    private void zzZ(int i, float f, float f2, float f3, float f4) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        this.zzyK.drawRect(new RectF(0.0f, 0.0f, f3, f4), paint);
    }

    public final void zzZ(zzXN zzxn, zzZQ5 zzzq5, zzZQ5 zzzq52) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.zzyK.drawBitmap(zzxn.zzDW(), zzzq5.zzkx(), zzzq52.zzkx(), paint);
    }

    private static void zzY(Canvas canvas, Paint paint, String str, float f, float f2) {
        zzAL zzal = new zzAL(canvas.getMatrix());
        float scaleX = zzal.getScaleX();
        float scaleY = zzal.getScaleY();
        float fMax = Math.max(scaleX, scaleY);
        if (Float.compare(fMax, 0.0f) == 0) {
            fMax = 1.0f;
        }
        float fAbs = 1.0f / Math.abs(fMax);
        canvas.save();
        canvas.scale(fAbs, fAbs);
        Paint paint2 = new Paint(paint);
        paint2.setTextSize(Math.abs(paint.getTextSize() * fMax));
        float f3 = f * fMax;
        float f4 = f2 * fMax;
        if (scaleX < 0.0f) {
            f3 = -f3;
        }
        if (scaleY < 0.0f) {
            f4 = -f4;
        }
        canvas.drawText(str, f3, f4, paint2);
        canvas.restore();
    }

    public static void zzZ(Canvas canvas, Paint paint, zzZU zzzu, float f, float f2) {
        String strZzZp = zzzu.zzZp();
        if (zzZYD.zzXk(strZzZp)) {
            String strZzM = zzM(strZzZp, zzzu.zzZr().zzPl().zzPh());
            if (zzR(zzzu)) {
                zzY(canvas, paint, zzzu, f, f2);
            } else {
                zzZ(canvas, paint, strZzM, f, f2);
            }
        }
    }

    private static void zzZ(Canvas canvas, Paint paint, String str, float f, float f2) {
        zzAL zzal = new zzAL(canvas.getMatrix());
        float fAbs = Math.abs(zzal.getScaleX());
        float fAbs2 = Math.abs(zzal.getScaleY());
        if (Float.compare(fAbs, 0.0f) != 0 && Float.compare(fAbs2, 0.0f) != 0 && ((fAbs <= 0.1f || fAbs > 3.0f) && ((fAbs2 <= 0.1f || fAbs2 > 3.0f) && fAbs > 1.0E-5d && fAbs2 > 1.0E-5d))) {
            zzY(canvas, paint, str, f, f2);
        } else {
            canvas.drawText(str, f, f2, paint);
        }
    }

    private static String zzZ(String str, zzD4 zzd4) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int iCodePointAt = Character.codePointAt(charArray, i);
            if (!Character.isValidCodePoint(iCodePointAt)) {
                sb.append(charArray[i]);
            } else {
                if (!zzD4.zzWm(iCodePointAt)) {
                    int i2 = zzd4.get(iCodePointAt);
                    if (!zzD4.zzWm(i2)) {
                        iCodePointAt = i2;
                    }
                }
                sb.append(Character.toChars(iCodePointAt));
            }
        }
        return sb.toString();
    }

    public final void zzZ(zzPV zzpv, float f, float f2) {
        zzZ(zzT4.zzS(zzpv), 0.0f, 0.0f, f, f2);
    }
}
