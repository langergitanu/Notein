package o0OOo0o;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OOo0o.o0000OoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteInFileUseCase$1", m80623f = "NoteInFileUseCase.kt", m80624l = {190, 191, 192, 193}, m80625m = "invokeSuspend")
public final class C27384o0000OoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27387o0000o0 f95414OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95415OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27384o0000OoO(C27387o0000o0 c27387o0000o0, Continuation<? super C27384o0000OoO> continuation) {
        super(2, continuation);
        this.f95414OooOo = c27387o0000o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27384o0000OoO(this.f95414OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27384o0000OoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        if (r11 != r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooO0o;
        Object objOooO0o2;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95415OooOo0o;
        C27387o0000o0 c27387o0000o0 = this.f95414OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f95415OooOo0o = 1;
            c27387o0000o0.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o3 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27408o000Oo0o(c27387o0000o0, true, null), this);
            if (objOooO0o3 != obj2) {
                objOooO0o3 = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0o3 != obj2) {
            }
            return obj2;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i == 2) {
                C32446OooOOOo.OooO0O0(obj);
                this.f95415OooOo0o = 3;
                c27387o0000o0.getClass();
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27393o0000oO0(c27387o0000o0, true, null), this);
                if (objOooO0o != obj2) {
                    objOooO0o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o != obj2) {
                    this.f95415OooOo0o = 4;
                    c27387o0000o0.getClass();
                    C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                    objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27408o000Oo0o(c27387o0000o0, false, null), this);
                    if (objOooO0o2 != obj2) {
                    }
                }
                return obj2;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            this.f95415OooOo0o = 4;
            c27387o0000o0.getClass();
            C33874OooO0OO c33874OooO0OO32 = C33649OoooOOo.f121328OooO00o;
            objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27408o000Oo0o(c27387o0000o0, false, null), this);
            if (objOooO0o2 != obj2) {
                objOooO0o2 = C32460OooOooO.f116667OooO00o;
            }
        }
        this.f95415OooOo0o = 2;
        if (C33644OoooO0.OooO00o(3000L, this) != obj2) {
            this.f95415OooOo0o = 3;
            c27387o0000o0.getClass();
            C33874OooO0OO c33874OooO0OO22 = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27393o0000oO0(c27387o0000o0, true, null), this);
            if (objOooO0o != obj2) {
            }
            if (objOooO0o != obj2) {
            }
        }
        return obj2;
    }
}
