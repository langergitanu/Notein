package com.orion.notein.data.p602db.entity;

import OooOoo0.C20703o000000o;
import OoooooO.C21445Oooo;
import com.aspose.slides.internal.p332p7.OooO;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.facebook.soloader.OooO0OO;
import com.hihonor.honorid.core.data.TmemberRight;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003JW\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006("}, m80612d2 = {"Lcom/orion/notein/data/db/entity/AiOcrSessionEntity;", "", "id", "", NoteMeta.PROPERTY_TITLE, TmemberRight.TAG_USERID, "pageIds", "", "inputSourceJson", C17625c.f52155b, "", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JJ)V", "getId", "()Ljava/lang/String;", "getTitle", "getUserId", "getPageIds", "()Ljava/util/List;", "getInputSourceJson", "setInputSourceJson", "(Ljava/lang/String;)V", "getCreationTime", "()J", "getLastModificationTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class AiOcrSessionEntity {
    private final long creationTime;
    private final String id;
    private String inputSourceJson;
    private final long lastModificationTime;
    private final List<String> pageIds;
    private final String title;
    private final String userId;

    public AiOcrSessionEntity(String id, String title, String userId, List<String> pageIds, String str, long j, long j2) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(userId, "userId");
        OooOOO0.OooO0oO(pageIds, "pageIds");
        this.id = id;
        this.title = title;
        this.userId = userId;
        this.pageIds = pageIds;
        this.inputSourceJson = str;
        this.creationTime = j;
        this.lastModificationTime = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AiOcrSessionEntity copy$default(AiOcrSessionEntity aiOcrSessionEntity, String str, String str2, String str3, List list, String str4, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aiOcrSessionEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = aiOcrSessionEntity.title;
        }
        if ((i & 4) != 0) {
            str3 = aiOcrSessionEntity.userId;
        }
        if ((i & 8) != 0) {
            list = aiOcrSessionEntity.pageIds;
        }
        if ((i & 16) != 0) {
            str4 = aiOcrSessionEntity.inputSourceJson;
        }
        if ((i & 32) != 0) {
            j = aiOcrSessionEntity.creationTime;
        }
        if ((i & 64) != 0) {
            j2 = aiOcrSessionEntity.lastModificationTime;
        }
        long j3 = j2;
        long j4 = j;
        String str5 = str4;
        String str6 = str3;
        return aiOcrSessionEntity.copy(str, str2, str6, list, str5, j4, j3);
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
    public final String getUserId() {
        return this.userId;
    }

    public final List<String> component4() {
        return this.pageIds;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getInputSourceJson() {
        return this.inputSourceJson;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final AiOcrSessionEntity copy(String id, String title, String userId, List<String> pageIds, String inputSourceJson, long creationTime, long lastModificationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(userId, "userId");
        OooOOO0.OooO0oO(pageIds, "pageIds");
        return new AiOcrSessionEntity(id, title, userId, pageIds, inputSourceJson, creationTime, lastModificationTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiOcrSessionEntity)) {
            return false;
        }
        AiOcrSessionEntity aiOcrSessionEntity = (AiOcrSessionEntity) other;
        return OooOOO0.OooO0O0(this.id, aiOcrSessionEntity.id) && OooOOO0.OooO0O0(this.title, aiOcrSessionEntity.title) && OooOOO0.OooO0O0(this.userId, aiOcrSessionEntity.userId) && OooOOO0.OooO0O0(this.pageIds, aiOcrSessionEntity.pageIds) && OooOOO0.OooO0O0(this.inputSourceJson, aiOcrSessionEntity.inputSourceJson) && this.creationTime == aiOcrSessionEntity.creationTime && this.lastModificationTime == aiOcrSessionEntity.lastModificationTime;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final String getId() {
        return this.id;
    }

    public final String getInputSourceJson() {
        return this.inputSourceJson;
    }

    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final List<String> getPageIds() {
        return this.pageIds;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iOooO00o = C21445Oooo.OooO00o(this.pageIds, OooO00o.OooO0O0(OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.title), 31, this.userId), 31);
        String str = this.inputSourceJson;
        return Long.hashCode(this.lastModificationTime) + C20703o000000o.OooO0O0((iOooO00o + (str == null ? 0 : str.hashCode())) * 31, 31, this.creationTime);
    }

    public final void setInputSourceJson(String str) {
        this.inputSourceJson = str;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.userId;
        List<String> list = this.pageIds;
        String str4 = this.inputSourceJson;
        long j = this.creationTime;
        long j2 = this.lastModificationTime;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("AiOcrSessionEntity(id=", str, ", title=", str2, ", userId=");
        sbOooO0O0.append(str3);
        sbOooO0O0.append(", pageIds=");
        sbOooO0O0.append(list);
        sbOooO0O0.append(", inputSourceJson=");
        OooO.OooO00o(j, str4, ", creationTime=", sbOooO0O0);
        return OooO0OO.OooO00o(j2, ", lastModificationTime=", ")", sbOooO0O0);
    }

    public /* synthetic */ AiOcrSessionEntity(String str, String str2, String str3, List list, String str4, long j, long j2, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, str3, list, (i & 16) != 0 ? null : str4, j, j2);
    }
}
