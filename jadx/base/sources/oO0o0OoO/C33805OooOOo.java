package oO0o0OoO;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: oO0o0OoO.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", m80623f = "FlowCoroutine.kt", m80624l = {47}, m80625m = "invokeSuspend")
public final class C33805OooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f121885OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f121886OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO<Object> f121887OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AbstractC32476OooO f121888OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C33805OooOOo(InterfaceC32510OooOOo0<? super InterfaceC33636Oooo00o, ? super InterfaceC33723OooO0oO<Object>, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32510OooOOo0, InterfaceC33723OooO0oO<Object> interfaceC33723OooO0oO, Continuation<? super C33805OooOOo> continuation) {
        super(2, continuation);
        this.f121888OooOoO0 = (AbstractC32476OooO) interfaceC32510OooOOo0;
        this.f121887OooOoO = interfaceC33723OooO0oO;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [oO00ooo.OooO, oO0O000o.OooOOo0] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C33805OooOOo c33805OooOOo = new C33805OooOOo(this.f121888OooOoO0, this.f121887OooOoO, continuation);
        c33805OooOOo.f121885OooOo = obj;
        return c33805OooOOo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C33805OooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [oO00ooo.OooO, oO0O000o.OooOOo0] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f121886OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f121885OooOo;
            this.f121886OooOo0o = 1;
            if (this.f121888OooOoO0.invoke(interfaceC33636Oooo00o, this.f121887OooOoO, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
