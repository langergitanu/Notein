package oO0ooooo;

import OooOOO0.AbstractC20449OooO0Oo;
import androidx.appcompat.widget.C21532OooOOo;
import java.io.IOException;
import oO0oO0Oo.AbstractC34033OooOo0o;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34032OooOo0O;
import oO0oO0Oo.C34066Oooooo0;
import oO0oO0o0.InterfaceC34081OooO00o;
import oO0oOOOO.C34116OooO0o;
import oO0oOOOO.InterfaceC34117OooO0o0;
import oO0oOo0.C34142OooO00o;
import oO0oooO.C34280OooO;
import oO0oooO.C34281OooO00o;
import oO0oooO.C34288OooO0oo;
import oO0oooO.C34289OooOO0;
import oO0oooO.C34290OooOO0O;
import oO0oooO.C34293OooOOO0;
import oO0oooO.InterfaceC34286OooO0o0;
import oO0oooOO.C34296OooO;
import oO0oooOO.C34299OooO0OO;
import oO0oooOO.C34300OooO0Oo;
import oO0oooOO.C34304OooO0oo;
import oO0oooOo.C34307OooO00o;
import oOO000o.C34328OooO0Oo;
import oOO000o.C34329OooO0o0;
import oOO000oO.C34332OooO00o;
import oOo000OO.C34416OooO00o;
import oOo00o00.C34550OooO0O0;
import oOo00oo0.C34564OooO0O0;
import p619oO.C31898OooOOo;
import p619oO.C31900OooOOoo;
import p619oO.C31903OooOo0o;
import p619oO.C31904OooOoO;
import p619oO.OooOo;

