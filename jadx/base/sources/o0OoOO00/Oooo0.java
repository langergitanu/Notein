package o0OoOO00;

import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.papertheme.ColorPaperTheme;
import com.orion.notein.domain.models.papertheme.LambdaPaperTheme;
import com.orion.notein.domain.models.papertheme.PaperColors;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfSetPaperTheme;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
public final class Oooo0 implements InterfaceC33721OooO0o<Integer> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f102802OooOo0o;

    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f102803OooOo0o;

        /* JADX INFO: renamed from: o0OoOO00.Oooo0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.AddPageViewModel$special$$inlined$map$2$2", m80623f = "AddPageViewModel.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19949OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f102804OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f102805OooOo0o;

            public C19949OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f102805OooOo0o = obj;
                this.f102804OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f102803OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19949OooO00o c19949OooO00o;
            if (continuation instanceof C19949OooO00o) {
                c19949OooO00o = (C19949OooO00o) continuation;
                int i = c19949OooO00o.f102804OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19949OooO00o.f102804OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19949OooO00o = new C19949OooO00o(continuation);
                }
            }
            Object obj2 = c19949OooO00o.f102805OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19949OooO00o.f102804OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                Page page = (Page) obj;
                PaperTheme paperTheme = page.getPaperTheme();
                Integer num = null;
                if (paperTheme instanceof LambdaPaperTheme) {
                    PaperTheme paperTheme2 = page.getPaperTheme();
                    PaperTheme baseTheme = paperTheme2 != null ? paperTheme2.getBaseTheme() : null;
                    ColorPaperTheme colorPaperTheme = baseTheme instanceof ColorPaperTheme ? (ColorPaperTheme) baseTheme : null;
                    if (colorPaperTheme != null) {
                        num = new Integer(colorPaperTheme.getColor());
                    }
                } else if (paperTheme instanceof PdfSetPaperTheme) {
                    PaperTheme paperTheme3 = page.getPaperTheme();
                    kotlin.jvm.internal.OooOOO0.OooO0o0(paperTheme3, "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfSetPaperTheme");
                    num = new Integer(((PdfSetPaperTheme) paperTheme3).getColor());
                }
                Integer num2 = new Integer(num != null ? num.intValue() : PaperColors.INSTANCE.getCOLOR_01());
                c19949OooO00o.f102804OooOo = 1;
                if (this.f102803OooOo0o.emit(num2, c19949OooO00o) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj2);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public Oooo0(InterfaceC33721OooO0o interfaceC33721OooO0o) {
        this.f102802OooOo0o = interfaceC33721OooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Integer> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f102802OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
