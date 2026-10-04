package o0Oo0o00;

import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34436OooOoOO;

/* JADX INFO: renamed from: o0Oo0o00.Ooooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncViewModel$3", m80623f = "CloudSyncViewModel.kt", m80624l = {217}, m80625m = "invokeSuspend")
public final class C28199Ooooo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28201OooooO0 f99928OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99929OooOo0o;

    /* JADX INFO: renamed from: o0Oo0o00.Ooooo00$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C28201OooooO0 f99930OooOo0o;

        public OooO00o(C28201OooooO0 c28201OooooO0) {
            this.f99930OooOo0o = c28201OooooO0;
        }

        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        public final Object emit(Object obj, Continuation continuation) throws Throwable {
            List listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(((Map) obj).values());
            C28201OooooO0 c28201OooooO0 = this.f99930OooOo0o;
            C33781o00o0O c33781o00o0O = c28201OooooO0.f99950OooOOoo;
            C34436OooOoOO c34436OooOoOO = C34436OooOoOO.f123455OooOo0o;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, c34436OooOoOO);
            Object objOooO0o0 = C28201OooooO0.OooO0o0(c28201OooooO0, listO0ooOO0, continuation);
            return objOooO0o0 == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o0 : C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28199Ooooo00(C28201OooooO0 c28201OooooO0, Continuation<? super C28199Ooooo00> continuation) {
        super(2, continuation);
        this.f99928OooOo = c28201OooooO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28199Ooooo00(this.f99928OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28199Ooooo00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99929OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28201OooooO0 c28201OooooO0 = this.f99928OooOo;
            InterfaceC33721OooO0o interfaceC33721OooO0oOooOO0O = C25252OooO0Oo.OooOO0O(c28201OooooO0.f99950OooOOoo, 300L);
            OooO00o oooO00o = new OooO00o(c28201OooooO0);
            this.f99929OooOo0o = 1;
            Object objCollect = interfaceC33721OooO0oOooOO0O.collect(new C28200Ooooo0o(oooO00o), this);
            if (objCollect != enumC32485OooO00o) {
                objCollect = C32460OooOooO.f116667OooO00o;
            }
            if (objCollect == enumC32485OooO00o) {
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
