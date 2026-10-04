package o00oO0O;

import Oooo0oO.o000000O;
import OoooOOo.C21212OooOoO0;
import androidx.compose.p002ui.platform.AndroidComposeView;
import kotlin.jvm.internal.C24039Oooo0o0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o00oO0O.o00oO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25545o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C21212OooOoO0 f87129OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oo000o f87130OooO0O0 = oo000o.f87135OooOo0o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00O0O f87131OooO0OO = o00O0O.f87125OooOo0o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00Oo0 f87132OooO0Oo = o00Oo0.f87126OooOo0o;

    public C25545o00oO0o(AndroidComposeView.OooOOO0 oooOOO0) {
        this.f87129OooO00o = new C21212OooOoO0(oooOOO0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: all -> 0x009c, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x000f, B:6:0x0016, B:7:0x0019, B:13:0x0028, B:15:0x002c, B:10:0x0023), top: B:35:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T extends InterfaceC25543Ooooooo> void OooO00o(T target, InterfaceC32507OooOO0o<? super T, C32460OooOooO> onChanged, oO0O000o.OooO00o<C32460OooOooO> oooO00o) {
        C21212OooOoO0.OooO00o oooO00o2;
        C21212OooOoO0.OooO00o oooO00o3;
        kotlin.jvm.internal.OooOOO0.OooO0oO(target, "target");
        kotlin.jvm.internal.OooOOO0.OooO0oO(onChanged, "onChanged");
        C21212OooOoO0 c21212OooOoO0 = this.f87129OooO00o;
        synchronized (c21212OooOoO0.f61533OooO0o) {
            Oooo.OooO0O0<C21212OooOoO0.OooO00o> oooO0O0 = c21212OooOoO0.f61533OooO0o;
            int i = oooO0O0.f59746OooOoO0;
            if (i > 0) {
                C21212OooOoO0.OooO00o[] oooO00oArr = oooO0O0.f59745OooOo0o;
                int i2 = 0;
                do {
                    oooO00o2 = oooO00oArr[i2];
                    if (oooO00o2.f61538OooO00o == onChanged) {
                        break;
                    } else {
                        i2++;
                    }
                } while (i2 < i);
                oooO00o2 = null;
                oooO00o3 = oooO00o2;
                if (oooO00o3 == null) {
                    C24039Oooo0o0.OooO0o0(1, onChanged);
                    oooO00o3 = new C21212OooOoO0.OooO00o(onChanged);
                    oooO0O0.OooO0O0(oooO00o3);
                }
            } else {
                oooO00o2 = null;
                oooO00o3 = oooO00o2;
                if (oooO00o3 == null) {
                }
            }
        }
        C21212OooOoO0.OooO00o oooO00o4 = c21212OooOoO0.f61536OooO0oo;
        long j = c21212OooOoO0.f61528OooO;
        if (j == -1 || j == Thread.currentThread().getId()) {
            try {
                c21212OooOoO0.f61536OooO0oo = oooO00o3;
                c21212OooOoO0.f61528OooO = Thread.currentThread().getId();
                oooO00o3.OooO00o(target, c21212OooOoO0.f61534OooO0o0, oooO00o);
                return;
            } finally {
                c21212OooOoO0.f61536OooO0oo = oooO00o4;
                c21212OooOoO0.f61528OooO = j;
            }
        }
        StringBuilder sbOooO00o = o0OoOo0.OooO00o(j, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
        sbOooO00o.append(Thread.currentThread().getId());
        sbOooO00o.append(", name=");
        sbOooO00o.append(Thread.currentThread().getName());
        sbOooO00o.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        o000000O.OooO0O0(sbOooO00o.toString());
        throw null;
    }
}
