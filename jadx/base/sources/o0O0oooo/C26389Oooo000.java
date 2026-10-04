package o0O0oooo;

import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.penkit.models.ImageInfo;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oo0oO0.AbstractC34924o00oOOO0;

/* JADX INFO: renamed from: o0O0oooo.Oooo000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26389Oooo000 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f90544OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90545OooOo0o;

    public /* synthetic */ C26389Oooo000(Object obj, int i) {
        this.f90545OooOo0o = i;
        this.f90544OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        Object obj2 = this.f90544OooOo;
        switch (this.f90545OooOo0o) {
            case 0:
                ImageInfo it = (ImageInfo) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                return Boolean.valueOf(kotlin.jvm.internal.OooOOO0.OooO0O0(it.getId(), ((ImageInfo) obj2).getId()));
            case 1:
                Integer num = (Integer) obj;
                num.intValue();
                int i = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = (PenBarChildFragment) obj2;
                penBarChildFragment.Oooo0oO().OooOOo0(true, num);
                penBarChildFragment.Oooooo(11, num);
                return C32460OooOooO.f116667OooO00o;
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT MIN(ImageEntity.'left') AS 'left', MAX(ImageEntity.'right') AS 'right', MIN(ImageEntity.'top') AS 'top', MAX(ImageEntity.'bottom') AS 'bottom' FROM ImageEntity where page_id = ?");
                String str = (String) obj2;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    AbstractC34924o00oOOO0.OooO00o oooO00o = null;
                    Float fValueOf = null;
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        Float fValueOf2 = interfaceC24749OooO0OoO0ooOOo.isNull(0) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(0));
                        Float fValueOf3 = interfaceC24749OooO0OoO0ooOOo.isNull(1) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(1));
                        Float fValueOf4 = interfaceC24749OooO0OoO0ooOOo.isNull(2) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(2));
                        if (!interfaceC24749OooO0OoO0ooOOo.isNull(3)) {
                            fValueOf = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(3));
                        }
                        oooO00o = new AbstractC34924o00oOOO0.OooO00o(fValueOf2, fValueOf4, fValueOf3, fValueOf);
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return oooO00o;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
        }
    }
}
