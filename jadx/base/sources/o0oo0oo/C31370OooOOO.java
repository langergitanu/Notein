package o0oo0oo;

import java.util.Comparator;
import java.util.List;
import o0oo0oo.C31372OooOOOO;

/* JADX INFO: renamed from: o0oo0oo.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31370OooOOO implements Comparator<C31372OooOOOO.C31373OooO0Oo> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ List f112012OooOo0o;

    public C31370OooOOO(List list) {
        this.f112012OooOo0o = list;
    }

    @Override // java.util.Comparator
    public final int compare(C31372OooOOOO.C31373OooO0Oo c31373OooO0Oo, C31372OooOOOO.C31373OooO0Oo c31373OooO0Oo2) {
        String str = c31373OooO0Oo.f112030OooO00o;
        List list = this.f112012OooOo0o;
        int iIndexOf = list.indexOf(str);
        int iIndexOf2 = list.indexOf(c31373OooO0Oo2.f112030OooO00o);
        if (iIndexOf < iIndexOf2) {
            return -1;
        }
        return iIndexOf == iIndexOf2 ? 0 : 1;
    }
}
