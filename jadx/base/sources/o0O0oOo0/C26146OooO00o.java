package o0O0oOo0;

import Oooo0oO.o0Oo0oo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.view.ViewCompat;
import com.aspose.slides.internal.p332p7.OooOOOO;
import com.orion.ni_render_engine.impl.ink.C22840OooO0Oo;
import com.orion.ni_render_engine.impl.ink.C22841OooO0o0;
import com.orion.ni_render_engine.impl.ink.OooO0o;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32444OooOOO0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.OooOOO;

/* JADX INFO: renamed from: o0O0oOo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26146OooO00o implements o0O0oo00.OooO00o<C26148OooO0OO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o0O0oo00.OooO0O0<C26148OooO0OO> f89210OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public List<Float> f89212OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f89214OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public RectF f89215OooO0o0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f89211OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final PointF f89213OooO0Oo = new PointF(0.0f, 0.0f);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f89216OooO0oO = ViewCompat.MEASURED_STATE_MASK;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f89217OooO0oo = 1.0f;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f89209OooO = -1;

    public static void Oooo000(C26146OooO00o c26146OooO00o) {
        long j = c26146OooO00o.f89211OooO0O0;
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O0 = c26146OooO00o.f89210OooO00o;
        String str = null;
        if (oooO0O0 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C26148OooO0OO target = oooO0O0.getTarget();
        int i = c26146OooO00o.f89214OooO0o;
        PdfiumCore pdfiumCore = target.f89223OooO00o;
        if (i != 0) {
            if (i != 1) {
                C34406OooO00o.f123390OooO00o.OooO0OO(C21532OooOOo.OooO0OO(i, "unknown style: "), new Object[0]);
            } else {
                pdfiumCore.setFillColor(j, c26146OooO00o.f89216OooO0oO);
                pdfiumCore.setPathDrawMode(j, 1, 0);
            }
        } else if (c26146OooO00o.f89215OooO0o0 != null) {
            pdfiumCore.setFillColor(j, c26146OooO00o.f89216OooO0oO);
            pdfiumCore.setPathDrawMode(j, 1, 0);
        } else {
            pdfiumCore.setStrokeColor(j, c26146OooO00o.f89216OooO0oO);
            pdfiumCore.setStrokeWidth(j, c26146OooO00o.f89217OooO0oo);
            pdfiumCore.setPathDrawMode(j, 0, 1);
        }
        int i2 = c26146OooO00o.f89209OooO;
        if (i2 != -1) {
            if (i2 != 13) {
                throw new C32444OooOOO0(o0Oo0oo.OooO0O0(i2, "mode ", " not implemented in PdfBoxRenderEngine"));
            }
            str = "Multiply";
        }
        if (str != null) {
            pdfiumCore.setBlendMode(j, str);
        }
    }

    @Override // o0O0oo00.OooO00o
    public final void OooO(float f) {
        this.f89217OooO0oo = f;
        Oooo000(this);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooO00o(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.f89211OooO0O0 == -1) {
            C34406OooO00o.f123390OooO00o.OooO0OO("path is not created", new Object[0]);
            return;
        }
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O0 = this.f89210OooO00o;
        if (oooO0O0 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C26148OooO0OO target = oooO0O0.getTarget();
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O02 = this.f89210OooO00o;
        if (oooO0O02 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        float fFloatValue = oooO0O02.getSize().f116637OooOo.floatValue();
        float f7 = fFloatValue - f6;
        target.f89223OooO00o.pathCubicTo(this.f89211OooO0O0, f, fFloatValue - f2, f3, fFloatValue - f4, f5, f7);
        this.f89213OooO0Oo.set(f5, f7);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooO0O0(float f, float f2, float f3, float f4) {
        if (this.f89211OooO0O0 == -1) {
            C34406OooO00o.f123390OooO00o.OooO0OO("path is not created", new Object[0]);
            return;
        }
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O0 = this.f89210OooO00o;
        if (oooO0O0 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C26148OooO0OO target = oooO0O0.getTarget();
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O02 = this.f89210OooO00o;
        if (oooO0O02 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        float fFloatValue = oooO0O02.getSize().f116637OooOo.floatValue();
        PointF pointF = this.f89213OooO0Oo;
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        PointF pointF3 = new PointF(f, fFloatValue - f2);
        float f5 = fFloatValue - f4;
        PointF pointF4 = new PointF(f3, f5);
        new PointF(pointF2.x, pointF2.y);
        float f6 = pointF2.x;
        float fOooO0O0 = OooOO0.OooO0OO.OooO0O0(pointF3.x, f6, 0.6666667f, f6);
        float f7 = pointF2.y;
        PointF pointF5 = new PointF(fOooO0O0, OooOO0.OooO0OO.OooO0O0(pointF3.y, f7, 0.6666667f, f7));
        float f8 = pointF4.x;
        float fOooO0O02 = OooOO0.OooO0OO.OooO0O0(pointF3.x, f8, 0.6666667f, f8);
        float f9 = pointF4.y;
        PointF pointF6 = new PointF(fOooO0O02, OooOO0.OooO0OO.OooO0O0(pointF3.y, f9, 0.6666667f, f9));
        PointF pointF7 = new PointF(pointF4.x, pointF4.y);
        target.f89223OooO00o.pathCubicTo(this.f89211OooO0O0, pointF5.x, pointF5.y, pointF6.x, pointF6.y, pointF7.x, pointF7.y);
        pointF.set(f3, f5);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooO0OO() {
    }

    @Override // o0O0oo00.OooO00o
    public final void OooO0Oo() {
    }

    @Override // o0O0oo00.OooO00o
    public final void OooO0o(RectF bounds, Paint paint) {
        OooOOO0.OooO0oO(bounds, "bounds");
        OooOOO0.OooO0oO(paint, "paint");
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O0 = this.f89210OooO00o;
        if (oooO0O0 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C26148OooO0OO target = oooO0O0.getTarget();
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O02 = this.f89210OooO00o;
        if (oooO0O02 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C26148OooO0OO target2 = oooO0O02.getTarget();
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O03 = this.f89210OooO00o;
        if (oooO0O03 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C26148OooO0OO target3 = oooO0O03.getTarget();
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O04 = this.f89210OooO00o;
        if (oooO0O04 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        float fFloatValue = oooO0O04.getSize().f116638OooOo0o.floatValue();
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O05 = this.f89210OooO00o;
        if (oooO0O05 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        float fFloatValue2 = oooO0O05.getSize().f116637OooOo.floatValue();
        PdfiumCore pdfiumCore = target.f89223OooO00o;
        PdfDocument pdfDocument = target2.f89224OooO0O0;
        int i = target3.f89225OooO0OO;
        int rotation = pdfiumCore.getRotation(pdfDocument, i);
        if (rotation != 1 && rotation != 3) {
            fFloatValue = fFloatValue2;
        }
        long jCreateRect = pdfiumCore.createRect(bounds.left, fFloatValue - bounds.top, bounds.right, fFloatValue - bounds.bottom);
        pdfiumCore.setFillColor(jCreateRect, paint.getColor());
        pdfiumCore.setPathDrawMode(jCreateRect, 1, 0);
        pdfiumCore.pageInsertObject(pdfDocument, i, jCreateRect);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooO0o0() {
    }

    @Override // o0O0oo00.OooO00o
    public final void OooO0oO(float f) {
    }

    @Override // o0O0oo00.OooO00o
    public final void OooO0oo(float[] fArr) {
        this.f89212OooO0OO = OooOOO.OoooO0O(fArr);
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O0 = this.f89210OooO00o;
        if (oooO0O0 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C26148OooO0OO target = oooO0O0.getTarget();
        target.f89223OooO00o.setDashPattern(this.f89211OooO0O0, fArr, 0.0f);
        Oooo000(this);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOO0(RectF rectF) {
        this.f89215OooO0o0 = rectF;
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOO0O(int i) {
        this.f89216OooO0oO = i;
        Oooo000(this);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOO0o(androidx.ink.strokes.OooOOO0 oooOOO0, Matrix matrix, o0O0oo00.OooO0OO oooO0OO) {
        OooOooO(oooOOO0, matrix, oooO0OO, null);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOOO(float f, float f2) {
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOOO0(float f) {
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOOOO(float f) {
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O0 = this.f89210OooO00o;
        if (oooO0O0 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C26148OooO0OO target = oooO0O0.getTarget();
        OooOooo(this.f89211OooO0O0);
        int i = this.f89214OooO0o;
        PdfiumCore pdfiumCore = target.f89223OooO00o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(this.f89214OooO0o, "unknown style: "));
            }
            pdfiumCore.pathClose(this.f89211OooO0O0);
            pdfiumCore.setPathDrawMode(this.f89211OooO0O0, 2, 0);
        } else if (this.f89215OooO0o0 != null) {
            pdfiumCore.setPathDrawMode(this.f89211OooO0O0, 2, 0);
        } else {
            pdfiumCore.setPathDrawMode(this.f89211OooO0O0, 0, 1);
        }
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O02 = this.f89210OooO00o;
        if (oooO0O02 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C26148OooO0OO target2 = oooO0O02.getTarget();
        pdfiumCore.pageInsertObject(target2.f89226OooO0Oo, this.f89211OooO0O0);
        long jCreatePath = pdfiumCore.createPath(0.0f, 0.0f);
        this.f89211OooO0O0 = jCreatePath;
        pdfiumCore.setLineCap(jCreatePath, 1);
        pdfiumCore.setLineJoin(this.f89211OooO0O0, 1);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOOOo(float f, float f2, float f3) {
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O0 = this.f89210OooO00o;
        if (oooO0O0 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        float fFloatValue = oooO0O0.getSize().f116637OooOo.floatValue();
        Float fValueOf = Float.valueOf(f);
        Float fValueOf2 = Float.valueOf(fFloatValue - f2);
        float fFloatValue2 = fValueOf.floatValue();
        float fFloatValue3 = fValueOf2.floatValue();
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O02 = this.f89210OooO00o;
        if (oooO0O02 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C26148OooO0OO target = oooO0O02.getTarget();
        long j = this.f89211OooO0O0;
        float f4 = fFloatValue2 - f3;
        PdfiumCore pdfiumCore = target.f89223OooO00o;
        pdfiumCore.pathMoveTo(j, f4, fFloatValue3);
        float f5 = 0.5522848f * f3;
        float f6 = fFloatValue3 + f5;
        float f7 = fFloatValue2 - f5;
        float f8 = fFloatValue3 + f3;
        pdfiumCore.pathCubicTo(this.f89211OooO0O0, f4, f6, f7, f8, fFloatValue2, f8);
        float f9 = fFloatValue2 + f5;
        float f10 = fFloatValue2 + f3;
        pdfiumCore.pathCubicTo(this.f89211OooO0O0, f9, f8, f10, f6, f10, fFloatValue3);
        float f11 = fFloatValue3 - f5;
        float f12 = fFloatValue3 - f3;
        pdfiumCore.pathCubicTo(this.f89211OooO0O0, f10, f11, f9, f12, fFloatValue2, f12);
        pdfiumCore.pathCubicTo(this.f89211OooO0O0, f7, f12, f4, f11, f4, fFloatValue3);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOOo() {
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOOo0(float f, int i, int i2, int i3, boolean z) {
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O0 = this.f89210OooO00o;
        if (oooO0O0 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C26148OooO0OO target = oooO0O0.getTarget();
        if (this.f89211OooO0O0 == -1) {
            PdfiumCore pdfiumCore = target.f89223OooO00o;
            long jCreatePath = pdfiumCore.createPath(0.0f, 0.0f);
            this.f89211OooO0O0 = jCreatePath;
            pdfiumCore.setLineCap(jCreatePath, 1);
            pdfiumCore.setLineJoin(this.f89211OooO0O0, 1);
        }
        this.f89216OooO0oO = i;
        this.f89217OooO0oo = f;
        this.f89214OooO0o = i2;
        Oooo000(this);
        this.f89209OooO = i3;
        this.f89215OooO0o0 = null;
        Oooo000(this);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOOoo(RectF rect) {
        OooOOO0.OooO0oO(rect, "rect");
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O0 = this.f89210OooO00o;
        if (oooO0O0 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        float fFloatValue = oooO0O0.getSize().f116637OooOo.floatValue();
        float f = rect.left;
        float fHeight = (fFloatValue - rect.top) - rect.height();
        float fWidth = rect.width() + f;
        float fHeight2 = rect.height() + fHeight;
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O02 = this.f89210OooO00o;
        if (oooO0O02 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C26148OooO0OO target = oooO0O02.getTarget();
        long j = this.f89211OooO0O0;
        PdfiumCore pdfiumCore = target.f89223OooO00o;
        pdfiumCore.pathMoveTo(j, f, fHeight);
        pdfiumCore.pathLineTo(this.f89211OooO0O0, f, fHeight2);
        pdfiumCore.pathLineTo(this.f89211OooO0O0, fWidth, fHeight2);
        pdfiumCore.pathLineTo(this.f89211OooO0O0, fWidth, fHeight);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOo(int i) {
        this.f89214OooO0o = i;
        Oooo000(this);
        Oooo000(this);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOo0(int i) {
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O0 = this.f89210OooO00o;
        if (oooO0O0 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C26148OooO0OO target = oooO0O0.getTarget();
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O02 = this.f89210OooO00o;
        if (oooO0O02 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C26148OooO0OO target2 = oooO0O02.getTarget();
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O03 = this.f89210OooO00o;
        if (oooO0O03 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C26148OooO0OO target3 = oooO0O03.getTarget();
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O04 = this.f89210OooO00o;
        if (oooO0O04 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C32443OooOOO<Float, Float> size = oooO0O04.getSize();
        float fFloatValue = size.f116638OooOo0o.floatValue();
        float fFloatValue2 = size.f116637OooOo.floatValue();
        PdfiumCore pdfiumCore = target.f89223OooO00o;
        long jCreateRect = pdfiumCore.createRect(0.0f, fFloatValue2, fFloatValue, 0.0f);
        pdfiumCore.setFillColor(jCreateRect, i);
        pdfiumCore.setPathDrawMode(jCreateRect, 1, 0);
        pdfiumCore.pageInsertObject(target2.f89224OooO0O0, target3.f89225OooO0OO, jCreateRect);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOo00(o0O0oo00.OooO0O0<C26148OooO0OO> target) {
        OooOOO0.OooO0oO(target, "target");
        this.f89210OooO00o = target;
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOo0O(String text, float f, float f2, float f3) {
        OooOOO0.OooO0oO(text, "text");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("PdfiumEngine");
        c20358OooO00o.OooO0OO("Not implemented yet", new Object[0]);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOo0o(Bitmap bitmap, RectF bounds, float f) {
        OooOOO0.OooO0oO(bitmap, "bitmap");
        OooOOO0.OooO0oO(bounds, "bounds");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("PdfiumEngine");
        c20358OooO00o.OooO00o("draw image: " + bitmap + ", bounds: " + bounds + ", rotation: " + f, new Object[0]);
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O0 = this.f89210OooO00o;
        if (oooO0O0 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        PdfiumCore pdfiumCore = oooO0O0.getTarget().f89223OooO00o;
        Bitmap bitmapReverseBitmapByteOrder = pdfiumCore.reverseBitmapByteOrder(bitmap);
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O02 = this.f89210OooO00o;
        if (oooO0O02 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C26148OooO0OO target = oooO0O02.getTarget();
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O03 = this.f89210OooO00o;
        if (oooO0O03 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C26148OooO0OO target2 = oooO0O03.getTarget();
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O04 = this.f89210OooO00o;
        if (oooO0O04 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        float fFloatValue = oooO0O04.getSize().f116637OooOo.floatValue();
        float f2 = bounds.left;
        float f3 = fFloatValue - bounds.top;
        float f4 = bounds.right;
        float f5 = fFloatValue - bounds.bottom;
        PdfDocument pdfDocument = target.f89224OooO0O0;
        int i = target2.f89225OooO0OO;
        long jCreateImg = pdfiumCore.createImg(pdfDocument, i, bitmapReverseBitmapByteOrder, f2, f3, f4, f5, f);
        OooOooo(jCreateImg);
        pdfiumCore.pageInsertObject(pdfDocument, i, jCreateImg);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOoO(RectF rectF, float f) {
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O0 = this.f89210OooO00o;
        if (oooO0O0 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        float fFloatValue = oooO0O0.getSize().f116637OooOo.floatValue();
        float f2 = rectF.left;
        float fHeight = (fFloatValue - rectF.top) - rectF.height();
        float fWidth = rectF.width() + f2;
        float fHeight2 = rectF.height() + fHeight;
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O02 = this.f89210OooO00o;
        if (oooO0O02 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C26148OooO0OO target = oooO0O02.getTarget();
        target.f89223OooO00o.createEllipse(this.f89211OooO0O0, f2, fHeight2, fWidth, fHeight, f);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOoO0(int i) {
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOoOO(CornerPathEffect cornerPathEffect) {
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOoo() {
        throw new C32444OooOOO0("An operation is not implemented: Not yet implemented");
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOoo0(float f, float f2, RectF rectF) {
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O0 = this.f89210OooO00o;
        if (oooO0O0 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        float fFloatValue = oooO0O0.getSize().f116637OooOo.floatValue();
        float f3 = rectF.left;
        float fHeight = (fFloatValue - rectF.top) - rectF.height();
        float fWidth = rectF.width() + f3;
        float fHeight2 = rectF.height() + fHeight;
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O02 = this.f89210OooO00o;
        if (oooO0O02 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C26148OooO0OO target = oooO0O02.getTarget();
        target.f89223OooO00o.createRoundRect(this.f89211OooO0O0, f3, fHeight2, fWidth, fHeight, f, f2, 0.0f);
    }

    public final void OooOooO(androidx.ink.strokes.OooOOO0 stroke, Matrix matrix, o0O0oo00.OooO0OO oooO0OO, Map<String, Float> map) {
        boolean z;
        RectF rectF;
        OooOOO0.OooO0oO(stroke, "stroke");
        com.orion.ni_render_engine.impl.ink.OooO00o oooO00o = C22840OooO0Oo.f69449OooO00o;
        synchronized (C22841OooO0o0.f69452OooO0O0) {
            ArrayList arrayList = C22841OooO0o0.f69451OooO00o;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((OooO0o) it.next()).OooO00o(stroke)) {
                        z = true;
                        break;
                    }
                }
                z = false;
            } else {
                z = false;
            }
        }
        if (z) {
            try {
                C22840OooO0Oo.OooO00o(this, stroke, matrix, map);
                return;
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("PdfiumEngine");
                c20358OooO00o.OooO0Oo(e, "PDF 矢量渲染异常，笔画可能不完整", new Object[0]);
                return;
            }
        }
        androidx.ink.geometry.OooO0o oooO0oOooO00o = stroke.f65489OooO0Oo.OooO00o();
        Bitmap bitmapCreateBitmap = null;
        if (oooO0oOooO00o == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("PdfiumEngine");
            c20358OooO00o2.OooO0OO("无法计算笔画边界", new Object[0]);
            rectF = null;
        } else {
            rectF = new RectF(oooO0oOooO00o.getF65374OooO00o(), oooO0oOooO00o.getF65375OooO0O0(), oooO0oOooO00o.getF65376OooO0OO(), oooO0oOooO00o.getF65377OooO0Oo());
            matrix.mapRect(rectF);
        }
        if (rectF == null) {
            return;
        }
        Matrix matrix2 = new Matrix(matrix);
        matrix2.postTranslate(-rectF.left, -rectF.top);
        matrix2.postScale(4.0f, 4.0f);
        Integer numValueOf = Integer.valueOf(((int) Math.ceil(rectF.width())) * 4);
        Integer numValueOf2 = Integer.valueOf(((int) Math.ceil(rectF.height())) * 4);
        int iIntValue = numValueOf.intValue();
        int iIntValue2 = numValueOf2.intValue();
        if (iIntValue <= 0 || iIntValue2 <= 0) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            StringBuilder sbOooO00o = OooOOOO.OooO00o(c20358OooO00o3, "PdfiumEngine", "无效的位图尺寸: ", iIntValue, " x ");
            sbOooO00o.append(iIntValue2);
            c20358OooO00o3.OooO0OO(sbOooO00o.toString(), new Object[0]);
        } else if (Build.VERSION.SDK_INT >= 29) {
            Picture picture = new Picture();
            Canvas canvasBeginRecording = picture.beginRecording(iIntValue, iIntValue2);
            OooOOO0.OooO0o(canvasBeginRecording, "beginRecording(...)");
            com.orion.ni_render_engine.impl.ink.OooO00o oooO00o2 = C22840OooO0Oo.f69449OooO00o;
            C22840OooO0Oo.OooO0O0(canvasBeginRecording, stroke, matrix2, o0O0oo00.OooO0OO.f89537OooOoO0);
            picture.endRecording();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            bitmapCreateBitmap = Bitmap.createBitmap(picture, iIntValue, iIntValue2, Bitmap.Config.ARGB_8888);
            OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iIntValue, iIntValue2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap2);
            com.orion.ni_render_engine.impl.ink.OooO00o oooO00o3 = C22840OooO0Oo.f69449OooO00o;
            C22840OooO0Oo.OooO0O0(canvas, stroke, matrix2, o0O0oo00.OooO0OO.f89535OooOo0o);
            canvas.setBitmap(null);
            bitmapCreateBitmap = bitmapCreateBitmap2;
        }
        if (bitmapCreateBitmap != null) {
            OooOo0o(bitmapCreateBitmap, rectF, 0.0f);
        }
    }

    public final void OooOooo(long j) {
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O0 = this.f89210OooO00o;
        if (oooO0O0 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C26148OooO0OO target = oooO0O0.getTarget();
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O02 = this.f89210OooO00o;
        if (oooO0O02 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C26148OooO0OO target2 = oooO0O02.getTarget();
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O03 = this.f89210OooO00o;
        if (oooO0O03 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C26148OooO0OO target3 = oooO0O03.getTarget();
        PdfiumCore pdfiumCore = target.f89223OooO00o;
        int rotation = pdfiumCore.getRotation(target2.f89224OooO0O0, target3.f89225OooO0OO);
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O04 = this.f89210OooO00o;
        if (oooO0O04 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C32443OooOOO<Float, Float> size = oooO0O04.getSize();
        float fFloatValue = size.f116638OooOo0o.floatValue();
        float fFloatValue2 = size.f116637OooOo.floatValue();
        if (rotation == 1) {
            C34406OooO00o.f123390OooO00o.OooO00o("rotate 90", new Object[0]);
            Matrix matrix = new Matrix();
            matrix.postRotate(90.0f);
            matrix.postTranslate(fFloatValue2, 0.0f);
            pdfiumCore.setTransform(j, matrix);
            return;
        }
        if (rotation == 2) {
            Matrix matrix2 = new Matrix();
            matrix2.postRotate(180.0f);
            matrix2.postTranslate(fFloatValue, fFloatValue2);
            pdfiumCore.setTransform(j, matrix2);
            return;
        }
        if (rotation != 3) {
            return;
        }
        Matrix matrix3 = new Matrix();
        matrix3.postRotate(270.0f);
        matrix3.postTranslate(0.0f, fFloatValue);
        pdfiumCore.setTransform(j, matrix3);
    }

    @Override // o0O0oo00.OooO00o
    public final int getStyle() {
        return this.f89214OooO0o;
    }

    @Override // o0O0oo00.OooO00o
    public final float getWidth() {
        return this.f89217OooO0oo;
    }

    @Override // o0O0oo00.OooO00o
    public final void lineTo(float f, float f2) {
        int i = 0;
        if (this.f89211OooO0O0 == -1) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PdfiumEngine");
            c20358OooO00o.OooO0OO("path is not created", new Object[0]);
            return;
        }
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O0 = this.f89210OooO00o;
        if (oooO0O0 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C26148OooO0OO target = oooO0O0.getTarget();
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O02 = this.f89210OooO00o;
        if (oooO0O02 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        float fFloatValue = oooO0O02.getSize().f116637OooOo.floatValue() - f2;
        RectF rectF = this.f89215OooO0o0;
        PointF pointF = this.f89213OooO0Oo;
        PdfiumCore pdfiumCore = target.f89223OooO00o;
        if (rectF == null) {
            pdfiumCore.pathLineTo(this.f89211OooO0O0, f, fFloatValue);
            pointF.set(f, fFloatValue);
            return;
        }
        PointF pointF2 = new PointF(f, fFloatValue);
        OooOOO0.OooO0oO(pointF, "<this>");
        float f3 = pointF.x - pointF2.x;
        float fSqrt = (float) Math.sqrt(OooOO0.OooO0OO.OooO00o(pointF.y, pointF2.y, f3 * f3));
        PointF pointF3 = new PointF((pointF2.x - pointF.x) / fSqrt, (pointF2.y - pointF.y) / fSqrt);
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O03 = this.f89210OooO00o;
        if (oooO0O03 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C32443OooOOO<Float, Float> size = oooO0O03.getSize();
        int iMax = ((int) (fSqrt / Math.max(0.1f, Math.min(size.f116638OooOo0o.floatValue(), size.f116637OooOo.floatValue()) * 8.064516E-4f))) + 1;
        float f4 = fSqrt / iMax;
        if (iMax >= 0) {
            while (true) {
                float f5 = i * f4;
                float f6 = (pointF3.x * f5) + pointF.x;
                float f7 = (pointF3.y * f5) + pointF.y;
                float f8 = 2;
                float fWidth = f6 - (rectF.width() / f8);
                float fHeight = f7 - (rectF.height() / f8);
                float fWidth2 = rectF.width() + fWidth;
                float fHeight2 = rectF.height() + fHeight;
                pdfiumCore.pathMoveTo(this.f89211OooO0O0, fWidth, fHeight);
                pdfiumCore.pathLineTo(this.f89211OooO0O0, fWidth, fHeight2);
                pdfiumCore.pathLineTo(this.f89211OooO0O0, fWidth2, fHeight2);
                pdfiumCore.pathLineTo(this.f89211OooO0O0, fWidth2, fHeight);
                if (i == iMax) {
                    break;
                } else {
                    i++;
                }
            }
        }
        pdfiumCore.pathMoveTo(this.f89211OooO0O0, f, fFloatValue);
        pointF.set(f, fFloatValue);
    }

    @Override // o0O0oo00.OooO00o
    public final void moveTo(float f, float f2) {
        if (this.f89211OooO0O0 == -1) {
            C34406OooO00o.f123390OooO00o.OooO0OO("path is not created", new Object[0]);
            return;
        }
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O0 = this.f89210OooO00o;
        if (oooO0O0 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        C26148OooO0OO target = oooO0O0.getTarget();
        o0O0oo00.OooO0O0<C26148OooO0OO> oooO0O02 = this.f89210OooO00o;
        if (oooO0O02 == null) {
            OooOOO0.OooOOOO("target");
            throw null;
        }
        float fFloatValue = oooO0O02.getSize().f116637OooOo.floatValue();
        float f3 = fFloatValue - f2;
        target.f89223OooO00o.pathMoveTo(this.f89211OooO0O0, f, f3);
        this.f89213OooO0Oo.set(f, f3);
    }

    @Override // o0O0oo00.OooO00o
    public final void reset() {
    }
}
