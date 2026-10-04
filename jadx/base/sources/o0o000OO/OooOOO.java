package o0o000OO;

import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.Quote;
import com.orion.penkit.models.QuoteInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import o0o000OO.OooOO0O;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoViewModel$annotationQuotes$1", m80623f = "TextAnnoViewModel.kt", m80624l = {154}, m80625m = "invokeSuspend")
public final class OooOOO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<C32443OooOOO<? extends String, ? extends List<? extends Quote>>, QuoteInfo, Continuation<? super List<? extends OooOO0O.OooO00o>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f105563OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105564OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f105565OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(Continuation continuation, OooOO0O oooOO0O) {
        super(3, continuation);
        this.f105565OooOoO0 = oooOO0O;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(C32443OooOOO<? extends String, ? extends List<? extends Quote>> c32443OooOOO, QuoteInfo quoteInfo, Continuation<? super List<? extends OooOO0O.OooO00o>> continuation) {
        OooOOO oooOOO = new OooOOO(continuation, this.f105565OooOoO0);
        oooOOO.f105563OooOo = c32443OooOOO;
        return oooOOO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        List list;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105564OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f105563OooOo;
            String str = (String) c32443OooOOO.f116638OooOo0o;
            List list2 = (List) c32443OooOOO.f116637OooOo;
            C27449o00O0OoO c27449o00O0OoO = this.f105565OooOoO0.f105531OooO0Oo;
            this.f105563OooOo = list2;
            this.f105564OooOo0o = 1;
            Object objOooOoO0 = c27449o00O0OoO.OooOoO0(str, this);
            if (objOooOoO0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            list = list2;
            obj = objOooOoO0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) this.f105563OooOo;
            C32446OooOOOo.OooO0O0(obj);
        }
        NoteContent noteContent = (NoteContent) obj;
        int i2 = 0;
        if (noteContent == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("TextAnnoViewModel");
            c20358OooO00o.OooO0OO("switchToLastQuote: noteContent is null", new Object[0]);
            return C34434OooOoO.f123453OooOo0o;
        }
        List<Page> pages = noteContent.getPages();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(pages, 10));
        for (Object obj2 : pages) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            arrayList.add(new C32443OooOOO(((Page) obj2).getId(), new Integer(i2)));
            i2 = i3;
        }
        Map mapOooOO0o = C34444Oooo0O0.OooOO0o(arrayList);
        List<Quote> listO00O0O = oOo000Oo.OooOo.o00O0O(list, new OooOOO0(mapOooOO0o, 0));
        ArrayList arrayList2 = new ArrayList();
        for (Quote quote : listO00O0O) {
            Integer num = (Integer) mapOooOO0o.get(quote.getPageId());
            OooOO0O.OooO00o oooO00o = num != null ? new OooOO0O.OooO00o(num.intValue(), quote) : null;
            if (oooO00o != null) {
                arrayList2.add(oooO00o);
            }
        }
        return arrayList2;
    }
}
