package o0O0o00;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o0O0o00.o0000oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC25982o0000oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC25982o0000oO f88734OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC25982o0000oO f88735OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ EnumC25982o0000oO[] f88736OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final EnumC25982o0000oO f88737OooOoO0;

    static {
        EnumC25982o0000oO enumC25982o0000oO = new EnumC25982o0000oO("NO_REDRAW", 0);
        f88735OooOo0o = enumC25982o0000oO;
        EnumC25982o0000oO enumC25982o0000oO2 = new EnumC25982o0000oO("REDRAW_NON_UI", 1);
        f88734OooOo = enumC25982o0000oO2;
        EnumC25982o0000oO enumC25982o0000oO3 = new EnumC25982o0000oO("REDRAW_UI", 2);
        f88737OooOoO0 = enumC25982o0000oO3;
        f88736OooOoO = new EnumC25982o0000oO[]{enumC25982o0000oO, enumC25982o0000oO2, enumC25982o0000oO3};
    }

    public EnumC25982o0000oO() {
        throw null;
    }

    public static EnumC25982o0000oO valueOf(String str) {
        return (EnumC25982o0000oO) Enum.valueOf(EnumC25982o0000oO.class, str);
    }

    public static EnumC25982o0000oO[] values() {
        return (EnumC25982o0000oO[]) f88736OooOoO.clone();
    }
}
