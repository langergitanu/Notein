package oO00Ooo;

import java.util.Arrays;
import oO00Ooo.AbstractC32308OooOo0o;

/* JADX INFO: renamed from: oO00Ooo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32302OooOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C32302OooOOOo f116206OooO00o;

    static {
        new AbstractC32308OooOo0o.OooO00o(AbstractC32308OooOo0o.OooO00o.f116225OooO0O0);
        f116206OooO00o = new C32302OooOOOo();
    }

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
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C32302OooOOOo)) {
            return false;
        }
        ((C32302OooOOOo) obj).getClass();
        OooOo00 oooOo00 = OooOo00.f116223OooOo0o;
        if (!oooOo00.equals(oooOo00)) {
            return false;
        }
        C32304OooOOo0 c32304OooOOo0 = C32304OooOOo0.f116217OooOo0o;
        if (!c32304OooOOo0.equals(c32304OooOOo0)) {
            return false;
        }
        C32306OooOo0 c32306OooOo0 = C32306OooOo0.f116221OooO0O0;
        return c32306OooOo0.equals(c32306OooOo0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{OooOo00.f116223OooOo0o, C32304OooOOo0.f116217OooOo0o, C32306OooOo0.f116221OooO0O0});
    }

    public final String toString() {
        return "SpanContext{traceId=" + OooOo00.f116223OooOo0o + ", spanId=" + C32304OooOOo0.f116217OooOo0o + ", traceOptions=" + C32306OooOo0.f116221OooO0O0 + "}";
    }
}
