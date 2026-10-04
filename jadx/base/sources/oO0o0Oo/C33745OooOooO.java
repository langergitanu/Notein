package oO0o0Oo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: oO0o0Oo.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", m80623f = "Merge.kt", m80624l = {213, 213}, m80625m = "invokeSuspend")
public final class C33745OooOooO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<Object>, Object, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f121648OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f121649OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AbstractC32476OooO f121650OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f121651OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C33745OooOooO(InterfaceC32508OooOOOo<Object, ? super Continuation<Object>, ? extends Object> interfaceC32508OooOOOo, Continuation<? super C33745OooOooO> continuation) {
        super(3, continuation);
        this.f121650OooOoO = (AbstractC32476OooO) interfaceC32508OooOOOo;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<Object> interfaceC33723OooO0oO, Object obj, Continuation<? super C32460OooOooO> continuation) {
        C33745OooOooO c33745OooOooO = new C33745OooOooO(this.f121650OooOoO, continuation);
        c33745OooOooO.f121648OooOo = interfaceC33723OooO0oO;
        c33745OooOooO.f121651OooOoO0 = obj;
        return c33745OooOooO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r1.emit(r5, r4) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v1, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f121649OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33723OooO0oO = this.f121648OooOo;
            Object obj2 = this.f121651OooOoO0;
            this.f121648OooOo = interfaceC33723OooO0oO;
            this.f121649OooOo0o = 1;
            obj = this.f121650OooOoO.invoke(obj2, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        interfaceC33723OooO0oO = this.f121648OooOo;
        C32446OooOOOo.OooO0O0(obj);
        this.f121648OooOo = null;
        this.f121649OooOo0o = 2;
    }
}
