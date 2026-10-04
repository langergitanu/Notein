package oO0OOo0o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: oO0OOo0o.OooooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC33111OooooOo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC33111OooooOo f119693OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC33111OooooOo f119694OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ EnumC33111OooooOo[] f119695OooOoO0;

    static {
        EnumC33111OooooOo enumC33111OooooOo = new EnumC33111OooooOo("NONE", 0);
        f119694OooOo0o = enumC33111OooooOo;
        EnumC33111OooooOo enumC33111OooooOo2 = new EnumC33111OooooOo("INTEGRITY", 1);
        EnumC33111OooooOo enumC33111OooooOo3 = new EnumC33111OooooOo("PRIVACY_AND_INTEGRITY", 2);
        f119693OooOo = enumC33111OooooOo3;
        f119695OooOoO0 = new EnumC33111OooooOo[]{enumC33111OooooOo, enumC33111OooooOo2, enumC33111OooooOo3};
    }

    public EnumC33111OooooOo() {
        throw null;
    }

    public static EnumC33111OooooOo valueOf(String str) {
        return (EnumC33111OooooOo) Enum.valueOf(EnumC33111OooooOo.class, str);
    }

    public static EnumC33111OooooOo[] values() {
        return (EnumC33111OooooOo[]) f119695OooOoO0.clone();
    }
}
