package com.orion.notein.data.repo.transactions;

import com.aspose.words.StyleIdentifier;
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
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.NoteinGoogleBillingRemoteDataSource$getPurchaseLinkStatus$2", m80623f = "NoteinGoogleBillingRemoteDataSource.kt", m80624l = {StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_1, StyleIdentifier.GRID_TABLE_4_ACCENT_1}, m80625m = "invokeSuspend")
public final class o00oO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<OooO0O0.OooO0o>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f70354OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f70355OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ List<String> f70356OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f70357OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0O(String str, o0Oo0oo o0oo0oo2, List<String> list, Continuation<? super o00oO0O> continuation) {
        super(2, continuation);
        this.f70354OooOo = str;
        this.f70357OooOoO0 = o0oo0oo2;
        this.f70356OooOoO = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00oO0O(this.f70354OooOo, this.f70357OooOoO0, this.f70356OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<OooO0O0.OooO0o>> continuation) {
        return ((o00oO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
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
        int i = this.f70355OooOo0o;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                boolean zEquals = this.f70354OooOo.equals("inapp");
                List<String> list = this.f70356OooOoO;
                o0Oo0oo o0oo0oo2 = this.f70357OooOoO0;
                if (zEquals) {
                    o0OOOOOo.OooO0O0 oooO0O0 = o0oo0oo2.f70371OooO00o;
                    OooO0O0.OooO0o0 oooO0o0 = new OooO0O0.OooO0o0(list);
                    this.f70355OooOo0o = 1;
                    obj = oooO0O0.OooO0o(oooO0o0, this);
                    if (obj == enumC32485OooO00o) {
                    }
                    c35238OooOoO = (C35238OooOoO) obj;
                } else {
                    o0OOOOOo.OooO0O0 oooO0O02 = o0oo0oo2.f70371OooO00o;
                    OooO0O0.OooO0o0 oooO0o02 = new OooO0O0.OooO0o0(list);
                    this.f70355OooOo0o = 2;
                    obj = oooO0O02.OooO0oO(oooO0o02, this);
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
            return new C27174OooO0O0("199999", e.getMessage(), null, false);
        }
    }
}
