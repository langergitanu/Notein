package com.orion.notein.data.service.dto;

import OooOO0.OooO0OO;
import OooOooo.C20785Oooo00o;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.gson.annotations.SerializedName;
import com.microsoft.identity.common.java.dto.AccountRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015JP\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\bHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, m80612d2 = {"Lcom/orion/notein/data/service/dto/CreatorDto;", "", "id", "", "name", "description", "avatarUrl", "materialCount", "", "createdAt", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;)V", "getId", "()Ljava/lang/String;", "getName", "getDescription", "getAvatarUrl", "getMaterialCount", "()I", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;)Lcom/orion/notein/data/service/dto/CreatorDto;", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class CreatorDto {

    @SerializedName(AccountRecord.SerializedNames.AVATAR_URL)
    private final String avatarUrl;

    @SerializedName("created_at")
    private final Long createdAt;
    private final String description;
    private final String id;

    @SerializedName("material_count")
    private final int materialCount;
    private final String name;

    public CreatorDto(String id, String name, String str, String str2, int i, Long l) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(name, "name");
        this.id = id;
        this.name = name;
        this.description = str;
        this.avatarUrl = str2;
        this.materialCount = i;
        this.createdAt = l;
    }

    public static /* synthetic */ CreatorDto copy$default(CreatorDto creatorDto, String str, String str2, String str3, String str4, int i, Long l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = creatorDto.id;
        }
        if ((i2 & 2) != 0) {
            str2 = creatorDto.name;
        }
        if ((i2 & 4) != 0) {
            str3 = creatorDto.description;
        }
        if ((i2 & 8) != 0) {
            str4 = creatorDto.avatarUrl;
        }
        if ((i2 & 16) != 0) {
            i = creatorDto.materialCount;
        }
        if ((i2 & 32) != 0) {
            l = creatorDto.createdAt;
        }
        int i3 = i;
        Long l2 = l;
        return creatorDto.copy(str, str2, str3, str4, i3, l2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMaterialCount() {
        return this.materialCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    public final CreatorDto copy(String id, String name, String description, String avatarUrl, int materialCount, Long createdAt) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(name, "name");
        return new CreatorDto(id, name, description, avatarUrl, materialCount, createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreatorDto)) {
            return false;
        }
        CreatorDto creatorDto = (CreatorDto) other;
        return OooOOO0.OooO0O0(this.id, creatorDto.id) && OooOOO0.OooO0O0(this.name, creatorDto.name) && OooOOO0.OooO0O0(this.description, creatorDto.description) && OooOOO0.OooO0O0(this.avatarUrl, creatorDto.avatarUrl) && this.materialCount == creatorDto.materialCount && OooOOO0.OooO0O0(this.createdAt, creatorDto.createdAt);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final Long getCreatedAt() {
        return this.createdAt;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final int getMaterialCount() {
        return this.materialCount;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.name);
        String str = this.description;
        int iHashCode = (iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatarUrl;
        int iOooO00o = C20785Oooo00o.OooO00o(this.materialCount, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Long l = this.createdAt;
        return iOooO00o + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.description;
        String str4 = this.avatarUrl;
        int i = this.materialCount;
        Long l = this.createdAt;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("CreatorDto(id=", str, ", name=", str2, ", description=");
        OooO0OO.OooO0o0(sbOooO0O0, str3, ", avatarUrl=", str4, ", materialCount=");
        sbOooO0O0.append(i);
        sbOooO0O0.append(", createdAt=");
        sbOooO0O0.append(l);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }
}
