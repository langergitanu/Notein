package o0Ooo0oo;

import android.os.Bundle;
import com.orion.notein.domain.models.note.PenInfo;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32509OooOOo;

/* JADX INFO: renamed from: o0Ooo0oo.o000OOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$pen$1", m80623f = "PenBarViewModel.kt", m80624l = {494}, m80625m = "invokeSuspend")
public final class C29548o000OOo extends AbstractC32476OooO implements InterfaceC32509OooOOo<List<? extends PenInfo>, Boolean, Float, Continuation<? super PenInfo>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f104816OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104817OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ float f104818OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ boolean f104819OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104820OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29548o000OOo(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0, Continuation<? super C29548o000OOo> continuation) {
        super(4, continuation);
        this.f104820OooOoOO = oooO0O0;
    }

    @Override // oO0O000o.InterfaceC32509OooOOo
    public final Object invoke(List<? extends PenInfo> list, Boolean bool, Float f, Continuation<? super PenInfo> continuation) {
        boolean zBooleanValue = bool.booleanValue();
        float fFloatValue = f.floatValue();
        C29548o000OOo c29548o000OOo = new C29548o000OOo(this.f104820OooOoOO, continuation);
        c29548o000OOo.f104816OooOo = list;
        c29548o000OOo.f104819OooOoO0 = zBooleanValue;
        c29548o000OOo.f104818OooOoO = fFloatValue;
        return c29548o000OOo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        List list;
        boolean z;
        float f;
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104817OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List list2 = this.f104816OooOo;
            boolean z2 = this.f104819OooOoO0;
            float f2 = this.f104818OooOoO;
            this.f104816OooOo = list2;
            this.f104819OooOoO0 = z2;
            this.f104818OooOoO = f2;
            this.f104817OooOo0o = 1;
            if (com.orion.notein.p607ui.noteeditor.penbar.OooO0O0.OooO0o0(this.f104820OooOoOO, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            list = list2;
            z = z2;
            f = f2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f = this.f104818OooOoO;
            z = this.f104819OooOoO0;
            list = this.f104816OooOo;
            C32446OooOOOo.OooO0O0(obj);
        }
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
        if (penInfo == null) {
            return null;
        }
        int i2 = z ? (int) (f * 100) : 0;
        Bundle bundleDeepCopy = penInfo.getExtra().deepCopy();
        bundleDeepCopy.putInt(DrawToolFactory.EXTRA_OPACITY_OF_SHAPE_FILL_COLOR, i2);
        return PenInfo.copy$default(penInfo, null, 0, 0, 0, null, null, null, false, bundleDeepCopy, 255, null);
    }
}
