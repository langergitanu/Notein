package com.orion.notein.domain.models.transactions;

import OooOO0.OooO0O0;
import OooOooo.C20785Oooo00o;
import OoooooO.C21445Oooo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.huawei.hms.network.embedded.C18437z2;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0001+BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0018\u001a\u00020\u0019J\r\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J[\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020\u001d2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0007HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006,"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/Coupon;", "", "id", "", CommonConstant.KEY_UID, "productCode", C18437z2.f56754h, "", "value", "status", "effectAt", "expireAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getUid", "getProductCode", "getType", "()I", "getValue", "getStatus", "getEffectAt", "getExpireAt", "getExpireAtMillis", "", "getEffectAtMillis", "()Ljava/lang/Long;", "isValid", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class Coupon {
    public static final int STATUS_UNUSED = 0;
    public static final int TYPE_CASH = 0;
    public static final int TYPE_DISCOUNT = 1;
    private final String effectAt;
    private final String expireAt;
    private final String id;
    private final String productCode;
    private final int status;
    private final int type;
    private final String uid;
    private final int value;

    public Coupon(String id, String uid, String productCode, int i, int i2, int i3, String str, String expireAt) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(uid, "uid");
        OooOOO0.OooO0oO(productCode, "productCode");
        OooOOO0.OooO0oO(expireAt, "expireAt");
        this.id = id;
        this.uid = uid;
        this.productCode = productCode;
        this.type = i;
        this.value = i2;
        this.status = i3;
        this.effectAt = str;
        this.expireAt = expireAt;
    }

    public static /* synthetic */ Coupon copy$default(Coupon coupon, String str, String str2, String str3, int i, int i2, int i3, String str4, String str5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = coupon.id;
        }
        if ((i4 & 2) != 0) {
            str2 = coupon.uid;
        }
        if ((i4 & 4) != 0) {
            str3 = coupon.productCode;
        }
        if ((i4 & 8) != 0) {
            i = coupon.type;
        }
        if ((i4 & 16) != 0) {
            i2 = coupon.value;
        }
        if ((i4 & 32) != 0) {
            i3 = coupon.status;
        }
        if ((i4 & 64) != 0) {
            str4 = coupon.effectAt;
        }
        if ((i4 & 128) != 0) {
            str5 = coupon.expireAt;
        }
        String str6 = str4;
        String str7 = str5;
        int i5 = i2;
        int i6 = i3;
        return coupon.copy(str, str2, str3, i, i5, i6, str6, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProductCode() {
        return this.productCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEffectAt() {
        return this.effectAt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getExpireAt() {
        return this.expireAt;
    }

    public final Coupon copy(String id, String uid, String productCode, int type, int value, int status, String effectAt, String expireAt) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(uid, "uid");
        OooOOO0.OooO0oO(productCode, "productCode");
        OooOOO0.OooO0oO(expireAt, "expireAt");
        return new Coupon(id, uid, productCode, type, value, status, effectAt, expireAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Coupon)) {
            return false;
        }
        Coupon coupon = (Coupon) other;
        return OooOOO0.OooO0O0(this.id, coupon.id) && OooOOO0.OooO0O0(this.uid, coupon.uid) && OooOOO0.OooO0O0(this.productCode, coupon.productCode) && this.type == coupon.type && this.value == coupon.value && this.status == coupon.status && OooOOO0.OooO0O0(this.effectAt, coupon.effectAt) && OooOOO0.OooO0O0(this.expireAt, coupon.expireAt);
    }

    public final String getEffectAt() {
        return this.effectAt;
    }

    public final Long getEffectAtMillis() throws ParseException {
        if (this.effectAt == null) {
            return null;
        }
        Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.CHINA).parse(this.effectAt);
        if (date == null) {
            return 0L;
        }
        return Long.valueOf(date.getTime());
    }

    public final String getExpireAt() {
        return this.expireAt;
    }

    public final long getExpireAtMillis() throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.CHINA).parse(this.expireAt);
        if (date == null) {
            return 0L;
        }
        return date.getTime();
    }

    public final String getId() {
        return this.id;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUid() {
        return this.uid;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        int iOooO00o = C20785Oooo00o.OooO00o(this.status, C20785Oooo00o.OooO00o(this.value, C20785Oooo00o.OooO00o(this.type, OooO00o.OooO0O0(OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.uid), 31, this.productCode), 31), 31), 31);
        String str = this.effectAt;
        return this.expireAt.hashCode() + ((iOooO00o + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isValid() throws ParseException {
        boolean z;
        boolean z2 = this.status == 0;
        if (this.effectAt == null) {
            z = true;
        } else {
            Long effectAtMillis = getEffectAtMillis();
            if ((effectAtMillis != null ? effectAtMillis.longValue() : 0L) > System.currentTimeMillis()) {
                z = false;
            }
        }
        return z2 && z && (this.expireAt != null && (getExpireAtMillis() > System.currentTimeMillis() ? 1 : (getExpireAtMillis() == System.currentTimeMillis() ? 0 : -1)) >= 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.uid;
        String str3 = this.productCode;
        int i = this.type;
        int i2 = this.value;
        int i3 = this.status;
        String str4 = this.effectAt;
        String str5 = this.expireAt;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("Coupon(id=", str, ", uid=", str2, ", productCode=");
        OooO0O0.OooO0Oo(i, str3, ", type=", ", value=", sbOooO0O0);
        C24472OooOoo.OooO0O0(sbOooO0O0, ", status=", ", effectAt=", i2, i3);
        return C21445Oooo.OooO0O0(sbOooO0O0, str4, ", expireAt=", str5, ")");
    }
}
