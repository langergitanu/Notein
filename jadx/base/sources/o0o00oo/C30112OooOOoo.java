package o0o00oo;

import androidx.fragment.app.ActivityC21897OooOo0;
import com.orion.notein.MainActivity;
import com.orion.notein.p607ui.export.ExportBottomSheetFragment;
import com.orion.notein.p607ui.export.ExportRequest;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0OOooo.C33163OooO0oO;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o00oo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$initActionBar$7$2$1", m80623f = "NoteListContainerFragment.kt", m80624l = {1217}, m80625m = "invokeSuspend")
public final class C30112OooOOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C33163OooO0oO f107210OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107211OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f107212OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<NoteVO> f107213OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ NoteListContainerFragment f107214OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30112OooOOoo(C33163OooO0oO c33163OooO0oO, List list, String str, NoteListContainerFragment noteListContainerFragment, Continuation continuation) {
        super(2, continuation);
        this.f107210OooOo = c33163OooO0oO;
        this.f107213OooOoO0 = list;
        this.f107212OooOoO = str;
        this.f107214OooOoOO = noteListContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30112OooOOoo(this.f107210OooOo, this.f107213OooOoO0, this.f107212OooOoO, this.f107214OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30112OooOOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107211OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List<NoteVO> list = this.f107213OooOoO0;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((NoteVO) it.next()).getId());
            }
            this.f107211OooOo0o = 1;
            obj = ExportBottomSheetFragment.f71509OoooOoO.OooO00o(this.f107210OooOo, arrayList, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        String absolutePath = ((File) obj).getAbsolutePath();
        kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
        ExportRequest.NoteExport noteExport = new ExportRequest.NoteExport(absolutePath, this.f107212OooOoO);
        ActivityC21897OooOo0 activity = this.f107214OooOoOO.getActivity();
        MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
        if (mainActivity != null) {
            mainActivity.openExportOptions(noteExport);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
