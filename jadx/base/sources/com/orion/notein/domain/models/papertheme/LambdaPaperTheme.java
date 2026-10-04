package com.orion.notein.domain.models.papertheme;

import Oooo0oO.C21036OooOOo0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.google.gson.annotations.Expose;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0O0oo00.OooO00o;
import o0O0oo00.OooO0O0;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b!\b\u0086\b\u0018\u0000 S2\u00020\u0001:\u0001SBC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J_\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0017H\u0016¢\u0006\u0004\b&\u0010'J9\u0010/\u001a\u00020\u000e\"\u0004\b\u0000\u0010(2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100JA\u0010/\u001a\u00020\u000e\"\u0004\b\u0000\u0010(2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+2\u0006\u0010.\u001a\u00020-2\u0006\u00101\u001a\u00020\u001bH\u0016¢\u0006\u0004\b/\u00102J\u001a\u00105\u001a\u00020\u00192\b\u00104\u001a\u0004\u0018\u000103H\u0096\u0002¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bA\u0010>JP\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\bD\u0010>R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0002\u0010E\u001a\u0004\bF\u00108R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010G\u001a\u0004\bH\u0010:R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010I\u001a\u0004\bJ\u0010<R\"\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\b\u0010K\u001a\u0004\bL\u0010>\"\u0004\bM\u0010NR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010O\u001a\u0004\bP\u0010@R$\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010K\u001a\u0004\bQ\u0010>\"\u0004\bR\u0010N¨\u0006T"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/LambdaPaperTheme;", "Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "baseTheme", "Lcom/orion/notein/domain/models/papertheme/ThemeCategory;", "category", "Lcom/orion/notein/domain/models/page/PaperOrientation;", "orientation", "", "name", "Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;", "paperStyle", "myTemplateId", "<init>", "(Lcom/orion/notein/domain/models/papertheme/PaperTheme;Lcom/orion/notein/domain/models/papertheme/ThemeCategory;Lcom/orion/notein/domain/models/page/PaperOrientation;Ljava/lang/String;Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;Ljava/lang/String;)V", "LoO00ooO/OooOooO;", "setPageStyleDefaultColor", "()V", "Landroid/graphics/Canvas;", "canvas", "Landroid/content/Context;", "context", "drawPaperBg", "(Landroid/graphics/Canvas;Landroid/content/Context;)V", "", "pageIndex", "", "renderAnnot", "Landroid/graphics/RectF;", "normalizedRenderTaskBounds", "regionWidthPx", "regionHeightPx", "pageWidth", "pageHeight", "isInfiniteCanvas", "renderPaperRegion", "(Landroid/graphics/Canvas;IZLandroid/content/Context;Landroid/graphics/RectF;IIIIZ)V", "getTitle", "(Landroid/content/Context;)Ljava/lang/String;", "hashCode", "()I", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "", "scale", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "renderTargetViewport", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;FLandroid/graphics/RectF;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "component1", "()Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "component2", "()Lcom/orion/notein/domain/models/papertheme/ThemeCategory;", "component3", "()Lcom/orion/notein/domain/models/page/PaperOrientation;", "component4", "()Ljava/lang/String;", "component5", "()Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;", "component6", "copy", "(Lcom/orion/notein/domain/models/papertheme/PaperTheme;Lcom/orion/notein/domain/models/papertheme/ThemeCategory;Lcom/orion/notein/domain/models/page/PaperOrientation;Ljava/lang/String;Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;Ljava/lang/String;)Lcom/orion/notein/domain/models/papertheme/LambdaPaperTheme;", "toString", "Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "getBaseTheme", "Lcom/orion/notein/domain/models/papertheme/ThemeCategory;", "getCategory", "Lcom/orion/notein/domain/models/page/PaperOrientation;", "getOrientation", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;", "getPaperStyle", "getMyTemplateId", "setMyTemplateId", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class LambdaPaperTheme extends PaperTheme {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int DARK_LINE_COLOR = Color.parseColor("#FF7A7A7A");
    private static final int LIGHT_LINE_COLOR = Color.parseColor("#FFAEAEAE");

    @Expose
    private final PaperTheme baseTheme;

    @Expose
    private final ThemeCategory category;

    @Expose
    private String myTemplateId;

    @Expose
    private String name;

    @Expose
    private final PaperOrientation orientation;

    @Expose
    private final PaperStyle paperStyle;

    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/LambdaPaperTheme$Companion;", "", "<init>", "()V", "DARK_LINE_COLOR", "", "getDARK_LINE_COLOR", "()I", "LIGHT_LINE_COLOR", "getLIGHT_LINE_COLOR", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final int getDARK_LINE_COLOR() {
            return LambdaPaperTheme.DARK_LINE_COLOR;
        }

        public final int getLIGHT_LINE_COLOR() {
            return LambdaPaperTheme.LIGHT_LINE_COLOR;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LambdaPaperTheme(PaperTheme paperTheme, ThemeCategory themeCategory, PaperOrientation paperOrientation, String str, PaperStyle paperStyle, String str2, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? null : paperTheme, themeCategory, (i & 4) != 0 ? PaperOrientation.VERTICAL : paperOrientation, (i & 8) != 0 ? "" : str, paperStyle, (i & 32) != 0 ? null : str2);
    }

    public static /* synthetic */ LambdaPaperTheme copy$default(LambdaPaperTheme lambdaPaperTheme, PaperTheme paperTheme, ThemeCategory themeCategory, PaperOrientation paperOrientation, String str, PaperStyle paperStyle, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            paperTheme = lambdaPaperTheme.baseTheme;
        }
        if ((i & 2) != 0) {
            themeCategory = lambdaPaperTheme.category;
        }
        if ((i & 4) != 0) {
            paperOrientation = lambdaPaperTheme.orientation;
        }
        if ((i & 8) != 0) {
            str = lambdaPaperTheme.name;
        }
        if ((i & 16) != 0) {
            paperStyle = lambdaPaperTheme.paperStyle;
        }
        if ((i & 32) != 0) {
            str2 = lambdaPaperTheme.myTemplateId;
        }
        PaperStyle paperStyle2 = paperStyle;
        String str3 = str2;
        return lambdaPaperTheme.copy(paperTheme, themeCategory, paperOrientation, str, paperStyle2, str3);
    }

    private final void setPageStyleDefaultColor() {
        PaperTheme baseTheme = getBaseTheme();
        boolean z = baseTheme instanceof ColorPaperTheme;
        if (z && ((ColorPaperTheme) baseTheme).getColor() == PaperColors.INSTANCE.getCOLOR_05()) {
            this.paperStyle.setDefaultColor(DARK_LINE_COLOR);
        } else if (z && ((ColorPaperTheme) baseTheme).getColor() == -16777216) {
            this.paperStyle.setDefaultColor(DARK_LINE_COLOR);
        } else {
            this.paperStyle.setDefaultColor(LIGHT_LINE_COLOR);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PaperTheme getBaseTheme() {
        return this.baseTheme;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ThemeCategory getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PaperOrientation getOrientation() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PaperStyle getPaperStyle() {
        return this.paperStyle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMyTemplateId() {
        return this.myTemplateId;
    }

    public final LambdaPaperTheme copy(PaperTheme baseTheme, ThemeCategory category, PaperOrientation orientation, String name, PaperStyle paperStyle, String myTemplateId) {
        OooOOO0.OooO0oO(category, "category");
        OooOOO0.OooO0oO(orientation, "orientation");
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(paperStyle, "paperStyle");
        return new LambdaPaperTheme(baseTheme, category, orientation, name, paperStyle, myTemplateId);
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public void drawPaperBg(Canvas canvas, Context context) {
        OooOOO0.OooO0oO(canvas, "canvas");
        OooOOO0.OooO0oO(context, "context");
        setPageStyleDefaultColor();
        PaperTheme baseTheme = getBaseTheme();
        if (baseTheme != null) {
            baseTheme.drawPaperBg(canvas, context);
        }
        Matrix matrix = new Matrix();
        matrix.postScale(canvas.getWidth() / this.paperStyle.getPaperWidth(), canvas.getHeight() / this.paperStyle.getPaperHeight());
        this.paperStyle.drawPage(canvas, new RectF(0.0f, 0.0f, 1.0f, 1.0f), matrix);
    }

    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof LambdaPaperTheme)) {
            return false;
        }
        LambdaPaperTheme lambdaPaperTheme = (LambdaPaperTheme) other;
        return OooOOO0.OooO0O0(getBaseTheme(), lambdaPaperTheme.getBaseTheme()) && OooOOO0.OooO0O0(getCategory(), lambdaPaperTheme.getCategory()) && getOrientation() == lambdaPaperTheme.getOrientation() && OooOOO0.OooO0O0(this.paperStyle, lambdaPaperTheme.paperStyle) && OooOOO0.OooO0O0(getName(), lambdaPaperTheme.getName());
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public PaperTheme getBaseTheme() {
        return this.baseTheme;
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public ThemeCategory getCategory() {
        return this.category;
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public String getMyTemplateId() {
        return this.myTemplateId;
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public String getName() {
        return this.name;
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public PaperOrientation getOrientation() {
        return this.orientation;
    }

    public final PaperStyle getPaperStyle() {
        return this.paperStyle;
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public String getTitle(Context context) {
        OooOOO0.OooO0oO(context, "context");
        PaperStyle paperStyle = this.paperStyle;
        Resources resources = context.getResources();
        OooOOO0.OooO0o(resources, "getResources(...)");
        return paperStyle.getName(resources);
    }

    public int hashCode() {
        PaperTheme baseTheme = getBaseTheme();
        int iHashCode = (this.paperStyle.hashCode() + ((getOrientation().hashCode() + ((getCategory().hashCode() + ((527 + (baseTheme != null ? baseTheme.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        String name = getName();
        return iHashCode + (name != null ? name.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public <T> void render(OooO00o<T> renderEngine, OooO0O0<T> renderTarget, float scale) {
        C32443OooOOO c32443OooOOOOooO0OO = C21036OooOOo0.OooO0OO(renderEngine, "renderEngine", renderTarget, "renderTarget");
        render(renderEngine, renderTarget, scale, new RectF(0.0f, 0.0f, ((Number) c32443OooOOOOooO0OO.f116638OooOo0o).floatValue(), ((Number) c32443OooOOOOooO0OO.f116637OooOo).floatValue()));
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public void renderPaperRegion(Canvas canvas, int pageIndex, boolean renderAnnot, Context context, RectF normalizedRenderTaskBounds, int regionWidthPx, int regionHeightPx, int pageWidth, int pageHeight, boolean isInfiniteCanvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(normalizedRenderTaskBounds, "normalizedRenderTaskBounds");
        setPageStyleDefaultColor();
        PaperTheme baseTheme = getBaseTheme();
        if (baseTheme != null) {
            baseTheme.renderPaperRegion(canvas, pageIndex, renderAnnot, context, normalizedRenderTaskBounds, regionWidthPx, regionHeightPx, pageWidth, pageHeight, isInfiniteCanvas);
        }
        if (this.paperStyle.drawRegion(canvas, normalizedRenderTaskBounds, regionWidthPx, regionHeightPx)) {
            return;
        }
        Matrix matrix = new Matrix();
        float f = pageWidth;
        float f2 = pageHeight;
        matrix.postScale(f / this.paperStyle.getPaperWidth(), f2 / this.paperStyle.getPaperHeight());
        matrix.postTranslate((-normalizedRenderTaskBounds.left) * f, (-normalizedRenderTaskBounds.top) * f2);
        this.paperStyle.drawPage(canvas, normalizedRenderTaskBounds, matrix);
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public void setMyTemplateId(String str) {
        this.myTemplateId = str;
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public void setName(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.name = str;
    }

    public String toString() {
        return "LambdaPaperTheme(baseTheme=" + this.baseTheme + ", category=" + this.category + ", orientation=" + this.orientation + ", name=" + this.name + ", paperStyle=" + this.paperStyle + ", myTemplateId=" + this.myTemplateId + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LambdaPaperTheme(PaperTheme paperTheme, ThemeCategory category, PaperOrientation orientation, String name, PaperStyle paperStyle, String str) {
        super(paperTheme, "", category, orientation, null, null, 48, null);
        OooOOO0.OooO0oO(category, "category");
        OooOOO0.OooO0oO(orientation, "orientation");
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(paperStyle, "paperStyle");
        this.baseTheme = paperTheme;
        this.category = category;
        this.orientation = orientation;
        this.name = name;
        this.paperStyle = paperStyle;
        this.myTemplateId = str;
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public <T> void render(OooO00o<T> renderEngine, OooO0O0<T> renderTarget, float scale, RectF renderTargetViewport) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        OooOOO0.OooO0oO(renderTargetViewport, "renderTargetViewport");
        setPageStyleDefaultColor();
        PaperTheme baseTheme = getBaseTheme();
        if (baseTheme != null) {
            baseTheme.render(renderEngine, renderTarget, scale, renderTargetViewport);
        }
        this.paperStyle.render(renderEngine, renderTarget, scale, renderTargetViewport);
    }
}
