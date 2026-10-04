package oO0OOoO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: oO0OOoO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC33124OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ EnumC33124OooO0O0[] f119782OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC33124OooO0O0 f119783OooOo0o;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC33124OooO0O0 EF0;

    static {
        EnumC33124OooO0O0 enumC33124OooO0O0 = new EnumC33124OooO0O0("WARNING", 0);
        EnumC33124OooO0O0 enumC33124OooO0O02 = new EnumC33124OooO0O0("ERROR", 1);
        f119783OooOo0o = enumC33124OooO0O02;
        f119782OooOo = new EnumC33124OooO0O0[]{enumC33124OooO0O0, enumC33124OooO0O02, new EnumC33124OooO0O0("HIDDEN", 2)};
    }

    public EnumC33124OooO0O0() {
        throw null;
    }

    public static EnumC33124OooO0O0 valueOf(String str) {
        return (EnumC33124OooO0O0) Enum.valueOf(EnumC33124OooO0O0.class, str);
    }

    public static EnumC33124OooO0O0[] values() {
        return (EnumC33124OooO0O0[]) f119782OooOo.clone();
    }
}
