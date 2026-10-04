package o0o0O00;

import Oooo0.o000000O;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import com.orion.notein.p607ui.p609vo.NoteVO;
import kotlin.coroutines.Continuation;
import o0Oo00oO.C28038OooO0Oo;
import o0o00oOo.C30037OooOO0;
import o0o00oOo.C30065OoooO0O;
import o0oOoOo.C31051OooOo0O;
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

/* JADX INFO: renamed from: o0o0O00.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.initializer.DefaultNoteMoreActionListener$onNoteInfo$1", m80623f = "DefaultNoteMoreActionListener.kt", m80624l = {246}, m80625m = "invokeSuspend")
public final class C30209OooOo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30201OooOOO0 f107591OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107592OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ NoteVO f107593OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30209OooOo00(NoteVO noteVO, Continuation continuation, C30201OooOOO0 c30201OooOOO0) {
        super(2, continuation);
        this.f107591OooOo = c30201OooOOO0;
        this.f107593OooOoO0 = noteVO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30209OooOo00(this.f107593OooOoO0, continuation, this.f107591OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30209OooOo00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        View view;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107592OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.notelist.OooO0OO oooO0OO = this.f107591OooOo.f107549OooO0OO;
            NoteVO noteVO = this.f107593OooOoO0;
            this.f107592OooOo0o = 1;
            oooO0OO.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30065OoooO0O(oooO0OO, noteVO, null), this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        C31051OooOo0O info = (C31051OooOo0O) obj;
        C30201OooOOO0 c30201OooOOO0 = this.f107591OooOo;
        o0o0O0.OooO oooO = c30201OooOOO0.f107552OooO0o0;
        if (oooO != null && (view = oooO.f107437OooO0Oo) != null) {
            C30037OooOO0 c30037OooOO0 = (C30037OooOO0) c30201OooOOO0.f107551OooO0o.getValue();
            synchronized (c30037OooOO0) {
                try {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(info, "info");
                    if (c30037OooOO0.f106796OooO.compareAndSet(false, true)) {
                        c30037OooOO0.OooO0O0();
                    }
                    Rect rect = new Rect();
                    view.getGlobalVisibleRect(rect);
                    int iIntValue = C28038OooO0Oo.OooO00o(c30037OooOO0.f106797OooO00o).f116638OooOo0o.intValue();
                    int i2 = rect.left;
                    int iIntValue2 = i2 > iIntValue / 2 ? (i2 - ((Number) c30037OooOO0.f106804OooO0oo.getValue()).intValue()) - o000000O.OooO0o(110) : (rect.right + (((Number) c30037OooOO0.f106804OooO0oo.getValue()).intValue() / 2)) - o000000O.OooO0o(20);
                    int iOooO0o = rect.bottom + o000000O.OooO0o(135);
                    PopupWindow popupWindow = c30037OooOO0.f106798OooO0O0;
                    if (popupWindow == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("popupWindow");
                        throw null;
                    }
                    popupWindow.showAtLocation(view, 0, iIntValue2, iOooO0o);
                    c30037OooOO0.OooO00o(info);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
