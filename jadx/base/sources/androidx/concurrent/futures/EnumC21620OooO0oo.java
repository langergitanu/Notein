package androidx.concurrent.futures;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.concurrent.futures.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC21620OooO0oo implements Executor {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ EnumC21620OooO0oo[] f63606OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC21620OooO0oo f63607OooOo0o;

    static {
        EnumC21620OooO0oo enumC21620OooO0oo = new EnumC21620OooO0oo("INSTANCE", 0);
        f63607OooOo0o = enumC21620OooO0oo;
        f63606OooOo = new EnumC21620OooO0oo[]{enumC21620OooO0oo};
    }

    public EnumC21620OooO0oo() {
        throw null;
    }

    public static EnumC21620OooO0oo valueOf(String str) {
        return (EnumC21620OooO0oo) Enum.valueOf(EnumC21620OooO0oo.class, str);
    }

    public static EnumC21620OooO0oo[] values() {
        return (EnumC21620OooO0oo[]) f63606OooOo.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
