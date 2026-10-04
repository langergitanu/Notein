package com.aspose.words.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes5.dex */
public class zzZRJ implements zzZOY, AutoCloseable {
    protected static byte[] zz4T;
    private Shader zz4S;
    protected Bitmap zzVJ;
    private Paint zzfm;
    protected static final Paint zz4V = zzlM();
    protected static final Shader zz4U = zzlL();

    static {
        try {
            zz4T = zzEF.zzDL();
        } catch (Exception unused) {
            zz4T = new byte[0];
        }
    }

    public zzZRJ() {
        Paint paint = new Paint();
        this.zzfm = paint;
        paint.setStyle(Paint.Style.FILL);
    }

    private static Shader.TileMode[] zzRB(int i) {
        Shader.TileMode[] tileModeArr = new Shader.TileMode[2];
        if (i == 0) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            tileModeArr[0] = tileMode;
            tileModeArr[1] = tileMode;
            return tileModeArr;
        }
        if (i == 1) {
            tileModeArr[0] = Shader.TileMode.MIRROR;
            tileModeArr[1] = Shader.TileMode.REPEAT;
            return tileModeArr;
        }
        if (i == 2) {
            tileModeArr[0] = Shader.TileMode.REPEAT;
            tileModeArr[1] = Shader.TileMode.MIRROR;
            return tileModeArr;
        }
        if (i == 3) {
            Shader.TileMode tileMode2 = Shader.TileMode.MIRROR;
            tileModeArr[0] = tileMode2;
            tileModeArr[1] = tileMode2;
            return tileModeArr;
        }
        if (i != 4) {
            return tileModeArr;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        tileModeArr[0] = tileMode3;
        tileModeArr[1] = tileMode3;
        return tileModeArr;
    }

    private static Shader zzlL() {
        Bitmap bitmapZzWR = zzXN.zzWR();
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        return new BitmapShader(bitmapZzWR, tileMode, tileMode);
    }

    private static Paint zzlM() {
        Bitmap bitmapZzWR = zzXN.zzWR();
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        BitmapShader bitmapShader = new BitmapShader(bitmapZzWR, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(bitmapShader);
        return paint;
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        dispose();
    }

    @Override // com.aspose.words.internal.zzZOY
    public void dispose() {
        if (this.zz4S != null) {
            this.zz4S = null;
        }
        Bitmap bitmap = this.zzVJ;
        if (bitmap != null) {
            bitmap.recycle();
            this.zzVJ = null;
        }
        if (this.zzfm != null) {
            this.zzfm = null;
        }
    }

    public final Paint getPaint() {
        return this.zzfm;
    }

    public final void setColor(int i) {
        this.zzfm.setColor(i);
    }

    public final void zzZ(Shader shader) {
        this.zz4S = shader;
        this.zzfm.setShader(shader);
    }

    public static Shader zzZ(Bitmap bitmap, int i, zzP9 zzp9) {
        Shader.TileMode[] tileModeArrZzRB = zzRB(i);
        BitmapShader bitmapShader = new BitmapShader(zzZ(bitmap, tileModeArrZzRB), tileModeArrZzRB[0], tileModeArrZzRB[1]);
        bitmapShader.setLocalMatrix(zzAL.zzG(zzp9));
        return bitmapShader;
    }

    private static Bitmap zzZ(Bitmap bitmap, Shader.TileMode[] tileModeArr) {
        Shader.TileMode tileMode;
        Shader.TileMode tileMode2;
        if (tileModeArr == null || tileModeArr.length < 2 || !((tileMode = tileModeArr[0]) == (tileMode2 = Shader.TileMode.CLAMP) || tileModeArr[1] == tileMode2)) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(tileMode == tileMode2 ? bitmap.getWidth() + 1 : bitmap.getWidth(), tileModeArr[1] == tileMode2 ? bitmap.getHeight() + 1 : bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, new Paint());
        bitmap.recycle();
        return bitmapCreateBitmap;
    }
}
