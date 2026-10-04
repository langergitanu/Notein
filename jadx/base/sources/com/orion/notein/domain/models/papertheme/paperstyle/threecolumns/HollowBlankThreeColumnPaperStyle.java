package com.orion.notein.domain.models.papertheme.paperstyle.threecolumns;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.app.FrameMetricsAggregator;
import com.aspose.words.OooO0OO;
import com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0O0oo00.OooO00o;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0018\u001a\u00020\u00172\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019JA\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u00150\u001b2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'¨\u0006("}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/paperstyle/threecolumns/HollowBlankThreeColumnPaperStyle;", "Lcom/orion/notein/domain/models/papertheme/paperstyle/threecolumns/HollowThreeColumnPaperStyle;", "", "paperWidth", "paperHeight", "foregroundAlpha", "requiredItemSpace", "", "horizontalFlip", "leftPadding", "topPadding", "rightPadding", "bottomPadding", "<init>", "(FFLjava/lang/Float;Ljava/lang/Float;ZLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "Lo0O0oo00/OooO00o;", "renderEngine", "Landroid/graphics/RectF;", "contentBounds", "holeBounds", "itemSpace", "LoO00ooO/OooOOO;", "scale", "LoO00ooO/OooOooO;", "renderPattern", "(Lo0O0oo00/OooO00o;Landroid/graphics/RectF;Landroid/graphics/RectF;FLoO00ooO/OooOOO;)V", "regionBounds", "", "Landroid/graphics/Path;", "Landroid/graphics/Paint;", "renderPatternInRegion", "(Landroid/graphics/RectF;Landroid/graphics/RectF;FLandroid/graphics/RectF;)Ljava/util/List;", "Landroid/content/res/Resources;", "res", "", "getName", "(Landroid/content/res/Resources;)Ljava/lang/String;", "Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;", "duplicate", "(FF)Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public class HollowBlankThreeColumnPaperStyle extends HollowThreeColumnPaperStyle {
    public HollowBlankThreeColumnPaperStyle() {
        this(0.0f, 0.0f, null, null, false, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.HollowPaperStyle
    public PaperStyle duplicate(float paperWidth, float paperHeight) {
        return new HollowBlankThreeColumnPaperStyle(paperWidth, paperHeight, getForegroundAlpha(), getRequiredItemSpace(), getHorizontalFlip(), null, null, null, null, 480, null);
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public String getName(Resources res) {
        return OooO0OO.OooO00o(res, "res", R.string.paper_style_blank_three_column, "getString(...)");
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.HollowPaperStyle
    public void renderPattern(OooO00o<?> renderEngine, RectF contentBounds, RectF holeBounds, float itemSpace, C32443OooOOO<Float, Float> scale) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(contentBounds, "contentBounds");
        OooOOO0.OooO0oO(holeBounds, "holeBounds");
        OooOOO0.OooO0oO(scale, "scale");
        drawThreeColumnGuide(renderEngine, contentBounds, scale);
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.HollowPaperStyle
    public List<C32443OooOOO<Path, Paint>> renderPatternInRegion(RectF regionBounds, RectF contentBounds, float itemSpace, RectF holeBounds) {
        OooOOO0.OooO0oO(regionBounds, "regionBounds");
        OooOOO0.OooO0oO(contentBounds, "contentBounds");
        OooOOO0.OooO0oO(holeBounds, "holeBounds");
        ArrayList arrayList = new ArrayList();
        Path path = new Path();
        drawThreeColumnLinesInRegion(path, regionBounds);
        arrayList.add(new C32443OooOOO(path, getColumnPaint()));
        return arrayList;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ HollowBlankThreeColumnPaperStyle(float r2, float r3, java.lang.Float r4, java.lang.Float r5, boolean r6, java.lang.Float r7, java.lang.Float r8, java.lang.Float r9, java.lang.Float r10, int r11, kotlin.jvm.internal.C24018OooO0oo r12) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.domain.models.papertheme.paperstyle.threecolumns.HollowBlankThreeColumnPaperStyle.<init>(float, float, java.lang.Float, java.lang.Float, boolean, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, int, kotlin.jvm.internal.OooO0oo):void");
    }

    public HollowBlankThreeColumnPaperStyle(float f, float f2, Float f3, Float f4, boolean z, Float f5, Float f6, Float f7, Float f8) {
        super(f, f2, f3, f4, z, f5, f6, f7, f8);
    }
}
