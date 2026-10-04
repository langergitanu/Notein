package o0o0O000;

import com.orion.notein.p607ui.notelist.folder.MoveToFolderFragment;
import com.orion.notein.p607ui.p609vo.FolderVO;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0O000.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.folder.MoveToFolderFragment$observeFolders$1", m80623f = "MoveToFolderFragment.kt", m80624l = {244}, m80625m = "invokeSuspend")
public final class C30224OooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ MoveToFolderFragment f107672OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107673OooOo0o;

    /* JADX INFO: renamed from: o0o0O000.OooOOo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.folder.MoveToFolderFragment$observeFolders$1$1", m80623f = "MoveToFolderFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends FolderVO>, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ MoveToFolderFragment f107674OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f107675OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MoveToFolderFragment moveToFolderFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f107674OooOo = moveToFolderFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f107674OooOo, continuation);
            oooO00o.f107675OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(List<? extends FolderVO> list, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            List list = (List) this.f107675OooOo0o;
            MoveToFolderFragment moveToFolderFragment = this.f107674OooOo;
            C30216OooO00o c30216OooO00o = moveToFolderFragment.f77663Oooo0;
            if (c30216OooO00o != null) {
                c30216OooO00o.OooO0o0(list, new com.google.android.material.textfield.OooOOOO(moveToFolderFragment, 1));
                return C32460OooOooO.f116667OooO00o;
            }
            kotlin.jvm.internal.OooOOO0.OooOOOO("folderAdapter");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30224OooOOo(MoveToFolderFragment moveToFolderFragment, Continuation<? super C30224OooOOo> continuation) {
        super(2, continuation);
        this.f107672OooOo = moveToFolderFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30224OooOOo(this.f107672OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30224OooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107673OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            MoveToFolderFragment moveToFolderFragment = this.f107672OooOo;
            OooO oooOOooOooo = moveToFolderFragment.OooOooo();
            OooO00o oooO00o = new OooO00o(moveToFolderFragment, null);
            this.f107673OooOo0o = 1;
            if (C25252OooO0Oo.OooO0oO(oooOOooOooo.f107618OooOO0o, oooO00o, this) == enumC32485OooO00o) {
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
