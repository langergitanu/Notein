package o0OOo0o;

import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import o0Oo0o0o.C28282o00ooo;
import o0oOo0o0.AbstractC30978OooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o00o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.ExportUseCase$exportPagesToVectorPDF$2", m80623f = "ExportUseCase.kt", m80624l = {114}, m80625m = "invokeSuspend")
public final class C27524o00o0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super File>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27596o00ooo f96477OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96478OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ CopyOnWriteArrayList f96479OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f96480OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f96481OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ AbstractC30978OooO f96482OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ int f96483OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f96484OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27524o00o0O(C27596o00ooo c27596o00ooo, String str, CopyOnWriteArrayList copyOnWriteArrayList, String str2, int i, AbstractC30978OooO abstractC30978OooO, String str3, Continuation continuation) {
        super(2, continuation);
        this.f96477OooOo = c27596o00ooo;
        this.f96480OooOoO0 = str;
        this.f96479OooOoO = copyOnWriteArrayList;
        this.f96481OooOoOO = str2;
        this.f96483OooOoo0 = i;
        this.f96482OooOoo = abstractC30978OooO;
        this.f96484OooOooO = str3;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27524o00o0O(this.f96477OooOo, this.f96480OooOoO0, this.f96479OooOoO, this.f96481OooOoOO, this.f96483OooOoo0, this.f96482OooOoo, this.f96484OooOooO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super File> continuation) {
        return ((C27524o00o0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96478OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C27596o00ooo c27596o00ooo = this.f96477OooOo;
        C28282o00ooo c28282o00ooo = new C28282o00ooo(c27596o00ooo.f96913OooO0OO, c27596o00ooo.f96914OooO0Oo);
        File fileOooO = C27596o00ooo.OooO(c27596o00ooo);
        this.f96478OooOo0o = 1;
        Object objOooO0Oo = c28282o00ooo.OooO0Oo(this.f96480OooOoO0, this.f96479OooOoO, fileOooO, this.f96481OooOoOO, this.f96483OooOoo0, this.f96482OooOoo, this.f96484OooOooO, this);
        return objOooO0Oo == enumC32485OooO00o ? enumC32485OooO00o : objOooO0Oo;
    }
}
