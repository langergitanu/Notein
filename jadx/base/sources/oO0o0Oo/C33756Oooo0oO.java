package oO0o0Oo;

import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0OoO.AbstractC33791OooO0O0;
import oO0o0OoO.C33816OooOoo;
import oO0o0Ooo.C33839OooOo0;

/* JADX INFO: renamed from: oO0o0Oo.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", m80623f = "Share.kt", m80624l = {210, 214, 215, 221}, m80625m = "invokeSuspend")
public final class C33756Oooo0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33788ooOO f121691OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f121692OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AbstractC33791OooO0O0 f121693OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o<Object> f121694OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ Object f121695OooOoOO;

    /* JADX INFO: renamed from: oO0o0Oo.Oooo0oO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", m80623f = "Share.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ int f121696OooOo0o;

        public OooO00o() {
            throw null;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(2, continuation);
            oooO00o.f121696OooOo0o = ((Number) obj).intValue();
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(Integer num, Continuation<? super Boolean> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            return Boolean.valueOf(this.f121696OooOo0o > 0);
        }
    }

    /* JADX INFO: renamed from: oO0o0Oo.Oooo0oO$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", m80623f = "Share.kt", m80624l = {223}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<EnumC33776Ooooooo, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f121697OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f121698OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ AbstractC33791OooO0O0 f121699OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33721OooO0o<Object> f121700OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ Object f121701OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(InterfaceC33721OooO0o<Object> interfaceC33721OooO0o, InterfaceC33766OoooOoO<Object> interfaceC33766OoooOoO, Object obj, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f121700OooOoO0 = interfaceC33721OooO0o;
            this.f121699OooOoO = (AbstractC33791OooO0O0) interfaceC33766OoooOoO;
            this.f121701OooOoOO = obj;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [oO0o0Oo.OoooOoO, oO0o0OoO.OooO0O0] */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f121700OooOoO0, this.f121699OooOoO, this.f121701OooOoOO, continuation);
            oooO0O0.f121697OooOo = obj;
            return oooO0O0;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(EnumC33776Ooooooo enumC33776Ooooooo, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(enumC33776Ooooooo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [oO0o0Oo.OooO0oO, oO0o0Oo.OoooOoO, oO0o0OoO.OooO0O0] */
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
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f121698OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int iOrdinal = ((EnumC33776Ooooooo) this.f121697OooOo).ordinal();
                ?? r1 = this.f121699OooOoO;
                if (iOrdinal == 0) {
                    this.f121698OooOo0o = 1;
                    if (this.f121700OooOoO0.collect(r1, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new C32442OooOO0o();
                    }
                    C33839OooOo0 c33839OooOo0 = C33773Oooooo.f121761OooO00o;
                    Object obj2 = this.f121701OooOoOO;
                    if (obj2 == c33839OooOo0) {
                        r1.OooO0OO();
                    } else {
                        r1.OooO0Oo(obj2);
                    }
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
    /* JADX WARN: Multi-variable type inference failed */
    public C33756Oooo0oO(InterfaceC33788ooOO interfaceC33788ooOO, InterfaceC33721OooO0o<Object> interfaceC33721OooO0o, InterfaceC33766OoooOoO<Object> interfaceC33766OoooOoO, Object obj, Continuation<? super C33756Oooo0oO> continuation) {
        super(2, continuation);
        this.f121691OooOo = interfaceC33788ooOO;
        this.f121694OooOoO0 = interfaceC33721OooO0o;
        this.f121693OooOoO = (AbstractC33791OooO0O0) interfaceC33766OoooOoO;
        this.f121695OooOoOO = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [oO0o0Oo.OoooOoO, oO0o0OoO.OooO0O0] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C33756Oooo0oO(this.f121691OooOo, this.f121694OooOoO0, this.f121693OooOoO, this.f121695OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C33756Oooo0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r6.collect(r2, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r6.collect(r2, r8) != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (o00o00O0.C25252OooO0Oo.OooO0oO(r9, r1, r8) == r0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [oO0o0Oo.OooO0oO, oO0o0Oo.OoooOoO, oO0o0OoO.OooO0O0] */
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
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f121692OooOo0o;
        ?? r2 = this.f121693OooOoO;
        InterfaceC33721OooO0o<Object> interfaceC33721OooO0o = this.f121694OooOoO0;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C32446OooOOOo.OooO0O0(obj);
                    this.f121692OooOo0o = 3;
                } else if (i != 3 && i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        oO0000oo.OooO0OO oooO0OO = InterfaceC33788ooOO.OooO00o.f121818OooO00o;
        InterfaceC33788ooOO interfaceC33788ooOO = this.f121691OooOo;
        if (interfaceC33788ooOO != oooO0OO) {
            if (interfaceC33788ooOO == InterfaceC33788ooOO.OooO00o.f121819OooO0O0) {
                C33816OooOoo c33816OooOooOooO0o = r2.OooO0o();
                OooO00o oooO00o = new OooO00o(2, null);
                this.f121692OooOo0o = 2;
                if (C25252OooO0Oo.OooOOoo(c33816OooOooOooO0o, oooO00o, this) != enumC32485OooO00o) {
                    this.f121692OooOo0o = 3;
                }
            } else {
                InterfaceC33721OooO0o interfaceC33721OooO0oOooOO0o = C25252OooO0Oo.OooOO0o(interfaceC33788ooOO.OooO00o(r2.OooO0o()));
                OooO0O0 oooO0O0 = new OooO0O0(interfaceC33721OooO0o, r2, this.f121695OooOoOO, null);
                this.f121692OooOo0o = 4;
            }
            return enumC32485OooO00o;
        }
        this.f121692OooOo0o = 1;
    }
}
