package o0OO00o0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34993o0ooOoOO;

/* JADX INFO: renamed from: o0OO00o0.o00o000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.StrokeLocalDataSource$deleteStrokesByIds$2", m80623f = "StrokeLocalDataSource.kt", m80624l = {65}, m80625m = "invokeSuspend")
public final class C26653o00o000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34993o0ooOoOO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f91984OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Iterator f91985OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ ArrayList f91986OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f91987OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26653o00o000(ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f91986OooOoO = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26653o00o000 c26653o00o000 = new C26653o00o000(this.f91986OooOoO, continuation);
        c26653o00o000.f91987OooOoO0 = obj;
        return c26653o00o000;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34993o0ooOoOO abstractC34993o0ooOoOO, Continuation<? super C32460OooOooO> continuation) {
        return ((C26653o00o000) create(abstractC34993o0ooOoOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        AbstractC34993o0ooOoOO abstractC34993o0ooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91984OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC34993o0ooOoOO abstractC34993o0ooOoOO2 = (AbstractC34993o0ooOoOO) this.f91987OooOoO0;
            it = oOo000Oo.OooOo.oo0o0Oo(100, 100, this.f91986OooOoO).iterator();
            abstractC34993o0ooOoOO = abstractC34993o0ooOoOO2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f91985OooOo0o;
            abstractC34993o0ooOoOO = (AbstractC34993o0ooOoOO) this.f91987OooOoO0;
            C32446OooOOOo.OooO0O0(obj);
        }
        while (it.hasNext()) {
            List list = (List) it.next();
            this.f91987OooOoO0 = abstractC34993o0ooOoOO;
            this.f91985OooOo0o = it;
            this.f91984OooOo = 1;
            if (abstractC34993o0ooOoOO.OooO0O0(list, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
