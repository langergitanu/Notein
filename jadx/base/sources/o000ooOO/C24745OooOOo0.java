package o000ooOO;

import java.util.Comparator;
import o000OoO.C24536OooO0Oo;
import o000ooOO.OooOOOO;

/* JADX INFO: renamed from: o000ooOO.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24745OooOOo0 implements Comparator {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f83946OooOo0o;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f83946OooOo0o) {
            case 0:
                return C24536OooO0Oo.OooO0O0(((OooOOOO.C24742OooO0Oo) obj).f83942OooO00o, ((OooOOOO.C24742OooO0Oo) obj2).f83942OooO00o);
            default:
                int i = ((int[]) obj)[0];
                int i2 = ((int[]) obj2)[0];
                if (i < i2) {
                    return -1;
                }
                return i == i2 ? 0 : 1;
        }
    }
}
