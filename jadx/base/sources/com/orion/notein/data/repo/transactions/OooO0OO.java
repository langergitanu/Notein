package com.orion.notein.data.repo.transactions;

import java.util.List;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingDataSource$1", m80623f = "GoogleBillingDataSource.kt", m80624l = {192}, m80625m = "invokeSuspend")
public final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ GoogleBillingDataSource f70054OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f70055OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(GoogleBillingDataSource googleBillingDataSource, Continuation<? super OooO0OO> continuation) {
        super(2, continuation);
        this.f70054OooOo = googleBillingDataSource;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0OO(this.f70054OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f70055OooOo0o;
        GoogleBillingDataSource googleBillingDataSource = this.f70054OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f70055OooOo0o = 1;
            AbstractC24338OooO0o0.OooO00o<Long> oooO00o = GoogleBillingDataSource.f70016OooOoO0;
            googleBillingDataSource.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new OooOO0O(googleBillingDataSource, null), this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        googleBillingDataSource.f70035OooOOo.setValue((List) obj);
        return C32460OooOooO.f116667OooO00o;
    }
}
