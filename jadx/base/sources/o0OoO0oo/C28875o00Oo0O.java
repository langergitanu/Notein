package o0OoO0oo;

import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.notein.p607ui.noteeditor.addimage.ImageEditorPanel;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO0oo.o00Oo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$insertEditorImages$2", m80623f = "NoteEditorFragment.kt", m80624l = {2820}, m80625m = "invokeSuspend")
public final class C28875o00Oo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102313OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102314OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<ImageEditorPanel.OooO0O0> f102315OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28875o00Oo0O(NoteEditorFragment noteEditorFragment, List list, Continuation continuation) {
        super(2, continuation);
        this.f102313OooOo = noteEditorFragment;
        this.f102315OooOoO0 = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28875o00Oo0O(this.f102313OooOo, this.f102315OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28875o00Oo0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102314OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ImageEditorPanel imageEditorPanel = this.f102313OooOo.f73023OoooOoo;
            if (imageEditorPanel == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
                throw null;
            }
            this.f102314OooOo0o = 1;
            if (imageEditorPanel.OooOO0O(this.f102315OooOoO0, true, this) == enumC32485OooO00o) {
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
