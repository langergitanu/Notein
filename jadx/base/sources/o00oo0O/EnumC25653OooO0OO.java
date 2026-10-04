package o00oo0O;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o00oo0O.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC25653OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC25653OooO0OO f87567OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooO00o f87568OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ EnumC25653OooO0OO[] f87569OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final EnumC25653OooO0OO f87570OooOoO0;

    /* JADX INFO: renamed from: o00oo0O.OooO0OO$OooO00o */
    public static final class OooO00o {
    }

    static {
        EnumC25653OooO0OO enumC25653OooO0OO = new EnumC25653OooO0OO("LOW", 0);
        f87567OooOo = enumC25653OooO0OO;
        EnumC25653OooO0OO enumC25653OooO0OO2 = new EnumC25653OooO0OO("MEDIUM", 1);
        EnumC25653OooO0OO enumC25653OooO0OO3 = new EnumC25653OooO0OO("HIGH", 2);
        f87570OooOoO0 = enumC25653OooO0OO3;
        EnumC25653OooO0OO[] enumC25653OooO0OOArr = {enumC25653OooO0OO, enumC25653OooO0OO2, enumC25653OooO0OO3};
        f87569OooOoO = enumC25653OooO0OOArr;
        OooO.OooO00o.OooO0O0(enumC25653OooO0OOArr);
        f87568OooOo0o = new OooO00o();
    }

    public EnumC25653OooO0OO() {
        throw null;
    }

    public static EnumC25653OooO0OO valueOf(String str) {
        return (EnumC25653OooO0OO) Enum.valueOf(EnumC25653OooO0OO.class, str);
    }

    public static EnumC25653OooO0OO[] values() {
        return (EnumC25653OooO0OO[]) f87569OooOoO.clone();
    }
}
