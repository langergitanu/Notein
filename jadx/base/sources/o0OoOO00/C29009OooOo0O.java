package o0OoOO00;

import android.content.Context;
import android.net.Uri;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.addpage.AddPageFragment;
import com.orion.notein.p607ui.noteeditor.addpage.OooO0OO;
import kotlin.coroutines.Continuation;
import o00o00.C25206OooO0Oo;
import o0OOOo0.C27174OooO0O0;
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
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoOO00.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.AddPageFragment$insertEntirePdfDoc$1", m80623f = "AddPageFragment.kt", m80624l = {StyleIdentifier.SUBTLE_EMPHASIS}, m80625m = "invokeSuspend")
public final class C29009OooOo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AddPageFragment f102760OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102761OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f102762OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Uri f102763OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29009OooOo0O(AddPageFragment addPageFragment, Uri uri, String str, Continuation<? super C29009OooOo0O> continuation) {
        super(2, continuation);
        this.f102760OooOo = addPageFragment;
        this.f102763OooOoO0 = uri;
        this.f102762OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29009OooOo0O(this.f102760OooOo, this.f102763OooOoO0, this.f102762OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29009OooOo0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102761OooOo0o;
        Uri uri = this.f102763OooOoO0;
        AddPageFragment addPageFragment = this.f102760OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            addPageFragment.f73806Oooo00o = null;
            com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OOOooOoO = addPageFragment.OooOoO();
            this.f102761OooOo0o = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29017OooOooo(oooO0OOOooOoO, uri, this.f102762OooOoO, null), this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) obj;
        C34406OooO00o.f123390OooO00o.OooO00o("AddPageViewModel, insertEntirePdfDoc result: " + c27174OooO0O0, new Object[0]);
        if (c27174OooO0O0.f94862OooO00o) {
            addPageFragment.OooOoO().OooO0oO();
        } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "00001")) {
            addPageFragment.f73806Oooo00o = uri;
            addPageFragment.OooOoO().OooO0o(OooO0OO.OooO00o.C23364OooO0o0.f73878OooO00o);
        } else {
            Context context = addPageFragment.getContext();
            if (context != null) {
                String string = addPageFragment.getString(R.string.add_pdf_failed);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                C25206OooO0Oo.OooO0oO(context, string);
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
