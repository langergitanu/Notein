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

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingRepoImpl$getUnboundPurchases$inAppHistory$inAppResult$1", m80623f = "GoogleBillingRepoImpl.kt", m80624l = {StyleIdentifier.COLORFUL_GRID_ACCENT_6}, m80625m = "invokeSuspend")
public final class C22957OoooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Purchase>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C22949Oooo0oO f70279OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f70280OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22957OoooOOo(C22949Oooo0oO c22949Oooo0oO, Continuation<? super C22957OoooOOo> continuation) {
        super(2, continuation);
        this.f70279OooOo = c22949Oooo0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C22957OoooOOo(this.f70279OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Purchase>> continuation) {
        return ((C22957OoooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f70280OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        GoogleBillingDataSource googleBillingDataSource = this.f70279OooOo.f70201OooO00o;
        this.f70280OooOo0o = 1;
        Object objOooOOO0 = googleBillingDataSource.OooOOO0("inapp", this);
        return objOooOOO0 == enumC32485OooO00o ? enumC32485OooO00o : objOooOOO0;
    }
}
