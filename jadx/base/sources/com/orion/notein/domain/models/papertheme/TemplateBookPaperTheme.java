package com.orion.notein.domain.models.papertheme;

import OooOO0.OooO0OO;
import OoooooO.C21445Oooo;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.facebook.soloader.OooOo;
import com.google.gson.annotations.Expose;
import com.orion.notein.domain.models.material.Orientation;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o000OoO.C24536OooO0Oo;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32444OooOOO0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \\2\u00020\u0001:\u0001\\Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00160\u0005¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J_\u0010+\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u0018H\u0016¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\u00182\b\u0010.\u001a\u0004\u0018\u00010-H\u0096\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b5\u0010\u0013J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b6\u0010\u0015J\u0010\u00107\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b7\u00102J\u0010\u00108\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b:\u0010\u0013J\u0010\u0010;\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b;\u0010\u0013J\u0010\u0010<\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b<\u0010\u0013J\u0012\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b=\u0010\u0013Jt\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b@\u0010\u0013J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020$H\u0002¢\u0006\u0004\b \u0010BR$\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010C\u001a\u0004\bD\u00104\"\u0004\bE\u0010FR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010G\u001a\u0004\bH\u0010\u0013R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010I\u001a\u0004\bJ\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010K\u001a\u0004\bL\u00102R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010M\u001a\u0004\bN\u00109R\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010G\u001a\u0004\bO\u0010\u0013R\u001a\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010G\u001a\u0004\bP\u0010\u0013R\"\u0010\u000e\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010G\u001a\u0004\bQ\u0010\u0013\"\u0004\bR\u0010SR$\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010G\u001a\u0004\bT\u0010\u0013\"\u0004\bU\u0010SR\u0014\u0010Y\u001a\u00020V8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0011\u0010[\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bZ\u0010\u0013¨\u0006]"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/TemplateBookPaperTheme;", "Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "baseTheme", "", "materialId", "", "Lcom/orion/notein/domain/models/papertheme/TemplateBookVariantFile;", "variantFiles", "", "pageCount", "Lcom/orion/notein/domain/models/material/Orientation;", "selectedOrientation", "selectedColor", "selectedColorName", "name", "myTemplateId", "<init>", "(Lcom/orion/notein/domain/models/papertheme/PaperTheme;Ljava/lang/String;Ljava/util/List;ILcom/orion/notein/domain/models/material/Orientation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getVariantPdfPath", "()Ljava/lang/String;", "getAvailableOrientations", "()Ljava/util/List;", "LoO00ooO/OooOOO;", "getAvailableColors", "", "hasVariants", "()Z", "Landroid/graphics/Canvas;", "canvas", "Landroid/content/Context;", "context", "LoO00ooO/OooOooO;", "drawPaperBg", "(Landroid/graphics/Canvas;Landroid/content/Context;)V", "pageIndex", "renderAnnot", "Landroid/graphics/RectF;", "normalizedRenderTaskBounds", "regionWidthPx", "regionHeightPx", "pageWidth", "pageHeight", "isInfiniteCanvas", "renderPaperRegion", "(Landroid/graphics/Canvas;IZLandroid/content/Context;Landroid/graphics/RectF;IIIIZ)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1", "()Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "component2", "component3", "component4", "component5", "()Lcom/orion/notein/domain/models/material/Orientation;", "component6", "component7", "component8", "component9", "copy", "(Lcom/orion/notein/domain/models/papertheme/PaperTheme;Ljava/lang/String;Ljava/util/List;ILcom/orion/notein/domain/models/material/Orientation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/orion/notein/domain/models/papertheme/TemplateBookPaperTheme;", "toString", "renderBounds", "(Landroid/graphics/Canvas;Landroid/content/Context;Landroid/graphics/RectF;)V", "Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "getBaseTheme", "setBaseTheme", "(Lcom/orion/notein/domain/models/papertheme/PaperTheme;)V", "Ljava/lang/String;", "getMaterialId", "Ljava/util/List;", "getVariantFiles", "I", "getPageCount", "Lcom/orion/notein/domain/models/material/Orientation;", "getSelectedOrientation", "getSelectedColor", "getSelectedColorName", "getName", "setName", "(Ljava/lang/String;)V", "getMyTemplateId", "setMyTemplateId", "Lcom/orion/notein/domain/models/page/PaperOrientation;", "getOrientation", "()Lcom/orion/notein/domain/models/page/PaperOrientation;", "orientation", "getPdfPath", "pdfPath", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class TemplateBookPaperTheme extends PaperTheme {
    private static final String TAG = "TemplateBookPaperTheme";

    @Expose
    private PaperTheme baseTheme;

    @Expose
    private final String materialId;

    @Expose
    private String myTemplateId;

    @Expose
    private String name;

    @Expose
    private final int pageCount;

    @Expose
    private final String selectedColor;

    @Expose
    private final String selectedColorName;

    @Expose
    private final Orientation selectedOrientation;

    @Expose
    private final List<TemplateBookVariantFile> variantFiles;

    @Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.PORTRAIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Orientation.BOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ TemplateBookPaperTheme(PaperTheme paperTheme, String str, List list, int i, Orientation orientation, String str2, String str3, String str4, String str5, int i2, C24018OooO0oo c24018OooO0oo) {
        this((i2 & 1) != 0 ? null : paperTheme, str, (i2 & 4) != 0 ? C34434OooOoO.f123453OooOo0o : list, i, (i2 & 16) != 0 ? Orientation.PORTRAIT : orientation, (i2 & 32) != 0 ? "" : str2, (i2 & 64) != 0 ? "" : str3, (i2 & 128) != 0 ? "" : str4, (i2 & 256) != 0 ? null : str5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TemplateBookPaperTheme copy$default(TemplateBookPaperTheme templateBookPaperTheme, PaperTheme paperTheme, String str, List list, int i, Orientation orientation, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            paperTheme = templateBookPaperTheme.baseTheme;
        }
        if ((i2 & 2) != 0) {
            str = templateBookPaperTheme.materialId;
        }
        if ((i2 & 4) != 0) {
            list = templateBookPaperTheme.variantFiles;
        }
        if ((i2 & 8) != 0) {
            i = templateBookPaperTheme.pageCount;
        }
        if ((i2 & 16) != 0) {
            orientation = templateBookPaperTheme.selectedOrientation;
        }
        if ((i2 & 32) != 0) {
            str2 = templateBookPaperTheme.selectedColor;
        }
        if ((i2 & 64) != 0) {
            str3 = templateBookPaperTheme.selectedColorName;
        }
        if ((i2 & 128) != 0) {
            str4 = templateBookPaperTheme.name;
        }
        if ((i2 & 256) != 0) {
            str5 = templateBookPaperTheme.myTemplateId;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str2;
        String str9 = str3;
        Orientation orientation2 = orientation;
        List list2 = list;
        return templateBookPaperTheme.copy(paperTheme, str, list2, i, orientation2, str8, str9, str6, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PaperTheme getBaseTheme() {
        return this.baseTheme;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMaterialId() {
        return this.materialId;
    }

    public final List<TemplateBookVariantFile> component3() {
        return this.variantFiles;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPageCount() {
        return this.pageCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Orientation getSelectedOrientation() {
        return this.selectedOrientation;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSelectedColor() {
        return this.selectedColor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSelectedColorName() {
        return this.selectedColorName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMyTemplateId() {
        return this.myTemplateId;
    }

    public final TemplateBookPaperTheme copy(PaperTheme baseTheme, String materialId, List<TemplateBookVariantFile> variantFiles, int pageCount, Orientation selectedOrientation, String selectedColor, String selectedColorName, String name, String myTemplateId) {
        OooOOO0.OooO0oO(materialId, "materialId");
        OooOOO0.OooO0oO(variantFiles, "variantFiles");
        OooOOO0.OooO0oO(selectedOrientation, "selectedOrientation");
        OooOOO0.OooO0oO(selectedColor, "selectedColor");
        OooOOO0.OooO0oO(selectedColorName, "selectedColorName");
        OooOOO0.OooO0oO(name, "name");
        return new TemplateBookPaperTheme(baseTheme, materialId, variantFiles, pageCount, selectedOrientation, selectedColor, selectedColorName, name, myTemplateId);
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public void drawPaperBg(Canvas canvas, Context context) throws Throwable {
        OooOOO0.OooO0oO(canvas, "canvas");
        OooOOO0.OooO0oO(context, "context");
        drawPaperBg(canvas, context, new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight()));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TemplateBookPaperTheme)) {
            return false;
        }
        TemplateBookPaperTheme templateBookPaperTheme = (TemplateBookPaperTheme) other;
        return OooOOO0.OooO0O0(this.materialId, templateBookPaperTheme.materialId) && OooOOO0.OooO0O0(this.variantFiles, templateBookPaperTheme.variantFiles) && this.selectedOrientation == templateBookPaperTheme.selectedOrientation && OooOOO0.OooO0O0(this.selectedColor, templateBookPaperTheme.selectedColor) && OooOOO0.OooO0O0(getMyTemplateId(), templateBookPaperTheme.getMyTemplateId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<C32443OooOOO<String, String>> getAvailableColors() {
        if (this.variantFiles.isEmpty()) {
            return C34434OooOoO.f123453OooOo0o;
        }
        List<TemplateBookVariantFile> list = this.variantFiles;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        for (TemplateBookVariantFile templateBookVariantFile : list) {
            arrayList.add(new C32443OooOOO(templateBookVariantFile.getColor(), templateBookVariantFile.getColorName()));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add((String) ((C32443OooOOO) obj).f116638OooOo0o)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final List<Orientation> getAvailableOrientations() {
        if (this.variantFiles.isEmpty()) {
            return OooOo.OooO0oO(this.selectedOrientation);
        }
        List<TemplateBookVariantFile> list = this.variantFiles;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((TemplateBookVariantFile) it.next()).getOrientation());
        }
        return oOo000Oo.OooOo.o00O0O(oOo000Oo.OooOo.Oooo0(arrayList), new Comparator() { // from class: com.orion.notein.domain.models.papertheme.TemplateBookPaperTheme$getAvailableOrientations$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Orientation orientation = (Orientation) t;
                Orientation orientation2 = Orientation.PORTRAIT;
                return C24536OooO0Oo.OooO0O0(Integer.valueOf(orientation == orientation2 ? 0 : 1), Integer.valueOf(((Orientation) t2) == orientation2 ? 0 : 1));
            }
        });
    }

    @Override // com.orion.notein.domain.models.papertheme.PaperTheme
    public PaperTheme getBaseTheme() {
        return this.baseTheme;
    }

    public final String getMaterialId() {
        return this.materialId;
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
        int i = WhenMappings.$EnumSwitchMapping$0[this.selectedOrientation.ordinal()];
        if (i == 1) {
            return PaperOrientation.VERTICAL;
        }
        if (i == 2) {
            return PaperOrientation.HORIZONTAL;
        }
        if (i == 3) {
            return PaperOrientation.VERTICAL;
        }
        throw new C32442OooOO0o();
    }

    public final int getPageCount() {
        return this.pageCount;
    }

    public final String getPdfPath() {
        String variantPdfPath = getVariantPdfPath();
        return variantPdfPath == null ? "" : variantPdfPath;
    }

    public final String getSelectedColor() {
        return this.selectedColor;
    }

    public final String getSelectedColorName() {
        return this.selectedColorName;
    }

    public final Orientation getSelectedOrientation() {
        return this.selectedOrientation;
    }

    public final List<TemplateBookVariantFile> getVariantFiles() {
        return this.variantFiles;
    }

    public final String getVariantPdfPath() {
        Object next;
        if (this.variantFiles.isEmpty()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0(TAG);
            c20358OooO00o.OooOO0O("getVariantPdfPath: variantFiles is empty", new Object[0]);
            return null;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0(TAG);
        c20358OooO00o2.OooO00o("getVariantPdfPath: looking for orientation=" + this.selectedOrientation + ", color=" + this.selectedColor, new Object[0]);
        Iterator<T> it = this.variantFiles.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            TemplateBookVariantFile templateBookVariantFile = (TemplateBookVariantFile) next;
            if (templateBookVariantFile.getOrientation() == this.selectedOrientation && OooOOO0.OooO0O0(templateBookVariantFile.getColor(), this.selectedColor)) {
                break;
            }
        }
        TemplateBookVariantFile templateBookVariantFile2 = (TemplateBookVariantFile) next;
        if (templateBookVariantFile2 != null) {
            return templateBookVariantFile2.getAbsolutePath();
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o3.OooOOO0(TAG);
        c20358OooO00o3.OooOO0O("getVariantPdfPath: no match found, using first variant", new Object[0]);
        TemplateBookVariantFile templateBookVariantFile3 = (TemplateBookVariantFile) oOo000Oo.OooOo.Oooo(this.variantFiles);
        if (templateBookVariantFile3 != null) {
            return templateBookVariantFile3.getAbsolutePath();
        }
        return null;
    }

    public final boolean hasVariants() {
        return this.variantFiles.size() > 1;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0((this.selectedOrientation.hashCode() + C21445Oooo.OooO00o(this.variantFiles, this.materialId.hashCode() * 31, 31)) * 31, 31, this.selectedColor);
        String myTemplateId = getMyTemplateId();
        return iOooO0O0 + (myTemplateId != null ? myTemplateId.hashCode() : 0);
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
        String str = this.materialId;
        List<TemplateBookVariantFile> list = this.variantFiles;
        int i = this.pageCount;
        Orientation orientation = this.selectedOrientation;
        String str2 = this.selectedColor;
        String str3 = this.selectedColorName;
        String str4 = this.name;
        String str5 = this.myTemplateId;
        StringBuilder sb = new StringBuilder("TemplateBookPaperTheme(baseTheme=");
        sb.append(paperTheme);
        sb.append(", materialId=");
        sb.append(str);
        sb.append(", variantFiles=");
        sb.append(list);
        sb.append(", pageCount=");
        sb.append(i);
        sb.append(", selectedOrientation=");
        sb.append(orientation);
        sb.append(", selectedColor=");
        sb.append(str2);
        sb.append(", selectedColorName=");
        OooO0OO.OooO0o0(sb, str3, ", name=", str4, ", myTemplateId=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, str5, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.shockwave.pdfium.PdfDocument] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.shockwave.pdfium.PdfiumCore] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void drawPaperBg(Canvas canvas, Context context, RectF renderBounds) throws Throwable {
        PdfDocument pdfDocumentNewDocument;
        int height;
        int i;
        int width;
        int height2;
        PaperTheme baseTheme = getBaseTheme();
        if (baseTheme != null) {
            baseTheme.drawPaperBg(canvas, context);
        }
        String variantPdfPath = getVariantPdfPath();
        if (variantPdfPath == null || variantPdfPath.length() == 0) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0(TAG);
            c20358OooO00o.OooO0OO("drawPaperBg - No PDF path found for variant: orientation=" + this.selectedOrientation + ", color=" + this.selectedColor, new Object[0]);
            return;
        }
        ?? pdfiumCore = new PdfiumCore(context);
        int iOooO0O0 = oO0O00O.OooO00o.OooO0O0(renderBounds.width());
        if (iOooO0O0 < 1) {
            iOooO0O0 = 1;
        }
        int iOooO0O02 = oO0O00O.OooO00o.OooO0O0(renderBounds.height());
        int i2 = iOooO0O02 >= 1 ? iOooO0O02 : 1;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iOooO0O0, i2, Bitmap.Config.ARGB_8888);
        OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
        Rect rect = new Rect(0, 0, iOooO0O0, i2);
        ?? r2 = 0;
        PdfDocument pdfDocument = null;
        try {
            try {
                pdfDocumentNewDocument = pdfiumCore.newDocument(variantPdfPath, null);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            pdfiumCore.openPage(pdfDocumentNewDocument, 0);
            float pageWidth = pdfiumCore.getPageWidth(pdfDocumentNewDocument, 0) / pdfiumCore.getPageHeight(pdfDocumentNewDocument, 0);
            if (pageWidth > bitmapCreateBitmap.getWidth() / bitmapCreateBitmap.getHeight()) {
                int width2 = bitmapCreateBitmap.getWidth();
                height = (int) (bitmapCreateBitmap.getWidth() / pageWidth);
                height2 = (bitmapCreateBitmap.getHeight() - height) / 2;
                i = width2;
                width = 0;
            } else {
                int height3 = (int) (bitmapCreateBitmap.getHeight() * pageWidth);
                height = bitmapCreateBitmap.getHeight();
                i = height3;
                width = (bitmapCreateBitmap.getWidth() - height3) / 2;
                height2 = 0;
            }
            pdfiumCore.renderPageBitmap(pdfDocumentNewDocument, bitmapCreateBitmap, 0, width, height2, i, height, false);
            canvas.drawBitmap(bitmapCreateBitmap, rect, renderBounds, (Paint) null);
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0(TAG);
            String strConcat = "Rendered template_book thumbnail: ".concat(variantPdfPath);
            c20358OooO00o2.OooO00o(strConcat, new Object[0]);
            r2 = strConcat;
            if (pdfDocumentNewDocument != null) {
                pdfiumCore.closeDocument(pdfDocumentNewDocument);
            }
        } catch (Exception e2) {
            e = e2;
            pdfDocument = pdfDocumentNewDocument;
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0(TAG);
            c20358OooO00o3.OooO0Oo(e, "Failed to render template_book thumbnail: ".concat(variantPdfPath), new Object[0]);
            r2 = pdfDocument;
            if (pdfDocument != null) {
                pdfiumCore.closeDocument(pdfDocument);
                r2 = pdfDocument;
            }
        } catch (Throwable th2) {
            th = th2;
            r2 = pdfDocumentNewDocument;
            if (r2 != 0) {
                pdfiumCore.closeDocument(r2);
            }
            throw th;
        }
    }

    public TemplateBookPaperTheme(PaperTheme paperTheme, String materialId, List<TemplateBookVariantFile> variantFiles, int i, Orientation selectedOrientation, String selectedColor, String selectedColorName, String name, String str) {
        PaperOrientation paperOrientation;
        OooOOO0.OooO0oO(materialId, "materialId");
        OooOOO0.OooO0oO(variantFiles, "variantFiles");
        OooOOO0.OooO0oO(selectedOrientation, "selectedOrientation");
        OooOOO0.OooO0oO(selectedColor, "selectedColor");
        OooOOO0.OooO0oO(selectedColorName, "selectedColorName");
        OooOOO0.OooO0oO(name, "name");
        ThemeCategory themeCategory = new ThemeCategory(12290, "素材中心整本");
        int i2 = WhenMappings.$EnumSwitchMapping$0[selectedOrientation.ordinal()];
        if (i2 == 1) {
            paperOrientation = PaperOrientation.VERTICAL;
        } else if (i2 == 2) {
            paperOrientation = PaperOrientation.HORIZONTAL;
        } else if (i2 == 3) {
            paperOrientation = PaperOrientation.VERTICAL;
        } else {
            throw new C32442OooOO0o();
        }
        super(null, "", themeCategory, paperOrientation, null, null, 48, null);
        this.baseTheme = paperTheme;
        this.materialId = materialId;
        this.variantFiles = variantFiles;
        this.pageCount = i;
        this.selectedOrientation = selectedOrientation;
        this.selectedColor = selectedColor;
        this.selectedColorName = selectedColorName;
        this.name = name;
        this.myTemplateId = str;
    }
}
