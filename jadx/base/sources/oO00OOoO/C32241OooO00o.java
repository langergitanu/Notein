package oO00OOoO;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO00OOoO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32241OooO00o<TSubject, TContext> extends AbstractC32246OooO0o0<TSubject, TContext> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final List<InterfaceC32510OooOOo0<AbstractC32246OooO0o0<TSubject, TContext>, TSubject, Continuation<? super C32460OooOooO>, Object>> f115799OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public TSubject f115800OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC34415OooO0oo f115801OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f115802OooOoOO;

    /* JADX INFO: renamed from: oO00OOoO.OooO00o$OooO00o, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "io.ktor.util.pipeline.DebugPipelineContext", m80623f = "DebugPipelineContext.kt", m80624l = {80}, m80625m = "proceedLoop")
    public static final class C20209OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f115803OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C32241OooO00o f115804OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f115805OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C32241OooO00o<TSubject, TContext> f115806OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20209OooO00o(C32241OooO00o<TSubject, TContext> c32241OooO00o, Continuation<? super C20209OooO00o> continuation) {
            super(continuation);
            this.f115806OooOoO0 = c32241OooO00o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f115803OooOo = obj;
            this.f115805OooOoO |= Integer.MIN_VALUE;
            return this.f115806OooOoO0.OooO0o(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C32241OooO00o(TContext context, List<? extends InterfaceC32510OooOOo0<? super AbstractC32246OooO0o0<TSubject, TContext>, ? super TSubject, ? super Continuation<? super C32460OooOooO>, ? extends Object>> interceptors, TSubject subject, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        super(context);
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(interceptors, "interceptors");
        OooOOO0.OooO0oO(subject, "subject");
        this.f115799OooOo = interceptors;
        this.f115801OooOoO0 = interfaceC34415OooO0oo;
        this.f115800OooOoO = subject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00OOoO.AbstractC32246OooO0o0
    public final Object OooO00o(Object obj, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        this.f115802OooOoOO = 0;
        OooOOO0.OooO0oO(obj, "<set-?>");
        this.f115800OooOoO = obj;
        return OooO0Oo(abstractC32479OooO0OO);
    }

    @Override // oO00OOoO.AbstractC32246OooO0o0
    public final TSubject OooO0O0() {
        return this.f115800OooOoO;
    }

    @Override // oO00OOoO.AbstractC32246OooO0o0
    public final Object OooO0Oo(Continuation<? super TSubject> continuation) {
        int i = this.f115802OooOoOO;
        if (i < 0) {
            return this.f115800OooOoO;
        }
        if (i < this.f115799OooOo.size()) {
            return OooO0o(continuation);
        }
        this.f115802OooOoOO = -1;
        return this.f115800OooOoO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(Continuation<? super TSubject> continuation) {
        C20209OooO00o c20209OooO00o;
        C32241OooO00o<TSubject, TContext> c32241OooO00o;
        InterfaceC32510OooOOo0<AbstractC32246OooO0o0<TSubject, TContext>, TSubject, Continuation<? super C32460OooOooO>, Object> interfaceC32510OooOOo0;
        TSubject tsubject;
        if (continuation instanceof C20209OooO00o) {
            c20209OooO00o = (C20209OooO00o) continuation;
            int i = c20209OooO00o.f115805OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c20209OooO00o.f115805OooOoO = i - Integer.MIN_VALUE;
            } else {
                c20209OooO00o = new C20209OooO00o(this, continuation);
            }
        }
        Object obj = c20209OooO00o.f115803OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c20209OooO00o.f115805OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c32241OooO00o = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c32241OooO00o = c20209OooO00o.f115804OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        do {
            int i3 = c32241OooO00o.f115802OooOoOO;
            if (i3 != -1) {
                List<InterfaceC32510OooOOo0<AbstractC32246OooO0o0<TSubject, TContext>, TSubject, Continuation<? super C32460OooOooO>, Object>> list = c32241OooO00o.f115799OooOo;
                if (i3 >= list.size()) {
                    c32241OooO00o.f115802OooOoOO = -1;
                } else {
                    interfaceC32510OooOOo0 = list.get(i3);
                    c32241OooO00o.f115802OooOoOO = i3 + 1;
                    OooOOO0.OooO0o0(interfaceC32510OooOOo0, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext>, TSubject of io.ktor.util.pipeline.DebugPipelineContext, kotlin.Unit>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptor<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext> }");
                    tsubject = c32241OooO00o.f115800OooOoO;
                    c20209OooO00o.f115804OooOo0o = c32241OooO00o;
                    c20209OooO00o.f115805OooOoO = 1;
                }
            }
            return c32241OooO00o.f115800OooOoO;
        } while (interfaceC32510OooOOo0.invoke(c32241OooO00o, tsubject, c20209OooO00o) != enumC32485OooO00o);
        return enumC32485OooO00o;
    }

    @Override // oO00OOoO.AbstractC32246OooO0o0
    public final Object OooO0o0(TSubject tsubject, Continuation<? super TSubject> continuation) {
        OooOOO0.OooO0oO(tsubject, "<set-?>");
        this.f115800OooOoO = tsubject;
        return OooO0Oo(continuation);
    }

    @Override // oO0o0OO.InterfaceC33636Oooo00o
    public final InterfaceC34415OooO0oo OooOOO0() {
        return this.f115801OooOoO0;
    }
}
