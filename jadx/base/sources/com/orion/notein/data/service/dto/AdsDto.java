package com.orion.notein.data.service.dto;

import OooOO0.OooO0OO;
import OooOoo0.o00000;
import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b+\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u000eHÆ\u0003Jc\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u00105\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u000eHÖ\u0001J\t\u00108\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001e\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u00069"}, m80612d2 = {"Lcom/orion/notein/data/service/dto/AdsDto;", "", "id", "", "imageUrlEnUS", "", "imageUrlZhCN", "imageUrlZhTW", "target", "visible", "", "adStartTime", "adEndTime", "period", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;I)V", "getId", "()J", "setId", "(J)V", "getImageUrlEnUS", "()Ljava/lang/String;", "setImageUrlEnUS", "(Ljava/lang/String;)V", "getImageUrlZhCN", "setImageUrlZhCN", "getImageUrlZhTW", "setImageUrlZhTW", "getTarget", "setTarget", "getVisible", "()Z", "setVisible", "(Z)V", "getAdStartTime", "setAdStartTime", "getAdEndTime", "setAdEndTime", "getPeriod", "()I", "setPeriod", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class AdsDto {

    @SerializedName("ad_end_time")
    private String adEndTime;

    @SerializedName("ad_start_time")
    private String adStartTime;

    @SerializedName("id")
    private long id;

    @SerializedName("image_url_en_US")
    private String imageUrlEnUS;

    @SerializedName("image_url_zh_CN")
    private String imageUrlZhCN;

    @SerializedName("image_url_zh_TW")
    private String imageUrlZhTW;

    @SerializedName("period")
    private int period;

    @SerializedName("target")
    private String target;

    @SerializedName("visible")
    private boolean visible;

    public AdsDto() {
        this(0L, null, null, null, null, false, null, null, 0, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public static /* synthetic */ AdsDto copy$default(AdsDto adsDto, long j, String str, String str2, String str3, String str4, boolean z, String str5, String str6, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = adsDto.id;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = adsDto.imageUrlEnUS;
        }
        String str7 = str;
        if ((i2 & 4) != 0) {
            str2 = adsDto.imageUrlZhCN;
        }
        return adsDto.copy(j2, str7, str2, (i2 & 8) != 0 ? adsDto.imageUrlZhTW : str3, (i2 & 16) != 0 ? adsDto.target : str4, (i2 & 32) != 0 ? adsDto.visible : z, (i2 & 64) != 0 ? adsDto.adStartTime : str5, (i2 & 128) != 0 ? adsDto.adEndTime : str6, (i2 & 256) != 0 ? adsDto.period : i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImageUrlEnUS() {
        return this.imageUrlEnUS;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImageUrlZhCN() {
        return this.imageUrlZhCN;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImageUrlZhTW() {
        return this.imageUrlZhTW;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAdStartTime() {
        return this.adStartTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAdEndTime() {
        return this.adEndTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getPeriod() {
        return this.period;
    }

    public final AdsDto copy(long id, String imageUrlEnUS, String imageUrlZhCN, String imageUrlZhTW, String target, boolean visible, String adStartTime, String adEndTime, int period) {
        OooOOO0.OooO0oO(imageUrlEnUS, "imageUrlEnUS");
        OooOOO0.OooO0oO(imageUrlZhCN, "imageUrlZhCN");
        OooOOO0.OooO0oO(imageUrlZhTW, "imageUrlZhTW");
        OooOOO0.OooO0oO(target, "target");
        OooOOO0.OooO0oO(adStartTime, "adStartTime");
        OooOOO0.OooO0oO(adEndTime, "adEndTime");
        return new AdsDto(id, imageUrlEnUS, imageUrlZhCN, imageUrlZhTW, target, visible, adStartTime, adEndTime, period);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdsDto)) {
            return false;
        }
        AdsDto adsDto = (AdsDto) other;
        return this.id == adsDto.id && OooOOO0.OooO0O0(this.imageUrlEnUS, adsDto.imageUrlEnUS) && OooOOO0.OooO0O0(this.imageUrlZhCN, adsDto.imageUrlZhCN) && OooOOO0.OooO0O0(this.imageUrlZhTW, adsDto.imageUrlZhTW) && OooOOO0.OooO0O0(this.target, adsDto.target) && this.visible == adsDto.visible && OooOOO0.OooO0O0(this.adStartTime, adsDto.adStartTime) && OooOOO0.OooO0O0(this.adEndTime, adsDto.adEndTime) && this.period == adsDto.period;
    }

    public final String getAdEndTime() {
        return this.adEndTime;
    }

    public final String getAdStartTime() {
        return this.adStartTime;
    }

    public final long getId() {
        return this.id;
    }

    public final String getImageUrlEnUS() {
        return this.imageUrlEnUS;
    }

    public final String getImageUrlZhCN() {
        return this.imageUrlZhCN;
    }

    public final String getImageUrlZhTW() {
        return this.imageUrlZhTW;
    }

    public final int getPeriod() {
        return this.period;
    }

    public final String getTarget() {
        return this.target;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        return Integer.hashCode(this.period) + OooO00o.OooO0O0(OooO00o.OooO0O0(o00000.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(Long.hashCode(this.id) * 31, 31, this.imageUrlEnUS), 31, this.imageUrlZhCN), 31, this.imageUrlZhTW), 31, this.target), 31, this.visible), 31, this.adStartTime), 31, this.adEndTime);
    }

    public final void setAdEndTime(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.adEndTime = str;
    }

    public final void setAdStartTime(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.adStartTime = str;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setImageUrlEnUS(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.imageUrlEnUS = str;
    }

    public final void setImageUrlZhCN(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.imageUrlZhCN = str;
    }

    public final void setImageUrlZhTW(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.imageUrlZhTW = str;
    }

    public final void setPeriod(int i) {
        this.period = i;
    }

    public final void setTarget(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.target = str;
    }

    public final void setVisible(boolean z) {
        this.visible = z;
    }

    public String toString() {
        long j = this.id;
        String str = this.imageUrlEnUS;
        String str2 = this.imageUrlZhCN;
        String str3 = this.imageUrlZhTW;
        String str4 = this.target;
        boolean z = this.visible;
        String str5 = this.adStartTime;
        String str6 = this.adEndTime;
        int i = this.period;
        StringBuilder sb = new StringBuilder("AdsDto(id=");
        sb.append(j);
        sb.append(", imageUrlEnUS=");
        sb.append(str);
        OooO0OO.OooO0o0(sb, ", imageUrlZhCN=", str2, ", imageUrlZhTW=", str3);
        sb.append(", target=");
        sb.append(str4);
        sb.append(", visible=");
        sb.append(z);
        OooO0OO.OooO0o0(sb, ", adStartTime=", str5, ", adEndTime=", str6);
        sb.append(", period=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public AdsDto(long j, String imageUrlEnUS, String imageUrlZhCN, String imageUrlZhTW, String target, boolean z, String adStartTime, String adEndTime, int i) {
        OooOOO0.OooO0oO(imageUrlEnUS, "imageUrlEnUS");
        OooOOO0.OooO0oO(imageUrlZhCN, "imageUrlZhCN");
        OooOOO0.OooO0oO(imageUrlZhTW, "imageUrlZhTW");
        OooOOO0.OooO0oO(target, "target");
        OooOOO0.OooO0oO(adStartTime, "adStartTime");
        OooOOO0.OooO0oO(adEndTime, "adEndTime");
        this.id = j;
        this.imageUrlEnUS = imageUrlEnUS;
        this.imageUrlZhCN = imageUrlZhCN;
        this.imageUrlZhTW = imageUrlZhTW;
        this.target = target;
        this.visible = z;
        this.adStartTime = adStartTime;
        this.adEndTime = adEndTime;
        this.period = i;
    }

    public /* synthetic */ AdsDto(long j, String str, String str2, String str3, String str4, boolean z, String str5, String str6, int i, int i2, C24018OooO0oo c24018OooO0oo) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? 0 : i);
    }
}
