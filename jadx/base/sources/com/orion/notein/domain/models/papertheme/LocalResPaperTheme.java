package com.orion.notein.domain.models.papertheme;

import OooOO0.OooO0OO;
import Oooo0oO.C21036OooOOo0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.LruCache;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.gson.annotations.Expose;
import com.orion.notein.domain.models.page.PaperOrientation;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;
import o0O0oo00.OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0086\b\u0018\u0000 f2\u00020\u0001:\u0001fBc\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\t\u0012\b\b\u0003\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0014J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010 J_\u0010*\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u0017H\u0017¢\u0006\u0004\b*\u0010+J9\u00103\u001a\u00020\u001e\"\u0004\b\u0000\u0010,2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104JA\u00103\u001a\u00020\u001e\"\u0004\b\u0000\u0010,2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/2\u0006\u00102\u001a\u0002012\u0006\u00105\u001a\u00020#H\u0016¢\u0006\u0004\b3\u00106J\u000f\u00107\u001a\u00020\tH\u0016¢\u0006\u0004\b7\u00108J\u001a\u0010;\u001a\u00020\u00172\b\u0010:\u001a\u0004\u0018\u000109H\u0096\u0002¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bE\u00108J\u0010\u0010F\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bF\u00108J\u0010\u0010G\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bG\u0010@J\u0010\u0010H\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bH\u0010@J\u0012\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bI\u0010@Jn\u0010J\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\bL\u0010@J\u001f\u0010Q\u001a\u00020\u00172\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bQ\u0010RR$\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010S\u001a\u0004\bT\u0010>\"\u0004\bU\u0010VR\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010W\u001a\u0004\bX\u0010@\"\u0004\bY\u0010ZR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010[\u001a\u0004\b\\\u0010BR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010]\u001a\u0004\b^\u0010DR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010_\u001a\u0004\b`\u00108R\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010_\u001a\u0004\ba\u00108R\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010W\u001a\u0004\bb\u0010@R\u001a\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010W\u001a\u0004\bc\u0010@R$\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010W\u001a\u0004\bd\u0010@\"\u0004\be\u0010Z¨\u0006g"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/LocalResPaperTheme;", "Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "baseTheme", "", "name", "Lcom/orion/notein/domain/models/papertheme/ThemeCategory;", "category", "Lcom/orion/notein/domain/models/page/PaperOrientation;", "orientation", "", "res", "tn", "resName", "tnName", "myTemplateId", "<init>", "(Lcom/orion/notein/domain/models/papertheme/PaperTheme;Ljava/lang/String;Lcom/orion/notein/domain/models/papertheme/ThemeCategory;Lcom/orion/notein/domain/models/page/PaperOrientation;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "getResourceId", "(Landroid/content/Context;)I", "getTnResourceId", "getNameResourceId", "", "isInvalid", "()Z", "getTitle", "(Landroid/content/Context;)Ljava/lang/String;", "Landroid/graphics/Canvas;", "canvas", "LoO00ooO/OooOooO;", "drawPaperBg", "(Landroid/graphics/Canvas;Landroid/content/Context;)V", "pageIndex", "renderAnnot", "Landroid/graphics/RectF;", "normalizedRenderTaskBounds", "regionWidthPx", "regionHeightPx", "pageWidth", "pageHeight", "isInfiniteCanvas", "renderPaperRegion", "(Landroid/graphics/Canvas;IZLandroid/content/Context;Landroid/graphics/RectF;IIIIZ)V", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "", "scale", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "renderTargetViewport", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;FLandroid/graphics/RectF;)V", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "component1", "()Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/orion/notein/domain/models/papertheme/ThemeCategory;", "component4", "()Lcom/orion/notein/domain/models/page/PaperOrientation;", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/orion/notein/domain/models/papertheme/PaperTheme;Ljava/lang/String;Lcom/orion/notein/domain/models/papertheme/ThemeCategory;Lcom/orion/notein/domain/models/page/PaperOrientation;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/orion/notein/domain/models/papertheme/LocalResPaperTheme;", "toString", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Rect;", "region", "needCrop", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;)Z", "Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "getBaseTheme", "setBaseTheme", "(Lcom/orion/notein/domain/models/papertheme/PaperTheme;)V", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "Lcom/orion/notein/domain/models/papertheme/ThemeCategory;", "getCategory", "Lcom/orion/notein/domain/models/page/PaperOrientation;", "getOrientation", "I", "getRes", "getTn", "getResName", "getTnName", "getMyTemplateId", "setMyTemplateId", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class LocalResPaperTheme extends PaperTheme {
    private static final int INVALID_RES_ID = 0;
    private static final String TAG = "LocalResPaperTheme";
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
    private final int res;

    @Expose
    private final String resName;

    @Expose
    private final int tn;

    @Expose
    private final String tnName;

    static {
        int iMaxMemory = (int) (Runtime.getRuntime().maxMemory() / ((long) 1024));
        maxMemory = iMaxMemory;
        final int i = iMaxMemory / 2;
        cacheSize = i;
        imagePool = new LruCache<String, Bitmap>(i) { // from class: com.orion.notein.domain.models.papertheme.LocalResPaperTheme$Companion$imagePool$1
            @Override // android.util.LruCache
            public int sizeOf(String key, Bitmap bitmap) {
                OooOOO0.OooO0oO(key, "key");
                OooOOO0.OooO0oO(bitmap, "bitmap");
                return bitmap.getByteCount() / 1024;
            }
        };
    }

    public /* synthetic */ LocalResPaperTheme(PaperTheme paperTheme, String str, ThemeCategory themeCategory, PaperOrientation paperOrientation, int i, int i2, String str2, String str3, String str4, int i3, C24018OooO0oo c24018OooO0oo) {
        this((i3 & 1) != 0 ? null : paperTheme, (i3 & 2) != 0 ? "" : str, themeCategory, (i3 & 8) != 0 ? PaperOrientation.VERTICAL : paperOrientation, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? "cover_v_1" : str2, (i3 & 128) != 0 ? "cover_v_1_tn" : str3, (i3 & 256) != 0 ? null : str4);
    }

    public static /* synthetic */ LocalResPaperTheme copy$default(LocalResPaperTheme localResPaperTheme, PaperTheme paperTheme, String str, ThemeCategory themeCategory, PaperOrientation paperOrientation, int i, int i2, String str2, String str3, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            paperTheme = localResPaperTheme.baseTheme;
        }
        if ((i3 & 2) != 0) {
            str = localResPaperTheme.name;
        }
        if ((i3 & 4) != 0) {
            themeCategory = localResPaperTheme.category;
        }
        if ((i3 & 8) != 0) {
            paperOrientation = localResPaperTheme.orientation;
        }
        if ((i3 & 16) != 0) {
            i = localResPaperTheme.res;
        }
        if ((i3 & 32) != 0) {
            i2 = localResPaperTheme.tn;
        }
        if ((i3 & 64) != 0) {
            str2 = localResPaperTheme.resName;
        }
        if ((i3 & 128) != 0) {
            str3 = localResPaperTheme.tnName;
        }
        if ((i3 & 256) != 0) {
            str4 = localResPaperTheme.myTemplateId;
        }
        String str5 = str3;
        String str6 = str4;
        int i4 = i2;
        String str7 = str2;
        int i5 = i;
        ThemeCategory themeCategory2 = themeCategory;
        return localResPaperTheme.copy(paperTheme, str, themeCategory2, paperOrientation, i5, i4, str7, str5, str6);
    }

    private final boolean needCrop(Bitmap bitmap, Rect region) {
        if (region.left >= 0 && region.top >= 0 && region.right <= bitmap.getWidth() && region.bottom <= bitmap.getHeight()) {
            return false;
        }
        C34406OooO00o.f123390OooO00o.OooO00o("need crop true", new Object[0]);
        return true;
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
    public final int getRes() {
        return this.res;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTn() {
        return this.tn;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getResName() {
        return this.resName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTnName() {
        return this.tnName;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMyTemplateId() {
        return this.myTemplateId;
    }

    public final LocalResPaperTheme copy(PaperTheme baseTheme, String name, ThemeCategory category, PaperOrientation orientation, int res, int tn, String resName, String tnName, String myTemplateId) {
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(category, "category");
        OooOOO0.OooO0oO(orientation, "orientation");
        OooOOO0.OooO0oO(resName, "resName");
        OooOOO0.OooO0oO(tnName, "tnName");
        return new LocalResPaperTheme(baseTheme, name, category, orientation, res, tn, resName, tnName, myTemplateId);
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public void drawPaperBg(Canvas canvas, Context context) {
        OooOOO0.OooO0oO(canvas, "canvas");
        OooOOO0.OooO0oO(context, "context");
        PaperTheme baseTheme = getBaseTheme();
        if (baseTheme != null) {
            baseTheme.drawPaperBg(canvas, context);
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), getResourceId(context));
        if (bitmapDecodeResource != null) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeResource, canvas.getWidth(), canvas.getHeight(), true);
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
        if (!(other instanceof LocalResPaperTheme)) {
            return false;
        }
        LocalResPaperTheme localResPaperTheme = (LocalResPaperTheme) other;
        return OooOOO0.OooO0O0(getBaseTheme(), localResPaperTheme.getBaseTheme()) && OooOOO0.OooO0O0(getCategory(), localResPaperTheme.getCategory()) && getOrientation() == localResPaperTheme.getOrientation() && OooOOO0.OooO0O0(getName(), localResPaperTheme.getName()) && OooOOO0.OooO0O0(this.resName, localResPaperTheme.resName) && OooOOO0.OooO0O0(this.tnName, localResPaperTheme.tnName);
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

    public final int getNameResourceId(Context context) {
        OooOOO0.OooO0oO(context, "context");
        return context.getResources().getIdentifier(this.resName, "string", context.getPackageName());
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public PaperOrientation getOrientation() {
        return this.orientation;
    }

    public final int getRes() {
        return this.res;
    }

    public final String getResName() {
        return this.resName;
    }

    public final int getResourceId(Context context) {
        OooOOO0.OooO0oO(context, "context");
        return context.getResources().getIdentifier(this.resName, "drawable", context.getPackageName());
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public String getTitle(Context context) {
        OooOOO0.OooO0oO(context, "context");
        int nameResourceId = getNameResourceId(context);
        if (nameResourceId == 0) {
            return super.getTitle(context);
        }
        String string = context.getString(nameResourceId);
        OooOOO0.OooO0o(string, "getString(...)");
        return string;
    }

    public final int getTn() {
        return this.tn;
    }

    public final String getTnName() {
        return this.tnName;
    }

    public final int getTnResourceId(Context context) {
        OooOOO0.OooO0oO(context, "context");
        return context.getResources().getIdentifier(this.tnName, "drawable", context.getPackageName());
    }

    public int hashCode() {
        PaperTheme baseTheme = getBaseTheme();
        return this.tnName.hashCode() + OooO00o.OooO0O0((getName().hashCode() + ((getOrientation().hashCode() + ((getCategory().hashCode() + ((527 + (baseTheme != null ? baseTheme.hashCode() : 0)) * 31)) * 31)) * 31)) * 31, 31, this.resName);
    }

    public final boolean isInvalid() {
        return (this.res == 0 || this.tn == 0) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public <T> void render(o0O0oo00.OooO00o<T> renderEngine, OooO0O0<T> renderTarget, float scale) {
        C32443OooOOO c32443OooOOOOooO0OO = C21036OooOOo0.OooO0OO(renderEngine, "renderEngine", renderTarget, "renderTarget");
        render(renderEngine, renderTarget, scale, new RectF(0.0f, 0.0f, ((Number) c32443OooOOOOooO0OO.f116638OooOo0o).floatValue(), ((Number) c32443OooOOOOooO0OO.f116637OooOo).floatValue()));
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public void renderPaperRegion(Canvas canvas, int pageIndex, boolean renderAnnot, Context context, RectF normalizedRenderTaskBounds, int regionWidthPx, int regionHeightPx, int pageWidth, int pageHeight, boolean isInfiniteCanvas) {
        int i;
        int i2;
        C32460OooOooO c32460OooOooO;
        OooOOO0.OooO0oO(canvas, "canvas");
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(normalizedRenderTaskBounds, "normalizedRenderTaskBounds");
        PaperTheme baseTheme = getBaseTheme();
        if (baseTheme != null) {
            i = regionWidthPx;
            i2 = regionHeightPx;
            baseTheme.renderPaperRegion(canvas, pageIndex, renderAnnot, context, normalizedRenderTaskBounds, i, i2, pageWidth, pageHeight, isInfiniteCanvas);
        } else {
            i = regionWidthPx;
            i2 = regionHeightPx;
        }
        if (imagePool.get(this.resName) == null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            imagePool.put(this.resName, BitmapFactory.decodeResource(context.getResources(), getResourceId(context), options));
        }
        Bitmap bitmap = imagePool.get(this.resName);
        if (bitmap != null) {
            Rect rect = new Rect((int) (normalizedRenderTaskBounds.left * bitmap.getWidth()), (int) (normalizedRenderTaskBounds.top * bitmap.getHeight()), (int) (normalizedRenderTaskBounds.right * bitmap.getWidth()), (int) (normalizedRenderTaskBounds.bottom * bitmap.getHeight()));
            if (needCrop(bitmap, rect)) {
                int i3 = rect.left;
                if (i3 < 0) {
                    i3 = 0;
                }
                int i4 = rect.top;
                int i5 = i4 >= 0 ? i4 : 0;
                int i6 = rect.right;
                int width = bitmap.getWidth();
                if (i6 > width) {
                    i6 = width;
                }
                int i7 = rect.bottom;
                int height = bitmap.getHeight();
                if (i7 > height) {
                    i7 = height;
                }
                Rect rect2 = new Rect(i3, i5, i6, i7);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rect2.left, rect2.top, rect2.width(), rect2.height());
                OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
                Matrix matrix = new Matrix();
                matrix.postTranslate(rect2.left - rect.left, rect2.top - rect.top);
                matrix.postScale(i / rect.width(), i2 / rect.height());
                canvas.drawBitmap(bitmapCreateBitmap, matrix, null);
                c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
                OooOOO0.OooO0o(bitmapCreateBitmap2, "createBitmap(...)");
                Matrix matrix2 = new Matrix();
                matrix2.setScale(i / bitmapCreateBitmap2.getWidth(), i2 / bitmapCreateBitmap2.getHeight());
                canvas.drawBitmap(bitmapCreateBitmap2, matrix2, null);
                c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            if (c32460OooOooO != null) {
                return;
            }
        }
        Log.d(TAG, "get originBitmap failed: poolSize(" + imagePool.size() + ")");
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
        int i = this.res;
        int i2 = this.tn;
        String str2 = this.resName;
        String str3 = this.tnName;
        String str4 = this.myTemplateId;
        StringBuilder sb = new StringBuilder("LocalResPaperTheme(baseTheme=");
        sb.append(paperTheme);
        sb.append(", name=");
        sb.append(str);
        sb.append(", category=");
        sb.append(themeCategory);
        sb.append(", orientation=");
        sb.append(paperOrientation);
        sb.append(", res=");
        C24472OooOoo.OooO0O0(sb, ", tn=", ", resName=", i, i2);
        OooO0OO.OooO0o0(sb, str2, ", tnName=", str3, ", myTemplateId=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, str4, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalResPaperTheme(PaperTheme paperTheme, String name, ThemeCategory category, PaperOrientation orientation, int i, int i2, String resName, String tnName, String str) {
        super(paperTheme, name, category, orientation, null, null, 48, null);
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(category, "category");
        OooOOO0.OooO0oO(orientation, "orientation");
        OooOOO0.OooO0oO(resName, "resName");
        OooOOO0.OooO0oO(tnName, "tnName");
        this.baseTheme = paperTheme;
        this.name = name;
        this.category = category;
        this.orientation = orientation;
        this.res = i;
        this.tn = i2;
        this.resName = resName;
        this.tnName = tnName;
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
        Context contextOooO00o = renderTarget.OooO00o();
        OooOOO0.OooO0Oo(contextOooO00o);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(contextOooO00o.getResources(), getResourceId(contextOooO00o));
        if (bitmapDecodeResource != null) {
            renderEngine.OooOo0o(bitmapDecodeResource, renderTargetViewport, 0.0f);
        }
    }
}
