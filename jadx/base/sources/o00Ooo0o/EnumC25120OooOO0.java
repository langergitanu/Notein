package o00Ooo0o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o00Ooo0o.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC25120OooOO0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ EnumC25120OooOO0[] f85390OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC25120OooOO0 f85391OooOo0o;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC25120OooOO0 EF0;

    static {
        EnumC25120OooOO0 enumC25120OooOO0 = new EnumC25120OooOO0("SRGB", 0);
        EnumC25120OooOO0 enumC25120OooOO02 = new EnumC25120OooOO0("DISPLAY_P3", 1);
        f85391OooOo0o = enumC25120OooOO02;
        f85390OooOo = new EnumC25120OooOO0[]{enumC25120OooOO0, enumC25120OooOO02};
    }

    public EnumC25120OooOO0() {
        throw null;
    }

    public static EnumC25120OooOO0 valueOf(String str) {
        return (EnumC25120OooOO0) Enum.valueOf(EnumC25120OooOO0.class, str);
    }

    public static EnumC25120OooOO0[] values() {
        return (EnumC25120OooOO0[]) f85390OooOo.clone();
    }
}
