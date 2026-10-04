package com.orion.penkit.models.pencil;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO0O00oo.OooOO0;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 :2\u00020\u0001:\u0001:B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010$\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u00002\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010'J$\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010'R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u00109¨\u0006;"}, m80612d2 = {"Lcom/orion/penkit/models/pencil/StrokeSegment;", "", "Lcom/orion/penkit/models/pencil/Circle;", "c0", "c1", "<init>", "(Lcom/orion/penkit/models/pencil/Circle;Lcom/orion/penkit/models/pencil/Circle;)V", "", "radius", "", "radiusToAlpha", "(F)I", "Landroid/graphics/Path;", "path", "circle", "Landroid/graphics/PointF;", "startPoint", "endPoint", "LoO00ooO/OooOooO;", "addArcSegment", "(Landroid/graphics/Path;Lcom/orion/penkit/models/pencil/Circle;Landroid/graphics/PointF;Landroid/graphics/PointF;)V", "point", "calculateAngle", "(Lcom/orion/penkit/models/pencil/Circle;Landroid/graphics/PointF;)F", "startAngle", "endAngle", "calculateSweepAngle", "(FF)F", "", "calculateOuterTangentPoints", "(Lcom/orion/penkit/models/pencil/Circle;Lcom/orion/penkit/models/pencil/Circle;)Ljava/util/List;", "Landroid/graphics/Canvas;", "canvas", "prevStroke", "Landroid/graphics/Paint;", "paint", "onDraw", "(Landroid/graphics/Canvas;Lcom/orion/penkit/models/pencil/StrokeSegment;Landroid/graphics/Paint;)V", "component1", "()Lcom/orion/penkit/models/pencil/Circle;", "component2", "copy", "(Lcom/orion/penkit/models/pencil/Circle;Lcom/orion/penkit/models/pencil/Circle;)Lcom/orion/penkit/models/pencil/StrokeSegment;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/orion/penkit/models/pencil/Circle;", "getC0", "getC1", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "Companion", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class StrokeSegment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int baseColor;
    private static final BitmapShader bitmapShader;
    private static final Paint defaultPaint;
    private static final Bitmap texture;
    private final Circle c0;
    private final Circle c1;
    private final Path path;

    @Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m80612d2 = {"Lcom/orion/penkit/models/pencil/StrokeSegment$Companion;", "", "<init>", "()V", "baseColor", "", "getBaseColor", "()I", "defaultPaint", "Landroid/graphics/Paint;", "getDefaultPaint", "()Landroid/graphics/Paint;", "texture", "Landroid/graphics/Bitmap;", "getTexture", "()Landroid/graphics/Bitmap;", "bitmapShader", "Landroid/graphics/BitmapShader;", "getBitmapShader", "()Landroid/graphics/BitmapShader;", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final int getBaseColor() {
            return StrokeSegment.baseColor;
        }

        public final BitmapShader getBitmapShader() {
            return StrokeSegment.bitmapShader;
        }

        public final Paint getDefaultPaint() {
            return StrokeSegment.defaultPaint;
        }

        public final Bitmap getTexture() {
            return StrokeSegment.texture;
        }

        private Companion() {
        }
    }

    static {
        int color = Color.parseColor("#0000FF");
        baseColor = color;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(color);
        paint.setStyle(Paint.Style.FILL);
        defaultPaint = paint;
        Bitmap bitmapGenerateSeamlessTexture = TextureUtils.INSTANCE.generateSeamlessTexture(128, 128, 567L, color);
        texture = bitmapGenerateSeamlessTexture;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapShader = new BitmapShader(bitmapGenerateSeamlessTexture, tileMode, tileMode);
    }

    public StrokeSegment(Circle c0, Circle c1) {
        OooOOO0.OooO0oO(c0, "c0");
        OooOOO0.OooO0oO(c1, "c1");
        this.c0 = c0;
        this.c1 = c1;
        this.path = new Path();
    }

    private final void addArcSegment(Path path, Circle circle, PointF startPoint, PointF endPoint) {
        RectF rectF = new RectF(circle.getX() - circle.getRadius(), circle.getY() - circle.getRadius(), circle.getRadius() + circle.getX(), circle.getRadius() + circle.getY());
        float fCalculateAngle = calculateAngle(circle, startPoint);
        path.arcTo(rectF, fCalculateAngle, calculateSweepAngle(fCalculateAngle, calculateAngle(circle, endPoint)));
    }

    private final float calculateAngle(Circle circle, PointF point) {
        return (float) Math.toDegrees((float) Math.atan2(point.y - circle.getY(), point.x - circle.getX()));
    }

    private final List<PointF> calculateOuterTangentPoints(Circle c0, Circle c1) {
        float x = c1.getX() - c0.getX();
        float y = c1.getY() - c0.getY();
        if (((float) Math.sqrt((y * y) + (x * x))) <= Math.abs(c0.getRadius() - c1.getRadius())) {
            return null;
        }
        float fAtan2 = (float) Math.atan2(y, x);
        float fAcos = (float) Math.acos((c0.getRadius() - c1.getRadius()) / r2);
        float f = fAtan2 + fAcos;
        double d = f;
        double d2 = fAtan2 - fAcos;
        return C34429OooOOo0.OooOO0o(new PointF((c0.getRadius() * ((float) Math.cos(d))) + c0.getX(), (c0.getRadius() * ((float) Math.sin(d))) + c0.getY()), new PointF((c0.getRadius() * ((float) Math.cos(d2))) + c0.getX(), (c0.getRadius() * ((float) Math.sin(d2))) + c0.getY()), new PointF((c1.getRadius() * ((float) Math.cos(d2))) + c1.getX(), (c1.getRadius() * ((float) Math.sin(d2))) + c1.getY()), new PointF((c1.getRadius() * ((float) Math.cos(d))) + c1.getX(), (c1.getRadius() * ((float) Math.sin(d))) + c1.getY()));
    }

    private final float calculateSweepAngle(float startAngle, float endAngle) {
        float f = endAngle - startAngle;
        return f <= 0.0f ? f + 360.0f : f;
    }

    public static /* synthetic */ StrokeSegment copy$default(StrokeSegment strokeSegment, Circle circle, Circle circle2, int i, Object obj) {
        if ((i & 1) != 0) {
            circle = strokeSegment.c0;
        }
        if ((i & 2) != 0) {
            circle2 = strokeSegment.c1;
        }
        return strokeSegment.copy(circle, circle2);
    }

    private final int radiusToAlpha(float radius) {
        return (int) OooOO0.OooO0o0((((float) Math.pow(OooOO0.OooO0o0((radius - 1.0f) / 9.0f, 0.0f, 1.0f), 1.5f)) * 255.0f) + 0.0f, 0.0f, 255.0f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Circle getC0() {
        return this.c0;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Circle getC1() {
        return this.c1;
    }

    public final StrokeSegment copy(Circle c0, Circle c1) {
        OooOOO0.OooO0oO(c0, "c0");
        OooOOO0.OooO0oO(c1, "c1");
        return new StrokeSegment(c0, c1);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrokeSegment)) {
            return false;
        }
        StrokeSegment strokeSegment = (StrokeSegment) other;
        return OooOOO0.OooO0O0(this.c0, strokeSegment.c0) && OooOOO0.OooO0O0(this.c1, strokeSegment.c1);
    }

    public final Circle getC0() {
        return this.c0;
    }

    public final Circle getC1() {
        return this.c1;
    }

    public final Path getPath() {
        return this.path;
    }

    public int hashCode() {
        return this.c1.hashCode() + (this.c0.hashCode() * 31);
    }

    public final void onDraw(Canvas canvas, StrokeSegment prevStroke, Paint paint) {
        OooOOO0.OooO0oO(canvas, "canvas");
        OooOOO0.OooO0oO(paint, "paint");
        List<PointF> listCalculateOuterTangentPoints = calculateOuterTangentPoints(this.c0, this.c1);
        if (listCalculateOuterTangentPoints != null) {
            PointF pointF = listCalculateOuterTangentPoints.get(0);
            PointF pointF2 = listCalculateOuterTangentPoints.get(1);
            PointF pointF3 = listCalculateOuterTangentPoints.get(2);
            PointF pointF4 = listCalculateOuterTangentPoints.get(3);
            Path path = this.path;
            path.moveTo(pointF.x, pointF.y);
            addArcSegment(path, this.c0, pointF, pointF2);
            path.lineTo(pointF3.x, pointF3.y);
            addArcSegment(path, this.c1, pointF3, pointF4);
            path.lineTo(pointF.x, pointF.y);
            path.close();
            paint.setShader(bitmapShader);
            if (prevStroke != null) {
                this.path.op(prevStroke.path, Path.Op.DIFFERENCE);
            }
            canvas.drawPath(this.path, paint);
        }
    }

    public String toString() {
        return "StrokeSegment(c0=" + this.c0 + ", c1=" + this.c1 + ")";
    }
}
