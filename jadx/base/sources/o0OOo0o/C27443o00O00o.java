package o0OOo0o;

import java.io.File;
import kotlin.coroutines.Continuation;
import o0OO00o0.C26596o00O0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o00O00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$duplicatedImageFileToPrivateDir$2", m80623f = "NoteUseCase.kt", m80624l = {2093}, m80625m = "invokeSuspend")
public final class C27443o00O00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f95938OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95939OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f95940OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ File f95941OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f95942OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27443o00O00o(C27449o00O0OoO c27449o00O0OoO, File file, String str, String str2, Continuation<? super C27443o00O00o> continuation) {
        super(2, continuation);
        this.f95938OooOo = c27449o00O0OoO;
        this.f95941OooOoO0 = file;
        this.f95940OooOoO = str;
        this.f95942OooOoOO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27443o00O00o(this.f95938OooOo, this.f95941OooOoO0, this.f95940OooOoO, this.f95942OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C27443o00O00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95939OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C26596o00O0o0 c26596o00O0o0 = this.f95938OooOo.f96047OooOOO0;
        this.f95939OooOo0o = 1;
        Object objOooO0oO = c26596o00O0o0.OooO0oO(this.f95941OooOoO0, this.f95940OooOoO, this.f95942OooOoOO, this);
        return objOooO0oO == enumC32485OooO00o ? enumC32485OooO00o : objOooO0oO;
    }
}
