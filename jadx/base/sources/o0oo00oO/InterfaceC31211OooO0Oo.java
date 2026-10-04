package o0oo00oO;

/* JADX INFO: renamed from: o0oo00oO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC31211OooO0Oo {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: o0oo00oO.OooO0Oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f111300OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f111301OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO00o f111302OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f111303OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final OooO00o f111304OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f111305OooOoo0;

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
                o0oo00oO.OooO0Oo$OooO00o r0 = new o0oo00oO.OooO0Oo$OooO00o
                java.lang.String r1 = "STYLUS_EVENT"
                r2 = 0
                r0.<init>(r1, r2)
                o0oo00oO.InterfaceC31211OooO0Oo.OooO00o.f111301OooOo0o = r0
                o0oo00oO.OooO0Oo$OooO00o r1 = new o0oo00oO.OooO0Oo$OooO00o
                java.lang.String r2 = "STROKE_PREDICTION"
                r3 = 1
                r1.<init>(r2, r3)
                o0oo00oO.InterfaceC31211OooO0Oo.OooO00o.f111300OooOo = r1
                o0oo00oO.OooO0Oo$OooO00o r2 = new o0oo00oO.OooO0Oo$OooO00o
                java.lang.String r3 = "HOVER_PREVIEW"
                r4 = 2
                r2.<init>(r3, r4)
                o0oo00oO.InterfaceC31211OooO0Oo.OooO00o.f111303OooOoO0 = r2
                o0oo00oO.OooO0Oo$OooO00o r3 = new o0oo00oO.OooO0Oo$OooO00o
                java.lang.String r4 = "COLOR_PICK"
                r5 = 3
                r3.<init>(r4, r5)
                o0oo00oO.InterfaceC31211OooO0Oo.OooO00o.f111302OooOoO = r3
                o0oo00oO.OooO0Oo$OooO00o r4 = new o0oo00oO.OooO0Oo$OooO00o
                java.lang.String r5 = "POSTURE_DETECTION"
                r6 = 4
                r4.<init>(r5, r6)
                o0oo00oO.InterfaceC31211OooO0Oo.OooO00o.f111304OooOoOO = r4
                o0oo00oO.OooO0Oo$OooO00o[] r0 = new o0oo00oO.InterfaceC31211OooO0Oo.OooO00o[]{r0, r1, r2, r3, r4}
                o0oo00oO.InterfaceC31211OooO0Oo.OooO00o.f111305OooOoo0 = r0
                java.lang.Object.<init>()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o0oo00oO.InterfaceC31211OooO0Oo.OooO00o.<clinit>():void");
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f111305OooOoo0.clone();
        }
    }

    <T> T OooO00o(OooO00o oooO00o);

    boolean initialize();

    void release();
}
