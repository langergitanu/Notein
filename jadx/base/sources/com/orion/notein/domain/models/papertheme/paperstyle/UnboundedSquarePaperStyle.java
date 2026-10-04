package com.orion.notein.domain.models.papertheme.paperstyle;

import Oooo0.o000000O;
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
@Metadata(m80611d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011JA\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0010\u0010\u0014J/\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/paperstyle/UnboundedSquarePaperStyle;", "Lcom/orion/notein/domain/models/papertheme/paperstyle/SquarePaperStyle;", "", "paperWidth", "paperHeight", "foregroundAlpha", "requiredItemSpace", "<init>", "(FFLjava/lang/Float;Ljava/lang/Float;)V", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "scale", "LoO00ooO/OooOooO;", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "Landroid/graphics/RectF;", "renderTargetViewport", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;FLandroid/graphics/RectF;)V", "Landroid/graphics/Canvas;", "canvas", "normRegionBounds", "", "regionWidthPx", "regionHeightPx", "", "drawRegion", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;II)Z", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class UnboundedSquarePaperStyle extends SquarePaperStyle {
    public UnboundedSquarePaperStyle() {
        this(0.0f, 0.0f, null, null, 15, null);
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.SquarePaperStyle, com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public boolean drawRegion(Canvas canvas, RectF normRegionBounds, int regionWidthPx, int regionHeightPx) {
        OooOOO0.OooO0oO(canvas, "canvas");
        OooOOO0.OooO0oO(normRegionBounds, "normRegionBounds");
        getPathList().clear();
        Paint solidPaint = getSolidPaint();
        float itemSpace = getItemSpace();
        float f = normRegionBounds.left;
        float paperWidth = f >= 0.0f ? itemSpace - ((getPaperWidth() * f) % itemSpace) : Math.abs(getPaperWidth() * f) % itemSpace;
        float f2 = normRegionBounds.top;
        float paperHeight = f2 >= 0.0f ? itemSpace - ((getPaperHeight() * f2) % itemSpace) : Math.abs(getPaperHeight() * f2) % itemSpace;
        Path path = new Path();
        int i = -1;
        int i2 = -1;
        while (true) {
            int i3 = i2 + 1;
            float f3 = (i2 * itemSpace) + paperHeight;
            if (f3 > (getPaperHeight() * normRegionBounds.height()) + itemSpace) {
                break;
            }
            path.moveTo(0.0f, f3);
            path.lineTo(getPaperWidth() * normRegionBounds.width(), f3);
            i2 = i3;
        }
        while (true) {
            int i4 = i + 1;
            float f4 = (i * itemSpace) + paperWidth;
            if (f4 > (getPaperWidth() * normRegionBounds.width()) + itemSpace) {
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
            path.moveTo(f4, 0.0f);
            path.lineTo(f4, getPaperHeight() * normRegionBounds.height());
            i = i4;
        }
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.SquarePaperStyle, com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public <T> void render(OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        getPathList().clear();
        C32443OooOOO<Float, Float> size = renderTarget.getSize();
        float fFloatValue = size.f116638OooOo0o.floatValue();
        float fFloatValue2 = size.f116637OooOo.floatValue();
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
        float f = rectF.left;
        float paperWidth = f >= 0.0f ? itemSpace - ((getPaperWidth() * f) % itemSpace) : Math.abs(getPaperWidth() * f) % itemSpace;
        float f2 = rectF.top;
        float paperHeight = f2 >= 0.0f ? itemSpace - ((getPaperHeight() * f2) % itemSpace) : Math.abs(getPaperHeight() * f2) % itemSpace;
        OooO00o.C19734OooO00o.OooO00o(renderEngine, getSolidColor(), o000000O.OooO0o0(0.5f) * fFloatValue3, 0, 0, false, 24);
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            float f3 = (itemSpace * fFloatValue4 * i2) + (paperHeight * fFloatValue4);
            if (f3 > getPaperHeight() * rectF.height() * fFloatValue4) {
                break;
            }
            renderEngine.moveTo(0.0f, f3);
            renderEngine.lineTo(getPaperWidth() * rectF.width() * fFloatValue3, f3);
            i2 = i3;
        }
        while (true) {
            int i4 = i + 1;
            float f4 = (itemSpace * fFloatValue3 * i) + (paperWidth * fFloatValue3);
            if (f4 > getPaperWidth() * rectF.width() * fFloatValue3) {
                renderEngine.OooOOOO(1.0f);
                return;
            } else {
                renderEngine.moveTo(f4, 0.0f);
                renderEngine.lineTo(f4, getPaperHeight() * rectF.height() * fFloatValue4);
                i = i4;
            }
        }
    }

    public /* synthetic */ UnboundedSquarePaperStyle(float f, float f2, Float f3, Float f4, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? o000000O.OooO0o0(842.0f) : f, (i & 2) != 0 ? o000000O.OooO0o0(842.0f) : f2, (i & 4) != 0 ? null : f3, (i & 8) != 0 ? null : f4);
    }

    public UnboundedSquarePaperStyle(float f, float f2, Float f3, Float f4) {
        super(f, f2, f3, f4);
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.SquarePaperStyle, com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public <T> void render(OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale, RectF renderTargetViewport) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        OooOOO0.OooO0oO(renderTargetViewport, "renderTargetViewport");
        render(renderEngine, renderTarget, scale);
    }
}
