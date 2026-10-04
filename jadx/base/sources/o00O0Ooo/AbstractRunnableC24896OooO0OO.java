package o00O0Ooo;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import o00O0O0o.C24841OooOOo0;
import o00O0O0o.OooOOO;
import o00O0OO0.C24845OooO0Oo;
import o00O0OO0.InterfaceC24846OooO0o0;
import o00O0OoO.C24871OooO0OO;
import o00O0OoO.C24890OooOooo;

/* JADX INFO: renamed from: o00O0Ooo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC24896OooO0OO implements Runnable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final o00O0OO0.OooO0OO f84509OooOo0o = new o00O0OO0.OooO0OO();

    public static void OooO00o(o00O0OO0.OooOO0O oooOO0O, String str) {
        WorkDatabase workDatabase = oooOO0O.f84362OooO0OO;
        o00O0OoO.OooOo00 oooOo00OooOoO = workDatabase.OooOoO();
        C24871OooO0OO c24871OooO0OOOooOo0 = workDatabase.OooOo0();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            C24890OooOooo c24890OooOooo = (C24890OooOooo) oooOo00OooOoO;
            C24841OooOOo0.OooO00o oooO00oOooO0oo = c24890OooOooo.OooO0oo(str2);
            if (oooO00oOooO0oo != C24841OooOOo0.OooO00o.f84285OooOoO0 && oooO00oOooO0oo != C24841OooOOo0.OooO00o.f84284OooOoO) {
                c24890OooOooo.OooOOOO(C24841OooOOo0.OooO00o.f84288OooOoo0, str2);
            }
            linkedList.addAll(c24871OooO0OOOooOo0.OooO0O0(str2));
        }
        C24845OooO0Oo c24845OooO0Oo = oooOO0O.f84364OooO0o;
        synchronized (c24845OooO0Oo.f84339Oooo00O) {
            try {
                o00O0O0o.OooOO0O.OooO0OO().OooO00o(C24845OooO0Oo.f84328Oooo00o, "Processor cancelling " + str, new Throwable[0]);
                c24845OooO0Oo.f84337OooOooo.add(str);
                o00O0OO0.OooOOO oooOOO = (o00O0OO0.OooOOO) c24845OooO0Oo.f84335OooOoo0.remove(str);
                boolean z = oooOOO != null;
                if (oooOOO == null) {
                    oooOOO = (o00O0OO0.OooOOO) c24845OooO0Oo.f84334OooOoo.remove(str);
                }
                C24845OooO0Oo.OooO0OO(str, oooOOO);
                if (z) {
                    c24845OooO0Oo.OooO0oo();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator<InterfaceC24846OooO0o0> it = oooOO0O.f84365OooO0o0.iterator();
        while (it.hasNext()) {
            it.next().OooO0OO(str);
        }
    }

    public abstract void OooO0O0();

    @Override // java.lang.Runnable
    public final void run() {
        o00O0OO0.OooO0OO oooO0OO = this.f84509OooOo0o;
        try {
            OooO0O0();
            oooO0OO.OooO00o(o00O0O0o.OooOOO.f84264OooO00o);
        } catch (Throwable th) {
            oooO0OO.OooO00o(new OooOOO.OooO00o.C19656OooO00o(th));
        }
    }
}
