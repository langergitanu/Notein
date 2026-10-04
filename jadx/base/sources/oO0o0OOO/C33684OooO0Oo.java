package oO0o0OOO;

import com.orion.notein.data.p602db.entity.UpdateZoomEntity;
import o000ooo.InterfaceC24747OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oo0oO0.C34826o00O0o00;

/* JADX INFO: renamed from: oO0o0OOO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C33684OooO0Oo implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f121422OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f121423OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f121424OooOoO0;

    public /* synthetic */ C33684OooO0Oo(int i, Object obj, Object obj2) {
        this.f121423OooOo0o = i;
        this.f121422OooOo = obj;
        this.f121424OooOoO0 = obj2;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f121423OooOo0o) {
            case 0:
                ((C33685OooO0o) this.f121422OooOo).f121426OooOoO0.removeCallbacks((RunnableC33686OooO0o0) this.f121424OooOoO0);
                break;
            default:
                ((C34826o00O0o00) this.f121422OooOo).f125288OooO0Oo.o000oOoO((InterfaceC24747OooO0O0) obj, (UpdateZoomEntity) this.f121424OooOoO0);
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
