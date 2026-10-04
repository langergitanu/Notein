package oOo000oo;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: oOo000oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34454OooO0OO<E extends Enum<E>> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Class<E> f123483OooOo0o;

    public C34454OooO0OO(E[] entries) {
        OooOOO0.OooO0oO(entries, "entries");
        Class<E> cls = (Class<E>) entries.getClass().getComponentType();
        OooOOO0.OooO0Oo(cls);
        this.f123483OooOo0o = cls;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
        java.lang.IllegalArgumentException: Illegal Capacity: -1
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
        	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private final java.lang.Object readResolve() {
        /*
            r2 = this;
            java.lang.Class<E extends java.lang.Enum<E>> r0 = r2.f123483OooOo0o
            java.lang.Object[] r0 = r0.getEnumConstants()
            java.lang.String r1 = "getEnumConstants(...)"
            kotlin.jvm.internal.OooOOO0.OooO0o(r0, r1)
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            void r0 = java.lang.Object.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oOo000oo.C34454OooO0OO.readResolve():java.lang.Object");
    }
}
