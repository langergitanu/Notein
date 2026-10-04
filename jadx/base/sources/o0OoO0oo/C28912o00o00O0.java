package o0OoO0oo;

import com.orion.notein.domain.models.page.Image;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import kotlin.coroutines.Continuation;
import o0OO00o0.C26596o00O0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO0oo.o00o00O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$getImageById$2", m80623f = "NoteEditorViewModel.kt", m80624l = {872}, m80625m = "invokeSuspend")
public final class C28912o00o00O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Image>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f102434OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102435OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f102436OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28912o00o00O0(C23344OooOOo c23344OooOOo, String str, Continuation<? super C28912o00o00O0> continuation) {
        super(2, continuation);
        this.f102434OooOo = c23344OooOOo;
        this.f102436OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28912o00o00O0(this.f102434OooOo, this.f102436OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Image> continuation) {
        return ((C28912o00o00O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102435OooOo0o;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            C23344OooOOo c23344OooOOo = this.f102434OooOo;
            C26596o00O0o0 c26596o00O0o0 = c23344OooOOo.f73554OooOOO0;
            String str = this.f102436OooOoO0;
            String str2 = (String) c23344OooOOo.f73589OoooOOo.getValue();
            this.f102435OooOo0o = 1;
            Object objOooO0oo = c26596o00O0o0.OooO0oo(str, str2, this);
            return objOooO0oo == enumC32485OooO00o ? enumC32485OooO00o : objOooO0oo;
        } catch (Exception unused) {
            return null;
        }
    }
}
