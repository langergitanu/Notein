package o0OoOOO0;

import Oooo0oO.C21030OooOO0o;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.activity.result.ActivityResult;
import androidx.core.content.MimeTypeFilter;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0OoOo0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.addtext.ImportFontDialogFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o000o0O0.C24587OooOoo;
import o00o00.C25206OooO0Oo;
import o0Oo00o.C28026OooO0OO;
import o0OoOOo.C29153OooOoo;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.C33781o00o0O;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OoOOO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29042OooO0O0 implements OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f102877OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f102878OooOo0o;

    public /* synthetic */ C29042OooO0O0(Fragment fragment, int i) {
        this.f102878OooOo0o = i;
        this.f102877OooOo = fragment;
    }

    @Override // OooO0o.OooO00o
    public final void OooO0O0(Object obj) {
        ClipData clipData;
        Uri data;
        switch (this.f102878OooOo0o) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ImportFontDialogFragment importFontDialogFragment = (ImportFontDialogFragment) this.f102877OooOo;
                if (zBooleanValue) {
                    com.orion.notein.p607ui.noteeditor.addtext.OooO0OO oooO0OOOooOoo = importFontDialogFragment.OooOoo();
                    List listOooOO0o = C34429OooOOo0.OooOO0o("ttf", "otf");
                    C33781o00o0O c33781o00o0O = oooO0OOOooOoo.f74019OooO0oo;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, listOooOO0o);
                } else {
                    C24587OooOoo c24587OooOoo = new C24587OooOoo(false, false, R.id.importFontDialogFragment, true, false, -1, -1, -1, -1);
                    String string = importFontDialogFragment.getString(R.string.request_permission_title_import_pdf);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    String string2 = importFontDialogFragment.getString(R.string.request_permission_content_import_pdf);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                    C28026OooO0OO.OooO0OO(C21030OooOO0o.OooO0OO(importFontDialogFragment), new C29043OooO0OO(string, string2), c24587OooOoo);
                }
                break;
            default:
                ActivityResult result = (ActivityResult) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
                final BaseToolbarChildFragment baseToolbarChildFragment = (BaseToolbarChildFragment) this.f102877OooOo;
                InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: o0o000oo.OooO0o
                    @Override // oO0O000o.InterfaceC32507OooOO0o
                    public final Object invoke(Object obj2) {
                        String mimeTypeFromExtension;
                        Uri uri = (Uri) obj2;
                        kotlin.jvm.internal.OooOOO0.OooO0oO(uri, "uri");
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(uri.getScheme(), FirebaseAnalytics.Param.CONTENT)) {
                            mimeTypeFromExtension = baseToolbarChildFragment.requireContext().getContentResolver().getType(uri);
                        } else {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
                            MimeTypeMap singleton = MimeTypeMap.getSingleton();
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(fileExtensionFromUrl);
                            Locale locale = Locale.getDefault();
                            kotlin.jvm.internal.OooOOO0.OooO0o(locale, "getDefault(...)");
                            String lowerCase = fileExtensionFromUrl.toLowerCase(locale);
                            kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
                            mimeTypeFromExtension = singleton.getMimeTypeFromExtension(lowerCase);
                        }
                        return Boolean.valueOf(MimeTypeFilter.matches(mimeTypeFromExtension, "audio/*"));
                    }
                };
                ArrayList arrayList = new ArrayList();
                Intent intent = result.f62239OooOo;
                if (intent != null && (data = intent.getData()) != null) {
                    if (!((Boolean) interfaceC32507OooOO0o.invoke(data)).booleanValue()) {
                        data = null;
                    }
                    if (data != null) {
                        arrayList.add(data);
                    }
                }
                if (intent != null && (clipData = intent.getClipData()) != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i = 0; i < itemCount; i++) {
                        Uri uri = clipData.getItemAt(i).getUri();
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(uri);
                        if (((Boolean) interfaceC32507OooOO0o.invoke(uri)).booleanValue()) {
                            arrayList.add(uri);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    Context context = baseToolbarChildFragment.getContext();
                    if (context != null) {
                        String string3 = baseToolbarChildFragment.getString(R.string.no_file_is_selected);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
                        C25206OooO0Oo.OooO0oO(context, string3);
                    }
                } else {
                    com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooo000 = baseToolbarChildFragment.Oooo000();
                    C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0oOooo000), null, null, new C29153OooOoo(oooO0oOooo000, arrayList, null), 3);
                }
                break;
        }
    }
}
