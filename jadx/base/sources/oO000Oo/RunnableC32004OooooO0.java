package oO000Oo;

import java.net.SocketAddress;
import java.util.List;
import java.util.concurrent.TimeUnit;
import oO000Oo.C31999OoooOoo;

/* JADX INFO: renamed from: oO000Oo.OooooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC32004OooooO0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C31999OoooOoo f114296OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ List f114297OooOo0o;

    /* JADX INFO: renamed from: oO000Oo.OooooO0$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C31999OoooOoo c31999OoooOoo = RunnableC32004OooooO0.this.f114296OooOo;
            o000000 o000000Var = c31999OoooOoo.f114268OooOOo;
            c31999OoooOoo.f114269OooOOo0 = null;
            c31999OoooOoo.f114268OooOOo = null;
            o000000Var.OooO0o(oO0OOo0o.o00Oo0.f119725OooOOOO.OooO0oo("InternalSubchannel closed transport due to address change"));
        }
    }

    public RunnableC32004OooooO0(C31999OoooOoo c31999OoooOoo, List list) {
        this.f114296OooOo = c31999OoooOoo;
        this.f114297OooOo0o = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C31999OoooOoo.OooO0O0 oooO0O0;
        C31999OoooOoo.C32000OooO0Oo c32000OooO0Oo = this.f114296OooOo.f114263OooOO0o;
        SocketAddress socketAddress = c32000OooO0Oo.f114283OooO00o.get(c32000OooO0Oo.f114284OooO0O0).f119587OooO00o.get(c32000OooO0Oo.f114285OooO0OO);
        C31999OoooOoo.C32000OooO0Oo c32000OooO0Oo2 = this.f114296OooOo.f114263OooOO0o;
        c32000OooO0Oo2.f114283OooO00o = this.f114297OooOo0o;
        c32000OooO0Oo2.OooO00o();
        this.f114296OooOo.f114265OooOOO0 = this.f114297OooOo0o;
        oO0OOo0o.OooOOO oooOOO = this.f114296OooOo.f114275OooOo0o.f119560OooO00o;
        oO0OOo0o.OooOOO oooOOO2 = oO0OOo0o.OooOOO.f119552OooOo;
        if (oooOOO == oooOOO2 || this.f114296OooOo.f114275OooOo0o.f119560OooO00o == oO0OOo0o.OooOOO.f119553OooOo0o) {
            C31999OoooOoo.C32000OooO0Oo c32000OooO0Oo3 = this.f114296OooOo.f114263OooOO0o;
            int i = 0;
            while (true) {
                if (i < c32000OooO0Oo3.f114283OooO00o.size()) {
                    int iIndexOf = c32000OooO0Oo3.f114283OooO00o.get(i).f119587OooO00o.indexOf(socketAddress);
                    if (iIndexOf != -1) {
                        c32000OooO0Oo3.f114284OooO0O0 = i;
                        c32000OooO0Oo3.f114285OooO0OO = iIndexOf;
                        break;
                    }
                    i++;
                } else if (this.f114296OooOo.f114275OooOo0o.f119560OooO00o == oooOOO2) {
                    oooO0O0 = this.f114296OooOo.f114274OooOo0O;
                    this.f114296OooOo.f114274OooOo0O = null;
                    this.f114296OooOo.f114263OooOO0o.OooO00o();
                    C31999OoooOoo.OooO0oO(this.f114296OooOo, oO0OOo0o.OooOOO.f119554OooOoO);
                } else {
                    this.f114296OooOo.f114272OooOo0.OooO0o(oO0OOo0o.o00Oo0.f119725OooOOOO.OooO0oo("InternalSubchannel closed pending transport due to address change"));
                    C31999OoooOoo c31999OoooOoo = this.f114296OooOo;
                    c31999OoooOoo.f114272OooOo0 = null;
                    c31999OoooOoo.f114263OooOO0o.OooO00o();
                    C31999OoooOoo.OooO0oo(this.f114296OooOo);
                }
            }
            oooO0O0 = null;
        } else {
            oooO0O0 = null;
        }
        if (oooO0O0 != null) {
            C31999OoooOoo c31999OoooOoo2 = this.f114296OooOo;
            if (c31999OoooOoo2.f114269OooOOo0 != null) {
                c31999OoooOoo2.f114268OooOOo.OooO0o(oO0OOo0o.o00Oo0.f119725OooOOOO.OooO0oo("InternalSubchannel closed transport early due to address change"));
                this.f114296OooOo.f114269OooOOo0.OooO00o();
                C31999OoooOoo c31999OoooOoo3 = this.f114296OooOo;
                c31999OoooOoo3.f114269OooOOo0 = null;
                c31999OoooOoo3.f114268OooOOo = null;
            }
            C31999OoooOoo c31999OoooOoo4 = this.f114296OooOo;
            c31999OoooOoo4.f114268OooOOo = oooO0O0;
            c31999OoooOoo4.f114269OooOOo0 = c31999OoooOoo4.f114262OooOO0O.OooO0OO(new OooO00o(), 5L, TimeUnit.SECONDS, c31999OoooOoo4.f114257OooO0o);
        }
    }
}
