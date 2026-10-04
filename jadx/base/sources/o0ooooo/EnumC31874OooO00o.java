package o0ooooo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o0ooooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC31874OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC31874OooO00o f113570OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC31874OooO00o f113571OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ EnumC31874OooO00o[] f113572OooOoO0;

    static {
        EnumC31874OooO00o enumC31874OooO00o = new EnumC31874OooO00o("USB", 0);
        f113571OooOo0o = enumC31874OooO00o;
        EnumC31874OooO00o enumC31874OooO00o2 = new EnumC31874OooO00o("NFC", 1);
        f113570OooOo = enumC31874OooO00o2;
        f113572OooOoO0 = new EnumC31874OooO00o[]{enumC31874OooO00o, enumC31874OooO00o2};
    }

    public EnumC31874OooO00o() {
        throw null;
    }

    public static EnumC31874OooO00o valueOf(String str) {
        return (EnumC31874OooO00o) Enum.valueOf(EnumC31874OooO00o.class, str);
    }

    public static EnumC31874OooO00o[] values() {
        return (EnumC31874OooO00o[]) f113572OooOoO0.clone();
    }
}
