package com.orion.notein.data.repo.transactions;

import com.orion.notein.data.p602db.entity.PlayPurchaseServerEntity;
import com.orion.notein.domain.models.transactions.google.ProductPurchase;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes9.dex */
public final class Oooo000 implements InterfaceC33721OooO0o<List<? extends ProductPurchase>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ GoogleBillingDataSource f70169OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f70170OooOo0o;

    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ GoogleBillingDataSource f70171OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f70172OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.Oooo000$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingDataSource$special$$inlined$map$2$2", m80623f = "GoogleBillingDataSource.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19132OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f70173OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f70174OooOo0o;

            public C19132OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f70174OooOo0o = obj;
                this.f70173OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, GoogleBillingDataSource googleBillingDataSource) {
            this.f70172OooOo0o = interfaceC33723OooO0oO;
            this.f70171OooOo = googleBillingDataSource;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19132OooO00o c19132OooO00o;
            if (continuation instanceof C19132OooO00o) {
                c19132OooO00o = (C19132OooO00o) continuation;
                int i = c19132OooO00o.f70173OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19132OooO00o.f70173OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19132OooO00o = new C19132OooO00o(continuation);
                }
            }
            Object obj2 = c19132OooO00o.f70174OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19132OooO00o.f70173OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                List<PlayPurchaseServerEntity> list = (List) obj;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                for (PlayPurchaseServerEntity playPurchaseServerEntity : list) {
                    oOo00O0O.OooOo00 oooOo00 = this.f70171OooOo.f70036OooOOo0;
                    String originalJson = playPurchaseServerEntity.getOriginalJson();
                    oooOo00.getClass();
                    ProductPurchase productPurchase = (ProductPurchase) oooOo00.OooO0O0(originalJson, ProductPurchase.INSTANCE.serializer());
                    productPurchase.setPurchaseToken(playPurchaseServerEntity.getPurchaseToken());
                    String productId = playPurchaseServerEntity.getProductId();
                    if (productId == null) {
                        productId = "";
                    }
                    productPurchase.setProductId(productId);
                    arrayList.add(productPurchase);
                }
                c19132OooO00o.f70173OooOo = 1;
                if (this.f70172OooOo0o.emit(arrayList, c19132OooO00o) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj2);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public Oooo000(InterfaceC33721OooO0o interfaceC33721OooO0o, GoogleBillingDataSource googleBillingDataSource) {
        this.f70170OooOo0o = interfaceC33721OooO0o;
        this.f70169OooOo = googleBillingDataSource;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends ProductPurchase>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f70170OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f70169OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
