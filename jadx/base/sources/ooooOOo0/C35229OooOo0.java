package ooooOOo0;

import java.io.IOException;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: ooooOOo0.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35229OooOo0 extends AbstractC35231OooOo0O<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AbstractC35231OooOo0O f126497OooO00o;

    public C35229OooOo0(AbstractC35231OooOo0O abstractC35231OooOo0O) {
        this.f126497OooO00o = abstractC35231OooOo0O;
    }

    @Override // ooooOOo0.AbstractC35231OooOo0O
    public final void OooO00o(C35228OooOo c35228OooOo, Object obj) throws IOException {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f126497OooO00o.OooO00o(c35228OooOo, Array.get(obj, i));
        }
    }
}
