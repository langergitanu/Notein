package com.orion.notein.data.p602db.entity.p603ai;

import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.facebook.soloader.OooO0OO;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\r\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006!"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/ai/NoteAiContentEntity;", "", "id", "", "summaryIdListJson", "savedSummaryIndex", "", C17625c.f52155b, "", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "<init>", "(Ljava/lang/String;Ljava/lang/String;IJJ)V", "getId", "()Ljava/lang/String;", "getSummaryIdListJson", "setSummaryIdListJson", "(Ljava/lang/String;)V", "getSavedSummaryIndex", "()I", "getCreationTime", "()J", "getLastModificationTime", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NoteAiContentEntity {
    private final long creationTime;
    private final String id;
    private final long lastModificationTime;
    private final int savedSummaryIndex;
    private String summaryIdListJson;

    public NoteAiContentEntity(String id, String str, int i, long j, long j2) {
        OooOOO0.OooO0oO(id, "id");
        this.id = id;
        this.summaryIdListJson = str;
        this.savedSummaryIndex = i;
        this.creationTime = j;
        this.lastModificationTime = j2;
    }

    public static /* synthetic */ NoteAiContentEntity copy$default(NoteAiContentEntity noteAiContentEntity, String str, String str2, int i, long j, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = noteAiContentEntity.id;
        }
        if ((i2 & 2) != 0) {
            str2 = noteAiContentEntity.summaryIdListJson;
        }
        if ((i2 & 4) != 0) {
            i = noteAiContentEntity.savedSummaryIndex;
        }
        if ((i2 & 8) != 0) {
            j = noteAiContentEntity.creationTime;
        }
        if ((i2 & 16) != 0) {
            j2 = noteAiContentEntity.lastModificationTime;
        }
        long j3 = j2;
        int i3 = i;
        return noteAiContentEntity.copy(str, str2, i3, j, j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSummaryIdListJson() {
        return this.summaryIdListJson;
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

    public final NoteAiContentEntity copy(String id, String summaryIdListJson, int savedSummaryIndex, long creationTime, long lastModificationTime) {
        OooOOO0.OooO0oO(id, "id");
        return new NoteAiContentEntity(id, summaryIdListJson, savedSummaryIndex, creationTime, lastModificationTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteAiContentEntity)) {
            return false;
        }
        NoteAiContentEntity noteAiContentEntity = (NoteAiContentEntity) other;
        return OooOOO0.OooO0O0(this.id, noteAiContentEntity.id) && OooOOO0.OooO0O0(this.summaryIdListJson, noteAiContentEntity.summaryIdListJson) && this.savedSummaryIndex == noteAiContentEntity.savedSummaryIndex && this.creationTime == noteAiContentEntity.creationTime && this.lastModificationTime == noteAiContentEntity.lastModificationTime;
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

    public final String getSummaryIdListJson() {
        return this.summaryIdListJson;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.summaryIdListJson;
        return Long.hashCode(this.lastModificationTime) + C20703o000000o.OooO0O0(C20785Oooo00o.OooO00o(this.savedSummaryIndex, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.creationTime);
    }

    public final void setSummaryIdListJson(String str) {
        this.summaryIdListJson = str;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.summaryIdListJson;
        int i = this.savedSummaryIndex;
        long j = this.creationTime;
        long j2 = this.lastModificationTime;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("NoteAiContentEntity(id=", str, ", summaryIdListJson=", str2, ", savedSummaryIndex=");
        sbOooO0O0.append(i);
        sbOooO0O0.append(", creationTime=");
        sbOooO0O0.append(j);
        return OooO0OO.OooO00o(j2, ", lastModificationTime=", ")", sbOooO0O0);
    }

    public /* synthetic */ NoteAiContentEntity(String str, String str2, int i, long j, long j2, int i2, C24018OooO0oo c24018OooO0oo) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? 0 : i, j, j2);
    }
}
