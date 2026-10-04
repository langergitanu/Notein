package o0OO00o0;

import com.orion.notein.App;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24334OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OO00o0.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.CustomOperateRepoImpl$setHandWriteMode$2", m80623f = "CustomOperateRepoImpl.kt", m80624l = {105}, m80625m = "invokeSuspend")
public final class C26487OooOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super AbstractC24338OooO0o0>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26490OooOoo f91050OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91051OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f91052OooOoO0;

    /* JADX INFO: renamed from: o0OO00o0.OooOoO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.CustomOperateRepoImpl$setHandWriteMode$2$1", m80623f = "CustomOperateRepoImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ boolean f91053OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f91054OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f91053OooOo = z;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f91053OooOo, continuation);
            oooO00o.f91054OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            ((C24334OooO0O0) this.f91054OooOo0o).OooO0oO(App.f69595o0OO00O, Boolean.valueOf(this.f91053OooOo));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26487OooOoO(C26490OooOoo c26490OooOoo, boolean z, Continuation<? super C26487OooOoO> continuation) {
        super(2, continuation);
        this.f91050OooOo = c26490OooOoo;
        this.f91052OooOoO0 = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26487OooOoO(this.f91050OooOo, this.f91052OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super AbstractC24338OooO0o0> continuation) {
        return ((C26487OooOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91051OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = this.f91050OooOo.f91060OooO00o;
        OooO00o oooO00o = new OooO00o(this.f91052OooOoO0, null);
        this.f91051OooOo0o = 1;
        Object objOooO00o = C24332OooO.OooO00o(oooOO02, oooO00o, this);
        return objOooO00o == enumC32485OooO00o ? enumC32485OooO00o : objOooO00o;
    }
}
