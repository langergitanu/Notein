package oO0Oo;

import android.content.Context;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0o0OO0.C30394OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0OO.C32879OooO0Oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: oO0Oo.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$initLangSelector$2", m80623f = "TextRecognizeFragment.kt", m80624l = {454}, m80625m = "invokeSuspend")
public final class C33179OooOo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ TextRecognizeFragment f120071OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f120072OooOo0o;

    /* JADX INFO: renamed from: oO0Oo.OooOo0O$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$initLangSelector$2$1", m80623f = "TextRecognizeFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C32879OooO0Oo>, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ TextRecognizeFragment f120073OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f120074OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(TextRecognizeFragment textRecognizeFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f120073OooOo = textRecognizeFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f120073OooOo, continuation);
            oooO00o.f120074OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(List<? extends C32879OooO0Oo> list, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            List list = (List) this.f120074OooOo0o;
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                return C32460OooOooO.f116667OooO00o;
            }
            TextRecognizeFragment textRecognizeFragment = this.f120073OooOo;
            Spinner spinner = textRecognizeFragment.f78174Oooo0o;
            if (spinner == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("langSelector");
                throw null;
            }
            Context contextRequireContext = textRecognizeFragment.requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            spinner.setAdapter((SpinnerAdapter) new oO0OO.OooO0OO(contextRequireContext, list));
            Iterator it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((C32879OooO0Oo) it.next()).f117993OooO0O0) {
                    break;
                }
                i++;
            }
            Spinner spinner2 = textRecognizeFragment.f78174Oooo0o;
            if (spinner2 != null) {
                spinner2.setSelection(i);
                return C32460OooOooO.f116667OooO00o;
            }
            kotlin.jvm.internal.OooOOO0.OooOOOO("langSelector");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33179OooOo0O(TextRecognizeFragment textRecognizeFragment, Continuation<? super C33179OooOo0O> continuation) {
        super(2, continuation);
        this.f120071OooOo = textRecognizeFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C33179OooOo0O(this.f120071OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C33179OooOo0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f120072OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            TextRecognizeFragment textRecognizeFragment = this.f120071OooOo;
            C30394OooOOOO c30394OooOOOOOooo00O = textRecognizeFragment.Oooo00O();
            OooO00o oooO00o = new OooO00o(textRecognizeFragment, null);
            this.f120072OooOo0o = 1;
            if (C25252OooO0Oo.OooO0oO(c30394OooOOOOOooo00O.f108517OooOoo0, oooO00o, this) == enumC32485OooO00o) {
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
