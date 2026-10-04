package o0Oo0oO0;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0oOoOo.C31029OooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.feedback.FeedbackViewModel$removePic$1", m80623f = "FeedbackViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f100394OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooOOO f100395OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(OooOOO oooOOO, String str, Continuation<? super OooOOOO> continuation) {
        super(2, continuation);
        this.f100395OooOo0o = oooOOO;
        this.f100394OooOo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOOOO(this.f100395OooOo0o, this.f100394OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        C33781o00o0O c33781o00o0O;
        Object value;
        ArrayList arrayList;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        OooOOO oooOOO = this.f100395OooOo0o;
        do {
            c33781o00o0O = oooOOO.f100377OooO0oO;
            value = c33781o00o0O.getValue();
            arrayList = new ArrayList();
            for (Object obj2 : (List) value) {
                if (!((C31029OooO) obj2).f110771OooO00o.equals(this.f100394OooOo)) {
                    arrayList.add(obj2);
                }
            }
        } while (!c33781o00o0O.OooO(value, arrayList));
        return C32460OooOooO.f116667OooO00o;
    }
}
