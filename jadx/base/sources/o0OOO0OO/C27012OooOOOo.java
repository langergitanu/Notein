package o0OOO0OO;

import com.orion.notein.data.p602db.entity.PageConverter;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.InterfaceC34887o00o00O0;

/* JADX INFO: renamed from: o0OOO0OO.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.page.PageLocalDataSource$updatePageLastModificationTime$2", m80623f = "PageLocalDataSource.kt", m80624l = {152}, m80625m = "invokeSuspend")
public final class C27012OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC34887o00o00O0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f94023OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94024OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ long f94025OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f94026OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27012OooOOOo(String str, long j, Continuation<? super C27012OooOOOo> continuation) {
        super(2, continuation);
        this.f94026OooOoO0 = str;
        this.f94025OooOoO = j;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27012OooOOOo c27012OooOOOo = new C27012OooOOOo(this.f94026OooOoO0, this.f94025OooOoO, continuation);
        c27012OooOOOo.f94023OooOo = obj;
        return c27012OooOOOo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC34887o00o00O0 interfaceC34887o00o00O0, Continuation<? super C32460OooOooO> continuation) {
        return ((C27012OooOOOo) create(interfaceC34887o00o00O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94024OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC34887o00o00O0 interfaceC34887o00o00O0 = (InterfaceC34887o00o00O0) this.f94023OooOo;
            PageConverter.PageLastModificationEntity pageLastModificationEntity = new PageConverter.PageLastModificationEntity(this.f94026OooOoO0, this.f94025OooOoO);
            this.f94024OooOo0o = 1;
            if (interfaceC34887o00o00O0.OooO00o(pageLastModificationEntity, this) == enumC32485OooO00o) {
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
