package com.orion.notein.domain.models.papertheme.paperstyle;

import Oooo0.o000000O;
import Oooo0oO.C21036OooOOo0;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.appcompat.widget.C21559Oooo0oO;
import com.aspose.slides.C22234OoooOo0;
import com.aspose.words.OooO0O0;
import com.aspose.words.OooO0OO;
import com.google.gson.annotations.Expose;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0O0oo00.OooO00o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0016\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0004¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u001a\u001a\u00020\t\"\u0004\b\u0000\u0010\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJA\u0010\u001a\u001a\u00020\t\"\u0004\b\u0000\u0010\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001a\u0010\u001eJ/\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010\u000bJ\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020$2\b\u0010.\u001a\u0004\u0018\u00010-H\u0096\u0002¢\u0006\u0004\b/\u00100R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b4\u00103R\u0014\u00105\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0014\u00108\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00106R\u0014\u00109\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00106R*\u0010;\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u00118\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010\u0013\"\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006B"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/paperstyle/DotPaperStyle;", "Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;", "", "paperWidth", "paperHeight", "foregroundAlpha", "requiredItemSpace", "<init>", "(FFLjava/lang/Float;Ljava/lang/Float;)V", "LoO00ooO/OooOooO;", "checkPaintColor", "()V", "getItemSpace", "()F", "Landroid/graphics/Paint;", "getSolidPaint", "()Landroid/graphics/Paint;", "", "getSolidColor", "()I", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "scale", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "Landroid/graphics/RectF;", "renderTargetViewport", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;FLandroid/graphics/RectF;)V", "Landroid/graphics/Canvas;", "canvas", "normRegionBounds", "regionWidthPx", "regionHeightPx", "", "drawRegion", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;II)Z", "initPath", "Landroid/content/res/Resources;", "res", "", "getName", "(Landroid/content/res/Resources;)Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Float;", "getForegroundAlpha", "()Ljava/lang/Float;", "getRequiredItemSpace", "marginX", "F", "marginY", "defaultItemSpace", "dotWidth", "value", "defaultColor", "I", "getDefaultColor", "setDefaultColor", "(I)V", "solidPaint", "Landroid/graphics/Paint;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public class DotPaperStyle extends PaperStyle {
    private int defaultColor;
    private final float defaultItemSpace;
    private final float dotWidth;

    @Expose
    private final Float foregroundAlpha;
    private final float marginX;
    private final float marginY;

    @Expose
    private final Float requiredItemSpace;
    private final Paint solidPaint;

    public DotPaperStyle() {
        this(0.0f, 0.0f, null, null, 15, null);
    }

    private final void checkPaintColor() {
        int solidColor = getSolidColor();
        if (this.solidPaint.getColor() != solidColor) {
            this.solidPaint.setColor(solidColor);
        }
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public boolean drawRegion(Canvas canvas, RectF normRegionBounds, int regionWidthPx, int regionHeightPx) {
        boolean z = true;
        OooOOO0.OooO0oO(canvas, "canvas");
        OooOOO0.OooO0oO(normRegionBounds, "normRegionBounds");
        super.initPath();
        checkPaintColor();
        float itemSpace = getItemSpace();
        float paperWidth = itemSpace - ((((getPaperWidth() * normRegionBounds.left) - this.marginX) + itemSpace) % itemSpace);
        if (normRegionBounds.left < 0.0f) {
            paperWidth = itemSpace - (((getPaperWidth() * 0.0f) - this.marginX) % itemSpace);
        }
        float paperHeight = itemSpace - ((((getPaperHeight() * normRegionBounds.top) - this.marginY) + itemSpace) % itemSpace);
        if (normRegionBounds.top < 0.0f) {
            paperHeight = itemSpace - (((getPaperHeight() * 0.0f) - this.marginY) % itemSpace);
        }
        Path path = new Path();
        int i = -1;
        while (true) {
            int i2 = i + 1;
            float f = (i * itemSpace) + paperHeight;
            if (f > (getPaperHeight() * normRegionBounds.height()) + itemSpace) {
                Matrix matrix = new Matrix();
                matrix.postScale(regionWidthPx / (getPaperWidth() * normRegionBounds.width()), regionHeightPx / (getPaperHeight() * normRegionBounds.height()));
                path.transform(matrix);
                Paint paint = new Paint();
                paint.set(this.solidPaint);
                OooO0O0.OooO0O0(matrix, this.solidPaint.getStrokeWidth(), paint);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                canvas.drawPath(path, paint);
                return z;
            }
            int i3 = -1;
            while (true) {
                int i4 = i3 + 1;
                float f2 = (i3 * itemSpace) + paperWidth;
                if (f2 > (getPaperWidth() * normRegionBounds.width()) + itemSpace) {
                    break;
                }
                path.addCircle(f2, f, this.dotWidth, Path.Direction.CW);
                i3 = i4;
                z = true;
            }
            i = i2;
        }
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !getClass().equals(other.getClass())) {
            return false;
        }
        DotPaperStyle dotPaperStyle = (DotPaperStyle) other;
        if (getPaperWidth() == dotPaperStyle.getPaperWidth() && getPaperHeight() == dotPaperStyle.getPaperHeight()) {
            Float f = this.requiredItemSpace;
            Float fValueOf = Float.valueOf(f != null ? f.floatValue() : this.defaultItemSpace);
            Float fValueOf2 = dotPaperStyle.requiredItemSpace;
            if (fValueOf2 == null) {
                fValueOf2 = Float.valueOf(this.defaultItemSpace);
            }
            if (fValueOf.equals(fValueOf2)) {
                Float f2 = this.foregroundAlpha;
                Float fValueOf3 = Float.valueOf(f2 != null ? f2.floatValue() : 1.0f);
                Float fValueOf4 = dotPaperStyle.foregroundAlpha;
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

    public final Float getForegroundAlpha() {
        return this.foregroundAlpha;
    }

    public final float getItemSpace() {
        Float f = this.requiredItemSpace;
        return f != null ? f.floatValue() : this.defaultItemSpace;
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public String getName(Resources res) {
        return OooO0OO.OooO00o(res, "res", R.string.paper_style_dot, "getString(...)");
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

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public void initPath() {
        super.initPath();
        checkPaintColor();
        Path path = new Path();
        float itemSpace = getItemSpace();
        int i = 0;
        while (true) {
            float f = this.marginX;
            int i2 = i + 1;
            float f2 = (i * itemSpace) + this.marginY;
            if (f2 > getPaperHeight()) {
                C21559Oooo0oO.OooO0O0(path, this.solidPaint, getPathList());
                return;
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                float f3 = (i3 * itemSpace) + f;
                if (f3 > getPaperWidth()) {
                    break;
                }
                path.addCircle(f3, f2, this.dotWidth, Path.Direction.CW);
                i3 = i4;
            }
            i = i2;
        }
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
        this.solidPaint.setColor(getSolidColor());
    }

    public /* synthetic */ DotPaperStyle(float f, float f2, Float f3, Float f4, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? o000000O.OooO0o0(595.0f) : f, (i & 2) != 0 ? o000000O.OooO0o0(842.0f) : f2, (i & 4) != 0 ? null : f3, (i & 8) != 0 ? null : f4);
    }

    public DotPaperStyle(float f, float f2, Float f3, Float f4) {
        super(f, f2, null, null, null, null, 60, null);
        this.foregroundAlpha = f3;
        this.requiredItemSpace = f4;
        this.marginX = o000000O.OooO0o0(2.0f);
        this.marginY = o000000O.OooO0o0(2.0f);
        this.defaultItemSpace = o000000O.OooO0o0(34.0f);
        this.dotWidth = o000000O.OooO0o0(1.0f);
        this.defaultColor = Color.parseColor("#C3D0E0");
        Paint paintOooO00o = C22234OoooOo0.OooO00o(true, true);
        paintOooO00o.setColor(getDefaultColor());
        paintOooO00o.setStyle(Paint.Style.FILL);
        this.solidPaint = paintOooO00o;
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
        OooO00o.C19734OooO00o.OooO00o(renderEngine, getSolidColor(), 0.0f, 1, 0, false, 24);
        float itemSpace = getItemSpace();
        int i = 0;
        while (true) {
            float f = (this.marginX * paperWidth) + renderTargetViewport.left;
            float f2 = renderTargetViewport.top;
            int i2 = i + 1;
            float f3 = (itemSpace * paperHeight * i) + (this.marginY * paperHeight) + f2;
            if (f3 > (getPaperHeight() * paperHeight) + f2) {
                renderEngine.OooOOOO(1.0f);
                return;
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                float f4 = (itemSpace * paperWidth * i3) + f;
                if (f4 > (getPaperWidth() * paperWidth) + renderTargetViewport.left) {
                    break;
                }
                renderEngine.OooOOOo(f4, f3, this.dotWidth * paperWidth);
                i3 = i4;
            }
            i = i2;
        }
    }
}
