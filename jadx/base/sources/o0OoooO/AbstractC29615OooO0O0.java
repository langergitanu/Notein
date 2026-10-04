package o0OoooO;

import java.io.File;

/* JADX INFO: renamed from: o0OoooO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC29615OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final File f104992OooO00o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: o0OoooO.OooO0O0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f104993OooOo0o;

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
                o0OoooO.OooO0O0$OooO00o r0 = new o0OoooO.OooO0O0$OooO00o
                java.lang.String r1 = "Gemini"
                r2 = 0
                r0.<init>(r1, r2)
                o0OoooO.OooO0O0$OooO00o[] r0 = new o0OoooO.AbstractC29615OooO0O0.OooO00o[]{r0}
                o0OoooO.AbstractC29615OooO0O0.OooO00o.f104993OooOo0o = r0
                java.lang.Object.<init>()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OoooO.AbstractC29615OooO0O0.OooO00o.<clinit>():void");
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f104993OooOo0o.clone();
        }
    }

    public AbstractC29615OooO0O0(File file) {
        this.f104992OooO00o = file;
    }
}
