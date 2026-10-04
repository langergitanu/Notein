package com.orion.notein.data.p602db.entity;

import OooOO0.OooO0OO;
import OooOo.C20485OooOoO;
import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import android.os.Bundle;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/AiOcrTextPageEntity;", "", "id", "", "sourceType", "", "sourceUri", FirebaseAnalytics.Param.CONTENT, C17625c.f52155b, "", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "extras", "Landroid/os/Bundle;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V", "getId", "()Ljava/lang/String;", "getSourceType", "()I", "getSourceUri", "getContent", "getCreationTime", "()J", "getLastModificationTime", "getExtras", "()Landroid/os/Bundle;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class AiOcrTextPageEntity {
    private final String content;
    private final long creationTime;
    private final Bundle extras;
    private final String id;
    private final long lastModificationTime;
    private final int sourceType;
    private final String sourceUri;

    public AiOcrTextPageEntity(String id, int i, String sourceUri, String content, long j, long j2, Bundle extras) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(sourceUri, "sourceUri");
        OooOOO0.OooO0oO(content, "content");
        OooOOO0.OooO0oO(extras, "extras");
        this.id = id;
        this.sourceType = i;
        this.sourceUri = sourceUri;
        this.content = content;
        this.creationTime = j;
        this.lastModificationTime = j2;
        this.extras = extras;
    }

    public static /* synthetic */ AiOcrTextPageEntity copy$default(AiOcrTextPageEntity aiOcrTextPageEntity, String str, int i, String str2, String str3, long j, long j2, Bundle bundle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aiOcrTextPageEntity.id;
        }
        if ((i2 & 2) != 0) {
            i = aiOcrTextPageEntity.sourceType;
        }
        if ((i2 & 4) != 0) {
            str2 = aiOcrTextPageEntity.sourceUri;
        }
        if ((i2 & 8) != 0) {
            str3 = aiOcrTextPageEntity.content;
        }
        if ((i2 & 16) != 0) {
            j = aiOcrTextPageEntity.creationTime;
        }
        if ((i2 & 32) != 0) {
            j2 = aiOcrTextPageEntity.lastModificationTime;
        }
        if ((i2 & 64) != 0) {
            bundle = aiOcrTextPageEntity.extras;
        }
        Bundle bundle2 = bundle;
        long j3 = j2;
        long j4 = j;
        return aiOcrTextPageEntity.copy(str, i, str2, str3, j4, j3, bundle2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSourceType() {
        return this.sourceType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSourceUri() {
        return this.sourceUri;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Bundle getExtras() {
        return this.extras;
    }

    public final AiOcrTextPageEntity copy(String id, int sourceType, String sourceUri, String content, long creationTime, long lastModificationTime, Bundle extras) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(sourceUri, "sourceUri");
        OooOOO0.OooO0oO(content, "content");
        OooOOO0.OooO0oO(extras, "extras");
        return new AiOcrTextPageEntity(id, sourceType, sourceUri, content, creationTime, lastModificationTime, extras);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiOcrTextPageEntity)) {
            return false;
        }
        AiOcrTextPageEntity aiOcrTextPageEntity = (AiOcrTextPageEntity) other;
        return OooOOO0.OooO0O0(this.id, aiOcrTextPageEntity.id) && this.sourceType == aiOcrTextPageEntity.sourceType && OooOOO0.OooO0O0(this.sourceUri, aiOcrTextPageEntity.sourceUri) && OooOOO0.OooO0O0(this.content, aiOcrTextPageEntity.content) && this.creationTime == aiOcrTextPageEntity.creationTime && this.lastModificationTime == aiOcrTextPageEntity.lastModificationTime && OooOOO0.OooO0O0(this.extras, aiOcrTextPageEntity.extras);
    }

    public final String getContent() {
        return this.content;
    }

    public final long getCreationTime() {
        return this.creationTime;
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

    public final int getSourceType() {
        return this.sourceType;
    }

    public final String getSourceUri() {
        return this.sourceUri;
    }

    public int hashCode() {
        return this.extras.hashCode() + C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.sourceType, this.id.hashCode() * 31, 31), 31, this.sourceUri), 31, this.content), 31, this.creationTime), 31, this.lastModificationTime);
    }

    public String toString() {
        String str = this.id;
        int i = this.sourceType;
        String str2 = this.sourceUri;
        String str3 = this.content;
        long j = this.creationTime;
        long j2 = this.lastModificationTime;
        Bundle bundle = this.extras;
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "AiOcrTextPageEntity(id=", str, ", sourceType=", ", sourceUri=");
        OooO0OO.OooO0o0(sbOooO0OO, str2, ", content=", str3, ", creationTime=");
        sbOooO0OO.append(j);
        C22205OooOOo.OooO0OO(j2, ", lastModificationTime=", ", extras=", sbOooO0OO);
        sbOooO0OO.append(bundle);
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }
}
