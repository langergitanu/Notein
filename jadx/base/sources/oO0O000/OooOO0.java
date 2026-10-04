package oO0O000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ OooOO0[] f116797OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooOO0 f116798OooOo0o;

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
    static {
        /*
            oO0O000.OooOO0 r0 = new oO0O000.OooOO0
            java.lang.String r1 = "SKIP"
            r2 = 0
            r0.<init>(r1, r2)
            oO0O000.OooOO0.f116798OooOo0o = r0
            oO0O000.OooOO0 r1 = new oO0O000.OooOO0
            java.lang.String r2 = "TERMINATE"
            r3 = 1
            r1.<init>(r2, r3)
            oO0O000.OooOO0[] r0 = new oO0O000.OooOO0[]{r0, r1}
            oO0O000.OooOO0.f116797OooOo = r0
            java.lang.Object.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oO0O000.OooOO0.<clinit>():void");
    }

    public OooOO0() {
        throw null;
    }

    public static OooOO0 valueOf(String str) {
        return (OooOO0) Enum.valueOf(OooOO0.class, str);
    }

    public static OooOO0[] values() {
        return (OooOO0[]) f116797OooOo.clone();
    }
}
