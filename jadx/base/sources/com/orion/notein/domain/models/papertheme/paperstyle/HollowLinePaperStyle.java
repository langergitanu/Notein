package com.orion.notein.domain.models.papertheme.paperstyle;

import Oooo0.o000000O;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.C22234OoooOo0;
import com.aspose.words.OooO0OO;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0O0oo00.OooO00o;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0018\u001a\u00020\u00172\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019JA\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u00150\u001b2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0011H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010+R*\u0010.\u001a\u00020,2\u0006\u0010-\u001a\u00020,8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/paperstyle/HollowLinePaperStyle;", "Lcom/orion/notein/domain/models/papertheme/paperstyle/HollowPaperStyle;", "", "paperWidth", "paperHeight", "foregroundAlpha", "requiredItemSpace", "", "horizontalFlip", "leftPadding", "topPadding", "rightPadding", "bottomPadding", "<init>", "(FFLjava/lang/Float;Ljava/lang/Float;ZLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "Lo0O0oo00/OooO00o;", "renderEngine", "Landroid/graphics/RectF;", "contentBounds", "holeBounds", "itemSpace", "LoO00ooO/OooOOO;", "scale", "LoO00ooO/OooOooO;", "renderPattern", "(Lo0O0oo00/OooO00o;Landroid/graphics/RectF;Landroid/graphics/RectF;FLoO00ooO/OooOOO;)V", "regionBounds", "", "Landroid/graphics/Path;", "Landroid/graphics/Paint;", "renderPatternInRegion", "(Landroid/graphics/RectF;Landroid/graphics/RectF;FLandroid/graphics/RectF;)Ljava/util/List;", "Landroid/content/res/Resources;", "res", "", "getName", "(Landroid/content/res/Resources;)Ljava/lang/String;", "holeInPaper", "holePadding", "setHole", "(Landroid/graphics/RectF;Landroid/graphics/RectF;)V", "Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;", "duplicate", "(FF)Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;", "", "value", "defaultColor", "I", "getDefaultColor", "()I", "setDefaultColor", "(I)V", "boldSolidPaint", "Landroid/graphics/Paint;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public class HollowLinePaperStyle extends HollowPaperStyle {
    private final Paint boldSolidPaint;
    private int defaultColor;

    public HollowLinePaperStyle() {
        this(0.0f, 0.0f, null, null, false, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.HollowPaperStyle
    public PaperStyle duplicate(float paperWidth, float paperHeight) {
        return new HollowLinePaperStyle(paperWidth, paperHeight, getForegroundAlpha(), getRequiredItemSpace(), false, null, null, null, null, 496, null);
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.HollowPaperStyle, com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public int getDefaultColor() {
        return this.defaultColor;
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public String getName(Resources res) {
        return OooO0OO.OooO00o(res, "res", R.string.paper_style_line, "getString(...)");
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.HollowPaperStyle
    public void renderPattern(OooO00o<?> renderEngine, RectF contentBounds, RectF holeBounds, float itemSpace, C32443OooOOO<Float, Float> scale) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(contentBounds, "contentBounds");
        OooOOO0.OooO0oO(holeBounds, "holeBounds");
        OooOOO0.OooO0oO(scale, "scale");
        float fFloatValue = scale.f116638OooOo0o.floatValue();
        float fFloatValue2 = scale.f116637OooOo.floatValue();
        OooO00o.C19734OooO00o.OooO00o(renderEngine, getSolidColor(), o000000O.OooO0o0(0.5f) * fFloatValue, 0, 0, false, 24);
        RectF rectFCalculatePadding = calculatePadding();
        float f = contentBounds.left;
        RectF rectF = new RectF((rectFCalculatePadding.left * fFloatValue) + f, (rectFCalculatePadding.top * fFloatValue2) + contentBounds.top, OooOO0.OooO0OO.OooO0O0(getPaperWidth(), rectFCalculatePadding.right, fFloatValue, f), OooOO0.OooO0OO.OooO0O0(getPaperHeight(), rectFCalculatePadding.bottom, fFloatValue2, contentBounds.top));
        float f2 = itemSpace * fFloatValue2;
        float f3 = ((holeBounds.top - rectF.top) % f2) + (rectFCalculatePadding.top * fFloatValue2);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            float f4 = (i * f2) + f3;
            if (f4 > getEPS() + rectF.bottom) {
                renderEngine.OooOOOO(1.0f);
                return;
            }
            if (f4 <= getEPS() + holeBounds.top || f4 >= holeBounds.bottom - getEPS()) {
                renderEngine.moveTo(rectF.left, f4);
                renderEngine.lineTo(rectF.right, f4);
            } else {
                if (holeBounds.left - rectF.left > getEPS()) {
                    renderEngine.moveTo(rectF.left, f4);
                    renderEngine.lineTo(holeBounds.left, f4);
                }
                if (holeBounds.right < rectF.right - getEPS()) {
                    renderEngine.moveTo(holeBounds.right, f4);
                    renderEngine.lineTo(rectF.right, f4);
                }
            }
            i = i2;
        }
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.HollowPaperStyle
    public List<C32443OooOOO<Path, Paint>> renderPatternInRegion(RectF regionBounds, RectF contentBounds, float itemSpace, RectF holeBounds) {
        OooOOO0.OooO0oO(regionBounds, "regionBounds");
        OooOOO0.OooO0oO(contentBounds, "contentBounds");
        OooOOO0.OooO0oO(holeBounds, "holeBounds");
        ArrayList arrayList = new ArrayList();
        Path path = new Path();
        float strokeWidth = getSolidPaint().getStrokeWidth();
        float f = regionBounds.left;
        float f2 = regionBounds.right - f;
        float f3 = contentBounds.left;
        float f4 = contentBounds.right;
        float f5 = f3 - f;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        float f6 = f4 - f;
        if (f6 <= f2) {
            f2 = f6;
        }
        float f7 = regionBounds.top;
        float f8 = regionBounds.bottom - f7;
        float f9 = contentBounds.top;
        float f10 = contentBounds.bottom;
        float f11 = f9 - f7;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        float f12 = f10 - f7;
        if (f12 <= f8) {
            f8 = f12;
        }
        float f13 = (holeBounds.top % itemSpace) - f7;
        int i = -1;
        while (f2 >= 0.0f) {
            int i2 = i + 1;
            float f14 = (i * itemSpace) + f13;
            if (f14 >= f11 - strokeWidth) {
                if (f14 > f8 + strokeWidth) {
                    break;
                }
                if (f14 <= holeBounds.top - f7 || f14 >= holeBounds.bottom - f7) {
                    path.moveTo(f5, f14);
                    path.lineTo(f2, f14);
                } else {
                    if (holeBounds.left - f > getEPS()) {
                        float f15 = holeBounds.left - f;
                        if (f15 < f5) {
                            f15 = f5;
                        }
                        path.moveTo(f5, f14);
                        path.lineTo(f15, f14);
                    }
                    if (holeBounds.right - f < f2 - getEPS()) {
                        float f16 = holeBounds.right - f;
                        if (f16 > f2) {
                            f16 = f2;
                        }
                        path.moveTo(f16, f14);
                        path.lineTo(f2, f14);
                    }
                }
            }
            i = i2;
        }
        arrayList.add(new C32443OooOOO(path, getSolidPaint()));
        return arrayList;
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.HollowPaperStyle, com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public void setDefaultColor(int i) {
        this.defaultColor = i;
        super.setDefaultColor(i);
        this.boldSolidPaint.setColor(getSolidColor());
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.HollowPaperStyle
    public void setHole(RectF holeInPaper, RectF holePadding) {
        OooOOO0.OooO0oO(holeInPaper, "holeInPaper");
        OooOOO0.OooO0oO(holePadding, "holePadding");
        setHole(holeInPaper, holePadding, Float.valueOf(getItemSpace()));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ HollowLinePaperStyle(float r2, float r3, java.lang.Float r4, java.lang.Float r5, boolean r6, java.lang.Float r7, java.lang.Float r8, java.lang.Float r9, java.lang.Float r10, int r11, kotlin.jvm.internal.C24018OooO0oo r12) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.domain.models.papertheme.paperstyle.HollowLinePaperStyle.<init>(float, float, java.lang.Float, java.lang.Float, boolean, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, int, kotlin.jvm.internal.OooO0oo):void");
    }

    public HollowLinePaperStyle(float f, float f2, Float f3, Float f4, boolean z, Float f5, Float f6, Float f7, Float f8) {
        super(f, f2, f3, f4, z, f5, f6, f7, f8);
        this.defaultColor = Color.parseColor("#C3D0E0");
        Paint paintOooO00o = C22234OoooOo0.OooO00o(true, true);
        paintOooO00o.setColor(getDefaultColor());
        paintOooO00o.setStyle(Paint.Style.STROKE);
        paintOooO00o.setStrokeWidth(o000000O.OooO0o0(1.0f));
        this.boldSolidPaint = paintOooO00o;
    }
}
