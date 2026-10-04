package com.orion.notein.data.repo.transactions;

import com.orion.notein.data.p602db.entity.PlayPurchaseServerEntity;
import com.orion.notein.data.service.dto.transactions.GooglePlayPurchaseDto;
import com.orion.notein.domain.models.transactions.google.ProductPurchase;
import kotlin.coroutines.Continuation;
import o0OOOOOo.InterfaceC27155OooO00o;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingDataSource$queryInAppPurchaseFromServer$2", m80623f = "GoogleBillingDataSource.kt", m80624l = {483, 500}, m80625m = "invokeSuspend")
public final class C22930OooOOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super ProductPurchase>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f70105OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ProductPurchase f70106OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f70107OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ GoogleBillingDataSource f70108OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f70109OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22930OooOOo0(GoogleBillingDataSource googleBillingDataSource, String str, String str2, Continuation<? super C22930OooOOo0> continuation) {
        super(2, continuation);
        this.f70108OooOoO0 = googleBillingDataSource;
        this.f70107OooOoO = str;
        this.f70109OooOoOO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C22930OooOOo0(this.f70108OooOoO0, this.f70107OooOoO, this.f70109OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super ProductPurchase> continuation) {
        return ((C22930OooOOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f70105OooOo;
        String str = this.f70109OooOoOO;
        String str2 = this.f70107OooOoO;
        GoogleBillingDataSource googleBillingDataSource = this.f70108OooOoO0;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                String str3 = googleBillingDataSource.f70033OooOOOO;
                kotlin.jvm.internal.OooOOO0.OooO0o(str3, "access$getPackageName$p(...)");
                GooglePlayPurchaseDto googlePlayPurchaseDto = new GooglePlayPurchaseDto(str3, str2, str);
                InterfaceC27155OooO00o interfaceC27155OooO00o = googleBillingDataSource.f70020OooO00o;
                this.f70105OooOo = 1;
                obj = interfaceC27155OooO00o.OooO00o(googlePlayPurchaseDto, this);
                if (obj == enumC32485OooO00o) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ProductPurchase productPurchase = this.f70106OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return productPurchase;
            }
            C32446OooOOOo.OooO0O0(obj);
            C35238OooOoO c35238OooOoO = (C35238OooOoO) obj;
            String str4 = (String) c35238OooOoO.f126542OooO0O0;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("GoogleBillingDataSource");
            c20358OooO00o.OooO0o0("queryInAppPurchasesFromServer success. " + str2 + ", " + c35238OooOoO + ", " + str4, new Object[0]);
            if (!c35238OooOoO.f126541OooO00o.OooO0OO() || str4 == null) {
                return null;
            }
            oOo00O0O.OooOo00 oooOo00 = googleBillingDataSource.f70036OooOOo0;
            oooOo00.getClass();
            ProductPurchase productPurchase2 = (ProductPurchase) oooOo00.OooO0O0(str4, ProductPurchase.INSTANCE.serializer());
            productPurchase2.setPurchaseToken(str2);
            productPurchase2.setProductId(str);
            PlayPurchaseServerEntity playPurchaseServerEntity = new PlayPurchaseServerEntity(str2, "inapp", str, str4);
            this.f70106OooOo0o = productPurchase2;
            this.f70105OooOo = 2;
            return googleBillingDataSource.f70021OooO0O0.OooO0Oo(new PlayPurchaseServerEntity[]{playPurchaseServerEntity}, this) == enumC32485OooO00o ? enumC32485OooO00o : productPurchase2;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("GoogleBillingDataSource");
            c20358OooO00o2.OooO0OO("queryInAppPurchasesFromServer: failed. error: ".concat(C32435OooO0Oo.OooO0O0(e)), new Object[0]);
            return null;
        }
    }
}
