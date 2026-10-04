package o0OOooO0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o0OOooO0.o00000Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC27953o00000Oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC27953o00000Oo f98990OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC27953o00000Oo f98991OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ EnumC27953o00000Oo[] f98992OooOoO0;

    static {
        EnumC27953o00000Oo enumC27953o00000Oo = new EnumC27953o00000Oo("WIFI_ONLY", 0);
        f98991OooOo0o = enumC27953o00000Oo;
        EnumC27953o00000Oo enumC27953o00000Oo2 = new EnumC27953o00000Oo("CELLULAR_ALLOWED", 1);
        f98990OooOo = enumC27953o00000Oo2;
        EnumC27953o00000Oo[] enumC27953o00000OoArr = {enumC27953o00000Oo, enumC27953o00000Oo2};
        f98992OooOoO0 = enumC27953o00000OoArr;
        OooO.OooO00o.OooO0O0(enumC27953o00000OoArr);
    }

    public EnumC27953o00000Oo() {
        throw null;
    }

    public static EnumC27953o00000Oo valueOf(String str) {
        return (EnumC27953o00000Oo) Enum.valueOf(EnumC27953o00000Oo.class, str);
    }

    public static EnumC27953o00000Oo[] values() {
        return (EnumC27953o00000Oo[]) f98992OooOoO0.clone();
    }
}
