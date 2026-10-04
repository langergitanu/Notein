package o0Ooo0oo;

import com.orion.notein.domain.models.note.PenInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0oo0Oo.C31253OooOOOo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Ooo0oo.oo000o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$adjustCurrentPenWidth$1", m80623f = "PenBarViewModel.kt", m80624l = {1769, 1784}, m80625m = "invokeSuspend")
public final class C29568oo000o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104886OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104887OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f104888OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29568oo000o(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0, boolean z, Continuation<? super C29568oo000o> continuation) {
        super(2, continuation);
        this.f104886OooOo = oooO0O0;
        this.f104888OooOoO0 = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29568oo000o(this.f104886OooOo, this.f104888OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29568oo000o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        if (r2.OooOo0(r9, r1, r3, r8) == r0) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104887OooOo0o;
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = this.f104886OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f104887OooOo0o = 1;
            obj = com.orion.notein.p607ui.noteeditor.penbar.OooO0O0.OooO0o(oooO0O0, this);
            if (obj != enumC32485OooO00o) {
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
        Iterator it = ((List) obj).iterator();
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
        if (penInfo == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        float width = penInfo.getWidth();
        Object obj2 = C31253OooOOOo.OooO00o.f111551OooO00o;
        C32443OooOOO c32443OooOOOOooO0O0 = C31253OooOOOo.OooO00o.OooO0O0(penInfo.getType());
        float fFloatValue = ((Number) c32443OooOOOOooO0O0.f116638OooOo0o).floatValue();
        float fFloatValue2 = ((Number) c32443OooOOOOooO0O0.f116637OooOo).floatValue();
        if (this.f104888OooOoO0) {
            float f = 0.1f + width;
            if (f <= fFloatValue2) {
                fFloatValue2 = f;
            }
        } else {
            float f2 = width - 0.1f;
            if (f2 >= fFloatValue) {
                fFloatValue = f2;
            }
            fFloatValue2 = fFloatValue;
        }
        if (fFloatValue2 != width) {
            int type = penInfo.getType();
            int widthIndex = penInfo.getWidthIndex();
            this.f104887OooOo0o = 2;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
