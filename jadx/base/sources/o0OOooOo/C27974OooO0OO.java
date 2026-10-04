package o0OOooOo;

import com.orion.notein.domain.models.note.PenInfo;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOOoo.C27204OooO0O0;
import o0oo00oO.InterfaceC31214OooO0oo;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOooOo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.penbar.UpdatePenInfoUseCase$handleStylusActionAndUpdate$2", m80623f = "UpdatePenInfoUseCase.kt", m80624l = {35}, m80625m = "invokeSuspend")
public final class C27974OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super PenInfo>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f99178OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public PenInfo f99179OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ PenInfo f99180OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC31214OooO0oo.C31216OooO0o0 f99181OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ PenInfo f99182OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C27976OooO0o0 f99183OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ List<PenInfo> f99184OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f99185OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27974OooO0OO(InterfaceC31214OooO0oo.C31216OooO0o0 c31216OooO0o0, PenInfo penInfo, PenInfo penInfo2, List<PenInfo> list, C27976OooO0o0 c27976OooO0o0, String str, Continuation<? super C27974OooO0OO> continuation) {
        super(2, continuation);
        this.f99181OooOoO0 = c31216OooO0o0;
        this.f99180OooOoO = penInfo;
        this.f99182OooOoOO = penInfo2;
        this.f99184OooOoo0 = list;
        this.f99183OooOoo = c27976OooO0o0;
        this.f99185OooOooO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27974OooO0OO(this.f99181OooOoO0, this.f99180OooOoO, this.f99182OooOoOO, this.f99184OooOoo0, this.f99183OooOoo, this.f99185OooOooO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super PenInfo> continuation) {
        return ((C27974OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99178OooOo;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PenInfo penInfo = this.f99179OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            return penInfo;
        }
        C32446OooOOOo.OooO0O0(obj);
        int i2 = 0;
        switch (this.f99181OooOoO0.f111333OooO00o.ordinal()) {
            case 0:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 7;
                break;
            case 5:
                i2 = 4;
                break;
            case 6:
                i2 = 5;
                break;
            case 7:
                i2 = 6;
                break;
            default:
                throw new C32442OooOO0o();
        }
        PenInfo penInfoOooO00o = C27204OooO0O0.OooO00o.OooO00o(i2, this.f99180OooOoO, this.f99182OooOoOO, this.f99184OooOoo0, new C27973OooO0O0());
        if (i2 != 6) {
            this.f99179OooOo0o = penInfoOooO00o;
            this.f99178OooOo = 1;
            if (this.f99183OooOoo.OooO00o(penInfoOooO00o, false, this.f99184OooOoo0, this.f99185OooOooO, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        }
        return penInfoOooO00o;
    }
}
