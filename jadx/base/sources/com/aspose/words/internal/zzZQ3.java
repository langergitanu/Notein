package com.aspose.words.internal;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZQ3 implements Cloneable {
    private static final Region zz2Q;
    private static final zzZQ4 zz2R;
    private Region zz2S;

    static {
        zzZQ4 zzzq4 = new zzZQ4(-4194304.0f, -4194304.0f, 8388608.0f, 8388608.0f);
        zz2R = zzzq4;
        zz2Q = zz7(zzzq4);
    }

    public zzZQ3() {
        this(zz2R);
    }

    private static zzZQ4 zz6(zzZQ4 zzzq4) {
        float x = zzzq4.getX();
        float y = zzzq4.getY();
        float width = zzzq4.getWidth();
        float height = zzzq4.getHeight();
        if (height < 0.0f) {
            y += height;
            height = Math.abs(height);
        }
        if (width < 0.0f) {
            x += width;
            width = Math.abs(width);
        }
        return new zzZQ4(x, y, width, height);
    }

    private static Region zz7(zzZQ4 zzzq4) {
        zzZQ4 zzzq4Zz6 = zz6(zzzq4);
        return new Region(new Rect(Math.round(zzzq4Zz6.getX()), Math.round(zzzq4Zz6.getY()), Math.round(zzzq4Zz6.zzkw()), Math.round(zzzq4Zz6.zzZn())));
    }

    private static boolean zzZ(Rect rect, Rect rect2) {
        return rect2 != null && rect != null && rect2.width() == 32767 && rect2.height() == 32767 && rect2.left == 0 && rect2.bottom == 0 && (rect.left != 0 || rect.bottom != 0 || rect.width() > 32767 || rect.height() > 32767);
    }

    public final void close() {
        this.zz2S.setEmpty();
        this.zz2S = null;
    }

    public final void zzU(zzZQ3 zzzq3) {
        this.zz2S.op(zzzq3.zz2S, Region.Op.XOR);
    }

    public final void zzV(zzZQ3 zzzq3) {
        this.zz2S.op(zzzq3.zz2S, Region.Op.UNION);
    }

    public final void zzW(zzZQ3 zzzq3) {
        this.zz2S.op(zzzq3.zz2S, Region.Op.REVERSE_DIFFERENCE);
    }

    public final void zzX(zzZQ3 zzzq3) {
        this.zz2S.op(zzzq3.zz2S, Region.Op.DIFFERENCE);
    }

    public final void zzY(zzZQ3 zzzq3) {
        if (zzzq3 == null || zzzq3.zz2S.isEmpty()) {
            return;
        }
        this.zz2S.op(zzzq3.zz2S, Region.Op.INTERSECT);
    }

    public final Region zzkr() {
        return this.zz2S;
    }

    public final void zzks() {
        this.zz2S = zz7(zz2R);
    }

    public final void zzkt() {
        this.zz2S.setEmpty();
    }

    public zzZQ3(zzZQ4 zzzq4) {
        this.zz2S = zz7(zzzq4);
    }

    public zzZQ3(Path path) {
        Rect rectZzZ = zzZQ8.zzZ(path);
        Region region = new Region(rectZzZ);
        Region region2 = new Region();
        this.zz2S = region2;
        region2.setPath(path, region);
        if (zzZ(rectZzZ, this.zz2S.getBounds())) {
            this.zz2S.set(rectZzZ.left, rectZzZ.top, rectZzZ.right, rectZzZ.bottom);
        }
    }
}
