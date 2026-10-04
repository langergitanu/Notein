package o0Oo0ooO;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.MainActivity;
import com.orion.notein.domain.models.ocr.AiOcrSession;
import com.orion.notein.domain.models.ocr.AiOcrSessionInputSource;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.backup.ImportLocalDataDialogFragment;
import com.orion.notein.p607ui.label.OooO0OO;
import com.orion.notein.p607ui.login.thirdparty.LoginByThirdPartyChildFragment;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import com.orion.notein.p607ui.notelist.about.UserAboutDialogFragment;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.ocr.view.AiOcrEditorListContainer;
import com.orion.notein.p607ui.p609vo.TiledPagePreviewVO;
import com.orion.notein.p607ui.pageeditor.TiledPageListFragment;
import com.orion.notein.p607ui.user.UserInfoFragment;
import com.orion.notein.ui.backup.ImportLocalDataDialogFragment.OooO0O0;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.HashSet;
import java.util.concurrent.CancellationException;
import o0Oo00o.C28026OooO0OO;
import o0OoO0OO.C28615OooOOO0;
import o0o0O00.C30185OooO00o;
import o0o0OO.C30367OooO0o0;
import o0o0OO0O.C30449OooOooO;
import oO00ooO.C32443OooOOO;
import oO0Oo.C33187OooOooo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.o00000OO;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0Oo0ooO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28413OooO0oO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100717OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100718OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28413OooO0oO(Object obj, int i) {
        this.f100718OooOo0o = i;
        this.f100717OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f100717OooOo;
        switch (this.f100718OooOo0o) {
            case 0:
                OooO0OO.InterfaceC19211OooO0OO interfaceC19211OooO0OO = ((com.orion.notein.p607ui.label.OooO0OO) obj).f71972OooO0O0;
                if (interfaceC19211OooO0OO != null) {
                    interfaceC19211OooO0OO.OooO0o();
                }
                break;
            case 1:
                LoginByThirdPartyChildFragment loginByThirdPartyChildFragment = (LoginByThirdPartyChildFragment) obj;
                if (loginByThirdPartyChildFragment.f72578OooOo0o.OooO0OO()) {
                    o00000OO o00000oo2 = loginByThirdPartyChildFragment.f72582OooOoo;
                    if (o00000oo2 != null) {
                        o00000oo2.cancel((CancellationException) null);
                    }
                    loginByThirdPartyChildFragment.f72582OooOoo = C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(loginByThirdPartyChildFragment), null, null, new C28615OooOOO0(loginByThirdPartyChildFragment, null), 3);
                    break;
                }
                break;
            case 2:
                int i = PenBoxChildFragment.f75355o0000Ooo;
                ((PenBoxChildFragment) obj).Oooo0o().OooOO0O(DrawToolFactory.ERASER_TYPE_LASSO);
                break;
            case 3:
                ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = ((C30185OooO00o) obj).f107468OooO0O0.f107495OooO00o.requireActivity();
                kotlin.jvm.internal.OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity(...)");
                ((MainActivity) activityC21897OooOo0RequireActivity).openDrawer();
                break;
            case 4:
                TiledPageListFragment tiledPageListFragment = (TiledPageListFragment) obj;
                if (view.getId() != R.id.btn_add_page) {
                    Object tag = view.getTag();
                    kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.TiledPagePreviewVO");
                    TiledPagePreviewVO tiledPagePreviewVO = (TiledPagePreviewVO) tag;
                    if (view.getId() == R.id.f57988tn) {
                        if (!tiledPagePreviewVO.getSelectable()) {
                            int index = tiledPagePreviewVO.getIndex();
                            String str = (String) tiledPageListFragment.OooOoO().f108338OooOOOO.getValue();
                            InterfaceC21987OooOoo viewLifecycleOwner = tiledPageListFragment.getViewLifecycleOwner();
                            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new o0o0OO0O.Oooo000(tiledPageListFragment, index, str, null), 3);
                        } else if (!tiledPagePreviewVO.isSelected()) {
                            tiledPageListFragment.OooOoO().OooO0oo(tiledPagePreviewVO.getId());
                        } else {
                            C30367OooO0o0 c30367OooO0o0OooOoO = tiledPageListFragment.OooOoO();
                            String id = tiledPagePreviewVO.getId();
                            kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
                            C33781o00o0O c33781o00o0O = c30367OooO0o0OooOoO.f108340OooOOo;
                            HashSet hashSet = new HashSet((HashSet) c33781o00o0O.getValue());
                            hashSet.remove(id);
                            c33781o00o0O.OooOO0(null, hashSet);
                        }
                    }
                } else {
                    InterfaceC21987OooOoo viewLifecycleOwner2 = tiledPageListFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new C30449OooOooO(tiledPageListFragment, null), 3);
                }
                break;
            case 5:
                int i2 = AiOcrEditorListContainer.f78420OoooOOO;
                ((AiOcrEditorListContainer) obj).OooO0O0(1, Boolean.valueOf(!view.isActivated()));
                break;
            case 6:
                UserInfoFragment userInfoFragment = (UserInfoFragment) obj;
                Context contextRequireContext = userInfoFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                if (!o0oo000O.OooOO0O.OooO00o(contextRequireContext)) {
                    C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(userInfoFragment), R.id.aboutFragment, null);
                } else {
                    new UserAboutDialogFragment().show(userInfoFragment.getParentFragmentManager(), "UserAboutDialogFragment");
                }
                break;
            case 7:
                ImportLocalDataDialogFragment importLocalDataDialogFragment = (ImportLocalDataDialogFragment) obj;
                InterfaceC21987OooOoo viewLifecycleOwner3 = importLocalDataDialogFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner3), null, null, importLocalDataDialogFragment.new OooO0O0(null), 3);
                break;
            default:
                TextRecognizeFragment textRecognizeFragment = (TextRecognizeFragment) obj;
                AiOcrSession aiOcrSession = (AiOcrSession) textRecognizeFragment.Oooo00O().f108506OooOOo0.f121747OooOo0o.getValue();
                if (aiOcrSession != null) {
                    AiOcrSessionInputSource input = aiOcrSession.getInputSource();
                    C32443OooOOO c32443OooOOO = (C32443OooOOO) textRecognizeFragment.Oooo00O().f108501OooOOO.f121747OooOo0o.getValue();
                    int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
                    ((Number) c32443OooOOO.f116637OooOo).intValue();
                    if (iIntValue > 0) {
                        int i3 = textRecognizeFragment.Oooo00O().f108500OooOO0o;
                        kotlin.jvm.internal.OooOOO0.OooO0oO(input, "input");
                        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(textRecognizeFragment), new C33187OooOooo(input, i3));
                    } else {
                        textRecognizeFragment.Oooo00o(true);
                    }
                    break;
                }
                break;
        }
    }
}
