package com.orion.notein.domain.models.page;

import androidx.appcompat.app.OooOOO;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0018"}, m80612d2 = {"Lcom/orion/notein/domain/models/page/PageClipDataV2;", "", "pageIds", "", "", NoteMeta.PROPERTY_NOTE_ID, "isCut", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Z)V", "getPageIds", "()Ljava/util/List;", "getNoteId", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PageClipDataV2 {
    private final boolean isCut;
    private final String noteId;
    private final List<String> pageIds;

    public PageClipDataV2(List<String> pageIds, String noteId, boolean z) {
        OooOOO0.OooO0oO(pageIds, "pageIds");
        OooOOO0.OooO0oO(noteId, "noteId");
        this.pageIds = pageIds;
        this.noteId = noteId;
        this.isCut = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PageClipDataV2 copy$default(PageClipDataV2 pageClipDataV2, List list, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = pageClipDataV2.pageIds;
        }
        if ((i & 2) != 0) {
            str = pageClipDataV2.noteId;
        }
        if ((i & 4) != 0) {
            z = pageClipDataV2.isCut;
        }
        return pageClipDataV2.copy(list, str, z);
    }

    public final List<String> component1() {
        return this.pageIds;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNoteId() {
        return this.noteId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsCut() {
        return this.isCut;
    }

    public final PageClipDataV2 copy(List<String> pageIds, String noteId, boolean isCut) {
        OooOOO0.OooO0oO(pageIds, "pageIds");
        OooOOO0.OooO0oO(noteId, "noteId");
        return new PageClipDataV2(pageIds, noteId, isCut);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageClipDataV2)) {
            return false;
        }
        PageClipDataV2 pageClipDataV2 = (PageClipDataV2) other;
        return OooOOO0.OooO0O0(this.pageIds, pageClipDataV2.pageIds) && OooOOO0.OooO0O0(this.noteId, pageClipDataV2.noteId) && this.isCut == pageClipDataV2.isCut;
    }

    public final String getNoteId() {
        return this.noteId;
    }

    public final List<String> getPageIds() {
        return this.pageIds;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isCut) + OooO00o.OooO0O0(this.pageIds.hashCode() * 31, 31, this.noteId);
    }

    public final boolean isCut() {
        return this.isCut;
    }

    public String toString() {
        List<String> list = this.pageIds;
        String str = this.noteId;
        boolean z = this.isCut;
        StringBuilder sb = new StringBuilder("PageClipDataV2(pageIds=");
        sb.append(list);
        sb.append(", noteId=");
        sb.append(str);
        sb.append(", isCut=");
        return OooOOO.OooO00o(sb, ")", z);
    }
}
