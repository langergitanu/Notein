package o00O00o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o00O00o.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC24811OooO0oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ EnumC24811OooO0oo[] f84150OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC24811OooO0oo f84151OooOo0o;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC24811OooO0oo EF0;

    static {
        EnumC24811OooO0oo enumC24811OooO0oo = new EnumC24811OooO0oo("STRICT", 0);
        EnumC24811OooO0oo enumC24811OooO0oo2 = new EnumC24811OooO0oo("LOG", 1);
        EnumC24811OooO0oo enumC24811OooO0oo3 = new EnumC24811OooO0oo("QUIET", 2);
        f84151OooOo0o = enumC24811OooO0oo3;
        f84150OooOo = new EnumC24811OooO0oo[]{enumC24811OooO0oo, enumC24811OooO0oo2, enumC24811OooO0oo3};
    }

    public EnumC24811OooO0oo() {
        throw null;
    }

    public static EnumC24811OooO0oo valueOf(String str) {
        return (EnumC24811OooO0oo) Enum.valueOf(EnumC24811OooO0oo.class, str);
    }

    public static EnumC24811OooO0oo[] values() {
        return (EnumC24811OooO0oo[]) f84150OooOo.clone();
    }
}
