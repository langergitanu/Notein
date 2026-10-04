package o0Oo0oO0;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import o0oOoOo.C31029OooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.feedback.FeedbackViewModel$addPics$1", m80623f = "FeedbackViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ List<Uri> f100392OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooOOO f100393OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooOOO0(OooOOO oooOOO, List<? extends Uri> list, Continuation<? super OooOOO0> continuation) {
        super(2, continuation);
        this.f100393OooOo0o = oooOOO;
        this.f100392OooOo = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOOO0(this.f100393OooOo0o, this.f100392OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        C33781o00o0O c33781o00o0O;
        Object value;
        List listOooooOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        OooOOO oooOOO = this.f100393OooOo0o;
        do {
            c33781o00o0O = oooOOO.f100377OooO0oO;
            value = c33781o00o0O.getValue();
            listOooooOO = (List) value;
            int size = 6 - listOooooOO.size();
            if (size > 0) {
                List listO00Oo0 = OooOo.o00Oo0(this.f100392OooOo, size);
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listO00Oo0, 10));
                Iterator it = listO00Oo0.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C31029OooO((Uri) it.next(), C24761OooO.OooO00o("toString(...)")));
                }
                listOooooOO = OooOo.OooooOO(listOooooOO, arrayList);
            }
        } while (!c33781o00o0O.OooO(value, listOooooOO));
        return C32460OooOooO.f116667OooO00o;
    }
}
