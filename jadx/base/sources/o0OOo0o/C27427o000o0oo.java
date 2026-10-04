package o0OOo0o;

import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o000o0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$addLockForNote$2", m80623f = "NoteUseCase.kt", m80624l = {126, 128}, m80625m = "invokeSuspend")
public final class C27427o000o0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f95763OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95764OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f95765OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27427o000o0oo(C27449o00O0OoO c27449o00O0OoO, String str, Continuation<? super C27427o000o0oo> continuation) {
        super(2, continuation);
        this.f95763OooOo = c27449o00O0OoO;
        this.f95765OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27427o000o0oo(this.f95763OooOo, this.f95765OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C27427o000o0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        if (r2 == r1) goto L17;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0oo;
        Object objOooOo0O;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95764OooOo0o;
        C27449o00O0OoO c27449o00O0OoO = this.f95763OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String strOooO0Oo = c27449o00O0OoO.f96037OooO0OO.OooO0Oo();
            this.f95764OooOo0o = 1;
            objOooO0oo = c27449o00O0OoO.f96036OooO0O0.OooO0oo(this.f95765OooOoO0, strOooO0Oo, this);
            if (objOooO0oo != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooOo0O = obj;
            Boolean bool = (Boolean) objOooOo0O;
            bool.getClass();
            return bool;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooO0oo = obj;
        NoteMeta noteMeta = (NoteMeta) objOooO0oo;
        if (noteMeta == null) {
            return null;
        }
        NoteMeta noteMetaCopy$default = NoteMeta.copy$default(noteMeta, null, null, null, null, null, false, null, 0, 0, false, null, 0, 0L, 0L, null, false, false, true, 0L, 393215, null);
        this.f95764OooOo0o = 2;
        objOooOo0O = c27449o00O0OoO.f96036OooO0O0.OooOo0O(new NoteMeta[]{noteMetaCopy$default}, this);
    }
}
