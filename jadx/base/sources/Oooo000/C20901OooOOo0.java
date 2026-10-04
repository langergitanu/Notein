package Oooo000;

import OooOoO.C20504OooO0O0;
import Oooo0oO.InterfaceC21033OooOOOO;
import OooooO0.C21293OooOO0;
import OooooO0.C21294OooOO0O;
import OooooOo.C21392OooOo00;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import androidx.compose.p002ui.platform.C21608OooO0Oo;
import androidx.fragment.app.C21904OooOoo0;
import kotlin.coroutines.Continuation;
import o00000.Oooo0;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.AbstractC33630OooOooO;
import oO0o0OO.AbstractC33647OoooOO0;
import oO0o0OO.AbstractC33655OooooO0;
import oO0o0OO.o0000O;
import oO0o0OO.o0000Ooo;
import oO0o0Ooo.C33824OooO0o;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo000Oo.C34426OooOO0o;
import oo000o.C34659OoooO00;
import oo0o0Oo.C34680OooO0O0;
import oo0o0Oo.C34696OooOOoo;

/* JADX INFO: renamed from: Oooo000.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20901OooOOo0 {
    public static final long OooO00o(float f, float f2) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        int i = C34659OoooO00.f124858OooO0O0;
        return jFloatToIntBits;
    }

    public static final boolean OooO0O0(float[] invertTo, float[] other) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(invertTo, "$this$invertTo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(other, "other");
        float f = invertTo[0];
        float f2 = invertTo[1];
        float f3 = invertTo[2];
        float f4 = invertTo[3];
        float f5 = invertTo[4];
        float f6 = invertTo[5];
        float f7 = invertTo[6];
        float f8 = invertTo[7];
        float f9 = invertTo[8];
        float f10 = invertTo[9];
        float f11 = invertTo[10];
        float f12 = invertTo[11];
        float f13 = invertTo[12];
        float f14 = invertTo[13];
        float f15 = invertTo[14];
        float f16 = invertTo[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 == 0.0f) {
            return false;
        }
        float f30 = 1.0f / f29;
        other[0] = C20504OooO0O0.OooO0O0(f8, f26, (f6 * f28) - (f7 * f27), f30);
        other[1] = C21392OooOo00.OooO00o(f4, f26, (f3 * f27) + ((-f2) * f28), f30);
        other[2] = C20504OooO0O0.OooO0O0(f16, f20, (f14 * f22) - (f15 * f21), f30);
        other[3] = C21392OooOo00.OooO00o(f12, f20, (f11 * f21) + ((-f10) * f22), f30);
        float f31 = -f5;
        other[4] = C21392OooOo00.OooO00o(f8, f24, (f7 * f25) + (f31 * f28), f30);
        other[5] = C20504OooO0O0.OooO0O0(f4, f24, (f28 * f) - (f3 * f25), f30);
        float f32 = -f13;
        other[6] = C21392OooOo00.OooO00o(f16, f18, (f15 * f19) + (f32 * f22), f30);
        other[7] = C20504OooO0O0.OooO0O0(f12, f18, (f9 * f22) - (f11 * f19), f30);
        other[8] = C20504OooO0O0.OooO0O0(f8, f23, (f5 * f27) - (f6 * f25), f30);
        other[9] = C21392OooOo00.OooO00o(f4, f23, (f25 * f2) + ((-f) * f27), f30);
        other[10] = C20504OooO0O0.OooO0O0(f16, f17, (f13 * f21) - (f14 * f19), f30);
        other[11] = C21392OooOo00.OooO00o(f12, f17, (f19 * f10) + ((-f9) * f21), f30);
        other[12] = C21392OooOo00.OooO00o(f7, f23, (f6 * f24) + (f31 * f26), f30);
        other[13] = C20504OooO0O0.OooO0O0(f3, f23, (f * f26) - (f2 * f24), f30);
        other[14] = C21392OooOo00.OooO00o(f15, f17, (f14 * f18) + (f32 * f20), f30);
        other[15] = C20504OooO0O0.OooO0O0(f11, f17, (f9 * f20) - (f10 * f18), f30);
        return true;
    }

    public static final OooO00o OooO0OO(InterfaceC21033OooOOOO interfaceC21033OooOOOO) {
        interfaceC21033OooOOOO.OooOo00(-1031410916);
        View view = (View) interfaceC21033OooOOOO.OooO0o0(C21608OooO0Oo.f63499OooO0o);
        interfaceC21033OooOOOO.OooOo00(1157296644);
        boolean zOooO0oo = interfaceC21033OooOOOO.OooO0oo(view);
        Object objOooOo0 = interfaceC21033OooOOOO.OooOo0();
        if (zOooO0oo || objOooOo0 == InterfaceC21033OooOOOO.OooO00o.f60894OooO00o) {
            objOooOo0 = new OooO00o(view);
            interfaceC21033OooOOOO.OooOOo0(objOooOo0);
        }
        interfaceC21033OooOOOO.OooOoo();
        OooO00o oooO00o = (OooO00o) objOooOo0;
        interfaceC21033OooOOOO.OooOoo();
        return oooO00o;
    }

    public static final long OooO0Oo(long j, long j2) {
        float fOooO0Oo = C21293OooOO0.OooO0Oo(j);
        long j3 = C34659OoooO00.f124857OooO00o;
        if (j2 == j3) {
            throw new IllegalStateException("ScaleFactor is unspecified");
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * fOooO0Oo;
        float fOooO0O0 = C21293OooOO0.OooO0O0(j);
        if (j2 != j3) {
            return C21294OooOO0O.OooO00o(fIntBitsToFloat, Float.intBitsToFloat((int) (j2 & 4294967295L)) * fOooO0O0);
        }
        throw new IllegalStateException("ScaleFactor is unspecified");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object OooO0o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Object obj;
        InterfaceC34415OooO0oo context = abstractC32479OooO0OO.getContext();
        oO00o00.OooO0OO.OooO0OO(context);
        Continuation continuationOooO0o0 = C21904OooOoo0.OooO0o0(abstractC32479OooO0OO);
        C33824OooO0o c33824OooO0o = continuationOooO0o0 instanceof C33824OooO0o ? (C33824OooO0o) continuationOooO0o0 : null;
        if (c33824OooO0o == null) {
            obj = C32460OooOooO.f116667OooO00o;
        } else {
            AbstractC33630OooOooO abstractC33630OooOooO = c33824OooO0o.f121919OooOoO;
            if (abstractC33630OooOooO.o000OOO(context)) {
                c33824OooO0o.f121922OooOoo0 = C32460OooOooO.f116667OooO00o;
                c33824OooO0o.f121326OooOoO0 = 1;
                abstractC33630OooOooO.o000OO0o(context, c33824OooO0o);
            } else {
                o0000O o0000o2 = new o0000O();
                InterfaceC34415OooO0oo interfaceC34415OooO0ooPlus = context.plus(o0000o2);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                c33824OooO0o.f121922OooOoo0 = c32460OooOooO;
                c33824OooO0o.f121326OooOoO0 = 1;
                abstractC33630OooOooO.o000OO0o(interfaceC34415OooO0ooPlus, c33824OooO0o);
                if (o0000o2.f121361OooOo) {
                    AbstractC33655OooooO0 abstractC33655OooooO0OooO00o = o0000Ooo.OooO00o();
                    C34426OooOO0o<AbstractC33647OoooOO0<?>> c34426OooOO0o = abstractC33655OooooO0OooO00o.f121337OooOoOO;
                    if (c34426OooOO0o != null ? c34426OooOO0o.isEmpty() : true) {
                        obj = C32460OooOooO.f116667OooO00o;
                    } else {
                        if (abstractC33655OooooO0OooO00o.f121336OooOoO0 >= 4294967296L) {
                            c33824OooO0o.f121922OooOoo0 = c32460OooOooO;
                            c33824OooO0o.f121326OooOoO0 = 1;
                            abstractC33655OooooO0OooO00o.o000Oo00(c33824OooO0o);
                            obj = EnumC32485OooO00o.f116726OooOo0o;
                        } else {
                            abstractC33655OooooO0OooO00o.o000Oo0O(true);
                            try {
                                c33824OooO0o.run();
                                do {
                                } while (abstractC33655OooooO0OooO00o.o000Oo());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                            obj = C32460OooOooO.f116667OooO00o;
                        }
                    }
                }
            }
            obj = EnumC32485OooO00o.f116726OooOo0o;
        }
        return obj == EnumC32485OooO00o.f116726OooOo0o ? obj : C32460OooOooO.f116667OooO00o;
    }

    public static final ExtractedText OooO0o0(Oooo0 oooo0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooo0, "<this>");
        ExtractedText extractedText = new ExtractedText();
        C34680OooO0O0 c34680OooO0O0 = oooo0.f81083OooO00o;
        String str = c34680OooO0O0.f124887OooOo0o;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = oooo0.f81084OooO0O0;
        extractedText.selectionStart = C34696OooOOoo.OooO0Oo(j);
        extractedText.selectionEnd = C34696OooOOoo.OooO0OO(j);
        extractedText.flags = !C33599OooOo0O.OooOoo0(c34680OooO0O0.f124887OooOo0o, '\n') ? 1 : 0;
        return extractedText;
    }
}
