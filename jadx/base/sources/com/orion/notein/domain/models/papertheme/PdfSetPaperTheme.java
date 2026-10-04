package com.orion.notein.domain.models.papertheme;

import Oooo0oO.C21036OooOOo0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.aspose.slides.OooOOO;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.gson.annotations.Expose;
import com.huawei.hms.network.embedded.C18115b5;
import com.miui.penengine.p596e.C18773h;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.global.R;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o00o00oo.C25298OooO0o;
import o0O0oOOO.C26120OooO0Oo;
import o0O0oOOO.C26121OooO0o0;
import o0O0oo00.OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO0O000.C32501OooO0oO;
import oO0o0O0o.C33595OooOOo;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.Oooo0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\b\u001e\b\u0086\b\u0018\u0000 j2\u00020\u0001:\u0001jBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b \u0010!J_\u0010+\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u000bH\u0016¢\u0006\u0004\b+\u0010,J9\u00104\u001a\u00020\u001f\"\u0004\b\u0000\u0010-2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.2\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u0000002\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105JA\u00104\u001a\u00020\u001f\"\u0004\b\u0000\u0010-2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.2\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u0000002\u0006\u00103\u001a\u0002022\u0006\u00106\u001a\u00020$H\u0016¢\u0006\u0004\b4\u00107J\u0017\u00108\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b8\u0010\u001cJ\u000f\u00109\u001a\u00020\u0005H\u0016¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020\u000b2\b\u0010<\u001a\u0004\u0018\u00010;H\u0096\u0002¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bA\u0010@J\u0010\u0010B\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bB\u0010:J\u0010\u0010C\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bI\u0010@JZ\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bL\u0010@J\u001b\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020MH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bR\u0010\u0017J\u0017\u0010S\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bS\u0010\u0017J\u0017\u0010U\u001a\u00020\u000b2\u0006\u0010T\u001a\u00020\u0015H\u0002¢\u0006\u0004\bU\u0010VJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010W\u001a\u00020$H\u0002¢\u0006\u0004\b \u0010XJ\u0017\u0010Y\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bY\u0010ZR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010[\u001a\u0004\b\\\u0010@\"\u0004\b]\u0010^R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010[\u001a\u0004\b_\u0010@R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010`\u001a\u0004\ba\u0010:R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010b\u001a\u0004\bc\u0010DR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010d\u001a\u0004\be\u0010FR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010f\u001a\u0004\bg\u0010HR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\r\u0010[\u001a\u0004\bh\u0010@\"\u0004\bi\u0010^¨\u0006k"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/PdfSetPaperTheme;", "Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "", "name", "spec", "", "color", "Lcom/orion/notein/domain/models/page/PaperOrientation;", "orientation", "Lcom/orion/notein/domain/models/papertheme/ThemeCategory;", "category", "", "downloadable", "myTemplateId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/orion/notein/domain/models/page/PaperOrientation;Lcom/orion/notein/domain/models/papertheme/ThemeCategory;Ljava/lang/Boolean;Ljava/lang/String;)V", "", "getSupportColors", "()Ljava/util/Set;", "Landroid/content/Context;", "context", "Ljava/io/File;", "getLocalThemeFileIfExists", "(Landroid/content/Context;)Ljava/io/File;", "availableFromLocal", "(Landroid/content/Context;)Z", "getDownloadableFile", "getPath", "(Landroid/content/Context;)Ljava/lang/String;", "Landroid/graphics/Canvas;", "canvas", "LoO00ooO/OooOooO;", "drawPaperBg", "(Landroid/graphics/Canvas;Landroid/content/Context;)V", "pageIndex", "renderAnnot", "Landroid/graphics/RectF;", "normalizedRenderTaskBounds", "regionWidthPx", "regionHeightPx", "pageWidth", "pageHeight", "isInfiniteCanvas", "renderPaperRegion", "(Landroid/graphics/Canvas;IZLandroid/content/Context;Landroid/graphics/RectF;IIIIZ)V", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "", "scale", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "renderTargetViewport", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;FLandroid/graphics/RectF;)V", "getTitle", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/orion/notein/domain/models/page/PaperOrientation;", "component5", "()Lcom/orion/notein/domain/models/papertheme/ThemeCategory;", "component6", "()Ljava/lang/Boolean;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;ILcom/orion/notein/domain/models/page/PaperOrientation;Lcom/orion/notein/domain/models/papertheme/ThemeCategory;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/orion/notein/domain/models/papertheme/PdfSetPaperTheme;", "toString", "", "getSupportColorDict", "()Ljava/util/Map;", "getColorString", "(I)Ljava/lang/String;", "getThemeFileLegacy", "getThemeFile", "file", "saveDeleteFile", "(Ljava/io/File;)Z", "renderBounds", "(Landroid/graphics/Canvas;Landroid/content/Context;Landroid/graphics/RectF;)V", "getTnResIdForDownloadableTheme", "(Landroid/content/Context;)I", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "getSpec", "I", "getColor", "Lcom/orion/notein/domain/models/page/PaperOrientation;", "getOrientation", "Lcom/orion/notein/domain/models/papertheme/ThemeCategory;", "getCategory", "Ljava/lang/Boolean;", "getDownloadable", "getMyTemplateId", "setMyTemplateId", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PdfSetPaperTheme extends PaperTheme {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int DEFAULT_COLOR = Color.parseColor("#FCF9F4");
    private static final Map<Integer, String> DEFAULT_COLOR_DICT;
    public static final String TAG = "PdfSetPaperTheme";

    @Expose
    private final ThemeCategory category;

    @Expose
    private final int color;

    @Expose
    private final Boolean downloadable;

    @Expose
    private String myTemplateId;

    @Expose
    private String name;

    @Expose
    private final PaperOrientation orientation;

    @Expose
    private final String spec;

    @Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/PdfSetPaperTheme$Companion;", "", "<init>", "()V", "TAG", "", "DEFAULT_COLOR", "", "DEFAULT_COLOR_DICT", "", "getOrientationString", "orientation", "Lcom/orion/notein/domain/models/page/PaperOrientation;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getOrientationString(PaperOrientation orientation) {
            return orientation == PaperOrientation.VERTICAL ? "v" : C18773h.f57233c;
        }

        private Companion() {
        }
    }

    static {
        PaperColors paperColors = PaperColors.INSTANCE;
        DEFAULT_COLOR_DICT = C34444Oooo0O0.OooO0oo(new C32443OooOOO(Integer.valueOf(paperColors.getCOLOR_01()), "beige"), new C32443OooOOO(Integer.valueOf(paperColors.getCOLOR_02()), "yellow"), new C32443OooOOO(Integer.valueOf(paperColors.getCOLOR_05()), "black"));
    }

    public /* synthetic */ PdfSetPaperTheme(String str, String str2, int i, PaperOrientation paperOrientation, ThemeCategory themeCategory, Boolean bool, String str3, int i2, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, i, paperOrientation, themeCategory, (i2 & 32) != 0 ? Boolean.FALSE : bool, (i2 & 64) != 0 ? null : str3);
    }

    public static /* synthetic */ PdfSetPaperTheme copy$default(PdfSetPaperTheme pdfSetPaperTheme, String str, String str2, int i, PaperOrientation paperOrientation, ThemeCategory themeCategory, Boolean bool, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = pdfSetPaperTheme.name;
        }
        if ((i2 & 2) != 0) {
            str2 = pdfSetPaperTheme.spec;
        }
        if ((i2 & 4) != 0) {
            i = pdfSetPaperTheme.color;
        }
        if ((i2 & 8) != 0) {
            paperOrientation = pdfSetPaperTheme.orientation;
        }
        if ((i2 & 16) != 0) {
            themeCategory = pdfSetPaperTheme.category;
        }
        if ((i2 & 32) != 0) {
            bool = pdfSetPaperTheme.downloadable;
        }
        if ((i2 & 64) != 0) {
            str3 = pdfSetPaperTheme.myTemplateId;
        }
        Boolean bool2 = bool;
        String str4 = str3;
        ThemeCategory themeCategory2 = themeCategory;
        int i3 = i;
        return pdfSetPaperTheme.copy(str, str2, i3, paperOrientation, themeCategory2, bool2, str4);
    }

    private final String getColorString(int color) {
        String str = getSupportColorDict().get(Integer.valueOf(color));
        return str == null ? "beige" : str;
    }

    private static final void getPath$loadFromAssets(File file, PdfSetPaperTheme pdfSetPaperTheme, Context context) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            InputStream inputStreamOpen = context.getAssets().open("themes/" + pdfSetPaperTheme.getName() + "/" + file.getName());
            try {
                OooOOO0.OooO0Oo(inputStreamOpen);
                C25298OooO0o.OooO00o(inputStreamOpen, fileOutputStream);
                inputStreamOpen.close();
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                inputStreamOpen.close();
                fileOutputStream.close();
            } finally {
            }
        } finally {
        }
    }

    private static final void getPath$loadFromHistoricalDirectory(PdfSetPaperTheme pdfSetPaperTheme, Context context, File file) throws IOException {
        File themeFileLegacy = pdfSetPaperTheme.getThemeFileLegacy(context);
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0(TAG);
        c20358OooO00o.OooO0o0("legacyThemeFile: " + themeFileLegacy.exists() + ", " + themeFileLegacy.getName(), new Object[0]);
        if (themeFileLegacy.exists()) {
            C32501OooO0oO.OooO0OO(themeFileLegacy, file);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Map<Integer, String> getSupportColorDict() {
        String name = getName();
        int iHashCode = name.hashCode();
        Integer numValueOf = Integer.valueOf(ViewCompat.MEASURED_STATE_MASK);
        switch (iHashCode) {
            case -1486978489:
                if (name.equals("weeklyplan1")) {
                    return Oooo0.OooO0o0(new C32443OooOOO(-198156, "beige"));
                }
                break;
            case -1486978488:
                if (name.equals("weeklyplan2")) {
                    return Oooo0.OooO0o0(new C32443OooOOO(-198156, "beige"));
                }
                break;
            case -1486978487:
                if (name.equals("weeklyplan3")) {
                    return Oooo0.OooO0o0(new C32443OooOOO(-198156, "beige"));
                }
                break;
            case -1197165374:
                if (name.equals("dailyplan")) {
                    return Oooo0.OooO0o0(new C32443OooOOO(-198156, "beige"));
                }
                break;
            case -463609046:
                if (name.equals("weeklyplan")) {
                    return Oooo0.OooO0o0(new C32443OooOOO(-198156, "beige"));
                }
                break;
            case 28798195:
                if (name.equals("wordbook")) {
                    return C34444Oooo0O0.OooO0oo(new C32443OooOOO(-198156, "beige"), new C32443OooOOO(numValueOf, "black"));
                }
                break;
            case 807581441:
                if (name.equals("planaplanb")) {
                    return C34444Oooo0O0.OooO0oo(new C32443OooOOO(-198156, "beige"), new C32443OooOOO(numValueOf, "black"));
                }
                break;
            case 815432358:
                if (name.equals("advwordbook")) {
                    return C34444Oooo0O0.OooO0oo(new C32443OooOOO(-198156, "beige"), new C32443OooOOO(numValueOf, "black"));
                }
                break;
            case 894766232:
                if (name.equals("memorycurveword")) {
                    return C34444Oooo0O0.OooO0oo(new C32443OooOOO(-198156, "beige"), new C32443OooOOO(numValueOf, "black"));
                }
                break;
            case 1431915702:
                if (name.equals("monthlyplan")) {
                    return Oooo0.OooO0o0(new C32443OooOOO(-198156, "beige"));
                }
                break;
            case 1511679182:
                if (name.equals("tripplan")) {
                    return C34444Oooo0O0.OooO0oo(new C32443OooOOO(-198156, "beige"), new C32443OooOOO(numValueOf, "black"));
                }
                break;
            case 1654222072:
                if (name.equals("errorsets1")) {
                    return C34444Oooo0O0.OooO0oo(new C32443OooOOO(-198156, "beige"), new C32443OooOOO(numValueOf, "black"));
                }
                break;
            case 1654222073:
                if (name.equals("errorsets2")) {
                    return C34444Oooo0O0.OooO0oo(new C32443OooOOO(-198156, "beige"), new C32443OooOOO(numValueOf, "black"));
                }
                break;
        }
        return DEFAULT_COLOR_DICT;
    }

    private final File getThemeFile(Context context) {
        String name = getName();
        String str = this.spec;
        String colorString = getColorString(this.color);
        String orientationString = INSTANCE.getOrientationString(getOrientation());
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(C18115b5.CONNECTOR);
        sb.append(str);
        sb.append(C18115b5.CONNECTOR);
        sb.append(colorString);
        String strOooO0O0 = OooOOO.OooO0O0(sb, C18115b5.CONNECTOR, orientationString, ".pdf");
        return OooOOO0.OooO0O0(getDownloadable(), Boolean.TRUE) ? new File(ThemeUtils.INSTANCE.getThemeDownloadDir(context), strOooO0O0) : new File(context.getCacheDir(), strOooO0O0);
    }

    private final File getThemeFileLegacy(Context context) {
        String name = getName();
        String str = this.spec;
        String colorString = getColorString(this.color);
        String orientationString = INSTANCE.getOrientationString(getOrientation());
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(C18115b5.CONNECTOR);
        sb.append(str);
        sb.append(C18115b5.CONNECTOR);
        sb.append(colorString);
        return new File(context.getCacheDir(), OooOOO.OooO0O0(sb, C18115b5.CONNECTOR, orientationString, ".pdf"));
    }

    private final int getTnResIdForDownloadableTheme(Context context) {
        String name = getThemeFile(context).getName();
        OooOOO0.OooO0o(name, "getName(...)");
        return context.getResources().getIdentifier(C33595OooOOo.OooOo0O(name, ".pdf", ""), "drawable", context.getPackageName());
    }

    private final boolean saveDeleteFile(File file) {
        try {
            return file.delete();
        } catch (IOException e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0(TAG);
            c20358OooO00o.OooO0O0(e);
            return false;
        }
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public boolean availableFromLocal(Context context) {
        OooOOO0.OooO0oO(context, "context");
        return (OooOOO0.OooO0O0(getDownloadable(), Boolean.TRUE) && getPath(context) == null) ? false : true;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSpec() {
        return this.spec;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PaperOrientation getOrientation() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ThemeCategory getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getDownloadable() {
        return this.downloadable;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMyTemplateId() {
        return this.myTemplateId;
    }

    public final PdfSetPaperTheme copy(String name, String spec, int color, PaperOrientation orientation, ThemeCategory category, Boolean downloadable, String myTemplateId) {
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(spec, "spec");
        OooOOO0.OooO0oO(orientation, "orientation");
        OooOOO0.OooO0oO(category, "category");
        return new PdfSetPaperTheme(name, spec, color, orientation, category, downloadable, myTemplateId);
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
        if (!(other instanceof PdfSetPaperTheme)) {
            return false;
        }
        PdfSetPaperTheme pdfSetPaperTheme = (PdfSetPaperTheme) other;
        return OooOOO0.OooO0O0(getBaseTheme(), pdfSetPaperTheme.getBaseTheme()) && OooOOO0.OooO0O0(getCategory(), pdfSetPaperTheme.getCategory()) && getOrientation() == pdfSetPaperTheme.getOrientation() && OooOOO0.OooO0O0(getName(), pdfSetPaperTheme.getName()) && OooOOO0.OooO0O0(this.spec, pdfSetPaperTheme.spec) && this.color == pdfSetPaperTheme.color;
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public ThemeCategory getCategory() {
        return this.category;
    }

    public final int getColor() {
        return this.color;
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public Boolean getDownloadable() {
        return this.downloadable;
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public File getDownloadableFile(Context context) {
        OooOOO0.OooO0oO(context, "context");
        if (OooOOO0.OooO0O0(getDownloadable(), Boolean.TRUE)) {
            return getThemeFile(context);
        }
        return null;
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public File getLocalThemeFileIfExists(Context context) {
        OooOOO0.OooO0oO(context, "context");
        File themeFile = getThemeFile(context);
        if (!themeFile.exists()) {
            themeFile = null;
        }
        if (themeFile != null) {
            return themeFile;
        }
        File themeFileLegacy = getThemeFileLegacy(context);
        if (themeFileLegacy.exists()) {
            return themeFileLegacy;
        }
        return null;
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

    public final String getPath(Context context) {
        OooOOO0.OooO0oO(context, "context");
        File themeFile = getThemeFile(context);
        if (!themeFile.exists()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0(TAG);
            c20358OooO00o.OooO0o0("themeFile is not exists, themeFile: " + themeFile.getName() + ", downloadable: " + getDownloadable(), new Object[0]);
            if (OooOOO0.OooO0O0(getDownloadable(), Boolean.TRUE)) {
                getPath$loadFromHistoricalDirectory(this, context, themeFile);
            } else {
                try {
                    getPath$loadFromAssets(themeFile, this, context);
                } catch (Exception e) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0(TAG);
                    c20358OooO00o2.OooO0Oo(e, "loadFromAssets err.", new Object[0]);
                    return null;
                }
            }
        }
        if (!themeFile.exists()) {
            themeFile = null;
        }
        if (themeFile != null) {
            return themeFile.getAbsolutePath();
        }
        return null;
    }

    public final String getSpec() {
        return this.spec;
    }

    public final Set<Integer> getSupportColors() {
        return getSupportColorDict().keySet();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01aa, code lost:
    
        if (r0.equals("wordbook_v2") == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ae, code lost:
    
        r4 = r4.getString(com.orion.notein.global.R.string.paper_style_wordbook);
        kotlin.jvm.internal.OooOOO0.OooO0o(r4, "getString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01b8, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d4, code lost:
    
        if (r0.equals("dailyplan") == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01d8, code lost:
    
        r4 = r4.getString(com.orion.notein.global.R.string.paper_style_dailyplan);
        kotlin.jvm.internal.OooOOO0.OooO0o(r4, "getString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01e2, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r0.equals("monthlyplan") == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r0.equals("memorycurveword_v2") == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r0.equals("weeklyplan_v2") == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r0.equals("memorycurveword") == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        r4 = r4.getString(com.orion.notein.global.R.string.paper_style_memory_curve_word);
        kotlin.jvm.internal.OooOOO0.OooO0o(r4, "getString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        if (r0.equals("music_v2") == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
    
        if (r0.equals("advwordbook") == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b6, code lost:
    
        if (r0.equals("dailyplan_v2") == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c0, code lost:
    
        if (r0.equals("monthlyplan_v2") == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c4, code lost:
    
        r4 = r4.getString(com.orion.notein.global.R.string.paper_style_monthlyplan);
        kotlin.jvm.internal.OooOOO0.OooO0o(r4, "getString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ce, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d5, code lost:
    
        if (r0.equals("errorsets2_v2") == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d9, code lost:
    
        r4 = r4.getString(com.orion.notein.global.R.string.paper_style_memory_error_sets_2);
        kotlin.jvm.internal.OooOOO0.OooO0o(r4, "getString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e3, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ea, code lost:
    
        if (r0.equals("errorsets1_v2") == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ee, code lost:
    
        r4 = r4.getString(com.orion.notein.global.R.string.paper_style_memory_error_sets_1);
        kotlin.jvm.internal.OooOOO0.OooO0o(r4, "getString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f8, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ff, code lost:
    
        if (r0.equals("matts_v2") == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0109, code lost:
    
        if (r0.equals("advwordbook_v2") == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r0.equals("errorsets2") == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010d, code lost:
    
        r4 = r4.getString(com.orion.notein.global.R.string.paper_style_adv_wordbook);
        kotlin.jvm.internal.OooOOO0.OooO0o(r4, "getString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0117, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x011e, code lost:
    
        if (r0.equals("music") == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0122, code lost:
    
        r4 = r4.getString(com.orion.notein.global.R.string.paper_style_music);
        kotlin.jvm.internal.OooOOO0.OooO0o(r4, "getString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012c, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0133, code lost:
    
        if (r0.equals("matts") == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0137, code lost:
    
        r4 = r4.getString(com.orion.notein.global.R.string.paper_style_matts);
        kotlin.jvm.internal.OooOOO0.OooO0o(r4, "getString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0141, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0149, code lost:
    
        if (r0.equals("wordbook") == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x016a, code lost:
    
        if (r0.equals("weeklyplan") == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x016e, code lost:
    
        r4 = r4.getString(com.orion.notein.global.R.string.paper_style_weeklyplan);
        kotlin.jvm.internal.OooOOO0.OooO0o(r4, "getString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0178, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r0.equals("errorsets1") == false) goto L157;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getTitle(Context context) {
        OooOOO0.OooO0oO(context, "context");
        String name = getName();
        switch (name.hashCode()) {
            case -1980415382:
                if (name.equals("daily_journal_v2")) {
                    String string = context.getString(R.string.paper_style_daily_journal);
                    OooOOO0.OooO0o(string, "getString(...)");
                    return string;
                }
                return getName();
            case -1871666362:
                if (name.equals("readingnotes_v2")) {
                    String string2 = context.getString(R.string.paper_style_reading_notes);
                    OooOOO0.OooO0o(string2, "getString(...)");
                    return string2;
                }
                return getName();
            case -1603757456:
                if (name.equals("english")) {
                    String string3 = context.getString(R.string.paper_style_english);
                    OooOOO0.OooO0o(string3, "getString(...)");
                    return string3;
                }
                return getName();
            case -1486978489:
                if (name.equals("weeklyplan1")) {
                    String string4 = context.getString(R.string.paper_style_weeklyplan1);
                    OooOOO0.OooO0o(string4, "getString(...)");
                    return string4;
                }
                return getName();
            case -1486978488:
                if (name.equals("weeklyplan2")) {
                    String string5 = context.getString(R.string.paper_style_weeklyplan2);
                    OooOOO0.OooO0o(string5, "getString(...)");
                    return string5;
                }
                return getName();
            case -1486978487:
                if (name.equals("weeklyplan3")) {
                    String string6 = context.getString(R.string.paper_style_weeklyplan3);
                    OooOOO0.OooO0o(string6, "getString(...)");
                    return string6;
                }
                return getName();
            case -1395811398:
                if (name.equals("english1_v2")) {
                    String string7 = context.getString(R.string.paper_style_english01);
                    OooOOO0.OooO0o(string7, "getString(...)");
                    return string7;
                }
                return getName();
            case -1395781607:
                if (name.equals("english2_v2")) {
                    String string8 = context.getString(R.string.paper_style_english02);
                    OooOOO0.OooO0o(string8, "getString(...)");
                    return string8;
                }
                return getName();
            case -1197165374:
                break;
            case -1179715528:
                if (name.equals("monthlyplan_mon_v2")) {
                    String string9 = context.getString(R.string.paper_style_monthlyplan_mon);
                    OooOOO0.OooO0o(string9, "getString(...)");
                    return string9;
                }
                return getName();
            case -1066336952:
                break;
            case -884445691:
                if (name.equals("meeting1_v2")) {
                    String string10 = context.getString(R.string.paper_style_meeting01);
                    OooOOO0.OooO0o(string10, "getString(...)");
                    return string10;
                }
                return getName();
            case -884415900:
                if (name.equals("meeting2_v2")) {
                    String string11 = context.getString(R.string.paper_style_meeting02);
                    OooOOO0.OooO0o(string11, "getString(...)");
                    return string11;
                }
                return getName();
            case -463609046:
                break;
            case 8255300:
                if (name.equals("weeklyplan_mon_v2")) {
                    String string12 = context.getString(R.string.paper_style_weeklyplan_mon);
                    OooOOO0.OooO0o(string12, "getString(...)");
                    return string12;
                }
                return getName();
            case 28798195:
                break;
            case 103668703:
                break;
            case 104263205:
                break;
            case 210446005:
                break;
            case 312940252:
                break;
            case 475087651:
                break;
            case 475117442:
                break;
            case 585589413:
                break;
            case 654864153:
                break;
            case 802798336:
                if (name.equals("meeting_v2")) {
                    String string13 = context.getString(R.string.paper_style_meeting);
                    OooOOO0.OooO0o(string13, "getString(...)");
                    return string13;
                }
                return getName();
            case 807581441:
                if (name.equals("planaplanb")) {
                    String string14 = context.getString(R.string.paper_style_planaplanb);
                    OooOOO0.OooO0o(string14, "getString(...)");
                    return string14;
                }
                return getName();
            case 815432358:
                break;
            case 843880150:
                break;
            case 894766232:
                break;
            case 1237829553:
                break;
            case 1413873539:
                break;
            case 1431915702:
                break;
            case 1511679182:
                if (name.equals("tripplan")) {
                    String string15 = context.getString(R.string.paper_style_tripplan);
                    OooOOO0.OooO0o(string15, "getString(...)");
                    return string15;
                }
                return getName();
            case 1654222072:
                break;
            case 1654222073:
                break;
            default:
                return getName();
        }
    }

    public int hashCode() {
        PaperTheme baseTheme = getBaseTheme();
        return Integer.hashCode(this.color) + OooO00o.OooO0O0((getName().hashCode() + ((getOrientation().hashCode() + ((getCategory().hashCode() + ((527 + (baseTheme != null ? baseTheme.hashCode() : 0)) * 31)) * 31)) * 31)) * 31, 31, this.spec);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public <T> void render(o0O0oo00.OooO00o<T> renderEngine, OooO0O0<T> renderTarget, float scale) throws Throwable {
        C32443OooOOO c32443OooOOOOooO0OO = C21036OooOOo0.OooO0OO(renderEngine, "renderEngine", renderTarget, "renderTarget");
        render(renderEngine, renderTarget, scale, new RectF(0.0f, 0.0f, ((Number) c32443OooOOOOooO0OO.f116638OooOo0o).floatValue(), ((Number) c32443OooOOOOooO0OO.f116637OooOo).floatValue()));
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public void renderPaperRegion(Canvas canvas, int pageIndex, boolean renderAnnot, Context context, RectF normalizedRenderTaskBounds, int regionWidthPx, int regionHeightPx, int pageWidth, int pageHeight, boolean isInfiniteCanvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(normalizedRenderTaskBounds, "normalizedRenderTaskBounds");
        canvas.drawColor(DEFAULT_COLOR);
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
        String str = this.name;
        String str2 = this.spec;
        int i = this.color;
        PaperOrientation paperOrientation = this.orientation;
        ThemeCategory themeCategory = this.category;
        Boolean bool = this.downloadable;
        String str3 = this.myTemplateId;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("PdfSetPaperTheme(name=", str, ", spec=", str2, ", color=");
        sbOooO0O0.append(i);
        sbOooO0O0.append(", orientation=");
        sbOooO0O0.append(paperOrientation);
        sbOooO0O0.append(", category=");
        sbOooO0O0.append(themeCategory);
        sbOooO0O0.append(", downloadable=");
        sbOooO0O0.append(bool);
        sbOooO0O0.append(", myTemplateId=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sbOooO0O0, str3, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfSetPaperTheme(String name, String spec, int i, PaperOrientation orientation, ThemeCategory category, Boolean bool, String str) {
        super(null, null, category, orientation, null, bool, 18, null);
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(spec, "spec");
        OooOOO0.OooO0oO(orientation, "orientation");
        OooOOO0.OooO0oO(category, "category");
        this.name = name;
        this.spec = spec;
        this.color = i;
        this.orientation = orientation;
        this.category = category;
        this.downloadable = bool;
        this.myTemplateId = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void drawPaperBg(Canvas canvas, Context context, RectF renderBounds) throws Throwable {
        PdfiumCore pdfiumCore;
        int i;
        String str;
        int iOooO0O0 = oO0O00O.OooO00o.OooO0O0(renderBounds.width());
        if (iOooO0O0 < 1) {
            iOooO0O0 = 1;
        }
        int iOooO0O02 = oO0O00O.OooO00o.OooO0O0(renderBounds.height());
        if (iOooO0O02 < 1) {
            iOooO0O02 = 1;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iOooO0O0, iOooO0O02, Bitmap.Config.ARGB_8888);
        OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
        Rect rect = new Rect(0, 0, iOooO0O0, iOooO0O02);
        String path = getPath(context);
        PdfDocument pdfDocument = null;
        if (path != null) {
            PdfiumCore pdfiumCore2 = new PdfiumCore(context);
            try {
                PdfDocument pdfDocumentNewDocument = pdfiumCore2.newDocument(path, (String) null);
                try {
                    pdfiumCore2.openPage(pdfDocumentNewDocument, 0);
                    str = path;
                    pdfiumCore = pdfiumCore2;
                    i = 0;
                } catch (Exception e) {
                    e = e;
                    pdfiumCore = pdfiumCore2;
                    i = 0;
                    str = path;
                } catch (Throwable th) {
                    th = th;
                    pdfiumCore = pdfiumCore2;
                }
                try {
                    pdfiumCore.renderPageBitmap(pdfDocumentNewDocument, bitmapCreateBitmap, 0, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), false);
                    canvas.drawBitmap(bitmapCreateBitmap, rect, renderBounds, (Paint) null);
                    if (pdfDocumentNewDocument != null) {
                        pdfiumCore.closeDocument(pdfDocumentNewDocument);
                    }
                } catch (Exception e2) {
                    e = e2;
                    pdfDocument = pdfDocumentNewDocument;
                    try {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0(TAG);
                        c20358OooO00o.OooO0OO("drawPaperBg error: " + e, new Object[i]);
                        if ((e instanceof IOException) && OooOOO0.OooO0O0(getDownloadable(), Boolean.TRUE)) {
                            saveDeleteFile(new File(str));
                        }
                        if (pdfDocument != null) {
                            pdfiumCore.closeDocument(pdfDocument);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (pdfDocument != null) {
                            pdfiumCore.closeDocument(pdfDocument);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    pdfDocument = pdfDocumentNewDocument;
                    if (pdfDocument != null) {
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                pdfiumCore = pdfiumCore2;
                i = 0;
                str = path;
            } catch (Throwable th4) {
                th = th4;
                pdfiumCore = pdfiumCore2;
            }
        } else {
            if (OooOOO0.OooO0O0(getDownloadable(), Boolean.TRUE)) {
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), getTnResIdForDownloadableTheme(context));
                if (bitmapDecodeResource != null) {
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeResource, iOooO0O0, iOooO0O02, true);
                    OooOOO0.OooO0o(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    paint.setFilterBitmap(true);
                    paint.setDither(true);
                    canvas.drawBitmap(bitmapCreateScaledBitmap, rect, renderBounds, (Paint) null);
                    return;
                }
                return;
            }
            Paint paint2 = new Paint();
            paint2.setColor(DEFAULT_COLOR);
            canvas.drawPaint(paint2);
        }
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public <T> void render(o0O0oo00.OooO00o<T> renderEngine, OooO0O0<T> renderTarget, float scale, RectF renderTargetViewport) throws Throwable {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        OooOOO0.OooO0oO(renderTargetViewport, "renderTargetViewport");
        if (renderEngine instanceof C26120OooO0Oo) {
            C26121OooO0o0 c26121OooO0o0 = (C26121OooO0o0) renderTarget;
            Canvas canvasOooO0OO = c26121OooO0o0.OooO0OO();
            Context context = c26121OooO0o0.f89174OooO0O0;
            OooOOO0.OooO0Oo(context);
            drawPaperBg(canvasOooO0OO, context, renderTargetViewport);
        }
    }
}
