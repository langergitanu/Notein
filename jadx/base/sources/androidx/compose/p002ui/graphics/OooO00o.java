package androidx.compose.p002ui.graphics;

import OoooOoO.InterfaceC21233OooO0o;
import OooooOO.C21353Oooooo0;
import OooooOO.C21359o00Ooo;
import OooooOO.InterfaceC21361o00oO0O;
import OooooOO.o0OO00O;
import kotlin.jvm.internal.OooOOO0;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {
    public static final InterfaceC21233OooO0o OooO00o(InterfaceC32507OooOO0o block) {
        OooOOO0.OooO0oO(block, "block");
        return new BlockGraphicsLayerElement(block);
    }

    public static InterfaceC21233OooO0o OooO0O0(InterfaceC21233OooO0o graphicsLayer, float f, InterfaceC21361o00oO0O interfaceC21361o00oO0O, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        long j = o0OO00O.f61796OooO0O0;
        if ((i & 2048) != 0) {
            interfaceC21361o00oO0O = C21359o00Ooo.f61779OooO00o;
        }
        InterfaceC21361o00oO0O shape = interfaceC21361o00oO0O;
        boolean z = (i & 4096) == 0;
        long j2 = C21353Oooooo0.f61772OooO00o;
        OooOOO0.OooO0oO(graphicsLayer, "$this$graphicsLayer");
        OooOOO0.OooO0oO(shape, "shape");
        return graphicsLayer.o00ooo(new GraphicsLayerModifierNodeElement(f2, j, shape, z, j2, j2));
    }
}
