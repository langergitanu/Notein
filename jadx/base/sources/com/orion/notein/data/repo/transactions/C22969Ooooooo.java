package com.orion.notein.data.repo.transactions;

import com.orion.notein.data.p602db.entity.NoteinGoogleSubscriptionPurchaseEntity;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.Ooooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.NoteinGoogleBillingLocalDataSource$getSubscriptionPurchasesSync$2", m80623f = "NoteinGoogleBillingLocalDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C22969Ooooooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends NoteinGoogleSubscriptionPurchaseEntity>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f70325OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f70326OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22969Ooooooo(o00Ooo o00ooo2, String str, Continuation<? super C22969Ooooooo> continuation) {
        super(2, continuation);
        this.f70326OooOo0o = o00ooo2;
        this.f70325OooOo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C22969Ooooooo(this.f70326OooOo0o, this.f70325OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends NoteinGoogleSubscriptionPurchaseEntity>> continuation) {
        return ((C22969Ooooooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return this.f70326OooOo0o.f70347OooO00o.OooO0o0(this.f70325OooOo);
    }
}
