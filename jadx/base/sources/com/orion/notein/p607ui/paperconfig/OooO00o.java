package com.orion.notein.p607ui.paperconfig;

import android.content.Context;
import android.view.View;
import o0o0OOO.C30520o000000o;
import oO00ooo.AbstractC32479OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO00o {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: com.orion.notein.ui.paperconfig.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class EnumC19455OooO00o {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final /* synthetic */ EnumC19455OooO00o[] f78654OooOo0o;

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
                com.orion.notein.ui.paperconfig.OooO00o$OooO00o r0 = new com.orion.notein.ui.paperconfig.OooO00o$OooO00o
                java.lang.String r1 = "CREATE_NOTE"
                r2 = 0
                r0.<init>(r1, r2)
                com.orion.notein.ui.paperconfig.OooO00o$OooO00o r1 = new com.orion.notein.ui.paperconfig.OooO00o$OooO00o
                java.lang.String r2 = "CHANGE_TEMPLATE"
                r3 = 1
                r1.<init>(r2, r3)
                com.orion.notein.ui.paperconfig.OooO00o$OooO00o r2 = new com.orion.notein.ui.paperconfig.OooO00o$OooO00o
                java.lang.String r3 = "ADD_PAGE"
                r4 = 2
                r2.<init>(r3, r4)
                com.orion.notein.ui.paperconfig.OooO00o$OooO00o[] r0 = new com.orion.notein.p607ui.paperconfig.OooO00o.EnumC19455OooO00o[]{r0, r1, r2}
                com.orion.notein.p607ui.paperconfig.OooO00o.EnumC19455OooO00o.f78654OooOo0o = r0
                java.lang.Object.<init>()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.p607ui.paperconfig.OooO00o.EnumC19455OooO00o.<clinit>():void");
        }

        public EnumC19455OooO00o() {
            throw null;
        }

        public static EnumC19455OooO00o valueOf(String str) {
            return (EnumC19455OooO00o) Enum.valueOf(EnumC19455OooO00o.class, str);
        }

        public static EnumC19455OooO00o[] values() {
            return (EnumC19455OooO00o[]) f78654OooOo0o.clone();
        }
    }

    public abstract void OooO00o(View view);

    public boolean OooO0O0() {
        return false;
    }

    public boolean OooO0OO() {
        return false;
    }

    public boolean OooO0Oo() {
        return false;
    }

    public abstract String OooO0o(Context context);

    public boolean OooO0o0() {
        return false;
    }

    public abstract Object OooO0oO(C30520o000000o c30520o000000o, PaperConfigDialogFragment paperConfigDialogFragment, AbstractC32479OooO0OO abstractC32479OooO0OO);
}