/* JADX INFO: renamed from: oO0ooooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34310OooO00o {
    public static oO0000oo.OooO0OO OooO00o(C34116OooO0o c34116OooO0o) throws Throwable {
        int i;
        C34032OooOo0O c34032OooOo0O = c34116OooO0o.f122584OooOo.f122685OooOo0o;
        C34032OooOo0O c34032OooOo0O2 = InterfaceC34081OooO00o.f122450OooO0Oo;
        c34032OooOo0O.getClass();
        String str = c34032OooOo0O2.f122357OooOo0o;
        String str2 = c34032OooOo0O.f122357OooOo0o;
        int length = str2.length();
        int length2 = str.length();
        C34142OooO00o c34142OooO00o = c34116OooO0o.f122584OooOo;
        if (length > length2 && str2.charAt(str.length()) == '.' && str2.startsWith(str)) {
            AbstractC34033OooOo0o abstractC34033OooOo0oOooOOo0 = AbstractC34033OooOo0o.OooOOo0(c34116OooO0o.OooO());
            int iIntValue = ((Integer) C34317OooO0o0.f123185OooO.get(c34142OooO00o.f122685OooOo0o)).intValue();
            byte[] bArr = abstractC34033OooOo0oOooOOo0.f122362OooOo0o;
            C34416OooO00o c34416OooO00o = new C34416OooO00o(2);
            int length3 = bArr.length;
            if (iIntValue == 5) {
                i = 5224;
            } else {
                if (iIntValue != 6) {
                    throw new IllegalArgumentException(C21532OooOOo.OooO0OO(iIntValue, "unknown security category: "));
                }
                i = 12392;
            }
            if (length3 != i) {
                throw new IllegalArgumentException("invalid key size for security category");
            }
            c34416OooO00o.f123428OooOo = iIntValue;
            c34416OooO00o.f123429OooOoO0 = C34332OooO00o.OooO00o(bArr);
            return c34416OooO00o;
        }
        if (c34032OooOo0O.OooOO0o(InterfaceC34081OooO00o.f122447OooO00o)) {
            return new C34550OooO0O0(AbstractC34033OooOo0o.OooOOo0(c34116OooO0o.OooO()).f122362OooOo0o, C34317OooO0o0.OooO0o(C34288OooO0oo.OooO0oo(c34142OooO00o.f122684OooOo)));
        }
        if (c34032OooOo0O.OooOO0o(InterfaceC34081OooO00o.f122453OooO0oO)) {
            byte[] bArr2 = AbstractC34033OooOo0o.OooOOo0(c34116OooO0o.OooO()).f122362OooOo0o;
            int length4 = bArr2.length / 2;
            short[] sArr = new short[length4];
            for (int i2 = 0; i2 != length4; i2++) {
                int i3 = i2 * 2;
                sArr[i2] = (short) (((bArr2[i3 + 1] & 255) << 8) | (bArr2[i3] & 255));
            }
            return new C34307OooO00o(sArr);
        }
        if (c34032OooOo0O.OooOO0o(InterfaceC34117OooO0o0.f122611OooOo0O)) {
            byte[] bArr3 = AbstractC34033OooOo0o.OooOOo0(c34116OooO0o.OooO()).f122362OooOo0o;
            C34066Oooooo0 c34066Oooooo0 = c34116OooO0o.f122588OooOoOO;
            if (AbstractC20449OooO0Oo.OooO0oo(0, bArr3) != 1) {
                if (c34066Oooooo0 == null) {
                    return C34299OooO0OO.OooO0Oo(C34332OooO00o.OooO0Oo(bArr3, 4, bArr3.length));
                }
                byte[] bArrOooOo00 = c34066Oooooo0.OooOo00();
                C34299OooO0OO c34299OooO0OOOooO0Oo = C34299OooO0OO.OooO0Oo(C34332OooO00o.OooO0Oo(bArr3, 4, bArr3.length));
                C34300OooO0Oo.OooO0Oo(bArrOooOo00);
                c34299OooO0OOOooO0Oo.getClass();
                return c34299OooO0OOOooO0Oo;
            }
            if (c34066Oooooo0 == null) {
                return C34304OooO0oo.OooO0o(C34332OooO00o.OooO0Oo(bArr3, 4, bArr3.length));
            }
            byte[] bArrOooOo002 = c34066Oooooo0.OooOo00();
            byte[] bArrOooO0Oo = C34332OooO00o.OooO0Oo(bArr3, 4, bArr3.length);
            byte[] bArrOooO0Oo2 = C34332OooO00o.OooO0Oo(bArrOooOo002, 4, bArrOooOo002.length);
            C34304OooO0oo c34304OooO0ooOooO0o = C34304OooO0oo.OooO0o(bArrOooO0Oo);
            c34304OooO0ooOooO0o.f123165Oooo00O = C34296OooO.OooO0Oo(bArrOooO0Oo2);
            return c34304OooO0ooOooO0o;
        }
        if (c34032OooOo0O.OooOO0o(InterfaceC34081OooO00o.f122448OooO0O0)) {
            C34280OooO c34280OooOOooO0oo = C34280OooO.OooO0oo(c34142OooO00o.f122684OooOo);
            C34032OooOo0O c34032OooOo0O3 = c34280OooOOooO0oo.f123061OooOoO0.f122685OooOo0o;
            AbstractC34036OooOoOO abstractC34036OooOoOOOooO = c34116OooO0o.OooO();
            C34293OooOOO0 c34293OooOOO0 = abstractC34036OooOoOOOooO != null ? new C34293OooOOO0(AbstractC34039OooOooO.OooOOoo(abstractC34036OooOoOOOooO)) : null;
            try {
                OooOo.OooO00o oooO00o = new OooOo.OooO00o(new C31903OooOo0o(c34280OooOOooO0oo.f123059OooOo, C34317OooO0o0.OooO0O0(c34032OooOo0O3)));
                int i4 = c34293OooOOO0.f123123OooOo;
                byte[] bArr4 = c34293OooOOO0.f123130OooOooO;
                oooO00o.f113692OooO0O0 = i4;
                oooO00o.f113694OooO0Oo = C31904OooOoO.OooO0O0(C34332OooO00o.OooO00o(c34293OooOOO0.f123126OooOoO0));
                oooO00o.f113696OooO0o0 = C31904OooOoO.OooO0O0(C34332OooO00o.OooO00o(c34293OooOOO0.f123125OooOoO));
                oooO00o.f113695OooO0o = C31904OooOoO.OooO0O0(C34332OooO00o.OooO00o(c34293OooOOO0.f123127OooOoOO));
                oooO00o.f113697OooO0oO = C31904OooOoO.OooO0O0(C34332OooO00o.OooO00o(c34293OooOOO0.f123129OooOoo0));
                if (c34293OooOOO0.f123124OooOo0o != 0) {
                    oooO00o.f113693OooO0OO = c34293OooOOO0.f123128OooOoo;
                }
                if (C34332OooO00o.OooO00o(bArr4) != null) {
                    p619oO.OooO00o oooO00o2 = (p619oO.OooO00o) C31904OooOoO.OooO0o0(C34332OooO00o.OooO00o(bArr4), p619oO.OooO00o.class);
                    oooO00o2.getClass();
                    oooO00o.f113698OooO0oo = new p619oO.OooO00o(oooO00o2, c34032OooOo0O3);
                }
                return new OooOo(oooO00o);
            } catch (ClassNotFoundException e) {
                throw new IOException("ClassNotFoundException processing BDS state: " + e.getMessage());
            }
        }
        if (!c34032OooOo0O.OooOO0o(InterfaceC34286OooO0o0.f123097OooO0oO)) {
            if (!c34032OooOo0O.OooOO0o(InterfaceC34286OooO0o0.f123093OooO0OO)) {
                throw new RuntimeException("algorithm identifier in private key not recognised");
            }
            C34281OooO00o c34281OooO00oOooO0oo = C34281OooO00o.OooO0oo(c34116OooO0o.OooO());
            return new C34564OooO0O0(c34281OooO00oOooO0oo.f123063OooOo0o, c34281OooO00oOooO0oo.f123062OooOo, new oOO000o.OooO0O0(c34281OooO00oOooO0oo.f123065OooOoO0), new C34329OooO0o0(new oOO000o.OooO0O0(c34281OooO00oOooO0oo.f123065OooOoO0), c34281OooO00oOooO0oo.f123064OooOoO), new C34328OooO0Oo(c34281OooO00oOooO0oo.f123066OooOoOO), C34317OooO0o0.OooO0OO(c34281OooO00oOooO0oo.f123067OooOoo0.f122685OooOo0o));
        }
        C34289OooOO0 c34289OooOO0OooO0oo = C34289OooOO0.OooO0oo(c34142OooO00o.f122684OooOo);
        C34032OooOo0O c34032OooOo0O4 = c34289OooOO0OooO0oo.f123109OooOoO.f122685OooOo0o;
        try {
            AbstractC34036OooOoOO abstractC34036OooOoOOOooO2 = c34116OooO0o.OooO();
            C34290OooOO0O c34290OooOO0O = abstractC34036OooOoOOOooO2 != null ? new C34290OooOO0O(AbstractC34039OooOooO.OooOOoo(abstractC34036OooOoOOOooO2)) : null;
            int i5 = c34289OooOO0OooO0oo.f123107OooOo;
            C31900OooOOoo.OooO00o oooO00o3 = new C31900OooOOoo.OooO00o(new C31898OooOOo(i5, c34289OooOO0OooO0oo.f123110OooOoO0, C34317OooO0o0.OooO0O0(c34032OooOo0O4)));
            long j = c34290OooOO0O.f123111OooOo;
            byte[] bArr5 = c34290OooOO0O.f123118OooOooO;
            oooO00o3.f113678OooO0O0 = j;
            oooO00o3.f113680OooO0Oo = C31904OooOoO.OooO0O0(C34332OooO00o.OooO00o(c34290OooOO0O.f123113OooOoO));
            oooO00o3.f113682OooO0o0 = C31904OooOoO.OooO0O0(C34332OooO00o.OooO00o(c34290OooOO0O.f123115OooOoOO));
            oooO00o3.f113681OooO0o = C31904OooOoO.OooO0O0(C34332OooO00o.OooO00o(c34290OooOO0O.f123117OooOoo0));
            oooO00o3.f113683OooO0oO = C31904OooOoO.OooO0O0(C34332OooO00o.OooO00o(c34290OooOO0O.f123116OooOoo));
            if (c34290OooOO0O.f123112OooOo0o != 0) {
                oooO00o3.f113679OooO0OO = c34290OooOO0O.f123114OooOoO0;
            }
            if (C34332OooO00o.OooO00o(bArr5) != null) {
                p619oO.OooO0O0 oooO0O0OooO00o = ((p619oO.OooO0O0) C31904OooOoO.OooO0o0(C34332OooO00o.OooO00o(bArr5), p619oO.OooO0O0.class)).OooO00o(c34032OooOo0O4);
                if (oooO0O0OooO00o.f113616OooOo == 0) {
                    oooO00o3.f113684OooO0oo = new p619oO.OooO0O0(oooO0O0OooO00o, (1 << i5) - 1);
                } else {
                    oooO00o3.f113684OooO0oo = oooO0O0OooO00o;
                }
            }
            return new C31900OooOOoo(oooO00o3);
        } catch (ClassNotFoundException e2) {
            throw new IOException("ClassNotFoundException processing BDS state: " + e2.getMessage());
        }
    }
}
