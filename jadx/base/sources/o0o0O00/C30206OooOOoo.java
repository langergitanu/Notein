package o0o0O00;

import android.content.Context;
import androidx.fragment.app.ActivityC21897OooOo0;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.export.ExportBottomSheetFragment;
import com.orion.notein.p607ui.export.ExportRequest;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.io.File;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0O00.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.initializer.DefaultNoteMoreActionListener$onExport$1$1", m80623f = "DefaultNoteMoreActionListener.kt", m80624l = {122, 127}, m80625m = "invokeSuspend")
public final class C30206OooOOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30201OooOOO0 f107579OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107580OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ NoteVO f107581OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Context f107582OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30206OooOOoo(C30201OooOOO0 c30201OooOOO0, Context context, NoteVO noteVO, Continuation<? super C30206OooOOoo> continuation) {
        super(2, continuation);
        this.f107579OooOo = c30201OooOOO0;
        this.f107582OooOoO0 = context;
        this.f107581OooOoO = noteVO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30206OooOOoo(this.f107579OooOo, this.f107582OooOoO0, this.f107581OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30206OooOOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (r8 == r0) goto L19;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107580OooOo0o;
        Context context = this.f107582OooOoO0;
        NoteVO noteVO = this.f107581OooOoO;
        C30201OooOOO0 c30201OooOOO0 = this.f107579OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f107580OooOo0o = 1;
            obj = C30201OooOOO0.OooO00o(c30201OooOOO0, 36, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            File file = (File) obj;
            String name = noteVO.getName();
            if (C33599OooOo0O.Oooo0o0(name)) {
                name = context.getString(R.string.app_name);
                kotlin.jvm.internal.OooOOO0.OooO0o(name, "getString(...)");
            }
            String absolutePath = file.getAbsolutePath();
            kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
            ExportRequest.NoteExport noteExport = new ExportRequest.NoteExport(absolutePath, name);
            ActivityC21897OooOo0 activity = c30201OooOOO0.f107547OooO00o.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity != null) {
                mainActivity.openExportOptions(noteExport);
            }
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        if (((Boolean) obj).booleanValue()) {
            return C32460OooOooO.f116667OooO00o;
        }
        List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(noteVO.getId());
        this.f107580OooOo0o = 2;
        obj = ExportBottomSheetFragment.f71509OoooOoO.OooO00o(context, listOooO0oO, this);
    }
}
