package Ooooo00;

import OoooOoO.InterfaceC21233OooO0o;
import OooooOO.InterfaceC21361o00oO0O;
import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.C24035Oooo00o;
import oO0O0O0.C32567Oooo;
import oO0oO000.InterfaceC34004OooO0Oo;
import oOo00O0O.InterfaceC34466OooOOoo;
import oOoo0.C34614OooOo0o;
import oOoo0.InterfaceC34595OooO0Oo;
import oOoo0.InterfaceC34597OooO0o0;
import oOoo0.InterfaceC34606OooOOOo;

/* JADX INFO: renamed from: Ooooo00.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21246OooO0OO {
    public static final void OooO00o(InterfaceC34004OooO0Oo interfaceC34004OooO0Oo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC34004OooO0Oo, "<this>");
        if ((interfaceC34004OooO0Oo instanceof InterfaceC34466OooOOoo ? (InterfaceC34466OooOOoo) interfaceC34004OooO0Oo : null) != null) {
            return;
        }
        throw new IllegalStateException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, interfaceC34004OooO0Oo.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ")));
    }

    public static final oOOoOoOO.OooO00o OooO0O0(oOOoOoOO.OooO00o oooO00o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooO00o, "<this>");
        InterfaceC34606OooOOOo interfaceC34606OooOOOo = oooO00o.f123415OooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC34606OooOOOo);
        C32567Oooo c32567Oooo = interfaceC34606OooOOOo.getArguments().get(0).f123976OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c32567Oooo);
        InterfaceC34597OooO0o0 interfaceC34597OooO0o0OooO0O0 = c32567Oooo.OooO0O0();
        kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC34597OooO0o0OooO0O0, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        return new oOOoOoOO.OooO00o(C34614OooOo0o.OooO0Oo(c32567Oooo), (InterfaceC34595OooO0Oo) interfaceC34597OooO0o0OooO0O0, c32567Oooo);
    }

    public static final oOo00O0O.OooOO0 OooO0OO(oO0oO000.OooO0OO oooO0OO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooO0OO, "<this>");
        oOo00O0O.OooOO0 oooOO02 = oooO0OO instanceof oOo00O0O.OooOO0 ? (oOo00O0O.OooOO0) oooO0OO : null;
        if (oooOO02 != null) {
            return oooOO02;
        }
        throw new IllegalStateException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, oooO0OO.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
    }

    public static final InterfaceC21233OooO0o OooO0Oo(InterfaceC21233OooO0o interfaceC21233OooO0o, InterfaceC21361o00oO0O shape) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC21233OooO0o, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(shape, "shape");
        return androidx.compose.p002ui.graphics.OooO00o.OooO0O0(interfaceC21233OooO0o, 0.0f, shape, 124927);
    }

    public static final File OooO0o0(Context context, String fileName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(fileName));
    }
}
