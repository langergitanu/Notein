package com.orion.notein.domain.models.papertheme;

import OooOO0.OooO0OO;
import Oooo0oO.C21036OooOOo0;
import Oooo0oO.o0Oo0oo;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.LruCache;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.gson.annotations.Expose;
import com.orion.notein.domain.models.page.PaperOrientation;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0O0oo00.OooO0O0;
import oO00ooO.C32443OooOOO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b#\b\u0086\b\u0018\u0000 Q2\u00020\u0001:\u0001QBK\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J_\u0010 \u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010!J9\u0010)\u001a\u00020\u0012\"\u0004\b\u0000\u0010\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*JA\u0010)\u001a\u00020\u0012\"\u0004\b\u0000\u0010\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010(\u001a\u00020'2\u0006\u0010+\u001a\u00020\u0019H\u0016¢\u0006\u0004\b)\u0010,J\u000f\u0010-\u001a\u00020\u0015H\u0016¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\u00172\b\u00100\u001a\u0004\u0018\u00010/H\u0096\u0002¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b;\u00106J\u0010\u0010<\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b<\u00106J\u0012\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b=\u00106JZ\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b@\u00106R$\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010A\u001a\u0004\bB\u00104\"\u0004\bC\u0010DR\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010E\u001a\u0004\bF\u00106\"\u0004\bG\u0010HR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010I\u001a\u0004\bJ\u00108R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010K\u001a\u0004\bL\u0010:R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\bM\u00106R\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\bN\u00106R$\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010E\u001a\u0004\bO\u00106\"\u0004\bP\u0010H¨\u0006R"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/LocalUriPaperTheme;", "Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "baseTheme", "", "name", "Lcom/orion/notein/domain/models/papertheme/ThemeCategory;", "category", "Lcom/orion/notein/domain/models/page/PaperOrientation;", "orientation", "uri", "tnUri", "myTemplateId", "<init>", "(Lcom/orion/notein/domain/models/papertheme/PaperTheme;Ljava/lang/String;Lcom/orion/notein/domain/models/papertheme/ThemeCategory;Lcom/orion/notein/domain/models/page/PaperOrientation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/content/Context;", "context", "LoO00ooO/OooOooO;", "drawPaperBg", "(Landroid/graphics/Canvas;Landroid/content/Context;)V", "", "pageIndex", "", "renderAnnot", "Landroid/graphics/RectF;", "normalizedRenderTaskBounds", "regionWidthPx", "regionHeightPx", "pageWidth", "pageHeight", "isInfiniteCanvas", "renderPaperRegion", "(Landroid/graphics/Canvas;IZLandroid/content/Context;Landroid/graphics/RectF;IIIIZ)V", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "", "scale", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "renderTargetViewport", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;FLandroid/graphics/RectF;)V", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "component1", "()Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/orion/notein/domain/models/papertheme/ThemeCategory;", "component4", "()Lcom/orion/notein/domain/models/page/PaperOrientation;", "component5", "component6", "component7", "copy", "(Lcom/orion/notein/domain/models/papertheme/PaperTheme;Ljava/lang/String;Lcom/orion/notein/domain/models/papertheme/ThemeCategory;Lcom/orion/notein/domain/models/page/PaperOrientation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/orion/notein/domain/models/papertheme/LocalUriPaperTheme;", "toString", "Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "getBaseTheme", "setBaseTheme", "(Lcom/orion/notein/domain/models/papertheme/PaperTheme;)V", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "Lcom/orion/notein/domain/models/papertheme/ThemeCategory;", "getCategory", "Lcom/orion/notein/domain/models/page/PaperOrientation;", "getOrientation", "getUri", "getTnUri", "getMyTemplateId", "setMyTemplateId", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class LocalUriPaperTheme extends PaperTheme {
    private static final String TAG = "LocalUriPaperTheme";
    private static final int cacheSize;
    private static LruCache<String, Bitmap> imagePool;
    private static final int maxMemory;

    @Expose
    private PaperTheme baseTheme;

    @Expose
    private final ThemeCategory category;

    @Expose
    private String myTemplateId;

    @Expose
    private String name;

    @Expose
    private final PaperOrientation orientation;

    @Expose
    private final String tnUri;

    @Expose
    private final String uri;

    static {
        int iMaxMemory = (int) (Runtime.getRuntime().maxMemory() / ((long) 1024));
        maxMemory = iMaxMemory;
        final int i = iMaxMemory / 2;
        cacheSize = i;
        imagePool = new LruCache<String, Bitmap>(i) { // from class: com.orion.notein.domain.models.papertheme.LocalUriPaperTheme$Companion$imagePool$1
            @Override // android.util.LruCache
            public int sizeOf(String key, Bitmap bitmap) {
                OooOOO0.OooO0oO(key, "key");
                OooOOO0.OooO0oO(bitmap, "bitmap");
                return bitmap.getByteCount() / 1024;
            }
        };
    }

    public /* synthetic */ LocalUriPaperTheme(PaperTheme paperTheme, String str, ThemeCategory themeCategory, PaperOrientation paperOrientation, String str2, String str3, String str4, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? null : paperTheme, (i & 2) != 0 ? "" : str, themeCategory, (i & 8) != 0 ? PaperOrientation.VERTICAL : paperOrientation, str2, str3, (i & 64) != 0 ? null : str4);
    }

    public static /* synthetic */ LocalUriPaperTheme copy$default(LocalUriPaperTheme localUriPaperTheme, PaperTheme paperTheme, String str, ThemeCategory themeCategory, PaperOrientation paperOrientation, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            paperTheme = localUriPaperTheme.baseTheme;
        }
        if ((i & 2) != 0) {
            str = localUriPaperTheme.name;
        }
        if ((i & 4) != 0) {
            themeCategory = localUriPaperTheme.category;
        }
        if ((i & 8) != 0) {
            paperOrientation = localUriPaperTheme.orientation;
        }
        if ((i & 16) != 0) {
            str2 = localUriPaperTheme.uri;
        }
        if ((i & 32) != 0) {
            str3 = localUriPaperTheme.tnUri;
        }
        if ((i & 64) != 0) {
            str4 = localUriPaperTheme.myTemplateId;
        }
        String str5 = str3;
        String str6 = str4;
        String str7 = str2;
        ThemeCategory themeCategory2 = themeCategory;
        return localUriPaperTheme.copy(paperTheme, str, themeCategory2, paperOrientation, str7, str5, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PaperTheme getBaseTheme() {
        return this.baseTheme;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ThemeCategory getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PaperOrientation getOrientation() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTnUri() {
        return this.tnUri;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMyTemplateId() {
        return this.myTemplateId;
    }

    public final LocalUriPaperTheme copy(PaperTheme baseTheme, String name, ThemeCategory category, PaperOrientation orientation, String uri, String tnUri, String myTemplateId) {
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(category, "category");
        OooOOO0.OooO0oO(orientation, "orientation");
        OooOOO0.OooO0oO(uri, "uri");
        OooOOO0.OooO0oO(tnUri, "tnUri");
        return new LocalUriPaperTheme(baseTheme, name, category, orientation, uri, tnUri, myTemplateId);
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public void drawPaperBg(Canvas canvas, Context context) {
        OooOOO0.OooO0oO(canvas, "canvas");
        OooOOO0.OooO0oO(context, "context");
        PaperTheme baseTheme = getBaseTheme();
        if (baseTheme != null) {
            baseTheme.drawPaperBg(canvas, context);
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.uri);
        if (bitmapDecodeFile != null) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeFile, canvas.getWidth(), canvas.getHeight(), true);
            OooOOO0.OooO0o(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            paint.setDither(true);
            canvas.drawBitmap(bitmapCreateScaledBitmap, 0.0f, 0.0f, paint);
        }
    }

    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalUriPaperTheme)) {
            return false;
        }
        LocalUriPaperTheme localUriPaperTheme = (LocalUriPaperTheme) other;
        return OooOOO0.OooO0O0(getBaseTheme(), localUriPaperTheme.getBaseTheme()) && OooOOO0.OooO0O0(getCategory(), localUriPaperTheme.getCategory()) && getOrientation() == localUriPaperTheme.getOrientation() && OooOOO0.OooO0O0(getName(), localUriPaperTheme.getName()) && OooOOO0.OooO0O0(this.uri, localUriPaperTheme.uri) && OooOOO0.OooO0O0(this.tnUri, localUriPaperTheme.tnUri);
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

    public final String getTnUri() {
        return this.tnUri;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        PaperTheme baseTheme = getBaseTheme();
        return this.tnUri.hashCode() + OooO00o.OooO0O0((getName().hashCode() + ((getOrientation().hashCode() + ((getCategory().hashCode() + ((527 + (baseTheme != null ? baseTheme.hashCode() : 0)) * 31)) * 31)) * 31)) * 31, 31, this.uri);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public <T> void render(o0O0oo00.OooO00o<T> renderEngine, OooO0O0<T> renderTarget, float scale) {
        C32443OooOOO c32443OooOOOOooO0OO = C21036OooOOo0.OooO0OO(renderEngine, "renderEngine", renderTarget, "renderTarget");
        render(renderEngine, renderTarget, scale, new RectF(0.0f, 0.0f, ((Number) c32443OooOOOOooO0OO.f116638OooOo0o).floatValue(), ((Number) c32443OooOOOOooO0OO.f116637OooOo).floatValue()));
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public void renderPaperRegion(Canvas canvas, int pageIndex, boolean renderAnnot, Context context, RectF normalizedRenderTaskBounds, int regionWidthPx, int regionHeightPx, int pageWidth, int pageHeight, boolean isInfiniteCanvas) {
        Bitmap bitmapCreateBitmap;
        OooOOO0.OooO0oO(canvas, "canvas");
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(normalizedRenderTaskBounds, "normalizedRenderTaskBounds");
        PaperTheme baseTheme = getBaseTheme();
        if (baseTheme != null) {
            baseTheme.renderPaperRegion(canvas, pageIndex, renderAnnot, context, normalizedRenderTaskBounds, regionWidthPx, regionHeightPx, pageWidth, pageHeight, isInfiniteCanvas);
        }
        if (imagePool.get(this.uri) == null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.uri, options);
            String str = this.uri;
            if (str == null || bitmapDecodeFile == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0(TAG);
                c20358OooO00o.OooOO0O(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("decode image failed uri:", this.uri), new Object[0]);
                return;
            }
            imagePool.put(str, bitmapDecodeFile);
        }
        Bitmap bitmap = imagePool.get(this.uri);
        if (bitmap != null) {
            Rect rect = new Rect((int) (normalizedRenderTaskBounds.left * bitmap.getWidth()), (int) (normalizedRenderTaskBounds.top * bitmap.getHeight()), (int) (normalizedRenderTaskBounds.right * bitmap.getWidth()), (int) (normalizedRenderTaskBounds.bottom * bitmap.getHeight()));
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0(TAG);
                c20358OooO00o2.OooO0Oo(e, "LocalUriPaperTheme.renderPageBitmap.croppedBitmap dont need crop, err.", new Object[0]);
                bitmapCreateBitmap = null;
            }
            if (bitmapCreateBitmap != null) {
                Matrix matrix = new Matrix();
                matrix.setScale(regionWidthPx / bitmapCreateBitmap.getWidth(), regionHeightPx / bitmapCreateBitmap.getHeight());
                canvas.drawBitmap(bitmapCreateBitmap, matrix, null);
            } else {
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0(TAG);
                c20358OooO00o3.OooO00o(o0Oo0oo.OooO0O0(imagePool.size(), "get originBitmap failed: poolSize(", ")"), new Object[0]);
            }
        }
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
        String str = this.name;
        ThemeCategory themeCategory = this.category;
        PaperOrientation paperOrientation = this.orientation;
        String str2 = this.uri;
        String str3 = this.tnUri;
        String str4 = this.myTemplateId;
        StringBuilder sb = new StringBuilder("LocalUriPaperTheme(baseTheme=");
        sb.append(paperTheme);
        sb.append(", name=");
        sb.append(str);
        sb.append(", category=");
        sb.append(themeCategory);
        sb.append(", orientation=");
        sb.append(paperOrientation);
        sb.append(", uri=");
        OooO0OO.OooO0o0(sb, str2, ", tnUri=", str3, ", myTemplateId=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, str4, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalUriPaperTheme(PaperTheme paperTheme, String name, ThemeCategory category, PaperOrientation orientation, String uri, String tnUri, String str) {
        super(paperTheme, name, category, orientation, str, null, 32, null);
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(category, "category");
        OooOOO0.OooO0oO(orientation, "orientation");
        OooOOO0.OooO0oO(uri, "uri");
        OooOOO0.OooO0oO(tnUri, "tnUri");
        this.baseTheme = paperTheme;
        this.name = name;
        this.category = category;
        this.orientation = orientation;
        this.uri = uri;
        this.tnUri = tnUri;
        this.myTemplateId = str;
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public <T> void render(o0O0oo00.OooO00o<T> renderEngine, OooO0O0<T> renderTarget, float scale, RectF renderTargetViewport) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        OooOOO0.OooO0oO(renderTargetViewport, "renderTargetViewport");
        PaperTheme baseTheme = getBaseTheme();
        if (baseTheme != null) {
            baseTheme.render(renderEngine, renderTarget, scale, renderTargetViewport);
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.uri);
        if (bitmapDecodeFile != null) {
            renderEngine.OooOo0o(bitmapDecodeFile, renderTargetViewport, 0.0f);
        }
    }
}
