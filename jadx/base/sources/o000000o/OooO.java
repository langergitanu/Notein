package o000000o;

import android.graphics.Typeface;
import o000000o.InterfaceC24103OooOooO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<InterfaceC32507OooOO0o<? super InterfaceC24103OooOooO, ? extends C32460OooOooO>, InterfaceC24103OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24100OooOoOO f81168OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f81169OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(OooOO0 oooOO02, C24100OooOoOO c24100OooOoOO) {
        super(1);
        this.f81169OooOo0o = oooOO02;
        this.f81168OooOo = c24100OooOoOO;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC24103OooOooO invoke(InterfaceC32507OooOO0o<? super InterfaceC24103OooOooO, ? extends C32460OooOooO> interfaceC32507OooOO0o) {
        Typeface typefaceOooO0OO;
        InterfaceC32507OooOO0o<? super InterfaceC24103OooOooO, ? extends C32460OooOooO> onAsyncCompletion = interfaceC32507OooOO0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(onAsyncCompletion, "onAsyncCompletion");
        OooOO0 oooOO02 = this.f81169OooOo0o;
        oooOO02.f81179OooO0Oo.getClass();
        C24100OooOoOO c24100OooOoOO = this.f81168OooOo;
        C24083OooO00o platformFontLoader = oooOO02.f81176OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(platformFontLoader, "platformFontLoader");
        C24089OooO0oo createDefaultTypeface = oooOO02.f81180OooO0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(createDefaultTypeface, "createDefaultTypeface");
        AbstractC24088OooO0oO abstractC24088OooO0oO = c24100OooOoOO.f81197OooO00o;
        boolean z = abstractC24088OooO0oO instanceof OooOOO0;
        C24093OooOOo0 fontWeight = c24100OooOoOO.f81198OooO0O0;
        InterfaceC24103OooOooO.OooO00o oooO00o = null;
        if (z) {
            ((OooOOO0) abstractC24088OooO0oO).getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(null, "fontList");
            kotlin.jvm.internal.OooOOO0.OooO0oO(fontWeight, "fontWeight");
            throw null;
        }
        OooOo00 oooOo00 = oooOO02.f81181OooO0o0;
        oooOo00.getClass();
        boolean z2 = abstractC24088OooO0oO == null ? true : abstractC24088OooO0oO instanceof C24087OooO0o0;
        InterfaceC24096OooOo0O interfaceC24096OooOo0O = oooOo00.f81196OooO00o;
        int i = c24100OooOoOO.f81199OooO0OO;
        if (z2) {
            typefaceOooO0OO = interfaceC24096OooOo0O.OooO00o(fontWeight, i);
        } else {
            if (!(abstractC24088OooO0oO instanceof C24092OooOOo)) {
                if (abstractC24088OooO0oO instanceof C24094OooOOoo) {
                    ((C24094OooOOoo) abstractC24088OooO0oO).getClass();
                    kotlin.jvm.internal.OooOOO0.OooO0o0(null, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
                    throw null;
                }
                if (oooO00o == null) {
                    return oooO00o;
                }
                throw new IllegalStateException("Could not load font");
            }
            typefaceOooO0OO = interfaceC24096OooOo0O.OooO0OO((C24092OooOOo) abstractC24088OooO0oO, fontWeight, i);
        }
        oooO00o = new InterfaceC24103OooOooO.OooO00o(typefaceOooO0OO, true);
        if (oooO00o == null) {
        }
    }
}
