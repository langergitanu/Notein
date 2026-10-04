package com.orion.notein.domain.models.transactions;

import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/TransactionsOrderResult;", "", "order", "Lcom/orion/notein/domain/models/transactions/Order;", "errCode", "", "<init>", "(Lcom/orion/notein/domain/models/transactions/Order;Ljava/lang/String;)V", "getOrder", "()Lcom/orion/notein/domain/models/transactions/Order;", "getErrCode", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class TransactionsOrderResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String errCode;
    private final Order order;

    @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/TransactionsOrderResult$Companion;", "", "<init>", "()V", "Error", "Lcom/orion/notein/domain/models/transactions/TransactionsOrderResult;", "errCode", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public static /* synthetic */ TransactionsOrderResult Error$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = TransactionsConstants.ERROR_CODE_INTERNAL;
            }
            return companion.Error(str);
        }

        public final TransactionsOrderResult Error(String errCode) {
            OooOOO0.OooO0oO(errCode, "errCode");
            return new TransactionsOrderResult(null, errCode);
        }

        private Companion() {
        }
    }

    public TransactionsOrderResult(Order order, String errCode) {
        OooOOO0.OooO0oO(errCode, "errCode");
        this.order = order;
        this.errCode = errCode;
    }

    public static /* synthetic */ TransactionsOrderResult copy$default(TransactionsOrderResult transactionsOrderResult, Order order, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            order = transactionsOrderResult.order;
        }
        if ((i & 2) != 0) {
            str = transactionsOrderResult.errCode;
        }
        return transactionsOrderResult.copy(order, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Order getOrder() {
        return this.order;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrCode() {
        return this.errCode;
    }

    public final TransactionsOrderResult copy(Order order, String errCode) {
        OooOOO0.OooO0oO(errCode, "errCode");
        return new TransactionsOrderResult(order, errCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionsOrderResult)) {
            return false;
        }
        TransactionsOrderResult transactionsOrderResult = (TransactionsOrderResult) other;
        return OooOOO0.OooO0O0(this.order, transactionsOrderResult.order) && OooOOO0.OooO0O0(this.errCode, transactionsOrderResult.errCode);
    }

    public final String getErrCode() {
        return this.errCode;
    }

    public final Order getOrder() {
        return this.order;
    }

    public int hashCode() {
        Order order = this.order;
        return this.errCode.hashCode() + ((order == null ? 0 : order.hashCode()) * 31);
    }

    public String toString() {
        return "TransactionsOrderResult(order=" + this.order + ", errCode=" + this.errCode + ")";
    }
}
