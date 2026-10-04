package o0o00oO;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0o00oO.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.translate.TranslateViewModel$switchable$1", m80623f = "TranslateViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29982OooOooO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Integer, Integer, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ int f106507OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ int f106508OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(Integer num, Integer num2, Continuation<? super Boolean> continuation) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        C29982OooOooO c29982OooOooO = new C29982OooOooO(3, continuation);
        c29982OooOooO.f106508OooOo0o = iIntValue;
        c29982OooOooO.f106507OooOo = iIntValue2;
        return c29982OooOooO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        int i = this.f106508OooOo0o;
        int i2 = this.f106507OooOo;
        if (i != 0) {
            z = i != i2 + 1;
        }
        return Boolean.valueOf(z);
    }
}
