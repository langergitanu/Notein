package oO0O000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ OooO0o[] f116776OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooO0o f116777OooOo0o;

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
            oO0O000.OooO0o r0 = new oO0O000.OooO0o
            java.lang.String r1 = "TOP_DOWN"
            r2 = 0
            r0.<init>(r1, r2)
            oO0O000.OooO0o r1 = new oO0O000.OooO0o
            java.lang.String r2 = "BOTTOM_UP"
            r3 = 1
            r1.<init>(r2, r3)
            oO0O000.OooO0o.f116777OooOo0o = r1
            oO0O000.OooO0o[] r0 = new oO0O000.OooO0o[]{r0, r1}
            oO0O000.OooO0o.f116776OooOo = r0
            java.lang.Object.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oO0O000.OooO0o.<clinit>():void");
    }

    public OooO0o() {
        throw null;
    }

    public static OooO0o valueOf(String str) {
        return (OooO0o) Enum.valueOf(OooO0o.class, str);
    }

    public static OooO0o[] values() {
        return (OooO0o[]) f116776OooOo.clone();
    }
}
