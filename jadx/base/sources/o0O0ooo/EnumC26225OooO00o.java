package o0O0ooo;

import Oooo0oO.InterfaceC21033OooOOOO;
import com.orion.notein.global.R;
import o0OOO0o.C27047OooO0O0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o0O0ooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC26225OooO00o implements InterfaceC26230OooO0o0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC26225OooO00o f89596OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ EnumC26225OooO00o[] f89597OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final EnumC26225OooO00o f89598OooOoO0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f89599OooOo0o;

    static {
        EnumC26225OooO00o enumC26225OooO00o = new EnumC26225OooO00o("Red", 0, R.color.notein_accent_red);
        EnumC26225OooO00o enumC26225OooO00o2 = new EnumC26225OooO00o("Orange", 1, R.color.notein_accent_orange);
        EnumC26225OooO00o enumC26225OooO00o3 = new EnumC26225OooO00o("Yellow", 2, R.color.notein_accent_yellow);
        EnumC26225OooO00o enumC26225OooO00o4 = new EnumC26225OooO00o("Green", 3, R.color.notein_accent_green);
        EnumC26225OooO00o enumC26225OooO00o5 = new EnumC26225OooO00o("Mint", 4, R.color.notein_accent_mint);
        EnumC26225OooO00o enumC26225OooO00o6 = new EnumC26225OooO00o("Teal", 5, R.color.notein_accent_teal);
        EnumC26225OooO00o enumC26225OooO00o7 = new EnumC26225OooO00o("Cyan", 6, R.color.notein_accent_cyan);
        EnumC26225OooO00o enumC26225OooO00o8 = new EnumC26225OooO00o("Blue", 7, R.color.notein_accent_blue);
        f89596OooOo = enumC26225OooO00o8;
        EnumC26225OooO00o enumC26225OooO00o9 = new EnumC26225OooO00o("Indigo", 8, R.color.notein_accent_indigo);
        EnumC26225OooO00o enumC26225OooO00o10 = new EnumC26225OooO00o("Purple", 9, R.color.notein_accent_purple);
        EnumC26225OooO00o enumC26225OooO00o11 = new EnumC26225OooO00o("Pink", 10, R.color.notein_accent_pink);
        f89598OooOoO0 = enumC26225OooO00o11;
        EnumC26225OooO00o[] enumC26225OooO00oArr = {enumC26225OooO00o, enumC26225OooO00o2, enumC26225OooO00o3, enumC26225OooO00o4, enumC26225OooO00o5, enumC26225OooO00o6, enumC26225OooO00o7, enumC26225OooO00o8, enumC26225OooO00o9, enumC26225OooO00o10, enumC26225OooO00o11, new EnumC26225OooO00o("Brown", 11, R.color.notein_accent_brown)};
        f89597OooOoO = enumC26225OooO00oArr;
        OooO.OooO00o.OooO0O0(enumC26225OooO00oArr);
    }

    public EnumC26225OooO00o(String str, int i, int i2) {
        this.f89599OooOo0o = i2;
    }

    public static EnumC26225OooO00o valueOf(String str) {
        return (EnumC26225OooO00o) Enum.valueOf(EnumC26225OooO00o.class, str);
    }

    public static EnumC26225OooO00o[] values() {
        return (EnumC26225OooO00o[]) f89597OooOoO.clone();
    }

    @Override // o0O0ooo.InterfaceC26230OooO0o0
    public final long OooO00o(InterfaceC21033OooOOOO interfaceC21033OooOOOO) {
        interfaceC21033OooOOOO.OooOo00(-1346083889);
        long jOooO00o = C27047OooO0O0.OooO00o(this.f89599OooOo0o, interfaceC21033OooOOOO);
        interfaceC21033OooOOOO.OooOoo();
        return jOooO00o;
    }
}
