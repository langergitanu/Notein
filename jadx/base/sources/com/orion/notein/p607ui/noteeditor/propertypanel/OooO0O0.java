package com.orion.notein.p607ui.noteeditor.propertypanel;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO0O0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f75496OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f75497OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f75498OooOoO0;

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
                com.orion.notein.ui.noteeditor.propertypanel.OooO0O0$OooO00o r0 = new com.orion.notein.ui.noteeditor.propertypanel.OooO0O0$OooO00o
                java.lang.String r1 = "DEFAULT"
                r2 = 0
                r0.<init>(r1, r2)
                com.orion.notein.ui.noteeditor.propertypanel.OooO0O0.OooO00o.f75497OooOo0o = r0
                com.orion.notein.ui.noteeditor.propertypanel.OooO0O0$OooO00o r1 = new com.orion.notein.ui.noteeditor.propertypanel.OooO0O0$OooO00o
                java.lang.String r2 = "AI"
                r3 = 1
                r1.<init>(r2, r3)
                com.orion.notein.ui.noteeditor.propertypanel.OooO0O0.OooO00o.f75496OooOo = r1
                com.orion.notein.ui.noteeditor.propertypanel.OooO0O0$OooO00o[] r0 = new com.orion.notein.ui.noteeditor.propertypanel.OooO0O0.OooO00o[]{r0, r1}
                com.orion.notein.ui.noteeditor.propertypanel.OooO0O0.OooO00o.f75498OooOoO0 = r0
                java.lang.Object.<init>()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.ui.noteeditor.propertypanel.OooO0O0.OooO00o.<clinit>():void");
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f75498OooOoO0.clone();
        }
    }

    public abstract o00O00OO.OooO0O0 OooO00o(Fragment fragment);

    public abstract String OooO0O0(Context context, int i);

    public abstract TabLayoutMediator OooO0OO(Context context, TabLayout tabLayout, ViewPager2 viewPager2);
}
