package o0OoOO00;

import android.content.Context;
import android.net.Uri;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.addpage.AddPageFragment;
import kotlin.coroutines.Continuation;
import o00o00.C25206OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoOO00.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.AddPageFragment$registerPdfPageAdditionListener$1$1", m80623f = "AddPageFragment.kt", m80624l = {207}, m80625m = "invokeSuspend")
public final class C29010OooOo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AddPageFragment f102764OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102765OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f102766OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Uri f102767OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ int f102768OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29010OooOo0o(AddPageFragment addPageFragment, Uri uri, String str, int i, Continuation<? super C29010OooOo0o> continuation) {
        super(2, continuation);
        this.f102764OooOo = addPageFragment;
        this.f102767OooOoO0 = uri;
        this.f102766OooOoO = str;
        this.f102768OooOoOO = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29010OooOo0o(this.f102764OooOo, this.f102767OooOoO0, this.f102766OooOoO, this.f102768OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29010OooOo0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102765OooOo0o;
        AddPageFragment addPageFragment = this.f102764OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OOOooOoO = addPageFragment.OooOoO();
            this.f102765OooOo0o = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29019Oooo00O(oooO0OOOooOoO, this.f102768OooOoOO, this.f102767OooOoO0, this.f102766OooOoO, null), this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            addPageFragment.OooOoO().OooO0oO();
        } else {
            Context context = addPageFragment.getContext();
            if (context != null) {
                String string = addPageFragment.getString(R.string.add_pdf_page_failed);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                C25206OooO0Oo.OooO0oO(context, string);
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
