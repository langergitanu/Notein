package o0Ooo0oo;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.note.PenInfo;
import com.orion.notein.p607ui.p609vo.PenVO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000OoO.C24536OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32513OooOo0O;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0Ooo0oo.o000000o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$penList$1", m80623f = "PenBarViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29504o000000o extends AbstractC32476OooO implements InterfaceC32513OooOo0O<List<? extends PenInfo>, Boolean, Boolean, Boolean, Float, Boolean, Boolean, Continuation<? super List<? extends PenVO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ boolean f104624OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f104625OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ boolean f104626OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ boolean f104627OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ float f104628OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ boolean f104629OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ boolean f104630OooOoo0;

    /* JADX INFO: renamed from: o0Ooo0oo.o000000o$OooO00o */
    public static final class OooO00o<T> implements Comparator {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ List f104631OooOo0o;

        public OooO00o(List list) {
            this.f104631OooOo0o = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Integer numValueOf = Integer.valueOf(((PenInfo) t).getType());
            List list = this.f104631OooOo0o;
            return C24536OooO0Oo.OooO0O0(Integer.valueOf(list.indexOf(numValueOf)), Integer.valueOf(list.indexOf(Integer.valueOf(((PenInfo) t2).getType()))));
        }
    }

    public C29504o000000o(Continuation<? super C29504o000000o> continuation) {
        super(8, continuation);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f104625OooOo0o;
        boolean z = this.f104624OooOo;
        boolean z2 = this.f104627OooOoO0;
        boolean z3 = this.f104626OooOoO;
        float f = this.f104628OooOoOO;
        boolean z4 = this.f104630OooOoo0;
        boolean z5 = this.f104629OooOoo;
        List<PenInfo> listO00O0O = oOo000Oo.OooOo.o00O0O(list, new OooO00o(C34429OooOOo0.OooOO0o(new Integer(0), new Integer(1), new Integer(10), new Integer(12), new Integer(2), new Integer(9), new Integer(11), new Integer(3), new Integer(4), new Integer(8), new Integer(7))));
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listO00O0O, 10));
        for (PenInfo penInfo : listO00O0O) {
            int type = penInfo.getType();
            String str = TelemetryEventStrings.Value.FALSE;
            if (type == 3) {
                penInfo.getExtra().putString("penPressToEraser", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
                penInfo.getExtra().putString("eraseHighlighterOnly", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
                penInfo.getExtra().putString("eraseTapeOnly", z3 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
                penInfo.getExtra().putFloat("eraserPressure", f);
            }
            if (penInfo.getType() == 4) {
                if (z4) {
                    str = TelemetryEventStrings.Value.TRUE;
                }
                penInfo.getExtra().putString("showDualLinkIcon", str);
            }
            arrayList.add(penInfo.getType() == 11 ? new PenVO(penInfo, z5) : new PenVO(penInfo));
        }
        return arrayList;
    }

    @Override // oO0O000o.InterfaceC32513OooOo0O
    public final Object o0Oo0oo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Serializable serializable) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
        float fFloatValue = ((Number) obj5).floatValue();
        boolean zBooleanValue4 = ((Boolean) obj6).booleanValue();
        boolean zBooleanValue5 = ((Boolean) obj7).booleanValue();
        C29504o000000o c29504o000000o = new C29504o000000o((Continuation) serializable);
        c29504o000000o.f104625OooOo0o = (List) obj;
        c29504o000000o.f104624OooOo = zBooleanValue;
        c29504o000000o.f104627OooOoO0 = zBooleanValue2;
        c29504o000000o.f104626OooOoO = zBooleanValue3;
        c29504o000000o.f104628OooOoOO = fFloatValue;
        c29504o000000o.f104630OooOoo0 = zBooleanValue4;
        c29504o000000o.f104629OooOoo = zBooleanValue5;
        return c29504o000000o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }
}
