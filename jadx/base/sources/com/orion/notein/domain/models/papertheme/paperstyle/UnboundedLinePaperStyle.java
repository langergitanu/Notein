package com.orion.notein.domain.models.papertheme.paperstyle;

import Oooo0.o000000O;
import Oooo0oO.C21036OooOOo0;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.aspose.words.OooO0O0;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0O0oo00.OooO00o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u001a\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJA\u0010\u001a\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001d¨\u0006\u001e"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/paperstyle/UnboundedLinePaperStyle;", "Lcom/orion/notein/domain/models/papertheme/paperstyle/LinePaperStyle;", "", "paperWidth", "paperHeight", "foregroundAlpha", "requiredItemSpace", "<init>", "(FFLjava/lang/Float;Ljava/lang/Float;)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/RectF;", "normRegionBounds", "", "regionWidthPx", "regionHeightPx", "", "drawRegion", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;II)Z", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "scale", "LoO00ooO/OooOooO;", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "renderTargetViewport", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;FLandroid/graphics/RectF;)V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class UnboundedLinePaperStyle extends LinePaperStyle {
    public UnboundedLinePaperStyle() {
        this(0.0f, 0.0f, null, null, 15, null);
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.LinePaperStyle, com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public boolean drawRegion(Canvas canvas, RectF normRegionBounds, int regionWidthPx, int regionHeightPx) {
        OooOOO0.OooO0oO(canvas, "canvas");
        OooOOO0.OooO0oO(normRegionBounds, "normRegionBounds");
        getPathList().clear();
        Paint solidPaint = getSolidPaint();
        float itemSpace = getItemSpace();
        float f = normRegionBounds.top;
        float paperHeight = f >= 0.0f ? itemSpace - (((getPaperHeight() * f) + itemSpace) % itemSpace) : Math.abs(getPaperHeight() * f) % itemSpace;
        Path path = new Path();
        int i = -1;
        while (true) {
            int i2 = i + 1;
            float f2 = (i * itemSpace) + paperHeight;
            if (f2 > (getPaperHeight() * normRegionBounds.height()) + itemSpace) {
                Matrix matrix = new Matrix();
                matrix.postScale(regionWidthPx / (getPaperWidth() * normRegionBounds.width()), regionHeightPx / (getPaperHeight() * normRegionBounds.height()));
                path.transform(matrix);
                Paint paint = new Paint();
                paint.set(solidPaint);
                OooO0O0.OooO0O0(matrix, solidPaint.getStrokeWidth(), paint);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                canvas.drawPath(path, paint);
                return true;
            }
            path.moveTo(0.0f, f2);
            path.lineTo(getPaperWidth() * normRegionBounds.width(), f2);
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.orion.notein.domain.models.papertheme.paperstyle.LinePaperStyle, com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public <T> void render(OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale) {
        C32443OooOOO c32443OooOOOOooO0OO = C21036OooOOo0.OooO0OO(renderEngine, "renderEngine", renderTarget, "renderTarget");
        float fFloatValue = ((Number) c32443OooOOOOooO0OO.f116638OooOo0o).floatValue();
        float fFloatValue2 = ((Number) c32443OooOOOOooO0OO.f116637OooOo).floatValue();
        Float fValueOf = Float.valueOf(scale);
        Float fValueOf2 = Float.valueOf(scale);
        float fFloatValue3 = fValueOf.floatValue();
        float fFloatValue4 = fValueOf2.floatValue();
        C32443OooOOO<Float, Float> offset = renderTarget.getOffset();
        float fFloatValue5 = offset.f116638OooOo0o.floatValue();
        float fFloatValue6 = offset.f116637OooOo.floatValue();
        RectF rectF = new RectF(-fFloatValue5, -fFloatValue6, fFloatValue - fFloatValue5, fFloatValue2 - fFloatValue6);
        rectF.left /= getPaperWidth() * fFloatValue3;
        rectF.top /= getPaperHeight() * fFloatValue4;
        rectF.right /= getPaperWidth() * fFloatValue3;
        rectF.bottom /= getPaperHeight() * fFloatValue4;
        float itemSpace = getItemSpace();
        float f = fFloatValue3 * 0.0f;
        float f2 = rectF.top;
        float paperHeight = f2 >= 0.0f ? itemSpace - (((getPaperHeight() * f2) + itemSpace) % itemSpace) : Math.abs(getPaperHeight() * f2) % itemSpace;
        OooO00o.C19734OooO00o.OooO00o(renderEngine, getSolidColor(), o000000O.OooO0o0(1.0f) * fFloatValue3, 0, 0, false, 24);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            float f3 = (itemSpace * fFloatValue4 * i) + (paperHeight * fFloatValue4);
            if (f3 > getPaperHeight() * rectF.height() * fFloatValue4) {
                renderEngine.OooOOOO(1.0f);
                return;
            } else {
                renderEngine.moveTo(f, f3);
                renderEngine.lineTo(getPaperWidth() * rectF.width() * fFloatValue3, f3);
                i = i2;
            }
        }
    }

    public /* synthetic */ UnboundedLinePaperStyle(float f, float f2, Float f3, Float f4, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? o000000O.OooO0o0(842.0f) : f, (i & 2) != 0 ? o000000O.OooO0o0(842.0f) : f2, (i & 4) != 0 ? null : f3, (i & 8) != 0 ? null : f4);
    }

    public UnboundedLinePaperStyle(float f, float f2, Float f3, Float f4) {
        super(f, f2, f3, f4);
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.LinePaperStyle, com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public <T> void render(OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale, RectF renderTargetViewport) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        OooOOO0.OooO0oO(renderTargetViewport, "renderTargetViewport");
        render(renderEngine, renderTarget, scale);
    }
}
