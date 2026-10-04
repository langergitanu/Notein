package oO0O0Oo0;

import java.util.Collection;
import java.util.Iterator;
import oO0O0OO.InterfaceC32609OooOo0;
import oO0Ooo.C33356ooOO;
import oO0o0O0.C33557OooO0OO;

/* JADX INFO: renamed from: oO0O0Oo0.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32681OooOoOO implements oO0O000o.OooO00o<Collection<InterfaceC32609OooOo0>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC32682OooOoo f117438OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33356ooOO f117439OooOo0o;

    public C32681OooOoOO(AbstractC32682OooOoo abstractC32682OooOoo, C33356ooOO c33356ooOO) {
        this.f117438OooOo = abstractC32682OooOoo;
        this.f117439OooOo0o = c33356ooOO;
    }

    @Override // oO0O000o.OooO00o
    public final Collection<InterfaceC32609OooOo0> invoke() {
        C33557OooO0OO c33557OooO0OO = new C33557OooO0OO();
        Iterator<? extends InterfaceC32609OooOo0> it = this.f117438OooOo.OooOO0o().iterator();
        while (it.hasNext()) {
            c33557OooO0OO.add(it.next().OooO0O0(this.f117439OooOo0o));
        }
        return c33557OooO0OO;
    }
}
