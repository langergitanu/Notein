package com.orion.notein.domain.models;

import OooOO0.OooO0OO;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.gson.annotations.SerializedName;
import com.huawei.agconnect.credential.obs.C17625c;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.microsoft.identity.common.java.providers.oauth2.IDToken;
import com.orion.notein.global.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b$\b\u0086\b\u0018\u0000 ^2\u00020\u0001:\u0001^Bá\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u00101\u001a\u00020\u00032\u0006\u00102\u001a\u000203J\u0010\u00104\u001a\u0004\u0018\u0001052\u0006\u00102\u001a\u000203J\u0006\u00106\u001a\u00020\u0010J\u0006\u00107\u001a\u000208J\u0006\u00109\u001a\u000208J\r\u0010:\u001a\u0004\u0018\u00010;¢\u0006\u0002\u0010<J\r\u0010=\u001a\u0004\u0018\u00010;¢\u0006\u0002\u0010<J\r\u0010>\u001a\u0004\u0018\u00010;¢\u0006\u0002\u0010<J\u0006\u0010?\u001a\u000208J\u0010\u0010@\u001a\u0004\u0018\u00010\u00032\u0006\u0010A\u001a\u00020\u0003J\u0017\u0010B\u001a\u0004\u0018\u00010;2\u0006\u0010C\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010DJ\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010R\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010S\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jê\u0001\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010YJ\u0013\u0010Z\u001a\u0002082\b\u0010[\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\\\u001a\u00020\u0010HÖ\u0001J\t\u0010]\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b)\u0010'R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b*\u0010'R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001aR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001aR\u0011\u0010/\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010\u001a¨\u0006_"}, m80612d2 = {"Lcom/orion/notein/domain/models/User;", "", "id", "", "mobile", IDToken.NICKNAME, "gender", "hwOpenID", "wxOpenID", "xiaomiUnionID", "honorOpenID", "password", "region", "avatar", C17625c.f52155b, "membership", "", "offerFreeTrial", "onFreeTrial", "freeTrialStartTime", "freeTrialEndTime", "membershipStartTime", "membershipEndTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getMobile", "getNickname", "getGender", "getHwOpenID", "getWxOpenID", "getXiaomiUnionID", "getHonorOpenID", "getPassword", "getRegion", "getAvatar", "getCreationTime", "getMembership", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOfferFreeTrial", "getOnFreeTrial", "getFreeTrialStartTime", "getFreeTrialEndTime", "getMembershipStartTime", "getMembershipEndTime", CommonConstant.KEY_DISPLAY_NAME, "getDisplayName", "getMembershipTxt", "context", "Landroid/content/Context;", "getMembershipIconDrawable", "Landroid/graphics/drawable/Drawable;", "getDaysLeftInFreeTrial", "isFreeTrial", "", "isVip", "getCreationTimeMillis", "", "()Ljava/lang/Long;", "getMembershipStartTimeMillis", "getMembershipEndTimeMillis", "isForeverVip", "getFormattedMembershipEndTime", "dateFormat", "convertToMillis", "dateStr", "(Ljava/lang/String;)Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/orion/notein/domain/models/User;", "equals", "other", "hashCode", "toString", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class User {
    public static final String FEMALE = "female";
    public static final String MALE = "male";
    public static final int MEMBERSHIP_TYPE_REGISTERED = 0;
    public static final int MEMBERSHIP_TYPE_VIP = 1;
    public static final int MEMBER_TYPE_GUEST = -1;
    public static final boolean MOCK_VERIFICATION_CODE = false;

    @SerializedName("avatar")
    private final String avatar;

    @SerializedName("creation_time")
    private final String creationTime;

    @SerializedName("free_trial_end_time")
    private final String freeTrialEndTime;

    @SerializedName("free_trial_start_time")
    private final String freeTrialStartTime;

    @SerializedName("gender")
    private final String gender;

    @SerializedName("honor_open_id")
    private final String honorOpenID;

    @SerializedName("hw_open_id")
    private final String hwOpenID;

    @SerializedName("id")
    private final String id;

    @SerializedName("membership")
    private final Integer membership;

    @SerializedName("membership_end_time")
    private final String membershipEndTime;

    @SerializedName("membership_start_time")
    private final String membershipStartTime;

    @SerializedName("mobile")
    private final String mobile;

    @SerializedName("nick_name")
    private final String nickname;

    @SerializedName("offer_free_trial")
    private final Integer offerFreeTrial;

    @SerializedName("on_free_trial")
    private final Integer onFreeTrial;

    @SerializedName("password")
    private final String password;

    @SerializedName("region")
    private final String region;

    @SerializedName("wx_open_id")
    private final String wxOpenID;

    @SerializedName("xiaomi_union_id")
    private final String xiaomiUnionID;

    public User(String id, String mobile, String nickname, String gender, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Integer num3, String str9, String str10, String str11, String str12) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(mobile, "mobile");
        OooOOO0.OooO0oO(nickname, "nickname");
        OooOOO0.OooO0oO(gender, "gender");
        this.id = id;
        this.mobile = mobile;
        this.nickname = nickname;
        this.gender = gender;
        this.hwOpenID = str;
        this.wxOpenID = str2;
        this.xiaomiUnionID = str3;
        this.honorOpenID = str4;
        this.password = str5;
        this.region = str6;
        this.avatar = str7;
        this.creationTime = str8;
        this.membership = num;
        this.offerFreeTrial = num2;
        this.onFreeTrial = num3;
        this.freeTrialStartTime = str9;
        this.freeTrialEndTime = str10;
        this.membershipStartTime = str11;
        this.membershipEndTime = str12;
    }

    private final Long convertToMillis(String dateStr) throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.CHINA).parse(dateStr);
        if (date == null) {
            return null;
        }
        return Long.valueOf(date.getTime());
    }

    public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, Integer num2, Integer num3, String str13, String str14, String str15, String str16, int i, Object obj) {
        String str17;
        String str18;
        String str19 = (i & 1) != 0 ? user.id : str;
        String str20 = (i & 2) != 0 ? user.mobile : str2;
        String str21 = (i & 4) != 0 ? user.nickname : str3;
        String str22 = (i & 8) != 0 ? user.gender : str4;
        String str23 = (i & 16) != 0 ? user.hwOpenID : str5;
        String str24 = (i & 32) != 0 ? user.wxOpenID : str6;
        String str25 = (i & 64) != 0 ? user.xiaomiUnionID : str7;
        String str26 = (i & 128) != 0 ? user.honorOpenID : str8;
        String str27 = (i & 256) != 0 ? user.password : str9;
        String str28 = (i & 512) != 0 ? user.region : str10;
        String str29 = (i & 1024) != 0 ? user.avatar : str11;
        String str30 = (i & 2048) != 0 ? user.creationTime : str12;
        Integer num4 = (i & 4096) != 0 ? user.membership : num;
        Integer num5 = (i & 8192) != 0 ? user.offerFreeTrial : num2;
        String str31 = str19;
        Integer num6 = (i & 16384) != 0 ? user.onFreeTrial : num3;
        String str32 = (i & 32768) != 0 ? user.freeTrialStartTime : str13;
        String str33 = (i & 65536) != 0 ? user.freeTrialEndTime : str14;
        String str34 = (i & 131072) != 0 ? user.membershipStartTime : str15;
        if ((i & 262144) != 0) {
            str18 = str34;
            str17 = user.membershipEndTime;
        } else {
            str17 = str16;
            str18 = str34;
        }
        return user.copy(str31, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, num4, num5, num6, str32, str33, str18, str17);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getMembership() {
        return this.membership;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getOfferFreeTrial() {
        return this.offerFreeTrial;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getOnFreeTrial() {
        return this.onFreeTrial;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getFreeTrialStartTime() {
        return this.freeTrialStartTime;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getFreeTrialEndTime() {
        return this.freeTrialEndTime;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getMembershipStartTime() {
        return this.membershipStartTime;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getMembershipEndTime() {
        return this.membershipEndTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMobile() {
        return this.mobile;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHwOpenID() {
        return this.hwOpenID;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getWxOpenID() {
        return this.wxOpenID;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getXiaomiUnionID() {
        return this.xiaomiUnionID;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getHonorOpenID() {
        return this.honorOpenID;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    public final User copy(String id, String mobile, String nickname, String gender, String hwOpenID, String wxOpenID, String xiaomiUnionID, String honorOpenID, String password, String region, String avatar, String creationTime, Integer membership, Integer offerFreeTrial, Integer onFreeTrial, String freeTrialStartTime, String freeTrialEndTime, String membershipStartTime, String membershipEndTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(mobile, "mobile");
        OooOOO0.OooO0oO(nickname, "nickname");
        OooOOO0.OooO0oO(gender, "gender");
        return new User(id, mobile, nickname, gender, hwOpenID, wxOpenID, xiaomiUnionID, honorOpenID, password, region, avatar, creationTime, membership, offerFreeTrial, onFreeTrial, freeTrialStartTime, freeTrialEndTime, membershipStartTime, membershipEndTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof User)) {
            return false;
        }
        User user = (User) other;
        return OooOOO0.OooO0O0(this.id, user.id) && OooOOO0.OooO0O0(this.mobile, user.mobile) && OooOOO0.OooO0O0(this.nickname, user.nickname) && OooOOO0.OooO0O0(this.gender, user.gender) && OooOOO0.OooO0O0(this.hwOpenID, user.hwOpenID) && OooOOO0.OooO0O0(this.wxOpenID, user.wxOpenID) && OooOOO0.OooO0O0(this.xiaomiUnionID, user.xiaomiUnionID) && OooOOO0.OooO0O0(this.honorOpenID, user.honorOpenID) && OooOOO0.OooO0O0(this.password, user.password) && OooOOO0.OooO0O0(this.region, user.region) && OooOOO0.OooO0O0(this.avatar, user.avatar) && OooOOO0.OooO0O0(this.creationTime, user.creationTime) && OooOOO0.OooO0O0(this.membership, user.membership) && OooOOO0.OooO0O0(this.offerFreeTrial, user.offerFreeTrial) && OooOOO0.OooO0O0(this.onFreeTrial, user.onFreeTrial) && OooOOO0.OooO0O0(this.freeTrialStartTime, user.freeTrialStartTime) && OooOOO0.OooO0O0(this.freeTrialEndTime, user.freeTrialEndTime) && OooOOO0.OooO0O0(this.membershipStartTime, user.membershipStartTime) && OooOOO0.OooO0O0(this.membershipEndTime, user.membershipEndTime);
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getCreationTime() {
        return this.creationTime;
    }

    public final Long getCreationTimeMillis() {
        String str = this.creationTime;
        if (str != null) {
            return convertToMillis(str);
        }
        return null;
    }

    public final int getDaysLeftInFreeTrial() {
        Long lConvertToMillis;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.freeTrialEndTime;
        if (str == null || (lConvertToMillis = convertToMillis(str)) == null) {
            return 0;
        }
        long jLongValue = lConvertToMillis.longValue();
        if (jCurrentTimeMillis > jLongValue) {
            return 0;
        }
        return (int) TimeUnit.MILLISECONDS.toDays(jLongValue - jCurrentTimeMillis);
    }

    public final String getDisplayName() {
        return !C33599OooOo0O.Oooo0o0(this.nickname) ? this.nickname : !C33599OooOo0O.Oooo0o0(this.mobile) ? this.mobile : "";
    }

    public final String getFormattedMembershipEndTime(String dateFormat) {
        OooOOO0.OooO0oO(dateFormat, "dateFormat");
        try {
            Long membershipEndTimeMillis = getMembershipEndTimeMillis();
            if (membershipEndTimeMillis != null) {
                return new SimpleDateFormat(dateFormat, Locale.getDefault()).format(membershipEndTimeMillis);
            }
            return null;
        } catch (Exception unused) {
            String str = this.membershipEndTime;
            if (str != null) {
                return (String) C33599OooOo0O.OoooOO0(str, new String[]{"T"}).get(0);
            }
            return null;
        }
    }

    public final String getFreeTrialEndTime() {
        return this.freeTrialEndTime;
    }

    public final String getFreeTrialStartTime() {
        return this.freeTrialStartTime;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getHonorOpenID() {
        return this.honorOpenID;
    }

    public final String getHwOpenID() {
        return this.hwOpenID;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getMembership() {
        return this.membership;
    }

    public final String getMembershipEndTime() {
        return this.membershipEndTime;
    }

    public final Long getMembershipEndTimeMillis() {
        String str = this.membershipEndTime;
        if (str != null) {
            return convertToMillis(str);
        }
        return null;
    }

    public final Drawable getMembershipIconDrawable(Context context) {
        OooOOO0.OooO0oO(context, "context");
        Integer num = this.membership;
        if (num != null && num.intValue() == 1) {
            return context.getDrawable(R.drawable.ic_ni_vip);
        }
        return null;
    }

    public final String getMembershipStartTime() {
        return this.membershipStartTime;
    }

    public final Long getMembershipStartTimeMillis() {
        String str = this.membershipStartTime;
        if (str != null) {
            return convertToMillis(str);
        }
        return null;
    }

    public final String getMembershipTxt(Context context) {
        OooOOO0.OooO0oO(context, "context");
        Integer num = this.membership;
        if (num != null && num.intValue() == 1) {
            String string = context.getString(R.string.member_type_vip);
            OooOOO0.OooO0o(string, "getString(...)");
            return string;
        }
        if (num != null && num.intValue() == 0) {
            String string2 = context.getString(R.string.member_type_registered);
            OooOOO0.OooO0o(string2, "getString(...)");
            return string2;
        }
        String string3 = context.getString(R.string.member_type_guest);
        OooOOO0.OooO0o(string3, "getString(...)");
        return string3;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final Integer getOfferFreeTrial() {
        return this.offerFreeTrial;
    }

    public final Integer getOnFreeTrial() {
        return this.onFreeTrial;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getWxOpenID() {
        return this.wxOpenID;
    }

    public final String getXiaomiUnionID() {
        return this.xiaomiUnionID;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.mobile), 31, this.nickname), 31, this.gender);
        String str = this.hwOpenID;
        int iHashCode = (iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.wxOpenID;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.xiaomiUnionID;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.honorOpenID;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.password;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.region;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.avatar;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.creationTime;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.membership;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.offerFreeTrial;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.onFreeTrial;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str9 = this.freeTrialStartTime;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.freeTrialEndTime;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.membershipStartTime;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.membershipEndTime;
        return iHashCode14 + (str12 != null ? str12.hashCode() : 0);
    }

    public final boolean isForeverVip() {
        Long membershipStartTimeMillis = getMembershipStartTimeMillis();
        if (membershipStartTimeMillis != null) {
            long jLongValue = membershipStartTimeMillis.longValue();
            Long membershipEndTimeMillis = getMembershipEndTimeMillis();
            if (membershipEndTimeMillis != null) {
                if (TimeUnit.MILLISECONDS.toDays(membershipEndTimeMillis.longValue() - jLongValue) >= 3650) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isFreeTrial() {
        Long lConvertToMillis;
        Long lConvertToMillis2;
        Integer num;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.freeTrialStartTime;
        if (str != null && (lConvertToMillis = convertToMillis(str)) != null) {
            long jLongValue = lConvertToMillis.longValue();
            String str2 = this.freeTrialEndTime;
            if (str2 != null && (lConvertToMillis2 = convertToMillis(str2)) != null) {
                long jLongValue2 = lConvertToMillis2.longValue();
                if (jCurrentTimeMillis >= jLongValue && jCurrentTimeMillis <= jLongValue2 && (num = this.onFreeTrial) != null && num.intValue() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isVip() {
        Integer num = this.membership;
        return num != null && num.intValue() >= 1;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.mobile;
        String str3 = this.nickname;
        String str4 = this.gender;
        String str5 = this.hwOpenID;
        String str6 = this.wxOpenID;
        String str7 = this.xiaomiUnionID;
        String str8 = this.honorOpenID;
        String str9 = this.password;
        String str10 = this.region;
        String str11 = this.avatar;
        String str12 = this.creationTime;
        Integer num = this.membership;
        Integer num2 = this.offerFreeTrial;
        Integer num3 = this.onFreeTrial;
        String str13 = this.freeTrialStartTime;
        String str14 = this.freeTrialEndTime;
        String str15 = this.membershipStartTime;
        String str16 = this.membershipEndTime;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("User(id=", str, ", mobile=", str2, ", nickname=");
        OooO0OO.OooO0o0(sbOooO0O0, str3, ", gender=", str4, ", hwOpenID=");
        OooO0OO.OooO0o0(sbOooO0O0, str5, ", wxOpenID=", str6, ", xiaomiUnionID=");
        OooO0OO.OooO0o0(sbOooO0O0, str7, ", honorOpenID=", str8, ", password=");
        OooO0OO.OooO0o0(sbOooO0O0, str9, ", region=", str10, ", avatar=");
        OooO0OO.OooO0o0(sbOooO0O0, str11, ", creationTime=", str12, ", membership=");
        sbOooO0O0.append(num);
        sbOooO0O0.append(", offerFreeTrial=");
        sbOooO0O0.append(num2);
        sbOooO0O0.append(", onFreeTrial=");
        sbOooO0O0.append(num3);
        sbOooO0O0.append(", freeTrialStartTime=");
        sbOooO0O0.append(str13);
        sbOooO0O0.append(", freeTrialEndTime=");
        OooO0OO.OooO0o0(sbOooO0O0, str14, ", membershipStartTime=", str15, ", membershipEndTime=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sbOooO0O0, str16, ")");
    }

    public /* synthetic */ User(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, Integer num2, Integer num3, String str13, String str14, String str15, String str16, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? 0 : num, (i & 8192) != 0 ? null : num2, (i & 16384) != 0 ? null : num3, (i & 32768) != 0 ? null : str13, (i & 65536) != 0 ? null : str14, (i & 131072) != 0 ? null : str15, (i & 262144) != 0 ? null : str16);
    }
}
