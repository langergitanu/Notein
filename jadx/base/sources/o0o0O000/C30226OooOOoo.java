package o0o0O000;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.p607ui.notelist.folder.MoveToFolderFragment;
import com.orion.notein.p607ui.p609vo.FolderVO;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0O000.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.folder.MoveToFolderFragment$observeSelectedFolder$1", m80623f = "MoveToFolderFragment.kt", m80624l = {StyleIdentifier.MEDIUM_LIST_2_ACCENT_6}, m80625m = "invokeSuspend")
public final class C30226OooOOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ MoveToFolderFragment f107677OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107678OooOo0o;

    /* JADX INFO: renamed from: o0o0O000.OooOOoo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.folder.MoveToFolderFragment$observeSelectedFolder$1$1", m80623f = "MoveToFolderFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<FolderVO, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ MoveToFolderFragment f107679OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f107680OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MoveToFolderFragment moveToFolderFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f107679OooOo = moveToFolderFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f107679OooOo, continuation);
            oooO00o.f107680OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(FolderVO folderVO, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(folderVO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            String id = ((FolderVO) this.f107680OooOo0o).getId();
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(id, "desktop")) {
                id = null;
            }
            ((C30220OooO0oO) this.f107679OooOo.f77658OooOoo.getValue()).f107645OooO0o.setValue(id);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30226OooOOoo(MoveToFolderFragment moveToFolderFragment, Continuation<? super C30226OooOOoo> continuation) {
        super(2, continuation);
        this.f107677OooOo = moveToFolderFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30226OooOOoo(this.f107677OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30226OooOOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107678OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            MoveToFolderFragment moveToFolderFragment = this.f107677OooOo;
            OooO oooOOooOooo = moveToFolderFragment.OooOooo();
            OooO00o oooO00o = new OooO00o(moveToFolderFragment, null);
            this.f107678OooOo0o = 1;
            if (C25252OooO0Oo.OooO0oO(oooOOooOooo.f107610OooO, oooO00o, this) == enumC32485OooO00o) {
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
