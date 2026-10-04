package o0o0O00O;

import android.widget.PopupWindow;
import com.orion.notein.p607ui.notelist.label.LabelListFragment;
import kotlin.coroutines.Continuation;
import o0OOoooO.C27996OooO00o;
import o0o00oOo.C30030OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0O00O.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelListFragment$initNoteMorePopupWindow$1$1", m80623f = "LabelListFragment.kt", m80624l = {175, 177, 182}, m80625m = "invokeSuspend")
public final class C30245OooOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f107766OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107767OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ LabelListFragment f107768OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30246OooOo0O f107769OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30245OooOo0(int i, C30246OooOo0O c30246OooOo0O, LabelListFragment labelListFragment, Continuation continuation) {
        super(2, continuation);
        this.f107766OooOo = i;
        this.f107769OooOoO0 = c30246OooOo0O;
        this.f107768OooOoO = labelListFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30245OooOo0(this.f107766OooOo, this.f107769OooOoO0, this.f107768OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30245OooOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r2.invoke(r7) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:
    
        if (r2.invoke(r7) == r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107767OooOo0o;
        C30246OooOo0O c30246OooOo0O = this.f107769OooOoO0;
        LabelListFragment labelListFragment = this.f107768OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (this.f107766OooOo == C27996OooO00o.f99274OooO00o) {
                this.f107767OooOo0o = 1;
            } else {
                this.f107767OooOo0o = 2;
                obj = LabelListFragment.OooOoO(labelListFragment, 24, this);
                if (obj != enumC32485OooO00o) {
                    if (((Boolean) obj).booleanValue()) {
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i == 2) {
                C32446OooOOOo.OooO0O0(obj);
                if (((Boolean) obj).booleanValue()) {
                    this.f107767OooOo0o = 3;
                } else {
                    C30030OooO0O0 c30030OooO0O0 = labelListFragment.f77768Oooo0o0;
                    if (c30030OooO0O0 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("folderColorPopupWindow");
                        throw null;
                    }
                    PopupWindow popupWindow = c30030OooO0O0.f106748OooO0OO;
                    if (popupWindow != null) {
                        popupWindow.dismiss();
                    }
                    o0o0O0.OooO oooO = labelListFragment.f77765Oooo0O0;
                    if (oooO == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("noteItemMoreMenu");
                        throw null;
                    }
                    oooO.OooO00o();
                }
                return C32460OooOooO.f116667OooO00o;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        C32446OooOOOo.OooO0O0(obj);
        return C32460OooOooO.f116667OooO00o;
    }
}
