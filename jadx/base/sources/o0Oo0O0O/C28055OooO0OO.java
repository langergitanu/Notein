package o0Oo0O0O;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32449OooOOoo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32509OooOOo;
import oO0O000o.InterfaceC32513OooOo0O;

/* JADX INFO: renamed from: o0Oo0O0O.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ext.kotlinx.FlowCombineExtKt$combine$14", m80623f = "FlowCombineExt.kt", m80624l = {41}, m80625m = "invokeSuspend")
public final class C28055OooO0OO extends AbstractC32476OooO implements InterfaceC32509OooOOo<C32449OooOOoo<Object, Object, Object>, C32449OooOOoo<Object, Object, Object>, Object, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ C32449OooOOoo f99451OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99452OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f99453OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ C32449OooOOoo f99454OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ AbstractC32476OooO f99455OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C28055OooO0OO(InterfaceC32513OooOo0O<Object, Object, Object, Object, Object, Object, Object, ? super Continuation<Object>, ? extends Object> interfaceC32513OooOo0O, Continuation<? super C28055OooO0OO> continuation) {
        super(4, continuation);
        this.f99455OooOoOO = (AbstractC32476OooO) interfaceC32513OooOo0O;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [oO00ooo.OooO, oO0O000o.OooOo0O] */
    @Override // oO0O000o.InterfaceC32509OooOOo
    public final Object invoke(C32449OooOOoo<Object, Object, Object> c32449OooOOoo, C32449OooOOoo<Object, Object, Object> c32449OooOOoo2, Object obj, Continuation<Object> continuation) {
        C28055OooO0OO c28055OooO0OO = new C28055OooO0OO(this.f99455OooOoOO, continuation);
        c28055OooO0OO.f99451OooOo = c32449OooOOoo;
        c28055OooO0OO.f99454OooOoO0 = c32449OooOOoo2;
        c28055OooO0OO.f99453OooOoO = obj;
        return c28055OooO0OO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [oO00ooo.OooO, oO0O000o.OooOo0O] */
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
        int i = this.f99452OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C32449OooOOoo c32449OooOOoo = this.f99451OooOo;
        C32449OooOOoo c32449OooOOoo2 = this.f99454OooOoO0;
        Object obj2 = this.f99453OooOoO;
        A a = c32449OooOOoo.f116648OooOo0o;
        A a2 = c32449OooOOoo2.f116648OooOo0o;
        this.f99451OooOo = null;
        this.f99454OooOoO0 = null;
        this.f99452OooOo0o = 1;
        Object objO0Oo0oo = this.f99455OooOoOO.o0Oo0oo(a, c32449OooOOoo.f116647OooOo, c32449OooOOoo.f116649OooOoO0, a2, c32449OooOOoo2.f116647OooOo, c32449OooOOoo2.f116649OooOoO0, obj2, this);
        return objO0Oo0oo == enumC32485OooO00o ? enumC32485OooO00o : objO0Oo0oo;
    }
}
