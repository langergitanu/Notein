package o0o00oO0;

import java.util.List;
import o0o00o0.C29936OooO0oO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0o00oO0.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29998OooOo0O implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f106591OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f106592OooOo0o;

    public /* synthetic */ C29998OooOo0O(Object obj, int i) {
        this.f106592OooOo0o = i;
        this.f106591OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f106592OooOo0o) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                C30006OooOooo c30006OooOooo = (C30006OooOooo) this.f106591OooOo;
                C29936OooO0oO c29936OooO0oO = c30006OooOooo.f106617Oooo;
                if (c29936OooO0oO != null) {
                    c29936OooO0oO.OooO0o0("pressure_correct", fFloatValue, c30006OooOooo.f106628OoooO0, "");
                }
                break;
            default:
                List list = (List) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
                ((o0o0O000.OooO0OO) this.f106591OooOo).OooO0Oo(list);
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
