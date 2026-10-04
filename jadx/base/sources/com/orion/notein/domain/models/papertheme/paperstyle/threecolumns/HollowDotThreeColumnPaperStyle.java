package com.orion.notein.domain.models.papertheme.paperstyle.threecolumns;

import OooOO0.OooO0OO;
import Oooo0.o000000;
import Oooo0.o000000O;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.app.FrameMetricsAggregator;
import com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle;
import com.orion.notein.global.R;
import com.orion.penkit.models.Line;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0O0oo00.OooO00o;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0018\u001a\u00020\u00172\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JG\u0010\u001a\u001a\u00020\u00172\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0015H\u0014¢\u0006\u0004\b\u001a\u0010\u0019JA\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u00150\u001c2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/paperstyle/threecolumns/HollowDotThreeColumnPaperStyle;", "Lcom/orion/notein/domain/models/papertheme/paperstyle/threecolumns/HollowThreeColumnPaperStyle;", "", "paperWidth", "paperHeight", "foregroundAlpha", "requiredItemSpace", "", "horizontalFlip", "leftPadding", "topPadding", "rightPadding", "bottomPadding", "<init>", "(FFLjava/lang/Float;Ljava/lang/Float;ZLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "Lo0O0oo00/OooO00o;", "renderEngine", "Landroid/graphics/RectF;", "contentBounds", "holeBounds", "itemSpace", "LoO00ooO/OooOOO;", "scale", "LoO00ooO/OooOooO;", "drawDotPattern", "(Lo0O0oo00/OooO00o;Landroid/graphics/RectF;Landroid/graphics/RectF;FLoO00ooO/OooOOO;)V", "renderPattern", "regionBounds", "", "Landroid/graphics/Path;", "Landroid/graphics/Paint;", "renderPatternInRegion", "(Landroid/graphics/RectF;Landroid/graphics/RectF;FLandroid/graphics/RectF;)Ljava/util/List;", "Landroid/content/res/Resources;", "res", "", "getName", "(Landroid/content/res/Resources;)Ljava/lang/String;", "Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;", "duplicate", "(FF)Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;", "dotRadius", "F", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public class HollowDotThreeColumnPaperStyle extends HollowThreeColumnPaperStyle {
    private final float dotRadius;

    public HollowDotThreeColumnPaperStyle() {
        this(0.0f, 0.0f, null, null, false, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void drawDotPattern(OooO00o<?> renderEngine, RectF contentBounds, RectF holeBounds, float itemSpace, C32443OooOOO<Float, Float> scale) {
        float fFloatValue = scale.f116638OooOo0o.floatValue();
        float fFloatValue2 = scale.f116637OooOo.floatValue();
        OooO00o.C19734OooO00o.OooO00o(renderEngine, getSolidColor(), o000000O.OooO0o0(0.5f) * fFloatValue, 0, 0, false, 24);
        RectF rectFCalculatePadding = calculatePadding();
        float f = contentBounds.left;
        RectF rectF = new RectF((rectFCalculatePadding.left * fFloatValue) + f, (rectFCalculatePadding.top * fFloatValue2) + contentBounds.top, OooO0OO.OooO0O0(getPaperWidth(), rectFCalculatePadding.right, fFloatValue, f), OooO0OO.OooO0O0(getPaperHeight(), rectFCalculatePadding.bottom, fFloatValue2, contentBounds.top));
        float f2 = itemSpace * fFloatValue;
        float f3 = ((holeBounds.left - rectF.left) % f2) + (rectFCalculatePadding.left * fFloatValue);
        float f4 = itemSpace * fFloatValue2;
        float f5 = ((holeBounds.top - rectF.top) % f4) + (rectFCalculatePadding.top * fFloatValue2);
        Line horizontalRedLine = getHorizontalRedLine(rectFCalculatePadding);
        o000000.OooO0o0(fFloatValue, fFloatValue2, horizontalRedLine.getA());
        o000000.OooO0o0(fFloatValue, fFloatValue2, horizontalRedLine.getB());
        Line verticalRedLine = getVerticalRedLine(rectFCalculatePadding);
        o000000.OooO0o0(fFloatValue, fFloatValue2, verticalRedLine.getA());
        o000000.OooO0o0(fFloatValue, fFloatValue2, verticalRedLine.getB());
        float eps = getEPS() + ((getColumnPaint().getStrokeWidth() + this.dotRadius) * fFloatValue);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            float f6 = (i * f4) + f5;
            if (f6 > getEPS() + rectF.bottom) {
                renderEngine.OooOOOO(1.0f);
                return;
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                float f7 = (i3 * f2) + f3;
                if (f7 <= getEPS() + rectF.right) {
                    if (f6 >= holeBounds.bottom - getEPS()) {
                        if (f7 > getEPS() + holeBounds.left && f7 < holeBounds.right - getEPS()) {
                            if (f6 <= getEPS() + holeBounds.top || f6 >= holeBounds.bottom - getEPS()) {
                            }
                        } else if ((Math.abs(f6 - horizontalRedLine.getA().y) >= eps || f7 < horizontalRedLine.getA().x - eps || f7 > horizontalRedLine.getB().x + eps) && (Math.abs(f7 - verticalRedLine.getA().x) >= eps || f6 < verticalRedLine.getA().y - eps || f6 > verticalRedLine.getB().y + eps)) {
                            renderEngine.OooOOOo(f7, f6, this.dotRadius * fFloatValue);
                        }
                    } else if (!getHorizontalFlip()) {
                        if (f7 <= getEPS() + holeBounds.left) {
                        }
                    } else if (f7 >= holeBounds.right - getEPS()) {
                    }
                    i3 = i4;
                }
            }
            i = i2;
        }
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.HollowPaperStyle
    public PaperStyle duplicate(float paperWidth, float paperHeight) {
        return new HollowDotThreeColumnPaperStyle(paperWidth, paperHeight, getForegroundAlpha(), getRequiredItemSpace(), getHorizontalFlip(), null, null, null, null, 480, null);
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public String getName(Resources res) {
        return com.aspose.words.OooO0OO.OooO00o(res, "res", R.string.paper_style_dot_three_column, "getString(...)");
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.HollowPaperStyle
    public void renderPattern(OooO00o<?> renderEngine, RectF contentBounds, RectF holeBounds, float itemSpace, C32443OooOOO<Float, Float> scale) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(contentBounds, "contentBounds");
        OooOOO0.OooO0oO(holeBounds, "holeBounds");
        OooOOO0.OooO0oO(scale, "scale");
        drawDotPattern(renderEngine, contentBounds, holeBounds, itemSpace, scale);
        drawThreeColumnGuide(renderEngine, contentBounds, scale);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef  */
    @Override // com.orion.notein.domain.models.papertheme.paperstyle.HollowPaperStyle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<C32443OooOOO<Path, Paint>> renderPatternInRegion(RectF regionBounds, RectF contentBounds, float itemSpace, RectF holeBounds) {
        Line line;
        float f;
        OooOOO0.OooO0oO(regionBounds, "regionBounds");
        OooOOO0.OooO0oO(contentBounds, "contentBounds");
        OooOOO0.OooO0oO(holeBounds, "holeBounds");
        ArrayList arrayList = new ArrayList();
        RectF rectFCalculatePadding = calculatePadding();
        Path path = new Path();
        float f2 = regionBounds.left;
        float f3 = regionBounds.right - f2;
        float f4 = contentBounds.left;
        float f5 = contentBounds.right;
        float f6 = f4 - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        float f7 = f5 - f2;
        if (f7 <= f3) {
            f3 = f7;
        }
        float f8 = holeBounds.left;
        float f9 = (f8 % itemSpace) - f2;
        float f10 = regionBounds.top;
        float f11 = regionBounds.bottom - f10;
        float f12 = contentBounds.top;
        float f13 = contentBounds.bottom;
        float f14 = f12 - f10;
        float f15 = f14 >= 0.0f ? f14 : 0.0f;
        float f16 = f13 - f10;
        if (f16 <= f11) {
            f11 = f16;
        }
        float f17 = holeBounds.top;
        float f18 = (f17 % itemSpace) - f10;
        float f19 = f8 - f2;
        float f20 = holeBounds.right - f2;
        float f21 = f17 - f10;
        float f22 = holeBounds.bottom - f10;
        Line horizontalRedLine = getHorizontalRedLine(rectFCalculatePadding);
        float f23 = -f2;
        float f24 = -f10;
        horizontalRedLine.getA().offset(f23, f24);
        horizontalRedLine.getB().offset(f23, f24);
        Line verticalRedLine = getVerticalRedLine(rectFCalculatePadding);
        verticalRedLine.getA().offset(f23, f24);
        verticalRedLine.getB().offset(f23, f24);
        float eps = getEPS() + getColumnPaint().getStrokeWidth() + this.dotRadius;
        int i = -1;
        while (true) {
            int i2 = i + 1;
            float f25 = (i * itemSpace) + f18;
            float f26 = this.dotRadius;
            if (f25 < f15 - f26) {
                line = verticalRedLine;
            } else {
                if (f25 > f26 + f11) {
                    arrayList.add(new C32443OooOOO(path, getSolidPaint()));
                    Path path2 = new Path();
                    drawThreeColumnLinesInRegion(path2, regionBounds);
                    arrayList.add(new C32443OooOOO(path2, getColumnPaint()));
                    return arrayList;
                }
                int i3 = -1;
                while (true) {
                    int i4 = i3 + 1;
                    float f27 = (i3 * itemSpace) + f9;
                    line = verticalRedLine;
                    float f28 = this.dotRadius;
                    if (f27 >= f6 - f28) {
                        if (f27 > f28 + f3) {
                            break;
                        }
                        if ((f25 >= f22 - getEPS() || (!getHorizontalFlip() ? f27 <= getEPS() + f19 : f27 >= f20 - getEPS())) && ((f27 <= getEPS() + f19 || f27 >= f20 - getEPS() || f25 <= getEPS() + f21 || f25 >= f22 - getEPS()) && ((Math.abs(f25 - horizontalRedLine.getA().y) >= eps || f27 < horizontalRedLine.getA().x - eps || f27 > horizontalRedLine.getB().x + eps) && (Math.abs(f27 - line.getA().x) >= eps || f25 < line.getA().y - eps || f25 > line.getB().y + eps)))) {
                            f = f22;
                            path.addCircle(f27, f25, this.dotRadius, Path.Direction.CW);
                        }
                    } else {
                        f = f22;
                    }
                    i3 = i4;
                    verticalRedLine = line;
                    f22 = f;
                }
            }
            i = i2;
            verticalRedLine = line;
            f22 = f22;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ HollowDotThreeColumnPaperStyle(float r2, float r3, java.lang.Float r4, java.lang.Float r5, boolean r6, java.lang.Float r7, java.lang.Float r8, java.lang.Float r9, java.lang.Float r10, int r11, kotlin.jvm.internal.C24018OooO0oo r12) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.domain.models.papertheme.paperstyle.threecolumns.HollowDotThreeColumnPaperStyle.<init>(float, float, java.lang.Float, java.lang.Float, boolean, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, int, kotlin.jvm.internal.OooO0oo):void");
    }

    public HollowDotThreeColumnPaperStyle(float f, float f2, Float f3, Float f4, boolean z, Float f5, Float f6, Float f7, Float f8) {
        super(f, f2, f3, f4, z, f5, f6, f7, f8);
        this.dotRadius = o000000O.OooO0o0(1.0f);
    }
}
