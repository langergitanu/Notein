package o0o00oO0;

import com.orion.notein.p607ui.p609vo.PenWidthVO;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0oo0Oo.C31253OooOOOo;
import oO00ooO.C32443OooOOO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class OooO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f106512OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f106513OooOo0o;

    public /* synthetic */ OooO(Object obj, int i) {
        this.f106513OooOo0o = i;
        this.f106512OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        float fOooO0O0;
        Object obj2 = this.f106512OooOo;
        switch (this.f106513OooOo0o) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                PenWidthVO penWidthVO = ((C29993OooOOOo) obj2).f106563Oooo0O0;
                if (penWidthVO != null) {
                    Object obj3 = C31253OooOOOo.OooO00o.f111551OooO00o;
                    C32443OooOOO c32443OooOOOOooO00o = C31253OooOOOo.OooO00o.OooO00o(penWidthVO.getType(), new C32443OooOOO(Float.valueOf(4.0f), Float.valueOf(20.0f)));
                    float fFloatValue = ((Number) c32443OooOOOOooO00o.f116638OooOo0o).floatValue();
                    fOooO0O0 = oO0O00O.OooO00o.OooO0O0((iIntValue * ((((Number) c32443OooOOOOooO00o.f116637OooOo).floatValue() - fFloatValue) / 100.0f)) + fFloatValue);
                } else {
                    fOooO0O0 = 0.0f;
                }
                return Float.valueOf(fOooO0O0);
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select MIN(sort_key) from NoteMetaEntity where parent_id is null and user_id = ?");
                String str = (String) obj2;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    Integer numValueOf = null;
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o() && !interfaceC24749OooO0OoO0ooOOo.isNull(0)) {
                        numValueOf = Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(0));
                        break;
                    }
                    return numValueOf;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
        }
    }
}
