package oO000o;

import java.io.Closeable;
import java.util.Set;
import oO000oo.C32134OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.AbstractC33630OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33632Oooo;
import oO0o0OO.C33635Oooo00O;
import oO0o0OO.C33664o00000Oo;
import oO0o0OO.C33671o00oO0o;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public interface OooO0O0 extends InterfaceC33636Oooo00o, Closeable {

    public static final class OooO00o {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r7v0, types: [oO000o.OooO0O0, oO000o.OooO0o, oO0o0OO.Oooo00o] */
        /* JADX WARN: Type inference failed for: r7v1, types: [oO000o.OooO0O0, oO0o0OO.Oooo00o] */
        /* JADX WARN: Type inference failed for: r7v4, types: [oO000o.OooO0O0] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Object OooO00o(OooO0o oooO0o, C32134OooO0o0 c32134OooO0o0, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
            OooO0OO oooO0OO;
            if (abstractC32479OooO0OO instanceof OooO0OO) {
                oooO0OO = (OooO0OO) abstractC32479OooO0OO;
                int i = oooO0OO.f114910OooOoO;
                if ((i & Integer.MIN_VALUE) != 0) {
                    oooO0OO.f114910OooOoO = i - Integer.MIN_VALUE;
                } else {
                    oooO0OO = new OooO0OO(abstractC32479OooO0OO);
                }
            }
            Object objPlus = oooO0OO.f114911OooOoO0;
            Object obj = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = oooO0OO.f114910OooOoO;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objPlus);
                C33664o00000Oo c33664o00000Oo = c32134OooO0o0.f115220OooO0o0;
                oooO0OO.f114909OooOo0o = oooO0o;
                oooO0OO.f114908OooOo = c32134OooO0o0;
                oooO0OO.f114910OooOoO = 1;
                C33635Oooo00O c33635Oooo00O = OooOO0O.f114929OooO00o;
                C33671o00oO0o c33671o00oO0o = new C33671o00oO0o(c33664o00000Oo);
                objPlus = oooO0o.OooOOO0().plus(c33671o00oO0o).plus(OooOO0O.f114929OooO00o);
                InterfaceC33672o00ooo interfaceC33672o00ooo = (InterfaceC33672o00ooo) oooO0OO.getContext().get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
                if (interfaceC33672o00ooo != null) {
                    c33671o00oO0o.invokeOnCompletion(new OooOOO0(interfaceC33672o00ooo.invokeOnCompletion(true, true, new OooOOO(c33671o00oO0o))));
                }
                if (objPlus != obj) {
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objPlus);
                return objPlus;
            }
            c32134OooO0o0 = oooO0OO.f114908OooOo;
            oooO0o = oooO0OO.f114909OooOo0o;
            C32446OooOOOo.OooO0O0(objPlus);
            InterfaceC34415OooO0oo interfaceC34415OooO0oo = (InterfaceC34415OooO0oo) objPlus;
            C33632Oooo c33632OoooOooO00o = C33609OooO0oo.OooO00o(oooO0o, interfaceC34415OooO0oo.plus(new C32085OooOO0o(interfaceC34415OooO0oo)), new C32081OooO0Oo(oooO0o, c32134OooO0o0, null), 2);
            oooO0OO.f114909OooOo0o = null;
            oooO0OO.f114908OooOo = null;
            oooO0OO.f114910OooOoO = 2;
            Object objOooOo00 = c33632OoooOooO00o.OooOo00(oooO0OO);
            return objOooOo00 == obj ? obj : objOooOo00;
        }
    }

    void OooOooO(oO000o0.OooO0o oooO0o);

    Set<InterfaceC32083OooO0oO<?>> OoooOOo();

    Object OoooOo0(C32134OooO0o0 c32134OooO0o0, AbstractC32479OooO0OO abstractC32479OooO0OO);

    AbstractC33630OooOooO o000O0oO();
}
