package OooooOo;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.image.ImportImagesFragment;
import java.util.ArrayList;
import java.util.List;
import o00o00.C25206OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: renamed from: OooooOo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21389OooOOoo implements InterfaceC21371OooO, OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f61875OooOo0o;

    public /* synthetic */ C21389OooOOoo(Object obj) {
        this.f61875OooOo0o = obj;
    }

    @Override // OooooOo.InterfaceC21371OooO
    public double OooO00o(double d) {
        C21393OooOo0O c21393OooOo0O = (C21393OooOo0O) this.f61875OooOo0o;
        return d >= c21393OooOo0O.f61895OooO0o0 ? Math.pow((c21393OooOo0O.f61892OooO0O0 * d) + c21393OooOo0O.f61893OooO0OO, c21393OooOo0O.f61891OooO00o) : c21393OooOo0O.f61894OooO0Oo * d;
    }

    @Override // OooO0o.OooO00o
    public void OooO0O0(Object obj) {
        ClipData clipData;
        Uri uri;
        Uri data;
        ActivityResult result = (ActivityResult) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
        ArrayList arrayList = new ArrayList();
        ImportImagesFragment importImagesFragment = (ImportImagesFragment) this.f61875OooOo0o;
        Intent intent = result.f62239OooOo;
        if (intent != null && (data = intent.getData()) != null) {
            String type = importImagesFragment.requireContext().getContentResolver().getType(data);
            if (type != null && C33595OooOOo.OooOoO0(type, "image/", false)) {
                arrayList.add(data);
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
        if (intent != null && (clipData = intent.getClipData()) != null) {
            int itemCount = clipData.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                ClipData.Item itemAt = clipData.getItemAt(i);
                if (itemAt != null && (uri = itemAt.getUri()) != null) {
                    String type2 = importImagesFragment.requireContext().getContentResolver().getType(uri);
                    if (type2 != null && C33595OooOOo.OooOoO0(type2, "image/", false)) {
                        arrayList.add(uri);
                    }
                    C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            InterfaceC32507OooOO0o<? super List<? extends Uri>, C32460OooOooO> interfaceC32507OooOO0o = importImagesFragment.f71858OooOoo0;
            if (interfaceC32507OooOO0o != null) {
                interfaceC32507OooOO0o.invoke(arrayList);
                return;
            }
            return;
        }
        Context context = importImagesFragment.getContext();
        if (context != null) {
            String string = importImagesFragment.getString(R.string.no_file_is_selected);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            C25206OooO0Oo.OooO0oO(context, string);
        }
    }
}
