package o0Ooo0oo;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.note.PenInfo;
import com.orion.notein.p607ui.p609vo.PenVO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import o0OO.C26433OoooO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Ooo0oo.o0000O0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$saveSelectedPen$2", m80623f = "PenBarViewModel.kt", m80624l = {1373, 1416}, m80625m = "invokeSuspend")
public final class C29515o0000O0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PenVO f104688OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104689OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ boolean f104690OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104691OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29515o0000O0O(PenVO penVO, com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0, boolean z, Continuation<? super C29515o0000O0O> continuation) {
        super(2, continuation);
        this.f104688OooOo = penVO;
        this.f104691OooOoO0 = oooO0O0;
        this.f104690OooOoO = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29515o0000O0O(this.f104688OooOo, this.f104691OooOoO0, this.f104690OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29515o0000O0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x018b, code lost:
    
        if (r2.OooO0O0(r3, r24) == r1) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0o;
        Object next;
        Object next2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104689OooOo0o;
        PenVO penVO = this.f104688OooOo;
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = this.f104691OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.f123390OooO00o.OooO00o(C21532OooOOo.OooO0OO(penVO.getType(), "saveSelectedPen "), new Object[0]);
            this.f104689OooOo0o = 1;
            objOooO0o = com.orion.notein.p607ui.noteeditor.penbar.OooO0O0.OooO0o(oooO0O0, this);
            if (objOooO0o != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooO0o = obj;
        List list = (List) objOooO0o;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((PenInfo) next).getSelected()) {
                break;
            }
        }
        PenInfo penInfo = (PenInfo) next;
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((PenInfo) next2).getType() == penVO.getType()) {
                break;
            }
        }
        PenInfo penInfo2 = (PenInfo) next2;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(penInfo != null ? new Integer(penInfo.getType()) : null, penInfo2 != null ? new Integer(penInfo2.getType()) : null)) {
            return C32460OooOooO.f116667OooO00o;
        }
        if (this.f104690OooOoO) {
            oooO0O0.f75147OooOO0O = penInfo;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<PenInfo> arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((PenInfo) obj2).getSelected()) {
                arrayList2.add(obj2);
            }
        }
        for (PenInfo penInfo3 : arrayList2) {
            arrayList.add(penInfo3.getNoteId() == null ? PenInfo.copy$default(penInfo3, C24761OooO.OooO00o("toString(...)"), 0, 0, 0, null, null, (String) oooO0O0.f75162OooOoO0.f121747OooOo0o.getValue(), false, null, StyleIdentifier.GRID_TABLE_4_ACCENT_6, null) : PenInfo.copy$default(penInfo3, null, 0, 0, 0, null, null, null, false, null, 383, null));
        }
        if (penInfo2 != null) {
            arrayList.add(penInfo2.getNoteId() == null ? PenInfo.copy$default(penInfo2, C24761OooO.OooO00o("toString(...)"), 0, 0, 0, null, null, (String) oooO0O0.f75162OooOoO0.f121747OooOo0o.getValue(), true, null, StyleIdentifier.GRID_TABLE_4_ACCENT_6, null) : PenInfo.copy$default(penInfo2, null, 0, 0, 0, null, null, null, true, null, 383, null));
        }
        if (!arrayList.isEmpty()) {
            C26433OoooO0 c26433OoooO0 = oooO0O0.f75143OooO0o0;
            PenInfo[] penInfoArr = (PenInfo[]) arrayList.toArray(new PenInfo[0]);
            PenInfo[] penInfoArr2 = (PenInfo[]) Arrays.copyOf(penInfoArr, penInfoArr.length);
            this.f104689OooOo0o = 2;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
