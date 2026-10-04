package io.ktor.network.util;

import Oooo000.C20901OooOOo0;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.network.util.Timeout$initTimeoutJob$1", m80623f = "Utils.kt", m80624l = {57, 59, 60}, m80625m = "invokeSuspend")
public final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f80482OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f80483OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(OooO0OO oooO0OO, Continuation<? super OooO0O0> continuation) {
        super(2, continuation);
        this.f80482OooOo = oooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0O0(this.f80482OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Type inference failed for: r10v16, types: [oO00ooo.OooO, oO0O000o.OooOO0o] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f80483OooOo0o;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            ?? r10 = this.f80482OooOo.f80487OooO0Oo;
            this.f80483OooOo0o = 3;
            if (r10.invoke(this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        while (true) {
            if (this.f80482OooOo.isStarted == 0) {
                OooO0OO oooO0OO = this.f80482OooOo;
                oooO0OO.lastActivityTime = oooO0OO.f80485OooO0O0.invoke().longValue();
            }
            long j = this.f80482OooOo.lastActivityTime;
            OooO0OO oooO0OO2 = this.f80482OooOo;
            long jLongValue = (j + oooO0OO2.f80484OooO00o) - oooO0OO2.f80485OooO0O0.invoke().longValue();
            if (jLongValue > 0 || this.f80482OooOo.isStarted == 0) {
                this.f80483OooOo0o = 1;
                if (C33644OoooO0.OooO00o(jLongValue, this) == enumC32485OooO00o) {
                    break;
                }
            } else {
                this.f80483OooOo0o = 2;
                if (C20901OooOOo0.OooO0o(this) == enumC32485OooO00o) {
                }
            }
        }
        return enumC32485OooO00o;
    }
}
