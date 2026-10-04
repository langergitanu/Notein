package io.ktor.utils.p616io;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C24034Oooo00O;
import kotlin.jvm.internal.OooOOO0;
import o0000o0O.C24253OooO0oo;
import o0000o0O.InterfaceC24284OoooOO0;
import o0000o0O.OooO;
import o000OOO.C24498OooO0o0;
import o000OOO.OooO0OO;
import o0o00oo.C30128Oooo0O0;
import o0o00oo.C30130Oooo0o;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: io.ktor.utils.io.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23968Oooo00o {
    public static final OooO00o OooO00o(byte[] content) {
        OooOOO0.OooO0oO(content, "content");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(content, 0, content.length);
        OooOOO0.OooO0o(byteBufferWrap, "wrap(content, offset, length)");
        return new OooO00o(byteBufferWrap);
    }

    public static final boolean OooO0O0(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (OooOOO0.OooO(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0084 -> B:25:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0087 -> B:25:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0OO(List list, InterfaceC24284OoooOO0 interfaceC24284OoooOO0, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C24253OooO0oo c24253OooO0oo;
        List list2;
        C24034Oooo00O c24034Oooo00O;
        Iterator it;
        Throwable th;
        if (abstractC32479OooO0OO instanceof C24253OooO0oo) {
            c24253OooO0oo = (C24253OooO0oo) abstractC32479OooO0OO;
            int i = c24253OooO0oo.f81536OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24253OooO0oo.f81536OooOoO = i - Integer.MIN_VALUE;
            } else {
                c24253OooO0oo = new C24253OooO0oo(abstractC32479OooO0OO);
            }
        }
        Object obj = c24253OooO0oo.f81537OooOoO0;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c24253OooO0oo.f81536OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ArrayList arrayList = new ArrayList();
            OooO oooO = new OooO(list, arrayList, null);
            c24253OooO0oo.f81535OooOo0o = arrayList;
            c24253OooO0oo.f81536OooOoO = 1;
            if (interfaceC24284OoooOO0.OooO00o(oooO, c24253OooO0oo) == obj2) {
                return obj2;
            }
            list2 = arrayList;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = c24253OooO0oo.f81534OooOo;
                c24034Oooo00O = (C24034Oooo00O) c24253OooO0oo.f81535OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                } catch (Throwable th2) {
                    T t = c24034Oooo00O.f80942OooOo0o;
                    if (t == 0) {
                        c24034Oooo00O.f80942OooOo0o = th2;
                    } else {
                        C32435OooO0Oo.OooO00o((Throwable) t, th2);
                    }
                }
                while (it.hasNext()) {
                    InterfaceC32507OooOO0o interfaceC32507OooOO0o = (InterfaceC32507OooOO0o) it.next();
                    c24253OooO0oo.f81535OooOo0o = c24034Oooo00O;
                    c24253OooO0oo.f81534OooOo = it;
                    c24253OooO0oo.f81536OooOoO = 2;
                    if (interfaceC32507OooOO0o.invoke(c24253OooO0oo) == obj2) {
                        return obj2;
                    }
                }
                th = (Throwable) c24034Oooo00O.f80942OooOo0o;
                if (th != null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                throw th;
            }
            list2 = (List) c24253OooO0oo.f81535OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        c24034Oooo00O = new C24034Oooo00O();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) c24034Oooo00O.f80942OooOo0o;
        if (th != null) {
        }
    }

    public static C30128Oooo0O0 OooO0Oo() {
        return new C30128Oooo0O0(0);
    }

    public static final int OooO0o(OooO0OO oooO0OO) {
        OooOOO0.OooO0oO(oooO0OO, "<this>");
        float[] fArr = C24498OooO0o0.f82829OooO00o;
        if (oooO0OO.equals(C24498OooO0o0.f82834OooO0o0)) {
            return 0;
        }
        if (oooO0OO.equals(C24498OooO0o0.f82835OooO0oO)) {
            return 1;
        }
        throw new IllegalArgumentException("Unsupported Compose color space");
    }

    public static C30130Oooo0o OooO0o0(int i, String noteId, String str, String str2) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        OooOOO0.OooO0oO(noteId, "noteId");
        return new C30130Oooo0o(noteId, str, str2);
    }
}
