package com.orion.notein.domain.models.note;

import OooOO0.OooO0OO;
import OooOoo0.C20703o000000o;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p332p7.OooO;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.huawei.agconnect.credential.obs.C17625c;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0019Jb\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\fHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019¨\u0006*"}, m80612d2 = {"Lcom/orion/notein/domain/models/note/Comment;", "", "id", "", NoteMeta.PROPERTY_TITLE, "pageId", NoteMeta.PROPERTY_NOTE_ID, "quoteId", C17625c.f52155b, "", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "sortKey", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Integer;)V", "getId", "()Ljava/lang/String;", "getTitle", "getPageId", "getNoteId", "getQuoteId", "getCreationTime", "()J", "getLastModificationTime", "getSortKey", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Integer;)Lcom/orion/notein/domain/models/note/Comment;", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class Comment {
    private final long creationTime;
    private final String id;
    private final long lastModificationTime;
    private final String noteId;
    private final String pageId;
    private final String quoteId;
    private final Integer sortKey;
    private final String title;

    public Comment(String id, String title, String pageId, String noteId, String str, long j, long j2, Integer num) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(noteId, "noteId");
        this.id = id;
        this.title = title;
        this.pageId = pageId;
        this.noteId = noteId;
        this.quoteId = str;
        this.creationTime = j;
        this.lastModificationTime = j2;
        this.sortKey = num;
    }

    public static /* synthetic */ Comment copy$default(Comment comment, String str, String str2, String str3, String str4, String str5, long j, long j2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = comment.id;
        }
        if ((i & 2) != 0) {
            str2 = comment.title;
        }
        if ((i & 4) != 0) {
            str3 = comment.pageId;
        }
        if ((i & 8) != 0) {
            str4 = comment.noteId;
        }
        if ((i & 16) != 0) {
            str5 = comment.quoteId;
        }
        if ((i & 32) != 0) {
            j = comment.creationTime;
        }
        if ((i & 64) != 0) {
            j2 = comment.lastModificationTime;
        }
        if ((i & 128) != 0) {
            num = comment.sortKey;
        }
        Integer num2 = num;
        long j3 = j2;
        long j4 = j;
        String str6 = str5;
        String str7 = str3;
        return comment.copy(str, str2, str7, str4, str6, j4, j3, num2);
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
    public final String getPageId() {
        return this.pageId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNoteId() {
        return this.noteId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getQuoteId() {
        return this.quoteId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getSortKey() {
        return this.sortKey;
    }

    public final Comment copy(String id, String title, String pageId, String noteId, String quoteId, long creationTime, long lastModificationTime, Integer sortKey) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(noteId, "noteId");
        return new Comment(id, title, pageId, noteId, quoteId, creationTime, lastModificationTime, sortKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Comment)) {
            return false;
        }
        Comment comment = (Comment) other;
        return OooOOO0.OooO0O0(this.id, comment.id) && OooOOO0.OooO0O0(this.title, comment.title) && OooOOO0.OooO0O0(this.pageId, comment.pageId) && OooOOO0.OooO0O0(this.noteId, comment.noteId) && OooOOO0.OooO0O0(this.quoteId, comment.quoteId) && this.creationTime == comment.creationTime && this.lastModificationTime == comment.lastModificationTime && OooOOO0.OooO0O0(this.sortKey, comment.sortKey);
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

    public final String getQuoteId() {
        return this.quoteId;
    }

    public final Integer getSortKey() {
        return this.sortKey;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.title), 31, this.pageId), 31, this.noteId);
        String str = this.quoteId;
        int iOooO0O02 = C20703o000000o.OooO0O0(C20703o000000o.OooO0O0((iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31, 31, this.creationTime), 31, this.lastModificationTime);
        Integer num = this.sortKey;
        return iOooO0O02 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.pageId;
        String str4 = this.noteId;
        String str5 = this.quoteId;
        long j = this.creationTime;
        long j2 = this.lastModificationTime;
        Integer num = this.sortKey;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("Comment(id=", str, ", title=", str2, ", pageId=");
        OooO0OO.OooO0o0(sbOooO0O0, str3, ", noteId=", str4, ", quoteId=");
        OooO.OooO00o(j, str5, ", creationTime=", sbOooO0O0);
        C22205OooOOo.OooO0OO(j2, ", lastModificationTime=", ", sortKey=", sbOooO0O0);
        sbOooO0O0.append(num);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    public /* synthetic */ Comment(String str, String str2, String str3, String str4, String str5, long j, long j2, Integer num, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? UUID.randomUUID().toString() : str, str2, str3, str4, str5, (i & 32) != 0 ? System.currentTimeMillis() : j, (i & 64) != 0 ? System.currentTimeMillis() : j2, (i & 128) != 0 ? null : num);
    }
}
