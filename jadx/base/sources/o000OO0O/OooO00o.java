package o000OO0O;

import android.util.Log;
import androidx.core.location.LocationRequestCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000O00.C24372OooOOo;
import o000OO0O.OooO00o.InterfaceC19618OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o<T extends InterfaceC19618OooO00o> {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO0OO f82797OooO0oO = OooO0OO.f82806OooOo0o;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final OooO0O0 f82798OooO0oo = OooO0O0.f82805OooOo0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f82799OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList<C24491OooO0Oo<T>> f82800OooO0O0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ReentrantLock f82801OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Condition f82802OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f82803OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f82804OooO0o0;

    /* JADX INFO: renamed from: o000OO0O.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC19618OooO00o {
    }

    public static final class OooO0O0 extends OooOOOO implements InterfaceC32507OooOO0o<C24491OooO0Oo<?>, Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f82805OooOo0o = new OooO0O0(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(C24491OooO0Oo<?> c24491OooO0Oo) {
            C24491OooO0Oo<?> entry = c24491OooO0Oo;
            OooOOO0.OooO0oO(entry, "entry");
            return Boolean.valueOf(entry.f82809OooO0OO);
        }
    }

    public static final class OooO0OO extends OooOOOO implements InterfaceC32507OooOO0o<C24491OooO0Oo<?>, Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0OO f82806OooOo0o = new OooO0OO(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(C24491OooO0Oo<?> c24491OooO0Oo) {
            C24491OooO0Oo<?> entry = c24491OooO0Oo;
            OooOOO0.OooO0oO(entry, "entry");
            o000OO0O.OooO0OO oooO0OO = entry.f82808OooO0O0;
            return Boolean.valueOf(oooO0OO == null || oooO0OO.f82811OooOo0o.OooO00o() != LocationRequestCompat.PASSIVE_INTERVAL);
        }
    }

    /* JADX INFO: renamed from: o000OO0O.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    public static final class C24491OooO0Oo<T extends InterfaceC19618OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C24372OooOOo.OooO00o f82807OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public o000OO0O.OooO0OO f82808OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f82809OooO0OO;

        public C24491OooO0Oo() {
            throw null;
        }

        public C24491OooO0Oo(C24372OooOOo.OooO00o oooO00o, boolean z) {
            this.f82807OooO00o = oooO00o;
            this.f82808OooO0O0 = null;
            this.f82809OooO0OO = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24491OooO0Oo)) {
                return false;
            }
            C24491OooO0Oo c24491OooO0Oo = (C24491OooO0Oo) obj;
            return OooOOO0.OooO0O0(this.f82807OooO00o, c24491OooO0Oo.f82807OooO00o) && OooOOO0.OooO0O0(this.f82808OooO0O0, c24491OooO0Oo.f82808OooO0O0) && this.f82809OooO0OO == c24491OooO0Oo.f82809OooO0OO;
        }

        public final int hashCode() {
            int iHashCode = this.f82807OooO00o.hashCode() * 31;
            o000OO0O.OooO0OO oooO0OO = this.f82808OooO0O0;
            return Boolean.hashCode(this.f82809OooO0OO) + ((iHashCode + (oooO0OO == null ? 0 : oooO0OO.hashCode())) * 31);
        }

        public final String toString() {
            return "Entry(bufferProvider=" + this.f82807OooO00o + ", releaseFence=" + this.f82808OooO0O0 + ", isAvailable=" + this.f82809OooO0OO + ')';
        }
    }

    public OooO00o(int i) {
        this.f82799OooO00o = i;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f82801OooO0OO = reentrantLock;
        this.f82802OooO0Oo = reentrantLock.newCondition();
        if (i <= 0) {
            throw new IllegalArgumentException("Pool size must be at least 1");
        }
    }

    public static final InterfaceC19618OooO00o OooO00o(OooO00o oooO00o) throws InterruptedException {
        if (oooO00o.f82803OooO0o) {
            throw new IllegalStateException("Attempt to obtain frame buffer from FrameBufferPool that has already been closed");
        }
        ArrayList<C24491OooO0Oo<T>> arrayList = oooO00o.f82800OooO0O0;
        int i = oooO00o.f82799OooO00o;
        if (i == 1) {
            C24491OooO0Oo c24491OooO0Oo = (C24491OooO0Oo) OooOo.Oooo(arrayList);
            if (c24491OooO0Oo != null) {
                c24491OooO0Oo.f82809OooO0OO = true;
            } else {
                c24491OooO0Oo = null;
            }
            if (c24491OooO0Oo != null) {
                return c24491OooO0Oo.f82807OooO00o;
            }
        } else {
            while (oooO00o.f82804OooO0o0 == 0 && arrayList.size() >= i) {
                Log.w("BufferPool", "Waiting for buffer to become available, current allocation count: " + arrayList.size());
                oooO00o.f82802OooO0Oo.await();
            }
            OooOOO0.OooO0oO(arrayList, "<this>");
            OooO0O0 primaryCondition = f82798OooO0oo;
            OooOOO0.OooO0oO(primaryCondition, "primaryCondition");
            OooO0OO secondaryCondition = f82797OooO0oO;
            OooOOO0.OooO0oO(secondaryCondition, "secondaryCondition");
            Iterator<C24491OooO0Oo<T>> it = arrayList.iterator();
            C24491OooO0Oo<T> c24491OooO0Oo2 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C24491OooO0Oo<T> next = it.next();
                if (((Boolean) primaryCondition.invoke(next)).booleanValue()) {
                    if (c24491OooO0Oo2 == null) {
                        c24491OooO0Oo2 = next;
                    }
                    if (((Boolean) secondaryCondition.invoke(next)).booleanValue()) {
                        c24491OooO0Oo2 = next;
                        break;
                    }
                }
            }
            C24491OooO0Oo<T> c24491OooO0Oo3 = c24491OooO0Oo2;
            if (c24491OooO0Oo3 != null) {
                oooO00o.f82804OooO0o0--;
                c24491OooO0Oo3.f82809OooO0OO = false;
                o000OO0O.OooO0OO oooO0OO = c24491OooO0Oo3.f82808OooO0O0;
                if (oooO0OO != null) {
                    oooO0OO.OooO00o();
                    oooO0OO.close();
                }
            } else {
                c24491OooO0Oo3 = null;
            }
            if (c24491OooO0Oo3 != null) {
                return c24491OooO0Oo3.f82807OooO00o;
            }
        }
        return null;
    }
}
