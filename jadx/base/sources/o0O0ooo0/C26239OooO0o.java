package o0O0ooo0;

import Oooo0oO.o00oO0O;
import android.content.Context;
import android.view.View;
import o0oOoOoO.C31099OooO0o0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oo000o.InterfaceC34635OooOOOO;

/* JADX INFO: renamed from: o0O0ooo0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26239OooO0o implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f89651OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f89652OooOo0o;

    public /* synthetic */ C26239OooO0o(Object obj, int i) {
        this.f89652OooOo0o = i;
        this.f89651OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f89652OooOo0o) {
            case 0:
                InterfaceC34635OooOOOO coordinates = (InterfaceC34635OooOOOO) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(coordinates, "coordinates");
                int iOooO00o = (int) (coordinates.OooO00o() & 4294967295L);
                o00oO0O o00oo0o = (o00oO0O) this.f89651OooOo;
                if (((Number) o00oo0o.getValue()).intValue() != iOooO00o) {
                    o00oo0o.setValue(Integer.valueOf(iOooO00o));
                }
                break;
            case 1:
                String text = (String) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
                ((com.orion.notein.p607ui.label.OooO0o) this.f89651OooOo).f71993OooO0O0.OooO0OO(text);
                break;
            default:
                View it = (View) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                Context context = ((com.orion.notein.p607ui.membership.plan.OooO00o) this.f89651OooOo).f72750OooOO0.getContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31099OooO0o0(context, null), 3);
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
