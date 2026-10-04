package o0o00oO;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.editor.model.ClipboardData;
import com.orion.notein.domain.models.translate.TranslateResult;
import com.orion.penkit.models.TextBoxInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OO00o0.C26481OooOOo;
import o0OO00o0.C26486OooOo0o;
import o0OOOOoO.C27163OooO0Oo;
import o0OOOOoO.C27165OooO0oO;
import o0OOo0Oo.InterfaceC27324Oooo0oo;
import o0OOo0o.o00000O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33779o00Oo0;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;

/* JADX INFO: renamed from: o0o00oO.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lo0o00oO/OooOOo;", "Landroidx/lifecycle/Ooooooo;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class C29970OooOOo extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C33769Ooooo0o f106433OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OOOO0.OooO0o f106434OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final InterfaceC27324Oooo0oo f106435OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0OO0O0O.OooO00o f106436OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f106437OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C33769Ooooo0o f106438OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C33769Ooooo0o f106439OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C33769Ooooo0o f106440OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C33769Ooooo0o f106441OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C33781o00o0O f106442OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C33781o00o0O f106443OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final C33769Ooooo0o f106444OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final C33769Ooooo0o f106445OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final C33769Ooooo0o f106446OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final C33769Ooooo0o f106447OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final C33769Ooooo0o f106448OooOOoo;

    /* JADX INFO: renamed from: o0o00oO.OooOOo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.translate.TranslateViewModel$saveTextToClipboard$boxColor$1", m80623f = "TranslateViewModel.kt", m80624l = {150}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Integer>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f106450OooOo0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C29970OooOOo.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Integer> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f106450OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            o0OOOOoO.OooO0OO OooO0OO2 = C29970OooOOo.this.f106435OooO0o.OooO0OO();
            this.f106450OooOo0o = 1;
            Object objOooOOo = C25252OooO0Oo.OooOOo(OooO0OO2, this);
            return objOooOOo == enumC32485OooO00o ? enumC32485OooO00o : objOooOOo;
        }
    }

    /* JADX INFO: renamed from: o0o00oO.OooOOo$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.translate.TranslateViewModel$saveTextToClipboard$lineHeight$1", m80623f = "TranslateViewModel.kt", m80624l = {149}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Float>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f106452OooOo0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C29970OooOOo.this.new OooO0O0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Float> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f106452OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            C27163OooO0Oo c27163OooO0OoOooO = C29970OooOOo.this.f106435OooO0o.OooO();
            this.f106452OooOo0o = 1;
            Object objOooOOo = C25252OooO0Oo.OooOOo(c27163OooO0OoOooO, this);
            return objOooOOo == enumC32485OooO00o ? enumC32485OooO00o : objOooOOo;
        }
    }

    public C29970OooOOo(o0OOOO0.OooO0o oooO0o, o0OO0O0O.OooO00o oooO00o, o00000O getRemoteConfigUseCase, InterfaceC27324Oooo0oo textBoxRepo, o0000o0O.OooOO0 dataStore, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(getRemoteConfigUseCase, "getRemoteConfigUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(textBoxRepo, "textBoxRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(dataStore, "dataStore");
        this.f106434OooO0Oo = oooO0o;
        this.f106436OooO0o0 = oooO00o;
        this.f106435OooO0o = textBoxRepo;
        this.f106437OooO0oO = dataStore;
        C34436OooOoOO c34436OooOoOO = C34436OooOoOO.f123455OooOo0o;
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(c34436OooOoOO);
        C27165OooO0oO textStyle = textBoxRepo.getTextStyle();
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
        this.f106438OooO0oo = C25252OooO0Oo.OooOoO0(textStyle, C33633Oooo0.OooO0oO(interfaceC33636Oooo00oOooO00o, executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34436OooOoOO);
        c33781o00o0OOooO00o.OooOO0(null, oooO0o.OooO00o());
        C33769Ooooo0o c33769Ooooo0oOooOoO0 = C25252OooO0Oo.OooOoO0(new C29973OooOo0(dataStore.getData(), this), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), 0);
        this.f106433OooO = c33769Ooooo0oOooOoO0;
        C33763OoooOOO c33763OoooOOO = new C33763OoooOOO(c33781o00o0OOooO00o, c33769Ooooo0oOooOoO0, new C29969OooOOOo(3, null));
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o2 = o0OoOo0.OooO00o(this);
        C33779o00Oo0 c33779o00Oo0OooO00o = InterfaceC33788ooOO.OooO00o.OooO00o(2);
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        this.f106439OooOO0 = C25252OooO0Oo.OooOoO0(c33763OoooOOO, interfaceC33636Oooo00oOooO00o2, c33779o00Oo0OooO00o, c34434OooOoO);
        C33769Ooooo0o c33769Ooooo0oOooOoO02 = C25252OooO0Oo.OooOoO0(new C29975OooOo0O(dataStore.getData(), this), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), 0);
        this.f106440OooOO0O = c33769Ooooo0oOooOoO02;
        this.f106441OooOO0o = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33781o00o0OOooO00o, c33769Ooooo0oOooOoO02, new C29983OooOooo(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        this.f106443OooOOO0 = C33784o00ooo.OooO00o("");
        C33781o00o0O c33781o00o0OOooO00o2 = C33784o00ooo.OooO00o("");
        this.f106442OooOOO = c33781o00o0OOooO00o2;
        C33769Ooooo0o c33769Ooooo0oOooOoO03 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOo0O(C25252OooO0Oo.OooO(c33781o00o0OOooO00o2, c33769Ooooo0oOooOoO0, c33769Ooooo0oOooOoO02, c33781o00o0OOooO00o, new C29971OooOOo0(this, null)), executorC33873OooO0O0), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), new TranslateResult("auto", TranslateLanguage.CHINESE, "", "", "", "", "", ""));
        this.f106444OooOOOO = C25252OooO0Oo.OooOoO0(new OooOo(c33769Ooooo0oOooOoO03, 0), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), "");
        this.f106445OooOOOo = C25252OooO0Oo.OooOoO0(new C26481OooOOo(c33769Ooooo0oOooOoO03, 1), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), "");
        this.f106447OooOOo0 = C25252OooO0Oo.OooOoO0(new C26486OooOo0o(c33769Ooooo0oOooOoO03, 1), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), "");
        this.f106446OooOOo = C25252OooO0Oo.OooOoO0(new C29981OooOoo0(c33769Ooooo0oOooOoO03, 0), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), "");
        this.f106448OooOOoo = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33769Ooooo0oOooOoO0, c33769Ooooo0oOooOoO02, new C29982OooOooO(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), Boolean.FALSE);
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), null, null, new C29968OooOOOO(this, null), 3);
    }

    public final void OooO0o0(Context context, String text) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        Object systemService = context.getSystemService("clipboard");
        kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("text", text));
        Map<Integer, ? extends Object> map = (Map) this.f106438OooO0oo.f121747OooOo0o.getValue();
        OooO0O0 oooO0O0 = new OooO0O0(null);
        oOo0000O.OooO oooO = oOo0000O.OooO.f123416OooOo0o;
        TextBoxInfo textBoxInfoFromText = TextBoxInfo.INSTANCE.fromText(context, text, map, ((Number) C33609OooO0oo.OooO0Oo(oooO, oooO0O0)).floatValue(), ((Number) C33609OooO0oo.OooO0Oo(oooO, new OooO00o(null))).intValue());
        ClipboardData clipboardData = new ClipboardData();
        clipboardData.f69321OooO00o = com.facebook.soloader.OooOo.OooO0oO(textBoxInfoFromText);
        this.f106436OooO0o0.OooOOO(clipboardData);
    }
}
