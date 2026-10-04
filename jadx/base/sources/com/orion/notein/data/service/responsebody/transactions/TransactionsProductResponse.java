package com.orion.notein.data.service.responsebody.transactions;

import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.gson.annotations.SerializedName;
import com.orion.notein.data.service.dto.transactions.TransactionsProductDto;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J-\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, m80612d2 = {"Lcom/orion/notein/data/service/responsebody/transactions/TransactionsProductResponse;", "", "products", "", "Lcom/orion/notein/data/service/dto/transactions/TransactionsProductDto;", "errorCode", "", "errorMsg", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getProducts", "()Ljava/util/List;", "getErrorCode", "()Ljava/lang/String;", "setErrorCode", "(Ljava/lang/String;)V", "getErrorMsg", "setErrorMsg", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class TransactionsProductResponse {

    @SerializedName("error_code")
    private String errorCode;

    @SerializedName("error_msg")
    private String errorMsg;

    @SerializedName("product")
    private final List<TransactionsProductDto> products;

    public TransactionsProductResponse(List<TransactionsProductDto> products, String errorCode, String errorMsg) {
        OooOOO0.OooO0oO(products, "products");
        OooOOO0.OooO0oO(errorCode, "errorCode");
        OooOOO0.OooO0oO(errorMsg, "errorMsg");
        this.products = products;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransactionsProductResponse copy$default(TransactionsProductResponse transactionsProductResponse, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = transactionsProductResponse.products;
        }
        if ((i & 2) != 0) {
            str = transactionsProductResponse.errorCode;
        }
        if ((i & 4) != 0) {
            str2 = transactionsProductResponse.errorMsg;
        }
        return transactionsProductResponse.copy(list, str, str2);
    }

    public final List<TransactionsProductDto> component1() {
        return this.products;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final TransactionsProductResponse copy(List<TransactionsProductDto> products, String errorCode, String errorMsg) {
        OooOOO0.OooO0oO(products, "products");
        OooOOO0.OooO0oO(errorCode, "errorCode");
        OooOOO0.OooO0oO(errorMsg, "errorMsg");
        return new TransactionsProductResponse(products, errorCode, errorMsg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionsProductResponse)) {
            return false;
        }
        TransactionsProductResponse transactionsProductResponse = (TransactionsProductResponse) other;
        return OooOOO0.OooO0O0(this.products, transactionsProductResponse.products) && OooOOO0.OooO0O0(this.errorCode, transactionsProductResponse.errorCode) && OooOOO0.OooO0O0(this.errorMsg, transactionsProductResponse.errorMsg);
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final List<TransactionsProductDto> getProducts() {
        return this.products;
    }

    public int hashCode() {
        return this.errorMsg.hashCode() + OooO00o.OooO0O0(this.products.hashCode() * 31, 31, this.errorCode);
    }

    public final void setErrorCode(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.errorCode = str;
    }

    public final void setErrorMsg(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.errorMsg = str;
    }

    public String toString() {
        List<TransactionsProductDto> list = this.products;
        String str = this.errorCode;
        String str2 = this.errorMsg;
        StringBuilder sb = new StringBuilder("TransactionsProductResponse(products=");
        sb.append(list);
        sb.append(", errorCode=");
        sb.append(str);
        sb.append(", errorMsg=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, str2, ")");
    }
}
