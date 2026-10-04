package o0ooO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o0ooO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC31414OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC31414OooO00o f112174OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC31414OooO00o f112175OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ EnumC31414OooO00o[] f112176OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final EnumC31414OooO00o f112177OooOoO0;

    static {
        EnumC31414OooO00o enumC31414OooO00o = new EnumC31414OooO00o("CURRENT_ACTIVITY", 0);
        f112175OooOo0o = enumC31414OooO00o;
        EnumC31414OooO00o enumC31414OooO00o2 = new EnumC31414OooO00o("FOREGROUND", 1);
        f112174OooOo = enumC31414OooO00o2;
        EnumC31414OooO00o enumC31414OooO00o3 = new EnumC31414OooO00o("BACKGROUND", 2);
        f112177OooOoO0 = enumC31414OooO00o3;
        f112176OooOoO = new EnumC31414OooO00o[]{enumC31414OooO00o, enumC31414OooO00o2, enumC31414OooO00o3, new EnumC31414OooO00o("ALL_TIME", 3)};
    }

    public EnumC31414OooO00o() {
        throw null;
    }

    public static EnumC31414OooO00o valueOf(String str) {
        return (EnumC31414OooO00o) Enum.valueOf(EnumC31414OooO00o.class, str);
    }

    public static EnumC31414OooO00o[] values() {
        return (EnumC31414OooO00o[]) f112176OooOoO.clone();
    }
}
