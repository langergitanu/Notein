package o0OO00o0;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.InterfaceC34877o00OooOo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.OutlineLocalDataSource$deleteOutlineByIds$2", m80623f = "OutlineLocalDataSource.kt", m80624l = {56}, m80625m = "invokeSuspend")
public final class o00OOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC34877o00OooOo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f91822OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Iterator f91823OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ List<String> f91824OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f91825OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0(List<String> list, Continuation<? super o00OOO0> continuation) {
        super(2, continuation);
        this.f91824OooOoO = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o00OOO0 o00ooo02 = new o00OOO0(this.f91824OooOoO, continuation);
        o00ooo02.f91825OooOoO0 = obj;
        return o00ooo02;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC34877o00OooOo interfaceC34877o00OooOo, Continuation<? super C32460OooOooO> continuation) {
        return ((o00OOO0) create(interfaceC34877o00OooOo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        InterfaceC34877o00OooOo interfaceC34877o00OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91822OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC34877o00OooOo interfaceC34877o00OooOo2 = (InterfaceC34877o00OooOo) this.f91825OooOoO0;
            it = oOo000Oo.OooOo.Oooo00O(this.f91824OooOoO, 100).iterator();
            interfaceC34877o00OooOo = interfaceC34877o00OooOo2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f91823OooOo0o;
            interfaceC34877o00OooOo = (InterfaceC34877o00OooOo) this.f91825OooOoO0;
            C32446OooOOOo.OooO0O0(obj);
        }
        while (it.hasNext()) {
            String[] strArr = (String[]) ((List) it.next()).toArray(new String[0]);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.f91825OooOoO0 = interfaceC34877o00OooOo;
            this.f91823OooOo0o = it;
            this.f91822OooOo = 1;
            if (interfaceC34877o00OooOo.OooOO0(strArr2, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
