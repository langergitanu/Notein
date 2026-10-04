package ooooOOo0;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: ooooOOo0.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35230OooOo00 extends AbstractC35231OooOo0O<Iterable<Object>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AbstractC35231OooOo0O f126498OooO00o;

    public C35230OooOo00(AbstractC35231OooOo0O abstractC35231OooOo0O) {
        this.f126498OooO00o = abstractC35231OooOo0O;
    }

    @Override // ooooOOo0.AbstractC35231OooOo0O
    public final void OooO00o(C35228OooOo c35228OooOo, Iterable<Object> iterable) throws IOException {
        Iterable<Object> iterable2 = iterable;
        if (iterable2 == null) {
            return;
        }
        Iterator<Object> it = iterable2.iterator();
        while (it.hasNext()) {
            this.f126498OooO00o.OooO00o(c35228OooOo, it.next());
        }
    }
}
