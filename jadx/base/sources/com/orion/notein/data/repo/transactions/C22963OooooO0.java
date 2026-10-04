package com.orion.notein.data.repo.transactions;

import com.orion.notein.domain.models.transactions.google.FirebaseUserMembership;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleInAppPurchase;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleSubscriptionPurchase;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OooooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingRepoImpl$getUserMembership$2", m80623f = "GoogleBillingRepoImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C22963OooooO0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends NoteinGoogleInAppPurchase>, List<? extends NoteinGoogleSubscriptionPurchase>, Continuation<? super FirebaseUserMembership>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f70301OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f70302OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f70303OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22963OooooO0(String str, Continuation<? super C22963OooooO0> continuation) {
        super(3, continuation);
        this.f70303OooOoO0 = str;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends NoteinGoogleInAppPurchase> list, List<? extends NoteinGoogleSubscriptionPurchase> list2, Continuation<? super FirebaseUserMembership> continuation) {
        C22963OooooO0 c22963OooooO0 = new C22963OooooO0(this.f70303OooOoO0, continuation);
        c22963OooooO0.f70302OooOo0o = list;
        c22963OooooO0.f70301OooOo = list2;
        return c22963OooooO0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return new FirebaseUserMembership(this.f70303OooOoO0, this.f70302OooOo0o, this.f70301OooOo);
    }
}
