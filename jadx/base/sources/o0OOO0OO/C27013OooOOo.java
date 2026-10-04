package o0OOO0OO;

import com.orion.notein.data.p602db.entity.PageEntity;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.InterfaceC34887o00o00O0;

/* JADX INFO: renamed from: o0OOO0OO.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.page.PageLocalDataSource$updatePages$2", m80623f = "PageLocalDataSource.kt", m80624l = {69}, m80625m = "invokeSuspend")
public final class C27013OooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC34887o00o00O0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f94027OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94028OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f94029OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27013OooOOo(ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f94029OooOoO0 = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27013OooOOo c27013OooOOo = new C27013OooOOo(this.f94029OooOoO0, continuation);
        c27013OooOOo.f94027OooOo = obj;
        return c27013OooOOo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC34887o00o00O0 interfaceC34887o00o00O0, Continuation<? super C32460OooOooO> continuation) {
        return ((C27013OooOOo) create(interfaceC34887o00o00O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94028OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC34887o00o00O0 interfaceC34887o00o00O0 = (InterfaceC34887o00o00O0) this.f94027OooOo;
            PageEntity[] pageEntityArr = (PageEntity[]) this.f94029OooOoO0.toArray(new PageEntity[0]);
            PageEntity[] pageEntityArr2 = (PageEntity[]) Arrays.copyOf(pageEntityArr, pageEntityArr.length);
            this.f94028OooOo0o = 1;
            if (interfaceC34887o00o00O0.OooO0oo(pageEntityArr2, this) == enumC32485OooO00o) {
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
