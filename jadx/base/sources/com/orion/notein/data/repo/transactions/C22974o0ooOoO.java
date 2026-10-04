package com.orion.notein.data.repo.transactions;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import kotlin.coroutines.Continuation;
import o0OOOOOo.OooO0O0;
import o0OOOo0.C27174OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.o0ooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.NoteinGoogleBillingRemoteDataSource$submitLocalPurchaseHistoryRecords$2", m80623f = "NoteinGoogleBillingRemoteDataSource.kt", m80624l = {119}, m80625m = "invokeSuspend")
public final class C22974o0ooOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<Bundle>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C32465OooO0O0 f70380OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f70381OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f70382OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22974o0ooOoO(C32465OooO0O0 c32465OooO0O0, o0Oo0oo o0oo0oo2, Continuation continuation) {
        super(2, continuation);
        this.f70380OooOo = c32465OooO0O0;
        this.f70382OooOoO0 = o0oo0oo2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C22974o0ooOoO(this.f70380OooOo, this.f70382OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<Bundle>> continuation) {
        return ((C22974o0ooOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f70381OooOo0o;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C32465OooO0O0 c32465OooO0O0 = this.f70380OooOo;
                if (c32465OooO0O0.isEmpty()) {
                    return new C27174OooO0O0("0", null, BundleKt.bundleOf(), true);
                }
                o0OOOOOo.OooO0O0 oooO0O0 = this.f70382OooOoO0.f70371OooO00o;
                OooO0O0.OooOO0 oooOO02 = new OooO0O0.OooOO0(c32465OooO0O0);
                this.f70381OooOo0o = 1;
                obj = oooO0O0.OooO(oooOO02, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            C35238OooOoO c35238OooOoO = (C35238OooOoO) obj;
            C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) c35238OooOoO.f126542OooO0O0;
            if (!c35238OooOoO.f126541OooO00o.OooO0OO() || c27174OooO0O0 == null) {
                return new C27174OooO0O0(c27174OooO0O0 != null ? c27174OooO0O0.getErrorCode() : null, c27174OooO0O0 != null ? c27174OooO0O0.getErrorMsg() : null, null, false);
            }
            OooO0O0.C27157OooO0oO c27157OooO0oO = (OooO0O0.C27157OooO0oO) c27174OooO0O0.OooO0O0();
            C32443OooOOO c32443OooOOO = new C32443OooOOO("inapp", c27157OooO0oO != null ? c27157OooO0oO.OooO00o() : null);
            OooO0O0.C27157OooO0oO c27157OooO0oO2 = (OooO0O0.C27157OooO0oO) c27174OooO0O0.OooO0O0();
            return new C27174OooO0O0(c27174OooO0O0.getErrorCode(), c27174OooO0O0.getErrorMsg(), BundleKt.bundleOf(c32443OooOOO, new C32443OooOOO("subs", c27157OooO0oO2 != null ? c27157OooO0oO2.OooO0O0() : null)), c27174OooO0O0.f94862OooO00o);
        } catch (Exception e) {
            return new C27174OooO0O0("199999", e.getMessage(), null, false);
        }
    }
}
