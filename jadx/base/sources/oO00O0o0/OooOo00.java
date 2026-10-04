package oO00O0o0;

import java.util.List;
import oO00O0o0.C32183OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOo00 {
    public static final C32183OooO0Oo OooO00o(InterfaceC32189OooOOo interfaceC32189OooOOo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC32189OooOOo, "<this>");
        OooOO0O headers = interfaceC32189OooOOo.getHeaders();
        List<String> list = C32190OooOOo0.f115537OooO00o;
        String str = headers.get("Content-Type");
        if (str == null) {
            return null;
        }
        C32183OooO0Oo c32183OooO0Oo = C32183OooO0Oo.f115520OooO0o;
        return C32183OooO0Oo.OooO0O0.OooO00o(str);
    }

    public static final C32183OooO0Oo OooO0O0(InterfaceC32191OooOOoo interfaceC32191OooOOoo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC32191OooOOoo, "<this>");
        C32187OooOO0o headers = interfaceC32191OooOOoo.getHeaders();
        List<String> list = C32190OooOOo0.f115537OooO00o;
        String strOooO0o0 = headers.OooO0o0("Content-Type");
        if (strOooO0o0 == null) {
            return null;
        }
        C32183OooO0Oo c32183OooO0Oo = C32183OooO0Oo.f115520OooO0o;
        return C32183OooO0Oo.OooO0O0.OooO00o(strOooO0o0);
    }
}
