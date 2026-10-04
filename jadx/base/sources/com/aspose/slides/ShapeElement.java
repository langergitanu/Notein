package com.aspose.slides;

import android.graphics.Path;
import com.aspose.slides.internal.p472w8.C11896dy;

/* JADX INFO: loaded from: classes3.dex */
public class ShapeElement implements IShapeElement {

    /* JADX INFO: renamed from: du */
    byte f3348du;

    /* JADX INFO: renamed from: dy */
    ShapeFrame f3349dy = new ShapeFrame();

    /* JADX INFO: renamed from: h4 */
    byte f3350h4;

    /* JADX INFO: renamed from: k4 */
    Shape f3351k4;

    /* JADX INFO: renamed from: kk */
    boolean f3352kk;

    /* JADX INFO: renamed from: m9 */
    lf0 f3353m9;

    /* JADX INFO: renamed from: to */
    int f3354to;

    /* JADX INFO: renamed from: x1 */
    C11896dy f3355x1;

    public ShapeElement(Shape shape, C11896dy c11896dy, int i, boolean z, byte b, byte b2, lf0 lf0Var) {
        this.f3353m9 = null;
        this.f3351k4 = shape;
        this.f3355x1 = c11896dy;
        this.f3352kk = z;
        this.f3354to = i;
        this.f3348du = b;
        this.f3350h4 = b2;
        if (b2 == 2) {
            this.f3353m9 = lf0Var;
        }
    }

    public final byte getFillSource() {
        return this.f3348du;
    }

    @Deprecated
    public final Path getGraphicsPath() {
        return (Path) C11896dy.m55506k4(m2656k4());
    }

    public final Shape getParentShape() {
        return this.f3351k4;
    }

    public final byte getStrokeSource() {
        return this.f3350h4;
    }

    /* JADX INFO: renamed from: k4 */
    public C11896dy m2656k4() {
        return this.f3355x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m2657x1() {
        return this.f3354to;
    }
}
