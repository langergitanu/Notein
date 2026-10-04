package o0OOoo0O;

import com.aspose.slides.C22227OoooO;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOoo0O.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.material.AddStickerToCollectionUseCase$isApplied$2", m80623f = "AddStickerToCollectionUseCase.kt", m80624l = {43}, m80625m = "invokeSuspend")
public final class C27839OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f98351OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f98352OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f98353OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27836OooO0o f98354OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27839OooO0oo(C27836OooO0o c27836OooO0o, String str, Continuation<? super C27839OooO0oo> continuation) {
        super(2, continuation);
        this.f98354OooOoO0 = c27836OooO0o;
        this.f98353OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27839OooO0oo(this.f98354OooOoO0, this.f98353OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C27839OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98351OooOo;
        String str2 = this.f98353OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27836OooO0o c27836OooO0o = this.f98354OooOoO0;
            String strOooO0Oo = c27836OooO0o.f98344OooO0Oo.OooO0Oo();
            this.f98352OooOo0o = strOooO0Oo;
            this.f98351OooOo = 1;
            obj = c27836OooO0o.f98343OooO0OO.OooO(str2, strOooO0Oo, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            str = strOooO0Oo;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.f98352OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        boolean z = obj != null;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "AddStickerToCollectionUseCase", "isApplied check: stickerId=", str2, ", userId=");
        sbOooO00o.append(str);
        sbOooO00o.append(", exists=");
        sbOooO00o.append(z);
        c20358OooO00o.OooO00o(sbOooO00o.toString(), new Object[0]);
        return Boolean.valueOf(z);
    }
}
