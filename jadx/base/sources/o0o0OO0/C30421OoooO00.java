package o0o0OO0;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0o0OO0.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.ScannedPageSelectorViewModel$sourcePageNumString$1", m80623f = "PdfPageSelectorViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30421OoooO00 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Integer, Integer, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ int f108676OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ int f108677OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(Integer num, Integer num2, Continuation<? super String> continuation) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        C30421OoooO00 c30421OoooO00 = new C30421OoooO00(3, continuation);
        c30421OoooO00.f108677OooOo0o = iIntValue;
        c30421OoooO00.f108676OooOo = iIntValue2;
        return c30421OoooO00.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return this.f108677OooOo0o + "/" + this.f108676OooOo;
    }
}
