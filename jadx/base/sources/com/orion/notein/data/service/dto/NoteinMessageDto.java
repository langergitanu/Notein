package com.orion.notein.data.service.dto;

import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.huawei.agconnect.credential.obs.C17625c;
import com.huawei.hms.network.embedded.C18437z2;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34436OooOoOO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J_\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\nHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\"\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m80612d2 = {"Lcom/orion/notein/data/service/dto/NoteinMessageDto;", "", "id", "", CommonConstant.KEY_UID, NoteMeta.PROPERTY_TITLE, "", FirebaseAnalytics.Param.CONTENT, C17625c.f52155b, C18437z2.f56754h, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getUid", "getTitle", "()Ljava/util/Map;", "getContent", "getCreationTime", "getType", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NoteinMessageDto {

    @SerializedName(FirebaseAnalytics.Param.CONTENT)
    private final Map<String, String> content;

    @SerializedName("creation_time")
    private final String creationTime;

    @SerializedName("id")
    private final String id;

    @SerializedName(NoteMeta.PROPERTY_TITLE)
    private final Map<String, String> title;

    @SerializedName(C18437z2.f56754h)
    private final int type;

    @SerializedName("target_uid")
    private final String uid;

    public NoteinMessageDto() {
        this(null, null, null, null, null, 0, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NoteinMessageDto copy$default(NoteinMessageDto noteinMessageDto, String str, String str2, Map map, Map map2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = noteinMessageDto.id;
        }
        if ((i2 & 2) != 0) {
            str2 = noteinMessageDto.uid;
        }
        if ((i2 & 4) != 0) {
            map = noteinMessageDto.title;
        }
        if ((i2 & 8) != 0) {
            map2 = noteinMessageDto.content;
        }
        if ((i2 & 16) != 0) {
            str3 = noteinMessageDto.creationTime;
        }
        if ((i2 & 32) != 0) {
            i = noteinMessageDto.type;
        }
        String str4 = str3;
        int i3 = i;
        return noteinMessageDto.copy(str, str2, map, map2, str4, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    public final Map<String, String> component3() {
        return this.title;
    }

    public final Map<String, String> component4() {
        return this.content;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final NoteinMessageDto copy(String id, String uid, Map<String, String> title, Map<String, String> content, String creationTime, int type) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(content, "content");
        OooOOO0.OooO0oO(creationTime, "creationTime");
        return new NoteinMessageDto(id, uid, title, content, creationTime, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteinMessageDto)) {
            return false;
        }
        NoteinMessageDto noteinMessageDto = (NoteinMessageDto) other;
        return OooOOO0.OooO0O0(this.id, noteinMessageDto.id) && OooOOO0.OooO0O0(this.uid, noteinMessageDto.uid) && OooOOO0.OooO0O0(this.title, noteinMessageDto.title) && OooOOO0.OooO0O0(this.content, noteinMessageDto.content) && OooOOO0.OooO0O0(this.creationTime, noteinMessageDto.creationTime) && this.type == noteinMessageDto.type;
    }

    public final Map<String, String> getContent() {
        return this.content;
    }

    public final String getCreationTime() {
        return this.creationTime;
    }

    public final String getId() {
        return this.id;
    }

    public final Map<String, String> getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.uid;
        return Integer.hashCode(this.type) + OooO00o.OooO0O0((this.content.hashCode() + ((this.title.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.creationTime);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.uid;
        Map<String, String> map = this.title;
        Map<String, String> map2 = this.content;
        String str3 = this.creationTime;
        int i = this.type;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("NoteinMessageDto(id=", str, ", uid=", str2, ", title=");
        sbOooO0O0.append(map);
        sbOooO0O0.append(", content=");
        sbOooO0O0.append(map2);
        sbOooO0O0.append(", creationTime=");
        sbOooO0O0.append(str3);
        sbOooO0O0.append(", type=");
        sbOooO0O0.append(i);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    public NoteinMessageDto(String id, String str, Map<String, String> title, Map<String, String> content, String creationTime, int i) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(content, "content");
        OooOOO0.OooO0oO(creationTime, "creationTime");
        this.id = id;
        this.uid = str;
        this.title = title;
        this.content = content;
        this.creationTime = creationTime;
        this.type = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NoteinMessageDto(String str, String str2, Map map, Map map2, String str3, int i, int i2, C24018OooO0oo c24018OooO0oo) {
        str = (i2 & 1) != 0 ? "" : str;
        str2 = (i2 & 2) != 0 ? null : str2;
        int i3 = i2 & 4;
        C34436OooOoOO c34436OooOoOO = C34436OooOoOO.f123455OooOo0o;
        this(str, str2, i3 != 0 ? c34436OooOoOO : map, (i2 & 8) != 0 ? c34436OooOoOO : map2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? -1 : i);
    }
}
