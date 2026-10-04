package o0Ooo;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.o0OoOo0;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.AGConnectOptionsBuilder;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import com.orion.notein.p607ui.notelist.folder.ItemDataOfMovingToFolder;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.user.FirstTimeUserTipsDialogFragment;
import java.util.ArrayList;
import java.util.List;
import o0O0oooO.C26320o0000OoO;
import o0O0oooO.C26322o0000o;
import o0OOo0o.C27330OooO0o0;
import o0Oo00o.C28026OooO0OO;
import o0o0O.C30174OooO00o;
import o0o0O0.C30183OooO0oo;
import o0o0O00.C30201OooOOO0;
import oO00ooO.C32443OooOOO;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Ooo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29256OooO0Oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103751OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103752OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29256OooO0Oo(Object obj, int i) {
        this.f103752OooOo0o = i;
        this.f103751OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C30201OooOOO0 c30201OooOOO0;
        Object obj = this.f103751OooOo;
        switch (this.f103752OooOo0o) {
            case 0:
                int i = PenBoxChildFragment.f75355o0000Ooo;
                ((PenBoxChildFragment) obj).Oooo0OO().OooO0OO();
                break;
            case 1:
                C30183OooO0oo c30183OooO0oo = (C30183OooO0oo) obj;
                NoteVO noteVO = c30183OooO0oo.f107461OooO0O0;
                if (noteVO != null && (c30201OooOOO0 = c30183OooO0oo.f107462OooO0OO) != null) {
                    o0o0O0.OooO oooO = c30201OooOOO0.f107552OooO0o0;
                    if (oooO != null) {
                        oooO.OooO00o();
                    }
                    List<NoteVO> listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(noteVO);
                    ArrayList arrayList = new ArrayList();
                    for (NoteVO noteVO2 : listOooO0oO) {
                        int type = noteVO2.getType();
                        ItemDataOfMovingToFolder itemDataOfMovingToFolder = type != 0 ? type != 1 ? null : new ItemDataOfMovingToFolder(null, noteVO2.getId(), noteVO2.getType(), 1) : new ItemDataOfMovingToFolder(noteVO2.getId(), null, noteVO2.getType(), 2);
                        if (itemDataOfMovingToFolder != null) {
                            arrayList.add(itemDataOfMovingToFolder);
                        }
                    }
                    ItemDataOfMovingToFolder[] itemDataOfMovingToFolderArr = (ItemDataOfMovingToFolder[]) arrayList.toArray(new ItemDataOfMovingToFolder[0]);
                    if (itemDataOfMovingToFolderArr.length == 0) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("DefaultNoteMoreActionListener");
                        c20358OooO00o.OooOO0O("move vo: " + noteVO + " to folder failed.", new Object[0]);
                    } else {
                        Bundle bundleBundleOf = BundleKt.bundleOf(new C32443OooOOO("itemDataList", itemDataOfMovingToFolderArr));
                        Fragment fragment = c30201OooOOO0.f107547OooO00o;
                        Context contextRequireContext = fragment.requireContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                        C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(fragment), o0oo000O.OooOO0O.OooO00o(contextRequireContext) ? R.id.moveToFolderDialogFragment : R.id.moveToFolderBottomSheetFragment, bundleBundleOf);
                    }
                    break;
                }
                break;
            case 2:
                FirstTimeUserTipsDialogFragment firstTimeUserTipsDialogFragment = (FirstTimeUserTipsDialogFragment) obj;
                C22026ooOO c22026ooOO = firstTimeUserTipsDialogFragment.f79606OooOoo0;
                ((C26320o0000OoO) c22026ooOO.getValue()).OooO();
                C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) c22026ooOO.getValue();
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c26320o0000OoO);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C26322o0000o(null, c26320o0000OoO), 2);
                ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = firstTimeUserTipsDialogFragment.requireActivity();
                kotlin.jvm.internal.OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity(...)");
                Context applicationContext = activityC21897OooOo0RequireActivity.getApplicationContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(applicationContext, "getApplicationContext(...)");
                if (!C33599OooOo0O.OooOoOO("google_play", "google", true)) {
                    try {
                        AGConnectOptionsBuilder aGConnectOptionsBuilder = new AGConnectOptionsBuilder();
                        aGConnectOptionsBuilder.setClientId("877426572510907200");
                        aGConnectOptionsBuilder.setClientSecret("5634E66AB511919A73A23C6A22C22759F632E8ADEC120C08DA16998C5E0373E5");
                        aGConnectOptionsBuilder.setApiKey("DAEDAONTzLoJz/cNfYbw0H7kpxzw6abq6ijtLLh19SnmfB4Q0tJf/t49ohqdU3qj9sHW8ITWPhDArXTKlwzvriRE/TTEa/LC6XOhSA==");
                        aGConnectOptionsBuilder.setCPId("150086000024718368");
                        aGConnectOptionsBuilder.setProductId("99536292102212507");
                        aGConnectOptionsBuilder.setAppId("106051125");
                        AGConnectInstance.initialize(applicationContext, aGConnectOptionsBuilder);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                C27330OooO0o0.OooO00o(activityC21897OooOo0RequireActivity, true);
                firstTimeUserTipsDialogFragment.dismiss();
                break;
            default:
                TextRecognizeFragment textRecognizeFragment = (TextRecognizeFragment) obj;
                C30174OooO00o c30174OooO00o = textRecognizeFragment.f78198o00O0O;
                if (c30174OooO00o != null) {
                    c30174OooO00o.OooO00o();
                }
                switch (view.getId()) {
                    case R.id.item_camera /* 2131297858 */:
                        TextRecognizeFragment.Oooo0O0(textRecognizeFragment, 2, false, 2);
                        break;
                    case R.id.item_gallery /* 2131297877 */:
                        TextRecognizeFragment.Oooo0O0(textRecognizeFragment, 0, false, 2);
                        break;
                    case R.id.item_note /* 2131297888 */:
                        TextRecognizeFragment.Oooo0O0(textRecognizeFragment, 3, false, 2);
                        break;
                    case R.id.item_pdf /* 2131297893 */:
                        textRecognizeFragment.Oooo0(1, false, false);
                        break;
                    case R.id.item_pdf_page /* 2131297894 */:
                        TextRecognizeFragment.Oooo0O0(textRecognizeFragment, 1, false, 2);
                        break;
                }
                break;
        }
    }
}
