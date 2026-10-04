package o0OoO0oo;

import com.aspose.words.EditingLanguage;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.TextStyleBox;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO0oo.o00000Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$initTextBoxStyleBar$2", m80623f = "NoteEditorContainerFragment.kt", m80624l = {EditingLanguage.CORSICAN}, m80625m = "invokeSuspend")
public final class C28754o00000Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorContainerFragment f101840OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101841OooOo0o;

    /* JADX INFO: renamed from: o0OoO0oo.o00000Oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$initTextBoxStyleBar$2$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorContainerFragment f101842OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ boolean f101843OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f101842OooOo = noteEditorContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f101842OooOo, continuation);
            oooO00o.f101843OooOo0o = ((Boolean) obj).booleanValue();
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            boolean z = this.f101843OooOo0o;
            TextStyleBox textStyleBox = this.f101842OooOo.f72839OoooooO;
            if (textStyleBox != null) {
                textStyleBox.setVisibility(z ? 0 : 8);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28754o00000Oo(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super C28754o00000Oo> continuation) {
        super(2, continuation);
        this.f101840OooOo = noteEditorContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28754o00000Oo(this.f101840OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28754o00000Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101841OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            NoteEditorContainerFragment noteEditorContainerFragment = this.f101840OooOo;
            com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = noteEditorContainerFragment.Oooo00O();
            OooO00o oooO00o = new OooO00o(noteEditorContainerFragment, null);
            this.f101841OooOo0o = 1;
            if (C25252OooO0Oo.OooO0oO(oooO0OOOooo00O.f73435oo000o, oooO00o, this) == enumC32485OooO00o) {
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
