package oo000o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: oo000o.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC34646OooOoo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC34646OooOoo f124831OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC34646OooOoo f124832OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ EnumC34646OooOoo[] f124833OooOoO0;

    static {
        EnumC34646OooOoo enumC34646OooOoo = new EnumC34646OooOoo("Min", 0);
        f124832OooOo0o = enumC34646OooOoo;
        EnumC34646OooOoo enumC34646OooOoo2 = new EnumC34646OooOoo("Max", 1);
        f124831OooOo = enumC34646OooOoo2;
        f124833OooOoO0 = new EnumC34646OooOoo[]{enumC34646OooOoo, enumC34646OooOoo2};
    }

    public EnumC34646OooOoo() {
        throw null;
    }

    public static EnumC34646OooOoo valueOf(String str) {
        return (EnumC34646OooOoo) Enum.valueOf(EnumC34646OooOoo.class, str);
    }

    public static EnumC34646OooOoo[] values() {
        return (EnumC34646OooOoo[]) f124833OooOoO0.clone();
    }
}
