package com.orion.notein.domain.models.papertheme.paperstyle;

import Oooo0.o000000O;
import Oooo0oO.C21036OooOOo0;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.C22234OoooOo0;
import com.aspose.words.OooO0O0;
import com.google.gson.annotations.Expose;
import com.orion.penkit.models.Line;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0O0oo00.OooO00o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0004¢\u0006\u0004\b\u001b\u0010\u001cJa\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020&0 2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\b\u0010#\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0002H\u0004¢\u0006\u0004\b'\u0010(Ja\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020&0 2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00022\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\b\u0010#\u001a\u0004\u0018\u00010!2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002H\u0004¢\u0006\u0004\b,\u0010(J\u001f\u0010/\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u0014H&¢\u0006\u0004\b/\u00100J)\u0010/\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u00142\b\u00101\u001a\u0004\u0018\u00010\u0002H\u0004¢\u0006\u0004\b/\u00102J9\u00109\u001a\u00020\u000f\"\u0004\b\u0000\u001032\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u0000042\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u0000062\u0006\u00108\u001a\u00020\u0002H\u0016¢\u0006\u0004\b9\u0010:JA\u00109\u001a\u00020\u000f\"\u0004\b\u0000\u001032\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u0000042\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u0000062\u0006\u00108\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u0014H\u0016¢\u0006\u0004\b9\u0010<J/\u0010B\u001a\u00020\u00072\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020\u00142\u0006\u0010@\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u001aH\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u000fH\u0016¢\u0006\u0004\bD\u0010\u0011JG\u0010H\u001a\u00020\u000f2\n\u00105\u001a\u0006\u0012\u0002\b\u0003042\u0006\u0010E\u001a\u00020\u00142\u0006\u0010F\u001a\u00020\u00142\u0006\u0010G\u001a\u00020\u00022\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020&H$¢\u0006\u0004\bH\u0010IJA\u0010L\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u00170&0 2\u0006\u0010J\u001a\u00020\u00142\u0006\u0010E\u001a\u00020\u00142\u0006\u0010G\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u0014H$¢\u0006\u0004\bL\u0010MJ\u001f\u0010N\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\bN\u0010OJ\u001a\u0010R\u001a\u00020\u00072\b\u0010Q\u001a\u0004\u0018\u00010PH\u0096\u0002¢\u0006\u0004\bR\u0010SR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010T\u001a\u0004\bU\u0010VR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010T\u001a\u0004\bW\u0010VR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010X\u001a\u0004\bY\u0010ZR\u001a\u0010[\u001a\u00020\u00028\u0004X\u0084D¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010\u0013R\u001a\u0010^\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b^\u0010\\\u001a\u0004\b_\u0010\u0013R*\u0010a\u001a\u00020\u001a2\u0006\u0010`\u001a\u00020\u001a8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010\u001c\"\u0004\bd\u0010eR\u001a\u0010f\u001a\u00020\u00178\u0004X\u0084\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010\u0019R\u001a\u0010i\u001a\u00020\u00148\u0004X\u0084\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010\u0016R\u001a\u0010m\u001a\u00020l8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p¨\u0006q"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/paperstyle/HollowPaperStyle;", "Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;", "", "paperWidth", "paperHeight", "foregroundAlpha", "requiredItemSpace", "", "horizontalFlip", "leftPadding", "topPadding", "rightPadding", "bottomPadding", "<init>", "(FFLjava/lang/Float;Ljava/lang/Float;ZLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "LoO00ooO/OooOooO;", "checkPaintColor", "()V", "getItemSpace", "()F", "Landroid/graphics/RectF;", "calculatePadding", "()Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "createSolidPaint", "()Landroid/graphics/Paint;", "", "getSolidColor", "()I", "startX", "endX", "y", "", "Lcom/orion/penkit/models/Line;", "horizontalRedLines", "verticalRedLine", "horizontalClearance", "verticalClearance", "LoO00ooO/OooOOO;", "splitHorizontalSegments", "(FFFLjava/util/List;Lcom/orion/penkit/models/Line;FF)Ljava/util/List;", "startY", "endY", "x", "splitVerticalSegments", "holeInPaper", "holePadding", "setHole", "(Landroid/graphics/RectF;Landroid/graphics/RectF;)V", "holeItemSpace", "(Landroid/graphics/RectF;Landroid/graphics/RectF;Ljava/lang/Float;)V", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "scale", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "renderTargetViewport", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;FLandroid/graphics/RectF;)V", "Landroid/graphics/Canvas;", "canvas", "normRegionBounds", "regionWidthPx", "regionHeightPx", "drawRegion", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;II)Z", "initPath", "contentBounds", "holeBounds", "itemSpace", "renderPattern", "(Lo0O0oo00/OooO00o;Landroid/graphics/RectF;Landroid/graphics/RectF;FLoO00ooO/OooOOO;)V", "regionBounds", "Landroid/graphics/Path;", "renderPatternInRegion", "(Landroid/graphics/RectF;Landroid/graphics/RectF;FLandroid/graphics/RectF;)Ljava/util/List;", "duplicate", "(FF)Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Float;", "getForegroundAlpha", "()Ljava/lang/Float;", "getRequiredItemSpace", "Z", "getHorizontalFlip", "()Z", "EPS", "F", "getEPS", "defaultItemSpace", "getDefaultItemSpace", "value", "defaultColor", "I", "getDefaultColor", "setDefaultColor", "(I)V", "solidPaint", "Landroid/graphics/Paint;", "getSolidPaint", "hole", "Landroid/graphics/RectF;", "getHole", "Landroid/graphics/PointF;", "holeAnchorPoint", "Landroid/graphics/PointF;", "getHoleAnchorPoint", "()Landroid/graphics/PointF;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class HollowPaperStyle extends PaperStyle {
    private final float EPS;
    private int defaultColor;
    private final float defaultItemSpace;

    @Expose
    private final Float foregroundAlpha;
    private final RectF hole;
    private final PointF holeAnchorPoint;

    @Expose
    private final boolean horizontalFlip;

    @Expose
    private final Float requiredItemSpace;
    private final Paint solidPaint;

    public HollowPaperStyle() {
        this(0.0f, 0.0f, null, null, false, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    private final void checkPaintColor() {
        int solidColor = getSolidColor();
        if (this.solidPaint.getColor() != solidColor) {
            this.solidPaint.setColor(solidColor);
        }
    }

    public final RectF calculatePadding() {
        Float leftPadding = getLeftPadding();
        float fFloatValue = leftPadding != null ? leftPadding.floatValue() : 0.0f;
        Float topPadding = getTopPadding();
        float fFloatValue2 = topPadding != null ? topPadding.floatValue() : 0.0f;
        Float rightPadding = getRightPadding();
        float fFloatValue3 = rightPadding != null ? rightPadding.floatValue() : 0.0f;
        Float bottomPadding = getBottomPadding();
        return new RectF(fFloatValue, fFloatValue2, fFloatValue3, bottomPadding != null ? bottomPadding.floatValue() : 0.0f);
    }

    public final Paint createSolidPaint() {
        checkPaintColor();
        return new Paint(this.solidPaint);
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public boolean drawRegion(Canvas canvas, RectF normRegionBounds, int regionWidthPx, int regionHeightPx) {
        OooOOO0.OooO0oO(canvas, "canvas");
        OooOOO0.OooO0oO(normRegionBounds, "normRegionBounds");
        super.initPath();
        checkPaintColor();
        float f = normRegionBounds.left;
        if (f < 0.0f) {
            f = 0.0f;
        }
        float paperWidth = getPaperWidth() * f;
        float f2 = normRegionBounds.top;
        float paperHeight = getPaperHeight() * (f2 >= 0.0f ? f2 : 0.0f);
        float f3 = normRegionBounds.right;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        float paperWidth2 = getPaperWidth() * f3;
        float f4 = normRegionBounds.bottom;
        RectF rectF = new RectF(paperWidth, paperHeight, paperWidth2, getPaperHeight() * (f4 <= 1.0f ? f4 : 1.0f));
        RectF rectFCalculatePadding = calculatePadding();
        List<C32443OooOOO<Path, Paint>> listRenderPatternInRegion = renderPatternInRegion(rectF, new RectF(rectFCalculatePadding.left, rectFCalculatePadding.top, getPaperWidth() - rectFCalculatePadding.right, getPaperHeight() - rectFCalculatePadding.bottom), getItemSpace(), this.hole);
        Matrix matrix = new Matrix();
        matrix.postScale(regionWidthPx / (getPaperWidth() * normRegionBounds.width()), regionHeightPx / (getPaperHeight() * normRegionBounds.height()));
        for (C32443OooOOO<Path, Paint> c32443OooOOO : listRenderPatternInRegion) {
            Path path = c32443OooOOO.f116638OooOo0o;
            Paint paint = c32443OooOOO.f116637OooOo;
            Path path2 = new Path();
            path2.set(path);
            path2.transform(matrix);
            Paint paint2 = new Paint();
            paint2.set(paint);
            OooO0O0.OooO0O0(matrix, paint.getStrokeWidth(), paint2);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            canvas.drawPath(path2, paint2);
        }
        return true;
    }

    public abstract PaperStyle duplicate(float paperWidth, float paperHeight);

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !getClass().equals(other.getClass())) {
            return false;
        }
        HollowPaperStyle hollowPaperStyle = (HollowPaperStyle) other;
        if (getPaperWidth() == hollowPaperStyle.getPaperWidth() && getPaperHeight() == hollowPaperStyle.getPaperHeight() && OooOOO0.OooO00o(getLeftPadding(), hollowPaperStyle.getLeftPadding()) && OooOOO0.OooO00o(getTopPadding(), hollowPaperStyle.getTopPadding()) && OooOOO0.OooO00o(getRightPadding(), hollowPaperStyle.getRightPadding()) && OooOOO0.OooO00o(getBottomPadding(), hollowPaperStyle.getBottomPadding())) {
            Float f = this.requiredItemSpace;
            Float fValueOf = Float.valueOf(f != null ? f.floatValue() : this.defaultItemSpace);
            Float fValueOf2 = hollowPaperStyle.requiredItemSpace;
            if (fValueOf2 == null) {
                fValueOf2 = Float.valueOf(this.defaultItemSpace);
            }
            if (fValueOf.equals(fValueOf2) && this.horizontalFlip == hollowPaperStyle.horizontalFlip) {
                Float f2 = this.foregroundAlpha;
                Float fValueOf3 = Float.valueOf(f2 != null ? f2.floatValue() : 1.0f);
                Float fValueOf4 = hollowPaperStyle.foregroundAlpha;
                if (fValueOf4 == null) {
                    fValueOf4 = Float.valueOf(1.0f);
                }
                if (fValueOf3.equals(fValueOf4)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public int getDefaultColor() {
        return this.defaultColor;
    }

    public final float getDefaultItemSpace() {
        return this.defaultItemSpace;
    }

    public final float getEPS() {
        return this.EPS;
    }

    public final Float getForegroundAlpha() {
        return this.foregroundAlpha;
    }

    public final RectF getHole() {
        return this.hole;
    }

    public final PointF getHoleAnchorPoint() {
        return this.holeAnchorPoint;
    }

    public final boolean getHorizontalFlip() {
        return this.horizontalFlip;
    }

    public final float getItemSpace() {
        Float f = this.requiredItemSpace;
        return f != null ? f.floatValue() : this.defaultItemSpace;
    }

    public final Float getRequiredItemSpace() {
        return this.requiredItemSpace;
    }

    public final int getSolidColor() {
        if (this.foregroundAlpha == null) {
            return getDefaultColor();
        }
        Color colorValueOf = Color.valueOf(getDefaultColor());
        OooOOO0.OooO0o(colorValueOf, "valueOf(...)");
        return Color.valueOf(colorValueOf.red(), colorValueOf.green(), colorValueOf.blue(), this.foregroundAlpha.floatValue()).toArgb();
    }

    public final Paint getSolidPaint() {
        return this.solidPaint;
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public void initPath() {
        super.initPath();
        checkPaintColor();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public <T> void render(OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale) {
        C32443OooOOO c32443OooOOOOooO0OO = C21036OooOOo0.OooO0OO(renderEngine, "renderEngine", renderTarget, "renderTarget");
        render(renderEngine, renderTarget, scale, new RectF(0.0f, 0.0f, ((Number) c32443OooOOOOooO0OO.f116638OooOo0o).floatValue(), ((Number) c32443OooOOOOooO0OO.f116637OooOo).floatValue()));
    }

    public abstract void renderPattern(OooO00o<?> renderEngine, RectF contentBounds, RectF holeBounds, float itemSpace, C32443OooOOO<Float, Float> scale);

    public abstract List<C32443OooOOO<Path, Paint>> renderPatternInRegion(RectF regionBounds, RectF contentBounds, float itemSpace, RectF holeBounds);

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public void setDefaultColor(int i) {
        this.defaultColor = i;
        this.solidPaint.setColor(getSolidColor());
    }

    public abstract void setHole(RectF holeInPaper, RectF holePadding);

    public final void setHole(RectF holeInPaper, RectF holePadding, Float holeItemSpace) {
        OooOOO0.OooO0oO(holeInPaper, "holeInPaper");
        OooOOO0.OooO0oO(holePadding, "holePadding");
        float fFloatValue = holeItemSpace != null ? holeItemSpace.floatValue() : this.defaultItemSpace;
        this.holeAnchorPoint.set(holeInPaper.left + holePadding.left, holeInPaper.top + holePadding.top);
        float f = holePadding.left + holeInPaper.left;
        float f2 = holeInPaper.top + holePadding.top;
        float fCeil = holeInPaper.left - (f - (((float) Math.ceil((f - r0) / fFloatValue)) * fFloatValue));
        float fCeil2 = holeInPaper.top - (f2 - (((float) Math.ceil((f2 - holeInPaper.top) / fFloatValue)) * fFloatValue));
        float fCeil3 = ((((float) Math.ceil((holeInPaper.right - f) / fFloatValue)) * fFloatValue) + f) - holeInPaper.right;
        float fCeil4 = (((float) Math.ceil((holeInPaper.bottom - f2) / fFloatValue)) * fFloatValue) + f2;
        float f3 = holeInPaper.bottom;
        this.hole.set(holeInPaper.left - fCeil, holeInPaper.top - fCeil2, holeInPaper.right + fCeil3, f3 + (fCeil4 - f3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<C32443OooOOO<Float, Float>> splitHorizontalSegments(float startX, float endX, float y, List<Line> horizontalRedLines, Line verticalRedLine, float horizontalClearance, float verticalClearance) {
        OooOOO0.OooO0oO(horizontalRedLines, "horizontalRedLines");
        float f = endX - startX;
        float f2 = this.EPS;
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        if (f > f2) {
            List<Line> list = horizontalRedLines;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (Line line : list) {
                    float f3 = line.getA().y;
                    float fMin = Math.min(line.getA().x, line.getB().x);
                    float fMax = Math.max(line.getA().x, line.getB().x);
                    if (Math.abs(y - f3) >= horizontalClearance || endX <= fMin - verticalClearance || startX >= fMax + verticalClearance) {
                    }
                }
            }
            ArrayList<C32443OooOOO> arrayListOooOOO = C34429OooOOo0.OooOOO(new C32443OooOOO(Float.valueOf(startX), Float.valueOf(endX)));
            if (verticalRedLine != null) {
                float f4 = verticalRedLine.getA().x;
                float fMin2 = Math.min(verticalRedLine.getA().y, verticalRedLine.getB().y);
                float fMax2 = Math.max(verticalRedLine.getA().y, verticalRedLine.getB().y);
                if (y >= fMin2 - horizontalClearance && y <= fMax2 + horizontalClearance) {
                    float f5 = f4 - verticalClearance;
                    float f6 = f4 + verticalClearance;
                    ArrayList arrayList = new ArrayList();
                    for (C32443OooOOO c32443OooOOO : arrayListOooOOO) {
                        float fFloatValue = ((Number) c32443OooOOO.f116638OooOo0o).floatValue();
                        float fFloatValue2 = ((Number) c32443OooOOO.f116637OooOo).floatValue();
                        float f7 = fFloatValue2 - fFloatValue;
                        float f8 = this.EPS;
                        if (f7 > f8) {
                            if (fFloatValue2 <= f5 + f8 || fFloatValue >= f6 - f8) {
                                arrayList.add(new C32443OooOOO(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2)));
                            } else {
                                if (fFloatValue < f5 - f8) {
                                    arrayList.add(new C32443OooOOO(Float.valueOf(fFloatValue), Float.valueOf(f5)));
                                }
                                if (fFloatValue2 > this.EPS + f6) {
                                    arrayList.add(new C32443OooOOO(Float.valueOf(f6), Float.valueOf(fFloatValue2)));
                                }
                            }
                        }
                    }
                    arrayListOooOOO = arrayList;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayListOooOOO) {
                C32443OooOOO c32443OooOOO2 = (C32443OooOOO) obj;
                if (((Number) c32443OooOOO2.f116637OooOo).floatValue() - ((Number) c32443OooOOO2.f116638OooOo0o).floatValue() > this.EPS) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
        return c34434OooOoO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r7 < (r11 + r13)) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<C32443OooOOO<Float, Float>> splitVerticalSegments(float startY, float endY, float x, List<Line> horizontalRedLines, Line verticalRedLine, float verticalClearance, float horizontalClearance) {
        OooOOO0.OooO0oO(horizontalRedLines, "horizontalRedLines");
        float f = endY - startY;
        float f2 = this.EPS;
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        if (f > f2) {
            if (verticalRedLine != null) {
                float f3 = verticalRedLine.getA().x;
                float fMin = Math.min(verticalRedLine.getA().y, verticalRedLine.getB().y);
                float fMax = Math.max(verticalRedLine.getA().y, verticalRedLine.getB().y);
                if (Math.abs(x - f3) < verticalClearance) {
                    if (endY > fMin - horizontalClearance) {
                    }
                }
            }
            ArrayList<C32443OooOOO> arrayListOooOOO = C34429OooOOo0.OooOOO(new C32443OooOOO(Float.valueOf(startY), Float.valueOf(endY)));
            Iterator<Line> it = horizontalRedLines.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Line next = it.next();
                float f4 = next.getA().y;
                float fMin2 = Math.min(next.getA().x, next.getB().x);
                float fMax2 = Math.max(next.getA().x, next.getB().x);
                if (x >= fMin2 - verticalClearance && x <= fMax2 + verticalClearance) {
                    ArrayList arrayList = new ArrayList();
                    for (C32443OooOOO c32443OooOOO : arrayListOooOOO) {
                        float fFloatValue = ((Number) c32443OooOOO.f116638OooOo0o).floatValue();
                        float fFloatValue2 = ((Number) c32443OooOOO.f116637OooOo).floatValue();
                        float f5 = fFloatValue2 - fFloatValue;
                        float f6 = this.EPS;
                        if (f5 > f6) {
                            if (f4 < fFloatValue - horizontalClearance || f4 > fFloatValue2 + horizontalClearance) {
                                arrayList.add(new C32443OooOOO(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2)));
                            } else {
                                float f7 = f4 - horizontalClearance;
                                float f8 = f4 + horizontalClearance;
                                if (f7 - fFloatValue > f6) {
                                    arrayList.add(new C32443OooOOO(Float.valueOf(fFloatValue), Float.valueOf(f7)));
                                }
                                if (fFloatValue2 - f8 > this.EPS) {
                                    arrayList.add(new C32443OooOOO(Float.valueOf(f8), Float.valueOf(fFloatValue2)));
                                }
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        arrayListOooOOO = arrayList;
                        break;
                    }
                    arrayListOooOOO = arrayList;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayListOooOOO) {
                C32443OooOOO c32443OooOOO2 = (C32443OooOOO) obj;
                if (((Number) c32443OooOOO2.f116637OooOo).floatValue() - ((Number) c32443OooOOO2.f116638OooOo0o).floatValue() > this.EPS) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
        return c34434OooOoO;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ HollowPaperStyle(float r2, float r3, java.lang.Float r4, java.lang.Float r5, boolean r6, java.lang.Float r7, java.lang.Float r8, java.lang.Float r9, java.lang.Float r10, int r11, kotlin.jvm.internal.C24018OooO0oo r12) {
        /*
            r1 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L7
            r2 = 1142210560(0x4414c000, float:595.0)
        L7:
            r12 = r11 & 2
            if (r12 == 0) goto Le
            r3 = 1146257408(0x44528000, float:842.0)
        Le:
            r12 = r11 & 4
            r0 = 0
            if (r12 == 0) goto L14
            r4 = r0
        L14:
            r12 = r11 & 8
            if (r12 == 0) goto L19
            r5 = r0
        L19:
            r12 = r11 & 16
            if (r12 == 0) goto L1e
            r6 = 0
        L1e:
            r12 = r11 & 32
            if (r12 == 0) goto L23
            r7 = r0
        L23:
            r12 = r11 & 64
            if (r12 == 0) goto L28
            r8 = r0
        L28:
            r12 = r11 & 128(0x80, float:1.8E-43)
            if (r12 == 0) goto L2d
            r9 = r0
        L2d:
            r11 = r11 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L3c
            r12 = r0
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L46
        L3c:
            r12 = r10
            r11 = r9
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L46:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.domain.models.papertheme.paperstyle.HollowPaperStyle.<init>(float, float, java.lang.Float, java.lang.Float, boolean, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, int, kotlin.jvm.internal.OooO0oo):void");
    }

    public HollowPaperStyle(float f, float f2, Float f3, Float f4, boolean z, Float f5, Float f6, Float f7, Float f8) {
        super(f, f2, f5, f6, f7, f8);
        this.foregroundAlpha = f3;
        this.requiredItemSpace = f4;
        this.horizontalFlip = z;
        this.EPS = 1.0E-4f;
        this.defaultItemSpace = o000000O.OooO0o0(25.0f);
        this.defaultColor = Color.parseColor("#C3D0E0");
        Paint paintOooO00o = C22234OoooOo0.OooO00o(true, true);
        paintOooO00o.setColor(getDefaultColor());
        paintOooO00o.setStyle(Paint.Style.FILL_AND_STROKE);
        paintOooO00o.setStrokeWidth(o000000O.OooO0o0(0.5f));
        this.solidPaint = paintOooO00o;
        this.hole = new RectF();
        this.holeAnchorPoint = new PointF();
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public <T> void render(OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale, RectF renderTargetViewport) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        OooOOO0.OooO0oO(renderTargetViewport, "renderTargetViewport");
        float fWidth = renderTargetViewport.width();
        float fHeight = renderTargetViewport.height();
        float paperWidth = fWidth / getPaperWidth();
        float paperHeight = fHeight / getPaperHeight();
        float itemSpace = getItemSpace();
        float f = renderTargetViewport.left;
        float f2 = renderTargetViewport.top;
        RectF rectF = new RectF(f, f2, f, f2);
        RectF rectF2 = this.hole;
        float f3 = rectF2.left * paperWidth;
        float f4 = renderTargetViewport.left;
        float f5 = rectF2.top * paperHeight;
        float f6 = renderTargetViewport.top;
        renderPattern(renderEngine, rectF, new RectF(f3 + f4, f5 + f6, (rectF2.right * paperWidth) + f4, (rectF2.bottom * paperHeight) + f6), itemSpace, new C32443OooOOO<>(Float.valueOf(paperWidth), Float.valueOf(paperHeight)));
    }
}
