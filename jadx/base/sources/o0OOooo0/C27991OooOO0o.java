package o0OOooo0;

import com.orion.notein.domain.models.page.Quote;
import com.orion.notein.domain.models.page.QuoteTextAnno;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000O00.C24378OooOoO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0OOooo0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.quote.QuoteUseCase$loadQuoteTextAnnosSync$2", m80623f = "QuoteUseCase.kt", m80624l = {150, 162}, m80625m = "invokeSuspend")
public final class C27991OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends QuoteTextAnno>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27994OooOOOO f99249OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99250OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f99251OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f99252OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27991OooOO0o(C27994OooOOOO c27994OooOOOO, String str, String str2, Continuation<? super C27991OooOO0o> continuation) {
        super(2, continuation);
        this.f99249OooOo = c27994OooOOOO;
        this.f99252OooOoO0 = str;
        this.f99251OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27991OooOO0o(this.f99249OooOo, this.f99252OooOoO0, this.f99251OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends QuoteTextAnno>> continuation) {
        return ((C27991OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99250OooOo0o;
        C27994OooOOOO c27994OooOOOO = this.f99249OooOo;
        String str = this.f99251OooOoO;
        C24378OooOoO0 c24378OooOoO0 = c27994OooOOOO.f99260OooO00o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f99250OooOo0o = 1;
            obj = c24378OooOoO0.OooO0Oo(this.f99252OooOoO0, str, this);
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
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            List<String> annoItemIdList = ((Quote) it.next()).getAnnoItemIdList();
            if (annoItemIdList != null) {
                for (String str2 : annoItemIdList) {
                    if (str2 != null && !C33599OooOo0O.Oooo0o0(str2)) {
                        linkedHashSet.add(str2);
                    }
                }
            }
        }
        if (linkedHashSet.isEmpty()) {
            return C34434OooOoO.f123453OooOo0o;
        }
        List listO0ooOO0 = OooOo.o0ooOO0(linkedHashSet);
        this.f99250OooOo0o = 2;
        Serializable serializableOooO0o = c24378OooOoO0.OooO0o(str, listO0ooOO0, this);
        return serializableOooO0o == enumC32485OooO00o ? enumC32485OooO00o : serializableOooO0o;
    }
}
