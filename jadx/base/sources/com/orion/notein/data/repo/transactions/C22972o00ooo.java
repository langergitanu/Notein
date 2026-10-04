package com.orion.notein.data.repo.transactions;

import com.aspose.words.StyleIdentifier;
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

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.o00ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.NoteinGoogleBillingRemoteDataSource$cancelSubscriptionPurchase$2", m80623f = "NoteinGoogleBillingRemoteDataSource.kt", m80624l = {StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2}, m80625m = "invokeSuspend")
public final class C22972o00ooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<Boolean>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f70360OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f70361OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f70362OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f70363OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22972o00ooo(String str, String str2, o0Oo0oo o0oo0oo2, Continuation<? super C22972o00ooo> continuation) {
        super(2, continuation);
        this.f70360OooOo = str;
        this.f70363OooOoO0 = str2;
        this.f70362OooOoO = o0oo0oo2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C22972o00ooo(this.f70360OooOo, this.f70363OooOoO0, this.f70362OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<Boolean>> continuation) {
        return ((C22972o00ooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f70361OooOo0o;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                OooO0O0.C19852OooO0O0 c19852OooO0O0 = new OooO0O0.C19852OooO0O0(this.f70360OooOo, this.f70363OooOoO0);
                o0OOOOOo.OooO0O0 oooO0O0 = this.f70362OooOoO.f70371OooO00o;
                this.f70361OooOo0o = 1;
                obj = oooO0O0.OooO00o(c19852OooO0O0, this);
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
            return new C27174OooO0O0(c27174OooO0O0.getErrorCode(), c27174OooO0O0.getErrorMsg(), (Boolean) c27174OooO0O0.OooO0O0(), c27174OooO0O0.f94862OooO00o);
        } catch (Exception e) {
            return new C27174OooO0O0("199999", e.getMessage(), null, false);
        }
    }
}
