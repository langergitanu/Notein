package o0o000OO;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.page.QuoteTextAnno;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o000OO.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoViewModel$handleAddTextAnno$3", m80623f = "TextAnnoViewModel.kt", m80624l = {StyleIdentifier.LIST_TABLE_3_ACCENT_4}, m80625m = "invokeSuspend")
public final class C29760OooOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f105594OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105595OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ QuoteTextAnno f105596OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29760OooOo0(OooOO0O oooOO0O, QuoteTextAnno quoteTextAnno, Continuation<? super C29760OooOo0> continuation) {
        super(2, continuation);
        this.f105594OooOo = oooOO0O;
        this.f105596OooOoO0 = quoteTextAnno;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29760OooOo0(this.f105594OooOo, this.f105596OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29760OooOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105595OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            OooOO0O oooOO0O = this.f105594OooOo;
            List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(this.f105596OooOoO0);
            String str = (String) oooOO0O.f105540OooOOO0.getValue();
            this.f105595OooOo0o = 1;
            if (oooOO0O.f105532OooO0o.OooO0Oo(str, listOooO0oO, this) == enumC32485OooO00o) {
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
