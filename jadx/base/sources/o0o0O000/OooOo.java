package o0o0O000;

import com.orion.notein.p607ui.notelist.folder.MoveToFolderFragment;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0oOoOo.C31040OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.folder.MoveToFolderFragment$setupCreateFolderSection$2", m80623f = "MoveToFolderFragment.kt", m80624l = {185}, m80625m = "invokeSuspend")
public final class OooOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ MoveToFolderFragment f107681OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107682OooOo0o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.folder.MoveToFolderFragment$setupCreateFolderSection$2$1", m80623f = "MoveToFolderFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C31040OooOO0o>, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ MoveToFolderFragment f107683OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f107684OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MoveToFolderFragment moveToFolderFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f107683OooOo = moveToFolderFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f107683OooOo, continuation);
            oooO00o.f107684OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(List<? extends C31040OooOO0o> list, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            List list = (List) this.f107684OooOo0o;
            OooO0OO oooO0OO = this.f107683OooOo.f77674OoooO0;
            if (oooO0OO != null) {
                oooO0OO.OooO0Oo(list);
                return C32460OooOooO.f116667OooO00o;
            }
            kotlin.jvm.internal.OooOOO0.OooOOOO("folderColorAdapter");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(MoveToFolderFragment moveToFolderFragment, Continuation<? super OooOo> continuation) {
        super(2, continuation);
        this.f107681OooOo = moveToFolderFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOo(this.f107681OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107682OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            MoveToFolderFragment moveToFolderFragment = this.f107681OooOo;
            C30220OooO0oO c30220OooO0oO = (C30220OooO0oO) moveToFolderFragment.f77658OooOoo.getValue();
            OooO00o oooO00o = new OooO00o(moveToFolderFragment, null);
            this.f107682OooOo0o = 1;
            if (C25252OooO0Oo.OooO0oO(c30220OooO0oO.f107648OooO0oo, oooO00o, this) == enumC32485OooO00o) {
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
