package o0OOo0o;

import com.orion.notein.domain.models.note.Outline;
import java.io.Serializable;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OOo0o.OooooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.ExportUseCase$exportDataLoader$1$loadOutlines$2", m80623f = "ExportUseCase.kt", m80624l = {60}, m80625m = "invokeSuspend")
public final class C27370OooooOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Outline>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27596o00ooo f95291OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95292OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f95293OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<String> f95294OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ int f95295OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27370OooooOO(C27596o00ooo c27596o00ooo, List<String> list, String str, int i, Continuation<? super C27370OooooOO> continuation) {
        super(2, continuation);
        this.f95291OooOo = c27596o00ooo;
        this.f95294OooOoO0 = list;
        this.f95293OooOoO = str;
        this.f95295OooOoOO = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27370OooooOO(this.f95291OooOo, this.f95294OooOoO0, this.f95293OooOoO, this.f95295OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Outline>> continuation) {
        return ((C27370OooooOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95292OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C27449o00O0OoO c27449o00O0OoO = this.f95291OooOo.f96912OooO0O0;
        this.f95292OooOo0o = 1;
        Serializable serializableOooO0O0 = (this.f95295OooOoOO & 2) == 0 ? C34434OooOoO.f123453OooOo0o : c27449o00O0OoO.f96043OooOO0.OooO0O0(this.f95293OooOoO, this);
        return serializableOooO0O0 == enumC32485OooO00o ? enumC32485OooO00o : serializableOooO0O0;
    }
}
