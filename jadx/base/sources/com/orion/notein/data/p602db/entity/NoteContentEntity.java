package com.orion.notein.data.p602db.entity;

import OooOO0.OooO0OO;
import OooOoO.C20509OooO0oo;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import Oooo0oO.C21036OooOOo0;
import OoooooO.C21445Oooo;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\bK\b\u0087\b\u0018\u00002\u00020\u0001B³\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010L\u001a\u00020\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u000bHÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u000eHÆ\u0003J\t\u0010U\u001a\u00020\u000eHÆ\u0003J\t\u0010V\u001a\u00020\u000eHÆ\u0003J\t\u0010W\u001a\u00020\u0012HÆ\u0003J\t\u0010X\u001a\u00020\u0014HÆ\u0003J\t\u0010Y\u001a\u00020\u0016HÆ\u0003J\t\u0010Z\u001a\u00020\u0016HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003Jµ\u0001\u0010\\\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0003HÆ\u0001J\u0013\u0010]\u001a\u00020\u00142\b\u0010^\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010_\u001a\u00020\u000bHÖ\u0001J\t\u0010`\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b5\u00106\u001a\u0004\b7\u00102\"\u0004\b8\u00104R$\u0010\u0010\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b9\u00106\u001a\u0004\b:\u00102\"\u0004\b;\u00104R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001e\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010E\"\u0004\bI\u0010GR\u001e\u0010\u0018\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u001c\"\u0004\bK\u0010\u001e¨\u0006a"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/NoteContentEntity;", "", "id", "", "pageListJson", "pageLayerListJson", "outlines", "", "defaultPageId", "pdfInfoId", "savedPageIndex", "", "activatedPageLayerId", "zoom", "", "unboundedPageOffsetX", "unboundedPageOffsetY", "pageOffSet", "Lcom/orion/notein/data/db/entity/PageOffSet;", "unboundedNote", "", C17625c.f52155b, "", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "extrasJson", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;FFFLcom/orion/notein/data/db/entity/PageOffSet;ZJJLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getPageListJson", "setPageListJson", "getPageLayerListJson", "setPageLayerListJson", "getOutlines", "()Ljava/util/List;", "setOutlines", "(Ljava/util/List;)V", "getDefaultPageId", "setDefaultPageId", "getPdfInfoId", "setPdfInfoId", "getSavedPageIndex", "()I", "setSavedPageIndex", "(I)V", "getActivatedPageLayerId", "setActivatedPageLayerId", "getZoom", "()F", "setZoom", "(F)V", "getUnboundedPageOffsetX$annotations", "()V", "getUnboundedPageOffsetX", "setUnboundedPageOffsetX", "getUnboundedPageOffsetY$annotations", "getUnboundedPageOffsetY", "setUnboundedPageOffsetY", "getPageOffSet", "()Lcom/orion/notein/data/db/entity/PageOffSet;", "setPageOffSet", "(Lcom/orion/notein/data/db/entity/PageOffSet;)V", "getUnboundedNote", "()Z", "setUnboundedNote", "(Z)V", "getCreationTime", "()J", "setCreationTime", "(J)V", "getLastModificationTime", "setLastModificationTime", "getExtrasJson", "setExtrasJson", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NoteContentEntity {
    private String activatedPageLayerId;
    private long creationTime;
    private String defaultPageId;
    private String extrasJson;
    private String id;
    private long lastModificationTime;
    private List<String> outlines;
    private String pageLayerListJson;
    private String pageListJson;
    private PageOffSet pageOffSet;
    private String pdfInfoId;
    private int savedPageIndex;
    private boolean unboundedNote;
    private float unboundedPageOffsetX;
    private float unboundedPageOffsetY;
    private float zoom;

    public NoteContentEntity() {
        this(null, null, null, null, null, null, 0, null, 0.0f, 0.0f, 0.0f, null, false, 0L, 0L, null, 65535, null);
    }

    public static /* synthetic */ void getUnboundedPageOffsetX$annotations() {
    }

    public static /* synthetic */ void getUnboundedPageOffsetY$annotations() {
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
    public final PageOffSet getPageOffSet() {
        return this.pageOffSet;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getUnboundedNote() {
        return this.unboundedNote;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getExtrasJson() {
        return this.extrasJson;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPageListJson() {
        return this.pageListJson;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPageLayerListJson() {
        return this.pageLayerListJson;
    }

    public final List<String> component4() {
        return this.outlines;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDefaultPageId() {
        return this.defaultPageId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPdfInfoId() {
        return this.pdfInfoId;
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

    public final NoteContentEntity copy(String id, String pageListJson, String pageLayerListJson, List<String> outlines, String defaultPageId, String pdfInfoId, int savedPageIndex, String activatedPageLayerId, float zoom, float unboundedPageOffsetX, float unboundedPageOffsetY, PageOffSet pageOffSet, boolean unboundedNote, long creationTime, long lastModificationTime, String extrasJson) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(outlines, "outlines");
        OooOOO0.OooO0oO(defaultPageId, "defaultPageId");
        OooOOO0.OooO0oO(activatedPageLayerId, "activatedPageLayerId");
        OooOOO0.OooO0oO(pageOffSet, "pageOffSet");
        OooOOO0.OooO0oO(extrasJson, "extrasJson");
        return new NoteContentEntity(id, pageListJson, pageLayerListJson, outlines, defaultPageId, pdfInfoId, savedPageIndex, activatedPageLayerId, zoom, unboundedPageOffsetX, unboundedPageOffsetY, pageOffSet, unboundedNote, creationTime, lastModificationTime, extrasJson);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteContentEntity)) {
            return false;
        }
        NoteContentEntity noteContentEntity = (NoteContentEntity) other;
        return OooOOO0.OooO0O0(this.id, noteContentEntity.id) && OooOOO0.OooO0O0(this.pageListJson, noteContentEntity.pageListJson) && OooOOO0.OooO0O0(this.pageLayerListJson, noteContentEntity.pageLayerListJson) && OooOOO0.OooO0O0(this.outlines, noteContentEntity.outlines) && OooOOO0.OooO0O0(this.defaultPageId, noteContentEntity.defaultPageId) && OooOOO0.OooO0O0(this.pdfInfoId, noteContentEntity.pdfInfoId) && this.savedPageIndex == noteContentEntity.savedPageIndex && OooOOO0.OooO0O0(this.activatedPageLayerId, noteContentEntity.activatedPageLayerId) && Float.compare(this.zoom, noteContentEntity.zoom) == 0 && Float.compare(this.unboundedPageOffsetX, noteContentEntity.unboundedPageOffsetX) == 0 && Float.compare(this.unboundedPageOffsetY, noteContentEntity.unboundedPageOffsetY) == 0 && OooOOO0.OooO0O0(this.pageOffSet, noteContentEntity.pageOffSet) && this.unboundedNote == noteContentEntity.unboundedNote && this.creationTime == noteContentEntity.creationTime && this.lastModificationTime == noteContentEntity.lastModificationTime && OooOOO0.OooO0O0(this.extrasJson, noteContentEntity.extrasJson);
    }

    public final String getActivatedPageLayerId() {
        return this.activatedPageLayerId;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final String getDefaultPageId() {
        return this.defaultPageId;
    }

    public final String getExtrasJson() {
        return this.extrasJson;
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

    public final String getPageLayerListJson() {
        return this.pageLayerListJson;
    }

    public final String getPageListJson() {
        return this.pageListJson;
    }

    public final PageOffSet getPageOffSet() {
        return this.pageOffSet;
    }

    public final String getPdfInfoId() {
        return this.pdfInfoId;
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
        String str = this.pageListJson;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pageLayerListJson;
        int iOooO0O0 = OooO00o.OooO0O0(C21445Oooo.OooO00o(this.outlines, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.defaultPageId);
        String str3 = this.pdfInfoId;
        return this.extrasJson.hashCode() + C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(o00000.OooO0O0((this.pageOffSet.hashCode() + C20509OooO0oo.OooO0OO(this.unboundedPageOffsetY, C20509OooO0oo.OooO0OO(this.unboundedPageOffsetX, C20509OooO0oo.OooO0OO(this.zoom, OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.savedPageIndex, (iOooO0O0 + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31, this.activatedPageLayerId), 31), 31), 31)) * 31, 31, this.unboundedNote), 31, this.creationTime), 31, this.lastModificationTime);
    }

    public final void setActivatedPageLayerId(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.activatedPageLayerId = str;
    }

    public final void setCreationTime(long j) {
        this.creationTime = j;
    }

    public final void setDefaultPageId(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.defaultPageId = str;
    }

    public final void setExtrasJson(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.extrasJson = str;
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

    public final void setPageLayerListJson(String str) {
        this.pageLayerListJson = str;
    }

    public final void setPageListJson(String str) {
        this.pageListJson = str;
    }

    public final void setPageOffSet(PageOffSet pageOffSet) {
        OooOOO0.OooO0oO(pageOffSet, "<set-?>");
        this.pageOffSet = pageOffSet;
    }

    public final void setPdfInfoId(String str) {
        this.pdfInfoId = str;
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
        String str2 = this.pageListJson;
        String str3 = this.pageLayerListJson;
        List<String> list = this.outlines;
        String str4 = this.defaultPageId;
        String str5 = this.pdfInfoId;
        int i = this.savedPageIndex;
        String str6 = this.activatedPageLayerId;
        float f = this.zoom;
        float f2 = this.unboundedPageOffsetX;
        float f3 = this.unboundedPageOffsetY;
        PageOffSet pageOffSet = this.pageOffSet;
        boolean z = this.unboundedNote;
        long j = this.creationTime;
        long j2 = this.lastModificationTime;
        String str7 = this.extrasJson;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("NoteContentEntity(id=", str, ", pageListJson=", str2, ", pageLayerListJson=");
        sbOooO0O0.append(str3);
        sbOooO0O0.append(", outlines=");
        sbOooO0O0.append(list);
        sbOooO0O0.append(", defaultPageId=");
        OooO0OO.OooO0o0(sbOooO0O0, str4, ", pdfInfoId=", str5, ", savedPageIndex=");
        C21036OooOOo0.OooO0Oo(i, ", activatedPageLayerId=", str6, ", zoom=", sbOooO0O0);
        sbOooO0O0.append(f);
        sbOooO0O0.append(", unboundedPageOffsetX=");
        sbOooO0O0.append(f2);
        sbOooO0O0.append(", unboundedPageOffsetY=");
        sbOooO0O0.append(f3);
        sbOooO0O0.append(", pageOffSet=");
        sbOooO0O0.append(pageOffSet);
        sbOooO0O0.append(", unboundedNote=");
        sbOooO0O0.append(z);
        sbOooO0O0.append(", creationTime=");
        sbOooO0O0.append(j);
        C22205OooOOo.OooO0OO(j2, ", lastModificationTime=", ", extrasJson=", sbOooO0O0);
        return androidx.concurrent.futures.OooO00o.OooO0OO(sbOooO0O0, str7, ")");
    }

    public NoteContentEntity(String id, String str, String str2, List<String> outlines, String defaultPageId, String str3, int i, String activatedPageLayerId, float f, float f2, float f3, PageOffSet pageOffSet, boolean z, long j, long j2, String extrasJson) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(outlines, "outlines");
        OooOOO0.OooO0oO(defaultPageId, "defaultPageId");
        OooOOO0.OooO0oO(activatedPageLayerId, "activatedPageLayerId");
        OooOOO0.OooO0oO(pageOffSet, "pageOffSet");
        OooOOO0.OooO0oO(extrasJson, "extrasJson");
        this.id = id;
        this.pageListJson = str;
        this.pageLayerListJson = str2;
        this.outlines = outlines;
        this.defaultPageId = defaultPageId;
        this.pdfInfoId = str3;
        this.savedPageIndex = i;
        this.activatedPageLayerId = activatedPageLayerId;
        this.zoom = f;
        this.unboundedPageOffsetX = f2;
        this.unboundedPageOffsetY = f3;
        this.pageOffSet = pageOffSet;
        this.unboundedNote = z;
        this.creationTime = j;
        this.lastModificationTime = j2;
        this.extrasJson = extrasJson;
    }

    public /* synthetic */ NoteContentEntity(String str, String str2, String str3, List list, String str4, String str5, int i, String str6, float f, float f2, float f3, PageOffSet pageOffSet, boolean z, long j, long j2, String str7, int i2, C24018OooO0oo c24018OooO0oo) {
        String str8;
        PageOffSet pageOffSet2;
        String str9 = (i2 & 1) != 0 ? "" : str;
        String str10 = (i2 & 2) != 0 ? null : str2;
        String str11 = (i2 & 4) != 0 ? null : str3;
        List list2 = (i2 & 8) != 0 ? C34434OooOoO.f123453OooOo0o : list;
        String str12 = (i2 & 16) != 0 ? "" : str4;
        String str13 = (i2 & 32) != 0 ? null : str5;
        int i3 = (i2 & 64) != 0 ? 0 : i;
        String str14 = (i2 & 128) != 0 ? "" : str6;
        float f4 = (i2 & 256) != 0 ? 1.0f : f;
        float f5 = (i2 & 512) != 0 ? 0.0f : f2;
        float f6 = (i2 & 1024) != 0 ? 0.0f : f3;
        if ((i2 & 2048) != 0) {
            str8 = str9;
            pageOffSet2 = new PageOffSet(0.0f, 0.0f, 3, null);
        } else {
            str8 = str9;
            pageOffSet2 = pageOffSet;
        }
        this(str8, str10, str11, list2, str12, str13, i3, str14, f4, f5, f6, pageOffSet2, (i2 & 4096) != 0 ? false : z, (i2 & 8192) != 0 ? 0L : j, (i2 & 16384) == 0 ? j2 : 0L, (i2 & 32768) != 0 ? "" : str7);
    }
}
