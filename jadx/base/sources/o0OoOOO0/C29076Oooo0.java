package o0OoOOO0;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0oOoOo.C31082Ooooo0o;
import o0oOoOo.C31083OooooO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OoOOO0.Oooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextBoxViewModel$textBoxColorVOList$1", m80623f = "TextBoxViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29076Oooo0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Integer, List<? extends C31082Ooooo0o>, Continuation<? super List<? extends C31083OooooO0>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f103043OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ int f103044OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(Integer num, List<? extends C31082Ooooo0o> list, Continuation<? super List<? extends C31083OooooO0>> continuation) {
        int iIntValue = num.intValue();
        C29076Oooo0 c29076Oooo0 = new C29076Oooo0(3, continuation);
        c29076Oooo0.f103044OooOo0o = iIntValue;
        c29076Oooo0.f103043OooOo = list;
        return c29076Oooo0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        int i = this.f103044OooOo0o;
        List<C31082Ooooo0o> list = this.f103043OooOo;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        for (C31082Ooooo0o c31082Ooooo0o : list) {
            int i2 = c31082Ooooo0o.f110934OooO00o;
            arrayList.add(new C31083OooooO0(i2, c31082Ooooo0o.f110935OooO0O0, i2 == i));
        }
        return arrayList;
    }
}
