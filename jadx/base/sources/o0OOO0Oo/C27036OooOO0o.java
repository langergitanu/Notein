package o0OOO0Oo;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34903o00o0OoO;

/* JADX INFO: renamed from: o0OOO0Oo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.page.layer.PageLayerLocalDataSource$setPageLayers$2", m80623f = "PageLayerLocalDataSource.kt", m80624l = {81}, m80625m = "invokeSuspend")
public final class C27036OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34903o00o0OoO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f94136OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94137OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ ArrayList f94138OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f94139OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27036OooOO0o(String str, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f94139OooOoO0 = str;
        this.f94138OooOoO = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27036OooOO0o c27036OooOO0o = new C27036OooOO0o(this.f94139OooOoO0, this.f94138OooOoO, continuation);
        c27036OooOO0o.f94136OooOo = obj;
        return c27036OooOO0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34903o00o0OoO abstractC34903o00o0OoO, Continuation<? super C32460OooOooO> continuation) {
        return ((C27036OooOO0o) create(abstractC34903o00o0OoO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94137OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC34903o00o0OoO abstractC34903o00o0OoO = (AbstractC34903o00o0OoO) this.f94136OooOo;
            this.f94137OooOo0o = 1;
            if (abstractC34903o00o0OoO.OooOoo(this.f94139OooOoO0, this.f94138OooOoO, this) == enumC32485OooO00o) {
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
