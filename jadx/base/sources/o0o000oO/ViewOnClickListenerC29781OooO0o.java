package o0o000oO;

import android.view.View;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.facebook.soloader.OooOo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.noteeditor.OooO0OO;
import com.orion.notein.p607ui.noteeditor.textstylebar.TextStyleBarChildFragment;
import com.orion.notein.p607ui.ocr.view.AiOcrEditorListContainer;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.pageeditor.TiledPageListContainerFragment;
import com.orion.notein.p607ui.user.FirstTimeUserTipsDialogFragment;
import o0o0O0.C30183OooO0oo;
import o0o0O00.C30201OooOOO0;
import o0o0O00.C30204OooOOo;
import o0o0OO0O.C30438OooOOo;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o000oO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29781OooO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f105690OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f105691OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29781OooO0o(Object obj, int i) {
        this.f105691OooOo0o = i;
        this.f105690OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final C30201OooOOO0 c30201OooOOO0;
        Object obj = this.f105690OooOo;
        switch (this.f105691OooOo0o) {
            case 0:
                TextStyleBarChildFragment textStyleBarChildFragment = (TextStyleBarChildFragment) obj;
                textStyleBarChildFragment.OooOooO(!(((com.orion.notein.p607ui.noteeditor.OooO0OO) textStyleBarChildFragment.f76430OooOoo0.getValue()).f73422o00Ooo.f121747OooOo0o.getValue() == OooO0OO.OooO00o.f73440OooOo));
                break;
            case 1:
                C30183OooO0oo c30183OooO0oo = (C30183OooO0oo) obj;
                final NoteVO noteVO = c30183OooO0oo.f107461OooO0O0;
                if (noteVO != null && (c30201OooOOO0 = c30183OooO0oo.f107462OooO0OO) != null) {
                    o0o0O0.OooO oooO = c30201OooOOO0.f107552OooO0o0;
                    if (oooO != null) {
                        oooO.OooO00o();
                    }
                    int type = noteVO.getType();
                    Fragment fragment = c30201OooOOO0.f107547OooO00o;
                    if (type == 0) {
                        LockNoteFragment lockNoteFragmentInvoke = c30201OooOOO0.f107548OooO0O0.invoke();
                        InterfaceC21987OooOoo viewLifecycleOwner = fragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        LockNoteFragment.OooOoo(lockNoteFragmentInvoke, C21989OooOooO.OooO00o(viewLifecycleOwner), OooOo.OooO0oO(noteVO.getId()), new oO0O000o.OooO00o() { // from class: o0o0O00.OooOO0
                            @Override // oO0O000o.OooO00o
                            public final Object invoke() {
                                C30201OooOOO0 c30201OooOOO02 = c30201OooOOO0;
                                InterfaceC21987OooOoo viewLifecycleOwner2 = c30201OooOOO02.f107547OooO00o.getViewLifecycleOwner();
                                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                                androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner2);
                                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                                C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30205OooOOo0(noteVO, null, c30201OooOOO02), 2);
                                return C32460OooOooO.f116667OooO00o;
                            }
                        });
                    } else if (type == 1) {
                        InterfaceC21987OooOoo viewLifecycleOwner2 = fragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                        androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner2);
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30204OooOOo(noteVO, null, c30201OooOOO0), 2);
                    } else {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("DefaultNoteMoreActionListener");
                        c20358OooO00o.OooO0OO(C21532OooOOo.OooO0OO(noteVO.getType(), "onDelete, invalid type: "), new Object[0]);
                    }
                    break;
                }
                break;
            case 2:
                TiledPageListContainerFragment tiledPageListContainerFragment = (TiledPageListContainerFragment) obj;
                InterfaceC21987OooOoo viewLifecycleOwner3 = tiledPageListContainerFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner3), null, null, new C30438OooOOo(tiledPageListContainerFragment, null), 3);
                break;
            case 3:
                int i = AiOcrEditorListContainer.f78420OoooOOO;
                AiOcrEditorListContainer aiOcrEditorListContainer = (AiOcrEditorListContainer) obj;
                switch (view.getId()) {
                    case R.id.btn_text_align_center /* 2131296951 */:
                        if (!view.isActivated()) {
                            aiOcrEditorListContainer.OooO0O0(8, Boolean.TRUE);
                        } else {
                            aiOcrEditorListContainer.OooO0O0(7, Boolean.TRUE);
                        }
                        break;
                    case R.id.btn_text_align_left /* 2131296952 */:
                        aiOcrEditorListContainer.OooO0O0(7, Boolean.TRUE);
                        break;
                    case R.id.btn_text_align_right /* 2131296954 */:
                        if (!view.isActivated()) {
                            aiOcrEditorListContainer.OooO0O0(9, Boolean.TRUE);
                        } else {
                            aiOcrEditorListContainer.OooO0O0(7, Boolean.TRUE);
                        }
                        break;
                    case R.id.btn_text_bold /* 2131296955 */:
                        aiOcrEditorListContainer.OooO0O0(0, Boolean.valueOf(!view.isActivated()));
                        break;
                    case R.id.btn_text_bullet /* 2131296956 */:
                        aiOcrEditorListContainer.OooO0O0(3, Boolean.valueOf(!view.isActivated()));
                        break;
                    case R.id.btn_text_heading_1 /* 2131296960 */:
                        if (!view.isActivated()) {
                            aiOcrEditorListContainer.OooO0O0(19, 1);
                        } else {
                            aiOcrEditorListContainer.OooO0O0(19, 0);
                        }
                        break;
                    case R.id.btn_text_heading_2 /* 2131296961 */:
                        if (!view.isActivated()) {
                            aiOcrEditorListContainer.OooO0O0(19, 2);
                        } else {
                            aiOcrEditorListContainer.OooO0O0(19, 0);
                        }
                        break;
                    case R.id.btn_text_heading_3 /* 2131296962 */:
                        if (!view.isActivated()) {
                            aiOcrEditorListContainer.OooO0O0(19, 3);
                        } else {
                            aiOcrEditorListContainer.OooO0O0(19, 0);
                        }
                        break;
                    case R.id.btn_text_heading_body /* 2131296963 */:
                        aiOcrEditorListContainer.OooO0O0(19, 0);
                        break;
                    case R.id.btn_text_italic /* 2131296965 */:
                        aiOcrEditorListContainer.OooO0O0(1, Boolean.valueOf(!view.isActivated()));
                        break;
                    case R.id.btn_text_number /* 2131296967 */:
                        aiOcrEditorListContainer.OooO0O0(4, Boolean.valueOf(!view.isActivated()));
                        break;
                    case R.id.btn_text_strikethrough /* 2131296969 */:
                        aiOcrEditorListContainer.OooO0O0(14, Boolean.valueOf(!view.isActivated()));
                        break;
                    case R.id.btn_text_underline /* 2131296971 */:
                        aiOcrEditorListContainer.OooO0O0(2, Boolean.valueOf(!view.isActivated()));
                        break;
                }
                break;
            default:
                ActivityC21897OooOo0 activity = ((FirstTimeUserTipsDialogFragment) obj).getActivity();
                if (activity != null) {
                    activity.finish();
                }
                break;
        }
    }
}
