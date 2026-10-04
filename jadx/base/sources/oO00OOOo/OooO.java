package oO00OOOo;

import OoooOoO.C21236OooO0oo;
import Ooooo00.C21246OooO0OO;
import io.ktor.utils.p616io.C23992OoooooO;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import io.ktor.utils.p616io.InterfaceC23990Oooooo;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import o000ooo.C24746OooO00o;
import oO00O0o0.C32183OooO0Oo;
import oO00OO.C32230OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0O.InterfaceC33569OooO0oo;
import oO0o0O0o.C33580OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oOo00O0O.AbstractC34457OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO implements oO00OOO.OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC34457OooO0OO f115756OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final LinkedHashMap f115757OooO0O0 = new LinkedHashMap();

    public OooO(AbstractC34457OooO0OO abstractC34457OooO0OO) {
        this.f115756OooO00o = abstractC34457OooO0OO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
    
        if (io.ktor.utils.p616io.C23992OoooooO.OooO0o(r10, r9, r2) != r3) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0OO(OooO oooO, InterfaceC33721OooO0o interfaceC33721OooO0o, InterfaceC33911OooO0OO interfaceC33911OooO0OO, Charset charset, InterfaceC23990Oooooo interfaceC23990Oooooo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C32238OooO0oo c32238OooO0oo;
        InterfaceC33721OooO0o interfaceC33721OooO0o2;
        Charset charset2;
        OooO oooO2;
        InterfaceC33911OooO0OO interfaceC33911OooO0OO2;
        OooO00o oooO00o;
        InterfaceC23990Oooooo interfaceC23990Oooooo2;
        InterfaceC23990Oooooo interfaceC23990Oooooo3;
        OooO00o oooO00o2;
        oooO.getClass();
        if (abstractC32479OooO0OO instanceof C32238OooO0oo) {
            c32238OooO0oo = (C32238OooO0oo) abstractC32479OooO0OO;
            int i = c32238OooO0oo.f115794OooOooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32238OooO0oo.f115794OooOooo = i - Integer.MIN_VALUE;
            } else {
                c32238OooO0oo = new C32238OooO0oo(oooO, abstractC32479OooO0OO);
            }
        }
        Object obj = c32238OooO0oo.f115791OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c32238OooO0oo.f115794OooOooo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            LinkedHashMap linkedHashMap = oooO.f115757OooO0O0;
            Object oooO00o3 = linkedHashMap.get(charset);
            if (oooO00o3 == null) {
                oooO00o3 = new OooO00o(charset);
                linkedHashMap.put(charset, oooO00o3);
            }
            OooO00o oooO00o4 = (OooO00o) oooO00o3;
            c32238OooO0oo.f115787OooOo0o = oooO;
            c32238OooO0oo.f115786OooOo = interfaceC33721OooO0o;
            c32238OooO0oo.f115789OooOoO0 = interfaceC33911OooO0OO;
            c32238OooO0oo.f115788OooOoO = charset;
            c32238OooO0oo.f115790OooOoOO = interfaceC23990Oooooo;
            c32238OooO0oo.f115792OooOoo0 = oooO00o4;
            c32238OooO0oo.f115794OooOooo = 1;
            if (C23992OoooooO.OooO0o(interfaceC23990Oooooo, oooO00o4.f115758OooO00o, c32238OooO0oo) != enumC32485OooO00o) {
                interfaceC33721OooO0o2 = interfaceC33721OooO0o;
                charset2 = charset;
                oooO2 = oooO;
                interfaceC33911OooO0OO2 = interfaceC33911OooO0OO;
                oooO00o = oooO00o4;
                interfaceC23990Oooooo2 = interfaceC23990Oooooo;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            OooO00o oooO00o5 = c32238OooO0oo.f115792OooOoo0;
            InterfaceC23990Oooooo interfaceC23990Oooooo4 = c32238OooO0oo.f115790OooOoOO;
            Charset charset3 = c32238OooO0oo.f115788OooOoO;
            InterfaceC33911OooO0OO interfaceC33911OooO0OO3 = c32238OooO0oo.f115789OooOoO0;
            interfaceC33721OooO0o2 = (InterfaceC33721OooO0o) c32238OooO0oo.f115786OooOo;
            OooO oooO3 = (OooO) c32238OooO0oo.f115787OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            oooO00o = oooO00o5;
            interfaceC33911OooO0OO2 = interfaceC33911OooO0OO3;
            interfaceC23990Oooooo2 = interfaceC23990Oooooo4;
            charset2 = charset3;
            oooO2 = oooO3;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            oooO00o2 = (OooO00o) c32238OooO0oo.f115786OooOo;
            interfaceC23990Oooooo3 = (InterfaceC23990Oooooo) c32238OooO0oo.f115787OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            byte[] bArr = oooO00o2.f115759OooO0O0;
            c32238OooO0oo.f115787OooOo0o = null;
            c32238OooO0oo.f115786OooOo = null;
            c32238OooO0oo.f115794OooOooo = 3;
        }
        Charset charset4 = charset2;
        interfaceC23990Oooooo3 = interfaceC23990Oooooo2;
        OooO0o oooO0o = new OooO0o(interfaceC23990Oooooo3, oooO00o, oooO2, interfaceC33911OooO0OO2, charset4);
        c32238OooO0oo.f115787OooOo0o = interfaceC23990Oooooo3;
        c32238OooO0oo.f115786OooOo = oooO00o;
        c32238OooO0oo.f115789OooOoO0 = null;
        c32238OooO0oo.f115788OooOoO = null;
        c32238OooO0oo.f115790OooOoOO = null;
        c32238OooO0oo.f115792OooOoo0 = null;
        c32238OooO0oo.f115794OooOooo = 2;
        if (interfaceC33721OooO0o2.collect(oooO0o, c32238OooO0oo) != enumC32485OooO00o) {
            oooO00o2 = oooO00o;
            byte[] bArr2 = oooO00o2.f115759OooO0O0;
            c32238OooO0oo.f115787OooOo0o = null;
            c32238OooO0oo.f115786OooOo = null;
            c32238OooO0oo.f115794OooOooo = 3;
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO00OOO.OooO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(Charset charset, oOOoOoOO.OooO00o oooO00o, InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws C32230OooO0oO {
        C32236OooO0o0 c32236OooO0o0;
        if (abstractC32479OooO0OO instanceof C32236OooO0o0) {
            c32236OooO0o0 = (C32236OooO0o0) abstractC32479OooO0OO;
            int i = c32236OooO0o0.f115779OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32236OooO0o0.f115779OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c32236OooO0o0 = new C32236OooO0o0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c32236OooO0o0.f115778OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c32236OooO0o0.f115779OooOoO0;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            if (!OooOOO0.OooO0O0(charset, C33580OooO00o.f121231OooO0O0) || !OooOOO0.OooO0O0(oooO00o.f123413OooO00o, C24035Oooo00o.f80943OooO00o.OooO0O0(InterfaceC33569OooO0oo.class))) {
                return null;
            }
            AbstractC34457OooO0OO abstractC34457OooO0OO = this.f115756OooO00o;
            c32236OooO0o0.f115779OooOoO0 = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new OooO0O0(interfaceC23986Ooooo0o, oooO00o, abstractC34457OooO0OO, null), c32236OooO0o0);
            return objOooO0o == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o;
        } catch (Throwable th) {
            throw new C32230OooO0oO("Illegal input: " + th.getMessage(), th);
        }
    }

    @Override // oO00OOO.OooO
    public final oO00O0oO.OooO00o OooO0O0(C32183OooO0Oo c32183OooO0Oo, Charset charset, oOOoOoOO.OooO00o oooO00o, Object obj) {
        if (!OooOOO0.OooO0O0(charset, C33580OooO00o.f121231OooO0O0) || !OooOOO0.OooO0O0(oooO00o.f123413OooO00o, C24035Oooo00o.f80943OooO00o.OooO0O0(InterfaceC33721OooO0o.class))) {
            return null;
        }
        return new oO00O0oO.OooO00o(new C32237OooO0oO(this, obj, C21236OooO0oo.OooO0Oo(this.f115756OooO00o.f123492OooO0O0, C21246OooO0OO.OooO0O0(oooO00o)), charset, null), C24746OooO00o.OooO0oo(c32183OooO0Oo, charset));
    }
}
