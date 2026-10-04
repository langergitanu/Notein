package com.orion.notein.domain.models.transactions;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/TransactionsProductResult;", "", "productList", "", "Lcom/orion/notein/domain/models/transactions/Product;", "errCode", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getProductList", "()Ljava/util/List;", "getErrCode", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class TransactionsProductResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String errCode;
    private final List<Product> productList;

    @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/TransactionsProductResult$Companion;", "", "<init>", "()V", "Error", "Lcom/orion/notein/domain/models/transactions/TransactionsProductResult;", "errCode", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public static /* synthetic */ TransactionsProductResult Error$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = TransactionsConstants.ERROR_CODE_INTERNAL;
            }
            return companion.Error(str);
        }

        public final TransactionsProductResult Error(String errCode) {
            OooOOO0.OooO0oO(errCode, "errCode");
            return new TransactionsProductResult(C34434OooOoO.f123453OooOo0o, errCode);
        }

        private Companion() {
        }
    }

    public TransactionsProductResult(List<Product> productList, String errCode) {
        OooOOO0.OooO0oO(productList, "productList");
        OooOOO0.OooO0oO(errCode, "errCode");
        this.productList = productList;
        this.errCode = errCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransactionsProductResult copy$default(TransactionsProductResult transactionsProductResult, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = transactionsProductResult.productList;
        }
        if ((i & 2) != 0) {
            str = transactionsProductResult.errCode;
        }
        return transactionsProductResult.copy(list, str);
    }

    public final List<Product> component1() {
        return this.productList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrCode() {
        return this.errCode;
    }

    public final TransactionsProductResult copy(List<Product> productList, String errCode) {
        OooOOO0.OooO0oO(productList, "productList");
        OooOOO0.OooO0oO(errCode, "errCode");
        return new TransactionsProductResult(productList, errCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionsProductResult)) {
            return false;
        }
        TransactionsProductResult transactionsProductResult = (TransactionsProductResult) other;
        return OooOOO0.OooO0O0(this.productList, transactionsProductResult.productList) && OooOOO0.OooO0O0(this.errCode, transactionsProductResult.errCode);
    }

    public final String getErrCode() {
        return this.errCode;
    }

    public final List<Product> getProductList() {
        return this.productList;
    }

    public int hashCode() {
        return this.errCode.hashCode() + (this.productList.hashCode() * 31);
    }

    public String toString() {
        return "TransactionsProductResult(productList=" + this.productList + ", errCode=" + this.errCode + ")";
    }
}
