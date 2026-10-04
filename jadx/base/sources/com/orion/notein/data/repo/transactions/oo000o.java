package com.orion.notein.data.repo.transactions;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleDeveloperOffer;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOOOOo.OooO0O0;
import o0OOOo0.C27174OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.NoteinGoogleBillingRemoteDataSource$getGoogleDeveloperOffers$2", m80623f = "NoteinGoogleBillingRemoteDataSource.kt", m80624l = {StyleIdentifier.GRID_TABLE_4_ACCENT_5}, m80625m = "invokeSuspend")
public final class oo000o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<List<? extends NoteinGoogleDeveloperOffer>>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f70383OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f70384OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(o0Oo0oo o0oo0oo2, Continuation<? super oo000o> continuation) {
        super(2, continuation);
        this.f70383OooOo = o0oo0oo2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new oo000o(this.f70383OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<List<? extends NoteinGoogleDeveloperOffer>>> continuation) {
        return ((oo000o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f70384OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o0Oo0oo o0oo0oo2 = this.f70383OooOo;
            this.f70384OooOo0o = 1;
            obj = o0oo0oo2.f70371OooO00o.OooO0OO(this);
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
        OooO0O0.OooO0OO oooO0OO = (OooO0O0.OooO0OO) c27174OooO0O0.OooO0O0();
        return new C27174OooO0O0(c27174OooO0O0.getErrorCode(), c27174OooO0O0.getErrorMsg(), oooO0OO != null ? oooO0OO.OooO00o() : null, c27174OooO0O0.f94862OooO00o);
    }
}
