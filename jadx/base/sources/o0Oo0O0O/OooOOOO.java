package o0Oo0O0O;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32449OooOOoo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0O000o.InterfaceC32512OooOo0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ext.kotlinx.FlowCombineExtKt$combine$7", m80623f = "FlowCombineExt.kt", m80624l = {17}, m80625m = "invokeSuspend")
public final class OooOOOO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<C32449OooOOoo<Object, Object, Object>, C32449OooOOoo<Object, Object, Object>, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ C32449OooOOoo f99475OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99476OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AbstractC32476OooO f99477OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ C32449OooOOoo f99478OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooOOOO(InterfaceC32512OooOo0<Object, Object, Object, Object, Object, Object, ? super Continuation<Object>, ? extends Object> interfaceC32512OooOo0, Continuation<? super OooOOOO> continuation) {
        super(3, continuation);
        this.f99477OooOoO = (AbstractC32476OooO) interfaceC32512OooOo0;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [oO00ooo.OooO, oO0O000o.OooOo0] */
    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(C32449OooOOoo<Object, Object, Object> c32449OooOOoo, C32449OooOOoo<Object, Object, Object> c32449OooOOoo2, Continuation<Object> continuation) {
        OooOOOO oooOOOO = new OooOOOO(this.f99477OooOoO, continuation);
        oooOOOO.f99475OooOo = c32449OooOOoo;
        oooOOOO.f99478OooOoO0 = c32449OooOOoo2;
        return oooOOOO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [oO00ooo.OooO, oO0O000o.OooOo0] */
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
        int i = this.f99476OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C32449OooOOoo c32449OooOOoo = this.f99475OooOo;
        C32449OooOOoo c32449OooOOoo2 = this.f99478OooOoO0;
        A a = c32449OooOOoo.f116648OooOo0o;
        A a2 = c32449OooOOoo2.f116648OooOo0o;
        this.f99475OooOo = null;
        this.f99476OooOo0o = 1;
        Object objOoooO0 = this.f99477OooOoO.OoooO0(a, c32449OooOOoo.f116647OooOo, c32449OooOOoo.f116649OooOoO0, a2, c32449OooOOoo2.f116647OooOo, c32449OooOOoo2.f116649OooOoO0, this);
        return objOoooO0 == enumC32485OooO00o ? enumC32485OooO00o : objOoooO0;
    }
}
