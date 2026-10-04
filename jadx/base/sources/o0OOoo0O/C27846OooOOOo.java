package o0OOoo0O;

import com.aspose.slides.C22201OooO0oO;
import java.io.File;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOoo0O.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.material.ApplyTemplateMaterialUseCase$removeApplied$2", m80623f = "ApplyTemplateMaterialUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27846OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f98376OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C27848OooOOo0 f98377OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27846OooOOOo(C27848OooOOo0 c27848OooOOo0, String str, Continuation<? super C27846OooOOOo> continuation) {
        super(2, continuation);
        this.f98377OooOo0o = c27848OooOOo0;
        this.f98376OooOo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27846OooOOOo(this.f98377OooOo0o, this.f98376OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C27846OooOOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C27848OooOOo0 c27848OooOOo0 = this.f98377OooOo0o;
        String str = this.f98376OooOo;
        File fileOooO00o = c27848OooOOo0.OooO00o(str);
        boolean z = false;
        if (fileOooO00o.exists()) {
            boolean zOooO0Oo = C32501OooO0oO.OooO0Oo(fileOooO00o);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ApplyTemplateMaterialUseCase");
            StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("removeApplied: materialId=", str, ", dir=", fileOooO00o.getAbsolutePath(), ", deleted=");
            sbOooO0O0.append(zOooO0Oo);
            c20358OooO00o.OooO00o(sbOooO0O0.toString(), new Object[0]);
            z = zOooO0Oo;
        } else {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooO00o(C22201OooO0oO.OooO0O0(c20358OooO00o2, "ApplyTemplateMaterialUseCase", "removeApplied: materialId=", str, ", dir not exists"), new Object[0]);
        }
        return Boolean.valueOf(z);
    }
}
