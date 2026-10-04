package com.orion.notein.data.repo.transactions;

import com.android.billingclient.api.Purchase;
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

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.o00o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.NoteinGoogleBillingRemoteDataSource$acknowledgePurchase$2", m80623f = "NoteinGoogleBillingRemoteDataSource.kt", m80624l = {246, StyleIdentifier.LIGHT_GRID_ACCENT_6}, m80625m = "invokeSuspend")
public final class C22970o00o0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<Boolean>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Purchase f70349OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f70350OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f70351OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f70352OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f70353OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22970o00o0O(Purchase purchase, String str, String str2, o0Oo0oo o0oo0oo2, Continuation<? super C22970o00o0O> continuation) {
        super(2, continuation);
        this.f70349OooOo = purchase;
        this.f70352OooOoO0 = str;
        this.f70351OooOoO = str2;
        this.f70353OooOoOO = o0oo0oo2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C22970o00o0O(this.f70349OooOo, this.f70352OooOoO0, this.f70351OooOoO, this.f70353OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<Boolean>> continuation) {
        return ((C22970o00o0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r8 == r0) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C35238OooOoO c35238OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f70350OooOo0o;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                Purchase purchase = this.f70349OooOo;
                Object obj2 = purchase.OooO00o().get(0);
                kotlin.jvm.internal.OooOOO0.OooO0o(obj2, "get(...)");
                String strOooO0OO = purchase.OooO0OO();
                kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO, "getPurchaseToken(...)");
                OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o((String) obj2, strOooO0OO, this.f70352OooOoO0);
                boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(this.f70351OooOoO, "inapp");
                o0OOOOOo.OooO0O0 oooO0O0 = this.f70353OooOoOO.f70371OooO00o;
                if (zOooO0O0) {
                    this.f70350OooOo0o = 1;
                    obj = oooO0O0.OooOO0O(oooO00o, this);
                    if (obj == enumC32485OooO00o) {
                    }
                    c35238OooOoO = (C35238OooOoO) obj;
                } else {
                    this.f70350OooOo0o = 2;
                    obj = oooO0O0.OooO0O0(oooO00o, this);
                }
                return enumC32485OooO00o;
            }
            if (i == 1) {
                C32446OooOOOo.OooO0O0(obj);
                c35238OooOoO = (C35238OooOoO) obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                c35238OooOoO = (C35238OooOoO) obj;
            }
            C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) c35238OooOoO.f126542OooO0O0;
            if (!c35238OooOoO.f126541OooO00o.OooO0OO() || c27174OooO0O0 == null) {
                return new C27174OooO0O0(c27174OooO0O0 != null ? c27174OooO0O0.getErrorCode() : null, c27174OooO0O0 != null ? c27174OooO0O0.getErrorMsg() : null, null, false);
            }
            return c27174OooO0O0;
        } catch (Exception e) {
            return new C27174OooO0O0("199999", e.getMessage(), Boolean.FALSE, false);
        }
    }
}
