package com.orion.notein.domain.models.transactions;

import OooOO0.OooO0OO;
import OooOo.C20485OooOoO;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.huawei.hms.network.embedded.C18437z2;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0086\b\u0018\u0000 C2\u00020\u0001:\u0001CB\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u000bHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010(J¨\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020\u000b2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020\u0005HÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(¨\u0006D"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/Product;", "", "id", "", FirebaseAnalytics.Param.PRICE, "", "originPrice", RequestParameters.POSITION, "topBannerMsg", "bottomBannerMsg", "suggestion", "", "detailDescription", "name", "description", "stock", "status", FirebaseAnalytics.Param.CURRENCY, "info", C18437z2.f56754h, "<init>", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/String;", "getPrice", "()I", "getOriginPrice", "getPosition", "getTopBannerMsg", "getBottomBannerMsg", "getSuggestion", "()Z", "getDetailDescription", "getName", "getDescription", "getStock", "getStatus", "getCurrency", "getInfo", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "duration", "", "gson", "Lcom/google/gson/Gson;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/orion/notein/domain/models/transactions/Product;", "equals", "other", "hashCode", "toString", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class Product {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "Product";
    private final String bottomBannerMsg;
    private final String currency;
    private final String description;
    private final String detailDescription;
    private final String id;
    private final String info;
    private final String name;
    private final int originPrice;
    private final int position;
    private final int price;
    private final int status;
    private final int stock;
    private final boolean suggestion;
    private final String topBannerMsg;
    private final Integer type;

    @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/Product$Companion;", "", "<init>", "()V", "TAG", "", "Empty", "Lcom/orion/notein/domain/models/transactions/Product;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final Product Empty() {
            return new Product("", 0, 0, 0, "", "", false, "", "", "", 0, 0, "", null, null);
        }

        private Companion() {
        }
    }

    public Product(String id, int i, int i2, int i3, String topBannerMsg, String bottomBannerMsg, boolean z, String detailDescription, String name, String description, int i4, int i5, String currency, String str, Integer num) {
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

    public final Product copy(String id, int price, int originPrice, int position, String topBannerMsg, String bottomBannerMsg, boolean suggestion, String detailDescription, String name, String description, int stock, int status, String currency, String info, Integer type) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(topBannerMsg, "topBannerMsg");
        OooOOO0.OooO0oO(bottomBannerMsg, "bottomBannerMsg");
        OooOOO0.OooO0oO(detailDescription, "detailDescription");
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(description, "description");
        OooOOO0.OooO0oO(currency, "currency");
        return new Product(id, price, originPrice, position, topBannerMsg, bottomBannerMsg, suggestion, detailDescription, name, description, stock, status, currency, info, type);
    }

    public final long duration(Gson gson) {
        JsonObject jsonObject;
        OooOOO0.OooO0oO(gson, "gson");
        try {
            jsonObject = (JsonObject) gson.fromJson(this.info, JsonObject.class);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0(TAG);
            c20358OooO00o.OooO0OO(OooO00o.OooO00o("expireTime: parse info json failed: ", e.getMessage()), new Object[0]);
            jsonObject = null;
        }
        if (jsonObject == null) {
            return 0L;
        }
        return jsonObject.get("duration").getAsLong();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Product)) {
            return false;
        }
        Product product = (Product) other;
        return OooOOO0.OooO0O0(this.id, product.id) && this.price == product.price && this.originPrice == product.originPrice && this.position == product.position && OooOOO0.OooO0O0(this.topBannerMsg, product.topBannerMsg) && OooOOO0.OooO0O0(this.bottomBannerMsg, product.bottomBannerMsg) && this.suggestion == product.suggestion && OooOOO0.OooO0O0(this.detailDescription, product.detailDescription) && OooOOO0.OooO0O0(this.name, product.name) && OooOOO0.OooO0O0(this.description, product.description) && this.stock == product.stock && this.status == product.status && OooOOO0.OooO0O0(this.currency, product.currency) && OooOOO0.OooO0O0(this.info, product.info) && OooOOO0.OooO0O0(this.type, product.type);
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
        int iOooO0O0 = com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.status, C20785Oooo00o.OooO00o(this.stock, com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(o00000.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.position, C20785Oooo00o.OooO00o(this.originPrice, C20785Oooo00o.OooO00o(this.price, this.id.hashCode() * 31, 31), 31), 31), 31, this.topBannerMsg), 31, this.bottomBannerMsg), 31, this.suggestion), 31, this.detailDescription), 31, this.name), 31, this.description), 31), 31), 31, this.currency);
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
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "Product(id=", str, ", price=", ", originPrice=");
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
}
