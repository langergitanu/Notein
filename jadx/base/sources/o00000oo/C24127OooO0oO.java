package o00000oo;

import Oooo0oO.o0OoOo0;
import androidx.compose.p002ui.window.PopupLayout;
import kotlin.coroutines.Continuation;
import o0ooOO0.C31603o0ooOO0;
import o0ooOO0.o00oO0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o00000oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5", m80623f = "AndroidPopup.android.kt", m80624l = {301}, m80625m = "invokeSuspend")
public final class C24127OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f81308OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f81309OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f81310OooOoO0;

    /* JADX INFO: renamed from: o00000oo.OooO0oO$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Long, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f81311OooOo0o = new OooO00o(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final /* bridge */ /* synthetic */ C32460OooOooO invoke(Long l) {
            l.longValue();
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24127OooO0oO(PopupLayout popupLayout, Continuation<? super C24127OooO0oO> continuation) {
        super(2, continuation);
        this.f81310OooOoO0 = popupLayout;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C24127OooO0oO c24127OooO0oO = new C24127OooO0oO(this.f81310OooOoO0, continuation);
        c24127OooO0oO.f81308OooOo = obj;
        return c24127OooO0oO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C24127OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r3.ooOO() == r0) goto L16;
     */
    /* JADX WARN: Path cross not found for [B:19:0x0067, B:21:0x006b], limit reached: 25 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33636Oooo00o interfaceC33636Oooo00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f81309OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f81308OooOo;
            if (C33633Oooo0.OooO0o(interfaceC33636Oooo00o)) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f81308OooOo;
            C32446OooOOOo.OooO0O0(obj);
            PopupLayout popupLayout = this.f81310OooOoO0;
            int[] iArr = popupLayout.f63577OoooOO0;
            int i2 = iArr[0];
            int i3 = iArr[1];
            popupLayout.f63566Oooo00o.getLocationOnScreen(iArr);
            if (i2 == iArr[0] || i3 != iArr[1]) {
                popupLayout.OooOO0O();
            }
            if (C33633Oooo0.OooO0o(interfaceC33636Oooo00o)) {
                OooO00o oooO00o = OooO00o.f81311OooOo0o;
                this.f81308OooOo = interfaceC33636Oooo00o;
                this.f81309OooOo0o = 1;
                o00oO0O o00oo0o = (o00oO0O) getContext().get(o00oO0O.OooO00o.f112904OooOo0o);
                if (o00oo0o != null) {
                    new C31603o0ooOO0(oooO00o, null);
                } else if (o0OoOo0.OooO00o(getContext()).o00000oO(oooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                PopupLayout popupLayout2 = this.f81310OooOoO0;
                int[] iArr2 = popupLayout2.f63577OoooOO0;
                int i22 = iArr2[0];
                int i32 = iArr2[1];
                popupLayout2.f63566Oooo00o.getLocationOnScreen(iArr2);
                if (i22 == iArr2[0]) {
                }
                popupLayout2.OooOO0O();
                if (C33633Oooo0.OooO0o(interfaceC33636Oooo00o)) {
                    return C32460OooOooO.f116667OooO00o;
                }
            }
        }
    }
}
