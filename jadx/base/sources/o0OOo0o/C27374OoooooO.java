package o0OOo0o;

import java.io.File;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0oOo0o0.AbstractC30978OooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.OoooooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.ExportUseCase$exportNotesToFlattenedPDF$2", m80623f = "ExportUseCase.kt", m80624l = {123}, m80625m = "invokeSuspend")
public final class C27374OoooooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super File>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27596o00ooo f95306OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95307OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f95308OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Set<String> f95309OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ int f95310OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f95311OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ AbstractC30978OooO f95312OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27374OoooooO(C27596o00ooo c27596o00ooo, Set<String> set, String str, int i, AbstractC30978OooO abstractC30978OooO, String str2, Continuation<? super C27374OoooooO> continuation) {
        super(2, continuation);
        this.f95306OooOo = c27596o00ooo;
        this.f95309OooOoO0 = set;
        this.f95308OooOoO = str;
        this.f95310OooOoOO = i;
        this.f95312OooOoo0 = abstractC30978OooO;
        this.f95311OooOoo = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27374OoooooO(this.f95306OooOo, this.f95309OooOoO0, this.f95308OooOoO, this.f95310OooOoOO, this.f95312OooOoo0, this.f95311OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super File> continuation) {
        return ((C27374OoooooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95307OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C27596o00ooo c27596o00ooo = this.f95306OooOo;
        o0Oo0o0o.o0OoOo0 o0oooo02 = new o0Oo0o0o.o0OoOo0(c27596o00ooo.f96913OooO0OO, c27596o00ooo.f96914OooO0Oo);
        File fileOooO = C27596o00ooo.OooO(c27596o00ooo);
        this.f95307OooOo0o = 1;
        Object objOooO0O0 = o0oooo02.OooO0O0(this.f95309OooOoO0, fileOooO, this.f95308OooOoO, this.f95310OooOoOO, this.f95312OooOoo0, this.f95311OooOoo, this);
        return objOooO0O0 == enumC32485OooO00o ? enumC32485OooO00o : objOooO0O0;
    }
}
