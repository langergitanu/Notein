package oOo00OOO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: oOo00OOO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC34485OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC34485OooO0O0 f123579OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC34485OooO0O0 f123580OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ EnumC34485OooO0O0[] f123581OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final EnumC34485OooO0O0 f123582OooOoO0;

    static {
        EnumC34485OooO0O0 enumC34485OooO0O0 = new EnumC34485OooO0O0("INFLEXIBLE", 0);
        f123580OooOo0o = enumC34485OooO0O0;
        EnumC34485OooO0O0 enumC34485OooO0O02 = new EnumC34485OooO0O0("FLEXIBLE_UPPER_BOUND", 1);
        f123579OooOo = enumC34485OooO0O02;
        EnumC34485OooO0O0 enumC34485OooO0O03 = new EnumC34485OooO0O0("FLEXIBLE_LOWER_BOUND", 2);
        f123582OooOoO0 = enumC34485OooO0O03;
        f123581OooOoO = new EnumC34485OooO0O0[]{enumC34485OooO0O0, enumC34485OooO0O02, enumC34485OooO0O03};
    }

    public EnumC34485OooO0O0() {
        throw null;
    }

    public static EnumC34485OooO0O0 valueOf(String str) {
        return (EnumC34485OooO0O0) Enum.valueOf(EnumC34485OooO0O0.class, str);
    }

    public static EnumC34485OooO0O0[] values() {
        return (EnumC34485OooO0O0[]) f123581OooOoO.clone();
    }
}
