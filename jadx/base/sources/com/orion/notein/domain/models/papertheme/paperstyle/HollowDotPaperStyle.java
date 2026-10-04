package com.orion.notein.domain.models.papertheme.paperstyle;

import Oooo0.o000000O;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.app.FrameMetricsAggregator;
import com.aspose.words.OooO0OO;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0O0oo00.OooO00o;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0018\u001a\u00020\u00172\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019JA\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u00150\u001b2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0011H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/paperstyle/HollowDotPaperStyle;", "Lcom/orion/notein/domain/models/papertheme/paperstyle/HollowPaperStyle;", "", "paperWidth", "paperHeight", "foregroundAlpha", "requiredItemSpace", "", "horizontalFlip", "leftPadding", "topPadding", "rightPadding", "bottomPadding", "<init>", "(FFLjava/lang/Float;Ljava/lang/Float;ZLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "Lo0O0oo00/OooO00o;", "renderEngine", "Landroid/graphics/RectF;", "contentBounds", "holeBounds", "itemSpace", "LoO00ooO/OooOOO;", "scale", "LoO00ooO/OooOooO;", "renderPattern", "(Lo0O0oo00/OooO00o;Landroid/graphics/RectF;Landroid/graphics/RectF;FLoO00ooO/OooOOO;)V", "regionBounds", "", "Landroid/graphics/Path;", "Landroid/graphics/Paint;", "renderPatternInRegion", "(Landroid/graphics/RectF;Landroid/graphics/RectF;FLandroid/graphics/RectF;)Ljava/util/List;", "Landroid/content/res/Resources;", "res", "", "getName", "(Landroid/content/res/Resources;)Ljava/lang/String;", "holeInPaper", "holePadding", "setHole", "(Landroid/graphics/RectF;Landroid/graphics/RectF;)V", "Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;", "duplicate", "(FF)Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;", "dotRadius", "F", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public class HollowDotPaperStyle extends HollowPaperStyle {
    private final float dotRadius;

    public HollowDotPaperStyle() {
        this(0.0f, 0.0f, null, null, false, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.HollowPaperStyle
    public PaperStyle duplicate(float paperWidth, float paperHeight) {
        return new HollowDotPaperStyle(paperWidth, paperHeight, getForegroundAlpha(), getRequiredItemSpace(), false, null, null, null, null, 496, null);
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public String getName(Resources res) {
        return OooO0OO.OooO00o(res, "res", R.string.paper_style_dot, "getString(...)");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00cb  */
    @Override // com.orion.notein.domain.models.papertheme.paperstyle.HollowPaperStyle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
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
        float f2 = itemSpace * fFloatValue;
        float f3 = ((holeBounds.left - rectF.left) % f2) + (rectFCalculatePadding.left * fFloatValue);
        float f4 = itemSpace * fFloatValue2;
        float f5 = ((holeBounds.top - rectF.top) % f4) + (rectFCalculatePadding.top * fFloatValue2);
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
                    if (f7 <= getEPS() + holeBounds.left || f7 >= holeBounds.right - getEPS()) {
                        renderEngine.OooOOOo(f7, f6, this.dotRadius * fFloatValue);
                    } else {
                        if (f6 <= getEPS() + holeBounds.top || f6 >= holeBounds.bottom - getEPS()) {
                        }
                    }
                    i3 = i4;
                }
            }
            i = i2;
        }
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.HollowPaperStyle
    public List<C32443OooOOO<Path, Paint>> renderPatternInRegion(RectF regionBounds, RectF contentBounds, float itemSpace, RectF holeBounds) {
        HollowDotPaperStyle hollowDotPaperStyle = this;
        OooOOO0.OooO0oO(regionBounds, "regionBounds");
        OooOOO0.OooO0oO(contentBounds, "contentBounds");
        OooOOO0.OooO0oO(holeBounds, "holeBounds");
        ArrayList arrayList = new ArrayList();
        Path path = new Path();
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
        float f7 = (holeBounds.left % itemSpace) - f;
        float f8 = regionBounds.top;
        float f9 = regionBounds.bottom - f8;
        float f10 = contentBounds.top;
        float f11 = contentBounds.bottom;
        float f12 = f10 - f8;
        float f13 = f12 >= 0.0f ? f12 : 0.0f;
        float f14 = f11 - f8;
        if (f14 <= f9) {
            f9 = f14;
        }
        float f15 = (holeBounds.top % itemSpace) - f8;
        int i = -1;
        while (true) {
            int i2 = i + 1;
            float f16 = (i * itemSpace) + f15;
            float f17 = hollowDotPaperStyle.dotRadius;
            if (f16 >= f13 - f17) {
                if (f16 > f17 + f9) {
                    arrayList.add(new C32443OooOOO(path, getSolidPaint()));
                    return arrayList;
                }
                int i3 = -1;
                while (true) {
                    int i4 = i3 + 1;
                    float f18 = (i3 * itemSpace) + f7;
                    float f19 = hollowDotPaperStyle.dotRadius;
                    if (f18 >= f5 - f19) {
                        if (f18 <= f2 + f19) {
                            if (f18 <= holeBounds.left - f || f18 >= holeBounds.right - f || f16 <= holeBounds.top - f8 || f16 >= holeBounds.bottom - f8) {
                                path.addCircle(f18, f16, f19, Path.Direction.CW);
                            }
                        }
                    }
                    hollowDotPaperStyle = this;
                    i3 = i4;
                }
            }
            hollowDotPaperStyle = this;
            i = i2;
        }
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
    public /* synthetic */ HollowDotPaperStyle(float r2, float r3, java.lang.Float r4, java.lang.Float r5, boolean r6, java.lang.Float r7, java.lang.Float r8, java.lang.Float r9, java.lang.Float r10, int r11, kotlin.jvm.internal.C24018OooO0oo r12) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.domain.models.papertheme.paperstyle.HollowDotPaperStyle.<init>(float, float, java.lang.Float, java.lang.Float, boolean, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, int, kotlin.jvm.internal.OooO0oo):void");
    }

    public HollowDotPaperStyle(float f, float f2, Float f3, Float f4, boolean z, Float f5, Float f6, Float f7, Float f8) {
        super(f, f2, f3, f4, z, f5, f6, f7, f8);
        this.dotRadius = o000000O.OooO0o0(1.0f);
    }
}
