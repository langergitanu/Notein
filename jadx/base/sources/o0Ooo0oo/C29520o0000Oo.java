package o0Ooo0oo;

import android.os.Bundle;
import com.orion.notein.domain.models.note.PenInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Ooo0oo.o0000Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$setTapePenDrawLineDirectly$1", m80623f = "PenBarViewModel.kt", m80624l = {1428, 1443}, m80625m = "invokeSuspend")
public final class C29520o0000Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104705OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104706OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f104707OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29520o0000Oo(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0, boolean z, Continuation<? super C29520o0000Oo> continuation) {
        super(2, continuation);
        this.f104705OooOo = oooO0O0;
        this.f104707OooOoO0 = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29520o0000Oo(this.f104705OooOo, this.f104707OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29520o0000Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
    
        if (r5.f75143OooO0o0.OooO0O0(new com.orion.notein.domain.models.note.PenInfo[]{r2}, r18) == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0o;
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104706OooOo0o;
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = this.f104705OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f104706OooOo0o = 1;
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
        Iterator it = ((List) objOooO0o).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((PenInfo) next).getType() == 11) {
                break;
            }
        }
        PenInfo penInfo = (PenInfo) next;
        if (penInfo == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        Bundle bundleDeepCopy = penInfo.getExtra().deepCopy();
        bundleDeepCopy.putString("draw_line_directly", String.valueOf(this.f104707OooOoO0));
        PenInfo penInfoCopy$default = penInfo.getNoteId() == null ? PenInfo.copy$default(penInfo, C24761OooO.OooO00o("toString(...)"), 0, 0, 0, null, null, (String) oooO0O0.f75162OooOoO0.f121747OooOo0o.getValue(), false, bundleDeepCopy, 190, null) : PenInfo.copy$default(penInfo, null, 0, 0, 0, null, null, null, false, bundleDeepCopy, 255, null);
        this.f104706OooOo0o = 2;
    }
}
