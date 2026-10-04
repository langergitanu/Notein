package o0O0ooo;

import Oooo0oO.InterfaceC21033OooOOOO;
import com.orion.notein.global.R;
import o0OOO0o.C27047OooO0O0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o0O0ooo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC26232OooO0oo implements InterfaceC26230OooO0o0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC26232OooO0oo f89617OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ EnumC26232OooO0oo[] f89618OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final EnumC26232OooO0oo f89619OooOoO0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f89620OooOo0o;

    static {
        EnumC26232OooO0oo enumC26232OooO0oo = new EnumC26232OooO0oo("Primary", 0, R.color.notein_label_primary);
        EnumC26232OooO0oo enumC26232OooO0oo2 = new EnumC26232OooO0oo("Secondary", 1, R.color.notein_label_secondary);
        f89617OooOo = enumC26232OooO0oo2;
        EnumC26232OooO0oo enumC26232OooO0oo3 = new EnumC26232OooO0oo("Tertiary", 2, R.color.notein_label_tertiary);
        f89619OooOoO0 = enumC26232OooO0oo3;
        EnumC26232OooO0oo[] enumC26232OooO0ooArr = {enumC26232OooO0oo, enumC26232OooO0oo2, enumC26232OooO0oo3, new EnumC26232OooO0oo("Quaternary", 3, R.color.notein_label_quaternary)};
        f89618OooOoO = enumC26232OooO0ooArr;
        OooO.OooO00o.OooO0O0(enumC26232OooO0ooArr);
    }

    public EnumC26232OooO0oo(String str, int i, int i2) {
        this.f89620OooOo0o = i2;
    }

    public static EnumC26232OooO0oo valueOf(String str) {
        return (EnumC26232OooO0oo) Enum.valueOf(EnumC26232OooO0oo.class, str);
    }

    public static EnumC26232OooO0oo[] values() {
        return (EnumC26232OooO0oo[]) f89618OooOoO.clone();
    }

    @Override // o0O0ooo.InterfaceC26230OooO0o0
    public final long OooO00o(InterfaceC21033OooOOOO interfaceC21033OooOOOO) {
        interfaceC21033OooOOOO.OooOo00(427059621);
        long jOooO00o = C27047OooO0O0.OooO00o(this.f89620OooOo0o, interfaceC21033OooOOOO);
        interfaceC21033OooOOOO.OooOoo();
        return jOooO00o;
    }
}
