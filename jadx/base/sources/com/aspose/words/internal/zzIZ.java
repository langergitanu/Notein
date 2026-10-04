package com.aspose.words.internal;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.aspose.words.Cluster;
import com.aspose.words.Glyph;
import java.io.Closeable;

/* JADX INFO: loaded from: classes5.dex */
final class zzIZ implements Closeable {
    private static final String[] zzyV = {"Arial Unicode MS", "Trebuchet MS", "Malgun Gothic", "Microsoft JhengHei", "Meiryo UI"};
    private zzGQ zzFh;
    private zzF4 zzv;
    private float zzyS;
    private float zzyT;
    private boolean zzyR = false;
    private final boolean zzyU = true;

    public zzIZ(zzGQ zzgq, zzF4 zzf4) {
        this.zzFh = zzgq;
        this.zzv = zzf4;
    }

    private static Cluster[] zzS(zzZU zzzu) {
        if (zzzu.zzZh() != null) {
            return zzzu.zzZh();
        }
        if (zzZYD.zzi(zzzu.zzZr().zzPh(), "Code 128")) {
            return zzzu.zzZr().zzZ(zzzu.getText(), zzzu.zzZk());
        }
        return null;
    }

    private void zzY(Canvas canvas, zzZU zzzu, Cluster[] clusterArr, Paint paint) throws Exception {
        long jZzZ = zzZ(zzzu, paint);
        zzUW zzuw = new zzUW(zzzu.zzZr(), clusterArr);
        zzPM zzpmZzZr = zzzu.zzZr();
        float fIntBitsToFloat = Float.intBitsToFloat((int) jZzZ);
        float fZzYC = zzZPY.zzYC(jZzZ);
        for (Cluster cluster : clusterArr) {
            int[] codepoints = cluster.getCodepoints();
            Glyph[] glyphs = cluster.getGlyphs();
            int length = glyphs.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                Glyph glyph = glyphs[i];
                float fZzY4 = zzpmZzZr.zzY4(glyph.getAdvanceOffset()) + fIntBitsToFloat;
                float fZzY42 = fZzYC - zzpmZzZr.zzY4(glyph.getAscenderOffset());
                fIntBitsToFloat += zzpmZzZr.zzY4(glyph.getAdvance());
                int i3 = i2 + 1;
                if (codepoints[i2] >= 33) {
                    zzP8 zzp8ZzZ8 = zzuw.zzZ8(glyph.getGlyphIndex());
                    zzp8ZzZ8.zzY(new zzP9(1.0f, 0.0f, 0.0f, 1.0f, fZzY4, fZzY42));
                    canvas.drawPath(zz6K.zzE(zzp8ZzZ8), paint);
                }
                i++;
                i2 = i3;
            }
        }
    }

    private static boolean zzZ6(String str) {
        int i = 0;
        while (true) {
            String[] strArr = zzyV;
            if (i >= strArr.length) {
                return false;
            }
            if (strArr[i].equals(str)) {
                return true;
            }
            i++;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void zzZ(Canvas canvas, zzZU zzzu, zz0I zz0i) throws Exception {
        if (zzzu.zzZr().zzPi()) {
            canvas.concat(zzAL.zzG(zzzu.zzZs()));
        }
        Paint paintZzZ = zzJX.zzZ(zzzu.zzZr(), zz0i);
        zzZ(canvas, zzzu, paintZzZ);
        Cluster[] clusterArrZzS = zzS(zzzu);
        if (clusterArrZzS == null) {
            zzY(canvas, zzzu, paintZzZ);
        } else {
            zzZ(canvas, zzzu, clusterArrZzS, paintZzZ);
        }
        float f = this.zzyT;
        if (f != 1.0f) {
            canvas.scale(1.0f / f, 1.0f / f);
        }
    }

    private void zzZ(Canvas canvas, zzZU zzzu, Paint paint) {
        this.zzyT = 1.0f;
        this.zzyS = 1.0f;
        if (zzzu.zzZr().zzPg() < 1.0f) {
            paint.setTextSize(1.0f);
            this.zzyT = (zzzu.zzZr().zzPg() * 100.0f) / 100.0f;
            this.zzyS = 1.0f / zzzu.zzZr().zzPg();
            float f = this.zzyT;
            canvas.scale(f, f);
        }
    }

    private void zzY(Canvas canvas, zzZU zzzu, Paint paint) {
        long jZzZ = zzZ(zzzu, paint);
        float fIntBitsToFloat = Float.intBitsToFloat((int) jZzZ) * this.zzyS;
        float fZzYC = zzZPY.zzYC(jZzZ) * this.zzyS;
        if (!zzPV.zzZ(zzzu.zzZy(), zzPV.zzHZ)) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(zzT4.zzS(zzzu.zzZy()));
            zzIY.zzZ(canvas, paint, zzzu, fIntBitsToFloat, fZzYC);
        }
        if (zzPV.zzZ(zzzu.zzZq(), zzPV.zzHZ)) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        paint.setColor(zzT4.zzS(zzzu.zzZq()));
        zzIY.zzZ(canvas, paint, zzzu, fIntBitsToFloat, fZzYC);
    }

    private void zzZ(Canvas canvas, zzZU zzzu, Cluster[] clusterArr, Paint paint) throws Exception {
        if (!zzPV.zzZ(zzzu.zzZy(), zzPV.zzHZ)) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(zzT4.zzS(zzzu.zzZy()));
            zzY(canvas, zzzu, clusterArr, paint);
        }
        if (zzPV.zzZ(zzzu.zzZq(), zzPV.zzHZ)) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        paint.setColor(zzT4.zzS(zzzu.zzZq()));
        this.zzyR = false;
        zzY(canvas, zzzu, clusterArr, paint);
    }

    private static long zzZ(zzZU zzzu, Paint paint) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) zzzu.zzZT());
        float fZzYC = zzZPY.zzYC(zzzu.zzZT());
        if (zzZ6(zzzu.zzZr().zzPh()) && paint.getTextSize() > 0.0f) {
            fZzYC -= zzzu.zzZr().getAscentPoints() - paint.getFontMetricsInt().ascent;
        }
        return zzZPY.zzG(fIntBitsToFloat, fZzYC);
    }
}
