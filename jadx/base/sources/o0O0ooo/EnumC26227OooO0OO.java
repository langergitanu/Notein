package o0O0ooo;

import Oooo0oO.InterfaceC21033OooOOOO;
import com.orion.notein.global.R;
import o0OOO0o.C27047OooO0O0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o0O0ooo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC26227OooO0OO implements InterfaceC26230OooO0o0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC26227OooO0OO f89602OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ EnumC26227OooO0OO[] f89603OooOoO0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f89604OooOo0o;

    static {
        EnumC26227OooO0OO enumC26227OooO0OO = new EnumC26227OooO0OO("Primary", 0, R.color.notein_backgrounds_grouped_primary);
        EnumC26227OooO0OO enumC26227OooO0OO2 = new EnumC26227OooO0OO("Secondary", 1, R.color.notein_backgrounds_grouped_secondary);
        f89602OooOo = enumC26227OooO0OO2;
        EnumC26227OooO0OO[] enumC26227OooO0OOArr = {enumC26227OooO0OO, enumC26227OooO0OO2, new EnumC26227OooO0OO("Tertiary", 2, R.color.notein_backgrounds_grouped_tertiary)};
        f89603OooOoO0 = enumC26227OooO0OOArr;
        OooO.OooO00o.OooO0O0(enumC26227OooO0OOArr);
    }

    public EnumC26227OooO0OO(String str, int i, int i2) {
        this.f89604OooOo0o = i2;
    }

    public static EnumC26227OooO0OO valueOf(String str) {
        return (EnumC26227OooO0OO) Enum.valueOf(EnumC26227OooO0OO.class, str);
    }

    public static EnumC26227OooO0OO[] values() {
        return (EnumC26227OooO0OO[]) f89603OooOoO0.clone();
    }

    @Override // o0O0ooo.InterfaceC26230OooO0o0
    public final long OooO00o(InterfaceC21033OooOOOO interfaceC21033OooOOOO) {
        interfaceC21033OooOOOO.OooOo00(267177069);
        long jOooO00o = C27047OooO0O0.OooO00o(this.f89604OooOo0o, interfaceC21033OooOOOO);
        interfaceC21033OooOOOO.OooOoo();
        return jOooO00o;
    }
}
