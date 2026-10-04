package oO0O0ooo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: oO0O0ooo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC32839OooO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC32839OooO f117886OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC32839OooO f117887OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ EnumC32839OooO[] f117888OooOoO0;

    static {
        EnumC32839OooO enumC32839OooO = new EnumC32839OooO("READ_ONLY", 0);
        f117887OooOo0o = enumC32839OooO;
        EnumC32839OooO enumC32839OooO2 = new EnumC32839OooO("MUTABLE", 1);
        f117886OooOo = enumC32839OooO2;
        f117888OooOoO0 = new EnumC32839OooO[]{enumC32839OooO, enumC32839OooO2};
    }

    public EnumC32839OooO() {
        throw null;
    }

    public static EnumC32839OooO valueOf(String str) {
        return (EnumC32839OooO) Enum.valueOf(EnumC32839OooO.class, str);
    }

    public static EnumC32839OooO[] values() {
        return (EnumC32839OooO[]) f117888OooOoO0.clone();
    }
}
