package o0Ooo0oo;

import com.orion.notein.domain.models.note.PenInfo;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
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
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0Ooo0oo.o00000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$penWidthList$1", m80623f = "PenBarViewModel.kt", m80624l = {651, 653}, m80625m = "invokeSuspend")
public final class C29501o00000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends PenInfo>, Continuation<? super List<? extends PenWidthVO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public PenInfo f104614OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104615OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f104616OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f104617OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f104618OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104619OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f104620OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29501o00000(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0, Continuation<? super C29501o00000> continuation) {
        super(2, continuation);
        this.f104619OooOoo = oooO0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C29501o00000 c29501o00000 = new C29501o00000(this.f104619OooOoo, continuation);
        c29501o00000.f104620OooOoo0 = obj;
        return c29501o00000;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(List<? extends PenInfo> list, Continuation<? super List<? extends PenWidthVO>> continuation) {
        return ((C29501o00000) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object next;
        PenInfo penInfo;
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0;
        PenInfo penInfo2;
        int i;
        float f;
        PenInfo penInfo3;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f104618OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Iterator it = ((List) this.f104620OooOoo0).iterator();
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
            penInfo = (PenInfo) next;
            if (penInfo == null) {
                penInfo = null;
            } else if (penInfo.getWidthIndex() > 2) {
                float width = penInfo.getWidth();
                PenWidthVO penWidthVO = new PenWidthVO(2, penInfo.getType(), penInfo.getColor(), width, true);
                this.f104620OooOoo0 = penInfo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O02 = this.f104619OooOoo;
                this.f104615OooOo0o = oooO0O02;
                this.f104614OooOo = penInfo;
                this.f104617OooOoO0 = 2;
                this.f104616OooOoO = width;
                this.f104618OooOoOO = 1;
                if (oooO0O02.OooOOOo(penWidthVO, this) != enumC32485OooO00o) {
                    oooO0O0 = oooO0O02;
                    penInfo2 = penInfo;
                    i = 2;
                    f = width;
                }
                return enumC32485OooO00o;
            }
            if (penInfo == null) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                penInfo3 = (PenInfo) this.f104620OooOoo0;
                C32446OooOOOo.OooO0O0(obj);
                penInfo = penInfo3;
                if (penInfo == null) {
                    return C34434OooOoO.f123453OooOo0o;
                }
                List<Float> widthList = penInfo.getWidthList();
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(widthList, 10));
                int i3 = 0;
                for (Object obj2 : widthList) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        C34429OooOOo0.OooOOo();
                        throw null;
                    }
                    arrayList.add(new PenWidthVO(i3, penInfo.getType(), penInfo.getColor(), ((Number) obj2).floatValue(), penInfo.getWidthIndex() == i3));
                    i3 = i4;
                }
                return oOo000Oo.OooOo.o00Oo0(arrayList, 3);
            }
            f = this.f104616OooOoO;
            i = this.f104617OooOoO0;
            PenInfo penInfo4 = this.f104614OooOo;
            oooO0O0 = this.f104615OooOo0o;
            PenInfo penInfo5 = (PenInfo) this.f104620OooOoo0;
            C32446OooOOOo.OooO0O0(obj);
            penInfo2 = penInfo4;
            penInfo = penInfo5;
        }
        int type = penInfo2.getType();
        this.f104620OooOoo0 = penInfo;
        this.f104615OooOo0o = null;
        this.f104614OooOo = null;
        this.f104618OooOoOO = 2;
        if (oooO0O0.OooOo0(type, i, f, this) != enumC32485OooO00o) {
            penInfo3 = penInfo;
            penInfo = penInfo3;
            if (penInfo == null) {
            }
        }
        return enumC32485OooO00o;
    }
}
