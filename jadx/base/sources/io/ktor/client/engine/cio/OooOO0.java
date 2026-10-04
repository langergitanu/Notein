package io.ktor.client.engine.cio;

import kotlin.coroutines.Continuation;
import oO00O0oo.C32222OooOO0o;
import oO00O0oo.InterfaceC32225OooOOo0;
import oO00O0oo.OooOo00;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.engine.cio.Endpoint$connect$2$connect$1", m80623f = "Endpoint.kt", m80624l = {207}, m80625m = "invokeSuspend")
public final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super InterfaceC32225OooOOo0>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23938OooOOo0 f80391OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f80392OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ long f80393OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C32222OooOO0o f80394OooOoO0;

    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<OooOo00.OooO0OO, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ long f80395OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j) {
            super(1);
            this.f80395OooOo0o = j;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(OooOo00.OooO0OO oooO0OO) {
            OooOo00.OooO0OO connect = oooO0OO;
            kotlin.jvm.internal.OooOOO0.OooO0oO(connect, "$this$connect");
            connect.f115684OooO0Oo = this.f80395OooOo0o;
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(C23938OooOOo0 c23938OooOOo0, C32222OooOO0o c32222OooOO0o, long j, Continuation<? super OooOO0> continuation) {
        super(2, continuation);
        this.f80391OooOo = c23938OooOOo0;
        this.f80394OooOoO0 = c32222OooOO0o;
        this.f80393OooOoO = j;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOO0(this.f80391OooOo, this.f80394OooOoO0, this.f80393OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super InterfaceC32225OooOOo0> continuation) {
        return ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f80392OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C23938OooOOo0 c23938OooOOo0 = this.f80391OooOo;
        OooO00o oooO00o = new OooO00o(this.f80393OooOoO);
        this.f80392OooOo0o = 1;
        Object objOooO00o = c23938OooOOo0.f80434OooOoOO.OooO00o(this.f80394OooOoO0, oooO00o, this);
        return objOooO00o == enumC32485OooO00o ? enumC32485OooO00o : objOooO00o;
    }
}
