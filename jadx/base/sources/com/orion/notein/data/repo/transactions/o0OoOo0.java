package com.orion.notein.data.repo.transactions;

import com.orion.notein.data.p602db.entity.NoteinGoogleDeveloperOfferEntity;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.NoteinGoogleBillingLocalDataSource$saveSubscriptionOffers$2", m80623f = "NoteinGoogleBillingLocalDataSource.kt", m80624l = {80}, m80625m = "invokeSuspend")
public final class o0OoOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f70372OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f70373OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f70374OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(o00Ooo o00ooo2, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f70372OooOo = o00ooo2;
        this.f70374OooOoO0 = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o0OoOo0(this.f70372OooOo, this.f70374OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o0OoOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f70373OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o00Ooo o00ooo2 = this.f70372OooOo;
            NoteinGoogleDeveloperOfferEntity[] noteinGoogleDeveloperOfferEntityArr = (NoteinGoogleDeveloperOfferEntity[]) this.f70374OooOoO0.toArray(new NoteinGoogleDeveloperOfferEntity[0]);
            NoteinGoogleDeveloperOfferEntity[] noteinGoogleDeveloperOfferEntityArr2 = (NoteinGoogleDeveloperOfferEntity[]) Arrays.copyOf(noteinGoogleDeveloperOfferEntityArr, noteinGoogleDeveloperOfferEntityArr.length);
            this.f70373OooOo0o = 1;
            if (o00ooo2.f70348OooO0O0.OooO00o(noteinGoogleDeveloperOfferEntityArr2, this) == enumC32485OooO00o) {
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
