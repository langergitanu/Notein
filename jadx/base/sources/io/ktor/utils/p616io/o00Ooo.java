package io.ktor.utils.p616io;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.AbstractC33630OooOooO;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0OO.o0000oO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.utils.io.CoroutinesKt$launchChannel$job$1", m80623f = "Coroutines.kt", m80624l = {136}, m80625m = "invokeSuspend")
public final class o00Ooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f80873OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f80874OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ OooO00o f80875OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f80876OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ AbstractC32476OooO f80877OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ AbstractC33630OooOooO f80878OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00Ooo(boolean z, OooO00o oooO00o, InterfaceC32508OooOOOo interfaceC32508OooOOOo, AbstractC33630OooOooO abstractC33630OooOooO, Continuation continuation) {
        super(2, continuation);
        this.f80876OooOoO0 = z;
        this.f80875OooOoO = oooO00o;
        this.f80877OooOoOO = (AbstractC32476OooO) interfaceC32508OooOOOo;
        this.f80878OooOoo0 = abstractC33630OooOooO;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        ?? r3 = this.f80877OooOoOO;
        o00Ooo o00ooo2 = new o00Ooo(this.f80876OooOoO0, this.f80875OooOoO, r3, this.f80878OooOoo0, continuation);
        o00ooo2.f80873OooOo = obj;
        return o00ooo2;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o00Ooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f80874OooOo0o;
        OooO00o oooO00o = this.f80875OooOoO;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f80873OooOo;
                if (this.f80876OooOoO0) {
                    InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = interfaceC33636Oooo00o.OooOOO0().get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
                    OooOOO0.OooO0Oo(oooO0O0);
                    oooO00o.Oooo00O((InterfaceC33672o00ooo) oooO0O0);
                }
                o0OoOo0 o0oooo02 = new o0OoOo0(interfaceC33636Oooo00o, oooO00o);
                ?? r6 = this.f80877OooOoOO;
                this.f80874OooOo0o = 1;
                if (r6.invoke(o0oooo02, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
        } catch (Throwable th) {
            o0000oO o0000oo2 = C33649OoooOOo.f121329OooO0O0;
            AbstractC33630OooOooO abstractC33630OooOooO = this.f80878OooOoo0;
            if (!OooOOO0.OooO0O0(abstractC33630OooOooO, o0000oo2) && abstractC33630OooOooO != null) {
                throw th;
            }
            oooO00o.OooO0Oo(th);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
