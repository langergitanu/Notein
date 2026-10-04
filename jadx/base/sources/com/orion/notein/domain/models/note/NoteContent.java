package com.orion.notein.domain.models.note;

import OooOoO.C20509OooO0oo;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import Oooo0oO.C21036OooOOo0;
import OoooooO.C21445Oooo;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.domain.models.page.Page;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bH\b\u0086\b\u0018\u0000 `2\u00020\u0001:\u0001`B³\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010L\u001a\u00020\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010R\u001a\u00020\rHÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0010HÆ\u0003J\t\u0010U\u001a\u00020\u0010HÆ\u0003J\t\u0010V\u001a\u00020\u0010HÆ\u0003J\t\u0010W\u001a\u00020\u0014HÆ\u0003J\t\u0010X\u001a\u00020\u0016HÆ\u0003J\t\u0010Y\u001a\u00020\u0016HÆ\u0003J\t\u0010Z\u001a\u00020\u0019HÆ\u0003Jµ\u0001\u0010[\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0019HÆ\u0001J\u0013\u0010\\\u001a\u00020\u00142\b\u0010]\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010^\u001a\u00020\rHÖ\u0001J\t\u0010_\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001d\"\u0004\b5\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010\u0011\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u00107\"\u0004\b;\u00109R\u001a\u0010\u0012\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u00107\"\u0004\b=\u00109R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010\u0017\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010C\"\u0004\bG\u0010ER\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K¨\u0006a"}, m80612d2 = {"Lcom/orion/notein/domain/models/note/NoteContent;", "", "id", "", "defaultPage", "Lcom/orion/notein/domain/models/page/Page;", "pages", "", "pageLayerIds", "outlines", "pdfInfo", "Lcom/orion/notein/domain/models/note/PdfInfo;", "savedPageIndex", "", "activatedPageLayerId", "zoom", "", "unboundedPageOffsetX", "unboundedPageOffsetY", "unboundedNote", "", C17625c.f52155b, "", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "extras", "Landroid/os/Bundle;", "<init>", "(Ljava/lang/String;Lcom/orion/notein/domain/models/page/Page;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/orion/notein/domain/models/note/PdfInfo;ILjava/lang/String;FFFZJJLandroid/os/Bundle;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getDefaultPage", "()Lcom/orion/notein/domain/models/page/Page;", "setDefaultPage", "(Lcom/orion/notein/domain/models/page/Page;)V", "getPages", "()Ljava/util/List;", "setPages", "(Ljava/util/List;)V", "getPageLayerIds", "setPageLayerIds", "getOutlines", "setOutlines", "getPdfInfo", "()Lcom/orion/notein/domain/models/note/PdfInfo;", "setPdfInfo", "(Lcom/orion/notein/domain/models/note/PdfInfo;)V", "getSavedPageIndex", "()I", "setSavedPageIndex", "(I)V", "getActivatedPageLayerId", "setActivatedPageLayerId", "getZoom", "()F", "setZoom", "(F)V", "getUnboundedPageOffsetX", "setUnboundedPageOffsetX", "getUnboundedPageOffsetY", "setUnboundedPageOffsetY", "getUnboundedNote", "()Z", "setUnboundedNote", "(Z)V", "getCreationTime", "()J", "setCreationTime", "(J)V", "getLastModificationTime", "setLastModificationTime", "getExtras", "()Landroid/os/Bundle;", "setExtras", "(Landroid/os/Bundle;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "other", "hashCode", "toString", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NoteContent {
    public static final String EXTRA_APP_VERSION_CODE_STRING = "app_version_code";
    private String activatedPageLayerId;
    private long creationTime;
    private Page defaultPage;
    private Bundle extras;
    private String id;
    private long lastModificationTime;
    private List<String> outlines;
    private List<String> pageLayerIds;
    private List<Page> pages;
    private PdfInfo pdfInfo;
    private int savedPageIndex;
    private boolean unboundedNote;
    private float unboundedPageOffsetX;
    private float unboundedPageOffsetY;
    private float zoom;

    public NoteContent() {
        this(null, null, null, null, null, null, 0, null, 0.0f, 0.0f, 0.0f, false, 0L, 0L, null, 32767, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getUnboundedPageOffsetX() {
        return this.unboundedPageOffsetX;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final float getUnboundedPageOffsetY() {
        return this.unboundedPageOffsetY;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getUnboundedNote() {
        return this.unboundedNote;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Bundle getExtras() {
        return this.extras;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Page getDefaultPage() {
        return this.defaultPage;
    }

    public final List<Page> component3() {
        return this.pages;
    }

    public final List<String> component4() {
        return this.pageLayerIds;
    }

    public final List<String> component5() {
        return this.outlines;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PdfInfo getPdfInfo() {
        return this.pdfInfo;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getSavedPageIndex() {
        return this.savedPageIndex;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getActivatedPageLayerId() {
        return this.activatedPageLayerId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float getZoom() {
        return this.zoom;
    }

    public final NoteContent copy(String id, Page defaultPage, List<Page> pages, List<String> pageLayerIds, List<String> outlines, PdfInfo pdfInfo, int savedPageIndex, String activatedPageLayerId, float zoom, float unboundedPageOffsetX, float unboundedPageOffsetY, boolean unboundedNote, long creationTime, long lastModificationTime, Bundle extras) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(pages, "pages");
        OooOOO0.OooO0oO(pageLayerIds, "pageLayerIds");
        OooOOO0.OooO0oO(outlines, "outlines");
        OooOOO0.OooO0oO(activatedPageLayerId, "activatedPageLayerId");
        OooOOO0.OooO0oO(extras, "extras");
        return new NoteContent(id, defaultPage, pages, pageLayerIds, outlines, pdfInfo, savedPageIndex, activatedPageLayerId, zoom, unboundedPageOffsetX, unboundedPageOffsetY, unboundedNote, creationTime, lastModificationTime, extras);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteContent)) {
            return false;
        }
        NoteContent noteContent = (NoteContent) other;
        return OooOOO0.OooO0O0(this.id, noteContent.id) && OooOOO0.OooO0O0(this.defaultPage, noteContent.defaultPage) && OooOOO0.OooO0O0(this.pages, noteContent.pages) && OooOOO0.OooO0O0(this.pageLayerIds, noteContent.pageLayerIds) && OooOOO0.OooO0O0(this.outlines, noteContent.outlines) && OooOOO0.OooO0O0(this.pdfInfo, noteContent.pdfInfo) && this.savedPageIndex == noteContent.savedPageIndex && OooOOO0.OooO0O0(this.activatedPageLayerId, noteContent.activatedPageLayerId) && Float.compare(this.zoom, noteContent.zoom) == 0 && Float.compare(this.unboundedPageOffsetX, noteContent.unboundedPageOffsetX) == 0 && Float.compare(this.unboundedPageOffsetY, noteContent.unboundedPageOffsetY) == 0 && this.unboundedNote == noteContent.unboundedNote && this.creationTime == noteContent.creationTime && this.lastModificationTime == noteContent.lastModificationTime && OooOOO0.OooO0O0(this.extras, noteContent.extras);
    }

    public final String getActivatedPageLayerId() {
        return this.activatedPageLayerId;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final Page getDefaultPage() {
        return this.defaultPage;
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    public final String getId() {
        return this.id;
    }

    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final List<String> getOutlines() {
        return this.outlines;
    }

    public final List<String> getPageLayerIds() {
        return this.pageLayerIds;
    }

    public final List<Page> getPages() {
        return this.pages;
    }

    public final PdfInfo getPdfInfo() {
        return this.pdfInfo;
    }

    public final int getSavedPageIndex() {
        return this.savedPageIndex;
    }

    public final boolean getUnboundedNote() {
        return this.unboundedNote;
    }

    public final float getUnboundedPageOffsetX() {
        return this.unboundedPageOffsetX;
    }

    public final float getUnboundedPageOffsetY() {
        return this.unboundedPageOffsetY;
    }

    public final float getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Page page = this.defaultPage;
        int iOooO00o = C21445Oooo.OooO00o(this.outlines, C21445Oooo.OooO00o(this.pageLayerIds, C21445Oooo.OooO00o(this.pages, (iHashCode + (page == null ? 0 : page.hashCode())) * 31, 31), 31), 31);
        PdfInfo pdfInfo = this.pdfInfo;
        return this.extras.hashCode() + C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(o00000.OooO0O0(C20509OooO0oo.OooO0OO(this.unboundedPageOffsetY, C20509OooO0oo.OooO0OO(this.unboundedPageOffsetX, C20509OooO0oo.OooO0OO(this.zoom, OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.savedPageIndex, (iOooO00o + (pdfInfo != null ? pdfInfo.hashCode() : 0)) * 31, 31), 31, this.activatedPageLayerId), 31), 31), 31), 31, this.unboundedNote), 31, this.creationTime), 31, this.lastModificationTime);
    }

    public final void setActivatedPageLayerId(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.activatedPageLayerId = str;
    }

    public final void setCreationTime(long j) {
        this.creationTime = j;
    }

    public final void setDefaultPage(Page page) {
        this.defaultPage = page;
    }

    public final void setExtras(Bundle bundle) {
        OooOOO0.OooO0oO(bundle, "<set-?>");
        this.extras = bundle;
    }

    public final void setId(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.id = str;
    }

    public final void setLastModificationTime(long j) {
        this.lastModificationTime = j;
    }

    public final void setOutlines(List<String> list) {
        OooOOO0.OooO0oO(list, "<set-?>");
        this.outlines = list;
    }

    public final void setPageLayerIds(List<String> list) {
        OooOOO0.OooO0oO(list, "<set-?>");
        this.pageLayerIds = list;
    }

    public final void setPages(List<Page> list) {
        OooOOO0.OooO0oO(list, "<set-?>");
        this.pages = list;
    }

    public final void setPdfInfo(PdfInfo pdfInfo) {
        this.pdfInfo = pdfInfo;
    }

    public final void setSavedPageIndex(int i) {
        this.savedPageIndex = i;
    }

    public final void setUnboundedNote(boolean z) {
        this.unboundedNote = z;
    }

    public final void setUnboundedPageOffsetX(float f) {
        this.unboundedPageOffsetX = f;
    }

    public final void setUnboundedPageOffsetY(float f) {
        this.unboundedPageOffsetY = f;
    }

    public final void setZoom(float f) {
        this.zoom = f;
    }

    public String toString() {
        String str = this.id;
        Page page = this.defaultPage;
        List<Page> list = this.pages;
        List<String> list2 = this.pageLayerIds;
        List<String> list3 = this.outlines;
        PdfInfo pdfInfo = this.pdfInfo;
        int i = this.savedPageIndex;
        String str2 = this.activatedPageLayerId;
        float f = this.zoom;
        float f2 = this.unboundedPageOffsetX;
        float f3 = this.unboundedPageOffsetY;
        boolean z = this.unboundedNote;
        long j = this.creationTime;
        long j2 = this.lastModificationTime;
        Bundle bundle = this.extras;
        StringBuilder sb = new StringBuilder("NoteContent(id=");
        sb.append(str);
        sb.append(", defaultPage=");
        sb.append(page);
        sb.append(", pages=");
        sb.append(list);
        sb.append(", pageLayerIds=");
        sb.append(list2);
        sb.append(", outlines=");
        sb.append(list3);
        sb.append(", pdfInfo=");
        sb.append(pdfInfo);
        sb.append(", savedPageIndex=");
        C21036OooOOo0.OooO0Oo(i, ", activatedPageLayerId=", str2, ", zoom=", sb);
        sb.append(f);
        sb.append(", unboundedPageOffsetX=");
        sb.append(f2);
        sb.append(", unboundedPageOffsetY=");
        sb.append(f3);
        sb.append(", unboundedNote=");
        sb.append(z);
        sb.append(", creationTime=");
        sb.append(j);
        C22205OooOOo.OooO0OO(j2, ", lastModificationTime=", ", extras=", sb);
        sb.append(bundle);
        sb.append(")");
        return sb.toString();
    }

    public NoteContent(String id, Page page, List<Page> pages, List<String> pageLayerIds, List<String> outlines, PdfInfo pdfInfo, int i, String activatedPageLayerId, float f, float f2, float f3, boolean z, long j, long j2, Bundle extras) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(pages, "pages");
        OooOOO0.OooO0oO(pageLayerIds, "pageLayerIds");
        OooOOO0.OooO0oO(outlines, "outlines");
        OooOOO0.OooO0oO(activatedPageLayerId, "activatedPageLayerId");
        OooOOO0.OooO0oO(extras, "extras");
        this.id = id;
        this.defaultPage = page;
        this.pages = pages;
        this.pageLayerIds = pageLayerIds;
        this.outlines = outlines;
        this.pdfInfo = pdfInfo;
        this.savedPageIndex = i;
        this.activatedPageLayerId = activatedPageLayerId;
        this.zoom = f;
        this.unboundedPageOffsetX = f2;
        this.unboundedPageOffsetY = f3;
        this.unboundedNote = z;
        this.creationTime = j;
        this.lastModificationTime = j2;
        this.extras = extras;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NoteContent(String str, Page page, List list, List list2, List list3, PdfInfo pdfInfo, int i, String str2, float f, float f2, float f3, boolean z, long j, long j2, Bundle bundle, int i2, C24018OooO0oo c24018OooO0oo) {
        String str3 = (i2 & 1) != 0 ? "" : str;
        Page page2 = (i2 & 2) != 0 ? null : page;
        int i3 = i2 & 4;
        List list4 = C34434OooOoO.f123453OooOo0o;
        this(str3, page2, i3 != 0 ? list4 : list, (i2 & 8) != 0 ? list4 : list2, (i2 & 16) == 0 ? list3 : list4, (i2 & 32) == 0 ? pdfInfo : null, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? "default" : str2, (i2 & 256) != 0 ? 1.0f : f, (i2 & 512) != 0 ? 0.0f : f2, (i2 & 1024) == 0 ? f3 : 0.0f, (i2 & 2048) == 0 ? z : false, (i2 & 4096) != 0 ? System.currentTimeMillis() : j, (i2 & 8192) != 0 ? System.currentTimeMillis() : j2, (i2 & 16384) != 0 ? BundleKt.bundleOf() : bundle);
    }
}
