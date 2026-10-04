package androidx.ink.authoring.internal;

import androidx.graphics.surface.SurfaceControlCompat;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: androidx.ink.authoring.internal.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21941OooO0oO implements SurfaceControlCompat.TransactionCommittedListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO0o<Object, o000O0oO.OooO0O0<Object, Object>, Object>.C19024OooO0o f65261OooO00o;

    public C21941OooO0oO(OooO0o<Object, o000O0oO.OooO0O0<Object, Object>, Object>.C19024OooO0o c19024OooO0o) {
        this.f65261OooO00o = c19024OooO0o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [o000O0oo.OooOo00] */
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
    @Override // androidx.graphics.surface.SurfaceControlCompat.TransactionCommittedListener
    public final void onTransactionCommitted() {
        final OooO0o<Object, o000O0oO.OooO0O0<Object, Object>, Object>.C19024OooO0o c19024OooO0o = this.f65261OooO00o;
        if (c19024OooO0o.f65236OooO0OO.get()) {
            return;
        }
        ?? r1 = new Runnable() { // from class: o000O0oo.OooOo00
            @Override // java.lang.Runnable
            public final void run() {
                c19024OooO0o.OooO0o0();
            }
        };
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c19024OooO0o.f65235OooO0O0.o0000Oo0(r1);
    }
}
