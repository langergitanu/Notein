package oO0o0Oo;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import kotlin.jvm.internal.C24039Oooo0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOo.C33702OooOOO;
import oO0o0OOo.C33710OooOo0;
import oO0o0OOo.C33711OooOo00;
import oO0o0OOo.InterfaceC33709OooOo;
import oO0o0OOo.InterfaceC33712OooOo0O;
import oO0o0OoO.C33811OooOo0O;
import oO0o0Ooo.C33839OooOo0;
import oO0o0oO0.C33884OooO00o;
import oO0o0oO0.C33885OooO0O0;
import oO0o0oO0.C33890OooO0oO;
import oO0o0oO0.C33892OooOO0;

/* JADX INFO: renamed from: oO0o0Oo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", m80623f = "Delay.kt", m80624l = {215, 415}, m80625m = "invokeSuspend")
public final class C33729OooOOO0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33636Oooo00o, InterfaceC33723OooO0oO<Object>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public kotlin.jvm.internal.Oooo000 f121537OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C24034Oooo00O f121538OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f121539OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f121540OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f121541OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o<Object> f121542OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32507OooOO0o<Object, Long> f121543OooOoo0;

    /* JADX INFO: renamed from: oO0o0Oo.OooOOO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", m80623f = "Delay.kt", m80624l = {226}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO<Object> f121544OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f121545OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C24034Oooo00O<Object> f121546OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Continuation continuation, C24034Oooo00O c24034Oooo00O, InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            super(1, continuation);
            this.f121544OooOo = interfaceC33723OooO0oO;
            this.f121546OooOoO0 = c24034Oooo00O;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
            return new OooO00o(continuation, this.f121546OooOoO0, this.f121544OooOo);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f121545OooOo0o;
            C24034Oooo00O<Object> c24034Oooo00O = this.f121546OooOoO0;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33839OooOo0 c33839OooOo0 = C33811OooOo0O.f121897OooO00o;
                Object obj2 = c24034Oooo00O.f80942OooOo0o;
                if (obj2 == c33839OooOo0) {
                    obj2 = null;
                }
                this.f121545OooOo0o = 1;
                if (this.f121544OooOo.emit(obj2, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            c24034Oooo00O.f80942OooOo0o = null;
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: oO0o0Oo.OooOOO0$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", m80623f = "Delay.kt", m80624l = {236}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C33702OooOOO<? extends Object>, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f121547OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C24034Oooo00O f121548OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ C24034Oooo00O<Object> f121549OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ Object f121550OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO<Object> f121551OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Continuation continuation, C24034Oooo00O c24034Oooo00O, InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            super(2, continuation);
            this.f121549OooOoO = c24034Oooo00O;
            this.f121551OooOoOO = interfaceC33723OooO0oO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(continuation, this.f121549OooOoO, this.f121551OooOoOO);
            oooO0O0.f121550OooOoO0 = obj;
            return oooO0O0;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(C33702OooOOO<? extends Object> c33702OooOOO, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(new C33702OooOOO(c33702OooOOO.f121484OooO00o), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v7, types: [T, oO0o0Ooo.OooOo0] */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            C24034Oooo00O<Object> c24034Oooo00O;
            C24034Oooo00O<Object> c24034Oooo00O2;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f121547OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                ?? r6 = ((C33702OooOOO) this.f121550OooOoO0).f121484OooO00o;
                boolean z = r6 instanceof C33702OooOOO.OooO0O0;
                c24034Oooo00O = this.f121549OooOoO;
                if (!z) {
                    c24034Oooo00O.f80942OooOo0o = r6;
                }
                if (z) {
                    Throwable thOooO00o = C33702OooOOO.OooO00o(r6);
                    if (thOooO00o != null) {
                        throw thOooO00o;
                    }
                    Object obj2 = c24034Oooo00O.f80942OooOo0o;
                    if (obj2 != null) {
                        if (obj2 == C33811OooOo0O.f121897OooO00o) {
                            obj2 = null;
                        }
                        this.f121550OooOoO0 = r6;
                        this.f121548OooOo0o = c24034Oooo00O;
                        this.f121547OooOo = 1;
                        if (this.f121551OooOoOO.emit(obj2, this) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                        c24034Oooo00O2 = c24034Oooo00O;
                    }
                    c24034Oooo00O.f80942OooOo0o = C33811OooOo0O.f121899OooO0OO;
                }
                return C32460OooOooO.f116667OooO00o;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c24034Oooo00O2 = this.f121548OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c24034Oooo00O = c24034Oooo00O2;
            c24034Oooo00O.f80942OooOo0o = C33811OooOo0O.f121899OooO0OO;
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: oO0o0Oo.OooOOO0$OooO0OO */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", m80623f = "Delay.kt", m80624l = {204}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33712OooOo0O<? super Object>, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f121552OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f121553OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33721OooO0o<Object> f121554OooOoO0;

        /* JADX INFO: renamed from: oO0o0Oo.OooOOO0$OooO0OO$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33712OooOo0O<Object> f121555OooOo0o;

            /* JADX INFO: renamed from: oO0o0Oo.OooOOO0$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", m80623f = "Delay.kt", m80624l = {204}, m80625m = "emit")
            public static final class C20327OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ OooO00o<T> f121556OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f121557OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public int f121558OooOoO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C20327OooO00o(OooO00o<? super T> oooO00o, Continuation<? super C20327OooO00o> continuation) {
                    super(continuation);
                    this.f121556OooOo = oooO00o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f121557OooOo0o = obj;
                    this.f121558OooOoO0 |= Integer.MIN_VALUE;
                    return this.f121556OooOo.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33712OooOo0O<Object> interfaceC33712OooOo0O) {
                this.f121555OooOo0o = interfaceC33712OooOo0O;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T t, Continuation<? super C32460OooOooO> continuation) {
                C20327OooO00o c20327OooO00o;
                if (continuation instanceof C20327OooO00o) {
                    c20327OooO00o = (C20327OooO00o) continuation;
                    int i = c20327OooO00o.f121558OooOoO0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c20327OooO00o.f121558OooOoO0 = i - Integer.MIN_VALUE;
                    } else {
                        c20327OooO00o = new C20327OooO00o(this, continuation);
                    }
                }
                Object obj = c20327OooO00o.f121557OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c20327OooO00o.f121558OooOoO0;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    if (t == null) {
                        t = (T) C33811OooOo0O.f121897OooO00o;
                    }
                    c20327OooO00o.f121558OooOoO0 = 1;
                    if (this.f121555OooOo0o.OooOOO(t, c20327OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(InterfaceC33721OooO0o<Object> interfaceC33721OooO0o, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f121554OooOoO0 = interfaceC33721OooO0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f121554OooOoO0, continuation);
            oooO0OO.f121552OooOo = obj;
            return oooO0OO;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33712OooOo0O<? super Object> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33712OooOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f121553OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                OooO00o oooO00o = new OooO00o((InterfaceC33712OooOo0O) this.f121552OooOo);
                this.f121553OooOo0o = 1;
                if (this.f121554OooOoO0.collect(oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33729OooOOO0(InterfaceC32507OooOO0o<Object, Long> interfaceC32507OooOO0o, InterfaceC33721OooO0o<Object> interfaceC33721OooO0o, Continuation<? super C33729OooOOO0> continuation) {
        super(3, continuation);
        this.f121543OooOoo0 = interfaceC32507OooOO0o;
        this.f121542OooOoo = interfaceC33721OooO0o;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, InterfaceC33723OooO0oO<Object> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        C33729OooOOO0 c33729OooOOO0 = new C33729OooOOO0(this.f121543OooOoo0, this.f121542OooOoo, continuation);
        c33729OooOOO0.f121539OooOoO = interfaceC33636Oooo00o;
        c33729OooOOO0.f121541OooOoOO = interfaceC33723OooO0oO;
        return c33729OooOOO0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        if (r10.emit(r11, r20) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0106, code lost:
    
        if (r12.OooO0o(r20) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0020, code lost:
    
        if (r12.OooO0oO(r20) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b A[PHI: r2 r8 r9 r10
      0x009b: PHI (r2v4 kotlin.jvm.internal.Oooo000) = (r2v6 kotlin.jvm.internal.Oooo000), (r2v8 kotlin.jvm.internal.Oooo000), (r2v8 kotlin.jvm.internal.Oooo000) binds: [B:28:0x0099, B:15:0x0065, B:21:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r8v3 kotlin.jvm.internal.Oooo00O) = (r8v12 kotlin.jvm.internal.Oooo00O), (r8v13 kotlin.jvm.internal.Oooo00O), (r8v13 kotlin.jvm.internal.Oooo00O) binds: [B:28:0x0099, B:15:0x0065, B:21:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r9v3 oO0o0OOo.OooOo) = (r9v4 oO0o0OOo.OooOo), (r9v5 oO0o0OOo.OooOo), (r9v5 oO0o0OOo.OooOo) binds: [B:28:0x0099, B:15:0x0065, B:21:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r10v2 oO0o0Oo.OooO0oO) = (r10v3 oO0o0Oo.OooO0oO), (r10v4 oO0o0Oo.OooO0oO), (r10v4 oO0o0Oo.OooO0oO) binds: [B:28:0x0099, B:15:0x0065, B:21:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0109  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        C24034Oooo00O c24034Oooo00O;
        InterfaceC33709OooOo interfaceC33709OooOo;
        kotlin.jvm.internal.Oooo000 oooo000;
        C24034Oooo00O c24034Oooo00O2;
        C33890OooO0oO c33890OooO0oO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f121540OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f121539OooOoO;
            InterfaceC33723OooO0oO interfaceC33723OooO0oO2 = (InterfaceC33723OooO0oO) this.f121541OooOoOO;
            C33710OooOo0 c33710OooOo0OooO0O0 = C33711OooOo00.OooO0O0(interfaceC33636Oooo00o, null, 0, new OooO0OO(this.f121542OooOoo, null), 3);
            interfaceC33723OooO0oO = interfaceC33723OooO0oO2;
            c24034Oooo00O = new C24034Oooo00O();
            interfaceC33709OooOo = c33710OooOo0OooO0O0;
            if (c24034Oooo00O.f80942OooOo0o == C33811OooOo0O.f121899OooO0OO) {
            }
        } else if (i == 1) {
            oooo000 = this.f121537OooOo;
            c24034Oooo00O = this.f121538OooOo0o;
            interfaceC33709OooOo = (InterfaceC33709OooOo) this.f121541OooOoOO;
            interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f121539OooOoO;
            C32446OooOOOo.OooO0O0(obj);
            c24034Oooo00O.f80942OooOo0o = null;
            C24034Oooo00O c24034Oooo00O3 = c24034Oooo00O;
            kotlin.jvm.internal.Oooo000 oooo0002 = oooo000;
            c24034Oooo00O2 = c24034Oooo00O3;
            c33890OooO0oO = new C33890OooO0oO(getContext());
            if (c24034Oooo00O2.f80942OooOo0o != 0) {
            }
            c33890OooO0oO.OooO(interfaceC33709OooOo.OooO0o(), new OooO0O0(null, c24034Oooo00O2, interfaceC33723OooO0oO));
            this.f121539OooOoO = interfaceC33723OooO0oO;
            this.f121541OooOoOO = interfaceC33709OooOo;
            this.f121538OooOo0o = c24034Oooo00O2;
            this.f121537OooOo = null;
            this.f121540OooOoO0 = 2;
            if (!(C33890OooO0oO.f122065OooOoo0.get(c33890OooO0oO) instanceof C33890OooO0oO.OooO00o)) {
            }
            c24034Oooo00O = c24034Oooo00O2;
            if (c24034Oooo00O.f80942OooOo0o == C33811OooOo0O.f121899OooO0OO) {
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c24034Oooo00O2 = this.f121538OooOo0o;
            InterfaceC33709OooOo interfaceC33709OooOo2 = (InterfaceC33709OooOo) this.f121541OooOoOO;
            InterfaceC33723OooO0oO interfaceC33723OooO0oO3 = (InterfaceC33723OooO0oO) this.f121539OooOoO;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33723OooO0oO = interfaceC33723OooO0oO3;
            interfaceC33709OooOo = interfaceC33709OooOo2;
            c24034Oooo00O = c24034Oooo00O2;
            if (c24034Oooo00O.f80942OooOo0o == C33811OooOo0O.f121899OooO0OO) {
                oooo000 = new kotlin.jvm.internal.Oooo000();
                Object obj2 = c24034Oooo00O.f80942OooOo0o;
                if (obj2 != null) {
                    C33839OooOo0 c33839OooOo0 = C33811OooOo0O.f121897OooO00o;
                    if (obj2 == c33839OooOo0) {
                        obj2 = null;
                    }
                    long jLongValue = this.f121543OooOoo0.invoke(obj2).longValue();
                    oooo000.f80941OooOo0o = jLongValue;
                    if (jLongValue < 0) {
                        throw new IllegalArgumentException("Debounce timeout should not be negative");
                    }
                    if (jLongValue == 0) {
                        Object obj3 = c24034Oooo00O.f80942OooOo0o;
                        if (obj3 == c33839OooOo0) {
                            obj3 = null;
                        }
                        this.f121539OooOoO = interfaceC33723OooO0oO;
                        this.f121541OooOoOO = interfaceC33709OooOo;
                        this.f121538OooOo0o = c24034Oooo00O;
                        this.f121537OooOo = oooo000;
                        this.f121540OooOoO0 = 1;
                    }
                    return enumC32485OooO00o;
                }
                C24034Oooo00O c24034Oooo00O32 = c24034Oooo00O;
                kotlin.jvm.internal.Oooo000 oooo00022 = oooo000;
                c24034Oooo00O2 = c24034Oooo00O32;
                c33890OooO0oO = new C33890OooO0oO(getContext());
                if (c24034Oooo00O2.f80942OooOo0o != 0) {
                    long j = oooo00022.f80941OooOo0o;
                    OooO00o oooO00o = new OooO00o(null, c24034Oooo00O2, interfaceC33723OooO0oO);
                    C33885OooO0O0 c33885OooO0O0 = new C33885OooO0O0(j);
                    C33884OooO00o c33884OooO00o = C33884OooO00o.f122060OooOo0o;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(c33884OooO00o, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
                    C24039Oooo0o0.OooO0o0(3, c33884OooO00o);
                    c33890OooO0oO.OooOO0(new C33890OooO0oO.OooO00o(c33885OooO0O0, c33884OooO00o, C33892OooOO0.OooO00o.f122089OooOo0o, C33892OooOO0.f122088OooO0o0, oooO00o, null), false);
                }
                c33890OooO0oO.OooO(interfaceC33709OooOo.OooO0o(), new OooO0O0(null, c24034Oooo00O2, interfaceC33723OooO0oO));
                this.f121539OooOoO = interfaceC33723OooO0oO;
                this.f121541OooOoOO = interfaceC33709OooOo;
                this.f121538OooOo0o = c24034Oooo00O2;
                this.f121537OooOo = null;
                this.f121540OooOoO0 = 2;
                if (!(C33890OooO0oO.f122065OooOoo0.get(c33890OooO0oO) instanceof C33890OooO0oO.OooO00o)) {
                }
                c24034Oooo00O = c24034Oooo00O2;
                if (c24034Oooo00O.f80942OooOo0o == C33811OooOo0O.f121899OooO0OO) {
                    return C32460OooOooO.f116667OooO00o;
                }
            }
        }
    }
}
