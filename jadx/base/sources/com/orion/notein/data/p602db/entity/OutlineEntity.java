package com.orion.notein.data.p602db.entity;

import OooOO0.OooO0OO;
import OooOoo0.C20703o000000o;
import OoooooO.C21445Oooo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.hihonor.honorid.core.data.ChildrenInfo;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003Jm\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001a¨\u0006,"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/OutlineEntity;", "", "id", "", NoteMeta.PROPERTY_TITLE, NoteMeta.PROPERTY_PARENT_ID, "pageId", NoteMeta.PROPERTY_NOTE_ID, "quoteId", ChildrenInfo.TAG_CHILDREN_INFO, "", C17625c.f52155b, "", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JJ)V", "getId", "()Ljava/lang/String;", "getTitle", "getParentId", "getPageId", "getNoteId", "getQuoteId", "getChildren", "()Ljava/util/List;", "getCreationTime", "()J", "getLastModificationTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class OutlineEntity {
    private final List<String> children;
    private final long creationTime;
    private final String id;
    private final long lastModificationTime;
    private final String noteId;
    private final String pageId;
    private final String parentId;
    private final String quoteId;
    private final String title;

    public OutlineEntity(String id, String title, String str, String pageId, String noteId, String str2, List<String> children, long j, long j2) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(children, "children");
        this.id = id;
        this.title = title;
        this.parentId = str;
        this.pageId = pageId;
        this.noteId = noteId;
        this.quoteId = str2;
        this.children = children;
        this.creationTime = j;
        this.lastModificationTime = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OutlineEntity copy$default(OutlineEntity outlineEntity, String str, String str2, String str3, String str4, String str5, String str6, List list, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = outlineEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = outlineEntity.title;
        }
        if ((i & 4) != 0) {
            str3 = outlineEntity.parentId;
        }
        if ((i & 8) != 0) {
            str4 = outlineEntity.pageId;
        }
        if ((i & 16) != 0) {
            str5 = outlineEntity.noteId;
        }
        if ((i & 32) != 0) {
            str6 = outlineEntity.quoteId;
        }
        if ((i & 64) != 0) {
            list = outlineEntity.children;
        }
        if ((i & 128) != 0) {
            j = outlineEntity.creationTime;
        }
        if ((i & 256) != 0) {
            j2 = outlineEntity.lastModificationTime;
        }
        long j3 = j2;
        long j4 = j;
        String str7 = str6;
        List list2 = list;
        String str8 = str5;
        String str9 = str3;
        return outlineEntity.copy(str, str2, str9, str4, str8, str7, list2, j4, j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNoteId() {
        return this.noteId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getQuoteId() {
        return this.quoteId;
    }

    public final List<String> component7() {
        return this.children;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final OutlineEntity copy(String id, String title, String parentId, String pageId, String noteId, String quoteId, List<String> children, long creationTime, long lastModificationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(children, "children");
        return new OutlineEntity(id, title, parentId, pageId, noteId, quoteId, children, creationTime, lastModificationTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OutlineEntity)) {
            return false;
        }
        OutlineEntity outlineEntity = (OutlineEntity) other;
        return OooOOO0.OooO0O0(this.id, outlineEntity.id) && OooOOO0.OooO0O0(this.title, outlineEntity.title) && OooOOO0.OooO0O0(this.parentId, outlineEntity.parentId) && OooOOO0.OooO0O0(this.pageId, outlineEntity.pageId) && OooOOO0.OooO0O0(this.noteId, outlineEntity.noteId) && OooOOO0.OooO0O0(this.quoteId, outlineEntity.quoteId) && OooOOO0.OooO0O0(this.children, outlineEntity.children) && this.creationTime == outlineEntity.creationTime && this.lastModificationTime == outlineEntity.lastModificationTime;
    }

    public final List<String> getChildren() {
        return this.children;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final String getId() {
        return this.id;
    }

    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final String getNoteId() {
        return this.noteId;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getQuoteId() {
        return this.quoteId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.title);
        String str = this.parentId;
        int iOooO0O02 = OooO00o.OooO0O0(OooO00o.OooO0O0((iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31, 31, this.pageId), 31, this.noteId);
        String str2 = this.quoteId;
        return Long.hashCode(this.lastModificationTime) + C20703o000000o.OooO0O0(C21445Oooo.OooO00o(this.children, (iOooO0O02 + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31, this.creationTime);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.parentId;
        String str4 = this.pageId;
        String str5 = this.noteId;
        String str6 = this.quoteId;
        List<String> list = this.children;
        long j = this.creationTime;
        long j2 = this.lastModificationTime;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("OutlineEntity(id=", str, ", title=", str2, ", parentId=");
        OooO0OO.OooO0o0(sbOooO0O0, str3, ", pageId=", str4, ", noteId=");
        OooO0OO.OooO0o0(sbOooO0O0, str5, ", quoteId=", str6, ", children=");
        sbOooO0O0.append(list);
        sbOooO0O0.append(", creationTime=");
        sbOooO0O0.append(j);
        return com.facebook.soloader.OooO0OO.OooO00o(j2, ", lastModificationTime=", ")", sbOooO0O0);
    }
}
