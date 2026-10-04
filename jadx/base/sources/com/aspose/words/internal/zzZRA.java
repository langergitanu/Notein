package com.aspose.words.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.words.internal.zzZIV;
import com.aspose.words.internal.zzZIW;
import com.aspose.words.internal.zzZQ8;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZRA {
    private final int bgColor;
    private Bitmap zz3Z;
    private List<zzY> zz40;
    private boolean zz41;
    private int zz42;
    private int[] zz43;
    private int[] zz44;
    private PointF zz45;
    private final Paint zz46;
    private final zzZQ8 zz47;
    private final RectF zz48;
    private float[] zz4W;
    private final Matrix zz51;
    private int zzFV;
    private static final Region zz4a = new Region();
    private static final Rect zz49 = new Rect();

    public static class zzY {
        private final zzZIV.zzZ zz3U;
        private final int zz3V;

        public zzY(zzZIV.zzZ zzz, int i) {
            this.zz3V = i;
            this.zz3U = zzz;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            zzY zzy = (zzY) obj;
            return this.zz3V == zzy.zz3V && this.zz3U.equals(zzy.zz3U);
        }

        public final int hashCode() {
            return this.zz3U.hashCode() + ((this.zz3V + 58) * 29);
        }
    }

    public static class zzZ {
        public double zz3W;
        public zzY zz3X;
        public zzY zz3Y;

        public final void zzZ(zzY zzy, zzY zzy2, double d) {
            this.zz3Y = zzy;
            this.zz3X = zzy2;
            this.zz3W = d;
        }
    }

    public zzZRA(Path path) {
        if (path == null || !(path instanceof zzZQ8)) {
            throw new IllegalArgumentException("nativePath must be an instance of GraphicsPath");
        }
        zzZQ8 zzzq8 = (zzZQ8) path;
        this.zz47 = zzzq8;
        RectF rectFZzZ = zzZQ8.zzZ(zzzq8, true);
        this.zz48 = rectFZzZ;
        this.zzFV = 4;
        this.zz51 = new Matrix();
        this.bgColor = Color.argb(0, 0, 0, 0);
        this.zz42 = -1;
        zzZ(new PointF(rectFZzZ.centerX(), rectFZzZ.centerY()));
        Paint paint = new Paint();
        this.zz46 = paint;
        paint.setFilterBitmap(true);
    }

    private static boolean zz7(Object obj) {
        return obj != null && obj.getClass().isArray() && Array.getLength(obj) > 0;
    }

    private static Shader.TileMode zzRx(int i) {
        if (i == 0) {
            return Shader.TileMode.REPEAT;
        }
        if (i != 1 && i != 2 && i != 3) {
            return i != 4 ? Shader.TileMode.REPEAT : Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    private static boolean zzU(int i, int i2, int i3, int i4) {
        return i3 == i && i4 == i2;
    }

    private static int zzY(int i, int i2, double d, double d2) {
        int iAlpha = Color.alpha(i);
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        int iAlpha2 = Color.alpha(i2);
        int iRed2 = Color.red(i2);
        double d3 = d + d2;
        double d4 = d2 / d3;
        double d5 = d / d3;
        return Color.argb((int) ((((double) iAlpha2) * d5) + (((double) iAlpha) * d4)), (int) ((((double) iRed2) * d5) + (((double) iRed) * d4)), (int) ((((double) Color.green(i2)) * d5) + (((double) iGreen) * d4)), (int) ((((double) Color.blue(i2)) * d5) + (((double) iBlue) * d4)));
    }

    private static zzZQ4 zzc(zzZQ4 zzzq4) {
        float fMax = Math.max(zzzq4.getWidth(), zzzq4.getHeight());
        if (fMax <= 100.0f) {
            return zzzq4;
        }
        float f = 100.0f / fMax;
        return new zzZQ4(0.0f, 0.0f, zzzq4.getWidth() * f, zzzq4.getHeight() * f);
    }

    private Bitmap zzlI() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int i = this.zz42;
        int[] iArr = this.zz43;
        if (iArr == null || iArr.length <= 0) {
            int[] iArr2 = this.zz44;
            if (iArr2 != null && iArr2.length > 0) {
                i = iArr2[0];
            }
        } else {
            i = iArr[0];
        }
        canvas.drawColor(i);
        return bitmapCreateBitmap;
    }

    public final Bitmap getBitmap() {
        Bitmap bitmap = this.zz3Z;
        if (bitmap == null || bitmap.isRecycled()) {
            getShader();
        }
        return this.zz3Z;
    }

    public final Shader getShader() {
        Bitmap bitmap = this.zz3Z;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.zz3Z.recycle();
            this.zz3Z = null;
        }
        Shader.TileMode tileModeZzRx = zzRx(this.zzFV);
        Bitmap bitmapZzZ = zzZ(this.zz48, tileModeZzRx, new float[]{0.0f, 0.0f});
        this.zz3Z = bitmapZzZ;
        if (bitmapZzZ.getWidth() == 1 && this.zz3Z.getHeight() == 1) {
            tileModeZzRx = Shader.TileMode.REPEAT;
        }
        BitmapShader bitmapShader = new BitmapShader(this.zz3Z, tileModeZzRx, tileModeZzRx);
        Matrix matrix = new Matrix(this.zz51);
        RectF rectF = this.zz48;
        matrix.preTranslate(rectF.left, rectF.top);
        bitmapShader.setLocalMatrix(matrix);
        return bitmapShader;
    }

    public final void zzR(int[] iArr) {
        this.zz44 = iArr;
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("mSurroundColors cannot be empty.");
        }
        this.zz4W = null;
        this.zz41 = zz7(this.zz43) && zz7(this.zz4W);
        this.zz40 = zzZ(this.zz47, this.zz44);
    }

    public final void zzRw(int i) {
        this.zz42 = i;
    }

    public final void zzX(Matrix matrix) {
        this.zz51.preConcat(matrix);
    }

    public final void zzXR(int i) {
        this.zzFV = i;
    }

    public final void zzZ(zzT7 zzt7) {
        this.zz4W = zzt7.zzTs();
        int[] colors = zzt7.getColors();
        this.zz43 = colors;
        this.zz41 = zz7(colors) && zz7(this.zz4W);
    }

    private static int zzX(double d, int i, int i2) {
        double dRed = (((double) (Color.red(i) - Color.red(i2))) * d) + ((double) Color.red(i2));
        double dGreen = (((double) (Color.green(i) - Color.green(i2))) * d) + ((double) Color.green(i2));
        double dBlue = (((double) (Color.blue(i) - Color.blue(i2))) * d) + ((double) Color.blue(i2));
        return Color.argb((int) Math.min((d * ((double) (Color.alpha(i) - Color.alpha(i2)))) + ((double) Color.alpha(i2)), 255.0d), (int) Math.min(dRed, 255.0d), (int) Math.min(dGreen, 255.0d), (int) Math.min(dBlue, 255.0d));
    }

    private static List<zzY> zzZ(zzZQ8 zzzq8, int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            ArrayList arrayList = new ArrayList();
            zzZQ8.zzZ zzzZzkD = zzzq8.zzkD();
            Object obj = null;
            int i = 0;
            while (zzzZzkD.hasNext()) {
                int i2 = i >= iArr.length ? iArr[0] : iArr[i];
                zzZIV.zzZ zzzZzkA = zzzZzkD.zzkA();
                if (!zzzZzkA.equals(obj)) {
                    zzY zzy = new zzY(zzzZzkA, i2);
                    if (!arrayList.contains(zzy)) {
                        arrayList.add(zzy);
                    }
                    i++;
                    obj = zzzZzkA;
                }
            }
            arrayList.add((zzY) arrayList.get(0));
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    private Bitmap zzZ(RectF rectF, Shader.TileMode tileMode, float[] fArr) {
        List<zzY> list;
        boolean z;
        zzZQ5 zzzq5;
        double d;
        List<zzY> listZzZ;
        boolean z2 = rectF.width() > 2048.0f || rectF.height() > 2048.0f;
        zzZQ4 zzzq4 = new zzZQ4(0.0f, 0.0f, rectF.width(), rectF.height());
        zzZQ4 zzzq4Zzc = zzc(zzzq4);
        zzZQ5 zzzq52 = new zzZQ5(Math.round(zzzq4Zzc.zzZm()), Math.round(zzzq4Zzc.zzZo()), Math.max(1, Math.round(zzzq4Zzc.getWidth())), Math.max(1, Math.round(zzzq4Zzc.getHeight())));
        if (zzzq52.getWidth() >= 3 && zzzq52.getHeight() >= 3) {
            zzP9 zzp9ZzZ = zzP9.zzZ(zzzq4, zzzq4Zzc);
            boolean zIsIdentity = zzp9ZzZ.isIdentity();
            boolean z3 = Float.compare(rectF.left, 0.0f) > 0;
            boolean z4 = Float.compare(rectF.left, 0.0f) < 0;
            boolean z5 = Float.compare(rectF.top, 0.0f) < 0;
            boolean z6 = Float.compare(rectF.top, 0.0f) > 0;
            boolean z7 = z3 || z4 || z5 || z6;
            zzZQ8 zzzq8 = new zzZQ8(this.zz47);
            PointF pointF = this.zz45;
            double dSqrt = Math.sqrt(zzZRB.zzZ(zzzq8, pointF));
            List<zzY> list2 = this.zz40;
            if (z7) {
                Matrix matrix = new Matrix();
                z = true;
                list = list2;
                matrix.setTranslate(-rectF.left, -rectF.top);
                zzzq8.transform(matrix);
                float[] fArr2 = {pointF.x, pointF.y};
                matrix.mapPoints(fArr2);
                pointF.set(fArr2[0], fArr2[1]);
            } else {
                list = list2;
                z = true;
            }
            if (zIsIdentity) {
                zzzq5 = zzzq52;
                d = dSqrt;
                listZzZ = list;
            } else {
                long jZzR = zzp9ZzZ.zzR(zzZPY.zzG(pointF.x, pointF.y));
                pointF = new PointF(Math.round(Float.intBitsToFloat((int) jZzR)), Math.round(zzZPY.zzYC(jZzR)));
                zzzq8.transform(zzAL.zzG(zzp9ZzZ));
                double dSqrt2 = Math.sqrt(zzZRB.zzZ(zzzq8, pointF));
                zzzq5 = zzzq52;
                listZzZ = zzZ(zzzq8, this.zz44);
                d = dSqrt2;
            }
            PointF pointF2 = pointF;
            int width = zzzq5.getWidth();
            int height = zzzq5.getHeight();
            int[] iArr = new int[width * height];
            try {
                zzZ(zzzq8, pointF2, d, width, height, iArr, listZzZ);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, width, height, Bitmap.Config.ARGB_8888);
                if (z2) {
                    return bitmapCreateBitmap;
                }
                Bitmap bitmapCreateScaledBitmap = !zIsIdentity ? Bitmap.createScaledBitmap(bitmapCreateBitmap, Math.round(rectF.width()), Math.round(rectF.height()), z) : bitmapCreateBitmap;
                if (tileMode == Shader.TileMode.CLAMP) {
                    bitmapCreateScaledBitmap = zzZ(fArr, z3, z4, z5, z6, bitmapCreateScaledBitmap);
                }
                if (bitmapCreateScaledBitmap != bitmapCreateBitmap) {
                    bitmapCreateBitmap.recycle();
                }
                return bitmapCreateScaledBitmap;
            } catch (Exception unused) {
                return zzXN.zzWR();
            }
        }
        return zzlI();
    }

    private void zzZ(zzZQ8 zzzq8, PointF pointF, double d, int i, int i2, int[] iArr, List<zzY> list) {
        int i3;
        int i4;
        double d2 = pointF.x;
        double d3 = pointF.y;
        int i5 = (int) d2;
        int i6 = (int) d3;
        Region regionZzkB = zzzq8.zzkB();
        zzZIV.zzZ zzz = new zzZIV.zzZ();
        zzZIV.zzZ zzz2 = new zzZIV.zzZ(d2, d3);
        zzZIV.zzZ zzz3 = new zzZIV.zzZ();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < i2) {
            int i10 = 0;
            while (i10 < i) {
                double d4 = i10;
                int i11 = i8;
                int i12 = i9;
                double d5 = i7;
                zzz.zzC(d4, d5);
                if (!zzZ(regionZzkB, i10, i7)) {
                    iArr[i11] = this.bgColor;
                } else if (zzU(i5, i6, i10, i7)) {
                    iArr[i11] = zzZ(0.0d, zzz, list);
                } else {
                    i3 = i7;
                    i4 = i6;
                    double dZzB = d / zzz.zzB(zzz2.f51310x, zzz2.f51311y);
                    double d6 = zzz2.f51310x;
                    double dOooO0O0 = C21532OooOOo.OooO0O0(d4, d6, dZzB, d6);
                    double d7 = zzz2.f51311y;
                    zzz3.zzC(dOooO0O0, C21532OooOOo.OooO0O0(d5, d7, dZzB, d7));
                    double dZzX = zzz2.zzX(zzz);
                    zzZIV zzzivZzZ = zzZRB.zzZ(zzz2, zzz3, zzzq8);
                    if (zzzivZzZ != null) {
                        double dZzX2 = zzz2.zzX(zzzivZzZ);
                        int iZzZ = zzZ(dZzX2 <= 0.0d ? 0.0d : dZzX / dZzX2, zzz3, list);
                        iArr[i11] = iZzZ;
                        i9 = iZzZ;
                        i8 = i11 + 1;
                        i10++;
                        i6 = i4;
                        i7 = i3;
                    } else {
                        iArr[i11] = i12;
                        i9 = i12;
                        i8 = i11 + 1;
                        i10++;
                        i6 = i4;
                        i7 = i3;
                    }
                }
                i3 = i7;
                i4 = i6;
                i9 = i12;
                i8 = i11 + 1;
                i10++;
                i6 = i4;
                i7 = i3;
            }
            i7++;
        }
    }

    private Bitmap zzZ(float[] fArr, boolean z, boolean z2, boolean z3, boolean z4, Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (z2 || z) {
            width++;
        }
        int i = width;
        if (z3 || z4) {
            height++;
        }
        int i2 = height;
        float f = z ? 1.0f : 0.0f;
        float f2 = z4 ? 1.0f : 0.0f;
        Bitmap bitmapZzZ = zzZ(bitmap, f, f2, i, i2);
        fArr[0] = -f;
        fArr[1] = -f2;
        return bitmapZzZ;
    }

    private static boolean zzZ(Region region, int i, int i2) {
        Region region2 = zz4a;
        region2.setEmpty();
        Rect rect = zz49;
        rect.setEmpty();
        rect.set(i - 1, i2 - 1, i + 1, i2 + 1);
        region2.op(rect, region, Region.Op.INTERSECT);
        return !region2.isEmpty();
    }

    private int zzZ(double d, zzZIV zzziv, List<zzY> list) {
        float fMax = Math.max((float) Math.min(d, 1.0d), 0.0f);
        if (!this.zz41) {
            int[] iArr = this.zz44;
            if (iArr != null && iArr.length == 1) {
                return zzX(fMax, iArr[0], this.zz42);
            }
            zzZ zzZ2 = zzZ(list, zzziv);
            return zzX(d, zzY(zzZ2.zz3Y.zz3V, zzZ2.zz3X.zz3V, zzziv.zzX(zzZ2.zz3Y.zz3U), zzziv.zzX(zzZ2.zz3X.zz3U)), this.zz42);
        }
        float f = 1.0f - fMax;
        double d2 = f;
        if (d2 == 0.0d) {
            return this.zz43[0];
        }
        if (d2 == 1.0d) {
            int[] iArr2 = this.zz43;
            return iArr2[iArr2.length - 1];
        }
        int iZzZ = zzZ(d2, this.zz4W);
        float[] fArr = this.zz4W;
        int i = iZzZ - 1;
        float f2 = fArr[i];
        double dMin = Math.min(1.0f, (f - f2) / (fArr[iZzZ] - f2));
        int[] iArr3 = this.zz43;
        return zzX(dMin, iArr3[iZzZ], iArr3[i]);
    }

    private Bitmap zzZ(Bitmap bitmap, float f, float f2, int i, int i2) {
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(f, f2, bitmap.getWidth() + f, bitmap.getHeight() + f2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, bitmap.getConfig());
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, rect, rectF, this.zz46);
        return bitmapCreateBitmap;
    }

    private static int zzZ(double d, float[] fArr) {
        float f = (float) d;
        for (int i = 0; i < fArr.length; i++) {
            int iCompare = Float.compare(f, fArr[i]);
            if (iCompare < 0) {
                return i;
            }
            if (iCompare == 0) {
                int i2 = i + 1;
                return i2 >= fArr.length ? fArr.length - 1 : i2;
            }
        }
        return 0;
    }

    private static zzZ zzZ(List<zzY> list, zzZIV zzziv) {
        if (!list.isEmpty()) {
            Iterator<zzY> it = list.iterator();
            zzZ zzz = new zzZ();
            zzY next = it.hasNext() ? it.next() : null;
            zzY next2 = it.hasNext() ? it.next() : null;
            double dZzZ = new zzZIW.zzZ(next.zz3U, next2.zz3U).zzZ(zzziv);
            zzz.zzZ(next, next2, dZzZ);
            while (it.hasNext()) {
                zzY next3 = it.next();
                if (!next2.equals(next3)) {
                    double dZzZ2 = new zzZIW.zzZ(next2.zz3U, next3.zz3U).zzZ(zzziv);
                    if (dZzZ > dZzZ2) {
                        zzz.zzZ(next2, next3, dZzZ2);
                        next2 = next3;
                        dZzZ = dZzZ2;
                    }
                }
                next2 = next3;
            }
            return zzz;
        }
        throw new IllegalArgumentException("PathVertices cannot be empty");
    }

    public final void zzZ(PointF pointF) {
        this.zz45 = new PointF(Math.round(pointF.x), Math.round(pointF.y));
    }
}
