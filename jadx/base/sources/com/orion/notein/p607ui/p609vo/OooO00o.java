package com.orion.notein.p607ui.p609vo;

import java.util.ArrayList;
import o0oOoOo.C31076OoooOOO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final OooO00o f80085OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final C19582OooO00o f80086OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final OooO00o f80087OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final OooO00o f80088OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final OooO00o f80089OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final OooO00o f80090OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final OooO00o f80091OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final OooO00o f80092Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final OooO00o f80093Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final OooO00o f80094Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final OooO00o f80095Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final OooO00o f80096Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public static final OooO00o f80097Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public static final /* synthetic */ OooO00o[] f80098Oooo0o0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC32508OooOOOo<C31076OoooOOO, C31076OoooOOO, Integer> f80099OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f80100OooOo0o;

    /* JADX INFO: renamed from: com.orion.notein.ui.vo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19582OooO00o {
        public static ArrayList OooO00o() {
            OooO00o[] oooO00oArrValues = OooO00o.values();
            ArrayList arrayList = new ArrayList();
            for (OooO00o oooO00o : oooO00oArrValues) {
                if (oooO00o == OooO00o.f80085OooOoO || oooO00o == OooO00o.f80087OooOoOO || oooO00o == OooO00o.f80088OooOoo || oooO00o == OooO00o.f80090OooOooO || oooO00o == OooO00o.f80094Oooo00O || oooO00o == OooO00o.f80095Oooo00o || oooO00o == OooO00o.f80092Oooo0) {
                    arrayList.add(oooO00o);
                }
            }
            return arrayList;
        }
    }

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
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.p607ui.p609vo.OooO00o.<clinit>():void");
    }

    public OooO00o(String str, int i, int i2, InterfaceC32508OooOOOo interfaceC32508OooOOOo) {
        this.f80100OooOo0o = i2;
        this.f80099OooOo = interfaceC32508OooOOOo;
    }

    public static OooO00o valueOf(String str) {
        return (OooO00o) Enum.valueOf(OooO00o.class, str);
    }

    public static OooO00o[] values() {
        return (OooO00o[]) f80098Oooo0o0.clone();
    }
}
