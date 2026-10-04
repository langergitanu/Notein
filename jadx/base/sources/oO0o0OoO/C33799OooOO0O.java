package oO0o0OoO;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.EnumC33637Oooo0O0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0OOo.EnumC33692OooO0OO;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OoO.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33799OooOO0O<T, R> extends AbstractC33789OooO<T, R> {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final AbstractC32476OooO f121840OooOoOO;

    /* JADX INFO: renamed from: oO0o0OoO.OooOO0O$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", m80623f = "Merge.kt", m80624l = {23}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f121841OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f121842OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO<R> f121843OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C33799OooOO0O<T, R> f121844OooOoO0;

        /* JADX INFO: renamed from: oO0o0OoO.OooOO0O$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20332OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33636Oooo00o f121845OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C24034Oooo00O<InterfaceC33672o00ooo> f121846OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO<R> f121847OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ C33799OooOO0O<T, R> f121848OooOoO0;

            /* JADX INFO: renamed from: oO0o0OoO.OooOO0O$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", m80623f = "Merge.kt", m80624l = {30}, m80625m = "invokeSuspend")
            public static final class C20333OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ C33799OooOO0O<T, R> f121849OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f121850OooOo0o;

                /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
                public final /* synthetic */ T f121851OooOoO;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public final /* synthetic */ InterfaceC33723OooO0oO<R> f121852OooOoO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C20333OooO00o(C33799OooOO0O<T, R> c33799OooOO0O, InterfaceC33723OooO0oO<? super R> interfaceC33723OooO0oO, T t, Continuation<? super C20333OooO00o> continuation) {
                    super(2, continuation);
                    this.f121849OooOo = c33799OooOO0O;
                    this.f121852OooOoO0 = interfaceC33723OooO0oO;
                    this.f121851OooOoO = t;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C20333OooO00o(this.f121849OooOo, this.f121852OooOoO0, this.f121851OooOoO, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((C20333OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                /* JADX WARN: Type inference failed for: r4v2, types: [oO00ooo.OooO, oO0O000o.OooOOo0] */
                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f121850OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        ?? r4 = this.f121849OooOo.f121840OooOoOO;
                        this.f121850OooOo0o = 1;
                        if (r4.invoke(this.f121852OooOoO0, this.f121851OooOoO, this) == enumC32485OooO00o) {
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

            /* JADX INFO: renamed from: oO0o0OoO.OooOO0O$OooO00o$OooO00o$OooO0O0 */
            @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", m80623f = "Merge.kt", m80624l = {26}, m80625m = "emit")
            public static final class OooO0O0 extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public Object f121853OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public C20332OooO00o f121854OooOo0o;

                /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
                public /* synthetic */ Object f121855OooOoO;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public InterfaceC33672o00ooo f121856OooOoO0;

                /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
                public final /* synthetic */ C20332OooO00o<T> f121857OooOoOO;

                /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
                public int f121858OooOoo0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public OooO0O0(C20332OooO00o<? super T> c20332OooO00o, Continuation<? super OooO0O0> continuation) {
                    super(continuation);
                    this.f121857OooOoOO = c20332OooO00o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f121855OooOoO = obj;
                    this.f121858OooOoo0 |= Integer.MIN_VALUE;
                    return this.f121857OooOoOO.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C20332OooO00o(C24034Oooo00O<InterfaceC33672o00ooo> c24034Oooo00O, InterfaceC33636Oooo00o interfaceC33636Oooo00o, C33799OooOO0O<T, R> c33799OooOO0O, InterfaceC33723OooO0oO<? super R> interfaceC33723OooO0oO) {
                this.f121846OooOo0o = c24034Oooo00O;
                this.f121845OooOo = interfaceC33636Oooo00o;
                this.f121848OooOoO0 = c33799OooOO0O;
                this.f121847OooOoO = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T t, Continuation<? super C32460OooOooO> continuation) {
                OooO0O0 oooO0O0;
                C20332OooO00o<T> c20332OooO00o;
                if (continuation instanceof OooO0O0) {
                    oooO0O0 = (OooO0O0) continuation;
                    int i = oooO0O0.f121858OooOoo0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        oooO0O0.f121858OooOoo0 = i - Integer.MIN_VALUE;
                    } else {
                        oooO0O0 = new OooO0O0(this, continuation);
                    }
                }
                Object obj = oooO0O0.f121855OooOoO;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = oooO0O0.f121858OooOoo0;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    InterfaceC33672o00ooo interfaceC33672o00ooo = this.f121846OooOo0o.f80942OooOo0o;
                    if (interfaceC33672o00ooo != null) {
                        interfaceC33672o00ooo.cancel((CancellationException) new C33802OooOOO0());
                        oooO0O0.f121854OooOo0o = this;
                        oooO0O0.f121853OooOo = t;
                        oooO0O0.f121856OooOoO0 = interfaceC33672o00ooo;
                        oooO0O0.f121858OooOoo0 = 1;
                        if (interfaceC33672o00ooo.join(oooO0O0) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    }
                    c20332OooO00o = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t = (T) oooO0O0.f121853OooOo;
                    c20332OooO00o = oooO0O0.f121854OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                }
                c20332OooO00o.f121846OooOo0o.f80942OooOo0o = (T) C33609OooO0oo.OooO0OO(c20332OooO00o.f121845OooOo, null, EnumC33637Oooo0O0.f121318OooOoO, new C20333OooO00o(c20332OooO00o.f121848OooOoO0, c20332OooO00o.f121847OooOoO, t, null), 1);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(C33799OooOO0O<T, R> c33799OooOO0O, InterfaceC33723OooO0oO<? super R> interfaceC33723OooO0oO, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f121844OooOoO0 = c33799OooOO0O;
            this.f121843OooOoO = interfaceC33723OooO0oO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f121844OooOoO0, this.f121843OooOoO, continuation);
            oooO00o.f121841OooOo = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to oO0o0OoO.OooOO0O$OooO00o for r7v1 'this'  kotlin.coroutines.Continuation
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                oO00ooo0.OooO00o r0 = oO00ooo0.EnumC32485OooO00o.f116726OooOo0o
                int r1 = r7.f121842OooOo0o
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                oO00ooO.C32446OooOOOo.OooO0O0(r8)
                goto L35
            Ld:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L15:
                oO00ooO.C32446OooOOOo.OooO0O0(r8)
                java.lang.Object r8 = r7.f121841OooOo
                oO0o0OO.Oooo00o r8 = (oO0o0OO.InterfaceC33636Oooo00o) r8
                kotlin.jvm.internal.Oooo00O r1 = new kotlin.jvm.internal.Oooo00O
                r1.<init>()
                oO0o0OoO.OooOO0O<T, R> r3 = r7.f121844OooOoO0
                oO0o0Oo.OooO0o<S> r4 = r3.f121820OooOoO
                oO0o0OoO.OooOO0O$OooO00o$OooO00o r5 = new oO0o0OoO.OooOO0O$OooO00o$OooO00o
                oO0o0Oo.OooO0oO<R> r6 = r7.f121843OooOoO
                r5.<init>(r1, r8, r3, r6)
                r7.f121842OooOo0o = r2
                java.lang.Object r8 = r4.collect(r5, r7)
                if (r8 != r0) goto L35
                return r0
            L35:
                oO00ooO.OooOooO r8 = oO00ooO.C32460OooOooO.f116667OooO00o
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: oO0o0OoO.C33799OooOO0O.OooO00o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33799OooOO0O(InterfaceC32510OooOOo0<? super InterfaceC33723OooO0oO<? super R>, ? super T, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32510OooOOo0, InterfaceC33721OooO0o<? extends T> interfaceC33721OooO0o, InterfaceC34415OooO0oo interfaceC34415OooO0oo, int i, EnumC33692OooO0OO enumC33692OooO0OO) {
        super(i, enumC33692OooO0OO, interfaceC33721OooO0o, interfaceC34415OooO0oo);
        this.f121840OooOoOO = (AbstractC32476OooO) interfaceC32510OooOOo0;
    }

    @Override // oO0o0OoO.AbstractC33789OooO
    public final Object OooO(InterfaceC33723OooO0oO<? super R> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        Object objOooO0o0 = C33633Oooo0.OooO0o0(new OooO00o(this, interfaceC33723OooO0oO, null), continuation);
        return objOooO0o0 == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o0 : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [oO00ooo.OooO, oO0O000o.OooOOo0] */
    @Override // oO0o0OoO.AbstractC33796OooO0oO
    public final AbstractC33796OooO0oO<R> OooO0o0(InterfaceC34415OooO0oo interfaceC34415OooO0oo, int i, EnumC33692OooO0OO enumC33692OooO0OO) {
        return new C33799OooOO0O(this.f121840OooOoOO, this.f121820OooOoO, interfaceC34415OooO0oo, i, enumC33692OooO0OO);
    }
}
