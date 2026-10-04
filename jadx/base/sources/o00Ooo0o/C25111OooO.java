package o00Ooo0o;

import java.security.MessageDigest;
import o00Ooo0o.C25119OooO0oo;
import o00o0O0.C25309OooO0O0;

/* JADX INFO: renamed from: o00Ooo0o.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25111OooO implements InterfaceC25116OooO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25309OooO0O0 f85368OooO0O0 = new C25309OooO0O0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.File, o00o0O0.OooO0O0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final void OooO00o(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C25309OooO0O0 c25309OooO0O0 = this.f85368OooO0O0;
            if (i >= c25309OooO0O0.f58550OooOoO0) {
                return;
            }
            C25119OooO0oo c25119OooO0oo = (C25119OooO0oo) c25309OooO0O0.OooO0oO(i);
            long length = this.f85368OooO0O0.length();
            C25119OooO0oo.OooO0O0<T> oooO0O0 = c25119OooO0oo.f85387OooO0O0;
            if (c25119OooO0oo.f85389OooO0Oo == null) {
                c25119OooO0oo.f85389OooO0Oo = c25119OooO0oo.f85388OooO0OO.getBytes(InterfaceC25116OooO0o.f85383OooO00o);
            }
            oooO0O0.OooO00o(c25119OooO0oo.f85389OooO0Oo, length, messageDigest);
            i++;
        }
    }

    public final <T> T OooO0OO(C25119OooO0oo<T> c25119OooO0oo) {
        C25309OooO0O0 c25309OooO0O0 = this.f85368OooO0O0;
        return c25309OooO0O0.containsKey(c25119OooO0oo) ? (T) c25309OooO0O0.get(c25119OooO0oo) : c25119OooO0oo.f85386OooO00o;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final boolean equals(Object obj) {
        if (obj instanceof C25111OooO) {
            return this.f85368OooO0O0.equals(((C25111OooO) obj).f85368OooO0O0);
        }
        return false;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final int hashCode() {
        return this.f85368OooO0O0.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f85368OooO0O0 + '}';
    }
}
