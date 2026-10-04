package o0O0O00;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;

/* JADX INFO: renamed from: o0O0O00.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25868OooOooo extends Canvas {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Canvas f88252OooO00o;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(path, "path");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.clipOutPath(path);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rect) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(rect, "rect");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.clipOutRect(rect);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(path, "path");
        kotlin.jvm.internal.OooOOO0.OooO0oO(op, "op");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rect, Region.Op op) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(rect, "rect");
        kotlin.jvm.internal.OooOOO0.OooO0oO(op, "op");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.disableZ();
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i, int i2, int i3, int i4) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawARGB(i, i2, i3, i4);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF oval, float f, float f2, boolean z, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oval, "oval");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawArc(oval, f, f2, z, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bitmap, "bitmap");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f, f2, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i, int i2, float[] verts, int i3, int[] iArr, int i4, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bitmap, "bitmap");
        kotlin.jvm.internal.OooOOO0.OooO0oO(verts, "verts");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i, i2, verts, i3, iArr, i4, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f, float f2, float f3, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawCircle(f, f2, f3, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawColor(i);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF outer, float f, float f2, RectF inner, float f3, float f4, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(outer, "outer");
        kotlin.jvm.internal.OooOOO0.OooO0oO(inner, "inner");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawDoubleRoundRect(outer, f, f2, inner, f3, f4, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] glyphIds, int i, float[] positions, int i2, int i3, Font font, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(glyphIds, "glyphIds");
        kotlin.jvm.internal.OooOOO0.OooO0oO(positions, "positions");
        kotlin.jvm.internal.OooOOO0.OooO0oO(font, "font");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawGlyphs(glyphIds, i, positions, i2, i3, font, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f, float f2, float f3, float f4, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawLine(f, f2, f3, f4, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] pts, int i, int i2, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(pts, "pts");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawLines(pts, i, i2, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF oval, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oval, "oval");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawOval(oval, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch patch, Rect dst, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(patch, "patch");
        kotlin.jvm.internal.OooOOO0.OooO0oO(dst, "dst");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawPatch(patch, dst, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(path, "path");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(picture, "picture");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f, float f2, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawPoint(f, f2, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i, int i2, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawPoints(fArr, i, i2, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] text, int i, int i2, float[] pos, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pos, "pos");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawPosText(text, i, i2, pos, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i, int i2, int i3) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawRGB(i, i2, i3);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rect, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(rect, "rect");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(renderNode, "renderNode");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawRenderNode(renderNode);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rect, float f, float f2, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(rect, "rect");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawRoundRect(rect, f, f2, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] text, int i, int i2, float f, float f2, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawText(text, i, i2, f, f2, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] text, int i, int i2, Path path, float f, float f2, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        kotlin.jvm.internal.OooOOO0.OooO0oO(path, "path");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawTextOnPath(text, i, i2, path, f, f2, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] text, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawTextRun(text, i, i2, i3, i4, f, f2, z, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode mode, int i, float[] verts, int i2, float[] fArr, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(mode, "mode");
        kotlin.jvm.internal.OooOOO0.OooO0oO(verts, "verts");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawVertices(mode, i, verts, i2, fArr, i3, iArr, i4, sArr, i5, i6, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.enableZ();
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect bounds) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bounds, "bounds");
        Canvas canvas = this.f88252OooO00o;
        if (canvas == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
        boolean clipBounds = canvas.getClipBounds(bounds);
        if (clipBounds) {
            bounds.set(0, 0, bounds.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.getDensity();
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.getHeight();
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix ctm) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(ctm, "ctm");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.getMatrix(ctm);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.getWidth();
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rect, Canvas.EdgeType type) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(rect, "rect");
        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.quickReject(rect, type);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.restore();
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.restoreToCount(i);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.rotate(f);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.save();
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i, int i2) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i, i2);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f, float f2) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.scale(f, f2);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.setDensity(i);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void skew(float f, float f2) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.skew(f, f2);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void translate(float f, float f2) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.translate(f, f2);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(rect, "rect");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.clipOutRect(rect);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(path, "path");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(rect, "rect");
        kotlin.jvm.internal.OooOOO0.OooO0oO(op, "op");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawArc(f, f2, f3, f4, f5, f6, z, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF dst, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bitmap, "bitmap");
        kotlin.jvm.internal.OooOOO0.OooO0oO(dst, "dst");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, dst, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawColor(j);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF outer, float[] outerRadii, RectF inner, float[] innerRadii, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(outer, "outer");
        kotlin.jvm.internal.OooOOO0.OooO0oO(outerRadii, "outerRadii");
        kotlin.jvm.internal.OooOOO0.OooO0oO(inner, "inner");
        kotlin.jvm.internal.OooOOO0.OooO0oO(innerRadii, "innerRadii");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawDoubleRoundRect(outer, outerRadii, inner, innerRadii, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] pts, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(pts, "pts");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawLines(pts, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawOval(f, f2, f3, f4, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch patch, RectF dst, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(patch, "patch");
        kotlin.jvm.internal.OooOOO0.OooO0oO(dst, "dst");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawPatch(patch, dst, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF dst) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(picture, "picture");
        kotlin.jvm.internal.OooOOO0.OooO0oO(dst, "dst");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawPicture(picture, dst);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] pts, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(pts, "pts");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawPoints(pts, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String text, float[] pos, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pos, "pos");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawPosText(text, pos, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect r, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(r, "r");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawRect(r, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawRoundRect(f, f2, f3, f4, f5, f6, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String text, float f, float f2, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawText(text, f, f2, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String text, Path path, float f, float f2, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        kotlin.jvm.internal.OooOOO0.OooO0oO(path, "path");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawTextOnPath(text, path, f, f2, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence text, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawTextRun(text, i, i2, i3, i4, f, f2, z, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rect) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(rect, "rect");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.quickReject(rect);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f, float f2, float f3, float f4) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.clipOutRect(f, f2, f3, f4);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rect) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(rect, "rect");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect dst, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bitmap, "bitmap");
        kotlin.jvm.internal.OooOOO0.OooO0oO(dst, "dst");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, dst, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, PorterDuff.Mode mode) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(mode, "mode");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawColor(i, mode);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect dst) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(picture, "picture");
        kotlin.jvm.internal.OooOOO0.OooO0oO(dst, "dst");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawPicture(picture, dst);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawRect(f, f2, f3, f4, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String text, int i, int i2, float f, float f2, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawText(text, i, i2, f, f2, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText text, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawTextRun(text, i, i2, i3, i4, f, f2, z, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType type) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(path, "path");
        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.quickReject(path, type);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint, int i) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.saveLayer(f, f2, f3, f4, paint, i);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i, i2);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i, int i2, int i3, int i4) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.clipOutRect(i, i2, i3, i4);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(rect, "rect");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] colors, int i, int i2, float f, float f2, int i3, int i4, boolean z, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(colors, "colors");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawBitmap(colors, i, i2, f, f2, i3, i4, z, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, BlendMode mode) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(mode, "mode");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawColor(i, mode);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence text, int i, int i2, float f, float f2, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawText(text, i, i2, f, f2, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(path, "path");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.quickReject(path);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.saveLayer(f, f2, f3, f4, paint);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f2, float f3, float f4, Region.Op op) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(op, "op");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.clipRect(f, f2, f3, f4, op);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] colors, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(colors, "colors");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawBitmap(colors, i, i2, i3, i4, i5, i6, z, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j, BlendMode mode) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(mode, "mode");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawColor(j, mode);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f2, float f3, float f4, Canvas.EdgeType type) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.quickReject(f, f2, f3, f4, type);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f2, float f3, float f4) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.clipRect(f, f2, f3, f4);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bitmap, "bitmap");
        kotlin.jvm.internal.OooOOO0.OooO0oO(matrix, "matrix");
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f2, float f3, float f4) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.quickReject(f, f2, f3, f4);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i, int i2, int i3, int i4) {
        Canvas canvas = this.f88252OooO00o;
        if (canvas != null) {
            return canvas.clipRect(i, i2, i3, i4);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("nativeCanvas");
        throw null;
    }
}
