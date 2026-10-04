package com.orion.notein.data.repo.transactions;

import com.android.billingclient.api.Purchase;
import com.aspose.words.StyleIdentifier;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingRepoImpl$getUnboundPurchases$subscriptionHistory$subsResult$1", m80623f = "GoogleBillingRepoImpl.kt", m80624l = {StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_4}, m80625m = "invokeSuspend")
public final class C22958OoooOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Purchase>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C22949Oooo0oO f70281OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f70282OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22958OoooOo0(C22949Oooo0oO c22949Oooo0oO, Continuation<? super C22958OoooOo0> continuation) {
        super(2, continuation);
        this.f70281OooOo = c22949Oooo0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C22958OoooOo0(this.f70281OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Purchase>> continuation) {
        return ((C22958OoooOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f70282OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        GoogleBillingDataSource googleBillingDataSource = this.f70281OooOo.f70201OooO00o;
        this.f70282OooOo0o = 1;
        Object objOooOOO0 = googleBillingDataSource.OooOOO0("subs", this);
        return objOooOOO0 == enumC32485OooO00o ? enumC32485OooO00o : objOooOOO0;
    }
}
