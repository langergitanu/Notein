package o0Oo0oOo;

import androidx.core.os.BundleKt;
import com.orion.notein.p607ui.creative_library.C23028OooO0Oo;
import com.orion.notein.p607ui.creative_library.CreativeLibraryDetailFragment;
import com.orion.notein.p607ui.creative_library.ImagePreviewDialogFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0Oo0oOo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28313OooO0oo implements InterfaceC32508OooOOOo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ CreativeLibraryDetailFragment f100430OooOo0o;

    public /* synthetic */ C28313OooO0oo(CreativeLibraryDetailFragment creativeLibraryDetailFragment) {
        this.f100430OooOo0o = creativeLibraryDetailFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        kotlin.jvm.internal.OooOOO0.OooO0oO((C23028OooO0Oo.OooO0O0) obj2, "<unused var>");
        CreativeLibraryDetailFragment creativeLibraryDetailFragment = this.f100430OooOo0o;
        List<C23028OooO0Oo.OooO0O0> list = ((C23028OooO0Oo.C19176OooO0Oo) creativeLibraryDetailFragment.OooOoOO().f71011OooOO0O.f121747OooOo0o.getValue()).f71029OooO0OO;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String str = ((C23028OooO0Oo.OooO0O0) it.next()).f71020OooO0OO;
            if (str != null) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (((String) obj3).length() > 0) {
                arrayList2.add(obj3);
            }
        }
        if (!arrayList2.isEmpty()) {
            int iOooO0o = oO0O00oo.OooOO0.OooO0o(iIntValue, 0, arrayList2.size() - 1);
            ImagePreviewDialogFragment imagePreviewDialogFragment = new ImagePreviewDialogFragment();
            imagePreviewDialogFragment.setArguments(BundleKt.bundleOf(new C32443OooOOO("image_urls", new ArrayList(arrayList2)), new C32443OooOOO("start_position", Integer.valueOf(iOooO0o))));
            imagePreviewDialogFragment.show(creativeLibraryDetailFragment.getChildFragmentManager(), "ImagePreviewDialogFragment");
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
