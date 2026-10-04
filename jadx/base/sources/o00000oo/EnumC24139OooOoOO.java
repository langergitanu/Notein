package o00000oo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o00000oo.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC24139OooOoOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ EnumC24139OooOoOO[] f81338OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC24139OooOoOO f81339OooOo0o;

    static {
        EnumC24139OooOoOO enumC24139OooOoOO = new EnumC24139OooOoOO("Inherit", 0);
        f81339OooOo0o = enumC24139OooOoOO;
        f81338OooOo = new EnumC24139OooOoOO[]{enumC24139OooOoOO, new EnumC24139OooOoOO("SecureOn", 1), new EnumC24139OooOoOO("SecureOff", 2)};
    }

    public EnumC24139OooOoOO() {
        throw null;
    }

    public static EnumC24139OooOoOO valueOf(String str) {
        return (EnumC24139OooOoOO) Enum.valueOf(EnumC24139OooOoOO.class, str);
    }

    public static EnumC24139OooOoOO[] values() {
        return (EnumC24139OooOoOO[]) f81338OooOo.clone();
    }
}
