package oO0ooooo;

import OooOOO0.AbstractC20449OooO0Oo;
import androidx.appcompat.widget.C21532OooOOo;
import java.io.IOException;
import java.util.HashMap;
import oO0oO0Oo.AbstractC34033OooOo0o;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34032OooOo0O;
import oO0oOO00.InterfaceC34104OooO00o;
import oO0oOOOO.InterfaceC34117OooO0o0;
import oO0oOo0.C34142OooO00o;
import oO0oOo0.C34162OooOo00;
import oO0oooO.C34280OooO;
import oO0oooO.C34282OooO0O0;
import oO0oooO.C34288OooO0oo;
import oO0oooO.C34289OooOO0;
import oO0oooO.C34292OooOOO;
import oO0oooO.InterfaceC34286OooO0o0;
import oO0oooOO.C34296OooO;
import oO0oooOO.C34300OooO0Oo;
import oO0oooOo.C34308OooO0O0;
import oOO000oO.C34332OooO00o;
import oOo000OO.C34417OooO0O0;
import oOo00o00.C34551OooO0OO;
import oOo00oo0.C34565OooO0OO;
import p619oO.C31898OooOOo;
import p619oO.C31903OooOo0o;
import p619oO.C31904OooOoO;
import p619oO.C31905OooOoO0;
import p619oO.OooOo00;

