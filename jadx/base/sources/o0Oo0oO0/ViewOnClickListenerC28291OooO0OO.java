package o0Oo0oO0;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.p607ui.feedback.FeedbackDialogFragment;
import com.orion.notein.p607ui.login.firebase.FirebaseCreateUserSetNameFragment;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.p609vo.PenVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;
import java.util.List;
import o0OoO000.ViewOnClickListenerC28523OooO00o;
import o0Ooo0oo.C29469Oooo;
import o0o00o0O.C29947OooO0OO;
import o0o00o0O.C29948OooO0Oo;
import o0o00o0O.C29949OooO0o;
import o0o00o0O.C29950OooO0o0;
import o0o00o0O.C29951OooO0oO;
import o0o00o0O.C29953OooOO0o;
import o0oOoOoO.C31099OooO0o0;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0Oo0oO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28291OooO0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100339OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100340OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28291OooO0OO(Object obj, int i) {
        this.f100340OooOo0o = i;
        this.f100339OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = null;
        Object obj2 = this.f100339OooOo;
        switch (this.f100340OooOo0o) {
            case 0:
                ((FeedbackDialogFragment) obj2).dismissAllowingStateLoss();
                return;
            case 1:
                Context contextRequireContext = ((FirebaseCreateUserSetNameFragment) obj2).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31099OooO0o0(contextRequireContext, null), 3);
                return;
            case 2:
                int i = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = (PenBarChildFragment) obj2;
                Integer num = (Integer) penBarChildFragment.Oooo0oO().f75160OooOo0o.f121747OooOo0o.getValue();
                if (num != null) {
                    int iIntValue = num.intValue();
                    Object tag = view.getTag();
                    kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenVO");
                    PenVO penVO = (PenVO) tag;
                    if (!penVO.getSelected()) {
                        InterfaceC21987OooOoo interfaceC21987OooOoo = penBarChildFragment.f75247OooOooO;
                        if (interfaceC21987OooOoo != null) {
                            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(interfaceC21987OooOoo), null, null, new C29469Oooo(penVO, penBarChildFragment, null), 3);
                            return;
                        } else {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                            throw null;
                        }
                    }
                    Iterator it = ((Iterable) penBarChildFragment.Oooo0oO().f75193OooooOo.f121747OooOo0o.getValue()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (((PenWidthVO) next).getSelected()) {
                                obj = next;
                            }
                        }
                    }
                    PenWidthVO penWidthVO = (PenWidthVO) obj;
                    switch (penVO.getType()) {
                        case 0:
                        case 1:
                            List<PenVO> list = (List) penBarChildFragment.Oooo0oO().f75172Oooo00o.f121747OooOo0o.getValue();
                            List<PenColorVO> list2 = (List) penBarChildFragment.Oooo0oO().f75188OoooOoo.f121747OooOo0o.getValue();
                            if (penWidthVO == null) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o.OooOOO0("PenBarChildFragment");
                                c20358OooO00o.OooO0OO("TOOL_BALLPOINT_PEN, TOOL_FOUNTAIN_PEN, TOOL_PENCIL penWidthVO is null", new Object[0]);
                                return;
                            } else {
                                penBarChildFragment.OoooOOO();
                                C29950OooO0o0 c29950OooO0o0 = penBarChildFragment.f75297o0000Ooo;
                                if (c29950OooO0o0 != null) {
                                    c29950OooO0o0.OooO0oO(view, iIntValue, penVO, list, list2, penWidthVO);
                                    return;
                                }
                                return;
                            }
                        case 2:
                        case 9:
                            List<PenVO> list3 = (List) penBarChildFragment.Oooo0oO().f75173Oooo0O0.f121747OooOo0o.getValue();
                            List<PenColorVO> list4 = (List) penBarChildFragment.Oooo0oO().f75188OoooOoo.f121747OooOo0o.getValue();
                            if (penWidthVO == null) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o2.OooOOO0("PenBarChildFragment");
                                c20358OooO00o2.OooO0OO("TOOL_HIGHLIGHTER_PEN, TOOL_HIGHLIGHTER_PEN_RECT penWidthVO is null", new Object[0]);
                                return;
                            }
                            penBarChildFragment.o000oOoO();
                            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o3.OooOOO0("HLRectDebug");
                            c20358OooO00o3.OooO0o0("PenBarChildFragment.initSecondaryViews, vo: " + penVO + ", highlightPenGroup: " + list3, new Object[0]);
                            C29948OooO0Oo c29948OooO0Oo = penBarChildFragment.f75299o0000oo;
                            if (c29948OooO0Oo != null) {
                                c29948OooO0Oo.OooO0oO(view, iIntValue, penVO, list3, list4, penWidthVO);
                                return;
                            }
                            return;
                        case 3:
                            String string = penVO.getExtra().getString("penPressToEraser");
                            if (string == null) {
                                string = TelemetryEventStrings.Value.TRUE;
                            }
                            string.equals(TelemetryEventStrings.Value.TRUE);
                            String string2 = penVO.getExtra().getString("eraseHighlighterOnly");
                            String str = TelemetryEventStrings.Value.FALSE;
                            if (string2 == null) {
                                string2 = TelemetryEventStrings.Value.FALSE;
                            }
                            string2.equals(TelemetryEventStrings.Value.TRUE);
                            String string3 = penVO.getExtra().getString("eraseTapeOnly");
                            if (string3 != null) {
                                str = string3;
                            }
                            str.equals(TelemetryEventStrings.Value.TRUE);
                            penVO.getExtra().getFloat("eraserPressure");
                            if (penWidthVO == null) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o4.OooOOO0("PenBarChildFragment");
                                c20358OooO00o4.OooO0OO("TOOL_ERASER penWidthVO is null", new Object[0]);
                                return;
                            } else {
                                penBarChildFragment.OoooOO0();
                                C29947OooO0OO c29947OooO0OO = penBarChildFragment.o0000O0;
                                if (c29947OooO0OO != null) {
                                    c29947OooO0OO.OooO0o0(view, iIntValue, penWidthVO);
                                    return;
                                }
                                return;
                            }
                        case 4:
                            String string4 = penVO.getExtra().getString(C18437z2.f56754h);
                            if (string4 == null) {
                                string4 = DrawToolFactory.LASSO_TYPE_FREE;
                            }
                            String string5 = penVO.getExtra().getString("filter");
                            List listOoooOO0 = string5 != null ? C33599OooOo0O.OoooOO0(string5, new String[]{","}) : C34434OooOoO.f123453OooOo0o;
                            String string6 = penVO.getExtra().getString("showDualLinkIcon");
                            if (string6 == null) {
                                string6 = TelemetryEventStrings.Value.TRUE;
                            }
                            List list5 = (List) penBarChildFragment.Oooo0oO().f75188OoooOoo.f121747OooOo0o.getValue();
                            penBarChildFragment.OoooOo0();
                            C29951OooO0oO c29951OooO0oO = penBarChildFragment.f75293o0000O0O;
                            if (c29951OooO0oO != null) {
                                string6.equals(TelemetryEventStrings.Value.TRUE);
                                c29951OooO0oO.OooO0Oo(view, iIntValue, string4, list5, listOoooOO0, penBarChildFragment.f75318oo000o);
                                return;
                            }
                            return;
                        case 5:
                        case 6:
                        default:
                            return;
                        case 7:
                            List list6 = (List) penBarChildFragment.Oooo0oO().f75188OoooOoo.f121747OooOo0o.getValue();
                            if (penWidthVO == null) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o5.OooOOO0("PenBarChildFragment");
                                c20358OooO00o5.OooO0OO("TOOL_LASER_PEN penWidthVO is null", new Object[0]);
                                return;
                            } else {
                                penBarChildFragment.OoooOOo();
                                C29949OooO0o c29949OooO0o = penBarChildFragment.f75291o0000O;
                                if (c29949OooO0o != null) {
                                    penVO.getColor();
                                    c29949OooO0o.OooO0o0(view, iIntValue, list6, penWidthVO);
                                    return;
                                }
                                return;
                            }
                        case 8:
                            String string7 = penVO.getExtra().getString(C18437z2.f56754h);
                            if (string7 != null) {
                                Integer.parseInt(string7);
                            }
                            List list7 = (List) penBarChildFragment.Oooo0oO().f75188OoooOoo.f121747OooOo0o.getValue();
                            if (penWidthVO == null) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o6.OooOOO0("PenBarChildFragment");
                                c20358OooO00o6.OooO0OO("TOOL_VECTOR_PEN penWidthVO is null", new Object[0]);
                                return;
                            } else {
                                penBarChildFragment.Ooooo0o();
                                C29953OooOO0o c29953OooOO0o = penBarChildFragment.f75300o000OO;
                                if (c29953OooOO0o != null) {
                                    c29953OooOO0o.OooO0o(view, iIntValue, list7, penWidthVO);
                                    return;
                                }
                                return;
                            }
                        case 10:
                        case 12:
                            List<PenVO> list8 = (List) penBarChildFragment.Oooo0oO().f75169Oooo0.f121747OooOo0o.getValue();
                            List<PenColorVO> list9 = (List) penBarChildFragment.Oooo0oO().f75188OoooOoo.f121747OooOo0o.getValue();
                            if (penWidthVO == null) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o7.OooOOO0("PenBarChildFragment");
                                c20358OooO00o7.OooO0OO("TOOL_TAPE_PEN penWidthVO is null", new Object[0]);
                                return;
                            } else {
                                penBarChildFragment.OoooOoo();
                                o0o00o0O.OooO oooO = penBarChildFragment.f75292o0000O00;
                                if (oooO != null) {
                                    oooO.OooO0Oo(view, iIntValue, penVO, list8, list9, penWidthVO);
                                    return;
                                }
                                return;
                            }
                        case 11:
                            List<PenColorVO> list10 = (List) penBarChildFragment.Oooo0oO().f75188OoooOoo.f121747OooOo0o.getValue();
                            if (penWidthVO == null) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o8 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o8.OooOOO0("PenBarChildFragment");
                                c20358OooO00o8.OooO0OO("TOOL_TAPE_PEN penWidthVO is null", new Object[0]);
                                return;
                            } else {
                                penBarChildFragment.Ooooo00();
                                o0o00o0O.OooOO0O oooOO0O = penBarChildFragment.f75290o00000oo;
                                if (oooOO0O != null) {
                                    oooOO0O.OooO0o0(view, iIntValue, list10, penWidthVO);
                                    return;
                                }
                                return;
                            }
                    }
                }
                return;
            default:
                ViewOnClickListenerC28523OooO00o viewOnClickListenerC28523OooO00o = ((com.orion.notein.p607ui.noteeditor.propertypanel.outline.OooO00o) obj2).f75877OooO0O0;
                if (viewOnClickListenerC28523OooO00o != null) {
                    viewOnClickListenerC28523OooO00o.onClick(view);
                    return;
                }
                return;
        }
    }
}
