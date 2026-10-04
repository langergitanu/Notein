package com.orion.notein.domain.models.p605ai;

import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import OoooooO.C21445Oooo;
import com.facebook.soloader.OooO0OO;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003JA\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0007HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001c¨\u0006*"}, m80612d2 = {"Lcom/orion/notein/domain/models/ai/NoteAiContent;", "", "id", "", "summaryIdList", "", "savedSummaryIndex", "", C17625c.f52155b, "", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "<init>", "(Ljava/lang/String;Ljava/util/List;IJJ)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getSummaryIdList", "()Ljava/util/List;", "setSummaryIdList", "(Ljava/util/List;)V", "getSavedSummaryIndex", "()I", "setSavedSummaryIndex", "(I)V", "getCreationTime", "()J", "setCreationTime", "(J)V", "getLastModificationTime", "setLastModificationTime", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NoteAiContent {
    private long creationTime;
    private String id;
    private long lastModificationTime;
    private int savedSummaryIndex;
    private List<String> summaryIdList;

    public NoteAiContent() {
        this(null, null, 0, 0L, 0L, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NoteAiContent copy$default(NoteAiContent noteAiContent, String str, List list, int i, long j, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = noteAiContent.id;
        }
        if ((i2 & 2) != 0) {
            list = noteAiContent.summaryIdList;
        }
        if ((i2 & 4) != 0) {
            i = noteAiContent.savedSummaryIndex;
        }
        if ((i2 & 8) != 0) {
            j = noteAiContent.creationTime;
        }
        if ((i2 & 16) != 0) {
            j2 = noteAiContent.lastModificationTime;
        }
        long j3 = j2;
        int i3 = i;
        return noteAiContent.copy(str, list, i3, j, j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<String> component2() {
        return this.summaryIdList;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSavedSummaryIndex() {
        return this.savedSummaryIndex;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final NoteAiContent copy(String id, List<String> summaryIdList, int savedSummaryIndex, long creationTime, long lastModificationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(summaryIdList, "summaryIdList");
        return new NoteAiContent(id, summaryIdList, savedSummaryIndex, creationTime, lastModificationTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteAiContent)) {
            return false;
        }
        NoteAiContent noteAiContent = (NoteAiContent) other;
        return OooOOO0.OooO0O0(this.id, noteAiContent.id) && OooOOO0.OooO0O0(this.summaryIdList, noteAiContent.summaryIdList) && this.savedSummaryIndex == noteAiContent.savedSummaryIndex && this.creationTime == noteAiContent.creationTime && this.lastModificationTime == noteAiContent.lastModificationTime;
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

    public final int getSavedSummaryIndex() {
        return this.savedSummaryIndex;
    }

    public final List<String> getSummaryIdList() {
        return this.summaryIdList;
    }

    public int hashCode() {
        return Long.hashCode(this.lastModificationTime) + C20703o000000o.OooO0O0(C20785Oooo00o.OooO00o(this.savedSummaryIndex, C21445Oooo.OooO00o(this.summaryIdList, this.id.hashCode() * 31, 31), 31), 31, this.creationTime);
    }

    public final void setCreationTime(long j) {
        this.creationTime = j;
    }

    public final void setId(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.id = str;
    }

    public final void setLastModificationTime(long j) {
        this.lastModificationTime = j;
    }

    public final void setSavedSummaryIndex(int i) {
        this.savedSummaryIndex = i;
    }

    public final void setSummaryIdList(List<String> list) {
        OooOOO0.OooO0oO(list, "<set-?>");
        this.summaryIdList = list;
    }

    public String toString() {
        String str = this.id;
        List<String> list = this.summaryIdList;
        int i = this.savedSummaryIndex;
        long j = this.creationTime;
        long j2 = this.lastModificationTime;
        StringBuilder sb = new StringBuilder("NoteAiContent(id=");
        sb.append(str);
        sb.append(", summaryIdList=");
        sb.append(list);
        sb.append(", savedSummaryIndex=");
        sb.append(i);
        sb.append(", creationTime=");
        sb.append(j);
        return OooO0OO.OooO00o(j2, ", lastModificationTime=", ")", sb);
    }

    public NoteAiContent(String id, List<String> summaryIdList, int i, long j, long j2) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(summaryIdList, "summaryIdList");
        this.id = id;
        this.summaryIdList = summaryIdList;
        this.savedSummaryIndex = i;
        this.creationTime = j;
        this.lastModificationTime = j2;
    }

    public /* synthetic */ NoteAiContent(String str, List list, int i, long j, long j2, int i2, C24018OooO0oo c24018OooO0oo) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? C34434OooOoO.f123453OooOo0o : list, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? System.currentTimeMillis() : j, (i2 & 16) != 0 ? System.currentTimeMillis() : j2);
    }
}
