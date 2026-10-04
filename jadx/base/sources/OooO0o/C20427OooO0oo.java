package OooO0o;

import OooO0oO.AbstractC20431OooO00o;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: OooO0o.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20427OooO0oo extends OooO0O0<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AbstractC20425OooO0o0 f58264OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f58265OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ AbstractC20431OooO00o<Object, Object> f58266OooO0OO;

    public C20427OooO0oo(AbstractC20425OooO0o0 abstractC20425OooO0o0, String str, AbstractC20431OooO00o<Object, Object> abstractC20431OooO00o) {
        this.f58264OooO00o = abstractC20425OooO0o0;
        this.f58265OooO0O0 = str;
        this.f58266OooO0OO = abstractC20431OooO00o;
    }

    @Override // OooO0o.OooO0O0
    public final void OooO00o(Object obj) {
        AbstractC20425OooO0o0 abstractC20425OooO0o0 = this.f58264OooO00o;
        LinkedHashMap linkedHashMap = abstractC20425OooO0o0.f58251OooO0O0;
        String str = this.f58265OooO0O0;
        Object obj2 = linkedHashMap.get(str);
        AbstractC20431OooO00o<Object, Object> abstractC20431OooO00o = this.f58266OooO0OO;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC20431OooO00o + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int iIntValue = ((Number) obj2).intValue();
        ArrayList arrayList = abstractC20425OooO0o0.f58253OooO0Oo;
        arrayList.add(str);
        try {
            abstractC20425OooO0o0.OooO0O0(iIntValue, abstractC20431OooO00o, obj);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }

    @Override // OooO0o.OooO0O0
    public final void OooO0O0() {
        this.f58264OooO00o.OooO0o(this.f58265OooO0O0);
    }
}
