package com.orion.notein.domain.models.papertheme;

import OooOooo.C20785Oooo00o;
import Oooo0oO.C21036OooOOo0;
import OoooooO.C21445Oooo;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.LruCache;
import com.aspose.words.EditingLanguage;
import com.google.gson.annotations.Expose;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0O0oOOO.C26120OooO0Oo;
import o0O0oOOO.C26121OooO0o0;
import o0O0oo00.OooO00o;
import o0O0oo00.OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32444OooOOO0;
import oO00ooO.C32449OooOOoo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\"\b\u0086\b\u0018\u0000 Q2\u00020\u0001:\u0001QBA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0017J_\u0010!\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0019H\u0016¢\u0006\u0004\b!\u0010\"J9\u0010*\u001a\u00020\u0014\"\u0004\b\u0000\u0010#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+JA\u0010*\u001a\u00020\u0014\"\u0004\b\u0000\u0010#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010)\u001a\u00020(2\u0006\u0010,\u001a\u00020\u0012H\u0016¢\u0006\u0004\b*\u0010-J\u000f\u0010.\u001a\u00020\u0005H\u0016¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u00020\u00192\b\u00101\u001a\u0004\u0018\u000100H\u0096\u0002¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b8\u0010/J\u0010\u00109\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b=\u0010<JP\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b@\u0010<R$\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010A\u001a\u0004\bB\u00105\"\u0004\bC\u0010DR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010E\u001a\u0004\bF\u00107R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010G\u001a\u0004\bH\u0010/R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010I\u001a\u0004\bJ\u0010:R\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u0010K\u001a\u0004\bL\u0010<\"\u0004\bM\u0010NR$\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010K\u001a\u0004\bO\u0010<\"\u0004\bP\u0010N¨\u0006R"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/PdfPaperTheme;", "Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "baseTheme", "Lcom/orion/notein/domain/models/note/PdfInfo;", "pdfInfo", "", "pageNum", "Lcom/orion/notein/domain/models/page/PaperOrientation;", "orientation", "", "name", "myTemplateId", "<init>", "(Lcom/orion/notein/domain/models/papertheme/PaperTheme;Lcom/orion/notein/domain/models/note/PdfInfo;ILcom/orion/notein/domain/models/page/PaperOrientation;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/content/Context;", "context", "Landroid/graphics/RectF;", "renderBounds", "LoO00ooO/OooOooO;", "drawPaperBg", "(Landroid/graphics/Canvas;Landroid/content/Context;Landroid/graphics/RectF;)V", "(Landroid/graphics/Canvas;Landroid/content/Context;)V", "pageIndex", "", "renderAnnot", "normalizedRenderTaskBounds", "regionWidthPx", "regionHeightPx", "pageWidth", "pageHeight", "isInfiniteCanvas", "renderPaperRegion", "(Landroid/graphics/Canvas;IZLandroid/content/Context;Landroid/graphics/RectF;IIIIZ)V", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "", "scale", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "renderTargetViewport", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;FLandroid/graphics/RectF;)V", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "component1", "()Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "component2", "()Lcom/orion/notein/domain/models/note/PdfInfo;", "component3", "component4", "()Lcom/orion/notein/domain/models/page/PaperOrientation;", "component5", "()Ljava/lang/String;", "component6", "copy", "(Lcom/orion/notein/domain/models/papertheme/PaperTheme;Lcom/orion/notein/domain/models/note/PdfInfo;ILcom/orion/notein/domain/models/page/PaperOrientation;Ljava/lang/String;Ljava/lang/String;)Lcom/orion/notein/domain/models/papertheme/PdfPaperTheme;", "toString", "Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "getBaseTheme", "setBaseTheme", "(Lcom/orion/notein/domain/models/papertheme/PaperTheme;)V", "Lcom/orion/notein/domain/models/note/PdfInfo;", "getPdfInfo", "I", "getPageNum", "Lcom/orion/notein/domain/models/page/PaperOrientation;", "getOrientation", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "getMyTemplateId", "setMyTemplateId", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PdfPaperTheme extends PaperTheme {
    public static final String TAG = "PdfPaperTheme";

    @Expose
    private PaperTheme baseTheme;

    @Expose
    private String myTemplateId;

    @Expose
    private String name;

    @Expose
    private final PaperOrientation orientation;

    @Expose
    private final int pageNum;

    @Expose
    private final PdfInfo pdfInfo;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final LruCache<C32449OooOOoo<String, String, Integer>, List<RectF>> searchedTextCache = new LruCache<>(5);

    @Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R;\u0010\n\u001a&\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/PdfPaperTheme$Companion;", "", "<init>", "()V", "Landroid/util/LruCache;", "LoO00ooO/OooOOoo;", "", "", "", "Landroid/graphics/RectF;", "searchedTextCache", "Landroid/util/LruCache;", "getSearchedTextCache", "()Landroid/util/LruCache;", "TAG", "Ljava/lang/String;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final LruCache<C32449OooOOoo<String, String, Integer>, List<RectF>> getSearchedTextCache() {
            return PdfPaperTheme.searchedTextCache;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PdfPaperTheme(PaperTheme paperTheme, PdfInfo pdfInfo, int i, PaperOrientation paperOrientation, String str, String str2, int i2, C24018OooO0oo c24018OooO0oo) {
        this((i2 & 1) != 0 ? null : paperTheme, pdfInfo, i, paperOrientation, (i2 & 16) != 0 ? "" : str, (i2 & 32) != 0 ? null : str2);
    }

    public static /* synthetic */ PdfPaperTheme copy$default(PdfPaperTheme pdfPaperTheme, PaperTheme paperTheme, PdfInfo pdfInfo, int i, PaperOrientation paperOrientation, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            paperTheme = pdfPaperTheme.baseTheme;
        }
        if ((i2 & 2) != 0) {
            pdfInfo = pdfPaperTheme.pdfInfo;
        }
        if ((i2 & 4) != 0) {
            i = pdfPaperTheme.pageNum;
        }
        if ((i2 & 8) != 0) {
            paperOrientation = pdfPaperTheme.orientation;
        }
        if ((i2 & 16) != 0) {
            str = pdfPaperTheme.name;
        }
        if ((i2 & 32) != 0) {
            str2 = pdfPaperTheme.myTemplateId;
        }
        String str3 = str;
        String str4 = str2;
        return pdfPaperTheme.copy(paperTheme, pdfInfo, i, paperOrientation, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PaperTheme getBaseTheme() {
        return this.baseTheme;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PdfInfo getPdfInfo() {
        return this.pdfInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPageNum() {
        return this.pageNum;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PaperOrientation getOrientation() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMyTemplateId() {
        return this.myTemplateId;
    }

    public final PdfPaperTheme copy(PaperTheme baseTheme, PdfInfo pdfInfo, int pageNum, PaperOrientation orientation, String name, String myTemplateId) {
        OooOOO0.OooO0oO(pdfInfo, "pdfInfo");
        OooOOO0.OooO0oO(orientation, "orientation");
        OooOOO0.OooO0oO(name, "name");
        return new PdfPaperTheme(baseTheme, pdfInfo, pageNum, orientation, name, myTemplateId);
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public void drawPaperBg(Canvas canvas, Context context) throws Throwable {
        OooOOO0.OooO0oO(canvas, "canvas");
        OooOOO0.OooO0oO(context, "context");
        drawPaperBg(canvas, context, new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight()));
    }

    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdfPaperTheme)) {
            return false;
        }
        PdfPaperTheme pdfPaperTheme = (PdfPaperTheme) other;
        return OooOOO0.OooO0O0(getBaseTheme(), pdfPaperTheme.getBaseTheme()) && OooOOO0.OooO0O0(getName(), pdfPaperTheme.getName()) && getOrientation() == pdfPaperTheme.getOrientation() && this.pageNum == pdfPaperTheme.pageNum && OooOOO0.OooO0O0(this.pdfInfo, pdfPaperTheme.pdfInfo);
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public PaperTheme getBaseTheme() {
        return this.baseTheme;
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

    public final int getPageNum() {
        return this.pageNum;
    }

    public final PdfInfo getPdfInfo() {
        return this.pdfInfo;
    }

    public int hashCode() {
        PaperTheme baseTheme = getBaseTheme();
        return this.pdfInfo.hashCode() + C20785Oooo00o.OooO00o(this.pageNum, (getOrientation().hashCode() + ((527 + (baseTheme != null ? baseTheme.hashCode() : 0)) * 31)) * 31, 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public <T> void render(OooO00o<T> renderEngine, OooO0O0<T> renderTarget, float scale) throws Throwable {
        C32443OooOOO c32443OooOOOOooO0OO = C21036OooOOo0.OooO0OO(renderEngine, "renderEngine", renderTarget, "renderTarget");
        render(renderEngine, renderTarget, scale, new RectF(0.0f, 0.0f, ((Number) c32443OooOOOOooO0OO.f116638OooOo0o).floatValue(), ((Number) c32443OooOOOOooO0OO.f116637OooOo).floatValue()));
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public void renderPaperRegion(Canvas canvas, int pageIndex, boolean renderAnnot, Context context, RectF normalizedRenderTaskBounds, int regionWidthPx, int regionHeightPx, int pageWidth, int pageHeight, boolean isInfiniteCanvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(normalizedRenderTaskBounds, "normalizedRenderTaskBounds");
        throw new C32444OooOOO0("An operation is not implemented: Not yet implemented");
    }

    public void setBaseTheme(PaperTheme paperTheme) {
        this.baseTheme = paperTheme;
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
        PaperTheme paperTheme = this.baseTheme;
        PdfInfo pdfInfo = this.pdfInfo;
        int i = this.pageNum;
        PaperOrientation paperOrientation = this.orientation;
        String str = this.name;
        String str2 = this.myTemplateId;
        StringBuilder sb = new StringBuilder("PdfPaperTheme(baseTheme=");
        sb.append(paperTheme);
        sb.append(", pdfInfo=");
        sb.append(pdfInfo);
        sb.append(", pageNum=");
        sb.append(i);
        sb.append(", orientation=");
        sb.append(paperOrientation);
        sb.append(", name=");
        return C21445Oooo.OooO0O0(sb, str, ", myTemplateId=", str2, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfPaperTheme(PaperTheme paperTheme, PdfInfo pdfInfo, int i, PaperOrientation orientation, String name, String str) {
        super(paperTheme, name, new ThemeCategory(EditingLanguage.ARABIC_OMAN, "PDF"), orientation, str, null, 32, null);
        OooOOO0.OooO0oO(pdfInfo, "pdfInfo");
        OooOOO0.OooO0oO(orientation, "orientation");
        OooOOO0.OooO0oO(name, "name");
        this.baseTheme = paperTheme;
        this.pdfInfo = pdfInfo;
        this.pageNum = i;
        this.orientation = orientation;
        this.name = name;
        this.myTemplateId = str;
    }

    private final void drawPaperBg(Canvas canvas, Context context, RectF renderBounds) throws Throwable {
        PdfDocument pdfDocumentNewDocument;
        PaperTheme baseTheme = getBaseTheme();
        if (baseTheme != null) {
            baseTheme.drawPaperBg(canvas, context);
        }
        PdfiumCore pdfiumCore = new PdfiumCore(context);
        int iOooO0O0 = oO0O00O.OooO00o.OooO0O0(renderBounds.width());
        if (iOooO0O0 < 1) {
            iOooO0O0 = 1;
        }
        int iOooO0O02 = oO0O00O.OooO00o.OooO0O0(renderBounds.height());
        int i = iOooO0O02 >= 1 ? iOooO0O02 : 1;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iOooO0O0, i, Bitmap.Config.ARGB_8888);
        OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
        Rect rect = new Rect(0, 0, iOooO0O0, i);
        PdfDocument pdfDocument = null;
        try {
            try {
                pdfDocumentNewDocument = pdfiumCore.newDocument(this.pdfInfo.getPdfPath(), this.pdfInfo.getPassword());
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            pdfiumCore.openPage(pdfDocumentNewDocument, this.pageNum);
            pdfiumCore.renderPageBitmap(pdfDocumentNewDocument, bitmapCreateBitmap, this.pageNum, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), false);
            canvas.drawBitmap(bitmapCreateBitmap, rect, renderBounds, (Paint) null);
            if (pdfDocumentNewDocument != null) {
                pdfiumCore.closeDocument(pdfDocumentNewDocument);
            }
        } catch (Exception e2) {
            e = e2;
            pdfDocument = pdfDocumentNewDocument;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0(TAG);
            c20358OooO00o.OooOO0o(e, "drawPage failed: " + this.pdfInfo.getPdfPath() + ", page:" + this.pageNum, new Object[0]);
            if (pdfDocument != null) {
                pdfiumCore.closeDocument(pdfDocument);
            }
        } catch (Throwable th2) {
            th = th2;
            pdfDocument = pdfDocumentNewDocument;
            if (pdfDocument != null) {
                pdfiumCore.closeDocument(pdfDocument);
            }
            throw th;
        }
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public <T> void render(OooO00o<T> renderEngine, OooO0O0<T> renderTarget, float scale, RectF renderTargetViewport) throws Throwable {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        OooOOO0.OooO0oO(renderTargetViewport, "renderTargetViewport");
        PaperTheme baseTheme = getBaseTheme();
        if (baseTheme != null) {
            baseTheme.render(renderEngine, renderTarget, scale, renderTargetViewport);
        }
        if (renderEngine instanceof C26120OooO0Oo) {
            C26121OooO0o0 c26121OooO0o0 = (C26121OooO0o0) renderTarget;
            Canvas canvasOooO0OO = c26121OooO0o0.OooO0OO();
            Context context = c26121OooO0o0.f89174OooO0O0;
            OooOOO0.OooO0Oo(context);
            drawPaperBg(canvasOooO0OO, context, renderTargetViewport);
        }
    }
}
