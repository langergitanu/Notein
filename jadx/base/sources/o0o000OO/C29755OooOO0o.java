package o0o000OO;

import com.orion.notein.domain.models.page.QuoteTextAnno;
import com.orion.penkit.models.QuoteInfo;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000O00.C24378OooOoO0;
import o0OO000o.C26454OooO0Oo;
import o0OO000o.C26466OooO0o0;
import o0OO00o0.C26629o00OoO0;
import o0OO00o0.C26635o00OoOOo;
import o0OOooo0.C27994OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.C33734OooOOoo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oo0oO0.AbstractC34954o00ooO0;

/* JADX INFO: renamed from: o0o000OO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoViewModel$_quoteTextAnnoList$1", m80623f = "TextAnnoViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29755OooOO0o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<String, QuoteInfo, Continuation<? super InterfaceC33721OooO0o<? extends List<? extends QuoteTextAnno>>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ QuoteInfo f105560OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ String f105561OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f105562OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29755OooOO0o(Continuation continuation, OooOO0O oooOO0O) {
        super(3, continuation);
        this.f105562OooOoO0 = oooOO0O;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(String str, QuoteInfo quoteInfo, Continuation<? super InterfaceC33721OooO0o<? extends List<? extends QuoteTextAnno>>> continuation) {
        C29755OooOO0o c29755OooOO0o = new C29755OooOO0o(continuation, this.f105562OooOoO0);
        c29755OooOO0o.f105561OooOo0o = str;
        c29755OooOO0o.f105560OooOo = quoteInfo;
        return c29755OooOO0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        List<String> annoItemIdList;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        String noteId = this.f105561OooOo0o;
        QuoteInfo quoteInfo = this.f105560OooOo;
        if (quoteInfo == null || (annoItemIdList = quoteInfo.getAnnoItemIdList()) == null) {
            return null;
        }
        C27994OooOOOO c27994OooOOOO = this.f105562OooOoO0.f105532OooO0o;
        c27994OooOOOO.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        C24378OooOoO0 c24378OooOoO0 = c27994OooOOOO.f99260OooO00o;
        C26629o00OoO0 c26629o00OoO0 = (C26629o00OoO0) c24378OooOoO0.f82246OooO00o;
        c26629o00OoO0.getClass();
        C26454OooO0Oo c26454OooO0Oo = c26629o00OoO0.f91909OooO00o;
        c26454OooO0Oo.getClass();
        c26454OooO0Oo.OooO0O0(noteId);
        AbstractC34954o00ooO0 it = c26454OooO0Oo.OooO0o(noteId).Oooo00O();
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        return new C26635o00OoOOo(new C33734OooOOoo(it.OooO0oo(annoItemIdList), new C26466OooO0o0(c26454OooO0Oo, noteId, null)), c24378OooOoO0);
    }
}
