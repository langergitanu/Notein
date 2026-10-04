package o0o000OO;

import com.orion.penkit.models.QuoteInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0o000OO.OooOO0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0o000OO.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoViewModel$prevQuote$1", m80623f = "TextAnnoViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29762OooOo0o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends OooOO0O.OooO00o>, QuoteInfo, Continuation<? super OooOO0O.OooO00o>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ QuoteInfo f105605OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f105606OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends OooOO0O.OooO00o> list, QuoteInfo quoteInfo, Continuation<? super OooOO0O.OooO00o> continuation) {
        C29762OooOo0o c29762OooOo0o = new C29762OooOo0o(3, continuation);
        c29762OooOo0o.f105606OooOo0o = list;
        c29762OooOo0o.f105605OooOo = quoteInfo;
        return c29762OooOo0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f105606OooOo0o;
        QuoteInfo quoteInfo = this.f105605OooOo;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((OooOO0O.OooO00o) it.next()).f105557OooO00o.id, quoteInfo != null ? quoteInfo.getId() : null)) {
                break;
            }
            i++;
        }
        if (i == -1 || i <= 0) {
            return null;
        }
        return list.get(i - 1);
    }
}
