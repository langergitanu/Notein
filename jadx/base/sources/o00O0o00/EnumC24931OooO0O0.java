package o00O0o00;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o00O0o00.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC24931OooO0O0 implements Executor {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ EnumC24931OooO0O0[] f84595OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC24931OooO0O0 f84596OooOo0o;

    static {
        EnumC24931OooO0O0 enumC24931OooO0O0 = new EnumC24931OooO0O0("INSTANCE", 0);
        f84596OooOo0o = enumC24931OooO0O0;
        f84595OooOo = new EnumC24931OooO0O0[]{enumC24931OooO0O0};
    }

    public EnumC24931OooO0O0() {
        throw null;
    }

    public static EnumC24931OooO0O0 valueOf(String str) {
        return (EnumC24931OooO0O0) Enum.valueOf(EnumC24931OooO0O0.class, str);
    }

    public static EnumC24931OooO0O0[] values() {
        return (EnumC24931OooO0O0[]) f84595OooOo.clone();
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
