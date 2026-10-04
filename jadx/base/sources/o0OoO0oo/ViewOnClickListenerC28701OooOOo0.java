package o0OoO0oo;

import OooOoo.C20593OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import Oooo0oO.C21111o0ooOoO;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupWindow;
import androidx.core.content.FileProvider;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.JumpToPageDialogFragment;
import com.orion.notein.p607ui.noteeditor.addpage.popup.AddThemeBottomSheetDialog;
import com.orion.notein.p607ui.notelist.folder.MoveToFolderFragment;
import com.orion.notein.p607ui.p609vo.FolderVO;
import com.orion.notein.p607ui.paperconfig.MyTemplateFragment;
import com.orion.notein.p607ui.user.firebase.FirebaseUserInfoFragment;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;
import o0Oo00o.C28026OooO0OO;
import o0OoOO.C28985OooO00o;
import o0OoOOO0.C29048OooO0oo;
import oO00ooO.C32460OooOooO;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0OoO0oo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28701OooOOo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101700OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101701OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28701OooOOo0(Object obj, int i) {
        this.f101701OooOo0o = i;
        this.f101700OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(final View view) {
        switch (this.f101701OooOo0o) {
            case 0:
                EditText editText = ((JumpToPageDialogFragment) this.f101700OooOo).f72793Oooo0O0;
                if (editText != null) {
                    editText.setText("");
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                    throw null;
                }
            case 1:
                ((C29048OooO0oo) this.f101700OooOo).getClass();
                return;
            case 2:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.FolderVO");
                FolderVO folderVO = (FolderVO) tag;
                if (folderVO.getSelectable()) {
                    int id = view.getId();
                    MoveToFolderFragment moveToFolderFragment = (MoveToFolderFragment) this.f101700OooOo;
                    if (id == R.id.expand_icon) {
                        moveToFolderFragment.OooOooo().OooO0o(folderVO);
                        return;
                    }
                    C33781o00o0O c33781o00o0O = moveToFolderFragment.OooOooo().f107615OooO0oo;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, folderVO);
                    return;
                }
                return;
            case 3:
                final MyTemplateFragment myTemplateFragment = (MyTemplateFragment) this.f101700OooOo;
                C28985OooO00o c28985OooO00o = myTemplateFragment.f78619OooOooo;
                if (c28985OooO00o == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("addThemeMenu");
                    throw null;
                }
                AddThemeBottomSheetDialog addThemeBottomSheetDialog = c28985OooO00o.f102716OooO0OO;
                if (addThemeBottomSheetDialog != null) {
                    addThemeBottomSheetDialog.dismissAllowingStateLoss();
                } else if (c28985OooO00o.f102718OooO0o0) {
                    PopupWindow popupWindow = c28985OooO00o.f102717OooO0Oo;
                    if (popupWindow == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("popupWindow");
                        throw null;
                    }
                    popupWindow.dismiss();
                }
                myTemplateFragment.OooOoO0(1, new oO0O000o.OooO00o() { // from class: o0o0OOO.OooOOo
                    @Override // oO0O000o.OooO00o
                    public final Object invoke() {
                        Uri uriForFile;
                        int id2 = view.getId();
                        MyTemplateFragment myTemplateFragment2 = myTemplateFragment;
                        switch (id2) {
                            case R.id.item_import_from_camera /* 2131297879 */:
                                String strOooO0O0 = C20593OooO0Oo.OooO0O0("template_photo_", new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis())), ".jpg");
                                String packageName = myTemplateFragment2.requireActivity().getPackageName();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("_display_name", strOooO0O0);
                                    contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
                                    uriForFile = myTemplateFragment2.requireActivity().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                                } else {
                                    Context contextRequireContext = myTemplateFragment2.requireContext();
                                    String strOooO0Oo = C21111o0ooOoO.OooO0Oo(packageName, ".fileProvider");
                                    File externalCacheDir = myTemplateFragment2.requireActivity().getExternalCacheDir();
                                    kotlin.jvm.internal.OooOOO0.OooO0Oo(externalCacheDir);
                                    uriForFile = FileProvider.getUriForFile(contextRequireContext, strOooO0Oo, new File(externalCacheDir.getAbsolutePath(), strOooO0O0));
                                }
                                myTemplateFragment2.f78637OoooOOo = uriForFile;
                                myTemplateFragment2.f78639OoooOoO.OooO00o(uriForFile);
                                break;
                            case R.id.item_import_from_gallery /* 2131297880 */:
                                myTemplateFragment2.f78638OoooOo0.OooO00o(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI));
                                break;
                            case R.id.item_import_from_pdf /* 2131297881 */:
                                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(myTemplateFragment2), new C30492Oooo());
                                break;
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                });
                return;
            default:
                C21030OooOO0o.OooO0OO((FirebaseUserInfoFragment) this.f101700OooOo).OooOOo0();
                return;
        }
    }
}
