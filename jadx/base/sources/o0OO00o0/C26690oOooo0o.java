package o0OO00o0;

import com.orion.notein.data.p602db.entity.OutlineEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34428OooOOo;
import oo0oO0.InterfaceC34877o00OooOo;

/* JADX INFO: renamed from: o0OO00o0.oOooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.OutlineLocalDataSource$updateOldNoteId$2", m80623f = "OutlineLocalDataSource.kt", m80624l = {91, 94}, m80625m = "invokeSuspend")
public final class C26690oOooo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC34877o00OooOo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f92158OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92159OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f92160OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f92161OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26690oOooo0o(String str, String str2, Continuation<? super C26690oOooo0o> continuation) {
        super(2, continuation);
        this.f92161OooOoO0 = str;
        this.f92160OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26690oOooo0o c26690oOooo0o = new C26690oOooo0o(this.f92161OooOoO0, this.f92160OooOoO, continuation);
        c26690oOooo0o.f92158OooOo = obj;
        return c26690oOooo0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC34877o00OooOo interfaceC34877o00OooOo, Continuation<? super C32460OooOooO> continuation) {
        return ((C26690oOooo0o) create(interfaceC34877o00OooOo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        if (r2.OooO0OO(r4, r21) == r1) goto L19;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC34877o00OooOo interfaceC34877o00OooOo;
        Object objOooO0oO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92159OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC34877o00OooOo = (InterfaceC34877o00OooOo) this.f92158OooOo;
            this.f92158OooOo = interfaceC34877o00OooOo;
            this.f92159OooOo0o = 1;
            objOooO0oO = interfaceC34877o00OooOo.OooO0oO(this.f92161OooOoO0, this);
            if (objOooO0oO != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        interfaceC34877o00OooOo = (InterfaceC34877o00OooOo) this.f92158OooOo;
        C32446OooOOOo.OooO0O0(obj);
        objOooO0oO = obj;
        Iterable iterable = (Iterable) objOooO0oO;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(OutlineEntity.copy$default((OutlineEntity) it.next(), null, null, null, null, this.f92160OooOoO, null, null, 0L, 0L, 495, null));
        }
        OutlineEntity[] outlineEntityArr = (OutlineEntity[]) arrayList.toArray(new OutlineEntity[0]);
        OutlineEntity[] outlineEntityArr2 = (OutlineEntity[]) Arrays.copyOf(outlineEntityArr, outlineEntityArr.length);
        this.f92158OooOo = null;
        this.f92159OooOo0o = 2;
    }
}
