package com.orion.notein.data.repo.transactions;

import com.orion.notein.data.p602db.entity.UpdateOfferStatusEntity;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.NoteinGoogleBillingLocalDataSource$setSubscriptionOfferStatus$2", m80623f = "NoteinGoogleBillingLocalDataSource.kt", m80624l = {98}, m80625m = "invokeSuspend")
public final class o00O0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f70339OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f70340OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f70341OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(o00Ooo o00ooo2, String str, Continuation continuation) {
        super(2, continuation);
        this.f70339OooOo = o00ooo2;
        this.f70341OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00O0O(this.f70339OooOo, this.f70341OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o00O0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f70340OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o00Ooo o00ooo2 = this.f70339OooOo;
            UpdateOfferStatusEntity updateOfferStatusEntity = new UpdateOfferStatusEntity(this.f70341OooOoO0, true);
            this.f70340OooOo0o = 1;
            if (o00ooo2.f70348OooO0O0.OooO0OO(updateOfferStatusEntity, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
