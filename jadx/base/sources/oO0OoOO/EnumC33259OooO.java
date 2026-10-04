package oO0OoOO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: oO0OoOO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC33259OooO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC33259OooO f120387OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC33259OooO f120388OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ EnumC33259OooO[] f120389OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final EnumC33259OooO f120390OooOoO0;

    static {
        EnumC33259OooO enumC33259OooO = new EnumC33259OooO("STABLE", 0);
        f120388OooOo0o = enumC33259OooO;
        EnumC33259OooO enumC33259OooO2 = new EnumC33259OooO("FIR_UNSTABLE", 1);
        f120387OooOo = enumC33259OooO2;
        EnumC33259OooO enumC33259OooO3 = new EnumC33259OooO("IR_UNSTABLE", 2);
        f120390OooOoO0 = enumC33259OooO3;
        f120389OooOoO = new EnumC33259OooO[]{enumC33259OooO, enumC33259OooO2, enumC33259OooO3};
    }

    public EnumC33259OooO() {
        throw null;
    }

    public static EnumC33259OooO valueOf(String str) {
        return (EnumC33259OooO) Enum.valueOf(EnumC33259OooO.class, str);
    }

    public static EnumC33259OooO[] values() {
        return (EnumC33259OooO[]) f120389OooOoO.clone();
    }
}