/* JADX INFO: renamed from: oO0ooooo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34312OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final HashMap f123184OooO00o;

    /* JADX INFO: renamed from: oO0ooooo.OooO0OO$OooO00o */
    public static class OooO00o extends OooO0o {
        @Override // oO0ooooo.C34312OooO0OO.OooO0o
        public final oO0000oo.OooO0OO OooO00o(C34162OooOo00 c34162OooOo00) throws IOException {
            byte[] bArrOooO0Oo = AbstractC34033OooOo0o.OooOOo0(c34162OooOo00.OooO()).f122362OooOo0o;
            if (AbstractC20449OooO0Oo.OooO0oo(0, bArrOooO0Oo) == 1) {
                return C34296OooO.OooO0Oo(C34332OooO00o.OooO0Oo(bArrOooO0Oo, 4, bArrOooO0Oo.length));
            }
            if (bArrOooO0Oo.length == 64) {
                bArrOooO0Oo = C34332OooO00o.OooO0Oo(bArrOooO0Oo, 4, bArrOooO0Oo.length);
            }
            return C34300OooO0Oo.OooO0Oo(bArrOooO0Oo);
        }
    }

    /* JADX INFO: renamed from: oO0ooooo.OooO0OO$OooO0O0 */
    public static class OooO0O0 extends OooO0o {
        @Override // oO0ooooo.C34312OooO0OO.OooO0o
        public final oO0000oo.OooO0OO OooO00o(C34162OooOo00 c34162OooOo00) throws IOException {
            AbstractC34036OooOoOO abstractC34036OooOoOOOooO = c34162OooOo00.OooO();
            C34282OooO0O0 c34282OooO0O0 = abstractC34036OooOoOOOooO != null ? new C34282OooO0O0(AbstractC34039OooOooO.OooOOoo(abstractC34036OooOoOOOooO)) : null;
            return new C34565OooO0OO(c34282OooO0O0.f123069OooOo0o, c34282OooO0O0.f123068OooOo, c34282OooO0O0.f123071OooOoO0, C34317OooO0o0.OooO0OO(c34282OooO0O0.f123070OooOoO.f122685OooOo0o));
        }
    }

    /* JADX INFO: renamed from: oO0ooooo.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static class C20349OooO0OO extends OooO0o {
        @Override // oO0ooooo.C34312OooO0OO.OooO0o
        public final oO0000oo.OooO0OO OooO00o(C34162OooOo00 c34162OooOo00) throws IOException {
            return new C34308OooO0O0(c34162OooOo00.f122750OooOo.OooOOo());
        }
    }

    /* JADX INFO: renamed from: oO0ooooo.OooO0OO$OooO0Oo */
    public static class OooO0Oo extends OooO0o {
        @Override // oO0ooooo.C34312OooO0OO.OooO0o
        public final oO0000oo.OooO0OO OooO00o(C34162OooOo00 c34162OooOo00) throws IOException {
            int i;
            int iIntValue = ((Integer) C34317OooO0o0.f123185OooO.get(c34162OooOo00.f122751OooOo0o.f122685OooOo0o)).intValue();
            byte[] bArrOooOo00 = c34162OooOo00.f122750OooOo.OooOo00();
            C34417OooO0O0 c34417OooO0O0 = new C34417OooO0O0(2);
            int length = bArrOooOo00.length;
            if (iIntValue == 5) {
                i = 14880;
            } else {
                if (iIntValue != 6) {
                    throw new IllegalArgumentException(C21532OooOOo.OooO0OO(iIntValue, "unknown security category: "));
                }
                i = 38432;
            }
            if (length != i) {
                throw new IllegalArgumentException("invalid key size for security category");
            }
            c34417OooO0O0.f123430OooOo = iIntValue;
            c34417OooO0O0.f123431OooOoO0 = C34332OooO00o.OooO00o(bArrOooOo00);
            return c34417OooO0O0;
        }
    }

    /* JADX INFO: renamed from: oO0ooooo.OooO0OO$OooO0o */
    public static abstract class OooO0o {
        public abstract oO0000oo.OooO0OO OooO00o(C34162OooOo00 c34162OooOo00) throws IOException;
    }

    /* JADX INFO: renamed from: oO0ooooo.OooO0OO$OooO0o0, reason: case insensitive filesystem */
    public static class C34313OooO0o0 extends OooO0o {
        @Override // oO0ooooo.C34312OooO0OO.OooO0o
        public final oO0000oo.OooO0OO OooO00o(C34162OooOo00 c34162OooOo00) throws IOException {
            return new C34551OooO0OO(c34162OooOo00.f122750OooOo.OooOOo(), C34317OooO0o0.OooO0o(C34288OooO0oo.OooO0oo(c34162OooOo00.f122751OooOo0o.f122684OooOo)));
        }
    }

    /* JADX INFO: renamed from: oO0ooooo.OooO0OO$OooO0oO, reason: case insensitive filesystem */
    public static class C34314OooO0oO extends OooO0o {
        @Override // oO0ooooo.C34312OooO0OO.OooO0o
        public final oO0000oo.OooO0OO OooO00o(C34162OooOo00 c34162OooOo00) throws IOException {
            C34280OooO c34280OooOOooO0oo = C34280OooO.OooO0oo(c34162OooOo00.f122751OooOo0o.f122684OooOo);
            if (c34280OooOOooO0oo == null) {
                byte[] bArr = AbstractC34033OooOo0o.OooOOo0(c34162OooOo00.OooO()).f122362OooOo0o;
                C31905OooOoO0.OooO00o oooO00o = new C31905OooOoO0.OooO00o(C31903OooOo0o.f113709OooO0oo.get(Integer.valueOf(AbstractC20449OooO0Oo.OooO0oo(0, bArr))));
                oooO00o.f113727OooO0Oo = C31904OooOoO.OooO0O0(bArr);
                return new C31905OooOoO0(oooO00o);
            }
            C34032OooOo0O c34032OooOo0O = c34280OooOOooO0oo.f123061OooOoO0.f122685OooOo0o;
            AbstractC34036OooOoOO abstractC34036OooOoOOOooO = c34162OooOo00.OooO();
            C34292OooOOO c34292OooOOO = abstractC34036OooOoOOOooO != null ? new C34292OooOOO(AbstractC34039OooOooO.OooOOoo(abstractC34036OooOoOOOooO)) : null;
            C31905OooOoO0.OooO00o oooO00o2 = new C31905OooOoO0.OooO00o(new C31903OooOo0o(c34280OooOOooO0oo.f123059OooOo, C34317OooO0o0.OooO0O0(c34032OooOo0O)));
            oooO00o2.f113726OooO0OO = C31904OooOoO.OooO0O0(C34332OooO00o.OooO00o(c34292OooOOO.f123122OooOo0o));
            oooO00o2.f113725OooO0O0 = C31904OooOoO.OooO0O0(C34332OooO00o.OooO00o(c34292OooOOO.f123121OooOo));
            return new C31905OooOoO0(oooO00o2);
        }
    }

    /* JADX INFO: renamed from: oO0ooooo.OooO0OO$OooO0oo, reason: case insensitive filesystem */
    public static class C34315OooO0oo extends OooO0o {
        @Override // oO0ooooo.C34312OooO0OO.OooO0o
        public final oO0000oo.OooO0OO OooO00o(C34162OooOo00 c34162OooOo00) throws IOException {
            C34289OooOO0 c34289OooOO0OooO0oo = C34289OooOO0.OooO0oo(c34162OooOo00.f122751OooOo0o.f122684OooOo);
            if (c34289OooOO0OooO0oo == null) {
                byte[] bArr = AbstractC34033OooOo0o.OooOOo0(c34162OooOo00.OooO()).f122362OooOo0o;
                OooOo00.OooO00o oooO00o = new OooOo00.OooO00o(C31898OooOOo.f113664OooO0o0.get(Integer.valueOf(AbstractC20449OooO0Oo.OooO0oo(0, bArr))));
                oooO00o.f113708OooO0Oo = C31904OooOoO.OooO0O0(bArr);
                return new OooOo00(oooO00o);
            }
            C34032OooOo0O c34032OooOo0O = c34289OooOO0OooO0oo.f123109OooOoO.f122685OooOo0o;
            AbstractC34036OooOoOO abstractC34036OooOoOOOooO = c34162OooOo00.OooO();
            C34292OooOOO c34292OooOOO = abstractC34036OooOoOOOooO != null ? new C34292OooOOO(AbstractC34039OooOooO.OooOOoo(abstractC34036OooOoOOOooO)) : null;
            OooOo00.OooO00o oooO00o2 = new OooOo00.OooO00o(new C31898OooOOo(c34289OooOO0OooO0oo.f123107OooOo, c34289OooOO0OooO0oo.f123110OooOoO0, C34317OooO0o0.OooO0O0(c34032OooOo0O)));
            oooO00o2.f113707OooO0OO = C31904OooOoO.OooO0O0(C34332OooO00o.OooO00o(c34292OooOOO.f123122OooOo0o));
            oooO00o2.f113706OooO0O0 = C31904OooOoO.OooO0O0(C34332OooO00o.OooO00o(c34292OooOOO.f123121OooOo));
            return new OooOo00(oooO00o2);
        }
    }

    static {
        HashMap map = new HashMap();
        f123184OooO00o = map;
        map.put(InterfaceC34286OooO0o0.f123098OooO0oo, new OooO0Oo());
        map.put(InterfaceC34286OooO0o0.f123090OooO, new OooO0Oo());
        map.put(InterfaceC34286OooO0o0.f123094OooO0Oo, new C34313OooO0o0());
        map.put(InterfaceC34286OooO0o0.f123096OooO0o0, new C20349OooO0OO());
        map.put(InterfaceC34286OooO0o0.f123095OooO0o, new C34314OooO0oO());
        map.put(InterfaceC34286OooO0o0.f123097OooO0oO, new C34315OooO0oo());
        map.put(InterfaceC34104OooO00o.f122520OooO00o, new C34314OooO0oO());
        map.put(InterfaceC34104OooO00o.f122521OooO0O0, new C34315OooO0oo());
        map.put(InterfaceC34117OooO0o0.f122611OooOo0O, new OooO00o());
        map.put(InterfaceC34286OooO0o0.f123093OooO0OO, new OooO0O0());
    }

    public static oO0000oo.OooO0OO OooO00o(C34162OooOo00 c34162OooOo00) throws IOException {
        C34142OooO00o c34142OooO00o = c34162OooOo00.f122751OooOo0o;
        OooO0o oooO0o = (OooO0o) f123184OooO00o.get(c34142OooO00o.f122685OooOo0o);
        if (oooO0o != null) {
            return oooO0o.OooO00o(c34162OooOo00);
        }
        throw new IOException("algorithm identifier in public key not recognised: " + c34142OooO00o.f122685OooOo0o);
    }
}
