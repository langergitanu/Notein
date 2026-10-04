package com.orion.notein.p607ui.p609vo;

import OooOo.C20485OooOoO;
import OooOooo.C20785Oooo00o;
import OoooooO.C21445Oooo;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.domain.models.note.PenInfo;
import com.orion.notein.domain.models.page.Image;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.page.Stroke;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00101\u001a\u00020\u000eHÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0087\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0005HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006;"}, m80612d2 = {"Lcom/orion/notein/ui/vo/PageVO;", "", "id", "", FirebaseAnalytics.Param.INDEX, "", "width", "maxWidth", "height", "orientation", "Lcom/orion/notein/domain/models/page/PaperOrientation;", "theme", "Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "page", "Lcom/orion/notein/domain/models/page/Page;", "strokes", "", "Lcom/orion/notein/domain/models/page/Stroke;", "images", "Lcom/orion/notein/domain/models/page/Image;", "penInfo", "Lcom/orion/notein/domain/models/note/PenInfo;", "<init>", "(Ljava/lang/String;IIIILcom/orion/notein/domain/models/page/PaperOrientation;Lcom/orion/notein/domain/models/papertheme/PaperTheme;Lcom/orion/notein/domain/models/page/Page;Ljava/util/List;Ljava/util/List;Lcom/orion/notein/domain/models/note/PenInfo;)V", "getId", "()Ljava/lang/String;", "getIndex", "()I", "getWidth", "getMaxWidth", "getHeight", "getOrientation", "()Lcom/orion/notein/domain/models/page/PaperOrientation;", "getTheme", "()Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "getPage", "()Lcom/orion/notein/domain/models/page/Page;", "getStrokes", "()Ljava/util/List;", "getImages", "getPenInfo", "()Lcom/orion/notein/domain/models/note/PenInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PageVO {
    private final int height;
    private final String id;
    private final List<Image> images;
    private final int index;
    private final int maxWidth;
    private final PaperOrientation orientation;
    private final Page page;
    private final PenInfo penInfo;
    private final List<Stroke> strokes;
    private final PaperTheme theme;
    private final int width;

    public PageVO(String id, int i, int i2, int i3, int i4, PaperOrientation orientation, PaperTheme paperTheme, Page page, List<Stroke> strokes, List<Image> images, PenInfo penInfo) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(orientation, "orientation");
        OooOOO0.OooO0oO(page, "page");
        OooOOO0.OooO0oO(strokes, "strokes");
        OooOOO0.OooO0oO(images, "images");
        this.id = id;
        this.index = i;
        this.width = i2;
        this.maxWidth = i3;
        this.height = i4;
        this.orientation = orientation;
        this.theme = paperTheme;
        this.page = page;
        this.strokes = strokes;
        this.images = images;
        this.penInfo = penInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PageVO copy$default(PageVO pageVO, String str, int i, int i2, int i3, int i4, PaperOrientation paperOrientation, PaperTheme paperTheme, Page page, List list, List list2, PenInfo penInfo, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = pageVO.id;
        }
        if ((i5 & 2) != 0) {
            i = pageVO.index;
        }
        if ((i5 & 4) != 0) {
            i2 = pageVO.width;
        }
        if ((i5 & 8) != 0) {
            i3 = pageVO.maxWidth;
        }
        if ((i5 & 16) != 0) {
            i4 = pageVO.height;
        }
        if ((i5 & 32) != 0) {
            paperOrientation = pageVO.orientation;
        }
        if ((i5 & 64) != 0) {
            paperTheme = pageVO.theme;
        }
        if ((i5 & 128) != 0) {
            page = pageVO.page;
        }
        if ((i5 & 256) != 0) {
            list = pageVO.strokes;
        }
        if ((i5 & 512) != 0) {
            list2 = pageVO.images;
        }
        if ((i5 & 1024) != 0) {
            penInfo = pageVO.penInfo;
        }
        List list3 = list2;
        PenInfo penInfo2 = penInfo;
        Page page2 = page;
        List list4 = list;
        PaperOrientation paperOrientation2 = paperOrientation;
        PaperTheme paperTheme2 = paperTheme;
        int i6 = i4;
        int i7 = i2;
        return pageVO.copy(str, i, i7, i3, i6, paperOrientation2, paperTheme2, page2, list4, list3, penInfo2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<Image> component10() {
        return this.images;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final PenInfo getPenInfo() {
        return this.penInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMaxWidth() {
        return this.maxWidth;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PaperOrientation getOrientation() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final PaperTheme getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Page getPage() {
        return this.page;
    }

    public final List<Stroke> component9() {
        return this.strokes;
    }

    public final PageVO copy(String id, int index, int width, int maxWidth, int height, PaperOrientation orientation, PaperTheme theme, Page page, List<Stroke> strokes, List<Image> images, PenInfo penInfo) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(orientation, "orientation");
        OooOOO0.OooO0oO(page, "page");
        OooOOO0.OooO0oO(strokes, "strokes");
        OooOOO0.OooO0oO(images, "images");
        return new PageVO(id, index, width, maxWidth, height, orientation, theme, page, strokes, images, penInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageVO)) {
            return false;
        }
        PageVO pageVO = (PageVO) other;
        return OooOOO0.OooO0O0(this.id, pageVO.id) && this.index == pageVO.index && this.width == pageVO.width && this.maxWidth == pageVO.maxWidth && this.height == pageVO.height && this.orientation == pageVO.orientation && OooOOO0.OooO0O0(this.theme, pageVO.theme) && OooOOO0.OooO0O0(this.page, pageVO.page) && OooOOO0.OooO0O0(this.strokes, pageVO.strokes) && OooOOO0.OooO0O0(this.images, pageVO.images) && OooOOO0.OooO0O0(this.penInfo, pageVO.penInfo);
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getId() {
        return this.id;
    }

    public final List<Image> getImages() {
        return this.images;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getMaxWidth() {
        return this.maxWidth;
    }

    public final PaperOrientation getOrientation() {
        return this.orientation;
    }

    public final Page getPage() {
        return this.page;
    }

    public final PenInfo getPenInfo() {
        return this.penInfo;
    }

    public final List<Stroke> getStrokes() {
        return this.strokes;
    }

    public final PaperTheme getTheme() {
        return this.theme;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = (this.orientation.hashCode() + C20785Oooo00o.OooO00o(this.height, C20785Oooo00o.OooO00o(this.maxWidth, C20785Oooo00o.OooO00o(this.width, C20785Oooo00o.OooO00o(this.index, this.id.hashCode() * 31, 31), 31), 31), 31)) * 31;
        PaperTheme paperTheme = this.theme;
        int iOooO00o = C21445Oooo.OooO00o(this.images, C21445Oooo.OooO00o(this.strokes, (this.page.hashCode() + ((iHashCode + (paperTheme == null ? 0 : paperTheme.hashCode())) * 31)) * 31, 31), 31);
        PenInfo penInfo = this.penInfo;
        return iOooO00o + (penInfo != null ? penInfo.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        int i = this.index;
        int i2 = this.width;
        int i3 = this.maxWidth;
        int i4 = this.height;
        PaperOrientation paperOrientation = this.orientation;
        PaperTheme paperTheme = this.theme;
        Page page = this.page;
        List<Stroke> list = this.strokes;
        List<Image> list2 = this.images;
        PenInfo penInfo = this.penInfo;
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "PageVO(id=", str, ", index=", ", width=");
        C24472OooOoo.OooO0O0(sbOooO0OO, ", maxWidth=", ", height=", i2, i3);
        sbOooO0OO.append(i4);
        sbOooO0OO.append(", orientation=");
        sbOooO0OO.append(paperOrientation);
        sbOooO0OO.append(", theme=");
        sbOooO0OO.append(paperTheme);
        sbOooO0OO.append(", page=");
        sbOooO0OO.append(page);
        sbOooO0OO.append(", strokes=");
        sbOooO0OO.append(list);
        sbOooO0OO.append(", images=");
        sbOooO0OO.append(list2);
        sbOooO0OO.append(", penInfo=");
        sbOooO0OO.append(penInfo);
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }
}
