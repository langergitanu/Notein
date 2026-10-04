package oO0o0Oo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OoO.C33809OooOo0;

/* JADX INFO: renamed from: oO0o0Oo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", m80623f = "Collect.kt", m80624l = {46}, m80625m = "invokeSuspend")
public final class C33726OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o<Object> f121532OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f121533OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33726OooOO0O(InterfaceC33721OooO0o<Object> interfaceC33721OooO0o, Continuation<? super C33726OooOO0O> continuation) {
        super(2, continuation);
        this.f121532OooOo = interfaceC33721OooO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C33726OooOO0O(this.f121532OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C33726OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f121533OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f121533OooOo0o = 1;
            Object objCollect = this.f121532OooOo.collect(C33809OooOo0.f121895OooOo0o, this);
            if (objCollect != obj2) {
                objCollect = C32460OooOooO.f116667OooO00o;
            }
            if (objCollect == obj2) {
                return obj2;
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
