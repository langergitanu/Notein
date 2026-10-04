package oO00O0oo;

import OoooOOo.C21199OooOOO;
import io.ktor.utils.p616io.InterfaceC23967Oooo00O;
import java.nio.channels.ReadableByteChannel;
import kotlin.jvm.internal.C24033OooOooo;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oO00O0oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32220OooO0oO {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(InterfaceC23967Oooo00O interfaceC23967Oooo00O, ReadableByteChannel readableByteChannel, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO0o oooO0o;
        C24033OooOooo c24033OooOooo;
        if (abstractC32479OooO0OO instanceof OooO0o) {
            oooO0o = (OooO0o) abstractC32479OooO0OO;
            int i = oooO0o.f115623OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f115623OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(abstractC32479OooO0OO);
            }
        }
        Object obj = oooO0o.f115621OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0o.f115623OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C24033OooOooo c24033OooOooo2 = new C24033OooOooo();
            InterfaceC32507OooOO0o c21199OooOOO = new C21199OooOOO(1, c24033OooOooo2, readableByteChannel);
            oooO0o.f115622OooOo0o = c24033OooOooo2;
            oooO0o.f115623OooOoO0 = 1;
            if (interfaceC23967Oooo00O.OooOo(c21199OooOOO, oooO0o) == obj2) {
                return obj2;
            }
            c24033OooOooo = c24033OooOooo2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c24033OooOooo = oooO0o.f115622OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        return new Integer(c24033OooOooo.f80940OooOo0o);
    }
}
