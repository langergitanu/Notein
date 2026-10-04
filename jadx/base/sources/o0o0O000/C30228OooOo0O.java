package o0o0O000;

import android.content.Context;
import androidx.core.os.BundleKt;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.folder.ItemDataOfMovingToFolder;
import com.orion.notein.p607ui.notelist.folder.MoveToFolderFragment;
import com.orion.notein.p607ui.p609vo.FolderVO;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24030OooOoo;
import o00o00.C25206OooO0Oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0o0O000.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.folder.MoveToFolderFragment$setupButtons$2$1", m80623f = "MoveToFolderFragment.kt", m80624l = {122}, m80625m = "invokeSuspend")
public final class C30228OooOo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ItemDataOfMovingToFolder[] f107694OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C24030OooOoo f107695OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public FolderVO f107696OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public MoveToFolderFragment f107697OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f107698OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f107699OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f107700OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ MoveToFolderFragment f107701OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ FolderVO f107702OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30228OooOo0O(MoveToFolderFragment moveToFolderFragment, FolderVO folderVO, Continuation<? super C30228OooOo0O> continuation) {
        super(2, continuation);
        this.f107701OooOooO = moveToFolderFragment;
        this.f107702OooOooo = folderVO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30228OooOo0O(this.f107701OooOooO, this.f107702OooOooo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30228OooOo0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0060 -> B:14:0x0063). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FolderVO folderVO;
        C24030OooOoo c24030OooOoo;
        ItemDataOfMovingToFolder[] itemDataOfMovingToFolderArr;
        int i;
        int i2;
        MoveToFolderFragment moveToFolderFragment;
        Context context;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = this.f107699OooOoo;
        MoveToFolderFragment moveToFolderFragment2 = this.f107701OooOooO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C24030OooOoo c24030OooOoo2 = new C24030OooOoo();
            ItemDataOfMovingToFolder[] itemDataOfMovingToFolderArr2 = (ItemDataOfMovingToFolder[]) moveToFolderFragment2.f77660OooOooO.getValue();
            int length = itemDataOfMovingToFolderArr2.length;
            folderVO = this.f107702OooOooo;
            c24030OooOoo = c24030OooOoo2;
            itemDataOfMovingToFolderArr = itemDataOfMovingToFolderArr2;
            i = length;
            i2 = 0;
            moveToFolderFragment = moveToFolderFragment2;
            if (i2 < i) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.f107700OooOoo0;
            i2 = this.f107698OooOoOO;
            folderVO = this.f107696OooOoO;
            moveToFolderFragment = this.f107697OooOoO0;
            itemDataOfMovingToFolderArr = this.f107694OooOo;
            c24030OooOoo = this.f107695OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c24030OooOoo.f80938OooOo0o = (!((Boolean) obj).booleanValue()) | c24030OooOoo.f80938OooOo0o;
            i2++;
            if (i2 < i) {
                ItemDataOfMovingToFolder itemDataOfMovingToFolder = itemDataOfMovingToFolderArr[i2];
                OooO oooOOooOooo = moveToFolderFragment.OooOooo();
                this.f107695OooOo0o = c24030OooOoo;
                this.f107694OooOo = itemDataOfMovingToFolderArr;
                this.f107697OooOoO0 = moveToFolderFragment;
                this.f107696OooOoO = folderVO;
                this.f107698OooOoOO = i2;
                this.f107700OooOoo0 = i;
                this.f107699OooOoo = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new OooOO0(itemDataOfMovingToFolder, folderVO, oooOOooOooo, null), this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c24030OooOoo.f80938OooOo0o = (!((Boolean) obj).booleanValue()) | c24030OooOoo.f80938OooOo0o;
                i2++;
                if (i2 < i) {
                    if (c24030OooOoo.f80938OooOo0o && (context = moveToFolderFragment2.getContext()) != null) {
                        String string = moveToFolderFragment2.getString(R.string.move_fail);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                        C25206OooO0Oo.OooO0oO(context, string);
                    }
                    moveToFolderFragment2.requireActivity().getSupportFragmentManager().OooooOo(BundleKt.bundleOf(new C32443OooOOO("result", Boolean.TRUE)), "move_notes_and_folders");
                    androidx.lifecycle.OooOOOO parentFragment = moveToFolderFragment2.getParentFragment();
                    InterfaceC30233OooOoo0 interfaceC30233OooOoo0 = parentFragment instanceof InterfaceC30233OooOoo0 ? (InterfaceC30233OooOoo0) parentFragment : null;
                    if (interfaceC30233OooOoo0 != null) {
                        interfaceC30233OooOoo0.OooO0oO();
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }
        }
    }
}
