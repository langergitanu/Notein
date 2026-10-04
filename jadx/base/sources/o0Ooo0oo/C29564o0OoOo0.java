package o0Ooo0oo;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.p609vo.PenVO;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0o00o0O.C29951OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0Ooo0oo.o0OoOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$tryToShowLassoSettings$1", m80623f = "PenBarChildFragment.kt", m80624l = {3476}, m80625m = "invokeSuspend")
public final class C29564o0OoOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PenBarChildFragment f104875OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104876OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<PenVO> f104877OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29564o0OoOo0(PenBarChildFragment penBarChildFragment, List<PenVO> list, Continuation<? super C29564o0OoOo0> continuation) {
        super(2, continuation);
        this.f104875OooOo = penBarChildFragment;
        this.f104877OooOoO0 = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29564o0OoOo0(this.f104875OooOo, this.f104877OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29564o0OoOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104876OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f104876OooOo0o = 1;
            if (C33644OoooO0.OooO00o(100L, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        int i2 = PenBarChildFragment.f75240o0000OOo;
        PenBarChildFragment penBarChildFragment = this.f104875OooOo;
        Integer num = (Integer) penBarChildFragment.Oooo0oO().f75160OooOo0o.f121747OooOo0o.getValue();
        if (num == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        int iIntValue = num.intValue();
        int i3 = 0;
        for (Object obj2 : this.f104877OooOoO0) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            RecyclerView recyclerView = penBarChildFragment.f75249Oooo;
            if (recyclerView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rvPenList");
                throw null;
            }
            View childAt = recyclerView.getChildAt(i3);
            if (childAt != null) {
                Object tag = childAt.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenVO");
                PenVO penVO = (PenVO) tag;
                if (penVO.getType() == 4) {
                    String string = penVO.getExtra().getString(C18437z2.f56754h);
                    if (string == null) {
                        string = DrawToolFactory.LASSO_TYPE_FREE;
                    }
                    String string2 = penVO.getExtra().getString("filter");
                    List listOoooOO0 = string2 != null ? C33599OooOo0O.OoooOO0(string2, new String[]{","}) : C34434OooOoO.f123453OooOo0o;
                    kotlin.jvm.internal.OooOOO0.OooO0O0(penVO.getExtra().getString("showDualLinkIcon"), TelemetryEventStrings.Value.FALSE);
                    List list = (List) penBarChildFragment.Oooo0oO().f75188OoooOoo.f121747OooOo0o.getValue();
                    penBarChildFragment.OoooOo0();
                    C29951OooO0oO c29951OooO0oO = penBarChildFragment.f75293o0000O0O;
                    if (c29951OooO0oO != null) {
                        c29951OooO0oO.OooO0Oo(childAt, iIntValue, string, list, listOoooOO0, penBarChildFragment.f75318oo000o);
                    }
                }
            }
            i3 = i4;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
