package com.orion.notein.data.service.dto;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016JH\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\nHÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, m80612d2 = {"Lcom/orion/notein/data/service/dto/DownloadPermissionDto;", "", "allowed", "", "downloadUrl", "", "fileSizeBytes", "", "reason", "priceCents", "", "<init>", "(ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)V", "getAllowed", "()Z", "getDownloadUrl", "()Ljava/lang/String;", "getFileSizeBytes", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getReason", "getPriceCents", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)Lcom/orion/notein/data/service/dto/DownloadPermissionDto;", "equals", "other", "hashCode", "toString", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class DownloadPermissionDto {
    public static final String REASON_PURCHASE_REQUIRED = "PURCHASE_REQUIRED";
    public static final String REASON_VIP_REQUIRED = "VIP_REQUIRED";
    private final boolean allowed;

    @SerializedName("download_url")
    private final String downloadUrl;

    @SerializedName("file_size_bytes")
    private final Long fileSizeBytes;

    @SerializedName("price_cents")
    private final Integer priceCents;
    private final String reason;

    public DownloadPermissionDto(boolean z, String str, Long l, String str2, Integer num) {
        this.allowed = z;
        this.downloadUrl = str;
        this.fileSizeBytes = l;
        this.reason = str2;
        this.priceCents = num;
    }

    public static /* synthetic */ DownloadPermissionDto copy$default(DownloadPermissionDto downloadPermissionDto, boolean z, String str, Long l, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = downloadPermissionDto.allowed;
        }
        if ((i & 2) != 0) {
            str = downloadPermissionDto.downloadUrl;
        }
        if ((i & 4) != 0) {
            l = downloadPermissionDto.fileSizeBytes;
        }
        if ((i & 8) != 0) {
            str2 = downloadPermissionDto.reason;
        }
        if ((i & 16) != 0) {
            num = downloadPermissionDto.priceCents;
        }
        Integer num2 = num;
        Long l2 = l;
        return downloadPermissionDto.copy(z, str, l2, str2, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAllowed() {
        return this.allowed;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getFileSizeBytes() {
        return this.fileSizeBytes;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getPriceCents() {
        return this.priceCents;
    }

    public final DownloadPermissionDto copy(boolean allowed, String downloadUrl, Long fileSizeBytes, String reason, Integer priceCents) {
        return new DownloadPermissionDto(allowed, downloadUrl, fileSizeBytes, reason, priceCents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadPermissionDto)) {
            return false;
        }
        DownloadPermissionDto downloadPermissionDto = (DownloadPermissionDto) other;
        return this.allowed == downloadPermissionDto.allowed && OooOOO0.OooO0O0(this.downloadUrl, downloadPermissionDto.downloadUrl) && OooOOO0.OooO0O0(this.fileSizeBytes, downloadPermissionDto.fileSizeBytes) && OooOOO0.OooO0O0(this.reason, downloadPermissionDto.reason) && OooOOO0.OooO0O0(this.priceCents, downloadPermissionDto.priceCents);
    }

    public final boolean getAllowed() {
        return this.allowed;
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final Long getFileSizeBytes() {
        return this.fileSizeBytes;
    }

    public final Integer getPriceCents() {
        return this.priceCents;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.allowed) * 31;
        String str = this.downloadUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.fileSizeBytes;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.reason;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.priceCents;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "DownloadPermissionDto(allowed=" + this.allowed + ", downloadUrl=" + this.downloadUrl + ", fileSizeBytes=" + this.fileSizeBytes + ", reason=" + this.reason + ", priceCents=" + this.priceCents + ")";
    }

    public /* synthetic */ DownloadPermissionDto(boolean z, String str, Long l, String str2, Integer num, int i, C24018OooO0oo c24018OooO0oo) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num);
    }
}
