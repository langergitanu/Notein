package o0O0oOO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o0O0oOO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC26107OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC26107OooO0OO f89128OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC26107OooO0OO f89129OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ EnumC26107OooO0OO[] f89130OooOoO0;

    static {
        EnumC26107OooO0OO enumC26107OooO0OO = new EnumC26107OooO0OO("WIDTH", 0);
        f89129OooOo0o = enumC26107OooO0OO;
        EnumC26107OooO0OO enumC26107OooO0OO2 = new EnumC26107OooO0OO("HEIGHT", 1);
        EnumC26107OooO0OO enumC26107OooO0OO3 = new EnumC26107OooO0OO("BOTH", 2);
        f89128OooOo = enumC26107OooO0OO3;
        f89130OooOoO0 = new EnumC26107OooO0OO[]{enumC26107OooO0OO, enumC26107OooO0OO2, enumC26107OooO0OO3};
    }

    public EnumC26107OooO0OO() {
        throw null;
    }

    public static EnumC26107OooO0OO valueOf(String str) {
        return (EnumC26107OooO0OO) Enum.valueOf(EnumC26107OooO0OO.class, str);
    }

    public static EnumC26107OooO0OO[] values() {
        return (EnumC26107OooO0OO[]) f89130OooOoO0.clone();
    }
}
