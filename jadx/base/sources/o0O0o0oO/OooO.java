package o0O0o0oO;

import com.google.firebase.sessions.C22797OooO0Oo;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.penkit.models.DualLinkRefInfo;
import com.orion.penkit.models.DualLinkSourceInfo;
import com.orion.penkit.models.ImageInfo;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o0O0o00.EnumC25982o0000oO;
import o0O0o0oO.C26020OooO0oo;
import o0O0oooo.C26370OooOOOO;
import o0O0oooo.C26395Oooo0o0;
import oOo000Oo.C34431OooOo0;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO implements C26020OooO0oo.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PDFView f88837OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C26020OooO0oo.OooO00o f88838OooO0O0;

    public OooO(PDFView pDFView, C26020OooO0oo.OooO00o oooO00o) {
        this.f88837OooO00o = pDFView;
        this.f88838OooO0O0 = oooO00o;
    }

    @Override // o0O0o0oO.C26020OooO0oo.OooO00o
    public final void OooO00o(DualLinkRefInfo dualLinkRefInfo) {
        PDFView pDFView = this.f88837OooO00o;
        if (pDFView.f69229o0000oO.f88853OooO0O0.OooO0o()) {
            C26020OooO0oo c26020OooO0oo = pDFView.f69229o0000oO;
            c26020OooO0oo.f88852OooO00o = null;
            c26020OooO0oo.f88853OooO0O0.setVisibility(8);
        }
        ImageInfo imageInfo = (ImageInfo) dualLinkRefInfo.getItem();
        pDFView.OooOO0O(Collections.singletonList(dualLinkRefInfo), Collections.singletonList(imageInfo.copy(imageInfo.getId(), imageInfo.getUri(), imageInfo.getBoundingBox(1.0f), imageInfo.getRotation(), imageInfo.getLayerId(), imageInfo.getCreationTime(), imageInfo.getBitmap(), imageInfo.getFixed())), EnumC25982o0000oO.f88734OooOo);
        C26020OooO0oo.OooO00o oooO00o = this.f88838OooO0O0;
        if (oooO00o != null) {
            oooO00o.OooO00o(dualLinkRefInfo);
        }
    }

    @Override // o0O0o0oO.C26020OooO0oo.OooO00o
    public final void OooO0O0(DualLinkSourceInfo dualLinkSourceInfo) {
        PDFView pDFView = this.f88837OooO00o;
        if (pDFView.f69229o0000oO.f88853OooO0O0.OooO0o()) {
            C26020OooO0oo c26020OooO0oo = pDFView.f69229o0000oO;
            c26020OooO0oo.f88852OooO00o = null;
            c26020OooO0oo.f88853OooO0O0.setVisibility(8);
        }
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
        int itemType = dualLinkSourceInfo.getItemType();
        String id = dualLinkSourceInfo.getId();
        C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
        synchronized (c26395Oooo0o0.f90559OooO0oo) {
            if (itemType == 6) {
                Collection<List<DualLinkSourceInfo>> collectionValues = c26395Oooo0o0.f90569OooOOoo.values();
                kotlin.jvm.internal.OooOOO0.OooO0o(collectionValues, "<get-values>(...)");
                Iterator<T> it = collectionValues.iterator();
                while (it.hasNext()) {
                    List list = (List) it.next();
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(list);
                    C34431OooOo0.OooOoOO(list, new C22797OooO0Oo(id, 1));
                }
            } else if (itemType == 7) {
                Collection<List<DualLinkRefInfo>> collectionValues2 = c26395Oooo0o0.f90572OooOo00.values();
                kotlin.jvm.internal.OooOOO0.OooO0o(collectionValues2, "<get-values>(...)");
                Iterator<T> it2 = collectionValues2.iterator();
                while (it2.hasNext()) {
                    List list2 = (List) it2.next();
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(list2);
                    C34431OooOo0.OooOoOO(list2, new C26370OooOOOO(id, 0));
                }
            }
        }
        pDFView.OoooOo0(dualLinkSourceInfo.getBoundingBox(1.0f));
        C26020OooO0oo.OooO00o oooO00o = this.f88838OooO0O0;
        if (oooO00o != null) {
            oooO00o.OooO0O0(dualLinkSourceInfo);
        }
    }
}
