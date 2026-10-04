package o0Ooo00o;

import com.orion.notein.domain.models.page.PageLayer;
import java.util.UUID;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0Ooo00o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29374OooO0OO extends AbstractC29372OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final PageLayer f104153OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f104154OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f104155OooO0Oo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: o0Ooo00o.OooO0OO$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f104156OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f104157OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f104158OooOoO0;

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
                o0Ooo00o.OooO0OO$OooO00o r0 = new o0Ooo00o.OooO0OO$OooO00o
                java.lang.String r1 = "ADD"
                r2 = 0
                r0.<init>(r1, r2)
                o0Ooo00o.C29374OooO0OO.OooO00o.f104157OooOo0o = r0
                o0Ooo00o.OooO0OO$OooO00o r1 = new o0Ooo00o.OooO0OO$OooO00o
                java.lang.String r2 = "REMOVE"
                r3 = 1
                r1.<init>(r2, r3)
                o0Ooo00o.C29374OooO0OO.OooO00o.f104156OooOo = r1
                o0Ooo00o.OooO0OO$OooO00o[] r0 = new o0Ooo00o.C29374OooO0OO.OooO00o[]{r0, r1}
                o0Ooo00o.C29374OooO0OO.OooO00o.f104158OooOoO0 = r0
                java.lang.Object.<init>()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o0Ooo00o.C29374OooO0OO.OooO00o.<clinit>():void");
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f104158OooOoO0.clone();
        }
    }

    public C29374OooO0OO(PageLayer pageLayer, int i, OooO00o action) {
        OooOOO0.OooO0oO(pageLayer, "pageLayer");
        OooOOO0.OooO0oO(action, "action");
        this.f104153OooO0O0 = pageLayer;
        this.f104154OooO0OO = i;
        this.f104155OooO0Oo = action;
        String string = UUID.randomUUID().toString();
        OooOOO0.OooO0oO(string, "<set-?>");
        this.f104149OooO00o = string;
    }

    @Override // o0Ooo00o.AbstractC29372OooO00o
    public final AbstractC29372OooO00o OooO00o() {
        return new C29374OooO0OO(this.f104153OooO0O0, this.f104154OooO0OO, this.f104155OooO0Oo);
    }
}
