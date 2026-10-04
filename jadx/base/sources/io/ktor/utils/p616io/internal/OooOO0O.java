package io.ktor.utils.p616io.internal;

import android.util.Log;
import io.ktor.utils.p616io.AbstractC23985Ooooo00;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.OooOOO0;
import o00Ooo0O.OooOO0;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.EnumC25114OooO0OO;
import o00Ooo0o.InterfaceC25122OooOO0o;
import o00OooO.InterfaceC25145OooOo0o;
import o00OooO0.C25150OooO00o;
import o00o0O0.C25308OooO00o;
import oO00Oo0.C32266OooO0Oo;
import oO00Oo0O.C32271OooO00o;
import oO00Oo0O.C32273OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0O implements InterfaceC25122OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f80833OooO00o = 0;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r7 == 0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Long OooO0OO(AbstractC23985Ooooo00 abstractC23985Ooooo00, AbstractC23985Ooooo00 abstractC23985Ooooo002, long j, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOO0 oooOO02;
        long j2;
        long j3;
        long j4;
        AbstractC23985Ooooo00 abstractC23985Ooooo003;
        AbstractC23985Ooooo00 abstractC23985Ooooo004;
        long jLongValue;
        if (abstractC32479OooO0OO instanceof OooOO0) {
            oooOO02 = (OooOO0) abstractC32479OooO0OO;
            int i = oooOO02.f80832OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO02.f80832OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                oooOO02 = new OooOO0(abstractC32479OooO0OO);
            }
        }
        Object obj = oooOO02.f80831OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOO02.f80832OooOoo0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    j4 = oooOO02.f80829OooOoO;
                    j3 = oooOO02.f80830OooOoO0;
                    abstractC23985Ooooo003 = oooOO02.f80827OooOo;
                    abstractC23985Ooooo004 = oooOO02.f80828OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    jLongValue = ((Number) obj).longValue();
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j4 = oooOO02.f80829OooOoO;
                    j3 = oooOO02.f80830OooOoO0;
                    abstractC23985Ooooo003 = oooOO02.f80827OooOo;
                    abstractC23985Ooooo004 = oooOO02.f80828OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    jLongValue = 0;
                }
                long j5 = j4 - jLongValue;
                if (jLongValue > 0) {
                    abstractC23985Ooooo003.getClass();
                    throw null;
                }
                abstractC23985Ooooo00 = abstractC23985Ooooo004;
                j2 = j3;
                j = j5;
                abstractC23985Ooooo002 = abstractC23985Ooooo003;
            } else {
                j4 = oooOO02.f80829OooOoO;
                j3 = oooOO02.f80830OooOoO0;
                AbstractC23985Ooooo00 dst = oooOO02.f80827OooOo;
                AbstractC23985Ooooo00 abstractC23985Ooooo005 = oooOO02.f80828OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                if (((Boolean) obj).booleanValue()) {
                    abstractC23985Ooooo005.getClass();
                    OooOOO0.OooO0oO(dst, "dst");
                    throw null;
                }
            }
            return new Long(j3 - j4);
        }
        C32446OooOOOo.OooO0O0(obj);
        if (abstractC23985Ooooo00 == abstractC23985Ooooo002) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (abstractC23985Ooooo00.OooO0O0() != null) {
            abstractC23985Ooooo002.OooO0Oo(abstractC23985Ooooo00.OooO0O0());
            return new Long(0L);
        }
        j2 = j;
        if (j <= 0) {
            j4 = j;
            j3 = j2;
            return new Long(j3 - j4);
        }
        oooOO02.f80828OooOo0o = abstractC23985Ooooo00;
        oooOO02.f80827OooOo = abstractC23985Ooooo002;
        oooOO02.f80830OooOoO0 = j2;
        oooOO02.f80829OooOoO = j;
        oooOO02.f80832OooOoo0 = 1;
        abstractC23985Ooooo00.getClass();
        throw null;
    }

    public static final short OooO0Oo(C32266OooO0Oo c32266OooO0Oo) throws EOFException {
        OooOOO0.OooO0oO(c32266OooO0Oo, "<this>");
        int i = c32266OooO0Oo.f115968OooOoOO;
        int i2 = c32266OooO0Oo.f115966OooOoO;
        if (i - i2 > 2) {
            c32266OooO0Oo.f115966OooOoO = i2 + 2;
            return c32266OooO0Oo.f115967OooOoO0.getShort(i2);
        }
        C32271OooO00o c32271OooO00oOoOO = c32266OooO0Oo.ooOO(2);
        if (c32271OooO00oOoOO == null) {
            C25150OooO00o.OooO0o0(2);
            throw null;
        }
        int i3 = c32271OooO00oOoOO.f115945OooO0O0;
        if (c32271OooO00oOoOO.f115946OooO0OO - i3 < 2) {
            throw new EOFException("Not enough bytes to read a short integer of size 2.");
        }
        short s = c32271OooO00oOoOO.f115944OooO00o.getShort(i3);
        c32271OooO00oOoOO.OooO0OO(2);
        C32273OooO0Oo.OooO00o(c32266OooO0Oo, c32271OooO00oOoOO);
        return s;
    }

    @Override // o00Ooo0o.InterfaceC25115OooO0Oo
    public boolean OooO00o(Object obj, File file, C25111OooO c25111OooO) throws Throwable {
        try {
            C25308OooO00o.OooO0Oo(((OooOO0) ((InterfaceC25145OooOo0o) obj).get()).f85327OooOo0o.f85336OooO00o.f85346OooO00o.f85313OooO00o.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("WebpEncoder", 5)) {
                return false;
            }
            Log.w("WebpEncoder", "Failed to encode WebP drawable data", e);
            return false;
        }
    }

    @Override // o00Ooo0o.InterfaceC25122OooOO0o
    public EnumC25114OooO0OO OooO0O0(C25111OooO c25111OooO) {
        return EnumC25114OooO0OO.f85380OooOo0o;
    }
}
