package oO0OooOO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: oO0OooOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC33486OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ EnumC33486OooO00o[] f120994OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC33486OooO00o f120995OooOo0o;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC33486OooO00o EF0;

    static {
        EnumC33486OooO00o enumC33486OooO00o = new EnumC33486OooO00o("MISSING", 0);
        EnumC33486OooO00o enumC33486OooO00o2 = new EnumC33486OooO00o("ERROR", 1);
        EnumC33486OooO00o enumC33486OooO00o3 = new EnumC33486OooO00o("BUFFER", 2);
        f120995OooOo0o = enumC33486OooO00o3;
        f120994OooOo = new EnumC33486OooO00o[]{enumC33486OooO00o, enumC33486OooO00o2, enumC33486OooO00o3, new EnumC33486OooO00o("DROP", 3), new EnumC33486OooO00o("LATEST", 4)};
    }

    public EnumC33486OooO00o() {
        throw null;
    }

    public static EnumC33486OooO00o valueOf(String str) {
        return (EnumC33486OooO00o) Enum.valueOf(EnumC33486OooO00o.class, str);
    }

    public static EnumC33486OooO00o[] values() {
        return (EnumC33486OooO00o[]) f120994OooOo.clone();
    }
}
