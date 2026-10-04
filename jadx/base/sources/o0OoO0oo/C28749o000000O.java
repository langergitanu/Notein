package o0OoO0oo;

import Oooo0.C20860Ooooooo;
import androidx.appcompat.widget.C21532OooOOo;
import com.orion.notein.domain.models.note.PenInfo;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO0oo.o000000O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$handleColorPicked$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {2491, 2499}, m80625m = "invokeSuspend")
public final class C28749o000000O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorContainerFragment f101817OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101818OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f101819OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28749o000000O(NoteEditorContainerFragment noteEditorContainerFragment, int i, Continuation<? super C28749o000000O> continuation) {
        super(2, continuation);
        this.f101817OooOo = noteEditorContainerFragment;
        this.f101819OooOoO0 = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28749o000000O(this.f101817OooOo, this.f101819OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28749o000000O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (r10.OooOOoo(r1, r6, r4, r9) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e0, code lost:
    
        if (r10.OooOOoo(r1, r7, r4, r9) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<Integer> colorList;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101818OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            NoteEditorContainerFragment noteEditorContainerFragment = this.f101817OooOo;
            T value = noteEditorContainerFragment.Oooo000().f75183OoooOO0.f121747OooOo0o.getValue();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(value);
            int type = ((PenInfo) value).getType();
            Iterator it = ((List) noteEditorContainerFragment.Oooo000().f75188OoooOoo.f121747OooOo0o.getValue()).iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (((PenColorVO) it.next()).getSelected()) {
                    break;
                }
                i2++;
            }
            int i3 = this.f101819OooOoO0;
            if (i2 >= 0) {
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo000 = noteEditorContainerFragment.Oooo000();
                this.f101818OooOo0o = 1;
            } else {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteEditorContainer");
                c20358OooO00o.OooOO0O(C21532OooOOo.OooO0OO(((List) noteEditorContainerFragment.Oooo000().f75188OoooOoo.f121747OooOo0o.getValue()).size(), "handleColorPicked: No color selected in penColorList, cannot update color. penColorList size: "), new Object[0]);
                PenInfo penInfo = (PenInfo) noteEditorContainerFragment.Oooo000().f75183OoooOO0.f121747OooOo0o.getValue();
                int colorIndex = penInfo != null ? penInfo.getColorIndex() : 0;
                PenInfo penInfo2 = (PenInfo) noteEditorContainerFragment.Oooo000().f75183OoooOO0.f121747OooOo0o.getValue();
                int size = (penInfo2 == null || (colorList = penInfo2.getColorList()) == null) ? 0 : colorList.size();
                if (colorIndex >= 0 && colorIndex < size) {
                    c20358OooO00o.OooO0o0(C20860Ooooooo.OooO0OO(c20358OooO00o, "NoteEditorContainer", "handleColorPicked: Using fallback colorIndex ", colorIndex), new Object[0]);
                    com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0002 = noteEditorContainerFragment.Oooo000();
                    this.f101818OooOo0o = 2;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
