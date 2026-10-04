package com.orion.notein.domain.models.papertheme.paperstyle.twocolumns;

import Oooo0.o000000O;
import Oooo0oO.C21036OooOOo0;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.appcompat.widget.C21559Oooo0oO;
import com.aspose.slides.C22234OoooOo0;
import com.aspose.slides.C22235OoooOoO;
import com.aspose.words.OooO0O0;
import com.aspose.words.OooO0OO;
import com.orion.notein.domain.models.papertheme.paperstyle.NewSquarePaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle;
import com.orion.notein.global.R;
import com.orion.penkit.models.Line;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0O0oo00.OooO00o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\rJ9\u0010#\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$JA\u0010#\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010&J/\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0012H\u0016¢\u0006\u0004\b0\u0010\u0014J\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R*\u00109\u001a\u00020*2\u0006\u00108\u001a\u00020*8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010A¨\u0006C"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/paperstyle/twocolumns/SquareTwoColumnPaperStyle;", "Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;", "", "paperWidth", "paperHeight", "leftPadding", "topPadding", "rightPadding", "bottomPadding", "<init>", "(FFLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "Landroid/graphics/RectF;", "calculatePadding", "()Landroid/graphics/RectF;", "Lcom/orion/notein/domain/models/papertheme/paperstyle/NewSquarePaperStyle;", "generateSquarePaperStyle", "()Lcom/orion/notein/domain/models/papertheme/paperstyle/NewSquarePaperStyle;", "getBaseLinePaperPadding", "LoO00ooO/OooOooO;", "updateBaseLinePaperStyle", "()V", "getVerticalRedLineX", "()F", "padding", "Lcom/orion/penkit/models/Line;", "getTopHorizontalRedLine", "(Landroid/graphics/RectF;)Lcom/orion/penkit/models/Line;", "getBottomHorizontalRedLine", "getRenderPadding", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "scale", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "renderTargetViewport", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;FLandroid/graphics/RectF;)V", "Landroid/graphics/Canvas;", "canvas", "normRegionBounds", "", "regionWidthPx", "regionHeightPx", "", "drawRegion", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;II)Z", "initPath", "Landroid/content/res/Resources;", "res", "", "getName", "(Landroid/content/res/Resources;)Ljava/lang/String;", "basePaperStyle", "Lcom/orion/notein/domain/models/papertheme/paperstyle/NewSquarePaperStyle;", "value", "defaultColor", "I", "getDefaultColor", "()I", "setDefaultColor", "(I)V", "Landroid/graphics/Paint;", "boldSolidPaint", "Landroid/graphics/Paint;", "redPaint", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class SquareTwoColumnPaperStyle extends PaperStyle {
    private final NewSquarePaperStyle basePaperStyle;
    private final Paint boldSolidPaint;
    private int defaultColor;
    private final Paint redPaint;

    public SquareTwoColumnPaperStyle() {
        this(0.0f, 0.0f, null, null, null, null, 63, null);
    }

    private final RectF calculatePadding() {
        RectF rectF = new RectF();
        Float leftPadding = getLeftPadding();
        rectF.left = leftPadding != null ? leftPadding.floatValue() : 0.0f;
        Float topPadding = getTopPadding();
        rectF.top = topPadding != null ? topPadding.floatValue() : 0.0f;
        Float rightPadding = getRightPadding();
        rectF.right = rightPadding != null ? rightPadding.floatValue() : 0.0f;
        Float bottomPadding = getBottomPadding();
        rectF.bottom = bottomPadding != null ? bottomPadding.floatValue() : 0.0f;
        return rectF;
    }

    private final NewSquarePaperStyle generateSquarePaperStyle() {
        RectF baseLinePaperPadding = getBaseLinePaperPadding();
        return new NewSquarePaperStyle(getPaperWidth(), getPaperHeight(), null, null, Float.valueOf(baseLinePaperPadding.left), Float.valueOf(baseLinePaperPadding.top), Float.valueOf(baseLinePaperPadding.right), Float.valueOf(baseLinePaperPadding.bottom));
    }

    private final RectF getBaseLinePaperPadding() {
        return getPaperWidth() < getPaperHeight() ? PaperStyle.INSTANCE.getLINE_STYLE_V_PADDING() : PaperStyle.INSTANCE.getLINE_STYLE_H_PADDING();
    }

    private final Line getBottomHorizontalRedLine(RectF padding) {
        float f = padding.left;
        float paperWidth = getPaperWidth() - padding.right;
        Line bottomHorizontalLine = this.basePaperStyle.getBottomHorizontalLine();
        return new Line(new PointF(f, bottomHorizontalLine.getA().y), new PointF(paperWidth, bottomHorizontalLine.getA().y));
    }

    private final Line getTopHorizontalRedLine(RectF padding) {
        float f = padding.left;
        float paperWidth = getPaperWidth() - padding.right;
        Line topHorizontalLine = this.basePaperStyle.getTopHorizontalLine();
        return new Line(new PointF(f, topHorizontalLine.getA().y), new PointF(paperWidth, topHorizontalLine.getA().y));
    }

    private final float getVerticalRedLineX() {
        return getPaperWidth() * 0.5f;
    }

    private final void updateBaseLinePaperStyle() {
        this.basePaperStyle.setPaperWidth(getPaperWidth());
        this.basePaperStyle.setPaperHeight(getPaperHeight());
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public boolean drawRegion(Canvas canvas, RectF normRegionBounds, int regionWidthPx, int regionHeightPx) {
        OooOOO0.OooO0oO(canvas, "canvas");
        OooOOO0.OooO0oO(normRegionBounds, "normRegionBounds");
        super.initPath();
        updateBaseLinePaperStyle();
        this.basePaperStyle.drawRegion(canvas, normRegionBounds, regionWidthPx, regionHeightPx);
        float f = normRegionBounds.left;
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = normRegionBounds.top;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        float f3 = normRegionBounds.right;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        float f4 = normRegionBounds.bottom;
        RectF rectF = new RectF(f, f2, f3, f4 <= 1.0f ? f4 : 1.0f);
        Path path = new Path();
        float strokeWidth = this.boldSolidPaint.getStrokeWidth();
        Line topHorizontalLine = this.basePaperStyle.getTopHorizontalLine();
        if ((getPaperHeight() * rectF.top) - strokeWidth <= topHorizontalLine.getA().y) {
            if (topHorizontalLine.getA().y <= (getPaperHeight() * rectF.bottom) + strokeWidth) {
                float fMax = Math.max(0.0f, topHorizontalLine.getA().x - (getPaperWidth() * rectF.left));
                float fMin = Math.min(topHorizontalLine.getB().x - (getPaperWidth() * rectF.left), getPaperWidth() * (rectF.right - rectF.left));
                path.moveTo(fMax, topHorizontalLine.getA().y - (getPaperHeight() * rectF.top));
                path.lineTo(fMin, topHorizontalLine.getB().y - (getPaperHeight() * rectF.top));
            }
        }
        Path path2 = new Path();
        float strokeWidth2 = this.redPaint.getStrokeWidth();
        float verticalRedLineX = getVerticalRedLineX();
        if ((getPaperWidth() * rectF.left) - strokeWidth2 <= verticalRedLineX) {
            if (verticalRedLineX <= (getPaperWidth() * rectF.right) + strokeWidth2) {
                Line topHorizontalLine2 = this.basePaperStyle.getTopHorizontalLine();
                Line bottomHorizontalLine = this.basePaperStyle.getBottomHorizontalLine();
                float fMax2 = Math.max(0.0f, topHorizontalLine2.getA().y - (getPaperHeight() * rectF.top));
                float fMin2 = Math.min(bottomHorizontalLine.getB().y - (getPaperHeight() * rectF.top), getPaperHeight() * (rectF.bottom - rectF.top));
                float fMax3 = Math.max(0.0f, verticalRedLineX - (getPaperWidth() * rectF.left));
                path2.moveTo(fMax3, fMax2);
                path2.lineTo(fMax3, fMin2);
            }
        }
        Matrix matrix = new Matrix();
        matrix.postScale(regionWidthPx / (getPaperWidth() * normRegionBounds.width()), regionHeightPx / (getPaperHeight() * normRegionBounds.height()));
        path2.transform(matrix);
        path.transform(matrix);
        Paint paint = new Paint();
        paint.set(this.redPaint);
        OooO0O0.OooO0O0(matrix, this.redPaint.getStrokeWidth(), paint);
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        canvas.drawPath(path2, paint);
        Paint paint2 = new Paint();
        paint2.set(this.boldSolidPaint);
        OooO0O0.OooO0O0(matrix, this.boldSolidPaint.getStrokeWidth(), paint2);
        canvas.drawPath(path, paint2);
        return true;
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public int getDefaultColor() {
        return this.defaultColor;
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public String getName(Resources res) {
        return OooO0OO.OooO00o(res, "res", R.string.paper_style_2_column_grid, "getString(...)");
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public RectF getRenderPadding() {
        return this.basePaperStyle.getRenderPadding();
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public void initPath() {
        super.initPath();
        updateBaseLinePaperStyle();
        this.basePaperStyle.initPath();
        getPathList().addAll(this.basePaperStyle.getPathList());
        Line topHorizontalLine = this.basePaperStyle.getTopHorizontalLine();
        Path path = new Path();
        path.moveTo(topHorizontalLine.getA().x, topHorizontalLine.getA().y);
        path.lineTo(topHorizontalLine.getB().x, topHorizontalLine.getB().y);
        getPathList().add(new C32443OooOOO<>(path, this.boldSolidPaint));
        Path path2 = new Path();
        Line topHorizontalLine2 = this.basePaperStyle.getTopHorizontalLine();
        Line bottomHorizontalLine = this.basePaperStyle.getBottomHorizontalLine();
        float verticalRedLineX = getVerticalRedLineX();
        path2.moveTo(verticalRedLineX, topHorizontalLine2.getA().y);
        path2.lineTo(verticalRedLineX, bottomHorizontalLine.getA().y);
        C21559Oooo0oO.OooO0O0(path2, this.redPaint, getPathList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public <T> void render(OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale) {
        C32443OooOOO c32443OooOOOOooO0OO = C21036OooOOo0.OooO0OO(renderEngine, "renderEngine", renderTarget, "renderTarget");
        render(renderEngine, renderTarget, scale, new RectF(0.0f, 0.0f, ((Number) c32443OooOOOOooO0OO.f116638OooOo0o).floatValue(), ((Number) c32443OooOOOOooO0OO.f116637OooOo).floatValue()));
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public void setDefaultColor(int i) {
        this.defaultColor = i;
        this.basePaperStyle.setDefaultColor(i);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ SquareTwoColumnPaperStyle(float r2, float r3, java.lang.Float r4, java.lang.Float r5, java.lang.Float r6, java.lang.Float r7, int r8, kotlin.jvm.internal.C24018OooO0oo r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto Lb
            r2 = 1142210560(0x4414c000, float:595.0)
            float r2 = Oooo0.o000000O.OooO0o0(r2)
        Lb:
            r9 = r8 & 2
            if (r9 == 0) goto L16
            r3 = 1146257408(0x44528000, float:842.0)
            float r3 = Oooo0.o000000O.OooO0o0(r3)
        L16:
            r9 = r8 & 4
            r0 = 0
            if (r9 == 0) goto L1c
            r4 = r0
        L1c:
            r9 = r8 & 8
            if (r9 == 0) goto L21
            r5 = r0
        L21:
            r9 = r8 & 16
            if (r9 == 0) goto L26
            r6 = r0
        L26:
            r8 = r8 & 32
            if (r8 == 0) goto L32
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L39
        L32:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L39:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.domain.models.papertheme.paperstyle.twocolumns.SquareTwoColumnPaperStyle.<init>(float, float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, int, kotlin.jvm.internal.OooO0oo):void");
    }

    public SquareTwoColumnPaperStyle(float f, float f2, Float f3, Float f4, Float f5, Float f6) {
        super(f, f2, f3, f4, f5, f6);
        this.basePaperStyle = generateSquarePaperStyle();
        this.defaultColor = Color.parseColor("#C3D0E0");
        Paint paintOooO00o = C22234OoooOo0.OooO00o(true, true);
        Paint.Style style = Paint.Style.STROKE;
        paintOooO00o.setStyle(style);
        paintOooO00o.setStrokeWidth(o000000O.OooO0o0(1.0f));
        paintOooO00o.setColor(Color.parseColor("#FFAEAEAE"));
        this.boldSolidPaint = paintOooO00o;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(style);
        paint.setStrokeWidth(o000000O.OooO0o0(1.0f));
        paint.setColor(Color.parseColor("#C4151D"));
        this.redPaint = paint;
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public <T> void render(OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale, RectF renderTargetViewport) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        OooOOO0.OooO0oO(renderTargetViewport, "renderTargetViewport");
        updateBaseLinePaperStyle();
        this.basePaperStyle.render(renderEngine, renderTarget, scale, renderTargetViewport);
        float fWidth = renderTargetViewport.width();
        float fHeight = renderTargetViewport.height();
        float paperWidth = fWidth / getPaperWidth();
        float paperHeight = fHeight / getPaperHeight();
        OooO00o.C19734OooO00o.OooO00o(renderEngine, this.boldSolidPaint.getColor(), this.boldSolidPaint.getStrokeWidth() * paperWidth, 0, 0, false, 24);
        Line topHorizontalLine = this.basePaperStyle.getTopHorizontalLine();
        float f = (topHorizontalLine.getA().x * paperWidth) + renderTargetViewport.left;
        com.aspose.words.OooO00o.OooO00o(topHorizontalLine.getA().y, paperHeight, renderTargetViewport.top, renderEngine, f);
        float f2 = (topHorizontalLine.getB().x * paperWidth) + renderTargetViewport.left;
        C22235OoooOoO.OooO00o(topHorizontalLine.getB().y, paperHeight, renderTargetViewport.top, renderEngine, f2);
        renderEngine.OooOOOO(1.0f);
        OooO00o.C19734OooO00o.OooO00o(renderEngine, this.redPaint.getColor(), this.redPaint.getStrokeWidth() * paperWidth, 0, 0, false, 24);
        Line topHorizontalLine2 = this.basePaperStyle.getTopHorizontalLine();
        Line bottomHorizontalLine = this.basePaperStyle.getBottomHorizontalLine();
        float verticalRedLineX = getVerticalRedLineX() * paperWidth;
        float f3 = renderTargetViewport.left + verticalRedLineX;
        com.aspose.words.OooO00o.OooO00o(topHorizontalLine2.getA().y, paperHeight, renderTargetViewport.top, renderEngine, f3);
        float f4 = renderTargetViewport.left + verticalRedLineX;
        C22235OoooOoO.OooO00o(bottomHorizontalLine.getA().y, paperHeight, renderTargetViewport.top, renderEngine, f4);
        renderEngine.OooOOOO(1.0f);
    }
}
