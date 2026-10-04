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

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.Ooooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingRepoImpl$getUserMembership$1", m80623f = "GoogleBillingRepoImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C22962Ooooo0o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends NoteinGoogleInAppPurchase>, List<? extends NoteinGoogleSubscriptionPurchase>, Continuation<? super FirebaseUserMembership>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f70298OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f70299OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f70300OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22962Ooooo0o(String str, Continuation<? super C22962Ooooo0o> continuation) {
        super(3, continuation);
        this.f70300OooOoO0 = str;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends NoteinGoogleInAppPurchase> list, List<? extends NoteinGoogleSubscriptionPurchase> list2, Continuation<? super FirebaseUserMembership> continuation) {
        C22962Ooooo0o c22962Ooooo0o = new C22962Ooooo0o(this.f70300OooOoO0, continuation);
        c22962Ooooo0o.f70299OooOo0o = list;
        c22962Ooooo0o.f70298OooOo = list2;
        return c22962Ooooo0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return new FirebaseUserMembership(this.f70300OooOoO0, this.f70299OooOo0o, this.f70298OooOo);
    }
}
