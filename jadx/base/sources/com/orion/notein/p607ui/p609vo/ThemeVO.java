package com.orion.notein.p607ui.p609vo;

import OooOO0.OooO0OO;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import android.content.Context;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0001;Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\u001cJx\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b)\u0010#J\u0010\u0010*\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u001a\u0010,\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b4\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b5\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b6\u0010\u001cR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b9\u0010#R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b\u000e\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b\u000f\u0010\u001c¨\u0006<"}, m80612d2 = {"Lcom/orion/notein/ui/vo/ThemeVO;", "", "Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "paperTheme", "", "selected", "", "width", "height", "availableFromLocal", "downloading", "", "myTemplateId", CommonConstant.KEY_DISPLAY_NAME, "isStarVisible", "isStar", "<init>", "(Lcom/orion/notein/domain/models/papertheme/PaperTheme;ZIIZZLjava/lang/String;Ljava/lang/String;ZZ)V", "Lcom/orion/notein/domain/models/page/PaperOrientation;", "getOrientation", "()Lcom/orion/notein/domain/models/page/PaperOrientation;", "Landroid/content/Context;", "context", "getName", "(Landroid/content/Context;)Ljava/lang/String;", "component1", "()Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "component2", "()Z", "component3", "()I", "component4", "component5", "component6", "component7", "()Ljava/lang/String;", "component8", "component9", "component10", "copy", "(Lcom/orion/notein/domain/models/papertheme/PaperTheme;ZIIZZLjava/lang/String;Ljava/lang/String;ZZ)Lcom/orion/notein/ui/vo/ThemeVO;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "getPaperTheme", "Z", "getSelected", "I", "getWidth", "getHeight", "getAvailableFromLocal", "getDownloading", "Ljava/lang/String;", "getMyTemplateId", "getDisplayName", "Companion", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class ThemeVO {
    public static final String ERROR_CODE_CUSTOM_COLOR_REACH_NUMBER_LIMIT = "10001";
    public static final String ERROR_CODE_THIS_COLOR_ALREADY_EXISTS = "10002";
    private final boolean availableFromLocal;
    private final String displayName;
    private final boolean downloading;
    private final int height;
    private final boolean isStar;
    private final boolean isStarVisible;
    private final String myTemplateId;
    private final PaperTheme paperTheme;
    private final boolean selected;
    private final int width;

    public ThemeVO(PaperTheme paperTheme, boolean z, int i, int i2, boolean z2, boolean z3, String str, String str2, boolean z4, boolean z5) {
        OooOOO0.OooO0oO(paperTheme, "paperTheme");
        this.paperTheme = paperTheme;
        this.selected = z;
        this.width = i;
        this.height = i2;
        this.availableFromLocal = z2;
        this.downloading = z3;
        this.myTemplateId = str;
        this.displayName = str2;
        this.isStarVisible = z4;
        this.isStar = z5;
    }

    public static /* synthetic */ ThemeVO copy$default(ThemeVO themeVO, PaperTheme paperTheme, boolean z, int i, int i2, boolean z2, boolean z3, String str, String str2, boolean z4, boolean z5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            paperTheme = themeVO.paperTheme;
        }
        if ((i3 & 2) != 0) {
            z = themeVO.selected;
        }
        if ((i3 & 4) != 0) {
            i = themeVO.width;
        }
        if ((i3 & 8) != 0) {
            i2 = themeVO.height;
        }
        if ((i3 & 16) != 0) {
            z2 = themeVO.availableFromLocal;
        }
        if ((i3 & 32) != 0) {
            z3 = themeVO.downloading;
        }
        if ((i3 & 64) != 0) {
            str = themeVO.myTemplateId;
        }
        if ((i3 & 128) != 0) {
            str2 = themeVO.displayName;
        }
        if ((i3 & 256) != 0) {
            z4 = themeVO.isStarVisible;
        }
        if ((i3 & 512) != 0) {
            z5 = themeVO.isStar;
        }
        boolean z6 = z4;
        boolean z7 = z5;
        String str3 = str;
        String str4 = str2;
        boolean z8 = z2;
        boolean z9 = z3;
        return themeVO.copy(paperTheme, z, i, i2, z8, z9, str3, str4, z6, z7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PaperTheme getPaperTheme() {
        return this.paperTheme;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsStar() {
        return this.isStar;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getAvailableFromLocal() {
        return this.availableFromLocal;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getDownloading() {
        return this.downloading;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMyTemplateId() {
        return this.myTemplateId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsStarVisible() {
        return this.isStarVisible;
    }

    public final ThemeVO copy(PaperTheme paperTheme, boolean selected, int width, int height, boolean availableFromLocal, boolean downloading, String myTemplateId, String displayName, boolean isStarVisible, boolean isStar) {
        OooOOO0.OooO0oO(paperTheme, "paperTheme");
        return new ThemeVO(paperTheme, selected, width, height, availableFromLocal, downloading, myTemplateId, displayName, isStarVisible, isStar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThemeVO)) {
            return false;
        }
        ThemeVO themeVO = (ThemeVO) other;
        return OooOOO0.OooO0O0(this.paperTheme, themeVO.paperTheme) && this.selected == themeVO.selected && this.width == themeVO.width && this.height == themeVO.height && this.availableFromLocal == themeVO.availableFromLocal && this.downloading == themeVO.downloading && OooOOO0.OooO0O0(this.myTemplateId, themeVO.myTemplateId) && OooOOO0.OooO0O0(this.displayName, themeVO.displayName) && this.isStarVisible == themeVO.isStarVisible && this.isStar == themeVO.isStar;
    }

    public final boolean getAvailableFromLocal() {
        return this.availableFromLocal;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final boolean getDownloading() {
        return this.downloading;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getMyTemplateId() {
        return this.myTemplateId;
    }

    public final String getName(Context context) {
        OooOOO0.OooO0oO(context, "context");
        String str = this.displayName;
        return str == null ? this.paperTheme.getTitle(context) : str;
    }

    public final PaperOrientation getOrientation() {
        return this.paperTheme.getOrientation();
    }

    public final PaperTheme getPaperTheme() {
        return this.paperTheme;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iOooO0O0 = o00000.OooO0O0(o00000.OooO0O0(C20785Oooo00o.OooO00o(this.height, C20785Oooo00o.OooO00o(this.width, o00000.OooO0O0(this.paperTheme.hashCode() * 31, 31, this.selected), 31), 31), 31, this.availableFromLocal), 31, this.downloading);
        String str = this.myTemplateId;
        int iHashCode = (iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.displayName;
        return Boolean.hashCode(this.isStar) + o00000.OooO0O0((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.isStarVisible);
    }

    public final boolean isStar() {
        return this.isStar;
    }

    public final boolean isStarVisible() {
        return this.isStarVisible;
    }

    public String toString() {
        PaperTheme paperTheme = this.paperTheme;
        boolean z = this.selected;
        int i = this.width;
        int i2 = this.height;
        boolean z2 = this.availableFromLocal;
        boolean z3 = this.downloading;
        String str = this.myTemplateId;
        String str2 = this.displayName;
        boolean z4 = this.isStarVisible;
        boolean z5 = this.isStar;
        StringBuilder sb = new StringBuilder("ThemeVO(paperTheme=");
        sb.append(paperTheme);
        sb.append(", selected=");
        sb.append(z);
        sb.append(", width=");
        C24472OooOoo.OooO0O0(sb, ", height=", ", availableFromLocal=", i, i2);
        sb.append(z2);
        sb.append(", downloading=");
        sb.append(z3);
        sb.append(", myTemplateId=");
        OooO0OO.OooO0o0(sb, str, ", displayName=", str2, ", isStarVisible=");
        sb.append(z4);
        sb.append(", isStar=");
        sb.append(z5);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ ThemeVO(PaperTheme paperTheme, boolean z, int i, int i2, boolean z2, boolean z3, String str, String str2, boolean z4, boolean z5, int i3, C24018OooO0oo c24018OooO0oo) {
        this(paperTheme, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? -1 : i, (i3 & 8) != 0 ? -1 : i2, (i3 & 16) != 0 ? true : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? null : str, (i3 & 128) != 0 ? null : str2, (i3 & 256) != 0 ? false : z4, (i3 & 512) != 0 ? false : z5);
    }
}
