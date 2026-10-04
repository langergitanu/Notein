package com.orion.notein.domain.models.papertheme.paperstyle.threecolumns;

import OooOoOO.C20519OooO0Oo;
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
import com.google.gson.annotations.Expose;
import com.orion.notein.domain.models.papertheme.paperstyle.NewSquarePaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle;
import com.orion.notein.global.R;
import com.orion.penkit.models.Line;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0O0oo00.OooO00o;
import o0OooOo.C29576OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO00ooO.InterfaceC32440OooOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\u0011J9\u0010(\u001a\u00020\u0016\"\u0004\b\u0000\u0010\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010'\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)JA\u0010(\u001a\u00020\u0016\"\u0004\b\u0000\u0010\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u000fH\u0016¢\u0006\u0004\b(\u0010+J/\u00101\u001a\u00020\t2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bH\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0016H\u0016¢\u0006\u0004\b3\u0010\u0018J\u0017\u00107\u001a\u0002062\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b7\u00108J\u001a\u0010;\u001a\u00020\t2\b\u0010:\u001a\u0004\u0018\u000109H\u0096\u0002¢\u0006\u0004\b;\u0010<R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010@R\u001b\u0010D\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010\u0014R*\u0010F\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020\u000b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bF\u0010@\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006N"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/paperstyle/threecolumns/SquareThreeColumnPaperStyle;", "Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;", "", "paperWidth", "paperHeight", "leftPadding", "topPadding", "rightPadding", "bottomPadding", "", "horizontalFlip", "", "nameStrRes", "<init>", "(FFLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;I)V", "Landroid/graphics/RectF;", "calculateContainerPadding", "()Landroid/graphics/RectF;", "Lcom/orion/notein/domain/models/papertheme/paperstyle/NewSquarePaperStyle;", "generateSquarePaperStyle", "()Lcom/orion/notein/domain/models/papertheme/paperstyle/NewSquarePaperStyle;", "getBaseLinePaperPadding", "LoO00ooO/OooOooO;", "updateBaseLinePaperStyle", "()V", "getVerticalRedLineX", "()F", "padding", "Lcom/orion/penkit/models/Line;", "getTopHorizontalRedLine", "(Landroid/graphics/RectF;)Lcom/orion/penkit/models/Line;", "getMidHorizontalRedLine", "getBottomHorizontalRedLine", "getRenderPadding", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "scale", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "renderTargetViewport", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;FLandroid/graphics/RectF;)V", "Landroid/graphics/Canvas;", "canvas", "normRegionBounds", "regionWidthPx", "regionHeightPx", "drawRegion", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;II)Z", "initPath", "Landroid/content/res/Resources;", "res", "", "getName", "(Landroid/content/res/Resources;)Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getHorizontalFlip", "()Ljava/lang/Boolean;", "I", "basePaperStyle$delegate", "LoO00ooO/OooOO0;", "getBasePaperStyle", "basePaperStyle", "value", "defaultColor", "getDefaultColor", "()I", "setDefaultColor", "(I)V", "Landroid/graphics/Paint;", "redPaint", "Landroid/graphics/Paint;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public class SquareThreeColumnPaperStyle extends PaperStyle {

    /* JADX INFO: renamed from: basePaperStyle$delegate, reason: from kotlin metadata */
    private final InterfaceC32440OooOO0 basePaperStyle;
    private int defaultColor;

    @Expose
    private final Boolean horizontalFlip;
    private final int nameStrRes;
    private final Paint redPaint;

    public SquareThreeColumnPaperStyle() {
        this(0.0f, 0.0f, null, null, null, null, null, 0, 255, null);
    }

    private final RectF calculateContainerPadding() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final NewSquarePaperStyle generateSquarePaperStyle() {
        RectF baseLinePaperPadding = getBaseLinePaperPadding();
        return new NewSquarePaperStyle(getPaperWidth(), getPaperHeight(), null, null, Float.valueOf(baseLinePaperPadding.left), Float.valueOf(baseLinePaperPadding.top), Float.valueOf(baseLinePaperPadding.right), Float.valueOf(baseLinePaperPadding.bottom));
    }

    private final RectF getBaseLinePaperPadding() {
        return getPaperWidth() < getPaperHeight() ? PaperStyle.INSTANCE.getLINE_STYLE_V_PADDING() : PaperStyle.INSTANCE.getLINE_STYLE_H_PADDING();
    }

    private final NewSquarePaperStyle getBasePaperStyle() {
        return (NewSquarePaperStyle) this.basePaperStyle.getValue();
    }

    private final Line getBottomHorizontalRedLine(RectF padding) {
        float f = padding.left;
        float paperWidth = getPaperWidth() - padding.right;
        Line bottomHorizontalLine = getBasePaperStyle().getBottomHorizontalLine();
        return new Line(new PointF(f, bottomHorizontalLine.getA().y), new PointF(paperWidth, bottomHorizontalLine.getA().y));
    }

    private final Line getMidHorizontalRedLine(RectF padding) {
        float paperHeight;
        float fOooO0oO;
        float f = padding.left;
        float paperWidth = getPaperWidth() - padding.right;
        if (getPaperWidth() < getPaperHeight()) {
            paperHeight = getPaperHeight();
            fOooO0oO = o000000O.OooO0oO(240);
        } else {
            paperHeight = getPaperHeight();
            fOooO0oO = o000000O.OooO0oO(200);
        }
        Line horizontalLineByY = getBasePaperStyle().getHorizontalLineByY(paperHeight - fOooO0oO);
        return new Line(new PointF(f, horizontalLineByY.getA().y), new PointF(paperWidth, horizontalLineByY.getA().y));
    }

    private final Line getTopHorizontalRedLine(RectF padding) {
        float f = padding.left;
        float paperWidth = getPaperWidth() - padding.right;
        Line topHorizontalLine = getBasePaperStyle().getTopHorizontalLine();
        return new Line(new PointF(f, topHorizontalLine.getA().y), new PointF(paperWidth, topHorizontalLine.getA().y));
    }

    private final float getVerticalRedLineX() {
        return (OooOOO0.OooO0O0(this.horizontalFlip, Boolean.TRUE) ? getBasePaperStyle().getVerticalLineByX(getPaperWidth() - o000000O.OooO0oO(210)) : getBasePaperStyle().getVerticalLineByX(o000000O.OooO0oO(210))).getA().x;
    }

    private final void updateBaseLinePaperStyle() {
        getBasePaperStyle().setPaperWidth(getPaperWidth());
        getBasePaperStyle().setPaperHeight(getPaperHeight());
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public boolean drawRegion(Canvas canvas, RectF normRegionBounds, int regionWidthPx, int regionHeightPx) {
        OooOOO0.OooO0oO(canvas, "canvas");
        OooOOO0.OooO0oO(normRegionBounds, "normRegionBounds");
        super.initPath();
        updateBaseLinePaperStyle();
        getBasePaperStyle().drawRegion(canvas, normRegionBounds, regionWidthPx, regionHeightPx);
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
        RectF rectFCalculateContainerPadding = calculateContainerPadding();
        float strokeWidth = this.redPaint.getStrokeWidth();
        Line topHorizontalRedLine = getTopHorizontalRedLine(rectFCalculateContainerPadding);
        if ((getPaperHeight() * rectF.top) - strokeWidth <= topHorizontalRedLine.getA().y) {
            if (topHorizontalRedLine.getA().y <= (getPaperHeight() * rectF.bottom) + strokeWidth) {
                float fMax = Math.max(0.0f, topHorizontalRedLine.getA().x - (getPaperWidth() * rectF.left));
                float fMin = Math.min(topHorizontalRedLine.getB().x - (getPaperWidth() * rectF.left), getPaperWidth() * (rectF.right - rectF.left));
                path.moveTo(fMax, topHorizontalRedLine.getA().y - (getPaperHeight() * rectF.top));
                path.lineTo(fMin, topHorizontalRedLine.getA().y - (getPaperHeight() * rectF.top));
            }
        }
        Line midHorizontalRedLine = getMidHorizontalRedLine(rectFCalculateContainerPadding);
        if ((getPaperHeight() * rectF.top) - strokeWidth <= midHorizontalRedLine.getA().y) {
            if (midHorizontalRedLine.getA().y <= (getPaperHeight() * rectF.bottom) + strokeWidth) {
                float fMax2 = Math.max(0.0f, midHorizontalRedLine.getA().x - (getPaperWidth() * rectF.left));
                float fMin2 = Math.min(midHorizontalRedLine.getB().x - (getPaperWidth() * rectF.left), getPaperWidth() * (rectF.right - rectF.left));
                path.moveTo(fMax2, midHorizontalRedLine.getA().y - (getPaperHeight() * rectF.top));
                path.lineTo(fMin2, midHorizontalRedLine.getA().y - (getPaperHeight() * rectF.top));
            }
        }
        Line bottomHorizontalRedLine = getBottomHorizontalRedLine(rectFCalculateContainerPadding);
        if (getPaperHeight() * rectF.top <= bottomHorizontalRedLine.getA().y - strokeWidth) {
            if (bottomHorizontalRedLine.getA().y <= (getPaperHeight() * rectF.bottom) + strokeWidth) {
                float fMax3 = Math.max(0.0f, bottomHorizontalRedLine.getA().x - (getPaperWidth() * rectF.left));
                float fMin3 = Math.min(bottomHorizontalRedLine.getB().x - (getPaperWidth() * rectF.left), getPaperWidth() * (rectF.right - rectF.left));
                path.moveTo(fMax3, bottomHorizontalRedLine.getA().y - (getPaperHeight() * rectF.top));
                path.lineTo(fMin3, bottomHorizontalRedLine.getA().y - (getPaperHeight() * rectF.top));
            }
        }
        float verticalRedLineX = getVerticalRedLineX();
        if ((getPaperWidth() * rectF.left) - strokeWidth <= verticalRedLineX) {
            if (verticalRedLineX <= (getPaperWidth() * rectF.right) + strokeWidth) {
                float fMax4 = Math.max(0.0f, topHorizontalRedLine.getA().y - (getPaperHeight() * rectF.top));
                float fMin4 = Math.min(midHorizontalRedLine.getB().y - (getPaperHeight() * rectF.top), getPaperHeight() * (rectF.bottom - rectF.top));
                float fMax5 = Math.max(0.0f, verticalRedLineX - (getPaperWidth() * rectF.left));
                path.moveTo(fMax5, fMax4);
                path.lineTo(fMax5, fMin4);
            }
        }
        Matrix matrix = new Matrix();
        matrix.postScale(regionWidthPx / (getPaperWidth() * normRegionBounds.width()), regionHeightPx / (getPaperHeight() * normRegionBounds.height()));
        path.transform(matrix);
        Paint paint = new Paint();
        paint.set(this.redPaint);
        OooO0O0.OooO0O0(matrix, this.redPaint.getStrokeWidth(), paint);
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        canvas.drawPath(path, paint);
        return true;
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !getClass().equals(other.getClass())) {
            return false;
        }
        SquareThreeColumnPaperStyle squareThreeColumnPaperStyle = (SquareThreeColumnPaperStyle) other;
        return getPaperWidth() == squareThreeColumnPaperStyle.getPaperWidth() && getPaperHeight() == squareThreeColumnPaperStyle.getPaperHeight() && OooOOO0.OooO0O0(this.horizontalFlip, squareThreeColumnPaperStyle.horizontalFlip);
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public int getDefaultColor() {
        return this.defaultColor;
    }

    public final Boolean getHorizontalFlip() {
        return this.horizontalFlip;
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public String getName(Resources res) {
        OooOOO0.OooO0oO(res, "res");
        String string = res.getString(this.nameStrRes);
        OooOOO0.OooO0o(string, "getString(...)");
        return string;
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public RectF getRenderPadding() {
        return getBasePaperStyle().getRenderPadding();
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public void initPath() {
        super.initPath();
        updateBaseLinePaperStyle();
        getBasePaperStyle().initPath();
        getPathList().addAll(getBasePaperStyle().getPathList());
        Path path = new Path();
        RectF rectFCalculateContainerPadding = calculateContainerPadding();
        Line topHorizontalRedLine = getTopHorizontalRedLine(rectFCalculateContainerPadding);
        path.moveTo(topHorizontalRedLine.getA().x, topHorizontalRedLine.getA().y);
        path.lineTo(topHorizontalRedLine.getB().x, topHorizontalRedLine.getB().y);
        Line midHorizontalRedLine = getMidHorizontalRedLine(rectFCalculateContainerPadding);
        path.moveTo(midHorizontalRedLine.getA().x, midHorizontalRedLine.getA().y);
        path.lineTo(midHorizontalRedLine.getB().x, midHorizontalRedLine.getB().y);
        Line bottomHorizontalRedLine = getBottomHorizontalRedLine(rectFCalculateContainerPadding);
        path.moveTo(bottomHorizontalRedLine.getA().x, bottomHorizontalRedLine.getA().y);
        path.lineTo(bottomHorizontalRedLine.getB().x, bottomHorizontalRedLine.getB().y);
        float verticalRedLineX = getVerticalRedLineX();
        path.moveTo(verticalRedLineX, topHorizontalRedLine.getA().y);
        path.lineTo(verticalRedLineX, midHorizontalRedLine.getA().y);
        C21559Oooo0oO.OooO0O0(path, this.redPaint, getPathList());
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
        getBasePaperStyle().setDefaultColor(i);
    }

    public /* synthetic */ SquareThreeColumnPaperStyle(float f, float f2, Float f3, Float f4, Float f5, Float f6, Boolean bool, int i, int i2, C24018OooO0oo c24018OooO0oo) {
        this((i2 & 1) != 0 ? o000000O.OooO0o0(595.0f) : f, (i2 & 2) != 0 ? o000000O.OooO0o0(842.0f) : f2, (i2 & 4) != 0 ? null : f3, (i2 & 8) != 0 ? null : f4, (i2 & 16) != 0 ? null : f5, (i2 & 32) != 0 ? null : f6, (i2 & 64) != 0 ? null : bool, (i2 & 128) != 0 ? R.string.paper_style_cornell_04 : i);
    }

    public SquareThreeColumnPaperStyle(float f, float f2, Float f3, Float f4, Float f5, Float f6, Boolean bool, int i) {
        super(f, f2, f3, f4, f5, f6);
        this.horizontalFlip = bool;
        this.nameStrRes = i;
        this.basePaperStyle = C20519OooO0Oo.OooO0OO(new C29576OooO0O0(this, 0));
        this.defaultColor = Color.parseColor("#C3D0E0");
        Paint paintOooO00o = C22234OoooOo0.OooO00o(true, true);
        paintOooO00o.setStyle(Paint.Style.STROKE);
        paintOooO00o.setStrokeWidth(o000000O.OooO0o0(1.0f));
        paintOooO00o.setColor(Color.parseColor("#C4151D"));
        this.redPaint = paintOooO00o;
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public <T> void render(OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale, RectF renderTargetViewport) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        OooOOO0.OooO0oO(renderTargetViewport, "renderTargetViewport");
        updateBaseLinePaperStyle();
        getBasePaperStyle().render(renderEngine, renderTarget, scale, renderTargetViewport);
        float fWidth = renderTargetViewport.width();
        float fHeight = renderTargetViewport.height();
        float paperWidth = fWidth / getPaperWidth();
        float paperHeight = fHeight / getPaperHeight();
        OooO00o.C19734OooO00o.OooO00o(renderEngine, this.redPaint.getColor(), this.redPaint.getStrokeWidth() * paperWidth, 0, 0, false, 24);
        RectF rectFCalculateContainerPadding = calculateContainerPadding();
        Line topHorizontalRedLine = getTopHorizontalRedLine(rectFCalculateContainerPadding);
        float f = (topHorizontalRedLine.getA().x * paperWidth) + renderTargetViewport.left;
        com.aspose.words.OooO00o.OooO00o(topHorizontalRedLine.getA().y, paperHeight, renderTargetViewport.top, renderEngine, f);
        float f2 = (topHorizontalRedLine.getB().x * paperWidth) + renderTargetViewport.left;
        C22235OoooOoO.OooO00o(topHorizontalRedLine.getB().y, paperHeight, renderTargetViewport.top, renderEngine, f2);
        Line midHorizontalRedLine = getMidHorizontalRedLine(rectFCalculateContainerPadding);
        float f3 = (midHorizontalRedLine.getA().x * paperWidth) + renderTargetViewport.left;
        com.aspose.words.OooO00o.OooO00o(midHorizontalRedLine.getA().y, paperHeight, renderTargetViewport.top, renderEngine, f3);
        float f4 = (midHorizontalRedLine.getB().x * paperWidth) + renderTargetViewport.left;
        C22235OoooOoO.OooO00o(midHorizontalRedLine.getB().y, paperHeight, renderTargetViewport.top, renderEngine, f4);
        Line bottomHorizontalRedLine = getBottomHorizontalRedLine(rectFCalculateContainerPadding);
        float f5 = (bottomHorizontalRedLine.getA().x * paperWidth) + renderTargetViewport.left;
        com.aspose.words.OooO00o.OooO00o(bottomHorizontalRedLine.getA().y, paperHeight, renderTargetViewport.top, renderEngine, f5);
        float f6 = (bottomHorizontalRedLine.getB().x * paperWidth) + renderTargetViewport.left;
        C22235OoooOoO.OooO00o(bottomHorizontalRedLine.getB().y, paperHeight, renderTargetViewport.top, renderEngine, f6);
        float verticalRedLineX = getVerticalRedLineX() * paperWidth;
        float f7 = renderTargetViewport.left + verticalRedLineX;
        com.aspose.words.OooO00o.OooO00o(topHorizontalRedLine.getA().y, paperHeight, renderTargetViewport.top, renderEngine, f7);
        float f8 = renderTargetViewport.left + verticalRedLineX;
        C22235OoooOoO.OooO00o(midHorizontalRedLine.getA().y, paperHeight, renderTargetViewport.top, renderEngine, f8);
        renderEngine.OooOOOO(1.0f);
    }
}
