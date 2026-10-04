package o0O0ooo;

import Oooo0oO.InterfaceC21033OooOOOO;
import com.orion.notein.global.R;
import o0OOO0o.C27047OooO0O0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o0O0ooo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC26234OooOO0O implements InterfaceC26230OooO0o0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC26234OooOO0O f89623OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ EnumC26234OooOO0O[] f89624OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final EnumC26234OooOO0O f89625OooOoO0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f89626OooOo0o;

    static {
        EnumC26234OooOO0O enumC26234OooOO0O = new EnumC26234OooOO0O("NonOpaque", 0, R.color.notein_separator_non_opaque);
        f89623OooOo = enumC26234OooOO0O;
        EnumC26234OooOO0O enumC26234OooOO0O2 = new EnumC26234OooOO0O("Opaque", 1, R.color.notein_separator_opaque);
        f89625OooOoO0 = enumC26234OooOO0O2;
        EnumC26234OooOO0O[] enumC26234OooOO0OArr = {enumC26234OooOO0O, enumC26234OooOO0O2, new EnumC26234OooOO0O("Vibrant", 2, R.color.notein_separator_vibrant)};
        f89624OooOoO = enumC26234OooOO0OArr;
        OooO.OooO00o.OooO0O0(enumC26234OooOO0OArr);
    }

    public EnumC26234OooOO0O(String str, int i, int i2) {
        this.f89626OooOo0o = i2;
    }

    public static EnumC26234OooOO0O valueOf(String str) {
        return (EnumC26234OooOO0O) Enum.valueOf(EnumC26234OooOO0O.class, str);
    }

    public static EnumC26234OooOO0O[] values() {
        return (EnumC26234OooOO0O[]) f89624OooOoO.clone();
    }

    @Override // o0O0ooo.InterfaceC26230OooO0o0
    public final long OooO00o(InterfaceC21033OooOOOO interfaceC21033OooOOOO) {
        interfaceC21033OooOOOO.OooOo00(-635012477);
        long jOooO00o = C27047OooO0O0.OooO00o(this.f89626OooOo0o, interfaceC21033OooOOOO);
        interfaceC21033OooOOOO.OooOoo();
        return jOooO00o;
    }
}
