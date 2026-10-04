package oO0Oo0Oo;

import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import kotlin.jvm.internal.C24035Oooo00o;
import o000ooo.C24746OooO00o;
import o00oo0O0.C25679OooOo0o;
import oO00O0o0.C32183OooO0Oo;
import oO00O0o0.OooOo00;
import oO00Oo0.AbstractC32268OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.InterfaceC33623OooOo0O;
import oO0o0OO.InterfaceC33672o00ooo;
import oOo0000O.InterfaceC34415OooO0oo;
import oOoo0.C34614OooOo0o;
import oOoo0.InterfaceC34606OooOOOo;

/* JADX INFO: renamed from: oO0Oo0Oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33204OooO0oO {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(AbstractC33200OooO0OO abstractC33200OooO0OO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33203OooO0o0 c33203OooO0o0;
        if (abstractC32479OooO0OO instanceof C33203OooO0o0) {
            c33203OooO0o0 = (C33203OooO0o0) abstractC32479OooO0OO;
            int i = c33203OooO0o0.f120156OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33203OooO0o0.f120156OooOo = i - Integer.MIN_VALUE;
            } else {
                c33203OooO0o0 = new C33203OooO0o0(abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c33203OooO0o0.f120157OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33203OooO0o0.f120156OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            ooOOOOOo.OooO0OO oooO0OOOooO00o = abstractC33200OooO0OO.OooO00o();
            InterfaceC34606OooOOOo interfaceC34606OooOOOoOooO00o = C24035Oooo00o.OooO00o(InterfaceC23986Ooooo0o.class);
            oOOoOoOO.OooO00o oooO00oOooO = o000ooOO.OooOOO0.OooO(C34614OooOo0o.OooO0Oo(interfaceC34606OooOOOoOooO00o), C24035Oooo00o.f80943OooO00o.OooO0O0(InterfaceC23986Ooooo0o.class), interfaceC34606OooOOOoOooO00o);
            c33203OooO0o0.f120156OooOo = 1;
            objOooO00o = oooO0OOOooO00o.OooO00o(oooO00oOooO, c33203OooO0o0);
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        if (objOooO00o != null) {
            return (InterfaceC23986Ooooo0o) objOooO00o;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0O0(AbstractC33200OooO0OO abstractC33200OooO0OO, Charset charset, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33202OooO0o c33202OooO0o;
        CharsetDecoder decoder;
        if (abstractC32479OooO0OO instanceof C33202OooO0o) {
            c33202OooO0o = (C33202OooO0o) abstractC32479OooO0OO;
            int i = c33202OooO0o.f120155OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33202OooO0o.f120155OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c33202OooO0o = new C33202OooO0o(abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c33202OooO0o.f120153OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33202OooO0o.f120155OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC33200OooO0OO, "<this>");
            C32183OooO0Oo c32183OooO0OoOooO00o = OooOo00.OooO00o(abstractC33200OooO0OO);
            Charset charsetOooO0Oo = c32183OooO0OoOooO00o != null ? C24746OooO00o.OooO0Oo(c32183OooO0OoOooO00o) : null;
            if (charsetOooO0Oo != null) {
                charset = charsetOooO0Oo;
            }
            CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
            ooOOOOOo.OooO0OO oooO0OOOooO00o = abstractC33200OooO0OO.OooO00o();
            InterfaceC34606OooOOOo interfaceC34606OooOOOoOooO00o = C24035Oooo00o.OooO00o(AbstractC32268OooO0oO.class);
            oOOoOoOO.OooO00o oooO00oOooO = o000ooOO.OooOOO0.OooO(C34614OooOo0o.OooO0Oo(interfaceC34606OooOOOoOooO00o), C24035Oooo00o.f80943OooO00o.OooO0O0(AbstractC32268OooO0oO.class), interfaceC34606OooOOOoOooO00o);
            c33202OooO0o.f120154OooOo0o = charsetDecoderNewDecoder;
            c33202OooO0o.f120155OooOoO0 = 1;
            objOooO00o = oooO0OOOooO00o.OooO00o(oooO00oOooO, c33202OooO0o);
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            decoder = charsetDecoderNewDecoder;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            decoder = c33202OooO0o.f120154OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        if (objOooO00o == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.ktor.utils.io.core.Input");
        }
        kotlin.jvm.internal.OooOOO0.OooO0o(decoder, "decoder");
        return C25679OooOo0o.OooO00o(decoder, (AbstractC32268OooO0oO) objOooO00o);
    }

    public static final void OooO0OO(AbstractC33200OooO0OO abstractC33200OooO0OO) {
        InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = abstractC33200OooO0OO.OooOOO0().get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O0);
        ((InterfaceC33623OooOo0O) oooO0O0).complete();
    }
}
