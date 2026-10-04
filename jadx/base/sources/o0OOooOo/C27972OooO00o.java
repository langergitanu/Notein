package o0OOooOo;

import com.orion.notein.domain.models.note.PenInfo;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0000oOO.AbstractC24338OooO0o0;
import o0OO00o0.C26577o000oo0O;
import o0OOOoo.C27204OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOooOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.penbar.UpdatePenInfoUseCase$handlePenEventAndUpdate$2", m80623f = "UpdatePenInfoUseCase.kt", m80624l = {50, 54}, m80625m = "invokeSuspend")
public final class C27972OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super PenInfo>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f99169OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public PenInfo f99170OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AbstractC24338OooO0o0.OooO00o<Integer> f99171OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27976OooO0o0 f99172OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ PenInfo f99173OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ List<PenInfo> f99174OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ PenInfo f99175OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ oO0O000o.OooO00o<C32460OooOooO> f99176OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ String f99177OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27972OooO00o(C27976OooO0o0 c27976OooO0o0, AbstractC24338OooO0o0.OooO00o<Integer> oooO00o, PenInfo penInfo, PenInfo penInfo2, List<PenInfo> list, oO0O000o.OooO00o<C32460OooOooO> oooO00o2, String str, Continuation<? super C27972OooO00o> continuation) {
        super(2, continuation);
        this.f99172OooOoO0 = c27976OooO0o0;
        this.f99171OooOoO = oooO00o;
        this.f99173OooOoOO = penInfo;
        this.f99175OooOoo0 = penInfo2;
        this.f99174OooOoo = list;
        this.f99176OooOooO = oooO00o2;
        this.f99177OooOooo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27972OooO00o(this.f99172OooOoO0, this.f99171OooOoO, this.f99173OooOoOO, this.f99175OooOoo0, this.f99174OooOoo, this.f99176OooOooO, this.f99177OooOooo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super PenInfo> continuation) {
        return ((C27972OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99169OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C26577o000oo0O c26577o000oo0O = this.f99172OooOoO0.f99192OooO00o;
            this.f99169OooOo = 1;
            obj = c26577o000oo0O.OooO0o0(this.f99171OooOoO);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PenInfo penInfo = this.f99170OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            return penInfo;
        }
        C32446OooOOOo.OooO0O0(obj);
        C27204OooO0O0 c27204OooO0O0 = (C27204OooO0O0) obj;
        c27204OooO0O0.getClass();
        PenInfo penInfo2 = this.f99173OooOoOO;
        List<PenInfo> list = this.f99174OooOoo;
        OooOOO0.OooO0oO(list, "list");
        oO0O000o.OooO00o<C32460OooOooO> oooO00o = this.f99176OooOooO;
        PenInfo penInfo3 = this.f99175OooOoo0;
        int i2 = c27204OooO0O0.f95000OooO0O0;
        PenInfo penInfoOooO00o = C27204OooO0O0.OooO00o.OooO00o(i2, penInfo2, penInfo3, list, oooO00o);
        if (i2 != 6) {
            this.f99170OooOo0o = penInfoOooO00o;
            this.f99169OooOo = 2;
            if (this.f99172OooOoO0.OooO00o(penInfoOooO00o, false, this.f99174OooOoo, this.f99177OooOooo, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        }
        return penInfoOooO00o;
    }
}
