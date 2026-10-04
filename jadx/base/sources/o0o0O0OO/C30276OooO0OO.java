package o0o0O0OO;

import com.orion.notein.p607ui.notelist.search.SearchListContainerFragment;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0o0O0OO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C30276OooO0OO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f107909OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f107910OooOo0o;

    public /* synthetic */ C30276OooO0OO(Object obj, int i) {
        this.f107910OooOo0o = i;
        this.f107909OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f107910OooOo0o) {
            case 0:
                Integer num = (Integer) obj;
                num.getClass();
                ((SearchListContainerFragment) this.f107909OooOo).OooOoOO().OooOO0(num);
                return C32460OooOooO.f116667OooO00o;
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT COUNT(*) FROM StrokeEntity WHERE layer_id = ?");
                String str = (String) this.f107909OooOo;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    Long lValueOf = null;
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o() && !interfaceC24749OooO0OoO0ooOOo.isNull(0)) {
                        lValueOf = Long.valueOf(interfaceC24749OooO0OoO0ooOOo.getLong(0));
                        break;
                    }
                    return lValueOf;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
        }
    }
}
