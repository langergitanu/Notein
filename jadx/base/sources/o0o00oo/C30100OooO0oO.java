package o0o00oo;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.widget.C21532OooOOo;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment.C23644OooO0Oo;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.ArrayList;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o00oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C30100OooO0oO implements InterfaceC32508OooOOOo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f107171OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f107172OooOo0o;

    public /* synthetic */ C30100OooO0oO(Object obj, int i) {
        this.f107172OooOo0o = i;
        this.f107171OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Object obj, Object obj2) {
        Object obj3 = this.f107171OooOo;
        switch (this.f107172OooOo0o) {
            case 0:
                String requestKey = (String) obj;
                Bundle bundle = (Bundle) obj2;
                kotlin.jvm.internal.OooOOO0.OooO0oO(requestKey, "requestKey");
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteListContainerFragment");
                int i = Build.VERSION.SDK_INT;
                c20358OooO00o.OooO00o(C21532OooOOo.OooO0OO(i, "setFragmentResultListener, Build.VERSION.SDK_INT: "), new Object[0]);
                ArrayList parcelableArrayList = i >= 33 ? bundle.getParcelableArrayList("pdf_uri_list", Uri.class) : bundle.getParcelableArrayList("pdf_uri_list");
                c20358OooO00o.OooO00o("setFragmentResultListener: " + requestKey + ", " + parcelableArrayList, new Object[0]);
                if (parcelableArrayList != null) {
                    NoteListContainerFragment noteListContainerFragment = (NoteListContainerFragment) obj3;
                    C33609OooO0oo.OooO0OO(OooO0O0.OooO0o.OooO00o(noteListContainerFragment, "getViewLifecycleOwner(...)"), null, null, noteListContainerFragment.new C23644OooO0Oo(parcelableArrayList, null), 3);
                } else {
                    Log.d("NoteListContainerFragment", "key 'pdf_uri_list' not exist");
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                }
                return C32460OooOooO.f116667OooO00o;
            default:
                return Integer.valueOf(((com.orion.notein.p607ui.p609vo.OooO00o) obj3).f80099OooOo.invoke(((NoteVO) obj).mapToSortVO(), ((NoteVO) obj2).mapToSortVO()).intValue());
        }
    }
}
