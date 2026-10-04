package o0oOoOo;

import OooOoo0.o00000;

/* JADX INFO: renamed from: o0oOoOo.OoooooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31088OoooooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110954OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f110955OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f110956OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f110957OooO0Oo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: o0oOoOo.OoooooO$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f110958OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f110959OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f110960OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f110961OooOoO0;

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
                o0oOoOo.OoooooO$OooO00o r0 = new o0oOoOo.OoooooO$OooO00o
                java.lang.String r1 = "TODAY"
                r2 = 0
                r0.<init>(r1, r2)
                o0oOoOo.C31088OoooooO.OooO00o.f110959OooOo0o = r0
                o0oOoOo.OoooooO$OooO00o r1 = new o0oOoOo.OoooooO$OooO00o
                java.lang.String r2 = "BEFORE_WEEK"
                r3 = 1
                r1.<init>(r2, r3)
                o0oOoOo.C31088OoooooO.OooO00o.f110958OooOo = r1
                o0oOoOo.OoooooO$OooO00o r2 = new o0oOoOo.OoooooO$OooO00o
                java.lang.String r3 = "BEFORE_MONTH"
                r4 = 2
                r2.<init>(r3, r4)
                o0oOoOo.C31088OoooooO.OooO00o.f110961OooOoO0 = r2
                o0oOoOo.OoooooO$OooO00o[] r0 = new o0oOoOo.C31088OoooooO.OooO00o[]{r0, r1, r2}
                o0oOoOo.C31088OoooooO.OooO00o.f110960OooOoO = r0
                java.lang.Object.<init>()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o0oOoOo.C31088OoooooO.OooO00o.<clinit>():void");
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f110960OooOoO.clone();
        }
    }

    public C31088OoooooO(String id, String title, long j, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        kotlin.jvm.internal.OooOOO0.OooO0oO(title, "title");
        this.f110954OooO00o = id;
        this.f110955OooO0O0 = title;
        this.f110956OooO0OO = z;
        this.f110957OooO0Oo = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31088OoooooO)) {
            return false;
        }
        C31088OoooooO c31088OoooooO = (C31088OoooooO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110954OooO00o, c31088OoooooO.f110954OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110955OooO0O0, c31088OoooooO.f110955OooO0O0) && this.f110956OooO0OO == c31088OoooooO.f110956OooO0OO && this.f110957OooO0Oo == c31088OoooooO.f110957OooO0Oo;
    }

    public final int hashCode() {
        return Long.hashCode(this.f110957OooO0Oo) + o00000.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f110954OooO00o.hashCode() * 31, 31, this.f110955OooO0O0), 31, this.f110956OooO0OO);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextRecognizeSessionVO(id=");
        sb.append(this.f110954OooO00o);
        sb.append(", title=");
        sb.append(this.f110955OooO0O0);
        sb.append(", isSelected=");
        sb.append(this.f110956OooO0OO);
        sb.append(", lastModificationTime=");
        return android.support.v4.media.session.OooO00o.OooO00o(this.f110957OooO0Oo, ")", sb);
    }
}
