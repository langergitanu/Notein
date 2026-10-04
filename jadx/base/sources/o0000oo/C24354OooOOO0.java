package o0000oo;

import java.util.ArrayList;

/* JADX INFO: renamed from: o0000oo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C24354OooOOO0 extends C24348OooO0o0 {

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public ArrayList<C24348OooO0o0> f82127oo000o = new ArrayList<>();

    @Override // o0000oo.C24348OooO0o0
    public void OooOoo() {
        this.f82127oo000o.clear();
        super.OooOoo();
    }

    @Override // o0000oo.C24348OooO0o0
    public final void Oooo000(o0000.OooO0OO oooO0OO) {
        super.Oooo000(oooO0OO);
        int size = this.f82127oo000o.size();
        for (int i = 0; i < size; i++) {
            this.f82127oo000o.get(i).Oooo000(oooO0OO);
        }
    }

    public void OoooO0() {
        ArrayList<C24348OooO0o0> arrayList = this.f82127oo000o;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C24348OooO0o0 c24348OooO0o0 = this.f82127oo000o.get(i);
            if (c24348OooO0o0 instanceof C24354OooOOO0) {
                ((C24354OooOOO0) c24348OooO0o0).OoooO0();
            }
        }
    }
}
