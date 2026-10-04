package oO0o0Oo;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OoO.C33790OooO00o;

/* JADX INFO: renamed from: oO0o0Oo.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33750Oooo00O implements InterfaceC33723OooO0oO<Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24034Oooo00O f121664OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractC32476OooO f121665OooOo0o;

    /* JADX INFO: renamed from: oO0o0Oo.Oooo00O$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", m80623f = "Reduce.kt", m80624l = {131}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f121666OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C33750Oooo00O f121667OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f121669OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public Object f121670OooOoOO;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f121666OooOo = obj;
            this.f121669OooOoO0 |= Integer.MIN_VALUE;
            return C33750Oooo00O.this.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33750Oooo00O(InterfaceC32508OooOOOo interfaceC32508OooOOOo, C24034Oooo00O c24034Oooo00O) {
        this.f121665OooOo0o = (AbstractC32476OooO) interfaceC32508OooOOOo;
        this.f121664OooOo = c24034Oooo00O;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v2, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
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
    public final Object emit(Object obj, Continuation<? super C32460OooOooO> continuation) {
        OooO00o oooO00o;
        C33750Oooo00O c33750Oooo00O;
        T t;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f121669OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f121669OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object objInvoke = oooO00o.f121666OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f121669OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objInvoke);
            oooO00o.f121667OooOo0o = this;
            oooO00o.f121670OooOoOO = obj;
            oooO00o.f121669OooOoO0 = 1;
            objInvoke = this.f121665OooOo0o.invoke(obj, oooO00o);
            if (objInvoke == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c33750Oooo00O = this;
            t = obj;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = oooO00o.f121670OooOoOO;
            c33750Oooo00O = oooO00o.f121667OooOo0o;
            C32446OooOOOo.OooO0O0(objInvoke);
            t = obj2;
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return C32460OooOooO.f116667OooO00o;
        }
        c33750Oooo00O.f121664OooOo.f80942OooOo0o = t;
        throw new C33790OooO00o(c33750Oooo00O);
    }
}
