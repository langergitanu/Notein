package Oooo0O0;

import Oooo0.EnumC20853Ooooo0o;
import Oooo0.o000O0;
import Oooo0.o000O0Oo;
import Oooo0O0.Oooo0;
import Oooo0oO.o00oO0O;
import OooooO0.C21289OooO0o;
import OooooO0.C21290OooO0o0;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import o0000Ooo.C24237OooOO0o;
import oO00ooO.C32442OooOO0o;
import oO0O00oo.InterfaceC32518OooO0o0;
import oo000o.InterfaceC34635OooOOOO;
import oo0o0Oo.C34680OooO0O0;
import oo0o0Oo.C34695OooOOo0;
import oo0o0Oo.C34696OooOOoo;

/* JADX INFO: renamed from: Oooo0O0.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20939Oooo0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C21290OooO0o0> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o00oO0O<C24237OooOO0o> f60426OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C20935Oooo00o f60427OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20939Oooo0O0(C20935Oooo00o c20935Oooo00o, o00oO0O<C24237OooOO0o> o00oo0o) {
        super(0);
        this.f60427OooOo0o = c20935Oooo00o;
        this.f60426OooOo = o00oo0o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.OooO00o
    public final C21290OooO0o0 invoke() {
        long jOooOOO0;
        long j;
        o000O0Oo o000o0ooOooO0OO;
        C34680OooO0O0 c34680OooO0O0;
        InterfaceC34635OooOOOO interfaceC34635OooOOOO;
        o000O0Oo o000o0ooOooO0OO2;
        InterfaceC34635OooOOOO interfaceC34635OooOOOO2;
        C21290OooO0o0 c21290OooO0o0;
        long j2 = this.f60426OooOo.getValue().f81492OooO00o;
        C20935Oooo00o c20935Oooo00o = this.f60427OooOo0o;
        if (c20935Oooo00o.OooO0oo().f81083OooO00o.f124887OooOo0o.length() == 0) {
            jOooOOO0 = C21290OooO0o0.f61720OooO0Oo;
        } else {
            EnumC20853Ooooo0o enumC20853Ooooo0o = (EnumC20853Ooooo0o) c20935Oooo00o.f60416OooOOOO.getValue();
            int i = enumC20853Ooooo0o == null ? -1 : Oooo0.OooO0OO.f60398OooO00o[enumC20853Ooooo0o.ordinal()];
            if (i != -1) {
                if (i == 1 || i == 2) {
                    long j3 = c20935Oooo00o.OooO0oo().f81084OooO0O0;
                    int i2 = C34696OooOOoo.f124979OooO0OO;
                    j = j3 >> 32;
                } else {
                    if (i != 3) {
                        throw new C32442OooOO0o();
                    }
                    long j4 = c20935Oooo00o.OooO0oo().f81084OooO0O0;
                    int i3 = C34696OooOOoo.f124979OooO0OO;
                    j = j4 & 4294967295L;
                }
                int iOooO0O0 = c20935Oooo00o.f60404OooO0O0.OooO0O0((int) j);
                o000O0 o000o0 = c20935Oooo00o.f60406OooO0Oo;
                if (o000o0 == null || (o000o0ooOooO0OO = o000o0.OooO0OO()) == null) {
                    jOooOOO0 = C21290OooO0o0.f61720OooO0Oo;
                } else {
                    C34695OooOOo0 c34695OooOOo0 = o000o0ooOooO0OO.f60144OooO00o;
                    o000O0 o000o02 = c20935Oooo00o.f60406OooO0Oo;
                    if (o000o02 == null || (c34680OooO0O0 = o000o02.f60101OooO00o.f60009OooO00o) == null) {
                        jOooOOO0 = C21290OooO0o0.f61720OooO0Oo;
                    } else {
                        oO0O00oo.OooO oooO = new oO0O00oo.OooO(0, c34680OooO0O0.length() - 1, 1);
                        if (oooO instanceof InterfaceC32518OooO0o0) {
                            Object objValueOf = Integer.valueOf(iOooO0O0);
                            InterfaceC32518OooO0o0 interfaceC32518OooO0o0 = (InterfaceC32518OooO0o0) oooO;
                            if (interfaceC32518OooO0o0.isEmpty()) {
                                throw new IllegalArgumentException("Cannot coerce value to an empty range: " + interfaceC32518OooO0o0 + FilenameUtils.EXTENSION_SEPARATOR);
                            }
                            if (interfaceC32518OooO0o0.OooO0O0(objValueOf, interfaceC32518OooO0o0.getStart()) && !interfaceC32518OooO0o0.OooO0O0(interfaceC32518OooO0o0.getStart(), objValueOf)) {
                                objValueOf = interfaceC32518OooO0o0.getStart();
                            } else if (interfaceC32518OooO0o0.OooO0O0(interfaceC32518OooO0o0.getEndInclusive(), objValueOf) && !interfaceC32518OooO0o0.OooO0O0(objValueOf, interfaceC32518OooO0o0.getEndInclusive())) {
                                objValueOf = interfaceC32518OooO0o0.getEndInclusive();
                            }
                            iOooO0O0 = ((Number) objValueOf).intValue();
                        } else {
                            if (oooO.isEmpty()) {
                                throw new IllegalArgumentException("Cannot coerce value to an empty range: " + oooO + FilenameUtils.EXTENSION_SEPARATOR);
                            }
                            Integer num = 0;
                            if (iOooO0O0 < num.intValue()) {
                                Integer num2 = 0;
                                iOooO0O0 = num2.intValue();
                            } else {
                                int i4 = oooO.f116811OooOo;
                                if (iOooO0O0 > Integer.valueOf(i4).intValue()) {
                                    iOooO0O0 = Integer.valueOf(i4).intValue();
                                }
                            }
                        }
                        long jOooO00o = c34695OooOOo0.OooO0O0(iOooO0O0).OooO00o();
                        o000O0 o000o03 = c20935Oooo00o.f60406OooO0Oo;
                        if (o000o03 == null || (interfaceC34635OooOOOO = o000o03.f60107OooO0oO) == null || (o000o0ooOooO0OO2 = o000o03.OooO0OO()) == null || (interfaceC34635OooOOOO2 = o000o0ooOooO0OO2.f60145OooO0O0) == null || (c21290OooO0o0 = (C21290OooO0o0) c20935Oooo00o.f60417OooOOOo.getValue()) == null) {
                            jOooOOO0 = C21290OooO0o0.f61720OooO0Oo;
                        } else {
                            float fOooO0OO = C21290OooO0o0.OooO0OO(interfaceC34635OooOOOO2.OooOOO0(interfaceC34635OooOOOO, c21290OooO0o0.f61722OooO00o));
                            int iOooO0o = c34695OooOOo0.OooO0o(iOooO0O0);
                            int iOooO0oo = c34695OooOOo0.OooO0oo(iOooO0o);
                            int iOooO0o0 = c34695OooOOo0.OooO0o0(iOooO0o, true);
                            boolean z = ((int) (c20935Oooo00o.OooO0oo().f81084OooO0O0 >> 32)) > ((int) (c20935Oooo00o.OooO0oo().f81084OooO0O0 & 4294967295L));
                            float fOooO0OO2 = C20945OoooO00.OooO0OO(c34695OooOOo0, iOooO0oo, true, z);
                            float fOooO0OO3 = C20945OoooO00.OooO0OO(c34695OooOOo0, iOooO0o0, false, z);
                            float fOooO0o0 = oO0O00oo.OooOO0.OooO0o0(fOooO0OO, Math.min(fOooO0OO2, fOooO0OO3), Math.max(fOooO0OO2, fOooO0OO3));
                            jOooOOO0 = Math.abs(fOooO0OO - fOooO0o0) > ((float) (((int) (j2 >> 32)) / 2)) ? C21290OooO0o0.f61720OooO0Oo : interfaceC34635OooOOOO.OooOOO0(interfaceC34635OooOOOO2, C21289OooO0o.OooO00o(fOooO0o0, C21290OooO0o0.OooO0Oo(jOooO00o)));
                        }
                    }
                }
            } else {
                jOooOOO0 = C21290OooO0o0.f61720OooO0Oo;
            }
        }
        return new C21290OooO0o0(jOooOOO0);
    }
}
