package o0O0ooo;

import Oooo0oO.InterfaceC21033OooOOOO;
import com.orion.notein.global.R;
import o0OOO0o.C27047OooO0O0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o0O0ooo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC26228OooO0Oo implements InterfaceC26230OooO0o0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC26228OooO0Oo f89605OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ EnumC26228OooO0Oo[] f89606OooOoO0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f89607OooOo0o;

    static {
        EnumC26228OooO0Oo enumC26228OooO0Oo = new EnumC26228OooO0Oo("Black87", 0, R.color.notein_base_black_87);
        f89605OooOo = enumC26228OooO0Oo;
        EnumC26228OooO0Oo[] enumC26228OooO0OoArr = {enumC26228OooO0Oo, new EnumC26228OooO0Oo("White87", 1, R.color.notein_base_white_87)};
        f89606OooOoO0 = enumC26228OooO0OoArr;
        OooO.OooO00o.OooO0O0(enumC26228OooO0OoArr);
    }

    public EnumC26228OooO0Oo(String str, int i, int i2) {
        this.f89607OooOo0o = i2;
    }

    public static EnumC26228OooO0Oo valueOf(String str) {
        return (EnumC26228OooO0Oo) Enum.valueOf(EnumC26228OooO0Oo.class, str);
    }

    public static EnumC26228OooO0Oo[] values() {
        return (EnumC26228OooO0Oo[]) f89606OooOoO0.clone();
    }

    @Override // o0O0ooo.InterfaceC26230OooO0o0
    public final long OooO00o(InterfaceC21033OooOOOO interfaceC21033OooOOOO) {
        interfaceC21033OooOOOO.OooOo00(-98210449);
        long jOooO00o = C27047OooO0O0.OooO00o(this.f89607OooOo0o, interfaceC21033OooOOOO);
        interfaceC21033OooOOOO.OooOoo();
        return jOooO00o;
    }
}
