package OooOo;

import o000oo0o.C24717OooOO0O;

/* JADX INFO: renamed from: OooOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20473OooO0Oo<E> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public E[] f58466OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f58467OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f58468OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f58469OooO0Oo;

    public final void OooO00o(C24717OooOO0O c24717OooOO0O) {
        E[] eArr = this.f58466OooO00o;
        int i = this.f58468OooO0OO;
        eArr[i] = c24717OooOO0O;
        int i2 = this.f58469OooO0Oo & (i + 1);
        this.f58468OooO0OO = i2;
        int i3 = this.f58467OooO0O0;
        if (i2 == i3) {
            int length = eArr.length;
            int i4 = length - i3;
            int i5 = length << 1;
            if (i5 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            E[] eArr2 = (E[]) new Object[i5];
            Oooo.OooO0OO.OooO0oo(eArr, 0, eArr2, i3, length);
            Oooo.OooO0OO.OooO0oo(this.f58466OooO00o, i4, eArr2, 0, this.f58467OooO0O0);
            this.f58466OooO00o = eArr2;
            this.f58467OooO0O0 = 0;
            this.f58468OooO0OO = length;
            this.f58469OooO0Oo = i5 - 1;
        }
    }
}
