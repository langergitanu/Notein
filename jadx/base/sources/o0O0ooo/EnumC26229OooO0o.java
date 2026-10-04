package o0O0ooo;

import Oooo0oO.InterfaceC21033OooOOOO;
import com.orion.notein.global.R;
import o0OOO0o.C27047OooO0O0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o0O0ooo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC26229OooO0o implements InterfaceC26230OooO0o0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC26229OooO0o f89608OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ EnumC26229OooO0o[] f89609OooOoO0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f89610OooOo0o;

    static {
        EnumC26229OooO0o enumC26229OooO0o = new EnumC26229OooO0o("Primary", 0, R.color.notein_fill_primary);
        EnumC26229OooO0o enumC26229OooO0o2 = new EnumC26229OooO0o("Secondary", 1, R.color.notein_fill_secondary);
        EnumC26229OooO0o enumC26229OooO0o3 = new EnumC26229OooO0o("Tertiary", 2, R.color.notein_fill_tertiary);
        f89608OooOo = enumC26229OooO0o3;
        EnumC26229OooO0o[] enumC26229OooO0oArr = {enumC26229OooO0o, enumC26229OooO0o2, enumC26229OooO0o3, new EnumC26229OooO0o("Quaternary", 3, R.color.notein_fill_quaternary)};
        f89609OooOoO0 = enumC26229OooO0oArr;
        OooO.OooO00o.OooO0O0(enumC26229OooO0oArr);
    }

    public EnumC26229OooO0o(String str, int i, int i2) {
        this.f89610OooOo0o = i2;
    }

    public static EnumC26229OooO0o valueOf(String str) {
        return (EnumC26229OooO0o) Enum.valueOf(EnumC26229OooO0o.class, str);
    }

    public static EnumC26229OooO0o[] values() {
        return (EnumC26229OooO0o[]) f89609OooOoO0.clone();
    }

    @Override // o0O0ooo.InterfaceC26230OooO0o0
    public final long OooO00o(InterfaceC21033OooOOOO interfaceC21033OooOOOO) {
        interfaceC21033OooOOOO.OooOo00(788688559);
        long jOooO00o = C27047OooO0O0.OooO00o(this.f89610OooOo0o, interfaceC21033OooOOOO);
        interfaceC21033OooOOOO.OooOoo();
        return jOooO00o;
    }
}
