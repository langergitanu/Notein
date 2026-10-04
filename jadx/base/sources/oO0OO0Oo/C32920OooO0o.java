package oO0OO0Oo;

import kotlin.jvm.internal.OooOOO0;
import oO0OO00.C32887OooO0oo;
import oO0OO00.C32889OooOOOo;
import oO0OO00.OooOo00;

/* JADX INFO: renamed from: oO0OO0Oo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32920OooO0o {
    public static final C32889OooOOOo OooO00o(C32889OooOOOo c32889OooOOOo, C32922OooO0oO c32922OooO0oO) {
        OooOOO0.OooO0oO(c32889OooOOOo, "<this>");
        int i = c32889OooOOOo.f118367OooOoO0;
        if ((i & 256) == 256) {
            return c32889OooOOOo.f118373Oooo0;
        }
        if ((i & 512) == 512) {
            return c32922OooO0oO.OooO00o(c32889OooOOOo.f118377Oooo0O0);
        }
        return null;
    }

    public static final C32889OooOOOo OooO0O0(C32887OooO0oo c32887OooO0oo, C32922OooO0oO typeTable) {
        OooOOO0.OooO0oO(c32887OooO0oo, "<this>");
        OooOOO0.OooO0oO(typeTable, "typeTable");
        int i = c32887OooO0oo.f118227OooOoO0;
        if ((i & 32) == 32) {
            return c32887OooO0oo.f118235Oooo000;
        }
        if ((i & 64) == 64) {
            return typeTable.OooO00o(c32887OooO0oo.f118236Oooo00O);
        }
        return null;
    }

    public static final C32889OooOOOo OooO0OO(C32887OooO0oo c32887OooO0oo, C32922OooO0oO typeTable) {
        OooOOO0.OooO0oO(c32887OooO0oo, "<this>");
        OooOOO0.OooO0oO(typeTable, "typeTable");
        int i = c32887OooO0oo.f118227OooOoO0;
        if ((i & 8) == 8) {
            C32889OooOOOo returnType = c32887OooO0oo.f118229OooOoo;
            OooOOO0.OooO0o(returnType, "returnType");
            return returnType;
        }
        if ((i & 16) == 16) {
            return typeTable.OooO00o(c32887OooO0oo.f118231OooOooO);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final C32889OooOOOo OooO0Oo(oO0OO00.OooOOO0 oooOOO0, C32922OooO0oO typeTable) {
        OooOOO0.OooO0oO(oooOOO0, "<this>");
        OooOOO0.OooO0oO(typeTable, "typeTable");
        int i = oooOOO0.f118323OooOoO0;
        if ((i & 8) == 8) {
            C32889OooOOOo returnType = oooOOO0.f118325OooOoo;
            OooOOO0.OooO0o(returnType, "returnType");
            return returnType;
        }
        if ((i & 16) == 16) {
            return typeTable.OooO00o(oooOOO0.f118327OooOooO);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static final C32889OooOOOo OooO0o0(OooOo00 oooOo00, C32922OooO0oO typeTable) {
        OooOOO0.OooO0oO(typeTable, "typeTable");
        int i = oooOo00.f118511OooOoO0;
        if ((i & 4) == 4) {
            C32889OooOOOo type = oooOo00.f118514OooOoo0;
            OooOOO0.OooO0o(type, "type");
            return type;
        }
        if ((i & 8) == 8) {
            return typeTable.OooO00o(oooOo00.f118513OooOoo);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }
}
