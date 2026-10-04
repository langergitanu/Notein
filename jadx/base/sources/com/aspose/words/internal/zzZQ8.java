package com.aspose.words.internal;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import com.aspose.words.internal.zzZIV;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZQ8 extends Path {
    private final List<zzY> zz31;

    public static class zzY {
        private float[] zz2X;
        private byte zz2Y;

        public zzY(byte b, float... fArr) {
            this.zz2Y = b;
            float[] fArr2 = new float[fArr.length];
            this.zz2X = fArr2;
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
        }

        public final float[] zzN(float[] fArr) {
            float[] fArr2 = this.zz2X;
            System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
            return fArr;
        }

        public final float[] zzky() {
            float[] fArr = this.zz2X;
            int length = fArr.length;
            float[] fArr2 = new float[length];
            System.arraycopy(fArr, 0, fArr2, 0, length);
            return fArr2;
        }

        public final byte zzkz() {
            return this.zz2Y;
        }
    }

    public static class zzZ {
        private Iterator<zzY> zz2Z;
        private zzZIV.zzZ zz30;

        public zzZ(zzZQ8 zzzq8) {
            this.zz2Z = zzzq8.zzkE().iterator();
        }

        public final boolean hasNext() {
            return this.zz2Z.hasNext();
        }

        public final zzZIV.zzZ zzkA() {
            byte b = this.zz2Z.next().zz2Y;
            if (b == 0) {
                zzZIV.zzZ zzz = new zzZIV.zzZ(r0.zz2X[0], r0.zz2X[1]);
                this.zz30 = zzz;
                return zzz;
            }
            if (b == 1) {
                return new zzZIV.zzZ(r0.zz2X[0], r0.zz2X[1]);
            }
            if (b == 3) {
                return new zzZIV.zzZ(r0.zz2X[4], r0.zz2X[5]);
            }
            if (b == 4) {
                return this.zz30;
            }
            throw new Error("This only happens if Sun changes PathIterator");
        }
    }

    public zzZQ8() {
        this.zz31 = new ArrayList();
    }

    public static RectF zzZ(Path path, boolean z) {
        if (path == null) {
            return new RectF();
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, z);
        return rectF;
    }

    private Region zzkC() {
        RectF rectFZzZ = zzZ(this, false);
        return new Region((int) rectFZzZ.left, (int) rectFZzZ.top, (int) rectFZzZ.right, (int) rectFZzZ.bottom);
    }

    @Override // android.graphics.Path
    public final void close() {
        this.zz31.add(new zzY((byte) 4, new float[0]));
        super.close();
    }

    @Override // android.graphics.Path
    public final void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
        this.zz31.add(new zzY((byte) 3, f, f2, f3, f4, f5, f6));
        super.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // android.graphics.Path
    public final void lineTo(float f, float f2) {
        this.zz31.add(new zzY((byte) 1, f, f2));
        super.lineTo(f, f2);
    }

    @Override // android.graphics.Path
    public final void moveTo(float f, float f2) {
        this.zz31.add(new zzY((byte) 0, f, f2));
        super.moveTo(f, f2);
    }

    @Override // android.graphics.Path
    public final void reset() {
        this.zz31.clear();
        super.reset();
    }

    @Override // android.graphics.Path
    public final void set(Path path) {
        this.zz31.clear();
        super.set(path);
    }

    @Override // android.graphics.Path
    public final void transform(Matrix matrix) {
        super.transform(matrix);
        Iterator<zzY> it = this.zz31.iterator();
        while (it.hasNext()) {
            matrix.mapPoints(it.next().zz2X);
        }
    }

    public final Region zzkB() {
        Region region = new Region();
        region.setPath(this, zzkC());
        return region;
    }

    public final zzZ zzkD() {
        return new zzZ(this);
    }

    public final List<zzY> zzkE() {
        return Collections.unmodifiableList(this.zz31);
    }

    public zzZQ8(zzZQ8 zzzq8) {
        super(zzzq8);
        ArrayList arrayList = new ArrayList();
        this.zz31 = arrayList;
        arrayList.addAll(Collections.unmodifiableList(zzzq8.zz31));
    }

    public static Rect zzZ(Path path) {
        if (path == null) {
            return new Rect();
        }
        RectF rectFZzZ = zzZ(path, false);
        return new Rect((int) rectFZzZ.left, (int) rectFZzZ.top, (int) rectFZzZ.right, (int) rectFZzZ.bottom);
    }
}
