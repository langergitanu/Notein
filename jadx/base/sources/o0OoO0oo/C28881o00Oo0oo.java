package o0OoO0oo;

import com.orion.editor.PDFView;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.notein.p607ui.noteeditor.addtext.TextEditorPanel;
import com.orion.penkit.models.TextBoxInfo;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;
import kotlin.coroutines.Continuation;
import o0O0o00.EnumC25982o0000oO;
import o0O0oooo.C26395Oooo0o0;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OoO0oo.o00Oo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$onTextBoxSelected$1", m80623f = "NoteEditorFragment.kt", m80624l = {2304}, m80625m = "invokeSuspend")
public final class C28881o00Oo0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102333OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102334OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ TextBoxInfo f102335OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28881o00Oo0oo(NoteEditorFragment noteEditorFragment, TextBoxInfo textBoxInfo, Continuation<? super C28881o00Oo0oo> continuation) {
        super(2, continuation);
        this.f102333OooOo = noteEditorFragment;
        this.f102335OooOoO0 = textBoxInfo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28881o00Oo0oo(this.f102333OooOo, this.f102335OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28881o00Oo0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        TextBoxInfo textBoxInfo;
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102334OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f102334OooOo0o = 1;
            if (C33644OoooO0.OooO00o(300L, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        NoteEditorFragment noteEditorFragment = this.f102333OooOo;
        final PDFView pDFView = noteEditorFragment.f73015OoooO0;
        if (pDFView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        Iterator it = pDFView.OooOOo(true, new Function() { // from class: o0O0o00.o0OO00O
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                List<TextBoxInfo> orDefault;
                Integer num = (Integer) obj2;
                C26395Oooo0o0 c26395Oooo0o0 = pDFView.f69170OooOooO.f69109OooO0O0;
                c26395Oooo0o0.getClass();
                int iIntValue = num.intValue();
                synchronized (c26395Oooo0o0.f90559OooO0oo) {
                    orDefault = c26395Oooo0o0.f90567OooOOo.getOrDefault(num, C34434OooOoO.f123453OooOo0o);
                }
                Page page = c26395Oooo0o0.f90560OooOO0.get(iIntValue);
                o0oo000O.OooOO0.f111232OooO00o.getClass();
                return o0oo000O.OooOO0.OooO(page, orDefault);
            }
        }).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            textBoxInfo = this.f102335OooOoO0;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((InterfaceC31284OooO0O0) next).getId(), textBoxInfo.getId())) {
                break;
            }
        }
        InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) next;
        EnumC25982o0000oO enumC25982o0000oO = EnumC25982o0000oO.f88734OooOo;
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        if (interfaceC31284OooO0O0 != null) {
            PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
            if (pDFView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView2.o0ooOO0(com.facebook.soloader.OooOo.OooO0oO(interfaceC31284OooO0O0), c34434OooOoO, enumC25982o0000oO, UUID.randomUUID().toString(), true);
            TextBoxInfo textBoxInfo2 = (TextBoxInfo) interfaceC31284OooO0O0;
            TextEditorPanel textEditorPanel = noteEditorFragment.f73022OoooOoO;
            if (textEditorPanel == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
                throw null;
            }
            textEditorPanel.OooOO0(textBoxInfo2.getBounds().left, textBoxInfo2.getBounds().top, textBoxInfo2);
            PDFView pDFView3 = noteEditorFragment.f73015OoooO0;
            if (pDFView3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView3.o00Ooo(textBoxInfo2);
        } else {
            PDFView pDFView4 = noteEditorFragment.f73015OoooO0;
            if (pDFView4 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView4.o0ooOO0(com.facebook.soloader.OooOo.OooO0oO(textBoxInfo), c34434OooOoO, enumC25982o0000oO, UUID.randomUUID().toString(), true);
            TextEditorPanel textEditorPanel2 = noteEditorFragment.f73022OoooOoO;
            if (textEditorPanel2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
                throw null;
            }
            textEditorPanel2.OooOO0(textBoxInfo.getBounds().left, textBoxInfo.getBounds().top, textBoxInfo);
            PDFView pDFView5 = noteEditorFragment.f73015OoooO0;
            if (pDFView5 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView5.o00Ooo(textBoxInfo);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
