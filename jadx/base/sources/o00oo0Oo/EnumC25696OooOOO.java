package o00oo0Oo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o00oo0Oo.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC25696OooOOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC25696OooOOO f87665OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC25696OooOOO f87666OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ EnumC25696OooOOO[] f87667OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final EnumC25696OooOOO f87668OooOoO0;

    static {
        EnumC25696OooOOO enumC25696OooOOO = new EnumC25696OooOOO("ALWAYS", 0);
        f87666OooOo0o = enumC25696OooOOO;
        EnumC25696OooOOO enumC25696OooOOO2 = new EnumC25696OooOOO("AUTO", 1);
        f87665OooOo = enumC25696OooOOO2;
        EnumC25696OooOOO enumC25696OooOOO3 = new EnumC25696OooOOO("NEVER", 2);
        f87668OooOoO0 = enumC25696OooOOO3;
        EnumC25696OooOOO[] enumC25696OooOOOArr = {enumC25696OooOOO, enumC25696OooOOO2, enumC25696OooOOO3};
        f87667OooOoO = enumC25696OooOOOArr;
        OooO.OooO00o.OooO0O0(enumC25696OooOOOArr);
    }

    public EnumC25696OooOOO() {
        throw null;
    }

    public static EnumC25696OooOOO valueOf(String str) {
        return (EnumC25696OooOOO) Enum.valueOf(EnumC25696OooOOO.class, str);
    }

    public static EnumC25696OooOOO[] values() {
        return (EnumC25696OooOOO[]) f87667OooOoO.clone();
    }
}
