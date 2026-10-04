package androidx.lifecycle;

import androidx.lifecycle.AbstractC21979OooOOo0;
import kotlin.coroutines.Continuation;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: androidx.lifecycle.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22005OoooOO0 {
    public static final Object OooO00o(InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO0O0 oooO0O0, InterfaceC32508OooOOOo<? super InterfaceC33636Oooo00o, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32508OooOOOo, Continuation<? super C32460OooOooO> continuation) {
        Object objOooO0o0;
        AbstractC21979OooOOo0 lifecycle = interfaceC21987OooOoo.getLifecycle();
        if (oooO0O0 == AbstractC21979OooOOo0.OooO0O0.f65537OooOo) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        if (lifecycle.OooO0O0() == AbstractC21979OooOOo0.OooO0O0.f65538OooOo0o || (objOooO0o0 = C33633Oooo0.OooO0o0(new C22001OoooO(lifecycle, oooO0O0, interfaceC32508OooOOOo, null), continuation)) != EnumC32485OooO00o.f116726OooOo0o) {
            objOooO0o0 = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0o0 == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o0 : C32460OooOooO.f116667OooO00o;
    }
}
