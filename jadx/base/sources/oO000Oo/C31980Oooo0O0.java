package oO000Oo;

import androidx.core.app.NotificationCompat;
import com.google.common.base.Preconditions;
import oO000Oo.InterfaceC31948OooOOoo;
import oO0OOo0o.C33094OoooO;

/* JADX INFO: renamed from: oO000Oo.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31980Oooo0O0 extends o00000O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f114199OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oO0OOo0o.o00Oo0 f114200OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC31948OooOOoo.OooO00o f114201OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oO0OOo0o.OooO[] f114202OooO0o0;

    public C31980Oooo0O0(oO0OOo0o.o00Oo0 o00oo02, InterfaceC31948OooOOoo.OooO00o oooO00o, oO0OOo0o.OooO[] oooOArr) {
        Preconditions.checkArgument(!o00oo02.OooO0o(), "error must not be OK");
        this.f114200OooO0OO = o00oo02;
        this.f114201OooO0Oo = oooO00o;
        this.f114202OooO0o0 = oooOArr;
    }

    @Override // oO000Oo.o00000O0, oO000Oo.InterfaceC31946OooOOo
    public final void OooOOO(InterfaceC31948OooOOoo interfaceC31948OooOOoo) {
        Preconditions.checkState(!this.f114199OooO0O0, "already started");
        this.f114199OooO0O0 = true;
        oO0OOo0o.OooO[] oooOArr = this.f114202OooO0o0;
        int length = oooOArr.length;
        int i = 0;
        while (true) {
            oO0OOo0o.o00Oo0 o00oo02 = this.f114200OooO0OO;
            if (i >= length) {
                interfaceC31948OooOOoo.OooO0OO(o00oo02, this.f114201OooO0Oo, new C33094OoooO());
                return;
            } else {
                oooOArr[i].Oooooo(o00oo02);
                i++;
            }
        }
    }

    @Override // oO000Oo.o00000O0, oO000Oo.InterfaceC31946OooOOo
    public final void OooOOO0(C31998OoooOoO c31998OoooOoO) {
        c31998OoooOoO.OooO0O0(this.f114200OooO0OO, "error");
        c31998OoooOoO.OooO0O0(this.f114201OooO0Oo, NotificationCompat.CATEGORY_PROGRESS);
    }

    public C31980Oooo0O0(oO0OOo0o.o00Oo0 o00oo02, oO0OOo0o.OooO[] oooOArr) {
        this(o00oo02, InterfaceC31948OooOOoo.OooO00o.f114034OooOo0o, oooOArr);
    }
}
