package o0O0ooO0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o0O0ooO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC26220OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ EnumC26220OooO00o[] f89586OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC26220OooO00o f89587OooOo0o;

    static {
        EnumC26220OooO00o enumC26220OooO00o = new EnumC26220OooO00o("Single", 0);
        f89587OooOo0o = enumC26220OooO00o;
        EnumC26220OooO00o[] enumC26220OooO00oArr = {enumC26220OooO00o, new EnumC26220OooO00o("Multiple", 1)};
        f89586OooOo = enumC26220OooO00oArr;
        OooO.OooO00o.OooO0O0(enumC26220OooO00oArr);
    }

    public EnumC26220OooO00o() {
        throw null;
    }

    public static EnumC26220OooO00o valueOf(String str) {
        return (EnumC26220OooO00o) Enum.valueOf(EnumC26220OooO00o.class, str);
    }

    public static EnumC26220OooO00o[] values() {
        return (EnumC26220OooO00o[]) f89586OooOo.clone();
    }
}
