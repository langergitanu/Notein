package o0OoO000;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.core.os.BundleKt;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseCreateUserPasswordFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.EditorOutlineFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.ocr.dialog.TextUrlLinkDialogFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.p609vo.PenVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import com.orion.notein.p607ui.user.settings.home.UserSettingFragment;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import o0o00o0O.C29949OooO0o;
import o0o00o0O.C29951OooO0oO;
import o0o0O00.C30214OooOoOO;
import o0o0OOo0.C30548OooO0O0;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OoO000.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28526OooO0o0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101132OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101133OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28526OooO0o0(Object obj, int i) {
        this.f101133OooOo0o = i;
        this.f101132OooOo = obj;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f101132OooOo;
        switch (this.f101133OooOo0o) {
            case 0:
                FirebaseCreateUserPasswordFragment firebaseCreateUserPasswordFragment = (FirebaseCreateUserPasswordFragment) obj;
                EditText editText = firebaseCreateUserPasswordFragment.f72238Oooo0o0;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("etPassword");
                    throw null;
                }
                if (editText.getInputType() == 144) {
                    ImageView imageView = firebaseCreateUserPasswordFragment.f72237Oooo0o;
                    if (imageView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnPasswordVisibility");
                        throw null;
                    }
                    imageView.setImageResource(R.drawable.ic_close_eye);
                    EditText editText2 = firebaseCreateUserPasswordFragment.f72238Oooo0o0;
                    if (editText2 != null) {
                        editText2.setInputType(129);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("etPassword");
                        throw null;
                    }
                }
                ImageView imageView2 = firebaseCreateUserPasswordFragment.f72237Oooo0o;
                if (imageView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnPasswordVisibility");
                    throw null;
                }
                imageView2.setImageResource(R.drawable.ic_open_eye);
                EditText editText3 = firebaseCreateUserPasswordFragment.f72238Oooo0o0;
                if (editText3 != null) {
                    editText3.setInputType(144);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("etPassword");
                    throw null;
                }
            case 1:
                ((EditorOutlineFragment) obj).requireActivity().getSupportFragmentManager().OooooOo(BundleKt.bundleOf(), "clear_outline");
                return;
            case 2:
                int i = PenBox.f76736o000OOo;
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenVO");
                PenVO penVO = (PenVO) tag;
                PenBox penBox = (PenBox) obj;
                if (!penVO.getSelected()) {
                    View.OnClickListener onClickListener = penBox.penItemClickListener;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    return;
                }
                int type = penVO.getType();
                if (type == 0 || type == 1) {
                    List<T> list = penBox.f76772Oooooo.f66021OooO00o.f65811OooO0o;
                    kotlin.jvm.internal.OooOOO0.OooO0o(list, "getCurrentList(...)");
                    Iterable<PenWidthVO> iterable = penBox.f76794ooOO.f66021OooO00o.f65811OooO0o;
                    kotlin.jvm.internal.OooOOO0.OooO0o(iterable, "getCurrentList(...)");
                    for (PenWidthVO penWidthVO : iterable) {
                        if (penWidthVO.getSelected()) {
                            penBox.f76765OoooOoO.OooO0oO(view, penBox.com.alibaba.sdk.android.oss.common.RequestParameters.POSITION java.lang.String, penVO, null, list, penWidthVO);
                            return;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                if (type != 2) {
                    if (type == 3) {
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
                        Iterable<PenWidthVO> iterable2 = penBox.f76778o00Oo0.f66021OooO00o.f65811OooO0o;
                        kotlin.jvm.internal.OooOOO0.OooO0o(iterable2, "getCurrentList(...)");
                        for (PenWidthVO penWidthVO2 : iterable2) {
                            if (penWidthVO2.getSelected()) {
                                penBox.f76768Ooooo0o.OooO0o0(view, penBox.com.alibaba.sdk.android.oss.common.RequestParameters.POSITION java.lang.String, penWidthVO2);
                                return;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    if (type == 4) {
                        String string4 = penVO.getExtra().getString(C18437z2.f56754h);
                        if (string4 == null) {
                            string4 = DrawToolFactory.LASSO_TYPE_FREE;
                        }
                        String str2 = string4;
                        String string5 = penVO.getExtra().getString("filter");
                        List listOoooOO0 = string5 != null ? C33599OooOo0O.OoooOO0(string5, new String[]{","}) : C34434OooOoO.f123453OooOo0o;
                        String string6 = penVO.getExtra().getString("showDualLinkIcon");
                        if (string6 == null) {
                            string6 = TelemetryEventStrings.Value.TRUE;
                        }
                        List list2 = penBox.f76772Oooooo.f66021OooO00o.f65811OooO0o;
                        kotlin.jvm.internal.OooOOO0.OooO0o(list2, "getCurrentList(...)");
                        C29951OooO0oO c29951OooO0oO = penBox.f76769OooooO0;
                        int i2 = penBox.com.alibaba.sdk.android.oss.common.RequestParameters.POSITION java.lang.String;
                        string6.equals(TelemetryEventStrings.Value.TRUE);
                        c29951OooO0oO.OooO0Oo(view, i2, str2, list2, listOoooOO0, penBox.dualLinkFeature);
                        return;
                    }
                    if (type == 7) {
                        List list3 = penBox.f76772Oooooo.f66021OooO00o.f65811OooO0o;
                        kotlin.jvm.internal.OooOOO0.OooO0o(list3, "getCurrentList(...)");
                        Iterable<PenWidthVO> iterable3 = penBox.f76794ooOO.f66021OooO00o.f65811OooO0o;
                        kotlin.jvm.internal.OooOOO0.OooO0o(iterable3, "getCurrentList(...)");
                        for (PenWidthVO penWidthVO3 : iterable3) {
                            if (penWidthVO3.getSelected()) {
                                C29949OooO0o c29949OooO0o = penBox.f76770OooooOO;
                                int i3 = penBox.com.alibaba.sdk.android.oss.common.RequestParameters.POSITION java.lang.String;
                                penVO.getColor();
                                c29949OooO0o.OooO0o0(view, i3, list3, penWidthVO3);
                                return;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    if (type == 8) {
                        String string7 = penVO.getExtra().getString(C18437z2.f56754h);
                        if (string7 != null) {
                            Integer.parseInt(string7);
                        }
                        List list4 = penBox.f76772Oooooo.f66021OooO00o.f65811OooO0o;
                        kotlin.jvm.internal.OooOOO0.OooO0o(list4, "getCurrentList(...)");
                        Iterable<PenWidthVO> iterable4 = penBox.f76794ooOO.f66021OooO00o.f65811OooO0o;
                        kotlin.jvm.internal.OooOOO0.OooO0o(iterable4, "getCurrentList(...)");
                        for (PenWidthVO penWidthVO4 : iterable4) {
                            if (penWidthVO4.getSelected()) {
                                penBox.f76771OooooOo.OooO0o(view, penBox.com.alibaba.sdk.android.oss.common.RequestParameters.POSITION java.lang.String, list4, penWidthVO4);
                                return;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    if (type != 9 && type != 11) {
                        return;
                    }
                }
                List<T> list5 = penBox.f76772Oooooo.f66021OooO00o.f65811OooO0o;
                kotlin.jvm.internal.OooOOO0.OooO0o(list5, "getCurrentList(...)");
                Iterable<PenWidthVO> iterable5 = penBox.f76794ooOO.f66021OooO00o.f65811OooO0o;
                kotlin.jvm.internal.OooOOO0.OooO0o(iterable5, "getCurrentList(...)");
                for (PenWidthVO penWidthVO5 : iterable5) {
                    if (penWidthVO5.getSelected()) {
                        penBox.f76767Ooooo00.OooO0oO(view, penBox.com.alibaba.sdk.android.oss.common.RequestParameters.POSITION java.lang.String, penVO, null, list5, penWidthVO5);
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 3:
                NoteListContainerFragment noteListContainerFragment = (NoteListContainerFragment) obj;
                if (((List) noteListContainerFragment.OooOoo().f77172OooooOO.f121747OooOo0o.getValue()).size() != 0) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("NoteListContainerFragment");
                    c20358OooO00o.OooO0o0("cancel select button clicked: unselect all", new Object[0]);
                    noteListContainerFragment.OooOoo().Oooo0O0();
                    return;
                }
                C30214OooOoOO c30214OooOoOO = noteListContainerFragment.f77359OoooOoo;
                if (c30214OooOoOO == null) {
                    noteListContainerFragment.OooOoo().OooOo0o((List) noteListContainerFragment.OooOoo().f77170Ooooo0o.f121747OooOo0o.getValue());
                    return;
                }
                Iterable iterable6 = (Iterable) noteListContainerFragment.OooOoo().f77170Ooooo0o.f121747OooOo0o.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : iterable6) {
                    if (c30214OooOoOO.OooO00o().getFilterFunction().invoke((NoteVO) obj2).booleanValue()) {
                        arrayList.add(obj2);
                    }
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("NoteListContainerFragment");
                c20358OooO00o2.OooO0o0("select all button clicked: select all", new Object[0]);
                noteListContainerFragment.OooOoo().OooOo0o(arrayList);
                return;
            case 4:
                o0O0o0oO.o0Oo0oo o0oo0oo2 = ((C30548OooO0O0) obj).f109269OooO0O0;
                if (o0oo0oo2 != null) {
                    o0oo0oo2.onClick(view);
                    return;
                }
                return;
            case 5:
                ((UserSettingFragment) obj).OooOoo0();
                return;
            default:
                EditText editText4 = ((TextUrlLinkDialogFragment) obj).f78412Oooo0;
                if (editText4 != null) {
                    editText4.setText("");
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                    throw null;
                }
        }
    }
}
