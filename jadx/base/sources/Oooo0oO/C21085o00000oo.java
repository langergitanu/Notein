package Oooo0oO;

import Oooo0oO.C21082o00000oO;
import java.util.concurrent.CancellationException;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: Oooo0oO.o00000oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21085o00000oo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Throwable, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Throwable f61106OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C21082o00000oO f61107OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21085o00000oo(C21082o00000oO c21082o00000oO, Throwable th) {
        super(1);
        this.f61107OooOo0o = c21082o00000oO;
        this.f61106OooOo = th;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(Throwable th) {
        Throwable th2 = th;
        C21082o00000oO c21082o00000oO = this.f61107OooOo0o;
        Object obj = c21082o00000oO.f61078OooO0O0;
        Throwable th3 = this.f61106OooOo;
        synchronized (obj) {
            if (th3 == null) {
                th3 = null;
            } else if (th2 != null) {
                try {
                    if (th2 instanceof CancellationException) {
                        th2 = null;
                    }
                    if (th2 != null) {
                        C32435OooO0Oo.OooO00o(th3, th2);
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            c21082o00000oO.f61080OooO0Oo = th3;
            C33781o00o0O c33781o00o0O = c21082o00000oO.f61093OooOOo0;
            C21082o00000oO.EnumC21083OooO0Oo enumC21083OooO0Oo = C21082o00000oO.EnumC21083OooO0Oo.f61098OooOo0o;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, enumC21083OooO0Oo);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
