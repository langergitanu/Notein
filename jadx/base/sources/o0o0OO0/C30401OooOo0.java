package o0o0OO0;

import com.orion.notein.domain.models.ocr.AiOcrTextPage;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import o0oo000O.C31185OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0OO0.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$savePageContentLocked$1", m80623f = "AiOcrViewModel.kt", m80624l = {627}, m80625m = "invokeSuspend")
public final class C30401OooOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30394OooOOOO f108563OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108564OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f108565OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f108566OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30401OooOo0(C30394OooOOOO c30394OooOOOO, String str, String str2, Continuation<? super C30401OooOo0> continuation) {
        super(2, continuation);
        this.f108563OooOo = c30394OooOOOO;
        this.f108566OooOoO0 = str;
        this.f108565OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30401OooOo0(this.f108563OooOo, this.f108566OooOoO0, this.f108565OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30401OooOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        String str;
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108564OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30394OooOOOO c30394OooOOOO = this.f108563OooOo;
            Iterator it = ((Iterable) c30394OooOOOO.f108512OooOo0o.f121747OooOo0o.getValue()).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                str = this.f108566OooOoO0;
                if (!zHasNext) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((AiOcrTextPage) next).getId(), str)) {
                    break;
                }
            }
            AiOcrTextPage aiOcrTextPage = (AiOcrTextPage) next;
            if (aiOcrTextPage == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO0OO(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "AiOcrViewModel", "Failed to find page: ", str), new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            String str2 = this.f108565OooOoO;
            if (C31185OooO0OO.OooO00o(str2).equals(aiOcrTextPage.getContentMd5().getValue())) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("AiOcrViewModel");
                c20358OooO00o2.OooO00o("Content is not changed, skip saving", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            AiOcrTextPage aiOcrTextPageCopy$default = AiOcrTextPage.copy$default(aiOcrTextPage, null, 0, null, str2, 0L, System.currentTimeMillis(), null, 87, null);
            this.f108564OooOo0o = 1;
            if (c30394OooOOOO.f108494OooO0o.OooO0OO(aiOcrTextPageCopy$default, this) == enumC32485OooO00o) {
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
