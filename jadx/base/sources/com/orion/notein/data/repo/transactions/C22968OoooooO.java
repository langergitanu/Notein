package com.orion.notein.data.repo.transactions;

import com.orion.notein.data.p602db.entity.NoteinGoogleDeveloperOfferEntity;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OoooooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.NoteinGoogleBillingLocalDataSource$getSubscriptionOffersSync$2", m80623f = "NoteinGoogleBillingLocalDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C22968OoooooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends NoteinGoogleDeveloperOfferEntity>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f70323OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f70324OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22968OoooooO(o00Ooo o00ooo2, String str, Continuation<? super C22968OoooooO> continuation) {
        super(2, continuation);
        this.f70324OooOo0o = o00ooo2;
        this.f70323OooOo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C22968OoooooO(this.f70324OooOo0o, this.f70323OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends NoteinGoogleDeveloperOfferEntity>> continuation) {
        return ((C22968OoooooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        o00Ooo o00ooo2 = this.f70324OooOo0o;
        return o00ooo2.f70348OooO0O0.OooO0O0(this.f70323OooOo);
    }
}
