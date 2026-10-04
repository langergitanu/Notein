package o0oo0o;

import android.graphics.RectF;

/* JADX INFO: renamed from: o0oo0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC31283OooO00o {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: o0oo0o.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class EnumC20168OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final EnumC20168OooO00o f111697OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final EnumC20168OooO00o f111698OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final EnumC20168OooO00o f111699OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final EnumC20168OooO00o f111700OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final /* synthetic */ EnumC20168OooO00o[] f111701OooOoOO;

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
                o0oo0o.OooO00o$OooO00o r0 = new o0oo0o.OooO00o$OooO00o
                java.lang.String r1 = "LEFT_TOP"
                r2 = 0
                r0.<init>(r1, r2)
                o0oo0o.InterfaceC31283OooO00o.EnumC20168OooO00o.f111698OooOo0o = r0
                o0oo0o.OooO00o$OooO00o r1 = new o0oo0o.OooO00o$OooO00o
                java.lang.String r2 = "RIGHT_TOP"
                r3 = 1
                r1.<init>(r2, r3)
                o0oo0o.InterfaceC31283OooO00o.EnumC20168OooO00o.f111697OooOo = r1
                o0oo0o.OooO00o$OooO00o r2 = new o0oo0o.OooO00o$OooO00o
                java.lang.String r3 = "LEFT_BOTTOM"
                r4 = 2
                r2.<init>(r3, r4)
                o0oo0o.InterfaceC31283OooO00o.EnumC20168OooO00o.f111700OooOoO0 = r2
                o0oo0o.OooO00o$OooO00o r3 = new o0oo0o.OooO00o$OooO00o
                java.lang.String r4 = "RIGHT_BOTTOM"
                r5 = 3
                r3.<init>(r4, r5)
                o0oo0o.InterfaceC31283OooO00o.EnumC20168OooO00o.f111699OooOoO = r3
                o0oo0o.OooO00o$OooO00o[] r0 = new o0oo0o.InterfaceC31283OooO00o.EnumC20168OooO00o[]{r0, r1, r2, r3}
                o0oo0o.InterfaceC31283OooO00o.EnumC20168OooO00o.f111701OooOoOO = r0
                java.lang.Object.<init>()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o0oo0o.InterfaceC31283OooO00o.EnumC20168OooO00o.<clinit>():void");
        }

        public EnumC20168OooO00o() {
            throw null;
        }

        public static EnumC20168OooO00o valueOf(String str) {
            return (EnumC20168OooO00o) Enum.valueOf(EnumC20168OooO00o.class, str);
        }

        public static EnumC20168OooO00o[] values() {
            return (EnumC20168OooO00o[]) f111701OooOoOO.clone();
        }
    }

    RectF getClickableBound(float f);

    RectF getFixedIconBounds(float f);
}
