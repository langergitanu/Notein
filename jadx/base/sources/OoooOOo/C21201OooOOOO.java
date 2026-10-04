package OoooOOo;

import java.util.concurrent.CancellationException;
import oO00O0oo.AbstractC32223OooOOOo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0OooO0.C33479OooO0o;
import oO0o0OO.o00000OO;

/* JADX INFO: renamed from: OoooOOo.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21201OooOOOO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f61508OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f61509OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21201OooOOOO(Object obj, int i) {
        super(1);
        this.f61509OooOo0o = i;
        this.f61508OooOo = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f61509OooOo0o) {
            case 0:
                AbstractC21194OooO0oO abstractC21194OooO0oO = (AbstractC21194OooO0oO) ((kotlin.jvm.internal.OooOOOO) this.f61508OooOo).invoke((C21196OooOO0) obj);
                synchronized (C21200OooOOO0.f61496OooO0OO) {
                    C21200OooOOO0.f61497OooO0Oo = C21200OooOOO0.f61497OooO0Oo.OooO0oO(abstractC21194OooO0oO.OooO0Oo());
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                }
                return abstractC21194OooO0oO;
            case 1:
                ((o00000OO) this.f61508OooOo).cancel((CancellationException) null);
                return C32460OooOooO.f116667OooO00o;
            case 2:
                ((AbstractC32223OooOOOo) this.f61508OooOo).Oooo000();
                return C32460OooOooO.f116667OooO00o;
            default:
                oO0Oo0o0.OooOO0 it = (oO0Oo0o0.OooOO0) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                return it.OooO0O0((C33479OooO0o) this.f61508OooOo, oOo0o0oO.OooO0O0.f123889OooOoOO);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21201OooOOOO(InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        super(1);
        this.f61509OooOo0o = 0;
        this.f61508OooOo = (kotlin.jvm.internal.OooOOOO) interfaceC32507OooOO0o;
    }
}
