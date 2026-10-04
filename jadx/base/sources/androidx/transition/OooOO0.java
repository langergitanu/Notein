package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Path f66348OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Matrix f66349OooO0O0;

    public OooOO0(Path path) {
        Path path2 = new Path();
        this.f66348OooO00o = path2;
        Matrix matrix = new Matrix();
        this.f66349OooO0O0 = matrix;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        matrix.setTranslate(-f3, -f4);
        float f5 = f2 - f4;
        float fSqrt = 1.0f / ((float) Math.sqrt((f5 * f5) + (r4 * r4)));
        matrix.postScale(fSqrt, fSqrt);
        matrix.postRotate((float) Math.toDegrees(-Math.atan2(f5, f - f3)));
        path.transform(matrix, path2);
    }

    @Override // androidx.transition.OooO
    public final Path getPath(float f, float f2, float f3, float f4) {
        float f5 = f4 - f2;
        float fSqrt = (float) Math.sqrt((f5 * f5) + (r6 * r6));
        double dAtan2 = Math.atan2(f5, f3 - f);
        Matrix matrix = this.f66349OooO0O0;
        matrix.setScale(fSqrt, fSqrt);
        matrix.postRotate((float) Math.toDegrees(dAtan2));
        matrix.postTranslate(f, f2);
        Path path = new Path();
        this.f66348OooO00o.transform(matrix, path);
        return path;
    }
}
