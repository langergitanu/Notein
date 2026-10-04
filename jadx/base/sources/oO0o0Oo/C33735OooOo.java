package oO0o0Oo;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24030OooOoo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: oO0o0Oo.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33735OooOo<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO<T> f121589OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C24030OooOoo f121590OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AbstractC32476OooO f121591OooOoO0;

    /* JADX INFO: renamed from: oO0o0Oo.OooOo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", m80623f = "Limit.kt", m80624l = {33, 34, 36}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public Object f121592OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C33735OooOo f121593OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ C33735OooOo<T> f121594OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ Object f121595OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f121596OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(C33735OooOo<? super T> c33735OooOo, Continuation<? super OooO00o> continuation) {
            super(continuation);
            this.f121594OooOoO = c33735OooOo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f121595OooOoO0 = obj;
            this.f121596OooOoOO |= Integer.MIN_VALUE;
            return this.f121594OooOoO.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33735OooOo(C24030OooOoo c24030OooOoo, InterfaceC33723OooO0oO<? super T> interfaceC33723OooO0oO, InterfaceC32508OooOOOo<? super T, ? super Continuation<? super Boolean>, ? extends Object> interfaceC32508OooOOOo) {
        this.f121590OooOo0o = c24030OooOoo;
        this.f121589OooOo = interfaceC33723OooO0oO;
        this.f121591OooOoO0 = (AbstractC32476OooO) interfaceC32508OooOOOo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r6.f121589OooOo.emit(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        if (r2.f121589OooOo.emit(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v4, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
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
        OooO00o oooO00o;
        C33735OooOo<T> c33735OooOo;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f121596OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f121596OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(this, continuation);
            }
        }
        Object objInvoke = oooO00o.f121595OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f121596OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objInvoke);
            if (this.f121590OooOo0o.f80938OooOo0o) {
                oooO00o.f121596OooOoOO = 1;
            } else {
                oooO00o.f121593OooOo0o = this;
                oooO00o.f121592OooOo = t;
                oooO00o.f121596OooOoOO = 2;
                objInvoke = this.f121591OooOoO0.invoke(t, oooO00o);
                if (objInvoke != enumC32485OooO00o) {
                    c33735OooOo = this;
                    if (!((Boolean) objInvoke).booleanValue()) {
                    }
                }
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            C32446OooOOOo.OooO0O0(objInvoke);
            return C32460OooOooO.f116667OooO00o;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objInvoke);
            return C32460OooOooO.f116667OooO00o;
        }
        t = (T) oooO00o.f121592OooOo;
        c33735OooOo = oooO00o.f121593OooOo0o;
        C32446OooOOOo.OooO0O0(objInvoke);
        if (!((Boolean) objInvoke).booleanValue()) {
            return C32460OooOooO.f116667OooO00o;
        }
        c33735OooOo.f121590OooOo0o.f80938OooOo0o = true;
        oooO00o.f121593OooOo0o = null;
        oooO00o.f121592OooOo = null;
        oooO00o.f121596OooOoOO = 3;
    }
}
