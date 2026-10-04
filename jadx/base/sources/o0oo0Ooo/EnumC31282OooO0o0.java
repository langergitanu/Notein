package o0oo0Ooo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: o0oo0Ooo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC31282OooO0o0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC31282OooO0o0 f111693OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ EnumC31282OooO0o0[] f111694OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final EnumC31282OooO0o0 f111695OooOoO0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f111696OooOo0o;

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
            o0oo0Ooo.OooO0o0 r0 = new o0oo0Ooo.OooO0o0
            java.lang.String r1 = "V1"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            o0oo0Ooo.EnumC31282OooO0o0.f111693OooOo = r0
            o0oo0Ooo.OooO0o0 r1 = new o0oo0Ooo.OooO0o0
            java.lang.String r2 = "V2"
            r4 = 2
            r1.<init>(r2, r3, r4)
            o0oo0Ooo.EnumC31282OooO0o0.f111695OooOoO0 = r1
            o0oo0Ooo.OooO0o0[] r0 = new o0oo0Ooo.EnumC31282OooO0o0[]{r0, r1}
            o0oo0Ooo.EnumC31282OooO0o0.f111694OooOoO = r0
            java.lang.Object.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0oo0Ooo.EnumC31282OooO0o0.<clinit>():void");
    }

    public EnumC31282OooO0o0(String str, int i, int i2) {
        this.f111696OooOo0o = i2;
    }

    public static EnumC31282OooO0o0 valueOf(String str) {
        return (EnumC31282OooO0o0) Enum.valueOf(EnumC31282OooO0o0.class, str);
    }

    public static EnumC31282OooO0o0[] values() {
        return (EnumC31282OooO0o0[]) f111694OooOoO.clone();
    }
}
