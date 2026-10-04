package o0o0O0oO;

import com.orion.notein.p607ui.notelist.trashbin.TrashBinListFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0O0oO.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinListFragment$initNoteMorePopupWindow$1$2", m80623f = "TrashBinListFragment.kt", m80624l = {100, 103, 106}, m80625m = "invokeSuspend")
public final class C30325OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteVO f108108OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108109OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ TrashBinListFragment f108110OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30325OooOOOO(TrashBinListFragment trashBinListFragment, NoteVO noteVO, Continuation continuation) {
        super(2, continuation);
        this.f108108OooOo = noteVO;
        this.f108110OooOoO0 = trashBinListFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30325OooOOOO(this.f108110OooOoO0, this.f108108OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30325OooOOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1.OooOO0o(r3, r7, r6) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r1.OooOO0(r7, r6) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (r1.OooOO0O(r7, r6) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        return r0;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108109OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            NoteVO noteVO = this.f108108OooOo;
            int type = noteVO.getType();
            TrashBinListFragment trashBinListFragment = this.f108110OooOoO0;
            if (type == 0) {
                C30351Oooo0oO c30351Oooo0oOOooOoOO = trashBinListFragment.OooOoOO();
                String id = noteVO.getId();
                this.f108109OooOo0o = 1;
            } else if (type == 1) {
                C30351Oooo0oO c30351Oooo0oOOooOoOO2 = trashBinListFragment.OooOoOO();
                String id2 = noteVO.getId();
                this.f108109OooOo0o = 2;
            } else if (type == 2) {
                C30351Oooo0oO c30351Oooo0oOOooOoOO3 = trashBinListFragment.OooOoOO();
                String id3 = noteVO.getId();
                String pageNoteId = noteVO.getPageNoteId();
                if (pageNoteId == null) {
                    pageNoteId = "";
                }
                this.f108109OooOo0o = 3;
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
