package com.orion.notein.domain.models.translate;

import OooOO0.OooO0OO;
import OoooooO.C21445Oooo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J_\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006%"}, m80612d2 = {"Lcom/orion/notein/domain/models/translate/TranslateResult;", "", Constants.MessagePayloadKeys.FROM, "", "to", "src", "dst", "dict", "srcTts", "dstTts", "errorCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFrom", "()Ljava/lang/String;", "getTo", "getSrc", "getDst", "getDict", "getSrcTts", "getDstTts", "getErrorCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class TranslateResult {
    private final String dict;
    private final String dst;
    private final String dstTts;
    private final String errorCode;
    private final String from;
    private final String src;
    private final String srcTts;
    private final String to;

    public TranslateResult(String from, String to, String src, String dst, String str, String str2, String str3, String errorCode) {
        OooOOO0.OooO0oO(from, "from");
        OooOOO0.OooO0oO(to, "to");
        OooOOO0.OooO0oO(src, "src");
        OooOOO0.OooO0oO(dst, "dst");
        OooOOO0.OooO0oO(errorCode, "errorCode");
        this.from = from;
        this.to = to;
        this.src = src;
        this.dst = dst;
        this.dict = str;
        this.srcTts = str2;
        this.dstTts = str3;
        this.errorCode = errorCode;
    }

    public static /* synthetic */ TranslateResult copy$default(TranslateResult translateResult, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = translateResult.from;
        }
        if ((i & 2) != 0) {
            str2 = translateResult.to;
        }
        if ((i & 4) != 0) {
            str3 = translateResult.src;
        }
        if ((i & 8) != 0) {
            str4 = translateResult.dst;
        }
        if ((i & 16) != 0) {
            str5 = translateResult.dict;
        }
        if ((i & 32) != 0) {
            str6 = translateResult.srcTts;
        }
        if ((i & 64) != 0) {
            str7 = translateResult.dstTts;
        }
        if ((i & 128) != 0) {
            str8 = translateResult.errorCode;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return translateResult.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSrc() {
        return this.src;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDst() {
        return this.dst;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDict() {
        return this.dict;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSrcTts() {
        return this.srcTts;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDstTts() {
        return this.dstTts;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    public final TranslateResult copy(String from, String to, String src, String dst, String dict, String srcTts, String dstTts, String errorCode) {
        OooOOO0.OooO0oO(from, "from");
        OooOOO0.OooO0oO(to, "to");
        OooOOO0.OooO0oO(src, "src");
        OooOOO0.OooO0oO(dst, "dst");
        OooOOO0.OooO0oO(errorCode, "errorCode");
        return new TranslateResult(from, to, src, dst, dict, srcTts, dstTts, errorCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TranslateResult)) {
            return false;
        }
        TranslateResult translateResult = (TranslateResult) other;
        return OooOOO0.OooO0O0(this.from, translateResult.from) && OooOOO0.OooO0O0(this.to, translateResult.to) && OooOOO0.OooO0O0(this.src, translateResult.src) && OooOOO0.OooO0O0(this.dst, translateResult.dst) && OooOOO0.OooO0O0(this.dict, translateResult.dict) && OooOOO0.OooO0O0(this.srcTts, translateResult.srcTts) && OooOOO0.OooO0O0(this.dstTts, translateResult.dstTts) && OooOOO0.OooO0O0(this.errorCode, translateResult.errorCode);
    }

    public final String getDict() {
        return this.dict;
    }

    public final String getDst() {
        return this.dst;
    }

    public final String getDstTts() {
        return this.dstTts;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getSrc() {
        return this.src;
    }

    public final String getSrcTts() {
        return this.srcTts;
    }

    public final String getTo() {
        return this.to;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(this.from.hashCode() * 31, 31, this.to), 31, this.src), 31, this.dst);
        String str = this.dict;
        int iHashCode = (iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.srcTts;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dstTts;
        return this.errorCode.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.from;
        String str2 = this.to;
        String str3 = this.src;
        String str4 = this.dst;
        String str5 = this.dict;
        String str6 = this.srcTts;
        String str7 = this.dstTts;
        String str8 = this.errorCode;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("TranslateResult(from=", str, ", to=", str2, ", src=");
        OooO0OO.OooO0o0(sbOooO0O0, str3, ", dst=", str4, ", dict=");
        OooO0OO.OooO0o0(sbOooO0O0, str5, ", srcTts=", str6, ", dstTts=");
        return C21445Oooo.OooO0O0(sbOooO0O0, str7, ", errorCode=", str8, ")");
    }
}
