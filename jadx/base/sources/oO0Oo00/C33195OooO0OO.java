package oO0Oo00;

import kotlin.jvm.internal.C24034Oooo00O;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0.C33552OooO00o;

/* JADX INFO: renamed from: oO0Oo00.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33195OooO0OO extends C33552OooO00o.OooO0O0<oO0O0OO.OooO0O0, oO0O0OO.OooO0O0> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C24034Oooo00O<oO0O0OO.OooO0O0> f120132OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f120133OooO0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public C33195OooO0OO(InterfaceC32507OooOO0o interfaceC32507OooOO0o, C24034Oooo00O c24034Oooo00O) {
        this.f120132OooO00o = c24034Oooo00O;
        this.f120133OooO0O0 = (OooOOOO) interfaceC32507OooOO0o;
    }

    @Override // oO0o0O0.C33552OooO00o.InterfaceC33553OooO0Oo
    public final Object OooO00o() {
        return this.f120132OooO00o.f80942OooOo0o;
    }

    @Override // oO0o0O0.C33552OooO00o.InterfaceC33553OooO0Oo
    public final boolean OooO0O0(Object obj) {
        oO0O0OO.OooO0O0 current = (oO0O0OO.OooO0O0) obj;
        OooOOO0.OooO0oO(current, "current");
        return this.f120132OooO00o.f80942OooOo0o == null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object, oO0O0OO.OooO0O0] */
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
    @Override // oO0o0O0.C33552OooO00o.OooO0O0, oO0o0O0.C33552OooO00o.InterfaceC33553OooO0Oo
    public final void OooO0OO(Object obj) {
        ?? current = (oO0O0OO.OooO0O0) obj;
        OooOOO0.OooO0oO(current, "current");
        C24034Oooo00O<oO0O0OO.OooO0O0> c24034Oooo00O = this.f120132OooO00o;
        if (c24034Oooo00O.f80942OooOo0o == null && ((Boolean) this.f120133OooO0O0.invoke(current)).booleanValue()) {
            c24034Oooo00O.f80942OooOo0o = current;
        }
    }
}
