package ooOOoOoo;

import java.util.Collection;
import java.util.List;
import oO0O0OO.InterfaceC32641OooooOO;
import oO0O0oOo.C32776OooO0o0;
import oO0Oo00.C33194OooO0O0;
import ooOOoOoo.InterfaceC35161OooO0o;

/* JADX INFO: renamed from: ooOOoOoo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35171OooOOOo implements InterfaceC35161OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C35171OooOOOo f126248OooO00o = new C35171OooOOOo();

    @Override // ooOOoOoo.InterfaceC35161OooO0o
    public final String OooO00o(C32776OooO0o0 c32776OooO0o0) {
        return InterfaceC35161OooO0o.OooO00o.OooO00o(this, c32776OooO0o0);
    }

    @Override // ooOOoOoo.InterfaceC35161OooO0o
    public final boolean OooO0O0(C32776OooO0o0 c32776OooO0o0) {
        List<InterfaceC32641OooooOO> listOooO0o = c32776OooO0o0.OooO0o();
        kotlin.jvm.internal.OooOOO0.OooO0o(listOooO0o, "functionDescriptor.valueParameters");
        List<InterfaceC32641OooooOO> list = listOooO0o;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (InterfaceC32641OooooOO it : list) {
            kotlin.jvm.internal.OooOOO0.OooO0o(it, "it");
            if (C33194OooO0O0.OooO00o(it) || it.o0ooOoO() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // ooOOoOoo.InterfaceC35161OooO0o
    public final String getDescription() {
        return "should not have varargs or parameters with default values";
    }
}
