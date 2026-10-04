package oO0oOoO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: oO0oOoO.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34192OooOo0 implements Iterable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final HashMap f122829OooOo = new HashMap();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayList f122830OooOo0o;

    public C34192OooOo0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC34193OooOo00 abstractC34193OooOo00 = (AbstractC34193OooOo00) it.next();
            AbstractC34191OooOOoo abstractC34191OooOOoo = abstractC34193OooOo00.f122831OooO00o;
            ArrayList arrayList2 = (ArrayList) this.f122829OooOo.get(abstractC34191OooOOoo);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList(1);
                this.f122829OooOo.put(abstractC34191OooOOoo, arrayList2);
            }
            arrayList2.add(abstractC34193OooOo00);
        }
        this.f122830OooOo0o = new ArrayList(arrayList);
    }

    @Override // java.lang.Iterable
    public final Iterator<AbstractC34193OooOo00> iterator() {
        return new ArrayList(this.f122830OooOo0o).iterator();
    }
}
