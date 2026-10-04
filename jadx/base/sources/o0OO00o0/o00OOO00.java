package o0OO00o0;

import com.orion.notein.data.p602db.entity.OutlineEntity;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.InterfaceC34877o00OooOo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.OutlineLocalDataSource$createOutlines$2", m80623f = "OutlineLocalDataSource.kt", m80624l = {49}, m80625m = "invokeSuspend")
public final class o00OOO00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC34877o00OooOo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91826OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91827OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f91828OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO00(ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f91828OooOoO0 = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o00OOO00 o00ooo002 = new o00OOO00(this.f91828OooOoO0, continuation);
        o00ooo002.f91826OooOo = obj;
        return o00ooo002;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC34877o00OooOo interfaceC34877o00OooOo, Continuation<? super C32460OooOooO> continuation) {
        return ((o00OOO00) create(interfaceC34877o00OooOo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91827OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC34877o00OooOo interfaceC34877o00OooOo = (InterfaceC34877o00OooOo) this.f91826OooOo;
            OutlineEntity[] outlineEntityArr = (OutlineEntity[]) this.f91828OooOoO0.toArray(new OutlineEntity[0]);
            OutlineEntity[] outlineEntityArr2 = (OutlineEntity[]) Arrays.copyOf(outlineEntityArr, outlineEntityArr.length);
            this.f91827OooOo0o = 1;
            if (interfaceC34877o00OooOo.OooO0OO(outlineEntityArr2, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
