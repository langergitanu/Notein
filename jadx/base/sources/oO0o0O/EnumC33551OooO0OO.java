package oO0o0O;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: oO0o0O.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC33551OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC33551OooO0OO f121151OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final EnumC33551OooO0OO f121152OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final EnumC33551OooO0OO f121153OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final EnumC33551OooO0OO f121154OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final EnumC33551OooO0OO f121155OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final EnumC33551OooO0OO f121156OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final /* synthetic */ EnumC33551OooO0OO[] f121157OooOooO;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final TimeUnit f121158OooOo0o;

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
            oO0o0O.OooO0OO r0 = new oO0o0O.OooO0OO
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.lang.String r2 = "NANOSECONDS"
            r3 = 0
            r0.<init>(r2, r3, r1)
            oO0o0O.EnumC33551OooO0OO.f121151OooOo = r0
            oO0o0O.OooO0OO r1 = new oO0o0O.OooO0OO
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MICROSECONDS
            java.lang.String r3 = "MICROSECONDS"
            r4 = 1
            r1.<init>(r3, r4, r2)
            oO0o0O.OooO0OO r2 = new oO0o0O.OooO0OO
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r4 = "MILLISECONDS"
            r5 = 2
            r2.<init>(r4, r5, r3)
            oO0o0O.EnumC33551OooO0OO.f121153OooOoO0 = r2
            oO0o0O.OooO0OO r3 = new oO0o0O.OooO0OO
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.String r5 = "SECONDS"
            r6 = 3
            r3.<init>(r5, r6, r4)
            oO0o0O.EnumC33551OooO0OO.f121152OooOoO = r3
            oO0o0O.OooO0OO r4 = new oO0o0O.OooO0OO
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MINUTES
            java.lang.String r6 = "MINUTES"
            r7 = 4
            r4.<init>(r6, r7, r5)
            oO0o0O.EnumC33551OooO0OO.f121154OooOoOO = r4
            oO0o0O.OooO0OO r5 = new oO0o0O.OooO0OO
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.HOURS
            java.lang.String r7 = "HOURS"
            r8 = 5
            r5.<init>(r7, r8, r6)
            oO0o0O.EnumC33551OooO0OO.f121156OooOoo0 = r5
            oO0o0O.OooO0OO r6 = new oO0o0O.OooO0OO
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.DAYS
            java.lang.String r8 = "DAYS"
            r9 = 6
            r6.<init>(r8, r9, r7)
            oO0o0O.EnumC33551OooO0OO.f121155OooOoo = r6
            oO0o0O.OooO0OO[] r0 = new oO0o0O.EnumC33551OooO0OO[]{r0, r1, r2, r3, r4, r5, r6}
            oO0o0O.EnumC33551OooO0OO.f121157OooOooO = r0
            java.lang.Object.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oO0o0O.EnumC33551OooO0OO.<clinit>():void");
    }

    public EnumC33551OooO0OO(String str, int i, TimeUnit timeUnit) {
        this.f121158OooOo0o = timeUnit;
    }

    public static EnumC33551OooO0OO valueOf(String str) {
        return (EnumC33551OooO0OO) Enum.valueOf(EnumC33551OooO0OO.class, str);
    }

    public static EnumC33551OooO0OO[] values() {
        return (EnumC33551OooO0OO[]) f121157OooOooO.clone();
    }
}
