package o0OoOoo0;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.p607ui.noteeditor.editortab.LatestOpenedNoteTabFragment;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0oOoOoo.C31103OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoOoo0.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.editortab.LatestOpenedNoteTabFragment$getNoteMorePopupWindow$1$1$1$1", m80623f = "LatestOpenedNoteTabFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_2_ACCENT_5}, m80625m = "invokeSuspend")
public final class C29237OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f103668OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f103669OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C31103OooO0O0 f103670OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ LatestOpenedNoteTabFragment f103671OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29237OooOOO(LatestOpenedNoteTabFragment latestOpenedNoteTabFragment, C31103OooO0O0 c31103OooO0O0, Continuation<? super C29237OooOOO> continuation) {
        super(2, continuation);
        this.f103671OooOoO0 = latestOpenedNoteTabFragment;
        this.f103670OooOoO = c31103OooO0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29237OooOOO(this.f103671OooOoO0, this.f103670OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29237OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        int i;
        C29229OooO0Oo c29229OooO0Oo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f103668OooOo;
        LatestOpenedNoteTabFragment latestOpenedNoteTabFragment = this.f103671OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            int size = ((List) latestOpenedNoteTabFragment.OooOoo0().f103732OooO.f121747OooOo0o.getValue()).size();
            C31103OooO0O0 c31103OooO0O0 = this.f103670OooOoO;
            this.f103669OooOo0o = size;
            this.f103668OooOo = 1;
            if (LatestOpenedNoteTabFragment.OooOoO(latestOpenedNoteTabFragment, c31103OooO0O0.f110999OooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            i = size;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.f103669OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        if (i <= 2 && (c29229OooO0Oo = latestOpenedNoteTabFragment.f74474Oooo00O) != null) {
            c29229OooO0Oo.f103648OooO0O0.dismiss();
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
