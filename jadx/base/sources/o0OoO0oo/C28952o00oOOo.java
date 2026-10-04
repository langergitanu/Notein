package o0OoO0oo;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.aspose.words.StyleIdentifier;
import com.orion.editor.PDFView;
import com.orion.notein.domain.models.translate.TranslateResult;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import com.orion.penkit.models.QuoteInfo;
import java.util.Iterator;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;
import o0Oo00oO.C28038OooO0Oo;
import o0o00oO.C29961OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;

/* JADX INFO: renamed from: o0OoO0oo.o00oOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$fastTranslateQuote$1", m80623f = "NoteEditorFragment.kt", m80624l = {2226, 2232}, m80625m = "invokeSuspend")
public final class C28952o00oOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ QuoteInfo f102580OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102581OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102582OooOoO0;

    /* JADX INFO: renamed from: o0OoO0oo.o00oOOo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$fastTranslateQuote$1$1", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorFragment f102583OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ QuoteInfo f102584OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ TranslateResult f102585OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(QuoteInfo quoteInfo, NoteEditorFragment noteEditorFragment, TranslateResult translateResult, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f102584OooOo0o = quoteInfo;
            this.f102583OooOo = noteEditorFragment;
            this.f102585OooOoO0 = translateResult;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f102584OooOo0o, this.f102583OooOo, this.f102585OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            Object next;
            Object next2;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            QuoteInfo quoteInfo = this.f102584OooOo0o;
            Iterator<T> it = quoteInfo.getRectList().iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    float f = ((RectF) next).top;
                    do {
                        Object next3 = it.next();
                        float f2 = ((RectF) next3).top;
                        if (Float.compare(f, f2) > 0) {
                            next = next3;
                            f = f2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            RectF rectF = (RectF) next;
            if (rectF == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            float f3 = 2;
            PointF pointF = new PointF((rectF.width() / f3) + rectF.left, rectF.top);
            Iterator<T> it2 = quoteInfo.getRectList().iterator();
            if (it2.hasNext()) {
                next2 = it2.next();
                if (it2.hasNext()) {
                    float f4 = ((RectF) next2).bottom;
                    do {
                        Object next4 = it2.next();
                        float f5 = ((RectF) next4).bottom;
                        if (Float.compare(f4, f5) < 0) {
                            next2 = next4;
                            f4 = f5;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next2 = null;
            }
            RectF rectF2 = (RectF) next2;
            if (rectF2 == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            PointF pointF2 = new PointF((rectF2.width() / f3) + rectF2.left, rectF2.bottom);
            float f6 = pointF.y;
            int i = C29961OooO0oO.f106411OooOOO0;
            if (f6 < Oooo0.o000000O.OooO0o(60) + i) {
                pointF = pointF2;
            } else {
                pointF.offset(0.0f, -(Oooo0.o000000O.OooO0o0(60.0f) + i));
            }
            NoteEditorFragment noteEditorFragment = this.f102583OooOo;
            C29961OooO0oO c29961OooO0oO = noteEditorFragment.f73013Oooo0oo;
            if (c29961OooO0oO != null) {
                PDFView pDFView = noteEditorFragment.f73015OoooO0;
                if (pDFView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                TranslateResult translateResult = this.f102585OooOoO0;
                PopupWindow popupWindow = c29961OooO0oO.f106415OooO0OO;
                View contentView = popupWindow.getContentView();
                int width = popupWindow.getWidth();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(width), width == -2 ? 0 : 1073741824);
                int height = popupWindow.getHeight();
                contentView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(height), height == -2 ? 0 : 1073741824));
                c29961OooO0oO.f106420OooO0oo.scrollTo(0, 0);
                c29961OooO0oO.f106422OooOO0O = translateResult;
                popupWindow.getContentView().setAlpha(1.0f);
                Context context = c29961OooO0oO.f106413OooO00o;
                int iOooO0o = C28038OooO0Oo.OooO0O0(context) ? Oooo0.o000000O.OooO0o(StyleIdentifier.GRID_TABLE_3_ACCENT_5) : C29961OooO0oO.f106410OooOO0o;
                c29961OooO0oO.f106419OooO0oO.setVisibility((translateResult.getSrcTts() == null || translateResult.getSrcTts().length() == 0) ? 8 : 0);
                popupWindow.showAtLocation(pDFView, 0, (pDFView.getWidth() / 2) - (iOooO0o / 2), (int) pointF.y);
                String input = translateResult.getSrc();
                String dst = (translateResult.getDict() == null || translateResult.getDict().length() == 0) ? translateResult.getDst() : translateResult.getDict();
                Pattern patternCompile = Pattern.compile("[a-zA-Z]+");
                kotlin.jvm.internal.OooOOO0.OooO0o(patternCompile, "compile(...)");
                kotlin.jvm.internal.OooOOO0.OooO0oO(input, "input");
                boolean zMatches = patternCompile.matcher(input).matches();
                boolean z = C33599OooOo0O.OoooOO0(C33599OooOo0O.Oooooo0(input).toString(), new String[]{" "}).size() == 1;
                TextView textView = c29961OooO0oO.f106416OooO0Oo;
                if (zMatches && z) {
                    textView.setText(input);
                } else {
                    textView.setText(context.getString(R.string.translation_content));
                }
                c29961OooO0oO.f106418OooO0o0.setText(dst);
                c29961OooO0oO.OooO00o(3000L);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28952o00oOOo(NoteEditorFragment noteEditorFragment, QuoteInfo quoteInfo, Continuation continuation) {
        super(2, continuation);
        this.f102580OooOo = quoteInfo;
        this.f102582OooOoO0 = noteEditorFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28952o00oOOo(this.f102582OooOoO0, this.f102580OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28952o00oOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (oO0o0OO.C33609OooO0oo.OooO0o(r1, r5, r7) == r0) goto L19;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102581OooOo0o;
        NoteEditorFragment noteEditorFragment = this.f102582OooOoO0;
        QuoteInfo quoteInfo = this.f102580OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String string = C33599OooOo0O.Oooooo0(C33595OooOOo.OooOo0O(C33595OooOOo.OooOo0O(quoteInfo.getText(), "\r", ""), IOUtils.LINE_SEPARATOR_UNIX, "")).toString();
            C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
            this.f102581OooOo0o = 1;
            obj = c23344OooOOoOoooOO0.OooOo00(string, this);
            if (obj != enumC32485OooO00o) {
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
        TranslateResult translateResult = (TranslateResult) obj;
        if (translateResult.getErrorCode().length() > 0) {
            return C32460OooOooO.f116667OooO00o;
        }
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
        OooO00o oooO00o = new OooO00o(quoteInfo, noteEditorFragment, translateResult, null);
        this.f102581OooOo0o = 2;
    }
}
