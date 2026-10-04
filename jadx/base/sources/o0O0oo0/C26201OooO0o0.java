package o0O0oo0;

import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import o0o00o.C29929OooOOOo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0O0oo0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26201OooO0o0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f89481OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f89482OooOo0o;

    public /* synthetic */ C26201OooO0o0(Object obj, int i) {
        this.f89482OooOo0o = i;
        this.f89481OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Object obj = this.f89481OooOo;
        switch (this.f89482OooOo0o) {
            case 0:
                ((InterfaceC32507OooOO0o) obj).invoke(Boolean.FALSE);
                return C32460OooOooO.f116667OooO00o;
            default:
                int i = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = (PenBoxChildFragment) obj;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                InterfaceC21987OooOoo interfaceC21987OooOoo = penBoxChildFragment.f75364Oooo000;
                if (interfaceC21987OooOoo != null) {
                    return new C29929OooOOOo(oooO0O0Oooo0o, interfaceC21987OooOoo);
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                throw null;
        }
    }
}
