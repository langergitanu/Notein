package o0OoO0oo;

import android.net.Uri;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.notein.p607ui.noteeditor.addimage.ImageEditorPanel;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0oOoOo.C31079OoooOoO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OoO0oo.o00Oo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$insertEditorStickers$1", m80623f = "NoteEditorFragment.kt", m80624l = {2793}, m80625m = "invokeSuspend")
public final class C28878o00Oo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102324OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102325OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<C31079OoooOoO> f102326OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28878o00Oo0o(NoteEditorFragment noteEditorFragment, List<C31079OoooOoO> list, Continuation<? super C28878o00Oo0o> continuation) {
        super(2, continuation);
        this.f102324OooOo = noteEditorFragment;
        this.f102326OooOoO0 = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28878o00Oo0o(this.f102324OooOo, this.f102326OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28878o00Oo0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102325OooOo0o;
        NoteEditorFragment noteEditorFragment = this.f102324OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ImageEditorPanel imageEditorPanel = noteEditorFragment.f73023OoooOoo;
            if (imageEditorPanel == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
                throw null;
            }
            List<C31079OoooOoO> list = this.f102326OooOoO0;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            for (C31079OoooOoO c31079OoooOoO : list) {
                arrayList.add(new C32443OooOOO(Uri.fromFile(new File(c31079OoooOoO.f110919OooO0OO)), new Float(c31079OoooOoO.f110924OooO0oo)));
            }
            this.f102325OooOo0o = 1;
            if (imageEditorPanel.OooO0oo(arrayList, false) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        ImageEditorPanel imageEditorPanel2 = noteEditorFragment.f73023OoooOoo;
        if (imageEditorPanel2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
            throw null;
        }
        imageEditorPanel2.setStyle(1);
        ImageEditorPanel imageEditorPanel3 = noteEditorFragment.f73023OoooOoo;
        if (imageEditorPanel3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
            throw null;
        }
        imageEditorPanel3.setVisibility(0);
        noteEditorFragment.OoooOO0().f73573Oooo0.setValue(null);
        ImageEditorPanel imageEditorPanel4 = noteEditorFragment.f73023OoooOoo;
        if (imageEditorPanel4 != null) {
            imageEditorPanel4.OooOO0o(0.0f, 0.0f);
            return C32460OooOooO.f116667OooO00o;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
        throw null;
    }
}
