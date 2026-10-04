package o0o0OO0;

import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0o0OO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$aiQuotaUsage$1", m80623f = "AiOcrViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30384OooO0Oo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Integer, Integer, Continuation<? super C32443OooOOO<? extends Integer, ? extends Integer>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Integer f108448OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Integer f108449OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(Integer num, Integer num2, Continuation<? super C32443OooOOO<? extends Integer, ? extends Integer>> continuation) {
        C30384OooO0Oo c30384OooO0Oo = new C30384OooO0Oo(3, continuation);
        c30384OooO0Oo.f108449OooOo0o = num;
        c30384OooO0Oo.f108448OooOo = num2;
        return c30384OooO0Oo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Integer num = this.f108449OooOo0o;
        Integer num2 = this.f108448OooOo;
        return new C32443OooOOO(new Integer(num != null ? num.intValue() : 0), new Integer(num2 != null ? num2.intValue() : 0));
    }
}
