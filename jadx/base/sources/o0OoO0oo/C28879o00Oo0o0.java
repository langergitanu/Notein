package o0OoO0oo;

import android.net.Uri;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.notein.p607ui.noteeditor.addimage.ImageEditorPanel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OoO0oo.o00Oo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$insertEditorImagesToPos$1", m80623f = "NoteEditorFragment.kt", m80624l = {2784}, m80625m = "invokeSuspend")
public final class C28879o00Oo0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102327OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102328OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ float f102329OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<Uri> f102330OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ float f102331OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C28879o00Oo0o0(NoteEditorFragment noteEditorFragment, List<? extends Uri> list, float f, float f2, Continuation<? super C28879o00Oo0o0> continuation) {
        super(2, continuation);
        this.f102327OooOo = noteEditorFragment;
        this.f102330OooOoO0 = list;
        this.f102329OooOoO = f;
        this.f102331OooOoOO = f2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28879o00Oo0o0(this.f102327OooOo, this.f102330OooOoO0, this.f102329OooOoO, this.f102331OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28879o00Oo0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102328OooOo0o;
        NoteEditorFragment noteEditorFragment = this.f102327OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ImageEditorPanel imageEditorPanel = noteEditorFragment.f73023OoooOoo;
            if (imageEditorPanel == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
                throw null;
            }
            List<Uri> list = this.f102330OooOoO0;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C32443OooOOO((Uri) it.next(), new Float(1.0f)));
            }
            this.f102328OooOo0o = 1;
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
        imageEditorPanel2.setVisibility(0);
        noteEditorFragment.OoooOO0().f73573Oooo0.setValue(null);
        ImageEditorPanel imageEditorPanel3 = noteEditorFragment.f73023OoooOoo;
        if (imageEditorPanel3 != null) {
            imageEditorPanel3.OooOO0o(this.f102329OooOoO, this.f102331OooOoOO);
            return C32460OooOooO.f116667OooO00o;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
        throw null;
    }
}
