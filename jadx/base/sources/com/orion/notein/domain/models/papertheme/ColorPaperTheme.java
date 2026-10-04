package com.orion.notein.domain.models.papertheme;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.aspose.words.EditingLanguage;
import com.google.gson.annotations.Expose;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0O0oo00.OooO00o;
import o0O0oo00.OooO0O0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ_\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ9\u0010#\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$JA\u0010#\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010&J\u001a\u0010)\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b-\u0010\u001bJ&\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0002\u00103\u001a\u0004\b4\u0010,R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b6\u0010\u001b¨\u00067"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/ColorPaperTheme;", "Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "baseTheme", "", "color", "<init>", "(Lcom/orion/notein/domain/models/papertheme/PaperTheme;I)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/content/Context;", "context", "LoO00ooO/OooOooO;", "drawPaperBg", "(Landroid/graphics/Canvas;Landroid/content/Context;)V", "pageIndex", "", "renderAnnot", "Landroid/graphics/RectF;", "normalizedRenderTaskBounds", "regionWidthPx", "regionHeightPx", "pageWidth", "pageHeight", "isInfiniteCanvas", "renderPaperRegion", "(Landroid/graphics/Canvas;IZLandroid/content/Context;Landroid/graphics/RectF;IIIIZ)V", "hashCode", "()I", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "", "scale", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "renderTargetViewport", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;FLandroid/graphics/RectF;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "component1", "()Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "component2", "copy", "(Lcom/orion/notein/domain/models/papertheme/PaperTheme;I)Lcom/orion/notein/domain/models/papertheme/ColorPaperTheme;", "", "toString", "()Ljava/lang/String;", "Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "getBaseTheme", "I", "getColor", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class ColorPaperTheme extends PaperTheme {

    @Expose
    private final PaperTheme baseTheme;

    @Expose
    private final int color;

    /* JADX WARN: Multi-variable type inference failed */
    public ColorPaperTheme() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ColorPaperTheme copy$default(ColorPaperTheme colorPaperTheme, PaperTheme paperTheme, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            paperTheme = colorPaperTheme.baseTheme;
        }
        if ((i2 & 2) != 0) {
            i = colorPaperTheme.color;
        }
        return colorPaperTheme.copy(paperTheme, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PaperTheme getBaseTheme() {
        return this.baseTheme;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    public final ColorPaperTheme copy(PaperTheme baseTheme, int color) {
        return new ColorPaperTheme(baseTheme, color);
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public void drawPaperBg(Canvas canvas, Context context) {
        OooOOO0.OooO0oO(canvas, "canvas");
        OooOOO0.OooO0oO(context, "context");
        PaperTheme baseTheme = getBaseTheme();
        if (baseTheme != null) {
            baseTheme.drawPaperBg(canvas, context);
        }
        canvas.drawColor(this.color);
    }

    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorPaperTheme)) {
            return false;
        }
        ColorPaperTheme colorPaperTheme = (ColorPaperTheme) other;
        return OooOOO0.OooO0O0(getBaseTheme(), colorPaperTheme.getBaseTheme()) && this.color == colorPaperTheme.color;
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public PaperTheme getBaseTheme() {
        return this.baseTheme;
    }

    public final int getColor() {
        return this.color;
    }

    public int hashCode() {
        PaperTheme baseTheme = getBaseTheme();
        return ((527 + (baseTheme != null ? baseTheme.hashCode() : 0)) * 31) + this.color;
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public <T> void render(OooO00o<T> renderEngine, OooO0O0<T> renderTarget, float scale) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        PaperTheme baseTheme = getBaseTheme();
        if (baseTheme != null) {
            baseTheme.render(renderEngine, renderTarget, scale);
        }
        renderEngine.OooOo0(this.color);
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public void renderPaperRegion(Canvas canvas, int pageIndex, boolean renderAnnot, Context context, RectF normalizedRenderTaskBounds, int regionWidthPx, int regionHeightPx, int pageWidth, int pageHeight, boolean isInfiniteCanvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(normalizedRenderTaskBounds, "normalizedRenderTaskBounds");
        PaperTheme baseTheme = getBaseTheme();
        if (baseTheme != null) {
            baseTheme.renderPaperRegion(canvas, pageIndex, renderAnnot, context, normalizedRenderTaskBounds, regionWidthPx, regionHeightPx, pageWidth, pageHeight, isInfiniteCanvas);
        }
        canvas.drawColor(this.color);
    }

    public String toString() {
        return "ColorPaperTheme(baseTheme=" + this.baseTheme + ", color=" + this.color + ")";
    }

    public /* synthetic */ ColorPaperTheme(PaperTheme paperTheme, int i, int i2, C24018OooO0oo c24018OooO0oo) {
        this((i2 & 1) != 0 ? null : paperTheme, (i2 & 2) != 0 ? -1 : i);
    }

    public ColorPaperTheme(PaperTheme paperTheme, int i) {
        super(paperTheme, null, new ThemeCategory(EditingLanguage.ARABIC_LEBANON, "Color"), null, null, null, 58, null);
        this.baseTheme = paperTheme;
        this.color = i;
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public <T> void render(OooO00o<T> renderEngine, OooO0O0<T> renderTarget, float scale, RectF renderTargetViewport) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        OooOOO0.OooO0oO(renderTargetViewport, "renderTargetViewport");
        PaperTheme baseTheme = getBaseTheme();
        if (baseTheme != null) {
            baseTheme.render(renderEngine, renderTarget, scale, renderTargetViewport);
        }
        Paint paint = new Paint();
        paint.setColor(this.color);
        paint.setStyle(Paint.Style.FILL);
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        renderEngine.OooO0o(renderTargetViewport, paint);
    }
}
