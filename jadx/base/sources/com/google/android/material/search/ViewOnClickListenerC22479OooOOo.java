package com.google.android.material.search;

import OooOoo.C20593OooO0Oo;
import Oooo0oO.C21111o0ooOoO;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import androidx.core.content.FileProvider;
import com.orion.notein.p607ui.datasync.CloudSyncDetailsFragment;
import com.orion.notein.p607ui.noteeditor.addpage.AddPageFragment;
import java.io.File;
import java.text.SimpleDateFormat;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.C30022OoooOOo;

/* JADX INFO: renamed from: com.google.android.material.search.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ViewOnClickListenerC22479OooOOo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f67731OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f67732OooOo0o;

    public /* synthetic */ ViewOnClickListenerC22479OooOOo(Object obj, int i) {
        this.f67732OooOo0o = i;
        this.f67731OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Uri uriForFile;
        OooO0o.OooO0O0<Uri> oooO0O0;
        switch (this.f67732OooOo0o) {
            case 0:
                ((SearchView) this.f67731OooOo).lambda$setupWithSearchBar$7(view);
                break;
            case 1:
                androidx.lifecycle.OooOOOO parentFragment = ((CloudSyncDetailsFragment) this.f67731OooOo).getParentFragment();
                CloudSyncDetailsFragment.OooO00o oooO00o = parentFragment instanceof CloudSyncDetailsFragment.OooO00o ? (CloudSyncDetailsFragment.OooO00o) parentFragment : null;
                if (oooO00o != null) {
                    oooO00o.OooOOO();
                }
                break;
            case 2:
                AddPageFragment addPageFragment = (AddPageFragment) this.f67731OooOo;
                String strOooO0O0 = C20593OooO0Oo.OooO0O0("photo-", new SimpleDateFormat("YYMMDDhhmmss").format(Long.valueOf(System.currentTimeMillis())), ".jpg");
                String packageName = addPageFragment.requireActivity().getPackageName();
                if (Build.VERSION.SDK_INT >= 29) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_display_name", strOooO0O0);
                    contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
                    uriForFile = addPageFragment.requireActivity().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                } else {
                    Context contextRequireContext = addPageFragment.requireContext();
                    String strOooO0Oo = C21111o0ooOoO.OooO0Oo(packageName, ".fileProvider");
                    File externalCacheDir = addPageFragment.requireActivity().getExternalCacheDir();
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(externalCacheDir);
                    uriForFile = FileProvider.getUriForFile(contextRequireContext, strOooO0Oo, new File(externalCacheDir.getAbsolutePath(), strOooO0O0));
                }
                addPageFragment.f73805Oooo00O = uriForFile;
                if (uriForFile != null && (oooO0O0 = addPageFragment.f73803Oooo0) != null) {
                    oooO0O0.OooO00o(uriForFile);
                    break;
                }
                break;
            default:
                boolean zIsActivated = view.isActivated();
                C30022OoooOOo c30022OoooOOo = (C30022OoooOOo) this.f67731OooOo;
                if (!zIsActivated) {
                    C29936OooO0oO c29936OooO0oO = c30022OoooOOo.f106713OooOooO;
                    if (c29936OooO0oO != null) {
                        c29936OooO0oO.OooO0OO(11);
                    }
                } else {
                    C29936OooO0oO c29936OooO0oO2 = c30022OoooOOo.f106713OooOooO;
                    if (c29936OooO0oO2 != null) {
                        c29936OooO0oO2.OooO0oo(11);
                    }
                }
                break;
        }
    }
}
