package o0o000;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import com.google.gson.Gson;
import com.orion.notein.p607ui.noteeditor.screenshot.ScreenshotPanel;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0000o0O.OooOO0;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24334OooO0O0;
import o0OOOoo.C27205OooO0OO;
import o0Oo0O00.C28051OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o000.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.screenshot.ScreenshotPanel$onDoneButtonClicked$1", m80623f = "ScreenshotPanel.kt", m80624l = {143}, m80625m = "invokeSuspend")
public final class C29725OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ScreenshotPanel f105402OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105403OooOo0o;

    /* JADX INFO: renamed from: o0o000.OooO0oO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.screenshot.ScreenshotPanel$onDoneButtonClicked$1$1", m80623f = "ScreenshotPanel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ ScreenshotPanel f105404OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f105405OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ScreenshotPanel screenshotPanel, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f105404OooOo = screenshotPanel;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f105404OooOo, continuation);
            oooO00o.f105405OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f105405OooOo0o;
            ScreenshotPanel screenshotPanel = this.f105404OooOo;
            View view = screenshotPanel.f76249OooOo;
            if (view == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            float x = view.getX();
            View view2 = screenshotPanel.f76249OooOo;
            if (view2 == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            float y = view2.getY();
            View view3 = screenshotPanel.f76249OooOo;
            if (view3 == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            float x2 = view3.getX();
            if (screenshotPanel.f76249OooOo == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            float width = x2 + r7.getWidth();
            View view4 = screenshotPanel.f76249OooOo;
            if (view4 == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            float y2 = view4.getY();
            if (screenshotPanel.f76249OooOo == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            String json = new Gson().toJson(new RectF(x, y, width, y2 + r1.getHeight()));
            AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = C27205OooO0OO.f95002OooO00o;
            c24334OooO0O0.OooO0oO(C27205OooO0OO.f95001OooO, json);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29725OooO0oO(ScreenshotPanel screenshotPanel, Continuation<? super C29725OooO0oO> continuation) {
        super(2, continuation);
        this.f105402OooOo = screenshotPanel;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29725OooO0oO(this.f105402OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29725OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105403OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ScreenshotPanel screenshotPanel = this.f105402OooOo;
            Context context = screenshotPanel.getContext();
            OooOOO0.OooO0o(context, "getContext(...)");
            OooOO0<AbstractC24338OooO0o0> oooOO0OooO00o = C28051OooO00o.OooO00o(context);
            OooO00o oooO00o = new OooO00o(screenshotPanel, null);
            this.f105403OooOo0o = 1;
            if (C24332OooO.OooO00o(oooOO0OooO00o, oooO00o, this) == enumC32485OooO00o) {
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
