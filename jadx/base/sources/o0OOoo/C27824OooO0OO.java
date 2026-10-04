package o0OOoo;

import com.orion.notein.domain.models.page.Page;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0OOoo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.page.GetHistoryPageUseCase$invoke$2", m80623f = "GetHistoryPageUseCase.kt", m80624l = {23, 25}, m80625m = "invokeSuspend")
public final class C27824OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Page>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Ooooo00.OooO f98291OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f98292OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f98293OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f98294OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27824OooO0OO(Ooooo00.OooO oooO, String str, String str2, Continuation<? super C27824OooO0OO> continuation) {
        super(2, continuation);
        this.f98291OooOo = oooO;
        this.f98294OooOoO0 = str;
        this.f98293OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27824OooO0OO(this.f98291OooOo, this.f98294OooOoO0, this.f98293OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Page> continuation) {
        return ((C27824OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        List<String> historyPageIdList;
        String str;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98292OooOo0o;
        String str2 = this.f98293OooOoO;
        Ooooo00.OooO oooO = this.f98291OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27449o00O0OoO c27449o00O0OoO = (C27449o00O0OoO) oooO.f61625OooO00o;
            this.f98292OooOo0o = 1;
            obj = c27449o00O0OoO.OoooO0(this.f98294OooOoO0, str2, this);
            if (obj != enumC32485OooO00o) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        Page page = (Page) obj;
        if (page == null || (historyPageIdList = page.getHistoryPageIdList()) == null || (str = (String) OooOo.Oooo(historyPageIdList)) == null) {
            return null;
        }
        C27449o00O0OoO c27449o00O0OoO2 = (C27449o00O0OoO) oooO.f61625OooO00o;
        this.f98292OooOo0o = 2;
        Object objOoooO0 = c27449o00O0OoO2.OoooO0(str, str2, this);
        return objOoooO0 == enumC32485OooO00o ? enumC32485OooO00o : objOoooO0;
    }
}
