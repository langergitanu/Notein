package com.orion.notein.domain.models.papertheme;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import com.orion.notein.domain.models.page.PaperOrientation;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0O0oo00.OooO00o;
import o0O0oo00.OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\b&\u0018\u0000BE\u0012\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u0019\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u0004\u0018\u00010 2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010\"R\u001c\u0010\u0001\u001a\u0004\u0018\u00010\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0001\u0010$\u001a\u0004\b%\u0010&R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u00101R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010'\u001a\u0004\b2\u0010)\"\u0004\b3\u0010+R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u00106¨\u00067"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "baseTheme", "", "name", "Lcom/orion/notein/domain/models/papertheme/ThemeCategory;", "category", "Lcom/orion/notein/domain/models/page/PaperOrientation;", "orientation", "myTemplateId", "", "downloadable", "<init>", "(Lcom/orion/notein/domain/models/papertheme/PaperTheme;Ljava/lang/String;Lcom/orion/notein/domain/models/papertheme/ThemeCategory;Lcom/orion/notein/domain/models/page/PaperOrientation;Ljava/lang/String;Ljava/lang/Boolean;)V", "Landroid/content/Context;", "context", "getTitle", "(Landroid/content/Context;)Ljava/lang/String;", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "", "scale", "LoO00ooO/OooOooO;", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "Landroid/graphics/RectF;", "renderTargetViewport", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;FLandroid/graphics/RectF;)V", "availableFromLocal", "(Landroid/content/Context;)Z", "Ljava/io/File;", "getLocalThemeFileIfExists", "(Landroid/content/Context;)Ljava/io/File;", "getDownloadableFile", "Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "getBaseTheme", "()Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "Lcom/orion/notein/domain/models/papertheme/ThemeCategory;", "getCategory", "()Lcom/orion/notein/domain/models/papertheme/ThemeCategory;", "Lcom/orion/notein/domain/models/page/PaperOrientation;", "getOrientation", "()Lcom/orion/notein/domain/models/page/PaperOrientation;", "getMyTemplateId", "setMyTemplateId", "Ljava/lang/Boolean;", "getDownloadable", "()Ljava/lang/Boolean;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class PaperTheme {
    private final PaperTheme baseTheme;
    private final ThemeCategory category;
    private final Boolean downloadable;
    private String myTemplateId;
    private String name;
    private final PaperOrientation orientation;

    public PaperTheme(PaperTheme paperTheme, String name, ThemeCategory category, PaperOrientation orientation, String str, Boolean bool) {
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(category, "category");
        OooOOO0.OooO0oO(orientation, "orientation");
        this.baseTheme = paperTheme;
        this.name = name;
        this.category = category;
        this.orientation = orientation;
        this.myTemplateId = str;
        this.downloadable = bool;
    }

    public boolean availableFromLocal(Context context) {
        OooOOO0.OooO0oO(context, "context");
        return true;
    }

    public abstract void drawPaperBg(Canvas canvas, Context context);

    public PaperTheme getBaseTheme() {
        return this.baseTheme;
    }

    public ThemeCategory getCategory() {
        return this.category;
    }

    public Boolean getDownloadable() {
        return this.downloadable;
    }

    public File getDownloadableFile(Context context) {
        OooOOO0.OooO0oO(context, "context");
        return null;
    }

    public File getLocalThemeFileIfExists(Context context) {
        OooOOO0.OooO0oO(context, "context");
        return null;
    }

    public String getMyTemplateId() {
        return this.myTemplateId;
    }

    public String getName() {
        return this.name;
    }

    public PaperOrientation getOrientation() {
        return this.orientation;
    }

    public String getTitle(Context context) {
        OooOOO0.OooO0oO(context, "context");
        return getName();
    }

    public <T> void render(OooO00o<T> renderEngine, OooO0O0<T> renderTarget, float scale) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
    }

    public abstract void renderPaperRegion(Canvas canvas, int i, boolean z, Context context, RectF rectF, int i2, int i3, int i4, int i5, boolean z2);

    public void setMyTemplateId(String str) {
        this.myTemplateId = str;
    }

    public void setName(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.name = str;
    }

    public <T> void render(OooO00o<T> renderEngine, OooO0O0<T> renderTarget, float scale, RectF renderTargetViewport) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        OooOOO0.OooO0oO(renderTargetViewport, "renderTargetViewport");
    }

    public /* synthetic */ PaperTheme(PaperTheme paperTheme, String str, ThemeCategory themeCategory, PaperOrientation paperOrientation, String str2, Boolean bool, int i, C24018OooO0oo c24018OooO0oo) {
        this(paperTheme, (i & 2) != 0 ? "" : str, themeCategory, (i & 8) != 0 ? PaperOrientation.VERTICAL : paperOrientation, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : bool);
    }
}
