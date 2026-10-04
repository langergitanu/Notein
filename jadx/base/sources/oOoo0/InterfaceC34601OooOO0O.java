package oOoo0;

import oO0O0O0.C32567Oooo;

/* JADX INFO: renamed from: oOoo0.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC34601OooOO0O extends InterfaceC34593OooO0O0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: oOoo0.OooOO0O$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f123970OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f123971OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f123972OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f123973OooOoO0;

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
                oOoo0.OooOO0O$OooO00o r0 = new oOoo0.OooOO0O$OooO00o
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                oOoo0.InterfaceC34601OooOO0O.OooO00o.f123971OooOo0o = r0
                oOoo0.OooOO0O$OooO00o r1 = new oOoo0.OooOO0O$OooO00o
                java.lang.String r2 = "EXTENSION_RECEIVER"
                r3 = 1
                r1.<init>(r2, r3)
                oOoo0.InterfaceC34601OooOO0O.OooO00o.f123970OooOo = r1
                oOoo0.OooOO0O$OooO00o r2 = new oOoo0.OooOO0O$OooO00o
                java.lang.String r3 = "VALUE"
                r4 = 2
                r2.<init>(r3, r4)
                oOoo0.InterfaceC34601OooOO0O.OooO00o.f123973OooOoO0 = r2
                oOoo0.OooOO0O$OooO00o[] r0 = new oOoo0.InterfaceC34601OooOO0O.OooO00o[]{r0, r1, r2}
                oOoo0.InterfaceC34601OooOO0O.OooO00o.f123972OooOoO = r0
                java.lang.Object.<init>()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: oOoo0.InterfaceC34601OooOO0O.OooO00o.<clinit>():void");
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f123972OooOoO.clone();
        }
    }

    boolean OooO00o();

    boolean OooO0o();

    int getIndex();

    OooO00o getKind();

    String getName();

    C32567Oooo getType();
}
