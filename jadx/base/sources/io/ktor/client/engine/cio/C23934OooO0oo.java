package io.ktor.client.engine.cio;

import androidx.core.location.LocationRequestCompat;
import io.ktor.client.engine.cio.OooOO0;
import java.util.HashMap;
import oO00O0oo.C32218OooO0Oo;
import oO00O0oo.C32222OooOO0o;
import oO00O0oo.InterfaceC32225OooOOo0;
import oO00O0oo.OooOo00;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OOo.C32654OooO0O0;
import oO0o0oOo.C33903OooOO0;
import oO0o0oOo.C33904OooOO0O;
import oO0o0oOo.InterfaceC33899OooO0o;

/* JADX INFO: renamed from: io.ktor.client.engine.cio.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23934OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C32654OooO0O0 f80388OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C33903OooOO0 f80389OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oO00OOo0.OooO0OO<C32222OooOO0o, InterfaceC33899OooO0o> f80390OooO0OO = new oO00OOo0.OooO0OO<>();

    public C23934OooO0oo(C32654OooO0O0 c32654OooO0O0, int i) {
        this.f80388OooO00o = c32654OooO0O0;
        this.f80389OooO0O0 = C33904OooOO0O.OooO00o(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0104, code lost:
    
        if (r13 != r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, oO00O0oo.OooOO0o] */
    /* JADX WARN: Type inference failed for: r11v1, types: [oO0o0oOo.OooO0o] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r12v0, types: [io.ktor.client.engine.cio.OooOO0$OooO00o, oO0O000o.OooOO0o] */
    /* JADX WARN: Type inference failed for: r12v1, types: [io.ktor.client.engine.cio.OooO0oo] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v2, types: [oO0O000o.OooOO0o] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r13v10, types: [oO0O000o.OooOO0o] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [oO00O0oo.OooOO0o] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(C32222OooOO0o c32222OooOO0o, OooOO0.OooO00o oooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO0o oooO0o;
        C23934OooO0oo c23934OooO0oo;
        ?? r12;
        ?? r11;
        ?? r2;
        InterfaceC33899OooO0o interfaceC33899OooO0o;
        ?? r13;
        C23934OooO0oo c23934OooO0oo2;
        if (abstractC32479OooO0OO instanceof OooO0o) {
            oooO0o = (OooO0o) abstractC32479OooO0OO;
            int i = oooO0o.f80382OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f80382OooOoo = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = oooO0o.f80381OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0o.f80382OooOoo;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO00o);
                oooO0o.f80378OooOo0o = this;
                oooO0o.f80377OooOo = c32222OooOO0o;
                oooO0o.f80380OooOoO0 = oooO00o;
                oooO0o.f80382OooOoo = 1;
                if (this.f80389OooO0O0.OooO0O0(oooO0o) != enumC32485OooO00o) {
                    c23934OooO0oo = this;
                    r11 = c32222OooOO0o;
                    r12 = oooO00o;
                }
                return enumC32485OooO00o;
            }
            if (i2 == 1) {
                InterfaceC32507OooOO0o interfaceC32507OooOO0o = oooO0o.f80380OooOoO0;
                C32222OooOO0o c32222OooOO0o2 = (C32222OooOO0o) oooO0o.f80377OooOo;
                c23934OooO0oo = oooO0o.f80378OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
                r11 = c32222OooOO0o2;
                r12 = interfaceC32507OooOO0o;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InterfaceC33899OooO0o interfaceC33899OooO0o2 = (InterfaceC33899OooO0o) oooO0o.f80377OooOo;
                    C23934OooO0oo c23934OooO0oo3 = oooO0o.f80378OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO00o);
                    c32222OooOO0o = interfaceC33899OooO0o2;
                    oooO00o = c23934OooO0oo3;
                    return (InterfaceC32225OooOOo0) objOooO00o;
                }
                InterfaceC33899OooO0o interfaceC33899OooO0o3 = oooO0o.f80379OooOoO;
                InterfaceC32507OooOO0o interfaceC32507OooOO0o2 = oooO0o.f80380OooOoO0;
                C32222OooOO0o c32222OooOO0o3 = (C32222OooOO0o) oooO0o.f80377OooOo;
                C23934OooO0oo c23934OooO0oo4 = oooO0o.f80378OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
                r13 = interfaceC32507OooOO0o2;
                c23934OooO0oo2 = c23934OooO0oo4;
                r2 = c32222OooOO0o3;
                interfaceC33899OooO0o = interfaceC33899OooO0o3;
                C32654OooO0O0 c32654OooO0O0 = c23934OooO0oo2.f80388OooO00o;
                HashMap map = new HashMap();
                C32218OooO0Oo block = C32218OooO0Oo.f115620OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(block, "block");
                OooOo00.OooO00o oooO00o2 = new OooOo00.OooO00o(new HashMap(map));
                block.invoke(oooO00o2);
                HashMap map2 = new HashMap(oooO00o2.f115681OooO00o);
                oO00O0oo.OooOo00 oooO0O0 = new OooOo00.OooO0O0(map2);
                oooO00o2.OooO00o(oooO00o2);
                oooO0o.f80378OooOo0o = c23934OooO0oo2;
                oooO0o.f80377OooOo = interfaceC33899OooO0o;
                oooO0o.f80380OooOoO0 = null;
                oooO0o.f80379OooOoO = null;
                oooO0o.f80382OooOoo = 3;
                HashMap map3 = new HashMap(map2);
                oO00O0oo.OooOo00 oooO0O02 = new OooOo00.OooO0O0(map3);
                oooO0O0.OooO00o(oooO0O0);
                OooOo00.OooO0OO oooO0OO = new OooOo00.OooO0OO(new HashMap(map3));
                oooO0OO.f115682OooO0O0 = true;
                oooO0OO.f115683OooO0OO = -1;
                oooO0OO.f115684OooO0Oo = LocationRequestCompat.PASSIVE_INTERVAL;
                oooO0O02.OooO00o(oooO0O02);
                r13.invoke(oooO0OO);
                objOooO00o = oO00O0oo.OooOO0.OooO00o(c32654OooO0O0, r2, oooO0OO, oooO0o);
                c32222OooOO0o = interfaceC33899OooO0o;
                oooO00o = c23934OooO0oo2;
            }
            InterfaceC33899OooO0o interfaceC33899OooO0o4 = (InterfaceC33899OooO0o) c23934OooO0oo.f80390OooO0OO.f115797OooOo0o.computeIfAbsent((Key) r11, new oO00OOo0.OooO00o(new oO00OOo0.OooO0O0(new C23933OooO0oO(0))));
            oooO0o.f80378OooOo0o = c23934OooO0oo;
            oooO0o.f80377OooOo = r11;
            oooO0o.f80380OooOoO0 = r12;
            oooO0o.f80379OooOoO = interfaceC33899OooO0o4;
            oooO0o.f80382OooOoo = 2;
            if (interfaceC33899OooO0o4.OooO0O0(oooO0o) != enumC32485OooO00o) {
                C23934OooO0oo c23934OooO0oo5 = c23934OooO0oo;
                r2 = r11;
                interfaceC33899OooO0o = interfaceC33899OooO0o4;
                r13 = r12;
                c23934OooO0oo2 = c23934OooO0oo5;
                C32654OooO0O0 c32654OooO0O02 = c23934OooO0oo2.f80388OooO00o;
                HashMap map4 = new HashMap();
                C32218OooO0Oo block2 = C32218OooO0Oo.f115620OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(block2, "block");
                OooOo00.OooO00o oooO00o22 = new OooOo00.OooO00o(new HashMap(map4));
                block2.invoke(oooO00o22);
                HashMap map22 = new HashMap(oooO00o22.f115681OooO00o);
                oO00O0oo.OooOo00 oooO0O03 = new OooOo00.OooO0O0(map22);
                oooO00o22.OooO00o(oooO00o22);
                oooO0o.f80378OooOo0o = c23934OooO0oo2;
                oooO0o.f80377OooOo = interfaceC33899OooO0o;
                oooO0o.f80380OooOoO0 = null;
                oooO0o.f80379OooOoO = null;
                oooO0o.f80382OooOoo = 3;
                HashMap map32 = new HashMap(map22);
                oO00O0oo.OooOo00 oooO0O022 = new OooOo00.OooO0O0(map32);
                oooO0O03.OooO00o(oooO0O03);
                OooOo00.OooO0OO oooO0OO2 = new OooOo00.OooO0OO(new HashMap(map32));
                oooO0OO2.f115682OooO0O0 = true;
                oooO0OO2.f115683OooO0OO = -1;
                oooO0OO2.f115684OooO0Oo = LocationRequestCompat.PASSIVE_INTERVAL;
                oooO0O022.OooO00o(oooO0O022);
                r13.invoke(oooO0OO2);
                objOooO00o = oO00O0oo.OooOO0.OooO00o(c32654OooO0O02, r2, oooO0OO2, oooO0o);
                c32222OooOO0o = interfaceC33899OooO0o;
                oooO00o = c23934OooO0oo2;
            }
            return enumC32485OooO00o;
        } catch (Throwable th) {
            c32222OooOO0o.release();
            oooO00o.f80389OooO0O0.release();
            throw th;
        }
    }
}
