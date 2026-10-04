package oO0o0Oo;

import androidx.appcompat.widget.C21532OooOOo;
import oO0o0OOo.EnumC33692OooO0OO;
import oO0o0OoO.C33798OooOO0;
import oO0o0Ooo.C33839OooOo0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0Oo.Oooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33773Oooooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C33839OooOo0 f121761OooO00o = new C33839OooOo0("NO_VALUE");

    public static final C33772OooooOo OooO00o(int i, int i2, EnumC33692OooO0OO enumC33692OooO0OO) {
        if (i < 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "replay cannot be negative, but was ").toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i2, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i <= 0 && i2 <= 0 && enumC33692OooO0OO != EnumC33692OooO0OO.f121452OooOo0o) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC33692OooO0OO).toString());
        }
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
        }
        return new C33772OooooOo(i, i3, enumC33692OooO0OO);
    }

    public static /* synthetic */ C33772OooooOo OooO0O0(int i, int i2, int i3) {
        EnumC33692OooO0OO enumC33692OooO0OO = EnumC33692OooO0OO.f121451OooOo;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            enumC33692OooO0OO = EnumC33692OooO0OO.f121452OooOo0o;
        }
        return OooO00o(i, i2, enumC33692OooO0OO);
    }

    public static final void OooO0OO(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final <T> InterfaceC33721OooO0o<T> OooO0Oo(InterfaceC33771OooooOO<? extends T> interfaceC33771OooooOO, InterfaceC34415OooO0oo interfaceC34415OooO0oo, int i, EnumC33692OooO0OO enumC33692OooO0OO) {
        return ((i == 0 || i == -3) && enumC33692OooO0OO == EnumC33692OooO0OO.f121452OooOo0o) ? interfaceC33771OooooOO : new C33798OooOO0(i, enumC33692OooO0OO, interfaceC33771OooooOO, interfaceC34415OooO0oo);
    }
}
