package com.orion.notein.domain.models.papertheme.paperstyle.twocolumns;

import Oooo0.o000000O;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.C22234OoooOo0;
import com.aspose.slides.C22235OoooOoO;
import com.orion.notein.domain.models.papertheme.paperstyle.HollowPaperStyle;
import com.orion.penkit.models.Line;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0O0oo00.OooO00o;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0016\u001a\u00020\u00152\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0013H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0011H\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0011H\u0004¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010&\u001a\u00020%8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/paperstyle/twocolumns/HollowTwoColumnPaperStyle;", "Lcom/orion/notein/domain/models/papertheme/paperstyle/HollowPaperStyle;", "", "paperWidth", "paperHeight", "foregroundAlpha", "requiredItemSpace", "", "horizontalFlip", "leftPadding", "topPadding", "rightPadding", "bottomPadding", "<init>", "(FFLjava/lang/Float;Ljava/lang/Float;ZLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "Lo0O0oo00/OooO00o;", "renderEngine", "Landroid/graphics/RectF;", "contentBounds", "LoO00ooO/OooOOO;", "scale", "LoO00ooO/OooOooO;", "drawTwoColumnGuide", "(Lo0O0oo00/OooO00o;Landroid/graphics/RectF;LoO00ooO/OooOOO;)V", "Landroid/graphics/Path;", "path", "regionBounds", "drawTwoColumnLinesInRegion", "(Landroid/graphics/Path;Landroid/graphics/RectF;)V", "padding", "Lcom/orion/penkit/models/Line;", "getVerticalRedLine", "(Landroid/graphics/RectF;)Lcom/orion/penkit/models/Line;", "holeInPaper", "holePadding", "setHole", "(Landroid/graphics/RectF;Landroid/graphics/RectF;)V", "Landroid/graphics/Paint;", "columnPaint", "Landroid/graphics/Paint;", "getColumnPaint", "()Landroid/graphics/Paint;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class HollowTwoColumnPaperStyle extends HollowPaperStyle {
    private final Paint columnPaint;

    public HollowTwoColumnPaperStyle() {
        this(0.0f, 0.0f, null, null, false, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public final void drawTwoColumnGuide(OooO00o<?> renderEngine, RectF contentBounds, C32443OooOOO<Float, Float> scale) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(contentBounds, "contentBounds");
        OooOOO0.OooO0oO(scale, "scale");
        float fFloatValue = scale.f116638OooOo0o.floatValue();
        float fFloatValue2 = scale.f116637OooOo.floatValue();
        Line verticalRedLine = getVerticalRedLine(calculatePadding());
        OooO00o.C19734OooO00o.OooO00o(renderEngine, this.columnPaint.getColor(), this.columnPaint.getStrokeWidth() * fFloatValue, 0, 0, false, 24);
        float f = (verticalRedLine.getA().x * fFloatValue) + contentBounds.left;
        com.aspose.words.OooO00o.OooO00o(verticalRedLine.getA().y, fFloatValue2, contentBounds.top, renderEngine, f);
        float f2 = (verticalRedLine.getB().x * fFloatValue) + contentBounds.left;
        C22235OoooOoO.OooO00o(verticalRedLine.getB().y, fFloatValue2, contentBounds.top, renderEngine, f2);
        renderEngine.OooOOOO(1.0f);
    }

    public final void drawTwoColumnLinesInRegion(Path path, RectF regionBounds) {
        OooOOO0.OooO0oO(path, "path");
        OooOOO0.OooO0oO(regionBounds, "regionBounds");
        RectF rectFCalculatePadding = calculatePadding();
        float strokeWidth = this.columnPaint.getStrokeWidth();
        float f = regionBounds.left;
        float f2 = regionBounds.right;
        float f3 = regionBounds.top;
        float f4 = regionBounds.bottom;
        Line verticalRedLine = getVerticalRedLine(rectFCalculatePadding);
        if (f - strokeWidth > verticalRedLine.getA().x || verticalRedLine.getB().x > f2 + strokeWidth) {
            return;
        }
        float fMax = Math.max(0.0f, verticalRedLine.getA().y - f3);
        float fMin = Math.min(verticalRedLine.getB().y - f3, f4 - f3);
        float fMax2 = Math.max(0.0f, verticalRedLine.getA().x - f);
        path.moveTo(fMax2, fMax);
        path.lineTo(fMax2, fMin);
    }

    public final Paint getColumnPaint() {
        return this.columnPaint;
    }

    public final Line getVerticalRedLine(RectF padding) {
        OooOOO0.OooO0oO(padding, "padding");
        Float requiredItemSpace = getRequiredItemSpace();
        float fFloatValue = requiredItemSpace != null ? requiredItemSpace.floatValue() : getDefaultItemSpace();
        float fMax = Math.max(getHole().top, padding.top);
        float fMin = Math.min(getHole().bottom, getPaperHeight() - padding.bottom);
        float fCeil = getHorizontalFlip() ? getHole().left - (((float) Math.ceil(((getHole().left - padding.left) / fFloatValue) * 0.5f)) * fFloatValue) : getHole().right + (((float) Math.ceil((((getPaperWidth() - padding.right) - getHole().right) / fFloatValue) * 0.5f)) * fFloatValue);
        return new Line(new PointF(fCeil, fMax), new PointF(fCeil, fMin));
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.HollowPaperStyle
    public void setHole(RectF holeInPaper, RectF holePadding) {
        OooOOO0.OooO0oO(holeInPaper, "holeInPaper");
        OooOOO0.OooO0oO(holePadding, "holePadding");
        Float requiredItemSpace = getRequiredItemSpace();
        float fFloatValue = requiredItemSpace != null ? requiredItemSpace.floatValue() : getDefaultItemSpace();
        setHole(holeInPaper, holePadding, Float.valueOf(fFloatValue));
        setTopPadding(getHole().top < holeInPaper.top - getEPS() ? Float.valueOf((((float) Math.ceil((holeInPaper.top - getHole().top) / fFloatValue)) * fFloatValue) + getHole().top) : Float.valueOf(getHole().top));
        setBottomPadding(getHole().bottom > getEPS() + holeInPaper.bottom ? Float.valueOf((((float) Math.ceil((getHole().bottom - holeInPaper.bottom) / fFloatValue)) * fFloatValue) + (getPaperHeight() - getHole().bottom)) : Float.valueOf(getPaperHeight() - getHole().bottom));
        if (getHorizontalFlip()) {
            setRightPadding(Float.valueOf(getPaperWidth() - getHole().left));
        } else {
            setLeftPadding(Float.valueOf(getHole().right));
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ HollowTwoColumnPaperStyle(float r2, float r3, java.lang.Float r4, java.lang.Float r5, boolean r6, java.lang.Float r7, java.lang.Float r8, java.lang.Float r9, java.lang.Float r10, int r11, kotlin.jvm.internal.C24018OooO0oo r12) {
        /*
            r1 = this;
            r12 = r11 & 1
            if (r12 == 0) goto Lb
            r2 = 1142210560(0x4414c000, float:595.0)
            float r2 = Oooo0.o000000O.OooO0o0(r2)
        Lb:
            r12 = r11 & 2
            if (r12 == 0) goto L16
            r3 = 1146257408(0x44528000, float:842.0)
            float r3 = Oooo0.o000000O.OooO0o0(r3)
        L16:
            r12 = r11 & 4
            r0 = 0
            if (r12 == 0) goto L1c
            r4 = r0
        L1c:
            r12 = r11 & 8
            if (r12 == 0) goto L21
            r5 = r0
        L21:
            r12 = r11 & 16
            if (r12 == 0) goto L26
            r6 = 0
        L26:
            r12 = r11 & 32
            if (r12 == 0) goto L2b
            r7 = r0
        L2b:
            r12 = r11 & 64
            if (r12 == 0) goto L30
            r8 = r0
        L30:
            r12 = r11 & 128(0x80, float:1.8E-43)
            if (r12 == 0) goto L35
            r9 = r0
        L35:
            r11 = r11 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L44
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
            goto L4e
        L44:
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
        L4e:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.domain.models.papertheme.paperstyle.twocolumns.HollowTwoColumnPaperStyle.<init>(float, float, java.lang.Float, java.lang.Float, boolean, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, int, kotlin.jvm.internal.OooO0oo):void");
    }

    public HollowTwoColumnPaperStyle(float f, float f2, Float f3, Float f4, boolean z, Float f5, Float f6, Float f7, Float f8) {
        super(f, f2, f3, f4, z, f5, f6, f7, f8);
        Paint paintOooO00o = C22234OoooOo0.OooO00o(true, true);
        paintOooO00o.setStyle(Paint.Style.STROKE);
        paintOooO00o.setStrokeWidth(o000000O.OooO0o0(1.0f));
        paintOooO00o.setColor(Color.parseColor("#C4151D"));
        this.columnPaint = paintOooO00o;
    }
}
