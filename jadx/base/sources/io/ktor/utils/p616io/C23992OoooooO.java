package io.ktor.utils.p616io;

import com.microsoft.identity.common.java.AuthenticationConstants;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O00oo.C32520OooO0oo;
import oO0O00oo.OooO;
import oO0O0ooO.InterfaceC32818OooO0Oo;
import oOo000Oo.Oooo000;
import oOo00OOo.C34498OooO0o0;
import oOo00OOo.C34499OooO0oO;

/* JADX INFO: renamed from: io.ktor.utils.io.OoooooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23992OoooooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f80788OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f80789OooO0O0 = 0;

    public static final byte[] OooO00o(String str) {
        try {
            Charset charsetForName = Charset.forName(AuthenticationConstants.ENCODING_ASCII_STRING);
            OooOOO0.OooO0o(charsetForName, "forName(...)");
            byte[] bytes = str.getBytes(charsetForName);
            OooOOO0.OooO0o(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    public static final void OooO0O0(InterfaceC23990Oooooo interfaceC23990Oooooo) {
        OooOOO0.OooO0oO(interfaceC23990Oooooo, "<this>");
        interfaceC23990Oooooo.OooO0Oo(null);
    }

    public static final boolean OooO0OO(int i, byte[] byteArray, byte[] pattern) {
        OooOOO0.OooO0oO(byteArray, "byteArray");
        OooOOO0.OooO0oO(pattern, "pattern");
        if (pattern.length + i <= byteArray.length) {
            Iterable oooO = new OooO(0, pattern.length - 1, 1);
            if (!(oooO instanceof Collection) || !((Collection) oooO).isEmpty()) {
                Iterator<Integer> it = oooO.iterator();
                while (((C32520OooO0oo) it).f116817OooOoO0) {
                    int iNextInt = ((Oooo000) it).nextInt();
                    if (byteArray[i + iNextInt] != pattern[iNextInt]) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final C34498OooO0o0 OooO0Oo(C34499OooO0oO c34499OooO0oO, InterfaceC32818OooO0Oo annotationsOwner) {
        OooOOO0.OooO0oO(c34499OooO0oO, "<this>");
        OooOOO0.OooO0oO(annotationsOwner, "annotationsOwner");
        return new C34498OooO0o0(c34499OooO0oO, annotationsOwner, false);
    }

    public static final Object OooO0o(InterfaceC23990Oooooo interfaceC23990Oooooo, byte[] bArr, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Object objOooOOO0 = interfaceC23990Oooooo.OooOOO0(bArr, bArr.length, abstractC32479OooO0OO);
        return objOooOOO0 == EnumC32485OooO00o.f116726OooOo0o ? objOooOOO0 : C32460OooOooO.f116667OooO00o;
    }

    public static final boolean OooO0o0(byte[] byteArray, byte[] pattern) {
        OooOOO0.OooO0oO(byteArray, "byteArray");
        OooOOO0.OooO0oO(pattern, "pattern");
        return OooO0OO(0, byteArray, pattern);
    }
}
