package com.orion.notein.domain.models.papertheme.paperstyle;

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
import com.aspose.words.OooO0O0;
import com.aspose.words.OooO0OO;
import com.google.gson.annotations.Expose;
import com.orion.notein.global.R;
import com.orion.penkit.models.Line;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0O0oo00.OooO00o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO0O00O.OooO00o;
import oO0O00oo.OooOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0016\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010\u0012J9\u0010'\u001a\u00020\r\"\u0004\b\u0000\u0010!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$2\u0006\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(JA\u0010'\u001a\u00020\r\"\u0004\b\u0000\u0010!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0010H\u0016¢\u0006\u0004\b'\u0010*J/\u00101\u001a\u0002002\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u001dH\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\rH\u0016¢\u0006\u0004\b3\u0010\u000fJ\u0017\u00107\u001a\u0002062\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b7\u00108J\u001a\u0010;\u001a\u0002002\b\u0010:\u001a\u0004\u0018\u000109H\u0096\u0002¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\u00020\u00142\u0006\u0010=\u001a\u00020\u0002¢\u0006\u0004\b>\u0010?J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010@J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010@R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bD\u0010CR\u0014\u0010E\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR*\u0010H\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020\u001d8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010\u001f\"\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010N¨\u0006P"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/paperstyle/NewLinePaperStyle;", "Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;", "", "paperWidth", "paperHeight", "foregroundAlpha", "requiredItemSpace", "leftPadding", "topPadding", "rightPadding", "bottomPadding", "<init>", "(FFLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "LoO00ooO/OooOooO;", "checkPaintColor", "()V", "Landroid/graphics/RectF;", "calculatePadding", "()Landroid/graphics/RectF;", "padding", "Lcom/orion/penkit/models/Line;", "getTopHorizontalLine", "(Landroid/graphics/RectF;)Lcom/orion/penkit/models/Line;", "getBottomHorizontalLine", "getItemSpace", "()F", "Landroid/graphics/Paint;", "getSolidPaint", "()Landroid/graphics/Paint;", "", "getSolidColor", "()I", "getRenderPadding", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "scale", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "renderTargetViewport", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;FLandroid/graphics/RectF;)V", "Landroid/graphics/Canvas;", "canvas", "normRegionBounds", "regionWidthPx", "regionHeightPx", "", "drawRegion", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;II)Z", "initPath", "Landroid/content/res/Resources;", "res", "", "getName", "(Landroid/content/res/Resources;)Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "y", "getHorizontalLineByY", "(F)Lcom/orion/penkit/models/Line;", "()Lcom/orion/penkit/models/Line;", "Ljava/lang/Float;", "getForegroundAlpha", "()Ljava/lang/Float;", "getRequiredItemSpace", "defaultItemSpace", "F", "value", "defaultColor", "I", "getDefaultColor", "setDefaultColor", "(I)V", "boldSolidPaint", "Landroid/graphics/Paint;", "solidPaint", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public class NewLinePaperStyle extends PaperStyle {
    private final Paint boldSolidPaint;
    private int defaultColor;
    private final float defaultItemSpace;

    @Expose
    private final Float foregroundAlpha;

    @Expose
    private final Float requiredItemSpace;
    private final Paint solidPaint;

    public NewLinePaperStyle() {
        this(0.0f, 0.0f, null, null, null, null, null, null, 255, null);
    }

    private final RectF calculatePadding() {
        RectF rectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
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

    private final void checkPaintColor() {
        int solidColor = getSolidColor();
        if (this.solidPaint.getColor() != solidColor) {
            this.solidPaint.setColor(solidColor);
        }
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
        RectF rectFCalculatePadding = calculatePadding();
        float itemSpace = getItemSpace();
        float strokeWidth = this.solidPaint.getStrokeWidth();
        float paperWidth = getPaperWidth() * rectF.left;
        float paperWidth2 = (getPaperWidth() * rectF.right) - paperWidth;
        float f5 = rectFCalculatePadding.left;
        float paperWidth3 = getPaperWidth() - rectFCalculatePadding.right;
        float fOooO0o0 = OooOO0.OooO0o0(f5 - paperWidth, 0.0f, paperWidth2);
        float fOooO0o02 = OooOO0.OooO0o0(paperWidth3 - paperWidth, 0.0f, paperWidth2);
        Math.max(fOooO0o0, itemSpace - (((getPaperWidth() * rectF.left) - rectFCalculatePadding.left) % itemSpace));
        float paperHeight = getPaperHeight() * rectF.top;
        float paperHeight2 = (getPaperHeight() * rectF.bottom) - paperHeight;
        float f6 = rectFCalculatePadding.top;
        float paperHeight3 = getPaperHeight() - rectFCalculatePadding.bottom;
        float f7 = f6 - paperHeight;
        float f8 = f7 >= 0.0f ? f7 : 0.0f;
        float f9 = paperHeight3 - paperHeight;
        if (f9 <= paperHeight2) {
            paperHeight2 = f9;
        }
        float fMax = Math.max(f8, itemSpace - (((getPaperHeight() * rectF.top) - rectFCalculatePadding.top) % itemSpace));
        Path path = new Path();
        int i = -1;
        while (true) {
            int i2 = i + 1;
            float f10 = (i * itemSpace) + fMax;
            if (f10 >= f8 - strokeWidth) {
                if (f10 > paperHeight2 + strokeWidth) {
                    break;
                }
                path.moveTo(fOooO0o0, f10);
                path.lineTo(fOooO0o02, f10);
            }
            i = i2;
        }
        Path path2 = new Path();
        float strokeWidth2 = this.boldSolidPaint.getStrokeWidth();
        Line topHorizontalLine = getTopHorizontalLine(rectFCalculatePadding);
        if ((getPaperHeight() * rectF.top) - strokeWidth2 <= topHorizontalLine.getA().y) {
            if (topHorizontalLine.getA().y <= (getPaperHeight() * rectF.bottom) + strokeWidth) {
                path2.moveTo(fOooO0o0, topHorizontalLine.getA().y - (getPaperHeight() * rectF.top));
                path2.lineTo(fOooO0o02, topHorizontalLine.getA().y - (getPaperHeight() * rectF.top));
            }
        }
        Matrix matrix = new Matrix();
        matrix.postScale(regionWidthPx / (getPaperWidth() * normRegionBounds.width()), regionHeightPx / (getPaperHeight() * normRegionBounds.height()));
        path.transform(matrix);
        Paint paint = new Paint();
        paint.set(this.solidPaint);
        OooO0O0.OooO0O0(matrix, this.solidPaint.getStrokeWidth(), paint);
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        canvas.drawPath(path, paint);
        path2.transform(matrix);
        Paint paint2 = new Paint();
        paint2.set(this.boldSolidPaint);
        OooO0O0.OooO0O0(matrix, this.boldSolidPaint.getStrokeWidth(), paint2);
        canvas.drawPath(path2, paint2);
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
        NewLinePaperStyle newLinePaperStyle = (NewLinePaperStyle) other;
        if (getPaperWidth() == newLinePaperStyle.getPaperWidth() && getPaperHeight() == newLinePaperStyle.getPaperHeight()) {
            Float f = this.requiredItemSpace;
            Float fValueOf = Float.valueOf(f != null ? f.floatValue() : this.defaultItemSpace);
            Float fValueOf2 = newLinePaperStyle.requiredItemSpace;
            if (fValueOf2 == null) {
                fValueOf2 = Float.valueOf(this.defaultItemSpace);
            }
            if (fValueOf.equals(fValueOf2)) {
                Float f2 = this.foregroundAlpha;
                Float fValueOf3 = Float.valueOf(f2 != null ? f2.floatValue() : 1.0f);
                Float fValueOf4 = newLinePaperStyle.foregroundAlpha;
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

    public final Line getBottomHorizontalLine() {
        return getBottomHorizontalLine(calculatePadding());
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public int getDefaultColor() {
        return this.defaultColor;
    }

    public final Float getForegroundAlpha() {
        return this.foregroundAlpha;
    }

    public final Line getHorizontalLineByY(float y) {
        RectF rectFCalculatePadding = calculatePadding();
        float itemSpace = getItemSpace();
        float f = rectFCalculatePadding.top;
        float f2 = getTopHorizontalLine(rectFCalculatePadding).getA().y;
        float f3 = getBottomHorizontalLine(rectFCalculatePadding).getA().y;
        float fOooO0O0 = (itemSpace * OooO00o.OooO0O0(((y - f) + 0.5f) / itemSpace)) + f;
        if (fOooO0O0 >= f2) {
            f2 = fOooO0O0;
        }
        if (f2 <= f3) {
            f3 = f2;
        }
        return new Line(new PointF(rectFCalculatePadding.left, f3), new PointF(getPaperWidth() - rectFCalculatePadding.right, f3));
    }

    public final float getItemSpace() {
        Float f = this.requiredItemSpace;
        return f != null ? f.floatValue() : this.defaultItemSpace;
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public String getName(Resources res) {
        return OooO0OO.OooO00o(res, "res", R.string.paper_style_lines, "getString(...)");
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public RectF getRenderPadding() {
        return calculatePadding();
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
        checkPaintColor();
        return new Paint(this.solidPaint);
    }

    public final Line getTopHorizontalLine() {
        return getTopHorizontalLine(calculatePadding());
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public void initPath() {
        super.initPath();
        checkPaintColor();
        Path path = new Path();
        RectF rectFCalculatePadding = calculatePadding();
        float itemSpace = getItemSpace();
        float f = rectFCalculatePadding.left;
        float f2 = rectFCalculatePadding.top;
        int i = 0;
        float fMax = 0.0f;
        while (true) {
            int i2 = i + 1;
            float f3 = (i * itemSpace) + f2;
            if (f3 > getPaperHeight() - rectFCalculatePadding.bottom) {
                getPathList().add(new C32443OooOOO<>(path, this.solidPaint));
                Path path2 = new Path();
                path2.moveTo(f, f2);
                path2.lineTo(getPaperWidth() - rectFCalculatePadding.right, f2);
                C21559Oooo0oO.OooO0O0(path2, this.boldSolidPaint, getPathList());
                return;
            }
            path.moveTo(f, f3);
            path.lineTo(getPaperWidth() - rectFCalculatePadding.right, f3);
            fMax = Math.max(fMax, f3);
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public <T> void render(o0O0oo00.OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale) {
        C32443OooOOO c32443OooOOOOooO0OO = C21036OooOOo0.OooO0OO(renderEngine, "renderEngine", renderTarget, "renderTarget");
        render(renderEngine, renderTarget, scale, new RectF(0.0f, 0.0f, ((Number) c32443OooOOOOooO0OO.f116638OooOo0o).floatValue(), ((Number) c32443OooOOOOooO0OO.f116637OooOo).floatValue()));
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public void setDefaultColor(int i) {
        this.defaultColor = i;
        int solidColor = getSolidColor();
        this.solidPaint.setColor(solidColor);
        this.boldSolidPaint.setColor(solidColor);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ NewLinePaperStyle(float r2, float r3, java.lang.Float r4, java.lang.Float r5, java.lang.Float r6, java.lang.Float r7, java.lang.Float r8, java.lang.Float r9, int r10, kotlin.jvm.internal.C24018OooO0oo r11) {
        /*
            r1 = this;
            r11 = r10 & 1
            if (r11 == 0) goto Lb
            r2 = 1142210560(0x4414c000, float:595.0)
            float r2 = Oooo0.o000000O.OooO0o0(r2)
        Lb:
            r11 = r10 & 2
            if (r11 == 0) goto L16
            r3 = 1146257408(0x44528000, float:842.0)
            float r3 = Oooo0.o000000O.OooO0o0(r3)
        L16:
            r11 = r10 & 4
            r0 = 0
            if (r11 == 0) goto L1c
            r4 = r0
        L1c:
            r11 = r10 & 8
            if (r11 == 0) goto L21
            r5 = r0
        L21:
            r11 = r10 & 16
            if (r11 == 0) goto L26
            r6 = r0
        L26:
            r11 = r10 & 32
            if (r11 == 0) goto L2b
            r7 = r0
        L2b:
            r11 = r10 & 64
            if (r11 == 0) goto L30
            r8 = r0
        L30:
            r10 = r10 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L3e
            r11 = r0
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L47
        L3e:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L47:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.domain.models.papertheme.paperstyle.NewLinePaperStyle.<init>(float, float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, int, kotlin.jvm.internal.OooO0oo):void");
    }

    private final Line getBottomHorizontalLine(RectF padding) {
        float paperHeight = ((getPaperHeight() - padding.bottom) - ((((getPaperHeight() - padding.top) - padding.bottom) + 0.5f) % getItemSpace())) + 0.5f;
        return new Line(new PointF(padding.left, paperHeight), new PointF(getPaperWidth() - padding.right, paperHeight));
    }

    private final Line getTopHorizontalLine(RectF padding) {
        float f = padding.top;
        return new Line(new PointF(padding.left, f), new PointF(getPaperWidth() - padding.right, f));
    }

    public NewLinePaperStyle(float f, float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8) {
        super(f, f2, f5, f6, f7, f8);
        this.foregroundAlpha = f3;
        this.requiredItemSpace = f4;
        this.defaultItemSpace = o000000O.OooO0o0(25.0f);
        this.defaultColor = Color.parseColor("#C3D0E0");
        Paint paintOooO00o = C22234OoooOo0.OooO00o(true, true);
        paintOooO00o.setColor(getDefaultColor());
        Paint.Style style = Paint.Style.STROKE;
        paintOooO00o.setStyle(style);
        paintOooO00o.setStrokeWidth(o000000O.OooO0o0(1.0f));
        this.boldSolidPaint = paintOooO00o;
        Paint paintOooO00o2 = C22234OoooOo0.OooO00o(true, true);
        paintOooO00o2.setColor(getDefaultColor());
        paintOooO00o2.setStyle(style);
        paintOooO00o2.setStrokeWidth(o000000O.OooO0o0(0.5f));
        this.solidPaint = paintOooO00o2;
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public <T> void render(o0O0oo00.OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale, RectF renderTargetViewport) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        OooOOO0.OooO0oO(renderTargetViewport, "renderTargetViewport");
        RectF rectFCalculatePadding = calculatePadding();
        float fWidth = renderTargetViewport.width();
        float fHeight = renderTargetViewport.height();
        float paperWidth = fWidth / getPaperWidth();
        float paperHeight = fHeight / getPaperHeight();
        float itemSpace = getItemSpace();
        float f = (rectFCalculatePadding.left * paperWidth) + renderTargetViewport.left;
        float f2 = (rectFCalculatePadding.top * paperHeight) + renderTargetViewport.top;
        OooO00o.C19734OooO00o.OooO00o(renderEngine, getSolidColor(), this.solidPaint.getStrokeWidth() * paperWidth, 0, 0, false, 24);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            float f3 = (itemSpace * paperHeight * i) + f2;
            if (f3 > OooOO0.OooO0OO.OooO0O0(getPaperHeight(), rectFCalculatePadding.bottom, paperHeight, renderTargetViewport.top)) {
                renderEngine.OooOOOO(1.0f);
                OooO00o.C19734OooO00o.OooO00o(renderEngine, getSolidColor(), this.boldSolidPaint.getStrokeWidth() * paperWidth, 0, 0, false, 24);
                renderEngine.moveTo(f, f2);
                renderEngine.lineTo(OooOO0.OooO0OO.OooO0O0(getPaperWidth(), rectFCalculatePadding.right, paperWidth, renderTargetViewport.left), f2);
                renderEngine.OooOOOO(1.0f);
                return;
            }
            renderEngine.moveTo(f, f3);
            renderEngine.lineTo(OooOO0.OooO0OO.OooO0O0(getPaperWidth(), rectFCalculatePadding.right, paperWidth, renderTargetViewport.left), f3);
            i = i2;
        }
    }
}
