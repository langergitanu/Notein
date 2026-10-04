package io.ktor.client.engine.cio;

import OoooOOo.C21211OooOoO;
import com.google.common.net.HttpHeaders;
import io.ktor.utils.p616io.C23992OoooooO;
import io.ktor.utils.p616io.C24005o00o0O;
import io.ktor.utils.p616io.InterfaceC23967Oooo00O;
import io.ktor.utils.p616io.InterfaceC23990Oooooo;
import io.ktor.utils.p616io.Oooo0;
import io.ktor.utils.p616io.o0Oo0oo;
import java.util.List;
import oO000o.C32087OooOOo0;
import oO000oo.C32134OooO0o0;
import oO00O0o.C32181OooOOOo;
import oO00O0o.OooO00o;
import oO00O0o0.C32190OooOOo0;
import oO00O0o0.C32192OooOo0;
import oO00O0o0.C32193OooOo0O;
import oO00O0o0.C32200OooOooO;
import oO00O0o0.C32206Oooo0OO;
import oO00O0o0.C32211OoooO0;
import oO00O0oO.OooO0OO;
import oO00Oo0.C32266OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33635Oooo00O;
import oO0o0OO.C33662Ooooooo;
import oO0o0OO.InterfaceC33672o00ooo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: io.ktor.client.engine.cio.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23945OooOoOO {
    public static final InterfaceC23990Oooooo OooO00o(Oooo0 oooo0, InterfaceC34415OooO0oo coroutineContext) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(coroutineContext, "coroutineContext");
        InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = coroutineContext.get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O0);
        ((InterfaceC33672o00ooo) oooO0O0).invokeOnCompletion(new C23940OooOo0(oooo0));
        return C24005o00o0O.OooO00o(C33662Ooooooo.f121350OooOo0o, coroutineContext, new io.ktor.utils.p616io.OooO00o(true), true, new C23941OooOo0O(oooo0, null)).f80790OooOo;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0O0(C32134OooO0o0 c32134OooO0o0, InterfaceC23990Oooooo interfaceC23990Oooooo, InterfaceC34415OooO0oo interfaceC34415OooO0oo, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C23942OooOo0o c23942OooOo0o;
        o0Oo0oo o0oo0oo2;
        InterfaceC23967Oooo00O interfaceC23967Oooo00OOooO0OO;
        C32134OooO0o0 c32134OooO0o02 = c32134OooO0o0;
        InterfaceC23990Oooooo interfaceC23990Oooooo2 = interfaceC23990Oooooo;
        InterfaceC34415OooO0oo coroutineContext = interfaceC34415OooO0oo;
        boolean z2 = z;
        if (abstractC32479OooO0OO instanceof C23942OooOo0o) {
            c23942OooOo0o = (C23942OooOo0o) abstractC32479OooO0OO;
            int i = c23942OooOo0o.f80469OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c23942OooOo0o.f80469OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c23942OooOo0o = new C23942OooOo0o(abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c23942OooOo0o.f80468OooOoOO;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c23942OooOo0o.f80469OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            if (c32134OooO0o02.f115218OooO0Oo instanceof OooO0OO.OooO0O0) {
                if (z2) {
                    C23992OoooooO.OooO0O0(interfaceC23990Oooooo2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
            List<String> list = C32190OooOOo0.f115537OooO00o;
            oO00O0o0.OooOOO0 oooOOO0 = c32134OooO0o02.f115217OooO0OO;
            String string = oooOOO0.get("Content-Length");
            oO00O0oO.OooO0OO oooO0OO = c32134OooO0o02.f115218OooO0Oo;
            if (string == null) {
                Long lOooO00o = oooO0OO.OooO00o();
                string = lOooO00o != null ? lOooO00o.toString() : null;
            }
            String str = oooOOO0.get(HttpHeaders.TRANSFER_ENCODING);
            String str2 = oooO0OO.OooO0OO().get(HttpHeaders.TRANSFER_ENCODING);
            if (string != null && !kotlin.jvm.internal.OooOOO0.OooO0O0(str2, "chunked") && !kotlin.jvm.internal.OooOOO0.OooO0O0(str, "chunked")) {
                o0oo0oo2 = null;
                InterfaceC23990Oooooo interfaceC23990Oooooo3 = interfaceC23990Oooooo2;
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(coroutineContext.plus(new C33635Oooo00O("Request body writer"))), null, null, new OooOo(c32134OooO0o02, (o0oo0oo2 != null || (interfaceC23967Oooo00OOooO0OO = o0oo0oo2.OooO0OO()) == null) ? interfaceC23990Oooooo3 : interfaceC23967Oooo00OOooO0OO, o0oo0oo2, interfaceC23990Oooooo3, z2, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
            c23942OooOo0o.f80465OooOo0o = c32134OooO0o02;
            c23942OooOo0o.f80464OooOo = interfaceC23990Oooooo2;
            c23942OooOo0o.f80467OooOoO0 = coroutineContext;
            c23942OooOo0o.f80466OooOoO = z2;
            c23942OooOo0o.f80469OooOoo0 = 1;
            OooO00o.C20203OooO00o c20203OooO00o = oO00O0o.OooO00o.f115450OooO00o;
            oO00O0o.OooO0OO oooO0OO2 = new oO00O0o.OooO0OO(interfaceC23990Oooooo2, null);
            C33662Ooooooo c33662Ooooooo = C33662Ooooooo.f121350OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(coroutineContext, "coroutineContext");
            objOooO00o = C24005o00o0O.OooO00o(c33662Ooooooo, coroutineContext, new io.ktor.utils.p616io.OooO00o(false), true, oooO0OO2);
            if (objOooO00o == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z3 = c23942OooOo0o.f80466OooOoO;
            InterfaceC34415OooO0oo interfaceC34415OooO0oo2 = c23942OooOo0o.f80467OooOoO0;
            InterfaceC23990Oooooo interfaceC23990Oooooo4 = c23942OooOo0o.f80464OooOo;
            C32134OooO0o0 c32134OooO0o03 = c23942OooOo0o.f80465OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
            z2 = z3;
            c32134OooO0o02 = c32134OooO0o03;
            coroutineContext = interfaceC34415OooO0oo2;
            interfaceC23990Oooooo2 = interfaceC23990Oooooo4;
        }
        o0oo0oo2 = (o0Oo0oo) objOooO00o;
        InterfaceC23990Oooooo interfaceC23990Oooooo32 = interfaceC23990Oooooo2;
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(coroutineContext.plus(new C33635Oooo00O("Request body writer"))), null, null, new OooOo(c32134OooO0o02, (o0oo0oo2 != null || (interfaceC23967Oooo00OOooO0OO = o0oo0oo2.OooO0OO()) == null) ? interfaceC23990Oooooo32 : interfaceC23967Oooo00OOooO0OO, o0oo0oo2, interfaceC23990Oooooo32, z2, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0OO(C32134OooO0o0 c32134OooO0o0, InterfaceC23990Oooooo interfaceC23990Oooooo, boolean z, boolean z2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C23944OooOoO0 c23944OooOoO0;
        C32181OooOOOo c32181OooOOOo;
        InterfaceC23990Oooooo interfaceC23990Oooooo2;
        boolean z3;
        C32211OoooO0 c32211OoooO0OooO0O0;
        if (abstractC32479OooO0OO instanceof C23944OooOoO0) {
            c23944OooOoO0 = (C23944OooOoO0) abstractC32479OooO0OO;
            int i = c23944OooOoO0.f80480OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c23944OooOoO0.f80480OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c23944OooOoO0 = new C23944OooOoO0(abstractC32479OooO0OO);
            }
        }
        Object obj = c23944OooOoO0.f80478OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c23944OooOoO0.f80480OooOoOO;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z4 = c23944OooOoO0.f80479OooOoO0;
            C32181OooOOOo c32181OooOOOo2 = c23944OooOoO0.f80476OooOo;
            InterfaceC23990Oooooo interfaceC23990Oooooo3 = c23944OooOoO0.f80477OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
                c32181OooOOOo = c32181OooOOOo2;
                z3 = z4;
                interfaceC23990Oooooo2 = interfaceC23990Oooooo3;
                interfaceC23990Oooooo2.flush();
                c32181OooOOOo.f115503OooO00o.close();
                return C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                th = th;
                c32181OooOOOo = c32181OooOOOo2;
                z3 = z4;
                interfaceC23990Oooooo2 = interfaceC23990Oooooo3;
                if (z3) {
                }
                throw th;
            }
        }
        C32446OooOOOo.OooO0O0(obj);
        c32181OooOOOo = new C32181OooOOOo();
        oO00Oo0.OooO0OO oooO0OO = c32181OooOOOo.f115503OooO00o;
        C32192OooOo0 c32192OooOo0 = c32134OooO0o0.f115216OooO0O0;
        C32211OoooO0 c32211OoooO0 = c32134OooO0o0.f115215OooO00o;
        List<String> list = C32190OooOOo0.f115537OooO00o;
        oO00O0o0.OooOOO0 oooOOO0 = c32134OooO0o0.f115217OooO0OO;
        String string = oooOOO0.get("Content-Length");
        oO00O0oO.OooO0OO oooO0OO2 = c32134OooO0o0.f115218OooO0Oo;
        if (string == null) {
            Long lOooO00o = oooO0OO2.OooO00o();
            string = lOooO00o != null ? lOooO00o.toString() : null;
        }
        String str = oooOOO0.get(HttpHeaders.TRANSFER_ENCODING);
        String str2 = oooO0OO2.OooO0OO().get(HttpHeaders.TRANSFER_ENCODING);
        boolean z5 = string == null || kotlin.jvm.internal.OooOOO0.OooO0O0(str2, "chunked") || kotlin.jvm.internal.OooOOO0.OooO0O0(str, "chunked");
        String str3 = oooOOO0.get(HttpHeaders.EXPECT);
        try {
            if (c32211OoooO0.f115597OooO0Oo.isEmpty()) {
                C32200OooOooO c32200OooOooO = new C32200OooOooO(0);
                C32206Oooo0OO.OooO0o0(c32200OooOooO, c32211OoooO0);
                OoooO0O.OooOo.OooOOOo(c32200OooOooO, "/");
                c32211OoooO0OooO0O0 = c32200OooOooO.OooO0O0();
            } else {
                c32211OoooO0OooO0O0 = c32211OoooO0;
            }
            c32181OooOOOo.OooO0O0(c32192OooOo0, z ? c32211OoooO0OooO0O0.f115593OooO : C32206Oooo0OO.OooO0O0(c32211OoooO0OooO0O0), C32193OooOo0O.f115545OooO0o0.toString());
            if (!(oooOOO0.f123715OooO0OO.get("Host") != null)) {
                c32181OooOOOo.OooO00o("Host", c32211OoooO0.f115594OooO00o.f115584OooO0O0 == c32211OoooO0.OooO00o() ? c32211OoooO0.f115595OooO0O0 : C32206Oooo0OO.OooO0OO(c32211OoooO0));
            }
            if (string != null && ((!c32192OooOo0.equals(C32192OooOo0.f115538OooO0O0) && !c32192OooOo0.equals(C32192OooOo0.f115540OooO0Oo)) || !(oooO0OO2 instanceof OooO0OO.OooO0O0))) {
                c32181OooOOOo.OooO00o("Content-Length", string);
            }
            C32087OooOOo0.OooO00o(oooOOO0, oooO0OO2, new C21211OooOoO(c32181OooOOOo, 1));
            if (z5 && str == null && str2 == null && !(oooO0OO2 instanceof OooO0OO.OooO0O0)) {
                c32181OooOOOo.OooO00o(HttpHeaders.TRANSFER_ENCODING, "chunked");
            }
            if ((str3 == null || (oooO0OO2 instanceof OooO0OO.OooO0O0)) ? false : true) {
                kotlin.jvm.internal.OooOOO0.OooO0Oo(str3);
                c32181OooOOOo.OooO00o(HttpHeaders.EXPECT, str3);
            }
            oooO0OO.o00000oO((byte) 13);
            oooO0OO.o00000oO((byte) 10);
            C32266OooO0Oo c32266OooO0OoOoOO = oooO0OO.ooOO();
            interfaceC23990Oooooo2 = interfaceC23990Oooooo;
            try {
                c23944OooOoO0.f80477OooOo0o = interfaceC23990Oooooo2;
                c23944OooOoO0.f80476OooOo = c32181OooOOOo;
                z3 = z2;
                try {
                    c23944OooOoO0.f80479OooOoO0 = z3;
                    c23944OooOoO0.f80480OooOoOO = 1;
                    if (interfaceC23990Oooooo2.OooOO0(c32266OooO0OoOoOO, c23944OooOoO0) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    interfaceC23990Oooooo2.flush();
                    c32181OooOOOo.f115503OooO00o.close();
                    return C32460OooOooO.f116667OooO00o;
                } catch (Throwable th2) {
                    th = th2;
                    if (z3) {
                        try {
                            C23992OoooooO.OooO0O0(interfaceC23990Oooooo2);
                        } catch (Throwable th3) {
                            c32181OooOOOo.f115503OooO00o.close();
                            throw th3;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                z3 = z2;
                if (z3) {
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            interfaceC23990Oooooo2 = interfaceC23990Oooooo;
        }
    }
}
