package com.orion.notein.domain.models.cache;

import OooOo.C20485OooOoO;
import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.domain.models.handwriting.RecognizedTextElement;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003JU\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0005HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00063"}, m80612d2 = {"Lcom/orion/notein/domain/models/cache/HandWritingTextCache;", "", "pageId", "", "pageGridX", "", "pageGridY", "trajectoryHash", C17625c.f52155b, "", "text", "elements", "", "Lcom/orion/notein/domain/models/handwriting/RecognizedTextElement;", "<init>", "(Ljava/lang/String;IIIJLjava/lang/String;Ljava/util/List;)V", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "getPageGridX", "()I", "setPageGridX", "(I)V", "getPageGridY", "setPageGridY", "getTrajectoryHash", "setTrajectoryHash", "getCreationTime", "()J", "setCreationTime", "(J)V", "getText", "setText", "getElements", "()Ljava/util/List;", "setElements", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class HandWritingTextCache {
    private long creationTime;
    private List<RecognizedTextElement> elements;
    private int pageGridX;
    private int pageGridY;
    private String pageId;
    private String text;
    private int trajectoryHash;

    public HandWritingTextCache() {
        this(null, 0, 0, 0, 0L, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HandWritingTextCache copy$default(HandWritingTextCache handWritingTextCache, String str, int i, int i2, int i3, long j, String str2, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = handWritingTextCache.pageId;
        }
        if ((i4 & 2) != 0) {
            i = handWritingTextCache.pageGridX;
        }
        if ((i4 & 4) != 0) {
            i2 = handWritingTextCache.pageGridY;
        }
        if ((i4 & 8) != 0) {
            i3 = handWritingTextCache.trajectoryHash;
        }
        if ((i4 & 16) != 0) {
            j = handWritingTextCache.creationTime;
        }
        if ((i4 & 32) != 0) {
            str2 = handWritingTextCache.text;
        }
        if ((i4 & 64) != 0) {
            list = handWritingTextCache.elements;
        }
        long j2 = j;
        int i5 = i2;
        int i6 = i3;
        return handWritingTextCache.copy(str, i, i5, i6, j2, str2, list);
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
    public final int getTrajectoryHash() {
        return this.trajectoryHash;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final List<RecognizedTextElement> component7() {
        return this.elements;
    }

    public final HandWritingTextCache copy(String pageId, int pageGridX, int pageGridY, int trajectoryHash, long creationTime, String text, List<RecognizedTextElement> elements) {
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(text, "text");
        OooOOO0.OooO0oO(elements, "elements");
        return new HandWritingTextCache(pageId, pageGridX, pageGridY, trajectoryHash, creationTime, text, elements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HandWritingTextCache)) {
            return false;
        }
        HandWritingTextCache handWritingTextCache = (HandWritingTextCache) other;
        return OooOOO0.OooO0O0(this.pageId, handWritingTextCache.pageId) && this.pageGridX == handWritingTextCache.pageGridX && this.pageGridY == handWritingTextCache.pageGridY && this.trajectoryHash == handWritingTextCache.trajectoryHash && this.creationTime == handWritingTextCache.creationTime && OooOOO0.OooO0O0(this.text, handWritingTextCache.text) && OooOOO0.OooO0O0(this.elements, handWritingTextCache.elements);
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final List<RecognizedTextElement> getElements() {
        return this.elements;
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

    public final String getText() {
        return this.text;
    }

    public final int getTrajectoryHash() {
        return this.trajectoryHash;
    }

    public int hashCode() {
        return this.elements.hashCode() + OooO00o.OooO0O0(C20703o000000o.OooO0O0(C20785Oooo00o.OooO00o(this.trajectoryHash, C20785Oooo00o.OooO00o(this.pageGridY, C20785Oooo00o.OooO00o(this.pageGridX, this.pageId.hashCode() * 31, 31), 31), 31), 31, this.creationTime), 31, this.text);
    }

    public final void setCreationTime(long j) {
        this.creationTime = j;
    }

    public final void setElements(List<RecognizedTextElement> list) {
        OooOOO0.OooO0oO(list, "<set-?>");
        this.elements = list;
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

    public final void setText(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.text = str;
    }

    public final void setTrajectoryHash(int i) {
        this.trajectoryHash = i;
    }

    public String toString() {
        String str = this.pageId;
        int i = this.pageGridX;
        int i2 = this.pageGridY;
        int i3 = this.trajectoryHash;
        long j = this.creationTime;
        String str2 = this.text;
        List<RecognizedTextElement> list = this.elements;
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "HandWritingTextCache(pageId=", str, ", pageGridX=", ", pageGridY=");
        C24472OooOoo.OooO0O0(sbOooO0OO, ", trajectoryHash=", ", creationTime=", i2, i3);
        sbOooO0OO.append(j);
        sbOooO0OO.append(", text=");
        sbOooO0OO.append(str2);
        sbOooO0OO.append(", elements=");
        sbOooO0OO.append(list);
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }

    public HandWritingTextCache(String pageId, int i, int i2, int i3, long j, String text, List<RecognizedTextElement> elements) {
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(text, "text");
        OooOOO0.OooO0oO(elements, "elements");
        this.pageId = pageId;
        this.pageGridX = i;
        this.pageGridY = i2;
        this.trajectoryHash = i3;
        this.creationTime = j;
        this.text = text;
        this.elements = elements;
    }

    public /* synthetic */ HandWritingTextCache(String str, int i, int i2, int i3, long j, String str2, List list, int i4, C24018OooO0oo c24018OooO0oo) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? 0L : j, (i4 & 32) != 0 ? "" : str2, (i4 & 64) != 0 ? new ArrayList() : list);
    }
}
