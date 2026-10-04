package oO000Oo;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.base.Preconditions;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oO000Oo.InterfaceC31948OooOOoo;
import oO000Oo.InterfaceC32049o0000oOO;
import oO0OOo0o.C33058OooO00o;
import oO0OOo0o.C33068OooOOo;
import oO0OOo0o.C33094OoooO;
import oO0OOo0o.InterfaceC33064OooOO0o;

/* JADX INFO: renamed from: oO000Oo.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C31968OooOooo implements InterfaceC31946OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile boolean f114116OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public InterfaceC31948OooOOoo f114117OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public InterfaceC31946OooOOo f114118OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public oO0OOo0o.o00Oo0 f114119OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooOOO0 f114120OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f114122OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f114123OooO0oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public List<Runnable> f114121OooO0o0 = new ArrayList();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public ArrayList f114115OooO = new ArrayList();

    /* JADX INFO: renamed from: oO000Oo.OooOooo$OooO */
    public class OooO implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InputStream f114125OooOo0o;

        public OooO(InputStream inputStream) {
            this.f114125OooOo0o = inputStream;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C31968OooOooo.this.f114118OooO0OO.OooO0oO(this.f114125OooOo0o);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOooo$OooO00o */
    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ int f114127OooOo0o;

        public OooO00o(int i) {
            this.f114127OooOo0o = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C31968OooOooo.this.f114118OooO0OO.OooO00o(this.f114127OooOo0o);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOooo$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C31968OooOooo.this.f114118OooO0OO.OooO0oo();
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOooo$OooO0OO */
    public class OooO0OO implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33064OooOO0o f114130OooOo0o;

        public OooO0OO(InterfaceC33064OooOO0o interfaceC33064OooOO0o) {
            this.f114130OooOo0o = interfaceC33064OooOO0o;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C31968OooOooo.this.f114118OooO0OO.OooO0O0(this.f114130OooOo0o);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOooo$OooO0Oo, reason: case insensitive filesystem */
    public class RunnableC31969OooO0Oo implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ oO0OOo0o.OooOo00 f114132OooOo0o;

        public RunnableC31969OooO0Oo(oO0OOo0o.OooOo00 oooOo00) {
            this.f114132OooOo0o = oooOo00;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C31968OooOooo.this.f114118OooO0OO.OooOO0O(this.f114132OooOo0o);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOooo$OooO0o */
    public class OooO0o implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ int f114134OooOo0o;

        public OooO0o(int i) {
            this.f114134OooOo0o = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C31968OooOooo.this.f114118OooO0OO.OooO0OO(this.f114134OooOo0o);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOooo$OooO0o0, reason: case insensitive filesystem */
    public class RunnableC31970OooO0o0 implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f114136OooOo0o;

        public RunnableC31970OooO0o0(boolean z) {
            this.f114136OooOo0o = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C31968OooOooo.this.f114118OooO0OO.OooO0o0(this.f114136OooOo0o);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOooo$OooO0oO, reason: case insensitive filesystem */
    public class RunnableC31971OooO0oO implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ int f114138OooOo0o;

        public RunnableC31971OooO0oO(int i) {
            this.f114138OooOo0o = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C31968OooOooo.this.f114118OooO0OO.OooO0Oo(this.f114138OooOo0o);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOooo$OooO0oo, reason: case insensitive filesystem */
    public class RunnableC31972OooO0oo implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33068OooOOo f114140OooOo0o;

        public RunnableC31972OooO0oo(C33068OooOOo c33068OooOOo) {
            this.f114140OooOo0o = c33068OooOOo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C31968OooOooo.this.f114118OooO0OO.OooO0o(this.f114140OooOo0o);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOooo$OooOO0 */
    public class OooOO0 implements Runnable {
        public OooOO0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C31968OooOooo.this.f114118OooO0OO.flush();
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOooo$OooOO0O */
    public class OooOO0O implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ oO0OOo0o.o00Oo0 f114143OooOo0o;

        public OooOO0O(oO0OOo0o.o00Oo0 o00oo02) {
            this.f114143OooOo0o = o00oo02;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C31968OooOooo.this.f114118OooO0OO.OooOO0o(this.f114143OooOo0o);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOooo$OooOO0o, reason: case insensitive filesystem */
    public class RunnableC31973OooOO0o implements Runnable {
        public RunnableC31973OooOO0o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C31968OooOooo.this.f114118OooO0OO.OooOO0();
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOooo$OooOOO0 */
    public static class OooOOO0 implements InterfaceC31948OooOOoo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InterfaceC31948OooOOoo f114145OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public volatile boolean f114146OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public List<Runnable> f114147OooO0OO = new ArrayList();

        /* JADX INFO: renamed from: oO000Oo.OooOooo$OooOOO0$OooO00o */
        public class OooO00o implements Runnable {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC32049o0000oOO.OooO00o f114149OooOo0o;

            public OooO00o(InterfaceC32049o0000oOO.OooO00o oooO00o) {
                this.f114149OooOo0o = oooO00o;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OooOOO0.this.f114145OooO00o.OooO00o(this.f114149OooOo0o);
            }
        }

        /* JADX INFO: renamed from: oO000Oo.OooOooo$OooOOO0$OooO0O0 */
        public class OooO0O0 implements Runnable {
            public OooO0O0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                OooOOO0.this.f114145OooO00o.onReady();
            }
        }

        /* JADX INFO: renamed from: oO000Oo.OooOooo$OooOOO0$OooO0OO */
        public class OooO0OO implements Runnable {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C33094OoooO f114152OooOo0o;

            public OooO0OO(C33094OoooO c33094OoooO) {
                this.f114152OooOo0o = c33094OoooO;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OooOOO0.this.f114145OooO00o.OooO0O0(this.f114152OooOo0o);
            }
        }

        /* JADX INFO: renamed from: oO000Oo.OooOooo$OooOOO0$OooO0Oo, reason: case insensitive filesystem */
        public class RunnableC31974OooO0Oo implements Runnable {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ InterfaceC31948OooOOoo.OooO00o f114153OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ oO0OOo0o.o00Oo0 f114154OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ C33094OoooO f114156OooOoO0;

            public RunnableC31974OooO0Oo(oO0OOo0o.o00Oo0 o00oo02, InterfaceC31948OooOOoo.OooO00o oooO00o, C33094OoooO c33094OoooO) {
                this.f114154OooOo0o = o00oo02;
                this.f114153OooOo = oooO00o;
                this.f114156OooOoO0 = c33094OoooO;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OooOOO0.this.f114145OooO00o.OooO0OO(this.f114154OooOo0o, this.f114153OooOo, this.f114156OooOoO0);
            }
        }

        public OooOOO0(InterfaceC31948OooOOoo interfaceC31948OooOOoo) {
            this.f114145OooO00o = interfaceC31948OooOOoo;
        }

        @Override // oO000Oo.InterfaceC32049o0000oOO
        public final void OooO00o(InterfaceC32049o0000oOO.OooO00o oooO00o) {
            if (this.f114146OooO0O0) {
                this.f114145OooO00o.OooO00o(oooO00o);
            } else {
                OooO0Oo(new OooO00o(oooO00o));
            }
        }

        @Override // oO000Oo.InterfaceC31948OooOOoo
        public final void OooO0O0(C33094OoooO c33094OoooO) {
            OooO0Oo(new OooO0OO(c33094OoooO));
        }

        @Override // oO000Oo.InterfaceC31948OooOOoo
        public final void OooO0OO(oO0OOo0o.o00Oo0 o00oo02, InterfaceC31948OooOOoo.OooO00o oooO00o, C33094OoooO c33094OoooO) {
            OooO0Oo(new RunnableC31974OooO0Oo(o00oo02, oooO00o, c33094OoooO));
        }

        public final void OooO0Oo(Runnable runnable) {
            synchronized (this) {
                try {
                    if (this.f114146OooO0O0) {
                        runnable.run();
                    } else {
                        this.f114147OooO0OO.add(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // oO000Oo.InterfaceC32049o0000oOO
        public final void onReady() {
            if (this.f114146OooO0O0) {
                this.f114145OooO00o.onReady();
            } else {
                OooO0Oo(new OooO0O0());
            }
        }
    }

    public final void OooO(Runnable runnable) {
        Preconditions.checkState(this.f114117OooO0O0 != null, "May only be called after start");
        synchronized (this) {
            try {
                if (this.f114116OooO00o) {
                    runnable.run();
                } else {
                    this.f114121OooO0o0.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // oO000Oo.InterfaceC32048o0000oO0
    public final void OooO00o(int i) {
        Preconditions.checkState(this.f114117OooO0O0 != null, "May only be called after start");
        if (this.f114116OooO00o) {
            this.f114118OooO0OO.OooO00o(i);
        } else {
            OooO(new OooO00o(i));
        }
    }

    @Override // oO000Oo.InterfaceC32048o0000oO0
    public final void OooO0O0(InterfaceC33064OooOO0o interfaceC33064OooOO0o) {
        Preconditions.checkState(this.f114117OooO0O0 == null, "May only be called before start");
        Preconditions.checkNotNull(interfaceC33064OooOO0o, "compressor");
        this.f114115OooO.add(new OooO0OO(interfaceC33064OooOO0o));
    }

    @Override // oO000Oo.InterfaceC31946OooOOo
    public final void OooO0OO(int i) {
        Preconditions.checkState(this.f114117OooO0O0 == null, "May only be called before start");
        this.f114115OooO.add(new OooO0o(i));
    }

    @Override // oO000Oo.InterfaceC31946OooOOo
    public final void OooO0Oo(int i) {
        Preconditions.checkState(this.f114117OooO0O0 == null, "May only be called before start");
        this.f114115OooO.add(new RunnableC31971OooO0oO(i));
    }

    @Override // oO000Oo.InterfaceC31946OooOOo
    public final void OooO0o(C33068OooOOo c33068OooOOo) {
        Preconditions.checkState(this.f114117OooO0O0 == null, "May only be called before start");
        this.f114115OooO.add(new RunnableC31972OooO0oo(c33068OooOOo));
    }

    @Override // oO000Oo.InterfaceC32048o0000oO0
    public final void OooO0o0(boolean z) {
        Preconditions.checkState(this.f114117OooO0O0 != null, "May only be called after start");
        if (this.f114116OooO00o) {
            this.f114118OooO0OO.OooO0o0(z);
        } else {
            OooO(new RunnableC31970OooO0o0(z));
        }
    }

    @Override // oO000Oo.InterfaceC32048o0000oO0
    public final void OooO0oO(InputStream inputStream) {
        Preconditions.checkState(this.f114117OooO0O0 != null, "May only be called after start");
        Preconditions.checkNotNull(inputStream, "message");
        if (this.f114116OooO00o) {
            this.f114118OooO0OO.OooO0oO(inputStream);
        } else {
            OooO(new OooO(inputStream));
        }
    }

    @Override // oO000Oo.InterfaceC32048o0000oO0
    public final void OooO0oo() {
        Preconditions.checkState(this.f114117OooO0O0 == null, "May only be called before start");
        this.f114115OooO.add(new OooO0O0());
    }

    @Override // oO000Oo.InterfaceC31946OooOOo
    public final void OooOO0() {
        Preconditions.checkState(this.f114117OooO0O0 != null, "May only be called after start");
        OooO(new RunnableC31973OooOO0o());
    }

    @Override // oO000Oo.InterfaceC31946OooOOo
    public final void OooOO0O(oO0OOo0o.OooOo00 oooOo00) {
        Preconditions.checkState(this.f114117OooO0O0 == null, "May only be called before start");
        Preconditions.checkNotNull(oooOo00, "decompressorRegistry");
        this.f114115OooO.add(new RunnableC31969OooO0Oo(oooOo00));
    }

    @Override // oO000Oo.InterfaceC31946OooOOo
    public void OooOO0o(oO0OOo0o.o00Oo0 o00oo02) {
        boolean z = false;
        boolean z2 = true;
        Preconditions.checkState(this.f114117OooO0O0 != null, "May only be called after start");
        Preconditions.checkNotNull(o00oo02, "reason");
        synchronized (this) {
            try {
                InterfaceC31946OooOOo interfaceC31946OooOOo = this.f114118OooO0OO;
                if (interfaceC31946OooOOo == null) {
                    o00000O0 o00000o02 = o00000O0.f114372OooO00o;
                    if (interfaceC31946OooOOo != null) {
                        z2 = false;
                    }
                    Preconditions.checkState(z2, "realStream already set to %s", interfaceC31946OooOOo);
                    this.f114118OooO0OO = o00000o02;
                    this.f114123OooO0oo = System.nanoTime();
                    this.f114119OooO0Oo = o00oo02;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            OooO(new OooOO0O(o00oo02));
            return;
        }
        OooOOOO();
        OooOOo0(o00oo02);
        this.f114117OooO0O0.OooO0OO(o00oo02, InterfaceC31948OooOOoo.OooO00o.f114034OooOo0o, new C33094OoooO());
    }

    @Override // oO000Oo.InterfaceC31946OooOOo
    public final void OooOOO(InterfaceC31948OooOOoo interfaceC31948OooOOoo) {
        oO0OOo0o.o00Oo0 o00oo02;
        boolean z;
        Preconditions.checkNotNull(interfaceC31948OooOOoo, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Preconditions.checkState(this.f114117OooO0O0 == null, "already started");
        synchronized (this) {
            try {
                o00oo02 = this.f114119OooO0Oo;
                z = this.f114116OooO00o;
                if (!z) {
                    OooOOO0 oooOOO0 = new OooOOO0(interfaceC31948OooOOoo);
                    this.f114120OooO0o = oooOOO0;
                    interfaceC31948OooOOoo = oooOOO0;
                }
                this.f114117OooO0O0 = interfaceC31948OooOOoo;
                this.f114122OooO0oO = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (o00oo02 != null) {
            interfaceC31948OooOOoo.OooO0OO(o00oo02, InterfaceC31948OooOOoo.OooO00o.f114034OooOo0o, new C33094OoooO());
        } else if (z) {
            OooOOOo(interfaceC31948OooOOoo);
        }
    }

    @Override // oO000Oo.InterfaceC31946OooOOo
    public void OooOOO0(C31998OoooOoO c31998OoooOoO) {
        synchronized (this) {
            try {
                if (this.f114117OooO0O0 == null) {
                    return;
                }
                if (this.f114118OooO0OO != null) {
                    c31998OoooOoO.OooO0O0(Long.valueOf(this.f114123OooO0oo - this.f114122OooO0oO), "buffered_nanos");
                    this.f114118OooO0OO.OooOOO0(c31998OoooOoO);
                } else {
                    c31998OoooOoO.OooO0O0(Long.valueOf(System.nanoTime() - this.f114122OooO0oO), "buffered_nanos");
                    ((ArrayList) c31998OoooOoO.f114251OooO0O0).add("waiting_for_connection");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        if (r0.hasNext() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        r0.next().run();
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOOOO() {
        OooOOO0 oooOOO0;
        List<Runnable> list;
        List<Runnable> list2;
        List<Runnable> arrayList = new ArrayList<>();
        while (true) {
            synchronized (this) {
                if (this.f114121OooO0o0.isEmpty()) {
                    break;
                }
                list2 = this.f114121OooO0o0;
                this.f114121OooO0o0 = arrayList;
            }
            if (oooOOO0 != null) {
                return;
            }
            List<Runnable> arrayList2 = new ArrayList<>();
            while (true) {
                synchronized (oooOOO0) {
                    try {
                        if (oooOOO0.f114147OooO0OO.isEmpty()) {
                            oooOOO0.f114147OooO0OO = null;
                            oooOOO0.f114146OooO0O0 = true;
                            return;
                        } else {
                            list = oooOOO0.f114147OooO0OO;
                            oooOOO0.f114147OooO0OO = arrayList2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator<Runnable> it = list.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
                list.clear();
                arrayList2 = list;
            }
            list2.clear();
            arrayList = list2;
        }
        this.f114121OooO0o0 = null;
        this.f114116OooO00o = true;
        oooOOO0 = this.f114120OooO0o;
        if (oooOOO0 != null) {
        }
    }

    public final void OooOOOo(InterfaceC31948OooOOoo interfaceC31948OooOOoo) {
        Iterator it = this.f114115OooO.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f114115OooO = null;
        this.f114118OooO0OO.OooOOO(interfaceC31948OooOOoo);
    }

    public final Oooo000 OooOOo(InterfaceC31946OooOOo interfaceC31946OooOOo) {
        synchronized (this) {
            try {
                if (this.f114118OooO0OO != null) {
                    return null;
                }
                InterfaceC31946OooOOo interfaceC31946OooOOo2 = (InterfaceC31946OooOOo) Preconditions.checkNotNull(interfaceC31946OooOOo, "stream");
                InterfaceC31946OooOOo interfaceC31946OooOOo3 = this.f114118OooO0OO;
                Preconditions.checkState(interfaceC31946OooOOo3 == null, "realStream already set to %s", interfaceC31946OooOOo3);
                this.f114118OooO0OO = interfaceC31946OooOOo2;
                this.f114123OooO0oo = System.nanoTime();
                InterfaceC31948OooOOoo interfaceC31948OooOOoo = this.f114117OooO0O0;
                if (interfaceC31948OooOOoo == null) {
                    this.f114121OooO0o0 = null;
                    this.f114116OooO00o = true;
                }
                if (interfaceC31948OooOOoo == null) {
                    return null;
                }
                OooOOOo(interfaceC31948OooOOoo);
                return new Oooo000(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void OooOOo0(oO0OOo0o.o00Oo0 o00oo02) {
    }

    @Override // oO000Oo.InterfaceC32048o0000oO0
    public final void flush() {
        Preconditions.checkState(this.f114117OooO0O0 != null, "May only be called after start");
        if (this.f114116OooO00o) {
            this.f114118OooO0OO.flush();
        } else {
            OooO(new OooOO0());
        }
    }

    @Override // oO000Oo.InterfaceC31946OooOOo
    public final C33058OooO00o getAttributes() {
        InterfaceC31946OooOOo interfaceC31946OooOOo;
        synchronized (this) {
            interfaceC31946OooOOo = this.f114118OooO0OO;
        }
        return interfaceC31946OooOOo != null ? interfaceC31946OooOOo.getAttributes() : C33058OooO00o.f119518OooO0O0;
    }

    @Override // oO000Oo.InterfaceC32048o0000oO0
    public final boolean isReady() {
        if (this.f114116OooO00o) {
            return this.f114118OooO0OO.isReady();
        }
        return false;
    }
}
