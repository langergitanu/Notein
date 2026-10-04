package o0o00oo;

import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.aspose.words.EditingLanguage;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o00oo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$initActionBar$3$1", m80623f = "NoteListContainerFragment.kt", m80624l = {EditingLanguage.ALSATIAN}, m80625m = "invokeSuspend")
public final class C30109OooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteListContainerFragment f107194OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107195OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30109OooOOo(NoteListContainerFragment noteListContainerFragment, Continuation<? super C30109OooOOo> continuation) {
        super(2, continuation);
        this.f107194OooOo = noteListContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30109OooOOo(this.f107194OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30109OooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        String name;
        String name2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107195OooOo0o;
        NoteListContainerFragment noteListContainerFragment = this.f107194OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            NoteVO noteVO = (NoteVO) ((C32443OooOOO) noteListContainerFragment.OooOoo().f77161OoooO00.getValue()).f116638OooOo0o;
            NoteVO noteVO2 = (NoteVO) ((C32443OooOOO) noteListContainerFragment.OooOoo().f77161OoooO00.getValue()).f116637OooOo;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteListContainerFragment");
            if (noteVO == null || (name = noteVO.getName()) == null) {
                name = CloudMetaExtra.DEFINE_NON_PARENT_ID;
            }
            if (noteVO2 == null || (name2 = noteVO2.getName()) == null) {
                name2 = "Desktop";
            }
            c20358OooO00o.OooO00o(C22237OooO0o0.OooO00o("btnBackToParent: ", name, " to ", name2), new Object[0]);
            com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListContainerFragment.OooOoo();
            this.f107195OooOo0o = 1;
            if (oooO0OOOooOoo.OooOoO0(noteVO2, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo2 = noteListContainerFragment.OooOoo();
        Integer num = new Integer(0);
        C33781o00o0O c33781o00o0O = oooO0OOOooOoo2.f77149Oooo0;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, num);
        return C32460OooOooO.f116667OooO00o;
    }
}
