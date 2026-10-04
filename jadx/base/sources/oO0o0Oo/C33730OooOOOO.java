package oO0o0Oo;

import com.aspose.words.StyleIdentifier;
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
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOo.C33702OooOOO;
import oO0o0OOo.C33710OooOo0;
import oO0o0OOo.C33711OooOo00;
import oO0o0OOo.InterfaceC33709OooOo;
import oO0o0OOo.InterfaceC33712OooOo0O;
import oO0o0OoO.C33802OooOOO0;
import oO0o0OoO.C33811OooOo0O;
import oO0o0oO0.C33890OooO0oO;

/* JADX INFO: renamed from: oO0o0Oo.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", m80623f = "Delay.kt", m80624l = {412}, m80625m = "invokeSuspend")
public final class C33730OooOOOO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33636Oooo00o, InterfaceC33723OooO0oO<Object>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public InterfaceC33709OooOo f121559OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C24034Oooo00O f121560OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f121561OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f121562OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f121563OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33767OoooOoo f121564OooOoo0;

    /* JADX INFO: renamed from: oO0o0Oo.OooOOOO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", m80623f = "Delay.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C33702OooOOO<? extends Object>, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C24034Oooo00O<Object> f121565OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f121566OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33709OooOo<C32460OooOooO> f121567OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C24034Oooo00O<Object> c24034Oooo00O, InterfaceC33709OooOo<C32460OooOooO> interfaceC33709OooOo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f121565OooOo = c24034Oooo00O;
            this.f121567OooOoO0 = interfaceC33709OooOo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f121565OooOo, this.f121567OooOoO0, continuation);
            oooO00o.f121566OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(C33702OooOOO<? extends Object> c33702OooOOO, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(new C33702OooOOO(c33702OooOOO.f121484OooO00o), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v7, types: [T, oO0o0Ooo.OooOo0] */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            ?? r3 = ((C33702OooOOO) this.f121566OooOo0o).f121484OooO00o;
            boolean z = r3 instanceof C33702OooOOO.OooO0O0;
            C24034Oooo00O<Object> c24034Oooo00O = this.f121565OooOo;
            if (!z) {
                c24034Oooo00O.f80942OooOo0o = r3;
            }
            if (z) {
                Throwable thOooO00o = C33702OooOOO.OooO00o(r3);
                if (thOooO00o != null) {
                    throw thOooO00o;
                }
                this.f121567OooOoO0.cancel(new C33802OooOOO0());
                c24034Oooo00O.f80942OooOo0o = C33811OooOo0O.f121899OooO0OO;
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: oO0o0Oo.OooOOOO$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", m80623f = "Delay.kt", m80624l = {StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_2}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32460OooOooO, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C24034Oooo00O<Object> f121568OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f121569OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO<Object> f121570OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Continuation continuation, C24034Oooo00O c24034Oooo00O, InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            super(2, continuation);
            this.f121568OooOo = c24034Oooo00O;
            this.f121570OooOoO0 = interfaceC33723OooO0oO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(continuation, this.f121568OooOo, this.f121570OooOoO0);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(C32460OooOooO c32460OooOooO, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(c32460OooOooO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f121569OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C24034Oooo00O<Object> c24034Oooo00O = this.f121568OooOo;
                Object obj2 = c24034Oooo00O.f80942OooOo0o;
                if (obj2 == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                c24034Oooo00O.f80942OooOo0o = null;
                if (obj2 == C33811OooOo0O.f121897OooO00o) {
                    obj2 = null;
                }
                this.f121569OooOo0o = 1;
                if (this.f121570OooOoO0.emit(obj2, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: oO0o0Oo.OooOOOO$OooO0OO */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", m80623f = "Delay.kt", m80624l = {StyleIdentifier.GRID_TABLE_1_LIGHT}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33712OooOo0O<? super Object>, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f121571OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f121572OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33767OoooOoo f121573OooOoO0;

        /* JADX INFO: renamed from: oO0o0Oo.OooOOOO$OooO0OO$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33712OooOo0O<Object> f121574OooOo0o;

            /* JADX INFO: renamed from: oO0o0Oo.OooOOOO$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", m80623f = "Delay.kt", m80624l = {StyleIdentifier.GRID_TABLE_1_LIGHT}, m80625m = "emit")
            public static final class C20328OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ OooO00o<T> f121575OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f121576OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public int f121577OooOoO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C20328OooO00o(OooO00o<? super T> oooO00o, Continuation<? super C20328OooO00o> continuation) {
                    super(continuation);
                    this.f121575OooOo = oooO00o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f121576OooOo0o = obj;
                    this.f121577OooOoO0 |= Integer.MIN_VALUE;
                    return this.f121575OooOo.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33712OooOo0O<Object> interfaceC33712OooOo0O) {
                this.f121574OooOo0o = interfaceC33712OooOo0O;
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
                C20328OooO00o c20328OooO00o;
                if (continuation instanceof C20328OooO00o) {
                    c20328OooO00o = (C20328OooO00o) continuation;
                    int i = c20328OooO00o.f121577OooOoO0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c20328OooO00o.f121577OooOoO0 = i - Integer.MIN_VALUE;
                    } else {
                        c20328OooO00o = new C20328OooO00o(this, continuation);
                    }
                }
                Object obj = c20328OooO00o.f121576OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c20328OooO00o.f121577OooOoO0;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    if (t == null) {
                        t = (T) C33811OooOo0O.f121897OooO00o;
                    }
                    c20328OooO00o.f121577OooOoO0 = 1;
                    if (this.f121574OooOo0o.OooOOO(t, c20328OooO00o) == enumC32485OooO00o) {
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
        public OooO0OO(InterfaceC33767OoooOoo interfaceC33767OoooOoo, Continuation continuation) {
            super(2, continuation);
            this.f121573OooOoO0 = interfaceC33767OoooOoo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f121573OooOoO0, continuation);
            oooO0OO.f121571OooOo = obj;
            return oooO0OO;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33712OooOo0O<? super Object> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33712OooOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f121572OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                OooO00o oooO00o = new OooO00o((InterfaceC33712OooOo0O) this.f121571OooOo);
                this.f121572OooOo0o = 1;
                if (this.f121573OooOoO0.collect(oooO00o, this) == enumC32485OooO00o) {
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
    public C33730OooOOOO(InterfaceC33767OoooOoo interfaceC33767OoooOoo, Continuation continuation) {
        super(3, continuation);
        this.f121564OooOoo0 = interfaceC33767OoooOoo;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, InterfaceC33723OooO0oO<Object> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        C33730OooOOOO c33730OooOOOO = new C33730OooOOOO(this.f121564OooOoo0, continuation);
        c33730OooOOOO.f121561OooOoO = interfaceC33636Oooo00o;
        c33730OooOOOO.f121563OooOoOO = interfaceC33723OooO0oO;
        return c33730OooOOOO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        InterfaceC33709OooOo interfaceC33709OooOo;
        C24034Oooo00O c24034Oooo00O;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        InterfaceC33709OooOo interfaceC33709OooOoOooO0O0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f121562OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f121561OooOoO;
            InterfaceC33723OooO0oO interfaceC33723OooO0oO2 = (InterfaceC33723OooO0oO) this.f121563OooOoOO;
            C33710OooOo0 c33710OooOo0OooO0O0 = C33711OooOo00.OooO0O0(interfaceC33636Oooo00o, null, -1, new OooO0OO(this.f121564OooOoo0, null), 1);
            interfaceC33709OooOo = c33710OooOo0OooO0O0;
            c24034Oooo00O = new C24034Oooo00O();
            interfaceC33723OooO0oO = interfaceC33723OooO0oO2;
            interfaceC33709OooOoOooO0O0 = C33711OooOo00.OooO0O0(interfaceC33636Oooo00o, null, 0, new C33728OooOOO(2, null), 1);
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC33709OooOoOooO0O0 = this.f121559OooOo;
            c24034Oooo00O = this.f121560OooOo0o;
            interfaceC33709OooOo = (InterfaceC33709OooOo) this.f121563OooOoOO;
            interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f121561OooOoO;
            C32446OooOOOo.OooO0O0(obj);
        }
        while (c24034Oooo00O.f80942OooOo0o != C33811OooOo0O.f121899OooO0OO) {
            C33890OooO0oO c33890OooO0oO = new C33890OooO0oO(getContext());
            c33890OooO0oO.OooO(interfaceC33709OooOo.OooO0o(), new OooO00o(c24034Oooo00O, interfaceC33709OooOoOooO0O0, null));
            c33890OooO0oO.OooO(interfaceC33709OooOoOooO0O0.OooOO0o(), new OooO0O0(null, c24034Oooo00O, interfaceC33723OooO0oO));
            this.f121561OooOoO = interfaceC33723OooO0oO;
            this.f121563OooOoOO = interfaceC33709OooOo;
            this.f121560OooOo0o = c24034Oooo00O;
            this.f121559OooOo = interfaceC33709OooOoOooO0O0;
            this.f121562OooOoO0 = 1;
            if ((C33890OooO0oO.f122065OooOoo0.get(c33890OooO0oO) instanceof C33890OooO0oO.OooO00o ? c33890OooO0oO.OooO0o(this) : c33890OooO0oO.OooO0oO(this)) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
