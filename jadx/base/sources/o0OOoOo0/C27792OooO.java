package o0OOoOo0;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.page.Page;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OOoOo0.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.label.GetItemsByLabelUseCase$combinePageFlows$$inlined$combine$1$3", m80623f = "GetItemsByLabelUseCase.kt", m80624l = {StyleIdentifier.GRID_TABLE_2_ACCENT_2}, m80625m = "invokeSuspend")
public final class C27792OooO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends Page>>, Page[], Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f98172OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f98173OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object[] f98174OooOoO0;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends Page>> interfaceC33723OooO0oO, Page[] pageArr, Continuation<? super C32460OooOooO> continuation) {
        C27792OooO c27792OooO = new C27792OooO(3, continuation);
        c27792OooO.f98172OooOo = interfaceC33723OooO0oO;
        c27792OooO.f98174OooOoO0 = pageArr;
        return c27792OooO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98173OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f98172OooOo;
            Page[] pageArr = (Page[]) this.f98174OooOoO0;
            ArrayList arrayList = new ArrayList();
            for (Page page : pageArr) {
                if (page != null) {
                    arrayList.add(page);
                }
            }
            this.f98173OooOo0o = 1;
            if (interfaceC33723OooO0oO.emit(arrayList, this) == enumC32485OooO00o) {
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
