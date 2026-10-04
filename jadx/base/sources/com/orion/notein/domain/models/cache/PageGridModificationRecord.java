package com.orion.notein.domain.models.cache;

import OooOo.C20485OooOoO;
import OooOooo.C20785Oooo00o;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J1\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006#"}, m80612d2 = {"Lcom/orion/notein/domain/models/cache/PageGridModificationRecord;", "", "pageId", "", "pageGridX", "", "pageGridY", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "", "<init>", "(Ljava/lang/String;IIJ)V", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "getPageGridX", "()I", "setPageGridX", "(I)V", "getPageGridY", "setPageGridY", "getLastModificationTime", "()J", "setLastModificationTime", "(J)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PageGridModificationRecord {
    private long lastModificationTime;
    private int pageGridX;
    private int pageGridY;
    private String pageId;

    public PageGridModificationRecord(String pageId, int i, int i2, long j) {
        OooOOO0.OooO0oO(pageId, "pageId");
        this.pageId = pageId;
        this.pageGridX = i;
        this.pageGridY = i2;
        this.lastModificationTime = j;
    }

    public static /* synthetic */ PageGridModificationRecord copy$default(PageGridModificationRecord pageGridModificationRecord, String str, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = pageGridModificationRecord.pageId;
        }
        if ((i3 & 2) != 0) {
            i = pageGridModificationRecord.pageGridX;
        }
        if ((i3 & 4) != 0) {
            i2 = pageGridModificationRecord.pageGridY;
        }
        if ((i3 & 8) != 0) {
            j = pageGridModificationRecord.lastModificationTime;
        }
        int i4 = i2;
        return pageGridModificationRecord.copy(str, i, i4, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPageGridX() {
        return this.pageGridX;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPageGridY() {
        return this.pageGridY;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final PageGridModificationRecord copy(String pageId, int pageGridX, int pageGridY, long lastModificationTime) {
        OooOOO0.OooO0oO(pageId, "pageId");
        return new PageGridModificationRecord(pageId, pageGridX, pageGridY, lastModificationTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageGridModificationRecord)) {
            return false;
        }
        PageGridModificationRecord pageGridModificationRecord = (PageGridModificationRecord) other;
        return OooOOO0.OooO0O0(this.pageId, pageGridModificationRecord.pageId) && this.pageGridX == pageGridModificationRecord.pageGridX && this.pageGridY == pageGridModificationRecord.pageGridY && this.lastModificationTime == pageGridModificationRecord.lastModificationTime;
    }

    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final int getPageGridX() {
        return this.pageGridX;
    }

    public final int getPageGridY() {
        return this.pageGridY;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public int hashCode() {
        return Long.hashCode(this.lastModificationTime) + C20785Oooo00o.OooO00o(this.pageGridY, C20785Oooo00o.OooO00o(this.pageGridX, this.pageId.hashCode() * 31, 31), 31);
    }

    public final void setLastModificationTime(long j) {
        this.lastModificationTime = j;
    }

    public final void setPageGridX(int i) {
        this.pageGridX = i;
    }

    public final void setPageGridY(int i) {
        this.pageGridY = i;
    }

    public final void setPageId(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.pageId = str;
    }

    public String toString() {
        String str = this.pageId;
        int i = this.pageGridX;
        int i2 = this.pageGridY;
        long j = this.lastModificationTime;
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "PageGridModificationRecord(pageId=", str, ", pageGridX=", ", pageGridY=");
        sbOooO0OO.append(i2);
        sbOooO0OO.append(", lastModificationTime=");
        sbOooO0OO.append(j);
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }
}
