package kotlin.jvm.internal;

import java.util.Collections;
import java.util.List;
import oO0O0O0.o000oOoO;
import oOoo0.InterfaceC34595OooO0Oo;
import oOoo0.InterfaceC34606OooOOOo;

/* JADX INFO: renamed from: kotlin.jvm.internal.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C24035Oooo00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Oooo0 f80943OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final InterfaceC34595OooO0Oo[] f80944OooO0O0;

    static {
        Oooo0 oooo0 = null;
        try {
            oooo0 = (Oooo0) o000oOoO.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (oooo0 == null) {
            oooo0 = new Oooo0();
        }
        f80943OooO00o = oooo0;
        f80944OooO0O0 = new InterfaceC34595OooO0Oo[0];
    }

    public static InterfaceC34606OooOOOo OooO00o(Class cls) {
        Oooo0 oooo0 = f80943OooO00o;
        InterfaceC34595OooO0Oo interfaceC34595OooO0OoOooO0O0 = oooo0.OooO0O0(cls);
        List list = Collections.EMPTY_LIST;
        return oooo0.OooOO0O(interfaceC34595OooO0OoOooO0O0);
    }
}
