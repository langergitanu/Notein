package com.orion.notein.data.service.dto;

import OooOO0.OooO0OO;
import OooOooo.C20785Oooo00o;
import Oooo0oO.C21036OooOOo0;
import OoooooO.C21445Oooo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.providers.oauth2.IDToken;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bû\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\t\u0010A\u001a\u00020\u000bHÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00102J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00102J\u0010\u0010P\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00102J\u008e\u0002\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010RJ\u0013\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010V\u001a\u00020\u000bHÖ\u0001J\t\u0010W\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010 R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00103\u001a\u0004\b9\u00102R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00103\u001a\u0004\b:\u00102¨\u0006X"}, m80612d2 = {"Lcom/orion/notein/data/service/dto/MaterialDto;", "", "id", "", NoteMeta.PROPERTY_TITLE, C18437z2.f56754h, "subtype", "coverUrl", "previewUrl", "", "priceInCents", "", FirebaseAnalytics.Param.CURRENCY, "status", "entitlement", "tags", "authorName", "summary", "description", "downloadUrl", "fileSize", "", "authorId", "authorDescription", "authorAvatarUrl", "spec", "Lcom/orion/notein/data/service/dto/MaterialSpecDto;", "createdAt", "updatedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/orion/notein/data/service/dto/MaterialSpecDto;Ljava/lang/Long;Ljava/lang/Long;)V", "getId", "()Ljava/lang/String;", "getTitle", "getType", "getSubtype", "getCoverUrl", "getPreviewUrl", "()Ljava/util/List;", "getPriceInCents", "()I", "getCurrency", "getStatus", "getEntitlement", "getTags", "getAuthorName", "getSummary", "getDescription", "getDownloadUrl", "getFileSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAuthorId", "getAuthorDescription", "getAuthorAvatarUrl", "getSpec", "()Lcom/orion/notein/data/service/dto/MaterialSpecDto;", "getCreatedAt", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/orion/notein/data/service/dto/MaterialSpecDto;Ljava/lang/Long;Ljava/lang/Long;)Lcom/orion/notein/data/service/dto/MaterialDto;", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class MaterialDto {

    @SerializedName("author_avatar_url")
    private final String authorAvatarUrl;

    @SerializedName("author_description")
    private final String authorDescription;

    @SerializedName("author_id")
    private final String authorId;

    @SerializedName("author_name")
    private final String authorName;

    @SerializedName("cover_url")
    private final String coverUrl;

    @SerializedName("created_at")
    private final Long createdAt;
    private final String currency;
    private final String description;

    @SerializedName("download_url")
    private final String downloadUrl;
    private final String entitlement;

    @SerializedName("file_size")
    private final Long fileSize;
    private final String id;

    @SerializedName("preview_url")
    private final List<String> previewUrl;

    @SerializedName("price_in_cents")
    private final int priceInCents;
    private final MaterialSpecDto spec;
    private final String status;
    private final String subtype;
    private final String summary;
    private final List<String> tags;
    private final String title;
    private final String type;

    @SerializedName(IDToken.UPDATED_AT)
    private final Long updatedAt;

    public MaterialDto(String id, String title, String type, String str, String coverUrl, List<String> list, int i, String currency, String status, String entitlement, List<String> tags, String authorName, String str2, String str3, String str4, Long l, String str5, String str6, String str7, MaterialSpecDto materialSpecDto, Long l2, Long l3) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(type, "type");
        OooOOO0.OooO0oO(coverUrl, "coverUrl");
        OooOOO0.OooO0oO(currency, "currency");
        OooOOO0.OooO0oO(status, "status");
        OooOOO0.OooO0oO(entitlement, "entitlement");
        OooOOO0.OooO0oO(tags, "tags");
        OooOOO0.OooO0oO(authorName, "authorName");
        this.id = id;
        this.title = title;
        this.type = type;
        this.subtype = str;
        this.coverUrl = coverUrl;
        this.previewUrl = list;
        this.priceInCents = i;
        this.currency = currency;
        this.status = status;
        this.entitlement = entitlement;
        this.tags = tags;
        this.authorName = authorName;
        this.summary = str2;
        this.description = str3;
        this.downloadUrl = str4;
        this.fileSize = l;
        this.authorId = str5;
        this.authorDescription = str6;
        this.authorAvatarUrl = str7;
        this.spec = materialSpecDto;
        this.createdAt = l2;
        this.updatedAt = l3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MaterialDto copy$default(MaterialDto materialDto, String str, String str2, String str3, String str4, String str5, List list, int i, String str6, String str7, String str8, List list2, String str9, String str10, String str11, String str12, Long l, String str13, String str14, String str15, MaterialSpecDto materialSpecDto, Long l2, Long l3, int i2, Object obj) {
        Long l4;
        Long l5;
        String str16 = (i2 & 1) != 0 ? materialDto.id : str;
        String str17 = (i2 & 2) != 0 ? materialDto.title : str2;
        String str18 = (i2 & 4) != 0 ? materialDto.type : str3;
        String str19 = (i2 & 8) != 0 ? materialDto.subtype : str4;
        String str20 = (i2 & 16) != 0 ? materialDto.coverUrl : str5;
        List list3 = (i2 & 32) != 0 ? materialDto.previewUrl : list;
        int i3 = (i2 & 64) != 0 ? materialDto.priceInCents : i;
        String str21 = (i2 & 128) != 0 ? materialDto.currency : str6;
        String str22 = (i2 & 256) != 0 ? materialDto.status : str7;
        String str23 = (i2 & 512) != 0 ? materialDto.entitlement : str8;
        List list4 = (i2 & 1024) != 0 ? materialDto.tags : list2;
        String str24 = (i2 & 2048) != 0 ? materialDto.authorName : str9;
        String str25 = (i2 & 4096) != 0 ? materialDto.summary : str10;
        String str26 = (i2 & 8192) != 0 ? materialDto.description : str11;
        String str27 = str16;
        String str28 = (i2 & 16384) != 0 ? materialDto.downloadUrl : str12;
        Long l6 = (i2 & 32768) != 0 ? materialDto.fileSize : l;
        String str29 = (i2 & 65536) != 0 ? materialDto.authorId : str13;
        String str30 = (i2 & 131072) != 0 ? materialDto.authorDescription : str14;
        String str31 = (i2 & 262144) != 0 ? materialDto.authorAvatarUrl : str15;
        MaterialSpecDto materialSpecDto2 = (i2 & 524288) != 0 ? materialDto.spec : materialSpecDto;
        Long l7 = (i2 & 1048576) != 0 ? materialDto.createdAt : l2;
        if ((i2 & 2097152) != 0) {
            l5 = l7;
            l4 = materialDto.updatedAt;
        } else {
            l4 = l3;
            l5 = l7;
        }
        return materialDto.copy(str27, str17, str18, str19, str20, list3, i3, str21, str22, str23, list4, str24, str25, str26, str28, l6, str29, str30, str31, materialSpecDto2, l5, l4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getEntitlement() {
        return this.entitlement;
    }

    public final List<String> component11() {
        return this.tags;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAuthorName() {
        return this.authorName;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Long getFileSize() {
        return this.fileSize;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getAuthorId() {
        return this.authorId;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getAuthorDescription() {
        return this.authorDescription;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getAuthorAvatarUrl() {
        return this.authorAvatarUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final MaterialSpecDto getSpec() {
        return this.spec;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Long getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtype() {
        return this.subtype;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final List<String> component6() {
        return this.previewUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getPriceInCents() {
        return this.priceInCents;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final MaterialDto copy(String id, String title, String type, String subtype, String coverUrl, List<String> previewUrl, int priceInCents, String currency, String status, String entitlement, List<String> tags, String authorName, String summary, String description, String downloadUrl, Long fileSize, String authorId, String authorDescription, String authorAvatarUrl, MaterialSpecDto spec, Long createdAt, Long updatedAt) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(type, "type");
        OooOOO0.OooO0oO(coverUrl, "coverUrl");
        OooOOO0.OooO0oO(currency, "currency");
        OooOOO0.OooO0oO(status, "status");
        OooOOO0.OooO0oO(entitlement, "entitlement");
        OooOOO0.OooO0oO(tags, "tags");
        OooOOO0.OooO0oO(authorName, "authorName");
        return new MaterialDto(id, title, type, subtype, coverUrl, previewUrl, priceInCents, currency, status, entitlement, tags, authorName, summary, description, downloadUrl, fileSize, authorId, authorDescription, authorAvatarUrl, spec, createdAt, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MaterialDto)) {
            return false;
        }
        MaterialDto materialDto = (MaterialDto) other;
        return OooOOO0.OooO0O0(this.id, materialDto.id) && OooOOO0.OooO0O0(this.title, materialDto.title) && OooOOO0.OooO0O0(this.type, materialDto.type) && OooOOO0.OooO0O0(this.subtype, materialDto.subtype) && OooOOO0.OooO0O0(this.coverUrl, materialDto.coverUrl) && OooOOO0.OooO0O0(this.previewUrl, materialDto.previewUrl) && this.priceInCents == materialDto.priceInCents && OooOOO0.OooO0O0(this.currency, materialDto.currency) && OooOOO0.OooO0O0(this.status, materialDto.status) && OooOOO0.OooO0O0(this.entitlement, materialDto.entitlement) && OooOOO0.OooO0O0(this.tags, materialDto.tags) && OooOOO0.OooO0O0(this.authorName, materialDto.authorName) && OooOOO0.OooO0O0(this.summary, materialDto.summary) && OooOOO0.OooO0O0(this.description, materialDto.description) && OooOOO0.OooO0O0(this.downloadUrl, materialDto.downloadUrl) && OooOOO0.OooO0O0(this.fileSize, materialDto.fileSize) && OooOOO0.OooO0O0(this.authorId, materialDto.authorId) && OooOOO0.OooO0O0(this.authorDescription, materialDto.authorDescription) && OooOOO0.OooO0O0(this.authorAvatarUrl, materialDto.authorAvatarUrl) && OooOOO0.OooO0O0(this.spec, materialDto.spec) && OooOOO0.OooO0O0(this.createdAt, materialDto.createdAt) && OooOOO0.OooO0O0(this.updatedAt, materialDto.updatedAt);
    }

    public final String getAuthorAvatarUrl() {
        return this.authorAvatarUrl;
    }

    public final String getAuthorDescription() {
        return this.authorDescription;
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final Long getCreatedAt() {
        return this.createdAt;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final String getEntitlement() {
        return this.entitlement;
    }

    public final Long getFileSize() {
        return this.fileSize;
    }

    public final String getId() {
        return this.id;
    }

    public final List<String> getPreviewUrl() {
        return this.previewUrl;
    }

    public final int getPriceInCents() {
        return this.priceInCents;
    }

    public final MaterialSpecDto getSpec() {
        return this.spec;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getSubtype() {
        return this.subtype;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final Long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.title), 31, this.type);
        String str = this.subtype;
        int iOooO0O02 = OooO00o.OooO0O0((iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31, 31, this.coverUrl);
        List<String> list = this.previewUrl;
        int iOooO0O03 = OooO00o.OooO0O0(C21445Oooo.OooO00o(this.tags, OooO00o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.priceInCents, (iOooO0O02 + (list == null ? 0 : list.hashCode())) * 31, 31), 31, this.currency), 31, this.status), 31, this.entitlement), 31), 31, this.authorName);
        String str2 = this.summary;
        int iHashCode = (iOooO0O03 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.downloadUrl;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.fileSize;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str5 = this.authorId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.authorDescription;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.authorAvatarUrl;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        MaterialSpecDto materialSpecDto = this.spec;
        int iHashCode8 = (iHashCode7 + (materialSpecDto == null ? 0 : materialSpecDto.hashCode())) * 31;
        Long l2 = this.createdAt;
        int iHashCode9 = (iHashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.updatedAt;
        return iHashCode9 + (l3 != null ? l3.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.type;
        String str4 = this.subtype;
        String str5 = this.coverUrl;
        List<String> list = this.previewUrl;
        int i = this.priceInCents;
        String str6 = this.currency;
        String str7 = this.status;
        String str8 = this.entitlement;
        List<String> list2 = this.tags;
        String str9 = this.authorName;
        String str10 = this.summary;
        String str11 = this.description;
        String str12 = this.downloadUrl;
        Long l = this.fileSize;
        String str13 = this.authorId;
        String str14 = this.authorDescription;
        String str15 = this.authorAvatarUrl;
        MaterialSpecDto materialSpecDto = this.spec;
        Long l2 = this.createdAt;
        Long l3 = this.updatedAt;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("MaterialDto(id=", str, ", title=", str2, ", type=");
        OooO0OO.OooO0o0(sbOooO0O0, str3, ", subtype=", str4, ", coverUrl=");
        sbOooO0O0.append(str5);
        sbOooO0O0.append(", previewUrl=");
        sbOooO0O0.append(list);
        sbOooO0O0.append(", priceInCents=");
        C21036OooOOo0.OooO0Oo(i, ", currency=", str6, ", status=", sbOooO0O0);
        OooO0OO.OooO0o0(sbOooO0O0, str7, ", entitlement=", str8, ", tags=");
        sbOooO0O0.append(list2);
        sbOooO0O0.append(", authorName=");
        sbOooO0O0.append(str9);
        sbOooO0O0.append(", summary=");
        OooO0OO.OooO0o0(sbOooO0O0, str10, ", description=", str11, ", downloadUrl=");
        sbOooO0O0.append(str12);
        sbOooO0O0.append(", fileSize=");
        sbOooO0O0.append(l);
        sbOooO0O0.append(", authorId=");
        OooO0OO.OooO0o0(sbOooO0O0, str13, ", authorDescription=", str14, ", authorAvatarUrl=");
        sbOooO0O0.append(str15);
        sbOooO0O0.append(", spec=");
        sbOooO0O0.append(materialSpecDto);
        sbOooO0O0.append(", createdAt=");
        sbOooO0O0.append(l2);
        sbOooO0O0.append(", updatedAt=");
        sbOooO0O0.append(l3);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    public /* synthetic */ MaterialDto(String str, String str2, String str3, String str4, String str5, List list, int i, String str6, String str7, String str8, List list2, String str9, String str10, String str11, String str12, Long l, String str13, String str14, String str15, MaterialSpecDto materialSpecDto, Long l2, Long l3, int i2, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, str3, (i2 & 8) != 0 ? null : str4, str5, (i2 & 32) != 0 ? null : list, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? "CNY" : str6, (i2 & 256) != 0 ? AppMeasurementSdk.ConditionalUserProperty.ACTIVE : str7, str8, (i2 & 1024) != 0 ? C34434OooOoO.f123453OooOo0o : list2, str9, (i2 & 4096) != 0 ? null : str10, (i2 & 8192) != 0 ? null : str11, (i2 & 16384) != 0 ? null : str12, (32768 & i2) != 0 ? null : l, (65536 & i2) != 0 ? null : str13, (131072 & i2) != 0 ? null : str14, (262144 & i2) != 0 ? null : str15, (524288 & i2) != 0 ? null : materialSpecDto, (1048576 & i2) != 0 ? null : l2, (i2 & 2097152) != 0 ? null : l3);
    }
}
