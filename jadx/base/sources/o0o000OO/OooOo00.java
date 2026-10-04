package o0o000OO;

import OooO0o.C20424OooO0Oo;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.page.QuoteTextAnno;
import com.orion.penkit.models.QuoteInfo;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OO00o0.C26478OooO0oo;
import o0OO00o0.C26479OooOO0o;
import o0OOooo0.C27994OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoViewModel$handleAddTextAnno$2", m80623f = "TextAnnoViewModel.kt", m80624l = {StyleIdentifier.LIST_TABLE_4_ACCENT_1, StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_2}, m80625m = "invokeSuspend")
public final class OooOo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f105597OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105598OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ QuoteInfo f105599OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ QuoteTextAnno f105600OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f105601OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f105602OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(OooOO0O oooOO0O, QuoteTextAnno quoteTextAnno, QuoteInfo quoteInfo, String str, String str2, Continuation<? super OooOo00> continuation) {
        super(2, continuation);
        this.f105597OooOo = oooOO0O;
        this.f105600OooOoO0 = quoteTextAnno;
        this.f105599OooOoO = quoteInfo;
        this.f105601OooOoOO = str;
        this.f105602OooOoo0 = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOo00(this.f105597OooOo, this.f105600OooOoO0, this.f105599OooOoO, this.f105601OooOoOO, this.f105602OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOo00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        if (r10 == r0) goto L32;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<String> annoItemIdList;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105598OooOo0o;
        OooOO0O oooOO0O = this.f105597OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27994OooOOOO c27994OooOOOO = oooOO0O.f105532OooO0o;
            List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(this.f105600OooOoO0);
            String str = (String) oooOO0O.f105540OooOOO0.getValue();
            this.f105598OooOo0o = 1;
            if (c27994OooOOOO.OooO0Oo(str, listOooO0oO, this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        QuoteInfo quoteInfo = this.f105599OooOoO;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0((quoteInfo == null || (annoItemIdList = quoteInfo.getAnnoItemIdList()) == null) ? null : (String) oOo000Oo.OooOo.Oooo(annoItemIdList), this.f105601OooOoOO)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("cuizx test");
            String id = quoteInfo.getId();
            Object value = oooOO0O.f105540OooOOO0.getValue();
            StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("origin.getId():", id, ", text:");
            String str2 = this.f105602OooOoo0;
            sbOooO0o0.append(str2);
            sbOooO0o0.append(", noteId:");
            sbOooO0o0.append(value);
            c20358OooO00o.OooO0o0(sbOooO0o0.toString(), new Object[0]);
            String id2 = quoteInfo.getId();
            String str3 = (String) oooOO0O.f105540OooOOO0.getValue();
            this.f105598OooOo0o = 2;
            C26479OooOO0o c26479OooOO0o = oooOO0O.f105535OooO0oo.f97721OooO00o.f91041OooO00o;
            c26479OooOO0o.getClass();
            Object objOooO00o = c26479OooOO0o.OooO00o(str3, new C26478OooO0oo(id2, str2, null));
            if (objOooO00o != enumC32485OooO00o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o != enumC32485OooO00o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o != enumC32485OooO00o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
