package com.orion.notein.data.service.dto.transactions;

import OooOO0.OooO0OO;
import OooOo.C20485OooOoO;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.network.embedded.C18437z2;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010(J¨\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u000b2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u0005HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(¨\u0006?"}, m80612d2 = {"Lcom/orion/notein/data/service/dto/transactions/TransactionsProductDto;", "", "id", "", FirebaseAnalytics.Param.PRICE, "", "originPrice", RequestParameters.POSITION, "topBannerMsg", "bottomBannerMsg", "suggestion", "", "detailDescription", "name", "description", "stock", "status", FirebaseAnalytics.Param.CURRENCY, "info", C18437z2.f56754h, "<init>", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/String;", "getPrice", "()I", "getOriginPrice", "getPosition", "getTopBannerMsg", "getBottomBannerMsg", "getSuggestion", "()Z", "getDetailDescription", "getName", "getDescription", "getStock", "getStatus", "getCurrency", "getInfo", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/orion/notein/data/service/dto/transactions/TransactionsProductDto;", "equals", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class TransactionsProductDto {

    @SerializedName("bottom_banner_msg")
    private final String bottomBannerMsg;

    @SerializedName(FirebaseAnalytics.Param.CURRENCY)
    private final String currency;

    @SerializedName("description")
    private final String description;

    @SerializedName("detail_description")
    private final String detailDescription;

    @SerializedName("id")
    private final String id;

    @SerializedName("info")
    private final String info;

    @SerializedName("name")
    private final String name;

    @SerializedName("origin_price")
    private final int originPrice;

    @SerializedName(RequestParameters.POSITION)
    private final int position;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final int price;

    @SerializedName("status")
    private final int status;

    @SerializedName("stock")
    private final int stock;

    @SerializedName("is_suggestion")
    private final boolean suggestion;

    @SerializedName("top_banner_msg")
    private final String topBannerMsg;

    @SerializedName(C18437z2.f56754h)
    private final Integer type;

    public TransactionsProductDto() {
        this(null, 0, 0, 0, null, null, false, null, null, null, 0, 0, null, null, null, 32767, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getStock() {
        return this.stock;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getOriginPrice() {
        return this.originPrice;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTopBannerMsg() {
        return this.topBannerMsg;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBottomBannerMsg() {
        return this.bottomBannerMsg;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getSuggestion() {
        return this.suggestion;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDetailDescription() {
        return this.detailDescription;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final TransactionsProductDto copy(String id, int price, int originPrice, int position, String topBannerMsg, String bottomBannerMsg, boolean suggestion, String detailDescription, String name, String description, int stock, int status, String currency, String info, Integer type) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(topBannerMsg, "topBannerMsg");
        OooOOO0.OooO0oO(bottomBannerMsg, "bottomBannerMsg");
        OooOOO0.OooO0oO(detailDescription, "detailDescription");
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(description, "description");
        OooOOO0.OooO0oO(currency, "currency");
        return new TransactionsProductDto(id, price, originPrice, position, topBannerMsg, bottomBannerMsg, suggestion, detailDescription, name, description, stock, status, currency, info, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionsProductDto)) {
            return false;
        }
        TransactionsProductDto transactionsProductDto = (TransactionsProductDto) other;
        return OooOOO0.OooO0O0(this.id, transactionsProductDto.id) && this.price == transactionsProductDto.price && this.originPrice == transactionsProductDto.originPrice && this.position == transactionsProductDto.position && OooOOO0.OooO0O0(this.topBannerMsg, transactionsProductDto.topBannerMsg) && OooOOO0.OooO0O0(this.bottomBannerMsg, transactionsProductDto.bottomBannerMsg) && this.suggestion == transactionsProductDto.suggestion && OooOOO0.OooO0O0(this.detailDescription, transactionsProductDto.detailDescription) && OooOOO0.OooO0O0(this.name, transactionsProductDto.name) && OooOOO0.OooO0O0(this.description, transactionsProductDto.description) && this.stock == transactionsProductDto.stock && this.status == transactionsProductDto.status && OooOOO0.OooO0O0(this.currency, transactionsProductDto.currency) && OooOOO0.OooO0O0(this.info, transactionsProductDto.info) && OooOOO0.OooO0O0(this.type, transactionsProductDto.type);
    }

    public final String getBottomBannerMsg() {
        return this.bottomBannerMsg;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDetailDescription() {
        return this.detailDescription;
    }

    public final String getId() {
        return this.id;
    }

    public final String getInfo() {
        return this.info;
    }

    public final String getName() {
        return this.name;
    }

    public final int getOriginPrice() {
        return this.originPrice;
    }

    public final int getPosition() {
        return this.position;
    }

    public final int getPrice() {
        return this.price;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getStock() {
        return this.stock;
    }

    public final boolean getSuggestion() {
        return this.suggestion;
    }

    public final String getTopBannerMsg() {
        return this.topBannerMsg;
    }

    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.status, C20785Oooo00o.OooO00o(this.stock, OooO00o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(o00000.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.position, C20785Oooo00o.OooO00o(this.originPrice, C20785Oooo00o.OooO00o(this.price, this.id.hashCode() * 31, 31), 31), 31), 31, this.topBannerMsg), 31, this.bottomBannerMsg), 31, this.suggestion), 31, this.detailDescription), 31, this.name), 31, this.description), 31), 31), 31, this.currency);
        String str = this.info;
        int iHashCode = (iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.type;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        int i = this.price;
        int i2 = this.originPrice;
        int i3 = this.position;
        String str2 = this.topBannerMsg;
        String str3 = this.bottomBannerMsg;
        boolean z = this.suggestion;
        String str4 = this.detailDescription;
        String str5 = this.name;
        String str6 = this.description;
        int i4 = this.stock;
        int i5 = this.status;
        String str7 = this.currency;
        String str8 = this.info;
        Integer num = this.type;
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "TransactionsProductDto(id=", str, ", price=", ", originPrice=");
        C24472OooOoo.OooO0O0(sbOooO0OO, ", position=", ", topBannerMsg=", i2, i3);
        OooO0OO.OooO0o0(sbOooO0OO, str2, ", bottomBannerMsg=", str3, ", suggestion=");
        sbOooO0OO.append(z);
        sbOooO0OO.append(", detailDescription=");
        sbOooO0OO.append(str4);
        sbOooO0OO.append(", name=");
        OooO0OO.OooO0o0(sbOooO0OO, str5, ", description=", str6, ", stock=");
        C24472OooOoo.OooO0O0(sbOooO0OO, ", status=", ", currency=", i4, i5);
        OooO0OO.OooO0o0(sbOooO0OO, str7, ", info=", str8, ", type=");
        sbOooO0OO.append(num);
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }

    public TransactionsProductDto(String id, int i, int i2, int i3, String topBannerMsg, String bottomBannerMsg, boolean z, String detailDescription, String name, String description, int i4, int i5, String currency, String str, Integer num) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(topBannerMsg, "topBannerMsg");
        OooOOO0.OooO0oO(bottomBannerMsg, "bottomBannerMsg");
        OooOOO0.OooO0oO(detailDescription, "detailDescription");
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(description, "description");
        OooOOO0.OooO0oO(currency, "currency");
        this.id = id;
        this.price = i;
        this.originPrice = i2;
        this.position = i3;
        this.topBannerMsg = topBannerMsg;
        this.bottomBannerMsg = bottomBannerMsg;
        this.suggestion = z;
        this.detailDescription = detailDescription;
        this.name = name;
        this.description = description;
        this.stock = i4;
        this.status = i5;
        this.currency = currency;
        this.info = str;
        this.type = num;
    }

    public /* synthetic */ TransactionsProductDto(String str, int i, int i2, int i3, String str2, String str3, boolean z, String str4, String str5, String str6, int i4, int i5, String str7, String str8, Integer num, int i6, C24018OooO0oo c24018OooO0oo) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? -1 : i, (i6 & 4) != 0 ? -1 : i2, (i6 & 8) != 0 ? 0 : i3, (i6 & 16) != 0 ? "" : str2, (i6 & 32) != 0 ? "" : str3, (i6 & 64) != 0 ? false : z, (i6 & 128) != 0 ? "" : str4, (i6 & 256) != 0 ? "" : str5, (i6 & 512) != 0 ? "" : str6, (i6 & 1024) == 0 ? i4 : 0, (i6 & 2048) == 0 ? i5 : -1, (i6 & 4096) == 0 ? str7 : "", (i6 & 8192) != 0 ? null : str8, (i6 & 16384) != 0 ? null : num);
    }
}
